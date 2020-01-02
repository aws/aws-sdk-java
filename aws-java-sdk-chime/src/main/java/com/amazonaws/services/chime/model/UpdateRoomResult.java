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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/UpdateRoom" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRoomResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The room details.
     * </p>
     */
    private Room room;

    /**
     * <p>
     * The room details.
     * </p>
     * 
     * @param room
     *        The room details.
     */

    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * <p>
     * The room details.
     * </p>
     * 
     * @return The room details.
     */

    public Room getRoom() {
        return this.room;
    }

    /**
     * <p>
     * The room details.
     * </p>
     * 
     * @param room
     *        The room details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoomResult withRoom(Room room) {
        setRoom(room);
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
        if (getRoom() != null)
            sb.append("Room: ").append(getRoom());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRoomResult == false)
            return false;
        UpdateRoomResult other = (UpdateRoomResult) obj;
        if (other.getRoom() == null ^ this.getRoom() == null)
            return false;
        if (other.getRoom() != null && other.getRoom().equals(this.getRoom()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoom() == null) ? 0 : getRoom().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRoomResult clone() {
        try {
            return (UpdateRoomResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
