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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGameSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the game session to update.
     * </p>
     */
    private String gameSessionId;
    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the game session.
     * </p>
     */
    private Integer maximumPlayerSessionCount;
    /**
     * <p>
     * Descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Policy determining whether or not the game session accepts new players.
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
     * Unique identifier for the game session to update.
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for the game session to update.
     */

    public void setGameSessionId(String gameSessionId) {
        this.gameSessionId = gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for the game session to update.
     * </p>
     * 
     * @return Unique identifier for the game session to update.
     */

    public String getGameSessionId() {
        return this.gameSessionId;
    }

    /**
     * <p>
     * Unique identifier for the game session to update.
     * </p>
     * 
     * @param gameSessionId
     *        Unique identifier for the game session to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameSessionRequest withGameSessionId(String gameSessionId) {
        setGameSessionId(gameSessionId);
        return this;
    }

    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the game session.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        Maximum number of players that can be connected simultaneously to the game session.
     */

    public void setMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        this.maximumPlayerSessionCount = maximumPlayerSessionCount;
    }

    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the game session.
     * </p>
     * 
     * @return Maximum number of players that can be connected simultaneously to the game session.
     */

    public Integer getMaximumPlayerSessionCount() {
        return this.maximumPlayerSessionCount;
    }

    /**
     * <p>
     * Maximum number of players that can be connected simultaneously to the game session.
     * </p>
     * 
     * @param maximumPlayerSessionCount
     *        Maximum number of players that can be connected simultaneously to the game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameSessionRequest withMaximumPlayerSessionCount(Integer maximumPlayerSessionCount) {
        setMaximumPlayerSessionCount(maximumPlayerSessionCount);
        return this;
    }

    /**
     * <p>
     * Descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a game session. Session names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     * 
     * @return Descriptive label that is associated with a game session. Session names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a game session. Session names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a game session. Session names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGameSessionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Policy determining whether or not the game session accepts new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        Policy determining whether or not the game session accepts new players.
     * @see PlayerSessionCreationPolicy
     */

    public void setPlayerSessionCreationPolicy(String playerSessionCreationPolicy) {
        this.playerSessionCreationPolicy = playerSessionCreationPolicy;
    }

    /**
     * <p>
     * Policy determining whether or not the game session accepts new players.
     * </p>
     * 
     * @return Policy determining whether or not the game session accepts new players.
     * @see PlayerSessionCreationPolicy
     */

    public String getPlayerSessionCreationPolicy() {
        return this.playerSessionCreationPolicy;
    }

    /**
     * <p>
     * Policy determining whether or not the game session accepts new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        Policy determining whether or not the game session accepts new players.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlayerSessionCreationPolicy
     */

    public UpdateGameSessionRequest withPlayerSessionCreationPolicy(String playerSessionCreationPolicy) {
        setPlayerSessionCreationPolicy(playerSessionCreationPolicy);
        return this;
    }

    /**
     * <p>
     * Policy determining whether or not the game session accepts new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        Policy determining whether or not the game session accepts new players.
     * @see PlayerSessionCreationPolicy
     */

    public void setPlayerSessionCreationPolicy(PlayerSessionCreationPolicy playerSessionCreationPolicy) {
        withPlayerSessionCreationPolicy(playerSessionCreationPolicy);
    }

    /**
     * <p>
     * Policy determining whether or not the game session accepts new players.
     * </p>
     * 
     * @param playerSessionCreationPolicy
     *        Policy determining whether or not the game session accepts new players.
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
            sb.append("ProtectionPolicy: ").append(getProtectionPolicy());
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
        return hashCode;
    }

    @Override
    public UpdateGameSessionRequest clone() {
        return (UpdateGameSessionRequest) super.clone();
    }

}
