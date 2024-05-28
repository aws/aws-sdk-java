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
 * Identifes a User level permission for a channel configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/SlackUserIdentity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlackUserIdentity implements Serializable, Cloneable, StructuredPojo {

    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot. This is a user-defined role that AWS
     * Chatbot will assume. This is not the service-linked role. For more information, see IAM Policies for AWS Chatbot.
     */
    private String iamRoleArn;
    /** The ARN of the SlackChannelConfiguration associated with the user identity. */
    private String chatConfigurationArn;
    /** The ID of the Slack workspace authorized with AWS Chatbot. */
    private String slackTeamId;
    /** The ID of the user in Slack. */
    private String slackUserId;
    /** The AWS user identity ARN used to associate a Slack User Identity with an IAM Role. */
    private String awsUserIdentity;

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

    public SlackUserIdentity withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * The ARN of the SlackChannelConfiguration associated with the user identity.
     * 
     * @param chatConfigurationArn
     *        The ARN of the SlackChannelConfiguration associated with the user identity.
     */

    public void setChatConfigurationArn(String chatConfigurationArn) {
        this.chatConfigurationArn = chatConfigurationArn;
    }

    /**
     * The ARN of the SlackChannelConfiguration associated with the user identity.
     * 
     * @return The ARN of the SlackChannelConfiguration associated with the user identity.
     */

    public String getChatConfigurationArn() {
        return this.chatConfigurationArn;
    }

    /**
     * The ARN of the SlackChannelConfiguration associated with the user identity.
     * 
     * @param chatConfigurationArn
     *        The ARN of the SlackChannelConfiguration associated with the user identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackUserIdentity withChatConfigurationArn(String chatConfigurationArn) {
        setChatConfigurationArn(chatConfigurationArn);
        return this;
    }

    /**
     * The ID of the Slack workspace authorized with AWS Chatbot.
     * 
     * @param slackTeamId
     *        The ID of the Slack workspace authorized with AWS Chatbot.
     */

    public void setSlackTeamId(String slackTeamId) {
        this.slackTeamId = slackTeamId;
    }

    /**
     * The ID of the Slack workspace authorized with AWS Chatbot.
     * 
     * @return The ID of the Slack workspace authorized with AWS Chatbot.
     */

    public String getSlackTeamId() {
        return this.slackTeamId;
    }

    /**
     * The ID of the Slack workspace authorized with AWS Chatbot.
     * 
     * @param slackTeamId
     *        The ID of the Slack workspace authorized with AWS Chatbot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackUserIdentity withSlackTeamId(String slackTeamId) {
        setSlackTeamId(slackTeamId);
        return this;
    }

    /**
     * The ID of the user in Slack.
     * 
     * @param slackUserId
     *        The ID of the user in Slack.
     */

    public void setSlackUserId(String slackUserId) {
        this.slackUserId = slackUserId;
    }

    /**
     * The ID of the user in Slack.
     * 
     * @return The ID of the user in Slack.
     */

    public String getSlackUserId() {
        return this.slackUserId;
    }

    /**
     * The ID of the user in Slack.
     * 
     * @param slackUserId
     *        The ID of the user in Slack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackUserIdentity withSlackUserId(String slackUserId) {
        setSlackUserId(slackUserId);
        return this;
    }

    /**
     * The AWS user identity ARN used to associate a Slack User Identity with an IAM Role.
     * 
     * @param awsUserIdentity
     *        The AWS user identity ARN used to associate a Slack User Identity with an IAM Role.
     */

    public void setAwsUserIdentity(String awsUserIdentity) {
        this.awsUserIdentity = awsUserIdentity;
    }

    /**
     * The AWS user identity ARN used to associate a Slack User Identity with an IAM Role.
     * 
     * @return The AWS user identity ARN used to associate a Slack User Identity with an IAM Role.
     */

    public String getAwsUserIdentity() {
        return this.awsUserIdentity;
    }

    /**
     * The AWS user identity ARN used to associate a Slack User Identity with an IAM Role.
     * 
     * @param awsUserIdentity
     *        The AWS user identity ARN used to associate a Slack User Identity with an IAM Role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SlackUserIdentity withAwsUserIdentity(String awsUserIdentity) {
        setAwsUserIdentity(awsUserIdentity);
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
        if (getSlackTeamId() != null)
            sb.append("SlackTeamId: ").append(getSlackTeamId()).append(",");
        if (getSlackUserId() != null)
            sb.append("SlackUserId: ").append(getSlackUserId()).append(",");
        if (getAwsUserIdentity() != null)
            sb.append("AwsUserIdentity: ").append(getAwsUserIdentity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SlackUserIdentity == false)
            return false;
        SlackUserIdentity other = (SlackUserIdentity) obj;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getChatConfigurationArn() == null ^ this.getChatConfigurationArn() == null)
            return false;
        if (other.getChatConfigurationArn() != null && other.getChatConfigurationArn().equals(this.getChatConfigurationArn()) == false)
            return false;
        if (other.getSlackTeamId() == null ^ this.getSlackTeamId() == null)
            return false;
        if (other.getSlackTeamId() != null && other.getSlackTeamId().equals(this.getSlackTeamId()) == false)
            return false;
        if (other.getSlackUserId() == null ^ this.getSlackUserId() == null)
            return false;
        if (other.getSlackUserId() != null && other.getSlackUserId().equals(this.getSlackUserId()) == false)
            return false;
        if (other.getAwsUserIdentity() == null ^ this.getAwsUserIdentity() == null)
            return false;
        if (other.getAwsUserIdentity() != null && other.getAwsUserIdentity().equals(this.getAwsUserIdentity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getChatConfigurationArn() == null) ? 0 : getChatConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getSlackTeamId() == null) ? 0 : getSlackTeamId().hashCode());
        hashCode = prime * hashCode + ((getSlackUserId() == null) ? 0 : getSlackUserId().hashCode());
        hashCode = prime * hashCode + ((getAwsUserIdentity() == null) ? 0 : getAwsUserIdentity().hashCode());
        return hashCode;
    }

    @Override
    public SlackUserIdentity clone() {
        try {
            return (SlackUserIdentity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chatbot.model.transform.SlackUserIdentityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
