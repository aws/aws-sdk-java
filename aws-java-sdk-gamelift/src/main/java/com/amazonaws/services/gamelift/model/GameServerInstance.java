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
 * <b>This data type is used with the GameLift FleetIQ and game server groups.</b>
 * </p>
 * <p>
 * Additional properties, including status, that describe an EC2 instance in a game server group. Instance
 * configurations are set with game server group properties (see <code>DescribeGameServerGroup</code> and with the EC2
 * launch template that was used when creating the game server group.
 * </p>
 * <p>
 * Retrieve game server instances for a game server group by calling <code>DescribeGameServerInstances</code>.
 * </p>
 * <p>
 * <b>Related actions</b>
 * </p>
 * <p>
 * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
 * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
 * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
 * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by task</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GameServerInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameServerInstance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A developer-defined identifier for the game server group that includes the game server instance. The name is
     * unique for each Region in each AWS account.
     * </p>
     */
    private String gameServerGroupName;
    /**
     * <p>
     * A generated unique identifier for the game server group that includes the game server instance.
     * </p>
     */
    private String gameServerGroupArn;
    /**
     * <p>
     * The unique identifier for the instance where the game server is running. This ID is available in the instance
     * metadata. EC2 instance IDs use a 17-character format, for example: <code>i-1234567890abcdef0</code>.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Current status of the game server instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance is viable for hosting game servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DRAINING</b> -- The instance is not viable for hosting game servers. Existing game servers are in the process
     * of ending, and new game servers are not started on this instance unless no other resources are available. When
     * the instance is put in DRAINING, a new instance is started up to replace it. Once the instance has no UTILIZED
     * game servers, it will be terminated in favor of the new instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SPOT_TERMINATING</b> -- The instance is in the process of shutting down due to a Spot instance interruption.
     * No new game servers are started on this instance.
     * </p>
     * </li>
     * </ul>
     */
    private String instanceStatus;

    /**
     * <p>
     * A developer-defined identifier for the game server group that includes the game server instance. The name is
     * unique for each Region in each AWS account.
     * </p>
     * 
     * @param gameServerGroupName
     *        A developer-defined identifier for the game server group that includes the game server instance. The name
     *        is unique for each Region in each AWS account.
     */

    public void setGameServerGroupName(String gameServerGroupName) {
        this.gameServerGroupName = gameServerGroupName;
    }

    /**
     * <p>
     * A developer-defined identifier for the game server group that includes the game server instance. The name is
     * unique for each Region in each AWS account.
     * </p>
     * 
     * @return A developer-defined identifier for the game server group that includes the game server instance. The name
     *         is unique for each Region in each AWS account.
     */

    public String getGameServerGroupName() {
        return this.gameServerGroupName;
    }

    /**
     * <p>
     * A developer-defined identifier for the game server group that includes the game server instance. The name is
     * unique for each Region in each AWS account.
     * </p>
     * 
     * @param gameServerGroupName
     *        A developer-defined identifier for the game server group that includes the game server instance. The name
     *        is unique for each Region in each AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServerInstance withGameServerGroupName(String gameServerGroupName) {
        setGameServerGroupName(gameServerGroupName);
        return this;
    }

    /**
     * <p>
     * A generated unique identifier for the game server group that includes the game server instance.
     * </p>
     * 
     * @param gameServerGroupArn
     *        A generated unique identifier for the game server group that includes the game server instance.
     */

    public void setGameServerGroupArn(String gameServerGroupArn) {
        this.gameServerGroupArn = gameServerGroupArn;
    }

    /**
     * <p>
     * A generated unique identifier for the game server group that includes the game server instance.
     * </p>
     * 
     * @return A generated unique identifier for the game server group that includes the game server instance.
     */

    public String getGameServerGroupArn() {
        return this.gameServerGroupArn;
    }

    /**
     * <p>
     * A generated unique identifier for the game server group that includes the game server instance.
     * </p>
     * 
     * @param gameServerGroupArn
     *        A generated unique identifier for the game server group that includes the game server instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServerInstance withGameServerGroupArn(String gameServerGroupArn) {
        setGameServerGroupArn(gameServerGroupArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the instance where the game server is running. This ID is available in the instance
     * metadata. EC2 instance IDs use a 17-character format, for example: <code>i-1234567890abcdef0</code>.
     * </p>
     * 
     * @param instanceId
     *        The unique identifier for the instance where the game server is running. This ID is available in the
     *        instance metadata. EC2 instance IDs use a 17-character format, for example:
     *        <code>i-1234567890abcdef0</code>.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The unique identifier for the instance where the game server is running. This ID is available in the instance
     * metadata. EC2 instance IDs use a 17-character format, for example: <code>i-1234567890abcdef0</code>.
     * </p>
     * 
     * @return The unique identifier for the instance where the game server is running. This ID is available in the
     *         instance metadata. EC2 instance IDs use a 17-character format, for example:
     *         <code>i-1234567890abcdef0</code>.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The unique identifier for the instance where the game server is running. This ID is available in the instance
     * metadata. EC2 instance IDs use a 17-character format, for example: <code>i-1234567890abcdef0</code>.
     * </p>
     * 
     * @param instanceId
     *        The unique identifier for the instance where the game server is running. This ID is available in the
     *        instance metadata. EC2 instance IDs use a 17-character format, for example:
     *        <code>i-1234567890abcdef0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameServerInstance withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Current status of the game server instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance is viable for hosting game servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DRAINING</b> -- The instance is not viable for hosting game servers. Existing game servers are in the process
     * of ending, and new game servers are not started on this instance unless no other resources are available. When
     * the instance is put in DRAINING, a new instance is started up to replace it. Once the instance has no UTILIZED
     * game servers, it will be terminated in favor of the new instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SPOT_TERMINATING</b> -- The instance is in the process of shutting down due to a Spot instance interruption.
     * No new game servers are started on this instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceStatus
     *        Current status of the game server instance. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The instance is viable for hosting game servers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DRAINING</b> -- The instance is not viable for hosting game servers. Existing game servers are in the
     *        process of ending, and new game servers are not started on this instance unless no other resources are
     *        available. When the instance is put in DRAINING, a new instance is started up to replace it. Once the
     *        instance has no UTILIZED game servers, it will be terminated in favor of the new instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SPOT_TERMINATING</b> -- The instance is in the process of shutting down due to a Spot instance
     *        interruption. No new game servers are started on this instance.
     *        </p>
     *        </li>
     * @see GameServerInstanceStatus
     */

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    /**
     * <p>
     * Current status of the game server instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance is viable for hosting game servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DRAINING</b> -- The instance is not viable for hosting game servers. Existing game servers are in the process
     * of ending, and new game servers are not started on this instance unless no other resources are available. When
     * the instance is put in DRAINING, a new instance is started up to replace it. Once the instance has no UTILIZED
     * game servers, it will be terminated in favor of the new instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SPOT_TERMINATING</b> -- The instance is in the process of shutting down due to a Spot instance interruption.
     * No new game servers are started on this instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Current status of the game server instance. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ACTIVE</b> -- The instance is viable for hosting game servers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DRAINING</b> -- The instance is not viable for hosting game servers. Existing game servers are in the
     *         process of ending, and new game servers are not started on this instance unless no other resources are
     *         available. When the instance is put in DRAINING, a new instance is started up to replace it. Once the
     *         instance has no UTILIZED game servers, it will be terminated in favor of the new instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SPOT_TERMINATING</b> -- The instance is in the process of shutting down due to a Spot instance
     *         interruption. No new game servers are started on this instance.
     *         </p>
     *         </li>
     * @see GameServerInstanceStatus
     */

    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * <p>
     * Current status of the game server instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance is viable for hosting game servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DRAINING</b> -- The instance is not viable for hosting game servers. Existing game servers are in the process
     * of ending, and new game servers are not started on this instance unless no other resources are available. When
     * the instance is put in DRAINING, a new instance is started up to replace it. Once the instance has no UTILIZED
     * game servers, it will be terminated in favor of the new instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SPOT_TERMINATING</b> -- The instance is in the process of shutting down due to a Spot instance interruption.
     * No new game servers are started on this instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceStatus
     *        Current status of the game server instance. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The instance is viable for hosting game servers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DRAINING</b> -- The instance is not viable for hosting game servers. Existing game servers are in the
     *        process of ending, and new game servers are not started on this instance unless no other resources are
     *        available. When the instance is put in DRAINING, a new instance is started up to replace it. Once the
     *        instance has no UTILIZED game servers, it will be terminated in favor of the new instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SPOT_TERMINATING</b> -- The instance is in the process of shutting down due to a Spot instance
     *        interruption. No new game servers are started on this instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerInstanceStatus
     */

    public GameServerInstance withInstanceStatus(String instanceStatus) {
        setInstanceStatus(instanceStatus);
        return this;
    }

    /**
     * <p>
     * Current status of the game server instance.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance is viable for hosting game servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DRAINING</b> -- The instance is not viable for hosting game servers. Existing game servers are in the process
     * of ending, and new game servers are not started on this instance unless no other resources are available. When
     * the instance is put in DRAINING, a new instance is started up to replace it. Once the instance has no UTILIZED
     * game servers, it will be terminated in favor of the new instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SPOT_TERMINATING</b> -- The instance is in the process of shutting down due to a Spot instance interruption.
     * No new game servers are started on this instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceStatus
     *        Current status of the game server instance. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The instance is viable for hosting game servers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DRAINING</b> -- The instance is not viable for hosting game servers. Existing game servers are in the
     *        process of ending, and new game servers are not started on this instance unless no other resources are
     *        available. When the instance is put in DRAINING, a new instance is started up to replace it. Once the
     *        instance has no UTILIZED game servers, it will be terminated in favor of the new instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SPOT_TERMINATING</b> -- The instance is in the process of shutting down due to a Spot instance
     *        interruption. No new game servers are started on this instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerInstanceStatus
     */

    public GameServerInstance withInstanceStatus(GameServerInstanceStatus instanceStatus) {
        this.instanceStatus = instanceStatus.toString();
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
        if (getGameServerGroupName() != null)
            sb.append("GameServerGroupName: ").append(getGameServerGroupName()).append(",");
        if (getGameServerGroupArn() != null)
            sb.append("GameServerGroupArn: ").append(getGameServerGroupArn()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceStatus() != null)
            sb.append("InstanceStatus: ").append(getInstanceStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GameServerInstance == false)
            return false;
        GameServerInstance other = (GameServerInstance) obj;
        if (other.getGameServerGroupName() == null ^ this.getGameServerGroupName() == null)
            return false;
        if (other.getGameServerGroupName() != null && other.getGameServerGroupName().equals(this.getGameServerGroupName()) == false)
            return false;
        if (other.getGameServerGroupArn() == null ^ this.getGameServerGroupArn() == null)
            return false;
        if (other.getGameServerGroupArn() != null && other.getGameServerGroupArn().equals(this.getGameServerGroupArn()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceStatus() == null ^ this.getInstanceStatus() == null)
            return false;
        if (other.getInstanceStatus() != null && other.getInstanceStatus().equals(this.getInstanceStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameServerGroupName() == null) ? 0 : getGameServerGroupName().hashCode());
        hashCode = prime * hashCode + ((getGameServerGroupArn() == null) ? 0 : getGameServerGroupArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceStatus() == null) ? 0 : getInstanceStatus().hashCode());
        return hashCode;
    }

    @Override
    public GameServerInstance clone() {
        try {
            return (GameServerInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.GameServerInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
