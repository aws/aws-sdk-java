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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The launch specification for On-Demand Instances in the instance fleet, which determines the allocation strategy.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
 * On-Demand Instances allocation strategy is available in Amazon EMR version 5.12.1 and later.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/OnDemandProvisioningSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OnDemandProvisioningSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the strategy to use in launching On-Demand instance fleets. Currently, the only option is
     * <code>lowest-price</code> (the default), which launches the lowest price first.
     * </p>
     */
    private String allocationStrategy;
    /**
     * <p>
     * The launch specification for On-Demand instances in the instance fleet, which determines the allocation strategy.
     * </p>
     */
    private OnDemandCapacityReservationOptions capacityReservationOptions;

    /**
     * <p>
     * Specifies the strategy to use in launching On-Demand instance fleets. Currently, the only option is
     * <code>lowest-price</code> (the default), which launches the lowest price first.
     * </p>
     * 
     * @param allocationStrategy
     *        Specifies the strategy to use in launching On-Demand instance fleets. Currently, the only option is
     *        <code>lowest-price</code> (the default), which launches the lowest price first.
     * @see OnDemandProvisioningAllocationStrategy
     */

    public void setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    /**
     * <p>
     * Specifies the strategy to use in launching On-Demand instance fleets. Currently, the only option is
     * <code>lowest-price</code> (the default), which launches the lowest price first.
     * </p>
     * 
     * @return Specifies the strategy to use in launching On-Demand instance fleets. Currently, the only option is
     *         <code>lowest-price</code> (the default), which launches the lowest price first.
     * @see OnDemandProvisioningAllocationStrategy
     */

    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    /**
     * <p>
     * Specifies the strategy to use in launching On-Demand instance fleets. Currently, the only option is
     * <code>lowest-price</code> (the default), which launches the lowest price first.
     * </p>
     * 
     * @param allocationStrategy
     *        Specifies the strategy to use in launching On-Demand instance fleets. Currently, the only option is
     *        <code>lowest-price</code> (the default), which launches the lowest price first.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnDemandProvisioningAllocationStrategy
     */

    public OnDemandProvisioningSpecification withAllocationStrategy(String allocationStrategy) {
        setAllocationStrategy(allocationStrategy);
        return this;
    }

    /**
     * <p>
     * Specifies the strategy to use in launching On-Demand instance fleets. Currently, the only option is
     * <code>lowest-price</code> (the default), which launches the lowest price first.
     * </p>
     * 
     * @param allocationStrategy
     *        Specifies the strategy to use in launching On-Demand instance fleets. Currently, the only option is
     *        <code>lowest-price</code> (the default), which launches the lowest price first.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnDemandProvisioningAllocationStrategy
     */

    public OnDemandProvisioningSpecification withAllocationStrategy(OnDemandProvisioningAllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The launch specification for On-Demand instances in the instance fleet, which determines the allocation strategy.
     * </p>
     * 
     * @param capacityReservationOptions
     *        The launch specification for On-Demand instances in the instance fleet, which determines the allocation
     *        strategy.
     */

    public void setCapacityReservationOptions(OnDemandCapacityReservationOptions capacityReservationOptions) {
        this.capacityReservationOptions = capacityReservationOptions;
    }

    /**
     * <p>
     * The launch specification for On-Demand instances in the instance fleet, which determines the allocation strategy.
     * </p>
     * 
     * @return The launch specification for On-Demand instances in the instance fleet, which determines the allocation
     *         strategy.
     */

    public OnDemandCapacityReservationOptions getCapacityReservationOptions() {
        return this.capacityReservationOptions;
    }

    /**
     * <p>
     * The launch specification for On-Demand instances in the instance fleet, which determines the allocation strategy.
     * </p>
     * 
     * @param capacityReservationOptions
     *        The launch specification for On-Demand instances in the instance fleet, which determines the allocation
     *        strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OnDemandProvisioningSpecification withCapacityReservationOptions(OnDemandCapacityReservationOptions capacityReservationOptions) {
        setCapacityReservationOptions(capacityReservationOptions);
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
        if (getAllocationStrategy() != null)
            sb.append("AllocationStrategy: ").append(getAllocationStrategy()).append(",");
        if (getCapacityReservationOptions() != null)
            sb.append("CapacityReservationOptions: ").append(getCapacityReservationOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnDemandProvisioningSpecification == false)
            return false;
        OnDemandProvisioningSpecification other = (OnDemandProvisioningSpecification) obj;
        if (other.getAllocationStrategy() == null ^ this.getAllocationStrategy() == null)
            return false;
        if (other.getAllocationStrategy() != null && other.getAllocationStrategy().equals(this.getAllocationStrategy()) == false)
            return false;
        if (other.getCapacityReservationOptions() == null ^ this.getCapacityReservationOptions() == null)
            return false;
        if (other.getCapacityReservationOptions() != null && other.getCapacityReservationOptions().equals(this.getCapacityReservationOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocationStrategy() == null) ? 0 : getAllocationStrategy().hashCode());
        hashCode = prime * hashCode + ((getCapacityReservationOptions() == null) ? 0 : getCapacityReservationOptions().hashCode());
        return hashCode;
    }

    @Override
    public OnDemandProvisioningSpecification clone() {
        try {
            return (OnDemandProvisioningSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.OnDemandProvisioningSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
