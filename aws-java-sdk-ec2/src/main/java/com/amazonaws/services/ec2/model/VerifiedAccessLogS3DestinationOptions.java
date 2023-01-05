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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Options for Amazon S3 as a logging destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VerifiedAccessLogS3DestinationOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessLogS3DestinationOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether logging is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The bucket name.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The bucket prefix.
     * </p>
     */
    private String prefix;
    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the Amazon S3 bucket.
     * </p>
     */
    private String bucketOwner;

    /**
     * <p>
     * Indicates whether logging is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether logging is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether logging is enabled.
     * </p>
     * 
     * @return Indicates whether logging is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether logging is enabled.
     * </p>
     * 
     * @param enabled
     *        Indicates whether logging is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessLogS3DestinationOptions withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether logging is enabled.
     * </p>
     * 
     * @return Indicates whether logging is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The bucket name.
     * </p>
     * 
     * @param bucketName
     *        The bucket name.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The bucket name.
     * </p>
     * 
     * @return The bucket name.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The bucket name.
     * </p>
     * 
     * @param bucketName
     *        The bucket name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessLogS3DestinationOptions withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The bucket prefix.
     * </p>
     * 
     * @param prefix
     *        The bucket prefix.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The bucket prefix.
     * </p>
     * 
     * @return The bucket prefix.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * The bucket prefix.
     * </p>
     * 
     * @param prefix
     *        The bucket prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessLogS3DestinationOptions withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the Amazon S3 bucket.
     * </p>
     * 
     * @param bucketOwner
     *        The ID of the Amazon Web Services account that owns the Amazon S3 bucket.
     */

    public void setBucketOwner(String bucketOwner) {
        this.bucketOwner = bucketOwner;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the Amazon S3 bucket.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that owns the Amazon S3 bucket.
     */

    public String getBucketOwner() {
        return this.bucketOwner;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that owns the Amazon S3 bucket.
     * </p>
     * 
     * @param bucketOwner
     *        The ID of the Amazon Web Services account that owns the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifiedAccessLogS3DestinationOptions withBucketOwner(String bucketOwner) {
        setBucketOwner(bucketOwner);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix()).append(",");
        if (getBucketOwner() != null)
            sb.append("BucketOwner: ").append(getBucketOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifiedAccessLogS3DestinationOptions == false)
            return false;
        VerifiedAccessLogS3DestinationOptions other = (VerifiedAccessLogS3DestinationOptions) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getBucketOwner() == null ^ this.getBucketOwner() == null)
            return false;
        if (other.getBucketOwner() != null && other.getBucketOwner().equals(this.getBucketOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getBucketOwner() == null) ? 0 : getBucketOwner().hashCode());
        return hashCode;
    }

    @Override
    public VerifiedAccessLogS3DestinationOptions clone() {
        try {
            return (VerifiedAccessLogS3DestinationOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
