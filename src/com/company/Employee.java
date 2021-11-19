package com.company;

public class Employee {

        String name;
        String number;
        String dob;
        String address;
        Designation designation;
        int organisation;

        //String format="AB0000";

//    Employee(String n,String d,String a,String des,int o){
//        name=n;
//        dob=d;
//        address=a;
//        designation=des;
//        organisation=o;
//    }

        public String getName(){
            return name;
        }
        public String getNumber(){
            return number;
        }
        public String  getDob(){
            return dob;
        }
        public String getAddress(){
            return address;
        }
        public Designation getDesignation(){
            return designation;
        }
        public int getOrganisation(){
            return organisation;
        }

        public void setName(String newName){
            name=newName;
        }
        public void setNumber(String newNum){
            number=newNum;
        }
        public void setDob(String newDob){
            dob=newDob;
        }
        public void setAddress(String newAddress){
            address=newAddress;
        }
        public void setDesignation(Designation newDesignation){
            designation=newDesignation;
        }
        public void setOrganisation(int newOrganisation){
            organisation=newOrganisation;
        }

}
