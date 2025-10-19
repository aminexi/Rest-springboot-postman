package com.spring.demo.dao;



import com.spring.demo.service.model.Article;

import java.util.List;
public interface IDao {
    Article findById(Long id);
    List<Article> findAll();
    void save(Article article);
    void deleteById(Long id);
}
