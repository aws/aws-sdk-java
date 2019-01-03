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
 * Input for SetEndpointAttributes action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SetEndpointAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetEndpointAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * EndpointArn used for SetEndpointAttributes action.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * A map of the endpoint attributes. Attributes in this map include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CustomUserData</code> – arbitrary user data to associate with the endpoint. Amazon SNS does not use this
     * data. The data must be in UTF-8 format and less than 2KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Enabled</code> – flag that enables/disables delivery to the endpoint. Amazon SNS will set this to false
     * when a notification service indicates to Amazon SNS that the endpoint is invalid. Users can set it back to true,
     * typically after updating Token.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Token</code> – device token, also referred to as a registration id, for an app and mobile device. This is
     * returned from the notification service when an app and mobile device are registered with the notification
     * service.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> attributes;

    /**
     * <p>
     * EndpointArn used for SetEndpointAttributes action.
     * </p>
     * 
     * @param endpointArn
     *        EndpointArn used for SetEndpointAttributes action.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * EndpointArn used for SetEndpointAttributes action.
     * </p>
     * 
     * @return EndpointArn used for SetEndpointAttributes action.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * EndpointArn used for SetEndpointAttributes action.
     * </p>
     * 
     * @param endpointArn
     *        EndpointArn used for SetEndpointAttributes action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetEndpointAttributesRequest withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * A map of the endpoint attributes. Attributes in this map include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CustomUserData</code> – arbitrary user data to associate with the endpoint. Amazon SNS does not use this
     * data. The data must be in UTF-8 format and less than 2KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Enabled</code> – flag that enables/disables delivery to the endpoint. Amazon SNS will set this to false
     * when a notification service indicates to Amazon SNS that the endpoint is invalid. Users can set it back to true,
     * typically after updating Token.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Token</code> – device token, also referred to as a registration id, for an app and mobile device. This is
     * returned from the notification service when an app and mobile device are registered with the notification
     * service.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A map of the endpoint attributes. Attributes in this map include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CustomUserData</code> – arbitrary user data to associate with the endpoint. Amazon SNS does not use
     *         this data. The data must be in UTF-8 format and less than 2KB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Enabled</code> – flag that enables/disables delivery to the endpoint. Amazon SNS will set this to
     *         false when a notification service indicates to Amazon SNS that the endpoint is invalid. Users can set it
     *         back to true, typically after updating Token.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Token</code> – device token, also referred to as a registration id, for an app and mobile device.
     *         This is returned from the notification service when an app and mobile device are registered with the
     *         notification service.
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
     * A map of the endpoint attributes. Attributes in this map include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CustomUserData</code> – arbitrary user data to associate with the endpoint. Amazon SNS does not use this
     * data. The data must be in UTF-8 format and less than 2KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Enabled</code> – flag that enables/disables delivery to the endpoint. Amazon SNS will set this to false
     * when a notification service indicates to Amazon SNS that the endpoint is invalid. Users can set it back to true,
     * typically after updating Token.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Token</code> – device token, also referred to as a registration id, for an app and mobile device. This is
     * returned from the notification service when an app and mobile device are registered with the notification
     * service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        A map of the endpoint attributes. Attributes in this map include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CustomUserData</code> – arbitrary user data to associate with the endpoint. Amazon SNS does not use
     *        this data. The data must be in UTF-8 format and less than 2KB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Enabled</code> – flag that enables/disables delivery to the endpoint. Amazon SNS will set this to
     *        false when a notification service indicates to Amazon SNS that the endpoint is invalid. Users can set it
     *        back to true, typically after updating Token.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Token</code> – device token, also referred to as a registration id, for an app and mobile device.
     *        This is returned from the notification service when an app and mobile device are registered with the
     *        notification service.
     *        </p>
     *        </li>
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(attributes);
    }

    /**
     * <p>
     * A map of the endpoint attributes. Attributes in this map include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CustomUserData</code> – arbitrary user data to associate with the endpoint. Amazon SNS does not use this
     * data. The data must be in UTF-8 format and less than 2KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Enabled</code> – flag that enables/disables delivery to the endpoint. Amazon SNS will set this to false
     * when a notification service indicates to Amazon SNS that the endpoint is invalid. Users can set it back to true,
     * typically after updating Token.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Token</code> – device token, also referred to as a registration id, for an app and mobile device. This is
     * returned from the notification service when an app and mobile device are registered with the notification
     * service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        A map of the endpoint attributes. Attributes in this map include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CustomUserData</code> – arbitrary user data to associate with the endpoint. Amazon SNS does not use
     *        this data. The data must be in UTF-8 format and less than 2KB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Enabled</code> – flag that enables/disables delivery to the endpoint. Amazon SNS will set this to
     *        false when a notification service indicates to Amazon SNS that the endpoint is invalid. Users can set it
     *        back to true, typically after updating Token.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Token</code> – device token, also referred to as a registration id, for an app and mobile device.
     *        This is returned from the notification service when an app and mobile device are registered with the
     *        notification service.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetEndpointAttributesRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public SetEndpointAttributesRequest addAttributesEntry(String key, String value) {
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

    public SetEndpointAttributesRequest clearAttributesEntries() {
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
        if (getEndpointArn() != null)
            sb.append("EndpointArn: ").append(getEndpointArn()).append(",");
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

        if (obj instanceof SetEndpointAttributesRequest == false)
            return false;
        SetEndpointAttributesRequest other = (SetEndpointAttributesRequest) obj;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
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

        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public SetEndpointAttributesRequest clone() {
        return (SetEndpointAttributesRequest) super.clone();
    }

}
