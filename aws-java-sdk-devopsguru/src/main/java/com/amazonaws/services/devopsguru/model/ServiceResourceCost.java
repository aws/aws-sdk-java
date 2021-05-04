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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains information about the estimated monthly cost to analyze an AWS resource. For more
 * information, see <a href="https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html">Estimate your
 * Amazon DevOps Guru costs</a> and <a href="http://aws.amazon.com/devops-guru/pricing/">Amazon DevOps Guru pricing</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ServiceResourceCost" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceResourceCost implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the AWS resource.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The state of the resource. The resource is <code>ACTIVE</code> if it produces metrics, events, or logs within an
     * hour, otherwise it is <code>INACTIVE</code>. You pay for the number of active AWS resource hours analyzed for
     * each resource. Inactive resources are not charged.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The number of active resources analyzed for this service to create a monthly cost estimate.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The price per hour to analyze the resources in the service. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html">Estimate your Amazon DevOps
     * Guru costs</a> and <a href="http://aws.amazon.com/devops-guru/pricing/">Amazon DevOps Guru pricing</a>.
     * </p>
     */
    private Double unitCost;
    /**
     * <p>
     * The total estimated monthly cost to analyze the active resources for this resource.
     * </p>
     */
    private Double cost;

    /**
     * <p>
     * The type of the AWS resource.
     * </p>
     * 
     * @param type
     *        The type of the AWS resource.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the AWS resource.
     * </p>
     * 
     * @return The type of the AWS resource.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the AWS resource.
     * </p>
     * 
     * @param type
     *        The type of the AWS resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceResourceCost withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The state of the resource. The resource is <code>ACTIVE</code> if it produces metrics, events, or logs within an
     * hour, otherwise it is <code>INACTIVE</code>. You pay for the number of active AWS resource hours analyzed for
     * each resource. Inactive resources are not charged.
     * </p>
     * 
     * @param state
     *        The state of the resource. The resource is <code>ACTIVE</code> if it produces metrics, events, or logs
     *        within an hour, otherwise it is <code>INACTIVE</code>. You pay for the number of active AWS resource hours
     *        analyzed for each resource. Inactive resources are not charged.
     * @see CostEstimationServiceResourceState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the resource. The resource is <code>ACTIVE</code> if it produces metrics, events, or logs within an
     * hour, otherwise it is <code>INACTIVE</code>. You pay for the number of active AWS resource hours analyzed for
     * each resource. Inactive resources are not charged.
     * </p>
     * 
     * @return The state of the resource. The resource is <code>ACTIVE</code> if it produces metrics, events, or logs
     *         within an hour, otherwise it is <code>INACTIVE</code>. You pay for the number of active AWS resource
     *         hours analyzed for each resource. Inactive resources are not charged.
     * @see CostEstimationServiceResourceState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the resource. The resource is <code>ACTIVE</code> if it produces metrics, events, or logs within an
     * hour, otherwise it is <code>INACTIVE</code>. You pay for the number of active AWS resource hours analyzed for
     * each resource. Inactive resources are not charged.
     * </p>
     * 
     * @param state
     *        The state of the resource. The resource is <code>ACTIVE</code> if it produces metrics, events, or logs
     *        within an hour, otherwise it is <code>INACTIVE</code>. You pay for the number of active AWS resource hours
     *        analyzed for each resource. Inactive resources are not charged.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostEstimationServiceResourceState
     */

    public ServiceResourceCost withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the resource. The resource is <code>ACTIVE</code> if it produces metrics, events, or logs within an
     * hour, otherwise it is <code>INACTIVE</code>. You pay for the number of active AWS resource hours analyzed for
     * each resource. Inactive resources are not charged.
     * </p>
     * 
     * @param state
     *        The state of the resource. The resource is <code>ACTIVE</code> if it produces metrics, events, or logs
     *        within an hour, otherwise it is <code>INACTIVE</code>. You pay for the number of active AWS resource hours
     *        analyzed for each resource. Inactive resources are not charged.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostEstimationServiceResourceState
     */

    public ServiceResourceCost withState(CostEstimationServiceResourceState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The number of active resources analyzed for this service to create a monthly cost estimate.
     * </p>
     * 
     * @param count
     *        The number of active resources analyzed for this service to create a monthly cost estimate.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of active resources analyzed for this service to create a monthly cost estimate.
     * </p>
     * 
     * @return The number of active resources analyzed for this service to create a monthly cost estimate.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of active resources analyzed for this service to create a monthly cost estimate.
     * </p>
     * 
     * @param count
     *        The number of active resources analyzed for this service to create a monthly cost estimate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceResourceCost withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The price per hour to analyze the resources in the service. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html">Estimate your Amazon DevOps
     * Guru costs</a> and <a href="http://aws.amazon.com/devops-guru/pricing/">Amazon DevOps Guru pricing</a>.
     * </p>
     * 
     * @param unitCost
     *        The price per hour to analyze the resources in the service. For more information, see <a
     *        href="https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html">Estimate your Amazon
     *        DevOps Guru costs</a> and <a href="http://aws.amazon.com/devops-guru/pricing/">Amazon DevOps Guru
     *        pricing</a>.
     */

    public void setUnitCost(Double unitCost) {
        this.unitCost = unitCost;
    }

    /**
     * <p>
     * The price per hour to analyze the resources in the service. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html">Estimate your Amazon DevOps
     * Guru costs</a> and <a href="http://aws.amazon.com/devops-guru/pricing/">Amazon DevOps Guru pricing</a>.
     * </p>
     * 
     * @return The price per hour to analyze the resources in the service. For more information, see <a
     *         href="https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html">Estimate your Amazon
     *         DevOps Guru costs</a> and <a href="http://aws.amazon.com/devops-guru/pricing/">Amazon DevOps Guru
     *         pricing</a>.
     */

    public Double getUnitCost() {
        return this.unitCost;
    }

    /**
     * <p>
     * The price per hour to analyze the resources in the service. For more information, see <a
     * href="https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html">Estimate your Amazon DevOps
     * Guru costs</a> and <a href="http://aws.amazon.com/devops-guru/pricing/">Amazon DevOps Guru pricing</a>.
     * </p>
     * 
     * @param unitCost
     *        The price per hour to analyze the resources in the service. For more information, see <a
     *        href="https://docs.aws.amazon.com/devops-guru/latest/userguide/cost-estimate.html">Estimate your Amazon
     *        DevOps Guru costs</a> and <a href="http://aws.amazon.com/devops-guru/pricing/">Amazon DevOps Guru
     *        pricing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceResourceCost withUnitCost(Double unitCost) {
        setUnitCost(unitCost);
        return this;
    }

    /**
     * <p>
     * The total estimated monthly cost to analyze the active resources for this resource.
     * </p>
     * 
     * @param cost
     *        The total estimated monthly cost to analyze the active resources for this resource.
     */

    public void setCost(Double cost) {
        this.cost = cost;
    }

    /**
     * <p>
     * The total estimated monthly cost to analyze the active resources for this resource.
     * </p>
     * 
     * @return The total estimated monthly cost to analyze the active resources for this resource.
     */

    public Double getCost() {
        return this.cost;
    }

    /**
     * <p>
     * The total estimated monthly cost to analyze the active resources for this resource.
     * </p>
     * 
     * @param cost
     *        The total estimated monthly cost to analyze the active resources for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceResourceCost withCost(Double cost) {
        setCost(cost);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getUnitCost() != null)
            sb.append("UnitCost: ").append(getUnitCost()).append(",");
        if (getCost() != null)
            sb.append("Cost: ").append(getCost());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceResourceCost == false)
            return false;
        ServiceResourceCost other = (ServiceResourceCost) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getUnitCost() == null ^ this.getUnitCost() == null)
            return false;
        if (other.getUnitCost() != null && other.getUnitCost().equals(this.getUnitCost()) == false)
            return false;
        if (other.getCost() == null ^ this.getCost() == null)
            return false;
        if (other.getCost() != null && other.getCost().equals(this.getCost()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getUnitCost() == null) ? 0 : getUnitCost().hashCode());
        hashCode = prime * hashCode + ((getCost() == null) ? 0 : getCost().hashCode());
        return hashCode;
    }

    @Override
    public ServiceResourceCost clone() {
        try {
            return (ServiceResourceCost) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.ServiceResourceCostMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
