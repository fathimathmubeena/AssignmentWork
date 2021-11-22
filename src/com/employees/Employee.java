package com.employees;

class Employee {

        String name;
        String number;
        String dob;
        String address;
        Designation designation;
        int organisation;

        String getName(){
            return name;
        }
        String getNumber(){
            return number;
        }
        String  getDob(){
            return dob;
        }
        String getAddress(){
            return address;
        }
        Designation getDesignation(){
            return designation;
        }
        int getOrganisation(){
            return organisation;
        }

        void setName(String newName){
            name=newName;
        }
        void setNumber(String newNum){
            number=newNum;
        }
        void setDob(String newDob){
            dob=newDob;
        }
        void setAddress(String newAddress){
            address=newAddress;
        }
        void setDesignation(Designation newDesignation){
            designation=newDesignation;
        }
        void setOrganisation(int newOrganisation){
            organisation=newOrganisation;
        }

}
