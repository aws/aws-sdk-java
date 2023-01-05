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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The S3 bucket that is being imported from.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/S3BucketSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3BucketSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account number of the S3 bucket that is being imported from. If the bucket is owned by the requester this is
     * optional.
     * </p>
     */
    private String s3BucketOwner;
    /**
     * <p>
     * The S3 bucket that is being imported from.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The key prefix shared by all S3 Objects that are being imported.
     * </p>
     */
    private String s3KeyPrefix;

    /**
     * <p>
     * The account number of the S3 bucket that is being imported from. If the bucket is owned by the requester this is
     * optional.
     * </p>
     * 
     * @param s3BucketOwner
     *        The account number of the S3 bucket that is being imported from. If the bucket is owned by the requester
     *        this is optional.
     */

    public void setS3BucketOwner(String s3BucketOwner) {
        this.s3BucketOwner = s3BucketOwner;
    }

    /**
     * <p>
     * The account number of the S3 bucket that is being imported from. If the bucket is owned by the requester this is
     * optional.
     * </p>
     * 
     * @return The account number of the S3 bucket that is being imported from. If the bucket is owned by the requester
     *         this is optional.
     */

    public String getS3BucketOwner() {
        return this.s3BucketOwner;
    }

    /**
     * <p>
     * The account number of the S3 bucket that is being imported from. If the bucket is owned by the requester this is
     * optional.
     * </p>
     * 
     * @param s3BucketOwner
     *        The account number of the S3 bucket that is being imported from. If the bucket is owned by the requester
     *        this is optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketSource withS3BucketOwner(String s3BucketOwner) {
        setS3BucketOwner(s3BucketOwner);
        return this;
    }

    /**
     * <p>
     * The S3 bucket that is being imported from.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket that is being imported from.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket that is being imported from.
     * </p>
     * 
     * @return The S3 bucket that is being imported from.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The S3 bucket that is being imported from.
     * </p>
     * 
     * @param s3Bucket
     *        The S3 bucket that is being imported from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketSource withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The key prefix shared by all S3 Objects that are being imported.
     * </p>
     * 
     * @param s3KeyPrefix
     *        The key prefix shared by all S3 Objects that are being imported.
     */

    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * The key prefix shared by all S3 Objects that are being imported.
     * </p>
     * 
     * @return The key prefix shared by all S3 Objects that are being imported.
     */

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    /**
     * <p>
     * The key prefix shared by all S3 Objects that are being imported.
     * </p>
     * 
     * @param s3KeyPrefix
     *        The key prefix shared by all S3 Objects that are being imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3BucketSource withS3KeyPrefix(String s3KeyPrefix) {
        setS3KeyPrefix(s3KeyPrefix);
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
        if (getS3BucketOwner() != null)
            sb.append("S3BucketOwner: ").append(getS3BucketOwner()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: ").append(getS3KeyPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3BucketSource == false)
            return false;
        S3BucketSource other = (S3BucketSource) obj;
        if (other.getS3BucketOwner() == null ^ this.getS3BucketOwner() == null)
            return false;
        if (other.getS3BucketOwner() != null && other.getS3BucketOwner().equals(this.getS3BucketOwner()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3BucketOwner() == null) ? 0 : getS3BucketOwner().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        return hashCode;
    }

    @Override
    public S3BucketSource clone() {
        try {
            return (S3BucketSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.S3BucketSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
