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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmaking" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMatchmakingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a matchmaking ticket. You can include up to 10 ID values.
     * </p>
     */
    private java.util.List<String> ticketIds;

    /**
     * <p>
     * Unique identifier for a matchmaking ticket. You can include up to 10 ID values.
     * </p>
     * 
     * @return Unique identifier for a matchmaking ticket. You can include up to 10 ID values.
     */

    public java.util.List<String> getTicketIds() {
        return ticketIds;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking ticket. You can include up to 10 ID values.
     * </p>
     * 
     * @param ticketIds
     *        Unique identifier for a matchmaking ticket. You can include up to 10 ID values.
     */

    public void setTicketIds(java.util.Collection<String> ticketIds) {
        if (ticketIds == null) {
            this.ticketIds = null;
            return;
        }

        this.ticketIds = new java.util.ArrayList<String>(ticketIds);
    }

    /**
     * <p>
     * Unique identifier for a matchmaking ticket. You can include up to 10 ID values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTicketIds(java.util.Collection)} or {@link #withTicketIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ticketIds
     *        Unique identifier for a matchmaking ticket. You can include up to 10 ID values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMatchmakingRequest withTicketIds(String... ticketIds) {
        if (this.ticketIds == null) {
            setTicketIds(new java.util.ArrayList<String>(ticketIds.length));
        }
        for (String ele : ticketIds) {
            this.ticketIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Unique identifier for a matchmaking ticket. You can include up to 10 ID values.
     * </p>
     * 
     * @param ticketIds
     *        Unique identifier for a matchmaking ticket. You can include up to 10 ID values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMatchmakingRequest withTicketIds(java.util.Collection<String> ticketIds) {
        setTicketIds(ticketIds);
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
        if (getTicketIds() != null)
            sb.append("TicketIds: ").append(getTicketIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMatchmakingRequest == false)
            return false;
        DescribeMatchmakingRequest other = (DescribeMatchmakingRequest) obj;
        if (other.getTicketIds() == null ^ this.getTicketIds() == null)
            return false;
        if (other.getTicketIds() != null && other.getTicketIds().equals(this.getTicketIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTicketIds() == null) ? 0 : getTicketIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMatchmakingRequest clone() {
        return (DescribeMatchmakingRequest) super.clone();
    }

}
