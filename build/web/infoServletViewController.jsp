<%-- 
    Document   : infoServletView
    Created on : 4/08/2018, 05:18:10 PM
    Author     : PC-49
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>System Information</h1>
        <ul>
            <li>Server name: ${infoBean.serverName}</li>
            <li>Server Memory: ${infoBean.serverMemory}</li>
            <li>Server free Memory: ${infoBean.serverFreeMemory}</li>
            <li>Server Cores: ${infoBean.serverCores}</li>
            <li>Server Time: ${infoBean.serverTime}</li>
            <li
        </ul>
        <a href="index.html"> Go Home</a>
    </body>
</html>
