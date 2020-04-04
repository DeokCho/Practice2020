package com.jse.app;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();

		while (member.getUserState() == 0) {
			System.out.println("0. 종료, 1. 회원가입, 2. 로그인");

			switch (sc.nextInt()) {
			case 0:
				System.out.println("종료");
				return;
			case 1:
				System.out.println("회원가입");
				System.out.println("아이디를 입력하세요.");
				member.setId(sc.next());
				System.out.println("패스워드를 입력하세요.");
				member.setPw(sc.next());
				System.out.println("ID : " + member.getId() + ", PW : " + member.getPw());
				break;
			case 2:
				System.out.println("로그인");
				System.out.println("아이디를 입력하세요.");
				String userId = sc.next();
				String loginId = member.getId();
				System.out.println("패스워드를 입력하세요.");
				String userPw = sc.next();
				String loginPw = member.getPw();

				if (userId.equals(loginId) && userPw.equals(loginPw)) {
					System.out.println("로그인 성공");
					member.setUserState(1);
//					while(member.getUserState()==1) {
//						System.out.println("1.계산기, 2.가위바위보, 3.주사위 홀/짝 맞추기, 4.로그아웃");
//						switch(sc.nextInt()){
//						case 1: System.out.println("계산기");
//						member.setUserState(1);
//						break;
//						case 2: System.out.println("가위바위보");
//						member.setUserState(1);
//						break;
//						case 3: System.out.println("주사위 홀/짝 맞추기");
//						member.setUserState(1);
//						break;
//						case 4: System.out.println("로그아웃");
//						member.setUserState(0);
//						break;
//					}
//					}
				} else {
					System.out.println("로그인 실패");
				}
				break;

			}
			while (member.getUserState() == 1) {
				System.out.println("1.계산기, 2.가위바위보, 3.주사위 홀/짝 맞추기, 4.로그아웃");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("계산기");
					member.setUserState(1);
					break;
				case 2:
					System.out.println("가위바위보");
					member.setUserState(1);
					break;
				case 3:
					System.out.println("주사위 홀/짝 맞추기");
					member.setUserState(1);
					break;
				case 4:
					System.out.println("로그아웃");
					member.setUserState(0);
					break;
				}
			}
		}

	}
}
