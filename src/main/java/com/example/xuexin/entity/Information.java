package com.example.xuexin.entity;

import lombok.Data;
import java.util.Date;

@Data
public class Information {
    /** 学籍ID：主键*/
    private Integer id;

    /** 院校代码：外键 */
    private String university_code;

    /** 用户ID：外键 */
    private Integer user_id;

    /** 用户身份证：外键 */
    private String user_idnumber;

    /** 院系 */
    private String department;

    /** 专业 */
    private String specialty;

    /** 班级 */
    private String classes;

    /** 学号 */
    private String number;

    /** 学制 */
    private String length;

    /** 学历类别:0.普通统招，1.专升本，2.成人高考，3.自学 */
    private Integer education;

    /** 学习形式:0.全日制、1.非全日制 */
    private Integer study;

    /**学习分院:没有则默认学校名称 */
    private String division;

    /**入学时间 */
    private Date enrollment;

    /**预计毕业时间 */
    private Date graduation;

    /**学籍状态:1.在籍，1.休学，2.退学，3.保留 */
    private Integer status;

    /**录入时间 */
    private Date input;

    /**上次修改时间 */
    private Date update;











}
