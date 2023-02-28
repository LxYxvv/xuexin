package com.example.xuexin.entity;

import lombok.Data;


@Data
public class Enterprise {

    /** 用户ID：外键 */
    private Integer user_id;

    /** 企业名称 */
    private String name;
}
