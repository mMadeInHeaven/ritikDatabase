/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet;

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

public class Mul extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws 
            ServletException, IOException{
    PrintWriter pw=res.getWriter();       
       res.setContentType("text/html");
    
       int firstNumber = Integer.parseInt(req.getParameter("firstnumber"));
       int mult=1;
       for(int i=1;i<=10;i++){
       pw.print(firstNumber+"*"+i+"="+firstNumber*i);
       pw.print("\n");
       }
    
       
    }
  
}