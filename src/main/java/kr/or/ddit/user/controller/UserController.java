package kr.or.ddit.user.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.user.service.IuserService;
import kr.or.ddit.user.service.UserService;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/userList")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IuserService userService;
	
	@Override
	public void init() throws ServletException {
		userService = new UserService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("userList", userService.userList());
		
		request.getRequestDispatcher("/user/userList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}






