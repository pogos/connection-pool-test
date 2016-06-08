package pl.pogos.connection.pool.test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.pogos.connection.pool.test.config.DatabaseConfiguration;
import pl.pogos.connection.pool.test.config.ServiceConfiguration;

import javax.inject.Inject;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DatabaseConfiguration.class, ServiceConfiguration.class})
public class QueryServiceTest {

    @Inject
    private QueryService queryService;

    @Test
    public void shouldGetDateFromDB() {
        //given

        //when
        String dateFromDual = queryService.getDateFromDual();

        //then
        assertThat(dateFromDual).isNotNull();
    }

}