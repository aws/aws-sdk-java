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
 * Regional latency information for a player, used when requesting a new game session with
 * <a>StartGameSessionPlacement</a>. This value indicates the amount of time lag that exists when the player is
 * connected to a fleet in the specified region. The relative difference between a player's latency values for multiple
 * regions are used to determine which fleets are best suited to place a new game session for the player.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/PlayerLatency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlayerLatency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for a player associated with the latency data.
     * </p>
     */
    private String playerId;
    /**
     * <p>
     * Name of the region that is associated with the latency value.
     * </p>
     */
    private String regionIdentifier;
    /**
     * <p>
     * Amount of time that represents the time lag experienced by the player when connected to the specified region.
     * </p>
     */
    private Float latencyInMilliseconds;

    /**
     * <p>
     * Unique identifier for a player associated with the latency data.
     * </p>
     * 
     * @param playerId
     *        Unique identifier for a player associated with the latency data.
     */

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    /**
     * <p>
     * Unique identifier for a player associated with the latency data.
     * </p>
     * 
     * @return Unique identifier for a player associated with the latency data.
     */

    public String getPlayerId() {
        return this.playerId;
    }

    /**
     * <p>
     * Unique identifier for a player associated with the latency data.
     * </p>
     * 
     * @param playerId
     *        Unique identifier for a player associated with the latency data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayerLatency withPlayerId(String playerId) {
        setPlayerId(playerId);
        return this;
    }

    /**
     * <p>
     * Name of the region that is associated with the latency value.
     * </p>
     * 
     * @param regionIdentifier
     *        Name of the region that is associated with the latency value.
     */

    public void setRegionIdentifier(String regionIdentifier) {
        this.regionIdentifier = regionIdentifier;
    }

    /**
     * <p>
     * Name of the region that is associated with the latency value.
     * </p>
     * 
     * @return Name of the region that is associated with the latency value.
     */

    public String getRegionIdentifier() {
        return this.regionIdentifier;
    }

    /**
     * <p>
     * Name of the region that is associated with the latency value.
     * </p>
     * 
     * @param regionIdentifier
     *        Name of the region that is associated with the latency value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayerLatency withRegionIdentifier(String regionIdentifier) {
        setRegionIdentifier(regionIdentifier);
        return this;
    }

    /**
     * <p>
     * Amount of time that represents the time lag experienced by the player when connected to the specified region.
     * </p>
     * 
     * @param latencyInMilliseconds
     *        Amount of time that represents the time lag experienced by the player when connected to the specified
     *        region.
     */

    public void setLatencyInMilliseconds(Float latencyInMilliseconds) {
        this.latencyInMilliseconds = latencyInMilliseconds;
    }

    /**
     * <p>
     * Amount of time that represents the time lag experienced by the player when connected to the specified region.
     * </p>
     * 
     * @return Amount of time that represents the time lag experienced by the player when connected to the specified
     *         region.
     */

    public Float getLatencyInMilliseconds() {
        return this.latencyInMilliseconds;
    }

    /**
     * <p>
     * Amount of time that represents the time lag experienced by the player when connected to the specified region.
     * </p>
     * 
     * @param latencyInMilliseconds
     *        Amount of time that represents the time lag experienced by the player when connected to the specified
     *        region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayerLatency withLatencyInMilliseconds(Float latencyInMilliseconds) {
        setLatencyInMilliseconds(latencyInMilliseconds);
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
        if (getPlayerId() != null)
            sb.append("PlayerId: ").append(getPlayerId()).append(",");
        if (getRegionIdentifier() != null)
            sb.append("RegionIdentifier: ").append(getRegionIdentifier()).append(",");
        if (getLatencyInMilliseconds() != null)
            sb.append("LatencyInMilliseconds: ").append(getLatencyInMilliseconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlayerLatency == false)
            return false;
        PlayerLatency other = (PlayerLatency) obj;
        if (other.getPlayerId() == null ^ this.getPlayerId() == null)
            return false;
        if (other.getPlayerId() != null && other.getPlayerId().equals(this.getPlayerId()) == false)
            return false;
        if (other.getRegionIdentifier() == null ^ this.getRegionIdentifier() == null)
            return false;
        if (other.getRegionIdentifier() != null && other.getRegionIdentifier().equals(this.getRegionIdentifier()) == false)
            return false;
        if (other.getLatencyInMilliseconds() == null ^ this.getLatencyInMilliseconds() == null)
            return false;
        if (other.getLatencyInMilliseconds() != null && other.getLatencyInMilliseconds().equals(this.getLatencyInMilliseconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlayerId() == null) ? 0 : getPlayerId().hashCode());
        hashCode = prime * hashCode + ((getRegionIdentifier() == null) ? 0 : getRegionIdentifier().hashCode());
        hashCode = prime * hashCode + ((getLatencyInMilliseconds() == null) ? 0 : getLatencyInMilliseconds().hashCode());
        return hashCode;
    }

    @Override
    public PlayerLatency clone() {
        try {
            return (PlayerLatency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.PlayerLatencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
