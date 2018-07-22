package com.entity;

import java.util.Date;

public class Message {
	private int id;
	private int userId;
	private String content;
	private Date time;
	private String pic;
	private int receiveId;

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public int getReceiveId() {
		return receiveId;
	}

	public void setReceiveId(int receiveId) {
		this.receiveId = receiveId;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", userId=" + userId + ", content=" + content + ", time=" + time + ", pic=" + pic
				+ ", receiveId=" + receiveId + "]";
	}

}
