package com.example.xuexin.entity;

import lombok.Data;

@Data
public class User {
    /** 用户ID：主键 */
    private Integer id;

    /** 用户密码 */
    public String password;

    /** 用户姓名 */
    private String name;

    /** 用户身份证 */
    private String id_number;

    /** 用户手机联系方式 */
    private String phone;

    /** 用户电子邮箱 */
    private String email;

    /** 用户角色：0.未认证，1.学生，2.院校，3.企业，4.管理 */
    private Integer role;

    /** 用户认证状态 ：0.审核中，1.审核通过，2.审核不通过 */
    private Integer authentication;
}