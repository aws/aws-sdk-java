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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The file in Amazon S3 where your data is saved.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/File" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class File implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Amazon S3 bucket from which data is imported.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The key of the Amazon S3 object that contains your data. Each object has a key that is a unique identifier. Each
     * object has exactly one key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The version ID to identify a specific version of the Amazon S3 object that contains your data.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * The name of the Amazon S3 bucket from which data is imported.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket from which data is imported.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket from which data is imported.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket from which data is imported.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket from which data is imported.
     * </p>
     * 
     * @param bucket
     *        The name of the Amazon S3 bucket from which data is imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public File withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The key of the Amazon S3 object that contains your data. Each object has a key that is a unique identifier. Each
     * object has exactly one key.
     * </p>
     * 
     * @param key
     *        The key of the Amazon S3 object that contains your data. Each object has a key that is a unique
     *        identifier. Each object has exactly one key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key of the Amazon S3 object that contains your data. Each object has a key that is a unique identifier. Each
     * object has exactly one key.
     * </p>
     * 
     * @return The key of the Amazon S3 object that contains your data. Each object has a key that is a unique
     *         identifier. Each object has exactly one key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key of the Amazon S3 object that contains your data. Each object has a key that is a unique identifier. Each
     * object has exactly one key.
     * </p>
     * 
     * @param key
     *        The key of the Amazon S3 object that contains your data. Each object has a key that is a unique
     *        identifier. Each object has exactly one key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public File withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The version ID to identify a specific version of the Amazon S3 object that contains your data.
     * </p>
     * 
     * @param versionId
     *        The version ID to identify a specific version of the Amazon S3 object that contains your data.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The version ID to identify a specific version of the Amazon S3 object that contains your data.
     * </p>
     * 
     * @return The version ID to identify a specific version of the Amazon S3 object that contains your data.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The version ID to identify a specific version of the Amazon S3 object that contains your data.
     * </p>
     * 
     * @param versionId
     *        The version ID to identify a specific version of the Amazon S3 object that contains your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public File withVersionId(String versionId) {
        setVersionId(versionId);
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
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof File == false)
            return false;
        File other = (File) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public File clone() {
        try {
            return (File) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.FileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
