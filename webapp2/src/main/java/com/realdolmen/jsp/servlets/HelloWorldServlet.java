package com.realdolmen.jsp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.realdolmen.jsp.model.Person;

@WebServlet(value="/hello",loadOnStartup=1,initParams={@WebInitParam (name="message",value="Hello, this is the servlet")})
public class HelloWorldServlet extends HttpServlet {

	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		String message = config.getInitParameter("message");
		System.out.println("Servlet started with message: "+ message);
	}
 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		String address = "/WEB-INF/views/Index.jsp";
		String action = req.getParameter("action");
		
		if(isFilledIn(action)){	
			if (isFilledIn(name) && action.equals("send")) {
				
				req.setAttribute("person", new Person(name));
				address="/WEB-INF/views/Result.jsp";
			} else {
				req.setAttribute("error", "error.name.empty");
				address="/WEB-INF/views/Index.jsp";
			}
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher(address);
		dispatcher.forward(req, resp);

	}
	private boolean isFilledIn(String name) {
		return name != null && !name.trim().equals("");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
