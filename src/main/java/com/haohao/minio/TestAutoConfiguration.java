package com.haohao.minio;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(TestProperties.class)
@Configuration
public class TestAutoConfiguration {
}
