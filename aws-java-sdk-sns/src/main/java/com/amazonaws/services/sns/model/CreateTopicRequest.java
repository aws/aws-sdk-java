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
 * Input for CreateTopic action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CreateTopic" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTopicRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and
     * hyphens, and must be between 1 and 256 characters long.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>CreateTopic</code> action uses:
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
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;

    /**
     * Default constructor for CreateTopicRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateTopicRequest() {
    }

    /**
     * Constructs a new CreateTopicRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name
     *        The name of the topic you want to create.</p>
     *        <p>
     *        Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers,
     *        underscores, and hyphens, and must be between 1 and 256 characters long.
     */
    public CreateTopicRequest(String name) {
        setName(name);
    }

    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and
     * hyphens, and must be between 1 and 256 characters long.
     * </p>
     * 
     * @param name
     *        The name of the topic you want to create.</p>
     *        <p>
     *        Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers,
     *        underscores, and hyphens, and must be between 1 and 256 characters long.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and
     * hyphens, and must be between 1 and 256 characters long.
     * </p>
     * 
     * @return The name of the topic you want to create.</p>
     *         <p>
     *         Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers,
     *         underscores, and hyphens, and must be between 1 and 256 characters long.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the topic you want to create.
     * </p>
     * <p>
     * Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and
     * hyphens, and must be between 1 and 256 characters long.
     * </p>
     * 
     * @param name
     *        The name of the topic you want to create.</p>
     *        <p>
     *        Constraints: Topic names must be made up of only uppercase and lowercase ASCII letters, numbers,
     *        underscores, and hyphens, and must be between 1 and 256 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>CreateTopic</code> action uses:
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
     *         <code>CreateTopic</code> action uses:
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

    public java.util.Map<String, String> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return attributes;
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>CreateTopic</code> action uses:
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
     * @param attributes
     *        A map of attributes with their corresponding values.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters that the
     *        <code>CreateTopic</code> action uses:
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

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * A map of attributes with their corresponding values.
     * </p>
     * <p>
     * The following lists the names, descriptions, and values of the special request parameters that the
     * <code>CreateTopic</code> action uses:
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
     * @param attributes
     *        A map of attributes with their corresponding values.</p>
     *        <p>
     *        The following lists the names, descriptions, and values of the special request parameters that the
     *        <code>CreateTopic</code> action uses:
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

    public CreateTopicRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public CreateTopicRequest addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTopicRequest clearAttributesEntries() {
        this.attributes = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTopicRequest == false)
            return false;
        CreateTopicRequest other = (CreateTopicRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public CreateTopicRequest clone() {
        return (CreateTopicRequest) super.clone();
    }

}
