package util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import Model.Consulta;
import Model.Endereco;
import Model.Ficha;
import Model.Medico;
import Model.Paciente;



public class HibernateUtil {
  
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				
				Configuration configuration = new Configuration();
				 
				//Propriedades de conexao
				Properties prop1 = new Properties();
				prop1.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				prop1.put(Environment.URL, "jdbc:mysql://localhost:3306/HibernateEx1?createDatabaseIfNotExist=true");
				prop1.put(Environment.USER, "Rodrigo");
				prop1.put(Environment.PASS, "8970Roferocha");
				prop1.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
				prop1.put(Environment.SHOW_SQL,"true");
				prop1.put(Environment.HBM2DDL_AUTO, "update");
				
				configuration.setProperties(prop1);
			    configuration.addAnnotatedClass(Consulta.class);
			    configuration.addAnnotatedClass(Endereco.class);
			    configuration.addAnnotatedClass(Ficha.class);
			    configuration.addAnnotatedClass(Medico.class);
			    configuration.addAnnotatedClass(Paciente.class);

			    
					ServiceRegistry registry = new StandardServiceRegistryBuilder()
							.applySettings(configuration.getProperties())
							.build();
					
					sessionFactory = configuration.buildSessionFactory(registry);
		}catch (Exception e) {
		e.printStackTrace();
	}
				
	} return sessionFactory;
		
  }
	
}
