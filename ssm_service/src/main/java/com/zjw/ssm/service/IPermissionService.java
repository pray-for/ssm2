package com.zjw.ssm.service;

import com.zjw.ssm.domain.Permission;

import java.util.List;

public interface IPermissionService {

    public List<Permission> findAll() throws Exception;

    public void save(Permission permission) throws Exception;
}
