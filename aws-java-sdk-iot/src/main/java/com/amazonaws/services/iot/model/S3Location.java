/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The location in S3 the contains the files to stream.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 bucket that contains the file to stream.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The name of the file within the S3 bucket to stream.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The file version.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The S3 bucket that contains the file to stream.
     * </p>
     * 
     * @param bucket
     *        The S3 bucket that contains the file to stream.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The S3 bucket that contains the file to stream.
     * </p>
     * 
     * @return The S3 bucket that contains the file to stream.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The S3 bucket that contains the file to stream.
     * </p>
     * 
     * @param bucket
     *        The S3 bucket that contains the file to stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The name of the file within the S3 bucket to stream.
     * </p>
     * 
     * @param key
     *        The name of the file within the S3 bucket to stream.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the file within the S3 bucket to stream.
     * </p>
     * 
     * @return The name of the file within the S3 bucket to stream.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the file within the S3 bucket to stream.
     * </p>
     * 
     * @param key
     *        The name of the file within the S3 bucket to stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The file version.
     * </p>
     * 
     * @param version
     *        The file version.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The file version.
     * </p>
     * 
     * @return The file version.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The file version.
     * </p>
     * 
     * @param version
     *        The file version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion());
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
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
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
        com.amazonaws.services.iot.model.transform.S3LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
