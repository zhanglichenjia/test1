<%--
  Created by IntelliJ IDEA.
  User: heying
  Date: 2017/10/29
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/header/init.jsp"%>
<html>
<head>
    <title>test</title>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="width=device-width; initial-scale=1.0">
    <link href="<%=basePath%>/plugins/layui/css/layui.css" rel="stylesheet" />
    <script src="<%=basePath%>/plugins/layui/layui.js"></script>
</head>
<body>
<div class="layui-table-tool" id="tb">
    <button class="layui-btn layui-btn-small" id="btnAdd" >
        <i class="layui-icon">&#xe608;</i> 添加
    </button>
    <input type="text"  style="width: 300px; height: 28px;" name="name" id="txtName" required  placeholder="请输入关键词" autocomplete="off"/>
    <div class="layui-btn-group">
        <button class="layui-btn layui-btn-small" id="btnFind">
            <i class="layui-icon">&#xe615;</i> 搜索
        </button>
        <%--<button class="layui-btn layui-btn-small layui-btn-normal" id="btnFresh">--%>
        <%--<i class="layui-icon">&#x1002;</i> 刷新--%>
        <%--</button>--%>
        <button class="layui-btn layui-btn-small layui-btn-warm" id="btnDeleteAll">
            <i class="layui-icon">&#xe640;</i> 批量删除
        </button>
    </div>
</div>
<table class="easyui-datagrid" title="购买产品管理" style="height:auto" id="dgBuyProduct"
       data-options="rownumbers:true,pagination:true,collapsible:true,striped:true,fit:true,toolbar:'#tb'">
    <thead>
    <tr>
        <th data-options="field:'id1',checkbox:true"></th>
        <th data-options="field:'id',width:60">编号</th>
        <th data-options="field:'name',width:80">产品名称</th>
        <th data-options="field:'count',width:100">产品数量</th>
        <th data-options="field:'oldPrice',width:120">未打折价格</th>
        <th data-options="field:'discount',width:120">折扣</th>
        <th data-options="field:'nowPrice',width:120">打折后的价格</th>
        <th data-options="field:'sumPrice',width:120">总价</th>
        <th data-options="field:'oid',width:100">对应的订单id</th>
        <th data-options="field:'ids',formatter:jxmstc.formateOperateForEasyui" width="120" align="center">操作</th>
    </tr>
    </thead>
</table>

<script src="<%=basePath%>/script/business/web/BuyProductManage.js"></script>



</body>
</html>
