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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Routing configuration for a fleet alias.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateFleet</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListFleets</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteFleet</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * Describe fleets:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeFleetAttributes</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetCapacity</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetPortSettings</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetUtilization</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeRuntimeConfiguration</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEC2InstanceLimits</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetEvents</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Update fleets:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>UpdateFleetAttributes</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateFleetCapacity</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateFleetPortSettings</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateRuntimeConfiguration</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Manage fleet actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>StartFleetActions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopFleetActions</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RoutingStrategy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoutingStrategy implements Serializable, Cloneable, StructuredPojo {

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
     * <b>SIMPLE</b> -- The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> -- The alias does not resolve to a fleet but instead can be used to display a message to the
     * user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message
     * embedded.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Unique identifier for a fleet that the alias points to.
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
     * <b>SIMPLE</b> -- The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> -- The alias does not resolve to a fleet but instead can be used to display a message to the
     * user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message
     * embedded.
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
     *        <b>SIMPLE</b> -- The alias resolves to one specific fleet. Use this type when routing to active fleets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINAL</b> -- The alias does not resolve to a fleet but instead can be used to display a message to
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
     * <b>SIMPLE</b> -- The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> -- The alias does not resolve to a fleet but instead can be used to display a message to the
     * user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message
     * embedded.
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
     *         <b>SIMPLE</b> -- The alias resolves to one specific fleet. Use this type when routing to active fleets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>TERMINAL</b> -- The alias does not resolve to a fleet but instead can be used to display a message to
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
     * <b>SIMPLE</b> -- The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> -- The alias does not resolve to a fleet but instead can be used to display a message to the
     * user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message
     * embedded.
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
     *        <b>SIMPLE</b> -- The alias resolves to one specific fleet. Use this type when routing to active fleets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINAL</b> -- The alias does not resolve to a fleet but instead can be used to display a message to
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
     * <b>SIMPLE</b> -- The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> -- The alias does not resolve to a fleet but instead can be used to display a message to the
     * user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message
     * embedded.
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
     *        <b>SIMPLE</b> -- The alias resolves to one specific fleet. Use this type when routing to active fleets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINAL</b> -- The alias does not resolve to a fleet but instead can be used to display a message to
     *        the user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a>
     *        message embedded.
     *        </p>
     *        </li>
     * @see RoutingStrategyType
     */

    public void setType(RoutingStrategyType type) {
        withType(type);
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
     * <b>SIMPLE</b> -- The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINAL</b> -- The alias does not resolve to a fleet but instead can be used to display a message to the
     * user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a> message
     * embedded.
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
     *        <b>SIMPLE</b> -- The alias resolves to one specific fleet. Use this type when routing to active fleets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINAL</b> -- The alias does not resolve to a fleet but instead can be used to display a message to
     *        the user. A terminal alias throws a TerminalRoutingStrategyException with the <a>RoutingStrategy</a>
     *        message embedded.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingStrategyType
     */

    public RoutingStrategy withType(RoutingStrategyType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Unique identifier for a fleet that the alias points to.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet that the alias points to.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet that the alias points to.
     * </p>
     * 
     * @return Unique identifier for a fleet that the alias points to.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet that the alias points to.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet that the alias points to.
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.RoutingStrategyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
