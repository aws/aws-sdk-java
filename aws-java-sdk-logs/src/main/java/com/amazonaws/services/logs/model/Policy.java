/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains information about one delivery destination policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/Policy" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Policy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The contents of the delivery destination policy.
     * </p>
     */
    private String deliveryDestinationPolicy;

    /**
     * <p>
     * The contents of the delivery destination policy.
     * </p>
     * 
     * @param deliveryDestinationPolicy
     *        The contents of the delivery destination policy.
     */

    public void setDeliveryDestinationPolicy(String deliveryDestinationPolicy) {
        this.deliveryDestinationPolicy = deliveryDestinationPolicy;
    }

    /**
     * <p>
     * The contents of the delivery destination policy.
     * </p>
     * 
     * @return The contents of the delivery destination policy.
     */

    public String getDeliveryDestinationPolicy() {
        return this.deliveryDestinationPolicy;
    }

    /**
     * <p>
     * The contents of the delivery destination policy.
     * </p>
     * 
     * @param deliveryDestinationPolicy
     *        The contents of the delivery destination policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Policy withDeliveryDestinationPolicy(String deliveryDestinationPolicy) {
        setDeliveryDestinationPolicy(deliveryDestinationPolicy);
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
        if (getDeliveryDestinationPolicy() != null)
            sb.append("DeliveryDestinationPolicy: ").append(getDeliveryDestinationPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Policy == false)
            return false;
        Policy other = (Policy) obj;
        if (other.getDeliveryDestinationPolicy() == null ^ this.getDeliveryDestinationPolicy() == null)
            return false;
        if (other.getDeliveryDestinationPolicy() != null && other.getDeliveryDestinationPolicy().equals(this.getDeliveryDestinationPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryDestinationPolicy() == null) ? 0 : getDeliveryDestinationPolicy().hashCode());
        return hashCode;
    }

    @Override
    public Policy clone() {
        try {
            return (Policy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.PolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
