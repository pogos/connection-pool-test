package pl.pogos.connection.pool.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.pogos.connection.pool.test.config.DatabaseConfiguration;
import pl.pogos.connection.pool.test.config.ServiceConfiguration;
import pl.pogos.connection.pool.test.service.SimpleQueryService;

public class Application
{

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main( String[] args ) {
        LOGGER.info("Start connection pool test");
        ApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfiguration.class, ServiceConfiguration.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        LOGGER.info("Beans created");
        for (String name : beanDefinitionNames) {
            LOGGER.info(name);
        }

        SimpleQueryService simpleQueryService = (SimpleQueryService) context.getBean("simpleQueryService");
        LOGGER.info("Date from dual: " + simpleQueryService.getDateFromDual());

        LOGGER.info("Stop connection pool test");

    }
}
