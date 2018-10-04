package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String account = request.getParameter("account");
		String password = request.getParameter("pwd");
		String forward = "";
		
		
		if(account.equals("11") && password.equals("11")) {
			//resp.sendRedirect(req.getContextPath() + "/html/out.jsp");
			
			
			forward = "/html/out.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
			
			
		} else {
			//resp.sendRedirect(req.getContextPath() + "/html/out2.jsp");
			
			forward = "/html/out2.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
			
			
		}
		
		//String account=request.getParameter("account");
		//String pwd=request.getParameter("pwd");
		/*System.out.println("±b¸¹:"+account);
		System.out.println("±K½X:"+pwd);
		
		request.getSession().setAttribute("account",account);
		request.getSession().setAttribute("pwd",pwd);
		
		response.sendRedirect("/OOshop/html/out.jsp");*/
	}

}
