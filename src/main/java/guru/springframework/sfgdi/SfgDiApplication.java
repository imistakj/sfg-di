package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18NController i18NController = (I18NController)ctx.getBean("i18NController");
		System.out.println(i18NController.getGreeting());

		MyController controller = (MyController) ctx.getBean("myController");
		String sayHello = controller.sayHello();
		System.out.println(sayHello);

		System.out.println("-----------Property");
		PropertyInjectedController pController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(pController.getGreeting());

		System.out.println("-------------Setter");
		SetterInjectedController sController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(sController.getGreeting());

		System.out.println("---------Constructor");
		ConstructorInjectedController cController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(cController.getGreeting());

	}

}
