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

public class simpleint extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws 
            ServletException, IOException{
    PrintWriter pw=res.getWriter();       
       res.setContentType("text/html");
    
       int principle = Integer.parseInt(req.getParameter("principle"));
       int time = Integer.parseInt(req.getParameter("time"));
       int rate = Integer.parseInt(req.getParameter("rate"));
      
       double si=(principle*time*rate)/100;
       pw.print(si);
       
       
    }
  
}