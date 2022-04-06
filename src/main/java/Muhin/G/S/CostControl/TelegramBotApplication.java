package Muhin.G.S.CostControl;

import Muhin.G.S.CostControl.Configuration.HibernateConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

//@SpringBootApplication
public class TelegramBotApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(HibernateConfig.class);
		context.refresh();

		EntityManagerFactory entityManagerFactory = context.getBean(EntityManagerFactory.class);
		EntityManager e = entityManagerFactory.createEntityManager();
		e.getProperties();
	}
}
