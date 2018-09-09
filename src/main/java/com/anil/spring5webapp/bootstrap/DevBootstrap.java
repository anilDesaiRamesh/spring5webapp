/**
 * 
 */
package com.anil.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.anil.spring5webapp.model.Author;
import com.anil.spring5webapp.model.Book;
import com.anil.spring5webapp.model.Publisher;
import com.anil.spring5webapp.repositories.AuthorRepository;
import com.anil.spring5webapp.repositories.BookRepository;

/**
 * @author Anil_Ramesh
 *
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;

	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		initData();
	}

	private void initData() {

		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driver Design", "1234");
		Book ddd1 = new Book("Domain Driver Design and Implement", "1234");
		Publisher publisher = new Publisher("DDD", "86", "BrakenWood Mews", "SK9 2QQ", "UK");
		Publisher publisher2 = new Publisher("DDD", "86", "BrakenWood Mews", "SK9 2QQ", "UK");
		ddd.setPublisher(publisher);
		ddd.getAuthors().add(eric);
		eric.getBooks().add(ddd);
		
		ddd1.setPublisher(publisher2);
		ddd1.getAuthors().add(eric);
		eric.getBooks().add(ddd1);
		authorRepository.save(eric);
		bookRepository.save(ddd);
		bookRepository.save(ddd1);

		Author rod = new Author("Rod", "johnson");
		Book noEJB = new Book("J2EE Development without EJB", "23444");
		Publisher publisher1 = new Publisher("JDWE", "87", "Wilmslow", "SK9 2QQ", "UK");
		noEJB.setPublisher(publisher1);
		rod.getBooks().add(noEJB);
		authorRepository.save(rod);
		bookRepository.save(noEJB);

	}
}
