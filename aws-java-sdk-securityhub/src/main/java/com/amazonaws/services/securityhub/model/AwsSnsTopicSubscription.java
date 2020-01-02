/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A wrapper type for the attributes of an Amazon SNS subscription.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsSnsTopicSubscription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSnsTopicSubscription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The subscription's endpoint (format depends on the protocol).
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The subscription's protocol.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The subscription's endpoint (format depends on the protocol).
     * </p>
     * 
     * @param endpoint
     *        The subscription's endpoint (format depends on the protocol).
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The subscription's endpoint (format depends on the protocol).
     * </p>
     * 
     * @return The subscription's endpoint (format depends on the protocol).
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The subscription's endpoint (format depends on the protocol).
     * </p>
     * 
     * @param endpoint
     *        The subscription's endpoint (format depends on the protocol).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSnsTopicSubscription withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The subscription's protocol.
     * </p>
     * 
     * @param protocol
     *        The subscription's protocol.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The subscription's protocol.
     * </p>
     * 
     * @return The subscription's protocol.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The subscription's protocol.
     * </p>
     * 
     * @param protocol
     *        The subscription's protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSnsTopicSubscription withProtocol(String protocol) {
        setProtocol(protocol);
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
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsSnsTopicSubscription == false)
            return false;
        AwsSnsTopicSubscription other = (AwsSnsTopicSubscription) obj;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public AwsSnsTopicSubscription clone() {
        try {
            return (AwsSnsTopicSubscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsSnsTopicSubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
