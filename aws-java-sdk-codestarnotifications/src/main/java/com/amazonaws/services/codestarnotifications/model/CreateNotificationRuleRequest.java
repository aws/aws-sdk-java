/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codestarnotifications.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/CreateNotificationRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNotificationRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the notification rule. Notifictaion rule names must be unique in your AWS account.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of event types associated with this notification rule. For a list of allowed events, see
     * <a>EventTypeSummary</a>.
     * </p>
     */
    private java.util.List<String> eventTypeIds;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to associate with the notification rule. Supported resources
     * include pipelines in AWS CodePipeline, repositories in AWS CodeCommit, and build projects in AWS CodeBuild.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) of SNS topics to associate with the notification rule.
     * </p>
     */
    private java.util.List<Target> targets;
    /**
     * <p>
     * The level of detail to include in the notifications for this resource. BASIC will include only the contents of
     * the event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS
     * CodeStar Notifications and/or the service for the resource for which the notification is created.
     * </p>
     */
    private String detailType;
    /**
     * <p>
     * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request with the same parameters is received and a token is included, the
     * request returns information about the initial request that used that token.
     * </p>
     * <note>
     * <p>
     * The AWS SDKs prepopulate client request tokens. If you are using an AWS SDK, an idempotency token is created for
     * you.
     * </p>
     * </note>
     */
    private String clientRequestToken;
    /**
     * <p>
     * A list of tags to apply to this notification rule. Key names cannot start with "aws".
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The status of the notification rule. The default value is ENABLED. If the status is set to DISABLED,
     * notifications aren't sent for the notification rule.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The name for the notification rule. Notifictaion rule names must be unique in your AWS account.
     * </p>
     * 
     * @param name
     *        The name for the notification rule. Notifictaion rule names must be unique in your AWS account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the notification rule. Notifictaion rule names must be unique in your AWS account.
     * </p>
     * 
     * @return The name for the notification rule. Notifictaion rule names must be unique in your AWS account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the notification rule. Notifictaion rule names must be unique in your AWS account.
     * </p>
     * 
     * @param name
     *        The name for the notification rule. Notifictaion rule names must be unique in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationRuleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of event types associated with this notification rule. For a list of allowed events, see
     * <a>EventTypeSummary</a>.
     * </p>
     * 
     * @return A list of event types associated with this notification rule. For a list of allowed events, see
     *         <a>EventTypeSummary</a>.
     */

    public java.util.List<String> getEventTypeIds() {
        return eventTypeIds;
    }

    /**
     * <p>
     * A list of event types associated with this notification rule. For a list of allowed events, see
     * <a>EventTypeSummary</a>.
     * </p>
     * 
     * @param eventTypeIds
     *        A list of event types associated with this notification rule. For a list of allowed events, see
     *        <a>EventTypeSummary</a>.
     */

    public void setEventTypeIds(java.util.Collection<String> eventTypeIds) {
        if (eventTypeIds == null) {
            this.eventTypeIds = null;
            return;
        }

        this.eventTypeIds = new java.util.ArrayList<String>(eventTypeIds);
    }

    /**
     * <p>
     * A list of event types associated with this notification rule. For a list of allowed events, see
     * <a>EventTypeSummary</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventTypeIds(java.util.Collection)} or {@link #withEventTypeIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventTypeIds
     *        A list of event types associated with this notification rule. For a list of allowed events, see
     *        <a>EventTypeSummary</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationRuleRequest withEventTypeIds(String... eventTypeIds) {
        if (this.eventTypeIds == null) {
            setEventTypeIds(new java.util.ArrayList<String>(eventTypeIds.length));
        }
        for (String ele : eventTypeIds) {
            this.eventTypeIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of event types associated with this notification rule. For a list of allowed events, see
     * <a>EventTypeSummary</a>.
     * </p>
     * 
     * @param eventTypeIds
     *        A list of event types associated with this notification rule. For a list of allowed events, see
     *        <a>EventTypeSummary</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationRuleRequest withEventTypeIds(java.util.Collection<String> eventTypeIds) {
        setEventTypeIds(eventTypeIds);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to associate with the notification rule. Supported resources
     * include pipelines in AWS CodePipeline, repositories in AWS CodeCommit, and build projects in AWS CodeBuild.
     * </p>
     * 
     * @param resource
     *        The Amazon Resource Name (ARN) of the resource to associate with the notification rule. Supported
     *        resources include pipelines in AWS CodePipeline, repositories in AWS CodeCommit, and build projects in AWS
     *        CodeBuild.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to associate with the notification rule. Supported resources
     * include pipelines in AWS CodePipeline, repositories in AWS CodeCommit, and build projects in AWS CodeBuild.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource to associate with the notification rule. Supported
     *         resources include pipelines in AWS CodePipeline, repositories in AWS CodeCommit, and build projects in
     *         AWS CodeBuild.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to associate with the notification rule. Supported resources
     * include pipelines in AWS CodePipeline, repositories in AWS CodeCommit, and build projects in AWS CodeBuild.
     * </p>
     * 
     * @param resource
     *        The Amazon Resource Name (ARN) of the resource to associate with the notification rule. Supported
     *        resources include pipelines in AWS CodePipeline, repositories in AWS CodeCommit, and build projects in AWS
     *        CodeBuild.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationRuleRequest withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) of SNS topics to associate with the notification rule.
     * </p>
     * 
     * @return A list of Amazon Resource Names (ARNs) of SNS topics to associate with the notification rule.
     */

    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) of SNS topics to associate with the notification rule.
     * </p>
     * 
     * @param targets
     *        A list of Amazon Resource Names (ARNs) of SNS topics to associate with the notification rule.
     */

    public void setTargets(java.util.Collection<Target> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<Target>(targets);
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) of SNS topics to associate with the notification rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        A list of Amazon Resource Names (ARNs) of SNS topics to associate with the notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationRuleRequest withTargets(Target... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<Target>(targets.length));
        }
        for (Target ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon Resource Names (ARNs) of SNS topics to associate with the notification rule.
     * </p>
     * 
     * @param targets
     *        A list of Amazon Resource Names (ARNs) of SNS topics to associate with the notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationRuleRequest withTargets(java.util.Collection<Target> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The level of detail to include in the notifications for this resource. BASIC will include only the contents of
     * the event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS
     * CodeStar Notifications and/or the service for the resource for which the notification is created.
     * </p>
     * 
     * @param detailType
     *        The level of detail to include in the notifications for this resource. BASIC will include only the
     *        contents of the event as it would appear in AWS CloudWatch. FULL will include any supplemental information
     *        provided by AWS CodeStar Notifications and/or the service for the resource for which the notification is
     *        created.
     * @see DetailType
     */

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    /**
     * <p>
     * The level of detail to include in the notifications for this resource. BASIC will include only the contents of
     * the event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS
     * CodeStar Notifications and/or the service for the resource for which the notification is created.
     * </p>
     * 
     * @return The level of detail to include in the notifications for this resource. BASIC will include only the
     *         contents of the event as it would appear in AWS CloudWatch. FULL will include any supplemental
     *         information provided by AWS CodeStar Notifications and/or the service for the resource for which the
     *         notification is created.
     * @see DetailType
     */

    public String getDetailType() {
        return this.detailType;
    }

    /**
     * <p>
     * The level of detail to include in the notifications for this resource. BASIC will include only the contents of
     * the event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS
     * CodeStar Notifications and/or the service for the resource for which the notification is created.
     * </p>
     * 
     * @param detailType
     *        The level of detail to include in the notifications for this resource. BASIC will include only the
     *        contents of the event as it would appear in AWS CloudWatch. FULL will include any supplemental information
     *        provided by AWS CodeStar Notifications and/or the service for the resource for which the notification is
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetailType
     */

    public CreateNotificationRuleRequest withDetailType(String detailType) {
        setDetailType(detailType);
        return this;
    }

    /**
     * <p>
     * The level of detail to include in the notifications for this resource. BASIC will include only the contents of
     * the event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS
     * CodeStar Notifications and/or the service for the resource for which the notification is created.
     * </p>
     * 
     * @param detailType
     *        The level of detail to include in the notifications for this resource. BASIC will include only the
     *        contents of the event as it would appear in AWS CloudWatch. FULL will include any supplemental information
     *        provided by AWS CodeStar Notifications and/or the service for the resource for which the notification is
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetailType
     */

    public CreateNotificationRuleRequest withDetailType(DetailType detailType) {
        this.detailType = detailType.toString();
        return this;
    }

    /**
     * <p>
     * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request with the same parameters is received and a token is included, the
     * request returns information about the initial request that used that token.
     * </p>
     * <note>
     * <p>
     * The AWS SDKs prepopulate client request tokens. If you are using an AWS SDK, an idempotency token is created for
     * you.
     * </p>
     * </note>
     * 
     * @param clientRequestToken
     *        A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot
     *        be repeated with a changed parameter. If a request with the same parameters is received and a token is
     *        included, the request returns information about the initial request that used that token.</p> <note>
     *        <p>
     *        The AWS SDKs prepopulate client request tokens. If you are using an AWS SDK, an idempotency token is
     *        created for you.
     *        </p>
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request with the same parameters is received and a token is included, the
     * request returns information about the initial request that used that token.
     * </p>
     * <note>
     * <p>
     * The AWS SDKs prepopulate client request tokens. If you are using an AWS SDK, an idempotency token is created for
     * you.
     * </p>
     * </note>
     * 
     * @return A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot
     *         be repeated with a changed parameter. If a request with the same parameters is received and a token is
     *         included, the request returns information about the initial request that used that token.</p> <note>
     *         <p>
     *         The AWS SDKs prepopulate client request tokens. If you are using an AWS SDK, an idempotency token is
     *         created for you.
     *         </p>
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be
     * repeated with a changed parameter. If a request with the same parameters is received and a token is included, the
     * request returns information about the initial request that used that token.
     * </p>
     * <note>
     * <p>
     * The AWS SDKs prepopulate client request tokens. If you are using an AWS SDK, an idempotency token is created for
     * you.
     * </p>
     * </note>
     * 
     * @param clientRequestToken
     *        A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot
     *        be repeated with a changed parameter. If a request with the same parameters is received and a token is
     *        included, the request returns information about the initial request that used that token.</p> <note>
     *        <p>
     *        The AWS SDKs prepopulate client request tokens. If you are using an AWS SDK, an idempotency token is
     *        created for you.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationRuleRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * A list of tags to apply to this notification rule. Key names cannot start with "aws".
     * </p>
     * 
     * @return A list of tags to apply to this notification rule. Key names cannot start with "aws".
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to apply to this notification rule. Key names cannot start with "aws".
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to this notification rule. Key names cannot start with "aws".
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags to apply to this notification rule. Key names cannot start with "aws".
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to this notification rule. Key names cannot start with "aws".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationRuleRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateNotificationRuleRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationRuleRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNotificationRuleRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The status of the notification rule. The default value is ENABLED. If the status is set to DISABLED,
     * notifications aren't sent for the notification rule.
     * </p>
     * 
     * @param status
     *        The status of the notification rule. The default value is ENABLED. If the status is set to DISABLED,
     *        notifications aren't sent for the notification rule.
     * @see NotificationRuleStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the notification rule. The default value is ENABLED. If the status is set to DISABLED,
     * notifications aren't sent for the notification rule.
     * </p>
     * 
     * @return The status of the notification rule. The default value is ENABLED. If the status is set to DISABLED,
     *         notifications aren't sent for the notification rule.
     * @see NotificationRuleStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the notification rule. The default value is ENABLED. If the status is set to DISABLED,
     * notifications aren't sent for the notification rule.
     * </p>
     * 
     * @param status
     *        The status of the notification rule. The default value is ENABLED. If the status is set to DISABLED,
     *        notifications aren't sent for the notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationRuleStatus
     */

    public CreateNotificationRuleRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the notification rule. The default value is ENABLED. If the status is set to DISABLED,
     * notifications aren't sent for the notification rule.
     * </p>
     * 
     * @param status
     *        The status of the notification rule. The default value is ENABLED. If the status is set to DISABLED,
     *        notifications aren't sent for the notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationRuleStatus
     */

    public CreateNotificationRuleRequest withStatus(NotificationRuleStatus status) {
        this.status = status.toString();
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
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getEventTypeIds() != null)
            sb.append("EventTypeIds: ").append(getEventTypeIds()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getDetailType() != null)
            sb.append("DetailType: ").append(getDetailType()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNotificationRuleRequest == false)
            return false;
        CreateNotificationRuleRequest other = (CreateNotificationRuleRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEventTypeIds() == null ^ this.getEventTypeIds() == null)
            return false;
        if (other.getEventTypeIds() != null && other.getEventTypeIds().equals(this.getEventTypeIds()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getDetailType() == null ^ this.getDetailType() == null)
            return false;
        if (other.getDetailType() != null && other.getDetailType().equals(this.getDetailType()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEventTypeIds() == null) ? 0 : getEventTypeIds().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getDetailType() == null) ? 0 : getDetailType().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CreateNotificationRuleRequest clone() {
        return (CreateNotificationRuleRequest) super.clone();
    }

}
