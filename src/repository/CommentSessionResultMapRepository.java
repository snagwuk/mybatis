package repository;

import org.apache.ibatis.session.SqlSession;

import model.Comment;
import model.CommentUser;
import model.Reply;
import service.AbstractRepository;

public class CommentSessionResultMapRepository extends AbstractRepository {
	private final String namespace = "mybatis.mapper.CommentMapperResultMap";
	// 얘가 dao 역할 해준다
	public Comment selectCommentByPrimaryKey(Long commentNo){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByPrimaryKey";
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}

	public Comment selectCommentByPrimaryKeyConstructor(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByPrimaryKeyConstructor";
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}
	
	public Comment selectCommentByPrimaryKeyDiscriminator(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByPrimaryKeyDiscriminator";
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}
	
	
	public CommentUser selectCommentByPrimaryKeyAssociation(Long commentNo){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByPrimaryKeyAssociation";
			return (CommentUser)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}
	
	public Comment selectCommentByPrimaryKeyAssociation2(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByPrimaryKeyAssociation2";
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}
	
/*	public Reply selectCommentByPrimaryKeyCollection(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByPrimaryKeyCollection";
			return (Reply)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}*/
	public Comment selectCommentByPrimaryKeyCollection(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByPrimaryKeyCollection";
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}
}
