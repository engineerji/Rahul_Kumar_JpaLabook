package com.rahul.jpalabbook.dao;

import com.rahul.jpalabbook.entities.Author;

public interface IAuthorDao {

	String addAuthor(Author author);
	String updateAuthor(Author author);
	String deleteAuthor(int authorId);
	Author fetch(int authorId);
}
