package com.zjw.ssm.service;

import com.zjw.ssm.domain.Orders;

import java.util.List;

public interface IOrdersService {

    List<Orders> findAll(int page, int size) throws Exception;
}
