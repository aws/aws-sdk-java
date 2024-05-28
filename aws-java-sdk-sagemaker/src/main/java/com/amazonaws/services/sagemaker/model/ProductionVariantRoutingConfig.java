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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings that control how the endpoint routes incoming traffic to the instances that the endpoint hosts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProductionVariantRoutingConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductionVariantRoutingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sets how the endpoint routes incoming traffic:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LEAST_OUTSTANDING_REQUESTS</code>: The endpoint routes requests to the specific instances that have more
     * capacity to process them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANDOM</code>: The endpoint routes each request to a randomly chosen instance.
     * </p>
     * </li>
     * </ul>
     */
    private String routingStrategy;

    /**
     * <p>
     * Sets how the endpoint routes incoming traffic:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LEAST_OUTSTANDING_REQUESTS</code>: The endpoint routes requests to the specific instances that have more
     * capacity to process them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANDOM</code>: The endpoint routes each request to a randomly chosen instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param routingStrategy
     *        Sets how the endpoint routes incoming traffic:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LEAST_OUTSTANDING_REQUESTS</code>: The endpoint routes requests to the specific instances that have
     *        more capacity to process them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RANDOM</code>: The endpoint routes each request to a randomly chosen instance.
     *        </p>
     *        </li>
     * @see RoutingStrategy
     */

    public void setRoutingStrategy(String routingStrategy) {
        this.routingStrategy = routingStrategy;
    }

    /**
     * <p>
     * Sets how the endpoint routes incoming traffic:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LEAST_OUTSTANDING_REQUESTS</code>: The endpoint routes requests to the specific instances that have more
     * capacity to process them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANDOM</code>: The endpoint routes each request to a randomly chosen instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Sets how the endpoint routes incoming traffic:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LEAST_OUTSTANDING_REQUESTS</code>: The endpoint routes requests to the specific instances that have
     *         more capacity to process them.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RANDOM</code>: The endpoint routes each request to a randomly chosen instance.
     *         </p>
     *         </li>
     * @see RoutingStrategy
     */

    public String getRoutingStrategy() {
        return this.routingStrategy;
    }

    /**
     * <p>
     * Sets how the endpoint routes incoming traffic:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LEAST_OUTSTANDING_REQUESTS</code>: The endpoint routes requests to the specific instances that have more
     * capacity to process them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANDOM</code>: The endpoint routes each request to a randomly chosen instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param routingStrategy
     *        Sets how the endpoint routes incoming traffic:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LEAST_OUTSTANDING_REQUESTS</code>: The endpoint routes requests to the specific instances that have
     *        more capacity to process them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RANDOM</code>: The endpoint routes each request to a randomly chosen instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingStrategy
     */

    public ProductionVariantRoutingConfig withRoutingStrategy(String routingStrategy) {
        setRoutingStrategy(routingStrategy);
        return this;
    }

    /**
     * <p>
     * Sets how the endpoint routes incoming traffic:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LEAST_OUTSTANDING_REQUESTS</code>: The endpoint routes requests to the specific instances that have more
     * capacity to process them.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RANDOM</code>: The endpoint routes each request to a randomly chosen instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param routingStrategy
     *        Sets how the endpoint routes incoming traffic:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LEAST_OUTSTANDING_REQUESTS</code>: The endpoint routes requests to the specific instances that have
     *        more capacity to process them.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RANDOM</code>: The endpoint routes each request to a randomly chosen instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingStrategy
     */

    public ProductionVariantRoutingConfig withRoutingStrategy(RoutingStrategy routingStrategy) {
        this.routingStrategy = routingStrategy.toString();
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
        if (getRoutingStrategy() != null)
            sb.append("RoutingStrategy: ").append(getRoutingStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductionVariantRoutingConfig == false)
            return false;
        ProductionVariantRoutingConfig other = (ProductionVariantRoutingConfig) obj;
        if (other.getRoutingStrategy() == null ^ this.getRoutingStrategy() == null)
            return false;
        if (other.getRoutingStrategy() != null && other.getRoutingStrategy().equals(this.getRoutingStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoutingStrategy() == null) ? 0 : getRoutingStrategy().hashCode());
        return hashCode;
    }

    @Override
    public ProductionVariantRoutingConfig clone() {
        try {
            return (ProductionVariantRoutingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProductionVariantRoutingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
