package com.employees;

public class Employee {

        private String name;
        private String number;
        private String dob;
        private String address;
        private Designation designation;
        private int organisation;

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
