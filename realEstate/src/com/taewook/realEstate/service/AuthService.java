package com.taewook.realEstate.service;

import com.taewook.realEstate.dto.request.CheckidRequestDto;
import com.taewook.realEstate.dto.request.SendCodeRequestDto;
import com.taewook.realEstate.dto.response.CheckidResponseDto;
import com.taewook.realEstate.dto.response.SendCodeResponseDto;

public interface AuthService {
	CheckidResponseDto checkId(CheckidRequestDto dto);	// 실제로 돌아갈 로직
	SendCodeResponseDto sendCode(SendCodeRequestDto dto);
}
