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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateGlobalSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGlobalSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The status of organization sharing settings.
     * </p>
     */
    private String organizationSharingStatus;
    /**
     * <p>
     * The status of discovery support settings.
     * </p>
     */
    private String discoveryIntegrationStatus;
    /**
     * <p>
     * The status of Jira integration settings.
     * </p>
     */
    private AccountJiraConfigurationInput jiraConfiguration;

    /**
     * <p>
     * The status of organization sharing settings.
     * </p>
     * 
     * @param organizationSharingStatus
     *        The status of organization sharing settings.
     * @see OrganizationSharingStatus
     */

    public void setOrganizationSharingStatus(String organizationSharingStatus) {
        this.organizationSharingStatus = organizationSharingStatus;
    }

    /**
     * <p>
     * The status of organization sharing settings.
     * </p>
     * 
     * @return The status of organization sharing settings.
     * @see OrganizationSharingStatus
     */

    public String getOrganizationSharingStatus() {
        return this.organizationSharingStatus;
    }

    /**
     * <p>
     * The status of organization sharing settings.
     * </p>
     * 
     * @param organizationSharingStatus
     *        The status of organization sharing settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationSharingStatus
     */

    public UpdateGlobalSettingsRequest withOrganizationSharingStatus(String organizationSharingStatus) {
        setOrganizationSharingStatus(organizationSharingStatus);
        return this;
    }

    /**
     * <p>
     * The status of organization sharing settings.
     * </p>
     * 
     * @param organizationSharingStatus
     *        The status of organization sharing settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationSharingStatus
     */

    public UpdateGlobalSettingsRequest withOrganizationSharingStatus(OrganizationSharingStatus organizationSharingStatus) {
        this.organizationSharingStatus = organizationSharingStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status of discovery support settings.
     * </p>
     * 
     * @param discoveryIntegrationStatus
     *        The status of discovery support settings.
     * @see DiscoveryIntegrationStatus
     */

    public void setDiscoveryIntegrationStatus(String discoveryIntegrationStatus) {
        this.discoveryIntegrationStatus = discoveryIntegrationStatus;
    }

    /**
     * <p>
     * The status of discovery support settings.
     * </p>
     * 
     * @return The status of discovery support settings.
     * @see DiscoveryIntegrationStatus
     */

    public String getDiscoveryIntegrationStatus() {
        return this.discoveryIntegrationStatus;
    }

    /**
     * <p>
     * The status of discovery support settings.
     * </p>
     * 
     * @param discoveryIntegrationStatus
     *        The status of discovery support settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryIntegrationStatus
     */

    public UpdateGlobalSettingsRequest withDiscoveryIntegrationStatus(String discoveryIntegrationStatus) {
        setDiscoveryIntegrationStatus(discoveryIntegrationStatus);
        return this;
    }

    /**
     * <p>
     * The status of discovery support settings.
     * </p>
     * 
     * @param discoveryIntegrationStatus
     *        The status of discovery support settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryIntegrationStatus
     */

    public UpdateGlobalSettingsRequest withDiscoveryIntegrationStatus(DiscoveryIntegrationStatus discoveryIntegrationStatus) {
        this.discoveryIntegrationStatus = discoveryIntegrationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The status of Jira integration settings.
     * </p>
     * 
     * @param jiraConfiguration
     *        The status of Jira integration settings.
     */

    public void setJiraConfiguration(AccountJiraConfigurationInput jiraConfiguration) {
        this.jiraConfiguration = jiraConfiguration;
    }

    /**
     * <p>
     * The status of Jira integration settings.
     * </p>
     * 
     * @return The status of Jira integration settings.
     */

    public AccountJiraConfigurationInput getJiraConfiguration() {
        return this.jiraConfiguration;
    }

    /**
     * <p>
     * The status of Jira integration settings.
     * </p>
     * 
     * @param jiraConfiguration
     *        The status of Jira integration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalSettingsRequest withJiraConfiguration(AccountJiraConfigurationInput jiraConfiguration) {
        setJiraConfiguration(jiraConfiguration);
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
        if (getOrganizationSharingStatus() != null)
            sb.append("OrganizationSharingStatus: ").append(getOrganizationSharingStatus()).append(",");
        if (getDiscoveryIntegrationStatus() != null)
            sb.append("DiscoveryIntegrationStatus: ").append(getDiscoveryIntegrationStatus()).append(",");
        if (getJiraConfiguration() != null)
            sb.append("JiraConfiguration: ").append(getJiraConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGlobalSettingsRequest == false)
            return false;
        UpdateGlobalSettingsRequest other = (UpdateGlobalSettingsRequest) obj;
        if (other.getOrganizationSharingStatus() == null ^ this.getOrganizationSharingStatus() == null)
            return false;
        if (other.getOrganizationSharingStatus() != null && other.getOrganizationSharingStatus().equals(this.getOrganizationSharingStatus()) == false)
            return false;
        if (other.getDiscoveryIntegrationStatus() == null ^ this.getDiscoveryIntegrationStatus() == null)
            return false;
        if (other.getDiscoveryIntegrationStatus() != null && other.getDiscoveryIntegrationStatus().equals(this.getDiscoveryIntegrationStatus()) == false)
            return false;
        if (other.getJiraConfiguration() == null ^ this.getJiraConfiguration() == null)
            return false;
        if (other.getJiraConfiguration() != null && other.getJiraConfiguration().equals(this.getJiraConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationSharingStatus() == null) ? 0 : getOrganizationSharingStatus().hashCode());
        hashCode = prime * hashCode + ((getDiscoveryIntegrationStatus() == null) ? 0 : getDiscoveryIntegrationStatus().hashCode());
        hashCode = prime * hashCode + ((getJiraConfiguration() == null) ? 0 : getJiraConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGlobalSettingsRequest clone() {
        return (UpdateGlobalSettingsRequest) super.clone();
    }

}
