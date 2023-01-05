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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The VDM attributes that apply to your Amazon SES account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/VdmAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VdmAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the status of your VDM configuration. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – Amazon SES enables VDM for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – Amazon SES disables VDM for your account.
     * </p>
     * </li>
     * </ul>
     */
    private String vdmEnabled;
    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     * </p>
     */
    private DashboardAttributes dashboardAttributes;
    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     * </p>
     */
    private GuardianAttributes guardianAttributes;

    /**
     * <p>
     * Specifies the status of your VDM configuration. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – Amazon SES enables VDM for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – Amazon SES disables VDM for your account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param vdmEnabled
     *        Specifies the status of your VDM configuration. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – Amazon SES enables VDM for your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – Amazon SES disables VDM for your account.
     *        </p>
     *        </li>
     * @see FeatureStatus
     */

    public void setVdmEnabled(String vdmEnabled) {
        this.vdmEnabled = vdmEnabled;
    }

    /**
     * <p>
     * Specifies the status of your VDM configuration. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – Amazon SES enables VDM for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – Amazon SES disables VDM for your account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the status of your VDM configuration. Can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> – Amazon SES enables VDM for your account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> – Amazon SES disables VDM for your account.
     *         </p>
     *         </li>
     * @see FeatureStatus
     */

    public String getVdmEnabled() {
        return this.vdmEnabled;
    }

    /**
     * <p>
     * Specifies the status of your VDM configuration. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – Amazon SES enables VDM for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – Amazon SES disables VDM for your account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param vdmEnabled
     *        Specifies the status of your VDM configuration. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – Amazon SES enables VDM for your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – Amazon SES disables VDM for your account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public VdmAttributes withVdmEnabled(String vdmEnabled) {
        setVdmEnabled(vdmEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies the status of your VDM configuration. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> – Amazon SES enables VDM for your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> – Amazon SES disables VDM for your account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param vdmEnabled
     *        Specifies the status of your VDM configuration. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> – Amazon SES enables VDM for your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> – Amazon SES disables VDM for your account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureStatus
     */

    public VdmAttributes withVdmEnabled(FeatureStatus vdmEnabled) {
        this.vdmEnabled = vdmEnabled.toString();
        return this;
    }

    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     * </p>
     * 
     * @param dashboardAttributes
     *        Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     */

    public void setDashboardAttributes(DashboardAttributes dashboardAttributes) {
        this.dashboardAttributes = dashboardAttributes;
    }

    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     * </p>
     * 
     * @return Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     */

    public DashboardAttributes getDashboardAttributes() {
        return this.dashboardAttributes;
    }

    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     * </p>
     * 
     * @param dashboardAttributes
     *        Specifies additional settings for your VDM configuration as applicable to the Dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VdmAttributes withDashboardAttributes(DashboardAttributes dashboardAttributes) {
        setDashboardAttributes(dashboardAttributes);
        return this;
    }

    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     * </p>
     * 
     * @param guardianAttributes
     *        Specifies additional settings for your VDM configuration as applicable to the Guardian.
     */

    public void setGuardianAttributes(GuardianAttributes guardianAttributes) {
        this.guardianAttributes = guardianAttributes;
    }

    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     * </p>
     * 
     * @return Specifies additional settings for your VDM configuration as applicable to the Guardian.
     */

    public GuardianAttributes getGuardianAttributes() {
        return this.guardianAttributes;
    }

    /**
     * <p>
     * Specifies additional settings for your VDM configuration as applicable to the Guardian.
     * </p>
     * 
     * @param guardianAttributes
     *        Specifies additional settings for your VDM configuration as applicable to the Guardian.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VdmAttributes withGuardianAttributes(GuardianAttributes guardianAttributes) {
        setGuardianAttributes(guardianAttributes);
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
        if (getVdmEnabled() != null)
            sb.append("VdmEnabled: ").append(getVdmEnabled()).append(",");
        if (getDashboardAttributes() != null)
            sb.append("DashboardAttributes: ").append(getDashboardAttributes()).append(",");
        if (getGuardianAttributes() != null)
            sb.append("GuardianAttributes: ").append(getGuardianAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VdmAttributes == false)
            return false;
        VdmAttributes other = (VdmAttributes) obj;
        if (other.getVdmEnabled() == null ^ this.getVdmEnabled() == null)
            return false;
        if (other.getVdmEnabled() != null && other.getVdmEnabled().equals(this.getVdmEnabled()) == false)
            return false;
        if (other.getDashboardAttributes() == null ^ this.getDashboardAttributes() == null)
            return false;
        if (other.getDashboardAttributes() != null && other.getDashboardAttributes().equals(this.getDashboardAttributes()) == false)
            return false;
        if (other.getGuardianAttributes() == null ^ this.getGuardianAttributes() == null)
            return false;
        if (other.getGuardianAttributes() != null && other.getGuardianAttributes().equals(this.getGuardianAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVdmEnabled() == null) ? 0 : getVdmEnabled().hashCode());
        hashCode = prime * hashCode + ((getDashboardAttributes() == null) ? 0 : getDashboardAttributes().hashCode());
        hashCode = prime * hashCode + ((getGuardianAttributes() == null) ? 0 : getGuardianAttributes().hashCode());
        return hashCode;
    }

    @Override
    public VdmAttributes clone() {
        try {
            return (VdmAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.VdmAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
