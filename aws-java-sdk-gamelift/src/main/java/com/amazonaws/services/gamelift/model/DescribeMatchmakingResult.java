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

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmaking" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMatchmakingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Collection of existing matchmaking ticket objects matching the request.
     * </p>
     */
    private java.util.List<MatchmakingTicket> ticketList;

    /**
     * <p>
     * Collection of existing matchmaking ticket objects matching the request.
     * </p>
     * 
     * @return Collection of existing matchmaking ticket objects matching the request.
     */

    public java.util.List<MatchmakingTicket> getTicketList() {
        return ticketList;
    }

    /**
     * <p>
     * Collection of existing matchmaking ticket objects matching the request.
     * </p>
     * 
     * @param ticketList
     *        Collection of existing matchmaking ticket objects matching the request.
     */

    public void setTicketList(java.util.Collection<MatchmakingTicket> ticketList) {
        if (ticketList == null) {
            this.ticketList = null;
            return;
        }

        this.ticketList = new java.util.ArrayList<MatchmakingTicket>(ticketList);
    }

    /**
     * <p>
     * Collection of existing matchmaking ticket objects matching the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTicketList(java.util.Collection)} or {@link #withTicketList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ticketList
     *        Collection of existing matchmaking ticket objects matching the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMatchmakingResult withTicketList(MatchmakingTicket... ticketList) {
        if (this.ticketList == null) {
            setTicketList(new java.util.ArrayList<MatchmakingTicket>(ticketList.length));
        }
        for (MatchmakingTicket ele : ticketList) {
            this.ticketList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of existing matchmaking ticket objects matching the request.
     * </p>
     * 
     * @param ticketList
     *        Collection of existing matchmaking ticket objects matching the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMatchmakingResult withTicketList(java.util.Collection<MatchmakingTicket> ticketList) {
        setTicketList(ticketList);
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
        if (getTicketList() != null)
            sb.append("TicketList: ").append(getTicketList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMatchmakingResult == false)
            return false;
        DescribeMatchmakingResult other = (DescribeMatchmakingResult) obj;
        if (other.getTicketList() == null ^ this.getTicketList() == null)
            return false;
        if (other.getTicketList() != null && other.getTicketList().equals(this.getTicketList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTicketList() == null) ? 0 : getTicketList().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMatchmakingResult clone() {
        try {
            return (DescribeMatchmakingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
