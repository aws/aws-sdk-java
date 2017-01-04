/*
 * Copyright 2014-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Convenient builder for {@link S3ObjectId}.
 */
public final class S3ObjectIdBuilder implements Serializable {
    private String bucket;
    private String key;
    private String versionId;

    public S3ObjectIdBuilder() {}

    /**
     * @param id S3 object id, which must not be null.
     */
    public S3ObjectIdBuilder(S3ObjectId id) {
        this.bucket = id.getBucket();
        this.key = id.getKey();
        this.versionId = id.getVersionId();
    }

    public String getBucket() {
        return bucket;
    }

    public String getKey() {
        return key;
    }

    public String getVersionId() {
        return versionId;
    }
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public S3ObjectIdBuilder withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    public S3ObjectIdBuilder withKey(String key) {
        this.key = key;
        return this;
    }

    public S3ObjectIdBuilder withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    public S3ObjectId build() {
        return new S3ObjectId(bucket, key, versionId);
    }
}
