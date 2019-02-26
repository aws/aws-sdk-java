/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Request object for the parameters to get a bucket's notification
 * configuration.
 *
 * @see AmazonS3#getBucketNotificationConfiguration(GetBucketNotificationConfigurationRequest)
 */
public class GetBucketNotificationConfigurationRequest extends
        GenericBucketRequest implements Serializable {

    /**
     * Creates a new request object, ready to be executed to fetch the
     * notification configuration for the specified bucket.
     *
     * @param bucketName
     *            The name of the bucket whose notification configuration is
     *            being fetched.
     */
    public GetBucketNotificationConfigurationRequest(String bucketName) {
        super(bucketName);
    }

}
