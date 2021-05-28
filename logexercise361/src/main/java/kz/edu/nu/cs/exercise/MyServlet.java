package kz.edu.nu.cs.exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/myservlet" })
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
     static ArrayList<String> liste = new ArrayList<String>();
    	
     
    
    public MyServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	PrintWriter out = response.getWriter ();
    	
    	java.util.Date date=new java.util.Date();   
    	liste.add(request.getRemoteHost() + " ");
//    	liste.add(request.getContextPath() + " ");
    	liste.add(request.getRequestURL().toString() + " ");
    	liste.add(date.toString() + "\n");

    	int  i;
    	for( i = 0; i < liste.size(); i++) {
    		out.append(liste.get(i));
    	}
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	 
    	doGet(request, response);
        
        
    }
}
