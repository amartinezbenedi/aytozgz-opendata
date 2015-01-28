package es.open4job.aytozgz.opendata;

import java.util.Iterator;
import java.util.List;

import es.open4job.aytozgz.opendata.model.dao.AparcamientoBiciDAO;
import es.open4job.aytozgz.opendata.model.vo.AparcamientoBiciVO;

public class App {
	
    public static void main( String[] args ){
   	
    	AparcamientoBiciDAO bicisDAO = new AparcamientoBiciDAO();
    	List<AparcamientoBiciVO> bicis = bicisDAO.getListadoAparcamientoBici();
    	System.out.print("");  			
    			
    	if (bicis != null) {
    		Iterator<AparcamientoBiciVO> iterator = bicis.iterator();
    		while (iterator.hasNext()) {
    			AparcamientoBiciVO bici = iterator.next();
    		System.out.println(bici.toString());
    		}
    	}
    }
}

