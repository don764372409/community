package com.yuanmaxinxi.domain.commentreply;
import java.util.Date;
public class CommentReply{
	private Long id;
	private String content;
	private Date time;
	private Long userId;
	private Long commentId;
	public Long getId(){
		return this.id;
	}
	public void setId(Long id){
		this.id=id;
	}
	public String getContent(){
		return this.content;
	}
	public void setContent(String content){
		this.content=content;
	}
	public Date getTime(){
		return this.time;
	}
	public void setTime(Date time){
		this.time=time;
	}
	public Long getUserId(){
		return this.userId;
	}
	public void setUserId(Long userId){
		this.userId=userId;
	}
	public Long getCommentId(){
		return this.commentId;
	}
	public void setCommentId(Long commentId){
		this.commentId=commentId;
	}
}