package it.davincifascetti.quintainfa.bianchi.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import it.davincifascetti.quintainfa.bianchi.model.*;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = -5841457595585679844L;
	private static final String PATH_JSP = "/WEB-INF/";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MainServlet() {
		super();
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String page = request.getParameter("action");
		if (page == null) {
			page = "index";
		}

		try {

			HttpSession s = request.getSession();
			Integer numeroPagine = (Integer) s.getAttribute("numeroPagine");

			if (numeroPagine == null) {
				s.setAttribute("numeroPagine", 1);
			} else {
				numeroPagine++;
				s.setAttribute("numeroPagine", numeroPagine);
			}

			Connection conn = DriverManager.getConnection(MyDriver.getInstance().getConnectionString(), "root", "");

			GestorePiloti gp = new GestorePiloti(conn);
			GestoreTeams gt = new GestoreTeams(conn);

			Vector<Piloti> drivers = gp.selectAll(20);
			Vector<Teams> teams = gt.selectAll(10);

			request.setAttribute("drivers", drivers);
			request.setAttribute("teams", teams);

			String num = request.getParameter("id");

			if (num != null) {
				int number = Integer.parseInt(num);

				if (number != -1) {
					request.setAttribute("driverSpecific", drivers.get(number));
					request.setAttribute("teamSpecific", teams.get(drivers.get(number).getTeam()));
				}
			}

			if (page.equals("executeModifyDriver")) {
				int spec = -1;
				if (num != null) {
					spec = Integer.parseInt(num);
				}
				page = "index";
				String data = "";
				int dataI;

				if (!request.getParameter("name").equals(null) && !request.getParameter("name").isEmpty()
						&& !request.getParameter("name").isBlank()) {
					data = (String) request.getParameter("name");
					gp.updateName(data, spec);
				}

				if (!request.getParameter("surname").equals(null) && !request.getParameter("surname").isEmpty()
						&& !request.getParameter("surname").isBlank()) {
					data = (String) request.getParameter("surname");
					gp.updateSurname(data, spec);
				}

				if (!request.getParameter("carNumber").equals(null) && !request.getParameter("carNumber").isEmpty()
						&& !request.getParameter("carNumber").isBlank()) {
					dataI = Integer.parseInt((String) request.getParameter("carNumber"));
					gp.updateCarNumber(dataI, spec);
				}

				if (!request.getParameter("team").equals(null) && !request.getParameter("team").isEmpty()
						&& !request.getParameter("team").isBlank()) {
					dataI = Integer.parseInt((String) request.getParameter("team"));
					gp.updateTeam(dataI, spec);
				}

				if (!request.getParameter("dateOfBirth").equals(null) && !request.getParameter("dateOfBirth").isEmpty()
						&& !request.getParameter("dateOfBirth").isBlank()) {
					data = (String) request.getParameter("dateOfBirth");
					gp.updateDateOfBirth(data, spec);
				}

				if (!request.getParameter("country").equals(null) && !request.getParameter("country").isEmpty()
						&& !request.getParameter("country").isBlank()) {
					data = (String) request.getParameter("country");
					gp.updateCountry(data, spec);
				}

				if (!request.getParameter("podiums").equals(null) && !request.getParameter("podiums").isEmpty()
						&& !request.getParameter("podiums").isBlank()) {
					dataI = Integer.parseInt((String) request.getParameter("podiums"));
					gp.updatePodiums(dataI, spec);
				}

				if (!request.getParameter("worldChampionships").equals(null)
						&& !request.getParameter("worldChampionships").isEmpty()
						&& !request.getParameter("worldChampionships").isBlank()) {
					dataI = Integer.parseInt((String) request.getParameter("worldChampionships"));
					gp.updateWorldChampionships(dataI, spec);
				}
			}

			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.getRequestDispatcher(PATH_JSP + page + ".jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}