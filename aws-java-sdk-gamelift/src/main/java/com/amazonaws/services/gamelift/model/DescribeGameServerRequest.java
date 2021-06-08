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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGameServerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the game server group where the game server is running. Use either the
     * <a>GameServerGroup</a> name or ARN value.
     * </p>
     */
    private String gameServerGroupName;
    /**
     * <p>
     * A custom string that uniquely identifies the game server information to be retrieved.
     * </p>
     */
    private String gameServerId;

    /**
     * <p>
     * A unique identifier for the game server group where the game server is running. Use either the
     * <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        A unique identifier for the game server group where the game server is running. Use either the
     *        <a>GameServerGroup</a> name or ARN value.
     */

    public void setGameServerGroupName(String gameServerGroupName) {
        this.gameServerGroupName = gameServerGroupName;
    }

    /**
     * <p>
     * A unique identifier for the game server group where the game server is running. Use either the
     * <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @return A unique identifier for the game server group where the game server is running. Use either the
     *         <a>GameServerGroup</a> name or ARN value.
     */

    public String getGameServerGroupName() {
        return this.gameServerGroupName;
    }

    /**
     * <p>
     * A unique identifier for the game server group where the game server is running. Use either the
     * <a>GameServerGroup</a> name or ARN value.
     * </p>
     * 
     * @param gameServerGroupName
     *        A unique identifier for the game server group where the game server is running. Use either the
     *        <a>GameServerGroup</a> name or ARN value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameServerRequest withGameServerGroupName(String gameServerGroupName) {
        setGameServerGroupName(gameServerGroupName);
        return this;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the game server information to be retrieved.
     * </p>
     * 
     * @param gameServerId
     *        A custom string that uniquely identifies the game server information to be retrieved.
     */

    public void setGameServerId(String gameServerId) {
        this.gameServerId = gameServerId;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the game server information to be retrieved.
     * </p>
     * 
     * @return A custom string that uniquely identifies the game server information to be retrieved.
     */

    public String getGameServerId() {
        return this.gameServerId;
    }

    /**
     * <p>
     * A custom string that uniquely identifies the game server information to be retrieved.
     * </p>
     * 
     * @param gameServerId
     *        A custom string that uniquely identifies the game server information to be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameServerRequest withGameServerId(String gameServerId) {
        setGameServerId(gameServerId);
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
        if (getGameServerId() != null)
            sb.append("GameServerId: ").append(getGameServerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGameServerRequest == false)
            return false;
        DescribeGameServerRequest other = (DescribeGameServerRequest) obj;
        if (other.getGameServerGroupName() == null ^ this.getGameServerGroupName() == null)
            return false;
        if (other.getGameServerGroupName() != null && other.getGameServerGroupName().equals(this.getGameServerGroupName()) == false)
            return false;
        if (other.getGameServerId() == null ^ this.getGameServerId() == null)
            return false;
        if (other.getGameServerId() != null && other.getGameServerId().equals(this.getGameServerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameServerGroupName() == null) ? 0 : getGameServerGroupName().hashCode());
        hashCode = prime * hashCode + ((getGameServerId() == null) ? 0 : getGameServerId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGameServerRequest clone() {
        return (DescribeGameServerRequest) super.clone();
    }

}
