package es.open4job.aytozgz.opendata.model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import es.open4job.aytozgz.opendata.model.vo.AparcamientoBiciVO;
import es.open4job.aytozgz.opendata.model.vo.Punto;

public class AparcamientoBiciDAO{

	public AparcamientoBiciDAO() {		
	}
	
	public static final Logger logger = Logger.getLogger(AparcamientoBiciDAO.class.getName());
	
	// Listado de aparcamiento bicis
	public List<AparcamientoBiciVO> getListadoAparcamientoBici() {
		List<AparcamientoBiciVO> bicis = new ArrayList<AparcamientoBiciVO>();;			
		String query = "Select ID,LASTUPDATED,ICON,TITLE,COORDX,COORDY from EQ4_BICI";
		Statement stmt = null;
		ResultSet rs = null;

		ConsultaOrcl co = new ConsultaOrcl();
		Connection conection =  co.conexion();
		System.out.println("conexion abierta");
		
		try {			    	System.out.print("");  			
			
			stmt = conection.createStatement();
			rs = stmt.executeQuery(query);
			Punto punto = null;
			while (rs.next()) {
				 int id = rs.getInt(1);
				 Date fecha = rs.getDate(2);					 
				 String icon = rs.getString(3);	
				 String title = rs.getString(4);	 
				 int x = rs.getInt(5);
				 int y = rs.getInt(6);				
				 punto = new Punto(x, y);
				 punto.setX(x);				 
				 punto.setY(y);	
				 
			AparcamientoBiciVO aparcamientoBiciVO = new AparcamientoBiciVO(id,punto,title,icon,fecha);	 
	
			bicis.add(aparcamientoBiciVO);
			
			return bicis;
			
			}			
			
		}catch (SQLException e) {
			e.printStackTrace();
			logger.log(Level.SEVERE, "SQLException : " + e.getMessage());
			
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
			}
			System.out.println("conexion cerrada ");
		}
		
		return bicis;

	}

	
	/*public AparcamientoBiciVO getDatosAparcamientoBici (int id) {
		
		return null;
		
	}*/
	
}
