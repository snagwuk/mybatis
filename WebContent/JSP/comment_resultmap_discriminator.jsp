<%@page import="service.CommentResultMapService"%>
<%@page import="model.Comment"%>
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
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
CommentResultMapService commentService = new CommentResultMapService();
Comment comment = commentService.selectCommentByPrimaryKeyDiscriminator(commentNo);

%>
댓글번호 : <%= comment.getCommentNo() %><br>
작성자아이디: <%= comment.getUserId() %><br>
작성일시 : <%= comment.getRegDate() %><br>
댓글내용 : <%= comment.getCommentContent()%><br>
</body>
</html>