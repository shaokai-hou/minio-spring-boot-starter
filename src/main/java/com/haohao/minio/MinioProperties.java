package com.haohao.minio;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "minio")
public class MinioProperties {

    private String host = "http://localhost:9000";
    private String access = "admin";
    private String secret = "admin123";
    private String bucket = "src/main/test";
}
