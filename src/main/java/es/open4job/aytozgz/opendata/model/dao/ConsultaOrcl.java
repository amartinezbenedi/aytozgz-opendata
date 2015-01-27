package es.open4job.aytozgz.opendata.model.dao;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaOrcl{
	
 private java.sql.Connection con=null;
 private java.sql.Statement stmt;
 public ResultSet resultado;
 //consulta: sentencia sql. modo: 1-&gt;insert, delete, update. 2-&gt;select.
 public String consultaOrcl(String consulta, Integer modo)
 {
  String regs ="";
  StringWriter sw = null;
  PrintWriter pw = null;
  try
  {
	  String driver = "oracle.jdbc.driver.OracleDriver";
	  
	  String host = "54.154.192.80";
	  String puerto = "1521";
	  String sid = "xe";
	  
	  String user = "test";
	  String password = "test";
	  
	  String url = "jdbc:oracle:thin:" + user + "/" + password + "@" + host
	   + ":" + puerto + ":" + sid;
   
	  Class.forName(driver).newInstance();
	  con = DriverManager.getConnection(url);
	  stmt = (Statement) con.createStatement();
	  //modo=1 -&gt; insert,update,delete; modo=2 -&gt; select
	  if (modo == 1)
	  {
		  stmt.executeUpdate(consulta);
	  }
	  else
	  {
		  resultado = (ResultSet) stmt.executeQuery(consulta);
	  }
	  while (resultado.next())
      {
          regs = regs + "ID: " + resultado.getString(1) + " LASTUPDATED: "+ (resultado.getString(2)) + " ICON: "+ (resultado.getString(3))+ " TITLE: "+ (resultado.getString(4))+ " COORDX: "+ (resultado.getString(5))+ " COORDY: "+ (resultado.getString(6));
      }
	   try
	   {
	    resultado.close();
	    stmt.close();
	    con.close();
	   }
	   catch (SQLException e )
	   {
	    sw = new StringWriter();
	    pw = new PrintWriter(sw);
	    e.printStackTrace(pw);
	    return "NO FUNCIONA" + sw.toString() + "rn";
	            }
	  }
	  catch (Exception ex)
	  {
	   sw = new StringWriter();
	   pw = new PrintWriter(sw);
	   ex.printStackTrace(pw);
	   return "NO FUNCIONA" + sw.toString() + "rn";
	  }
	  return regs;
 }
}