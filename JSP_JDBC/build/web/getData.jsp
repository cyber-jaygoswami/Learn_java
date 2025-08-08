<%-- 
    Document   : getData
    Created on : 4 Aug, 2025, 1:56:47 PM
    Author     : cyber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Your Data :)</h1>
        
        <%!
        String url = "jdbc:mysql://localhost:3307/java_demo";
        String username = "root";
        String password = "clear2cut";
        %>
        
        <%
            
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         }catch(Exception e){
             
         }
         
         Connection con  = DriverManager.getConnection(url,username,password);
         
         String selectQuery = "select * from students;";
         PreparedStatement pr = con.prepareStatement(selectQuery);
         
         ResultSet rs =pr.executeQuery();
         
         while(rs.next()){
             int id = rs.getInt("id");
             String name = rs.getString("name");
             String stream = rs.getString("stream");
             
             out.println("ID : " + id);
             out.println("Name : " + name);
             out.println("Stream : " + stream);
             out.println("<br>");
         }
         
         
        
        
        %>
        
    </body>
</html>
