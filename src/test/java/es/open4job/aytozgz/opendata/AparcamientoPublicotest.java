package es.open4job.aytozgz.opendata;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import es.open4job.aytozgz.opendata.model.dao.AparcamientosPublicosDAO;
import es.open4job.aytozgz.opendata.model.vo.AparcamientosPublicosVO;

public class AparcamientoPublicotest {
	
	AparcamientosPublicosDAO apDAO = new AparcamientosPublicosDAO();

	public AparcamientoPublicotest() {
	}

	@Before
	public void setUp() throws Exception {		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetListadoAparcamientos() {
		
		List<AparcamientosPublicosVO> aparcamientos = new ArrayList<AparcamientosPublicosVO>();
		aparcamientos = apDAO.getListadoAparcamientos();
		assertNotNull(aparcamientos);
		
		
	}

}
