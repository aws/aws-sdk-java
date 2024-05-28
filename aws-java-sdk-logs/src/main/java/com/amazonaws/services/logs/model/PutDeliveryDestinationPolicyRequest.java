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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/PutDeliveryDestinationPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDeliveryDestinationPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the delivery destination to assign this policy to.
     * </p>
     */
    private String deliveryDestinationName;
    /**
     * <p>
     * The contents of the policy.
     * </p>
     */
    private String deliveryDestinationPolicy;

    /**
     * <p>
     * The name of the delivery destination to assign this policy to.
     * </p>
     * 
     * @param deliveryDestinationName
     *        The name of the delivery destination to assign this policy to.
     */

    public void setDeliveryDestinationName(String deliveryDestinationName) {
        this.deliveryDestinationName = deliveryDestinationName;
    }

    /**
     * <p>
     * The name of the delivery destination to assign this policy to.
     * </p>
     * 
     * @return The name of the delivery destination to assign this policy to.
     */

    public String getDeliveryDestinationName() {
        return this.deliveryDestinationName;
    }

    /**
     * <p>
     * The name of the delivery destination to assign this policy to.
     * </p>
     * 
     * @param deliveryDestinationName
     *        The name of the delivery destination to assign this policy to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeliveryDestinationPolicyRequest withDeliveryDestinationName(String deliveryDestinationName) {
        setDeliveryDestinationName(deliveryDestinationName);
        return this;
    }

    /**
     * <p>
     * The contents of the policy.
     * </p>
     * 
     * @param deliveryDestinationPolicy
     *        The contents of the policy.
     */

    public void setDeliveryDestinationPolicy(String deliveryDestinationPolicy) {
        this.deliveryDestinationPolicy = deliveryDestinationPolicy;
    }

    /**
     * <p>
     * The contents of the policy.
     * </p>
     * 
     * @return The contents of the policy.
     */

    public String getDeliveryDestinationPolicy() {
        return this.deliveryDestinationPolicy;
    }

    /**
     * <p>
     * The contents of the policy.
     * </p>
     * 
     * @param deliveryDestinationPolicy
     *        The contents of the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDeliveryDestinationPolicyRequest withDeliveryDestinationPolicy(String deliveryDestinationPolicy) {
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
        if (getDeliveryDestinationName() != null)
            sb.append("DeliveryDestinationName: ").append(getDeliveryDestinationName()).append(",");
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

        if (obj instanceof PutDeliveryDestinationPolicyRequest == false)
            return false;
        PutDeliveryDestinationPolicyRequest other = (PutDeliveryDestinationPolicyRequest) obj;
        if (other.getDeliveryDestinationName() == null ^ this.getDeliveryDestinationName() == null)
            return false;
        if (other.getDeliveryDestinationName() != null && other.getDeliveryDestinationName().equals(this.getDeliveryDestinationName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getDeliveryDestinationName() == null) ? 0 : getDeliveryDestinationName().hashCode());
        hashCode = prime * hashCode + ((getDeliveryDestinationPolicy() == null) ? 0 : getDeliveryDestinationPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutDeliveryDestinationPolicyRequest clone() {
        return (PutDeliveryDestinationPolicyRequest) super.clone();
    }

}
