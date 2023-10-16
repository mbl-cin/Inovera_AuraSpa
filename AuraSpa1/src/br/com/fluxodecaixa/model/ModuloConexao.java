/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fluxodecaixa.model;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ModuloConexao {

    private static String DRIVE= "com.mysql.cj.jdbc.Driver";
    private static String URL= "jdbc:mysql://localhost/auraspa?characterEncoding=utf-8";
    private static String USUARIO= "dba";
    private static String SENHA= "Infox_123456";   

    public static Connection getConnection() {
		  
		  try { 
			      Class.forName(DRIVE);
			      return DriverManager.getConnection (URL, USUARIO, SENHA);
		  } catch(ClassNotFoundException | SQLException ErroSql) {
			  throw new RuntimeException("ERRO!  Não foi possível conectar  " +ErroSql  );
			  
		  }
		  
	  }
	public Connection conectaBD () {
		
			  try { 
				      Class.forName(DRIVE);
				      return DriverManager.getConnection (URL, USUARIO, SENHA);
			  } catch(ClassNotFoundException | SQLException ErroSql) {
				  throw new RuntimeException
                                   ("ERRO!  Não foi possível conectar  " +ErroSql  );
				  
			  } } 

public static void closeConnection(Connection con) {
		
		
		  try { 
		      if (con != null)
		    	  con.close();
	  } catch( SQLException ErroSql) {
		  throw new RuntimeException("ERRO!  Não foi possível conectar  " +ErroSql  );
		  
	  }
	}
	  
	
	public static void closeConnection(Connection con, PreparedStatement pstm) {
		closeConnection(con);
		  try { 
		      if (pstm != null)
		    	  pstm.close();
	  } catch( SQLException ErroSql) {
		  throw new RuntimeException("ERRO!  Não foi possível conectar  " +ErroSql  );
		  
	  }	
	}
	  
	public static void closeConnection(Connection con, PreparedStatement pstm, ResultSet rs) {
		closeConnection(con, pstm);
		  try { 
		      if (rs != null)
		    	  rs.close();
	  } catch( SQLException ErroSql) {
		  throw new RuntimeException("ERRO!  Não foi possível conectar  " +ErroSql  );
		  
	  }	
	}
	  
}