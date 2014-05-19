package com.silksoftware.domain;

public class UserForm {
	private String firstName;
	private String lastName;
	private String password;
	private String sex;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "UserForm [firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", sex=" + sex + "]";
	}
}
