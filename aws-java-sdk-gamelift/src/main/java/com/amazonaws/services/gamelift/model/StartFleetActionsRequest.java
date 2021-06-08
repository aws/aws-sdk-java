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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartFleetActions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartFleetActionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet to restart actions on. You can use either the fleet ID or ARN value.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * List of actions to restart on the fleet.
     * </p>
     */
    private java.util.List<String> actions;
    /**
     * <p>
     * The fleet location to restart fleet actions for. Specify a location in the form of an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A unique identifier for the fleet to restart actions on. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to restart actions on. You can use either the fleet ID or ARN value.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to restart actions on. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @return A unique identifier for the fleet to restart actions on. You can use either the fleet ID or ARN value.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to restart actions on. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to restart actions on. You can use either the fleet ID or ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFleetActionsRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * List of actions to restart on the fleet.
     * </p>
     * 
     * @return List of actions to restart on the fleet.
     * @see FleetAction
     */

    public java.util.List<String> getActions() {
        return actions;
    }

    /**
     * <p>
     * List of actions to restart on the fleet.
     * </p>
     * 
     * @param actions
     *        List of actions to restart on the fleet.
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
     * List of actions to restart on the fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        List of actions to restart on the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAction
     */

    public StartFleetActionsRequest withActions(String... actions) {
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
     * List of actions to restart on the fleet.
     * </p>
     * 
     * @param actions
     *        List of actions to restart on the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAction
     */

    public StartFleetActionsRequest withActions(java.util.Collection<String> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * List of actions to restart on the fleet.
     * </p>
     * 
     * @param actions
     *        List of actions to restart on the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAction
     */

    public StartFleetActionsRequest withActions(FleetAction... actions) {
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
     * <p>
     * The fleet location to restart fleet actions for. Specify a location in the form of an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The fleet location to restart fleet actions for. Specify a location in the form of an AWS Region code,
     *        such as <code>us-west-2</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The fleet location to restart fleet actions for. Specify a location in the form of an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @return The fleet location to restart fleet actions for. Specify a location in the form of an AWS Region code,
     *         such as <code>us-west-2</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The fleet location to restart fleet actions for. Specify a location in the form of an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The fleet location to restart fleet actions for. Specify a location in the form of an AWS Region code,
     *        such as <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFleetActionsRequest withLocation(String location) {
        setLocation(location);
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
            sb.append("Actions: ").append(getActions()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartFleetActionsRequest == false)
            return false;
        StartFleetActionsRequest other = (StartFleetActionsRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public StartFleetActionsRequest clone() {
        return (StartFleetActionsRequest) super.clone();
    }

}
