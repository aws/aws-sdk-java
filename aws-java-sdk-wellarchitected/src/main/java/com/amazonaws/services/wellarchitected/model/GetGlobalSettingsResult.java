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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetGlobalSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGlobalSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Web Services Organizations sharing status.
     * </p>
     */
    private String organizationSharingStatus;
    /**
     * <p>
     * Discovery integration status.
     * </p>
     */
    private String discoveryIntegrationStatus;
    /**
     * <p>
     * Jira configuration status.
     * </p>
     */
    private AccountJiraConfigurationOutput jiraConfiguration;

    /**
     * <p>
     * Amazon Web Services Organizations sharing status.
     * </p>
     * 
     * @param organizationSharingStatus
     *        Amazon Web Services Organizations sharing status.
     * @see OrganizationSharingStatus
     */

    public void setOrganizationSharingStatus(String organizationSharingStatus) {
        this.organizationSharingStatus = organizationSharingStatus;
    }

    /**
     * <p>
     * Amazon Web Services Organizations sharing status.
     * </p>
     * 
     * @return Amazon Web Services Organizations sharing status.
     * @see OrganizationSharingStatus
     */

    public String getOrganizationSharingStatus() {
        return this.organizationSharingStatus;
    }

    /**
     * <p>
     * Amazon Web Services Organizations sharing status.
     * </p>
     * 
     * @param organizationSharingStatus
     *        Amazon Web Services Organizations sharing status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationSharingStatus
     */

    public GetGlobalSettingsResult withOrganizationSharingStatus(String organizationSharingStatus) {
        setOrganizationSharingStatus(organizationSharingStatus);
        return this;
    }

    /**
     * <p>
     * Amazon Web Services Organizations sharing status.
     * </p>
     * 
     * @param organizationSharingStatus
     *        Amazon Web Services Organizations sharing status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrganizationSharingStatus
     */

    public GetGlobalSettingsResult withOrganizationSharingStatus(OrganizationSharingStatus organizationSharingStatus) {
        this.organizationSharingStatus = organizationSharingStatus.toString();
        return this;
    }

    /**
     * <p>
     * Discovery integration status.
     * </p>
     * 
     * @param discoveryIntegrationStatus
     *        Discovery integration status.
     * @see DiscoveryIntegrationStatus
     */

    public void setDiscoveryIntegrationStatus(String discoveryIntegrationStatus) {
        this.discoveryIntegrationStatus = discoveryIntegrationStatus;
    }

    /**
     * <p>
     * Discovery integration status.
     * </p>
     * 
     * @return Discovery integration status.
     * @see DiscoveryIntegrationStatus
     */

    public String getDiscoveryIntegrationStatus() {
        return this.discoveryIntegrationStatus;
    }

    /**
     * <p>
     * Discovery integration status.
     * </p>
     * 
     * @param discoveryIntegrationStatus
     *        Discovery integration status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryIntegrationStatus
     */

    public GetGlobalSettingsResult withDiscoveryIntegrationStatus(String discoveryIntegrationStatus) {
        setDiscoveryIntegrationStatus(discoveryIntegrationStatus);
        return this;
    }

    /**
     * <p>
     * Discovery integration status.
     * </p>
     * 
     * @param discoveryIntegrationStatus
     *        Discovery integration status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryIntegrationStatus
     */

    public GetGlobalSettingsResult withDiscoveryIntegrationStatus(DiscoveryIntegrationStatus discoveryIntegrationStatus) {
        this.discoveryIntegrationStatus = discoveryIntegrationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Jira configuration status.
     * </p>
     * 
     * @param jiraConfiguration
     *        Jira configuration status.
     */

    public void setJiraConfiguration(AccountJiraConfigurationOutput jiraConfiguration) {
        this.jiraConfiguration = jiraConfiguration;
    }

    /**
     * <p>
     * Jira configuration status.
     * </p>
     * 
     * @return Jira configuration status.
     */

    public AccountJiraConfigurationOutput getJiraConfiguration() {
        return this.jiraConfiguration;
    }

    /**
     * <p>
     * Jira configuration status.
     * </p>
     * 
     * @param jiraConfiguration
     *        Jira configuration status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGlobalSettingsResult withJiraConfiguration(AccountJiraConfigurationOutput jiraConfiguration) {
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

        if (obj instanceof GetGlobalSettingsResult == false)
            return false;
        GetGlobalSettingsResult other = (GetGlobalSettingsResult) obj;
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
    public GetGlobalSettingsResult clone() {
        try {
            return (GetGlobalSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
