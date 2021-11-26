package com.company.assets;

import java.util.Scanner;

public class assetController {
    public static void main(String[] args){
        int choice,assetnumber;
        String assetbrandId,assetbrandLogo,assetbrandName,make,invoice,assetname;
        double amount;
        AssetService as = new AssetService();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Asset Management System\n");
        Employee employee1 = new Employee("Asha","RT2001");
        as.employeeList.add(employee1);
        Employee employee2 = new Employee("Adil","RT2002");
        as.employeeList.add(employee2);
        Employee employee3 = new Employee("Adil","RT2003");
        as.employeeList.add(employee3);
        Employee employee4 = new Employee("Bhavya","RT2004");
        as.employeeList.add(employee4);
        Employee employee5 = new Employee("Kavya","RT2005");
        as.employeeList.add(employee5);
        Employee employee6 = new Employee("Haniya","RT2006");
        as.employeeList.add(employee6);
        while(true){
            System.out.println("======================================");
            System.out.println("1. Create Asset\n2. Delete Asset\n3. Assign asset to Employee");
            System.out.println("4. Return Asset\n5. Scrap an Asset\n6. Update Asset Details");
            System.out.println("7. Print Assets in store\n8. Show all assets\n9. Show Assets assigned to empoyee");
            System.out.println("10. Show Brand\n11. Fetch asset by asset number");
            System.out.println("12 Check if asset assigned\n13. Exit");
            System.out.println("======================================");
            System.out.println("Choose any number to perform operaion\n");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter asset brand Id, name and brand logo");
                    assetbrandId = sc.next();
                    assetbrandName = sc.next();
                    assetbrandLogo = sc.next();
                    AssetBrand newAssetBrand = new AssetBrand(assetbrandId,assetbrandName,assetbrandLogo);
                    System.out.println("Enter asset name,Unique asset number,make,amount and invoice in the same order\n");
                    assetname = sc.next();
                    assetnumber = sc.nextInt();
                    make = sc.next();
                    amount = sc.nextDouble();
                    invoice = sc.next();
                    as.createAsset(assetname, assetnumber,newAssetBrand, make, amount, invoice);

                    break;
                case 2:
                    as.deleteAsset();
                    break;
                case 3:
                    as.assignAssetToEmployee();
                    break;
                case 4:
                    as.returnAsset();
                    break;
                case 5:
                    as.scrapAsset();
                    break;
                case 6:
                    as.updateAsset();
                    break;
                case 7:
                    as.printAsset();
                    break;
                case 8:
                    as.printAllAssets();
                case 9:
                    as.printAssetsOfEmployees();
                    break;
                case (10):
                    as.showBrandDetails();
                    break;
                case 11:
                    as.fetchAssetDetails();
                    break;
                case 12:
                    as.checkAssetAssignedToEmployee();
                    break;
                case (13):
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}


