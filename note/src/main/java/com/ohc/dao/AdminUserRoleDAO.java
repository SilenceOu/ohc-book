package com.ohc.dao;

import com.ohc.entity.AdminUserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface AdminUserRoleDAO extends JpaRepository<AdminUserRole,Integer> {
    List<AdminUserRole> findAllByUid(int uid);
    void deleteAllByUid(int uid);
}
