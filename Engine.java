package com.jse.app;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		Grade grade;

		while (member.getUserState() == 0) {
			System.out.println("0. 종료, 1. 회원가입, 2. 로그인, 3.비밀번호 찾기");

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
				System.out.println("주민번호를 입력하세요.");
				member.setRealValue(sc.next());
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
				} else {
					System.out.println("로그인 실패");
				}
				break;
			case 3:
				System.out.println("비밀번호 찾기");
				System.out.println("아이디를 입력하세요.");
				String idSearch = sc.next();
				String returnId = member.getId();
				System.out.println("주민번호를 입력하세요.");
				String pwSearch = sc.next();
				String returnPw = member.getRealValue();
				if (idSearch.equals(returnId) && pwSearch.equals(returnPw)) {
					System.out.println("아이디 : " + member.getId());
					System.out.println("패스워드 : " + member.getPw());
				} else {
					System.out.println("잘못입력하였습니다.");
				}
				break;
			}
			while (member.getUserState() == 1) {
				System.out.println("1.계산기, 2.가위바위보, 3.주사위 홀/짝 맞추기, 4.로그아웃, 5.학점계산기");
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
				case 5:
					grade = new Grade();
					System.out.println("학점계산기");
					System.out.println("이름을 입력해주세요.");
					grade.setName(sc.next());
					System.out.println("국어 점수를 입력하세요.");
					grade.setKorean(sc.nextInt());
					System.out.println("영어 점수를 입력하세요.");
					grade.setEnglish(sc.nextInt());
					System.out.println("수학 점수를 입력하세요.");
					grade.setMath(sc.nextInt());
					System.out.println(String.format("[ %s , 총점 : %d, 평균점수 : %d, 학점 : %s ]", 
							grade.getName(), grade.gradeSum(), grade.gradeAverage(), grade.gradeEvaluate()));
					break;
				}
			}
		}

	}
}
