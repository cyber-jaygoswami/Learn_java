
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cyber
 */
public class addNumber extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response ){
        int a = Integer.parseInt(request.getParameter("num1"));
        int b = Integer.parseInt(request.getParameter("num2"));
        
        int sum = a + b;
        
        try{
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<body>");
        out.println("<h1 align='center'> Your answer is " + sum + "</h1>");
        out.println("</body>");
        out.println("</html>");
        
        }catch(Exception e){
            
        }
        
    }
    
}
