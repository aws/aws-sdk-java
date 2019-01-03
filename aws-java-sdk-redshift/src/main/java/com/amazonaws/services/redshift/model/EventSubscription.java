/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes event subscriptions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/EventSubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventSubscription implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS customer account associated with the Amazon Redshift event notification subscription.
     * </p>
     */
    private String customerAwsId;
    /**
     * <p>
     * The name of the Amazon Redshift event notification subscription.
     * </p>
     */
    private String custSubscriptionId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used by the event notification subscription.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The status of the Amazon Redshift event notification subscription.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can be one of the following: active | no-permission | topic-not-exist
     * </p>
     * </li>
     * <li>
     * <p>
     * The status "no-permission" indicates that Amazon Redshift no longer has permission to post to the Amazon SNS
     * topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was created.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The date and time the Amazon Redshift event notification subscription was created.
     * </p>
     */
    private java.util.Date subscriptionCreationTime;
    /**
     * <p>
     * The source type of the events returned the Amazon Redshift event notification, such as cluster, or
     * cluster-snapshot.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * A list of the sources that publish events to the Amazon Redshift event notification subscription.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> sourceIdsList;
    /**
     * <p>
     * The list of Amazon Redshift event categories specified in the event notification subscription.
     * </p>
     * <p>
     * Values: Configuration, Management, Monitoring, Security
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> eventCategoriesList;
    /**
     * <p>
     * The event severity specified in the Amazon Redshift event notification subscription.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     */
    private String severity;
    /**
     * <p>
     * A boolean value indicating whether the subscription is enabled; <code>true</code> indicates that the subscription
     * is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The list of tags for the event subscription.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The AWS customer account associated with the Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param customerAwsId
     *        The AWS customer account associated with the Amazon Redshift event notification subscription.
     */

    public void setCustomerAwsId(String customerAwsId) {
        this.customerAwsId = customerAwsId;
    }

    /**
     * <p>
     * The AWS customer account associated with the Amazon Redshift event notification subscription.
     * </p>
     * 
     * @return The AWS customer account associated with the Amazon Redshift event notification subscription.
     */

    public String getCustomerAwsId() {
        return this.customerAwsId;
    }

    /**
     * <p>
     * The AWS customer account associated with the Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param customerAwsId
     *        The AWS customer account associated with the Amazon Redshift event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withCustomerAwsId(String customerAwsId) {
        setCustomerAwsId(customerAwsId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param custSubscriptionId
     *        The name of the Amazon Redshift event notification subscription.
     */

    public void setCustSubscriptionId(String custSubscriptionId) {
        this.custSubscriptionId = custSubscriptionId;
    }

    /**
     * <p>
     * The name of the Amazon Redshift event notification subscription.
     * </p>
     * 
     * @return The name of the Amazon Redshift event notification subscription.
     */

    public String getCustSubscriptionId() {
        return this.custSubscriptionId;
    }

    /**
     * <p>
     * The name of the Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param custSubscriptionId
     *        The name of the Amazon Redshift event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withCustSubscriptionId(String custSubscriptionId) {
        setCustSubscriptionId(custSubscriptionId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used by the event notification subscription.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic used by the event notification subscription.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used by the event notification subscription.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon SNS topic used by the event notification subscription.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon SNS topic used by the event notification subscription.
     * </p>
     * 
     * @param snsTopicArn
     *        The Amazon Resource Name (ARN) of the Amazon SNS topic used by the event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon Redshift event notification subscription.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can be one of the following: active | no-permission | topic-not-exist
     * </p>
     * </li>
     * <li>
     * <p>
     * The status "no-permission" indicates that Amazon Redshift no longer has permission to post to the Amazon SNS
     * topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the Amazon Redshift event notification subscription.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can be one of the following: active | no-permission | topic-not-exist
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The status "no-permission" indicates that Amazon Redshift no longer has permission to post to the Amazon
     *        SNS topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was
     *        created.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Amazon Redshift event notification subscription.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can be one of the following: active | no-permission | topic-not-exist
     * </p>
     * </li>
     * <li>
     * <p>
     * The status "no-permission" indicates that Amazon Redshift no longer has permission to post to the Amazon SNS
     * topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the Amazon Redshift event notification subscription.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can be one of the following: active | no-permission | topic-not-exist
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The status "no-permission" indicates that Amazon Redshift no longer has permission to post to the Amazon
     *         SNS topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was
     *         created.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Amazon Redshift event notification subscription.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can be one of the following: active | no-permission | topic-not-exist
     * </p>
     * </li>
     * <li>
     * <p>
     * The status "no-permission" indicates that Amazon Redshift no longer has permission to post to the Amazon SNS
     * topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the Amazon Redshift event notification subscription.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can be one of the following: active | no-permission | topic-not-exist
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The status "no-permission" indicates that Amazon Redshift no longer has permission to post to the Amazon
     *        SNS topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was
     *        created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The date and time the Amazon Redshift event notification subscription was created.
     * </p>
     * 
     * @param subscriptionCreationTime
     *        The date and time the Amazon Redshift event notification subscription was created.
     */

    public void setSubscriptionCreationTime(java.util.Date subscriptionCreationTime) {
        this.subscriptionCreationTime = subscriptionCreationTime;
    }

    /**
     * <p>
     * The date and time the Amazon Redshift event notification subscription was created.
     * </p>
     * 
     * @return The date and time the Amazon Redshift event notification subscription was created.
     */

    public java.util.Date getSubscriptionCreationTime() {
        return this.subscriptionCreationTime;
    }

    /**
     * <p>
     * The date and time the Amazon Redshift event notification subscription was created.
     * </p>
     * 
     * @param subscriptionCreationTime
     *        The date and time the Amazon Redshift event notification subscription was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withSubscriptionCreationTime(java.util.Date subscriptionCreationTime) {
        setSubscriptionCreationTime(subscriptionCreationTime);
        return this;
    }

    /**
     * <p>
     * The source type of the events returned the Amazon Redshift event notification, such as cluster, or
     * cluster-snapshot.
     * </p>
     * 
     * @param sourceType
     *        The source type of the events returned the Amazon Redshift event notification, such as cluster, or
     *        cluster-snapshot.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type of the events returned the Amazon Redshift event notification, such as cluster, or
     * cluster-snapshot.
     * </p>
     * 
     * @return The source type of the events returned the Amazon Redshift event notification, such as cluster, or
     *         cluster-snapshot.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The source type of the events returned the Amazon Redshift event notification, such as cluster, or
     * cluster-snapshot.
     * </p>
     * 
     * @param sourceType
     *        The source type of the events returned the Amazon Redshift event notification, such as cluster, or
     *        cluster-snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * A list of the sources that publish events to the Amazon Redshift event notification subscription.
     * </p>
     * 
     * @return A list of the sources that publish events to the Amazon Redshift event notification subscription.
     */

    public java.util.List<String> getSourceIdsList() {
        if (sourceIdsList == null) {
            sourceIdsList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return sourceIdsList;
    }

    /**
     * <p>
     * A list of the sources that publish events to the Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param sourceIdsList
     *        A list of the sources that publish events to the Amazon Redshift event notification subscription.
     */

    public void setSourceIdsList(java.util.Collection<String> sourceIdsList) {
        if (sourceIdsList == null) {
            this.sourceIdsList = null;
            return;
        }

        this.sourceIdsList = new com.amazonaws.internal.SdkInternalList<String>(sourceIdsList);
    }

    /**
     * <p>
     * A list of the sources that publish events to the Amazon Redshift event notification subscription.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceIdsList(java.util.Collection)} or {@link #withSourceIdsList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceIdsList
     *        A list of the sources that publish events to the Amazon Redshift event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withSourceIdsList(String... sourceIdsList) {
        if (this.sourceIdsList == null) {
            setSourceIdsList(new com.amazonaws.internal.SdkInternalList<String>(sourceIdsList.length));
        }
        for (String ele : sourceIdsList) {
            this.sourceIdsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the sources that publish events to the Amazon Redshift event notification subscription.
     * </p>
     * 
     * @param sourceIdsList
     *        A list of the sources that publish events to the Amazon Redshift event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withSourceIdsList(java.util.Collection<String> sourceIdsList) {
        setSourceIdsList(sourceIdsList);
        return this;
    }

    /**
     * <p>
     * The list of Amazon Redshift event categories specified in the event notification subscription.
     * </p>
     * <p>
     * Values: Configuration, Management, Monitoring, Security
     * </p>
     * 
     * @return The list of Amazon Redshift event categories specified in the event notification subscription.</p>
     *         <p>
     *         Values: Configuration, Management, Monitoring, Security
     */

    public java.util.List<String> getEventCategoriesList() {
        if (eventCategoriesList == null) {
            eventCategoriesList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return eventCategoriesList;
    }

    /**
     * <p>
     * The list of Amazon Redshift event categories specified in the event notification subscription.
     * </p>
     * <p>
     * Values: Configuration, Management, Monitoring, Security
     * </p>
     * 
     * @param eventCategoriesList
     *        The list of Amazon Redshift event categories specified in the event notification subscription.</p>
     *        <p>
     *        Values: Configuration, Management, Monitoring, Security
     */

    public void setEventCategoriesList(java.util.Collection<String> eventCategoriesList) {
        if (eventCategoriesList == null) {
            this.eventCategoriesList = null;
            return;
        }

        this.eventCategoriesList = new com.amazonaws.internal.SdkInternalList<String>(eventCategoriesList);
    }

    /**
     * <p>
     * The list of Amazon Redshift event categories specified in the event notification subscription.
     * </p>
     * <p>
     * Values: Configuration, Management, Monitoring, Security
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategoriesList(java.util.Collection)} or {@link #withEventCategoriesList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param eventCategoriesList
     *        The list of Amazon Redshift event categories specified in the event notification subscription.</p>
     *        <p>
     *        Values: Configuration, Management, Monitoring, Security
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withEventCategoriesList(String... eventCategoriesList) {
        if (this.eventCategoriesList == null) {
            setEventCategoriesList(new com.amazonaws.internal.SdkInternalList<String>(eventCategoriesList.length));
        }
        for (String ele : eventCategoriesList) {
            this.eventCategoriesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Amazon Redshift event categories specified in the event notification subscription.
     * </p>
     * <p>
     * Values: Configuration, Management, Monitoring, Security
     * </p>
     * 
     * @param eventCategoriesList
     *        The list of Amazon Redshift event categories specified in the event notification subscription.</p>
     *        <p>
     *        Values: Configuration, Management, Monitoring, Security
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withEventCategoriesList(java.util.Collection<String> eventCategoriesList) {
        setEventCategoriesList(eventCategoriesList);
        return this;
    }

    /**
     * <p>
     * The event severity specified in the Amazon Redshift event notification subscription.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     * 
     * @param severity
     *        The event severity specified in the Amazon Redshift event notification subscription.</p>
     *        <p>
     *        Values: ERROR, INFO
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The event severity specified in the Amazon Redshift event notification subscription.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     * 
     * @return The event severity specified in the Amazon Redshift event notification subscription.</p>
     *         <p>
     *         Values: ERROR, INFO
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The event severity specified in the Amazon Redshift event notification subscription.
     * </p>
     * <p>
     * Values: ERROR, INFO
     * </p>
     * 
     * @param severity
     *        The event severity specified in the Amazon Redshift event notification subscription.</p>
     *        <p>
     *        Values: ERROR, INFO
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * A boolean value indicating whether the subscription is enabled; <code>true</code> indicates that the subscription
     * is enabled.
     * </p>
     * 
     * @param enabled
     *        A boolean value indicating whether the subscription is enabled; <code>true</code> indicates that the
     *        subscription is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * A boolean value indicating whether the subscription is enabled; <code>true</code> indicates that the subscription
     * is enabled.
     * </p>
     * 
     * @return A boolean value indicating whether the subscription is enabled; <code>true</code> indicates that the
     *         subscription is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * A boolean value indicating whether the subscription is enabled; <code>true</code> indicates that the subscription
     * is enabled.
     * </p>
     * 
     * @param enabled
     *        A boolean value indicating whether the subscription is enabled; <code>true</code> indicates that the
     *        subscription is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * A boolean value indicating whether the subscription is enabled; <code>true</code> indicates that the subscription
     * is enabled.
     * </p>
     * 
     * @return A boolean value indicating whether the subscription is enabled; <code>true</code> indicates that the
     *         subscription is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The list of tags for the event subscription.
     * </p>
     * 
     * @return The list of tags for the event subscription.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tags for the event subscription.
     * </p>
     * 
     * @param tags
     *        The list of tags for the event subscription.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags for the event subscription.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags for the event subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags for the event subscription.
     * </p>
     * 
     * @param tags
     *        The list of tags for the event subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withTags(java.util.Collection<Tag> tags) {
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
        if (getCustomerAwsId() != null)
            sb.append("CustomerAwsId: ").append(getCustomerAwsId()).append(",");
        if (getCustSubscriptionId() != null)
            sb.append("CustSubscriptionId: ").append(getCustSubscriptionId()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubscriptionCreationTime() != null)
            sb.append("SubscriptionCreationTime: ").append(getSubscriptionCreationTime()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getSourceIdsList() != null)
            sb.append("SourceIdsList: ").append(getSourceIdsList()).append(",");
        if (getEventCategoriesList() != null)
            sb.append("EventCategoriesList: ").append(getEventCategoriesList()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
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

        if (obj instanceof EventSubscription == false)
            return false;
        EventSubscription other = (EventSubscription) obj;
        if (other.getCustomerAwsId() == null ^ this.getCustomerAwsId() == null)
            return false;
        if (other.getCustomerAwsId() != null && other.getCustomerAwsId().equals(this.getCustomerAwsId()) == false)
            return false;
        if (other.getCustSubscriptionId() == null ^ this.getCustSubscriptionId() == null)
            return false;
        if (other.getCustSubscriptionId() != null && other.getCustSubscriptionId().equals(this.getCustSubscriptionId()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubscriptionCreationTime() == null ^ this.getSubscriptionCreationTime() == null)
            return false;
        if (other.getSubscriptionCreationTime() != null && other.getSubscriptionCreationTime().equals(this.getSubscriptionCreationTime()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getSourceIdsList() == null ^ this.getSourceIdsList() == null)
            return false;
        if (other.getSourceIdsList() != null && other.getSourceIdsList().equals(this.getSourceIdsList()) == false)
            return false;
        if (other.getEventCategoriesList() == null ^ this.getEventCategoriesList() == null)
            return false;
        if (other.getEventCategoriesList() != null && other.getEventCategoriesList().equals(this.getEventCategoriesList()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
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

        hashCode = prime * hashCode + ((getCustomerAwsId() == null) ? 0 : getCustomerAwsId().hashCode());
        hashCode = prime * hashCode + ((getCustSubscriptionId() == null) ? 0 : getCustSubscriptionId().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionCreationTime() == null) ? 0 : getSubscriptionCreationTime().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getSourceIdsList() == null) ? 0 : getSourceIdsList().hashCode());
        hashCode = prime * hashCode + ((getEventCategoriesList() == null) ? 0 : getEventCategoriesList().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public EventSubscription clone() {
        try {
            return (EventSubscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
