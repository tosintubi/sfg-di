package org.tommot.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.tommot.sfgdi.controllers.ConstructorInjectorController;
import org.tommot.sfgdi.controllers.MyController;
import org.tommot.sfgdi.controllers.PropertyInjectedController;
import org.tommot.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {
	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		String greetings = myController.sayHello();
		System.out.println(greetings);


		System.out.println("+++++++++++ Property :");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());


		System.out.println("+++++++++++ Setter :");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("+++++++++++ Constructor :");

		ConstructorInjectorController constructorInjectorController = (ConstructorInjectorController) ctx.getBean("constructorInjectorController");
		System.out.println(constructorInjectorController.getGreeting());


	}

}
