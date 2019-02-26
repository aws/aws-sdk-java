/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.s3.AmazonS3;

/**
 * Request object for the parameters to delete a bucket's lifecycle configuration.
 *
 * @see AmazonS3#deleteBucketLifecycleConfiguration(DeleteBucketLifecycleConfigurationRequest)
 */
public class DeleteBucketLifecycleConfigurationRequest extends GenericBucketRequest implements Serializable {

    /**
     * Creates a new request object, ready to be executed to delete the lifecycle
     * configuration for the specified bucket.
     * 
     * @param bucketName
     *            The name of the bucket whose lifecycle configuration is being
     *            deleted.
     */
    public DeleteBucketLifecycleConfigurationRequest(String bucketName) {
        super(bucketName);
    }
}
