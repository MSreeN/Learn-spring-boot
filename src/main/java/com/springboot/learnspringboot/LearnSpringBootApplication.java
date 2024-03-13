package com.springboot.learnspringboot;

import com.springboot.learnspringboot.aspects.AOPTargetClass;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
		var context =new AnnotationConfigApplicationContext(ConfigClass.class);
		var aopTargetClass = context.getBean(AOPTargetClass.class);
		var vehicle = context.getBean(VehicleServices.class);
//		System.out.println(aopTargetClass);
//		System.out.println(aopTargetClass.getClass());
		aopTargetClass.pointCutMethod();

//		var applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);
//		Person person = applicationContext.getBean(Person.class);
//		System.out.println("Person name is "+ person.getName());
//		Vehicle vehicle = applicationContext.getBean(Vehicle.class);
//		System.out.println("Vehicle "+person.getName()+" driving is "+vehicle.getName());
//		System.out.println("Vehicle services are "+vehicle.getVehicleServices().playMusic());
	}
}
