<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script>
  function toDel(id) {
      if(confirm("是否删除")){
          location.href="/del?id="+id;
      }
  }
</script>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <c:if test="${param.isDel=='yes'}">
    <script>
      alert("删除成功");
    </script>
  </c:if>
  <c:if test="${param.isDel=='no'}">
    <script>
        alert("删除失败");
    </script>
  </c:if>
  <c:if test="${param.isAdd=='yes'}">
    <script>
        alert("新增成功");
    </script>
  </c:if>
  <c:if test="${param.isAdd=='no'}">
    <script>
        alert("新增失败");
    </script>
  </c:if>
    <table border="1">
      <tr>
        <td>产品名称</td>
        <td>产品描述</td>
        <td>类别</td>
        <td>状态</td>
        <td>操作</td>
      </tr>
      <c:forEach items="${productList}" var="product">
        <tr>
          <td>${product.productname}</td>
          <td>${product.descs}</td>
          <td>${product.catagory.name}</td>
          <td>${product.catagory.explain}</td>
          <td><a href="javascript:toDel(${product.id})">删除</a> </td>
        </tr>
      </c:forEach>
    </table>
  <a href="/index?pageNo=1">首页</a>
  <a href="/index?pageNo=${pager.pageNo-1}">上一页</a>
  <a href="/index?pageNo=${pager.pageNo+1}">下一页</a>
  <a href="/index?pageNo=${pager.totalPage}">尾页</a>
  <br>
  <a href="/toInsert">新增</a>
  </body>
</html>