package com.simoncomputing.app.jenkinssprint.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * A BaseController class that is to be the Parent Class for all other
 * Controllers. This class provides easier forward and send redirect 
 * methods.
 * 
 * @author nicholas.phillpott
 * 
 */
public class BaseController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public BaseController() {}

	/**
	 * response.sendRedirect(request.getServletContext() + target);
	 * 
	 * @param request
	 *            HttpServlerRequest.
	 * @param response
	 *            HttpServlerResponse.
	 * @param target
	 *            Desired Location.
	 */
	public void sendRedirect(HttpServletRequest request,
			HttpServletResponse response, String target) throws IOException {
		response.sendRedirect(request.getServletContext() + target);
	}

	/**
	 * request.getRequestDispatcher(target).forward(request, response);
	 * 
	 * @param request
	 *            HttpServlerRequest.
	 * @param response
	 *            HttpServlerResponse.
	 * @param target
	 *            Desired Location.
	 */
	public void forward(HttpServletRequest request,
			HttpServletResponse response, String target) throws IOException,
			ServletException {
		request.getRequestDispatcher(target).forward(request, response);
	}

}
