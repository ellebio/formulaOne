package it.davincifascetti.quintainfa.bianchi.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class GestoreTeams {

	Connection conn = null;

	public GestoreTeams(Connection conn) {
		this.conn = conn;
	}

	public void insert(Teams t) throws SQLException {

		String cmd = "INSERT INTO team VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement stmt = conn.prepareStatement(cmd);
		stmt.setInt(1, t.getId());
		stmt.setString(2, t.getName());
		stmt.setString(3, t.getBase());
		stmt.setString(4, t.getTeamPrincipal());
		stmt.setString(5, t.getChassis());
		stmt.setString(6, t.getPowerUnit());
		stmt.setInt(7, t.getWorldChampionships());
		stmt.setString(8, t.getImage());

		stmt.executeQuery();
		stmt.close();

	}

	public Vector<Teams> selectAll(int amount) throws SQLException {

		int i = 0;

		Vector<Teams> v = new Vector<Teams>();

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM team ORDER BY id");
		while (rs.next() && i < amount) {

			v.add(rs.getInt("id"), new Teams(rs.getInt("id"), rs.getString("name"), rs.getString("base"), rs.getString("teamPrincipal"),
					rs.getString("chassis"), rs.getString("powerUnit"), rs.getInt("worldChampionships"),
					rs.getString("image")));

			i++;
		}

		rs.close();
		stmt.close();

		return v;
	}

}
