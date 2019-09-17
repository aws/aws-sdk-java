/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final S3ObjectIdBuilder that = (S3ObjectIdBuilder) o;

        if (bucket != null ? !bucket.equals(that.bucket) : that.bucket != null) {
            return false;
        }
        if (key != null ? !key.equals(that.key) : that.key != null) {
            return false;
        }
        return versionId != null ? versionId.equals(that.versionId) : that.versionId == null;
    }

    @Override
    public int hashCode() {
        int result = bucket != null ? bucket.hashCode() : 0;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (versionId != null ? versionId.hashCode() : 0);
        return result;
    }
}
