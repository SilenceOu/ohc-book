package com.ohc.service;

import com.ohc.dao.CategoryDAO;
import com.ohc.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;


/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2022/1/23 13:52
 */
@Service
public class CategoryService {
    @Autowired
    CategoryDAO categoryDAO;

    public List<Category> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return categoryDAO.findAll(sort);
    }

    public Category get(int id) {
        Category c= categoryDAO.findById(id).orElse(null);
        return c;
    }
}
