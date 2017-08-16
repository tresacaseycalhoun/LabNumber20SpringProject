package com.test.util;

public class customer {

    private String customerID;
    private String companyName;

    public customer() {
        customerID="";
        companyName="";
    }

    public customer(String customerID, String companyName) {
        this.customerID = customerID;
        this.companyName = companyName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
