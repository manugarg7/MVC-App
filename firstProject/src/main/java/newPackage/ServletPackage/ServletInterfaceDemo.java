package newPackage.ServletPackage;

import javax.jws.WebService;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

//alt+enter to enter import
@WebServlet("/helloservlet")   //when user enter helloservlet it will run this servlet code
public class ServletInterfaceDemo implements Servlet {

  ServletConfig config;

  public void init(ServletConfig config)
  {
      this.config=config;
      System.out.println("init method called");
  }

  public void service(ServletRequest req, ServletResponse res) throws IOException
  {
      System.out.println("Service method called"); //prints in console
      PrintWriter out=res.getWriter();  //to send data to the client
                          //printwriter de object to hi data send hunda

      res.setContentType("text/html"); //to tell the client which type data is sending
      out.println("Hello world");
  }
  public void destroy()
  {
      System.out.println("destroy method called"); //prints in console

  }
  public ServletConfig getServletConfig()
  {
      return config;
  }
  public String getServletInfo()
  {
      return "Implementing servlet interface";
  }

}
