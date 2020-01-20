package com.labsierra.model;

public class Customer {
	
	String name;
	String age;
	String examid;
	
	Customer(){
		
	}
	Customer(String n,String a,String e){
		this.name = n;
		this.age = a;
		this.examid = e;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getExamid() {
		return examid;
	}
	public void setExamid(String examid) {
		this.examid = examid;
	}

}
