package com.haohao.minio;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "test")
public class TestProperties {

    private String name = "hello";

    private Integer age = 16;
}
