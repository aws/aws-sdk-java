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
 * For an SQL-based Amazon Kinesis Data Analytics application, identifies the Amazon S3 bucket and object that contains
 * the reference data.
 * </p>
 * <p>
 * A Kinesis Data Analytics application loads reference data only once. If the data changes, you call the
 * <a>UpdateApplication</a> operation to trigger reloading of data into your application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/S3ReferenceDataSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ReferenceDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     */
    private String bucketARN;
    /**
     * <p>
     * The object key name containing the reference data.
     * </p>
     */
    private String fileKey;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @param bucketARN
     *        The Amazon Resource Name (ARN) of the S3 bucket.
     */

    public void setBucketARN(String bucketARN) {
        this.bucketARN = bucketARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the S3 bucket.
     */

    public String getBucketARN() {
        return this.bucketARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the S3 bucket.
     * </p>
     * 
     * @param bucketARN
     *        The Amazon Resource Name (ARN) of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReferenceDataSource withBucketARN(String bucketARN) {
        setBucketARN(bucketARN);
        return this;
    }

    /**
     * <p>
     * The object key name containing the reference data.
     * </p>
     * 
     * @param fileKey
     *        The object key name containing the reference data.
     */

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    /**
     * <p>
     * The object key name containing the reference data.
     * </p>
     * 
     * @return The object key name containing the reference data.
     */

    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * <p>
     * The object key name containing the reference data.
     * </p>
     * 
     * @param fileKey
     *        The object key name containing the reference data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ReferenceDataSource withFileKey(String fileKey) {
        setFileKey(fileKey);
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
            sb.append("FileKey: ").append(getFileKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ReferenceDataSource == false)
            return false;
        S3ReferenceDataSource other = (S3ReferenceDataSource) obj;
        if (other.getBucketARN() == null ^ this.getBucketARN() == null)
            return false;
        if (other.getBucketARN() != null && other.getBucketARN().equals(this.getBucketARN()) == false)
            return false;
        if (other.getFileKey() == null ^ this.getFileKey() == null)
            return false;
        if (other.getFileKey() != null && other.getFileKey().equals(this.getFileKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketARN() == null) ? 0 : getBucketARN().hashCode());
        hashCode = prime * hashCode + ((getFileKey() == null) ? 0 : getFileKey().hashCode());
        return hashCode;
    }

    @Override
    public S3ReferenceDataSource clone() {
        try {
            return (S3ReferenceDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.S3ReferenceDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
