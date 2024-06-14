package com.example.assignment1bscaffold;

public class Vendor {
    private String name;
    private String serviceType;
    private String contactInfo;
    private String contractDetails;

    public Vendor(String name, String serviceType, String contactInfo, String contractDetails) {
        this.name = name;
        this.serviceType = serviceType;
        this.contactInfo = contactInfo;
        this.contractDetails = contractDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(String contractDetails) {
        this.contractDetails = contractDetails;
    }

}
