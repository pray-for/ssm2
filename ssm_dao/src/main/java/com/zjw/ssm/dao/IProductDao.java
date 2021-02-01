package com.zjw.ssm.dao;

import com.zjw.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductDao {

    /**
     * 根据id查询产品
     * @param id
     * @return
     */
    @Select("select * from product where id=#{id}")
    public Product findById(String id) throws Exception;

    /**
     * 查询所有产品信息
     * @return
     * @throws Exception
     */
    @Select("select * from product")
    public List<Product> findAll() throws Exception;

    /**
     * 添加产品数据
     * @param product
     */
    @Insert("insert into product(productNum, productName, cityName, departureTime, productPrice, " +
            "productDesc, productStatus) value (#{productNum}, #{productName}, #{cityName}, #{departureTime}, #{productPrice}, " +
            "#{productDesc}, #{productStatus})")
    void save(Product product);
}
