package com.sprint.crm.pojo;

import java.util.Date;

public class SignIn {
    private Integer id;

    private Integer userId;

    private Date createTime;

    private Date signInEndTime;

	public SignIn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SignIn(Integer id, Integer userId, Date createTime, Date signInEndTime) {
		super();
		this.id = id;
		this.userId = userId;
		this.createTime = createTime;
		this.signInEndTime = signInEndTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getSignInEndTime() {
		return signInEndTime;
	}

	public void setSignInEndTime(Date signInEndTime) {
		this.signInEndTime = signInEndTime;
	}

	@Override
	public String toString() {
		return "SignIn [id=" + id + ", userId=" + userId + ", createTime=" + createTime + ", signInEndTime="
				+ signInEndTime + "]";
	}

  
}