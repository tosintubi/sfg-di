package org.tommot.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.tommot.sfgdi.controllers.*;
import org.tommot.sfgdi.services.DatabaseService;

@SpringBootApplication
public class SfgDiApplication {
	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("+++++++++++++ Database Connection ++++++++++");
		DatabaseController databaseController = (DatabaseController) ctx.getBean("databaseController");
		System.out.println(databaseController.Connect());


		System.out.println("+++++++++++++ Beßer Pet Bean ++++++++++");
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println(petController.whichPetIsBetter());



		System.out.println("+++++++++++++ Profile Bean ++++++++++");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("+++++++++++++ PRIMARY BEAN ++++++++++");
		System.out.println(myController.sayHello());


		System.out.println("+++++++++++ Property Bean ");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());


		System.out.println("+++++++++++ Setter :");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("+++++++++++ Constructor :");

		ConstructorInjectorController constructorInjectorController = (ConstructorInjectorController) ctx.getBean("constructorInjectorController");
		System.out.println(constructorInjectorController.getGreeting());

		System.out.println(databaseController.Disconnect());


	}

}
