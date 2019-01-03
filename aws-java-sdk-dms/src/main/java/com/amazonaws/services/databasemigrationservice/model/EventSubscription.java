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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/EventSubscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventSubscription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS customer account associated with the AWS DMS event notification subscription.
     * </p>
     */
    private String customerAwsId;
    /**
     * <p>
     * The AWS DMS event notification subscription Id.
     * </p>
     */
    private String custSubscriptionId;
    /**
     * <p>
     * The topic ARN of the AWS DMS event notification subscription.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The status of the AWS DMS event notification subscription.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Can be one of the following: creating | modifying | deleting | active | no-permission | topic-not-exist
     * </p>
     * <p>
     * The status "no-permission" indicates that AWS DMS no longer has permission to post to the SNS topic. The status
     * "topic-not-exist" indicates that the topic was deleted after the subscription was created.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time the RDS event notification subscription was created.
     * </p>
     */
    private String subscriptionCreationTime;
    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | replication-server | security-group | migration-task
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * A list of source Ids for the event subscription.
     * </p>
     */
    private java.util.List<String> sourceIdsList;
    /**
     * <p>
     * A lists of event categories.
     * </p>
     */
    private java.util.List<String> eventCategoriesList;
    /**
     * <p>
     * Boolean value that indicates if the event subscription is enabled.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The AWS customer account associated with the AWS DMS event notification subscription.
     * </p>
     * 
     * @param customerAwsId
     *        The AWS customer account associated with the AWS DMS event notification subscription.
     */

    public void setCustomerAwsId(String customerAwsId) {
        this.customerAwsId = customerAwsId;
    }

    /**
     * <p>
     * The AWS customer account associated with the AWS DMS event notification subscription.
     * </p>
     * 
     * @return The AWS customer account associated with the AWS DMS event notification subscription.
     */

    public String getCustomerAwsId() {
        return this.customerAwsId;
    }

    /**
     * <p>
     * The AWS customer account associated with the AWS DMS event notification subscription.
     * </p>
     * 
     * @param customerAwsId
     *        The AWS customer account associated with the AWS DMS event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withCustomerAwsId(String customerAwsId) {
        setCustomerAwsId(customerAwsId);
        return this;
    }

    /**
     * <p>
     * The AWS DMS event notification subscription Id.
     * </p>
     * 
     * @param custSubscriptionId
     *        The AWS DMS event notification subscription Id.
     */

    public void setCustSubscriptionId(String custSubscriptionId) {
        this.custSubscriptionId = custSubscriptionId;
    }

    /**
     * <p>
     * The AWS DMS event notification subscription Id.
     * </p>
     * 
     * @return The AWS DMS event notification subscription Id.
     */

    public String getCustSubscriptionId() {
        return this.custSubscriptionId;
    }

    /**
     * <p>
     * The AWS DMS event notification subscription Id.
     * </p>
     * 
     * @param custSubscriptionId
     *        The AWS DMS event notification subscription Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withCustSubscriptionId(String custSubscriptionId) {
        setCustSubscriptionId(custSubscriptionId);
        return this;
    }

    /**
     * <p>
     * The topic ARN of the AWS DMS event notification subscription.
     * </p>
     * 
     * @param snsTopicArn
     *        The topic ARN of the AWS DMS event notification subscription.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The topic ARN of the AWS DMS event notification subscription.
     * </p>
     * 
     * @return The topic ARN of the AWS DMS event notification subscription.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The topic ARN of the AWS DMS event notification subscription.
     * </p>
     * 
     * @param snsTopicArn
     *        The topic ARN of the AWS DMS event notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The status of the AWS DMS event notification subscription.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Can be one of the following: creating | modifying | deleting | active | no-permission | topic-not-exist
     * </p>
     * <p>
     * The status "no-permission" indicates that AWS DMS no longer has permission to post to the SNS topic. The status
     * "topic-not-exist" indicates that the topic was deleted after the subscription was created.
     * </p>
     * 
     * @param status
     *        The status of the AWS DMS event notification subscription.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <p>
     *        Can be one of the following: creating | modifying | deleting | active | no-permission | topic-not-exist
     *        </p>
     *        <p>
     *        The status "no-permission" indicates that AWS DMS no longer has permission to post to the SNS topic. The
     *        status "topic-not-exist" indicates that the topic was deleted after the subscription was created.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the AWS DMS event notification subscription.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Can be one of the following: creating | modifying | deleting | active | no-permission | topic-not-exist
     * </p>
     * <p>
     * The status "no-permission" indicates that AWS DMS no longer has permission to post to the SNS topic. The status
     * "topic-not-exist" indicates that the topic was deleted after the subscription was created.
     * </p>
     * 
     * @return The status of the AWS DMS event notification subscription.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <p>
     *         Can be one of the following: creating | modifying | deleting | active | no-permission | topic-not-exist
     *         </p>
     *         <p>
     *         The status "no-permission" indicates that AWS DMS no longer has permission to post to the SNS topic. The
     *         status "topic-not-exist" indicates that the topic was deleted after the subscription was created.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the AWS DMS event notification subscription.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Can be one of the following: creating | modifying | deleting | active | no-permission | topic-not-exist
     * </p>
     * <p>
     * The status "no-permission" indicates that AWS DMS no longer has permission to post to the SNS topic. The status
     * "topic-not-exist" indicates that the topic was deleted after the subscription was created.
     * </p>
     * 
     * @param status
     *        The status of the AWS DMS event notification subscription.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <p>
     *        Can be one of the following: creating | modifying | deleting | active | no-permission | topic-not-exist
     *        </p>
     *        <p>
     *        The status "no-permission" indicates that AWS DMS no longer has permission to post to the SNS topic. The
     *        status "topic-not-exist" indicates that the topic was deleted after the subscription was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The time the RDS event notification subscription was created.
     * </p>
     * 
     * @param subscriptionCreationTime
     *        The time the RDS event notification subscription was created.
     */

    public void setSubscriptionCreationTime(String subscriptionCreationTime) {
        this.subscriptionCreationTime = subscriptionCreationTime;
    }

    /**
     * <p>
     * The time the RDS event notification subscription was created.
     * </p>
     * 
     * @return The time the RDS event notification subscription was created.
     */

    public String getSubscriptionCreationTime() {
        return this.subscriptionCreationTime;
    }

    /**
     * <p>
     * The time the RDS event notification subscription was created.
     * </p>
     * 
     * @param subscriptionCreationTime
     *        The time the RDS event notification subscription was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withSubscriptionCreationTime(String subscriptionCreationTime) {
        setSubscriptionCreationTime(subscriptionCreationTime);
        return this;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | replication-server | security-group | migration-task
     * </p>
     * 
     * @param sourceType
     *        The type of AWS DMS resource that generates events. </p>
     *        <p>
     *        Valid values: replication-instance | replication-server | security-group | migration-task
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | replication-server | security-group | migration-task
     * </p>
     * 
     * @return The type of AWS DMS resource that generates events. </p>
     *         <p>
     *         Valid values: replication-instance | replication-server | security-group | migration-task
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The type of AWS DMS resource that generates events.
     * </p>
     * <p>
     * Valid values: replication-instance | replication-server | security-group | migration-task
     * </p>
     * 
     * @param sourceType
     *        The type of AWS DMS resource that generates events. </p>
     *        <p>
     *        Valid values: replication-instance | replication-server | security-group | migration-task
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * A list of source Ids for the event subscription.
     * </p>
     * 
     * @return A list of source Ids for the event subscription.
     */

    public java.util.List<String> getSourceIdsList() {
        return sourceIdsList;
    }

    /**
     * <p>
     * A list of source Ids for the event subscription.
     * </p>
     * 
     * @param sourceIdsList
     *        A list of source Ids for the event subscription.
     */

    public void setSourceIdsList(java.util.Collection<String> sourceIdsList) {
        if (sourceIdsList == null) {
            this.sourceIdsList = null;
            return;
        }

        this.sourceIdsList = new java.util.ArrayList<String>(sourceIdsList);
    }

    /**
     * <p>
     * A list of source Ids for the event subscription.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceIdsList(java.util.Collection)} or {@link #withSourceIdsList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sourceIdsList
     *        A list of source Ids for the event subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withSourceIdsList(String... sourceIdsList) {
        if (this.sourceIdsList == null) {
            setSourceIdsList(new java.util.ArrayList<String>(sourceIdsList.length));
        }
        for (String ele : sourceIdsList) {
            this.sourceIdsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of source Ids for the event subscription.
     * </p>
     * 
     * @param sourceIdsList
     *        A list of source Ids for the event subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withSourceIdsList(java.util.Collection<String> sourceIdsList) {
        setSourceIdsList(sourceIdsList);
        return this;
    }

    /**
     * <p>
     * A lists of event categories.
     * </p>
     * 
     * @return A lists of event categories.
     */

    public java.util.List<String> getEventCategoriesList() {
        return eventCategoriesList;
    }

    /**
     * <p>
     * A lists of event categories.
     * </p>
     * 
     * @param eventCategoriesList
     *        A lists of event categories.
     */

    public void setEventCategoriesList(java.util.Collection<String> eventCategoriesList) {
        if (eventCategoriesList == null) {
            this.eventCategoriesList = null;
            return;
        }

        this.eventCategoriesList = new java.util.ArrayList<String>(eventCategoriesList);
    }

    /**
     * <p>
     * A lists of event categories.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategoriesList(java.util.Collection)} or {@link #withEventCategoriesList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param eventCategoriesList
     *        A lists of event categories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withEventCategoriesList(String... eventCategoriesList) {
        if (this.eventCategoriesList == null) {
            setEventCategoriesList(new java.util.ArrayList<String>(eventCategoriesList.length));
        }
        for (String ele : eventCategoriesList) {
            this.eventCategoriesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A lists of event categories.
     * </p>
     * 
     * @param eventCategoriesList
     *        A lists of event categories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withEventCategoriesList(java.util.Collection<String> eventCategoriesList) {
        setEventCategoriesList(eventCategoriesList);
        return this;
    }

    /**
     * <p>
     * Boolean value that indicates if the event subscription is enabled.
     * </p>
     * 
     * @param enabled
     *        Boolean value that indicates if the event subscription is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Boolean value that indicates if the event subscription is enabled.
     * </p>
     * 
     * @return Boolean value that indicates if the event subscription is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Boolean value that indicates if the event subscription is enabled.
     * </p>
     * 
     * @param enabled
     *        Boolean value that indicates if the event subscription is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventSubscription withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Boolean value that indicates if the event subscription is enabled.
     * </p>
     * 
     * @return Boolean value that indicates if the event subscription is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
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
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
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
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.EventSubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
