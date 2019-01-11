<%-- 
    Document   : rondenForm
    Created on : 10-jan-2019, 22:14:11
    Author     : ief
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <spring:url value="/css/style.css" var="urlCss"/>
        <link rel="styleSheet" href="${urlCss}" type="text/css" />
        <title>SPEL</title>
    </head>
    <body>
        <table>           
                <spring:url value="game/" var="page"/>                 
                <c:if test="${win or loose}">
                    <c:forEach var="link" items="${links}" varStatus="loop">
                    <tr>
                        <td> ${link}</td>
                </tr>
                </c:forEach>
                </c:if>
                <c:if test="${not win and not loose}">
                    <c:forEach var="link" items="${links}" varStatus="loop">
                    <tr>
                        <td><a href="${loop.index+1}">${loop.index+1}</a>. ${link}</td>
                </tr>
                </c:forEach>
                
            </table>
        </c:if><c:if test = "${not empty win}">                    
                    YOU WIN
                    <a href="/Game/spring_spel/game.htm"> nieuw spel</a>
                    
                </c:if>                    
                    <c:if test = "${not empty loose}">
                    YOU LOOSE
                    <a href="/Game/spring_spel/game.htm"> nieuw spel</a>
                    
                </c:if>             
        
    </body>
</html>
