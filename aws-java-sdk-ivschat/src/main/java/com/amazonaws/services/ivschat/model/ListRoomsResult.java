/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivschat.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivschat-2020-07-14/ListRooms" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRoomsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more rooms than <code>maxResults</code>, use <code>nextToken</code> in the request to get the next
     * set.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of the matching rooms (summary information only).
     * </p>
     */
    private java.util.List<RoomSummary> rooms;

    /**
     * <p>
     * If there are more rooms than <code>maxResults</code>, use <code>nextToken</code> in the request to get the next
     * set.
     * </p>
     * 
     * @param nextToken
     *        If there are more rooms than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     *        next set.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more rooms than <code>maxResults</code>, use <code>nextToken</code> in the request to get the next
     * set.
     * </p>
     * 
     * @return If there are more rooms than <code>maxResults</code>, use <code>nextToken</code> in the request to get
     *         the next set.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more rooms than <code>maxResults</code>, use <code>nextToken</code> in the request to get the next
     * set.
     * </p>
     * 
     * @param nextToken
     *        If there are more rooms than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     *        next set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoomsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of the matching rooms (summary information only).
     * </p>
     * 
     * @return List of the matching rooms (summary information only).
     */

    public java.util.List<RoomSummary> getRooms() {
        return rooms;
    }

    /**
     * <p>
     * List of the matching rooms (summary information only).
     * </p>
     * 
     * @param rooms
     *        List of the matching rooms (summary information only).
     */

    public void setRooms(java.util.Collection<RoomSummary> rooms) {
        if (rooms == null) {
            this.rooms = null;
            return;
        }

        this.rooms = new java.util.ArrayList<RoomSummary>(rooms);
    }

    /**
     * <p>
     * List of the matching rooms (summary information only).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRooms(java.util.Collection)} or {@link #withRooms(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rooms
     *        List of the matching rooms (summary information only).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoomsResult withRooms(RoomSummary... rooms) {
        if (this.rooms == null) {
            setRooms(new java.util.ArrayList<RoomSummary>(rooms.length));
        }
        for (RoomSummary ele : rooms) {
            this.rooms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the matching rooms (summary information only).
     * </p>
     * 
     * @param rooms
     *        List of the matching rooms (summary information only).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoomsResult withRooms(java.util.Collection<RoomSummary> rooms) {
        setRooms(rooms);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRooms() != null)
            sb.append("Rooms: ").append(getRooms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRoomsResult == false)
            return false;
        ListRoomsResult other = (ListRoomsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRooms() == null ^ this.getRooms() == null)
            return false;
        if (other.getRooms() != null && other.getRooms().equals(this.getRooms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRooms() == null) ? 0 : getRooms().hashCode());
        return hashCode;
    }

    @Override
    public ListRoomsResult clone() {
        try {
            return (ListRoomsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
