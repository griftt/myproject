package com.entity;

import java.util.Date;

public class Talk {
	private int id;
	private Date time;
	private String content;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Talk [id=" + id + ", time=" + time + ", content=" + content + "]";
	}

}
