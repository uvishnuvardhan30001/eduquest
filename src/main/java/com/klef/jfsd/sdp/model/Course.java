package com.klef.jfsd.sdp.model;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course_table")
public class Course 
{
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name="cid" ,nullable=false)
	private int id;
	@Column(name="cname" ,nullable=false)
	private String name;
	@Column(name="cdescription" ,nullable = false,length = 80000)
	private String description;
	@Column(name="cimage" ,nullable = false)
	private Blob image;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	
}
