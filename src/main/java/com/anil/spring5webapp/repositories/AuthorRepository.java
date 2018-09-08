/**
 * 
 */
package com.anil.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.anil.spring5webapp.model.Author;

/**
 * @author Anil_Ramesh
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
