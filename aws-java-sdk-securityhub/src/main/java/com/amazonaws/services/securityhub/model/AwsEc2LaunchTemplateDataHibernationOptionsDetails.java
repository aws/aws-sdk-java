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
 * Specifies whether your Amazon EC2 instance is configured for hibernation.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2LaunchTemplateDataHibernationOptionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataHibernationOptionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If you set this parameter to <code>true</code>, the instance is enabled for hibernation.
     * </p>
     */
    private Boolean configured;

    /**
     * <p>
     * If you set this parameter to <code>true</code>, the instance is enabled for hibernation.
     * </p>
     * 
     * @param configured
     *        If you set this parameter to <code>true</code>, the instance is enabled for hibernation.
     */

    public void setConfigured(Boolean configured) {
        this.configured = configured;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, the instance is enabled for hibernation.
     * </p>
     * 
     * @return If you set this parameter to <code>true</code>, the instance is enabled for hibernation.
     */

    public Boolean getConfigured() {
        return this.configured;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, the instance is enabled for hibernation.
     * </p>
     * 
     * @param configured
     *        If you set this parameter to <code>true</code>, the instance is enabled for hibernation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataHibernationOptionsDetails withConfigured(Boolean configured) {
        setConfigured(configured);
        return this;
    }

    /**
     * <p>
     * If you set this parameter to <code>true</code>, the instance is enabled for hibernation.
     * </p>
     * 
     * @return If you set this parameter to <code>true</code>, the instance is enabled for hibernation.
     */

    public Boolean isConfigured() {
        return this.configured;
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
        if (getConfigured() != null)
            sb.append("Configured: ").append(getConfigured());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2LaunchTemplateDataHibernationOptionsDetails == false)
            return false;
        AwsEc2LaunchTemplateDataHibernationOptionsDetails other = (AwsEc2LaunchTemplateDataHibernationOptionsDetails) obj;
        if (other.getConfigured() == null ^ this.getConfigured() == null)
            return false;
        if (other.getConfigured() != null && other.getConfigured().equals(this.getConfigured()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigured() == null) ? 0 : getConfigured().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2LaunchTemplateDataHibernationOptionsDetails clone() {
        try {
            return (AwsEc2LaunchTemplateDataHibernationOptionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2LaunchTemplateDataHibernationOptionsDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
