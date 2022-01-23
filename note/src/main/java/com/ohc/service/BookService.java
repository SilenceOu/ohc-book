package com.ohc.service;

import com.ohc.dao.BookDAO;
import com.ohc.pojo.Book;
import com.ohc.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2022/1/23 13:53
 */
@Service
public class BookService {
    @Autowired
    BookDAO bookDAO;
    @Autowired
    CategoryService categoryService;

    public List<Book> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return bookDAO.findAll(sort);
    }

    public void addOrUpdate(Book book) {
        bookDAO.save(book);
    }

    public void deleteById(int id) {
        bookDAO.deleteById(id);
    }

    public List<Book> listByCategory(int cid) {
        Category category = categoryService.get(cid);
        return bookDAO.findAllByCategory(category);
    }

    public List<Book> Search(String keywords) {
        return bookDAO.findAllByTitleLikeOrAuthorLike('%' + keywords + '%', '%' + keywords + '%');
    }

}

