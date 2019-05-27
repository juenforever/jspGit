package kr.or.ddit.login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.user.model.UserVo;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	//사용자 로그인 화면 요청 처리
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getSession().getAttribute("USER_INFO") != null)
			request.getRequestDispatcher("/main.jsp").forward(request, response);
		else
			request.getRequestDispatcher("/login/login.jsp").forward(request, response);
	}

	//로그인 요청을 처리
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");
		
		
		//사용자 아이디 brown, 비밀번호가 brown1234일때 정상 사용자라고 인식
		if(userId.equals("brown") && password.equals("brown1234")){
			
			
			HttpSession session = request.getSession();
			session.setAttribute("USER_INFO", new UserVo("브라운", "brown", "곰"));
			
			RequestDispatcher rd = request.getRequestDispatcher("/main.jsp");
			rd.forward(request, response);
		}
		else{
			
			response.sendRedirect(request.getContextPath() + "/login");
		}
		
	}
}


