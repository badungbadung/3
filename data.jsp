<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="sql\ConnectDB"%>
<%
	
%>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String type = request.getParameter("type");
		ConnectDB connectDB = ConnectDB.getInstance();
	if(type.equals("login")) {
		String returns = connectDB.logindb(id, pwd);
		out.print(returns);
	} else if(type.equals("join")) {
		String returns = connectDB.joindb(id, pwd);
		out.print(returns);
	}
%>