package com.example.xuexin.entity;

import lombok.Data;
import java.util.Date;

@Data
public class Student {
    /** 用户ID */
    private Integer id;

    /** 学生性别：0.男性，1.女性 */
    private Integer sex;

    /** 学生民族 */
    private String nationality;

    /** 学生出生日期 */
    private Date birthday;

    /** 学生政治面貌 */
    private String politics_status;











}
