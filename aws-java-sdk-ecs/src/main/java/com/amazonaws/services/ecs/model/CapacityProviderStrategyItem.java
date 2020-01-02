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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a capacity provider strategy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/CapacityProviderStrategyItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityProviderStrategyItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the capacity provider.
     * </p>
     */
    private String capacityProvider;
    /**
     * <p>
     * The <i>weight</i> value designates the relative percentage of the total number of tasks launched that should use
     * the specified capacity provider.
     * </p>
     * <p>
     * For example, if you have a strategy that contains two capacity providers and both have a weight of <code>1</code>
     * , then when the <code>base</code> is satisfied, the tasks will be split evenly across the two capacity providers.
     * Using that same logic, if you specify a weight of <code>1</code> for <i>capacityProviderA</i> and a weight of
     * <code>4</code> for <i>capacityProviderB</i>, then for every one task that is run using <i>capacityProviderA</i>,
     * four tasks would use <i>capacityProviderB</i>.
     * </p>
     */
    private Integer weight;
    /**
     * <p>
     * The <i>base</i> value designates how many tasks, at a minimum, to run on the specified capacity provider. Only
     * one capacity provider in a capacity provider strategy can have a <i>base</i> defined.
     * </p>
     */
    private Integer base;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the capacity provider.
     * </p>
     * 
     * @param capacityProvider
     *        The short name or full Amazon Resource Name (ARN) of the capacity provider.
     */

    public void setCapacityProvider(String capacityProvider) {
        this.capacityProvider = capacityProvider;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the capacity provider.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the capacity provider.
     */

    public String getCapacityProvider() {
        return this.capacityProvider;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the capacity provider.
     * </p>
     * 
     * @param capacityProvider
     *        The short name or full Amazon Resource Name (ARN) of the capacity provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityProviderStrategyItem withCapacityProvider(String capacityProvider) {
        setCapacityProvider(capacityProvider);
        return this;
    }

    /**
     * <p>
     * The <i>weight</i> value designates the relative percentage of the total number of tasks launched that should use
     * the specified capacity provider.
     * </p>
     * <p>
     * For example, if you have a strategy that contains two capacity providers and both have a weight of <code>1</code>
     * , then when the <code>base</code> is satisfied, the tasks will be split evenly across the two capacity providers.
     * Using that same logic, if you specify a weight of <code>1</code> for <i>capacityProviderA</i> and a weight of
     * <code>4</code> for <i>capacityProviderB</i>, then for every one task that is run using <i>capacityProviderA</i>,
     * four tasks would use <i>capacityProviderB</i>.
     * </p>
     * 
     * @param weight
     *        The <i>weight</i> value designates the relative percentage of the total number of tasks launched that
     *        should use the specified capacity provider.</p>
     *        <p>
     *        For example, if you have a strategy that contains two capacity providers and both have a weight of
     *        <code>1</code>, then when the <code>base</code> is satisfied, the tasks will be split evenly across the
     *        two capacity providers. Using that same logic, if you specify a weight of <code>1</code> for
     *        <i>capacityProviderA</i> and a weight of <code>4</code> for <i>capacityProviderB</i>, then for every one
     *        task that is run using <i>capacityProviderA</i>, four tasks would use <i>capacityProviderB</i>.
     */

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The <i>weight</i> value designates the relative percentage of the total number of tasks launched that should use
     * the specified capacity provider.
     * </p>
     * <p>
     * For example, if you have a strategy that contains two capacity providers and both have a weight of <code>1</code>
     * , then when the <code>base</code> is satisfied, the tasks will be split evenly across the two capacity providers.
     * Using that same logic, if you specify a weight of <code>1</code> for <i>capacityProviderA</i> and a weight of
     * <code>4</code> for <i>capacityProviderB</i>, then for every one task that is run using <i>capacityProviderA</i>,
     * four tasks would use <i>capacityProviderB</i>.
     * </p>
     * 
     * @return The <i>weight</i> value designates the relative percentage of the total number of tasks launched that
     *         should use the specified capacity provider.</p>
     *         <p>
     *         For example, if you have a strategy that contains two capacity providers and both have a weight of
     *         <code>1</code>, then when the <code>base</code> is satisfied, the tasks will be split evenly across the
     *         two capacity providers. Using that same logic, if you specify a weight of <code>1</code> for
     *         <i>capacityProviderA</i> and a weight of <code>4</code> for <i>capacityProviderB</i>, then for every one
     *         task that is run using <i>capacityProviderA</i>, four tasks would use <i>capacityProviderB</i>.
     */

    public Integer getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * The <i>weight</i> value designates the relative percentage of the total number of tasks launched that should use
     * the specified capacity provider.
     * </p>
     * <p>
     * For example, if you have a strategy that contains two capacity providers and both have a weight of <code>1</code>
     * , then when the <code>base</code> is satisfied, the tasks will be split evenly across the two capacity providers.
     * Using that same logic, if you specify a weight of <code>1</code> for <i>capacityProviderA</i> and a weight of
     * <code>4</code> for <i>capacityProviderB</i>, then for every one task that is run using <i>capacityProviderA</i>,
     * four tasks would use <i>capacityProviderB</i>.
     * </p>
     * 
     * @param weight
     *        The <i>weight</i> value designates the relative percentage of the total number of tasks launched that
     *        should use the specified capacity provider.</p>
     *        <p>
     *        For example, if you have a strategy that contains two capacity providers and both have a weight of
     *        <code>1</code>, then when the <code>base</code> is satisfied, the tasks will be split evenly across the
     *        two capacity providers. Using that same logic, if you specify a weight of <code>1</code> for
     *        <i>capacityProviderA</i> and a weight of <code>4</code> for <i>capacityProviderB</i>, then for every one
     *        task that is run using <i>capacityProviderA</i>, four tasks would use <i>capacityProviderB</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityProviderStrategyItem withWeight(Integer weight) {
        setWeight(weight);
        return this;
    }

    /**
     * <p>
     * The <i>base</i> value designates how many tasks, at a minimum, to run on the specified capacity provider. Only
     * one capacity provider in a capacity provider strategy can have a <i>base</i> defined.
     * </p>
     * 
     * @param base
     *        The <i>base</i> value designates how many tasks, at a minimum, to run on the specified capacity provider.
     *        Only one capacity provider in a capacity provider strategy can have a <i>base</i> defined.
     */

    public void setBase(Integer base) {
        this.base = base;
    }

    /**
     * <p>
     * The <i>base</i> value designates how many tasks, at a minimum, to run on the specified capacity provider. Only
     * one capacity provider in a capacity provider strategy can have a <i>base</i> defined.
     * </p>
     * 
     * @return The <i>base</i> value designates how many tasks, at a minimum, to run on the specified capacity provider.
     *         Only one capacity provider in a capacity provider strategy can have a <i>base</i> defined.
     */

    public Integer getBase() {
        return this.base;
    }

    /**
     * <p>
     * The <i>base</i> value designates how many tasks, at a minimum, to run on the specified capacity provider. Only
     * one capacity provider in a capacity provider strategy can have a <i>base</i> defined.
     * </p>
     * 
     * @param base
     *        The <i>base</i> value designates how many tasks, at a minimum, to run on the specified capacity provider.
     *        Only one capacity provider in a capacity provider strategy can have a <i>base</i> defined.
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
        com.amazonaws.services.ecs.model.transform.CapacityProviderStrategyItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
