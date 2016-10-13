/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Routing configuration for a fleet alias.
 * </p>
 */
public class RoutingStrategy implements Serializable, Cloneable {

    /**
     * <p>
     * Type of routing strategy.
     * </p>
     * <p>
     * Possible routing types include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to the user.
     * A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message embedded.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Message text to be used with a terminal routing strategy.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Type of routing strategy.
     * </p>
     * <p>
     * Possible routing types include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to the user.
     * A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message embedded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Type of routing strategy.</p>
     *        <p>
     *        Possible routing types include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to
     *        the user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a>
     *        message embedded.
     *        </p>
     *        </li>
     * @see RoutingStrategyType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of routing strategy.
     * </p>
     * <p>
     * Possible routing types include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to the user.
     * A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message embedded.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Type of routing strategy.</p>
     *         <p>
     *         Possible routing types include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to
     *         the user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a>
     *         message embedded.
     *         </p>
     *         </li>
     * @see RoutingStrategyType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of routing strategy.
     * </p>
     * <p>
     * Possible routing types include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to the user.
     * A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message embedded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Type of routing strategy.</p>
     *        <p>
     *        Possible routing types include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to
     *        the user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a>
     *        message embedded.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingStrategyType
     */

    public RoutingStrategy withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of routing strategy.
     * </p>
     * <p>
     * Possible routing types include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to the user.
     * A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message embedded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Type of routing strategy.</p>
     *        <p>
     *        Possible routing types include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to
     *        the user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a>
     *        message embedded.
     *        </p>
     *        </li>
     * @see RoutingStrategyType
     */

    public void setType(RoutingStrategyType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * Type of routing strategy.
     * </p>
     * <p>
     * Possible routing types include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to the user.
     * A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message embedded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Type of routing strategy.</p>
     *        <p>
     *        Possible routing types include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SIMPLE</b> – The alias resolves to one specific fleet. Use this type when routing to active fleets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINAL</b> – The alias does not resolve to a fleet but instead can be used to display a message to
     *        the user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a>
     *        message embedded.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingStrategyType
     */

    public RoutingStrategy withType(RoutingStrategyType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     * 
     * @return Unique identifier for a fleet.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingStrategy withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Message text to be used with a terminal routing strategy.
     * </p>
     * 
     * @param message
     *        Message text to be used with a terminal routing strategy.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Message text to be used with a terminal routing strategy.
     * </p>
     * 
     * @return Message text to be used with a terminal routing strategy.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Message text to be used with a terminal routing strategy.
     * </p>
     * 
     * @param message
     *        Message text to be used with a terminal routing strategy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RoutingStrategy withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RoutingStrategy == false)
            return false;
        RoutingStrategy other = (RoutingStrategy) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public RoutingStrategy clone() {
        try {
            return (RoutingStrategy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
