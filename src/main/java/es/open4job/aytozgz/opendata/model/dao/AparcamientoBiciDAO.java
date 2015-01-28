package es.open4job.aytozgz.opendata.model.dao;

import java.sql.*;
import java.util.List;

import es.open4job.aytozgz.opendata.model.vo.AparcamientoBiciVO;

public class AparcamientoBiciDAO extends AbstractDAO{

	public AparcamientoBiciDAO(String driver, String url, String user,
			String password) {
		super(driver, url, user, password);		
	}
	
	// Listado de aparcamiento bicis
	public List<AparcamientoBiciVO> getListadoAparcamientoBici() {
		List<AparcamientoBiciVO> bicis = null;
		ResultSet result = null;
		try {
			result = connection.createStatement().executeQuery(
					"SELECT 'hola mundo' FROM DUAL");
			result.next();
			System.out.println(result.getString(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bicis;
	}

	
	/*public AparcamientoBiciVO getDatosAparcamientoBici (int id) {
		
		return null;
		
	}*/
	
}
