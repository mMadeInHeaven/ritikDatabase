/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
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

public class oddoreven extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws 
            ServletException, IOException{
    PrintWriter pw=res.getWriter();       
       res.setContentType("text/html");
    
       int num = Integer.parseInt(req.getParameter("num"));
       
      
      if(num==0){
          pw.print("this is neither even nor odd");
            }
      else if((num%2)==0){
      
      pw.print(num+" is obviously even Apapa");}
      else{
      pw.print(num+" is odd");
      }
      
       
       
    }
  
}