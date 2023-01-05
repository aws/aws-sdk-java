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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Determines how Amazon AppFlow handles the success response that it gets from the connector after placing data.
 * </p>
 * <p>
 * For example, this setting would determine where to write the response from the destination connector upon a
 * successful insert operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SuccessResponseHandlingConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuccessResponseHandlingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket prefix.
     * </p>
     */
    private String bucketPrefix;
    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     */
    private String bucketName;

    /**
     * <p>
     * The Amazon S3 bucket prefix.
     * </p>
     * 
     * @param bucketPrefix
     *        The Amazon S3 bucket prefix.
     */

    public void setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix.
     * </p>
     * 
     * @return The Amazon S3 bucket prefix.
     */

    public String getBucketPrefix() {
        return this.bucketPrefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix.
     * </p>
     * 
     * @param bucketPrefix
     *        The Amazon S3 bucket prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuccessResponseHandlingConfig withBucketPrefix(String bucketPrefix) {
        setBucketPrefix(bucketPrefix);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        The name of the Amazon S3 bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        The name of the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SuccessResponseHandlingConfig withBucketName(String bucketName) {
        setBucketName(bucketName);
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
        if (getBucketPrefix() != null)
            sb.append("BucketPrefix: ").append(getBucketPrefix()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuccessResponseHandlingConfig == false)
            return false;
        SuccessResponseHandlingConfig other = (SuccessResponseHandlingConfig) obj;
        if (other.getBucketPrefix() == null ^ this.getBucketPrefix() == null)
            return false;
        if (other.getBucketPrefix() != null && other.getBucketPrefix().equals(this.getBucketPrefix()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketPrefix() == null) ? 0 : getBucketPrefix().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        return hashCode;
    }

    @Override
    public SuccessResponseHandlingConfig clone() {
        try {
            return (SuccessResponseHandlingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.SuccessResponseHandlingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
