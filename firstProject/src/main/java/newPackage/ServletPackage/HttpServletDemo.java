package newPackage.ServletPackage;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/httpservlet")
public class HttpServletDemo extends HttpServlet {
    // HttpServlet use to create servlet
    //httpServlet extends GenricServlet

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        PrintWriter out=res.getWriter();
        res.setContentType("text/html");  //to tell  client  what type of data we are sending'
        out.print("http servelet demo : get");
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        PrintWriter out=res.getWriter();
        res.setContentType("text/html");
        out.print("http servelet demo : Post");
    }




}
