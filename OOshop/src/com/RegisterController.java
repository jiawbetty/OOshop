package com;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        String ra = request.getParameter("raccount");
		String rp = request.getParameter("rpwd");
        String re = request.getParameter("mail");
        
        
        request.setAttribute("accountNull","f");
        request.setAttribute("accountExist","f");
        request.setAttribute("ra",ra);
        request.setAttribute("rp",rp);
        request.setAttribute("re",re);
        
        User user = new User(ra, rp, re);
        jdbcmysql sql=new jdbcmysql();
        
        request.setAttribute("searchAccount",sql.queryDB(ra));
        if (ra == "" || rp == "" ||  re == "" ) {          //欄位空          
        	request.setAttribute("accountNull","t");
            RequestDispatcher rd = request.getRequestDispatcher("/sign_up/register.jsp");
            rd.forward(request, response);
        } else if(  sql.queryDB(ra) == "true"){             //此帳戶已註冊  false->可以註冊  true->不可以註冊
        	request.setAttribute("accountExist","t");
            RequestDispatcher rd = request.getRequestDispatcher("/sign_up/register.jsp");
            rd.forward(request, response);
        }else {                              
        	  //成功註冊
        	// user = new User(ra, rp, re);
            user.signUp(user);
            RequestDispatcher rd = request.getRequestDispatcher("/sign_up/register.jsp");
            rd.forward(request, response);
        	
        }
	}

}
