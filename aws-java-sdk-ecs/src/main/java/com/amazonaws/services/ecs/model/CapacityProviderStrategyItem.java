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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a capacity provider strategy. A capacity provider strategy can be set when using the <a>RunTask</a> or
 * <a>CreateCluster</a> APIs or as the default capacity provider strategy for a cluster with the <a>CreateCluster</a>
 * API.
 * </p>
 * <p>
 * Only capacity providers that are already associated with a cluster and have an <code>ACTIVE</code> or
 * <code>UPDATING</code> status can be used in a capacity provider strategy. The <a>PutClusterCapacityProviders</a> API
 * is used to associate a capacity provider with a cluster.
 * </p>
 * <p>
 * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created. New
 * Auto Scaling group capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
 * </p>
 * <p>
 * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code> capacity
 * providers. The AWS Fargate capacity providers are available to all accounts and only need to be associated with a
 * cluster to be used in a capacity provider strategy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/CapacityProviderStrategyItem" target="_top">AWS
 *      API Documentation</a>
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
     * The <i>weight</i> value designates the relative percentage of the total number of tasks launched that should use
     * the specified capacity provider. The <code>weight</code> value is taken into consideration after the
     * <code>base</code> value, if defined, is satisfied.
     * </p>
     * <p>
     * If no <code>weight</code> value is specified, the default value of <code>0</code> is used. When multiple capacity
     * providers are specified within a capacity provider strategy, at least one of the capacity providers must have a
     * weight value greater than zero and any capacity providers with a weight of <code>0</code> will not be used to
     * place tasks. If you specify multiple capacity providers in a strategy that all have a weight of <code>0</code>,
     * any <code>RunTask</code> or <code>CreateService</code> actions using the capacity provider strategy will fail.
     * </p>
     * <p>
     * An example scenario for using weights is defining a strategy that contains two capacity providers and both have a
     * weight of <code>1</code>, then when the <code>base</code> is satisfied, the tasks will be split evenly across the
     * two capacity providers. Using that same logic, if you specify a weight of <code>1</code> for
     * <i>capacityProviderA</i> and a weight of <code>4</code> for <i>capacityProviderB</i>, then for every one task
     * that is run using <i>capacityProviderA</i>, four tasks would use <i>capacityProviderB</i>.
     * </p>
     */
    private Integer weight;
    /**
     * <p>
     * The <i>base</i> value designates how many tasks, at a minimum, to run on the specified capacity provider. Only
     * one capacity provider in a capacity provider strategy can have a <i>base</i> defined. If no value is specified,
     * the default value of <code>0</code> is used.
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
     * The <i>weight</i> value designates the relative percentage of the total number of tasks launched that should use
     * the specified capacity provider. The <code>weight</code> value is taken into consideration after the
     * <code>base</code> value, if defined, is satisfied.
     * </p>
     * <p>
     * If no <code>weight</code> value is specified, the default value of <code>0</code> is used. When multiple capacity
     * providers are specified within a capacity provider strategy, at least one of the capacity providers must have a
     * weight value greater than zero and any capacity providers with a weight of <code>0</code> will not be used to
     * place tasks. If you specify multiple capacity providers in a strategy that all have a weight of <code>0</code>,
     * any <code>RunTask</code> or <code>CreateService</code> actions using the capacity provider strategy will fail.
     * </p>
     * <p>
     * An example scenario for using weights is defining a strategy that contains two capacity providers and both have a
     * weight of <code>1</code>, then when the <code>base</code> is satisfied, the tasks will be split evenly across the
     * two capacity providers. Using that same logic, if you specify a weight of <code>1</code> for
     * <i>capacityProviderA</i> and a weight of <code>4</code> for <i>capacityProviderB</i>, then for every one task
     * that is run using <i>capacityProviderA</i>, four tasks would use <i>capacityProviderB</i>.
     * </p>
     * 
     * @param weight
     *        The <i>weight</i> value designates the relative percentage of the total number of tasks launched that
     *        should use the specified capacity provider. The <code>weight</code> value is taken into consideration
     *        after the <code>base</code> value, if defined, is satisfied.</p>
     *        <p>
     *        If no <code>weight</code> value is specified, the default value of <code>0</code> is used. When multiple
     *        capacity providers are specified within a capacity provider strategy, at least one of the capacity
     *        providers must have a weight value greater than zero and any capacity providers with a weight of
     *        <code>0</code> will not be used to place tasks. If you specify multiple capacity providers in a strategy
     *        that all have a weight of <code>0</code>, any <code>RunTask</code> or <code>CreateService</code> actions
     *        using the capacity provider strategy will fail.
     *        </p>
     *        <p>
     *        An example scenario for using weights is defining a strategy that contains two capacity providers and both
     *        have a weight of <code>1</code>, then when the <code>base</code> is satisfied, the tasks will be split
     *        evenly across the two capacity providers. Using that same logic, if you specify a weight of <code>1</code>
     *        for <i>capacityProviderA</i> and a weight of <code>4</code> for <i>capacityProviderB</i>, then for every
     *        one task that is run using <i>capacityProviderA</i>, four tasks would use <i>capacityProviderB</i>.
     */

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The <i>weight</i> value designates the relative percentage of the total number of tasks launched that should use
     * the specified capacity provider. The <code>weight</code> value is taken into consideration after the
     * <code>base</code> value, if defined, is satisfied.
     * </p>
     * <p>
     * If no <code>weight</code> value is specified, the default value of <code>0</code> is used. When multiple capacity
     * providers are specified within a capacity provider strategy, at least one of the capacity providers must have a
     * weight value greater than zero and any capacity providers with a weight of <code>0</code> will not be used to
     * place tasks. If you specify multiple capacity providers in a strategy that all have a weight of <code>0</code>,
     * any <code>RunTask</code> or <code>CreateService</code> actions using the capacity provider strategy will fail.
     * </p>
     * <p>
     * An example scenario for using weights is defining a strategy that contains two capacity providers and both have a
     * weight of <code>1</code>, then when the <code>base</code> is satisfied, the tasks will be split evenly across the
     * two capacity providers. Using that same logic, if you specify a weight of <code>1</code> for
     * <i>capacityProviderA</i> and a weight of <code>4</code> for <i>capacityProviderB</i>, then for every one task
     * that is run using <i>capacityProviderA</i>, four tasks would use <i>capacityProviderB</i>.
     * </p>
     * 
     * @return The <i>weight</i> value designates the relative percentage of the total number of tasks launched that
     *         should use the specified capacity provider. The <code>weight</code> value is taken into consideration
     *         after the <code>base</code> value, if defined, is satisfied.</p>
     *         <p>
     *         If no <code>weight</code> value is specified, the default value of <code>0</code> is used. When multiple
     *         capacity providers are specified within a capacity provider strategy, at least one of the capacity
     *         providers must have a weight value greater than zero and any capacity providers with a weight of
     *         <code>0</code> will not be used to place tasks. If you specify multiple capacity providers in a strategy
     *         that all have a weight of <code>0</code>, any <code>RunTask</code> or <code>CreateService</code> actions
     *         using the capacity provider strategy will fail.
     *         </p>
     *         <p>
     *         An example scenario for using weights is defining a strategy that contains two capacity providers and
     *         both have a weight of <code>1</code>, then when the <code>base</code> is satisfied, the tasks will be
     *         split evenly across the two capacity providers. Using that same logic, if you specify a weight of
     *         <code>1</code> for <i>capacityProviderA</i> and a weight of <code>4</code> for <i>capacityProviderB</i>,
     *         then for every one task that is run using <i>capacityProviderA</i>, four tasks would use
     *         <i>capacityProviderB</i>.
     */

    public Integer getWeight() {
        return this.weight;
    }

    /**
     * <p>
     * The <i>weight</i> value designates the relative percentage of the total number of tasks launched that should use
     * the specified capacity provider. The <code>weight</code> value is taken into consideration after the
     * <code>base</code> value, if defined, is satisfied.
     * </p>
     * <p>
     * If no <code>weight</code> value is specified, the default value of <code>0</code> is used. When multiple capacity
     * providers are specified within a capacity provider strategy, at least one of the capacity providers must have a
     * weight value greater than zero and any capacity providers with a weight of <code>0</code> will not be used to
     * place tasks. If you specify multiple capacity providers in a strategy that all have a weight of <code>0</code>,
     * any <code>RunTask</code> or <code>CreateService</code> actions using the capacity provider strategy will fail.
     * </p>
     * <p>
     * An example scenario for using weights is defining a strategy that contains two capacity providers and both have a
     * weight of <code>1</code>, then when the <code>base</code> is satisfied, the tasks will be split evenly across the
     * two capacity providers. Using that same logic, if you specify a weight of <code>1</code> for
     * <i>capacityProviderA</i> and a weight of <code>4</code> for <i>capacityProviderB</i>, then for every one task
     * that is run using <i>capacityProviderA</i>, four tasks would use <i>capacityProviderB</i>.
     * </p>
     * 
     * @param weight
     *        The <i>weight</i> value designates the relative percentage of the total number of tasks launched that
     *        should use the specified capacity provider. The <code>weight</code> value is taken into consideration
     *        after the <code>base</code> value, if defined, is satisfied.</p>
     *        <p>
     *        If no <code>weight</code> value is specified, the default value of <code>0</code> is used. When multiple
     *        capacity providers are specified within a capacity provider strategy, at least one of the capacity
     *        providers must have a weight value greater than zero and any capacity providers with a weight of
     *        <code>0</code> will not be used to place tasks. If you specify multiple capacity providers in a strategy
     *        that all have a weight of <code>0</code>, any <code>RunTask</code> or <code>CreateService</code> actions
     *        using the capacity provider strategy will fail.
     *        </p>
     *        <p>
     *        An example scenario for using weights is defining a strategy that contains two capacity providers and both
     *        have a weight of <code>1</code>, then when the <code>base</code> is satisfied, the tasks will be split
     *        evenly across the two capacity providers. Using that same logic, if you specify a weight of <code>1</code>
     *        for <i>capacityProviderA</i> and a weight of <code>4</code> for <i>capacityProviderB</i>, then for every
     *        one task that is run using <i>capacityProviderA</i>, four tasks would use <i>capacityProviderB</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityProviderStrategyItem withWeight(Integer weight) {
        setWeight(weight);
        return this;
    }

    /**
     * <p>
     * The <i>base</i> value designates how many tasks, at a minimum, to run on the specified capacity provider. Only
     * one capacity provider in a capacity provider strategy can have a <i>base</i> defined. If no value is specified,
     * the default value of <code>0</code> is used.
     * </p>
     * 
     * @param base
     *        The <i>base</i> value designates how many tasks, at a minimum, to run on the specified capacity provider.
     *        Only one capacity provider in a capacity provider strategy can have a <i>base</i> defined. If no value is
     *        specified, the default value of <code>0</code> is used.
     */

    public void setBase(Integer base) {
        this.base = base;
    }

    /**
     * <p>
     * The <i>base</i> value designates how many tasks, at a minimum, to run on the specified capacity provider. Only
     * one capacity provider in a capacity provider strategy can have a <i>base</i> defined. If no value is specified,
     * the default value of <code>0</code> is used.
     * </p>
     * 
     * @return The <i>base</i> value designates how many tasks, at a minimum, to run on the specified capacity provider.
     *         Only one capacity provider in a capacity provider strategy can have a <i>base</i> defined. If no value is
     *         specified, the default value of <code>0</code> is used.
     */

    public Integer getBase() {
        return this.base;
    }

    /**
     * <p>
     * The <i>base</i> value designates how many tasks, at a minimum, to run on the specified capacity provider. Only
     * one capacity provider in a capacity provider strategy can have a <i>base</i> defined. If no value is specified,
     * the default value of <code>0</code> is used.
     * </p>
     * 
     * @param base
     *        The <i>base</i> value designates how many tasks, at a minimum, to run on the specified capacity provider.
     *        Only one capacity provider in a capacity provider strategy can have a <i>base</i> defined. If no value is
     *        specified, the default value of <code>0</code> is used.
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
