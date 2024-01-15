package com.bipul.entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;

    @Column(name = "BookName_column")
    private String bookName;

    @Column(name="BookAuthor_column")
    private String bookAuthor;
    private String bookType;
}
