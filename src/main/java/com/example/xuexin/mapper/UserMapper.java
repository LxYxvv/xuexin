package com.example.xuexin.mapper;

import com.example.xuexin.entity.User;
import org.apache.ibatis.annotations.*;

/**
 * 用户操作接口
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where user_phone = #{phone}")
    @Results({
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
}