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
 * An object that defines how Security Hub is configured. The configuration policy includes whether Security Hub is
 * enabled or disabled, a list of enabled security standards, a list of enabled or disabled security controls, and a
 * list of custom parameter values for specified controls. If you provide a list of security controls that are enabled
 * in the configuration policy, Security Hub disables all other controls (including newly released controls). If you
 * provide a list of security controls that are disabled in the configuration policy, Security Hub enables all other
 * controls (including newly released controls).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/SecurityHubPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityHubPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether Security Hub is enabled in the policy.
     * </p>
     */
    private Boolean serviceEnabled;
    /**
     * <p>
     * A list that defines which security standards are enabled in the configuration policy.
     * </p>
     */
    private java.util.List<String> enabledStandardIdentifiers;
    /**
     * <p>
     * An object that defines which security controls are enabled in the configuration policy. The enablement status of
     * a control is aligned across all of the enabled standards in an account.
     * </p>
     */
    private SecurityControlsConfiguration securityControlsConfiguration;

    /**
     * <p>
     * Indicates whether Security Hub is enabled in the policy.
     * </p>
     * 
     * @param serviceEnabled
     *        Indicates whether Security Hub is enabled in the policy.
     */

    public void setServiceEnabled(Boolean serviceEnabled) {
        this.serviceEnabled = serviceEnabled;
    }

    /**
     * <p>
     * Indicates whether Security Hub is enabled in the policy.
     * </p>
     * 
     * @return Indicates whether Security Hub is enabled in the policy.
     */

    public Boolean getServiceEnabled() {
        return this.serviceEnabled;
    }

    /**
     * <p>
     * Indicates whether Security Hub is enabled in the policy.
     * </p>
     * 
     * @param serviceEnabled
     *        Indicates whether Security Hub is enabled in the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityHubPolicy withServiceEnabled(Boolean serviceEnabled) {
        setServiceEnabled(serviceEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether Security Hub is enabled in the policy.
     * </p>
     * 
     * @return Indicates whether Security Hub is enabled in the policy.
     */

    public Boolean isServiceEnabled() {
        return this.serviceEnabled;
    }

    /**
     * <p>
     * A list that defines which security standards are enabled in the configuration policy.
     * </p>
     * 
     * @return A list that defines which security standards are enabled in the configuration policy.
     */

    public java.util.List<String> getEnabledStandardIdentifiers() {
        return enabledStandardIdentifiers;
    }

    /**
     * <p>
     * A list that defines which security standards are enabled in the configuration policy.
     * </p>
     * 
     * @param enabledStandardIdentifiers
     *        A list that defines which security standards are enabled in the configuration policy.
     */

    public void setEnabledStandardIdentifiers(java.util.Collection<String> enabledStandardIdentifiers) {
        if (enabledStandardIdentifiers == null) {
            this.enabledStandardIdentifiers = null;
            return;
        }

        this.enabledStandardIdentifiers = new java.util.ArrayList<String>(enabledStandardIdentifiers);
    }

    /**
     * <p>
     * A list that defines which security standards are enabled in the configuration policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledStandardIdentifiers(java.util.Collection)} or
     * {@link #withEnabledStandardIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enabledStandardIdentifiers
     *        A list that defines which security standards are enabled in the configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityHubPolicy withEnabledStandardIdentifiers(String... enabledStandardIdentifiers) {
        if (this.enabledStandardIdentifiers == null) {
            setEnabledStandardIdentifiers(new java.util.ArrayList<String>(enabledStandardIdentifiers.length));
        }
        for (String ele : enabledStandardIdentifiers) {
            this.enabledStandardIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that defines which security standards are enabled in the configuration policy.
     * </p>
     * 
     * @param enabledStandardIdentifiers
     *        A list that defines which security standards are enabled in the configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityHubPolicy withEnabledStandardIdentifiers(java.util.Collection<String> enabledStandardIdentifiers) {
        setEnabledStandardIdentifiers(enabledStandardIdentifiers);
        return this;
    }

    /**
     * <p>
     * An object that defines which security controls are enabled in the configuration policy. The enablement status of
     * a control is aligned across all of the enabled standards in an account.
     * </p>
     * 
     * @param securityControlsConfiguration
     *        An object that defines which security controls are enabled in the configuration policy. The enablement
     *        status of a control is aligned across all of the enabled standards in an account.
     */

    public void setSecurityControlsConfiguration(SecurityControlsConfiguration securityControlsConfiguration) {
        this.securityControlsConfiguration = securityControlsConfiguration;
    }

    /**
     * <p>
     * An object that defines which security controls are enabled in the configuration policy. The enablement status of
     * a control is aligned across all of the enabled standards in an account.
     * </p>
     * 
     * @return An object that defines which security controls are enabled in the configuration policy. The enablement
     *         status of a control is aligned across all of the enabled standards in an account.
     */

    public SecurityControlsConfiguration getSecurityControlsConfiguration() {
        return this.securityControlsConfiguration;
    }

    /**
     * <p>
     * An object that defines which security controls are enabled in the configuration policy. The enablement status of
     * a control is aligned across all of the enabled standards in an account.
     * </p>
     * 
     * @param securityControlsConfiguration
     *        An object that defines which security controls are enabled in the configuration policy. The enablement
     *        status of a control is aligned across all of the enabled standards in an account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityHubPolicy withSecurityControlsConfiguration(SecurityControlsConfiguration securityControlsConfiguration) {
        setSecurityControlsConfiguration(securityControlsConfiguration);
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
        if (getServiceEnabled() != null)
            sb.append("ServiceEnabled: ").append(getServiceEnabled()).append(",");
        if (getEnabledStandardIdentifiers() != null)
            sb.append("EnabledStandardIdentifiers: ").append(getEnabledStandardIdentifiers()).append(",");
        if (getSecurityControlsConfiguration() != null)
            sb.append("SecurityControlsConfiguration: ").append(getSecurityControlsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityHubPolicy == false)
            return false;
        SecurityHubPolicy other = (SecurityHubPolicy) obj;
        if (other.getServiceEnabled() == null ^ this.getServiceEnabled() == null)
            return false;
        if (other.getServiceEnabled() != null && other.getServiceEnabled().equals(this.getServiceEnabled()) == false)
            return false;
        if (other.getEnabledStandardIdentifiers() == null ^ this.getEnabledStandardIdentifiers() == null)
            return false;
        if (other.getEnabledStandardIdentifiers() != null && other.getEnabledStandardIdentifiers().equals(this.getEnabledStandardIdentifiers()) == false)
            return false;
        if (other.getSecurityControlsConfiguration() == null ^ this.getSecurityControlsConfiguration() == null)
            return false;
        if (other.getSecurityControlsConfiguration() != null
                && other.getSecurityControlsConfiguration().equals(this.getSecurityControlsConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceEnabled() == null) ? 0 : getServiceEnabled().hashCode());
        hashCode = prime * hashCode + ((getEnabledStandardIdentifiers() == null) ? 0 : getEnabledStandardIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getSecurityControlsConfiguration() == null) ? 0 : getSecurityControlsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public SecurityHubPolicy clone() {
        try {
            return (SecurityHubPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.SecurityHubPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
