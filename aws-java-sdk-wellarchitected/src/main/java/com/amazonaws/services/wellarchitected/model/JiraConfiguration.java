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
 * Configuration of the Jira integration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/JiraConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JiraConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL of the associated Jira issue.
     * </p>
     */
    private String jiraIssueUrl;

    private java.util.Date lastSyncedTime;

    /**
     * <p>
     * The URL of the associated Jira issue.
     * </p>
     * 
     * @param jiraIssueUrl
     *        The URL of the associated Jira issue.
     */

    public void setJiraIssueUrl(String jiraIssueUrl) {
        this.jiraIssueUrl = jiraIssueUrl;
    }

    /**
     * <p>
     * The URL of the associated Jira issue.
     * </p>
     * 
     * @return The URL of the associated Jira issue.
     */

    public String getJiraIssueUrl() {
        return this.jiraIssueUrl;
    }

    /**
     * <p>
     * The URL of the associated Jira issue.
     * </p>
     * 
     * @param jiraIssueUrl
     *        The URL of the associated Jira issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withJiraIssueUrl(String jiraIssueUrl) {
        setJiraIssueUrl(jiraIssueUrl);
        return this;
    }

    /**
     * @param lastSyncedTime
     */

    public void setLastSyncedTime(java.util.Date lastSyncedTime) {
        this.lastSyncedTime = lastSyncedTime;
    }

    /**
     * @return
     */

    public java.util.Date getLastSyncedTime() {
        return this.lastSyncedTime;
    }

    /**
     * @param lastSyncedTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JiraConfiguration withLastSyncedTime(java.util.Date lastSyncedTime) {
        setLastSyncedTime(lastSyncedTime);
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
        if (getJiraIssueUrl() != null)
            sb.append("JiraIssueUrl: ").append(getJiraIssueUrl()).append(",");
        if (getLastSyncedTime() != null)
            sb.append("LastSyncedTime: ").append(getLastSyncedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JiraConfiguration == false)
            return false;
        JiraConfiguration other = (JiraConfiguration) obj;
        if (other.getJiraIssueUrl() == null ^ this.getJiraIssueUrl() == null)
            return false;
        if (other.getJiraIssueUrl() != null && other.getJiraIssueUrl().equals(this.getJiraIssueUrl()) == false)
            return false;
        if (other.getLastSyncedTime() == null ^ this.getLastSyncedTime() == null)
            return false;
        if (other.getLastSyncedTime() != null && other.getLastSyncedTime().equals(this.getLastSyncedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJiraIssueUrl() == null) ? 0 : getJiraIssueUrl().hashCode());
        hashCode = prime * hashCode + ((getLastSyncedTime() == null) ? 0 : getLastSyncedTime().hashCode());
        return hashCode;
    }

    @Override
    public JiraConfiguration clone() {
        try {
            return (JiraConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.JiraConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
