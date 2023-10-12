package com.globallogic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.globallogic.Exceptions.IdNotFoundException;
import com.globallogic.dto.BookDto;
import com.globallogic.entity.Book;
import com.globallogic.repo.Repository;
@org.springframework.stereotype.Service
public class ServiceImpl implements Service{
	@Autowired
	private Repository repository;
	@Override
	public BookDto insert(BookDto bookDto) {
		// TODO Auto-generated method stub
		Book book=convertToEntity(bookDto);
		repository.save(book);
		return bookDto;
	}

	@Override
	public List<BookDto> fetchAll() {
		// TODO Auto-generated method stub
		List<BookDto> list=new ArrayList<>();
		List<Book> book=repository.findAll();
		for(Book bk:book)
		{
			BookDto bookDto=convertToDto(bk);
			list.add(bookDto);
		}
		return list;
	}

	@Override
	public BookDto fetchById(int id) {
		// TODO Auto-generated method stub
		if(repository.findById(id).isEmpty())
			throw new IdNotFoundException("Book with id "+id+" does not exist in DB");
		return convertToDto(repository.findById(id).get());
		
				
	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		return "Deleted Successfully";
	}

	@Override
	public BookDto updateById(int id, BookDto bookDto) {
		// TODO Auto-generated method stub
		Book previousBook=repository.findById(id).get();
	    previousBook.setAuthor(bookDto.getAuthor());
	    previousBook.setTitle(bookDto.getTitle());
	    repository.save(previousBook);
		return convertToDto(previousBook);
	}
	public Book convertToEntity(BookDto bookDto)
	{
		Book book=new Book();
		book.setId(bookDto.getId());
		book.setTitle(bookDto.getTitle());
		book.setAuthor(bookDto.getAuthor());
		return book;
	}
	public BookDto convertToDto(Book book)
	{
		BookDto bookDto=new BookDto();
		bookDto.setId(book.getId());
		bookDto.setTitle(book.getTitle());
		bookDto.setAuthor(book.getAuthor());
		return bookDto;
	}

}
