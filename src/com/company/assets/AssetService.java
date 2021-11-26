package com.company.assets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssetService {
    public  List<Asset> assetList = new ArrayList<Asset>();
    public  List<Employee> employeeList = new ArrayList<Employee>();

    Scanner sc = new Scanner(System.in);
    public void createAsset(String name,int number, AssetBrand brand, String make, double amount, String invoice){
        Asset asset = new Asset();
        asset.assetName = name;
        asset.assetNumber = number;
        asset.brand = brand;
        asset.assetMake = make;
        asset.assetAmount = amount;
        asset.assetInvoice = invoice;

        assetList.add(asset);
    }

    public void printAsset(){
        if(assetList.isEmpty() == false) {
            assetList.forEach(var -> {
                System.out.println("\nAsset Name-" + var.assetName);
                System.out.println("\nAsset Number-" + var.assetNumber);
                System.out.println("\nAsset Brand Id-" + var.brand.brandId);
                System.out.println("\tAsset Brand Name-" + var.brand.brandName);
                System.out.println("\tAsset Brand Logo-" + var.brand.brandLogo);
                System.out.println("\nAsset Make-" + var.assetMake);
                System.out.println("\nAsset Amount-" + var.assetAmount);
                System.out.println("\nAsset Invoice-" + var.assetInvoice + "\n");
            });
        }
        else {
            System.out.println("No asset in store");
        }
    }

    public void printAssetsOfEmployees(){
        try {
            for (Employee e : employeeList) {
                if (e.employeeAsset == null) {
                    continue;
                } else {
                    System.out.println("\nAsset Name-" + e.employeeAsset.assetName);
                    System.out.println("\nAsset Number-" + e.employeeAsset.assetNumber);
                    System.out.println("\nAsset Brand Id-" + e.employeeAsset.brand.brandId);
                    System.out.println("\tAsset Brand Name-" + e.employeeAsset.brand.brandName);
                    System.out.println("\tAsset Brand Logo-" + e.employeeAsset.brand.brandLogo);
                    System.out.println("\nAsset Make-" + e.employeeAsset.assetMake);
                    System.out.println("\nAsset Amount-" + e.employeeAsset.assetAmount);
                    System.out.println("\nAsset Invoice-" + e.employeeAsset.assetInvoice + "\n");
                }
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void deleteAsset() {
        int assetnumber;
        int indexOfAsset = 0, indexForAsset = 0;
        if(assetList.isEmpty() == false) {
        printAsset();
        System.out.println("Enter Asset number to delete asset");
        assetnumber = sc.nextInt();
            for (Asset a : assetList) {
                if (assetnumber == (a.assetNumber)) {
                    indexOfAsset = indexForAsset;
                    break;
                }
                indexForAsset++;
            }
            assetList.remove(indexOfAsset);
        }
        else {
            System.out.println("Asset list is empty!!!");
        }
    }

    public void assignAssetToEmployee() {
        int numberAsset;
        String empNumber, assetbrandName, assetbrandId, assetbrandLogo;
        String assetname,make,invoice;
        double amount;
        boolean assetpresent = false;
        int index = 0,indexForAsset = 0, indexOfAsset = 0, indexOfEmployee = 0;
        //Asset asset;
        employeeList.forEach(var->{
            System.out.println("\nEmployee Name-"+var.getEmployeeName());
            System.out.println("\nEmployee Number-"+var.getEmployeeNumber());
            System.out.println("\nEmployee Asset Details-");
            assetList.forEach(i->{
                if(var.employeeAsset != null) {
                    System.out.println("\nAsset Name-" +i.assetName);
                    System.out.println("\nAsset Number-" + i.assetNumber);
                    System.out.println("\nAsset Brand Id-" + i.brand.brandId);
                    System.out.println("\tAsset Brand Name-" + i.brand.brandName);
                    System.out.println("\tAsset Brand Logo-" + i.brand.brandLogo);
                    System.out.println("\nAsset Make-" + i.assetMake);
                    System.out.println("\nAsset Amount-" + i.assetAmount);
                    System.out.println("\nAsset Invoice-" + i.assetInvoice + "\n");
                }

            });
        });
        for(Employee e:employeeList){
           System.out.println(e.getEmployeeNumber());
        }
        System.out.println("Enter employee number to assign asset\n");
        empNumber = sc.next();
        for(Employee e : employeeList) {
            if (empNumber.equalsIgnoreCase(e.employeeNumber)) {
                indexOfEmployee = index;
                break;
            }
            index++;
        }
        System.out.println("Enter asset number\n");
        numberAsset = sc.nextInt();

        for(Asset a : assetList) {
            if (numberAsset == (a.assetNumber)) {
                    assetpresent = true;
                    indexOfAsset = indexForAsset;
                    break;
                }

            indexForAsset++;
        }
        if(!assetpresent) {
            System.out.println("Enter asset brand Id, name and brand logo\n");
            assetbrandId = sc.next();
            assetbrandName = sc.next();
            assetbrandLogo = sc.next();
            System.out.println("Enter asset name,make,amount and invoice in the same order\n");
            assetname = sc.next();
            make = sc.next();
            amount = sc.nextDouble();
            invoice = sc.next();

            AssetBrand newAssetBrand = new AssetBrand(assetbrandName,assetbrandId,assetbrandLogo);
            createAsset(assetname, numberAsset, newAssetBrand, make, amount, invoice);
            Employee emp = employeeList.get(indexOfEmployee);
            Asset a = assetList.get(assetList.size()-1);
            emp.setEmployeeAsset(a);
            assetList.remove(indexOfAsset);
        }
        else {
            Employee emp = employeeList.get(indexOfEmployee);
            Asset a = assetList.get(indexOfAsset);
            emp.setEmployeeAsset(a);
            assetList.remove(indexOfAsset);
        }
    }

    public void returnAsset() {
        String employNumber;
        int indexOfEmployee = 0, index =0;
        employeeList.forEach(var->{
            System.out.println(var.getEmployeeName());
            System.out.println(var.getEmployeeNumber());
            if(var.employeeAsset != null) {
                System.out.println(var.employeeAsset.getAssetName());
                System.out.println(var.employeeAsset.getAssetNumber());
                System.out.println(var.employeeAsset.brand.brandId);
                System.out.println(var.employeeAsset.brand.brandLogo);
                System.out.println(var.employeeAsset.brand.brandLogo);
                System.out.println(var.employeeAsset.getAssetMake());
                System.out.println(var.employeeAsset.getAssetAmount());
                System.out.println(var.employeeAsset.getAssetInvoice());
            }
            else{
                System.out.println(var.getEmployeeAsset());
            }
        });
        System.out.println("Enter employee number to return asset back to store\n");
        employNumber = sc.next();
        for(Employee e : employeeList) {
            if (employNumber.equalsIgnoreCase(e.employeeNumber)) {
                indexOfEmployee = index;
                break;
            }
            index++;
        }
        Employee e = employeeList.get(indexOfEmployee);
        Asset a = e.getEmployeeAsset();
        if(e.getEmployeeAsset() != null) {
            e.employeeAsset = null;
            assetList.add(a);
        }
        else {
            System.out.println("No asset is present");
        }
    }

    public void scrapAsset() {
        int assetnumber;
        int indexOfAsset = 0, indexForAsset = 0;
        printAsset();
        System.out.println("Enter Asset number of a damaged asset to scrap it\n");
        assetnumber = sc.nextInt();
        for(Asset a : assetList) {
            if (assetnumber==(a.assetNumber)) {
                    indexOfAsset = indexForAsset;
                    break;
            }
            indexForAsset++;
        }
        assetList.remove(indexOfAsset);
    }

    public void updateAsset() {
        int assetnumber,newAssetNumber;
        String empNumber, assetbrandName, assetbrandId, assetbrandLogo;
        String assetname,make,invoice;
        double amount;
        int indexOfAsset = 0, indexForAsset = 0;
        printAsset();
        System.out.println("Enter Asset number to update the details.\n");
        assetnumber = sc.nextInt();
        for(Asset a : assetList) {
            if (assetnumber==(a.assetNumber)) {
                indexOfAsset = indexForAsset;
                break;
            }
            indexForAsset++;
        }
        Asset newAsset = assetList.get(indexOfAsset);
        System.out.println("Enter new Asset number.\n");
        newAssetNumber = sc.nextInt();
        newAsset.setAssetNumber(newAssetNumber);
        System.out.println("Enter new Asset name.\n");
        assetname = sc.next();
        newAsset.setAssetName(assetname);
        System.out.println("Enter new Asset brand id,brand name and logo.\n");
        assetbrandId = sc.next();
        assetbrandName = sc.next();
        assetbrandLogo = sc.next();
        AssetBrand newAssetBrand = new AssetBrand(assetbrandId, assetbrandName, assetbrandLogo);
        newAsset.setBrand(newAssetBrand);
        System.out.println("Enter new Asset make,amount and invoice.\n");
        make = sc.next();
        amount = sc.nextDouble();
        invoice = sc.next();
        newAsset.setAssetMake(make);
        newAsset.setAssetAmount(amount);
        newAsset.setAssetInvoice(invoice);
    }

    public void printAllAssets(){
        printAsset();
        printAssetsOfEmployees();
    }

    public void showBrandDetails() {
        assetList.forEach(var->{
            System.out.println("\nAsset Brand Id-"+var.brand.brandId);
            System.out.println("\tAsset Brand Name-"+var.brand.brandName);
            System.out.println("\tAsset Brand Logo-"+var.brand.brandLogo+"\n");
        });
    }

    public void fetchAssetDetails() {
        int assetnumber;
        int indexOfAsset = 0, indexForAsset = 0,indexofEmployee = 0,indexForEmployee = 0;
        boolean present = false;
        System.out.println("Enter Asset number to fetch the details");
        assetnumber =  sc.nextInt();
        System.out.println("The Asset details are\n");
        try {
            for (Asset a : assetList) {
                if (assetnumber == (a.getAssetNumber())) {
                    indexOfAsset = indexForAsset;
                    present = true;
                    break;
                }
                indexForAsset++;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        if(present) {
            Asset a = assetList.get(indexOfAsset);
            System.out.println("\nAsset Name-" + a.assetName);
            System.out.println("\nAsset Number-" + a.assetNumber);
            System.out.println("\nAsset Brand Id-" + a.brand.brandId);
            System.out.println("\tAsset Brand Name-" + a.brand.brandName);
            System.out.println("\tAsset Brand Logo-" + a.brand.brandLogo);
            System.out.println("\nAsset Make-" + a.assetMake);
            System.out.println("\nAsset Amount-" + a.assetAmount);
            System.out.println("\nAsset Invoice-" + a.assetInvoice + "\n");
        }
        if(!present){
            try {
                for (Employee e : employeeList) {
                    if(e.employeeAsset == null){
                        continue;
                    }
                    if (assetnumber == e.employeeAsset.getAssetNumber()) {
                        indexofEmployee = indexForEmployee;
                        break;
                    }
                    indexForEmployee++;
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            Employee a = employeeList.get(indexofEmployee);
            System.out.println("\nAsset Name-" + a.employeeAsset.getAssetName());
            System.out.println("\nAsset Number-" + a.employeeAsset.getAssetNumber());
            System.out.println("\nAsset Brand Id-" + a.employeeAsset.brand.brandId);
            System.out.println("\tAsset Brand Name-" + a.employeeAsset.brand.brandName);
            System.out.println("\tAsset Brand Logo-" + a.employeeAsset.brand.brandLogo);
            System.out.println("\nAsset Make-" + a.employeeAsset.getAssetMake());
            System.out.println("\nAsset Amount-" + a.employeeAsset.getAssetAmount());
            System.out.println("\nAsset Invoice-" + a.employeeAsset.getAssetInvoice() + "\n");
        }
    }

    public void checkAssetAssignedToEmployee(){
        int assetnumber;
        String empNumber, empName;
        int indexOfEmployee = 0, index = 0;
        boolean present = false;
        System.out.println("Enter asset number to check whether it is assigned to any employee\n");
        assetnumber =  sc.nextInt();
        for(Employee e : employeeList) {
            if (assetnumber == (e.employeeAsset.getAssetNumber())) {
                indexOfEmployee = index;
                present = true;
                break;
            }
            index++;
        }
        if(present){
            System.out.println("The given asset number is assined to employee number-");
            Employee e = employeeList.get(indexOfEmployee);
            empName = e.getEmployeeName();
            empNumber = e.getEmployeeNumber();
            System.out.println(empNumber+"\t"+empName+"\n");
        }
        else{
            System.out.println("The given asset number is not assigned to any employee\n");
        }
    }

}

