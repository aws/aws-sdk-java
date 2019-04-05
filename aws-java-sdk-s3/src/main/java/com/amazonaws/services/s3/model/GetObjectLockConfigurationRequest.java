/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Gets the Object Lock configuration for a bucket. The rule specified in the Object Lock configuration will be applied by
 * default to every new object placed in the specified bucket.
 */
public class GetObjectLockConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucket;

    /**
     * The S3 Bucket.
     */
    public String getBucketName() {
        return bucket;
    }

    /**
     * The S3 Bucket.
     */
    public GetObjectLockConfigurationRequest withBucketName(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * The S3 Bucket.
     */
    public void setBucketName(String bucket) {
        withBucketName(bucket);
    }
}
