/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.14.v20181114
 * Generated at: 2019-07-07 08:29:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view00;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SaleReturn_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/javaroot/localRepository_global/jstl/jstl/1.2/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153356282000L));
    _jspx_dependants.put("jar:file:/D:/javaroot/localRepository_global/taglibs/standard/1.1.2/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098682290000L));
    _jspx_dependants.put("file:/D:/javaroot/localRepository_global/taglibs/standard/1.1.2/standard-1.1.2.jar", Long.valueOf(1561018064007L));
    _jspx_dependants.put("file:/D:/javaroot/localRepository_global/jstl/jstl/1.2/jstl-1.2.jar", Long.valueOf(1561018063505L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t<meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\r\n");
      out.write("\t\t<meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("\t\t<!--[if lt IE 9]>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/html5shiv.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/respond.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/static/h-ui/css/H-ui.min.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/static/h-ui.admin/css/H-ui.admin.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/Hui-iconfont/1.0.8/iconfont.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/static/h-ui.admin/skin/default/skin.css\" id=\"skin\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/static/h-ui.admin/css/style.css\" />\r\n");
      out.write("\t\t<!--[if IE 6]>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/DD_belatedPNG_0.0.8a-min.js\" ></script>\r\n");
      out.write("\t\t<script>DD_belatedPNG.fix('*');</script>\r\n");
      out.write("\t\t<![endif]-->\r\n");
      out.write("\t\t<title>退货管理</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<nav class=\"breadcrumb\">\r\n");
      out.write("\t\t\t<i class=\"Hui-iconfont\">&#xe67f;</i> 首页 <span class=\"c-gray en\">&gt;</span>\r\n");
      out.write("\t\t\t销售管理<span class=\"c-gray en\">&gt;</span> 退货管理 <a\r\n");
      out.write("\t\t\t\tclass=\"btn btn-success radius r\"\r\n");
      out.write("\t\t\t\tstyle=\"line-height:1.6em;margin-top:3px\"\r\n");
      out.write("\t\t\t\thref=\"javascript:location.replace(location.href);\" title=\"刷新\" ><i\r\n");
      out.write("\t\t\t\tclass=\"Hui-iconfont\">&#xe68f;</i></a>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<div class=\"page-container\">\r\n");
      out.write("\t\t\t<div class=\"text-c\">\r\n");
      out.write("\t\t\t\t<form action=\"SaleReturn\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"oper\" value=\"listDeal\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<span> 查询：</span>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"input-txet\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${searchName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t   style=\"...\" placeholder=\"请输入客户名\" id=\"searchName\" name=\"searchName\" >\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success radius\" id=\"\" name=\"\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"Hui-iconfont\">&#xe665;</i> 搜索\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-success radius\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"clearSearch\" name=\"\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"Hui-iconfont\">&#xe665;</i> 清空\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"cl pd-5 bg-1 bk-gray mt-20\">\r\n");
      out.write("\t\t\t<span class=\"l\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:;\" onclick=\"datadel()\"\r\n");
      out.write("\t\t\t\t   class=\"btn btn-danger radius\"><i class=\"Hui-iconfont\">&#xe6e2;</i>\r\n");
      out.write("\t\t\t\t\t批量删除</a>\r\n");
      out.write("\t\t\t\t<a href=\"javascript:;\" onclick=\"item_add('添加','SaleReturn?oper=insert','800','500')\"\r\n");
      out.write("\t\t\t\t   class=\"btn btn-primary radius\"><i class=\"Hui-iconfont\">&#xe600;</i>\r\n");
      out.write("\t\t\t\t\t添加</a>\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t<span class=\"r\">共有数据：<strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pagerItem.rowCount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</strong>\r\n");
      out.write("\t\t\t\t条\r\n");
      out.write("\t\t\t</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"mt-20\">\r\n");
      out.write("\t\t\t<table id=\"datalist\" class=\"table table-border table-bordered table-hover table-bg\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th scope=\"col\" colspan=\"9\">数据列表</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr class=\"text-c\">\r\n");
      out.write("\t\t\t\t\t\t<th width=\"25\"><input type=\"checkbox\" name=\"\" value=\"\"></th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"150\">退货单号</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"150\">出库单号</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"150\">客户名</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"150\">退回日期</th>\r\n");
      out.write("\t\t\t\t\t\t<th width=\"100\">操作</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "__pager.jsp", out, true);
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--_footer 作为公共模版分离出去-->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/layer/2.4/layer.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/static/h-ui/js/H-ui.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/static/h-ui.admin/js/H-ui.admin.js\"></script> <!--/_footer 作为公共模版分离出去-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--请在下方写此页面业务相关的脚本-->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/My97DatePicker/4.8/WdatePicker.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/datatables/1.10.0/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/laypage/1.2/laypage.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t$(\"#clearSearch\").click(function(){\r\n");
      out.write("\t\t\t\t\tlocation.href = \"SaleReturn?oper=list\";\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t/*项目-添加*/\r\n");
      out.write("\t\tfunction item_add(title,url,w,h){\r\n");
      out.write("\t\t\tlayer_show(title,url,w,h);\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t/*项目-查看*/\r\n");
      out.write("\t\tfunction item_detail(title,url,id,w,h){\r\n");
      out.write("\t\t\tlayer_show(title,url,w,h);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t/*项目-编辑*/\r\n");
      out.write("\t\tfunction item_edit(title,url,id,w,h){\r\n");
      out.write("\t\t\tlayer_show(title,url,w,h);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//请求下载文件\r\n");
      out.write("\t\tfunction dataload(page, size) {\r\n");
      out.write("\t\t\tconsole.log(\"Ajax\");\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:'POST',\r\n");
      out.write("\t\t\t\turl:'SaleReturn?oper=dataLoad&page=' + page + \"&size=\" + size,\r\n");
      out.write("\t\t\t\tsuccess: function (data) {\r\n");
      out.write("\t\t\t\t\tif ( data=='ok' ){\r\n");
      out.write("\t\t\t\t\t\tlayer.msg('下载成功!',{\r\n");
      out.write("\t\t\t\t\t\t\ticon : 1,\r\n");
      out.write("\t\t\t\t\t\t\ttime : 1000\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tlayer.msg('下载失败!',{\r\n");
      out.write("\t\t\t\t\t\t\ticon : 1,\r\n");
      out.write("\t\t\t\t\t\t\ttime : 1000\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror:function(data) {\r\n");
      out.write("\t\t\t\t\tconsole.log(data.msg);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t/*项目-删除*/\r\n");
      out.write("\t\tfunction item_del(obj,id){\r\n");
      out.write("\t\t\tlayer.confirm('确认要删除吗？',function(index){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\ttype: 'POST',\r\n");
      out.write("\t\t\t\t\turl: 'SaleReturn?oper=deleteDeal&id=' + id,\r\n");
      out.write("\t\t\t\t\t// dataType: 'json',\r\n");
      out.write("\t\t\t\t\tsuccess: function(data){\r\n");
      out.write("\t\t\t\t\t\tif (data==\"ok\"){\r\n");
      out.write("\t\t\t\t\t\t\t$(obj).parents(\"tr\").remove();\r\n");
      out.write("\t\t\t\t\t\t\tlayer.msg('已删除!',{\r\n");
      out.write("\t\t\t\t\t\t\t\ticon : 1,\r\n");
      out.write("\t\t\t\t\t\t\t\ttime : 1000\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\tlayer.msg('删除失败!',{\r\n");
      out.write("\t\t\t\t\t\t\t\ticon : 1,\r\n");
      out.write("\t\t\t\t\t\t\t\ttime : 1000\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\terror:function(data) {\r\n");
      out.write("\t\t\t\t\t\tconsole.log(data.msg);\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t/*批量-删除*/\r\n");
      out.write("\t\tfunction datadel() {\r\n");
      out.write("\t\t\tlayer.confirm('确认要删除选中数据吗？', function (index) {\r\n");
      out.write("\t\t\t\tvar num = 0;\r\n");
      out.write("\t\t\t\tvar total = 0;\r\n");
      out.write("\t\t\t\tvar obj = null;\r\n");
      out.write("\t\t\t\tvar id = 0;\r\n");
      out.write("\t\t\t\t$(\"#datalist input[type=checkbox]:checked\").each(function () {\r\n");
      out.write("\t\t\t\t\tobj = this;\r\n");
      out.write("\t\t\t\t\tid = $(this).val();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif(id != null && id != \"\" && id != \"0\"){\r\n");
      out.write("\t\t\t\t\t\ttotal++;\r\n");
      out.write("\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\t\ttype : 'POST',\r\n");
      out.write("\t\t\t\t\t\t\turl : 'SaleReturn',\r\n");
      out.write("\t\t\t\t\t\t\tasync : false,\r\n");
      out.write("\t\t\t\t\t\t\tdata : {\"oper\":\"deleteDeal\", \"id\":id},\r\n");
      out.write("\t\t\t\t\t\t\tsuccess : function (data) {\r\n");
      out.write("\t\t\t\t\t\t\t\tif (data==\"ok\"){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(obj).parents(\"tr\").remove();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t// layer.msg('已删除!',{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t// \ticon : 1,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t// \ttime : 1000\r\n");
      out.write("\t\t\t\t\t\t\t\t\t// });\r\n");
      out.write("\t\t\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t// layer.msg('删除失败!',{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t// \ticon : 1,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t// \ttime : 1000\r\n");
      out.write("\t\t\t\t\t\t\t\t\t// });\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\terror : function (data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t// console.log(data.msg);\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\tlayer.msg(\"要删除\" + total + \"行记录，成功删除\" + num + \"行记录。\", {\r\n");
      out.write("\t\t\t\t\ticon : 1,\r\n");
      out.write("\t\t\t\t\ttime : 1000\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/view00/SaleReturn_list.jsp(86,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("item");
      // /WEB-INF/view00/SaleReturn_list.jsp(86,5) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${DataList}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<tr class=\"text-c\">\r\n");
            out.write("\t\t\t\t\t\t\t<td><input type=\"checkbox\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.returnId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" name=\"id\"></td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.returnId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.orderId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.cName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>");
            if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write(" </td>\r\n");
            out.write("\t\t\t\t\t\t\t<td>\r\n");
            out.write("\t\t<a title=\"删除\" href=\"javascript:;\"\r\n");
            out.write("\t\t   onclick=\"item_del(this,");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.returnId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(")\" class=\"ml-5\"\r\n");
            out.write("\t\t   style=\"text-decoration: none\"><i class=\"Hui-iconfont\">&#xe6e2;</i></a>\r\n");
            out.write("\r\n");
            out.write("\t\t<a title=\"编辑\" href=\"javascript:;\"\r\n");
            out.write("\t\t   onclick=\"item_edit('编辑[id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.returnId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("]','SaleReturn?oper=update&id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.returnId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("','1','800','500')\"\r\n");
            out.write("\t\t   class=\"ml-5\" style=\"text-decoration: none\"> <i\r\n");
            out.write("\t\t\t\tclass=\"Hui-iconfont\">&#xe6df;</i></a>\r\n");
            out.write("\r\n");
            out.write("\t\t<a title=\"查看\"\r\n");
            out.write("\t\t   href=\"javascript:;\"\r\n");
            out.write("\t\t   onclick=\"item_detail('查看[Id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.returnId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("]','SaleReturn?oper=detail&id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.returnId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("','4','800','500')\"\r\n");
            out.write("\t\t   class=\"ml-5\" style=\"text-decoration: none\"> <i\r\n");
            out.write("\t\t\t\tclass=\"Hui-iconfont\">&#xe707;</i></a>\r\n");
            out.write("\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /WEB-INF/view00/SaleReturn_list.jsp(92,11) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.returnDate}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/view00/SaleReturn_list.jsp(92,11) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd");
      int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      _jspx_th_fmt_005fformatDate_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f0_reused);
    }
    return false;
  }
}
