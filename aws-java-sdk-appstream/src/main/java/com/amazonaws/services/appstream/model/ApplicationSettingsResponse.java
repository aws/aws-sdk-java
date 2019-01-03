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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the persistent application settings for users of a stack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ApplicationSettingsResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSettingsResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether persistent application settings are enabled for users during their streaming sessions.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The path prefix for the S3 bucket where users’ persistent application settings are stored.
     * </p>
     */
    private String settingsGroup;
    /**
     * <p>
     * The S3 bucket where users’ persistent application settings are stored. When persistent application settings are
     * enabled for the first time for an account in an AWS Region, an S3 bucket is created. The bucket is unique to the
     * AWS account and the Region.
     * </p>
     */
    private String s3BucketName;

    /**
     * <p>
     * Specifies whether persistent application settings are enabled for users during their streaming sessions.
     * </p>
     * 
     * @param enabled
     *        Specifies whether persistent application settings are enabled for users during their streaming sessions.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether persistent application settings are enabled for users during their streaming sessions.
     * </p>
     * 
     * @return Specifies whether persistent application settings are enabled for users during their streaming sessions.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether persistent application settings are enabled for users during their streaming sessions.
     * </p>
     * 
     * @param enabled
     *        Specifies whether persistent application settings are enabled for users during their streaming sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettingsResponse withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether persistent application settings are enabled for users during their streaming sessions.
     * </p>
     * 
     * @return Specifies whether persistent application settings are enabled for users during their streaming sessions.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The path prefix for the S3 bucket where users’ persistent application settings are stored.
     * </p>
     * 
     * @param settingsGroup
     *        The path prefix for the S3 bucket where users’ persistent application settings are stored.
     */

    public void setSettingsGroup(String settingsGroup) {
        this.settingsGroup = settingsGroup;
    }

    /**
     * <p>
     * The path prefix for the S3 bucket where users’ persistent application settings are stored.
     * </p>
     * 
     * @return The path prefix for the S3 bucket where users’ persistent application settings are stored.
     */

    public String getSettingsGroup() {
        return this.settingsGroup;
    }

    /**
     * <p>
     * The path prefix for the S3 bucket where users’ persistent application settings are stored.
     * </p>
     * 
     * @param settingsGroup
     *        The path prefix for the S3 bucket where users’ persistent application settings are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettingsResponse withSettingsGroup(String settingsGroup) {
        setSettingsGroup(settingsGroup);
        return this;
    }

    /**
     * <p>
     * The S3 bucket where users’ persistent application settings are stored. When persistent application settings are
     * enabled for the first time for an account in an AWS Region, an S3 bucket is created. The bucket is unique to the
     * AWS account and the Region.
     * </p>
     * 
     * @param s3BucketName
     *        The S3 bucket where users’ persistent application settings are stored. When persistent application
     *        settings are enabled for the first time for an account in an AWS Region, an S3 bucket is created. The
     *        bucket is unique to the AWS account and the Region.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The S3 bucket where users’ persistent application settings are stored. When persistent application settings are
     * enabled for the first time for an account in an AWS Region, an S3 bucket is created. The bucket is unique to the
     * AWS account and the Region.
     * </p>
     * 
     * @return The S3 bucket where users’ persistent application settings are stored. When persistent application
     *         settings are enabled for the first time for an account in an AWS Region, an S3 bucket is created. The
     *         bucket is unique to the AWS account and the Region.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The S3 bucket where users’ persistent application settings are stored. When persistent application settings are
     * enabled for the first time for an account in an AWS Region, an S3 bucket is created. The bucket is unique to the
     * AWS account and the Region.
     * </p>
     * 
     * @param s3BucketName
     *        The S3 bucket where users’ persistent application settings are stored. When persistent application
     *        settings are enabled for the first time for an account in an AWS Region, an S3 bucket is created. The
     *        bucket is unique to the AWS account and the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettingsResponse withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
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
        if (getSettingsGroup() != null)
            sb.append("SettingsGroup: ").append(getSettingsGroup()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationSettingsResponse == false)
            return false;
        ApplicationSettingsResponse other = (ApplicationSettingsResponse) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getSettingsGroup() == null ^ this.getSettingsGroup() == null)
            return false;
        if (other.getSettingsGroup() != null && other.getSettingsGroup().equals(this.getSettingsGroup()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getSettingsGroup() == null) ? 0 : getSettingsGroup().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationSettingsResponse clone() {
        try {
            return (ApplicationSettingsResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.ApplicationSettingsResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
