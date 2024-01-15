package com.bipul;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Form")
public class FormData
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentNo;
    private String courseName;
    private String studentName;
    private String studentEmail;
    private String studentMobile;


}
