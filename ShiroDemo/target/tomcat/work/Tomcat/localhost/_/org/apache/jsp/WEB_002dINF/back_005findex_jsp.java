/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-09-15 09:47:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class back_005findex_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Shiro Demo</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<!-- <link rel=\"icon\" type=\"image/ico\"\r\n");
      out.write("\thref=\"http://tattek.com/minimal/assets/images/favicon.ico\" /> -->\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link href=\"/staticfile/assets/css/vendor/bootstrap/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/staticfile/assets/css/vendor/animate/animate.min.css\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" media=\"all\"\r\n");
      out.write("\thref=\"/staticfile/assets/js/vendor/mmenu/css/jquery.mmenu.all.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"/staticfile/assets/js/vendor/videobackground/css/jquery.videobackground.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/staticfile/assets/css/vendor/bootstrap-checkbox.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"/staticfile/assets/js/vendor/rickshaw/css/rickshaw.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/staticfile/assets/js/vendor/morris/css/morris.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/staticfile/assets/js/vendor/tabdrop/css/tabdrop.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"/staticfile/assets/js/vendor/summernote/css/summernote.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"/staticfile/assets/js/vendor/summernote/css/summernote-bs3.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/staticfile/assets/js/vendor/chosen/css/chosen.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"/staticfile/assets/js/vendor/chosen/css/chosen-bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"/staticfile/assets/css/minimal.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"bg-1\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Preloader -->\r\n");
      out.write("\t<div class=\"mask\">\r\n");
      out.write("\t\t<div id=\"loader\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!--/Preloader -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- Wrap all page content here -->\r\n");
      out.write("\t<div id=\"wrap\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Make page fluid -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Fixed navbar -->\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "common.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t<!-- Fixed navbar end -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Page content -->\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<!-- Page content end -->\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- Make page fluid-->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Wrap all page content end -->\r\n");
      out.write("\t<section class=\"videocontent\" id=\"video\"></section>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/jquery.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/vendor/bootstrap/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/staticfile/assets/js/vendor/mmenu/js/jquery.mmenu.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/staticfile/assets/js/vendor/sparkline/jquery.sparkline.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/staticfile/assets/js/vendor/nicescroll/jquery.nicescroll.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/staticfile/assets/js/vendor/animate-numbers/jquery.animateNumbers.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/staticfile/assets/js/vendor/videobackground/jquery.videobackground.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/staticfile/assets/js/vendor/blockui/jquery.blockUI.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/vendor/flot/jquery.flot.min.js\"></script>\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/vendor/flot/jquery.flot.time.min.js\"></script>\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/vendor/flot/jquery.flot.selection.min.js\"></script>\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/vendor/flot/jquery.flot.animator.min.js\"></script>\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/vendor/flot/jquery.flot.orderBars.js\"></script>\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/vendor/easypiechart/jquery.easypiechart.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/vendor/rickshaw/raphael-min.js\"></script>\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/vendor/rickshaw/d3.v2.js\"></script>\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/vendor/rickshaw/rickshaw.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/vendor/morris/morris.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/vendor/tabdrop/bootstrap-tabdrop.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/vendor/summernote/summernote.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/vendor/chosen/chosen.jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"/staticfile/assets/js/minimal.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t// Initialize card flip\r\n");
      out.write("\t\t\t$('.card.hover').hover(function() {\r\n");
      out.write("\t\t\t\t$(this).addClass('flip');\r\n");
      out.write("\t\t\t}, function() {\r\n");
      out.write("\t\t\t\t$(this).removeClass('flip');\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t// Initialize flot chart\r\n");
      out.write("\t\t\tvar d1 = [ [ 1, 715 ], [ 2, 985 ], [ 3, 1525 ], [ 4, 1254 ],\r\n");
      out.write("\t\t\t\t\t[ 5, 1861 ], [ 6, 2621 ], [ 7, 1987 ], [ 8, 2136 ],\r\n");
      out.write("\t\t\t\t\t[ 9, 2364 ], [ 10, 2851 ], [ 11, 1546 ], [ 12, 2541 ] ];\r\n");
      out.write("\t\t\tvar d2 = [ [ 1, 463 ], [ 2, 578 ], [ 3, 327 ], [ 4, 984 ],\r\n");
      out.write("\t\t\t\t\t[ 5, 1268 ], [ 6, 1684 ], [ 7, 1425 ], [ 8, 1233 ],\r\n");
      out.write("\t\t\t\t\t[ 9, 1354 ], [ 10, 1200 ], [ 11, 1260 ], [ 12, 1320 ] ];\r\n");
      out.write("\t\t\tvar months = [ \"January\", \"February\", \"March\", \"April\", \"May\",\r\n");
      out.write("\t\t\t\t\t\"Juny\", \"July\", \"August\", \"September\", \"October\",\r\n");
      out.write("\t\t\t\t\t\"November\", \"December\" ];\r\n");
      out.write("\r\n");
      out.write("\t\t\t// flot chart generate\r\n");
      out.write("\t\t\tvar plot = $.plotAnimator($(\"#statistics-chart\"), [ {\r\n");
      out.write("\t\t\t\tlabel : 'Sales',\r\n");
      out.write("\t\t\t\tdata : d1,\r\n");
      out.write("\t\t\t\tlines : {\r\n");
      out.write("\t\t\t\t\tlineWidth : 3\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tshadowSize : 0,\r\n");
      out.write("\t\t\t\tcolor : '#ffffff'\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tlabel : \"Visits\",\r\n");
      out.write("\t\t\t\tdata : d2,\r\n");
      out.write("\t\t\t\tanimator : {\r\n");
      out.write("\t\t\t\t\tsteps : 99,\r\n");
      out.write("\t\t\t\t\tduration : 500,\r\n");
      out.write("\t\t\t\t\tstart : 200,\r\n");
      out.write("\t\t\t\t\tdirection : \"right\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tlines : {\r\n");
      out.write("\t\t\t\t\tfill : .15,\r\n");
      out.write("\t\t\t\t\tlineWidth : 0\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tcolor : [ '#ffffff' ]\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tlabel : 'Sales',\r\n");
      out.write("\t\t\t\tdata : d1,\r\n");
      out.write("\t\t\t\tpoints : {\r\n");
      out.write("\t\t\t\t\tshow : true,\r\n");
      out.write("\t\t\t\t\tfill : true,\r\n");
      out.write("\t\t\t\t\tradius : 6,\r\n");
      out.write("\t\t\t\t\tfillColor : \"rgba(0,0,0,.5)\",\r\n");
      out.write("\t\t\t\t\tlineWidth : 2\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tcolor : '#fff',\r\n");
      out.write("\t\t\t\tshadowSize : 0\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\tlabel : \"Visits\",\r\n");
      out.write("\t\t\t\tdata : d2,\r\n");
      out.write("\t\t\t\tpoints : {\r\n");
      out.write("\t\t\t\t\tshow : true,\r\n");
      out.write("\t\t\t\t\tfill : true,\r\n");
      out.write("\t\t\t\t\tradius : 6,\r\n");
      out.write("\t\t\t\t\tfillColor : \"rgba(255,255,255,.2)\",\r\n");
      out.write("\t\t\t\t\tlineWidth : 2\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tcolor : '#fff',\r\n");
      out.write("\t\t\t\tshadowSize : 0\r\n");
      out.write("\t\t\t} ], {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\txaxis : {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\ttickLength : 0,\r\n");
      out.write("\t\t\t\t\ttickDecimals : 0,\r\n");
      out.write("\t\t\t\t\tmin : 1,\r\n");
      out.write("\t\t\t\t\tticks : [ [ 1, \"JAN\" ], [ 2, \"FEB\" ], [ 3, \"MAR\" ],\r\n");
      out.write("\t\t\t\t\t\t\t[ 4, \"APR\" ], [ 5, \"MAY\" ], [ 6, \"JUN\" ],\r\n");
      out.write("\t\t\t\t\t\t\t[ 7, \"JUL\" ], [ 8, \"AUG\" ], [ 9, \"SEP\" ],\r\n");
      out.write("\t\t\t\t\t\t\t[ 10, \"OCT\" ], [ 11, \"NOV\" ], [ 12, \"DEC\" ] ],\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tfont : {\r\n");
      out.write("\t\t\t\t\t\tlineHeight : 24,\r\n");
      out.write("\t\t\t\t\t\tweight : \"300\",\r\n");
      out.write("\t\t\t\t\t\tcolor : \"#ffffff\",\r\n");
      out.write("\t\t\t\t\t\tsize : 14\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tyaxis : {\r\n");
      out.write("\t\t\t\t\tticks : 4,\r\n");
      out.write("\t\t\t\t\ttickDecimals : 0,\r\n");
      out.write("\t\t\t\t\ttickColor : \"rgba(255,255,255,.3)\",\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tfont : {\r\n");
      out.write("\t\t\t\t\t\tlineHeight : 13,\r\n");
      out.write("\t\t\t\t\t\tweight : \"300\",\r\n");
      out.write("\t\t\t\t\t\tcolor : \"#ffffff\"\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tgrid : {\r\n");
      out.write("\t\t\t\t\tborderWidth : {\r\n");
      out.write("\t\t\t\t\t\ttop : 0,\r\n");
      out.write("\t\t\t\t\t\tright : 0,\r\n");
      out.write("\t\t\t\t\t\tbottom : 1,\r\n");
      out.write("\t\t\t\t\t\tleft : 1\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tborderColor : 'rgba(255,255,255,.3)',\r\n");
      out.write("\t\t\t\t\tmargin : 0,\r\n");
      out.write("\t\t\t\t\tminBorderMargin : 0,\r\n");
      out.write("\t\t\t\t\tlabelMargin : 20,\r\n");
      out.write("\t\t\t\t\thoverable : true,\r\n");
      out.write("\t\t\t\t\tclickable : true,\r\n");
      out.write("\t\t\t\t\tmouseActiveRadius : 6\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tlegend : {\r\n");
      out.write("\t\t\t\t\tshow : false\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(window).resize(function() {\r\n");
      out.write("\t\t\t\t// redraw the graph in the correctly sized div\r\n");
      out.write("\t\t\t\tplot.resize();\r\n");
      out.write("\t\t\t\tplot.setupGrid();\r\n");
      out.write("\t\t\t\tplot.draw();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t$('#mmenu').on(\"opened.mm\", function() {\r\n");
      out.write("\t\t\t\t// redraw the graph in the correctly sized div\r\n");
      out.write("\t\t\t\tplot.resize();\r\n");
      out.write("\t\t\t\tplot.setupGrid();\r\n");
      out.write("\t\t\t\tplot.draw();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t$('#mmenu').on(\"closed.mm\", function() {\r\n");
      out.write("\t\t\t\t// redraw the graph in the correctly sized div\r\n");
      out.write("\t\t\t\tplot.resize();\r\n");
      out.write("\t\t\t\tplot.setupGrid();\r\n");
      out.write("\t\t\t\tplot.draw();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t// tooltips showing\r\n");
      out.write("\t\t\t$(\"#statistics-chart\").bind(\r\n");
      out.write("\t\t\t\t\t\"plothover\",\r\n");
      out.write("\t\t\t\t\tfunction(event, pos, item) {\r\n");
      out.write("\t\t\t\t\t\tif (item) {\r\n");
      out.write("\t\t\t\t\t\t\tvar x = item.datapoint[0], y = item.datapoint[1];\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#tooltip\").html(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t'<h1 style=\"color: #418bca\">'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ months[x - 1] + '</h1>'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ '<strong>' + y + '</strong>'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t+ ' ' + item.series.label).css({\r\n");
      out.write("\t\t\t\t\t\t\t\ttop : item.pageY - 30,\r\n");
      out.write("\t\t\t\t\t\t\t\tleft : item.pageX + 5\r\n");
      out.write("\t\t\t\t\t\t\t}).fadeIn(200);\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#tooltip\").hide();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t//tooltips options\r\n");
      out.write("\t\t\t$(\"<div id='tooltip'></div>\").css({\r\n");
      out.write("\t\t\t\tposition : \"absolute\",\r\n");
      out.write("\t\t\t\t//display: \"none\",\r\n");
      out.write("\t\t\t\tpadding : \"10px 20px\",\r\n");
      out.write("\t\t\t\t\"background-color\" : \"#ffffff\",\r\n");
      out.write("\t\t\t\t\"z-index\" : \"99999\"\r\n");
      out.write("\t\t\t}).appendTo(\"body\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t//generate actual pie charts\r\n");
      out.write("\t\t\t$('.pie-chart').easyPieChart();\r\n");
      out.write("\r\n");
      out.write("\t\t\t//server load rickshaw chart\r\n");
      out.write("\t\t\tvar graph;\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar seriesData = [ [], [] ];\r\n");
      out.write("\t\t\tvar random = new Rickshaw.Fixtures.RandomData(50);\r\n");
      out.write("\r\n");
      out.write("\t\t\tfor (var i = 0; i < 50; i++) {\r\n");
      out.write("\t\t\t\trandom.addData(seriesData);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\tgraph = new Rickshaw.Graph({\r\n");
      out.write("\t\t\t\telement : document.querySelector(\"#serverload-chart\"),\r\n");
      out.write("\t\t\t\theight : 150,\r\n");
      out.write("\t\t\t\trenderer : 'area',\r\n");
      out.write("\t\t\t\tseries : [ {\r\n");
      out.write("\t\t\t\t\tdata : seriesData[0],\r\n");
      out.write("\t\t\t\t\tcolor : '#6e6e6e',\r\n");
      out.write("\t\t\t\t\tname : 'File Server'\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tdata : seriesData[1],\r\n");
      out.write("\t\t\t\t\tcolor : '#fff',\r\n");
      out.write("\t\t\t\t\tname : 'Mail Server'\r\n");
      out.write("\t\t\t\t} ]\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar hoverDetail = new Rickshaw.Graph.HoverDetail({\r\n");
      out.write("\t\t\t\tgraph : graph,\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\tsetInterval(function() {\r\n");
      out.write("\t\t\t\trandom.removeData(seriesData);\r\n");
      out.write("\t\t\t\trandom.addData(seriesData);\r\n");
      out.write("\t\t\t\tgraph.update();\r\n");
      out.write("\r\n");
      out.write("\t\t\t}, 1000);\r\n");
      out.write("\r\n");
      out.write("\t\t\t// Morris donut chart\r\n");
      out.write("\t\t\tMorris.Donut({\r\n");
      out.write("\t\t\t\telement : 'browser-usage',\r\n");
      out.write("\t\t\t\tdata : [ {\r\n");
      out.write("\t\t\t\t\tlabel : \"Chrome\",\r\n");
      out.write("\t\t\t\t\tvalue : 25\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tlabel : \"Safari\",\r\n");
      out.write("\t\t\t\t\tvalue : 20\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tlabel : \"Firefox\",\r\n");
      out.write("\t\t\t\t\tvalue : 15\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tlabel : \"Opera\",\r\n");
      out.write("\t\t\t\t\tvalue : 5\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tlabel : \"Internet Explorer\",\r\n");
      out.write("\t\t\t\t\tvalue : 10\r\n");
      out.write("\t\t\t\t}, {\r\n");
      out.write("\t\t\t\t\tlabel : \"Other\",\r\n");
      out.write("\t\t\t\t\tvalue : 25\r\n");
      out.write("\t\t\t\t} ],\r\n");
      out.write("\t\t\t\tcolors : [ '#00a3d8', '#2fbbe8', '#72cae7', '#d9544f',\r\n");
      out.write("\t\t\t\t\t\t'#ffc100', '#1693A5' ]\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t$('#browser-usage').find(\"path[stroke='#ffffff']\").attr('stroke',\r\n");
      out.write("\t\t\t\t\t'rgba(0,0,0,0)');\r\n");
      out.write("\r\n");
      out.write("\t\t\t//sparkline charts\r\n");
      out.write("\t\t\t$('#projectbar1').sparkline('html', {\r\n");
      out.write("\t\t\t\ttype : 'bar',\r\n");
      out.write("\t\t\t\tbarColor : '#22beef',\r\n");
      out.write("\t\t\t\tbarWidth : 4,\r\n");
      out.write("\t\t\t\theight : 20\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('#projectbar2').sparkline('html', {\r\n");
      out.write("\t\t\t\ttype : 'bar',\r\n");
      out.write("\t\t\t\tbarColor : '#cd97eb',\r\n");
      out.write("\t\t\t\tbarWidth : 4,\r\n");
      out.write("\t\t\t\theight : 20\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('#projectbar3').sparkline('html', {\r\n");
      out.write("\t\t\t\ttype : 'bar',\r\n");
      out.write("\t\t\t\tbarColor : '#a2d200',\r\n");
      out.write("\t\t\t\tbarWidth : 4,\r\n");
      out.write("\t\t\t\theight : 20\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('#projectbar4').sparkline('html', {\r\n");
      out.write("\t\t\t\ttype : 'bar',\r\n");
      out.write("\t\t\t\tbarColor : '#ffc100',\r\n");
      out.write("\t\t\t\tbarWidth : 4,\r\n");
      out.write("\t\t\t\theight : 20\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('#projectbar5').sparkline('html', {\r\n");
      out.write("\t\t\t\ttype : 'bar',\r\n");
      out.write("\t\t\t\tbarColor : '#ff4a43',\r\n");
      out.write("\t\t\t\tbarWidth : 4,\r\n");
      out.write("\t\t\t\theight : 20\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('#projectbar6').sparkline('html', {\r\n");
      out.write("\t\t\t\ttype : 'bar',\r\n");
      out.write("\t\t\t\tbarColor : '#a2d200',\r\n");
      out.write("\t\t\t\tbarWidth : 4,\r\n");
      out.write("\t\t\t\theight : 20\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t// sortable table\r\n");
      out.write("\t\t\t$('.table.table-sortable th.sortable').click(\r\n");
      out.write("\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\tvar o = $(this).hasClass('sort-asc') ? 'sort-desc'\r\n");
      out.write("\t\t\t\t\t\t\t\t: 'sort-asc';\r\n");
      out.write("\t\t\t\t\t\t$('th.sortable').removeClass('sort-asc').removeClass(\r\n");
      out.write("\t\t\t\t\t\t\t\t'sort-desc');\r\n");
      out.write("\t\t\t\t\t\t$(this).addClass(o);\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t//todo's\r\n");
      out.write("\t\t\t$('#todolist li label').click(function() {\r\n");
      out.write("\t\t\t\t$(this).toggleClass('done');\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t// Initialize tabDrop\r\n");
      out.write("\t\t\t$('.tabdrop').tabdrop({\r\n");
      out.write("\t\t\t\ttext : '<i class=\"fa fa-th-list\"></i>'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t//load wysiwyg editor\r\n");
      out.write("\t\t\t$('#quick-message-content').summernote(\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\ttoolbar : [\r\n");
      out.write("\t\t\t\t\t\t\t\t//['style', ['style']], // no style button\r\n");
      out.write("\t\t\t\t\t\t\t\t[\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t'style',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t[ 'bold', 'italic', 'underline',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t'clear' ] ],\r\n");
      out.write("\t\t\t\t\t\t\t\t[ 'fontsize', [ 'fontsize' ] ],\r\n");
      out.write("\t\t\t\t\t\t\t\t[ 'color', [ 'color' ] ],\r\n");
      out.write("\t\t\t\t\t\t\t\t[ 'para', [ 'ul', 'ol', 'paragraph' ] ],\r\n");
      out.write("\t\t\t\t\t\t\t\t[ 'height', [ 'height' ] ],\r\n");
      out.write("\t\t\t\t\t\t//['insert', ['picture', 'link']], // no insert buttons\r\n");
      out.write("\t\t\t\t\t\t//['table', ['table']], // no table button\r\n");
      out.write("\t\t\t\t\t\t//['help', ['help']] //no help button\r\n");
      out.write("\t\t\t\t\t\t],\r\n");
      out.write("\t\t\t\t\t\theight : 143\r\n");
      out.write("\t\t\t\t\t//set editable area's height\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t//multiselect input\r\n");
      out.write("\t\t\t$(\".chosen-select\").chosen({\r\n");
      out.write("\t\t\t\tdisable_search_threshold : 10\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
