package pl.pogos.connection.pool.test.config;

import oracle.jdbc.pool.OracleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@PropertySource("classpath:/database.properties")
public class DatabaseConfiguration {

    @Inject
    private Environment env;

    @Bean(destroyMethod = "close")
    public DataSource dataSource() throws SQLException {
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setDriverType(env.getProperty("database.driver"));
        dataSource.setURL(env.getProperty("database.url"));
        dataSource.setUser(env.getProperty("database.user"));
        dataSource.setPassword(env.getProperty("database.password"));
        return dataSource;
    }

}
