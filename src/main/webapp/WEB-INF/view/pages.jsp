<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<br>
<br>
<input type="button"
	onclick="goPage(${info.prePage==0?1:info.prePage })" value="上一页">
<input type="button"
	onclick="goPage(${info.nextPage ==0?info.pages:info.nextPage})"
	value="下一页">
总条数:${info.total}/总页数:${info.pages }
