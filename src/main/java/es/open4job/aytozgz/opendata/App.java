package es.open4job.aytozgz.opendata;

import java.sql.SQLException;

import es.open4job.aytozgz.opendata.model.dao.AparcamientoBiciDAO;
import es.open4job.aytozgz.opendata.model.dao.ConsultaOrcl;
import es.open4job.aytozgz.opendata.model.vo.AparcamientoBiciVO;

public class App {
	
    public static void main( String[] args )
    {
        ConsultaOrcl objeto= new ConsultaOrcl();
        
<<<<<<< HEAD
        String consulta= "SELECT * FROM EQ4_BICI";
        String resp= objeto.consultaOrcl(consulta, 2);
        
        System.out.println(resp);
        
               
=======
                
>>>>>>> branch 'master' of https://github.com/amartinezbenedi/aytozgz-opendata
    }

}

