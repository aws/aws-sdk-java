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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input for SetSubscriptionAttributes action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetSubscriptionAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetSubscriptionAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the subscription to modify.
     * </p>
     */
    private String subscriptionArn;
    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>SetTopicAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     * endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FilterPolicy</code> – The simple JSON object that lets your subscriber receive only a subset of messages,
     * rather than receiving every message published to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RawMessageDelivery</code> – When set to <code>true</code>, enables raw message delivery to Amazon SQS or
     * HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is otherwise
     * created for Amazon SNS metadata.
     * </p>
     * </li>
     * </ul>
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
     *        A map of attributes with their corresponding values.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters that the
     *        <code>SetTopicAttributes</code> action uses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     *        endpoints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FilterPolicy</code> – The simple JSON object that lets your subscriber receive only a subset of
     *        messages, rather than receiving every message published to the topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RawMessageDelivery</code> – When set to <code>true</code>, enables raw message delivery to Amazon
     *        SQS or HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is
     *        otherwise created for Amazon SNS metadata.
     *        </p>
     *        </li>
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
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>SetTopicAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     * endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FilterPolicy</code> – The simple JSON object that lets your subscriber receive only a subset of messages,
     * rather than receiving every message published to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RawMessageDelivery</code> – When set to <code>true</code>, enables raw message delivery to Amazon SQS or
     * HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is otherwise
     * created for Amazon SNS metadata.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributeName
     *        A map of attributes with their corresponding values.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters that the
     *        <code>SetTopicAttributes</code> action uses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     *        endpoints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FilterPolicy</code> – The simple JSON object that lets your subscriber receive only a subset of
     *        messages, rather than receiving every message published to the topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RawMessageDelivery</code> – When set to <code>true</code>, enables raw message delivery to Amazon
     *        SQS or HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is
     *        otherwise created for Amazon SNS metadata.
     *        </p>
     *        </li>
     */

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>SetTopicAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     * endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FilterPolicy</code> – The simple JSON object that lets your subscriber receive only a subset of messages,
     * rather than receiving every message published to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RawMessageDelivery</code> – When set to <code>true</code>, enables raw message delivery to Amazon SQS or
     * HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is otherwise
     * created for Amazon SNS metadata.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A map of attributes with their corresponding values.</p>
     *         <p>
     *         The following lists the names, descriptions, and values of the special request parameters that the
     *         <code>SetTopicAttributes</code> action uses:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     *         endpoints.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FilterPolicy</code> – The simple JSON object that lets your subscriber receive only a subset of
     *         messages, rather than receiving every message published to the topic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RawMessageDelivery</code> – When set to <code>true</code>, enables raw message delivery to Amazon
     *         SQS or HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is
     *         otherwise created for Amazon SNS metadata.
     *         </p>
     *         </li>
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>SetTopicAttributes</code> action uses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     * endpoints.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FilterPolicy</code> – The simple JSON object that lets your subscriber receive only a subset of messages,
     * rather than receiving every message published to the topic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RawMessageDelivery</code> – When set to <code>true</code>, enables raw message delivery to Amazon SQS or
     * HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is otherwise
     * created for Amazon SNS metadata.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributeName
     *        A map of attributes with their corresponding values.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters that the
     *        <code>SetTopicAttributes</code> action uses:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeliveryPolicy</code> – The policy that defines how Amazon SNS retries failed deliveries to HTTP/S
     *        endpoints.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FilterPolicy</code> – The simple JSON object that lets your subscriber receive only a subset of
     *        messages, rather than receiving every message published to the topic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RawMessageDelivery</code> – When set to <code>true</code>, enables raw message delivery to Amazon
     *        SQS or HTTP/S endpoints. This eliminates the need for the endpoints to process JSON formatting, which is
     *        otherwise created for Amazon SNS metadata.
     *        </p>
     *        </li>
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
        if (getSubscriptionArn() != null)
            sb.append("SubscriptionArn: ").append(getSubscriptionArn()).append(",");
        if (getAttributeName() != null)
            sb.append("AttributeName: ").append(getAttributeName()).append(",");
        if (getAttributeValue() != null)
            sb.append("AttributeValue: ").append(getAttributeValue());
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
