package Database;

import java.sql.*;

public class SQL_Create {
	
	Connection c;
	
	
	
	public SQL_Create(Connection c) {
		super();
		this.c = c;
	}



	public void callCreate() {
		try {
			
			// Create tables: begin:
			
			//First table
			Statement stmt1 = c.createStatement();
			String sql1 = "CREATE TABLE animal_shelter "
					   + "(id       INTEGER  PRIMARY KEY AUTOINCREMENT,"
					   + "name		TEXT NOT NULL, "	 
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
					   + "name		TEXT 	NOT NULL, "	
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
			
			//Eight Table
			Statement stmt8 = c.createStatement();
			String sql8 = "CREATE TABLE loc_hab "
					   + "(loc_id     INTEGER  REFERENCES location(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " hab_id   INTEGER  REFERENCES habitat(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " PRIMARY KEY (loc_id,hab_id))";
			stmt8.executeUpdate(sql8);
			stmt8.close();
			System.out.println("Tables created.");
			
			//Nine Table
			Statement stmt9 = c.createStatement();
			String sql9 = "CREATE TABLE end_anim "
					   + "(endan_id     INTEGER  REFERENCES endangered_species(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " anims_id   INTEGER  REFERENCES animal_shelter(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " PRIMARY KEY (endan_id,anims_id))";
			stmt9.executeUpdate(sql9);
			stmt9.close();
			System.out.println("Tables created.");
			
			//Ten Table
			Statement stmt10 = c.createStatement();
			String sql10 = "CREATE TABLE end_hab "
					   + "(endan_id     INTEGER  REFERENCES endangered_species(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " hab_id   INTEGER  REFERENCES habitat(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " PRIMARY KEY (endan_id,hab_id))";
			stmt10.executeUpdate(sql10);
			stmt10.close();
			System.out.println("Tables created.");
			
			//11 Table
			Statement stmt11 = c.createStatement();
			String sql11 = "CREATE TABLE dang_end "
					   + "(dan_id     INTEGER  REFERENCES location(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " endan_id   INTEGER  REFERENCES habitat(id) ON UPDATE CASCADE ON DELETE SET NULL,"
					   + " PRIMARY KEY (dan_id,endan_id))";
			stmt11.executeUpdate(sql11);
			stmt11.close();
			System.out.println("Tables created.");
			
			
			
			Statement stmtSeq = c.createStatement();
			String sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('animal_shelter', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('endangered_species', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('population', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('government', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('danger', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('habitat', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('location', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('loc-hab', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('end-anim', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('end-hab', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			sqlSeq = "INSERT INTO sqlite_sequence (name, seq) VALUES ('dang-end', 1)";
			stmtSeq.executeUpdate(sqlSeq);
			stmtSeq.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


