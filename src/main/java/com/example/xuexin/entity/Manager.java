package com.example.xuexin.entity;

import lombok.Data;

@Data
public class Manager {
    /** 用户ID：外键 */
    private Integer user_id;

    /** 管理权限 */
    public Integer job;
}
