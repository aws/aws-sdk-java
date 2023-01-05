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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-app-2021-08-20/RegisterSlackWorkspaceForOrganization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterSlackWorkspaceForOrganizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Whether the Amazon Web Services account is a management or member account that's part of an organization in
     * Organizations.
     * </p>
     */
    private String accountType;
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
     * Whether the Amazon Web Services account is a management or member account that's part of an organization in
     * Organizations.
     * </p>
     * 
     * @param accountType
     *        Whether the Amazon Web Services account is a management or member account that's part of an organization
     *        in Organizations.
     * @see AccountType
     */

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * <p>
     * Whether the Amazon Web Services account is a management or member account that's part of an organization in
     * Organizations.
     * </p>
     * 
     * @return Whether the Amazon Web Services account is a management or member account that's part of an organization
     *         in Organizations.
     * @see AccountType
     */

    public String getAccountType() {
        return this.accountType;
    }

    /**
     * <p>
     * Whether the Amazon Web Services account is a management or member account that's part of an organization in
     * Organizations.
     * </p>
     * 
     * @param accountType
     *        Whether the Amazon Web Services account is a management or member account that's part of an organization
     *        in Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountType
     */

    public RegisterSlackWorkspaceForOrganizationResult withAccountType(String accountType) {
        setAccountType(accountType);
        return this;
    }

    /**
     * <p>
     * Whether the Amazon Web Services account is a management or member account that's part of an organization in
     * Organizations.
     * </p>
     * 
     * @param accountType
     *        Whether the Amazon Web Services account is a management or member account that's part of an organization
     *        in Organizations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountType
     */

    public RegisterSlackWorkspaceForOrganizationResult withAccountType(AccountType accountType) {
        this.accountType = accountType.toString();
        return this;
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

    public RegisterSlackWorkspaceForOrganizationResult withTeamId(String teamId) {
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

    public RegisterSlackWorkspaceForOrganizationResult withTeamName(String teamName) {
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
        if (getAccountType() != null)
            sb.append("AccountType: ").append(getAccountType()).append(",");
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

        if (obj instanceof RegisterSlackWorkspaceForOrganizationResult == false)
            return false;
        RegisterSlackWorkspaceForOrganizationResult other = (RegisterSlackWorkspaceForOrganizationResult) obj;
        if (other.getAccountType() == null ^ this.getAccountType() == null)
            return false;
        if (other.getAccountType() != null && other.getAccountType().equals(this.getAccountType()) == false)
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

        hashCode = prime * hashCode + ((getAccountType() == null) ? 0 : getAccountType().hashCode());
        hashCode = prime * hashCode + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        hashCode = prime * hashCode + ((getTeamName() == null) ? 0 : getTeamName().hashCode());
        return hashCode;
    }

    @Override
    public RegisterSlackWorkspaceForOrganizationResult clone() {
        try {
            return (RegisterSlackWorkspaceForOrganizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
