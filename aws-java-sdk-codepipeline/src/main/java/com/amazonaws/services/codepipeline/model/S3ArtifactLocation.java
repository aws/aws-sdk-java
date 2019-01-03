/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The location of the Amazon S3 bucket that contains a revision.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/S3ArtifactLocation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ArtifactLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The key of the object in the Amazon S3 bucket, which uniquely identifies the object in the bucket.
     * </p>
     */
    private String objectKey;

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        The name of the Amazon S3 bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        The name of the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ArtifactLocation withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The key of the object in the Amazon S3 bucket, which uniquely identifies the object in the bucket.
     * </p>
     * 
     * @param objectKey
     *        The key of the object in the Amazon S3 bucket, which uniquely identifies the object in the bucket.
     */

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    /**
     * <p>
     * The key of the object in the Amazon S3 bucket, which uniquely identifies the object in the bucket.
     * </p>
     * 
     * @return The key of the object in the Amazon S3 bucket, which uniquely identifies the object in the bucket.
     */

    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * <p>
     * The key of the object in the Amazon S3 bucket, which uniquely identifies the object in the bucket.
     * </p>
     * 
     * @param objectKey
     *        The key of the object in the Amazon S3 bucket, which uniquely identifies the object in the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ArtifactLocation withObjectKey(String objectKey) {
        setObjectKey(objectKey);
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
        if (getObjectKey() != null)
            sb.append("ObjectKey: ").append(getObjectKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ArtifactLocation == false)
            return false;
        S3ArtifactLocation other = (S3ArtifactLocation) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getObjectKey() == null ^ this.getObjectKey() == null)
            return false;
        if (other.getObjectKey() != null && other.getObjectKey().equals(this.getObjectKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getObjectKey() == null) ? 0 : getObjectKey().hashCode());
        return hashCode;
    }

    @Override
    public S3ArtifactLocation clone() {
        try {
            return (S3ArtifactLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.S3ArtifactLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
