package com.ohc.dao;

import com.ohc.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * @Author: SilenceOu
 * @Date: 2022/1/23 13:52
 */

public interface CategoryDAO extends JpaRepository<Category, Integer> {

}
