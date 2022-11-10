/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Pack;



/**
 *
 * @author Ritik Sharma
 */


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


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
public class RevStr extends HttpServlet{
      
    

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
     
       PrintWriter pw=res.getWriter();       
       res.setContentType("text/html");
       
       String str = req.getParameter("str");
      String nstr="";
      char ch;
      for(int i=0;i<str.length();i++){
      ch=str.charAt(i);
      nstr=ch+nstr;
      
      }pw.print("the reverse of string is: "+nstr);
       
       
     
        
      
    }

        
    }

