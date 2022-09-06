package com.demo.mongo.model;

public class Mark {
	
	public Mark(String subjectName, Integer mark, String remarks) {
		super();
		this.subjectName = subjectName;
		this.mark = mark;
		this.remarks = remarks;
	}

	private String subjectName;
	
	private Integer mark;
	
	private String remarks;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Mark [subjectName=" + subjectName + ", mark=" + mark + ", remarks=" + remarks + "]";
	}
	
}
