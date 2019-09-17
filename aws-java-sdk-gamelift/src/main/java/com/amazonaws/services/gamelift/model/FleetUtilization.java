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
 * Current status of fleet utilization, including the number of game and player sessions being hosted.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/FleetUtilization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetUtilization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Number of server processes in an <code>ACTIVE</code> status currently running across all instances in the fleet
     * </p>
     */
    private Integer activeServerProcessCount;
    /**
     * <p>
     * Number of active game sessions currently being hosted on all instances in the fleet.
     * </p>
     */
    private Integer activeGameSessionCount;
    /**
     * <p>
     * Number of active player sessions currently being hosted on all instances in the fleet.
     * </p>
     */
    private Integer currentPlayerSessionCount;
    /**
     * <p>
     * Maximum players allowed across all game sessions currently being hosted on all instances in the fleet.
     * </p>
     */
    private Integer maximumPlayerSessionCount;

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

    public FleetUtilization withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Number of server processes in an <code>ACTIVE</code> status currently running across all instances in the fleet
     * </p>
     * 
     * @param activeServerProcessCount
     *        Number of server processes in an <code>ACTIVE</code> status currently running across all instances in the
     *        fleet
     */

    public void setActiveServerProcessCount(Integer activeServerProcessCount) {
        this.activeServerProcessCount = activeServerProcessCount;
    }

    /**
     * <p>
     * Number of server processes in an <code>ACTIVE</code> status currently running across all instances in the fleet
     * </p>
     * 
     * @return Number of server processes in an <code>ACTIVE</code> status currently running across all instances in the
     *         fleet
     */

    public Integer getActiveServerProcessCount() {
        return this.activeServerProcessCount;
    }

    /**
     * <p>
     * Number of server processes in an <code>ACTIVE</code> status currently running across all instances in the fleet
     * </p>
     * 
     * @param activeServerProcessCount
     *        Number of server processes in an <code>ACTIVE</code> status currently running across all instances in the
     *        fleet
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetUtilization withActiveServerProcessCount(Integer activeServerProcessCount) {
        setActiveServerProcessCount(activeServerProcessCount);
        return this;
    }

    /**
     * <p>
     * Number of active game sessions currently being hosted on all instances in the fleet.
     * </p>
     * 
     * @param activeGameSessionCount
     *        Number of active game sessions currently being hosted on all instances in the fleet.
     */

    public void setActiveGameSessionCount(Integer activeGameSessionCount) {
        this.activeGameSessionCount = activeGameSessionCount;
    }

    /**
     * <p>
     * Number of active game sessions currently being hosted on all instances in the fleet.
     * </p>
     * 
     * @return Number of active game sessions currently being hosted on all instances in the fleet.
     */

    public Integer getActiveGameSessionCount() {
        return this.activeGameSessionCount;
    }

    /**
     * <p>
     * Number of active game sessions currently being hosted on all instances in the fleet.
     * </p>
     * 
     * @param activeGameSessionCount
     *        Number of active game sessions currently being hosted on all instances in the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetUtilization withActiveGameSessionCount(Integer activeGameSessionCount) {
        setActiveGameSessionCount(activeGameSessionCount);
        return this;
    }

    /**
     * <p>
     * Number of active player sessions currently being hosted on all instances in the fleet.
     * </p>
     * 
     * @param currentPlayerSessionCount
     *        Number of active player sessions currently being hosted on all instances in the fleet.
     */

    public void setCurrentPlayerSessionCount(Integer currentPlayerSessionCount) {
        this.currentPlayerSessionCount = currentPlayerSessionCount;
    }

    /**
     * <p>
     * Number of active player sessions currently being hosted on all instances in the fleet.
     * </p>
     * 
     * @return Number of active player sessions currently being hosted on all instances in the fleet.
     */

    public Integer getCurrentPlayerSessionCount() {
        return this.currentPlayerSessionCount;
    }

    /**
     * <p>
     * Number of active player sessions currently being hosted on all instances in the fleet.
     * </p>
     * 
     * @param currentPlayerSessionCount
     *        Number of active player sessions currently being hosted on all instances in the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetUtilization withCurrentPlayerSessionCount(Integer currentPlayerSessionCount) {
        setCurrentPlayerSessionCount(currentPlayerSessionCount);
        return this;
    }

    /**
     * <p>
     * Maximum players allowed across all game sessions currently being hosted on all instances in the fleet.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        Maximum players allowed across all game sessions currently being hosted on all instances in the fleet.
     */

    public void setMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        this.maximumPlayerSessionCount = maximumPlayerSessionCount;
    }

    /**
     * <p>
     * Maximum players allowed across all game sessions currently being hosted on all instances in the fleet.
     * </p>
     * 
     * @return Maximum players allowed across all game sessions currently being hosted on all instances in the fleet.
     */

    public Integer getMaximumPlayerSessionCount() {
        return this.maximumPlayerSessionCount;
    }

    /**
     * <p>
     * Maximum players allowed across all game sessions currently being hosted on all instances in the fleet.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        Maximum players allowed across all game sessions currently being hosted on all instances in the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetUtilization withMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        setMaximumPlayerSessionCount(maximumPlayerSessionCount);
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
        if (getActiveServerProcessCount() != null)
            sb.append("ActiveServerProcessCount: ").append(getActiveServerProcessCount()).append(",");
        if (getActiveGameSessionCount() != null)
            sb.append("ActiveGameSessionCount: ").append(getActiveGameSessionCount()).append(",");
        if (getCurrentPlayerSessionCount() != null)
            sb.append("CurrentPlayerSessionCount: ").append(getCurrentPlayerSessionCount()).append(",");
        if (getMaximumPlayerSessionCount() != null)
            sb.append("MaximumPlayerSessionCount: ").append(getMaximumPlayerSessionCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetUtilization == false)
            return false;
        FleetUtilization other = (FleetUtilization) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getActiveServerProcessCount() == null ^ this.getActiveServerProcessCount() == null)
            return false;
        if (other.getActiveServerProcessCount() != null && other.getActiveServerProcessCount().equals(this.getActiveServerProcessCount()) == false)
            return false;
        if (other.getActiveGameSessionCount() == null ^ this.getActiveGameSessionCount() == null)
            return false;
        if (other.getActiveGameSessionCount() != null && other.getActiveGameSessionCount().equals(this.getActiveGameSessionCount()) == false)
            return false;
        if (other.getCurrentPlayerSessionCount() == null ^ this.getCurrentPlayerSessionCount() == null)
            return false;
        if (other.getCurrentPlayerSessionCount() != null && other.getCurrentPlayerSessionCount().equals(this.getCurrentPlayerSessionCount()) == false)
            return false;
        if (other.getMaximumPlayerSessionCount() == null ^ this.getMaximumPlayerSessionCount() == null)
            return false;
        if (other.getMaximumPlayerSessionCount() != null && other.getMaximumPlayerSessionCount().equals(this.getMaximumPlayerSessionCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getActiveServerProcessCount() == null) ? 0 : getActiveServerProcessCount().hashCode());
        hashCode = prime * hashCode + ((getActiveGameSessionCount() == null) ? 0 : getActiveGameSessionCount().hashCode());
        hashCode = prime * hashCode + ((getCurrentPlayerSessionCount() == null) ? 0 : getCurrentPlayerSessionCount().hashCode());
        hashCode = prime * hashCode + ((getMaximumPlayerSessionCount() == null) ? 0 : getMaximumPlayerSessionCount().hashCode());
        return hashCode;
    }

    @Override
    public FleetUtilization clone() {
        try {
            return (FleetUtilization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.FleetUtilizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
