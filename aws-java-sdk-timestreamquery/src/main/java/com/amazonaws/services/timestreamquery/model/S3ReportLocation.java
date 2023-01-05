/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * S3 report location for the scheduled query run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/S3ReportLocation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ReportLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * S3 bucket name.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * S3 key.
     * </p>
     */
    private String objectKey;

    /**
     * <p>
     * S3 bucket name.
     * </p>
     * 
     * @param bucketName
     *        S3 bucket name.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * S3 bucket name.
     * </p>
     * 
     * @return S3 bucket name.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * S3 bucket name.
     * </p>
     * 
     * @param bucketName
     *        S3 bucket name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReportLocation withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * S3 key.
     * </p>
     * 
     * @param objectKey
     *        S3 key.
     */

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    /**
     * <p>
     * S3 key.
     * </p>
     * 
     * @return S3 key.
     */

    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * <p>
     * S3 key.
     * </p>
     * 
     * @param objectKey
     *        S3 key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReportLocation withObjectKey(String objectKey) {
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

        if (obj instanceof S3ReportLocation == false)
            return false;
        S3ReportLocation other = (S3ReportLocation) obj;
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
    public S3ReportLocation clone() {
        try {
            return (S3ReportLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.S3ReportLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
