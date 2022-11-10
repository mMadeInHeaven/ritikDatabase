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

public class ritik extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws 
            ServletException, IOException{
    PrintWriter pw=res.getWriter();       
       res.setContentType("text/html");
    
       int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
      
      if((num1%2==0)&&(num2%2==0)){
      int sum=num1+num2;
      pw.print(sum);
      }
      else{
      pw.print(num1+" , "+num2);
      }
      
       
       
    }
  
}