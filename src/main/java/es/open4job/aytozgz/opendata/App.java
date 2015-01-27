package es.open4job.aytozgz.opendata;

import es.open4job.aytozgz.opendata.model.dao.ConsultaOrcl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConsultaOrcl objeto= new ConsultaOrcl();
        
        String consulta= "SELECT * FROM EQ4_BICI";
        String resp= objeto.consultaOrcl(consulta, 2);
        
        System.out.println(resp);
        
                
    }
}
