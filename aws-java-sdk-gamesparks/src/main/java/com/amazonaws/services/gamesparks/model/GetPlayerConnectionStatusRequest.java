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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetPlayerConnectionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPlayerConnectionStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the game.
     * </p>
     */
    private String gameName;
    /**
     * <p>
     * The unique identifier representing a player.
     * </p>
     */
    private String playerId;
    /**
     * <p>
     * The name of the stage.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * The name of the game.
     * </p>
     * 
     * @param gameName
     *        The name of the game.
     */

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    /**
     * <p>
     * The name of the game.
     * </p>
     * 
     * @return The name of the game.
     */

    public String getGameName() {
        return this.gameName;
    }

    /**
     * <p>
     * The name of the game.
     * </p>
     * 
     * @param gameName
     *        The name of the game.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlayerConnectionStatusRequest withGameName(String gameName) {
        setGameName(gameName);
        return this;
    }

    /**
     * <p>
     * The unique identifier representing a player.
     * </p>
     * 
     * @param playerId
     *        The unique identifier representing a player.
     */

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    /**
     * <p>
     * The unique identifier representing a player.
     * </p>
     * 
     * @return The unique identifier representing a player.
     */

    public String getPlayerId() {
        return this.playerId;
    }

    /**
     * <p>
     * The unique identifier representing a player.
     * </p>
     * 
     * @param playerId
     *        The unique identifier representing a player.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlayerConnectionStatusRequest withPlayerId(String playerId) {
        setPlayerId(playerId);
        return this;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param stageName
     *        The name of the stage.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @return The name of the stage.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the stage.
     * </p>
     * 
     * @param stageName
     *        The name of the stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPlayerConnectionStatusRequest withStageName(String stageName) {
        setStageName(stageName);
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
        if (getGameName() != null)
            sb.append("GameName: ").append(getGameName()).append(",");
        if (getPlayerId() != null)
            sb.append("PlayerId: ").append(getPlayerId()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPlayerConnectionStatusRequest == false)
            return false;
        GetPlayerConnectionStatusRequest other = (GetPlayerConnectionStatusRequest) obj;
        if (other.getGameName() == null ^ this.getGameName() == null)
            return false;
        if (other.getGameName() != null && other.getGameName().equals(this.getGameName()) == false)
            return false;
        if (other.getPlayerId() == null ^ this.getPlayerId() == null)
            return false;
        if (other.getPlayerId() != null && other.getPlayerId().equals(this.getPlayerId()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameName() == null) ? 0 : getGameName().hashCode());
        hashCode = prime * hashCode + ((getPlayerId() == null) ? 0 : getPlayerId().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        return hashCode;
    }

    @Override
    public GetPlayerConnectionStatusRequest clone() {
        return (GetPlayerConnectionStatusRequest) super.clone();
    }

}
