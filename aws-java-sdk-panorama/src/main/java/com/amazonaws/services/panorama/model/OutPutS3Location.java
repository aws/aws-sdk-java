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
 * The location of an output object in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/OutPutS3Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutPutS3Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The object's bucket.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The object's key.
     * </p>
     */
    private String objectKey;

    /**
     * <p>
     * The object's bucket.
     * </p>
     * 
     * @param bucketName
     *        The object's bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The object's bucket.
     * </p>
     * 
     * @return The object's bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The object's bucket.
     * </p>
     * 
     * @param bucketName
     *        The object's bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutPutS3Location withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The object's key.
     * </p>
     * 
     * @param objectKey
     *        The object's key.
     */

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    /**
     * <p>
     * The object's key.
     * </p>
     * 
     * @return The object's key.
     */

    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * <p>
     * The object's key.
     * </p>
     * 
     * @param objectKey
     *        The object's key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutPutS3Location withObjectKey(String objectKey) {
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

        if (obj instanceof OutPutS3Location == false)
            return false;
        OutPutS3Location other = (OutPutS3Location) obj;
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
    public OutPutS3Location clone() {
        try {
            return (OutPutS3Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.OutPutS3LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
