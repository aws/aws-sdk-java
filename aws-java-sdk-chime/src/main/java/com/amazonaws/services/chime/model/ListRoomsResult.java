/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListRooms" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRoomsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The room details.
     * </p>
     */
    private java.util.List<Room> rooms;
    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The room details.
     * </p>
     * 
     * @return The room details.
     */

    public java.util.List<Room> getRooms() {
        return rooms;
    }

    /**
     * <p>
     * The room details.
     * </p>
     * 
     * @param rooms
     *        The room details.
     */

    public void setRooms(java.util.Collection<Room> rooms) {
        if (rooms == null) {
            this.rooms = null;
            return;
        }

        this.rooms = new java.util.ArrayList<Room>(rooms);
    }

    /**
     * <p>
     * The room details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRooms(java.util.Collection)} or {@link #withRooms(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rooms
     *        The room details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoomsResult withRooms(Room... rooms) {
        if (this.rooms == null) {
            setRooms(new java.util.ArrayList<Room>(rooms.length));
        }
        for (Room ele : rooms) {
            this.rooms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The room details.
     * </p>
     * 
     * @param rooms
     *        The room details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoomsResult withRooms(java.util.Collection<Room> rooms) {
        setRooms(rooms);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRoomsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getRooms() != null)
            sb.append("Rooms: ").append(getRooms()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
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
        if (other.getRooms() == null ^ this.getRooms() == null)
            return false;
        if (other.getRooms() != null && other.getRooms().equals(this.getRooms()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRooms() == null) ? 0 : getRooms().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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
