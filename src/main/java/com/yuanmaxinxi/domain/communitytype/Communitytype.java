package com.yuanmaxinxi.domain.communitytype;
/**
 * 1.大目录   JAVASE JAVAEE 数据库 WEB前端...
 * 2.子目录  运算符 流程控制语句...
 * 3.子目录下的知识点章节   算术运算符  选择 判断
 * 
 * 最后才是教程  教程是每个小知识点的教程
 * @author HOME
 *
 */
public class Communitytype{
	private Long id;
	private String name;
	private Long pId;
	private int state;
	public Long getId(){
		return this.id;
	}
	public void setId(Long id){
		this.id=id;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public Long getPId(){
		return this.pId;
	}
	public void setPId(Long pId){
		this.pId=pId;
	}
	public int getState(){
		return this.state;
	}
	public void setState(int state){
		this.state=state;
	}
}