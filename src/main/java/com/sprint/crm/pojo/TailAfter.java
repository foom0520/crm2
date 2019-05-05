package com.sprint.crm.pojo;

import java.util.Date;

public class TailAfter {
    private Integer id;

    private Integer studentId;

    private Date tailAfterTime;

    private String content;

    private Date nextTailAfterTime;

    private String tailAfterWay;//»Ø·Ã·½Ê½

    private String remark;

	public TailAfter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TailAfter(Integer id, Integer studentId, Date tailAfterTime, String content, Date nextTailAfterTime,
			String tailAfterWay, String remark) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.tailAfterTime = tailAfterTime;
		this.content = content;
		this.nextTailAfterTime = nextTailAfterTime;
		this.tailAfterWay = tailAfterWay;
		this.remark = remark;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Date getTailAfterTime() {
		return tailAfterTime;
	}

	public void setTailAfterTime(Date tailAfterTime) {
		this.tailAfterTime = tailAfterTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getNextTailAfterTime() {
		return nextTailAfterTime;
	}

	public void setNextTailAfterTime(Date nextTailAfterTime) {
		this.nextTailAfterTime = nextTailAfterTime;
	}

	public String getTailAfterWay() {
		return tailAfterWay;
	}

	public void setTailAfterWay(String tailAfterWay) {
		this.tailAfterWay = tailAfterWay;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "TailAfter [id=" + id + ", studentId=" + studentId + ", tailAfterTime=" + tailAfterTime + ", content="
				+ content + ", nextTailAfterTime=" + nextTailAfterTime + ", tailAfterWay=" + tailAfterWay + ", remark="
				+ remark + "]";
	}

   
}