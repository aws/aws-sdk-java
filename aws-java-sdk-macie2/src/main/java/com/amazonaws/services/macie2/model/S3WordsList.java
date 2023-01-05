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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an S3 object that lists specific text to ignore.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/S3WordsList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3WordsList implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The full name of the S3 bucket that contains the object.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The full name (key) of the object.
     * </p>
     */
    private String objectKey;

    /**
     * <p>
     * The full name of the S3 bucket that contains the object.
     * </p>
     * 
     * @param bucketName
     *        The full name of the S3 bucket that contains the object.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The full name of the S3 bucket that contains the object.
     * </p>
     * 
     * @return The full name of the S3 bucket that contains the object.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The full name of the S3 bucket that contains the object.
     * </p>
     * 
     * @param bucketName
     *        The full name of the S3 bucket that contains the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3WordsList withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The full name (key) of the object.
     * </p>
     * 
     * @param objectKey
     *        The full name (key) of the object.
     */

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    /**
     * <p>
     * The full name (key) of the object.
     * </p>
     * 
     * @return The full name (key) of the object.
     */

    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * <p>
     * The full name (key) of the object.
     * </p>
     * 
     * @param objectKey
     *        The full name (key) of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3WordsList withObjectKey(String objectKey) {
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

        if (obj instanceof S3WordsList == false)
            return false;
        S3WordsList other = (S3WordsList) obj;
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
    public S3WordsList clone() {
        try {
            return (S3WordsList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.S3WordsListMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
