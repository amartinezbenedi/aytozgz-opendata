package es.open4job.aytozgz.opendata.model.dao;

import es.open4job.aytozgz.opendata.model.vo.AparcamientosPublicosVO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

import es.open4job.aytozgz.opendata.model.vo.Punto;

public class AparcamientosPublicosDAO {

	ConsultaOrcl consulta;

	public static Logger logger = Logger
			.getLogger(AparcamientosPublicosDAO.class.getName());

	// Listado de aparcamientos

	public List<AparcamientosPublicosVO> getListadoAparcamientos() {
	List<AparcamientosPublicosVO> aparcamientos = new ArrayList<AparcamientosPublicosVO>();
		
		String query = "SELECT * FROM EQ4_APARCA";
		Statement st = null;
		ResultSet rs = null;
		
		
		try{
		//Abrimos la conexion 
		Connection con = consulta.Conexion();
		st = con.createStatement();
		rs = st.executeQuery(query);
		
		Punto punto = null;
		
		while (rs.next()){
				
			int id = rs.getInt(1);
			Date fecha = rs.getDate(2);
			String icon = rs.getString(3);
			String title = rs.getString(4);
			String horario = rs.getString(5);
			String accesoPeaton = rs.getString(6);
			String accesos = rs.getString(7);
			String accesoVehiculo = rs.getString(8);

			int x = rs.getInt(9);
				punto.setX(x);
			int y = rs.getInt(10);
				punto.setY(y);
				
			punto = new Punto(x, y);
								
				AparcamientosPublicosVO aparcamiento = new AparcamientosPublicosVO(punto, horario, title,
						accesos, fecha, accesoPeaton,accesoVehiculo, id);
				
				aparcamientos.add(aparcamiento);
		}
		
			
		}
			
		catch(Exception e){
			
		logger.log(Level.SEVERE, e.getMessage());
		
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
					}
			}
			if (st != null) {
				try {
					st.close();
				} catch (Exception e) {
		
				}
			}
		}
		
	return aparcamientos;
	}

	

}
