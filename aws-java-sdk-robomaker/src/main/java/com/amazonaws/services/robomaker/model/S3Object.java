/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an S3 object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/S3Object" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Object implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The bucket containing the object.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The key of the object.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The etag of the object.
     * </p>
     */
    private String etag;

    /**
     * <p>
     * The bucket containing the object.
     * </p>
     * 
     * @param bucket
     *        The bucket containing the object.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The bucket containing the object.
     * </p>
     * 
     * @return The bucket containing the object.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The bucket containing the object.
     * </p>
     * 
     * @param bucket
     *        The bucket containing the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The key of the object.
     * </p>
     * 
     * @param key
     *        The key of the object.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the object.
     * </p>
     * 
     * @return The key of the object.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key of the object.
     * </p>
     * 
     * @param key
     *        The key of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The etag of the object.
     * </p>
     * 
     * @param etag
     *        The etag of the object.
     */

    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * <p>
     * The etag of the object.
     * </p>
     * 
     * @return The etag of the object.
     */

    public String getEtag() {
        return this.etag;
    }

    /**
     * <p>
     * The etag of the object.
     * </p>
     * 
     * @param etag
     *        The etag of the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Object withEtag(String etag) {
        setEtag(etag);
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
        if (getEtag() != null)
            sb.append("Etag: ").append(getEtag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Object == false)
            return false;
        S3Object other = (S3Object) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getEtag() == null ^ this.getEtag() == null)
            return false;
        if (other.getEtag() != null && other.getEtag().equals(this.getEtag()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getEtag() == null) ? 0 : getEtag().hashCode());
        return hashCode;
    }

    @Override
    public S3Object clone() {
        try {
            return (S3Object) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.S3ObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
