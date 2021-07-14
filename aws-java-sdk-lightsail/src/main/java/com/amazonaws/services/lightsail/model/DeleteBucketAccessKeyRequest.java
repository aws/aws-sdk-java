/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/DeleteBucketAccessKey" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBucketAccessKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bucket that the access key belongs to.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The ID of the access key to delete.
     * </p>
     * <p>
     * Use the <a>GetBucketAccessKeys</a> action to get a list of access key IDs that you can specify.
     * </p>
     */
    private String accessKeyId;

    /**
     * <p>
     * The name of the bucket that the access key belongs to.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket that the access key belongs to.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the bucket that the access key belongs to.
     * </p>
     * 
     * @return The name of the bucket that the access key belongs to.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the bucket that the access key belongs to.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket that the access key belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBucketAccessKeyRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The ID of the access key to delete.
     * </p>
     * <p>
     * Use the <a>GetBucketAccessKeys</a> action to get a list of access key IDs that you can specify.
     * </p>
     * 
     * @param accessKeyId
     *        The ID of the access key to delete.</p>
     *        <p>
     *        Use the <a>GetBucketAccessKeys</a> action to get a list of access key IDs that you can specify.
     */

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    /**
     * <p>
     * The ID of the access key to delete.
     * </p>
     * <p>
     * Use the <a>GetBucketAccessKeys</a> action to get a list of access key IDs that you can specify.
     * </p>
     * 
     * @return The ID of the access key to delete.</p>
     *         <p>
     *         Use the <a>GetBucketAccessKeys</a> action to get a list of access key IDs that you can specify.
     */

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * <p>
     * The ID of the access key to delete.
     * </p>
     * <p>
     * Use the <a>GetBucketAccessKeys</a> action to get a list of access key IDs that you can specify.
     * </p>
     * 
     * @param accessKeyId
     *        The ID of the access key to delete.</p>
     *        <p>
     *        Use the <a>GetBucketAccessKeys</a> action to get a list of access key IDs that you can specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBucketAccessKeyRequest withAccessKeyId(String accessKeyId) {
        setAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getAccessKeyId() != null)
            sb.append("AccessKeyId: ").append(getAccessKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBucketAccessKeyRequest == false)
            return false;
        DeleteBucketAccessKeyRequest other = (DeleteBucketAccessKeyRequest) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getAccessKeyId() == null ^ this.getAccessKeyId() == null)
            return false;
        if (other.getAccessKeyId() != null && other.getAccessKeyId().equals(this.getAccessKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getAccessKeyId() == null) ? 0 : getAccessKeyId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBucketAccessKeyRequest clone() {
        return (DeleteBucketAccessKeyRequest) super.clone();
    }

}
