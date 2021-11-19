package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class EmployeeService {
    public static ArrayList<Employee> list = new ArrayList<Employee>();
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
    String generateNumber(){
        Random r = new Random();
        int number = r.nextInt(999999);
        return String.format("%06d", number);
    }
    // hashmap for organisation
    public static HashMap<Integer,String> hm = new HashMap<Integer,String>();
    static void hmOrganisation(){
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
    //method to display all employees in a sorted order
//    public static final Comparator<Employee> empComparator = new Comparator <Employee> () {
//
//        public int compare(Employee e1, Employee e2) {
//            String employeeName1 = e1.getName().toUpperCase();
//            String employeeName2 = e2.getName().toUpperCase();
//
//            //ascending order
//            return employeeName1.compareTo(employeeName2);
//        }};

    //Collections.sort(list, Employee.empComparator);
    public void displaySorted(){
        Collections.sort(list,(e1, e2)->e1.getName().compareTo(e2.getName()));

        System.out.println("Employee Name Sorting:");
        //Collections.sort(list, Employee.);
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
