package com.microserv.learnmicro.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Account {
    @Column(name = "employeename")
    private String employeename;

    public Account() {

    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeeaddress() {
        return employeeaddress;
    }

    public void setEmployeeaddress(String employeeaddress) {
        this.employeeaddress = employeeaddress;
    }

    public String getEmployeeeemail() {
        return employeeeemail;
    }

    public void setEmployeeeemail(String employeeeemail) {
        this.employeeeemail = employeeeemail;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeid;
    @Column(name = "employeeaddress")
    private String employeeaddress;
    @Column(name = "employeeeemail")
    private String employeeeemail;

    public Account(String employeename, int employeeid, String employeeaddress, String employeeeemail) {
        this.employeename = employeename;
        this.employeeid = employeeid;
        this.employeeaddress = employeeaddress;
        this.employeeeemail = employeeeemail;
    }


}
