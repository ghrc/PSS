/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.14.v20181114
 * Generated at: 2019-07-08 07:41:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view00;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Download_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/javaroot/localRepository_global/taglibs/standard/1.1.2/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098682290000L));
    _jspx_dependants.put("file:/D:/javaroot/localRepository_global/taglibs/standard/1.1.2/standard-1.1.2.jar", Long.valueOf(1560828620329L));
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
  }

  public void _jspDestroy() {
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>信息下载</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/X-admin/css/font.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/X-admin/css/xadmin.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/X-admin/lib/layui/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/X-admin/js/xadmin.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/html5shiv/r29/html5.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/html5shiv.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/static/h-ui/css/H-ui.min.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/static/h-ui.admin/css/H-ui.admin.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/Hui-iconfont/1.0.8/iconfont.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/static/h-ui.admin/skin/default/skin.css\" id=\"skin\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/static/h-ui.admin/css/style.css\" />\r\n");
      out.write("    <!--[if IE 6]>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/DD_belatedPNG_0.0.8a-min.js\" ></script>\r\n");
      out.write("    <script>DD_belatedPNG.fix('*');</script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <style>\r\n");
      out.write("    body{\r\n");
      out.write("        text-align:center;\r\n");
      out.write("        background:url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/background.jpg)  no-repeat center center;\r\n");
      out.write("        background-size:cover;\r\n");
      out.write("        background-attachment:fixed;\r\n");
      out.write("        background-color:#CCCCCC;\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table id=\"datalist\"  class=\"table table-border table-bordered  table-bg \">\r\n");
      out.write("    <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <div class=\"div\"><h1>数据下载界面</h1></div>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    <tbody>\r\n");
      out.write("        <tr class=\"text-c\">\r\n");
      out.write("        <td>\r\n");
      out.write("            <h4>商品资料下载</h4>\r\n");
      out.write("        </td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <p class=\"btn btn-primary radius\"><a\r\n");
      out.write("                        href=\"Download?type=goods&page=0&name=商品信息\"\r\n");
      out.write("                ><i class=\"Hui-iconfont\">&#xe640;</i>\r\n");
      out.write("                    下载所有商品信息</a></p>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <label>按数量下载：</label>\r\n");
      out.write("                <span class=\"select-box inline\">\r\n");
      out.write("                    <select name=\"number\" id=\"goods\" class=\"select\">\r\n");
      out.write("                        <option value=\"500\">前500条</option>\r\n");
      out.write("                        <option value=\"1000\">前1000条</option>\r\n");
      out.write("                        <option value=\"3000\">前3000条</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </span>\r\n");
      out.write("                <p class=\"btn btn-primary radius\"><a\r\n");
      out.write("                        href=\"javascript:;\"\r\n");
      out.write("                        onclick=\"goods()\"\r\n");
      out.write("                ><i class=\"Hui-iconfont\">&#xe640;</i>\r\n");
      out.write("                    下载</a></p>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <p class=\"btn btn-primary radius\"><a\r\n");
      out.write("                        href=\"Download?type=goodsWarning&name=库存预警\"\r\n");
      out.write("                ><i class=\"Hui-iconfont\">&#xe640;</i>\r\n");
      out.write("                    商品预警信息下载</a></p>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("\r\n");
      out.write("        <tr class=\"text-c\">\r\n");
      out.write("        <td>\r\n");
      out.write("            <h4>采购报表下载</h4>\r\n");
      out.write("        </td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <p class=\"btn btn-primary radius\"><a\r\n");
      out.write("                        href=\"Download?type=purchase&page=0&name=采购报表\"\r\n");
      out.write("                ><i class=\"Hui-iconfont\">&#xe640;</i>\r\n");
      out.write("                    下载所有采购报表</a></p>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <label>按数量下载：</label>\r\n");
      out.write("                <span class=\"select-box inline\">\r\n");
      out.write("                    <select name=\"number\" id=\"purchase\" class=\"select\">\r\n");
      out.write("                        <option value=\"500\">前500条</option>\r\n");
      out.write("                        <option value=\"1000\">前1000条</option>\r\n");
      out.write("                        <option value=\"3000\">前3000条</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </span>\r\n");
      out.write("                <p class=\"btn btn-primary radius\"><a\r\n");
      out.write("                        href=\"javascript:;\"\r\n");
      out.write("                        onclick=\"purchase()\"\r\n");
      out.write("                ><i class=\"Hui-iconfont\">&#xe640;</i>\r\n");
      out.write("                    下载</a></p>\r\n");
      out.write("            </td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <label>按年份下载：</label>\r\n");
      out.write("                <span class=\"select-box inline\">\r\n");
      out.write("                    <select name=\"year\" id='year' class=\"select\">\r\n");
      out.write("                        <option value=\"2019\">2019</option>\r\n");
      out.write("                        <option value=\"2018\">2018</option>\r\n");
      out.write("                        <option value=\"2017\">2017</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </span>\r\n");
      out.write("                <p class=\"btn btn-primary radius\"><a\r\n");
      out.write("                        href=\"javascript:;\"\r\n");
      out.write("                        onclick=\"year()\"\r\n");
      out.write("                ><i class=\"Hui-iconfont\">&#xe640;</i>\r\n");
      out.write("                    下载</a></p>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/X-admin/js/jquery.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    function goods() {\r\n");
      out.write("        window.open('Download?type=goods&name=商品资料&number='+$('#goods').val());\r\n");
      out.write("    }\r\n");
      out.write("    function purchase() {\r\n");
      out.write("        window.open('Download?type=purchase&name=采购报表&number='+$('#purchase').val());\r\n");
      out.write("    }\r\n");
      out.write("    function year() {\r\n");
      out.write("        window.open('Download?type=yearPurchase&name=年度采购报表&year='+$('#year').val());\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
}