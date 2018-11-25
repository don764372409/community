package com.yuanmaxinxi.domain.community;
import java.util.Date;
public class Community{
	private Long id;
	private String title;
	private String content;
	private int state;
	private Date time;
	private int readNumber;
	private int commentNumber;
	private Long userId;
	public Long getId(){
		return this.id;
	}
	public void setId(Long id){
		this.id=id;
	}
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	public int getState(){
		return this.state;
	}
	public void setState(int state){
		this.state=state;
	}
	public Date getTime(){
		return this.time;
	}
	public void setTime(Date time){
		this.time=time;
	}
	public int getReadNumber(){
		return this.readNumber;
	}
	public void setReadNumber(int readNumber){
		this.readNumber=readNumber;
	}
	public int getCommentNumber(){
		return this.commentNumber;
	}
	public void setCommentNumber(int commentNumber){
		this.commentNumber=commentNumber;
	}
	public Long getUserId(){
		return this.userId;
	}
	public void setUserId(Long userId){
		this.userId=userId;
	}
}