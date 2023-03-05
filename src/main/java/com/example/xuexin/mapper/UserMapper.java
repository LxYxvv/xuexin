package com.example.xuexin.mapper;

import com.example.xuexin.entity.User;
import org.apache.ibatis.annotations.*;

/**
 * 用户操作接口
 */
@Mapper
public interface UserMapper {
    // 手机号查询用户
    @Select("select * from user where user_phone = #{phone}")
    @Results(id = "userMap",
            value = {
            @Result(column = "user_id", property = "id", id = true),
            @Result(column = "user_password", property = "password"),
            @Result(column = "user_name", property = "name"),
            @Result(column = "user_idnumber", property = "id_number"),
            @Result(column = "user_phone", property = "phone"),
            @Result(column = "user_e-mail", property = "email"),
            @Result(column = "user_role", property = "role"),
            @Result(column = "user_authentication", property = "authentication")
    })
    public User findUserByPhone(String phone);

    // 身份证查询用户
    @Select("select * from user where user_idnumber = #{id_number}")
    @ResultMap("userMap")
    User findByIdNumber(String id_number);

    // 新增用户
    @Insert("insert into user values(5,#{password},#{name},#{id_number},#{phone},#{email},0,0)")
    void save(User user);

    // 操作认证表
    @Update({ "update user set user_authentication = #{authentication},user_role = #{role} where user_id = #{id}" })
    void saveRole(User user);
}

