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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopMatchmaking" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopMatchmakingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a matchmaking ticket.
     * </p>
     */
    private String ticketId;

    /**
     * <p>
     * Unique identifier for a matchmaking ticket.
     * </p>
     * 
     * @param ticketId
     *        Unique identifier for a matchmaking ticket.
     */

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking ticket.
     * </p>
     * 
     * @return Unique identifier for a matchmaking ticket.
     */

    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking ticket.
     * </p>
     * 
     * @param ticketId
     *        Unique identifier for a matchmaking ticket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopMatchmakingRequest withTicketId(String ticketId) {
        setTicketId(ticketId);
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
            sb.append("TicketId: ").append(getTicketId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopMatchmakingRequest == false)
            return false;
        StopMatchmakingRequest other = (StopMatchmakingRequest) obj;
        if (other.getTicketId() == null ^ this.getTicketId() == null)
            return false;
        if (other.getTicketId() != null && other.getTicketId().equals(this.getTicketId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTicketId() == null) ? 0 : getTicketId().hashCode());
        return hashCode;
    }

    @Override
    public StopMatchmakingRequest clone() {
        return (StopMatchmakingRequest) super.clone();
    }

}
