package com.ohc.dao;

import com.ohc.entity.AdminPermission;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminPermissionDAO extends JpaRepository<AdminPermission, Integer> {
    AdminPermission findById(int id);
}
