package com.klinnovations.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klinnovations.binding.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {

}
