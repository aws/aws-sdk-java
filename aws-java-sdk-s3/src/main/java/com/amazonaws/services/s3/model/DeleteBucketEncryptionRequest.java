/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * <p>
 * Represents the input of a <code>DeleteBucketEncryption</code> operation.
 * </p>
 *
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3-2006-03-01/DeleteBucketEncryption" target="_top">AWS API
 * Documentation</a>
 */
public class DeleteBucketEncryptionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    private String bucketName;

    /**
     * @return The name of the bucket whose encryption configuration is being deleted.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * The name of the bucket for which to delete the encryption configuration.
     *
     * @param bucketName Bucket name.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * The name of the bucket for which to delete the encryption configuration.
     *
     * @param bucket Bucket name.
     * @return This object for method chaining.
     */
    public DeleteBucketEncryptionRequest withBucketName(String bucket) {
        setBucketName(bucket);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj instanceof DeleteBucketEncryptionRequest == false) {
            return false;
        }
        DeleteBucketEncryptionRequest other = (DeleteBucketEncryptionRequest) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null) {
            return false;
        }
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBucketEncryptionRequest clone() {
        return (DeleteBucketEncryptionRequest) super.clone();
    }
}
