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
 * The notification configuration for the S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketNotificationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketNotificationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configurations for S3 bucket notifications.
     * </p>
     */
    private java.util.List<AwsS3BucketNotificationConfigurationDetail> configurations;

    /**
     * <p>
     * Configurations for S3 bucket notifications.
     * </p>
     * 
     * @return Configurations for S3 bucket notifications.
     */

    public java.util.List<AwsS3BucketNotificationConfigurationDetail> getConfigurations() {
        return configurations;
    }

    /**
     * <p>
     * Configurations for S3 bucket notifications.
     * </p>
     * 
     * @param configurations
     *        Configurations for S3 bucket notifications.
     */

    public void setConfigurations(java.util.Collection<AwsS3BucketNotificationConfigurationDetail> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new java.util.ArrayList<AwsS3BucketNotificationConfigurationDetail>(configurations);
    }

    /**
     * <p>
     * Configurations for S3 bucket notifications.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurations(java.util.Collection)} or {@link #withConfigurations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configurations
     *        Configurations for S3 bucket notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketNotificationConfiguration withConfigurations(AwsS3BucketNotificationConfigurationDetail... configurations) {
        if (this.configurations == null) {
            setConfigurations(new java.util.ArrayList<AwsS3BucketNotificationConfigurationDetail>(configurations.length));
        }
        for (AwsS3BucketNotificationConfigurationDetail ele : configurations) {
            this.configurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configurations for S3 bucket notifications.
     * </p>
     * 
     * @param configurations
     *        Configurations for S3 bucket notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketNotificationConfiguration withConfigurations(java.util.Collection<AwsS3BucketNotificationConfigurationDetail> configurations) {
        setConfigurations(configurations);
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
        if (getConfigurations() != null)
            sb.append("Configurations: ").append(getConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketNotificationConfiguration == false)
            return false;
        AwsS3BucketNotificationConfiguration other = (AwsS3BucketNotificationConfiguration) obj;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketNotificationConfiguration clone() {
        try {
            return (AwsS3BucketNotificationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketNotificationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
