/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fluxodecaixa.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.fluxodecaixa.model.ModuloConexao;
import br.com.fluxodecaixa.dao.daologin;

/**
 *
 * @author User
 */
public class ControlLoginRead {
    
   

public class UsuarioDAO {

	
	Connection con;
	
	public ResultSet autentificar(daologin user) {
		
		con= new ModuloConexao().conectaBD();
		
		try {
			String sql ="SELECT * FROM tblogin WHERE email= ? AND senha= ?";
			PreparedStatement pstm= con.prepareStatement(sql);
			pstm.setString(1,user.getLogin());
			pstm.setString(2,user.getSenha());
			
			ResultSet rs= pstm.executeQuery();
			return rs;
			
		}catch(SQLException erro){
			JOptionPane.showMessageDialog(null, "E-mail ou Senha estão incorretos  " +erro  );
			  return null;
			
			
		}
	
		
	}
    
    
    
}
}