package com.ohc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ohc.entity.Category;


public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
