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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Template bundle S3 bucket data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/S3ObjectSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ObjectSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the S3 bucket that contains a template bundle.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The path to the S3 bucket that contains a template bundle.
     * </p>
     */
    private String key;

    /**
     * <p>
     * The name of the S3 bucket that contains a template bundle.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket that contains a template bundle.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket that contains a template bundle.
     * </p>
     * 
     * @return The name of the S3 bucket that contains a template bundle.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket that contains a template bundle.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket that contains a template bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectSource withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The path to the S3 bucket that contains a template bundle.
     * </p>
     * 
     * @param key
     *        The path to the S3 bucket that contains a template bundle.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The path to the S3 bucket that contains a template bundle.
     * </p>
     * 
     * @return The path to the S3 bucket that contains a template bundle.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The path to the S3 bucket that contains a template bundle.
     * </p>
     * 
     * @param key
     *        The path to the S3 bucket that contains a template bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ObjectSource withKey(String key) {
        setKey(key);
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ObjectSource == false)
            return false;
        S3ObjectSource other = (S3ObjectSource) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        return hashCode;
    }

    @Override
    public S3ObjectSource clone() {
        try {
            return (S3ObjectSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.S3ObjectSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
