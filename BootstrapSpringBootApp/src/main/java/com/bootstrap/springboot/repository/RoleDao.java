package com.bootstrap.springboot.repository;

import com.bootstrap.springboot.domain.Role;

import java.util.List;

public interface RoleDao {

    Role findRoleByName(String name);

    List<Role> findAllRoles();
}
