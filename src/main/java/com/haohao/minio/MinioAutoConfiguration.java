package com.haohao.minio;

import io.minio.MinioClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@ConditionalOnClass(MinioService.class)
@EnableConfigurationProperties(MinioProperties.class)
public class MinioAutoConfiguration {

    @Resource
    private MinioProperties minioProperties;

    @Bean
    @ConditionalOnMissingBean(MinioService.class)
    public MinioService minioService() {
        return new MinioService();
    }

    @Bean
    public MinioClient minioClient() {
        return MinioClient.builder()
                .endpoint(minioProperties.getHost())
                .credentials(minioProperties.getAccess(), minioProperties.getSecret())
                .build();
    }
}
