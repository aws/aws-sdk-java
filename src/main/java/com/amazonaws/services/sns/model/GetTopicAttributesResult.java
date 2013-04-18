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
package com.amazonaws.services.sns.model;
import java.io.Serializable;

/**
 * Get Topic Attributes Result
 */
public class GetTopicAttributesResult  implements Serializable  {

    /**
     * A map of the topic's attributes. Attributes in this map include the
     * following: <ul> <li>TopicArn -- the topic's ARN</li> <li>Owner -- the
     * AWS account ID of the topic's owner</li> <li>Policy -- the JSON
     * serialization of the topic's access control policy</li>
     * <li>DisplayName -- the human-readable name used in the "From" field
     * for notifications to email and email-json endpoints</li>
     * <li>SubscriptionsPending -- the number of subscriptions pending
     * confirmation on this topic</li> <li>SubscriptionsConfirmed -- the
     * number of confirmed subscriptions on this topic</li>
     * <li>SubscriptionsDeleted -- the number of deleted subscriptions on
     * this topic</li> <li>DeliveryPolicy -- the JSON serialization of the
     * topic's delivery policy</li> <li>EffectiveDeliveryPolicy -- the JSON
     * serialization of the effective delivery policy which takes into
     * account system defaults</li> </ul>
     */
    private java.util.Map<String,String> attributes;

    /**
     * A map of the topic's attributes. Attributes in this map include the
     * following: <ul> <li>TopicArn -- the topic's ARN</li> <li>Owner -- the
     * AWS account ID of the topic's owner</li> <li>Policy -- the JSON
     * serialization of the topic's access control policy</li>
     * <li>DisplayName -- the human-readable name used in the "From" field
     * for notifications to email and email-json endpoints</li>
     * <li>SubscriptionsPending -- the number of subscriptions pending
     * confirmation on this topic</li> <li>SubscriptionsConfirmed -- the
     * number of confirmed subscriptions on this topic</li>
     * <li>SubscriptionsDeleted -- the number of deleted subscriptions on
     * this topic</li> <li>DeliveryPolicy -- the JSON serialization of the
     * topic's delivery policy</li> <li>EffectiveDeliveryPolicy -- the JSON
     * serialization of the effective delivery policy which takes into
     * account system defaults</li> </ul>
     *
     * @return A map of the topic's attributes. Attributes in this map include the
     *         following: <ul> <li>TopicArn -- the topic's ARN</li> <li>Owner -- the
     *         AWS account ID of the topic's owner</li> <li>Policy -- the JSON
     *         serialization of the topic's access control policy</li>
     *         <li>DisplayName -- the human-readable name used in the "From" field
     *         for notifications to email and email-json endpoints</li>
     *         <li>SubscriptionsPending -- the number of subscriptions pending
     *         confirmation on this topic</li> <li>SubscriptionsConfirmed -- the
     *         number of confirmed subscriptions on this topic</li>
     *         <li>SubscriptionsDeleted -- the number of deleted subscriptions on
     *         this topic</li> <li>DeliveryPolicy -- the JSON serialization of the
     *         topic's delivery policy</li> <li>EffectiveDeliveryPolicy -- the JSON
     *         serialization of the effective delivery policy which takes into
     *         account system defaults</li> </ul>
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;

    }
    
    /**
     * A map of the topic's attributes. Attributes in this map include the
     * following: <ul> <li>TopicArn -- the topic's ARN</li> <li>Owner -- the
     * AWS account ID of the topic's owner</li> <li>Policy -- the JSON
     * serialization of the topic's access control policy</li>
     * <li>DisplayName -- the human-readable name used in the "From" field
     * for notifications to email and email-json endpoints</li>
     * <li>SubscriptionsPending -- the number of subscriptions pending
     * confirmation on this topic</li> <li>SubscriptionsConfirmed -- the
     * number of confirmed subscriptions on this topic</li>
     * <li>SubscriptionsDeleted -- the number of deleted subscriptions on
     * this topic</li> <li>DeliveryPolicy -- the JSON serialization of the
     * topic's delivery policy</li> <li>EffectiveDeliveryPolicy -- the JSON
     * serialization of the effective delivery policy which takes into
     * account system defaults</li> </ul>
     *
     * @param attributes A map of the topic's attributes. Attributes in this map include the
     *         following: <ul> <li>TopicArn -- the topic's ARN</li> <li>Owner -- the
     *         AWS account ID of the topic's owner</li> <li>Policy -- the JSON
     *         serialization of the topic's access control policy</li>
     *         <li>DisplayName -- the human-readable name used in the "From" field
     *         for notifications to email and email-json endpoints</li>
     *         <li>SubscriptionsPending -- the number of subscriptions pending
     *         confirmation on this topic</li> <li>SubscriptionsConfirmed -- the
     *         number of confirmed subscriptions on this topic</li>
     *         <li>SubscriptionsDeleted -- the number of deleted subscriptions on
     *         this topic</li> <li>DeliveryPolicy -- the JSON serialization of the
     *         topic's delivery policy</li> <li>EffectiveDeliveryPolicy -- the JSON
     *         serialization of the effective delivery policy which takes into
     *         account system defaults</li> </ul>
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * A map of the topic's attributes. Attributes in this map include the
     * following: <ul> <li>TopicArn -- the topic's ARN</li> <li>Owner -- the
     * AWS account ID of the topic's owner</li> <li>Policy -- the JSON
     * serialization of the topic's access control policy</li>
     * <li>DisplayName -- the human-readable name used in the "From" field
     * for notifications to email and email-json endpoints</li>
     * <li>SubscriptionsPending -- the number of subscriptions pending
     * confirmation on this topic</li> <li>SubscriptionsConfirmed -- the
     * number of confirmed subscriptions on this topic</li>
     * <li>SubscriptionsDeleted -- the number of deleted subscriptions on
     * this topic</li> <li>DeliveryPolicy -- the JSON serialization of the
     * topic's delivery policy</li> <li>EffectiveDeliveryPolicy -- the JSON
     * serialization of the effective delivery policy which takes into
     * account system defaults</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes A map of the topic's attributes. Attributes in this map include the
     *         following: <ul> <li>TopicArn -- the topic's ARN</li> <li>Owner -- the
     *         AWS account ID of the topic's owner</li> <li>Policy -- the JSON
     *         serialization of the topic's access control policy</li>
     *         <li>DisplayName -- the human-readable name used in the "From" field
     *         for notifications to email and email-json endpoints</li>
     *         <li>SubscriptionsPending -- the number of subscriptions pending
     *         confirmation on this topic</li> <li>SubscriptionsConfirmed -- the
     *         number of confirmed subscriptions on this topic</li>
     *         <li>SubscriptionsDeleted -- the number of deleted subscriptions on
     *         this topic</li> <li>DeliveryPolicy -- the JSON serialization of the
     *         topic's delivery policy</li> <li>EffectiveDeliveryPolicy -- the JSON
     *         serialization of the effective delivery policy which takes into
     *         account system defaults</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetTopicAttributesResult withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
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
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetTopicAttributesResult == false) return false;
        GetTopicAttributesResult other = (GetTopicAttributesResult)obj;
        
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
}
    