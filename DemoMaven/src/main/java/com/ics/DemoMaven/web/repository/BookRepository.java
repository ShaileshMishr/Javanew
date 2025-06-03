package com.ics.DemoMaven.web.repository;

import java.util.Set;

import com.ics.DemoMaven.support.jpa.CustomJpaRepository;
import com.ics.DemoMaven.web.entity.Book;

/**
 * <b>Book Repository</b><br>
 * You can use NamedQuery or Query annotation here.<br>
 * 
 * 
 * @author Wenbo Wang (jackie-1685@163.com)
 */
public interface BookRepository extends CustomJpaRepository<Book, Long> {

	public Book findByBookName(String bookName);

	public Set<Book> findByBookAuthors_Author_Id(Long authorId);
}
