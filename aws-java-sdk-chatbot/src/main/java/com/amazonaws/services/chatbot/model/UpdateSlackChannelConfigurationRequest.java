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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/UpdateSlackChannelConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSlackChannelConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ARN of the SlackChannelConfiguration to update. */
    private String chatConfigurationArn;
    /**
     * The ID of the Slack channel. To get the ID, open Slack, right click on the channel name in the left pane, then
     * choose Copy Link. The channel ID is the 9-character string at the end of the URL. For example, ABCBBLZZZ.
     */
    private String slackChannelId;
    /** The name of the Slack Channel. */
    private String slackChannelName;
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
     * The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed 'AdministratorAccess' policy
     * is applied by default if this is not set.
     */
    private java.util.List<String> guardrailPolicyArns;
    /** Enables use of a user role requirement in your chat configuration. */
    private Boolean userAuthorizationRequired;

    /**
     * The ARN of the SlackChannelConfiguration to update.
     * 
     * @param chatConfigurationArn
     *        The ARN of the SlackChannelConfiguration to update.
     */

    public void setChatConfigurationArn(String chatConfigurationArn) {
        this.chatConfigurationArn = chatConfigurationArn;
    }

    /**
     * The ARN of the SlackChannelConfiguration to update.
     * 
     * @return The ARN of the SlackChannelConfiguration to update.
     */

    public String getChatConfigurationArn() {
        return this.chatConfigurationArn;
    }

    /**
     * The ARN of the SlackChannelConfiguration to update.
     * 
     * @param chatConfigurationArn
     *        The ARN of the SlackChannelConfiguration to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlackChannelConfigurationRequest withChatConfigurationArn(String chatConfigurationArn) {
        setChatConfigurationArn(chatConfigurationArn);
        return this;
    }

    /**
     * The ID of the Slack channel. To get the ID, open Slack, right click on the channel name in the left pane, then
     * choose Copy Link. The channel ID is the 9-character string at the end of the URL. For example, ABCBBLZZZ.
     * 
     * @param slackChannelId
     *        The ID of the Slack channel. To get the ID, open Slack, right click on the channel name in the left pane,
     *        then choose Copy Link. The channel ID is the 9-character string at the end of the URL. For example,
     *        ABCBBLZZZ.
     */

    public void setSlackChannelId(String slackChannelId) {
        this.slackChannelId = slackChannelId;
    }

    /**
     * The ID of the Slack channel. To get the ID, open Slack, right click on the channel name in the left pane, then
     * choose Copy Link. The channel ID is the 9-character string at the end of the URL. For example, ABCBBLZZZ.
     * 
     * @return The ID of the Slack channel. To get the ID, open Slack, right click on the channel name in the left pane,
     *         then choose Copy Link. The channel ID is the 9-character string at the end of the URL. For example,
     *         ABCBBLZZZ.
     */

    public String getSlackChannelId() {
        return this.slackChannelId;
    }

    /**
     * The ID of the Slack channel. To get the ID, open Slack, right click on the channel name in the left pane, then
     * choose Copy Link. The channel ID is the 9-character string at the end of the URL. For example, ABCBBLZZZ.
     * 
     * @param slackChannelId
     *        The ID of the Slack channel. To get the ID, open Slack, right click on the channel name in the left pane,
     *        then choose Copy Link. The channel ID is the 9-character string at the end of the URL. For example,
     *        ABCBBLZZZ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlackChannelConfigurationRequest withSlackChannelId(String slackChannelId) {
        setSlackChannelId(slackChannelId);
        return this;
    }

    /**
     * The name of the Slack Channel.
     * 
     * @param slackChannelName
     *        The name of the Slack Channel.
     */

    public void setSlackChannelName(String slackChannelName) {
        this.slackChannelName = slackChannelName;
    }

    /**
     * The name of the Slack Channel.
     * 
     * @return The name of the Slack Channel.
     */

    public String getSlackChannelName() {
        return this.slackChannelName;
    }

    /**
     * The name of the Slack Channel.
     * 
     * @param slackChannelName
     *        The name of the Slack Channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlackChannelConfigurationRequest withSlackChannelName(String slackChannelName) {
        setSlackChannelName(slackChannelName);
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

    public UpdateSlackChannelConfigurationRequest withSnsTopicArns(String... snsTopicArns) {
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

    public UpdateSlackChannelConfigurationRequest withSnsTopicArns(java.util.Collection<String> snsTopicArns) {
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

    public UpdateSlackChannelConfigurationRequest withIamRoleArn(String iamRoleArn) {
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

    public UpdateSlackChannelConfigurationRequest withLoggingLevel(String loggingLevel) {
        setLoggingLevel(loggingLevel);
        return this;
    }

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed 'AdministratorAccess' policy
     * is applied by default if this is not set.
     * 
     * @return The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed 'AdministratorAccess'
     *         policy is applied by default if this is not set.
     */

    public java.util.List<String> getGuardrailPolicyArns() {
        return guardrailPolicyArns;
    }

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed 'AdministratorAccess' policy
     * is applied by default if this is not set.
     * 
     * @param guardrailPolicyArns
     *        The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed 'AdministratorAccess'
     *        policy is applied by default if this is not set.
     */

    public void setGuardrailPolicyArns(java.util.Collection<String> guardrailPolicyArns) {
        if (guardrailPolicyArns == null) {
            this.guardrailPolicyArns = null;
            return;
        }

        this.guardrailPolicyArns = new java.util.ArrayList<String>(guardrailPolicyArns);
    }

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed 'AdministratorAccess' policy
     * is applied by default if this is not set.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGuardrailPolicyArns(java.util.Collection)} or {@link #withGuardrailPolicyArns(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param guardrailPolicyArns
     *        The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed 'AdministratorAccess'
     *        policy is applied by default if this is not set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlackChannelConfigurationRequest withGuardrailPolicyArns(String... guardrailPolicyArns) {
        if (this.guardrailPolicyArns == null) {
            setGuardrailPolicyArns(new java.util.ArrayList<String>(guardrailPolicyArns.length));
        }
        for (String ele : guardrailPolicyArns) {
            this.guardrailPolicyArns.add(ele);
        }
        return this;
    }

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed 'AdministratorAccess' policy
     * is applied by default if this is not set.
     * 
     * @param guardrailPolicyArns
     *        The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed 'AdministratorAccess'
     *        policy is applied by default if this is not set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlackChannelConfigurationRequest withGuardrailPolicyArns(java.util.Collection<String> guardrailPolicyArns) {
        setGuardrailPolicyArns(guardrailPolicyArns);
        return this;
    }

    /**
     * Enables use of a user role requirement in your chat configuration.
     * 
     * @param userAuthorizationRequired
     *        Enables use of a user role requirement in your chat configuration.
     */

    public void setUserAuthorizationRequired(Boolean userAuthorizationRequired) {
        this.userAuthorizationRequired = userAuthorizationRequired;
    }

    /**
     * Enables use of a user role requirement in your chat configuration.
     * 
     * @return Enables use of a user role requirement in your chat configuration.
     */

    public Boolean getUserAuthorizationRequired() {
        return this.userAuthorizationRequired;
    }

    /**
     * Enables use of a user role requirement in your chat configuration.
     * 
     * @param userAuthorizationRequired
     *        Enables use of a user role requirement in your chat configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSlackChannelConfigurationRequest withUserAuthorizationRequired(Boolean userAuthorizationRequired) {
        setUserAuthorizationRequired(userAuthorizationRequired);
        return this;
    }

    /**
     * Enables use of a user role requirement in your chat configuration.
     * 
     * @return Enables use of a user role requirement in your chat configuration.
     */

    public Boolean isUserAuthorizationRequired() {
        return this.userAuthorizationRequired;
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
        if (getSlackChannelId() != null)
            sb.append("SlackChannelId: ").append(getSlackChannelId()).append(",");
        if (getSlackChannelName() != null)
            sb.append("SlackChannelName: ").append(getSlackChannelName()).append(",");
        if (getSnsTopicArns() != null)
            sb.append("SnsTopicArns: ").append(getSnsTopicArns()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getLoggingLevel() != null)
            sb.append("LoggingLevel: ").append(getLoggingLevel()).append(",");
        if (getGuardrailPolicyArns() != null)
            sb.append("GuardrailPolicyArns: ").append(getGuardrailPolicyArns()).append(",");
        if (getUserAuthorizationRequired() != null)
            sb.append("UserAuthorizationRequired: ").append(getUserAuthorizationRequired());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSlackChannelConfigurationRequest == false)
            return false;
        UpdateSlackChannelConfigurationRequest other = (UpdateSlackChannelConfigurationRequest) obj;
        if (other.getChatConfigurationArn() == null ^ this.getChatConfigurationArn() == null)
            return false;
        if (other.getChatConfigurationArn() != null && other.getChatConfigurationArn().equals(this.getChatConfigurationArn()) == false)
            return false;
        if (other.getSlackChannelId() == null ^ this.getSlackChannelId() == null)
            return false;
        if (other.getSlackChannelId() != null && other.getSlackChannelId().equals(this.getSlackChannelId()) == false)
            return false;
        if (other.getSlackChannelName() == null ^ this.getSlackChannelName() == null)
            return false;
        if (other.getSlackChannelName() != null && other.getSlackChannelName().equals(this.getSlackChannelName()) == false)
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
        if (other.getGuardrailPolicyArns() == null ^ this.getGuardrailPolicyArns() == null)
            return false;
        if (other.getGuardrailPolicyArns() != null && other.getGuardrailPolicyArns().equals(this.getGuardrailPolicyArns()) == false)
            return false;
        if (other.getUserAuthorizationRequired() == null ^ this.getUserAuthorizationRequired() == null)
            return false;
        if (other.getUserAuthorizationRequired() != null && other.getUserAuthorizationRequired().equals(this.getUserAuthorizationRequired()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChatConfigurationArn() == null) ? 0 : getChatConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getSlackChannelId() == null) ? 0 : getSlackChannelId().hashCode());
        hashCode = prime * hashCode + ((getSlackChannelName() == null) ? 0 : getSlackChannelName().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArns() == null) ? 0 : getSnsTopicArns().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getLoggingLevel() == null) ? 0 : getLoggingLevel().hashCode());
        hashCode = prime * hashCode + ((getGuardrailPolicyArns() == null) ? 0 : getGuardrailPolicyArns().hashCode());
        hashCode = prime * hashCode + ((getUserAuthorizationRequired() == null) ? 0 : getUserAuthorizationRequired().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSlackChannelConfigurationRequest clone() {
        return (UpdateSlackChannelConfigurationRequest) super.clone();
    }

}
