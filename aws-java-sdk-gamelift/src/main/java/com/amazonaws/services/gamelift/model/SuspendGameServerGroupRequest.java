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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/SuspendGameServerGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuspendGameServerGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the game server group. Use either the <a>GameServerGroup</a> name or ARN value.
     * </p>
     */
    private String gameServerGroupName;
    /**
     * <p>
     * The activity to suspend for this game server group.
     * </p>
     */
    private java.util.List<String> suspendActions;

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

    public SuspendGameServerGroupRequest withGameServerGroupName(String gameServerGroupName) {
        setGameServerGroupName(gameServerGroupName);
        return this;
    }

    /**
     * <p>
     * The activity to suspend for this game server group.
     * </p>
     * 
     * @return The activity to suspend for this game server group.
     * @see GameServerGroupAction
     */

    public java.util.List<String> getSuspendActions() {
        return suspendActions;
    }

    /**
     * <p>
     * The activity to suspend for this game server group.
     * </p>
     * 
     * @param suspendActions
     *        The activity to suspend for this game server group.
     * @see GameServerGroupAction
     */

    public void setSuspendActions(java.util.Collection<String> suspendActions) {
        if (suspendActions == null) {
            this.suspendActions = null;
            return;
        }

        this.suspendActions = new java.util.ArrayList<String>(suspendActions);
    }

    /**
     * <p>
     * The activity to suspend for this game server group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuspendActions(java.util.Collection)} or {@link #withSuspendActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param suspendActions
     *        The activity to suspend for this game server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerGroupAction
     */

    public SuspendGameServerGroupRequest withSuspendActions(String... suspendActions) {
        if (this.suspendActions == null) {
            setSuspendActions(new java.util.ArrayList<String>(suspendActions.length));
        }
        for (String ele : suspendActions) {
            this.suspendActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The activity to suspend for this game server group.
     * </p>
     * 
     * @param suspendActions
     *        The activity to suspend for this game server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerGroupAction
     */

    public SuspendGameServerGroupRequest withSuspendActions(java.util.Collection<String> suspendActions) {
        setSuspendActions(suspendActions);
        return this;
    }

    /**
     * <p>
     * The activity to suspend for this game server group.
     * </p>
     * 
     * @param suspendActions
     *        The activity to suspend for this game server group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see GameServerGroupAction
     */

    public SuspendGameServerGroupRequest withSuspendActions(GameServerGroupAction... suspendActions) {
        java.util.ArrayList<String> suspendActionsCopy = new java.util.ArrayList<String>(suspendActions.length);
        for (GameServerGroupAction value : suspendActions) {
            suspendActionsCopy.add(value.toString());
        }
        if (getSuspendActions() == null) {
            setSuspendActions(suspendActionsCopy);
        } else {
            getSuspendActions().addAll(suspendActionsCopy);
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
        if (getGameServerGroupName() != null)
            sb.append("GameServerGroupName: ").append(getGameServerGroupName()).append(",");
        if (getSuspendActions() != null)
            sb.append("SuspendActions: ").append(getSuspendActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SuspendGameServerGroupRequest == false)
            return false;
        SuspendGameServerGroupRequest other = (SuspendGameServerGroupRequest) obj;
        if (other.getGameServerGroupName() == null ^ this.getGameServerGroupName() == null)
            return false;
        if (other.getGameServerGroupName() != null && other.getGameServerGroupName().equals(this.getGameServerGroupName()) == false)
            return false;
        if (other.getSuspendActions() == null ^ this.getSuspendActions() == null)
            return false;
        if (other.getSuspendActions() != null && other.getSuspendActions().equals(this.getSuspendActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameServerGroupName() == null) ? 0 : getGameServerGroupName().hashCode());
        hashCode = prime * hashCode + ((getSuspendActions() == null) ? 0 : getSuspendActions().hashCode());
        return hashCode;
    }

    @Override
    public SuspendGameServerGroupRequest clone() {
        return (SuspendGameServerGroupRequest) super.clone();
    }

}
