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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGameSessionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Object that contains the updated game session metadata.
     * </p>
     */
    private GameSession gameSession;

    /**
     * <p>
     * Object that contains the updated game session metadata.
     * </p>
     * 
     * @param gameSession
     *        Object that contains the updated game session metadata.
     */

    public void setGameSession(GameSession gameSession) {
        this.gameSession = gameSession;
    }

    /**
     * <p>
     * Object that contains the updated game session metadata.
     * </p>
     * 
     * @return Object that contains the updated game session metadata.
     */

    public GameSession getGameSession() {
        return this.gameSession;
    }

    /**
     * <p>
     * Object that contains the updated game session metadata.
     * </p>
     * 
     * @param gameSession
     *        Object that contains the updated game session metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameSessionResult withGameSession(GameSession gameSession) {
        setGameSession(gameSession);
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
        if (getGameSession() != null)
            sb.append("GameSession: ").append(getGameSession());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGameSessionResult == false)
            return false;
        UpdateGameSessionResult other = (UpdateGameSessionResult) obj;
        if (other.getGameSession() == null ^ this.getGameSession() == null)
            return false;
        if (other.getGameSession() != null && other.getGameSession().equals(this.getGameSession()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameSession() == null) ? 0 : getGameSession().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGameSessionResult clone() {
        try {
            return (UpdateGameSessionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
