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
package com.amazonaws.services.ivschat.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an S3 location where chat logs will be stored.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/S3DestinationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3DestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the Amazon S3 bucket where chat activity will be logged.
     * </p>
     */
    private String bucketName;

    /**
     * <p>
     * Name of the Amazon S3 bucket where chat activity will be logged.
     * </p>
     * 
     * @param bucketName
     *        Name of the Amazon S3 bucket where chat activity will be logged.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * Name of the Amazon S3 bucket where chat activity will be logged.
     * </p>
     * 
     * @return Name of the Amazon S3 bucket where chat activity will be logged.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * Name of the Amazon S3 bucket where chat activity will be logged.
     * </p>
     * 
     * @param bucketName
     *        Name of the Amazon S3 bucket where chat activity will be logged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3DestinationConfiguration withBucketName(String bucketName) {
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

        if (obj instanceof S3DestinationConfiguration == false)
            return false;
        S3DestinationConfiguration other = (S3DestinationConfiguration) obj;
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

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        return hashCode;
    }

    @Override
    public S3DestinationConfiguration clone() {
        try {
            return (S3DestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivschat.model.transform.S3DestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
