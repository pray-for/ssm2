package com.zjw.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.zjw.ssm.dao.IOrdersDao;
import com.zjw.ssm.domain.Orders;
import com.zjw.ssm.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAll(int page, int size) throws Exception {
        //参数分别表示：页码值、每页显示的条数
        PageHelper.startPage(page,size);
        return ordersDao.findAll();
    }
}
