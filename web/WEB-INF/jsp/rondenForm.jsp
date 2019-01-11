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
        <title>START</title>
    </head>
    <body>
        <form:form method="POST" action="game.htm" commandName="numberCommand">
            Number:
            <form:input path="number" size="15"/>&nbsp;
            <form:errors path="number" cssClass="error"/>
            <br/><br/><br/>
            <input type="submit" value="Execute"/>           
        </form:form>
            <table>
                <spring:url value="game/" var="page"/>   
                <c:if test = "${empty links}">
                    <p>My salary is:  <c:out value = "te laag"/><p>
                </c:if>
                <c:forEach var="link" items="${links}" varStatus="loop">
                    <tr>
                        <td><a href="${page}${loop.index+1}">${loop.index+1}</a>. ${link}</td>
                </tr>
                </c:forEach>               
            </table>
        
        
    </body>
</html>
