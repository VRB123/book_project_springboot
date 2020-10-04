package com.assesment.bookproject.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assesment.bookproject.books;


@Repository
public interface bookRepository extends JpaRepository<books, String> {

	

}
