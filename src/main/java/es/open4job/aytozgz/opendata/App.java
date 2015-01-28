package es.open4job.aytozgz.opendata;

import java.util.Iterator;
import java.util.List;

import es.open4job.aytozgz.opendata.model.dao.AparcamientoBiciDAO;
import es.open4job.aytozgz.opendata.model.dao.AparcamientosPublicosDAO;
import es.open4job.aytozgz.opendata.model.vo.AparcamientoBiciVO;
import es.open4job.aytozgz.opendata.model.vo.AparcamientosPublicosVO;

public class App {
	
    public static void main( String[] args ){
   	
    	AparcamientoBiciDAO bicisDAO = new AparcamientoBiciDAO();
    	List<AparcamientoBiciVO> bicis = bicisDAO.getListadoAparcamientoBici();

    	AparcamientosPublicosDAO apDAO = new AparcamientosPublicosDAO();
    	List<AparcamientosPublicosVO> aparcamientos = apDAO.getListadoAparcamientos();

    	System.out.println("-------------Lista de bicis--------------");  			

    			
    	if (bicis != null) {
    		Iterator<AparcamientoBiciVO> iterator = bicis.iterator();
    		while (iterator.hasNext()) {
    			AparcamientoBiciVO bici = iterator.next();
    		System.out.println(bici.toString());
    		}
    	}	
    	if (aparcamientos !=null){
    	Iterator<AparcamientosPublicosVO> it = aparcamientos.iterator();
    		while (it.hasNext()){
    			AparcamientosPublicosVO aparcamiento = it.next();
    		System.out.println(aparcamiento.toString());
    		}
    	}
    }
}

