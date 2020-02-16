<%@page import="model.Comment"%>
<%@page import="model.Comment"%>
<%@page import="service.CommentResultMapService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
// XMLS 만으로 매핑구문과 결과매핑 처리
// CoomentMapperResultMap.xml의 selectCommentByPrimaryKeyConstructor매핑구문
Long commentNo = 1L;
CommentResultMapService commentService = new CommentResultMapService();
Comment comment = commentService.selectCommentByPrimaryKeyCollection(commentNo);
%>
댓글번호 : <%= comment.getCommentNo() %><br>
작성자아이디: <%= comment.getUserId() %><br>
작성일시 : <%= comment.getRegDate() %><br>
댓글내용 : <%= comment.getCommentContent()%><br>

댓글작성자 : <%= comment.getUserId() %>
댓글작성자명: <%= comment.getUserName()  %>
</body>
</html>