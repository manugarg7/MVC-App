package newPackage.ServletPackage;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/genericservlet")
public class GenericServletDemo extends GenericServlet {
    //we will use only service() method bcz that is abstract
    public void service(ServletRequest req, ServletResponse res) throws IOException{

        PrintWriter out=res.getWriter();
        res.setContentType("text/html");
        out.print("Generic Servlet demo");
    }

}
