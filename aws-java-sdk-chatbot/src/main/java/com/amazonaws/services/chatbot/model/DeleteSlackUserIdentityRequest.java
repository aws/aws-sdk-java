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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/DeleteSlackUserIdentity" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSlackUserIdentityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ARN of the SlackChannelConfiguration associated with the user identity to delete. */
    private String chatConfigurationArn;
    /** The ID of the Slack workspace authorized with AWS Chatbot. */
    private String slackTeamId;
    /** The ID of the user in Slack. */
    private String slackUserId;

    /**
     * The ARN of the SlackChannelConfiguration associated with the user identity to delete.
     * 
     * @param chatConfigurationArn
     *        The ARN of the SlackChannelConfiguration associated with the user identity to delete.
     */

    public void setChatConfigurationArn(String chatConfigurationArn) {
        this.chatConfigurationArn = chatConfigurationArn;
    }

    /**
     * The ARN of the SlackChannelConfiguration associated with the user identity to delete.
     * 
     * @return The ARN of the SlackChannelConfiguration associated with the user identity to delete.
     */

    public String getChatConfigurationArn() {
        return this.chatConfigurationArn;
    }

    /**
     * The ARN of the SlackChannelConfiguration associated with the user identity to delete.
     * 
     * @param chatConfigurationArn
     *        The ARN of the SlackChannelConfiguration associated with the user identity to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSlackUserIdentityRequest withChatConfigurationArn(String chatConfigurationArn) {
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

    public DeleteSlackUserIdentityRequest withSlackTeamId(String slackTeamId) {
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

    public DeleteSlackUserIdentityRequest withSlackUserId(String slackUserId) {
        setSlackUserId(slackUserId);
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
        if (getChatConfigurationArn() != null)
            sb.append("ChatConfigurationArn: ").append(getChatConfigurationArn()).append(",");
        if (getSlackTeamId() != null)
            sb.append("SlackTeamId: ").append(getSlackTeamId()).append(",");
        if (getSlackUserId() != null)
            sb.append("SlackUserId: ").append(getSlackUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSlackUserIdentityRequest == false)
            return false;
        DeleteSlackUserIdentityRequest other = (DeleteSlackUserIdentityRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChatConfigurationArn() == null) ? 0 : getChatConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getSlackTeamId() == null) ? 0 : getSlackTeamId().hashCode());
        hashCode = prime * hashCode + ((getSlackUserId() == null) ? 0 : getSlackUserId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSlackUserIdentityRequest clone() {
        return (DeleteSlackUserIdentityRequest) super.clone();
    }

}
