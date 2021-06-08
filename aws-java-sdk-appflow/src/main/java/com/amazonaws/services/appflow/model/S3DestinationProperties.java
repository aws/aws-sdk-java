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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties that are applied when Amazon S3 is used as a destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/S3DestinationProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DestinationProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket name in which Amazon AppFlow places the transferred data.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The object key for the destination bucket in which Amazon AppFlow places the files.
     * </p>
     */
    private String bucketPrefix;

    private S3OutputFormatConfig s3OutputFormatConfig;

    /**
     * <p>
     * The Amazon S3 bucket name in which Amazon AppFlow places the transferred data.
     * </p>
     * 
     * @param bucketName
     *        The Amazon S3 bucket name in which Amazon AppFlow places the transferred data.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket name in which Amazon AppFlow places the transferred data.
     * </p>
     * 
     * @return The Amazon S3 bucket name in which Amazon AppFlow places the transferred data.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The Amazon S3 bucket name in which Amazon AppFlow places the transferred data.
     * </p>
     * 
     * @param bucketName
     *        The Amazon S3 bucket name in which Amazon AppFlow places the transferred data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DestinationProperties withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The object key for the destination bucket in which Amazon AppFlow places the files.
     * </p>
     * 
     * @param bucketPrefix
     *        The object key for the destination bucket in which Amazon AppFlow places the files.
     */

    public void setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
    }

    /**
     * <p>
     * The object key for the destination bucket in which Amazon AppFlow places the files.
     * </p>
     * 
     * @return The object key for the destination bucket in which Amazon AppFlow places the files.
     */

    public String getBucketPrefix() {
        return this.bucketPrefix;
    }

    /**
     * <p>
     * The object key for the destination bucket in which Amazon AppFlow places the files.
     * </p>
     * 
     * @param bucketPrefix
     *        The object key for the destination bucket in which Amazon AppFlow places the files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DestinationProperties withBucketPrefix(String bucketPrefix) {
        setBucketPrefix(bucketPrefix);
        return this;
    }

    /**
     * @param s3OutputFormatConfig
     */

    public void setS3OutputFormatConfig(S3OutputFormatConfig s3OutputFormatConfig) {
        this.s3OutputFormatConfig = s3OutputFormatConfig;
    }

    /**
     * @return
     */

    public S3OutputFormatConfig getS3OutputFormatConfig() {
        return this.s3OutputFormatConfig;
    }

    /**
     * @param s3OutputFormatConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DestinationProperties withS3OutputFormatConfig(S3OutputFormatConfig s3OutputFormatConfig) {
        setS3OutputFormatConfig(s3OutputFormatConfig);
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
        if (getS3OutputFormatConfig() != null)
            sb.append("S3OutputFormatConfig: ").append(getS3OutputFormatConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DestinationProperties == false)
            return false;
        S3DestinationProperties other = (S3DestinationProperties) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getBucketPrefix() == null ^ this.getBucketPrefix() == null)
            return false;
        if (other.getBucketPrefix() != null && other.getBucketPrefix().equals(this.getBucketPrefix()) == false)
            return false;
        if (other.getS3OutputFormatConfig() == null ^ this.getS3OutputFormatConfig() == null)
            return false;
        if (other.getS3OutputFormatConfig() != null && other.getS3OutputFormatConfig().equals(this.getS3OutputFormatConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getBucketPrefix() == null) ? 0 : getBucketPrefix().hashCode());
        hashCode = prime * hashCode + ((getS3OutputFormatConfig() == null) ? 0 : getS3OutputFormatConfig().hashCode());
        return hashCode;
    }

    @Override
    public S3DestinationProperties clone() {
        try {
            return (S3DestinationProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.S3DestinationPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
