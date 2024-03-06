package com.taewook.realEstate.dto.request;

public class CheckidRequestDto {
	// private 변수에 값을 주입하는 방법 3가지: 생성자, 세터, 직접 주입
	private String id;
	
	
	public String getId () {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public boolean validId() {
		boolean valid = id.length() <= 20;
		return valid;
	}
	
}