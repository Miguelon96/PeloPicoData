package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SQL_Create {

	public static void main(String args[]) {
		try {
			// Open database connection
			Class.forName("org.sqlite.JDBC");
			Connection c = DriverManager.getConnection("jdbc:sqlite:./db/company.db");
			c.createStatement().execute("PRAGMA foreign_keys=ON");
			System.out.println("Database connection opened.");
			
			// Create tables: begin:
			
			//First table
			Statement stmt1 = c.createStatement();
			String sql1 = "CREATE TABLE animal_shelter "
					   + "(id       INTEGER  PRIMARY KEY AUTOINCREMENT,"
					   + "resources     TEXT     NOT NULL, "
					   + "capital  FLOAT	 NOT NULL, "
					   + "gover_id	INTEGER REFERENCES government(id) ON UPDATE CASCADE ON DELETE SET NULL)";
			stmt1.executeUpdate(sql1);
			stmt1.close();
			
			//Second table
			Statement stmt2 = c.createStatement();
			String sql2 = "CREATE TABLE endangered_species "
					   + "(id       INTEGER  PRIMARY KEY AUTOINCREMENT,"
					   + " name     TEXT     NOT NULL, "
					   + " taxonomy      TEXT	 NOT NULL, "
					   + " diet  TEXT, "
					   + " reproduction   TEXT NOT NULL)";
			stmt2.executeUpdate(sql2);
			stmt2.close();
			
			//Third table
			Statement stmt3 = c.createStatement();
			String sql3 = "CREATE TABLE population "
					   + "(id       INTEGER  PRIMARY KEY AUTOINCREMENT,"
					   + " number     INTEGER     NOT NULL, "
					   + " gender  TEXT  	NOT NULL, "
					   + " age		INTEGER, "
					   + "loc_id	INTEGER REFERENCES location(id) ON UPDATE CASCADE ON DELETE SET NULL, "
					   + "endang_id	INTEGER REFERENCES endangered_species(id) ON UPDATE CASCADE ON DELETE SET NULL)";
			stmt3.executeUpdate(sql3);
			stmt3.close();
			
			//Fourth table
			Statement stmt4 = c.createStatement();
			String sql4 = "CREATE TABLE government "
					   + "(id       INTEGER  PRIMARY KEY AUTOINCREMENT,"
					   + " type     TEXT     NOT NULL, "
					   + " ideology  TEXT  	NOT NULL)";
			stmt4.executeUpdate(sql4);
			stmt4.close();
			
			
			//Fifth table
			Statement stmt5 = c.createStatement();
			String sql5 = "CREATE TABLE danger "
					   + "(id       INTEGER  PRIMARY KEY AUTOINCREMENT,"
					   + " nature_danger     TEXT     NOT NULL, "
					   + " magnitude  TEXT  	NOT NULL)";
			stmt5.executeUpdate(sql5);
			stmt5.close();
			
			//Sixth table
			Statement stmt6 = c.createStatement();
			String sql6 = "CREATE TABLE habitat "
					   + "(id       INTEGER  PRIMARY KEY AUTOINCREMENT,"
					   + " name     TEXT     NOT NULL, "
					   + " medium  TEXT  	NOT NULL)";
			stmt6.executeUpdate(sql6);
			stmt6.close();
			
			//Seven table
			Statement stmt7 = c.createStatement();
			String sql7 = "CREATE TABLE location "
					   + "(id       INTEGER  PRIMARY KEY AUTOINCREMENT,"
					   + " name     TEXT     NOT NULL, "
					   + " size  FLOAT  	NOT NULL)";
			stmt7.executeUpdate(sql7);
			stmt7.close();
			
			
			//Eigth Table
			Statement stmt8 = c.createStatement();
			String sql8 = "CREATE TABLE loc-hab "
					   + "(loc_id     INTEGER  REFERENCES location(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " hab_id   INTEGER  REFERENCES habitat(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " PRIMARY KEY (loc_id,hab_id))";
			stmt8.executeUpdate(sql8);
			stmt8.close();
			System.out.println("Tables created.");
			
			//Nine Table
			Statement stmt9 = c.createStatement();
			String sql9 = "CREATE TABLE end-anim "
					   + "(endan_id     INTEGER  REFERENCES endangered_species(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " anims_id   INTEGER  REFERENCES animal_shelter(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " PRIMARY KEY (endan_id,anims_id))";
			stmt9.executeUpdate(sql9);
			stmt9.close();
			System.out.println("Tables created.");
			
			//Ten Table
			Statement stmt10 = c.createStatement();
			String sql10 = "CREATE TABLE end-hab "
					   + "(endan_id     INTEGER  REFERENCES endangered_species(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " hab_id   INTEGER  REFERENCES habitat(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " PRIMARY KEY (endan_id,hab_id))";
			stmt10.executeUpdate(sql10);
			stmt10.close();
			System.out.println("Tables created.");
			
			//11 Table
			Statement stmt11 = c.createStatement();
			String sql11 = "CREATE TABLE dang-end "
					   + "(dan_id     INTEGER  REFERENCES location(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " endan_id   INTEGER  REFERENCES habitat(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " PRIMARY KEY (dan_id,endan_id))";
			stmt11.executeUpdate(sql11);
			stmt11.close();
			System.out.println("Tables created.");
			/*
			Statement stmt6 = c.createStatement();
			String sql6 = "CREATE TABLE authors "
					   + "(report_id     INTEGER  REFERENCES reports(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " employee_id   INTEGER  REFERENCES employees(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " PRIMARY KEY (report_id,employee_id))";
			stmt6.executeUpdate(sql6);
			stmt6.close();
			System.out.println("Tables created.");
			
			Statement stmtSeq = c.createStatement();
			String sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('departments', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('employees', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('reports', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			stmtSeq.close();
			
			
			c.close();
			System.out.println("Database connection closed.");*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

