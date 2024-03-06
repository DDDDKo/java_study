package com.taewook.realEstate.dto.response;

import com.taewook.realEstate.interfaces.Code;

public class CheckidResponseDto {
	
	private Code code;	//code enum을 생성해 지정한 값만 받을수 있게 만듬
	private String date;
	
	public CheckidResponseDto() {}
	
	public CheckidResponseDto(Code code, String date) {
		super();
		this.code = code;
		this.date = date;
	}
	
	public Code getCode() {
		return code;
	}
	
	public void setCode(Code code) {
		this.code = code;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
}
