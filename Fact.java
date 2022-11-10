
package Pack;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ritik Sharma
 */
public class Fact extends HttpServlet{
      
    

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
     
       PrintWriter pw=res.getWriter();       
       res.setContentType("text/html");
       
      
      int posnum1=Integer.parseInt(req.getParameter("posint"));
      
      int fact=1;
      for(int i=1;i<=posnum1;i++){
      fact=fact*i;
      }
      pw.print(fact);
       
     
        
      
    }

        
    }

