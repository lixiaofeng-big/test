
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px" cellspacing="0" cellpadding="5">
    <tr>
        <th>房间编号</th>
        <th>房间类型编号</th>
        <th>房间价格</th>
        <th>房间描述</th>
        <th>房间状态编号</th>
        <th>房间备注</th>
    </tr>
    <c:forEach items="${page.datas}" var="pa">
        <tr>
            <td>${pa.roomId}</td>
            <td>${pa.roomTypeId}</td>
            <td>${pa.roomPrice}</td>
            <td>${pa.roomDesc}</td>
            <td>${pa.roomStateId}</td>
            <td>${pa.roomRemark}</td>
        </tr>
    </c:forEach>
</table>
<a href="<c:url value='/list?curPage=${page.firstPage}' />">首页</a>
<a href="<c:url value='/list?curPage=${page.prePage}' />">下一页</a>
<a href="<c:url value='/list?curPage=${page.nextPage}' />">上一页</a>
<a href="<c:url value='/list?curPage=${page.totalPage}' />">尾页</a>
<form action="<c:url value='/list' />">
    跳转到 <input type="text" name="curPage" size="2"/>页 <input value="跳转" type="submit"/>
</form>
跳转到 <input type="text" name="pageno" id="pagenoId" size="2"/>页 <input value="跳转" type="button" οnclick="tiaozhuan()"/>
当前为${page.curPage }页 /共有${page.totalPage }页 每页有${page.curSize }数据 总记录数${page.totalSize }

<script type="text/javascript">
    function tiaozhuan() {
        var pageid = document.getElementById("pagenoId");
        var url = "<c:url value='/list?curpage="+pageid+"' />";
        window.location.href = url;
    }
</script>
</body>
</html>
