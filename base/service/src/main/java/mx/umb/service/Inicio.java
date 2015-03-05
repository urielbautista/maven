package mx.umb.service;

import mx.umb.model.dto.Puerto;
import mx.umb.service.exception.ServiceException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Inicio {

	public static void main(String[] args) {
        ApplicationContext applicationContext = 
        		new ClassPathXmlApplicationContext("classpath:service-app-context.xml");
        PuertoService puertoService = (PuertoService) applicationContext.getBean("puertoService");
        try {
			Puerto puerto = new Puerto(1,"Puerto1",1,true);
			puertoService.saveOrUpdate(puerto);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
