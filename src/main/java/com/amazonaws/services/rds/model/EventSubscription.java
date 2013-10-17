/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the results of a successful invocation of the DescribeEventSubscriptions action.
 * </p>
 */
public class EventSubscription implements Serializable {

    /**
     * The AWS customer account associated with the RDS event notification
     * subscription.
     */
    private String customerAwsId;

    /**
     * The RDS event notification subscription Id.
     */
    private String custSubscriptionId;

    /**
     * The topic ARN of the RDS event notification subscription.
     */
    private String snsTopicArn;

    /**
     * The status of the RDS event notification subscription. <p>Constraints:
     * <p>Can be one of the following: creating | modifying | deleting |
     * active | no-permission | topic-not-exist <p>The status "no-permission"
     * indicates that RDS no longer has permission to post to the SNS topic.
     * The status "topic-not-exist" indicates that the topic was deleted
     * after the subscription was created.
     */
    private String status;

    /**
     * The time the RDS event notification subscription was created.
     */
    private String subscriptionCreationTime;

    /**
     * The source type for the RDS event notification subscription.
     */
    private String sourceType;

    /**
     * A list of source Ids for the RDS event notification subscription.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> sourceIdsList;

    /**
     * A list of event categories for the RDS event notification
     * subscription.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> eventCategoriesList;

    /**
     * A Boolean value indicating if the subscription is enabled. True
     * indicates the subscription is enabled.
     */
    private Boolean enabled;

    /**
     * The AWS customer account associated with the RDS event notification
     * subscription.
     *
     * @return The AWS customer account associated with the RDS event notification
     *         subscription.
     */
    public String getCustomerAwsId() {
        return customerAwsId;
    }
    
    /**
     * The AWS customer account associated with the RDS event notification
     * subscription.
     *
     * @param customerAwsId The AWS customer account associated with the RDS event notification
     *         subscription.
     */
    public void setCustomerAwsId(String customerAwsId) {
        this.customerAwsId = customerAwsId;
    }
    
    /**
     * The AWS customer account associated with the RDS event notification
     * subscription.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerAwsId The AWS customer account associated with the RDS event notification
     *         subscription.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventSubscription withCustomerAwsId(String customerAwsId) {
        this.customerAwsId = customerAwsId;
        return this;
    }

    /**
     * The RDS event notification subscription Id.
     *
     * @return The RDS event notification subscription Id.
     */
    public String getCustSubscriptionId() {
        return custSubscriptionId;
    }
    
    /**
     * The RDS event notification subscription Id.
     *
     * @param custSubscriptionId The RDS event notification subscription Id.
     */
    public void setCustSubscriptionId(String custSubscriptionId) {
        this.custSubscriptionId = custSubscriptionId;
    }
    
    /**
     * The RDS event notification subscription Id.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param custSubscriptionId The RDS event notification subscription Id.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventSubscription withCustSubscriptionId(String custSubscriptionId) {
        this.custSubscriptionId = custSubscriptionId;
        return this;
    }

    /**
     * The topic ARN of the RDS event notification subscription.
     *
     * @return The topic ARN of the RDS event notification subscription.
     */
    public String getSnsTopicArn() {
        return snsTopicArn;
    }
    
    /**
     * The topic ARN of the RDS event notification subscription.
     *
     * @param snsTopicArn The topic ARN of the RDS event notification subscription.
     */
    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }
    
    /**
     * The topic ARN of the RDS event notification subscription.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snsTopicArn The topic ARN of the RDS event notification subscription.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventSubscription withSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
        return this;
    }

    /**
     * The status of the RDS event notification subscription. <p>Constraints:
     * <p>Can be one of the following: creating | modifying | deleting |
     * active | no-permission | topic-not-exist <p>The status "no-permission"
     * indicates that RDS no longer has permission to post to the SNS topic.
     * The status "topic-not-exist" indicates that the topic was deleted
     * after the subscription was created.
     *
     * @return The status of the RDS event notification subscription. <p>Constraints:
     *         <p>Can be one of the following: creating | modifying | deleting |
     *         active | no-permission | topic-not-exist <p>The status "no-permission"
     *         indicates that RDS no longer has permission to post to the SNS topic.
     *         The status "topic-not-exist" indicates that the topic was deleted
     *         after the subscription was created.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the RDS event notification subscription. <p>Constraints:
     * <p>Can be one of the following: creating | modifying | deleting |
     * active | no-permission | topic-not-exist <p>The status "no-permission"
     * indicates that RDS no longer has permission to post to the SNS topic.
     * The status "topic-not-exist" indicates that the topic was deleted
     * after the subscription was created.
     *
     * @param status The status of the RDS event notification subscription. <p>Constraints:
     *         <p>Can be one of the following: creating | modifying | deleting |
     *         active | no-permission | topic-not-exist <p>The status "no-permission"
     *         indicates that RDS no longer has permission to post to the SNS topic.
     *         The status "topic-not-exist" indicates that the topic was deleted
     *         after the subscription was created.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the RDS event notification subscription. <p>Constraints:
     * <p>Can be one of the following: creating | modifying | deleting |
     * active | no-permission | topic-not-exist <p>The status "no-permission"
     * indicates that RDS no longer has permission to post to the SNS topic.
     * The status "topic-not-exist" indicates that the topic was deleted
     * after the subscription was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the RDS event notification subscription. <p>Constraints:
     *         <p>Can be one of the following: creating | modifying | deleting |
     *         active | no-permission | topic-not-exist <p>The status "no-permission"
     *         indicates that RDS no longer has permission to post to the SNS topic.
     *         The status "topic-not-exist" indicates that the topic was deleted
     *         after the subscription was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventSubscription withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The time the RDS event notification subscription was created.
     *
     * @return The time the RDS event notification subscription was created.
     */
    public String getSubscriptionCreationTime() {
        return subscriptionCreationTime;
    }
    
    /**
     * The time the RDS event notification subscription was created.
     *
     * @param subscriptionCreationTime The time the RDS event notification subscription was created.
     */
    public void setSubscriptionCreationTime(String subscriptionCreationTime) {
        this.subscriptionCreationTime = subscriptionCreationTime;
    }
    
    /**
     * The time the RDS event notification subscription was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subscriptionCreationTime The time the RDS event notification subscription was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventSubscription withSubscriptionCreationTime(String subscriptionCreationTime) {
        this.subscriptionCreationTime = subscriptionCreationTime;
        return this;
    }

    /**
     * The source type for the RDS event notification subscription.
     *
     * @return The source type for the RDS event notification subscription.
     */
    public String getSourceType() {
        return sourceType;
    }
    
    /**
     * The source type for the RDS event notification subscription.
     *
     * @param sourceType The source type for the RDS event notification subscription.
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    /**
     * The source type for the RDS event notification subscription.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceType The source type for the RDS event notification subscription.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventSubscription withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * A list of source Ids for the RDS event notification subscription.
     *
     * @return A list of source Ids for the RDS event notification subscription.
     */
    public java.util.List<String> getSourceIdsList() {
        if (sourceIdsList == null) {
              sourceIdsList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              sourceIdsList.setAutoConstruct(true);
        }
        return sourceIdsList;
    }
    
    /**
     * A list of source Ids for the RDS event notification subscription.
     *
     * @param sourceIdsList A list of source Ids for the RDS event notification subscription.
     */
    public void setSourceIdsList(java.util.Collection<String> sourceIdsList) {
        if (sourceIdsList == null) {
            this.sourceIdsList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> sourceIdsListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(sourceIdsList.size());
        sourceIdsListCopy.addAll(sourceIdsList);
        this.sourceIdsList = sourceIdsListCopy;
    }
    
    /**
     * A list of source Ids for the RDS event notification subscription.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceIdsList A list of source Ids for the RDS event notification subscription.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventSubscription withSourceIdsList(String... sourceIdsList) {
        if (getSourceIdsList() == null) setSourceIdsList(new java.util.ArrayList<String>(sourceIdsList.length));
        for (String value : sourceIdsList) {
            getSourceIdsList().add(value);
        }
        return this;
    }
    
    /**
     * A list of source Ids for the RDS event notification subscription.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceIdsList A list of source Ids for the RDS event notification subscription.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventSubscription withSourceIdsList(java.util.Collection<String> sourceIdsList) {
        if (sourceIdsList == null) {
            this.sourceIdsList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> sourceIdsListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(sourceIdsList.size());
            sourceIdsListCopy.addAll(sourceIdsList);
            this.sourceIdsList = sourceIdsListCopy;
        }

        return this;
    }

    /**
     * A list of event categories for the RDS event notification
     * subscription.
     *
     * @return A list of event categories for the RDS event notification
     *         subscription.
     */
    public java.util.List<String> getEventCategoriesList() {
        if (eventCategoriesList == null) {
              eventCategoriesList = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              eventCategoriesList.setAutoConstruct(true);
        }
        return eventCategoriesList;
    }
    
    /**
     * A list of event categories for the RDS event notification
     * subscription.
     *
     * @param eventCategoriesList A list of event categories for the RDS event notification
     *         subscription.
     */
    public void setEventCategoriesList(java.util.Collection<String> eventCategoriesList) {
        if (eventCategoriesList == null) {
            this.eventCategoriesList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> eventCategoriesListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(eventCategoriesList.size());
        eventCategoriesListCopy.addAll(eventCategoriesList);
        this.eventCategoriesList = eventCategoriesListCopy;
    }
    
    /**
     * A list of event categories for the RDS event notification
     * subscription.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategoriesList A list of event categories for the RDS event notification
     *         subscription.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventSubscription withEventCategoriesList(String... eventCategoriesList) {
        if (getEventCategoriesList() == null) setEventCategoriesList(new java.util.ArrayList<String>(eventCategoriesList.length));
        for (String value : eventCategoriesList) {
            getEventCategoriesList().add(value);
        }
        return this;
    }
    
    /**
     * A list of event categories for the RDS event notification
     * subscription.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategoriesList A list of event categories for the RDS event notification
     *         subscription.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventSubscription withEventCategoriesList(java.util.Collection<String> eventCategoriesList) {
        if (eventCategoriesList == null) {
            this.eventCategoriesList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> eventCategoriesListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(eventCategoriesList.size());
            eventCategoriesListCopy.addAll(eventCategoriesList);
            this.eventCategoriesList = eventCategoriesListCopy;
        }

        return this;
    }

    /**
     * A Boolean value indicating if the subscription is enabled. True
     * indicates the subscription is enabled.
     *
     * @return A Boolean value indicating if the subscription is enabled. True
     *         indicates the subscription is enabled.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * A Boolean value indicating if the subscription is enabled. True
     * indicates the subscription is enabled.
     *
     * @param enabled A Boolean value indicating if the subscription is enabled. True
     *         indicates the subscription is enabled.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * A Boolean value indicating if the subscription is enabled. True
     * indicates the subscription is enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled A Boolean value indicating if the subscription is enabled. True
     *         indicates the subscription is enabled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventSubscription withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * A Boolean value indicating if the subscription is enabled. True
     * indicates the subscription is enabled.
     *
     * @return A Boolean value indicating if the subscription is enabled. True
     *         indicates the subscription is enabled.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCustomerAwsId() != null) sb.append("CustomerAwsId: " + getCustomerAwsId() + ",");
        if (getCustSubscriptionId() != null) sb.append("CustSubscriptionId: " + getCustSubscriptionId() + ",");
        if (getSnsTopicArn() != null) sb.append("SnsTopicArn: " + getSnsTopicArn() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getSubscriptionCreationTime() != null) sb.append("SubscriptionCreationTime: " + getSubscriptionCreationTime() + ",");
        if (getSourceType() != null) sb.append("SourceType: " + getSourceType() + ",");
        if (getSourceIdsList() != null) sb.append("SourceIdsList: " + getSourceIdsList() + ",");
        if (getEventCategoriesList() != null) sb.append("EventCategoriesList: " + getEventCategoriesList() + ",");
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EventSubscription == false) return false;
        EventSubscription other = (EventSubscription)obj;
        
        if (other.getCustomerAwsId() == null ^ this.getCustomerAwsId() == null) return false;
        if (other.getCustomerAwsId() != null && other.getCustomerAwsId().equals(this.getCustomerAwsId()) == false) return false; 
        if (other.getCustSubscriptionId() == null ^ this.getCustSubscriptionId() == null) return false;
        if (other.getCustSubscriptionId() != null && other.getCustSubscriptionId().equals(this.getCustSubscriptionId()) == false) return false; 
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null) return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getSubscriptionCreationTime() == null ^ this.getSubscriptionCreationTime() == null) return false;
        if (other.getSubscriptionCreationTime() != null && other.getSubscriptionCreationTime().equals(this.getSubscriptionCreationTime()) == false) return false; 
        if (other.getSourceType() == null ^ this.getSourceType() == null) return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false) return false; 
        if (other.getSourceIdsList() == null ^ this.getSourceIdsList() == null) return false;
        if (other.getSourceIdsList() != null && other.getSourceIdsList().equals(this.getSourceIdsList()) == false) return false; 
        if (other.getEventCategoriesList() == null ^ this.getEventCategoriesList() == null) return false;
        if (other.getEventCategoriesList() != null && other.getEventCategoriesList().equals(this.getEventCategoriesList()) == false) return false; 
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        return true;
    }
    
}
    