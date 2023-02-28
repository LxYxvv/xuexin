package com.example.xuexin.entity;

import lombok.Data;

@Data
public class University {
    /** 院校代码：主键 */
    private String code;

    /** 用户ID：外键 */
    private Integer user_id;

    /** 院校名称 */
    private String name;

    /** 办学层次：0.专科，1.本科 */
    private Integer level;

    /** 办学性质：0.民办，1.公办 */
    private Integer nature;

    /** 院校介绍 */
    private String info;



}
