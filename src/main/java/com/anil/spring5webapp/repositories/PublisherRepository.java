/**
 * 
 */
package com.anil.spring5webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.anil.spring5webapp.model.Publisher;

/**
 * @author Anil_Ramesh
 *
 */
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
