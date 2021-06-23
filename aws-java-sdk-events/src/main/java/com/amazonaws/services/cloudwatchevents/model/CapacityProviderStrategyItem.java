/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a capacity provider strategy. To learn more, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CapacityProviderStrategyItem.html"
 * >CapacityProviderStrategyItem</a> in the Amazon ECS API Reference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/CapacityProviderStrategyItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityProviderStrategyItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The short name of the capacity provider.
     * </p>
     */
    private String capacityProvider;
    /**
     * <p>
     * The weight value designates the relative percentage of the total number of tasks launched that should use the
     * specified capacity provider. The weight value is taken into consideration after the base value, if defined, is
     * satisfied.
     * </p>
     */
    private Integer weight;
    /**
     * <p>
     * The base value designates how many tasks, at a minimum, to run on the specified capacity provider. Only one
     * capacity provider in a capacity provider strategy can have a base defined. If no value is specified, the default
     * value of 0 is used.
     * </p>
     */
    private Integer base;

    /**
     * <p>
     * The short name of the capacity provider.
     * </p>
     * 
     * @param capacityProvider
     *        The short name of the capacity provider.
     */

    public void setCapacityProvider(String capacityProvider) {
        this.capacityProvider = capacityProvider;
    }

    /**
     * <p>
     * The short name of the capacity provider.
     * </p>
     * 
     * @return The short name of the capacity provider.
     */

    public String getCapacityProvider() {
        return this.capacityProvider;
    }

    /**
     * <p>
     * The short name of the capacity provider.
     * </p>
     * 
     * @param capacityProvider
     *        The short name of the capacity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityProviderStrategyItem withCapacityProvider(String capacityProvider) {
        setCapacityProvider(capacityProvider);
        return this;
    }

    /**
     * <p>
     * The weight value designates the relative percentage of the total number of tasks launched that should use the
     * specified capacity provider. The weight value is taken into consideration after the base value, if defined, is
     * satisfied.
     * </p>
     * 
     * @param weight
     *        The weight value designates the relative percentage of the total number of tasks launched that should use
     *        the specified capacity provider. The weight value is taken into consideration after the base value, if
     *        defined, is satisfied.
     */

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The weight value designates the relative percentage of the total number of tasks launched that should use the
     * specified capacity provider. The weight value is taken into consideration after the base value, if defined, is
     * satisfied.
     * </p>
     * 
     * @return The weight value designates the relative percentage of the total number of tasks launched that should use
     *         the specified capacity provider. The weight value is taken into consideration after the base value, if
     *         defined, is satisfied.
     */

    public Integer getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * The weight value designates the relative percentage of the total number of tasks launched that should use the
     * specified capacity provider. The weight value is taken into consideration after the base value, if defined, is
     * satisfied.
     * </p>
     * 
     * @param weight
     *        The weight value designates the relative percentage of the total number of tasks launched that should use
     *        the specified capacity provider. The weight value is taken into consideration after the base value, if
     *        defined, is satisfied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityProviderStrategyItem withWeight(Integer weight) {
        setWeight(weight);
        return this;
    }

    /**
     * <p>
     * The base value designates how many tasks, at a minimum, to run on the specified capacity provider. Only one
     * capacity provider in a capacity provider strategy can have a base defined. If no value is specified, the default
     * value of 0 is used.
     * </p>
     * 
     * @param base
     *        The base value designates how many tasks, at a minimum, to run on the specified capacity provider. Only
     *        one capacity provider in a capacity provider strategy can have a base defined. If no value is specified,
     *        the default value of 0 is used.
     */

    public void setBase(Integer base) {
        this.base = base;
    }

    /**
     * <p>
     * The base value designates how many tasks, at a minimum, to run on the specified capacity provider. Only one
     * capacity provider in a capacity provider strategy can have a base defined. If no value is specified, the default
     * value of 0 is used.
     * </p>
     * 
     * @return The base value designates how many tasks, at a minimum, to run on the specified capacity provider. Only
     *         one capacity provider in a capacity provider strategy can have a base defined. If no value is specified,
     *         the default value of 0 is used.
     */

    public Integer getBase() {
        return this.base;
    }

    /**
     * <p>
     * The base value designates how many tasks, at a minimum, to run on the specified capacity provider. Only one
     * capacity provider in a capacity provider strategy can have a base defined. If no value is specified, the default
     * value of 0 is used.
     * </p>
     * 
     * @param base
     *        The base value designates how many tasks, at a minimum, to run on the specified capacity provider. Only
     *        one capacity provider in a capacity provider strategy can have a base defined. If no value is specified,
     *        the default value of 0 is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityProviderStrategyItem withBase(Integer base) {
        setBase(base);
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
        if (getCapacityProvider() != null)
            sb.append("CapacityProvider: ").append(getCapacityProvider()).append(",");
        if (getWeight() != null)
            sb.append("Weight: ").append(getWeight()).append(",");
        if (getBase() != null)
            sb.append("Base: ").append(getBase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityProviderStrategyItem == false)
            return false;
        CapacityProviderStrategyItem other = (CapacityProviderStrategyItem) obj;
        if (other.getCapacityProvider() == null ^ this.getCapacityProvider() == null)
            return false;
        if (other.getCapacityProvider() != null && other.getCapacityProvider().equals(this.getCapacityProvider()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        if (other.getBase() == null ^ this.getBase() == null)
            return false;
        if (other.getBase() != null && other.getBase().equals(this.getBase()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityProvider() == null) ? 0 : getCapacityProvider().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        hashCode = prime * hashCode + ((getBase() == null) ? 0 : getBase().hashCode());
        return hashCode;
    }

    @Override
    public CapacityProviderStrategyItem clone() {
        try {
            return (CapacityProviderStrategyItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.CapacityProviderStrategyItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
