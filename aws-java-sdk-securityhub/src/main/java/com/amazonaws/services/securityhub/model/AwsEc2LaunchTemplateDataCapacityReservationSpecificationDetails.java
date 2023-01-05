/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the Capacity Reservation targeting option of an Amazon EC2 instance.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. If equal to <code>open</code>, the instance can run in
     * any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone). If equal
     * to <code>none</code>, the instance avoids running in a Capacity Reservation even if one is available. The
     * instance runs in On-Demand capacity.
     * </p>
     */
    private String capacityReservationPreference;
    /**
     * <p>
     * Specifies a target Capacity Reservation.
     * </p>
     */
    private AwsEc2LaunchTemplateDataCapacityReservationSpecificationCapacityReservationTargetDetails capacityReservationTarget;

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. If equal to <code>open</code>, the instance can run in
     * any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone). If equal
     * to <code>none</code>, the instance avoids running in a Capacity Reservation even if one is available. The
     * instance runs in On-Demand capacity.
     * </p>
     * 
     * @param capacityReservationPreference
     *        Indicates the instance's Capacity Reservation preferences. If equal to <code>open</code>, the instance can
     *        run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability
     *        Zone). If equal to <code>none</code>, the instance avoids running in a Capacity Reservation even if one is
     *        available. The instance runs in On-Demand capacity.
     */

    public void setCapacityReservationPreference(String capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference;
    }

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. If equal to <code>open</code>, the instance can run in
     * any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone). If equal
     * to <code>none</code>, the instance avoids running in a Capacity Reservation even if one is available. The
     * instance runs in On-Demand capacity.
     * </p>
     * 
     * @return Indicates the instance's Capacity Reservation preferences. If equal to <code>open</code>, the instance
     *         can run in any open Capacity Reservation that has matching attributes (instance type, platform,
     *         Availability Zone). If equal to <code>none</code>, the instance avoids running in a Capacity Reservation
     *         even if one is available. The instance runs in On-Demand capacity.
     */

    public String getCapacityReservationPreference() {
        return this.capacityReservationPreference;
    }

    /**
     * <p>
     * Indicates the instance's Capacity Reservation preferences. If equal to <code>open</code>, the instance can run in
     * any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone). If equal
     * to <code>none</code>, the instance avoids running in a Capacity Reservation even if one is available. The
     * instance runs in On-Demand capacity.
     * </p>
     * 
     * @param capacityReservationPreference
     *        Indicates the instance's Capacity Reservation preferences. If equal to <code>open</code>, the instance can
     *        run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability
     *        Zone). If equal to <code>none</code>, the instance avoids running in a Capacity Reservation even if one is
     *        available. The instance runs in On-Demand capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails withCapacityReservationPreference(String capacityReservationPreference) {
        setCapacityReservationPreference(capacityReservationPreference);
        return this;
    }

    /**
     * <p>
     * Specifies a target Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationTarget
     *        Specifies a target Capacity Reservation.
     */

    public void setCapacityReservationTarget(AwsEc2LaunchTemplateDataCapacityReservationSpecificationCapacityReservationTargetDetails capacityReservationTarget) {
        this.capacityReservationTarget = capacityReservationTarget;
    }

    /**
     * <p>
     * Specifies a target Capacity Reservation.
     * </p>
     * 
     * @return Specifies a target Capacity Reservation.
     */

    public AwsEc2LaunchTemplateDataCapacityReservationSpecificationCapacityReservationTargetDetails getCapacityReservationTarget() {
        return this.capacityReservationTarget;
    }

    /**
     * <p>
     * Specifies a target Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationTarget
     *        Specifies a target Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails withCapacityReservationTarget(
            AwsEc2LaunchTemplateDataCapacityReservationSpecificationCapacityReservationTargetDetails capacityReservationTarget) {
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

        if (obj instanceof AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails == false)
            return false;
        AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails other = (AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails) obj;
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
    public AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails clone() {
        try {
            return (AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2LaunchTemplateDataCapacityReservationSpecificationDetailsMarshaller.getInstance().marshall(
                this, protocolMarshaller);
    }
}
