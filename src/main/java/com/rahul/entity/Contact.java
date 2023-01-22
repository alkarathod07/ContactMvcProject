package com.rahul.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="Contact_Details")
public class Contact {

	
	@Id
	@GeneratedValue
	private Integer contactid;
	
	@Column(name="Contact_Name")
	private String conatactname;
	
	@Column(name="Contact_Number" )
	private Long contactnumber;
	
	@Column(name="Contact_Email")
	private String contactemail;
	
	@Column(name="Create_date", updatable = false)
	@CreationTimestamp
	private LocalDate createddate;
	
	@Column(name="update_date", insertable = false)
	@UpdateTimestamp
	private LocalDate updatedate;
	
	@Column(name="isacctive_switch")
	private Character isactive;

	public Integer getContactid() {
		return contactid;
	}

	public void setContactid(Integer contactid) {
		this.contactid = contactid;
	}

	public String getConatactname() {
		return conatactname;
	}

	public void setConatactname(String conatactname) {
		this.conatactname = conatactname;
	}

	public Long getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(Long contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getContactemail() {
		return contactemail;
	}

	public void setContactemail(String contactemail) {
		this.contactemail = contactemail;
	}

	public LocalDate getCreateddate() {
		return createddate;
	}

	public void setCreateddate(LocalDate createddate) {
		this.createddate = createddate;
	}

	public LocalDate getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(LocalDate updatedate) {
		this.updatedate = updatedate;
	}

	public Character getIsactive() {
		return isactive;
	}

	public void setIsactive(Character isactive) {
		this.isactive = isactive;
	}

	public Contact(Integer contactid, String conatactname, Long contactnumber, String contactemail,
			LocalDate createddate, LocalDate updatedate, Character isactive) {
		super();
		this.contactid = contactid;
		this.conatactname = conatactname;
		this.contactnumber = contactnumber;
		this.contactemail = contactemail;
		this.createddate = createddate;
		this.updatedate = updatedate;
		this.isactive = isactive;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
