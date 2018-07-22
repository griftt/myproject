package com.entity;

public class User {
	private int id;
	private String account;
	private String pwd;
	private String pic;
	private String birthday;
	private String province;
	private String city;
	private String gender;
	private String mail;
	private Integer friendId;

	private String name;
	private String statement;

	public void setFriendId(Integer friendId) {
		this.friendId = friendId;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getFriendId() {
		return friendId;
	}

	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", account=" + account + ", pwd=" + pwd + ", pic=" + pic + ", birthday=" + birthday
				+ ", province=" + province + ", city=" + city + ", gender=" + gender + ", mail=" + mail + ", friendId="
				+ friendId + ", name=" + name + ", statement=" + statement + "]";
	}

}
