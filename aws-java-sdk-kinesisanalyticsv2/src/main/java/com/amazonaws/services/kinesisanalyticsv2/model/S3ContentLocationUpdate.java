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
 * Describes an update for the Amazon S3 code content location for a Java-based Amazon Kinesis Data Analytics
 * application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/S3ContentLocationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ContentLocationUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The new Amazon Resource Name (ARN) for the S3 bucket containing the application code.
     * </p>
     */
    private String bucketARNUpdate;
    /**
     * <p>
     * The new file key for the object containing the application code.
     * </p>
     */
    private String fileKeyUpdate;
    /**
     * <p>
     * The new version of the object containing the application code.
     * </p>
     */
    private String objectVersionUpdate;

    /**
     * <p>
     * The new Amazon Resource Name (ARN) for the S3 bucket containing the application code.
     * </p>
     * 
     * @param bucketARNUpdate
     *        The new Amazon Resource Name (ARN) for the S3 bucket containing the application code.
     */

    public void setBucketARNUpdate(String bucketARNUpdate) {
        this.bucketARNUpdate = bucketARNUpdate;
    }

    /**
     * <p>
     * The new Amazon Resource Name (ARN) for the S3 bucket containing the application code.
     * </p>
     * 
     * @return The new Amazon Resource Name (ARN) for the S3 bucket containing the application code.
     */

    public String getBucketARNUpdate() {
        return this.bucketARNUpdate;
    }

    /**
     * <p>
     * The new Amazon Resource Name (ARN) for the S3 bucket containing the application code.
     * </p>
     * 
     * @param bucketARNUpdate
     *        The new Amazon Resource Name (ARN) for the S3 bucket containing the application code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ContentLocationUpdate withBucketARNUpdate(String bucketARNUpdate) {
        setBucketARNUpdate(bucketARNUpdate);
        return this;
    }

    /**
     * <p>
     * The new file key for the object containing the application code.
     * </p>
     * 
     * @param fileKeyUpdate
     *        The new file key for the object containing the application code.
     */

    public void setFileKeyUpdate(String fileKeyUpdate) {
        this.fileKeyUpdate = fileKeyUpdate;
    }

    /**
     * <p>
     * The new file key for the object containing the application code.
     * </p>
     * 
     * @return The new file key for the object containing the application code.
     */

    public String getFileKeyUpdate() {
        return this.fileKeyUpdate;
    }

    /**
     * <p>
     * The new file key for the object containing the application code.
     * </p>
     * 
     * @param fileKeyUpdate
     *        The new file key for the object containing the application code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ContentLocationUpdate withFileKeyUpdate(String fileKeyUpdate) {
        setFileKeyUpdate(fileKeyUpdate);
        return this;
    }

    /**
     * <p>
     * The new version of the object containing the application code.
     * </p>
     * 
     * @param objectVersionUpdate
     *        The new version of the object containing the application code.
     */

    public void setObjectVersionUpdate(String objectVersionUpdate) {
        this.objectVersionUpdate = objectVersionUpdate;
    }

    /**
     * <p>
     * The new version of the object containing the application code.
     * </p>
     * 
     * @return The new version of the object containing the application code.
     */

    public String getObjectVersionUpdate() {
        return this.objectVersionUpdate;
    }

    /**
     * <p>
     * The new version of the object containing the application code.
     * </p>
     * 
     * @param objectVersionUpdate
     *        The new version of the object containing the application code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ContentLocationUpdate withObjectVersionUpdate(String objectVersionUpdate) {
        setObjectVersionUpdate(objectVersionUpdate);
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
        if (getBucketARNUpdate() != null)
            sb.append("BucketARNUpdate: ").append(getBucketARNUpdate()).append(",");
        if (getFileKeyUpdate() != null)
            sb.append("FileKeyUpdate: ").append(getFileKeyUpdate()).append(",");
        if (getObjectVersionUpdate() != null)
            sb.append("ObjectVersionUpdate: ").append(getObjectVersionUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ContentLocationUpdate == false)
            return false;
        S3ContentLocationUpdate other = (S3ContentLocationUpdate) obj;
        if (other.getBucketARNUpdate() == null ^ this.getBucketARNUpdate() == null)
            return false;
        if (other.getBucketARNUpdate() != null && other.getBucketARNUpdate().equals(this.getBucketARNUpdate()) == false)
            return false;
        if (other.getFileKeyUpdate() == null ^ this.getFileKeyUpdate() == null)
            return false;
        if (other.getFileKeyUpdate() != null && other.getFileKeyUpdate().equals(this.getFileKeyUpdate()) == false)
            return false;
        if (other.getObjectVersionUpdate() == null ^ this.getObjectVersionUpdate() == null)
            return false;
        if (other.getObjectVersionUpdate() != null && other.getObjectVersionUpdate().equals(this.getObjectVersionUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketARNUpdate() == null) ? 0 : getBucketARNUpdate().hashCode());
        hashCode = prime * hashCode + ((getFileKeyUpdate() == null) ? 0 : getFileKeyUpdate().hashCode());
        hashCode = prime * hashCode + ((getObjectVersionUpdate() == null) ? 0 : getObjectVersionUpdate().hashCode());
        return hashCode;
    }

    @Override
    public S3ContentLocationUpdate clone() {
        try {
            return (S3ContentLocationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.S3ContentLocationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
