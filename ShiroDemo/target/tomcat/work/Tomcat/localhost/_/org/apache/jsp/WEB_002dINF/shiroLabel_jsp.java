/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-15 09:42:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class shiroLabel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fhasRole_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005flacksRole_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fshiro_005flacksPermission_0026_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fhasRole_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005flacksRole_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fshiro_005flacksPermission_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fshiro_005fhasRole_0026_005fname.release();
    _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.release();
    _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname.release();
    _005fjspx_005ftagPool_005fshiro_005flacksRole_0026_005fname.release();
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.release();
    _005fjspx_005ftagPool_005fshiro_005flacksPermission_0026_005fname.release();
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'shiroLabel.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("    ");
      if (_jspx_meth_shiro_005fprincipal_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_shiro_005fhasRole_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_shiro_005fhasRole_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_shiro_005fhasAnyRoles_005f0(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_shiro_005flacksRole_005f0(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t");
      if (_jspx_meth_shiro_005fhasPermission_005f0(_jspx_page_context))
        return;
      out.write("   \r\n");
      out.write("\t");
      if (_jspx_meth_shiro_005flacksPermission_005f0(_jspx_page_context))
        return;
      out.write("   \r\n");
      out.write("  </body>\r\n");
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

  private boolean _jspx_meth_shiro_005fprincipal_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_005fprincipal_005f0 = (org.apache.shiro.web.tags.PrincipalTag) _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_005fprincipal_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fprincipal_005f0.setParent(null);
    // /WEB-INF/shiroLabel.jsp(27,4) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fprincipal_005f0.setProperty("username");
    int _jspx_eval_shiro_005fprincipal_005f0 = _jspx_th_shiro_005fprincipal_005f0.doStartTag();
    if (_jspx_th_shiro_005fprincipal_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fprincipal_0026_005fproperty_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f0);
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasRole_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasRole
    org.apache.shiro.web.tags.HasRoleTag _jspx_th_shiro_005fhasRole_005f0 = (org.apache.shiro.web.tags.HasRoleTag) _005fjspx_005ftagPool_005fshiro_005fhasRole_0026_005fname.get(org.apache.shiro.web.tags.HasRoleTag.class);
    _jspx_th_shiro_005fhasRole_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasRole_005f0.setParent(null);
    // /WEB-INF/shiroLabel.jsp(28,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasRole_005f0.setName("管理员");
    int _jspx_eval_shiro_005fhasRole_005f0 = _jspx_th_shiro_005fhasRole_005f0.doStartTag();
    if (_jspx_eval_shiro_005fhasRole_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \r\n");
        out.write("  \t\t  用户[");
        if (_jspx_meth_shiro_005fprincipal_005f1(_jspx_th_shiro_005fhasRole_005f0, _jspx_page_context))
          return true;
        out.write("]拥有角色管理员<br/>  \r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_shiro_005fhasRole_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasRole_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasRole_0026_005fname.reuse(_jspx_th_shiro_005fhasRole_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasRole_0026_005fname.reuse(_jspx_th_shiro_005fhasRole_005f0);
    return false;
  }

  private boolean _jspx_meth_shiro_005fprincipal_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_005fhasRole_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_005fprincipal_005f1 = (org.apache.shiro.web.tags.PrincipalTag) _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_005fprincipal_005f1.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fprincipal_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_005fhasRole_005f0);
    int _jspx_eval_shiro_005fprincipal_005f1 = _jspx_th_shiro_005fprincipal_005f1.doStartTag();
    if (_jspx_th_shiro_005fprincipal_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f1);
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasRole_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasRole
    org.apache.shiro.web.tags.HasRoleTag _jspx_th_shiro_005fhasRole_005f1 = (org.apache.shiro.web.tags.HasRoleTag) _005fjspx_005ftagPool_005fshiro_005fhasRole_0026_005fname.get(org.apache.shiro.web.tags.HasRoleTag.class);
    _jspx_th_shiro_005fhasRole_005f1.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasRole_005f1.setParent(null);
    // /WEB-INF/shiroLabel.jsp(31,4) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasRole_005f1.setName("普通用户");
    int _jspx_eval_shiro_005fhasRole_005f1 = _jspx_th_shiro_005fhasRole_005f1.doStartTag();
    if (_jspx_eval_shiro_005fhasRole_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \r\n");
        out.write("  \t\t  用户[");
        if (_jspx_meth_shiro_005fprincipal_005f2(_jspx_th_shiro_005fhasRole_005f1, _jspx_page_context))
          return true;
        out.write("]拥有角色admin<br/>  \r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_shiro_005fhasRole_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasRole_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasRole_0026_005fname.reuse(_jspx_th_shiro_005fhasRole_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasRole_0026_005fname.reuse(_jspx_th_shiro_005fhasRole_005f1);
    return false;
  }

  private boolean _jspx_meth_shiro_005fprincipal_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_005fhasRole_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_005fprincipal_005f2 = (org.apache.shiro.web.tags.PrincipalTag) _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_005fprincipal_005f2.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fprincipal_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_005fhasRole_005f1);
    int _jspx_eval_shiro_005fprincipal_005f2 = _jspx_th_shiro_005fprincipal_005f2.doStartTag();
    if (_jspx_th_shiro_005fprincipal_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f2);
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasAnyRoles_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasAnyRoles
    org.apache.shiro.web.tags.HasAnyRolesTag _jspx_th_shiro_005fhasAnyRoles_005f0 = (org.apache.shiro.web.tags.HasAnyRolesTag) _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname.get(org.apache.shiro.web.tags.HasAnyRolesTag.class);
    _jspx_th_shiro_005fhasAnyRoles_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasAnyRoles_005f0.setParent(null);
    // /WEB-INF/shiroLabel.jsp(35,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasAnyRoles_005f0.setName("普通用户,管理员");
    int _jspx_eval_shiro_005fhasAnyRoles_005f0 = _jspx_th_shiro_005fhasAnyRoles_005f0.doStartTag();
    if (_jspx_eval_shiro_005fhasAnyRoles_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \r\n");
        out.write("   \t 用户[");
        if (_jspx_meth_shiro_005fprincipal_005f3(_jspx_th_shiro_005fhasAnyRoles_005f0, _jspx_page_context))
          return true;
        out.write("]拥有角色admin或user<br/>  \r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_shiro_005fhasAnyRoles_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasAnyRoles_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname.reuse(_jspx_th_shiro_005fhasAnyRoles_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasAnyRoles_0026_005fname.reuse(_jspx_th_shiro_005fhasAnyRoles_005f0);
    return false;
  }

  private boolean _jspx_meth_shiro_005fprincipal_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_005fhasAnyRoles_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_005fprincipal_005f3 = (org.apache.shiro.web.tags.PrincipalTag) _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_005fprincipal_005f3.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fprincipal_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_005fhasAnyRoles_005f0);
    int _jspx_eval_shiro_005fprincipal_005f3 = _jspx_th_shiro_005fprincipal_005f3.doStartTag();
    if (_jspx_th_shiro_005fprincipal_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f3);
    return false;
  }

  private boolean _jspx_meth_shiro_005flacksRole_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:lacksRole
    org.apache.shiro.web.tags.LacksRoleTag _jspx_th_shiro_005flacksRole_005f0 = (org.apache.shiro.web.tags.LacksRoleTag) _005fjspx_005ftagPool_005fshiro_005flacksRole_0026_005fname.get(org.apache.shiro.web.tags.LacksRoleTag.class);
    _jspx_th_shiro_005flacksRole_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005flacksRole_005f0.setParent(null);
    // /WEB-INF/shiroLabel.jsp(39,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005flacksRole_005f0.setName("abc");
    int _jspx_eval_shiro_005flacksRole_005f0 = _jspx_th_shiro_005flacksRole_005f0.doStartTag();
    if (_jspx_eval_shiro_005flacksRole_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \r\n");
        out.write(" \t  \t 用户[");
        if (_jspx_meth_shiro_005fprincipal_005f4(_jspx_th_shiro_005flacksRole_005f0, _jspx_page_context))
          return true;
        out.write("]没有角色abc<br/>  \r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_shiro_005flacksRole_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005flacksRole_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005flacksRole_0026_005fname.reuse(_jspx_th_shiro_005flacksRole_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005flacksRole_0026_005fname.reuse(_jspx_th_shiro_005flacksRole_005f0);
    return false;
  }

  private boolean _jspx_meth_shiro_005fprincipal_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_005flacksRole_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_005fprincipal_005f4 = (org.apache.shiro.web.tags.PrincipalTag) _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_005fprincipal_005f4.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fprincipal_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_005flacksRole_005f0);
    int _jspx_eval_shiro_005fprincipal_005f4 = _jspx_th_shiro_005fprincipal_005f4.doStartTag();
    if (_jspx_th_shiro_005fprincipal_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f4);
    return false;
  }

  private boolean _jspx_meth_shiro_005fhasPermission_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:hasPermission
    org.apache.shiro.web.tags.HasPermissionTag _jspx_th_shiro_005fhasPermission_005f0 = (org.apache.shiro.web.tags.HasPermissionTag) _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.get(org.apache.shiro.web.tags.HasPermissionTag.class);
    _jspx_th_shiro_005fhasPermission_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fhasPermission_005f0.setParent(null);
    // /WEB-INF/shiroLabel.jsp(43,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005fhasPermission_005f0.setName("业务处理");
    int _jspx_eval_shiro_005fhasPermission_005f0 = _jspx_th_shiro_005fhasPermission_005f0.doStartTag();
    if (_jspx_eval_shiro_005fhasPermission_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \r\n");
        out.write("   \t\t 用户[");
        if (_jspx_meth_shiro_005fprincipal_005f5(_jspx_th_shiro_005fhasPermission_005f0, _jspx_page_context))
          return true;
        out.write("]拥有权限业务处理<br/>  \r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_shiro_005fhasPermission_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005fhasPermission_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fhasPermission_0026_005fname.reuse(_jspx_th_shiro_005fhasPermission_005f0);
    return false;
  }

  private boolean _jspx_meth_shiro_005fprincipal_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_005fhasPermission_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_005fprincipal_005f5 = (org.apache.shiro.web.tags.PrincipalTag) _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_005fprincipal_005f5.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fprincipal_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_005fhasPermission_005f0);
    int _jspx_eval_shiro_005fprincipal_005f5 = _jspx_th_shiro_005fprincipal_005f5.doStartTag();
    if (_jspx_th_shiro_005fprincipal_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f5);
    return false;
  }

  private boolean _jspx_meth_shiro_005flacksPermission_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:lacksPermission
    org.apache.shiro.web.tags.LacksPermissionTag _jspx_th_shiro_005flacksPermission_005f0 = (org.apache.shiro.web.tags.LacksPermissionTag) _005fjspx_005ftagPool_005fshiro_005flacksPermission_0026_005fname.get(org.apache.shiro.web.tags.LacksPermissionTag.class);
    _jspx_th_shiro_005flacksPermission_005f0.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005flacksPermission_005f0.setParent(null);
    // /WEB-INF/shiroLabel.jsp(46,1) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_shiro_005flacksPermission_005f0.setName("org:create");
    int _jspx_eval_shiro_005flacksPermission_005f0 = _jspx_th_shiro_005flacksPermission_005f0.doStartTag();
    if (_jspx_eval_shiro_005flacksPermission_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \r\n");
        out.write("    \t用户[");
        if (_jspx_meth_shiro_005fprincipal_005f6(_jspx_th_shiro_005flacksPermission_005f0, _jspx_page_context))
          return true;
        out.write("]没有权限org:create<br/>  \r\n");
        out.write("\t");
        int evalDoAfterBody = _jspx_th_shiro_005flacksPermission_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_shiro_005flacksPermission_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005flacksPermission_0026_005fname.reuse(_jspx_th_shiro_005flacksPermission_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005flacksPermission_0026_005fname.reuse(_jspx_th_shiro_005flacksPermission_005f0);
    return false;
  }

  private boolean _jspx_meth_shiro_005fprincipal_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_shiro_005flacksPermission_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  shiro:principal
    org.apache.shiro.web.tags.PrincipalTag _jspx_th_shiro_005fprincipal_005f6 = (org.apache.shiro.web.tags.PrincipalTag) _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.get(org.apache.shiro.web.tags.PrincipalTag.class);
    _jspx_th_shiro_005fprincipal_005f6.setPageContext(_jspx_page_context);
    _jspx_th_shiro_005fprincipal_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_shiro_005flacksPermission_005f0);
    int _jspx_eval_shiro_005fprincipal_005f6 = _jspx_th_shiro_005fprincipal_005f6.doStartTag();
    if (_jspx_th_shiro_005fprincipal_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fshiro_005fprincipal_005fnobody.reuse(_jspx_th_shiro_005fprincipal_005f6);
    return false;
  }
}