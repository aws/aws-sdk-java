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
package com.amazonaws.services.chatbot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Identifes a user level permission for a channel configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/TeamsUserIdentity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TeamsUserIdentity implements Serializable, Cloneable, StructuredPojo {

    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot. This is a user-defined role that AWS
     * Chatbot will assume. This is not the service-linked role. For more information, see IAM Policies for AWS Chatbot.
     */
    private String iamRoleArn;
    /** The ARN of the MicrosoftTeamsChannelConfiguration associated with the user identity. */
    private String chatConfigurationArn;
    /**
     * The ID of the Microsoft Team authorized with AWS Chatbot. To get the team ID, you must perform the initial
     * authorization flow with Microsoft Teams in the AWS Chatbot console. Then you can copy and paste the team ID from
     * the console. For more details, see steps 1-4 in Get started with Microsoft Teams in the AWS Chatbot Administrator
     * Guide.
     */
    private String teamId;
    /** Id from Microsoft Teams for user. */
    private String userId;
    /** The AWS user identity ARN used to associate a Microsoft Teams User Identity with an IAM Role. */
    private String awsUserIdentity;
    /** The ID of the Microsoft Teams channel. */
    private String teamsChannelId;
    /** The ID of the Microsoft Teams tenant. */
    private String teamsTenantId;

    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot. This is a user-defined role that AWS
     * Chatbot will assume. This is not the service-linked role. For more information, see IAM Policies for AWS Chatbot.
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role that defines the permissions for AWS Chatbot. This is a user-defined role that AWS
     *        Chatbot will assume. This is not the service-linked role. For more information, see IAM Policies for AWS
     *        Chatbot.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot. This is a user-defined role that AWS
     * Chatbot will assume. This is not the service-linked role. For more information, see IAM Policies for AWS Chatbot.
     * 
     * @return The ARN of the IAM role that defines the permissions for AWS Chatbot. This is a user-defined role that
     *         AWS Chatbot will assume. This is not the service-linked role. For more information, see IAM Policies for
     *         AWS Chatbot.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot. This is a user-defined role that AWS
     * Chatbot will assume. This is not the service-linked role. For more information, see IAM Policies for AWS Chatbot.
     * 
     * @param iamRoleArn
     *        The ARN of the IAM role that defines the permissions for AWS Chatbot. This is a user-defined role that AWS
     *        Chatbot will assume. This is not the service-linked role. For more information, see IAM Policies for AWS
     *        Chatbot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TeamsUserIdentity withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * The ARN of the MicrosoftTeamsChannelConfiguration associated with the user identity.
     * 
     * @param chatConfigurationArn
     *        The ARN of the MicrosoftTeamsChannelConfiguration associated with the user identity.
     */

    public void setChatConfigurationArn(String chatConfigurationArn) {
        this.chatConfigurationArn = chatConfigurationArn;
    }

    /**
     * The ARN of the MicrosoftTeamsChannelConfiguration associated with the user identity.
     * 
     * @return The ARN of the MicrosoftTeamsChannelConfiguration associated with the user identity.
     */

    public String getChatConfigurationArn() {
        return this.chatConfigurationArn;
    }

    /**
     * The ARN of the MicrosoftTeamsChannelConfiguration associated with the user identity.
     * 
     * @param chatConfigurationArn
     *        The ARN of the MicrosoftTeamsChannelConfiguration associated with the user identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TeamsUserIdentity withChatConfigurationArn(String chatConfigurationArn) {
        setChatConfigurationArn(chatConfigurationArn);
        return this;
    }

    /**
     * The ID of the Microsoft Team authorized with AWS Chatbot. To get the team ID, you must perform the initial
     * authorization flow with Microsoft Teams in the AWS Chatbot console. Then you can copy and paste the team ID from
     * the console. For more details, see steps 1-4 in Get started with Microsoft Teams in the AWS Chatbot Administrator
     * Guide.
     * 
     * @param teamId
     *        The ID of the Microsoft Team authorized with AWS Chatbot. To get the team ID, you must perform the initial
     *        authorization flow with Microsoft Teams in the AWS Chatbot console. Then you can copy and paste the team
     *        ID from the console. For more details, see steps 1-4 in Get started with Microsoft Teams in the AWS
     *        Chatbot Administrator Guide.
     */

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * The ID of the Microsoft Team authorized with AWS Chatbot. To get the team ID, you must perform the initial
     * authorization flow with Microsoft Teams in the AWS Chatbot console. Then you can copy and paste the team ID from
     * the console. For more details, see steps 1-4 in Get started with Microsoft Teams in the AWS Chatbot Administrator
     * Guide.
     * 
     * @return The ID of the Microsoft Team authorized with AWS Chatbot. To get the team ID, you must perform the
     *         initial authorization flow with Microsoft Teams in the AWS Chatbot console. Then you can copy and paste
     *         the team ID from the console. For more details, see steps 1-4 in Get started with Microsoft Teams in the
     *         AWS Chatbot Administrator Guide.
     */

    public String getTeamId() {
        return this.teamId;
    }

    /**
     * The ID of the Microsoft Team authorized with AWS Chatbot. To get the team ID, you must perform the initial
     * authorization flow with Microsoft Teams in the AWS Chatbot console. Then you can copy and paste the team ID from
     * the console. For more details, see steps 1-4 in Get started with Microsoft Teams in the AWS Chatbot Administrator
     * Guide.
     * 
     * @param teamId
     *        The ID of the Microsoft Team authorized with AWS Chatbot. To get the team ID, you must perform the initial
     *        authorization flow with Microsoft Teams in the AWS Chatbot console. Then you can copy and paste the team
     *        ID from the console. For more details, see steps 1-4 in Get started with Microsoft Teams in the AWS
     *        Chatbot Administrator Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TeamsUserIdentity withTeamId(String teamId) {
        setTeamId(teamId);
        return this;
    }

    /**
     * Id from Microsoft Teams for user.
     * 
     * @param userId
     *        Id from Microsoft Teams for user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Id from Microsoft Teams for user.
     * 
     * @return Id from Microsoft Teams for user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * Id from Microsoft Teams for user.
     * 
     * @param userId
     *        Id from Microsoft Teams for user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TeamsUserIdentity withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * The AWS user identity ARN used to associate a Microsoft Teams User Identity with an IAM Role.
     * 
     * @param awsUserIdentity
     *        The AWS user identity ARN used to associate a Microsoft Teams User Identity with an IAM Role.
     */

    public void setAwsUserIdentity(String awsUserIdentity) {
        this.awsUserIdentity = awsUserIdentity;
    }

    /**
     * The AWS user identity ARN used to associate a Microsoft Teams User Identity with an IAM Role.
     * 
     * @return The AWS user identity ARN used to associate a Microsoft Teams User Identity with an IAM Role.
     */

    public String getAwsUserIdentity() {
        return this.awsUserIdentity;
    }

    /**
     * The AWS user identity ARN used to associate a Microsoft Teams User Identity with an IAM Role.
     * 
     * @param awsUserIdentity
     *        The AWS user identity ARN used to associate a Microsoft Teams User Identity with an IAM Role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TeamsUserIdentity withAwsUserIdentity(String awsUserIdentity) {
        setAwsUserIdentity(awsUserIdentity);
        return this;
    }

    /**
     * The ID of the Microsoft Teams channel.
     * 
     * @param teamsChannelId
     *        The ID of the Microsoft Teams channel.
     */

    public void setTeamsChannelId(String teamsChannelId) {
        this.teamsChannelId = teamsChannelId;
    }

    /**
     * The ID of the Microsoft Teams channel.
     * 
     * @return The ID of the Microsoft Teams channel.
     */

    public String getTeamsChannelId() {
        return this.teamsChannelId;
    }

    /**
     * The ID of the Microsoft Teams channel.
     * 
     * @param teamsChannelId
     *        The ID of the Microsoft Teams channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TeamsUserIdentity withTeamsChannelId(String teamsChannelId) {
        setTeamsChannelId(teamsChannelId);
        return this;
    }

    /**
     * The ID of the Microsoft Teams tenant.
     * 
     * @param teamsTenantId
     *        The ID of the Microsoft Teams tenant.
     */

    public void setTeamsTenantId(String teamsTenantId) {
        this.teamsTenantId = teamsTenantId;
    }

    /**
     * The ID of the Microsoft Teams tenant.
     * 
     * @return The ID of the Microsoft Teams tenant.
     */

    public String getTeamsTenantId() {
        return this.teamsTenantId;
    }

    /**
     * The ID of the Microsoft Teams tenant.
     * 
     * @param teamsTenantId
     *        The ID of the Microsoft Teams tenant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TeamsUserIdentity withTeamsTenantId(String teamsTenantId) {
        setTeamsTenantId(teamsTenantId);
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
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getChatConfigurationArn() != null)
            sb.append("ChatConfigurationArn: ").append(getChatConfigurationArn()).append(",");
        if (getTeamId() != null)
            sb.append("TeamId: ").append(getTeamId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getAwsUserIdentity() != null)
            sb.append("AwsUserIdentity: ").append(getAwsUserIdentity()).append(",");
        if (getTeamsChannelId() != null)
            sb.append("TeamsChannelId: ").append(getTeamsChannelId()).append(",");
        if (getTeamsTenantId() != null)
            sb.append("TeamsTenantId: ").append(getTeamsTenantId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TeamsUserIdentity == false)
            return false;
        TeamsUserIdentity other = (TeamsUserIdentity) obj;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getChatConfigurationArn() == null ^ this.getChatConfigurationArn() == null)
            return false;
        if (other.getChatConfigurationArn() != null && other.getChatConfigurationArn().equals(this.getChatConfigurationArn()) == false)
            return false;
        if (other.getTeamId() == null ^ this.getTeamId() == null)
            return false;
        if (other.getTeamId() != null && other.getTeamId().equals(this.getTeamId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getAwsUserIdentity() == null ^ this.getAwsUserIdentity() == null)
            return false;
        if (other.getAwsUserIdentity() != null && other.getAwsUserIdentity().equals(this.getAwsUserIdentity()) == false)
            return false;
        if (other.getTeamsChannelId() == null ^ this.getTeamsChannelId() == null)
            return false;
        if (other.getTeamsChannelId() != null && other.getTeamsChannelId().equals(this.getTeamsChannelId()) == false)
            return false;
        if (other.getTeamsTenantId() == null ^ this.getTeamsTenantId() == null)
            return false;
        if (other.getTeamsTenantId() != null && other.getTeamsTenantId().equals(this.getTeamsTenantId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getChatConfigurationArn() == null) ? 0 : getChatConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getAwsUserIdentity() == null) ? 0 : getAwsUserIdentity().hashCode());
        hashCode = prime * hashCode + ((getTeamsChannelId() == null) ? 0 : getTeamsChannelId().hashCode());
        hashCode = prime * hashCode + ((getTeamsTenantId() == null) ? 0 : getTeamsTenantId().hashCode());
        return hashCode;
    }

    @Override
    public TeamsUserIdentity clone() {
        try {
            return (TeamsUserIdentity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chatbot.model.transform.TeamsUserIdentityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
