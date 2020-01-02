/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.util.ValidationUtils;

/**
 * An {@link S3Resource} that represents an S3 bucket.
 */
@SdkInternalApi
public final class S3BucketResource implements S3Resource {
    private static final S3ResourceType S3_RESOURCE_TYPE = S3ResourceType.BUCKET;

    private final String partition;
    private final String region;
    private final String accountId;
    private final String bucketName;

    private S3BucketResource(Builder b) {
        this.bucketName = ValidationUtils.assertStringNotEmpty(b.bucketName, "bucketName");
        this.partition = b.partition;
        this.region = b.region;
        this.accountId = b.accountId;
    }

    /**
     * Get a new builder for this class.
     * @return A newly initialized instance of a builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Gets the resource type for this bucket.
     * @return This will always return "bucket_name".
     */
    @Override
    public String getType() {
        return S3_RESOURCE_TYPE.toString();
    }

    /**
     * Gets the AWS partition name associated with this bucket (e.g.: 'aws').
     * @return the name of the partition.
     */
    @Override
    public String getPartition() {
        return this.partition;
    }

    /**
     * Gets the AWS region name associated with this bucket (e.g.: 'us-east-1').
     * @return the name of the region or null if the region has not been specified (e.g. the resource is in the
     * global namespace).
     */
    @Override
    public String getRegion() {
        return this.region;
    }

    /**
     * Gets the AWS account ID associated with this bucket.
     * @return the AWS account ID or null if the account ID has not been specified.
     */
    @Override
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * Gets the name of the bucket.
     * @return the name of the bucket.
     */
    public String getBucketName() {
        return this.bucketName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        S3BucketResource that = (S3BucketResource) o;

        if (partition != null ? ! partition.equals(that.partition) : that.partition != null) return false;
        if (region != null ? ! region.equals(that.region) : that.region != null) return false;
        if (accountId != null ? ! accountId.equals(that.accountId) : that.accountId != null) return false;
        return bucketName.equals(that.bucketName);
    }

    @Override
    public int hashCode() {
        int result = partition != null ? partition.hashCode() : 0;
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + bucketName.hashCode();
        return result;
    }

    /**
     * A builder for {@link S3BucketResource} objects.
     */
    public static final class Builder {
        private String partition;
        private String region;
        private String accountId;
        private String bucketName;

        public void setPartition(String partition) {
            this.partition = partition;
        }

        /**
         * The AWS partition associated with the bucket.
         */
        public Builder withPartition(String partition) {
            setPartition(partition);
            return this;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        /**
         * The AWS region associated with the bucket. This property is optional.
         */
        public Builder withRegion(String region) {
            setRegion(region);
            return this;
        }

        public void setAccountId(String accountId) {
            this.accountId = accountId;
        }

        /**
         * The AWS account ID associated with the bucket. This property is optional.
         */
        public Builder withAccountId(String accountId) {
            setAccountId(accountId);
            return this;
        }

        public void setBucketName(String bucketName) {
            this.bucketName = bucketName;
        }

        /**
         * The name of the S3 bucket.
         */
        public Builder withBucketName(String bucketName) {
            setBucketName(bucketName);
            return this;
        }

        /**
         * Builds an instance of {@link S3BucketResource}.
         */
        public S3BucketResource build() {
            return new S3BucketResource(this);
        }
    }
}
