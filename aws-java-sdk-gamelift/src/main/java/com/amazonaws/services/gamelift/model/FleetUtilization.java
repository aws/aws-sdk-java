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
 * Current resource utilization statistics in a specified fleet or location. The location value might refer to a fleet's
 * remote location or its home Region.
 * </p>
 * <p>
 * <b>Related actions</b>
 * </p>
 * <p>
 * <a>DescribeFleetUtilization</a> | <a>DescribeFleetLocationUtilization</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/FleetUtilization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetUtilization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the fleet associated with the location.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * The number of server processes in <code>ACTIVE</code> status that are currently running across all instances in
     * the fleet location.
     * </p>
     */
    private Integer activeServerProcessCount;
    /**
     * <p>
     * The number of active game sessions that are currently being hosted across all instances in the fleet location.
     * </p>
     */
    private Integer activeGameSessionCount;
    /**
     * <p>
     * The number of active player sessions that are currently being hosted across all instances in the fleet location.
     * </p>
     */
    private Integer currentPlayerSessionCount;
    /**
     * <p>
     * The maximum number of players allowed across all game sessions that are currently being hosted across all
     * instances in the fleet location.
     * </p>
     */
    private Integer maximumPlayerSessionCount;
    /**
     * <p>
     * The fleet location for the fleet utilization information, expressed as an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     */
    private String location;

    /**
     * <p>
     * A unique identifier for the fleet associated with the location.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet associated with the location.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet associated with the location.
     * </p>
     * 
     * @return A unique identifier for the fleet associated with the location.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet associated with the location.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet associated with the location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetUtilization withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *         GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *         <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetUtilization withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * The number of server processes in <code>ACTIVE</code> status that are currently running across all instances in
     * the fleet location.
     * </p>
     * 
     * @param activeServerProcessCount
     *        The number of server processes in <code>ACTIVE</code> status that are currently running across all
     *        instances in the fleet location.
     */

    public void setActiveServerProcessCount(Integer activeServerProcessCount) {
        this.activeServerProcessCount = activeServerProcessCount;
    }

    /**
     * <p>
     * The number of server processes in <code>ACTIVE</code> status that are currently running across all instances in
     * the fleet location.
     * </p>
     * 
     * @return The number of server processes in <code>ACTIVE</code> status that are currently running across all
     *         instances in the fleet location.
     */

    public Integer getActiveServerProcessCount() {
        return this.activeServerProcessCount;
    }

    /**
     * <p>
     * The number of server processes in <code>ACTIVE</code> status that are currently running across all instances in
     * the fleet location.
     * </p>
     * 
     * @param activeServerProcessCount
     *        The number of server processes in <code>ACTIVE</code> status that are currently running across all
     *        instances in the fleet location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetUtilization withActiveServerProcessCount(Integer activeServerProcessCount) {
        setActiveServerProcessCount(activeServerProcessCount);
        return this;
    }

    /**
     * <p>
     * The number of active game sessions that are currently being hosted across all instances in the fleet location.
     * </p>
     * 
     * @param activeGameSessionCount
     *        The number of active game sessions that are currently being hosted across all instances in the fleet
     *        location.
     */

    public void setActiveGameSessionCount(Integer activeGameSessionCount) {
        this.activeGameSessionCount = activeGameSessionCount;
    }

    /**
     * <p>
     * The number of active game sessions that are currently being hosted across all instances in the fleet location.
     * </p>
     * 
     * @return The number of active game sessions that are currently being hosted across all instances in the fleet
     *         location.
     */

    public Integer getActiveGameSessionCount() {
        return this.activeGameSessionCount;
    }

    /**
     * <p>
     * The number of active game sessions that are currently being hosted across all instances in the fleet location.
     * </p>
     * 
     * @param activeGameSessionCount
     *        The number of active game sessions that are currently being hosted across all instances in the fleet
     *        location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetUtilization withActiveGameSessionCount(Integer activeGameSessionCount) {
        setActiveGameSessionCount(activeGameSessionCount);
        return this;
    }

    /**
     * <p>
     * The number of active player sessions that are currently being hosted across all instances in the fleet location.
     * </p>
     * 
     * @param currentPlayerSessionCount
     *        The number of active player sessions that are currently being hosted across all instances in the fleet
     *        location.
     */

    public void setCurrentPlayerSessionCount(Integer currentPlayerSessionCount) {
        this.currentPlayerSessionCount = currentPlayerSessionCount;
    }

    /**
     * <p>
     * The number of active player sessions that are currently being hosted across all instances in the fleet location.
     * </p>
     * 
     * @return The number of active player sessions that are currently being hosted across all instances in the fleet
     *         location.
     */

    public Integer getCurrentPlayerSessionCount() {
        return this.currentPlayerSessionCount;
    }

    /**
     * <p>
     * The number of active player sessions that are currently being hosted across all instances in the fleet location.
     * </p>
     * 
     * @param currentPlayerSessionCount
     *        The number of active player sessions that are currently being hosted across all instances in the fleet
     *        location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetUtilization withCurrentPlayerSessionCount(Integer currentPlayerSessionCount) {
        setCurrentPlayerSessionCount(currentPlayerSessionCount);
        return this;
    }

    /**
     * <p>
     * The maximum number of players allowed across all game sessions that are currently being hosted across all
     * instances in the fleet location.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        The maximum number of players allowed across all game sessions that are currently being hosted across all
     *        instances in the fleet location.
     */

    public void setMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        this.maximumPlayerSessionCount = maximumPlayerSessionCount;
    }

    /**
     * <p>
     * The maximum number of players allowed across all game sessions that are currently being hosted across all
     * instances in the fleet location.
     * </p>
     * 
     * @return The maximum number of players allowed across all game sessions that are currently being hosted across all
     *         instances in the fleet location.
     */

    public Integer getMaximumPlayerSessionCount() {
        return this.maximumPlayerSessionCount;
    }

    /**
     * <p>
     * The maximum number of players allowed across all game sessions that are currently being hosted across all
     * instances in the fleet location.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        The maximum number of players allowed across all game sessions that are currently being hosted across all
     *        instances in the fleet location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetUtilization withMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        setMaximumPlayerSessionCount(maximumPlayerSessionCount);
        return this;
    }

    /**
     * <p>
     * The fleet location for the fleet utilization information, expressed as an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The fleet location for the fleet utilization information, expressed as an AWS Region code, such as
     *        <code>us-west-2</code>.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The fleet location for the fleet utilization information, expressed as an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @return The fleet location for the fleet utilization information, expressed as an AWS Region code, such as
     *         <code>us-west-2</code>.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The fleet location for the fleet utilization information, expressed as an AWS Region code, such as
     * <code>us-west-2</code>.
     * </p>
     * 
     * @param location
     *        The fleet location for the fleet utilization information, expressed as an AWS Region code, such as
     *        <code>us-west-2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetUtilization withLocation(String location) {
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
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getActiveServerProcessCount() != null)
            sb.append("ActiveServerProcessCount: ").append(getActiveServerProcessCount()).append(",");
        if (getActiveGameSessionCount() != null)
            sb.append("ActiveGameSessionCount: ").append(getActiveGameSessionCount()).append(",");
        if (getCurrentPlayerSessionCount() != null)
            sb.append("CurrentPlayerSessionCount: ").append(getCurrentPlayerSessionCount()).append(",");
        if (getMaximumPlayerSessionCount() != null)
            sb.append("MaximumPlayerSessionCount: ").append(getMaximumPlayerSessionCount()).append(",");
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

        if (obj instanceof FleetUtilization == false)
            return false;
        FleetUtilization other = (FleetUtilization) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
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
        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getActiveServerProcessCount() == null) ? 0 : getActiveServerProcessCount().hashCode());
        hashCode = prime * hashCode + ((getActiveGameSessionCount() == null) ? 0 : getActiveGameSessionCount().hashCode());
        hashCode = prime * hashCode + ((getCurrentPlayerSessionCount() == null) ? 0 : getCurrentPlayerSessionCount().hashCode());
        hashCode = prime * hashCode + ((getMaximumPlayerSessionCount() == null) ? 0 : getMaximumPlayerSessionCount().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
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
