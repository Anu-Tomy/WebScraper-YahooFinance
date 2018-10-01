package com.webscraper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StocksTable {	
	public static void main(String[] args) throws Exception {
		dropOldTable();
		createStocksTable();		
	}
	
	public static Connection connectDb() throws Exception {
		String url = "jdbc:mysql://localhost:3306/yahoo_finance_scraper?useSSL=false";
	    String username = "yahoo";
	    String password = "yahoo";
	    Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    System.out.println("Database connection successful!");
	    return conn;
	  }
		
	public static void dropOldTable() throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//get connection to the database
			 conn = connectDb();
						 
			//TRUNCATE Old TABLE data
			 String mySqlQuery = "DROP TABLE stocksTable";
			 pstmt = conn.prepareStatement(mySqlQuery);
			 pstmt.executeUpdate(); 
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			conn.close();
			pstmt.close();
		}
		System.out.println("Drop old table");
	}

	public static void createStocksTable() throws Exception{
		
	    PreparedStatement pstmt = null;
	    Connection conn = null;
	    try {
	      StringBuffer sql = new StringBuffer("CREATE TABLE stocksTableTest(");
	      sql.append("id			INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, ");
	      sql.append("symbol			VARCHAR(6), ");
	      sql.append("name				VARCHAR(50), ");
	      sql.append("price				DOUBLE PRECISION, ");
	      sql.append("chang					DECIMAL(5,2), ");
	      sql.append("percentChang			DECIMAL(5,2), ");
	      sql.append("volum				VARCHAR(12), ");    
	      sql.append("avgVol			VARCHAR(10), ");
	      sql.append("marketCap			DOUBLE PRECISION, ");
	      sql.append("peRatio			VARCHAR(10)) "); 
	      	      
	      conn = connectDb();
	      pstmt = conn.prepareStatement(sql.toString()); 
	      pstmt.executeUpdate();
	      
	      System.out.println("The Stocks table is created");
	      
	    } catch (Exception e) {
	      e.printStackTrace();
	    } 
	  }
}
