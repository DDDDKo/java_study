package com.taewook.realEstate.controller;

import com.taewook.realEstate.dto.request.CheckidRequestDto;
import com.taewook.realEstate.dto.request.SendCodeRequestDto;
import com.taewook.realEstate.dto.response.CheckidResponseDto;
import com.taewook.realEstate.dto.response.SendCodeResponseDto;

public interface AuthController {
	CheckidResponseDto checkId(CheckidRequestDto request);
	SendCodeResponseDto sendCode(SendCodeRequestDto request);
}