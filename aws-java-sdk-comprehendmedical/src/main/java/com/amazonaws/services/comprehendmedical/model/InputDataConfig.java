/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The input properties for an entities detection job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/InputDataConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URI of the S3 bucket that contains the input data. The bucket must be in the same region as the API endpoint
     * that you are calling.
     * </p>
     * <p>
     * Each file in the document collection must be less than 40 KB. You can store a maximum of 30 GB in the bucket.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The path to the input data files in the S3 bucket.
     * </p>
     */
    private String s3Key;

    /**
     * <p>
     * The URI of the S3 bucket that contains the input data. The bucket must be in the same region as the API endpoint
     * that you are calling.
     * </p>
     * <p>
     * Each file in the document collection must be less than 40 KB. You can store a maximum of 30 GB in the bucket.
     * </p>
     * 
     * @param s3Bucket
     *        The URI of the S3 bucket that contains the input data. The bucket must be in the same region as the API
     *        endpoint that you are calling.</p>
     *        <p>
     *        Each file in the document collection must be less than 40 KB. You can store a maximum of 30 GB in the
     *        bucket.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The URI of the S3 bucket that contains the input data. The bucket must be in the same region as the API endpoint
     * that you are calling.
     * </p>
     * <p>
     * Each file in the document collection must be less than 40 KB. You can store a maximum of 30 GB in the bucket.
     * </p>
     * 
     * @return The URI of the S3 bucket that contains the input data. The bucket must be in the same region as the API
     *         endpoint that you are calling.</p>
     *         <p>
     *         Each file in the document collection must be less than 40 KB. You can store a maximum of 30 GB in the
     *         bucket.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The URI of the S3 bucket that contains the input data. The bucket must be in the same region as the API endpoint
     * that you are calling.
     * </p>
     * <p>
     * Each file in the document collection must be less than 40 KB. You can store a maximum of 30 GB in the bucket.
     * </p>
     * 
     * @param s3Bucket
     *        The URI of the S3 bucket that contains the input data. The bucket must be in the same region as the API
     *        endpoint that you are calling.</p>
     *        <p>
     *        Each file in the document collection must be less than 40 KB. You can store a maximum of 30 GB in the
     *        bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDataConfig withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The path to the input data files in the S3 bucket.
     * </p>
     * 
     * @param s3Key
     *        The path to the input data files in the S3 bucket.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The path to the input data files in the S3 bucket.
     * </p>
     * 
     * @return The path to the input data files in the S3 bucket.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * The path to the input data files in the S3 bucket.
     * </p>
     * 
     * @param s3Key
     *        The path to the input data files in the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDataConfig withS3Key(String s3Key) {
        setS3Key(s3Key);
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
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3Key() != null)
            sb.append("S3Key: ").append(getS3Key());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDataConfig == false)
            return false;
        InputDataConfig other = (InputDataConfig) obj;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        return hashCode;
    }

    @Override
    public InputDataConfig clone() {
        try {
            return (InputDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehendmedical.model.transform.InputDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
