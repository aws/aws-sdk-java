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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-notifications-2019-10-15/UpdateNotificationRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNotificationRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The status of the notification rule. Valid statuses include enabled (sending notifications) or disabled (not
     * sending notifications).
     * </p>
     */
    private String status;
    /**
     * <p>
     * A list of event types associated with this notification rule.
     * </p>
     */
    private java.util.List<String> eventTypeIds;
    /**
     * <p>
     * The address and type of the targets to receive notifications from this notification rule.
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

    public UpdateNotificationRuleRequest withArn(String arn) {
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

    public UpdateNotificationRuleRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the notification rule. Valid statuses include enabled (sending notifications) or disabled (not
     * sending notifications).
     * </p>
     * 
     * @param status
     *        The status of the notification rule. Valid statuses include enabled (sending notifications) or disabled
     *        (not sending notifications).
     * @see NotificationRuleStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the notification rule. Valid statuses include enabled (sending notifications) or disabled (not
     * sending notifications).
     * </p>
     * 
     * @return The status of the notification rule. Valid statuses include enabled (sending notifications) or disabled
     *         (not sending notifications).
     * @see NotificationRuleStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the notification rule. Valid statuses include enabled (sending notifications) or disabled (not
     * sending notifications).
     * </p>
     * 
     * @param status
     *        The status of the notification rule. Valid statuses include enabled (sending notifications) or disabled
     *        (not sending notifications).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationRuleStatus
     */

    public UpdateNotificationRuleRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the notification rule. Valid statuses include enabled (sending notifications) or disabled (not
     * sending notifications).
     * </p>
     * 
     * @param status
     *        The status of the notification rule. Valid statuses include enabled (sending notifications) or disabled
     *        (not sending notifications).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationRuleStatus
     */

    public UpdateNotificationRuleRequest withStatus(NotificationRuleStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A list of event types associated with this notification rule.
     * </p>
     * 
     * @return A list of event types associated with this notification rule.
     */

    public java.util.List<String> getEventTypeIds() {
        return eventTypeIds;
    }

    /**
     * <p>
     * A list of event types associated with this notification rule.
     * </p>
     * 
     * @param eventTypeIds
     *        A list of event types associated with this notification rule.
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
     * A list of event types associated with this notification rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventTypeIds(java.util.Collection)} or {@link #withEventTypeIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventTypeIds
     *        A list of event types associated with this notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationRuleRequest withEventTypeIds(String... eventTypeIds) {
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
     * A list of event types associated with this notification rule.
     * </p>
     * 
     * @param eventTypeIds
     *        A list of event types associated with this notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationRuleRequest withEventTypeIds(java.util.Collection<String> eventTypeIds) {
        setEventTypeIds(eventTypeIds);
        return this;
    }

    /**
     * <p>
     * The address and type of the targets to receive notifications from this notification rule.
     * </p>
     * 
     * @return The address and type of the targets to receive notifications from this notification rule.
     */

    public java.util.List<Target> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The address and type of the targets to receive notifications from this notification rule.
     * </p>
     * 
     * @param targets
     *        The address and type of the targets to receive notifications from this notification rule.
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
     * The address and type of the targets to receive notifications from this notification rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The address and type of the targets to receive notifications from this notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationRuleRequest withTargets(Target... targets) {
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
     * The address and type of the targets to receive notifications from this notification rule.
     * </p>
     * 
     * @param targets
     *        The address and type of the targets to receive notifications from this notification rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationRuleRequest withTargets(java.util.Collection<Target> targets) {
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

    public UpdateNotificationRuleRequest withDetailType(String detailType) {
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

    public UpdateNotificationRuleRequest withDetailType(DetailType detailType) {
        this.detailType = detailType.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEventTypeIds() != null)
            sb.append("EventTypeIds: ").append(getEventTypeIds()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
        if (getDetailType() != null)
            sb.append("DetailType: ").append(getDetailType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNotificationRuleRequest == false)
            return false;
        UpdateNotificationRuleRequest other = (UpdateNotificationRuleRequest) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEventTypeIds() == null ^ this.getEventTypeIds() == null)
            return false;
        if (other.getEventTypeIds() != null && other.getEventTypeIds().equals(this.getEventTypeIds()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        if (other.getDetailType() == null ^ this.getDetailType() == null)
            return false;
        if (other.getDetailType() != null && other.getDetailType().equals(this.getDetailType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEventTypeIds() == null) ? 0 : getEventTypeIds().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getDetailType() == null) ? 0 : getDetailType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNotificationRuleRequest clone() {
        return (UpdateNotificationRuleRequest) super.clone();
    }

}
