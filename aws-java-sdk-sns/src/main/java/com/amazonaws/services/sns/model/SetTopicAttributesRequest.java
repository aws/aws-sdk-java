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
 * Input for SetTopicAttributes action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetTopicAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetTopicAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the topic to modify.
     * </p>
     */
    private String topicArn;
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
     * <code>DisplayName</code> – The display name to use for a topic with SMS subscriptions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The policy that defines who can access your topic. By default, only the topic owner can
     * publish or subscribe to the topic.
     * </p>
     * </li>
     * </ul>
     */
    private String attributeName;
    /**
     * <p>
     * The new value for the attribute.
     * </p>
     */
    private String attributeValue;

    /**
     * Default constructor for SetTopicAttributesRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public SetTopicAttributesRequest() {
    }

    /**
     * Constructs a new SetTopicAttributesRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param topicArn
     *        The ARN of the topic to modify.
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
     *        <code>DisplayName</code> – The display name to use for a topic with SMS subscriptions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> – The policy that defines who can access your topic. By default, only the topic owner
     *        can publish or subscribe to the topic.
     *        </p>
     *        </li>
     * @param attributeValue
     *        The new value for the attribute.
     */
    public SetTopicAttributesRequest(String topicArn, String attributeName, String attributeValue) {
        setTopicArn(topicArn);
        setAttributeName(attributeName);
        setAttributeValue(attributeValue);
    }

    /**
     * <p>
     * The ARN of the topic to modify.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the topic to modify.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the topic to modify.
     * </p>
     * 
     * @return The ARN of the topic to modify.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The ARN of the topic to modify.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the topic to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTopicAttributesRequest withTopicArn(String topicArn) {
        setTopicArn(topicArn);
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
     * <code>DisplayName</code> – The display name to use for a topic with SMS subscriptions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The policy that defines who can access your topic. By default, only the topic owner can
     * publish or subscribe to the topic.
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
     *        <code>DisplayName</code> – The display name to use for a topic with SMS subscriptions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> – The policy that defines who can access your topic. By default, only the topic owner
     *        can publish or subscribe to the topic.
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
     * <code>DisplayName</code> – The display name to use for a topic with SMS subscriptions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The policy that defines who can access your topic. By default, only the topic owner can
     * publish or subscribe to the topic.
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
     *         <code>DisplayName</code> – The display name to use for a topic with SMS subscriptions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Policy</code> – The policy that defines who can access your topic. By default, only the topic owner
     *         can publish or subscribe to the topic.
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
     * <code>DisplayName</code> – The display name to use for a topic with SMS subscriptions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Policy</code> – The policy that defines who can access your topic. By default, only the topic owner can
     * publish or subscribe to the topic.
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
     *        <code>DisplayName</code> – The display name to use for a topic with SMS subscriptions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Policy</code> – The policy that defines who can access your topic. By default, only the topic owner
     *        can publish or subscribe to the topic.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTopicAttributesRequest withAttributeName(String attributeName) {
        setAttributeName(attributeName);
        return this;
    }

    /**
     * <p>
     * The new value for the attribute.
     * </p>
     * 
     * @param attributeValue
     *        The new value for the attribute.
     */

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    /**
     * <p>
     * The new value for the attribute.
     * </p>
     * 
     * @return The new value for the attribute.
     */

    public String getAttributeValue() {
        return this.attributeValue;
    }

    /**
     * <p>
     * The new value for the attribute.
     * </p>
     * 
     * @param attributeValue
     *        The new value for the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTopicAttributesRequest withAttributeValue(String attributeValue) {
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
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn()).append(",");
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

        if (obj instanceof SetTopicAttributesRequest == false)
            return false;
        SetTopicAttributesRequest other = (SetTopicAttributesRequest) obj;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
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

        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode + ((getAttributeValue() == null) ? 0 : getAttributeValue().hashCode());
        return hashCode;
    }

    @Override
    public SetTopicAttributesRequest clone() {
        return (SetTopicAttributesRequest) super.clone();
    }

}
