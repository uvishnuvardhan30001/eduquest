package com.klef.jfsd.sdp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="instructor_table")
public class Instructor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iid",nullable=false)
	private int id;
	@Column(name="iname",nullable=false,length=100)
	private String name;
	@Column(name="igender",nullable=false,length=50)
	private String gender;
	@Column(name="idob",nullable=false,length=50)
	private String dateofbirth;
	@Column(name="igraduation",nullable=false,length=10)
	private String graduation;
	@Column(name="iemail",nullable=false,length=50)
	private String email;
	@Column(name="icontact",nullable=false,length=20)
	private String contact;
	@Column(name = "ipwd",length = 50,nullable = false)
	private String password;
	@Column(name="istatus",nullable=false,length=50)
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