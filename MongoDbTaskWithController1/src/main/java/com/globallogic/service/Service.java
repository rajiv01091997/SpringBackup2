package com.globallogic.service;

import java.util.List;

import com.globallogic.dto.BookDto;
import com.globallogic.entity.Book;

public interface Service {
public BookDto insert(BookDto bookDto);
public List<BookDto> fetchAll();
public BookDto fetchById(int id);
public String deleteById(int id);
public BookDto updateById(int id, BookDto bookDto);

}
