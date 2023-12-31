package com.example.criteria;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
class BookRepositoryImpl implements BookRepositoryCustom {

    EntityManager em;

    // constructor

    @Override
    public List<Book> findBooksByAuthorNameAndTitle(String authorName, String title) {
        // implementation
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Book> cq = cb.createQuery(Book.class);

        Root<Book> book = cq.from(Book.class);
        List<Predicate> predicates = new ArrayList<>();

        if(authorName != null){
            predicates.add(cb.equal(book.get("author"), authorName));
        }
        if(title != null){
            predicates.add(cb.like(book.get("title"), "%" + title + "%"));
        }
        cq.where(predicates.toArray(new Predicate[0]));
        return em.createQuery(cq).getResultList();
    }

}