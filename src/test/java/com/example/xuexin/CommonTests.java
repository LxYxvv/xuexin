package com.example.xuexin;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class CommonTests {
    @Test
    public void Test01() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map map = new HashMap();
        map.put("code", 2);
        map.put("msg", "shabi");

        Map map1 = objectMapper.readValue("{\"ssss\":2,\"sss\":33}", Map.class);
        System.out.println(new HashMap(){});
    }
}
