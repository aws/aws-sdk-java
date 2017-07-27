package com.amazonaws.services.s3;

import com.amazonaws.auth.AWSCredentialsProvider;

/**
 * Type of {@link AWSCredentialsProvider} which can be provided the bucket name and key in order to vary
 * which credential provider is used for a given S3 operation. When an {@link AmazonS3Client} is constructed with
 * a provider of this type, the {@link AmazonS3Client} will provide the bucketName and key as context to the
 * {@link #getCredentialsProvider(String, String)} method for each operation.
 */
public interface S3ContextAwareCredentialsProvider extends AWSCredentialsProvider {

    public AWSCredentialsProvider getCredentialsProvider(final String bucketName, final String key);

}
