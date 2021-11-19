package com.company;

public class EmployeeController {
    public static void main(String[] args) {
        EmployeeService es = new EmployeeService();
        es.register("Mary", "01/03/1998", "3rd cross Ramnagar", Designation.MANAGER, 2);
        es.register("Harry", "21/06/1995", "3rd cross Mysusu", Designation.PROJECT_LEADER, 1);
        es.register("John", "11/08/1999", "2nd street Udaynagar", Designation.TRAINEE, 5);
        es.register("Mala", "24/03/1991", "1st block Kempadi", Designation.SOFTWARE_ENGINEER, 4);
        es.register("Kavya", "14/03/1992", "Jayanagar", Designation.MANAGER, 3);

        Employee e1 = new Employee();
        e1.setName("Anil");
        e1.setNumber(es.generateNumber());
        e1.setAddress("Bantwal");
        e1.setDob("30/11/1994");
        e1.setDesignation(Designation.PROJECT_LEADER);
        e1.setOrganisation(4);
        es.list.add(e1);

        Employee e2 = new Employee();
        e2.setName("Asha");
        e2.setNumber(es.generateNumber());
        e2.setAddress("Vitla");
        e2.setDob("28/10/1996");
        e2.setDesignation(Designation.SOFTWARE_ENGINEER);
        e2.setOrganisation(3);
        es.list.add(e2);

        Employee e3 = new Employee();
        e3.setName("Isha");
        e3.setNumber(es.generateNumber());
        e3.setAddress("Kabaka");
        e3.setDob("18/10/1994");
        e3.setDesignation(Designation.SOFTWARE_ENGINEER);
        e3.setOrganisation(1);
        es.list.add(e3);

        Employee e4 = new Employee();
        e4.setName("Nidhi");
        e4.setNumber(es.generateNumber());
        e4.setAddress("Mangalore");
        e4.setDob("28/11/1996");
        e4.setDesignation(Designation.MANAGER);
        e4.setOrganisation(5);
        es.list.add(e4);

        Employee e5 = new Employee();
        e5.setName("Rahul");
        e5.setNumber(es.generateNumber());
        e5.setAddress("Adyar");
        e5.setDob("28/10/1996");
        e5.setDesignation(Designation.SOFTWARE_ENGINEER);
        e5.setOrganisation(2);
        es.list.add(e5);

        es.hmOrganisation();
        System.out.println("--------Display of all employees--------\n");
        es.displayEmployees();
        System.out.println("--------Update designation at specific index-5--------\n");
        es.updateDesignation(5, Designation.TRAINEE);
        es.displayEmployees();
        System.out.println("--------Display after remove method-remove at index 3-------\n");
        es.removeEmployee(3);
        es.displayEmployees();
        System.out.println("--------Display after sorting by employee name -------\n");
        es.displaySorted();
    }
}
