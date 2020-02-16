package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Comment implements Serializable {

	private Long commentNo;
	private String userId;
	private Date regDate;
	private String commentContent;
	private String userName;

	private List<Reply> replies;
	private Reply reply;

	public Comment() {
	}
	// default 생성자도 같이 써야한다(frameWork 쓸때는 거의 대부분)

	public Long getCommentNo() {
		return commentNo;
	}

	public List<Reply> getReplies() {
		return replies;
	}

	public void setReplies(List<Reply> replies) {
		this.replies = replies;
	}

	public Reply getReply() {
		return reply;
	}

	public void setReply(Reply reply) {
		this.reply = reply;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Comment(Long commentNo, String userId, Date regDate, String commentContent, String userName) {
		this.commentNo = commentNo;
		this.userId = userId;
		this.regDate = regDate;
		this.commentContent = commentContent;
		this.userName = userName;
	}

	public void setCommentNo(Long commentNo) {
		this.commentNo = commentNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getUserName() {
		return userName;
	}

	public void setuUerName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Comment [commentNo=" + commentNo + ", userId=" + userId + ", regDate=" + regDate + ", commentContent="
				+ commentContent + ", userName=" + userName + "]";
	}

}
