/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-14 15:08:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/themes/default/easyui.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/themes/icon.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/jquery.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"/js/jquery.easyui.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\">\r\n");
      out.write("<div data-options=\"region:'west',title:'菜单',split:true,minWidth:200\" style=\"width:100px;\">\r\n");
      out.write("    <ul id=\"tt\" class=\"easyui-tree\">\r\n");
      out.write("        <li>\r\n");
      out.write("            <span>商品分类管理</span>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li data-options=\"attributes:{'url':'product_cat_list'}\">商品分类列表</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <span>商品管理</span>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li data-options=\"attributes:{'url':'product_list'}\">商品列表</li>\r\n");
      out.write("                <li data-options=\"attributes:{'url':'product_add'}\">商品添加</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("<div data-options=\"region:'center',\" style=\"padding:5px;background:#eee;\">\r\n");
      out.write("    <div id=\"tabs\" class=\"easyui-tabs\">\r\n");
      out.write("        <div title=\"首页\" style=\"padding:20px;display:none;\">\r\n");
      out.write("            首页\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $('#tt').tree({\r\n");
      out.write("        onClick: function(node){\r\n");
      out.write("            var tabs=$(\"#tabs\");\r\n");
      out.write("            var tab=tabs.tabs(\"getTab\",node.text);\r\n");
      out.write("\r\n");
      out.write("            if (tab){\r\n");
      out.write("                tabs.tabs(\"select\",node.text)\r\n");
      out.write("            } else {\r\n");
      out.write("            \r\n");
      out.write("            // 添加一个新的标签页面板（tab panel）\r\n");
      out.write("            tabs.tabs('add',{\r\n");
      out.write("                title:node.text,\r\n");
      out.write("                content:'Tab Body',\r\n");
      out.write("                href:node.attributes.url,\r\n");
      out.write("                closable:true,\r\n");
      out.write("            });\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
