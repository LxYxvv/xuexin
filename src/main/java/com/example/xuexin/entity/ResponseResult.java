package com.example.xuexin.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
public class ResponseResult implements Serializable {
    private Integer code;
    private String msg;
    private Map<String, Object> data;

    public ResponseResult addData(String key, Object value) {
        data.put(key, value);
        return this;
    }

    public ResponseResult setCode(Integer code) {
        this.code = code;
        return this;
    }

    public ResponseResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
