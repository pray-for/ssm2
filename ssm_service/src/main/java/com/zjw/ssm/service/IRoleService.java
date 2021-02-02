package com.zjw.ssm.service;

import com.zjw.ssm.domain.Role;

import java.util.List;

public interface IRoleService {

    public List<Role> findAll() throws Exception;

    public void save(Role role) throws Exception;
}
