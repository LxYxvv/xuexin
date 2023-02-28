package com.example.xuexin.entity;

import lombok.Data;
import java.util.Date;

@Data
public class Process {
    /** 申请ID：主键 */
    private Integer id;

    /** 申请发起用户ID：外键 */
    private Integer user_id;

    /** 申请类型：0.认证院校材料，1.认证企业材料，2.认证学生学籍，3.修改学籍申请 */
    private Integer type;

    /** 申请描述 */
    private String  description;

    /** 上交的材料路径 */
    private String material;

    /** 申请时间 */
    private Date time;

    /** 申请状态：0.审核中，1.审核通过，2.审核不通过 */
    private String status;

    /** 处理申请的用户ID */
    private Integer handlersr;


    /** 处理者对申请的操作简述 */
    private String operation;


}
