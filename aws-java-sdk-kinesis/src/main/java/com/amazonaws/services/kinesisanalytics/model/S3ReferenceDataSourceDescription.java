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
 * Provides the bucket name and object key name that stores the reference data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/S3ReferenceDataSourceDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ReferenceDataSourceDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     */
    private String bucketARN;
    /**
     * <p>
     * Amazon S3 object key name.
     * </p>
     */
    private String fileKey;
    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf to
     * populate the in-application reference table.
     * </p>
     */
    private String referenceRoleARN;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @param bucketARN
     *        Amazon Resource Name (ARN) of the S3 bucket.
     */

    public void setBucketARN(String bucketARN) {
        this.bucketARN = bucketARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the S3 bucket.
     */

    public String getBucketARN() {
        return this.bucketARN;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @param bucketARN
     *        Amazon Resource Name (ARN) of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReferenceDataSourceDescription withBucketARN(String bucketARN) {
        setBucketARN(bucketARN);
        return this;
    }

    /**
     * <p>
     * Amazon S3 object key name.
     * </p>
     * 
     * @param fileKey
     *        Amazon S3 object key name.
     */

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    /**
     * <p>
     * Amazon S3 object key name.
     * </p>
     * 
     * @return Amazon S3 object key name.
     */

    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * <p>
     * Amazon S3 object key name.
     * </p>
     * 
     * @param fileKey
     *        Amazon S3 object key name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReferenceDataSourceDescription withFileKey(String fileKey) {
        setFileKey(fileKey);
        return this;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf to
     * populate the in-application reference table.
     * </p>
     * 
     * @param referenceRoleARN
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf
     *        to populate the in-application reference table.
     */

    public void setReferenceRoleARN(String referenceRoleARN) {
        this.referenceRoleARN = referenceRoleARN;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf to
     * populate the in-application reference table.
     * </p>
     * 
     * @return ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf
     *         to populate the in-application reference table.
     */

    public String getReferenceRoleARN() {
        return this.referenceRoleARN;
    }

    /**
     * <p>
     * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf to
     * populate the in-application reference table.
     * </p>
     * 
     * @param referenceRoleARN
     *        ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf
     *        to populate the in-application reference table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReferenceDataSourceDescription withReferenceRoleARN(String referenceRoleARN) {
        setReferenceRoleARN(referenceRoleARN);
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
        if (getReferenceRoleARN() != null)
            sb.append("ReferenceRoleARN: ").append(getReferenceRoleARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ReferenceDataSourceDescription == false)
            return false;
        S3ReferenceDataSourceDescription other = (S3ReferenceDataSourceDescription) obj;
        if (other.getBucketARN() == null ^ this.getBucketARN() == null)
            return false;
        if (other.getBucketARN() != null && other.getBucketARN().equals(this.getBucketARN()) == false)
            return false;
        if (other.getFileKey() == null ^ this.getFileKey() == null)
            return false;
        if (other.getFileKey() != null && other.getFileKey().equals(this.getFileKey()) == false)
            return false;
        if (other.getReferenceRoleARN() == null ^ this.getReferenceRoleARN() == null)
            return false;
        if (other.getReferenceRoleARN() != null && other.getReferenceRoleARN().equals(this.getReferenceRoleARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketARN() == null) ? 0 : getBucketARN().hashCode());
        hashCode = prime * hashCode + ((getFileKey() == null) ? 0 : getFileKey().hashCode());
        hashCode = prime * hashCode + ((getReferenceRoleARN() == null) ? 0 : getReferenceRoleARN().hashCode());
        return hashCode;
    }

    @Override
    public S3ReferenceDataSourceDescription clone() {
        try {
            return (S3ReferenceDataSourceDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.S3ReferenceDataSourceDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
