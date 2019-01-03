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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the location of a Java-based Amazon Kinesis Data Analytics application's code stored in an S3 bucket.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/S3ApplicationCodeLocationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ApplicationCodeLocationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
     * </p>
     */
    private String bucketARN;
    /**
     * <p>
     * The file key for the object containing the application code.
     * </p>
     */
    private String fileKey;
    /**
     * <p>
     * The version of the object containing the application code.
     * </p>
     */
    private String objectVersion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
     * </p>
     * 
     * @param bucketARN
     *        The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
     */

    public void setBucketARN(String bucketARN) {
        this.bucketARN = bucketARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
     */

    public String getBucketARN() {
        return this.bucketARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
     * </p>
     * 
     * @param bucketARN
     *        The Amazon Resource Name (ARN) for the S3 bucket containing the application code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ApplicationCodeLocationDescription withBucketARN(String bucketARN) {
        setBucketARN(bucketARN);
        return this;
    }

    /**
     * <p>
     * The file key for the object containing the application code.
     * </p>
     * 
     * @param fileKey
     *        The file key for the object containing the application code.
     */

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    /**
     * <p>
     * The file key for the object containing the application code.
     * </p>
     * 
     * @return The file key for the object containing the application code.
     */

    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * <p>
     * The file key for the object containing the application code.
     * </p>
     * 
     * @param fileKey
     *        The file key for the object containing the application code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ApplicationCodeLocationDescription withFileKey(String fileKey) {
        setFileKey(fileKey);
        return this;
    }

    /**
     * <p>
     * The version of the object containing the application code.
     * </p>
     * 
     * @param objectVersion
     *        The version of the object containing the application code.
     */

    public void setObjectVersion(String objectVersion) {
        this.objectVersion = objectVersion;
    }

    /**
     * <p>
     * The version of the object containing the application code.
     * </p>
     * 
     * @return The version of the object containing the application code.
     */

    public String getObjectVersion() {
        return this.objectVersion;
    }

    /**
     * <p>
     * The version of the object containing the application code.
     * </p>
     * 
     * @param objectVersion
     *        The version of the object containing the application code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ApplicationCodeLocationDescription withObjectVersion(String objectVersion) {
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
        if (getBucketARN() != null)
            sb.append("BucketARN: ").append(getBucketARN()).append(",");
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

        if (obj instanceof S3ApplicationCodeLocationDescription == false)
            return false;
        S3ApplicationCodeLocationDescription other = (S3ApplicationCodeLocationDescription) obj;
        if (other.getBucketARN() == null ^ this.getBucketARN() == null)
            return false;
        if (other.getBucketARN() != null && other.getBucketARN().equals(this.getBucketARN()) == false)
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

        hashCode = prime * hashCode + ((getBucketARN() == null) ? 0 : getBucketARN().hashCode());
        hashCode = prime * hashCode + ((getFileKey() == null) ? 0 : getFileKey().hashCode());
        hashCode = prime * hashCode + ((getObjectVersion() == null) ? 0 : getObjectVersion().hashCode());
        return hashCode;
    }

    @Override
    public S3ApplicationCodeLocationDescription clone() {
        try {
            return (S3ApplicationCodeLocationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.S3ApplicationCodeLocationDescriptionMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
