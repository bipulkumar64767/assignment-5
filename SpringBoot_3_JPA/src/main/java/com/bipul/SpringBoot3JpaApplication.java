package com.bipul;

import com.bipul.entity.Book;
import com.bipul.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.*;

@SpringBootApplication
public class SpringBoot3JpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBoot3JpaApplication.class, args);
		BookRepository repo;
		repo = context.getBean(BookRepository.class);

		Book b1 = new Book();
		//b1.setBookId(4);
//		b1.setBookAuthor("Chaman Singh");
//		b1.setBookName("Chaman effect");
//		b1.setBookType("Religious");
//
//		//saving single entity into a database.
//		repo.save(b1);

		if(repo.existsById(402)) {
			repo.deleteById(402);
		}
		else {
			System.out.println("Book with this id doesnot exist");
		}
//		ArrayList<Book> al= (ArrayList<Book>) repo.findAll();
//		System.out.println(al);
//
//		//custum query
//		ArrayList<Book> al2 = (ArrayList<Book>) repo.allBooksRecords();
//		System.out.println(al2);

//		//custum query this is not working check this.
//		Book al5 =repo.getbookbyid(3);
//		System.out.println(al5);

		//findByMethod example
		//Book al3 =repo.findByBookName("Dohe");
		List<Book> al4 = repo.findAllByBookName("Raman effect");
		//System.out.println(al3);
		System.out.println(al4);

		List<String> demoList = new LinkedList<>();

		//findByMethod example

	}

}
