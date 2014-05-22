<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>今日のおみくじ</title>
    </head>
        <body>
            <center>
            <h2>おみくじ</h2>
            <h1><%= request.getAttribute("unse1") %></h1><br>
            <%= request.getAttribute("kome") %>
            </center>
        </body>
</html>