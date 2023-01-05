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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The location of an object in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/S3Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an S3 bucket.
     * </p>
     */
    private String bucketArn;
    /**
     * <p>
     * The file key for an object in an S3 bucket.
     * </p>
     */
    private String fileKey;
    /**
     * <p>
     * The version of an object in an S3 bucket.
     * </p>
     */
    private String objectVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an S3 bucket.
     * </p>
     * 
     * @param bucketArn
     *        The Amazon Resource Name (ARN) of an S3 bucket.
     */

    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an S3 bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an S3 bucket.
     */

    public String getBucketArn() {
        return this.bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an S3 bucket.
     * </p>
     * 
     * @param bucketArn
     *        The Amazon Resource Name (ARN) of an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withBucketArn(String bucketArn) {
        setBucketArn(bucketArn);
        return this;
    }

    /**
     * <p>
     * The file key for an object in an S3 bucket.
     * </p>
     * 
     * @param fileKey
     *        The file key for an object in an S3 bucket.
     */

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    /**
     * <p>
     * The file key for an object in an S3 bucket.
     * </p>
     * 
     * @return The file key for an object in an S3 bucket.
     */

    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * <p>
     * The file key for an object in an S3 bucket.
     * </p>
     * 
     * @param fileKey
     *        The file key for an object in an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withFileKey(String fileKey) {
        setFileKey(fileKey);
        return this;
    }

    /**
     * <p>
     * The version of an object in an S3 bucket.
     * </p>
     * 
     * @param objectVersion
     *        The version of an object in an S3 bucket.
     */

    public void setObjectVersion(String objectVersion) {
        this.objectVersion = objectVersion;
    }

    /**
     * <p>
     * The version of an object in an S3 bucket.
     * </p>
     * 
     * @return The version of an object in an S3 bucket.
     */

    public String getObjectVersion() {
        return this.objectVersion;
    }

    /**
     * <p>
     * The version of an object in an S3 bucket.
     * </p>
     * 
     * @param objectVersion
     *        The version of an object in an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Location withObjectVersion(String objectVersion) {
        setObjectVersion(objectVersion);
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
        if (getBucketArn() != null)
            sb.append("BucketArn: ").append(getBucketArn()).append(",");
        if (getFileKey() != null)
            sb.append("FileKey: ").append(getFileKey()).append(",");
        if (getObjectVersion() != null)
            sb.append("ObjectVersion: ").append(getObjectVersion());
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
        if (other.getBucketArn() == null ^ this.getBucketArn() == null)
            return false;
        if (other.getBucketArn() != null && other.getBucketArn().equals(this.getBucketArn()) == false)
            return false;
        if (other.getFileKey() == null ^ this.getFileKey() == null)
            return false;
        if (other.getFileKey() != null && other.getFileKey().equals(this.getFileKey()) == false)
            return false;
        if (other.getObjectVersion() == null ^ this.getObjectVersion() == null)
            return false;
        if (other.getObjectVersion() != null && other.getObjectVersion().equals(this.getObjectVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketArn() == null) ? 0 : getBucketArn().hashCode());
        hashCode = prime * hashCode + ((getFileKey() == null) ? 0 : getFileKey().hashCode());
        hashCode = prime * hashCode + ((getObjectVersion() == null) ? 0 : getObjectVersion().hashCode());
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
        com.amazonaws.services.kafkaconnect.model.transform.S3LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
