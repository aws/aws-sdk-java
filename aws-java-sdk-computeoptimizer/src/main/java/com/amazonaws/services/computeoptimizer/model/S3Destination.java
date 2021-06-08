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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the destination Amazon Simple Storage Service (Amazon S3) bucket name and object keys of a recommendations
 * export file, and its associated metadata file.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/S3Destination" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Destination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon S3 bucket used as the destination of an export file.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The Amazon S3 bucket key of an export file.
     * </p>
     * <p>
     * The key uniquely identifies the object, or export file, in the S3 bucket.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The Amazon S3 bucket key of a metadata file.
     * </p>
     * <p>
     * The key uniquely identifies the object, or metadata file, in the S3 bucket.
     * </p>
     */
    private String metadataKey;

    /**
     * <p>
     * The name of the Amazon S3 bucket used as the destination of an export file.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket used as the destination of an export file.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket used as the destination of an export file.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket used as the destination of an export file.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket used as the destination of an export file.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket used as the destination of an export file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket key of an export file.
     * </p>
     * <p>
     * The key uniquely identifies the object, or export file, in the S3 bucket.
     * </p>
     * 
     * @param key
     *        The Amazon S3 bucket key of an export file.</p>
     *        <p>
     *        The key uniquely identifies the object, or export file, in the S3 bucket.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The Amazon S3 bucket key of an export file.
     * </p>
     * <p>
     * The key uniquely identifies the object, or export file, in the S3 bucket.
     * </p>
     * 
     * @return The Amazon S3 bucket key of an export file.</p>
     *         <p>
     *         The key uniquely identifies the object, or export file, in the S3 bucket.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The Amazon S3 bucket key of an export file.
     * </p>
     * <p>
     * The key uniquely identifies the object, or export file, in the S3 bucket.
     * </p>
     * 
     * @param key
     *        The Amazon S3 bucket key of an export file.</p>
     *        <p>
     *        The key uniquely identifies the object, or export file, in the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket key of a metadata file.
     * </p>
     * <p>
     * The key uniquely identifies the object, or metadata file, in the S3 bucket.
     * </p>
     * 
     * @param metadataKey
     *        The Amazon S3 bucket key of a metadata file.</p>
     *        <p>
     *        The key uniquely identifies the object, or metadata file, in the S3 bucket.
     */

    public void setMetadataKey(String metadataKey) {
        this.metadataKey = metadataKey;
    }

    /**
     * <p>
     * The Amazon S3 bucket key of a metadata file.
     * </p>
     * <p>
     * The key uniquely identifies the object, or metadata file, in the S3 bucket.
     * </p>
     * 
     * @return The Amazon S3 bucket key of a metadata file.</p>
     *         <p>
     *         The key uniquely identifies the object, or metadata file, in the S3 bucket.
     */

    public String getMetadataKey() {
        return this.metadataKey;
    }

    /**
     * <p>
     * The Amazon S3 bucket key of a metadata file.
     * </p>
     * <p>
     * The key uniquely identifies the object, or metadata file, in the S3 bucket.
     * </p>
     * 
     * @param metadataKey
     *        The Amazon S3 bucket key of a metadata file.</p>
     *        <p>
     *        The key uniquely identifies the object, or metadata file, in the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withMetadataKey(String metadataKey) {
        setMetadataKey(metadataKey);
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
            sb.append("Key: ").append(getKey()).append(",");
        if (getMetadataKey() != null)
            sb.append("MetadataKey: ").append(getMetadataKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Destination == false)
            return false;
        S3Destination other = (S3Destination) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getMetadataKey() == null ^ this.getMetadataKey() == null)
            return false;
        if (other.getMetadataKey() != null && other.getMetadataKey().equals(this.getMetadataKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getMetadataKey() == null) ? 0 : getMetadataKey().hashCode());
        return hashCode;
    }

    @Override
    public S3Destination clone() {
        try {
            return (S3Destination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.S3DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
