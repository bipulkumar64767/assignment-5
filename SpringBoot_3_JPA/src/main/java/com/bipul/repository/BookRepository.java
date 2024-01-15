package com.bipul.repository;

import com.bipul.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book,Integer>
{

    //findByMethod Query
    public Book findByBookName(String bookName);

    List<Book> findAllByBookName(String bookName);


    //custom Query
    @Query(value = "SELECT * FROM book", nativeQuery = true)
     public List<Book> allBooksRecords();

    @Query(value = "SELECT * FROM book WHERE book_id = :book_id" , nativeQuery = true  )
    public Book getbookbyid(int book_id );
}
