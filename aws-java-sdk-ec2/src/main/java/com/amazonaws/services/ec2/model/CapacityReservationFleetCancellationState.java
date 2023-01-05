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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a Capacity Reservation Fleet that was successfully cancelled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CapacityReservationFleetCancellationState"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityReservationFleetCancellationState implements Serializable, Cloneable {

    /**
     * <p>
     * The current state of the Capacity Reservation Fleet.
     * </p>
     */
    private String currentFleetState;
    /**
     * <p>
     * The previous state of the Capacity Reservation Fleet.
     * </p>
     */
    private String previousFleetState;
    /**
     * <p>
     * The ID of the Capacity Reservation Fleet that was successfully cancelled.
     * </p>
     */
    private String capacityReservationFleetId;

    /**
     * <p>
     * The current state of the Capacity Reservation Fleet.
     * </p>
     * 
     * @param currentFleetState
     *        The current state of the Capacity Reservation Fleet.
     * @see CapacityReservationFleetState
     */

    public void setCurrentFleetState(String currentFleetState) {
        this.currentFleetState = currentFleetState;
    }

    /**
     * <p>
     * The current state of the Capacity Reservation Fleet.
     * </p>
     * 
     * @return The current state of the Capacity Reservation Fleet.
     * @see CapacityReservationFleetState
     */

    public String getCurrentFleetState() {
        return this.currentFleetState;
    }

    /**
     * <p>
     * The current state of the Capacity Reservation Fleet.
     * </p>
     * 
     * @param currentFleetState
     *        The current state of the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationFleetState
     */

    public CapacityReservationFleetCancellationState withCurrentFleetState(String currentFleetState) {
        setCurrentFleetState(currentFleetState);
        return this;
    }

    /**
     * <p>
     * The current state of the Capacity Reservation Fleet.
     * </p>
     * 
     * @param currentFleetState
     *        The current state of the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationFleetState
     */

    public CapacityReservationFleetCancellationState withCurrentFleetState(CapacityReservationFleetState currentFleetState) {
        this.currentFleetState = currentFleetState.toString();
        return this;
    }

    /**
     * <p>
     * The previous state of the Capacity Reservation Fleet.
     * </p>
     * 
     * @param previousFleetState
     *        The previous state of the Capacity Reservation Fleet.
     * @see CapacityReservationFleetState
     */

    public void setPreviousFleetState(String previousFleetState) {
        this.previousFleetState = previousFleetState;
    }

    /**
     * <p>
     * The previous state of the Capacity Reservation Fleet.
     * </p>
     * 
     * @return The previous state of the Capacity Reservation Fleet.
     * @see CapacityReservationFleetState
     */

    public String getPreviousFleetState() {
        return this.previousFleetState;
    }

    /**
     * <p>
     * The previous state of the Capacity Reservation Fleet.
     * </p>
     * 
     * @param previousFleetState
     *        The previous state of the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationFleetState
     */

    public CapacityReservationFleetCancellationState withPreviousFleetState(String previousFleetState) {
        setPreviousFleetState(previousFleetState);
        return this;
    }

    /**
     * <p>
     * The previous state of the Capacity Reservation Fleet.
     * </p>
     * 
     * @param previousFleetState
     *        The previous state of the Capacity Reservation Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CapacityReservationFleetState
     */

    public CapacityReservationFleetCancellationState withPreviousFleetState(CapacityReservationFleetState previousFleetState) {
        this.previousFleetState = previousFleetState.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet that was successfully cancelled.
     * </p>
     * 
     * @param capacityReservationFleetId
     *        The ID of the Capacity Reservation Fleet that was successfully cancelled.
     */

    public void setCapacityReservationFleetId(String capacityReservationFleetId) {
        this.capacityReservationFleetId = capacityReservationFleetId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet that was successfully cancelled.
     * </p>
     * 
     * @return The ID of the Capacity Reservation Fleet that was successfully cancelled.
     */

    public String getCapacityReservationFleetId() {
        return this.capacityReservationFleetId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation Fleet that was successfully cancelled.
     * </p>
     * 
     * @param capacityReservationFleetId
     *        The ID of the Capacity Reservation Fleet that was successfully cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservationFleetCancellationState withCapacityReservationFleetId(String capacityReservationFleetId) {
        setCapacityReservationFleetId(capacityReservationFleetId);
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
        if (getCurrentFleetState() != null)
            sb.append("CurrentFleetState: ").append(getCurrentFleetState()).append(",");
        if (getPreviousFleetState() != null)
            sb.append("PreviousFleetState: ").append(getPreviousFleetState()).append(",");
        if (getCapacityReservationFleetId() != null)
            sb.append("CapacityReservationFleetId: ").append(getCapacityReservationFleetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityReservationFleetCancellationState == false)
            return false;
        CapacityReservationFleetCancellationState other = (CapacityReservationFleetCancellationState) obj;
        if (other.getCurrentFleetState() == null ^ this.getCurrentFleetState() == null)
            return false;
        if (other.getCurrentFleetState() != null && other.getCurrentFleetState().equals(this.getCurrentFleetState()) == false)
            return false;
        if (other.getPreviousFleetState() == null ^ this.getPreviousFleetState() == null)
            return false;
        if (other.getPreviousFleetState() != null && other.getPreviousFleetState().equals(this.getPreviousFleetState()) == false)
            return false;
        if (other.getCapacityReservationFleetId() == null ^ this.getCapacityReservationFleetId() == null)
            return false;
        if (other.getCapacityReservationFleetId() != null && other.getCapacityReservationFleetId().equals(this.getCapacityReservationFleetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrentFleetState() == null) ? 0 : getCurrentFleetState().hashCode());
        hashCode = prime * hashCode + ((getPreviousFleetState() == null) ? 0 : getPreviousFleetState().hashCode());
        hashCode = prime * hashCode + ((getCapacityReservationFleetId() == null) ? 0 : getCapacityReservationFleetId().hashCode());
        return hashCode;
    }

    @Override
    public CapacityReservationFleetCancellationState clone() {
        try {
            return (CapacityReservationFleetCancellationState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
