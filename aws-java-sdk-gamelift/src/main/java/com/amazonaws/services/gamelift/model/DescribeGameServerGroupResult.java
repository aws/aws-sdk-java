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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameServerGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGameServerGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object with the property settings for the requested game server group resource.
     * </p>
     */
    private GameServerGroup gameServerGroup;

    /**
     * <p>
     * An object with the property settings for the requested game server group resource.
     * </p>
     * 
     * @param gameServerGroup
     *        An object with the property settings for the requested game server group resource.
     */

    public void setGameServerGroup(GameServerGroup gameServerGroup) {
        this.gameServerGroup = gameServerGroup;
    }

    /**
     * <p>
     * An object with the property settings for the requested game server group resource.
     * </p>
     * 
     * @return An object with the property settings for the requested game server group resource.
     */

    public GameServerGroup getGameServerGroup() {
        return this.gameServerGroup;
    }

    /**
     * <p>
     * An object with the property settings for the requested game server group resource.
     * </p>
     * 
     * @param gameServerGroup
     *        An object with the property settings for the requested game server group resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGameServerGroupResult withGameServerGroup(GameServerGroup gameServerGroup) {
        setGameServerGroup(gameServerGroup);
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
        if (getGameServerGroup() != null)
            sb.append("GameServerGroup: ").append(getGameServerGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGameServerGroupResult == false)
            return false;
        DescribeGameServerGroupResult other = (DescribeGameServerGroupResult) obj;
        if (other.getGameServerGroup() == null ^ this.getGameServerGroup() == null)
            return false;
        if (other.getGameServerGroup() != null && other.getGameServerGroup().equals(this.getGameServerGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameServerGroup() == null) ? 0 : getGameServerGroup().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGameServerGroupResult clone() {
        try {
            return (DescribeGameServerGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
