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
 * Workload-level: Input for the Jira configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/WorkloadJiraConfigurationInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkloadJiraConfigurationInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Workload-level: Jira issue management status.
     * </p>
     */
    private String issueManagementStatus;
    /**
     * <p>
     * Workload-level: Jira issue management type.
     * </p>
     */
    private String issueManagementType;
    /**
     * <p>
     * Workload-level: Jira project key to sync workloads to.
     * </p>
     */
    private String jiraProjectKey;

    /**
     * <p>
     * Workload-level: Jira issue management status.
     * </p>
     * 
     * @param issueManagementStatus
     *        Workload-level: Jira issue management status.
     * @see WorkloadIssueManagementStatus
     */

    public void setIssueManagementStatus(String issueManagementStatus) {
        this.issueManagementStatus = issueManagementStatus;
    }

    /**
     * <p>
     * Workload-level: Jira issue management status.
     * </p>
     * 
     * @return Workload-level: Jira issue management status.
     * @see WorkloadIssueManagementStatus
     */

    public String getIssueManagementStatus() {
        return this.issueManagementStatus;
    }

    /**
     * <p>
     * Workload-level: Jira issue management status.
     * </p>
     * 
     * @param issueManagementStatus
     *        Workload-level: Jira issue management status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkloadIssueManagementStatus
     */

    public WorkloadJiraConfigurationInput withIssueManagementStatus(String issueManagementStatus) {
        setIssueManagementStatus(issueManagementStatus);
        return this;
    }

    /**
     * <p>
     * Workload-level: Jira issue management status.
     * </p>
     * 
     * @param issueManagementStatus
     *        Workload-level: Jira issue management status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkloadIssueManagementStatus
     */

    public WorkloadJiraConfigurationInput withIssueManagementStatus(WorkloadIssueManagementStatus issueManagementStatus) {
        this.issueManagementStatus = issueManagementStatus.toString();
        return this;
    }

    /**
     * <p>
     * Workload-level: Jira issue management type.
     * </p>
     * 
     * @param issueManagementType
     *        Workload-level: Jira issue management type.
     * @see IssueManagementType
     */

    public void setIssueManagementType(String issueManagementType) {
        this.issueManagementType = issueManagementType;
    }

    /**
     * <p>
     * Workload-level: Jira issue management type.
     * </p>
     * 
     * @return Workload-level: Jira issue management type.
     * @see IssueManagementType
     */

    public String getIssueManagementType() {
        return this.issueManagementType;
    }

    /**
     * <p>
     * Workload-level: Jira issue management type.
     * </p>
     * 
     * @param issueManagementType
     *        Workload-level: Jira issue management type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IssueManagementType
     */

    public WorkloadJiraConfigurationInput withIssueManagementType(String issueManagementType) {
        setIssueManagementType(issueManagementType);
        return this;
    }

    /**
     * <p>
     * Workload-level: Jira issue management type.
     * </p>
     * 
     * @param issueManagementType
     *        Workload-level: Jira issue management type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IssueManagementType
     */

    public WorkloadJiraConfigurationInput withIssueManagementType(IssueManagementType issueManagementType) {
        this.issueManagementType = issueManagementType.toString();
        return this;
    }

    /**
     * <p>
     * Workload-level: Jira project key to sync workloads to.
     * </p>
     * 
     * @param jiraProjectKey
     *        Workload-level: Jira project key to sync workloads to.
     */

    public void setJiraProjectKey(String jiraProjectKey) {
        this.jiraProjectKey = jiraProjectKey;
    }

    /**
     * <p>
     * Workload-level: Jira project key to sync workloads to.
     * </p>
     * 
     * @return Workload-level: Jira project key to sync workloads to.
     */

    public String getJiraProjectKey() {
        return this.jiraProjectKey;
    }

    /**
     * <p>
     * Workload-level: Jira project key to sync workloads to.
     * </p>
     * 
     * @param jiraProjectKey
     *        Workload-level: Jira project key to sync workloads to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadJiraConfigurationInput withJiraProjectKey(String jiraProjectKey) {
        setJiraProjectKey(jiraProjectKey);
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
        if (getIssueManagementStatus() != null)
            sb.append("IssueManagementStatus: ").append(getIssueManagementStatus()).append(",");
        if (getIssueManagementType() != null)
            sb.append("IssueManagementType: ").append(getIssueManagementType()).append(",");
        if (getJiraProjectKey() != null)
            sb.append("JiraProjectKey: ").append(getJiraProjectKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkloadJiraConfigurationInput == false)
            return false;
        WorkloadJiraConfigurationInput other = (WorkloadJiraConfigurationInput) obj;
        if (other.getIssueManagementStatus() == null ^ this.getIssueManagementStatus() == null)
            return false;
        if (other.getIssueManagementStatus() != null && other.getIssueManagementStatus().equals(this.getIssueManagementStatus()) == false)
            return false;
        if (other.getIssueManagementType() == null ^ this.getIssueManagementType() == null)
            return false;
        if (other.getIssueManagementType() != null && other.getIssueManagementType().equals(this.getIssueManagementType()) == false)
            return false;
        if (other.getJiraProjectKey() == null ^ this.getJiraProjectKey() == null)
            return false;
        if (other.getJiraProjectKey() != null && other.getJiraProjectKey().equals(this.getJiraProjectKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIssueManagementStatus() == null) ? 0 : getIssueManagementStatus().hashCode());
        hashCode = prime * hashCode + ((getIssueManagementType() == null) ? 0 : getIssueManagementType().hashCode());
        hashCode = prime * hashCode + ((getJiraProjectKey() == null) ? 0 : getJiraProjectKey().hashCode());
        return hashCode;
    }

    @Override
    public WorkloadJiraConfigurationInput clone() {
        try {
            return (WorkloadJiraConfigurationInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.WorkloadJiraConfigurationInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
