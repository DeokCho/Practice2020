package com.jse.app;

public class Member {

	private String id;
	private String pw;
	private String realValue;
	private int state;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPw() {
		return this.pw;
	}
	
	public void setRealValue(String realValue) {
		this.realValue = realValue;
	}
	
	public String getRealValue() {
		return realValue;
	}
	

	public void setUserState(int state) {
		this.state = state;
	}

	public int getUserState() {
		return state;
	}

}

