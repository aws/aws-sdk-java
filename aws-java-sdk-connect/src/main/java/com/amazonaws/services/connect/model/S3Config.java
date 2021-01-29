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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the Amazon Simple Storage Service (Amazon S3) storage type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/S3Config" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Config implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The S3 bucket name.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The S3 bucket prefix.
     * </p>
     */
    private String bucketPrefix;
    /**
     * <p>
     * The Amazon S3 encryption configuration.
     * </p>
     */
    private EncryptionConfig encryptionConfig;

    /**
     * <p>
     * The S3 bucket name.
     * </p>
     * 
     * @param bucketName
     *        The S3 bucket name.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The S3 bucket name.
     * </p>
     * 
     * @return The S3 bucket name.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The S3 bucket name.
     * </p>
     * 
     * @param bucketName
     *        The S3 bucket name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Config withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The S3 bucket prefix.
     * </p>
     * 
     * @param bucketPrefix
     *        The S3 bucket prefix.
     */

    public void setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
    }

    /**
     * <p>
     * The S3 bucket prefix.
     * </p>
     * 
     * @return The S3 bucket prefix.
     */

    public String getBucketPrefix() {
        return this.bucketPrefix;
    }

    /**
     * <p>
     * The S3 bucket prefix.
     * </p>
     * 
     * @param bucketPrefix
     *        The S3 bucket prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Config withBucketPrefix(String bucketPrefix) {
        setBucketPrefix(bucketPrefix);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 encryption configuration.
     * </p>
     * 
     * @param encryptionConfig
     *        The Amazon S3 encryption configuration.
     */

    public void setEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
    }

    /**
     * <p>
     * The Amazon S3 encryption configuration.
     * </p>
     * 
     * @return The Amazon S3 encryption configuration.
     */

    public EncryptionConfig getEncryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * <p>
     * The Amazon S3 encryption configuration.
     * </p>
     * 
     * @param encryptionConfig
     *        The Amazon S3 encryption configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Config withEncryptionConfig(EncryptionConfig encryptionConfig) {
        setEncryptionConfig(encryptionConfig);
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
        if (getBucketPrefix() != null)
            sb.append("BucketPrefix: ").append(getBucketPrefix()).append(",");
        if (getEncryptionConfig() != null)
            sb.append("EncryptionConfig: ").append(getEncryptionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Config == false)
            return false;
        S3Config other = (S3Config) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getBucketPrefix() == null ^ this.getBucketPrefix() == null)
            return false;
        if (other.getBucketPrefix() != null && other.getBucketPrefix().equals(this.getBucketPrefix()) == false)
            return false;
        if (other.getEncryptionConfig() == null ^ this.getEncryptionConfig() == null)
            return false;
        if (other.getEncryptionConfig() != null && other.getEncryptionConfig().equals(this.getEncryptionConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getBucketPrefix() == null) ? 0 : getBucketPrefix().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfig() == null) ? 0 : getEncryptionConfig().hashCode());
        return hashCode;
    }

    @Override
    public S3Config clone() {
        try {
            return (S3Config) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.S3ConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
