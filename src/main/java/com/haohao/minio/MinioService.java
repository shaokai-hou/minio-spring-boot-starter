package com.haohao.minio;

import io.minio.MakeBucketArgs;
import io.minio.MinioClient;

import javax.annotation.Resource;

public class MinioService {

    @Resource
    private MinioClient client;

    /**
     * 创建桶
     * @param bucketName 桶名称
     * @throws Exception 异常
     */
    public void createBucket(String bucketName) throws Exception {
        MakeBucketArgs build = MakeBucketArgs.builder().bucket(bucketName).build();
        client.makeBucket(build);
    }
}
