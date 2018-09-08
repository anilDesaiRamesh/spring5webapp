/**
 * 
 */
package com.anil.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.anil.spring5webapp.model.Book;

/**
 * @author Anil_Ramesh
 *
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
