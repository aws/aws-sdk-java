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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of additional configuration which will be configured for the organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/OrganizationAdditionalConfigurationResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationAdditionalConfigurationResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the additional configuration that is configured for the member accounts within the organization.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Describes the status of the additional configuration that is configured for the member accounts within the
     * organization. One of the following values is the status for the entire organization:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code>: Indicates that when a new account joins the organization, they will have the additional
     * configuration enabled automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: Indicates that all accounts in the organization have the additional configuration enabled
     * automatically. This includes <code>NEW</code> accounts that join the organization and accounts that may have been
     * suspended or removed from the organization in GuardDuty.
     * </p>
     * <p>
     * It may take up to 24 hours to update the configuration for all the member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Indicates that the additional configuration will not be automatically enabled for any account
     * in the organization. The administrator must manage the additional configuration for each account individually.
     * </p>
     * </li>
     * </ul>
     */
    private String autoEnable;

    /**
     * <p>
     * The name of the additional configuration that is configured for the member accounts within the organization.
     * </p>
     * 
     * @param name
     *        The name of the additional configuration that is configured for the member accounts within the
     *        organization.
     * @see OrgFeatureAdditionalConfiguration
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the additional configuration that is configured for the member accounts within the organization.
     * </p>
     * 
     * @return The name of the additional configuration that is configured for the member accounts within the
     *         organization.
     * @see OrgFeatureAdditionalConfiguration
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the additional configuration that is configured for the member accounts within the organization.
     * </p>
     * 
     * @param name
     *        The name of the additional configuration that is configured for the member accounts within the
     *        organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrgFeatureAdditionalConfiguration
     */

    public OrganizationAdditionalConfigurationResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the additional configuration that is configured for the member accounts within the organization.
     * </p>
     * 
     * @param name
     *        The name of the additional configuration that is configured for the member accounts within the
     *        organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrgFeatureAdditionalConfiguration
     */

    public OrganizationAdditionalConfigurationResult withName(OrgFeatureAdditionalConfiguration name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * Describes the status of the additional configuration that is configured for the member accounts within the
     * organization. One of the following values is the status for the entire organization:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code>: Indicates that when a new account joins the organization, they will have the additional
     * configuration enabled automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: Indicates that all accounts in the organization have the additional configuration enabled
     * automatically. This includes <code>NEW</code> accounts that join the organization and accounts that may have been
     * suspended or removed from the organization in GuardDuty.
     * </p>
     * <p>
     * It may take up to 24 hours to update the configuration for all the member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Indicates that the additional configuration will not be automatically enabled for any account
     * in the organization. The administrator must manage the additional configuration for each account individually.
     * </p>
     * </li>
     * </ul>
     * 
     * @param autoEnable
     *        Describes the status of the additional configuration that is configured for the member accounts within the
     *        organization. One of the following values is the status for the entire organization:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code>: Indicates that when a new account joins the organization, they will have the additional
     *        configuration enabled automatically.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code>: Indicates that all accounts in the organization have the additional configuration
     *        enabled automatically. This includes <code>NEW</code> accounts that join the organization and accounts
     *        that may have been suspended or removed from the organization in GuardDuty.
     *        </p>
     *        <p>
     *        It may take up to 24 hours to update the configuration for all the member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Indicates that the additional configuration will not be automatically enabled for any
     *        account in the organization. The administrator must manage the additional configuration for each account
     *        individually.
     *        </p>
     *        </li>
     * @see OrgFeatureStatus
     */

    public void setAutoEnable(String autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * <p>
     * Describes the status of the additional configuration that is configured for the member accounts within the
     * organization. One of the following values is the status for the entire organization:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code>: Indicates that when a new account joins the organization, they will have the additional
     * configuration enabled automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: Indicates that all accounts in the organization have the additional configuration enabled
     * automatically. This includes <code>NEW</code> accounts that join the organization and accounts that may have been
     * suspended or removed from the organization in GuardDuty.
     * </p>
     * <p>
     * It may take up to 24 hours to update the configuration for all the member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Indicates that the additional configuration will not be automatically enabled for any account
     * in the organization. The administrator must manage the additional configuration for each account individually.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the status of the additional configuration that is configured for the member accounts within
     *         the organization. One of the following values is the status for the entire organization:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NEW</code>: Indicates that when a new account joins the organization, they will have the additional
     *         configuration enabled automatically.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL</code>: Indicates that all accounts in the organization have the additional configuration
     *         enabled automatically. This includes <code>NEW</code> accounts that join the organization and accounts
     *         that may have been suspended or removed from the organization in GuardDuty.
     *         </p>
     *         <p>
     *         It may take up to 24 hours to update the configuration for all the member accounts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NONE</code>: Indicates that the additional configuration will not be automatically enabled for any
     *         account in the organization. The administrator must manage the additional configuration for each account
     *         individually.
     *         </p>
     *         </li>
     * @see OrgFeatureStatus
     */

    public String getAutoEnable() {
        return this.autoEnable;
    }

    /**
     * <p>
     * Describes the status of the additional configuration that is configured for the member accounts within the
     * organization. One of the following values is the status for the entire organization:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code>: Indicates that when a new account joins the organization, they will have the additional
     * configuration enabled automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: Indicates that all accounts in the organization have the additional configuration enabled
     * automatically. This includes <code>NEW</code> accounts that join the organization and accounts that may have been
     * suspended or removed from the organization in GuardDuty.
     * </p>
     * <p>
     * It may take up to 24 hours to update the configuration for all the member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Indicates that the additional configuration will not be automatically enabled for any account
     * in the organization. The administrator must manage the additional configuration for each account individually.
     * </p>
     * </li>
     * </ul>
     * 
     * @param autoEnable
     *        Describes the status of the additional configuration that is configured for the member accounts within the
     *        organization. One of the following values is the status for the entire organization:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code>: Indicates that when a new account joins the organization, they will have the additional
     *        configuration enabled automatically.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code>: Indicates that all accounts in the organization have the additional configuration
     *        enabled automatically. This includes <code>NEW</code> accounts that join the organization and accounts
     *        that may have been suspended or removed from the organization in GuardDuty.
     *        </p>
     *        <p>
     *        It may take up to 24 hours to update the configuration for all the member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Indicates that the additional configuration will not be automatically enabled for any
     *        account in the organization. The administrator must manage the additional configuration for each account
     *        individually.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrgFeatureStatus
     */

    public OrganizationAdditionalConfigurationResult withAutoEnable(String autoEnable) {
        setAutoEnable(autoEnable);
        return this;
    }

    /**
     * <p>
     * Describes the status of the additional configuration that is configured for the member accounts within the
     * organization. One of the following values is the status for the entire organization:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NEW</code>: Indicates that when a new account joins the organization, they will have the additional
     * configuration enabled automatically.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>: Indicates that all accounts in the organization have the additional configuration enabled
     * automatically. This includes <code>NEW</code> accounts that join the organization and accounts that may have been
     * suspended or removed from the organization in GuardDuty.
     * </p>
     * <p>
     * It may take up to 24 hours to update the configuration for all the member accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NONE</code>: Indicates that the additional configuration will not be automatically enabled for any account
     * in the organization. The administrator must manage the additional configuration for each account individually.
     * </p>
     * </li>
     * </ul>
     * 
     * @param autoEnable
     *        Describes the status of the additional configuration that is configured for the member accounts within the
     *        organization. One of the following values is the status for the entire organization:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NEW</code>: Indicates that when a new account joins the organization, they will have the additional
     *        configuration enabled automatically.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code>: Indicates that all accounts in the organization have the additional configuration
     *        enabled automatically. This includes <code>NEW</code> accounts that join the organization and accounts
     *        that may have been suspended or removed from the organization in GuardDuty.
     *        </p>
     *        <p>
     *        It may take up to 24 hours to update the configuration for all the member accounts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Indicates that the additional configuration will not be automatically enabled for any
     *        account in the organization. The administrator must manage the additional configuration for each account
     *        individually.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrgFeatureStatus
     */

    public OrganizationAdditionalConfigurationResult withAutoEnable(OrgFeatureStatus autoEnable) {
        this.autoEnable = autoEnable.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAutoEnable() != null)
            sb.append("AutoEnable: ").append(getAutoEnable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationAdditionalConfigurationResult == false)
            return false;
        OrganizationAdditionalConfigurationResult other = (OrganizationAdditionalConfigurationResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAutoEnable() == null ^ this.getAutoEnable() == null)
            return false;
        if (other.getAutoEnable() != null && other.getAutoEnable().equals(this.getAutoEnable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAutoEnable() == null) ? 0 : getAutoEnable().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationAdditionalConfigurationResult clone() {
        try {
            return (OrganizationAdditionalConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.OrganizationAdditionalConfigurationResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
