<%@page import="java.util.*" %>
<html>
<head>
 <title> Hello World </title>
 <head>
 <body>
    <h1>hello world! </h1>
    <%! int x =10; %>

    <%
    String s="<h2>This is java</h2>";    //we need to write ;
    out.print(s);
    %>
    <%= x %>       <%//we dont need to write ; symbol %>


 </body>
</html>