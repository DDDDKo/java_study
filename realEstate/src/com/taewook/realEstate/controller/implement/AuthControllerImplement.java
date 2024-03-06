package com.taewook.realEstate.controller.implement;

import com.taewook.realEstate.controller.AuthController;
import com.taewook.realEstate.dto.request.CheckidRequestDto;
import com.taewook.realEstate.dto.request.SendCodeRequestDto;
import com.taewook.realEstate.dto.response.CheckidResponseDto;
import com.taewook.realEstate.dto.response.SendCodeResponseDto;
import com.taewook.realEstate.interfaces.Code;
import com.taewook.realEstate.service.AuthService;
import com.taewook.realEstate.service.implement.AuthServiceImplement;

public class AuthControllerImplement implements AuthController {
	
	private AuthService authService;
	
	public AuthControllerImplement (AuthService authService) {
		this.authService = authService;
	}

	@Override
	public CheckidResponseDto checkId(CheckidRequestDto request) {
		boolean validId = request.validId();
		if (!validId) return new CheckidResponseDto(Code.VF, null);
		
		CheckidResponseDto response = authService.checkId(request);
		return response;
	}

	@Override
	public SendCodeResponseDto sendCode(SendCodeRequestDto request) {
		boolean valid = request.validEmail();
		if (!valid) return new SendCodeResponseDto(Code.VF, null);
		
		SendCodeResponseDto response = authService.sendCode(request);
		return response;
	}

}