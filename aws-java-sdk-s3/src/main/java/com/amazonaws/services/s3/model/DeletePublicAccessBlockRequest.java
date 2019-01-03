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

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

public class DeletePublicAccessBlockRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    private String bucketName;

    /**
     * The Amazon S3 bucket whose Public Access Block configuration you want to delete.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * The Amazon S3 bucket whose Public Access Block configuration you want to delete.
     *
     * @param bucketName Name of bucket whose configuration should be deleted.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * The Amazon S3 bucket whose Public Access Block configuration you want to delete.
     *
     * @param bucketName Name of bucket whose configuration should be deleted.
     * @return This object for method chaining.
     */
    public DeletePublicAccessBlockRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final DeletePublicAccessBlockRequest that = (DeletePublicAccessBlockRequest) o;

        return bucketName != null ? bucketName.equals(that.bucketName) : that.bucketName == null;
    }

    @Override
    public int hashCode() {
        return bucketName != null ? bucketName.hashCode() : 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBucketName() != null) {
            sb.append("BucketName: ").append(getBucketName()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public DeletePublicAccessBlockRequest clone() {
        return (DeletePublicAccessBlockRequest) super.clone();
    }
}
