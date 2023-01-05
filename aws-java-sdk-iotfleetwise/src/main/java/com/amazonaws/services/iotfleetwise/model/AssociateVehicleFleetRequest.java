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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/AssociateVehicleFleet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateVehicleFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the vehicle to associate with the fleet.
     * </p>
     */
    private String vehicleName;
    /**
     * <p>
     * The ID of a fleet.
     * </p>
     */
    private String fleetId;

    /**
     * <p>
     * The unique ID of the vehicle to associate with the fleet.
     * </p>
     * 
     * @param vehicleName
     *        The unique ID of the vehicle to associate with the fleet.
     */

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    /**
     * <p>
     * The unique ID of the vehicle to associate with the fleet.
     * </p>
     * 
     * @return The unique ID of the vehicle to associate with the fleet.
     */

    public String getVehicleName() {
        return this.vehicleName;
    }

    /**
     * <p>
     * The unique ID of the vehicle to associate with the fleet.
     * </p>
     * 
     * @param vehicleName
     *        The unique ID of the vehicle to associate with the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateVehicleFleetRequest withVehicleName(String vehicleName) {
        setVehicleName(vehicleName);
        return this;
    }

    /**
     * <p>
     * The ID of a fleet.
     * </p>
     * 
     * @param fleetId
     *        The ID of a fleet.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The ID of a fleet.
     * </p>
     * 
     * @return The ID of a fleet.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The ID of a fleet.
     * </p>
     * 
     * @param fleetId
     *        The ID of a fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateVehicleFleetRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
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
        if (getVehicleName() != null)
            sb.append("VehicleName: ").append(getVehicleName()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateVehicleFleetRequest == false)
            return false;
        AssociateVehicleFleetRequest other = (AssociateVehicleFleetRequest) obj;
        if (other.getVehicleName() == null ^ this.getVehicleName() == null)
            return false;
        if (other.getVehicleName() != null && other.getVehicleName().equals(this.getVehicleName()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVehicleName() == null) ? 0 : getVehicleName().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateVehicleFleetRequest clone() {
        return (AssociateVehicleFleetRequest) super.clone();
    }

}
