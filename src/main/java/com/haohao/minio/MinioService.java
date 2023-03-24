package com.haohao.minio;

import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.messages.Bucket;

import javax.annotation.Resource;
import java.util.List;

public class MinioService {

    @Resource
    private MinioClient client;

    /**
     * 创建桶
     *
     * @param bucketName 桶名称
     * @throws MinioException 异常
     */
    public void createBucket(String bucketName) throws MinioException {
        MakeBucketArgs build = MakeBucketArgs.builder().bucket(bucketName).build();
        try {
            client.makeBucket(build);
        }catch (Exception e){
            throw new MinioException(e.getMessage(), e);
        }
    }

    /**
     * 桶列表
     *
     * @return result
     * @throws MinioException 异常
     */
    public List<Bucket> getAllBucket() throws MinioException {
        try {
            return client.listBuckets();
        } catch (Exception e) {
            throw new MinioException(e.getMessage(), e);
        }
    }
}
