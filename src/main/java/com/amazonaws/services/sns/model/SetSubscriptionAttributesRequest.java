/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#setSubscriptionAttributes(SetSubscriptionAttributesRequest) SetSubscriptionAttributes operation}.
 * <p>
 * The SetSubscriptionAttributes action allows a subscription owner to set an attribute of the topic to a new value.
 * </p>
 *
 * @see com.amazonaws.services.sns.AmazonSNS#setSubscriptionAttributes(SetSubscriptionAttributesRequest)
 */
public class SetSubscriptionAttributesRequest extends AmazonWebServiceRequest {

    /**
     * The ARN of the subscription to modify.
     */
    private String subscriptionArn;

    /**
     * The name of the attribute you want to set. Only a subset of the
     * subscriptions attributes are mutable. <p>Valid values: DeliveryPolicy
     */
    private String attributeName;

    /**
     * The new value for the attribute.
     */
    private String attributeValue;

    /**
     * Default constructor for a new SetSubscriptionAttributesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public SetSubscriptionAttributesRequest() {}
    
    /**
     * Constructs a new SetSubscriptionAttributesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param subscriptionArn The ARN of the subscription to modify.
     * @param attributeName The name of the attribute you want to set. Only a
     * subset of the subscriptions attributes are mutable. <p>Valid values:
     * DeliveryPolicy
     * @param attributeValue The new value for the attribute.
     */
    public SetSubscriptionAttributesRequest(String subscriptionArn, String attributeName, String attributeValue) {
        this.subscriptionArn = subscriptionArn;
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
    }

    
    
    /**
     * The ARN of the subscription to modify.
     *
     * @return The ARN of the subscription to modify.
     */
    public String getSubscriptionArn() {
        return subscriptionArn;
    }
    
    /**
     * The ARN of the subscription to modify.
     *
     * @param subscriptionArn The ARN of the subscription to modify.
     */
    public void setSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
    }
    
    /**
     * The ARN of the subscription to modify.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subscriptionArn The ARN of the subscription to modify.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetSubscriptionAttributesRequest withSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
        return this;
    }
    
    
    /**
     * The name of the attribute you want to set. Only a subset of the
     * subscriptions attributes are mutable. <p>Valid values: DeliveryPolicy
     *
     * @return The name of the attribute you want to set. Only a subset of the
     *         subscriptions attributes are mutable. <p>Valid values: DeliveryPolicy
     */
    public String getAttributeName() {
        return attributeName;
    }
    
    /**
     * The name of the attribute you want to set. Only a subset of the
     * subscriptions attributes are mutable. <p>Valid values: DeliveryPolicy
     *
     * @param attributeName The name of the attribute you want to set. Only a subset of the
     *         subscriptions attributes are mutable. <p>Valid values: DeliveryPolicy
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    
    /**
     * The name of the attribute you want to set. Only a subset of the
     * subscriptions attributes are mutable. <p>Valid values: DeliveryPolicy
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeName The name of the attribute you want to set. Only a subset of the
     *         subscriptions attributes are mutable. <p>Valid values: DeliveryPolicy
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetSubscriptionAttributesRequest withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    
    
    /**
     * The new value for the attribute.
     *
     * @return The new value for the attribute.
     */
    public String getAttributeValue() {
        return attributeValue;
    }
    
    /**
     * The new value for the attribute.
     *
     * @param attributeValue The new value for the attribute.
     */
    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }
    
    /**
     * The new value for the attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributeValue The new value for the attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SetSubscriptionAttributesRequest withAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
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
        if (subscriptionArn != null) sb.append("SubscriptionArn: " + subscriptionArn + ", ");
        if (attributeName != null) sb.append("AttributeName: " + attributeName + ", ");
        if (attributeValue != null) sb.append("AttributeValue: " + attributeValue + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubscriptionArn() == null) ? 0 : getSubscriptionArn().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode()); 
        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof SetSubscriptionAttributesRequest == false) return false;
        SetSubscriptionAttributesRequest other = (SetSubscriptionAttributesRequest)obj;
        
        if (other.getSubscriptionArn() == null ^ this.getSubscriptionArn() == null) return false;
        if (other.getSubscriptionArn() != null && other.getSubscriptionArn().equals(this.getSubscriptionArn()) == false) return false; 
        if (other.getAttributeName() == null ^ this.getAttributeName() == null) return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false) return false; 
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null) return false;
        if (other.getAttributeValue() != null && other.getAttributeValue().equals(this.getAttributeValue()) == false) return false; 
        return true;
    }
    
}
    