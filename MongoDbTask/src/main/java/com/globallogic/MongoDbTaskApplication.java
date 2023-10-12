package com.globallogic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.globallogic.entity.Book;
import com.globallogic.repo.Repository;

@SpringBootApplication
public class MongoDbTaskApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MongoDbTaskApplication.class, args);
	}
	@Autowired
    private Repository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Book book1=new Book(1,"Java:the complete reference","Herbert schildt");
		repository.save(book1);
		Book book2=new Book(2,"think python","guido von rasom");
		repository.save(book2);
		Book book3=new Book(3,"head first java","james gosling");
		repository.save(book3);
		System.out.println("Inserted");
		System.out.println("======fetching all==========");
		List<Book> bk=repository.findAll();
		for(Book book:bk)
		{
			System.out.println(book);
		}
		System.out.println("===========fetching using id===========");
		System.out.println(repository.findById(2).get());
		System.out.println("===========delete using id==============");
		repository.deleteById(3);
		System.out.println("Deleted");
		System.out.println("======fetching all after deletion==========");
		List<Book> bk1=repository.findAll();
		for(Book book:bk1)
		{
			System.out.println(book);
		}
		System.out.println("==============updating=====================");
		Book book4=new Book(2,"Think python","Guido rosom");
		repository.save(book4);
		System.out.println("updated");
		
		
		
	}

}
