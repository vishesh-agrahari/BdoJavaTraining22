package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="instroctordetails")
@Entity
public class Instructor_details{
 
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String youtubechannel;
    private String hooby;
    
    public Instructor_details() { }
    
	public Instructor_details(String youtubechannel, String hooby) {
		this.youtubechannel = youtubechannel;
		this.hooby = hooby;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getYoutubechannel() {
		return youtubechannel;
	}
	public void setYoutubechannel(String youtubechannel) {
		this.youtubechannel = youtubechannel;
	}
	public String getHooby() {
		return hooby;
	}
	public void setHooby(String hooby) {
		this.hooby = hooby;
	}
	
}
