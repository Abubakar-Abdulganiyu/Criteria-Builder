package com.example.criteria;

import org.springframework.data.jpa.repository.JpaRepository;

interface BookRepository extends JpaRepository<Book, Long>, BookRepositoryCustom {}