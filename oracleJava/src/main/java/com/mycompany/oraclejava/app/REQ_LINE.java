/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oraclejava.app;

/**
 *
 * @author Erick
 */
public class REQ_LINE {

String PR_Line_ID;
String PR_Header;
String Status_CD;
String Description;
Long Quantity;
Long Unit_Price;

    public String getPR_Line_ID() {
        return PR_Line_ID;
    }

    public void setPR_Line_ID(String PR_Line_ID) {
        this.PR_Line_ID = PR_Line_ID;
    }

    public String getPR_Header() {
        return PR_Header;
    }

    public void setPR_Header(String PR_Header) {
        this.PR_Header = PR_Header;
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

    public Long getQuantity() {
        return Quantity;
    }

    public void setQuantity(Long Quantity) {
        this.Quantity = Quantity;
    }

    public Long getUnit_Price() {
        return Unit_Price;
    }

    public void setUnit_Price(Long Unit_Price) {
        this.Unit_Price = Unit_Price;
    }



    
}
