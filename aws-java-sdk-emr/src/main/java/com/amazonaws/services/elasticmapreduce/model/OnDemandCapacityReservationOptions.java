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
 * Describes the strategy for using unused Capacity Reservations for fulfilling On-Demand capacity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/OnDemandCapacityReservationOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OnDemandCapacityReservationOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>use-capacity-reservations-first</code>, the fleet uses unused Capacity Reservations to
     * fulfill On-Demand capacity up to the target On-Demand capacity. If multiple instance pools have unused Capacity
     * Reservations, the On-Demand allocation strategy (<code>lowest-price</code>) is applied. If the number of unused
     * Capacity Reservations is less than the On-Demand target capacity, the remaining On-Demand target capacity is
     * launched according to the On-Demand allocation strategy (<code>lowest-price</code>).
     * </p>
     * <p>
     * If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand
     * allocation strategy.
     * </p>
     */
    private String usageStrategy;
    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any open Capacity Reservation that has matching attributes (instance
     * type, platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The instance
     * runs as an On-Demand Instance.
     * </p>
     * </li>
     * </ul>
     */
    private String capacityReservationPreference;

    /**
     * <p>
     * Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity.
     * </p>
     * <p>
     * If you specify <code>use-capacity-reservations-first</code>, the fleet uses unused Capacity Reservations to
     * fulfill On-Demand capacity up to the target On-Demand capacity. If multiple instance pools have unused Capacity
     * Reservations, the On-Demand allocation strategy (<code>lowest-price</code>) is applied. If the number of unused
     * Capacity Reservations is less than the On-Demand target capacity, the remaining On-Demand target capacity is
     * launched according to the On-Demand allocation strategy (<code>lowest-price</code>).
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
     *        Capacity Reservations, the On-Demand allocation strategy (<code>lowest-price</code>) is applied. If the
     *        number of unused Capacity Reservations is less than the On-Demand target capacity, the remaining On-Demand
     *        target capacity is launched according to the On-Demand allocation strategy (<code>lowest-price</code>).
     *        </p>
     *        <p>
     *        If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand
     *        allocation strategy.
     * @see OnDemandCapacityReservationUsageStrategy
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
     * Reservations, the On-Demand allocation strategy (<code>lowest-price</code>) is applied. If the number of unused
     * Capacity Reservations is less than the On-Demand target capacity, the remaining On-Demand target capacity is
     * launched according to the On-Demand allocation strategy (<code>lowest-price</code>).
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
     *         Capacity Reservations, the On-Demand allocation strategy (<code>lowest-price</code>) is applied. If the
     *         number of unused Capacity Reservations is less than the On-Demand target capacity, the remaining
     *         On-Demand target capacity is launched according to the On-Demand allocation strategy (
     *         <code>lowest-price</code>).
     *         </p>
     *         <p>
     *         If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand
     *         allocation strategy.
     * @see OnDemandCapacityReservationUsageStrategy
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
     * Reservations, the On-Demand allocation strategy (<code>lowest-price</code>) is applied. If the number of unused
     * Capacity Reservations is less than the On-Demand target capacity, the remaining On-Demand target capacity is
     * launched according to the On-Demand allocation strategy (<code>lowest-price</code>).
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
     *        Capacity Reservations, the On-Demand allocation strategy (<code>lowest-price</code>) is applied. If the
     *        number of unused Capacity Reservations is less than the On-Demand target capacity, the remaining On-Demand
     *        target capacity is launched according to the On-Demand allocation strategy (<code>lowest-price</code>).
     *        </p>
     *        <p>
     *        If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand
     *        allocation strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnDemandCapacityReservationUsageStrategy
     */

    public OnDemandCapacityReservationOptions withUsageStrategy(String usageStrategy) {
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
     * Reservations, the On-Demand allocation strategy (<code>lowest-price</code>) is applied. If the number of unused
     * Capacity Reservations is less than the On-Demand target capacity, the remaining On-Demand target capacity is
     * launched according to the On-Demand allocation strategy (<code>lowest-price</code>).
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
     *        Capacity Reservations, the On-Demand allocation strategy (<code>lowest-price</code>) is applied. If the
     *        number of unused Capacity Reservations is less than the On-Demand target capacity, the remaining On-Demand
     *        target capacity is launched according to the On-Demand allocation strategy (<code>lowest-price</code>).
     *        </p>
     *        <p>
     *        If you do not specify a value, the fleet fulfils the On-Demand capacity according to the chosen On-Demand
     *        allocation strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnDemandCapacityReservationUsageStrategy
     */

    public OnDemandCapacityReservationOptions withUsageStrategy(OnDemandCapacityReservationUsageStrategy usageStrategy) {
        this.usageStrategy = usageStrategy.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any open Capacity Reservation that has matching attributes (instance
     * type, platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The instance
     * runs as an On-Demand Instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capacityReservationPreference
     *        Indicates the instance's Capacity Reservation preferences. Possible preferences include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The instance can run in any open Capacity Reservation that has matching attributes
     *        (instance type, platform, Availability Zone).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The
     *        instance runs as an On-Demand Instance.
     *        </p>
     *        </li>
     * @see OnDemandCapacityReservationPreference
     */

    public void setCapacityReservationPreference(String capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference;
    }

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any open Capacity Reservation that has matching attributes (instance
     * type, platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The instance
     * runs as an On-Demand Instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates the instance's Capacity Reservation preferences. Possible preferences include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>open</code> - The instance can run in any open Capacity Reservation that has matching attributes
     *         (instance type, platform, Availability Zone).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The
     *         instance runs as an On-Demand Instance.
     *         </p>
     *         </li>
     * @see OnDemandCapacityReservationPreference
     */

    public String getCapacityReservationPreference() {
        return this.capacityReservationPreference;
    }

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any open Capacity Reservation that has matching attributes (instance
     * type, platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The instance
     * runs as an On-Demand Instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capacityReservationPreference
     *        Indicates the instance's Capacity Reservation preferences. Possible preferences include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The instance can run in any open Capacity Reservation that has matching attributes
     *        (instance type, platform, Availability Zone).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The
     *        instance runs as an On-Demand Instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnDemandCapacityReservationPreference
     */

    public OnDemandCapacityReservationOptions withCapacityReservationPreference(String capacityReservationPreference) {
        setCapacityReservationPreference(capacityReservationPreference);
        return this;
    }

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. Possible preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any open Capacity Reservation that has matching attributes (instance
     * type, platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The instance
     * runs as an On-Demand Instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capacityReservationPreference
     *        Indicates the instance's Capacity Reservation preferences. Possible preferences include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The instance can run in any open Capacity Reservation that has matching attributes
     *        (instance type, platform, Availability Zone).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The
     *        instance runs as an On-Demand Instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OnDemandCapacityReservationPreference
     */

    public OnDemandCapacityReservationOptions withCapacityReservationPreference(OnDemandCapacityReservationPreference capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference.toString();
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
            sb.append("UsageStrategy: ").append(getUsageStrategy()).append(",");
        if (getCapacityReservationPreference() != null)
            sb.append("CapacityReservationPreference: ").append(getCapacityReservationPreference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnDemandCapacityReservationOptions == false)
            return false;
        OnDemandCapacityReservationOptions other = (OnDemandCapacityReservationOptions) obj;
        if (other.getUsageStrategy() == null ^ this.getUsageStrategy() == null)
            return false;
        if (other.getUsageStrategy() != null && other.getUsageStrategy().equals(this.getUsageStrategy()) == false)
            return false;
        if (other.getCapacityReservationPreference() == null ^ this.getCapacityReservationPreference() == null)
            return false;
        if (other.getCapacityReservationPreference() != null
                && other.getCapacityReservationPreference().equals(this.getCapacityReservationPreference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsageStrategy() == null) ? 0 : getUsageStrategy().hashCode());
        hashCode = prime * hashCode + ((getCapacityReservationPreference() == null) ? 0 : getCapacityReservationPreference().hashCode());
        return hashCode;
    }

    @Override
    public OnDemandCapacityReservationOptions clone() {
        try {
            return (OnDemandCapacityReservationOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.OnDemandCapacityReservationOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
