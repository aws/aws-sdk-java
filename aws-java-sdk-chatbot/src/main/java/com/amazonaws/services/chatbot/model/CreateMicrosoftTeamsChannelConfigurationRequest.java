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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chatbot-2017-10-11/CreateMicrosoftTeamsChannelConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMicrosoftTeamsChannelConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the Microsoft Teams channel. */
    private String channelId;
    /** The name of the Microsoft Teams channel. */
    private String channelName;
    /**
     * The ID of the Microsoft Team authorized with AWS Chatbot. To get the team ID, you must perform the initial
     * authorization flow with Microsoft Teams in the AWS Chatbot console. Then you can copy and paste the team ID from
     * the console. For more details, see steps 1-4 in Get started with Microsoft Teams in the AWS Chatbot Administrator
     * Guide.
     */
    private String teamId;
    /** The name of the Microsoft Teams Team. */
    private String teamName;
    /** The ID of the Microsoft Teams tenant. */
    private String tenantId;
    /** The ARNs of the SNS topics that deliver notifications to AWS Chatbot. */
    private java.util.List<String> snsTopicArns;
    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot. This is a user-defined role that AWS
     * Chatbot will assume. This is not the service-linked role. For more information, see IAM Policies for AWS Chatbot.
     */
    private String iamRoleArn;
    /** The name of the configuration. */
    private String configurationName;
    /** Logging levels include ERROR, INFO, or NONE. */
    private String loggingLevel;
    /**
     * The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed 'AdministratorAccess' policy
     * is applied by default if this is not set.
     */
    private java.util.List<String> guardrailPolicyArns;
    /** Enables use of a user role requirement in your chat configuration. */
    private Boolean userAuthorizationRequired;
    /** A list of tags to apply to the configuration. */
    private java.util.List<Tag> tags;

    /**
     * The ID of the Microsoft Teams channel.
     * 
     * @param channelId
     *        The ID of the Microsoft Teams channel.
     */

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * The ID of the Microsoft Teams channel.
     * 
     * @return The ID of the Microsoft Teams channel.
     */

    public String getChannelId() {
        return this.channelId;
    }

    /**
     * The ID of the Microsoft Teams channel.
     * 
     * @param channelId
     *        The ID of the Microsoft Teams channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMicrosoftTeamsChannelConfigurationRequest withChannelId(String channelId) {
        setChannelId(channelId);
        return this;
    }

    /**
     * The name of the Microsoft Teams channel.
     * 
     * @param channelName
     *        The name of the Microsoft Teams channel.
     */

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * The name of the Microsoft Teams channel.
     * 
     * @return The name of the Microsoft Teams channel.
     */

    public String getChannelName() {
        return this.channelName;
    }

    /**
     * The name of the Microsoft Teams channel.
     * 
     * @param channelName
     *        The name of the Microsoft Teams channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMicrosoftTeamsChannelConfigurationRequest withChannelName(String channelName) {
        setChannelName(channelName);
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

    public CreateMicrosoftTeamsChannelConfigurationRequest withTeamId(String teamId) {
        setTeamId(teamId);
        return this;
    }

    /**
     * The name of the Microsoft Teams Team.
     * 
     * @param teamName
     *        The name of the Microsoft Teams Team.
     */

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * The name of the Microsoft Teams Team.
     * 
     * @return The name of the Microsoft Teams Team.
     */

    public String getTeamName() {
        return this.teamName;
    }

    /**
     * The name of the Microsoft Teams Team.
     * 
     * @param teamName
     *        The name of the Microsoft Teams Team.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMicrosoftTeamsChannelConfigurationRequest withTeamName(String teamName) {
        setTeamName(teamName);
        return this;
    }

    /**
     * The ID of the Microsoft Teams tenant.
     * 
     * @param tenantId
     *        The ID of the Microsoft Teams tenant.
     */

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * The ID of the Microsoft Teams tenant.
     * 
     * @return The ID of the Microsoft Teams tenant.
     */

    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * The ID of the Microsoft Teams tenant.
     * 
     * @param tenantId
     *        The ID of the Microsoft Teams tenant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMicrosoftTeamsChannelConfigurationRequest withTenantId(String tenantId) {
        setTenantId(tenantId);
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

    public CreateMicrosoftTeamsChannelConfigurationRequest withSnsTopicArns(String... snsTopicArns) {
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

    public CreateMicrosoftTeamsChannelConfigurationRequest withSnsTopicArns(java.util.Collection<String> snsTopicArns) {
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

    public CreateMicrosoftTeamsChannelConfigurationRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * The name of the configuration.
     * 
     * @param configurationName
     *        The name of the configuration.
     */

    public void setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
    }

    /**
     * The name of the configuration.
     * 
     * @return The name of the configuration.
     */

    public String getConfigurationName() {
        return this.configurationName;
    }

    /**
     * The name of the configuration.
     * 
     * @param configurationName
     *        The name of the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMicrosoftTeamsChannelConfigurationRequest withConfigurationName(String configurationName) {
        setConfigurationName(configurationName);
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

    public CreateMicrosoftTeamsChannelConfigurationRequest withLoggingLevel(String loggingLevel) {
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

    public CreateMicrosoftTeamsChannelConfigurationRequest withGuardrailPolicyArns(String... guardrailPolicyArns) {
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

    public CreateMicrosoftTeamsChannelConfigurationRequest withGuardrailPolicyArns(java.util.Collection<String> guardrailPolicyArns) {
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

    public CreateMicrosoftTeamsChannelConfigurationRequest withUserAuthorizationRequired(Boolean userAuthorizationRequired) {
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
     * A list of tags to apply to the configuration.
     * 
     * @return A list of tags to apply to the configuration.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * A list of tags to apply to the configuration.
     * 
     * @param tags
     *        A list of tags to apply to the configuration.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * A list of tags to apply to the configuration.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMicrosoftTeamsChannelConfigurationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * A list of tags to apply to the configuration.
     * 
     * @param tags
     *        A list of tags to apply to the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMicrosoftTeamsChannelConfigurationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getChannelId() != null)
            sb.append("ChannelId: ").append(getChannelId()).append(",");
        if (getChannelName() != null)
            sb.append("ChannelName: ").append(getChannelName()).append(",");
        if (getTeamId() != null)
            sb.append("TeamId: ").append(getTeamId()).append(",");
        if (getTeamName() != null)
            sb.append("TeamName: ").append(getTeamName()).append(",");
        if (getTenantId() != null)
            sb.append("TenantId: ").append(getTenantId()).append(",");
        if (getSnsTopicArns() != null)
            sb.append("SnsTopicArns: ").append(getSnsTopicArns()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getConfigurationName() != null)
            sb.append("ConfigurationName: ").append(getConfigurationName()).append(",");
        if (getLoggingLevel() != null)
            sb.append("LoggingLevel: ").append(getLoggingLevel()).append(",");
        if (getGuardrailPolicyArns() != null)
            sb.append("GuardrailPolicyArns: ").append(getGuardrailPolicyArns()).append(",");
        if (getUserAuthorizationRequired() != null)
            sb.append("UserAuthorizationRequired: ").append(getUserAuthorizationRequired()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMicrosoftTeamsChannelConfigurationRequest == false)
            return false;
        CreateMicrosoftTeamsChannelConfigurationRequest other = (CreateMicrosoftTeamsChannelConfigurationRequest) obj;
        if (other.getChannelId() == null ^ this.getChannelId() == null)
            return false;
        if (other.getChannelId() != null && other.getChannelId().equals(this.getChannelId()) == false)
            return false;
        if (other.getChannelName() == null ^ this.getChannelName() == null)
            return false;
        if (other.getChannelName() != null && other.getChannelName().equals(this.getChannelName()) == false)
            return false;
        if (other.getTeamId() == null ^ this.getTeamId() == null)
            return false;
        if (other.getTeamId() != null && other.getTeamId().equals(this.getTeamId()) == false)
            return false;
        if (other.getTeamName() == null ^ this.getTeamName() == null)
            return false;
        if (other.getTeamName() != null && other.getTeamName().equals(this.getTeamName()) == false)
            return false;
        if (other.getTenantId() == null ^ this.getTenantId() == null)
            return false;
        if (other.getTenantId() != null && other.getTenantId().equals(this.getTenantId()) == false)
            return false;
        if (other.getSnsTopicArns() == null ^ this.getSnsTopicArns() == null)
            return false;
        if (other.getSnsTopicArns() != null && other.getSnsTopicArns().equals(this.getSnsTopicArns()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getConfigurationName() == null ^ this.getConfigurationName() == null)
            return false;
        if (other.getConfigurationName() != null && other.getConfigurationName().equals(this.getConfigurationName()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        hashCode = prime * hashCode + ((getChannelName() == null) ? 0 : getChannelName().hashCode());
        hashCode = prime * hashCode + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        hashCode = prime * hashCode + ((getTeamName() == null) ? 0 : getTeamName().hashCode());
        hashCode = prime * hashCode + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArns() == null) ? 0 : getSnsTopicArns().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getConfigurationName() == null) ? 0 : getConfigurationName().hashCode());
        hashCode = prime * hashCode + ((getLoggingLevel() == null) ? 0 : getLoggingLevel().hashCode());
        hashCode = prime * hashCode + ((getGuardrailPolicyArns() == null) ? 0 : getGuardrailPolicyArns().hashCode());
        hashCode = prime * hashCode + ((getUserAuthorizationRequired() == null) ? 0 : getUserAuthorizationRequired().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMicrosoftTeamsChannelConfigurationRequest clone() {
        return (CreateMicrosoftTeamsChannelConfigurationRequest) super.clone();
    }

}
