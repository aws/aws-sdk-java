/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGameSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the game session to update.
     * </p>
     */
    private String gameSessionId;
    /**
     * <p>
     * The maximum number of players that can be connected simultaneously to the game session.
     * </p>
     */
    private Integer maximumPlayerSessionCount;
    /**
     * <p>
     * A descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A policy that determines whether the game session is accepting new players.
     * </p>
     */
    private String playerSessionCreationPolicy;
    /**
     * <p>
     * Game session protection policy to apply to this game session only.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     */
    private String protectionPolicy;
    /**
     * <p>
     * A set of key-value pairs that can store custom data in a game session. For example:
     * <code>{"Key": "difficulty", "Value": "novice"}</code>. You can use this parameter to modify game properties in an
     * active game session. This action adds new properties and modifies existing properties. There is no way to delete
     * properties. For an example, see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#game-properties-update"
     * >Update the value of a game property</a>.
     * </p>
     */
    private java.util.List<GameProperty> gameProperties;

    /**
     * <p>
     * A unique identifier for the game session to update.
     * </p>
     * 
     * @param gameSessionId
     *        A unique identifier for the game session to update.
     */

    public void setGameSessionId(String gameSessionId) {
        this.gameSessionId = gameSessionId;
    }

    /**
     * <p>
     * A unique identifier for the game session to update.
     * </p>
     * 
     * @return A unique identifier for the game session to update.
     */

    public String getGameSessionId() {
        return this.gameSessionId;
    }

    /**
     * <p>
     * A unique identifier for the game session to update.
     * </p>
     * 
     * @param gameSessionId
     *        A unique identifier for the game session to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameSessionRequest withGameSessionId(String gameSessionId) {
        setGameSessionId(gameSessionId);
        return this;
    }

    /**
     * <p>
     * The maximum number of players that can be connected simultaneously to the game session.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        The maximum number of players that can be connected simultaneously to the game session.
     */

    public void setMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        this.maximumPlayerSessionCount = maximumPlayerSessionCount;
    }

    /**
     * <p>
     * The maximum number of players that can be connected simultaneously to the game session.
     * </p>
     * 
     * @return The maximum number of players that can be connected simultaneously to the game session.
     */

    public Integer getMaximumPlayerSessionCount() {
        return this.maximumPlayerSessionCount;
    }

    /**
     * <p>
     * The maximum number of players that can be connected simultaneously to the game session.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        The maximum number of players that can be connected simultaneously to the game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameSessionRequest withMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        setMaximumPlayerSessionCount(maximumPlayerSessionCount);
        return this;
    }

    /**
     * <p>
     * A descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a game session. Session names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     * 
     * @return A descriptive label that is associated with a game session. Session names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a game session. Session names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameSessionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A policy that determines whether the game session is accepting new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        A policy that determines whether the game session is accepting new players.
     * @see PlayerSessionCreationPolicy
     */

    public void setPlayerSessionCreationPolicy(String playerSessionCreationPolicy) {
        this.playerSessionCreationPolicy = playerSessionCreationPolicy;
    }

    /**
     * <p>
     * A policy that determines whether the game session is accepting new players.
     * </p>
     * 
     * @return A policy that determines whether the game session is accepting new players.
     * @see PlayerSessionCreationPolicy
     */

    public String getPlayerSessionCreationPolicy() {
        return this.playerSessionCreationPolicy;
    }

    /**
     * <p>
     * A policy that determines whether the game session is accepting new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        A policy that determines whether the game session is accepting new players.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlayerSessionCreationPolicy
     */

    public UpdateGameSessionRequest withPlayerSessionCreationPolicy(String playerSessionCreationPolicy) {
        setPlayerSessionCreationPolicy(playerSessionCreationPolicy);
        return this;
    }

    /**
     * <p>
     * A policy that determines whether the game session is accepting new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        A policy that determines whether the game session is accepting new players.
     * @see PlayerSessionCreationPolicy
     */

    public void setPlayerSessionCreationPolicy(PlayerSessionCreationPolicy playerSessionCreationPolicy) {
        withPlayerSessionCreationPolicy(playerSessionCreationPolicy);
    }

    /**
     * <p>
     * A policy that determines whether the game session is accepting new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        A policy that determines whether the game session is accepting new players.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlayerSessionCreationPolicy
     */

    public UpdateGameSessionRequest withPlayerSessionCreationPolicy(PlayerSessionCreationPolicy playerSessionCreationPolicy) {
        this.playerSessionCreationPolicy = playerSessionCreationPolicy.toString();
        return this;
    }

    /**
     * <p>
     * Game session protection policy to apply to this game session only.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protectionPolicy
     *        Game session protection policy to apply to this game session only.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @see ProtectionPolicy
     */

    public void setProtectionPolicy(String protectionPolicy) {
        this.protectionPolicy = protectionPolicy;
    }

    /**
     * <p>
     * Game session protection policy to apply to this game session only.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Game session protection policy to apply to this game session only.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *         during a scale-down event.
     *         </p>
     *         </li>
     * @see ProtectionPolicy
     */

    public String getProtectionPolicy() {
        return this.protectionPolicy;
    }

    /**
     * <p>
     * Game session protection policy to apply to this game session only.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protectionPolicy
     *        Game session protection policy to apply to this game session only.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionPolicy
     */

    public UpdateGameSessionRequest withProtectionPolicy(String protectionPolicy) {
        setProtectionPolicy(protectionPolicy);
        return this;
    }

    /**
     * <p>
     * Game session protection policy to apply to this game session only.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protectionPolicy
     *        Game session protection policy to apply to this game session only.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @see ProtectionPolicy
     */

    public void setProtectionPolicy(ProtectionPolicy protectionPolicy) {
        withProtectionPolicy(protectionPolicy);
    }

    /**
     * <p>
     * Game session protection policy to apply to this game session only.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param protectionPolicy
     *        Game session protection policy to apply to this game session only.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionPolicy
     */

    public UpdateGameSessionRequest withProtectionPolicy(ProtectionPolicy protectionPolicy) {
        this.protectionPolicy = protectionPolicy.toString();
        return this;
    }

    /**
     * <p>
     * A set of key-value pairs that can store custom data in a game session. For example:
     * <code>{"Key": "difficulty", "Value": "novice"}</code>. You can use this parameter to modify game properties in an
     * active game session. This action adds new properties and modifies existing properties. There is no way to delete
     * properties. For an example, see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#game-properties-update"
     * >Update the value of a game property</a>.
     * </p>
     * 
     * @return A set of key-value pairs that can store custom data in a game session. For example:
     *         <code>{"Key": "difficulty", "Value": "novice"}</code>. You can use this parameter to modify game
     *         properties in an active game session. This action adds new properties and modifies existing properties.
     *         There is no way to delete properties. For an example, see <a href=
     *         "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#game-properties-update"
     *         >Update the value of a game property</a>.
     */

    public java.util.List<GameProperty> getGameProperties() {
        return gameProperties;
    }

    /**
     * <p>
     * A set of key-value pairs that can store custom data in a game session. For example:
     * <code>{"Key": "difficulty", "Value": "novice"}</code>. You can use this parameter to modify game properties in an
     * active game session. This action adds new properties and modifies existing properties. There is no way to delete
     * properties. For an example, see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#game-properties-update"
     * >Update the value of a game property</a>.
     * </p>
     * 
     * @param gameProperties
     *        A set of key-value pairs that can store custom data in a game session. For example:
     *        <code>{"Key": "difficulty", "Value": "novice"}</code>. You can use this parameter to modify game
     *        properties in an active game session. This action adds new properties and modifies existing properties.
     *        There is no way to delete properties. For an example, see <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#game-properties-update"
     *        >Update the value of a game property</a>.
     */

    public void setGameProperties(java.util.Collection<GameProperty> gameProperties) {
        if (gameProperties == null) {
            this.gameProperties = null;
            return;
        }

        this.gameProperties = new java.util.ArrayList<GameProperty>(gameProperties);
    }

    /**
     * <p>
     * A set of key-value pairs that can store custom data in a game session. For example:
     * <code>{"Key": "difficulty", "Value": "novice"}</code>. You can use this parameter to modify game properties in an
     * active game session. This action adds new properties and modifies existing properties. There is no way to delete
     * properties. For an example, see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#game-properties-update"
     * >Update the value of a game property</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGameProperties(java.util.Collection)} or {@link #withGameProperties(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param gameProperties
     *        A set of key-value pairs that can store custom data in a game session. For example:
     *        <code>{"Key": "difficulty", "Value": "novice"}</code>. You can use this parameter to modify game
     *        properties in an active game session. This action adds new properties and modifies existing properties.
     *        There is no way to delete properties. For an example, see <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#game-properties-update"
     *        >Update the value of a game property</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameSessionRequest withGameProperties(GameProperty... gameProperties) {
        if (this.gameProperties == null) {
            setGameProperties(new java.util.ArrayList<GameProperty>(gameProperties.length));
        }
        for (GameProperty ele : gameProperties) {
            this.gameProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of key-value pairs that can store custom data in a game session. For example:
     * <code>{"Key": "difficulty", "Value": "novice"}</code>. You can use this parameter to modify game properties in an
     * active game session. This action adds new properties and modifies existing properties. There is no way to delete
     * properties. For an example, see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#game-properties-update"
     * >Update the value of a game property</a>.
     * </p>
     * 
     * @param gameProperties
     *        A set of key-value pairs that can store custom data in a game session. For example:
     *        <code>{"Key": "difficulty", "Value": "novice"}</code>. You can use this parameter to modify game
     *        properties in an active game session. This action adds new properties and modifies existing properties.
     *        There is no way to delete properties. For an example, see <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#game-properties-update"
     *        >Update the value of a game property</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameSessionRequest withGameProperties(java.util.Collection<GameProperty> gameProperties) {
        setGameProperties(gameProperties);
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
        if (getGameSessionId() != null)
            sb.append("GameSessionId: ").append(getGameSessionId()).append(",");
        if (getMaximumPlayerSessionCount() != null)
            sb.append("MaximumPlayerSessionCount: ").append(getMaximumPlayerSessionCount()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPlayerSessionCreationPolicy() != null)
            sb.append("PlayerSessionCreationPolicy: ").append(getPlayerSessionCreationPolicy()).append(",");
        if (getProtectionPolicy() != null)
            sb.append("ProtectionPolicy: ").append(getProtectionPolicy()).append(",");
        if (getGameProperties() != null)
            sb.append("GameProperties: ").append(getGameProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGameSessionRequest == false)
            return false;
        UpdateGameSessionRequest other = (UpdateGameSessionRequest) obj;
        if (other.getGameSessionId() == null ^ this.getGameSessionId() == null)
            return false;
        if (other.getGameSessionId() != null && other.getGameSessionId().equals(this.getGameSessionId()) == false)
            return false;
        if (other.getMaximumPlayerSessionCount() == null ^ this.getMaximumPlayerSessionCount() == null)
            return false;
        if (other.getMaximumPlayerSessionCount() != null && other.getMaximumPlayerSessionCount().equals(this.getMaximumPlayerSessionCount()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPlayerSessionCreationPolicy() == null ^ this.getPlayerSessionCreationPolicy() == null)
            return false;
        if (other.getPlayerSessionCreationPolicy() != null && other.getPlayerSessionCreationPolicy().equals(this.getPlayerSessionCreationPolicy()) == false)
            return false;
        if (other.getProtectionPolicy() == null ^ this.getProtectionPolicy() == null)
            return false;
        if (other.getProtectionPolicy() != null && other.getProtectionPolicy().equals(this.getProtectionPolicy()) == false)
            return false;
        if (other.getGameProperties() == null ^ this.getGameProperties() == null)
            return false;
        if (other.getGameProperties() != null && other.getGameProperties().equals(this.getGameProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGameSessionId() == null) ? 0 : getGameSessionId().hashCode());
        hashCode = prime * hashCode + ((getMaximumPlayerSessionCount() == null) ? 0 : getMaximumPlayerSessionCount().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPlayerSessionCreationPolicy() == null) ? 0 : getPlayerSessionCreationPolicy().hashCode());
        hashCode = prime * hashCode + ((getProtectionPolicy() == null) ? 0 : getProtectionPolicy().hashCode());
        hashCode = prime * hashCode + ((getGameProperties() == null) ? 0 : getGameProperties().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGameSessionRequest clone() {
        return (UpdateGameSessionRequest) super.clone();
    }

}
