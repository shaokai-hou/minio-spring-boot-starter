package com.haohao.minio.properties;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "minio")
public class MinioProperties {

    private String endpoint = "1";
    private String access ="1";
    private String secret="1";
    private String host="1";
}
