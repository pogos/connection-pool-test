package pl.pogos.connection.pool.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"pl.pogos.connection.pool.test.service", "pl.pogos.connection.pool.test.generator"})
public class ServiceConfiguration {
}
