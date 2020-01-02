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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the strategy for using unused Capacity Reservations for fulfilling On-Demand capacity.
 * </p>
 * <note>
 * <p>
 * This strategy can only be used if the EC2 Fleet is of type <code>instant</code>.
 * </p>
 * </note>
 * <p>
 * For more information about Capacity Reservations, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-capacity-reservations.html">On-Demand Capacity
 * Reservations</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>. For examples of using Capacity Reservations
 * in an EC2 Fleet, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-examples.html">EC2 Fleet
 * Example Configurations</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CapacityReservationOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityReservationOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>use-capacity-reservations-first</code>, the fleet uses unused Capacity Reservations to
     * fulfill On-Demand capacity up to the target On-Demand capacity. If multiple instance pools have unused Capacity
     * Reservations, the On-Demand allocation strategy (<code>lowest-price</code> or <code>prioritized</code>) is
     * applied. If the number of unused Capacity Reservations is less than the On-Demand target capacity, the remaining
     * On-Demand target capacity is launched according to the On-Demand allocation strategy (<code>lowest-price</code>
     * or <code>prioritized</code>).
     * </p>
     * <p>
     * If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand
     * allocation strategy.
     * </p>
     */
    private String usageStrategy;

    /**
     * <p>
     * Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>use-capacity-reservations-first</code>, the fleet uses unused Capacity Reservations to
     * fulfill On-Demand capacity up to the target On-Demand capacity. If multiple instance pools have unused Capacity
     * Reservations, the On-Demand allocation strategy (<code>lowest-price</code> or <code>prioritized</code>) is
     * applied. If the number of unused Capacity Reservations is less than the On-Demand target capacity, the remaining
     * On-Demand target capacity is launched according to the On-Demand allocation strategy (<code>lowest-price</code>
     * or <code>prioritized</code>).
     * </p>
     * <p>
     * If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand
     * allocation strategy.
     * </p>
     * 
     * @param usageStrategy
     *        Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity.</p>
     *        <p>
     *        If you specify <code>use-capacity-reservations-first</code>, the fleet uses unused Capacity Reservations
     *        to fulfill On-Demand capacity up to the target On-Demand capacity. If multiple instance pools have unused
     *        Capacity Reservations, the On-Demand allocation strategy (<code>lowest-price</code> or
     *        <code>prioritized</code>) is applied. If the number of unused Capacity Reservations is less than the
     *        On-Demand target capacity, the remaining On-Demand target capacity is launched according to the On-Demand
     *        allocation strategy (<code>lowest-price</code> or <code>prioritized</code>).
     *        </p>
     *        <p>
     *        If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand
     *        allocation strategy.
     * @see FleetCapacityReservationUsageStrategy
     */

    public void setUsageStrategy(String usageStrategy) {
        this.usageStrategy = usageStrategy;
    }

    /**
     * <p>
     * Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>use-capacity-reservations-first</code>, the fleet uses unused Capacity Reservations to
     * fulfill On-Demand capacity up to the target On-Demand capacity. If multiple instance pools have unused Capacity
     * Reservations, the On-Demand allocation strategy (<code>lowest-price</code> or <code>prioritized</code>) is
     * applied. If the number of unused Capacity Reservations is less than the On-Demand target capacity, the remaining
     * On-Demand target capacity is launched according to the On-Demand allocation strategy (<code>lowest-price</code>
     * or <code>prioritized</code>).
     * </p>
     * <p>
     * If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand
     * allocation strategy.
     * </p>
     * 
     * @return Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity.</p>
     *         <p>
     *         If you specify <code>use-capacity-reservations-first</code>, the fleet uses unused Capacity Reservations
     *         to fulfill On-Demand capacity up to the target On-Demand capacity. If multiple instance pools have unused
     *         Capacity Reservations, the On-Demand allocation strategy (<code>lowest-price</code> or
     *         <code>prioritized</code>) is applied. If the number of unused Capacity Reservations is less than the
     *         On-Demand target capacity, the remaining On-Demand target capacity is launched according to the On-Demand
     *         allocation strategy (<code>lowest-price</code> or <code>prioritized</code>).
     *         </p>
     *         <p>
     *         If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand
     *         allocation strategy.
     * @see FleetCapacityReservationUsageStrategy
     */

    public String getUsageStrategy() {
        return this.usageStrategy;
    }

    /**
     * <p>
     * Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>use-capacity-reservations-first</code>, the fleet uses unused Capacity Reservations to
     * fulfill On-Demand capacity up to the target On-Demand capacity. If multiple instance pools have unused Capacity
     * Reservations, the On-Demand allocation strategy (<code>lowest-price</code> or <code>prioritized</code>) is
     * applied. If the number of unused Capacity Reservations is less than the On-Demand target capacity, the remaining
     * On-Demand target capacity is launched according to the On-Demand allocation strategy (<code>lowest-price</code>
     * or <code>prioritized</code>).
     * </p>
     * <p>
     * If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand
     * allocation strategy.
     * </p>
     * 
     * @param usageStrategy
     *        Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity.</p>
     *        <p>
     *        If you specify <code>use-capacity-reservations-first</code>, the fleet uses unused Capacity Reservations
     *        to fulfill On-Demand capacity up to the target On-Demand capacity. If multiple instance pools have unused
     *        Capacity Reservations, the On-Demand allocation strategy (<code>lowest-price</code> or
     *        <code>prioritized</code>) is applied. If the number of unused Capacity Reservations is less than the
     *        On-Demand target capacity, the remaining On-Demand target capacity is launched according to the On-Demand
     *        allocation strategy (<code>lowest-price</code> or <code>prioritized</code>).
     *        </p>
     *        <p>
     *        If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand
     *        allocation strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetCapacityReservationUsageStrategy
     */

    public CapacityReservationOptions withUsageStrategy(String usageStrategy) {
        setUsageStrategy(usageStrategy);
        return this;
    }

    /**
     * <p>
     * Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>use-capacity-reservations-first</code>, the fleet uses unused Capacity Reservations to
     * fulfill On-Demand capacity up to the target On-Demand capacity. If multiple instance pools have unused Capacity
     * Reservations, the On-Demand allocation strategy (<code>lowest-price</code> or <code>prioritized</code>) is
     * applied. If the number of unused Capacity Reservations is less than the On-Demand target capacity, the remaining
     * On-Demand target capacity is launched according to the On-Demand allocation strategy (<code>lowest-price</code>
     * or <code>prioritized</code>).
     * </p>
     * <p>
     * If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand
     * allocation strategy.
     * </p>
     * 
     * @param usageStrategy
     *        Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity.</p>
     *        <p>
     *        If you specify <code>use-capacity-reservations-first</code>, the fleet uses unused Capacity Reservations
     *        to fulfill On-Demand capacity up to the target On-Demand capacity. If multiple instance pools have unused
     *        Capacity Reservations, the On-Demand allocation strategy (<code>lowest-price</code> or
     *        <code>prioritized</code>) is applied. If the number of unused Capacity Reservations is less than the
     *        On-Demand target capacity, the remaining On-Demand target capacity is launched according to the On-Demand
     *        allocation strategy (<code>lowest-price</code> or <code>prioritized</code>).
     *        </p>
     *        <p>
     *        If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand
     *        allocation strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetCapacityReservationUsageStrategy
     */

    public CapacityReservationOptions withUsageStrategy(FleetCapacityReservationUsageStrategy usageStrategy) {
        this.usageStrategy = usageStrategy.toString();
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
        if (getUsageStrategy() != null)
            sb.append("UsageStrategy: ").append(getUsageStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityReservationOptions == false)
            return false;
        CapacityReservationOptions other = (CapacityReservationOptions) obj;
        if (other.getUsageStrategy() == null ^ this.getUsageStrategy() == null)
            return false;
        if (other.getUsageStrategy() != null && other.getUsageStrategy().equals(this.getUsageStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsageStrategy() == null) ? 0 : getUsageStrategy().hashCode());
        return hashCode;
    }

    @Override
    public CapacityReservationOptions clone() {
        try {
            return (CapacityReservationOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
