package com.ohc.dao;

import com.ohc.pojo.Book;
import com.ohc.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2022/1/23 13:51
 */
public interface BookDAO extends JpaRepository<Book,Integer> {
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
}

