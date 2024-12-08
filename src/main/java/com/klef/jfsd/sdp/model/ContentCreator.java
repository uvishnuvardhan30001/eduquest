package com.klef.jfsd.sdp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="contentcreator_table")
public class ContentCreator 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ccid",nullable=false)
	private int id;
	@Column(name="ccname",nullable=false,length=100)
	private String name;
	@Column(name="ccgender",nullable=false,length=50)
	private String gender;
	@Column(name="ccdob",nullable=false,length=50)
	private String dateofbirth;
	@Column(name="ccgraduation",nullable=false,length=10)
	private String graduation;
	@Column(name="ccemail",nullable=false,length=50)
	private String email;
	@Column(name="ccdept",nullable=false,length=50)
	private String dept;
	@Column(name="cccontact",nullable=false,length=20,unique = true)
	private String contact;
	@Column(name = "ccpwd",length = 50,nullable = false)
	private String password;
	@Column(name="ccstatus",nullable=false,length=50)
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getGraduation() {
		return graduation;
	}
	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
