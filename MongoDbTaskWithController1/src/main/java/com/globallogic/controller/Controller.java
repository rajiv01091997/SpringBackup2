package com.globallogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.dto.BookDto;
import com.globallogic.entity.Book;
import com.globallogic.repo.Repository;
import com.globallogic.service.Service;
import com.globallogic.service.ServiceImpl;
@RestController
@RequestMapping("/api/mongo")
public class Controller
{   @Autowired
	private Service service;
	@PostMapping("/book")
	public ResponseEntity<BookDto> addBook( @RequestBody  BookDto bookDto)
	{
		//return service.insert(bookDto);
		return new ResponseEntity<BookDto>(service.insert(bookDto), HttpStatus.OK);
	}
	@GetMapping("/book")
	public ResponseEntity<List<BookDto>> getAll()
	{
		return new ResponseEntity<List<BookDto>>(service.fetchAll(),HttpStatus.OK);
	}
	@GetMapping("/book/{id}")
	public ResponseEntity<BookDto> getById(@PathVariable int id)
	{
		return new ResponseEntity<BookDto>(service.fetchById(id), HttpStatus.OK);
	}
	@DeleteMapping("/book/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id)
	{
		return new ResponseEntity<String>(service.deleteById(id),HttpStatus.OK);
	}
	@PutMapping("/book/{id}")
	public ResponseEntity<BookDto> updateById(@PathVariable  int id, @RequestBody BookDto bookDto)
	{ 
		return new ResponseEntity<BookDto>(service.updateById(id, bookDto),HttpStatus.OK);
	}
}