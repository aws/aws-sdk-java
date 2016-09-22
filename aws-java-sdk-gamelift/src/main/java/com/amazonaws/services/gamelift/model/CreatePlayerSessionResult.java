/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 */
public class CreatePlayerSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Object containing the newly created player session record.
     * </p>
     */
    private PlayerSession playerSession;

    /**
     * <p>
     * Object containing the newly created player session record.
     * </p>
     * 
     * @param playerSession
     *        Object containing the newly created player session record.
     */

    public void setPlayerSession(PlayerSession playerSession) {
        this.playerSession = playerSession;
    }

    /**
     * <p>
     * Object containing the newly created player session record.
     * </p>
     * 
     * @return Object containing the newly created player session record.
     */

    public PlayerSession getPlayerSession() {
        return this.playerSession;
    }

    /**
     * <p>
     * Object containing the newly created player session record.
     * </p>
     * 
     * @param playerSession
     *        Object containing the newly created player session record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlayerSessionResult withPlayerSession(PlayerSession playerSession) {
        setPlayerSession(playerSession);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPlayerSession() != null)
            sb.append("PlayerSession: " + getPlayerSession());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePlayerSessionResult == false)
            return false;
        CreatePlayerSessionResult other = (CreatePlayerSessionResult) obj;
        if (other.getPlayerSession() == null ^ this.getPlayerSession() == null)
            return false;
        if (other.getPlayerSession() != null && other.getPlayerSession().equals(this.getPlayerSession()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPlayerSession() == null) ? 0 : getPlayerSession().hashCode());
        return hashCode;
    }

    @Override
    public CreatePlayerSessionResult clone() {
        try {
            return (CreatePlayerSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
