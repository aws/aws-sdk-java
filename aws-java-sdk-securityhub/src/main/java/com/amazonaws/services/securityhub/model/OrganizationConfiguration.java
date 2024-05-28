/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about the way an organization is configured in Security Hub.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/OrganizationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the organization uses local or central configuration.
     * </p>
     * <p>
     * If you use local configuration, the Security Hub delegated administrator can set <code>AutoEnable</code> to
     * <code>true</code> and <code>AutoEnableStandards</code> to <code>DEFAULT</code>. This automatically enables
     * Security Hub and default security standards in new organization accounts. These new account settings must be set
     * separately in each Amazon Web Services Region, and settings may be different in each Region.
     * </p>
     * <p>
     * If you use central configuration, the delegated administrator can create configuration policies. Configuration
     * policies can be used to configure Security Hub, security standards, and security controls in multiple accounts
     * and Regions. If you want new organization accounts to use a specific configuration, you can create a
     * configuration policy and associate it with the root or specific organizational units (OUs). New accounts will
     * inherit the policy from the root or their assigned OU.
     * </p>
     */
    private String configurationType;
    /**
     * <p>
     * Describes whether central configuration could be enabled as the <code>ConfigurationType</code> for the
     * organization. If your <code>ConfigurationType</code> is local configuration, then the value of
     * <code>Status</code> is always <code>ENABLED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Provides an explanation if the value of <code>Status</code> is equal to <code>FAILED</code> when
     * <code>ConfigurationType</code> is equal to <code>CENTRAL</code>.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * Indicates whether the organization uses local or central configuration.
     * </p>
     * <p>
     * If you use local configuration, the Security Hub delegated administrator can set <code>AutoEnable</code> to
     * <code>true</code> and <code>AutoEnableStandards</code> to <code>DEFAULT</code>. This automatically enables
     * Security Hub and default security standards in new organization accounts. These new account settings must be set
     * separately in each Amazon Web Services Region, and settings may be different in each Region.
     * </p>
     * <p>
     * If you use central configuration, the delegated administrator can create configuration policies. Configuration
     * policies can be used to configure Security Hub, security standards, and security controls in multiple accounts
     * and Regions. If you want new organization accounts to use a specific configuration, you can create a
     * configuration policy and associate it with the root or specific organizational units (OUs). New accounts will
     * inherit the policy from the root or their assigned OU.
     * </p>
     * 
     * @param configurationType
     *        Indicates whether the organization uses local or central configuration. </p>
     *        <p>
     *        If you use local configuration, the Security Hub delegated administrator can set <code>AutoEnable</code>
     *        to <code>true</code> and <code>AutoEnableStandards</code> to <code>DEFAULT</code>. This automatically
     *        enables Security Hub and default security standards in new organization accounts. These new account
     *        settings must be set separately in each Amazon Web Services Region, and settings may be different in each
     *        Region.
     *        </p>
     *        <p>
     *        If you use central configuration, the delegated administrator can create configuration policies.
     *        Configuration policies can be used to configure Security Hub, security standards, and security controls in
     *        multiple accounts and Regions. If you want new organization accounts to use a specific configuration, you
     *        can create a configuration policy and associate it with the root or specific organizational units (OUs).
     *        New accounts will inherit the policy from the root or their assigned OU.
     * @see OrganizationConfigurationConfigurationType
     */

    public void setConfigurationType(String configurationType) {
        this.configurationType = configurationType;
    }

    /**
     * <p>
     * Indicates whether the organization uses local or central configuration.
     * </p>
     * <p>
     * If you use local configuration, the Security Hub delegated administrator can set <code>AutoEnable</code> to
     * <code>true</code> and <code>AutoEnableStandards</code> to <code>DEFAULT</code>. This automatically enables
     * Security Hub and default security standards in new organization accounts. These new account settings must be set
     * separately in each Amazon Web Services Region, and settings may be different in each Region.
     * </p>
     * <p>
     * If you use central configuration, the delegated administrator can create configuration policies. Configuration
     * policies can be used to configure Security Hub, security standards, and security controls in multiple accounts
     * and Regions. If you want new organization accounts to use a specific configuration, you can create a
     * configuration policy and associate it with the root or specific organizational units (OUs). New accounts will
     * inherit the policy from the root or their assigned OU.
     * </p>
     * 
     * @return Indicates whether the organization uses local or central configuration. </p>
     *         <p>
     *         If you use local configuration, the Security Hub delegated administrator can set <code>AutoEnable</code>
     *         to <code>true</code> and <code>AutoEnableStandards</code> to <code>DEFAULT</code>. This automatically
     *         enables Security Hub and default security standards in new organization accounts. These new account
     *         settings must be set separately in each Amazon Web Services Region, and settings may be different in each
     *         Region.
     *         </p>
     *         <p>
     *         If you use central configuration, the delegated administrator can create configuration policies.
     *         Configuration policies can be used to configure Security Hub, security standards, and security controls
     *         in multiple accounts and Regions. If you want new organization accounts to use a specific configuration,
     *         you can create a configuration policy and associate it with the root or specific organizational units
     *         (OUs). New accounts will inherit the policy from the root or their assigned OU.
     * @see OrganizationConfigurationConfigurationType
     */

    public String getConfigurationType() {
        return this.configurationType;
    }

    /**
     * <p>
     * Indicates whether the organization uses local or central configuration.
     * </p>
     * <p>
     * If you use local configuration, the Security Hub delegated administrator can set <code>AutoEnable</code> to
     * <code>true</code> and <code>AutoEnableStandards</code> to <code>DEFAULT</code>. This automatically enables
     * Security Hub and default security standards in new organization accounts. These new account settings must be set
     * separately in each Amazon Web Services Region, and settings may be different in each Region.
     * </p>
     * <p>
     * If you use central configuration, the delegated administrator can create configuration policies. Configuration
     * policies can be used to configure Security Hub, security standards, and security controls in multiple accounts
     * and Regions. If you want new organization accounts to use a specific configuration, you can create a
     * configuration policy and associate it with the root or specific organizational units (OUs). New accounts will
     * inherit the policy from the root or their assigned OU.
     * </p>
     * 
     * @param configurationType
     *        Indicates whether the organization uses local or central configuration. </p>
     *        <p>
     *        If you use local configuration, the Security Hub delegated administrator can set <code>AutoEnable</code>
     *        to <code>true</code> and <code>AutoEnableStandards</code> to <code>DEFAULT</code>. This automatically
     *        enables Security Hub and default security standards in new organization accounts. These new account
     *        settings must be set separately in each Amazon Web Services Region, and settings may be different in each
     *        Region.
     *        </p>
     *        <p>
     *        If you use central configuration, the delegated administrator can create configuration policies.
     *        Configuration policies can be used to configure Security Hub, security standards, and security controls in
     *        multiple accounts and Regions. If you want new organization accounts to use a specific configuration, you
     *        can create a configuration policy and associate it with the root or specific organizational units (OUs).
     *        New accounts will inherit the policy from the root or their assigned OU.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationConfigurationConfigurationType
     */

    public OrganizationConfiguration withConfigurationType(String configurationType) {
        setConfigurationType(configurationType);
        return this;
    }

    /**
     * <p>
     * Indicates whether the organization uses local or central configuration.
     * </p>
     * <p>
     * If you use local configuration, the Security Hub delegated administrator can set <code>AutoEnable</code> to
     * <code>true</code> and <code>AutoEnableStandards</code> to <code>DEFAULT</code>. This automatically enables
     * Security Hub and default security standards in new organization accounts. These new account settings must be set
     * separately in each Amazon Web Services Region, and settings may be different in each Region.
     * </p>
     * <p>
     * If you use central configuration, the delegated administrator can create configuration policies. Configuration
     * policies can be used to configure Security Hub, security standards, and security controls in multiple accounts
     * and Regions. If you want new organization accounts to use a specific configuration, you can create a
     * configuration policy and associate it with the root or specific organizational units (OUs). New accounts will
     * inherit the policy from the root or their assigned OU.
     * </p>
     * 
     * @param configurationType
     *        Indicates whether the organization uses local or central configuration. </p>
     *        <p>
     *        If you use local configuration, the Security Hub delegated administrator can set <code>AutoEnable</code>
     *        to <code>true</code> and <code>AutoEnableStandards</code> to <code>DEFAULT</code>. This automatically
     *        enables Security Hub and default security standards in new organization accounts. These new account
     *        settings must be set separately in each Amazon Web Services Region, and settings may be different in each
     *        Region.
     *        </p>
     *        <p>
     *        If you use central configuration, the delegated administrator can create configuration policies.
     *        Configuration policies can be used to configure Security Hub, security standards, and security controls in
     *        multiple accounts and Regions. If you want new organization accounts to use a specific configuration, you
     *        can create a configuration policy and associate it with the root or specific organizational units (OUs).
     *        New accounts will inherit the policy from the root or their assigned OU.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationConfigurationConfigurationType
     */

    public OrganizationConfiguration withConfigurationType(OrganizationConfigurationConfigurationType configurationType) {
        this.configurationType = configurationType.toString();
        return this;
    }

    /**
     * <p>
     * Describes whether central configuration could be enabled as the <code>ConfigurationType</code> for the
     * organization. If your <code>ConfigurationType</code> is local configuration, then the value of
     * <code>Status</code> is always <code>ENABLED</code>.
     * </p>
     * 
     * @param status
     *        Describes whether central configuration could be enabled as the <code>ConfigurationType</code> for the
     *        organization. If your <code>ConfigurationType</code> is local configuration, then the value of
     *        <code>Status</code> is always <code>ENABLED</code>.
     * @see OrganizationConfigurationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes whether central configuration could be enabled as the <code>ConfigurationType</code> for the
     * organization. If your <code>ConfigurationType</code> is local configuration, then the value of
     * <code>Status</code> is always <code>ENABLED</code>.
     * </p>
     * 
     * @return Describes whether central configuration could be enabled as the <code>ConfigurationType</code> for the
     *         organization. If your <code>ConfigurationType</code> is local configuration, then the value of
     *         <code>Status</code> is always <code>ENABLED</code>.
     * @see OrganizationConfigurationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Describes whether central configuration could be enabled as the <code>ConfigurationType</code> for the
     * organization. If your <code>ConfigurationType</code> is local configuration, then the value of
     * <code>Status</code> is always <code>ENABLED</code>.
     * </p>
     * 
     * @param status
     *        Describes whether central configuration could be enabled as the <code>ConfigurationType</code> for the
     *        organization. If your <code>ConfigurationType</code> is local configuration, then the value of
     *        <code>Status</code> is always <code>ENABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationConfigurationStatus
     */

    public OrganizationConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Describes whether central configuration could be enabled as the <code>ConfigurationType</code> for the
     * organization. If your <code>ConfigurationType</code> is local configuration, then the value of
     * <code>Status</code> is always <code>ENABLED</code>.
     * </p>
     * 
     * @param status
     *        Describes whether central configuration could be enabled as the <code>ConfigurationType</code> for the
     *        organization. If your <code>ConfigurationType</code> is local configuration, then the value of
     *        <code>Status</code> is always <code>ENABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationConfigurationStatus
     */

    public OrganizationConfiguration withStatus(OrganizationConfigurationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Provides an explanation if the value of <code>Status</code> is equal to <code>FAILED</code> when
     * <code>ConfigurationType</code> is equal to <code>CENTRAL</code>.
     * </p>
     * 
     * @param statusMessage
     *        Provides an explanation if the value of <code>Status</code> is equal to <code>FAILED</code> when
     *        <code>ConfigurationType</code> is equal to <code>CENTRAL</code>.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Provides an explanation if the value of <code>Status</code> is equal to <code>FAILED</code> when
     * <code>ConfigurationType</code> is equal to <code>CENTRAL</code>.
     * </p>
     * 
     * @return Provides an explanation if the value of <code>Status</code> is equal to <code>FAILED</code> when
     *         <code>ConfigurationType</code> is equal to <code>CENTRAL</code>.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Provides an explanation if the value of <code>Status</code> is equal to <code>FAILED</code> when
     * <code>ConfigurationType</code> is equal to <code>CENTRAL</code>.
     * </p>
     * 
     * @param statusMessage
     *        Provides an explanation if the value of <code>Status</code> is equal to <code>FAILED</code> when
     *        <code>ConfigurationType</code> is equal to <code>CENTRAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConfiguration withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getConfigurationType() != null)
            sb.append("ConfigurationType: ").append(getConfigurationType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationConfiguration == false)
            return false;
        OrganizationConfiguration other = (OrganizationConfiguration) obj;
        if (other.getConfigurationType() == null ^ this.getConfigurationType() == null)
            return false;
        if (other.getConfigurationType() != null && other.getConfigurationType().equals(this.getConfigurationType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfigurationType() == null) ? 0 : getConfigurationType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationConfiguration clone() {
        try {
            return (OrganizationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.OrganizationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
