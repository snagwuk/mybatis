package service;

import model.Comment;
import model.CommentUser;
import model.Reply;
import repository.CommentSessionResultMapRepository;

public class CommentResultMapService {
	// 이건 service 역할 해준다
	private CommentSessionResultMapRepository
	commentRepository = new CommentSessionResultMapRepository();
	
	public Comment selectByPrimaryKey(Long commentNo) {
		return commentRepository.selectCommentByPrimaryKey(commentNo);
	}
	
	public Comment selectCommentByPrimaryKeyConstructor(Long commentNo) {
		return commentRepository.selectCommentByPrimaryKeyConstructor(commentNo);
	}
	public Comment selectCommentByPrimaryKeyDiscriminator(Long commentNo){
		return commentRepository.selectCommentByPrimaryKeyDiscriminator(commentNo);
	}
	public CommentUser selectCommentByPrimaryKeyAssociation(Long commentNo){
		return commentRepository.selectCommentByPrimaryKeyAssociation(commentNo);
	}
	public Comment selectCommentByPrimaryKeyAssociation2(Long commentNo){
		return commentRepository.selectCommentByPrimaryKeyAssociation2(commentNo);
	}
	
	public Comment selectCommentByPrimaryKeyCollection(Long commentNo){
		return commentRepository.selectCommentByPrimaryKeyCollection(commentNo);
	}
}
