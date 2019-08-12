<%@ page import="java.util.List" %>
<%@ page import="com.gxg.vo.User" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 郭小港
  Date: 2019/8/9
  Time: 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
pageEncoding="UTF-8" session="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
   //给seesion存储一个list集合
    List<String> list = new ArrayList<>();
    list.add("111");
    list.add("222");
    session.setAttribute("list",list);
%>
el表达式--为了替代jsp的输出表达式： ${sessionScope.list[1]}
<%
    //page域
    pageContext.setAttribute("akey","avalue");
    //request域
    request.setAttribute("dfsa","sdf");
    //session域
    session.setAttribute("ckey","cvalue");
    //applacation域
    application.setAttribute("dkey","dvalue");
    request.getRequestDispatcher("result.jsp").forward(request,response);
%>
传统方式获取
<%=pageContext.getAttribute("akey")%>

el表达式获取
${pageScope.akey}  简写方式  ${akey}
      <%--  <%
        List<User> userList = (List<User>) request.getSession().getAttribute("userListKey");
        for(Iterator iterator = userList.iterator(); iterator.hasNext();){
            User user= (User) iterator.next();
        %>

        <table border="1">
            <tr>
                <td>ID</td>
                <td>USERNAME</td>
                <td>PASSWORD</td>
            </tr>
            <tr>
                <td>
                    <%user.getUserId();%>
                </td>
                <td>
                    <%user.getUserName();%>
                </td>
                <td>
                    <%user.getPassword();%>
                </td>
            </tr>
            <%}%>
        </table>--%>
</body>
</html>
