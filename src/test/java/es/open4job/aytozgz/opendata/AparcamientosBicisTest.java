package es.open4job.aytozgz.opendata;

import java.util.*;

import es.open4job.aytozgz.opendata.model.dao.AparcamientoBiciDAO;
import es.open4job.aytozgz.opendata.model.vo.AparcamientoBiciVO;
import junit.framework.TestCase;

public class AparcamientosBicisTest extends TestCase {

	AparcamientoBiciDAO abDAO = new AparcamientoBiciDAO();
	
	public AparcamientosBicisTest(){}
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetListadoAparcamientoBici(){
		List<AparcamientoBiciVO> aparcamientosbici = new ArrayList<AparcamientoBiciVO>();
		aparcamientosbici = abDAO.getListadoAparcamientoBici();
		assertNotNull(aparcamientosbici);

	}
}
