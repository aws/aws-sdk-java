/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The settings for the source S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/S3ImportSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ImportSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URI for the source S3 bucket.
     * </p>
     */
    private String s3LocationUri;
    /**
     * <p>
     * The region associated with the source S3 bucket.
     * </p>
     */
    private String s3BucketRegion;
    /**
     * <p>
     * The IAM ARN role used to access the source S3 bucket.
     * </p>
     */
    private String s3BucketAccessRoleArn;

    /**
     * <p>
     * The URI for the source S3 bucket.
     * </p>
     * 
     * @param s3LocationUri
     *        The URI for the source S3 bucket.
     */

    public void setS3LocationUri(String s3LocationUri) {
        this.s3LocationUri = s3LocationUri;
    }

    /**
     * <p>
     * The URI for the source S3 bucket.
     * </p>
     * 
     * @return The URI for the source S3 bucket.
     */

    public String getS3LocationUri() {
        return this.s3LocationUri;
    }

    /**
     * <p>
     * The URI for the source S3 bucket.
     * </p>
     * 
     * @param s3LocationUri
     *        The URI for the source S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ImportSource withS3LocationUri(String s3LocationUri) {
        setS3LocationUri(s3LocationUri);
        return this;
    }

    /**
     * <p>
     * The region associated with the source S3 bucket.
     * </p>
     * 
     * @param s3BucketRegion
     *        The region associated with the source S3 bucket.
     */

    public void setS3BucketRegion(String s3BucketRegion) {
        this.s3BucketRegion = s3BucketRegion;
    }

    /**
     * <p>
     * The region associated with the source S3 bucket.
     * </p>
     * 
     * @return The region associated with the source S3 bucket.
     */

    public String getS3BucketRegion() {
        return this.s3BucketRegion;
    }

    /**
     * <p>
     * The region associated with the source S3 bucket.
     * </p>
     * 
     * @param s3BucketRegion
     *        The region associated with the source S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ImportSource withS3BucketRegion(String s3BucketRegion) {
        setS3BucketRegion(s3BucketRegion);
        return this;
    }

    /**
     * <p>
     * The IAM ARN role used to access the source S3 bucket.
     * </p>
     * 
     * @param s3BucketAccessRoleArn
     *        The IAM ARN role used to access the source S3 bucket.
     */

    public void setS3BucketAccessRoleArn(String s3BucketAccessRoleArn) {
        this.s3BucketAccessRoleArn = s3BucketAccessRoleArn;
    }

    /**
     * <p>
     * The IAM ARN role used to access the source S3 bucket.
     * </p>
     * 
     * @return The IAM ARN role used to access the source S3 bucket.
     */

    public String getS3BucketAccessRoleArn() {
        return this.s3BucketAccessRoleArn;
    }

    /**
     * <p>
     * The IAM ARN role used to access the source S3 bucket.
     * </p>
     * 
     * @param s3BucketAccessRoleArn
     *        The IAM ARN role used to access the source S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ImportSource withS3BucketAccessRoleArn(String s3BucketAccessRoleArn) {
        setS3BucketAccessRoleArn(s3BucketAccessRoleArn);
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
        if (getS3LocationUri() != null)
            sb.append("S3LocationUri: ").append(getS3LocationUri()).append(",");
        if (getS3BucketRegion() != null)
            sb.append("S3BucketRegion: ").append(getS3BucketRegion()).append(",");
        if (getS3BucketAccessRoleArn() != null)
            sb.append("S3BucketAccessRoleArn: ").append(getS3BucketAccessRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ImportSource == false)
            return false;
        S3ImportSource other = (S3ImportSource) obj;
        if (other.getS3LocationUri() == null ^ this.getS3LocationUri() == null)
            return false;
        if (other.getS3LocationUri() != null && other.getS3LocationUri().equals(this.getS3LocationUri()) == false)
            return false;
        if (other.getS3BucketRegion() == null ^ this.getS3BucketRegion() == null)
            return false;
        if (other.getS3BucketRegion() != null && other.getS3BucketRegion().equals(this.getS3BucketRegion()) == false)
            return false;
        if (other.getS3BucketAccessRoleArn() == null ^ this.getS3BucketAccessRoleArn() == null)
            return false;
        if (other.getS3BucketAccessRoleArn() != null && other.getS3BucketAccessRoleArn().equals(this.getS3BucketAccessRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3LocationUri() == null) ? 0 : getS3LocationUri().hashCode());
        hashCode = prime * hashCode + ((getS3BucketRegion() == null) ? 0 : getS3BucketRegion().hashCode());
        hashCode = prime * hashCode + ((getS3BucketAccessRoleArn() == null) ? 0 : getS3BucketAccessRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public S3ImportSource clone() {
        try {
            return (S3ImportSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.S3ImportSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
