﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <jsp:include page="../core/resource.jsp"/>
    <style type="text/css">
        .tree li {
            list-style-type: none;
        }
    </style>
    <link rel="stylesheet" href="${basePath}/js/json/json.format.css">
    <script src="${basePath}/js/api/test.js"></script>
    <script src="${basePath}/js/json/json.format.js"></script>
    <script src="${basePath}/js/formatmarked.js"></script>
    <script>
        $(function () {

            var url = window.basePath + "/api/findService/" + "${service.name}" + "/" + "${service.meta.version}" + ".htm";
            var settings = {type: "get", url: url, dataType: "json"};
            $.ajax(settings).done(function (result) {

                var methodName = "${method.name}";
                for (var i = 0; i < result.methods.length; i++) {

                    if (result.methods[i].name == methodName) {

                        //生成参数输入列表
                        var method = result.methods[i];

                        for (var index = 0; index < method.request.fields.length; index++) {

                            var field = method.request.fields[index];
                            var li = getDataTypeElement(field.dataType, field.name, result, field.optional, field.doc);
                            $('#tree').append(li);
                        }

                        //生成示范报文
                        var parameter = {};
                        for (var index = 0; index < method.request.fields.length; index++) {
                            var field = method.request.fields[index];
                            parameter[field.name] = getJsonSample(field.dataType, result);
                        }
                        Process(parameter);
                    }
                }
            });
        });
    </script>
</head>
<body>
<jsp:include page="../core/header.jsp"/>

<div class="bs-docs-content container">
    <div class="row mt5">
        <ol class="breadcrumb">
            <li><a href="${basePath}/">首页</a></li>
            <li><a href="${basePath}/api/index.htm">API</a></li>
            <li><a href="${basePath}/api/service/${service.name}/${service.meta.version}.htm">${service.name}</a></li>
            <li>
                <a href="${basePath}/api/method/${service.name}/${service.meta.version}/${method.name}.htm">${method.name}</a>
            </li>
            <li><a class="active">在线测试</a></li>
        </ol>
    </div>
    <div class="row">
        <div class="col-sm-3 col-md-3">
            <div class="list-group">
                <c:forEach var="s" items="${services}">
                    <a class="list-group-item ${s == service ? 'active' : ''}"
                       href="${basePath}/api/service/${s.name}/${s.meta.version}.htm">
                        <span class="glyphicon glyphicon-tree-deciduous"></span>
                        <c:choose>
                            <c:when test="${empty s.doc}">
                                <c:out value="${s.name}API"/>
                            </c:when>
                            <c:otherwise>
                                <c:out value="${s.doc}API"/>
                            </c:otherwise>
                        </c:choose>
                    </a>
                </c:forEach>
            </div>
        </div>
        <div class="col-sm-9 col-md-9">
            <div class="page-header mt5">
                <h1 class="mt5">在线测试工具
                </h1>
            </div>

            <form class="form-horizontal">
                <div class="form-group">
                    <label for="serviceName" class="col-sm-2 control-label">服务名</label>

                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="serviceName" value="${service.name}"
                               disabled="disabled">
                    </div>
                </div>
                <div class="form-group">
                    <label for="version" class="col-sm-2 control-label">版本号</label>

                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="version" value="${service.meta.version}"
                               disabled="disabled">
                    </div>
                </div>
                <div class="form-group">
                    <label for="methodName" class="col-sm-2 control-label">方法名</label>

                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="methodName" value="${method.name}"
                               disabled="disabled">
                    </div>
                </div>
            </form>
            <hr>

            <h4>请求参数</h4>

            <div style="border: 1px solid #95B8E7">
                <ul id="tree" class="tree">

                </ul>
            </div>

            <br>
            <button type="button" class="btn btn-info"
                    onclick="applyTest('${service.name}', '${service.meta.version}', '${method.name}');">提交请求
            </button>
            <br>
            <hr>

            <div style="height:400px;padding:10px;border:solid 1px #95B8E7;border-radius:0;resize: none;">
                <ul id="myTabs" class="nav nav-tabs" role="tablist">
                    <li role="presentation" class="active">
                        <a href="#requestData" id="requestData-tab" role="tab" data-toggle="tab"
                           aria-controls="requestData" aria-expanded="true">请求数据</a>
                    </li>
                    <li role="presentation">
                        <a href="#requestSample" id="requestSample-tab" role="tab" data-toggle="tab"
                           aria-controls="requestSample">示范报文</a>
                    </li>
                </ul>

                <div id="myTabContent" class="tab-content" style="height:330px;overflow-y:auto;">
                    <div role="tabpane1" class="tab-pane fade in active" id="requestData"
                         aria-labelledby="requestData-tab">
                        <div id="json-request"></div>
                    </div>
                    <div role="tabpane1" class="tab-pane fade" id="requestSample" aria-labelledby="requestData-tab">
                        <div id="requestSampleData"></div>
                    </div>
                </div>
            </div>

            <h4>返回数据</h4>

            <div id="json-result"
                 style="height:300px;padding:20px;border:solid 1px #95B8E7;border-radius:0;resize: none;overflow-y:auto;"></div>


        </div>
    </div>
</div>

<jsp:include page="../core/footer.jsp"/>
</body>
</html>