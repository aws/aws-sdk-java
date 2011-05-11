/*
 * Copyright 2011 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;

public class SetBucketNotificationConfigurationRequest extends AmazonWebServiceRequest {

    private BucketNotificationConfiguration bucketNotificationConfiguration;

    private String bucket;

    public SetBucketNotificationConfigurationRequest(BucketNotificationConfiguration bucketNotificationConfiguration,
            String bucket) {
        super();
        this.bucketNotificationConfiguration = bucketNotificationConfiguration;
        this.bucket = bucket;
    }

    public BucketNotificationConfiguration getBucketNotificationConfiguration() {
        return bucketNotificationConfiguration;
    }

    public void setBucketNotificationConfiguration(BucketNotificationConfiguration bucketNotificationConfiguration) {
        this.bucketNotificationConfiguration = bucketNotificationConfiguration;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

}
