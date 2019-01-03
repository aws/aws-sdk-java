/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the instance's Capacity Reservation targeting preferences. The action returns the
 * <code>capacityReservationPreference</code> response element if the instance is configured to run in On-Demand
 * capacity, or if it is configured in run in any <code>open</code> Capacity Reservation that has matching attributes
 * (instance type, platform, Availability Zone). The action returns the <code>capacityReservationTarget</code> response
 * element if the instance explicily targets a specific Capacity Reservation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CapacityReservationSpecificationResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityReservationSpecificationResponse implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the instance's Capacity Reservation preferences. Possible preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     * attributes (instance type, platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The instance
     * runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     */
    private String capacityReservationPreference;
    /**
     * <p>
     * Information about the targeted Capacity Reservation.
     * </p>
     */
    private CapacityReservationTargetResponse capacityReservationTarget;

    /**
     * <p>
     * Describes the instance's Capacity Reservation preferences. Possible preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     * attributes (instance type, platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The instance
     * runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capacityReservationPreference
     *        Describes the instance's Capacity Reservation preferences. Possible preferences include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     *        attributes (instance type, platform, Availability Zone).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The
     *        instance runs in On-Demand capacity.
     *        </p>
     *        </li>
     * @see CapacityReservationPreference
     */

    public void setCapacityReservationPreference(String capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference;
    }

    /**
     * <p>
     * Describes the instance's Capacity Reservation preferences. Possible preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     * attributes (instance type, platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The instance
     * runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the instance's Capacity Reservation preferences. Possible preferences include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     *         attributes (instance type, platform, Availability Zone).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The
     *         instance runs in On-Demand capacity.
     *         </p>
     *         </li>
     * @see CapacityReservationPreference
     */

    public String getCapacityReservationPreference() {
        return this.capacityReservationPreference;
    }

    /**
     * <p>
     * Describes the instance's Capacity Reservation preferences. Possible preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     * attributes (instance type, platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The instance
     * runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capacityReservationPreference
     *        Describes the instance's Capacity Reservation preferences. Possible preferences include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     *        attributes (instance type, platform, Availability Zone).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The
     *        instance runs in On-Demand capacity.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationPreference
     */

    public CapacityReservationSpecificationResponse withCapacityReservationPreference(String capacityReservationPreference) {
        setCapacityReservationPreference(capacityReservationPreference);
        return this;
    }

    /**
     * <p>
     * Describes the instance's Capacity Reservation preferences. Possible preferences include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     * attributes (instance type, platform, Availability Zone).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The instance
     * runs in On-Demand capacity.
     * </p>
     * </li>
     * </ul>
     * 
     * @param capacityReservationPreference
     *        Describes the instance's Capacity Reservation preferences. Possible preferences include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>open</code> - The instance can run in any <code>open</code> Capacity Reservation that has matching
     *        attributes (instance type, platform, Availability Zone).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>none</code> - The instance avoids running in a Capacity Reservation even if one is available. The
     *        instance runs in On-Demand capacity.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationPreference
     */

    public CapacityReservationSpecificationResponse withCapacityReservationPreference(CapacityReservationPreference capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference.toString();
        return this;
    }

    /**
     * <p>
     * Information about the targeted Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationTarget
     *        Information about the targeted Capacity Reservation.
     */

    public void setCapacityReservationTarget(CapacityReservationTargetResponse capacityReservationTarget) {
        this.capacityReservationTarget = capacityReservationTarget;
    }

    /**
     * <p>
     * Information about the targeted Capacity Reservation.
     * </p>
     * 
     * @return Information about the targeted Capacity Reservation.
     */

    public CapacityReservationTargetResponse getCapacityReservationTarget() {
        return this.capacityReservationTarget;
    }

    /**
     * <p>
     * Information about the targeted Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationTarget
     *        Information about the targeted Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservationSpecificationResponse withCapacityReservationTarget(CapacityReservationTargetResponse capacityReservationTarget) {
        setCapacityReservationTarget(capacityReservationTarget);
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
        if (getCapacityReservationPreference() != null)
            sb.append("CapacityReservationPreference: ").append(getCapacityReservationPreference()).append(",");
        if (getCapacityReservationTarget() != null)
            sb.append("CapacityReservationTarget: ").append(getCapacityReservationTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityReservationSpecificationResponse == false)
            return false;
        CapacityReservationSpecificationResponse other = (CapacityReservationSpecificationResponse) obj;
        if (other.getCapacityReservationPreference() == null ^ this.getCapacityReservationPreference() == null)
            return false;
        if (other.getCapacityReservationPreference() != null
                && other.getCapacityReservationPreference().equals(this.getCapacityReservationPreference()) == false)
            return false;
        if (other.getCapacityReservationTarget() == null ^ this.getCapacityReservationTarget() == null)
            return false;
        if (other.getCapacityReservationTarget() != null && other.getCapacityReservationTarget().equals(this.getCapacityReservationTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityReservationPreference() == null) ? 0 : getCapacityReservationPreference().hashCode());
        hashCode = prime * hashCode + ((getCapacityReservationTarget() == null) ? 0 : getCapacityReservationTarget().hashCode());
        return hashCode;
    }

    @Override
    public CapacityReservationSpecificationResponse clone() {
        try {
            return (CapacityReservationSpecificationResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
