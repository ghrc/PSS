/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.14.v20181114
 * Generated at: 2019-07-07 08:28:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view00;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit|ie-comp|ie-stand\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\" />\r\n");
      out.write("    <meta http-equiv=\"Cache-Control\" content=\"no-siteapp\" />\r\n");
      out.write("    <link rel=\"Bookmark\" href=\"/favicon.ico\" >\r\n");
      out.write("    <link rel=\"Shortcut Icon\" href=\"/favicon.ico\" />\r\n");
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
      out.write("    <title>H-ui.admin v3.1</title>\r\n");
      out.write("    <meta name=\"keywords\" content=\"进销存管理系统 v1.0.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"进销存管理系统 v1.0.0\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header class=\"navbar-wrapper\">\r\n");
      out.write("    <div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("        <div class=\"container-fluid cl\"> <a class=\"logo navbar-logo f-l mr-10 hidden-xs\" href=\"Main?oper=list\">进销存管理系统</a> <a class=\"logo navbar-logo-m f-l mr-10 visible-xs\" href=\"Main?oper=list\">H-ui</a>\r\n");
      out.write("            <span class=\"logo navbar-slogan f-l mr-10 hidden-xs\">v1.0</span>\r\n");
      out.write("            <a aria-hidden=\"false\" class=\"nav-toggle Hui-iconfont visible-xs\" href=\"javascript:;\">&#xe667;</a>\r\n");
      out.write("            <nav class=\"nav navbar-nav\">\r\n");
      out.write("                <ul class=\"cl\">\r\n");
      out.write("                    <li class=\"dropDown dropDown_hover\"><a href=\"javascript:;\" class=\"dropDown_A\"><i class=\"Hui-iconfont\">&#xe600;</i> 新增 <i class=\"Hui-iconfont\">&#xe6d5;</i></a>\r\n");
      out.write("                        <ul class=\"dropDown-menu menu radius box-shadow\">\r\n");
      out.write("                            <li><a href=\"javascript:;\" onclick=\"item_purchase('快捷添加购入单','Purchase?oper=insert','800','500')\"><i class=\"Hui-iconfont\">&#xe616;</i> 购入单</a></li>\r\n");
      out.write("                            <li><a href=\"javascript:;\" onclick=\"item_outbound('快捷添加销售单','OutBound?oper=insert','800','700')\"><i class=\"Hui-iconfont\">&#xe613;</i> 销售单</a></li>\r\n");
      out.write("                            <li><a href=\"javascript:;\" onclick=\"item_customer('快捷添加客户','Customer?oper=insert','800','600')\"><i class=\"Hui-iconfont\">&#xe620;</i> 客户</a></li>\r\n");
      out.write("                            <li><a href=\"javascript:;\" onclick=\"item_provider('快捷添加供应商','Provider?oper=insert','800','600')\"><i class=\"Hui-iconfont\">&#xe60d;</i> 供应商</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("            <nav id=\"Hui-userbar\" class=\"nav navbar-nav navbar-userbar hidden-xs\">\r\n");
      out.write("                <ul class=\"cl\">\r\n");
      out.write("                    <li>超级管理员</li>\r\n");
      out.write("                    <li class=\"dropDown dropDown_hover\">\r\n");
      out.write("                        <a href=\"#\" class=\"dropDown_A\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" <i class=\"Hui-iconfont\">&#xe6d5;</i></a>\r\n");
      out.write("                        <ul class=\"dropDown-menu menu radius box-shadow\">\r\n");
      out.write("                            <li><a href=\"javascript:;\"\r\n");
      out.write("                                   onclick=\"myselfinfo('用户信息[id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("]',\r\n");
      out.write("                                           'User?oper=info', '700', '700')\">个人信息</a></li>\r\n");
      out.write("                            <li><a href=\"javascript:;\"\r\n");
      out.write("                                   onclick=\"resetPwd('修改密码[id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("]',\r\n");
      out.write("                                           'User?oper=reset&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&type=change', '600', '500')\">修改密码</a></li>\r\n");
      out.write("\r\n");
      out.write("                            <li><a href=\"Login?oper=logoutDeal\">退出</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li id=\"Hui-msg\"> <a href=\"#\" title=\"消息\"><span class=\"badge badge-danger\">1</span><i class=\"Hui-iconfont\" style=\"font-size:18px\">&#xe68a;</i></a> </li>\r\n");
      out.write("                    <li id=\"Hui-skin\" class=\"dropDown right dropDown_hover\"> <a href=\"javascript:;\" class=\"dropDown_A\" title=\"换肤\"><i class=\"Hui-iconfont\" style=\"font-size:18px\">&#xe62a;</i></a>\r\n");
      out.write("                        <ul class=\"dropDown-menu menu radius box-shadow\">\r\n");
      out.write("                            <li><a href=\"javascript:;\" data-val=\"default\" title=\"默认（黑色）\">默认（黑色）</a></li>\r\n");
      out.write("                            <li><a href=\"javascript:;\" data-val=\"blue\" title=\"蓝色\">蓝色</a></li>\r\n");
      out.write("                            <li><a href=\"javascript:;\" data-val=\"green\" title=\"绿色\">绿色</a></li>\r\n");
      out.write("                            <li><a href=\"javascript:;\" data-val=\"red\" title=\"红色\">红色</a></li>\r\n");
      out.write("                            <li><a href=\"javascript:;\" data-val=\"yellow\" title=\"黄色\">黄色</a></li>\r\n");
      out.write("                            <li><a href=\"javascript:;\" data-val=\"orange\" title=\"橙色\">橙色</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("<aside class=\"Hui-aside\">\r\n");
      out.write("    <div class=\"menu_dropdown bk_2\">\r\n");
      out.write("        <dl id=\"menu-admin\">\r\n");
      out.write("            <dt><i class=\"Hui-iconfont\">&#xe62d;</i>管理员管理<i class=\"Hui-iconfont menu_dropdown-arrow\">&#xe6d5;</i></dt>\r\n");
      out.write("            <dd>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a data-href=\"User?oper=list\" data-title=\"用户管理\"\r\n");
      out.write("                           href=\"javascript:void(0)\">用户管理</a></li>\r\n");
      out.write("                    <li><a data-href=\"Authority?oper=list\" data-title=\"权限管理\"\r\n");
      out.write("                           href=\"javascript:void(0)\">权限管理</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("        <dl id=\"menu-article\">\r\n");
      out.write("            <dt>\r\n");
      out.write("                <i class=\"Hui-iconfont\">&#xe616;</i> 维护基本资料<i\r\n");
      out.write("                    class=\"Hui-iconfont menu_dropdown-arrow\">&#xe6d5;</i>\r\n");
      out.write("            </dt>\r\n");
      out.write("            <dd>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a data-href=\"SalePerson?oper=list\" data-title=\"销售员资料维护\"\r\n");
      out.write("                           href=\"javascript:void(0)\">销售员资料维护</a></li>\r\n");
      out.write("                    <li><a data-href=\"Goods?oper=list\" data-title=\"商品资料维护\"\r\n");
      out.write("                           href=\"javascript:void(0)\">商品资料维护</a></li>\r\n");
      out.write("                    <li><a data-href=\"Customer?oper=list\" data-title=\"客户资料维护\"\r\n");
      out.write("                           href=\"javascript:void(0)\">客户资料维护</a></li>\r\n");
      out.write("                    <li><a data-href=\"Provider?oper=list\" data-title=\"供应商资料维护\"\r\n");
      out.write("                           href=\"javascript:void(0)\">供应商资料维护</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("        <dl id=\"menu-purchase\">\r\n");
      out.write("            <dt><i class=\"Hui-iconfont\">&#xe613;</i> 采购维护<i\r\n");
      out.write("                    class=\"Hui-iconfont menu_dropdown-arrow\">&#xe6d5;</i>\r\n");
      out.write("            </dt>\r\n");
      out.write("            <dd>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a data-href=\"Purchase?oper=list\" data-title=\"采购入库\"\r\n");
      out.write("                           href=\"javascript:void(0)\">采购入库</a></li>\r\n");
      out.write("                    <li><a data-href=\"RPurchase?oper=list\" data-title=\"采购退货\"\r\n");
      out.write("                           href=\"javascript:void(0)\">采购退货</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("\r\n");
      out.write("        <dl id=\"menu-sale\">\r\n");
      out.write("            <dt><i class=\"Hui-iconfont\">&#xe616;</i> 销售管理<i\r\n");
      out.write("                    class=\"Hui-iconfont menu_dropdown-arrow\">&#xe6d5;</i>\r\n");
      out.write("            </dt>\r\n");
      out.write("            <dd>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a data-href=\"OutBound?oper=list\" data-title=\"销售出库\"\r\n");
      out.write("                           href=\"javascript:void(0)\">销售出库</a></li>\r\n");
      out.write("                    <li><a data-href=\"SaleReturn?oper=list\" data-title=\"销售退货\"\r\n");
      out.write("                           href=\"javascript:void(0)\">销售退货</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("            </dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("        <dl id=\"menu-Stock\">\r\n");
      out.write("            <dt><i class=\"Hui-iconfont\">&#xe613;</i> 库存查询<i\r\n");
      out.write("                    class=\"Hui-iconfont menu_dropdown-arrow\">&#xe6d5;</i>\r\n");
      out.write("            </dt>\r\n");
      out.write("            <dd>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a data-href=\"GSearch?oper=form\" data-title=\"库存查询\"\r\n");
      out.write("                           href=\"javascript:void(0)\">库存查询</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("        <dl id=\"menu-download\">\r\n");
      out.write("            <dt><i class=\"Hui-iconfont\">&#xe613;</i> 资料下载<i\r\n");
      out.write("                    class=\"Hui-iconfont menu_dropdown-arrow\">&#xe6d5;</i>\r\n");
      out.write("            </dt>\r\n");
      out.write("            <dd>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a data-href=\"Download?oper=list\" data-title=\"资料下载\"\r\n");
      out.write("                           href=\"javascript:void(0)\">资料下载</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("    </div>\r\n");
      out.write("</aside>\r\n");
      out.write("<div class=\"dislpayArrow hidden-xs\"><a class=\"pngfix\" href=\"javascript:void(0);\" onClick=\"displaynavbar(this)\"></a></div>\r\n");
      out.write("<section class=\"Hui-article-box\">\r\n");
      out.write("    <div id=\"Hui-tabNav\" class=\"Hui-tabNav hidden-xs\">\r\n");
      out.write("        <div class=\"Hui-tabNav-wp\">\r\n");
      out.write("            <ul id=\"min_title_list\" class=\"acrossTab cl\">\r\n");
      out.write("                <li class=\"active\">\r\n");
      out.write("                    <span title=\"我的桌面\" data-href=\"Main?oper=Welcome\">我的桌面</span>\r\n");
      out.write("                    <em></em></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"Hui-tabNav-more btn-group\"><a id=\"js-tabNav-prev\" class=\"btn radius btn-default size-S\" href=\"javascript:;\"><i class=\"Hui-iconfont\">&#xe6d4;</i></a><a id=\"js-tabNav-next\" class=\"btn radius btn-default size-S\" href=\"javascript:;\"><i class=\"Hui-iconfont\">&#xe6d7;</i></a></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"iframe_box\" class=\"Hui-article\">\r\n");
      out.write("        <div class=\"show_iframe\">\r\n");
      out.write("            <div style=\"display:none\" class=\"loading\"></div>\r\n");
      out.write("            <iframe scrolling=\"yes\" frameborder=\"0\" src=\"Main?oper=Welcome\"></iframe>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("<div class=\"contextMenu\" id=\"Huiadminmenu\">\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li id=\"closethis\">关闭当前 </li>\r\n");
      out.write("        <li id=\"closeall\">关闭全部 </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("<!--_footer 作为公共模版分离出去-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/jquery/1.9.1/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/layer/2.4/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/static/h-ui/js/H-ui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/static/h-ui.admin/js/H-ui.admin.js\"></script> <!--/_footer 作为公共模版分离出去-->\r\n");
      out.write("\r\n");
      out.write("<!--请在下方写此页面业务相关的脚本-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/H-ui.admin/lib/jquery.contextmenu/jquery.contextmenu.r2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        if (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.type != \"0\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(") {\r\n");
      out.write("            var lis = $(\"#Hui-userbar .cl li:first\");\r\n");
      out.write("            $('#menu-admin').remove();\r\n");
      out.write("            lis.text(\"普通用户\");\r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    /*修改密码*/\r\n");
      out.write("    function resetPwd(title, url, w, h) {\r\n");
      out.write("        layer_show(title, url, w, h);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*个人信息*/\r\n");
      out.write("    function myselfinfo(title, url, w, h) {\r\n");
      out.write("        layer_show(title, url, w, h);\r\n");
      out.write("        /*layer.open({\r\n");
      out.write("            type: 1,\r\n");
      out.write("            area: ['600px','500px'],\r\n");
      out.write("            fix: false, //不固定\r\n");
      out.write("            maxmin: true,\r\n");
      out.write("            shade:0.4,\r\n");
      out.write("            title: '查看信息',\r\n");
      out.write("            content:''\r\n");
      out.write("        });*/\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*采购-添加*/\r\n");
      out.write("    function item_purchase(title,url,w,h){\r\n");
      out.write("        layer_show(title,url,w,h);\r\n");
      out.write("    }\r\n");
      out.write("    /*销售-添加*/\r\n");
      out.write("    function item_outbound(title,url,w,h){\r\n");
      out.write("        layer_show(title,url,w,h);\r\n");
      out.write("    }\r\n");
      out.write("    /*客户-添加*/\r\n");
      out.write("    function item_customer(title,url,w,h){\r\n");
      out.write("        layer_show(title,url,w,h);\r\n");
      out.write("    }\r\n");
      out.write("    /*供应商-添加*/\r\n");
      out.write("    function item_provider(title,url,w,h){\r\n");
      out.write("        layer_show(title,url,w,h);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
