package com.edu.seiryo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.edu.seiryo.entity.Users;
import com.edu.seiryo.service.UserService;
import com.edu.seiryo.service.imp.UserServiceImp;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserService service = new UserServiceImp();
    boolean ifLogin = false;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String action = request.getParameter("action");
		if("register".equals(action)){
			String account = request.getParameter("account");
			String pwd = request.getParameter("pwd");
			String sex = request.getParameter("sex");
			String email = request.getParameter("email");
			Users user = new Users();
			user.setAccount(account);
			user.setPassword(pwd);
			user.setSex(sex);
			user.setEmail(email);
			boolean bo = service.saveRegister(user);
			if(bo){
				request.getRequestDispatcher("login.jsp").forward(request, response);
				return;
			}
			request.getRequestDispatcher("register.jsp").forward(request, response);;
		}else if("login".equals(action)){
			String account = request.getParameter("account");
			String pwd = request.getParameter("pwd");
			boolean bo = service.loginQuery(account, pwd);
			if(!bo){
				request.setAttribute("msg", "用户名或密码错误");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				return;
			}
			List<Users> list = service.queryAll();
			request.setAttribute("list", list);
			request.getRequestDispatcher("main.jsp").forward(request, response);
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	

}
