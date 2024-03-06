package com.taewook.realEstate.service.implement;

import java.util.Random;

import com.taewook.realEstate.dto.request.CheckidRequestDto;
import com.taewook.realEstate.dto.request.SendCodeRequestDto;
import com.taewook.realEstate.dto.response.CheckidResponseDto;
import com.taewook.realEstate.dto.response.SendCodeResponseDto;
import com.taewook.realEstate.interfaces.Code;
import com.taewook.realEstate.repository.EmailAuthenticationRepository;
import com.taewook.realEstate.repository.UserRepository;
import com.taewook.realEstate.service.AuthService;

public class AuthServiceImplement implements AuthService {
	
	private UserRepository userRepository;
	private EmailAuthenticationRepository emailAuthenticationRepository;

	public AuthServiceImplement (
			UserRepository userRepository,
			EmailAuthenticationRepository emailAuthenticationRepository
			) {
		this.userRepository = userRepository;
		this.emailAuthenticationRepository = emailAuthenticationRepository;
	} // 의존성역천 
	@Override
	public CheckidResponseDto checkId(CheckidRequestDto dto) {
		
		boolean validId = dto.validId();
		if (!validId) return new CheckidResponseDto(Code.VF, null);
		
		CheckidResponseDto result = new CheckidResponseDto();
		
		try {
			
			String id = dto.getId();
			
			boolean existedId = userRepository.existsById(id);
			
			if(existedId) result.setCode(Code.DI);
			else result.setCode(Code.SU);
			
		} catch(Exception exception) {
			exception.printStackTrace();
			result.setCode(Code.DBE);
		}
		
		return result;
	}
	@Override
	public SendCodeResponseDto sendCode(SendCodeRequestDto dto) {
		
		SendCodeResponseDto result = new SendCodeResponseDto();
		
		try {
			
			String email = dto.getEmail();
			String authenticationCode = randomString();
			
			boolean existedEmail = emailAuthenticationRepository.existsByEmail(email);
			if (existedEmail) {
				result.setCode(Code.DE);
				return result;
			}
			
			emailAuthenticationRepository.save(email, authenticationCode);
			result.setCode(Code.SU);
			result.setData(authenticationCode);
			
		}catch (Exception exception) {
			exception.printStackTrace();
			result.setCode(Code.DBE);
		}
		
		return result;
	}
	
	private String randomString() {
		char[] randomString = new char[4];

		Random random = new Random();
		
		for(int index = 0 ; index < 4 ; index++) {
			randomString[index] = (char) (random.nextInt(26) + 65);
		}
		
		return new String(randomString);
	}
	
	
}


