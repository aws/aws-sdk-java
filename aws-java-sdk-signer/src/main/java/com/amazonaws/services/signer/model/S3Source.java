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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the S3 bucket where you saved your unsigned code.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/S3Source" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Source implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * Key name of the bucket object that contains your unsigned code.
     * </p>
     */
    private String key;
    /**
     * <p>
     * Version of your source image in your version enabled S3 bucket.
     * </p>
     */
    private String version;

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        Name of the S3 bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     * 
     * @return Name of the S3 bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        Name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Source withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * Key name of the bucket object that contains your unsigned code.
     * </p>
     * 
     * @param key
     *        Key name of the bucket object that contains your unsigned code.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Key name of the bucket object that contains your unsigned code.
     * </p>
     * 
     * @return Key name of the bucket object that contains your unsigned code.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * Key name of the bucket object that contains your unsigned code.
     * </p>
     * 
     * @param key
     *        Key name of the bucket object that contains your unsigned code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Source withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * Version of your source image in your version enabled S3 bucket.
     * </p>
     * 
     * @param version
     *        Version of your source image in your version enabled S3 bucket.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Version of your source image in your version enabled S3 bucket.
     * </p>
     * 
     * @return Version of your source image in your version enabled S3 bucket.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * Version of your source image in your version enabled S3 bucket.
     * </p>
     * 
     * @param version
     *        Version of your source image in your version enabled S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Source withVersion(String version) {
        setVersion(version);
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

        if (obj instanceof S3Source == false)
            return false;
        S3Source other = (S3Source) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
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

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public S3Source clone() {
        try {
            return (S3Source) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.S3SourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
