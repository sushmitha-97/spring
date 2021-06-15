package com.xworkz.chocolate;

public class DataBase {

	private String url;
	private String userName;
	private String password;

	public DataBase(String url, String userName, String password) {
		super();
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "DataBase [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}

}
