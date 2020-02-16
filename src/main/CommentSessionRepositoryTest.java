package main;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Comment;
import session.CommetnSessionRepository;

public class CommentSessionRepositoryTest {
	private final CommetnSessionRepository commetnSessionRepository
	= new CommetnSessionRepository();
	
	public void testSelectCommentByPrimaryKey() {
		Long commentNo = 1L;
		//1로하면 Primary key 오류나서 일단 7로 바꿈
		Comment comment
		= commetnSessionRepository.selectCommentByPrimaryKey(commentNo);
		
		System.out.println(comment);
	}

	public void testSelectCommentByCondition() {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", 2L);
	/*	condition.put("coomentNoForeach", Arrays.asList(1L,2L,3L));*/
		condition.put("commentNoForeach", new ArrayList<Long>());
		List li = commetnSessionRepository.selectCommentByCondition(condition);
		System.out.println(li);

	}
	
	public void testInsertCommnet(){
		Long commentNo = 9L;
		String userId = "scott";
		Date regDate = Calendar.getInstance().getTime();
		String commentContent = "야이야이야 내나이가 어때서";
		Comment comment = new Comment();
		comment.setCommentNo(commentNo);
		comment.setUserId(userId);
		comment.setCommentContent(commentContent);
		comment.setRegDate(regDate);
		// commentSessionRepository.deleteComment(commentNo);
		Integer result = commetnSessionRepository.insertComment(comment);
		System.out.println(result);
	}
	
	public void testUpdateComment(){
		Long commentNo = 1L;
		String commentContent = "수정 정수정 김수정 참수정 수정은 크리스탈";
		
		Comment comment = new Comment();
		comment .setCommentNo(commentNo);
		comment .setCommentContent(commentContent);
		Integer result = commetnSessionRepository.updateComment(comment);
		
		System.out.println(result);
	}
	
	public void testDeleteComment() {
		Long commentNo = 3L;
		Integer result = commetnSessionRepository.deleteComment(commentNo);
		System.out.println(result);
	}
	
	

	public static void main(String[] args){
		System.out.println("===========");
		CommentSessionRepositoryTest test = new CommentSessionRepositoryTest();
/*		test.testSelectCommentByPrimaryKey();
		test.testSelectCommentByCondition();*/
		/*test.testInsertCommnet();*/
		/*test.testUpdateComment();*/
		test.testDeleteComment();
	}
	
}
