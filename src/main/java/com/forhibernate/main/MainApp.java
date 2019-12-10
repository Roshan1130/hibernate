package com.forhibernate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.forhibernate.entities.CustomerEntity;
import com.forhibernate.entities.VehicleEntity;
import com.forhibernate.repositories.CustomerRepository;
import com.forhibernate.repositories.VehicleRepository;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext act = new ClassPathXmlApplicationContext("appication-context.xml");
		CustomerRepository cr = (CustomerRepository) act.getBean("customerRepository");	
		
		
		CustomerEntity ce = new CustomerEntity();
		ce.setName("Roshan Ramtel");
		ce.setAddress("9335 Lee Highway");
		ce.setPhone("+1763826282");
		
		
		cr.save(ce);
		
		VehicleRepository vr= (VehicleRepository) act.getBean("vehicleRepository");
		
		VehicleEntity ve = new VehicleEntity();
		ve.setVin("jdf93nfd93rwf");
		ve.setMake("Toyota");
		ve.setModel("Corolla");
		ve.setBody("Sedan");
		
		vr.save(ve);
	}
	
	
}
