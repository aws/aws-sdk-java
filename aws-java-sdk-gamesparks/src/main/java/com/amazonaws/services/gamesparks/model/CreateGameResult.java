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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/CreateGame" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGameResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the game that was created.
     * </p>
     */
    private GameDetails game;

    /**
     * <p>
     * Details about the game that was created.
     * </p>
     * 
     * @param game
     *        Details about the game that was created.
     */

    public void setGame(GameDetails game) {
        this.game = game;
    }

    /**
     * <p>
     * Details about the game that was created.
     * </p>
     * 
     * @return Details about the game that was created.
     */

    public GameDetails getGame() {
        return this.game;
    }

    /**
     * <p>
     * Details about the game that was created.
     * </p>
     * 
     * @param game
     *        Details about the game that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameResult withGame(GameDetails game) {
        setGame(game);
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
        if (getGame() != null)
            sb.append("Game: ").append(getGame());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGameResult == false)
            return false;
        CreateGameResult other = (CreateGameResult) obj;
        if (other.getGame() == null ^ this.getGame() == null)
            return false;
        if (other.getGame() != null && other.getGame().equals(this.getGame()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGame() == null) ? 0 : getGame().hashCode());
        return hashCode;
    }

    @Override
    public CreateGameResult clone() {
        try {
            return (CreateGameResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
