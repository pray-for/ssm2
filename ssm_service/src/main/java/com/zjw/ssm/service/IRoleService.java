package com.zjw.ssm.service;

import com.zjw.ssm.domain.Permission;
import com.zjw.ssm.domain.Role;

import java.util.List;

public interface IRoleService {

    public List<Role> findAll() throws Exception;

    public void save(Role role) throws Exception;

    public Role findById(String roleId) throws Exception;

    public List<Permission> findOtherPermission(String roleId) throws Exception;

    public void addPermissionToRole(String roleId, String[] permissionIds) throws Exception;
}
