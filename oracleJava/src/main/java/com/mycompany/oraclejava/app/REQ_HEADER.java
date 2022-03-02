/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oraclejava.app;

/**
 *
 * @author Erick
 */
public class REQ_HEADER {

String PR_Header_ID; 
String Status_CD;
String Description;
String Requestor_CD;
String Required_By_Date;
String Buyer_CD;
String Vendor_ID;

    public REQ_HEADER(String PR_Header_ID, String Status_CD, String Description, String Requestor_CD, String Required_By_Date, String Buyer_CD, String Vendor_ID) {
        this.PR_Header_ID = PR_Header_ID;
        this.Status_CD = Status_CD;
        this.Description = Description;
        this.Requestor_CD = Requestor_CD;
        this.Required_By_Date = Required_By_Date;
        this.Buyer_CD = Buyer_CD;
        this.Vendor_ID = Vendor_ID;
    }

    public String getVendor_ID() {
        return Vendor_ID;
    }

    public void setVendor_ID(String Vendor_ID) {
        this.Vendor_ID = Vendor_ID;
    }

    public String getPR_Header_ID() {
        return PR_Header_ID;
    }

    public void setPR_Header_ID(String PR_Header_ID) {
        this.PR_Header_ID = PR_Header_ID;
    }

    public String getStatus_CD() {
        return Status_CD;
    }

    public void setStatus_CD(String Status_CD) {
        this.Status_CD = Status_CD;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getRequestor_CD() {
        return Requestor_CD;
    }

    public void setRequestor_CD(String Requestor_CD) {
        this.Requestor_CD = Requestor_CD;
    }

    public String getRequired_By_Date() {
        return Required_By_Date;
    }

    public void setRequired_By_Date(String Required_By_Date) {
        this.Required_By_Date = Required_By_Date;
    }

    public String getBuyer_CD() {
        return Buyer_CD;
    }

    public void setBuyer_CD(String Buyer_CD) {
        this.Buyer_CD = Buyer_CD;
    }


    
}
