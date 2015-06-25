package com.simoncomputing.app.jenkinssprint.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simoncomputing.app.jenkinssprint.domain.Entry;
import com.simoncomputing.app.jenkinssprint.util.Queue;
import com.simoncomputing.app.jenkinssprint.util.QueueListener;

/**
 * Servlet implementation class EntryListController
 */
@WebServlet("/entryList")
public class EntryListController extends BaseController {
	private static final long serialVersionUID = 1L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public EntryListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Queue<Entry> q = QueueListener.getQueue(); 
		q.push(new Entry("nick", "2"));
		q.push(new Entry("joe", "7"));
		request.setAttribute("queue", q);
		System.out.println(q.getSize());
		forward(request, response, "/WEB-INF/flows/entryList/entryList.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		forward(request, response, "/WEB-INF/flows/entryList/entryList.jsp");
	}

}
