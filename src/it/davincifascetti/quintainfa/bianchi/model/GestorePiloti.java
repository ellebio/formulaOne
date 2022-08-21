package it.davincifascetti.quintainfa.bianchi.model;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class GestorePiloti {

	Connection conn = null;

	public GestorePiloti(Connection conn) {
		this.conn = conn;
	}

	public void insert(Piloti p) throws SQLException {

		String cmd = "INSERT INTO driver VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement stmt = conn.prepareStatement(cmd);
		stmt.setInt(1, p.getId());
		stmt.setString(2, p.getName());
		stmt.setString(3, p.getSurname());
		stmt.setDate(4, p.getDateOfBirth());
		stmt.setString(5, p.getCountry());
		stmt.setString(6, p.getImage());
		stmt.setInt(7, p.getPodiums());
		stmt.setInt(8, p.getWorldChampionships());
		stmt.setInt(9, p.getCarNumber());
		stmt.setInt(10, p.getTeam());

		stmt.executeQuery();
		stmt.close();

	}

	public Vector<Piloti> selectAll(int amount) throws SQLException {

		int i = 0;

		Vector<Piloti> v = new Vector<Piloti>();

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM driver ORDER BY id");
		while (rs.next() && i < amount) {

			v.add(rs.getInt("id"), new Piloti(rs.getInt("id"), rs.getNString("name"), rs.getNString("surname"),
					rs.getDate("dateOfBirth"), rs.getNString("country"), rs.getNString("image"), rs.getInt("podiums"),
					rs.getInt("worldChampionships"), rs.getInt("carNumber"), rs.getInt("team")));

			i++;
		}

		rs.close();
		stmt.close();

		return v;
	}

	public void updateName(String name, Integer id) throws SQLException {

		String cmd = "UPDATE driver SET name=? WHERE id=?";

		PreparedStatement stmt = conn.prepareStatement(cmd);
		stmt.setString(1, name);
		stmt.setInt(2, id);

		System.out.println("new name: " + name);
		System.out.println("id: " + id);

		stmt.executeQuery();
		stmt.close();

	}

	public void updateSurname(String surname, Integer id) throws SQLException {

		String cmd = "UPDATE driver SET surname=? WHERE id=?";

		PreparedStatement stmt = conn.prepareStatement(cmd);
		stmt.setString(1, surname);
		stmt.setInt(2, id);

		stmt.executeQuery();
		stmt.close();

	}

	public void updateDateOfBirth(String dateOfBirth, Integer id) throws SQLException, ParseException {

		String cmd = "UPDATE driver SET dateOfBirth=? WHERE id=?";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = sdf.parse(dateOfBirth);
		String formattedDate = sdf.format(date);
		java.sql.Date date1 = java.sql.Date.valueOf(formattedDate);
		PreparedStatement stmt = conn.prepareStatement(cmd);
		stmt.setDate(1, date1);
		stmt.setInt(2, id);

		stmt.executeQuery();
		stmt.close();

	}

	public void updateCountry(String country, Integer id) throws SQLException {

		String cmd = "UPDATE driver SET country=? WHERE id=?";

		PreparedStatement stmt = conn.prepareStatement(cmd);
		stmt.setString(1, country);
		stmt.setInt(2, id);

		stmt.executeQuery();
		stmt.close();

	}

	public void updateImage(String image, Integer id) throws SQLException {

		String cmd = "UPDATE driver SET image=? WHERE id=?";

		PreparedStatement stmt = conn.prepareStatement(cmd);
		stmt.setString(1, image);
		stmt.setInt(2, id);

		stmt.executeQuery();
		stmt.close();

	}

	public void updatePodiums(Integer podiums, Integer id) throws SQLException {

		String cmd = "UPDATE driver SET podiums=? WHERE id=?";

		PreparedStatement stmt = conn.prepareStatement(cmd);
		stmt.setInt(1, podiums);
		stmt.setInt(2, id);

		stmt.executeQuery();
		stmt.close();

	}

	public void updateWorldChampionships(Integer worldChampionships, Integer id) throws SQLException {

		String cmd = "UPDATE driver SET worldChampionships=? WHERE id=?";

		PreparedStatement stmt = conn.prepareStatement(cmd);
		stmt.setInt(1, worldChampionships);
		stmt.setInt(2, id);

		stmt.executeQuery();
		stmt.close();

	}

	public void updateCarNumber(Integer carNumber, Integer id) throws SQLException {

		String cmd = "UPDATE driver SET carNumber=? WHERE id=?";

		PreparedStatement stmt = conn.prepareStatement(cmd);
		stmt.setInt(1, carNumber);
		stmt.setInt(2, id);

		stmt.executeQuery();
		stmt.close();

	}

	public void updateTeam(Integer team, Integer id) throws SQLException {

		String cmd = "UPDATE driver SET team=? WHERE id=?";

		PreparedStatement stmt = conn.prepareStatement(cmd);
		stmt.setInt(1, team);
		stmt.setInt(2, id);

		stmt.executeQuery();
		stmt.close();

	}

	public void delete(Integer id) throws SQLException {

		String cmd = "DELETE FROM driver WHERE id=?";

		PreparedStatement stmt = conn.prepareStatement(cmd);
		stmt.setInt(1, id);

		stmt.executeQuery();
		stmt.close();

	}

}
