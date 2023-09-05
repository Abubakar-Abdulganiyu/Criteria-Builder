package com.example.criteria;

import java.util.List;

interface BookRepositoryCustom {
    List<Book> findBooksByAuthorNameAndTitle(String authorName, String title);
}