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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the versioning state of an S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketBucketVersioningConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketBucketVersioningConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether MFA delete is currently enabled in the S3 bucket versioning configuration. If the S3 bucket was
     * never configured with MFA delete, then this attribute is not included.
     * </p>
     */
    private Boolean isMfaDeleteEnabled;
    /**
     * <p>
     * The versioning status of the S3 bucket. Valid values are <code>Enabled</code> or <code>Suspended</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies whether MFA delete is currently enabled in the S3 bucket versioning configuration. If the S3 bucket was
     * never configured with MFA delete, then this attribute is not included.
     * </p>
     * 
     * @param isMfaDeleteEnabled
     *        Specifies whether MFA delete is currently enabled in the S3 bucket versioning configuration. If the S3
     *        bucket was never configured with MFA delete, then this attribute is not included.
     */

    public void setIsMfaDeleteEnabled(Boolean isMfaDeleteEnabled) {
        this.isMfaDeleteEnabled = isMfaDeleteEnabled;
    }

    /**
     * <p>
     * Specifies whether MFA delete is currently enabled in the S3 bucket versioning configuration. If the S3 bucket was
     * never configured with MFA delete, then this attribute is not included.
     * </p>
     * 
     * @return Specifies whether MFA delete is currently enabled in the S3 bucket versioning configuration. If the S3
     *         bucket was never configured with MFA delete, then this attribute is not included.
     */

    public Boolean getIsMfaDeleteEnabled() {
        return this.isMfaDeleteEnabled;
    }

    /**
     * <p>
     * Specifies whether MFA delete is currently enabled in the S3 bucket versioning configuration. If the S3 bucket was
     * never configured with MFA delete, then this attribute is not included.
     * </p>
     * 
     * @param isMfaDeleteEnabled
     *        Specifies whether MFA delete is currently enabled in the S3 bucket versioning configuration. If the S3
     *        bucket was never configured with MFA delete, then this attribute is not included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketVersioningConfiguration withIsMfaDeleteEnabled(Boolean isMfaDeleteEnabled) {
        setIsMfaDeleteEnabled(isMfaDeleteEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether MFA delete is currently enabled in the S3 bucket versioning configuration. If the S3 bucket was
     * never configured with MFA delete, then this attribute is not included.
     * </p>
     * 
     * @return Specifies whether MFA delete is currently enabled in the S3 bucket versioning configuration. If the S3
     *         bucket was never configured with MFA delete, then this attribute is not included.
     */

    public Boolean isMfaDeleteEnabled() {
        return this.isMfaDeleteEnabled;
    }

    /**
     * <p>
     * The versioning status of the S3 bucket. Valid values are <code>Enabled</code> or <code>Suspended</code>.
     * </p>
     * 
     * @param status
     *        The versioning status of the S3 bucket. Valid values are <code>Enabled</code> or <code>Suspended</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The versioning status of the S3 bucket. Valid values are <code>Enabled</code> or <code>Suspended</code>.
     * </p>
     * 
     * @return The versioning status of the S3 bucket. Valid values are <code>Enabled</code> or <code>Suspended</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The versioning status of the S3 bucket. Valid values are <code>Enabled</code> or <code>Suspended</code>.
     * </p>
     * 
     * @param status
     *        The versioning status of the S3 bucket. Valid values are <code>Enabled</code> or <code>Suspended</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketBucketVersioningConfiguration withStatus(String status) {
        setStatus(status);
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
        if (getIsMfaDeleteEnabled() != null)
            sb.append("IsMfaDeleteEnabled: ").append(getIsMfaDeleteEnabled()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketBucketVersioningConfiguration == false)
            return false;
        AwsS3BucketBucketVersioningConfiguration other = (AwsS3BucketBucketVersioningConfiguration) obj;
        if (other.getIsMfaDeleteEnabled() == null ^ this.getIsMfaDeleteEnabled() == null)
            return false;
        if (other.getIsMfaDeleteEnabled() != null && other.getIsMfaDeleteEnabled().equals(this.getIsMfaDeleteEnabled()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsMfaDeleteEnabled() == null) ? 0 : getIsMfaDeleteEnabled().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketBucketVersioningConfiguration clone() {
        try {
            return (AwsS3BucketBucketVersioningConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketBucketVersioningConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
