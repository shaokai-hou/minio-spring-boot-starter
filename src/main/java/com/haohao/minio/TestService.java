package com.haohao.minio;

import com.haohao.minio.properties.TestProperties;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

public class TestService {

    @Resource
    private TestProperties testProperties;

    public Map<String,Object> test(){
        Map<String, Object> result = new HashMap<>(2);
        result.put("age", testProperties.getAge());
        result.put("name", testProperties.getName());
        return result;
    }
}
