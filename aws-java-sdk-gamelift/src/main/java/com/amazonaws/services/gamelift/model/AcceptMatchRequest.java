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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/AcceptMatch" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptMatchRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a matchmaking ticket. The ticket must be in status <code>REQUIRES_ACCEPTANCE</code>;
     * otherwise this request will fail.
     * </p>
     */
    private String ticketId;
    /**
     * <p>
     * Unique identifier for a player delivering the response. This parameter can include one or multiple player IDs.
     * </p>
     */
    private java.util.List<String> playerIds;
    /**
     * <p>
     * Player response to the proposed match.
     * </p>
     */
    private String acceptanceType;

    /**
     * <p>
     * Unique identifier for a matchmaking ticket. The ticket must be in status <code>REQUIRES_ACCEPTANCE</code>;
     * otherwise this request will fail.
     * </p>
     * 
     * @param ticketId
     *        Unique identifier for a matchmaking ticket. The ticket must be in status <code>REQUIRES_ACCEPTANCE</code>;
     *        otherwise this request will fail.
     */

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking ticket. The ticket must be in status <code>REQUIRES_ACCEPTANCE</code>;
     * otherwise this request will fail.
     * </p>
     * 
     * @return Unique identifier for a matchmaking ticket. The ticket must be in status <code>REQUIRES_ACCEPTANCE</code>
     *         ; otherwise this request will fail.
     */

    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking ticket. The ticket must be in status <code>REQUIRES_ACCEPTANCE</code>;
     * otherwise this request will fail.
     * </p>
     * 
     * @param ticketId
     *        Unique identifier for a matchmaking ticket. The ticket must be in status <code>REQUIRES_ACCEPTANCE</code>;
     *        otherwise this request will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptMatchRequest withTicketId(String ticketId) {
        setTicketId(ticketId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a player delivering the response. This parameter can include one or multiple player IDs.
     * </p>
     * 
     * @return Unique identifier for a player delivering the response. This parameter can include one or multiple player
     *         IDs.
     */

    public java.util.List<String> getPlayerIds() {
        return playerIds;
    }

    /**
     * <p>
     * Unique identifier for a player delivering the response. This parameter can include one or multiple player IDs.
     * </p>
     * 
     * @param playerIds
     *        Unique identifier for a player delivering the response. This parameter can include one or multiple player
     *        IDs.
     */

    public void setPlayerIds(java.util.Collection<String> playerIds) {
        if (playerIds == null) {
            this.playerIds = null;
            return;
        }

        this.playerIds = new java.util.ArrayList<String>(playerIds);
    }

    /**
     * <p>
     * Unique identifier for a player delivering the response. This parameter can include one or multiple player IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlayerIds(java.util.Collection)} or {@link #withPlayerIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param playerIds
     *        Unique identifier for a player delivering the response. This parameter can include one or multiple player
     *        IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptMatchRequest withPlayerIds(String... playerIds) {
        if (this.playerIds == null) {
            setPlayerIds(new java.util.ArrayList<String>(playerIds.length));
        }
        for (String ele : playerIds) {
            this.playerIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Unique identifier for a player delivering the response. This parameter can include one or multiple player IDs.
     * </p>
     * 
     * @param playerIds
     *        Unique identifier for a player delivering the response. This parameter can include one or multiple player
     *        IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptMatchRequest withPlayerIds(java.util.Collection<String> playerIds) {
        setPlayerIds(playerIds);
        return this;
    }

    /**
     * <p>
     * Player response to the proposed match.
     * </p>
     * 
     * @param acceptanceType
     *        Player response to the proposed match.
     * @see AcceptanceType
     */

    public void setAcceptanceType(String acceptanceType) {
        this.acceptanceType = acceptanceType;
    }

    /**
     * <p>
     * Player response to the proposed match.
     * </p>
     * 
     * @return Player response to the proposed match.
     * @see AcceptanceType
     */

    public String getAcceptanceType() {
        return this.acceptanceType;
    }

    /**
     * <p>
     * Player response to the proposed match.
     * </p>
     * 
     * @param acceptanceType
     *        Player response to the proposed match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptanceType
     */

    public AcceptMatchRequest withAcceptanceType(String acceptanceType) {
        setAcceptanceType(acceptanceType);
        return this;
    }

    /**
     * <p>
     * Player response to the proposed match.
     * </p>
     * 
     * @param acceptanceType
     *        Player response to the proposed match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptanceType
     */

    public AcceptMatchRequest withAcceptanceType(AcceptanceType acceptanceType) {
        this.acceptanceType = acceptanceType.toString();
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
        if (getTicketId() != null)
            sb.append("TicketId: ").append(getTicketId()).append(",");
        if (getPlayerIds() != null)
            sb.append("PlayerIds: ").append(getPlayerIds()).append(",");
        if (getAcceptanceType() != null)
            sb.append("AcceptanceType: ").append(getAcceptanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptMatchRequest == false)
            return false;
        AcceptMatchRequest other = (AcceptMatchRequest) obj;
        if (other.getTicketId() == null ^ this.getTicketId() == null)
            return false;
        if (other.getTicketId() != null && other.getTicketId().equals(this.getTicketId()) == false)
            return false;
        if (other.getPlayerIds() == null ^ this.getPlayerIds() == null)
            return false;
        if (other.getPlayerIds() != null && other.getPlayerIds().equals(this.getPlayerIds()) == false)
            return false;
        if (other.getAcceptanceType() == null ^ this.getAcceptanceType() == null)
            return false;
        if (other.getAcceptanceType() != null && other.getAcceptanceType().equals(this.getAcceptanceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTicketId() == null) ? 0 : getTicketId().hashCode());
        hashCode = prime * hashCode + ((getPlayerIds() == null) ? 0 : getPlayerIds().hashCode());
        hashCode = prime * hashCode + ((getAcceptanceType() == null) ? 0 : getAcceptanceType().hashCode());
        return hashCode;
    }

    @Override
    public AcceptMatchRequest clone() {
        return (AcceptMatchRequest) super.clone();
    }

}
