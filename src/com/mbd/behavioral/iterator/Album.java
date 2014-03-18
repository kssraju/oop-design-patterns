package com.mbd.behavioral.iterator;

public class Album {

	private String name;

	private String author;

	private int year;

	public Album(String author, String name, int year) {
		super();
		this.name = name;
		this.year = year;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Author: " + this.author + ", Name: " +  this.name + ", Year: " +  this.year;
	}

}
