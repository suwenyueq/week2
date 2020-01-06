<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<!-- 引入 css -->
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/resource/bootstrap.css">
<!-- 引入js -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
</head>
<body>
<form action="clist">
	<table>
  <tr>
    <th>编号</th>
    <th>关键字</th>
    <th>概述</th>
    <th>公司名称</th>
    <th>主营产品</th>
    <th>地址</th>
    <th>注册资金(万)</th>
    <th>成立时间</th>
    <th>年检日期</th>
    <th>状态</th>
    <th>备注</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${info.list}" var="c" >
  <tr>
    <td>${c.pkid }</td>
    <td>${c.pkgjz }</td>
    <td>${c.pkms }</td>
    <td>${c.pkname }</td>
    <td>${c.pkcp }</td>
    <td>${c.pkadress }</td>
    <td>${c.pkprice }</td>
    <td>${c.pkctime }</td>
    <td>${c.pketime }</td>
    <td>${c.pkzt }</td>
    <td>${c.pkbz }</td>
    <td><a href="cx?id="+${c.pkid }>年检审核</a></td>
  </tr>
  </c:forEach>
</table>
<div style="clear:both">
     <jsp:include page="/WEB-INF/view/pages.jsp"></jsp:include>
 </div>
</form>
<script type="text/javascript">
function goPage(page){
	   location.href="${pageContext.request.contextPath}/clist?page="+page
}
</script>
</body>
</html>