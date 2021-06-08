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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The strategies for managing your Spot Instances that are at an elevated risk of being interrupted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FleetSpotMaintenanceStrategiesRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetSpotMaintenanceStrategiesRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated risk of being
     * interrupted.
     * </p>
     */
    private FleetSpotCapacityRebalanceRequest capacityRebalance;

    /**
     * <p>
     * The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated risk of being
     * interrupted.
     * </p>
     * 
     * @param capacityRebalance
     *        The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated risk of being
     *        interrupted.
     */

    public void setCapacityRebalance(FleetSpotCapacityRebalanceRequest capacityRebalance) {
        this.capacityRebalance = capacityRebalance;
    }

    /**
     * <p>
     * The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated risk of being
     * interrupted.
     * </p>
     * 
     * @return The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated risk of
     *         being interrupted.
     */

    public FleetSpotCapacityRebalanceRequest getCapacityRebalance() {
        return this.capacityRebalance;
    }

    /**
     * <p>
     * The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated risk of being
     * interrupted.
     * </p>
     * 
     * @param capacityRebalance
     *        The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated risk of being
     *        interrupted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSpotMaintenanceStrategiesRequest withCapacityRebalance(FleetSpotCapacityRebalanceRequest capacityRebalance) {
        setCapacityRebalance(capacityRebalance);
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
        if (getCapacityRebalance() != null)
            sb.append("CapacityRebalance: ").append(getCapacityRebalance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetSpotMaintenanceStrategiesRequest == false)
            return false;
        FleetSpotMaintenanceStrategiesRequest other = (FleetSpotMaintenanceStrategiesRequest) obj;
        if (other.getCapacityRebalance() == null ^ this.getCapacityRebalance() == null)
            return false;
        if (other.getCapacityRebalance() != null && other.getCapacityRebalance().equals(this.getCapacityRebalance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityRebalance() == null) ? 0 : getCapacityRebalance().hashCode());
        return hashCode;
    }

    @Override
    public FleetSpotMaintenanceStrategiesRequest clone() {
        try {
            return (FleetSpotMaintenanceStrategiesRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
