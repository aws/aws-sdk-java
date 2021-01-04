/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/DescribeInstanceAccessControlAttributeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceAccessControlAttributeConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The status of the attribute configuration process.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Provides more details about the current status of the specified attribute.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * Gets the list of AWS SSO identity store attributes added to your ABAC configuration.
     * </p>
     */
    private InstanceAccessControlAttributeConfiguration instanceAccessControlAttributeConfiguration;

    /**
     * <p>
     * The status of the attribute configuration process.
     * </p>
     * 
     * @param status
     *        The status of the attribute configuration process.
     * @see InstanceAccessControlAttributeConfigurationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the attribute configuration process.
     * </p>
     * 
     * @return The status of the attribute configuration process.
     * @see InstanceAccessControlAttributeConfigurationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the attribute configuration process.
     * </p>
     * 
     * @param status
     *        The status of the attribute configuration process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceAccessControlAttributeConfigurationStatus
     */

    public DescribeInstanceAccessControlAttributeConfigurationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the attribute configuration process.
     * </p>
     * 
     * @param status
     *        The status of the attribute configuration process.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceAccessControlAttributeConfigurationStatus
     */

    public DescribeInstanceAccessControlAttributeConfigurationResult withStatus(InstanceAccessControlAttributeConfigurationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Provides more details about the current status of the specified attribute.
     * </p>
     * 
     * @param statusReason
     *        Provides more details about the current status of the specified attribute.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Provides more details about the current status of the specified attribute.
     * </p>
     * 
     * @return Provides more details about the current status of the specified attribute.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * Provides more details about the current status of the specified attribute.
     * </p>
     * 
     * @param statusReason
     *        Provides more details about the current status of the specified attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceAccessControlAttributeConfigurationResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * Gets the list of AWS SSO identity store attributes added to your ABAC configuration.
     * </p>
     * 
     * @param instanceAccessControlAttributeConfiguration
     *        Gets the list of AWS SSO identity store attributes added to your ABAC configuration.
     */

    public void setInstanceAccessControlAttributeConfiguration(InstanceAccessControlAttributeConfiguration instanceAccessControlAttributeConfiguration) {
        this.instanceAccessControlAttributeConfiguration = instanceAccessControlAttributeConfiguration;
    }

    /**
     * <p>
     * Gets the list of AWS SSO identity store attributes added to your ABAC configuration.
     * </p>
     * 
     * @return Gets the list of AWS SSO identity store attributes added to your ABAC configuration.
     */

    public InstanceAccessControlAttributeConfiguration getInstanceAccessControlAttributeConfiguration() {
        return this.instanceAccessControlAttributeConfiguration;
    }

    /**
     * <p>
     * Gets the list of AWS SSO identity store attributes added to your ABAC configuration.
     * </p>
     * 
     * @param instanceAccessControlAttributeConfiguration
     *        Gets the list of AWS SSO identity store attributes added to your ABAC configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceAccessControlAttributeConfigurationResult withInstanceAccessControlAttributeConfiguration(
            InstanceAccessControlAttributeConfiguration instanceAccessControlAttributeConfiguration) {
        setInstanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getInstanceAccessControlAttributeConfiguration() != null)
            sb.append("InstanceAccessControlAttributeConfiguration: ").append(getInstanceAccessControlAttributeConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceAccessControlAttributeConfigurationResult == false)
            return false;
        DescribeInstanceAccessControlAttributeConfigurationResult other = (DescribeInstanceAccessControlAttributeConfigurationResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getInstanceAccessControlAttributeConfiguration() == null ^ this.getInstanceAccessControlAttributeConfiguration() == null)
            return false;
        if (other.getInstanceAccessControlAttributeConfiguration() != null
                && other.getInstanceAccessControlAttributeConfiguration().equals(this.getInstanceAccessControlAttributeConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceAccessControlAttributeConfiguration() == null) ? 0 : getInstanceAccessControlAttributeConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceAccessControlAttributeConfigurationResult clone() {
        try {
            return (DescribeInstanceAccessControlAttributeConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
