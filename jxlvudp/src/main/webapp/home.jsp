<%--
  Created by IntelliJ IDEA.
  User: wph-pc
  Date: 2017/6/11
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/header/init_bootstrap.jsp"%>
<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>/css/bootstrap.min.css">
</head>
<body style="padding: 20px;">
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="jumbotron" style="background:#d7ebf9">
                <div class="page-header">
                    <h3>校园水果后台管理系统<small>Beta V1.0.0.0</small></h3>
                </div>
                <p>
                    水果，这种大众消费品已逐渐转变为生活必需品，是大众日常消费的一个重要组成部分。随着我们学校的不断发展，我们学生的规模越来越大。庞大的学生数量必然带来庞大的水果需求。
                    经我的调查很多同学在家都有经常吃水果的习惯，他们在校也很有这方面的欲望，因此校园水果必然是一种很好的发展方向。
                </p>
                <p><a class="btn btn-primary btn-lg" href="#" role="button">了解更多</a></p>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6" >
            <div class="thumbnail">
                <img src="<%=basePath%>/images/guochan.png" width="150" height="150" alt="...">
                <div class="caption" >
                    <h3>国产水果</h3>
                    <h5>Domestic Fruits</h5>
                    <p>随着南方逐渐纳入中国文化圈，许多原产于南方的水果也渐渐被食用。
                        其中包括了橘、柚、柑、橙、荔枝、龙眼、林檎（又称花红）、枇杷、杨梅、橄榄。
                    </p>
                    <p><a href="#" class="btn btn-primary" role="button">详情</a></p>
                </div>
            </div>
        </div>
        <div class="col-md-6">
            <div class="thumbnail">
                <img src="<%=basePath%>/images/jinkou.png" width="150" height="150" alt="...">
                <div class="caption">
                    <h3>进口水果</h3>
                    <h5>Imported fruit</h5>
                    <p>进口水果比较贵，因为有关税在里面；包装一般比较精致；
                        一般都是绿色的，农药化肥等一般都不会超标；
                        很多进口水果是国内没有的；不同的水果可能在大小、外观等方面可能都超过国产的。</p>
                    <p><a href="#" class="btn btn-primary" role="button">详细</a></p>
                </div>
            </div>
        </div>

    </div>
    <div class="row">
        <div class="col-md-6">
            <div class="thumbnail">
                <img src="<%=basePath%>/images/shengxian.png" width="150" height="150" alt="...">
                <div class="caption">
                    <h3>生鲜水果</h3>
                    <h5>Fresh fruit</h5>
                    <p>生鲜农产品主要包括蔬菜、水果、花卉、肉、蛋、奶以及水产品等我们日常生活中必不可少的生活必需品。
                        我们习惯将其称为“生鲜三品”，即果蔬、肉类和水产。</p>
                    <p><a href="#" class="btn btn-primary" role="button">详细</a></p>
                </div>
            </div>
        </div>
        <div class="col-md-6">
            <div class="thumbnail">
                <img src="<%=basePath%>/images/redai.png" width="150" height="150" alt="...">
                <div class="caption">
                    <h3>热带水果</h3>
                    <h5>Tropical fruits</h5>
                    <p>典型的热带水果有：菠萝、香蕉、芒果、火龙果、龙眼、荔枝、榴莲、莲雾、柚子、金心果、尖蜜拉、椰子、
                        夏威夷果、蛋黄果、油梨、红毛丹、番荔枝、西番莲、柠檬等等</p>
                    <p><a href="#" class="btn btn-primary" role="button">详情</a></p>
                </div>
            </div>
        </div>

    </div>
</div>
</body>

</html>
