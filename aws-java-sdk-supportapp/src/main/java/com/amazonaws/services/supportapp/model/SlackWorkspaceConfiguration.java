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
package com.amazonaws.services.supportapp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for a Slack workspace that you added to an Amazon Web Services account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/SlackWorkspaceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlackWorkspaceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to allow member accounts to authorize Slack workspaces. Member accounts must be part of an organization
     * in Organizations.
     * </p>
     */
    private Boolean allowOrganizationMemberAccount;
    /**
     * <p>
     * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     * </p>
     */
    private String teamId;
    /**
     * <p>
     * The name of the Slack workspace.
     * </p>
     */
    private String teamName;

    /**
     * <p>
     * Whether to allow member accounts to authorize Slack workspaces. Member accounts must be part of an organization
     * in Organizations.
     * </p>
     * 
     * @param allowOrganizationMemberAccount
     *        Whether to allow member accounts to authorize Slack workspaces. Member accounts must be part of an
     *        organization in Organizations.
     */

    public void setAllowOrganizationMemberAccount(Boolean allowOrganizationMemberAccount) {
        this.allowOrganizationMemberAccount = allowOrganizationMemberAccount;
    }

    /**
     * <p>
     * Whether to allow member accounts to authorize Slack workspaces. Member accounts must be part of an organization
     * in Organizations.
     * </p>
     * 
     * @return Whether to allow member accounts to authorize Slack workspaces. Member accounts must be part of an
     *         organization in Organizations.
     */

    public Boolean getAllowOrganizationMemberAccount() {
        return this.allowOrganizationMemberAccount;
    }

    /**
     * <p>
     * Whether to allow member accounts to authorize Slack workspaces. Member accounts must be part of an organization
     * in Organizations.
     * </p>
     * 
     * @param allowOrganizationMemberAccount
     *        Whether to allow member accounts to authorize Slack workspaces. Member accounts must be part of an
     *        organization in Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackWorkspaceConfiguration withAllowOrganizationMemberAccount(Boolean allowOrganizationMemberAccount) {
        setAllowOrganizationMemberAccount(allowOrganizationMemberAccount);
        return this;
    }

    /**
     * <p>
     * Whether to allow member accounts to authorize Slack workspaces. Member accounts must be part of an organization
     * in Organizations.
     * </p>
     * 
     * @return Whether to allow member accounts to authorize Slack workspaces. Member accounts must be part of an
     *         organization in Organizations.
     */

    public Boolean isAllowOrganizationMemberAccount() {
        return this.allowOrganizationMemberAccount;
    }

    /**
     * <p>
     * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     * </p>
     * 
     * @param teamId
     *        The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     */

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * <p>
     * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     * </p>
     * 
     * @return The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     */

    public String getTeamId() {
        return this.teamId;
    }

    /**
     * <p>
     * The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     * </p>
     * 
     * @param teamId
     *        The team ID in Slack. This ID uniquely identifies a Slack workspace, such as <code>T012ABCDEFG</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackWorkspaceConfiguration withTeamId(String teamId) {
        setTeamId(teamId);
        return this;
    }

    /**
     * <p>
     * The name of the Slack workspace.
     * </p>
     * 
     * @param teamName
     *        The name of the Slack workspace.
     */

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * <p>
     * The name of the Slack workspace.
     * </p>
     * 
     * @return The name of the Slack workspace.
     */

    public String getTeamName() {
        return this.teamName;
    }

    /**
     * <p>
     * The name of the Slack workspace.
     * </p>
     * 
     * @param teamName
     *        The name of the Slack workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackWorkspaceConfiguration withTeamName(String teamName) {
        setTeamName(teamName);
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
        if (getAllowOrganizationMemberAccount() != null)
            sb.append("AllowOrganizationMemberAccount: ").append(getAllowOrganizationMemberAccount()).append(",");
        if (getTeamId() != null)
            sb.append("TeamId: ").append(getTeamId()).append(",");
        if (getTeamName() != null)
            sb.append("TeamName: ").append(getTeamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlackWorkspaceConfiguration == false)
            return false;
        SlackWorkspaceConfiguration other = (SlackWorkspaceConfiguration) obj;
        if (other.getAllowOrganizationMemberAccount() == null ^ this.getAllowOrganizationMemberAccount() == null)
            return false;
        if (other.getAllowOrganizationMemberAccount() != null
                && other.getAllowOrganizationMemberAccount().equals(this.getAllowOrganizationMemberAccount()) == false)
            return false;
        if (other.getTeamId() == null ^ this.getTeamId() == null)
            return false;
        if (other.getTeamId() != null && other.getTeamId().equals(this.getTeamId()) == false)
            return false;
        if (other.getTeamName() == null ^ this.getTeamName() == null)
            return false;
        if (other.getTeamName() != null && other.getTeamName().equals(this.getTeamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowOrganizationMemberAccount() == null) ? 0 : getAllowOrganizationMemberAccount().hashCode());
        hashCode = prime * hashCode + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        hashCode = prime * hashCode + ((getTeamName() == null) ? 0 : getTeamName().hashCode());
        return hashCode;
    }

    @Override
    public SlackWorkspaceConfiguration clone() {
        try {
            return (SlackWorkspaceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.supportapp.model.transform.SlackWorkspaceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
