package com.entity;

public class Friend {
	private int id;
	private int userId;
	private int friendId;
	private String name;
	private int focus;
	private int beFocus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFriendId() {
		return friendId;
	}

	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFocus() {
		return focus;
	}

	public void setFocus(int focus) {
		this.focus = focus;
	}

	public int getBeFocus() {
		return beFocus;
	}

	public void setBeFocus(int beFocus) {
		this.beFocus = beFocus;
	}

	@Override
	public String toString() {
		return "Friend [id=" + id + ", userId=" + userId + ", friendId=" + friendId + ", name=" + name + ", focus="
				+ focus + ", beFocus=" + beFocus + "]";
	}

}
