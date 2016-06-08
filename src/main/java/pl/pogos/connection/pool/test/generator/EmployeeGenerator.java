package pl.pogos.connection.pool.test.generator;

import org.springframework.stereotype.Component;
import pl.pogos.connection.pool.test.dto.Employee;

@Component
public class EmployeeGenerator {

    public Employee generate() {
        return new Employee();
    }


}
