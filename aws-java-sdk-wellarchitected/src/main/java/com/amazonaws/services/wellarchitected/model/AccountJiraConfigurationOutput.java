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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Account-level: Output configuration of the Jira integration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/AccountJiraConfigurationOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountJiraConfigurationOutput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Account-level: Configuration status of the Jira integration.
     * </p>
     */
    private String integrationStatus;
    /**
     * <p>
     * Account-level: Jira issue management status.
     * </p>
     */
    private String issueManagementStatus;
    /**
     * <p>
     * Account-level: Jira issue management type.
     * </p>
     */
    private String issueManagementType;
    /**
     * <p>
     * Account-level: Jira subdomain URL.
     * </p>
     */
    private String subdomain;
    /**
     * <p>
     * Account-level: Jira project key to sync workloads to.
     * </p>
     */
    private String jiraProjectKey;
    /**
     * <p>
     * Account-level: Status message on configuration of the Jira integration.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * Account-level: Configuration status of the Jira integration.
     * </p>
     * 
     * @param integrationStatus
     *        Account-level: Configuration status of the Jira integration.
     * @see IntegrationStatus
     */

    public void setIntegrationStatus(String integrationStatus) {
        this.integrationStatus = integrationStatus;
    }

    /**
     * <p>
     * Account-level: Configuration status of the Jira integration.
     * </p>
     * 
     * @return Account-level: Configuration status of the Jira integration.
     * @see IntegrationStatus
     */

    public String getIntegrationStatus() {
        return this.integrationStatus;
    }

    /**
     * <p>
     * Account-level: Configuration status of the Jira integration.
     * </p>
     * 
     * @param integrationStatus
     *        Account-level: Configuration status of the Jira integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationStatus
     */

    public AccountJiraConfigurationOutput withIntegrationStatus(String integrationStatus) {
        setIntegrationStatus(integrationStatus);
        return this;
    }

    /**
     * <p>
     * Account-level: Configuration status of the Jira integration.
     * </p>
     * 
     * @param integrationStatus
     *        Account-level: Configuration status of the Jira integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationStatus
     */

    public AccountJiraConfigurationOutput withIntegrationStatus(IntegrationStatus integrationStatus) {
        this.integrationStatus = integrationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Account-level: Jira issue management status.
     * </p>
     * 
     * @param issueManagementStatus
     *        Account-level: Jira issue management status.
     * @see AccountJiraIssueManagementStatus
     */

    public void setIssueManagementStatus(String issueManagementStatus) {
        this.issueManagementStatus = issueManagementStatus;
    }

    /**
     * <p>
     * Account-level: Jira issue management status.
     * </p>
     * 
     * @return Account-level: Jira issue management status.
     * @see AccountJiraIssueManagementStatus
     */

    public String getIssueManagementStatus() {
        return this.issueManagementStatus;
    }

    /**
     * <p>
     * Account-level: Jira issue management status.
     * </p>
     * 
     * @param issueManagementStatus
     *        Account-level: Jira issue management status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountJiraIssueManagementStatus
     */

    public AccountJiraConfigurationOutput withIssueManagementStatus(String issueManagementStatus) {
        setIssueManagementStatus(issueManagementStatus);
        return this;
    }

    /**
     * <p>
     * Account-level: Jira issue management status.
     * </p>
     * 
     * @param issueManagementStatus
     *        Account-level: Jira issue management status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountJiraIssueManagementStatus
     */

    public AccountJiraConfigurationOutput withIssueManagementStatus(AccountJiraIssueManagementStatus issueManagementStatus) {
        this.issueManagementStatus = issueManagementStatus.toString();
        return this;
    }

    /**
     * <p>
     * Account-level: Jira issue management type.
     * </p>
     * 
     * @param issueManagementType
     *        Account-level: Jira issue management type.
     * @see IssueManagementType
     */

    public void setIssueManagementType(String issueManagementType) {
        this.issueManagementType = issueManagementType;
    }

    /**
     * <p>
     * Account-level: Jira issue management type.
     * </p>
     * 
     * @return Account-level: Jira issue management type.
     * @see IssueManagementType
     */

    public String getIssueManagementType() {
        return this.issueManagementType;
    }

    /**
     * <p>
     * Account-level: Jira issue management type.
     * </p>
     * 
     * @param issueManagementType
     *        Account-level: Jira issue management type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IssueManagementType
     */

    public AccountJiraConfigurationOutput withIssueManagementType(String issueManagementType) {
        setIssueManagementType(issueManagementType);
        return this;
    }

    /**
     * <p>
     * Account-level: Jira issue management type.
     * </p>
     * 
     * @param issueManagementType
     *        Account-level: Jira issue management type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IssueManagementType
     */

    public AccountJiraConfigurationOutput withIssueManagementType(IssueManagementType issueManagementType) {
        this.issueManagementType = issueManagementType.toString();
        return this;
    }

    /**
     * <p>
     * Account-level: Jira subdomain URL.
     * </p>
     * 
     * @param subdomain
     *        Account-level: Jira subdomain URL.
     */

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    /**
     * <p>
     * Account-level: Jira subdomain URL.
     * </p>
     * 
     * @return Account-level: Jira subdomain URL.
     */

    public String getSubdomain() {
        return this.subdomain;
    }

    /**
     * <p>
     * Account-level: Jira subdomain URL.
     * </p>
     * 
     * @param subdomain
     *        Account-level: Jira subdomain URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountJiraConfigurationOutput withSubdomain(String subdomain) {
        setSubdomain(subdomain);
        return this;
    }

    /**
     * <p>
     * Account-level: Jira project key to sync workloads to.
     * </p>
     * 
     * @param jiraProjectKey
     *        Account-level: Jira project key to sync workloads to.
     */

    public void setJiraProjectKey(String jiraProjectKey) {
        this.jiraProjectKey = jiraProjectKey;
    }

    /**
     * <p>
     * Account-level: Jira project key to sync workloads to.
     * </p>
     * 
     * @return Account-level: Jira project key to sync workloads to.
     */

    public String getJiraProjectKey() {
        return this.jiraProjectKey;
    }

    /**
     * <p>
     * Account-level: Jira project key to sync workloads to.
     * </p>
     * 
     * @param jiraProjectKey
     *        Account-level: Jira project key to sync workloads to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountJiraConfigurationOutput withJiraProjectKey(String jiraProjectKey) {
        setJiraProjectKey(jiraProjectKey);
        return this;
    }

    /**
     * <p>
     * Account-level: Status message on configuration of the Jira integration.
     * </p>
     * 
     * @param statusMessage
     *        Account-level: Status message on configuration of the Jira integration.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Account-level: Status message on configuration of the Jira integration.
     * </p>
     * 
     * @return Account-level: Status message on configuration of the Jira integration.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Account-level: Status message on configuration of the Jira integration.
     * </p>
     * 
     * @param statusMessage
     *        Account-level: Status message on configuration of the Jira integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountJiraConfigurationOutput withStatusMessage(String statusMessage) {
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
        if (getIntegrationStatus() != null)
            sb.append("IntegrationStatus: ").append(getIntegrationStatus()).append(",");
        if (getIssueManagementStatus() != null)
            sb.append("IssueManagementStatus: ").append(getIssueManagementStatus()).append(",");
        if (getIssueManagementType() != null)
            sb.append("IssueManagementType: ").append(getIssueManagementType()).append(",");
        if (getSubdomain() != null)
            sb.append("Subdomain: ").append(getSubdomain()).append(",");
        if (getJiraProjectKey() != null)
            sb.append("JiraProjectKey: ").append(getJiraProjectKey()).append(",");
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

        if (obj instanceof AccountJiraConfigurationOutput == false)
            return false;
        AccountJiraConfigurationOutput other = (AccountJiraConfigurationOutput) obj;
        if (other.getIntegrationStatus() == null ^ this.getIntegrationStatus() == null)
            return false;
        if (other.getIntegrationStatus() != null && other.getIntegrationStatus().equals(this.getIntegrationStatus()) == false)
            return false;
        if (other.getIssueManagementStatus() == null ^ this.getIssueManagementStatus() == null)
            return false;
        if (other.getIssueManagementStatus() != null && other.getIssueManagementStatus().equals(this.getIssueManagementStatus()) == false)
            return false;
        if (other.getIssueManagementType() == null ^ this.getIssueManagementType() == null)
            return false;
        if (other.getIssueManagementType() != null && other.getIssueManagementType().equals(this.getIssueManagementType()) == false)
            return false;
        if (other.getSubdomain() == null ^ this.getSubdomain() == null)
            return false;
        if (other.getSubdomain() != null && other.getSubdomain().equals(this.getSubdomain()) == false)
            return false;
        if (other.getJiraProjectKey() == null ^ this.getJiraProjectKey() == null)
            return false;
        if (other.getJiraProjectKey() != null && other.getJiraProjectKey().equals(this.getJiraProjectKey()) == false)
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

        hashCode = prime * hashCode + ((getIntegrationStatus() == null) ? 0 : getIntegrationStatus().hashCode());
        hashCode = prime * hashCode + ((getIssueManagementStatus() == null) ? 0 : getIssueManagementStatus().hashCode());
        hashCode = prime * hashCode + ((getIssueManagementType() == null) ? 0 : getIssueManagementType().hashCode());
        hashCode = prime * hashCode + ((getSubdomain() == null) ? 0 : getSubdomain().hashCode());
        hashCode = prime * hashCode + ((getJiraProjectKey() == null) ? 0 : getJiraProjectKey().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public AccountJiraConfigurationOutput clone() {
        try {
            return (AccountJiraConfigurationOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.AccountJiraConfigurationOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
