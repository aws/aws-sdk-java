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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a subscription.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/Subscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subscription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the subscription.
     * </p>
     */
    private String subscriptionId;
    /**
     * <p>
     * The endpoint of the subscription.
     * </p>
     */
    private String endPoint;
    /**
     * <p>
     * The protocol of the subscription.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The ID of the subscription.
     * </p>
     * 
     * @param subscriptionId
     *        The ID of the subscription.
     */

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * <p>
     * The ID of the subscription.
     * </p>
     * 
     * @return The ID of the subscription.
     */

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * <p>
     * The ID of the subscription.
     * </p>
     * 
     * @param subscriptionId
     *        The ID of the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withSubscriptionId(String subscriptionId) {
        setSubscriptionId(subscriptionId);
        return this;
    }

    /**
     * <p>
     * The endpoint of the subscription.
     * </p>
     * 
     * @param endPoint
     *        The endpoint of the subscription.
     */

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    /**
     * <p>
     * The endpoint of the subscription.
     * </p>
     * 
     * @return The endpoint of the subscription.
     */

    public String getEndPoint() {
        return this.endPoint;
    }

    /**
     * <p>
     * The endpoint of the subscription.
     * </p>
     * 
     * @param endPoint
     *        The endpoint of the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withEndPoint(String endPoint) {
        setEndPoint(endPoint);
        return this;
    }

    /**
     * <p>
     * The protocol of the subscription.
     * </p>
     * 
     * @param protocol
     *        The protocol of the subscription.
     * @see SubscriptionProtocolType
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol of the subscription.
     * </p>
     * 
     * @return The protocol of the subscription.
     * @see SubscriptionProtocolType
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol of the subscription.
     * </p>
     * 
     * @param protocol
     *        The protocol of the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionProtocolType
     */

    public Subscription withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol of the subscription.
     * </p>
     * 
     * @param protocol
     *        The protocol of the subscription.
     * @see SubscriptionProtocolType
     */

    public void setProtocol(SubscriptionProtocolType protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The protocol of the subscription.
     * </p>
     * 
     * @param protocol
     *        The protocol of the subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionProtocolType
     */

    public Subscription withProtocol(SubscriptionProtocolType protocol) {
        this.protocol = protocol.toString();
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
        if (getSubscriptionId() != null)
            sb.append("SubscriptionId: ").append(getSubscriptionId()).append(",");
        if (getEndPoint() != null)
            sb.append("EndPoint: ").append(getEndPoint()).append(",");
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

        if (obj instanceof Subscription == false)
            return false;
        Subscription other = (Subscription) obj;
        if (other.getSubscriptionId() == null ^ this.getSubscriptionId() == null)
            return false;
        if (other.getSubscriptionId() != null && other.getSubscriptionId().equals(this.getSubscriptionId()) == false)
            return false;
        if (other.getEndPoint() == null ^ this.getEndPoint() == null)
            return false;
        if (other.getEndPoint() != null && other.getEndPoint().equals(this.getEndPoint()) == false)
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

        hashCode = prime * hashCode + ((getSubscriptionId() == null) ? 0 : getSubscriptionId().hashCode());
        hashCode = prime * hashCode + ((getEndPoint() == null) ? 0 : getEndPoint().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public Subscription clone() {
        try {
            return (Subscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.SubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
