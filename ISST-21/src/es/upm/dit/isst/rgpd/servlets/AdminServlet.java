package es.upm.dit.isst.rgpd.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/*
		 * ProfessorDAO pdao = ProfessorDAOImplementation.getInstance();
		 * req.getSession().setAttribute( "professor_list", pdao.readAll() ); TFGDAO
		 * tdao = TFGDAOImplementation.getInstance(); req.getSession().setAttribute(
		 * "tfg_list", tdao.readAll() );
<<<<<<< HEAD
		 */ 
		  getServletContext().getRequestDispatcher( "/AdminView.jsp" ).forward( req,
		  resp );
=======
		 * 
		 * getServletContext().getRequestDispatcher( "/AdminView.jsp" ).forward( req,
		 * resp );
		 */
>>>>>>> c867c50a652069785c7fa49ea785a3fa9765c0ca
	}
}
