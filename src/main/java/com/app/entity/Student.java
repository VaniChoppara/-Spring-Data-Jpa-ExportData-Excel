package com.app.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer studtId;
	String studName;
	String studEmail;
	Integer studMobile;
	
	@CreationTimestamp
	@Column(name="creation_date", updatable=false)
	LocalDate creationDate;
	
	@UpdateTimestamp
	@Column(name="update_date", insertable=false)
	LocalDate updateDate;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(Integer studtId, String studName, String studEmail, Integer studMobile, LocalDate creationDate,
			LocalDate updateDate) {
		this.studtId = studtId;
		this.studName = studName;
		this.studEmail = studEmail;
		this.studMobile = studMobile;
		this.creationDate = creationDate;
		this.updateDate = updateDate;
	}
	public Integer getStudtId() {
		return studtId;
	}
	public void setStudtId(Integer studtId) {
		this.studtId = studtId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudEmail() {
		return studEmail;
	}
	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}
	public Integer getStudMobile() {
		return studMobile;
	}
	public void setStudMobile(Integer studMobile) {
		this.studMobile = studMobile;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDate getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "Student [studtId=" + studtId + ", studName=" + studName + ", studEmail=" + studEmail + ", studMobile="
				+ studMobile + ", creationDate=" + creationDate + ", updateDate=" + updateDate + "]";
	}
	
	
	
}
