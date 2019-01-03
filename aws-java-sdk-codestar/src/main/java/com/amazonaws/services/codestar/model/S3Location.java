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
package com.amazonaws.services.codestar.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon S3 location where the source code files provided with the project request are stored.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/S3Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket name where the source code files provided with the project request are stored.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The Amazon S3 object key where the source code files provided with the project request are stored.
     * </p>
     */
    private String bucketKey;

    /**
     * <p>
     * The Amazon S3 bucket name where the source code files provided with the project request are stored.
     * </p>
     * 
     * @param bucketName
     *        The Amazon S3 bucket name where the source code files provided with the project request are stored.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket name where the source code files provided with the project request are stored.
     * </p>
     * 
     * @return The Amazon S3 bucket name where the source code files provided with the project request are stored.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket name where the source code files provided with the project request are stored.
     * </p>
     * 
     * @param bucketName
     *        The Amazon S3 bucket name where the source code files provided with the project request are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 object key where the source code files provided with the project request are stored.
     * </p>
     * 
     * @param bucketKey
     *        The Amazon S3 object key where the source code files provided with the project request are stored.
     */

    public void setBucketKey(String bucketKey) {
        this.bucketKey = bucketKey;
    }

    /**
     * <p>
     * The Amazon S3 object key where the source code files provided with the project request are stored.
     * </p>
     * 
     * @return The Amazon S3 object key where the source code files provided with the project request are stored.
     */

    public String getBucketKey() {
        return this.bucketKey;
    }

    /**
     * <p>
     * The Amazon S3 object key where the source code files provided with the project request are stored.
     * </p>
     * 
     * @param bucketKey
     *        The Amazon S3 object key where the source code files provided with the project request are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withBucketKey(String bucketKey) {
        setBucketKey(bucketKey);
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
        if (getBucketKey() != null)
            sb.append("BucketKey: ").append(getBucketKey());
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
        if (other.getBucketKey() == null ^ this.getBucketKey() == null)
            return false;
        if (other.getBucketKey() != null && other.getBucketKey().equals(this.getBucketKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getBucketKey() == null) ? 0 : getBucketKey().hashCode());
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
        com.amazonaws.services.codestar.model.transform.S3LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
