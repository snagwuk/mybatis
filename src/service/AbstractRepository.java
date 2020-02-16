package service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public abstract class AbstractRepository {
	//repository를 여러개 만들 것 이기 때문에 이걸 상속을 받으면 된다??
	private static SqlSessionFactory sqlSessionFactory;
	static {
		setSqlSessionFactory();
	}
	private static void setSqlSessionFactory(){
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e){
			throw new IllegalArgumentException(e);
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	protected SqlSessionFactory getSqlSessionFactory(){
		return sqlSessionFactory;
	}
}
