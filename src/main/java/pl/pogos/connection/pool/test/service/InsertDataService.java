package pl.pogos.connection.pool.test.service;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;
import pl.pogos.connection.pool.test.dto.Employee;
import pl.pogos.connection.pool.test.generator.EmployeeGenerator;

import javax.inject.Inject;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class InsertDataService {

    private static final String EMPLOYEE_INSERT_QUERY = "INSERT INTO employees(employee_id, first_name, last_name, email)";

    @Inject
    private EmployeeGenerator employeeGenerator;

    @Inject
    private NamedParameterJdbcTemplate jdbcTemplate;

    public Integer createNewEmployee() {
        Employee employee = employeeGenerator.generate();

        SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(employee);

        Integer result = jdbcTemplate.execute(EMPLOYEE_INSERT_QUERY, namedParameters, new PreparedStatementCallback<Integer>() {
            public Integer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                return 0;
            }
        });

        return result;
    }




}
