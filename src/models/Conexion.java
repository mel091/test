package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion 
{
	public static Connection conectar()
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_testeoDB", "freedb_mel2891", "&e$2*JamK*VtMV8");
			return cn;
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error en conexión local: " + e);
		}
		return (null);
	}

}
