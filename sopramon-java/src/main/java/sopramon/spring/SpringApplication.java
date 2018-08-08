package sopramon.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import sopramon.Principal;

public class SpringApplication {

	public static void main(String[] args) {

//		ClassPathXmlApplicationContext myContext = new ClassPathXmlApplicationContext;
//				"classpath:application-context.xml");

		AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
			myContext.getBeanFactory()
			.createBean(sopramon.Principal.class)
			.run(args);
			
			myContext.close();

	}

}
