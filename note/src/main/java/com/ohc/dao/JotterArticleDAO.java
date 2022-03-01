package com.ohc.dao;

import com.ohc.entity.JotterArticle;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JotterArticleDAO  extends JpaRepository<JotterArticle,Integer> {
    JotterArticle findById(int id);
}
