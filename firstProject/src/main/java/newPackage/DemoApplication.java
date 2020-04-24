package newPackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication  // is to pta lgda b ae class main class aa
@ServletComponentScan   // it wil search the servlet we hAVE made @webservlet serch krda
public class DemoApplication {
    public static void main(String...x)
    {
        SpringApplication.run(DemoApplication.class,x);
    }


}
