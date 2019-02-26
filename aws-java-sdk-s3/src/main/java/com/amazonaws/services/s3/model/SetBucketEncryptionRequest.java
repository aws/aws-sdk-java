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
 * Represents the input of a <code>PutBucketEncryption</code> operation.
 * </p>
 *
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3-2006-03-01/PutBucketEncryption" target="_top">AWS API
 * Documentation</a>
 */
public class SetBucketEncryptionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    private String bucketName;
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;

    /**
     * @return The name of the bucket whose encryption configuration is being set.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * The name of the bucket for which to set the encryption configuration.
     *
     * @param bucketName Bucket name.
     */
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * The name of the bucket for which to set the encryption configuration.
     *
     * @param bucketName Bucket name.
     * @return This object for method chaining.
     */
    public SetBucketEncryptionRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * @return Container for server-side encryption configuration rules. Currently S3 supports one rule only.
     */
    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return serverSideEncryptionConfiguration;
    }

    /**
     * Sets the container for server-side encryption configuration rules. Currently S3 supports one rule only.
     *
     * @param serverSideEncryptionConfiguration New configuration.
     */
    public void setServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * Sets the container for server-side encryption configuration rules. Currently S3 supports one rule only.
     *
     * @param serverSideEncryptionConfiguration New configuration.
     * @return This object for method chaining.
     */
    public SetBucketEncryptionRequest withServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        setServerSideEncryptionConfiguration(serverSideEncryptionConfiguration);
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
        if(getServerSideEncryptionConfiguration() != null) {
            sb.append("ServerSideEncryptionConfiguration: ").append(getServerSideEncryptionConfiguration()).append(",");
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

        if (obj instanceof SetBucketEncryptionRequest == false) {
            return false;
        }
        SetBucketEncryptionRequest other = (SetBucketEncryptionRequest) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null) {
            return false;
        }
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false) {
            return false;
        }
        if (other.getServerSideEncryptionConfiguration() == null ^ this.getServerSideEncryptionConfiguration() == null) {
            return false;
        }
        if (other.getServerSideEncryptionConfiguration() != null
            && other.getServerSideEncryptionConfiguration().equals(this.getServerSideEncryptionConfiguration()) == false) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 :
                                       getServerSideEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SetBucketEncryptionRequest clone() {
        return (SetBucketEncryptionRequest) super.clone();
    }
}
