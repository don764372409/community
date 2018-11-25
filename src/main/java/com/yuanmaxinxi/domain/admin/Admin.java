package com.yuanmaxinxi.domain.admin;
public class Admin{
	private Long id;
	private String username;
	private String password;
	private String name;
	private int state;
	public Long getId(){
		return this.id;
	}
	public void setId(Long id){
		this.id=id;
	}
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username=username;
	}
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getState(){
		return this.state;
	}
	public void setState(int state){
		this.state=state;
	}
}