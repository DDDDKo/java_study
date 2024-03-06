package com.taewook.realEstate;

import java.util.Scanner;

import com.taewook.realEstate.controller.AuthController;
import com.taewook.realEstate.controller.implement.AuthControllerImplement;
import com.taewook.realEstate.dto.request.CheckidRequestDto;
import com.taewook.realEstate.dto.request.SendCodeRequestDto;
import com.taewook.realEstate.dto.response.CheckidResponseDto;
import com.taewook.realEstate.dto.response.SendCodeResponseDto;
import com.taewook.realEstate.interfaces.Code;
import com.taewook.realEstate.repository.EmailAuthenticationRepository;
import com.taewook.realEstate.repository.UserRepository;
import com.taewook.realEstate.repository.implement.EmailAuthenticationRepositoryImplement;
import com.taewook.realEstate.repository.implement.UserRepositoryImplement;
import com.taewook.realEstate.service.AuthService;
import com.taewook.realEstate.service.implement.AuthServiceImplement;

// Controller (package / interface): 입력과 출력을 담당하는 요소
// Service (package / interface): 실제 비지니스 로직(연산) =>논리 연산 작업들 처리
// Repository (package / interface): 데이터베이스 연결과 관련된 작업

// DTO (Data Transfer Object): 데이터 전송을 위한 객체  ==>하위에 request(요청,입력), response(응답,출력) 를 package 생성 기능,모듈 단위(ex. id,email...)로 생성
// Entity : 데이터베이스의 테이블을 자바 클래스로 표현한 객체  
//--------------위 내용은 알아야함--------
// 위 내용들 package로 생성

public class App {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		UserRepository useRepository = new UserRepositoryImplement();
		EmailAuthenticationRepository emailAuthenticationRepository = new EmailAuthenticationRepositoryImplement();
		AuthService authService = new AuthServiceImplement(useRepository, emailAuthenticationRepository);
		AuthController authController = new AuthControllerImplement(authService);  // 의존성 역천 규칙에 의해 외부에서 의존성을 주입
		
		while (true) {
			System.out.print("1. 회원가입 / 2. 로그인 / 3. 게시물 작성 / 4. 게시물 보기 / 5. 종료 :");
			String input = scanner.nextLine();
			if(input.equals("1")) {
				// 1. 아이디 중복 확인
				CheckidRequestDto checkIdRequest = new CheckidRequestDto();
				System.out.print("아이디 : ");
				String id = scanner.nextLine();
				checkIdRequest.setId(id);
				
				CheckidResponseDto checkIdResponse = authController.checkId(checkIdRequest);
				Code code = checkIdResponse.getCode();
				
				if(code == code.DI) {
					System.out.println("중복된 아이디입니다.");
					continue;
				}
				if(code == code.DBE) {
					System.out.println("데이터베이스 에러입니다.");
					continue;
				}
				
				if(code == code.VF) {
					System.out.println("잘못된 입력입니다.");
				}
				
				System.out.println("사용 가능한 아이디입니다.");
				
				System.out.print("비밀번호 : ");
				String password = scanner.nextLine();
				System.out.print("비밀번호 확인 : ");
				String passwordCheck = scanner.nextLine();
				
				// 2. 이메일 인증 코드 전송
				System.out.println("이메일 : ");
				String email = scanner.nextLine();
				
				SendCodeRequestDto sendCodeRequest = new SendCodeRequestDto();
				sendCodeRequest.setEmail(email);
				
				SendCodeResponseDto sendCodeResponse = authController.sendCode(sendCodeRequest);
				code = sendCodeResponse.getCode();
				
				if (code == code.VF) {
					System.out.println("잘못된 입력입니다.");
					continue;
				}
				
				if (code == code.DE) {
					System.out.println("중복된 이메일입니다.");
					continue;
				}
				
				if (code == code.DBE) {
					System.out.println("데이터베이스 에러입니다.");
					continue;
				}
				System.out.println(sendCodeResponse.getData());
				// 3. 이메일 인증 처리
				
				// 4. 회원가입 처리
			}
			if(input.equals("2")) System.out.println("로그인");
			if(input.equals("3")) System.out.println("게시물 작성");
			if(input.equals("4")) System.out.println("게시물 보기");
			if(input.equals("5")) break;
		}
		
		System.out.println("프로그램 종료");
		
	}
}