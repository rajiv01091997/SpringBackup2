package com.globallogic.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.globallogic.entity.Book;

public interface Repository extends MongoRepository<Book, Integer> {

}
