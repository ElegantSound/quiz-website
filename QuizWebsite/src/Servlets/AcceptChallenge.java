package Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Message.Challenge;

/**
 * Servlet implementation class AcceptChallenge
 */
@WebServlet("/AcceptChallenge")
public class AcceptChallenge extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcceptChallenge() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getSession().getAttribute("MasterUser") == null) return;
		int challengeId = Integer.parseInt(request.getParameter("challengeId"));
		String status = request.getParameter("status");
		Challenge ch = null; // get
		ch.setStatus(status); 
		// insrt to database
		RequestDispatcher rd = request.getRequestDispatcher("Quiz?id=1" + ch.getQuizId());
		if (status.equals("Accept")) rd.forward(request, response);
	}

}
