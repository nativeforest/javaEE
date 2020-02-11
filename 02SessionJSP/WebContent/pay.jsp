<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="bean.ArticleBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<header>
    <h1>Training</h1>
    <nav>
      <ul>
        <li><a href="#stealth">Stealth &amp; Agility</a></li>
        <li><a href="#combat">Combat</a></li>
        <li><a href="#weapons">Weapons</a></li>
      </ul>
    </nav>
  </header>

<jsp:useBean id = "article2" class = "bean.ArticleBean" /> 

<jsp:setProperty name = "article2" property = "product" value = "mesa" />
<jsp:setProperty name = "article2" property = "price" value ="237" />


<jsp:useBean id = "article1" class = "bean.ArticleBean" /> 

<jsp:setProperty name = "article1" property = "product" value = "lavadora" />
<jsp:setProperty name = "article1" property = "price" value ="133" />

<jsp:getProperty name = "article1" property = "product" />

<table border="1">
<tr>
	<td>${article1.product}</td>
	<td>${article1.price}</td>
</tr>
<tr>
	<td>${article2.product}</td>
	<td>${article2.price}</td>
</tr>
</table>





<div style="margin:200px;">
<p>Hi...</p>
<%   //todo use a list here o use a for with tr from a controller list method
 //List <ArticleBean> ArticleBeanList = new ArrayList<ArticleBean>();
//String p = article1.getProduct();
//out.print(p);
int total=(int)session.getAttribute("total");
String tv=(String)session.getAttribute("tv");
String mesa=(String)session.getAttribute("mesa");

String mueble=(String)pageContext.getAttribute("mueble",PageContext.SESSION_SCOPE);  
String computer =(String)pageContext.getAttribute("computer",PageContext.SESSION_SCOPE);  

//ArticleBean AarticleBean  = new ArticleBean();




out.print("<h1>Welcome pay</h1> <br>" );
%>
<%@ include file= "date.jsp" %>  
<%
//out.print(mesa+tv+mueble+computer );

if(computer!=null){
	out.print("<p>"+computer+"</p><br>" );
}
if(mueble!=null){
	out.print("<p>"+mueble+"</p><br>" );
}
if(tv!=null){out.print("<p>"+tv+"</p><br>" );}

if(mesa!=null){out.print("<p>"+mesa+"</p><br>" );}

%>

<h3 style="background-color:green">total: <%= total %>  </h3>

  
  </div>

</body>
</html>