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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/DescribeNotificationRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNotificationRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notification rule.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the notification rule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of the event types associated with the notification rule.
     * </p>
     */
    private java.util.List<EventTypeSummary> eventTypes;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource associated with the notification rule.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * A list of the SNS topics associated with the notification rule.
     * </p>
     */
    private java.util.List<TargetSummary> targets;
    /**
     * <p>
     * The level of detail included in the notifications for this resource. BASIC will include only the contents of the
     * event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS
     * CodeStar Notifications and/or the service for the resource for which the notification is created.
     * </p>
     */
    private String detailType;
    /**
     * <p>
     * The name or email alias of the person who created the notification rule.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The status of the notification rule. Valid statuses are on (sending notifications) or off (not sending
     * notifications).
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time the notification rule was created, in timestamp format.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The date and time the notification rule was most recently updated, in timestamp format.
     * </p>
     */
    private java.util.Date lastModifiedTimestamp;
    /**
     * <p>
     * The tags associated with the notification rule.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notification rule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the notification rule.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notification rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the notification rule.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notification rule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotificationRuleResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the notification rule.
     * </p>
     * 
     * @param name
     *        The name of the notification rule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the notification rule.
     * </p>
     * 
     * @return The name of the notification rule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the notification rule.
     * </p>
     * 
     * @param name
     *        The name of the notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotificationRuleResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of the event types associated with the notification rule.
     * </p>
     * 
     * @return A list of the event types associated with the notification rule.
     */

    public java.util.List<EventTypeSummary> getEventTypes() {
        return eventTypes;
    }

    /**
     * <p>
     * A list of the event types associated with the notification rule.
     * </p>
     * 
     * @param eventTypes
     *        A list of the event types associated with the notification rule.
     */

    public void setEventTypes(java.util.Collection<EventTypeSummary> eventTypes) {
        if (eventTypes == null) {
            this.eventTypes = null;
            return;
        }

        this.eventTypes = new java.util.ArrayList<EventTypeSummary>(eventTypes);
    }

    /**
     * <p>
     * A list of the event types associated with the notification rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventTypes(java.util.Collection)} or {@link #withEventTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventTypes
     *        A list of the event types associated with the notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotificationRuleResult withEventTypes(EventTypeSummary... eventTypes) {
        if (this.eventTypes == null) {
            setEventTypes(new java.util.ArrayList<EventTypeSummary>(eventTypes.length));
        }
        for (EventTypeSummary ele : eventTypes) {
            this.eventTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the event types associated with the notification rule.
     * </p>
     * 
     * @param eventTypes
     *        A list of the event types associated with the notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotificationRuleResult withEventTypes(java.util.Collection<EventTypeSummary> eventTypes) {
        setEventTypes(eventTypes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource associated with the notification rule.
     * </p>
     * 
     * @param resource
     *        The Amazon Resource Name (ARN) of the resource associated with the notification rule.
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource associated with the notification rule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource associated with the notification rule.
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource associated with the notification rule.
     * </p>
     * 
     * @param resource
     *        The Amazon Resource Name (ARN) of the resource associated with the notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotificationRuleResult withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * A list of the SNS topics associated with the notification rule.
     * </p>
     * 
     * @return A list of the SNS topics associated with the notification rule.
     */

    public java.util.List<TargetSummary> getTargets() {
        return targets;
    }

    /**
     * <p>
     * A list of the SNS topics associated with the notification rule.
     * </p>
     * 
     * @param targets
     *        A list of the SNS topics associated with the notification rule.
     */

    public void setTargets(java.util.Collection<TargetSummary> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<TargetSummary>(targets);
    }

    /**
     * <p>
     * A list of the SNS topics associated with the notification rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        A list of the SNS topics associated with the notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotificationRuleResult withTargets(TargetSummary... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<TargetSummary>(targets.length));
        }
        for (TargetSummary ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the SNS topics associated with the notification rule.
     * </p>
     * 
     * @param targets
     *        A list of the SNS topics associated with the notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotificationRuleResult withTargets(java.util.Collection<TargetSummary> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * <p>
     * The level of detail included in the notifications for this resource. BASIC will include only the contents of the
     * event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS
     * CodeStar Notifications and/or the service for the resource for which the notification is created.
     * </p>
     * 
     * @param detailType
     *        The level of detail included in the notifications for this resource. BASIC will include only the contents
     *        of the event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided
     *        by AWS CodeStar Notifications and/or the service for the resource for which the notification is created.
     * @see DetailType
     */

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    /**
     * <p>
     * The level of detail included in the notifications for this resource. BASIC will include only the contents of the
     * event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS
     * CodeStar Notifications and/or the service for the resource for which the notification is created.
     * </p>
     * 
     * @return The level of detail included in the notifications for this resource. BASIC will include only the contents
     *         of the event as it would appear in AWS CloudWatch. FULL will include any supplemental information
     *         provided by AWS CodeStar Notifications and/or the service for the resource for which the notification is
     *         created.
     * @see DetailType
     */

    public String getDetailType() {
        return this.detailType;
    }

    /**
     * <p>
     * The level of detail included in the notifications for this resource. BASIC will include only the contents of the
     * event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS
     * CodeStar Notifications and/or the service for the resource for which the notification is created.
     * </p>
     * 
     * @param detailType
     *        The level of detail included in the notifications for this resource. BASIC will include only the contents
     *        of the event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided
     *        by AWS CodeStar Notifications and/or the service for the resource for which the notification is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetailType
     */

    public DescribeNotificationRuleResult withDetailType(String detailType) {
        setDetailType(detailType);
        return this;
    }

    /**
     * <p>
     * The level of detail included in the notifications for this resource. BASIC will include only the contents of the
     * event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS
     * CodeStar Notifications and/or the service for the resource for which the notification is created.
     * </p>
     * 
     * @param detailType
     *        The level of detail included in the notifications for this resource. BASIC will include only the contents
     *        of the event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided
     *        by AWS CodeStar Notifications and/or the service for the resource for which the notification is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DetailType
     */

    public DescribeNotificationRuleResult withDetailType(DetailType detailType) {
        this.detailType = detailType.toString();
        return this;
    }

    /**
     * <p>
     * The name or email alias of the person who created the notification rule.
     * </p>
     * 
     * @param createdBy
     *        The name or email alias of the person who created the notification rule.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The name or email alias of the person who created the notification rule.
     * </p>
     * 
     * @return The name or email alias of the person who created the notification rule.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The name or email alias of the person who created the notification rule.
     * </p>
     * 
     * @param createdBy
     *        The name or email alias of the person who created the notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotificationRuleResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The status of the notification rule. Valid statuses are on (sending notifications) or off (not sending
     * notifications).
     * </p>
     * 
     * @param status
     *        The status of the notification rule. Valid statuses are on (sending notifications) or off (not sending
     *        notifications).
     * @see NotificationRuleStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the notification rule. Valid statuses are on (sending notifications) or off (not sending
     * notifications).
     * </p>
     * 
     * @return The status of the notification rule. Valid statuses are on (sending notifications) or off (not sending
     *         notifications).
     * @see NotificationRuleStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the notification rule. Valid statuses are on (sending notifications) or off (not sending
     * notifications).
     * </p>
     * 
     * @param status
     *        The status of the notification rule. Valid statuses are on (sending notifications) or off (not sending
     *        notifications).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationRuleStatus
     */

    public DescribeNotificationRuleResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the notification rule. Valid statuses are on (sending notifications) or off (not sending
     * notifications).
     * </p>
     * 
     * @param status
     *        The status of the notification rule. Valid statuses are on (sending notifications) or off (not sending
     *        notifications).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationRuleStatus
     */

    public DescribeNotificationRuleResult withStatus(NotificationRuleStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the notification rule was created, in timestamp format.
     * </p>
     * 
     * @param createdTimestamp
     *        The date and time the notification rule was created, in timestamp format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The date and time the notification rule was created, in timestamp format.
     * </p>
     * 
     * @return The date and time the notification rule was created, in timestamp format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The date and time the notification rule was created, in timestamp format.
     * </p>
     * 
     * @param createdTimestamp
     *        The date and time the notification rule was created, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotificationRuleResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The date and time the notification rule was most recently updated, in timestamp format.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The date and time the notification rule was most recently updated, in timestamp format.
     */

    public void setLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The date and time the notification rule was most recently updated, in timestamp format.
     * </p>
     * 
     * @return The date and time the notification rule was most recently updated, in timestamp format.
     */

    public java.util.Date getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /**
     * <p>
     * The date and time the notification rule was most recently updated, in timestamp format.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The date and time the notification rule was most recently updated, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotificationRuleResult withLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        setLastModifiedTimestamp(lastModifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * The tags associated with the notification rule.
     * </p>
     * 
     * @return The tags associated with the notification rule.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the notification rule.
     * </p>
     * 
     * @param tags
     *        The tags associated with the notification rule.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the notification rule.
     * </p>
     * 
     * @param tags
     *        The tags associated with the notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotificationRuleResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeNotificationRuleResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNotificationRuleResult addTagsEntry(String key, String value) {
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

    public DescribeNotificationRuleResult clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getEventTypes() != null)
            sb.append("EventTypes: ").append(getEventTypes()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getDetailType() != null)
            sb.append("DetailType: ").append(getDetailType()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getLastModifiedTimestamp() != null)
            sb.append("LastModifiedTimestamp: ").append(getLastModifiedTimestamp()).append(",");
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

        if (obj instanceof DescribeNotificationRuleResult == false)
            return false;
        DescribeNotificationRuleResult other = (DescribeNotificationRuleResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEventTypes() == null ^ this.getEventTypes() == null)
            return false;
        if (other.getEventTypes() != null && other.getEventTypes().equals(this.getEventTypes()) == false)
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
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null)
            return false;
        if (other.getLastModifiedTimestamp() != null && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEventTypes() == null) ? 0 : getEventTypes().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getDetailType() == null) ? 0 : getDetailType().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNotificationRuleResult clone() {
        try {
            return (DescribeNotificationRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
