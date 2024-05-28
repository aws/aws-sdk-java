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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateOrganizationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOrganizationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Whether to automatically enable Security Hub in new member accounts when they join the organization.
     * </p>
     * <p>
     * If set to <code>true</code>, then Security Hub is automatically enabled in new accounts. If set to
     * <code>false</code>, then Security Hub isn't enabled in new accounts automatically. The default value is
     * <code>false</code>.
     * </p>
     * <p>
     * If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this field is set
     * to <code>false</code> and can't be changed in the home Region and linked Regions. However, in that case, the
     * delegated administrator can create a configuration policy in which Security Hub is enabled and associate the
     * policy with new organization accounts.
     * </p>
     */
    private Boolean autoEnable;
    /**
     * <p>
     * Whether to automatically enable Security Hub <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html">default
     * standards</a> in new member accounts when they join the organization.
     * </p>
     * <p>
     * The default value of this parameter is equal to <code>DEFAULT</code>.
     * </p>
     * <p>
     * If equal to <code>DEFAULT</code>, then Security Hub default standards are automatically enabled for new member
     * accounts. If equal to <code>NONE</code>, then default standards are not automatically enabled for new member
     * accounts.
     * </p>
     * <p>
     * If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this field is set
     * to <code>NONE</code> and can't be changed in the home Region and linked Regions. However, in that case, the
     * delegated administrator can create a configuration policy in which specific security standards are enabled and
     * associate the policy with new organization accounts.
     * </p>
     */
    private String autoEnableStandards;

    private OrganizationConfiguration organizationConfiguration;

    /**
     * <p>
     * Whether to automatically enable Security Hub in new member accounts when they join the organization.
     * </p>
     * <p>
     * If set to <code>true</code>, then Security Hub is automatically enabled in new accounts. If set to
     * <code>false</code>, then Security Hub isn't enabled in new accounts automatically. The default value is
     * <code>false</code>.
     * </p>
     * <p>
     * If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this field is set
     * to <code>false</code> and can't be changed in the home Region and linked Regions. However, in that case, the
     * delegated administrator can create a configuration policy in which Security Hub is enabled and associate the
     * policy with new organization accounts.
     * </p>
     * 
     * @param autoEnable
     *        Whether to automatically enable Security Hub in new member accounts when they join the organization.</p>
     *        <p>
     *        If set to <code>true</code>, then Security Hub is automatically enabled in new accounts. If set to
     *        <code>false</code>, then Security Hub isn't enabled in new accounts automatically. The default value is
     *        <code>false</code>.
     *        </p>
     *        <p>
     *        If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this field
     *        is set to <code>false</code> and can't be changed in the home Region and linked Regions. However, in that
     *        case, the delegated administrator can create a configuration policy in which Security Hub is enabled and
     *        associate the policy with new organization accounts.
     */

    public void setAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * <p>
     * Whether to automatically enable Security Hub in new member accounts when they join the organization.
     * </p>
     * <p>
     * If set to <code>true</code>, then Security Hub is automatically enabled in new accounts. If set to
     * <code>false</code>, then Security Hub isn't enabled in new accounts automatically. The default value is
     * <code>false</code>.
     * </p>
     * <p>
     * If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this field is set
     * to <code>false</code> and can't be changed in the home Region and linked Regions. However, in that case, the
     * delegated administrator can create a configuration policy in which Security Hub is enabled and associate the
     * policy with new organization accounts.
     * </p>
     * 
     * @return Whether to automatically enable Security Hub in new member accounts when they join the organization.</p>
     *         <p>
     *         If set to <code>true</code>, then Security Hub is automatically enabled in new accounts. If set to
     *         <code>false</code>, then Security Hub isn't enabled in new accounts automatically. The default value is
     *         <code>false</code>.
     *         </p>
     *         <p>
     *         If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this
     *         field is set to <code>false</code> and can't be changed in the home Region and linked Regions. However,
     *         in that case, the delegated administrator can create a configuration policy in which Security Hub is
     *         enabled and associate the policy with new organization accounts.
     */

    public Boolean getAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Whether to automatically enable Security Hub in new member accounts when they join the organization.
     * </p>
     * <p>
     * If set to <code>true</code>, then Security Hub is automatically enabled in new accounts. If set to
     * <code>false</code>, then Security Hub isn't enabled in new accounts automatically. The default value is
     * <code>false</code>.
     * </p>
     * <p>
     * If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this field is set
     * to <code>false</code> and can't be changed in the home Region and linked Regions. However, in that case, the
     * delegated administrator can create a configuration policy in which Security Hub is enabled and associate the
     * policy with new organization accounts.
     * </p>
     * 
     * @param autoEnable
     *        Whether to automatically enable Security Hub in new member accounts when they join the organization.</p>
     *        <p>
     *        If set to <code>true</code>, then Security Hub is automatically enabled in new accounts. If set to
     *        <code>false</code>, then Security Hub isn't enabled in new accounts automatically. The default value is
     *        <code>false</code>.
     *        </p>
     *        <p>
     *        If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this field
     *        is set to <code>false</code> and can't be changed in the home Region and linked Regions. However, in that
     *        case, the delegated administrator can create a configuration policy in which Security Hub is enabled and
     *        associate the policy with new organization accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOrganizationConfigurationRequest withAutoEnable(Boolean autoEnable) {
        setAutoEnable(autoEnable);
        return this;
    }

    /**
     * <p>
     * Whether to automatically enable Security Hub in new member accounts when they join the organization.
     * </p>
     * <p>
     * If set to <code>true</code>, then Security Hub is automatically enabled in new accounts. If set to
     * <code>false</code>, then Security Hub isn't enabled in new accounts automatically. The default value is
     * <code>false</code>.
     * </p>
     * <p>
     * If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this field is set
     * to <code>false</code> and can't be changed in the home Region and linked Regions. However, in that case, the
     * delegated administrator can create a configuration policy in which Security Hub is enabled and associate the
     * policy with new organization accounts.
     * </p>
     * 
     * @return Whether to automatically enable Security Hub in new member accounts when they join the organization.</p>
     *         <p>
     *         If set to <code>true</code>, then Security Hub is automatically enabled in new accounts. If set to
     *         <code>false</code>, then Security Hub isn't enabled in new accounts automatically. The default value is
     *         <code>false</code>.
     *         </p>
     *         <p>
     *         If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this
     *         field is set to <code>false</code> and can't be changed in the home Region and linked Regions. However,
     *         in that case, the delegated administrator can create a configuration policy in which Security Hub is
     *         enabled and associate the policy with new organization accounts.
     */

    public Boolean isAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Whether to automatically enable Security Hub <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html">default
     * standards</a> in new member accounts when they join the organization.
     * </p>
     * <p>
     * The default value of this parameter is equal to <code>DEFAULT</code>.
     * </p>
     * <p>
     * If equal to <code>DEFAULT</code>, then Security Hub default standards are automatically enabled for new member
     * accounts. If equal to <code>NONE</code>, then default standards are not automatically enabled for new member
     * accounts.
     * </p>
     * <p>
     * If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this field is set
     * to <code>NONE</code> and can't be changed in the home Region and linked Regions. However, in that case, the
     * delegated administrator can create a configuration policy in which specific security standards are enabled and
     * associate the policy with new organization accounts.
     * </p>
     * 
     * @param autoEnableStandards
     *        Whether to automatically enable Security Hub <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html"
     *        >default standards</a> in new member accounts when they join the organization.</p>
     *        <p>
     *        The default value of this parameter is equal to <code>DEFAULT</code>.
     *        </p>
     *        <p>
     *        If equal to <code>DEFAULT</code>, then Security Hub default standards are automatically enabled for new
     *        member accounts. If equal to <code>NONE</code>, then default standards are not automatically enabled for
     *        new member accounts.
     *        </p>
     *        <p>
     *        If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this field
     *        is set to <code>NONE</code> and can't be changed in the home Region and linked Regions. However, in that
     *        case, the delegated administrator can create a configuration policy in which specific security standards
     *        are enabled and associate the policy with new organization accounts.
     * @see AutoEnableStandards
     */

    public void setAutoEnableStandards(String autoEnableStandards) {
        this.autoEnableStandards = autoEnableStandards;
    }

    /**
     * <p>
     * Whether to automatically enable Security Hub <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html">default
     * standards</a> in new member accounts when they join the organization.
     * </p>
     * <p>
     * The default value of this parameter is equal to <code>DEFAULT</code>.
     * </p>
     * <p>
     * If equal to <code>DEFAULT</code>, then Security Hub default standards are automatically enabled for new member
     * accounts. If equal to <code>NONE</code>, then default standards are not automatically enabled for new member
     * accounts.
     * </p>
     * <p>
     * If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this field is set
     * to <code>NONE</code> and can't be changed in the home Region and linked Regions. However, in that case, the
     * delegated administrator can create a configuration policy in which specific security standards are enabled and
     * associate the policy with new organization accounts.
     * </p>
     * 
     * @return Whether to automatically enable Security Hub <a
     *         href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html"
     *         >default standards</a> in new member accounts when they join the organization.</p>
     *         <p>
     *         The default value of this parameter is equal to <code>DEFAULT</code>.
     *         </p>
     *         <p>
     *         If equal to <code>DEFAULT</code>, then Security Hub default standards are automatically enabled for new
     *         member accounts. If equal to <code>NONE</code>, then default standards are not automatically enabled for
     *         new member accounts.
     *         </p>
     *         <p>
     *         If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this
     *         field is set to <code>NONE</code> and can't be changed in the home Region and linked Regions. However, in
     *         that case, the delegated administrator can create a configuration policy in which specific security
     *         standards are enabled and associate the policy with new organization accounts.
     * @see AutoEnableStandards
     */

    public String getAutoEnableStandards() {
        return this.autoEnableStandards;
    }

    /**
     * <p>
     * Whether to automatically enable Security Hub <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html">default
     * standards</a> in new member accounts when they join the organization.
     * </p>
     * <p>
     * The default value of this parameter is equal to <code>DEFAULT</code>.
     * </p>
     * <p>
     * If equal to <code>DEFAULT</code>, then Security Hub default standards are automatically enabled for new member
     * accounts. If equal to <code>NONE</code>, then default standards are not automatically enabled for new member
     * accounts.
     * </p>
     * <p>
     * If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this field is set
     * to <code>NONE</code> and can't be changed in the home Region and linked Regions. However, in that case, the
     * delegated administrator can create a configuration policy in which specific security standards are enabled and
     * associate the policy with new organization accounts.
     * </p>
     * 
     * @param autoEnableStandards
     *        Whether to automatically enable Security Hub <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html"
     *        >default standards</a> in new member accounts when they join the organization.</p>
     *        <p>
     *        The default value of this parameter is equal to <code>DEFAULT</code>.
     *        </p>
     *        <p>
     *        If equal to <code>DEFAULT</code>, then Security Hub default standards are automatically enabled for new
     *        member accounts. If equal to <code>NONE</code>, then default standards are not automatically enabled for
     *        new member accounts.
     *        </p>
     *        <p>
     *        If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this field
     *        is set to <code>NONE</code> and can't be changed in the home Region and linked Regions. However, in that
     *        case, the delegated administrator can create a configuration policy in which specific security standards
     *        are enabled and associate the policy with new organization accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoEnableStandards
     */

    public UpdateOrganizationConfigurationRequest withAutoEnableStandards(String autoEnableStandards) {
        setAutoEnableStandards(autoEnableStandards);
        return this;
    }

    /**
     * <p>
     * Whether to automatically enable Security Hub <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html">default
     * standards</a> in new member accounts when they join the organization.
     * </p>
     * <p>
     * The default value of this parameter is equal to <code>DEFAULT</code>.
     * </p>
     * <p>
     * If equal to <code>DEFAULT</code>, then Security Hub default standards are automatically enabled for new member
     * accounts. If equal to <code>NONE</code>, then default standards are not automatically enabled for new member
     * accounts.
     * </p>
     * <p>
     * If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this field is set
     * to <code>NONE</code> and can't be changed in the home Region and linked Regions. However, in that case, the
     * delegated administrator can create a configuration policy in which specific security standards are enabled and
     * associate the policy with new organization accounts.
     * </p>
     * 
     * @param autoEnableStandards
     *        Whether to automatically enable Security Hub <a href=
     *        "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards-enable-disable.html"
     *        >default standards</a> in new member accounts when they join the organization.</p>
     *        <p>
     *        The default value of this parameter is equal to <code>DEFAULT</code>.
     *        </p>
     *        <p>
     *        If equal to <code>DEFAULT</code>, then Security Hub default standards are automatically enabled for new
     *        member accounts. If equal to <code>NONE</code>, then default standards are not automatically enabled for
     *        new member accounts.
     *        </p>
     *        <p>
     *        If the <code>ConfigurationType</code> of your organization is set to <code>CENTRAL</code>, then this field
     *        is set to <code>NONE</code> and can't be changed in the home Region and linked Regions. However, in that
     *        case, the delegated administrator can create a configuration policy in which specific security standards
     *        are enabled and associate the policy with new organization accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoEnableStandards
     */

    public UpdateOrganizationConfigurationRequest withAutoEnableStandards(AutoEnableStandards autoEnableStandards) {
        this.autoEnableStandards = autoEnableStandards.toString();
        return this;
    }

    /**
     * @param organizationConfiguration
     */

    public void setOrganizationConfiguration(OrganizationConfiguration organizationConfiguration) {
        this.organizationConfiguration = organizationConfiguration;
    }

    /**
     * @return
     */

    public OrganizationConfiguration getOrganizationConfiguration() {
        return this.organizationConfiguration;
    }

    /**
     * @param organizationConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOrganizationConfigurationRequest withOrganizationConfiguration(OrganizationConfiguration organizationConfiguration) {
        setOrganizationConfiguration(organizationConfiguration);
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
        if (getAutoEnable() != null)
            sb.append("AutoEnable: ").append(getAutoEnable()).append(",");
        if (getAutoEnableStandards() != null)
            sb.append("AutoEnableStandards: ").append(getAutoEnableStandards()).append(",");
        if (getOrganizationConfiguration() != null)
            sb.append("OrganizationConfiguration: ").append(getOrganizationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOrganizationConfigurationRequest == false)
            return false;
        UpdateOrganizationConfigurationRequest other = (UpdateOrganizationConfigurationRequest) obj;
        if (other.getAutoEnable() == null ^ this.getAutoEnable() == null)
            return false;
        if (other.getAutoEnable() != null && other.getAutoEnable().equals(this.getAutoEnable()) == false)
            return false;
        if (other.getAutoEnableStandards() == null ^ this.getAutoEnableStandards() == null)
            return false;
        if (other.getAutoEnableStandards() != null && other.getAutoEnableStandards().equals(this.getAutoEnableStandards()) == false)
            return false;
        if (other.getOrganizationConfiguration() == null ^ this.getOrganizationConfiguration() == null)
            return false;
        if (other.getOrganizationConfiguration() != null && other.getOrganizationConfiguration().equals(this.getOrganizationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoEnable() == null) ? 0 : getAutoEnable().hashCode());
        hashCode = prime * hashCode + ((getAutoEnableStandards() == null) ? 0 : getAutoEnableStandards().hashCode());
        hashCode = prime * hashCode + ((getOrganizationConfiguration() == null) ? 0 : getOrganizationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateOrganizationConfigurationRequest clone() {
        return (UpdateOrganizationConfigurationRequest) super.clone();
    }

}
