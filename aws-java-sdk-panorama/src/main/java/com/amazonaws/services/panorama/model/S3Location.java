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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A location in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/S3Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A bucket name.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * An object key.
     * </p>
     */
    private String objectKey;
    /**
     * <p>
     * The bucket's Region.
     * </p>
     */
    private String region;

    /**
     * <p>
     * A bucket name.
     * </p>
     * 
     * @param bucketName
     *        A bucket name.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * A bucket name.
     * </p>
     * 
     * @return A bucket name.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * A bucket name.
     * </p>
     * 
     * @param bucketName
     *        A bucket name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * An object key.
     * </p>
     * 
     * @param objectKey
     *        An object key.
     */

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    /**
     * <p>
     * An object key.
     * </p>
     * 
     * @return An object key.
     */

    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * <p>
     * An object key.
     * </p>
     * 
     * @param objectKey
     *        An object key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withObjectKey(String objectKey) {
        setObjectKey(objectKey);
        return this;
    }

    /**
     * <p>
     * The bucket's Region.
     * </p>
     * 
     * @param region
     *        The bucket's Region.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The bucket's Region.
     * </p>
     * 
     * @return The bucket's Region.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The bucket's Region.
     * </p>
     * 
     * @param region
     *        The bucket's Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withRegion(String region) {
        setRegion(region);
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
            sb.append("ObjectKey: ").append(getObjectKey()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Location == false)
            return false;
        S3Location other = (S3Location) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getObjectKey() == null ^ this.getObjectKey() == null)
            return false;
        if (other.getObjectKey() != null && other.getObjectKey().equals(this.getObjectKey()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getObjectKey() == null) ? 0 : getObjectKey().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public S3Location clone() {
        try {
            return (S3Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.S3LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
