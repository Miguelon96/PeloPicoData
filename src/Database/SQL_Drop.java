package Database;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class SQL_Drop {

	Connection c;
	
	public SQL_Drop(Connection c){
		super();
		this.c=c;
	}
	
	public void dropAllTables() {
		try {
			// Drop tables: begin
			Statement stmt1 = c.createStatement();
			String sql1 = "DROP TABLE animal_shelter";
			stmt1.executeUpdate(sql1);
			stmt1.close();
			Statement stmt2 = c.createStatement();
			String sql2 = "DROP TABLE endangered_species";
			stmt2.executeUpdate(sql2);
			stmt2.close();
			Statement stmt3 = c.createStatement();
			String sql3 = "DROP TABLE population";
			stmt3.executeUpdate(sql3);
			stmt3.close();
			Statement stmt4 = c.createStatement();
			String sql4 = "DROP TABLE government";
			stmt4.executeUpdate(sql4);
			stmt4.close();
			Statement stmt5 = c.createStatement();
			String sql5 = "DROP TABLE danger";
			stmt5.executeUpdate(sql5);
			stmt5.close();
			Statement stmt6 = c.createStatement();
			String sql6 = "DROP TABLE habitat";
			stmt6.executeUpdate(sql6);
			stmt6.close();
			Statement stmt7 = c.createStatement();
			String sql7 = "DROP TABLE location";
			stmt7.executeUpdate(sql7);
			stmt7.close();
			Statement stmt8 = c.createStatement();
			String sql8 = "DROP TABLE loc_hab";
			stmt8.executeUpdate(sql8);
			stmt8.close();
			Statement stmt9 = c.createStatement();
			String sql9 = "DROP TABLE end_anim";
			stmt9.executeUpdate(sql9);
			stmt9.close();
			Statement stmt10 = c.createStatement();
			String sql10 = "DROP TABLE end_hab";
			stmt10.executeUpdate(sql10);
			stmt10.close();
			Statement stmt11 = c.createStatement();
			String sql11 = "DROP TABLE dang_end";
			stmt11.executeUpdate(sql11);
			stmt11.close();
			// Drop tables: end
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
