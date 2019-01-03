/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;
import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides options for deleting a specified bucket. Amazon S3 buckets can only be deleted
 * when empty.
 * </p>
 * <p>
 * Note: When attempting to delete a bucket that does not exist,
 * Amazon S3 returns
 * a success message, not an error message.
 * </p>
 */
public class DeleteBucketRequest extends AmazonWebServiceRequest implements
        Serializable, S3AccelerateUnsupported {

    /**
     * The name of the Amazon S3 bucket to delete.
     */
    private String bucketName;

    /**
     * Constructs a new {@link DeleteBucketRequest},
     * ready to be executed to delete the
     * specified bucket.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket to delete.
     */
    public DeleteBucketRequest(String bucketName) {
        setBucketName(bucketName);
    }

    /**
     * Sets the name of the Amazon S3 bucket to delete.
     *
     * @param bucketName
     *            The name of the Amazon S3 bucket to delete.
     *
     * @see DeleteBucketRequest#getBucketName()
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * Gets the name of the Amazon S3 bucket to delete.
     *
     * @return The name of the Amazon S3 bucket to delete.
     *
     * @see DeleteBucketRequest#setBucketName(String)
     */
    public String getBucketName() {
        return bucketName;
    }
}
