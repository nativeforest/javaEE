

<%! int computerPrice=300,mueblePrice=100,tvPrice=150,mesaPrice=50,total=0; %>


<%   
  
String computer = request.getParameter("computer");  
String mueble = request.getParameter("mueble");
String tv = request.getParameter("tv");
String mesa = request.getParameter("mesa");  
//out.print("Welcome " );  

if(computer!=null){total+=computerPrice;}
if(mueble!=null){total+=mueblePrice;}
if(tv!=null){total+=tvPrice;}
if(mesa!=null){total+=mesaPrice;}
session.setAttribute("total",total);
total=0;
pageContext.setAttribute("computer",computer,PageContext.SESSION_SCOPE);
pageContext.setAttribute("mueble",mueble,PageContext.SESSION_SCOPE);  
session.setAttribute("tv",tv);
session.setAttribute("mesa",mesa); 
//<!--  <jsp:forward page="pay.jsp" >  -->
//response.sendRedirect("pay.jsp");
%> 
<jsp:forward page="pay.jsp" />


 
 