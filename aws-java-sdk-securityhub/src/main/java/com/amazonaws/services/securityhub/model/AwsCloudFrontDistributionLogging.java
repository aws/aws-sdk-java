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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that controls whether access logs are written for the distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCloudFrontDistributionLogging"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFrontDistributionLogging implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * With this field, you can enable or disable the selected distribution.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs.
     * </p>
     */
    private Boolean includeCookies;
    /**
     * <p>
     * An optional string that you want CloudFront to use as a prefix to the access log filenames for this distribution.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket to store the access logs in.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in.
     * </p>
     * 
     * @return The Amazon S3 bucket to store the access logs in.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket to store the access logs in.
     * </p>
     * 
     * @param bucket
     *        The Amazon S3 bucket to store the access logs in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionLogging withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * With this field, you can enable or disable the selected distribution.
     * </p>
     * 
     * @param enabled
     *        With this field, you can enable or disable the selected distribution.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * With this field, you can enable or disable the selected distribution.
     * </p>
     * 
     * @return With this field, you can enable or disable the selected distribution.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * With this field, you can enable or disable the selected distribution.
     * </p>
     * 
     * @param enabled
     *        With this field, you can enable or disable the selected distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionLogging withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * With this field, you can enable or disable the selected distribution.
     * </p>
     * 
     * @return With this field, you can enable or disable the selected distribution.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs.
     * </p>
     * 
     * @param includeCookies
     *        Specifies whether you want CloudFront to include cookies in access logs.
     */

    public void setIncludeCookies(Boolean includeCookies) {
        this.includeCookies = includeCookies;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs.
     * </p>
     * 
     * @return Specifies whether you want CloudFront to include cookies in access logs.
     */

    public Boolean getIncludeCookies() {
        return this.includeCookies;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs.
     * </p>
     * 
     * @param includeCookies
     *        Specifies whether you want CloudFront to include cookies in access logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionLogging withIncludeCookies(Boolean includeCookies) {
        setIncludeCookies(includeCookies);
        return this;
    }

    /**
     * <p>
     * Specifies whether you want CloudFront to include cookies in access logs.
     * </p>
     * 
     * @return Specifies whether you want CloudFront to include cookies in access logs.
     */

    public Boolean isIncludeCookies() {
        return this.includeCookies;
    }

    /**
     * <p>
     * An optional string that you want CloudFront to use as a prefix to the access log filenames for this distribution.
     * </p>
     * 
     * @param prefix
     *        An optional string that you want CloudFront to use as a prefix to the access log filenames for this
     *        distribution.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * An optional string that you want CloudFront to use as a prefix to the access log filenames for this distribution.
     * </p>
     * 
     * @return An optional string that you want CloudFront to use as a prefix to the access log filenames for this
     *         distribution.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * An optional string that you want CloudFront to use as a prefix to the access log filenames for this distribution.
     * </p>
     * 
     * @param prefix
     *        An optional string that you want CloudFront to use as a prefix to the access log filenames for this
     *        distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionLogging withPrefix(String prefix) {
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
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getIncludeCookies() != null)
            sb.append("IncludeCookies: ").append(getIncludeCookies()).append(",");
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

        if (obj instanceof AwsCloudFrontDistributionLogging == false)
            return false;
        AwsCloudFrontDistributionLogging other = (AwsCloudFrontDistributionLogging) obj;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getIncludeCookies() == null ^ this.getIncludeCookies() == null)
            return false;
        if (other.getIncludeCookies() != null && other.getIncludeCookies().equals(this.getIncludeCookies()) == false)
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

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getIncludeCookies() == null) ? 0 : getIncludeCookies().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudFrontDistributionLogging clone() {
        try {
            return (AwsCloudFrontDistributionLogging) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCloudFrontDistributionLoggingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
