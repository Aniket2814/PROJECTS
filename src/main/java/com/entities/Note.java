package com.entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.* ;

@Entity
@Table(name="notes")
public class Note {
@Id
	private int id;
	private String title;
	
	
	@Column(length=1500)
	private String content;
	private Date addeddDate;
	public int getId() {
		return id;
	}
	
	public Note( String title, String content, Date addeddDate) {
		super();
		this.id = new Random().nextInt(10000);
		this.title = title;
		this.content = content;
		this.addeddDate = addeddDate;
	}
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getAddeddDate() {
		return addeddDate;
	}
	public void setAddeddDate(Date addeddDate) {
		this.addeddDate = addeddDate;
	}
}
