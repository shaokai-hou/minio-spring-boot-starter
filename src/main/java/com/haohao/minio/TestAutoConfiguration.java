package com.haohao.minio;

import com.haohao.minio.properties.TestProperties;
import io.minio.MinioClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(TestService.class)
@EnableConfigurationProperties(TestProperties.class)
public class TestAutoConfiguration {

    // @ConditionalOnMissingBean 容器中没有此Bean，才注册

    @Bean
    @ConditionalOnMissingBean(TestService.class)
    public TestService testService() {
        return new TestService();
    }
}
