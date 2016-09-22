/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for SetSubscriptionAttributes action.
 * </p>
 */
public class SetSubscriptionAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the subscription to modify.
     * </p>
     */
    private String subscriptionArn;
    /**
     * <p>
     * The name of the attribute you want to set. Only a subset of the subscriptions attributes are mutable.
     * </p>
     * <p>
     * Valid values: <code>DeliveryPolicy</code> | <code>RawMessageDelivery</code>
     * </p>
     */
    private String attributeName;
    /**
     * <p>
     * The new value for the attribute in JSON format.
     * </p>
     */
    private String attributeValue;

    /**
     * Default constructor for SetSubscriptionAttributesRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public SetSubscriptionAttributesRequest() {
    }

    /**
     * Constructs a new SetSubscriptionAttributesRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param subscriptionArn
     *        The ARN of the subscription to modify.
     * @param attributeName
     *        The name of the attribute you want to set. Only a subset of the subscriptions attributes are mutable.</p>
     *        <p>
     *        Valid values: <code>DeliveryPolicy</code> | <code>RawMessageDelivery</code>
     * @param attributeValue
     *        The new value for the attribute in JSON format.
     */
    public SetSubscriptionAttributesRequest(String subscriptionArn, String attributeName, String attributeValue) {
        setSubscriptionArn(subscriptionArn);
        setAttributeName(attributeName);
        setAttributeValue(attributeValue);
    }

    /**
     * <p>
     * The ARN of the subscription to modify.
     * </p>
     * 
     * @param subscriptionArn
     *        The ARN of the subscription to modify.
     */

    public void setSubscriptionArn(String subscriptionArn) {
        this.subscriptionArn = subscriptionArn;
    }

    /**
     * <p>
     * The ARN of the subscription to modify.
     * </p>
     * 
     * @return The ARN of the subscription to modify.
     */

    public String getSubscriptionArn() {
        return this.subscriptionArn;
    }

    /**
     * <p>
     * The ARN of the subscription to modify.
     * </p>
     * 
     * @param subscriptionArn
     *        The ARN of the subscription to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetSubscriptionAttributesRequest withSubscriptionArn(String subscriptionArn) {
        setSubscriptionArn(subscriptionArn);
        return this;
    }

    /**
     * <p>
     * The name of the attribute you want to set. Only a subset of the subscriptions attributes are mutable.
     * </p>
     * <p>
     * Valid values: <code>DeliveryPolicy</code> | <code>RawMessageDelivery</code>
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute you want to set. Only a subset of the subscriptions attributes are mutable.</p>
     *        <p>
     *        Valid values: <code>DeliveryPolicy</code> | <code>RawMessageDelivery</code>
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the attribute you want to set. Only a subset of the subscriptions attributes are mutable.
     * </p>
     * <p>
     * Valid values: <code>DeliveryPolicy</code> | <code>RawMessageDelivery</code>
     * </p>
     * 
     * @return The name of the attribute you want to set. Only a subset of the subscriptions attributes are mutable.</p>
     *         <p>
     *         Valid values: <code>DeliveryPolicy</code> | <code>RawMessageDelivery</code>
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * The name of the attribute you want to set. Only a subset of the subscriptions attributes are mutable.
     * </p>
     * <p>
     * Valid values: <code>DeliveryPolicy</code> | <code>RawMessageDelivery</code>
     * </p>
     * 
     * @param attributeName
     *        The name of the attribute you want to set. Only a subset of the subscriptions attributes are mutable.</p>
     *        <p>
     *        Valid values: <code>DeliveryPolicy</code> | <code>RawMessageDelivery</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetSubscriptionAttributesRequest withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The new value for the attribute in JSON format.
     * </p>
     * 
     * @param attributeValue
     *        The new value for the attribute in JSON format.
     */

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The new value for the attribute in JSON format.
     * </p>
     * 
     * @return The new value for the attribute in JSON format.
     */

    public String getAttributeValue() {
        return this.attributeValue;
    }

    /**
     * <p>
     * The new value for the attribute in JSON format.
     * </p>
     * 
     * @param attributeValue
     *        The new value for the attribute in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetSubscriptionAttributesRequest withAttributeValue(String attributeValue) {
        setAttributeValue(attributeValue);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSubscriptionArn() != null)
            sb.append("SubscriptionArn: " + getSubscriptionArn() + ",");
        if (getAttributeName() != null)
            sb.append("AttributeName: " + getAttributeName() + ",");
        if (getAttributeValue() != null)
            sb.append("AttributeValue: " + getAttributeValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetSubscriptionAttributesRequest == false)
            return false;
        SetSubscriptionAttributesRequest other = (SetSubscriptionAttributesRequest) obj;
        if (other.getSubscriptionArn() == null ^ this.getSubscriptionArn() == null)
            return false;
        if (other.getSubscriptionArn() != null && other.getSubscriptionArn().equals(this.getSubscriptionArn()) == false)
            return false;
        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValue() == null ^ this.getAttributeValue() == null)
            return false;
        if (other.getAttributeValue() != null && other.getAttributeValue().equals(this.getAttributeValue()) == false)
            return false;
        return true;
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
    public SetSubscriptionAttributesRequest clone() {
        return (SetSubscriptionAttributesRequest) super.clone();
    }
}
