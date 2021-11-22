package com.employees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.List;

public class EmployeeService {
    public static List<Employee> list = new ArrayList<Employee>();
    public static HashMap<Integer,String> hm = new HashMap<Integer,String>();
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
    public void displayEmployees(){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getNumber());
            System.out.println(list.get(i).getDob());
            System.out.println(list.get(i).getAddress());
            System.out.println(list.get(i).getDesignation());
            int index=list.get(i).getOrganisation();
            System.out.println(hm.get(index));
            System.out.println("\n");
        }
    }

    //method to display employees by sorting out their names
    public void displaySorted(){
        Collections.sort(list,(e1, e2)->e1.getName().compareTo(e2.getName()));
        System.out.println("Employee Name Sorting:");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getNumber());
            System.out.println(list.get(i).getDob());
            System.out.println(list.get(i).getAddress());
            System.out.println(list.get(i).getDesignation());
            int index=list.get(i).getOrganisation();
            System.out.println(hm.get(index));
            System.out.println("\n");
        }

    }
    //update designation method
    public void updateDesignation(int index,Designation des){
        Employee value=list.get(index);
        value.setDesignation(des);

    }

    //remove employee method
    public void removeEmployee(int index){
        list.remove(index);
    }

}
