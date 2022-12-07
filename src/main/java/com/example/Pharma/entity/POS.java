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
@Table(name = "\"POS\"",schema = "public")
@Entity
public class POS
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
    @Column(name = "\"Date\"")
    private Date Date;



}
