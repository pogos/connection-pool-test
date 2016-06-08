package pl.pogos.connection.pool.test.dto;

import java.util.Date;

public class Employee {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date hireDate;
    private Long jobId;
    private Double salary;
    private Double commissionPct;
    private Long managerId;
    private Long departmentId;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(Double commissionPct) {
        this.commissionPct = commissionPct;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Employee withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Employee withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Employee withEmail(String email) {
        this.email = email;
        return this;
    }

    public Employee withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Employee withHireDate(Date hireDate) {
        this.hireDate = hireDate;
        return this;
    }

    public Employee withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    public Employee withSalary(Double salary) {
        this.salary = salary;
        return this;
    }

    public Employee withCommissionPct(Double commissionPct) {
        this.commissionPct = commissionPct;
        return this;
    }

    public Employee withManagerId(Long managerId) {
        this.managerId = managerId;
        return this;
    }

    public Employee withDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }
}
