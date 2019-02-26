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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the S3 bucket name, object key name, and IAM role that Amazon Kinesis Analytics can assume to read the
 * Amazon S3 object on your behalf and populate the in-application reference table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/S3ReferenceDataSourceUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ReferenceDataSourceUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     */
    private String bucketARNUpdate;
    /**
     * <p>
     * Object key name.
     * </p>
     */
    private String fileKeyUpdate;
    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate the
     * in-application.
     * </p>
     */
    private String referenceRoleARNUpdate;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @param bucketARNUpdate
     *        Amazon Resource Name (ARN) of the S3 bucket.
     */

    public void setBucketARNUpdate(String bucketARNUpdate) {
        this.bucketARNUpdate = bucketARNUpdate;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the S3 bucket.
     */

    public String getBucketARNUpdate() {
        return this.bucketARNUpdate;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @param bucketARNUpdate
     *        Amazon Resource Name (ARN) of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReferenceDataSourceUpdate withBucketARNUpdate(String bucketARNUpdate) {
        setBucketARNUpdate(bucketARNUpdate);
        return this;
    }

    /**
     * <p>
     * Object key name.
     * </p>
     * 
     * @param fileKeyUpdate
     *        Object key name.
     */

    public void setFileKeyUpdate(String fileKeyUpdate) {
        this.fileKeyUpdate = fileKeyUpdate;
    }

    /**
     * <p>
     * Object key name.
     * </p>
     * 
     * @return Object key name.
     */

    public String getFileKeyUpdate() {
        return this.fileKeyUpdate;
    }

    /**
     * <p>
     * Object key name.
     * </p>
     * 
     * @param fileKeyUpdate
     *        Object key name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReferenceDataSourceUpdate withFileKeyUpdate(String fileKeyUpdate) {
        setFileKeyUpdate(fileKeyUpdate);
        return this;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate the
     * in-application.
     * </p>
     * 
     * @param referenceRoleARNUpdate
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate the
     *        in-application.
     */

    public void setReferenceRoleARNUpdate(String referenceRoleARNUpdate) {
        this.referenceRoleARNUpdate = referenceRoleARNUpdate;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate the
     * in-application.
     * </p>
     * 
     * @return ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate
     *         the in-application.
     */

    public String getReferenceRoleARNUpdate() {
        return this.referenceRoleARNUpdate;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate the
     * in-application.
     * </p>
     * 
     * @param referenceRoleARNUpdate
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate the
     *        in-application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReferenceDataSourceUpdate withReferenceRoleARNUpdate(String referenceRoleARNUpdate) {
        setReferenceRoleARNUpdate(referenceRoleARNUpdate);
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
        if (getReferenceRoleARNUpdate() != null)
            sb.append("ReferenceRoleARNUpdate: ").append(getReferenceRoleARNUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ReferenceDataSourceUpdate == false)
            return false;
        S3ReferenceDataSourceUpdate other = (S3ReferenceDataSourceUpdate) obj;
        if (other.getBucketARNUpdate() == null ^ this.getBucketARNUpdate() == null)
            return false;
        if (other.getBucketARNUpdate() != null && other.getBucketARNUpdate().equals(this.getBucketARNUpdate()) == false)
            return false;
        if (other.getFileKeyUpdate() == null ^ this.getFileKeyUpdate() == null)
            return false;
        if (other.getFileKeyUpdate() != null && other.getFileKeyUpdate().equals(this.getFileKeyUpdate()) == false)
            return false;
        if (other.getReferenceRoleARNUpdate() == null ^ this.getReferenceRoleARNUpdate() == null)
            return false;
        if (other.getReferenceRoleARNUpdate() != null && other.getReferenceRoleARNUpdate().equals(this.getReferenceRoleARNUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketARNUpdate() == null) ? 0 : getBucketARNUpdate().hashCode());
        hashCode = prime * hashCode + ((getFileKeyUpdate() == null) ? 0 : getFileKeyUpdate().hashCode());
        hashCode = prime * hashCode + ((getReferenceRoleARNUpdate() == null) ? 0 : getReferenceRoleARNUpdate().hashCode());
        return hashCode;
    }

    @Override
    public S3ReferenceDataSourceUpdate clone() {
        try {
            return (S3ReferenceDataSourceUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.S3ReferenceDataSourceUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
