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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateChimeWebhookConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateChimeWebhookConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ARN of the ChimeWebhookConfiguration to update. */
    private String chatConfigurationArn;
    /**
     * Description of the webhook. Recommend using the convention `RoomName/WebhookName`. See Chime setup tutorial for
     * more details: https://docs.aws.amazon.com/chatbot/latest/adminguide/chime-setup.html.
     */
    private String webhookDescription;
    /** URL for the Chime webhook. */
    private String webhookUrl;
    /** The ARNs of the SNS topics that deliver notifications to AWS Chatbot. */
    private java.util.List<String> snsTopicArns;
    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot. This is a user-defined role that AWS
     * Chatbot will assume. This is not the service-linked role. For more information, see IAM Policies for AWS Chatbot.
     */
    private String iamRoleArn;
    /** Logging levels include ERROR, INFO, or NONE. */
    private String loggingLevel;

    /**
     * The ARN of the ChimeWebhookConfiguration to update.
     * 
     * @param chatConfigurationArn
     *        The ARN of the ChimeWebhookConfiguration to update.
     */

    public void setChatConfigurationArn(String chatConfigurationArn) {
        this.chatConfigurationArn = chatConfigurationArn;
    }

    /**
     * The ARN of the ChimeWebhookConfiguration to update.
     * 
     * @return The ARN of the ChimeWebhookConfiguration to update.
     */

    public String getChatConfigurationArn() {
        return this.chatConfigurationArn;
    }

    /**
     * The ARN of the ChimeWebhookConfiguration to update.
     * 
     * @param chatConfigurationArn
     *        The ARN of the ChimeWebhookConfiguration to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChimeWebhookConfigurationRequest withChatConfigurationArn(String chatConfigurationArn) {
        setChatConfigurationArn(chatConfigurationArn);
        return this;
    }

    /**
     * Description of the webhook. Recommend using the convention `RoomName/WebhookName`. See Chime setup tutorial for
     * more details: https://docs.aws.amazon.com/chatbot/latest/adminguide/chime-setup.html.
     * 
     * @param webhookDescription
     *        Description of the webhook. Recommend using the convention `RoomName/WebhookName`. See Chime setup
     *        tutorial for more details: https://docs.aws.amazon.com/chatbot/latest/adminguide/chime-setup.html.
     */

    public void setWebhookDescription(String webhookDescription) {
        this.webhookDescription = webhookDescription;
    }

    /**
     * Description of the webhook. Recommend using the convention `RoomName/WebhookName`. See Chime setup tutorial for
     * more details: https://docs.aws.amazon.com/chatbot/latest/adminguide/chime-setup.html.
     * 
     * @return Description of the webhook. Recommend using the convention `RoomName/WebhookName`. See Chime setup
     *         tutorial for more details: https://docs.aws.amazon.com/chatbot/latest/adminguide/chime-setup.html.
     */

    public String getWebhookDescription() {
        return this.webhookDescription;
    }

    /**
     * Description of the webhook. Recommend using the convention `RoomName/WebhookName`. See Chime setup tutorial for
     * more details: https://docs.aws.amazon.com/chatbot/latest/adminguide/chime-setup.html.
     * 
     * @param webhookDescription
     *        Description of the webhook. Recommend using the convention `RoomName/WebhookName`. See Chime setup
     *        tutorial for more details: https://docs.aws.amazon.com/chatbot/latest/adminguide/chime-setup.html.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChimeWebhookConfigurationRequest withWebhookDescription(String webhookDescription) {
        setWebhookDescription(webhookDescription);
        return this;
    }

    /**
     * URL for the Chime webhook.
     * 
     * @param webhookUrl
     *        URL for the Chime webhook.
     */

    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    /**
     * URL for the Chime webhook.
     * 
     * @return URL for the Chime webhook.
     */

    public String getWebhookUrl() {
        return this.webhookUrl;
    }

    /**
     * URL for the Chime webhook.
     * 
     * @param webhookUrl
     *        URL for the Chime webhook.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChimeWebhookConfigurationRequest withWebhookUrl(String webhookUrl) {
        setWebhookUrl(webhookUrl);
        return this;
    }

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot.
     * 
     * @return The ARNs of the SNS topics that deliver notifications to AWS Chatbot.
     */

    public java.util.List<String> getSnsTopicArns() {
        return snsTopicArns;
    }

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot.
     * 
     * @param snsTopicArns
     *        The ARNs of the SNS topics that deliver notifications to AWS Chatbot.
     */

    public void setSnsTopicArns(java.util.Collection<String> snsTopicArns) {
        if (snsTopicArns == null) {
            this.snsTopicArns = null;
            return;
        }

        this.snsTopicArns = new java.util.ArrayList<String>(snsTopicArns);
    }

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnsTopicArns(java.util.Collection)} or {@link #withSnsTopicArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param snsTopicArns
     *        The ARNs of the SNS topics that deliver notifications to AWS Chatbot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChimeWebhookConfigurationRequest withSnsTopicArns(String... snsTopicArns) {
        if (this.snsTopicArns == null) {
            setSnsTopicArns(new java.util.ArrayList<String>(snsTopicArns.length));
        }
        for (String ele : snsTopicArns) {
            this.snsTopicArns.add(ele);
        }
        return this;
    }

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot.
     * 
     * @param snsTopicArns
     *        The ARNs of the SNS topics that deliver notifications to AWS Chatbot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChimeWebhookConfigurationRequest withSnsTopicArns(java.util.Collection<String> snsTopicArns) {
        setSnsTopicArns(snsTopicArns);
        return this;
    }

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

    public UpdateChimeWebhookConfigurationRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * Logging levels include ERROR, INFO, or NONE.
     * 
     * @param loggingLevel
     *        Logging levels include ERROR, INFO, or NONE.
     */

    public void setLoggingLevel(String loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    /**
     * Logging levels include ERROR, INFO, or NONE.
     * 
     * @return Logging levels include ERROR, INFO, or NONE.
     */

    public String getLoggingLevel() {
        return this.loggingLevel;
    }

    /**
     * Logging levels include ERROR, INFO, or NONE.
     * 
     * @param loggingLevel
     *        Logging levels include ERROR, INFO, or NONE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateChimeWebhookConfigurationRequest withLoggingLevel(String loggingLevel) {
        setLoggingLevel(loggingLevel);
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
        if (getWebhookDescription() != null)
            sb.append("WebhookDescription: ").append(getWebhookDescription()).append(",");
        if (getWebhookUrl() != null)
            sb.append("WebhookUrl: ").append(getWebhookUrl()).append(",");
        if (getSnsTopicArns() != null)
            sb.append("SnsTopicArns: ").append(getSnsTopicArns()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getLoggingLevel() != null)
            sb.append("LoggingLevel: ").append(getLoggingLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChimeWebhookConfigurationRequest == false)
            return false;
        UpdateChimeWebhookConfigurationRequest other = (UpdateChimeWebhookConfigurationRequest) obj;
        if (other.getChatConfigurationArn() == null ^ this.getChatConfigurationArn() == null)
            return false;
        if (other.getChatConfigurationArn() != null && other.getChatConfigurationArn().equals(this.getChatConfigurationArn()) == false)
            return false;
        if (other.getWebhookDescription() == null ^ this.getWebhookDescription() == null)
            return false;
        if (other.getWebhookDescription() != null && other.getWebhookDescription().equals(this.getWebhookDescription()) == false)
            return false;
        if (other.getWebhookUrl() == null ^ this.getWebhookUrl() == null)
            return false;
        if (other.getWebhookUrl() != null && other.getWebhookUrl().equals(this.getWebhookUrl()) == false)
            return false;
        if (other.getSnsTopicArns() == null ^ this.getSnsTopicArns() == null)
            return false;
        if (other.getSnsTopicArns() != null && other.getSnsTopicArns().equals(this.getSnsTopicArns()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getLoggingLevel() == null ^ this.getLoggingLevel() == null)
            return false;
        if (other.getLoggingLevel() != null && other.getLoggingLevel().equals(this.getLoggingLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChatConfigurationArn() == null) ? 0 : getChatConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getWebhookDescription() == null) ? 0 : getWebhookDescription().hashCode());
        hashCode = prime * hashCode + ((getWebhookUrl() == null) ? 0 : getWebhookUrl().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArns() == null) ? 0 : getSnsTopicArns().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLoggingLevel() == null) ? 0 : getLoggingLevel().hashCode());
        return hashCode;
    }

    @Override
    public UpdateChimeWebhookConfigurationRequest clone() {
        return (UpdateChimeWebhookConfigurationRequest) super.clone();
    }

}
