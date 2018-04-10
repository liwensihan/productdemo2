<%--
  Created by IntelliJ IDEA.
  User: baiye
  Date: 2018/4/9
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>新增产品</h1>
<table border="1">
    <form method="post" action="/insert">
        <tr>
            <td>产品名称:</td>
            <td><input type="text" name="productname"></td>
        </tr>
        <tr>
            <td>产品描述:</td>
            <td><textarea name="descs"></textarea></td>
        </tr>
        <tr>
            <td>商品类别:</td>
            <td>
                <select name="cid">
                    <c:forEach items="${catagoryList}" var="catagory">
                        <option value="${catagory.id}">${catagory.name}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td>状态:</td>
            <td><input type="checkbox"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="提交"></td>
        </tr>
    </form>
</table>
</body>
</html>
