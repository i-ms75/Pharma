package com.example.Pharma.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "\"MEDICINE\"",schema = "public")


public class Medicines
{
    @Id //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"ID\"")
    private Integer id;

    @Column(name = "\"Name\"")
    private String Name;

    @Column(name = "\"Batch_no\"")
    private String Batch_no;


    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:MM:SS")
    @Column(name = "\"Expiry_Date\"")
    private Date Expiry_Date;

    @Column(name = "\"Quantity\"")
    private String Quantity;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:MM:SS")
    @Column(name = "\"Manufacturing_Date\"")
    private Date Manufacturing_Date;

    @Column(name = "\"Wholesale_Rate\"")
    private Integer Wholesale_Rate;

    @Column(name = "\"Retail_Rate_Strip\"")
    private Integer Retail_Rate_Strip;

    @Column(name = "\"Remarks\"")
    private String Remarks;

    @Column(name = "\"Stock_Point\"")
    private String Stock_Point;

    @Column(name = "\"Company_Name\"")
    private String Company_Name;

    @Column(name = "\"Tablet_Per_Strip\"")
    private String Tablet_Per_Strip;

    @Column(name = "\"Free_Quantity\"")
    private String Free_Quantity;

    @Column(name = "\"Retail_Per_Tablet\"")
    private String Retail_Per_Tablet;

    @Column(name = "\"Payment\"")
    private String Payment;

    @Column(name = "\"Bill_No\"")
    private String Bill_No;

    @Column(name = "\"Purchased_On\"")
    private Date Purchased_On;

    @Column(name = "\"Payment_On_Purchase\"")
    private String Payment_On_Purchase;




    //@Column(name = "\"Row_Created_Date\"")
    //private Date createdDate;

}






