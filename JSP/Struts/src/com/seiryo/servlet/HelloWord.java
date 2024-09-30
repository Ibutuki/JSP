package com.seiryo.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWord
 */
public class HelloWord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public String method(){
    	System.out.println("HelloWord");
    	return "success";
    }

}
