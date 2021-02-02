package com.zjw.ssm.dao;

import com.zjw.ssm.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IRoleDao {

    /**
     * 根据用户id查询出所有对应的角色
     * @param userId
     * @return
     * @throws Exception
     */
    @Select("select * from role where id in (select roleId from users_role where userId = #{userId})")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roleName", column = "roleName"),
            @Result(property = "roleDesc", column = "roleDesc"),
            @Result(property = "permissions", column = "id", javaType = java.util.List.class,
                    many = @Many(select = "com.zjw.ssm.dao.IPermissionDao.findPermissionByRoleId")),
    })
    public List<Role> findRoleByUserId(String userId) throws Exception;

    @Select("select * from role")
    public List<Role> findAll() throws Exception;

    @Insert("insert into role (roleName, roleDesc) values (#{roleName}, #{roleDesc})")
    public void save(Role role);
}
