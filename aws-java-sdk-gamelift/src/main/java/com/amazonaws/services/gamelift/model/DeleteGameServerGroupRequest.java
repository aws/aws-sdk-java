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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteGameServerGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteGameServerGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     */
    private String gameServerGroupName;
    /**
     * <p>
     * The type of delete to perform. Options include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAFE_DELETE</code> – (default) Terminates the game server group and EC2 Auto Scaling group only when it has
     * no game servers that are in <code>UTILIZED</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DELETE</code> – Terminates the game server group, including all active game servers regardless of
     * their utilization status, and the EC2 Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code> – Does a safe delete of the game server group but retains the EC2 Auto Scaling group as is.
     * </p>
     * </li>
     * </ul>
     */
    private String deleteOption;

    /**
     * <p>
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     */

    public void setGameServerGroupName(String gameServerGroupName) {
        this.gameServerGroupName = gameServerGroupName;
    }

    /**
     * <p>
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @return A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     */

    public String getGameServerGroupName() {
        return this.gameServerGroupName;
    }

    /**
     * <p>
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteGameServerGroupRequest withGameServerGroupName(String gameServerGroupName) {
        setGameServerGroupName(gameServerGroupName);
        return this;
    }

    /**
     * <p>
     * The type of delete to perform. Options include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAFE_DELETE</code> – (default) Terminates the game server group and EC2 Auto Scaling group only when it has
     * no game servers that are in <code>UTILIZED</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DELETE</code> – Terminates the game server group, including all active game servers regardless of
     * their utilization status, and the EC2 Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code> – Does a safe delete of the game server group but retains the EC2 Auto Scaling group as is.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteOption
     *        The type of delete to perform. Options include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SAFE_DELETE</code> – (default) Terminates the game server group and EC2 Auto Scaling group only when
     *        it has no game servers that are in <code>UTILIZED</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORCE_DELETE</code> – Terminates the game server group, including all active game servers regardless
     *        of their utilization status, and the EC2 Auto Scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RETAIN</code> – Does a safe delete of the game server group but retains the EC2 Auto Scaling group
     *        as is.
     *        </p>
     *        </li>
     * @see GameServerGroupDeleteOption
     */

    public void setDeleteOption(String deleteOption) {
        this.deleteOption = deleteOption;
    }

    /**
     * <p>
     * The type of delete to perform. Options include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAFE_DELETE</code> – (default) Terminates the game server group and EC2 Auto Scaling group only when it has
     * no game servers that are in <code>UTILIZED</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DELETE</code> – Terminates the game server group, including all active game servers regardless of
     * their utilization status, and the EC2 Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code> – Does a safe delete of the game server group but retains the EC2 Auto Scaling group as is.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of delete to perform. Options include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SAFE_DELETE</code> – (default) Terminates the game server group and EC2 Auto Scaling group only
     *         when it has no game servers that are in <code>UTILIZED</code> status.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FORCE_DELETE</code> – Terminates the game server group, including all active game servers
     *         regardless of their utilization status, and the EC2 Auto Scaling group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RETAIN</code> – Does a safe delete of the game server group but retains the EC2 Auto Scaling group
     *         as is.
     *         </p>
     *         </li>
     * @see GameServerGroupDeleteOption
     */

    public String getDeleteOption() {
        return this.deleteOption;
    }

    /**
     * <p>
     * The type of delete to perform. Options include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAFE_DELETE</code> – (default) Terminates the game server group and EC2 Auto Scaling group only when it has
     * no game servers that are in <code>UTILIZED</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DELETE</code> – Terminates the game server group, including all active game servers regardless of
     * their utilization status, and the EC2 Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code> – Does a safe delete of the game server group but retains the EC2 Auto Scaling group as is.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteOption
     *        The type of delete to perform. Options include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SAFE_DELETE</code> – (default) Terminates the game server group and EC2 Auto Scaling group only when
     *        it has no game servers that are in <code>UTILIZED</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORCE_DELETE</code> – Terminates the game server group, including all active game servers regardless
     *        of their utilization status, and the EC2 Auto Scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RETAIN</code> – Does a safe delete of the game server group but retains the EC2 Auto Scaling group
     *        as is.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerGroupDeleteOption
     */

    public DeleteGameServerGroupRequest withDeleteOption(String deleteOption) {
        setDeleteOption(deleteOption);
        return this;
    }

    /**
     * <p>
     * The type of delete to perform. Options include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SAFE_DELETE</code> – (default) Terminates the game server group and EC2 Auto Scaling group only when it has
     * no game servers that are in <code>UTILIZED</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FORCE_DELETE</code> – Terminates the game server group, including all active game servers regardless of
     * their utilization status, and the EC2 Auto Scaling group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RETAIN</code> – Does a safe delete of the game server group but retains the EC2 Auto Scaling group as is.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteOption
     *        The type of delete to perform. Options include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SAFE_DELETE</code> – (default) Terminates the game server group and EC2 Auto Scaling group only when
     *        it has no game servers that are in <code>UTILIZED</code> status.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FORCE_DELETE</code> – Terminates the game server group, including all active game servers regardless
     *        of their utilization status, and the EC2 Auto Scaling group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RETAIN</code> – Does a safe delete of the game server group but retains the EC2 Auto Scaling group
     *        as is.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerGroupDeleteOption
     */

    public DeleteGameServerGroupRequest withDeleteOption(GameServerGroupDeleteOption deleteOption) {
        this.deleteOption = deleteOption.toString();
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
        if (getDeleteOption() != null)
            sb.append("DeleteOption: ").append(getDeleteOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteGameServerGroupRequest == false)
            return false;
        DeleteGameServerGroupRequest other = (DeleteGameServerGroupRequest) obj;
        if (other.getGameServerGroupName() == null ^ this.getGameServerGroupName() == null)
            return false;
        if (other.getGameServerGroupName() != null && other.getGameServerGroupName().equals(this.getGameServerGroupName()) == false)
            return false;
        if (other.getDeleteOption() == null ^ this.getDeleteOption() == null)
            return false;
        if (other.getDeleteOption() != null && other.getDeleteOption().equals(this.getDeleteOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameServerGroupName() == null) ? 0 : getGameServerGroupName().hashCode());
        hashCode = prime * hashCode + ((getDeleteOption() == null) ? 0 : getDeleteOption().hashCode());
        return hashCode;
    }

    @Override
    public DeleteGameServerGroupRequest clone() {
        return (DeleteGameServerGroupRequest) super.clone();
    }

}
