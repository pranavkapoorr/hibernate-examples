<%@ page import="com.pranavkapoorr.User,com.pranavkapoorr.UserDao" %>
<%
	if(request.getParameter("register")!=null){
	 	User user = new User();
		user.setName(request.getParameter("name").toString());
		user.setEmail(request.getParameter("email").toString());
		user.setPassword(request.getParameter("password").toString());
		out.print(UserDao.register(user)>0?"Successfuly registered":"Registeration Failed!");
	}
%> 