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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a location in a multi-location fleet.
 * </p>
 * <p>
 * <b>Related actions</b>
 * </p>
 * <p>
 * <a>DescribeFleetLocationAttributes</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/LocationAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocationAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A fleet location and its current life-cycle state.
     * </p>
     */
    private LocationState locationState;
    /**
     * <p>
     * A list of fleet actions that have been suspended in the fleet location.
     * </p>
     */
    private java.util.List<String> stoppedActions;
    /**
     * <p>
     * The status of fleet activity updates to the location. The status <code>PENDING_UPDATE</code> indicates that
     * <a>StopFleetActions</a> or <a>StartFleetActions</a> has been requested but the update has not yet been completed
     * for the location.
     * </p>
     */
    private String updateStatus;

    /**
     * <p>
     * A fleet location and its current life-cycle state.
     * </p>
     * 
     * @param locationState
     *        A fleet location and its current life-cycle state.
     */

    public void setLocationState(LocationState locationState) {
        this.locationState = locationState;
    }

    /**
     * <p>
     * A fleet location and its current life-cycle state.
     * </p>
     * 
     * @return A fleet location and its current life-cycle state.
     */

    public LocationState getLocationState() {
        return this.locationState;
    }

    /**
     * <p>
     * A fleet location and its current life-cycle state.
     * </p>
     * 
     * @param locationState
     *        A fleet location and its current life-cycle state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationAttributes withLocationState(LocationState locationState) {
        setLocationState(locationState);
        return this;
    }

    /**
     * <p>
     * A list of fleet actions that have been suspended in the fleet location.
     * </p>
     * 
     * @return A list of fleet actions that have been suspended in the fleet location.
     * @see FleetAction
     */

    public java.util.List<String> getStoppedActions() {
        return stoppedActions;
    }

    /**
     * <p>
     * A list of fleet actions that have been suspended in the fleet location.
     * </p>
     * 
     * @param stoppedActions
     *        A list of fleet actions that have been suspended in the fleet location.
     * @see FleetAction
     */

    public void setStoppedActions(java.util.Collection<String> stoppedActions) {
        if (stoppedActions == null) {
            this.stoppedActions = null;
            return;
        }

        this.stoppedActions = new java.util.ArrayList<String>(stoppedActions);
    }

    /**
     * <p>
     * A list of fleet actions that have been suspended in the fleet location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStoppedActions(java.util.Collection)} or {@link #withStoppedActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stoppedActions
     *        A list of fleet actions that have been suspended in the fleet location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAction
     */

    public LocationAttributes withStoppedActions(String... stoppedActions) {
        if (this.stoppedActions == null) {
            setStoppedActions(new java.util.ArrayList<String>(stoppedActions.length));
        }
        for (String ele : stoppedActions) {
            this.stoppedActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of fleet actions that have been suspended in the fleet location.
     * </p>
     * 
     * @param stoppedActions
     *        A list of fleet actions that have been suspended in the fleet location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAction
     */

    public LocationAttributes withStoppedActions(java.util.Collection<String> stoppedActions) {
        setStoppedActions(stoppedActions);
        return this;
    }

    /**
     * <p>
     * A list of fleet actions that have been suspended in the fleet location.
     * </p>
     * 
     * @param stoppedActions
     *        A list of fleet actions that have been suspended in the fleet location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAction
     */

    public LocationAttributes withStoppedActions(FleetAction... stoppedActions) {
        java.util.ArrayList<String> stoppedActionsCopy = new java.util.ArrayList<String>(stoppedActions.length);
        for (FleetAction value : stoppedActions) {
            stoppedActionsCopy.add(value.toString());
        }
        if (getStoppedActions() == null) {
            setStoppedActions(stoppedActionsCopy);
        } else {
            getStoppedActions().addAll(stoppedActionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The status of fleet activity updates to the location. The status <code>PENDING_UPDATE</code> indicates that
     * <a>StopFleetActions</a> or <a>StartFleetActions</a> has been requested but the update has not yet been completed
     * for the location.
     * </p>
     * 
     * @param updateStatus
     *        The status of fleet activity updates to the location. The status <code>PENDING_UPDATE</code> indicates
     *        that <a>StopFleetActions</a> or <a>StartFleetActions</a> has been requested but the update has not yet
     *        been completed for the location.
     * @see LocationUpdateStatus
     */

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * The status of fleet activity updates to the location. The status <code>PENDING_UPDATE</code> indicates that
     * <a>StopFleetActions</a> or <a>StartFleetActions</a> has been requested but the update has not yet been completed
     * for the location.
     * </p>
     * 
     * @return The status of fleet activity updates to the location. The status <code>PENDING_UPDATE</code> indicates
     *         that <a>StopFleetActions</a> or <a>StartFleetActions</a> has been requested but the update has not yet
     *         been completed for the location.
     * @see LocationUpdateStatus
     */

    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * <p>
     * The status of fleet activity updates to the location. The status <code>PENDING_UPDATE</code> indicates that
     * <a>StopFleetActions</a> or <a>StartFleetActions</a> has been requested but the update has not yet been completed
     * for the location.
     * </p>
     * 
     * @param updateStatus
     *        The status of fleet activity updates to the location. The status <code>PENDING_UPDATE</code> indicates
     *        that <a>StopFleetActions</a> or <a>StartFleetActions</a> has been requested but the update has not yet
     *        been completed for the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationUpdateStatus
     */

    public LocationAttributes withUpdateStatus(String updateStatus) {
        setUpdateStatus(updateStatus);
        return this;
    }

    /**
     * <p>
     * The status of fleet activity updates to the location. The status <code>PENDING_UPDATE</code> indicates that
     * <a>StopFleetActions</a> or <a>StartFleetActions</a> has been requested but the update has not yet been completed
     * for the location.
     * </p>
     * 
     * @param updateStatus
     *        The status of fleet activity updates to the location. The status <code>PENDING_UPDATE</code> indicates
     *        that <a>StopFleetActions</a> or <a>StartFleetActions</a> has been requested but the update has not yet
     *        been completed for the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocationUpdateStatus
     */

    public LocationAttributes withUpdateStatus(LocationUpdateStatus updateStatus) {
        this.updateStatus = updateStatus.toString();
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
        if (getLocationState() != null)
            sb.append("LocationState: ").append(getLocationState()).append(",");
        if (getStoppedActions() != null)
            sb.append("StoppedActions: ").append(getStoppedActions()).append(",");
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: ").append(getUpdateStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocationAttributes == false)
            return false;
        LocationAttributes other = (LocationAttributes) obj;
        if (other.getLocationState() == null ^ this.getLocationState() == null)
            return false;
        if (other.getLocationState() != null && other.getLocationState().equals(this.getLocationState()) == false)
            return false;
        if (other.getStoppedActions() == null ^ this.getStoppedActions() == null)
            return false;
        if (other.getStoppedActions() != null && other.getStoppedActions().equals(this.getStoppedActions()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationState() == null) ? 0 : getLocationState().hashCode());
        hashCode = prime * hashCode + ((getStoppedActions() == null) ? 0 : getStoppedActions().hashCode());
        hashCode = prime * hashCode + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        return hashCode;
    }

    @Override
    public LocationAttributes clone() {
        try {
            return (LocationAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.LocationAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
