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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the returned data in response to a request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The properties for the new fleet, including the current status. All fleets are placed in <code>NEW</code> status
     * on creation.
     * </p>
     */
    private FleetAttributes fleetAttributes;
    /**
     * <p>
     * The fleet's locations and life-cycle status of each location. For new fleets, the status of all locations is set
     * to <code>NEW</code>. During fleet creation, GameLift updates each location status as instances are deployed there
     * and prepared for game hosting. This list includes an entry for the fleet's home Region. For fleets with no remote
     * locations, only one entry, representing the home Region, is returned.
     * </p>
     */
    private java.util.List<LocationState> locationStates;

    /**
     * <p>
     * The properties for the new fleet, including the current status. All fleets are placed in <code>NEW</code> status
     * on creation.
     * </p>
     * 
     * @param fleetAttributes
     *        The properties for the new fleet, including the current status. All fleets are placed in <code>NEW</code>
     *        status on creation.
     */

    public void setFleetAttributes(FleetAttributes fleetAttributes) {
        this.fleetAttributes = fleetAttributes;
    }

    /**
     * <p>
     * The properties for the new fleet, including the current status. All fleets are placed in <code>NEW</code> status
     * on creation.
     * </p>
     * 
     * @return The properties for the new fleet, including the current status. All fleets are placed in <code>NEW</code>
     *         status on creation.
     */

    public FleetAttributes getFleetAttributes() {
        return this.fleetAttributes;
    }

    /**
     * <p>
     * The properties for the new fleet, including the current status. All fleets are placed in <code>NEW</code> status
     * on creation.
     * </p>
     * 
     * @param fleetAttributes
     *        The properties for the new fleet, including the current status. All fleets are placed in <code>NEW</code>
     *        status on creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetResult withFleetAttributes(FleetAttributes fleetAttributes) {
        setFleetAttributes(fleetAttributes);
        return this;
    }

    /**
     * <p>
     * The fleet's locations and life-cycle status of each location. For new fleets, the status of all locations is set
     * to <code>NEW</code>. During fleet creation, GameLift updates each location status as instances are deployed there
     * and prepared for game hosting. This list includes an entry for the fleet's home Region. For fleets with no remote
     * locations, only one entry, representing the home Region, is returned.
     * </p>
     * 
     * @return The fleet's locations and life-cycle status of each location. For new fleets, the status of all locations
     *         is set to <code>NEW</code>. During fleet creation, GameLift updates each location status as instances are
     *         deployed there and prepared for game hosting. This list includes an entry for the fleet's home Region.
     *         For fleets with no remote locations, only one entry, representing the home Region, is returned.
     */

    public java.util.List<LocationState> getLocationStates() {
        return locationStates;
    }

    /**
     * <p>
     * The fleet's locations and life-cycle status of each location. For new fleets, the status of all locations is set
     * to <code>NEW</code>. During fleet creation, GameLift updates each location status as instances are deployed there
     * and prepared for game hosting. This list includes an entry for the fleet's home Region. For fleets with no remote
     * locations, only one entry, representing the home Region, is returned.
     * </p>
     * 
     * @param locationStates
     *        The fleet's locations and life-cycle status of each location. For new fleets, the status of all locations
     *        is set to <code>NEW</code>. During fleet creation, GameLift updates each location status as instances are
     *        deployed there and prepared for game hosting. This list includes an entry for the fleet's home Region. For
     *        fleets with no remote locations, only one entry, representing the home Region, is returned.
     */

    public void setLocationStates(java.util.Collection<LocationState> locationStates) {
        if (locationStates == null) {
            this.locationStates = null;
            return;
        }

        this.locationStates = new java.util.ArrayList<LocationState>(locationStates);
    }

    /**
     * <p>
     * The fleet's locations and life-cycle status of each location. For new fleets, the status of all locations is set
     * to <code>NEW</code>. During fleet creation, GameLift updates each location status as instances are deployed there
     * and prepared for game hosting. This list includes an entry for the fleet's home Region. For fleets with no remote
     * locations, only one entry, representing the home Region, is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocationStates(java.util.Collection)} or {@link #withLocationStates(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param locationStates
     *        The fleet's locations and life-cycle status of each location. For new fleets, the status of all locations
     *        is set to <code>NEW</code>. During fleet creation, GameLift updates each location status as instances are
     *        deployed there and prepared for game hosting. This list includes an entry for the fleet's home Region. For
     *        fleets with no remote locations, only one entry, representing the home Region, is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetResult withLocationStates(LocationState... locationStates) {
        if (this.locationStates == null) {
            setLocationStates(new java.util.ArrayList<LocationState>(locationStates.length));
        }
        for (LocationState ele : locationStates) {
            this.locationStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The fleet's locations and life-cycle status of each location. For new fleets, the status of all locations is set
     * to <code>NEW</code>. During fleet creation, GameLift updates each location status as instances are deployed there
     * and prepared for game hosting. This list includes an entry for the fleet's home Region. For fleets with no remote
     * locations, only one entry, representing the home Region, is returned.
     * </p>
     * 
     * @param locationStates
     *        The fleet's locations and life-cycle status of each location. For new fleets, the status of all locations
     *        is set to <code>NEW</code>. During fleet creation, GameLift updates each location status as instances are
     *        deployed there and prepared for game hosting. This list includes an entry for the fleet's home Region. For
     *        fleets with no remote locations, only one entry, representing the home Region, is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetResult withLocationStates(java.util.Collection<LocationState> locationStates) {
        setLocationStates(locationStates);
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
        if (getFleetAttributes() != null)
            sb.append("FleetAttributes: ").append(getFleetAttributes()).append(",");
        if (getLocationStates() != null)
            sb.append("LocationStates: ").append(getLocationStates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFleetResult == false)
            return false;
        CreateFleetResult other = (CreateFleetResult) obj;
        if (other.getFleetAttributes() == null ^ this.getFleetAttributes() == null)
            return false;
        if (other.getFleetAttributes() != null && other.getFleetAttributes().equals(this.getFleetAttributes()) == false)
            return false;
        if (other.getLocationStates() == null ^ this.getLocationStates() == null)
            return false;
        if (other.getLocationStates() != null && other.getLocationStates().equals(this.getLocationStates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetAttributes() == null) ? 0 : getFleetAttributes().hashCode());
        hashCode = prime * hashCode + ((getLocationStates() == null) ? 0 : getLocationStates().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetResult clone() {
        try {
            return (CreateFleetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
