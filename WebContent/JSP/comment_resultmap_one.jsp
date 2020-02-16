<%@page import="service.CommentResultMapService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="model.Comment" %>
<%
//XML 만으로 매핑구문과 결과매핑 처리
//cOMMENTmAPPERdYNAMICsQL.XML의 selectCommentByPrimarykey매핑구문
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
CommentResultMapService commentResultMapService = new CommentResultMapService();
Comment comment = commentResultMapService.selectByPrimaryKey(commentNo);

%>
댓글번호 : <%= comment.getCommentNo() %><br>
작성자아이디: <%= comment.getUserId() %><br>
작성일시 : <%= comment.getRegDate() %><br>
댓글내용 : <%= comment.getCommentContent()%><br>