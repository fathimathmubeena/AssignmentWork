package com.employees;

import java.util.*;

public class EmployeeService {
    public static List<Employee> list = new ArrayList<Employee>();
    public static Map<Integer,String> hm = new HashMap<Integer,String>();
    void register(String n,String d,String a,Designation des,int o){
        Employee e = new Employee();
        e.setName(n);
        e.setDob(d);
        e.setAddress(a);
        e.setDesignation(des);
        e.setOrganisation(o);
        e.setNumber(generateNumber());

        list.add(e);
    }
    //generate random number for employee number
    public String generateNumber(){
        Random r = new Random();
        int number = r.nextInt(999999);
        return String.format("%06d", number);
    }
    // hashmap for organisation
    public void hmOrganisation(){
        hm.put(1,"ROBOSOFT");
        hm.put(2,"TCS");
        hm.put(3,"INFOSYS");
        hm.put(4,"CAPGEMINI");
        hm.put(5,"IBM");
    }

    //method to display all employees
    public void displayEmployees() {
        list.forEach((var) -> {
            System.out.println(var.getName());
            System.out.println(var.getNumber());
            System.out.println(var.getDob());
            System.out.println(var.getAddress());
            System.out.println(var.getDesignation());
            int index=var.getOrganisation();
            System.out.println(hm.get(index));
            System.out.println("\n");
        });
    }

    //method to display employees by sorting out their names
    public void displaySorted(){
        Collections.sort(list,new SortName());
        System.out.println("Employee Name Sorting:");
        list.forEach((var) -> {
            System.out.println(var.getName());
            System.out.println(var.getNumber());
            System.out.println(var.getDob());
            System.out.println(var.getAddress());
            System.out.println(var.getDesignation());
            int index=var.getOrganisation();
            System.out.println(hm.get(index));
            System.out.println("\n");
        });
    }
    //update designation method
    public void updateDesignation(int index,Designation des) throws DesignationException{
        if(index> list.size()) {
            throw new DesignationException("You are not eligible to update");
        }
        else{
            Employee value = list.get(index);
            value.setDesignation(des);
        }

    }

    //remove employee method
    public void removeEmployee(int index) {

        try{
            list.remove(index);
        }
        catch(Exception e){
            System.out.println(e+"\nException Occured!!!!!!!!\nCannot remove employee\n");
        }
    }
}
