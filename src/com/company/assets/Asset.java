package com.company.assets;

public class Asset {
    public  String assetName;
    public int assetNumber;
    public AssetBrand brand;
    public String assetMake;
    public double assetAmount;
    public String assetInvoice;

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }
    public void setAssetNumber(int assetNumber) {
        this.assetNumber = assetNumber;
    }
    public void setBrand(AssetBrand brand){
        this.brand = brand;
    }
    public void setAssetMake(String assetMake) {
        this.assetMake = assetMake;
    }
    public void setAssetAmount(double assetAmount) {
        this.assetAmount = assetAmount;
    }
    public void setAssetInvoice(String assetInvoice) {
        this.assetInvoice = assetInvoice;
    }

    public String getAssetName() {
        return assetName;
    }
    public int getAssetNumber() {
        return assetNumber;
    }
    public AssetBrand getBrand() {
        return brand;
    }
    public String getAssetMake() {
        return assetMake;
    }
    public double getAssetAmount() {
        return assetAmount;
    }
    public String getAssetInvoice() {
        return assetInvoice;
    }
}
