package pl.pogos.connection.pool.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class QueryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QueryService.class);

    private static final String DATE_QUERY = "select sysdate from dual";

    @Inject
    private DataSource dataSource;

    public String getDateFromDual() {
        PreparedStatement statement = null;
        Connection connection = null;
        String result = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.prepareStatement(DATE_QUERY);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                result = resultSet.getString(1);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            }
            catch (SQLException e) {
                LOGGER.error("Connection close error", e);
            }
        }
        return result;
    }
}
