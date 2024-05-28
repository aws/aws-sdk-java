/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/DataSourceS3Configuration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceS3Configuration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The bucket name of the customer S3 bucket.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * </p>
     */
    private String objectKeyPrefix;

    /**
     * <p>
     * The bucket name of the customer S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        The bucket name of the customer S3 bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The bucket name of the customer S3 bucket.
     * </p>
     * 
     * @return The bucket name of the customer S3 bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The bucket name of the customer S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        The bucket name of the customer S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceS3Configuration withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param objectKeyPrefix
     */

    public void setObjectKeyPrefix(String objectKeyPrefix) {
        this.objectKeyPrefix = objectKeyPrefix;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getObjectKeyPrefix() {
        return this.objectKeyPrefix;
    }

    /**
     * <p>
     * </p>
     * 
     * @param objectKeyPrefix
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceS3Configuration withObjectKeyPrefix(String objectKeyPrefix) {
        setObjectKeyPrefix(objectKeyPrefix);
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
        if (getObjectKeyPrefix() != null)
            sb.append("ObjectKeyPrefix: ").append(getObjectKeyPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceS3Configuration == false)
            return false;
        DataSourceS3Configuration other = (DataSourceS3Configuration) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getObjectKeyPrefix() == null ^ this.getObjectKeyPrefix() == null)
            return false;
        if (other.getObjectKeyPrefix() != null && other.getObjectKeyPrefix().equals(this.getObjectKeyPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getObjectKeyPrefix() == null) ? 0 : getObjectKeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceS3Configuration clone() {
        try {
            return (DataSourceS3Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.DataSourceS3ConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
