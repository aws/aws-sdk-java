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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopFleetActions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopFleetActionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a fleet
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * List of actions to suspend on the fleet.
     * </p>
     */
    private java.util.List<String> actions;

    /**
     * <p>
     * Unique identifier for a fleet
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet
     * </p>
     * 
     * @return Unique identifier for a fleet
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopFleetActionsRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * List of actions to suspend on the fleet.
     * </p>
     * 
     * @return List of actions to suspend on the fleet.
     * @see FleetAction
     */

    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * List of actions to suspend on the fleet.
     * </p>
     * 
     * @param actions
     *        List of actions to suspend on the fleet.
     * @see FleetAction
     */

    public void setActions(java.util.Collection<String> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<String>(actions);
    }

    /**
     * <p>
     * List of actions to suspend on the fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        List of actions to suspend on the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAction
     */

    public StopFleetActionsRequest withActions(String... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<String>(actions.length));
        }
        for (String ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of actions to suspend on the fleet.
     * </p>
     * 
     * @param actions
     *        List of actions to suspend on the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAction
     */

    public StopFleetActionsRequest withActions(java.util.Collection<String> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * List of actions to suspend on the fleet.
     * </p>
     * 
     * @param actions
     *        List of actions to suspend on the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAction
     */

    public StopFleetActionsRequest withActions(FleetAction... actions) {
        java.util.ArrayList<String> actionsCopy = new java.util.ArrayList<String>(actions.length);
        for (FleetAction value : actions) {
            actionsCopy.add(value.toString());
        }
        if (getActions() == null) {
            setActions(actionsCopy);
        } else {
            getActions().addAll(actionsCopy);
        }
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopFleetActionsRequest == false)
            return false;
        StopFleetActionsRequest other = (StopFleetActionsRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public StopFleetActionsRequest clone() {
        return (StopFleetActionsRequest) super.clone();
    }

}
