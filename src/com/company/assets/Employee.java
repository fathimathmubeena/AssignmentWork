package com.company.assets;
import java.util.List;
import java.util.ArrayList;

public class Employee {
    String employeeName;
    String employeeNumber;
    Asset employeeAsset;

    public Employee(String name, String number){
        this.employeeName = name;
        this.employeeNumber = number;
        //this.employeeAsset = employeeAsset;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeAsset(Asset employeeAsset) {
        this.employeeAsset = employeeAsset;
    }

    public Asset getEmployeeAsset() {
        return employeeAsset;
    }
}
