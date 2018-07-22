package com.entity;

import java.util.Date;

public class WeiBo {

	private int id;
	private String content;
	private Date time;
	private int userId;
	private String pic;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	@Override
	public String toString() {
		return "WeiBo [id=" + id + ", content=" + content + ", time=" + time + ", userId=" + userId + ", pic=" + pic
				+ "]";
	}

}
