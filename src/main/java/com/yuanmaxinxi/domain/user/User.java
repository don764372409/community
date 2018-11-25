package com.yuanmaxinxi.domain.user;
import java.util.Date;
public class User{
	private Long id;
	private String username;
	private String password;
	private String headImg;
	private Date birthday;
	private String phone;
	private String email;
	private String name;
	private Date lastTime;
	private Date loginTime;
	private Date registerTime;
	private String lastIp;
	private String loginIp;
	private String registIp;
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
	public String getHeadImg(){
		return this.headImg;
	}
	public void setHeadImg(String headImg){
		this.headImg=headImg;
	}
	public Date getBirthday(){
		return this.birthday;
	}
	public void setBirthday(Date birthday){
		this.birthday=birthday;
	}
	public String getPhone(){
		return this.phone;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Date getLastTime(){
		return this.lastTime;
	}
	public void setLastTime(Date lastTime){
		this.lastTime=lastTime;
	}
	public Date getLoginTime(){
		return this.loginTime;
	}
	public void setLoginTime(Date loginTime){
		this.loginTime=loginTime;
	}
	public Date getRegisterTime(){
		return this.registerTime;
	}
	public void setRegisterTime(Date registerTime){
		this.registerTime=registerTime;
	}
	public String getLastIp(){
		return this.lastIp;
	}
	public void setLastIp(String lastIp){
		this.lastIp=lastIp;
	}
	public String getLoginIp(){
		return this.loginIp;
	}
	public void setLoginIp(String loginIp){
		this.loginIp=loginIp;
	}
	public String getRegistIp(){
		return this.registIp;
	}
	public void setRegistIp(String registIp){
		this.registIp=registIp;
	}
	public int getState(){
		return this.state;
	}
	public void setState(int state){
		this.state=state;
	}
}