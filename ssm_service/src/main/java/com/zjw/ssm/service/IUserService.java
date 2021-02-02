package com.zjw.ssm.service;

import com.zjw.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {


    public List<UserInfo> findAll() throws Exception;

    public void save(UserInfo userInfo) throws Exception;

    public UserInfo findById(String id) throws Exception;
}
