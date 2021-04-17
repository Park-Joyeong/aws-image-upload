package com.jobs.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("my-cool-and-hot-bucket");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
