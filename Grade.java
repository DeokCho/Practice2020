package com.jse.app;

public class Grade {
	private String name;
	private int korean;
	private int english;
	private int math;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setKorean(int korean) {
		this.korean = korean;
	}
	
	public int getKorean() {
		return korean;
	}
	
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public int getEnglish() {
		return english;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getMath() {
		return math;
	}

	public int gradeSum() {
	return korean+english+math;
	}
	
	public int gradeAverage() {
	return gradeSum()/3;
	}
	
	public String gradeEvaluate() {
		String gradeOut="F";
		switch(gradeAverage()/10){
		case 5: gradeOut="E"; break;
		case 6: gradeOut="D"; break;
		case 7: gradeOut="C"; break;
		case 8: gradeOut="B"; break;
		case 9: gradeOut="A"; break;
		case 10: gradeOut="A"; break;
		default : gradeOut="잘못 입력하였습니다."; break;
		}
		return gradeOut;
	}
	
	
}
