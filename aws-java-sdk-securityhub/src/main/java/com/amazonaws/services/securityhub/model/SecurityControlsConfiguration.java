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
 * An object that defines which security controls are enabled in an Security Hub configuration policy. The enablement
 * status of a control is aligned across all of the enabled standards in an account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/SecurityControlsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecurityControlsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of security controls that are enabled in the configuration policy. Security Hub disables all other
     * controls (including newly released controls) other than the listed controls.
     * </p>
     */
    private java.util.List<String> enabledSecurityControlIdentifiers;
    /**
     * <p>
     * A list of security controls that are disabled in the configuration policy. Security Hub enables all other
     * controls (including newly released controls) other than the listed controls.
     * </p>
     */
    private java.util.List<String> disabledSecurityControlIdentifiers;
    /**
     * <p>
     * A list of security controls and control parameter values that are included in a configuration policy.
     * </p>
     */
    private java.util.List<SecurityControlCustomParameter> securityControlCustomParameters;

    /**
     * <p>
     * A list of security controls that are enabled in the configuration policy. Security Hub disables all other
     * controls (including newly released controls) other than the listed controls.
     * </p>
     * 
     * @return A list of security controls that are enabled in the configuration policy. Security Hub disables all other
     *         controls (including newly released controls) other than the listed controls.
     */

    public java.util.List<String> getEnabledSecurityControlIdentifiers() {
        return enabledSecurityControlIdentifiers;
    }

    /**
     * <p>
     * A list of security controls that are enabled in the configuration policy. Security Hub disables all other
     * controls (including newly released controls) other than the listed controls.
     * </p>
     * 
     * @param enabledSecurityControlIdentifiers
     *        A list of security controls that are enabled in the configuration policy. Security Hub disables all other
     *        controls (including newly released controls) other than the listed controls.
     */

    public void setEnabledSecurityControlIdentifiers(java.util.Collection<String> enabledSecurityControlIdentifiers) {
        if (enabledSecurityControlIdentifiers == null) {
            this.enabledSecurityControlIdentifiers = null;
            return;
        }

        this.enabledSecurityControlIdentifiers = new java.util.ArrayList<String>(enabledSecurityControlIdentifiers);
    }

    /**
     * <p>
     * A list of security controls that are enabled in the configuration policy. Security Hub disables all other
     * controls (including newly released controls) other than the listed controls.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledSecurityControlIdentifiers(java.util.Collection)} or
     * {@link #withEnabledSecurityControlIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enabledSecurityControlIdentifiers
     *        A list of security controls that are enabled in the configuration policy. Security Hub disables all other
     *        controls (including newly released controls) other than the listed controls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlsConfiguration withEnabledSecurityControlIdentifiers(String... enabledSecurityControlIdentifiers) {
        if (this.enabledSecurityControlIdentifiers == null) {
            setEnabledSecurityControlIdentifiers(new java.util.ArrayList<String>(enabledSecurityControlIdentifiers.length));
        }
        for (String ele : enabledSecurityControlIdentifiers) {
            this.enabledSecurityControlIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security controls that are enabled in the configuration policy. Security Hub disables all other
     * controls (including newly released controls) other than the listed controls.
     * </p>
     * 
     * @param enabledSecurityControlIdentifiers
     *        A list of security controls that are enabled in the configuration policy. Security Hub disables all other
     *        controls (including newly released controls) other than the listed controls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlsConfiguration withEnabledSecurityControlIdentifiers(java.util.Collection<String> enabledSecurityControlIdentifiers) {
        setEnabledSecurityControlIdentifiers(enabledSecurityControlIdentifiers);
        return this;
    }

    /**
     * <p>
     * A list of security controls that are disabled in the configuration policy. Security Hub enables all other
     * controls (including newly released controls) other than the listed controls.
     * </p>
     * 
     * @return A list of security controls that are disabled in the configuration policy. Security Hub enables all other
     *         controls (including newly released controls) other than the listed controls.
     */

    public java.util.List<String> getDisabledSecurityControlIdentifiers() {
        return disabledSecurityControlIdentifiers;
    }

    /**
     * <p>
     * A list of security controls that are disabled in the configuration policy. Security Hub enables all other
     * controls (including newly released controls) other than the listed controls.
     * </p>
     * 
     * @param disabledSecurityControlIdentifiers
     *        A list of security controls that are disabled in the configuration policy. Security Hub enables all other
     *        controls (including newly released controls) other than the listed controls.
     */

    public void setDisabledSecurityControlIdentifiers(java.util.Collection<String> disabledSecurityControlIdentifiers) {
        if (disabledSecurityControlIdentifiers == null) {
            this.disabledSecurityControlIdentifiers = null;
            return;
        }

        this.disabledSecurityControlIdentifiers = new java.util.ArrayList<String>(disabledSecurityControlIdentifiers);
    }

    /**
     * <p>
     * A list of security controls that are disabled in the configuration policy. Security Hub enables all other
     * controls (including newly released controls) other than the listed controls.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDisabledSecurityControlIdentifiers(java.util.Collection)} or
     * {@link #withDisabledSecurityControlIdentifiers(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param disabledSecurityControlIdentifiers
     *        A list of security controls that are disabled in the configuration policy. Security Hub enables all other
     *        controls (including newly released controls) other than the listed controls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlsConfiguration withDisabledSecurityControlIdentifiers(String... disabledSecurityControlIdentifiers) {
        if (this.disabledSecurityControlIdentifiers == null) {
            setDisabledSecurityControlIdentifiers(new java.util.ArrayList<String>(disabledSecurityControlIdentifiers.length));
        }
        for (String ele : disabledSecurityControlIdentifiers) {
            this.disabledSecurityControlIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security controls that are disabled in the configuration policy. Security Hub enables all other
     * controls (including newly released controls) other than the listed controls.
     * </p>
     * 
     * @param disabledSecurityControlIdentifiers
     *        A list of security controls that are disabled in the configuration policy. Security Hub enables all other
     *        controls (including newly released controls) other than the listed controls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlsConfiguration withDisabledSecurityControlIdentifiers(java.util.Collection<String> disabledSecurityControlIdentifiers) {
        setDisabledSecurityControlIdentifiers(disabledSecurityControlIdentifiers);
        return this;
    }

    /**
     * <p>
     * A list of security controls and control parameter values that are included in a configuration policy.
     * </p>
     * 
     * @return A list of security controls and control parameter values that are included in a configuration policy.
     */

    public java.util.List<SecurityControlCustomParameter> getSecurityControlCustomParameters() {
        return securityControlCustomParameters;
    }

    /**
     * <p>
     * A list of security controls and control parameter values that are included in a configuration policy.
     * </p>
     * 
     * @param securityControlCustomParameters
     *        A list of security controls and control parameter values that are included in a configuration policy.
     */

    public void setSecurityControlCustomParameters(java.util.Collection<SecurityControlCustomParameter> securityControlCustomParameters) {
        if (securityControlCustomParameters == null) {
            this.securityControlCustomParameters = null;
            return;
        }

        this.securityControlCustomParameters = new java.util.ArrayList<SecurityControlCustomParameter>(securityControlCustomParameters);
    }

    /**
     * <p>
     * A list of security controls and control parameter values that are included in a configuration policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityControlCustomParameters(java.util.Collection)} or
     * {@link #withSecurityControlCustomParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param securityControlCustomParameters
     *        A list of security controls and control parameter values that are included in a configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlsConfiguration withSecurityControlCustomParameters(SecurityControlCustomParameter... securityControlCustomParameters) {
        if (this.securityControlCustomParameters == null) {
            setSecurityControlCustomParameters(new java.util.ArrayList<SecurityControlCustomParameter>(securityControlCustomParameters.length));
        }
        for (SecurityControlCustomParameter ele : securityControlCustomParameters) {
            this.securityControlCustomParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of security controls and control parameter values that are included in a configuration policy.
     * </p>
     * 
     * @param securityControlCustomParameters
     *        A list of security controls and control parameter values that are included in a configuration policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecurityControlsConfiguration withSecurityControlCustomParameters(
            java.util.Collection<SecurityControlCustomParameter> securityControlCustomParameters) {
        setSecurityControlCustomParameters(securityControlCustomParameters);
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
        if (getEnabledSecurityControlIdentifiers() != null)
            sb.append("EnabledSecurityControlIdentifiers: ").append(getEnabledSecurityControlIdentifiers()).append(",");
        if (getDisabledSecurityControlIdentifiers() != null)
            sb.append("DisabledSecurityControlIdentifiers: ").append(getDisabledSecurityControlIdentifiers()).append(",");
        if (getSecurityControlCustomParameters() != null)
            sb.append("SecurityControlCustomParameters: ").append(getSecurityControlCustomParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecurityControlsConfiguration == false)
            return false;
        SecurityControlsConfiguration other = (SecurityControlsConfiguration) obj;
        if (other.getEnabledSecurityControlIdentifiers() == null ^ this.getEnabledSecurityControlIdentifiers() == null)
            return false;
        if (other.getEnabledSecurityControlIdentifiers() != null
                && other.getEnabledSecurityControlIdentifiers().equals(this.getEnabledSecurityControlIdentifiers()) == false)
            return false;
        if (other.getDisabledSecurityControlIdentifiers() == null ^ this.getDisabledSecurityControlIdentifiers() == null)
            return false;
        if (other.getDisabledSecurityControlIdentifiers() != null
                && other.getDisabledSecurityControlIdentifiers().equals(this.getDisabledSecurityControlIdentifiers()) == false)
            return false;
        if (other.getSecurityControlCustomParameters() == null ^ this.getSecurityControlCustomParameters() == null)
            return false;
        if (other.getSecurityControlCustomParameters() != null
                && other.getSecurityControlCustomParameters().equals(this.getSecurityControlCustomParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabledSecurityControlIdentifiers() == null) ? 0 : getEnabledSecurityControlIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getDisabledSecurityControlIdentifiers() == null) ? 0 : getDisabledSecurityControlIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getSecurityControlCustomParameters() == null) ? 0 : getSecurityControlCustomParameters().hashCode());
        return hashCode;
    }

    @Override
    public SecurityControlsConfiguration clone() {
        try {
            return (SecurityControlsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.SecurityControlsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
