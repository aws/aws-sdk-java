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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The name and prefix of the S3 bucket where AWS Signer saves your signed objects.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/S3Destination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Destination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * An Amazon S3 prefix that you can use to limit responses to those that begin with the specified prefix.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        Name of the S3 bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     * 
     * @return Name of the S3 bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * Name of the S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        Name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * An Amazon S3 prefix that you can use to limit responses to those that begin with the specified prefix.
     * </p>
     * 
     * @param prefix
     *        An Amazon S3 prefix that you can use to limit responses to those that begin with the specified prefix.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * An Amazon S3 prefix that you can use to limit responses to those that begin with the specified prefix.
     * </p>
     * 
     * @return An Amazon S3 prefix that you can use to limit responses to those that begin with the specified prefix.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * An Amazon S3 prefix that you can use to limit responses to those that begin with the specified prefix.
     * </p>
     * 
     * @param prefix
     *        An Amazon S3 prefix that you can use to limit responses to those that begin with the specified prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withPrefix(String prefix) {
        setPrefix(prefix);
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
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Destination == false)
            return false;
        S3Destination other = (S3Destination) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public S3Destination clone() {
        try {
            return (S3Destination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.S3DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
