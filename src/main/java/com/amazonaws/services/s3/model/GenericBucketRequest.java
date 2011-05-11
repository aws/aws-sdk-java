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

/**
 * Generic request container for web service requests on buckets.
 */
public class GenericBucketRequest extends AmazonWebServiceRequest {

    private final String bucket;

    public GenericBucketRequest(String bucket) {
        super();
        this.bucket = bucket;
    }

    public String getBucket() {
        return bucket;
    }

}
