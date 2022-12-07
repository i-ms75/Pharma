package com.example.Pharma.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MedicineEntry
{
    private Integer id;
    private String Name;
    private String Batch_no;
    private String Expiry_Date;
    private String Quantity;
    private String Manufacturing_Date;
    private String Wholesale_Rate;
    private String Retail_Rate_Strip;
    private String Remarks;
    private String Stock_Point;
    private String Company_Name;
    private String Tablet_Per_Strip;
    private String Free_Quantity;
    private String Retail_Per_Tablet;
    private String Payment;
    private String Bill_No;
    private String Purchased_On;
    //private String Payment_On_Purchase;
    private Boolean chk;


}
