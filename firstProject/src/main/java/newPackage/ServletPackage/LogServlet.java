package newPackage.ServletPackage;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LogServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        PrintWriter out=res.getWriter();
        res.setContentType("text/html");
       String name =req.getParameter("nm");  //s is by default from intelli
        String password =req.getParameter("pwd");  //pwd id given in form
        if(name.equals("abc")&& password.equals("123"))
        {
             res.sendRedirect("home.html");
        }
        else
        {
           res.sendRedirect("login.html");
        }


    }



}
