package guru.springframework.sfgdi;

import guru.springframework.sfgdi.beans.PrototypeBean;
import guru.springframework.sfgdi.beans.SingletonBean;
import guru.springframework.sfgdi.configuration.DataSourceConfig;
import guru.springframework.sfgdi.controller.*;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication

public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        PetServiceController petServiceController = (PetServiceController) ctx.getBean("petServiceController");
        System.out.println(petServiceController.whichPetIsbest());

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

		SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getScope() +"!!!!!!!! : hashcode is - "+ singletonBean1.hashCode());
		System.out.println(singletonBean2.getScope() +"!!!!!!!! : hashcode is - "+ singletonBean2.hashCode());

		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);

		System.out.println(prototypeBean1.getScope() + "@@@@@@@@@@@@ : hashcode is - " +prototypeBean1.hashCode());
		System.out.println(prototypeBean2.getScope() + "@@@@@@@@@@@@ : hashcode is - " +prototypeBean2.hashCode());

		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcurl());

		System.out.println("properties from config files !!!!!!!!!!!");

		DataSourceConfig dataSourceConfig = ctx.getBean(DataSourceConfig.class);
		System.out.println(dataSourceConfig.getUsername());
		System.out.println(dataSourceConfig.getPassword());
		System.out.println(dataSourceConfig.getJdbcurl());
	}

}
