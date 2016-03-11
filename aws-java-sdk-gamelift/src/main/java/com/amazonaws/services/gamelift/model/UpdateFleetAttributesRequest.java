/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class UpdateFleetAttributesRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the fleet you want to update attribute metadata
     * for.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Descriptive label associated with this fleet. Fleet names do not need to
     * be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Human-readable description of the fleet.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Game session protection policy to apply to all new instances created in
     * this fleet. Instances that already exist will not be affected. You can
     * set protection for individual instances using <a>UpdateGameSession</a>.
     * <ul>
     * <li>NoProtection: The game session can be terminated during a scale-down
     * event.</li>
     * <li>FullProtection: If the game session is in an ACTIVE status, it cannot
     * be terminated during a scale-down event.</li>
     * </ul>
     * </p>
     */
    private String newGameSessionProtectionPolicy;

    /**
     * <p>
     * Unique identifier for the fleet you want to update attribute metadata
     * for.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for the fleet you want to update attribute
     *        metadata for.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for the fleet you want to update attribute metadata
     * for.
     * </p>
     * 
     * @return Unique identifier for the fleet you want to update attribute
     *         metadata for.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for the fleet you want to update attribute metadata
     * for.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for the fleet you want to update attribute
     *        metadata for.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateFleetAttributesRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Descriptive label associated with this fleet. Fleet names do not need to
     * be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with this fleet. Fleet names do not
     *        need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label associated with this fleet. Fleet names do not need to
     * be unique.
     * </p>
     * 
     * @return Descriptive label associated with this fleet. Fleet names do not
     *         need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label associated with this fleet. Fleet names do not need to
     * be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with this fleet. Fleet names do not
     *        need to be unique.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateFleetAttributesRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Human-readable description of the fleet.
     * </p>
     * 
     * @param description
     *        Human-readable description of the fleet.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Human-readable description of the fleet.
     * </p>
     * 
     * @return Human-readable description of the fleet.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Human-readable description of the fleet.
     * </p>
     * 
     * @param description
     *        Human-readable description of the fleet.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateFleetAttributesRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Game session protection policy to apply to all new instances created in
     * this fleet. Instances that already exist will not be affected. You can
     * set protection for individual instances using <a>UpdateGameSession</a>.
     * <ul>
     * <li>NoProtection: The game session can be terminated during a scale-down
     * event.</li>
     * <li>FullProtection: If the game session is in an ACTIVE status, it cannot
     * be terminated during a scale-down event.</li>
     * </ul>
     * </p>
     * 
     * @param newGameSessionProtectionPolicy
     *        Game session protection policy to apply to all new instances
     *        created in this fleet. Instances that already exist will not be
     *        affected. You can set protection for individual instances using
     *        <a>UpdateGameSession</a>.
     *        <ul>
     *        <li>NoProtection: The game session can be terminated during a
     *        scale-down event.</li>
     *        <li>FullProtection: If the game session is in an ACTIVE status, it
     *        cannot be terminated during a scale-down event.</li>
     *        </ul>
     * @see ProtectionPolicy
     */

    public void setNewGameSessionProtectionPolicy(
            String newGameSessionProtectionPolicy) {
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
    }

    /**
     * <p>
     * Game session protection policy to apply to all new instances created in
     * this fleet. Instances that already exist will not be affected. You can
     * set protection for individual instances using <a>UpdateGameSession</a>.
     * <ul>
     * <li>NoProtection: The game session can be terminated during a scale-down
     * event.</li>
     * <li>FullProtection: If the game session is in an ACTIVE status, it cannot
     * be terminated during a scale-down event.</li>
     * </ul>
     * </p>
     * 
     * @return Game session protection policy to apply to all new instances
     *         created in this fleet. Instances that already exist will not be
     *         affected. You can set protection for individual instances using
     *         <a>UpdateGameSession</a>.
     *         <ul>
     *         <li>NoProtection: The game session can be terminated during a
     *         scale-down event.</li>
     *         <li>FullProtection: If the game session is in an ACTIVE status,
     *         it cannot be terminated during a scale-down event.</li>
     *         </ul>
     * @see ProtectionPolicy
     */

    public String getNewGameSessionProtectionPolicy() {
        return this.newGameSessionProtectionPolicy;
    }

    /**
     * <p>
     * Game session protection policy to apply to all new instances created in
     * this fleet. Instances that already exist will not be affected. You can
     * set protection for individual instances using <a>UpdateGameSession</a>.
     * <ul>
     * <li>NoProtection: The game session can be terminated during a scale-down
     * event.</li>
     * <li>FullProtection: If the game session is in an ACTIVE status, it cannot
     * be terminated during a scale-down event.</li>
     * </ul>
     * </p>
     * 
     * @param newGameSessionProtectionPolicy
     *        Game session protection policy to apply to all new instances
     *        created in this fleet. Instances that already exist will not be
     *        affected. You can set protection for individual instances using
     *        <a>UpdateGameSession</a>.
     *        <ul>
     *        <li>NoProtection: The game session can be terminated during a
     *        scale-down event.</li>
     *        <li>FullProtection: If the game session is in an ACTIVE status, it
     *        cannot be terminated during a scale-down event.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ProtectionPolicy
     */

    public UpdateFleetAttributesRequest withNewGameSessionProtectionPolicy(
            String newGameSessionProtectionPolicy) {
        setNewGameSessionProtectionPolicy(newGameSessionProtectionPolicy);
        return this;
    }

    /**
     * <p>
     * Game session protection policy to apply to all new instances created in
     * this fleet. Instances that already exist will not be affected. You can
     * set protection for individual instances using <a>UpdateGameSession</a>.
     * <ul>
     * <li>NoProtection: The game session can be terminated during a scale-down
     * event.</li>
     * <li>FullProtection: If the game session is in an ACTIVE status, it cannot
     * be terminated during a scale-down event.</li>
     * </ul>
     * </p>
     * 
     * @param newGameSessionProtectionPolicy
     *        Game session protection policy to apply to all new instances
     *        created in this fleet. Instances that already exist will not be
     *        affected. You can set protection for individual instances using
     *        <a>UpdateGameSession</a>.
     *        <ul>
     *        <li>NoProtection: The game session can be terminated during a
     *        scale-down event.</li>
     *        <li>FullProtection: If the game session is in an ACTIVE status, it
     *        cannot be terminated during a scale-down event.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ProtectionPolicy
     */

    public void setNewGameSessionProtectionPolicy(
            ProtectionPolicy newGameSessionProtectionPolicy) {
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy
                .toString();
    }

    /**
     * <p>
     * Game session protection policy to apply to all new instances created in
     * this fleet. Instances that already exist will not be affected. You can
     * set protection for individual instances using <a>UpdateGameSession</a>.
     * <ul>
     * <li>NoProtection: The game session can be terminated during a scale-down
     * event.</li>
     * <li>FullProtection: If the game session is in an ACTIVE status, it cannot
     * be terminated during a scale-down event.</li>
     * </ul>
     * </p>
     * 
     * @param newGameSessionProtectionPolicy
     *        Game session protection policy to apply to all new instances
     *        created in this fleet. Instances that already exist will not be
     *        affected. You can set protection for individual instances using
     *        <a>UpdateGameSession</a>.
     *        <ul>
     *        <li>NoProtection: The game session can be terminated during a
     *        scale-down event.</li>
     *        <li>FullProtection: If the game session is in an ACTIVE status, it
     *        cannot be terminated during a scale-down event.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ProtectionPolicy
     */

    public UpdateFleetAttributesRequest withNewGameSessionProtectionPolicy(
            ProtectionPolicy newGameSessionProtectionPolicy) {
        setNewGameSessionProtectionPolicy(newGameSessionProtectionPolicy);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFleetId() != null)
            sb.append("FleetId: " + getFleetId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getNewGameSessionProtectionPolicy() != null)
            sb.append("NewGameSessionProtectionPolicy: "
                    + getNewGameSessionProtectionPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFleetAttributesRequest == false)
            return false;
        UpdateFleetAttributesRequest other = (UpdateFleetAttributesRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null
                && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNewGameSessionProtectionPolicy() == null
                ^ this.getNewGameSessionProtectionPolicy() == null)
            return false;
        if (other.getNewGameSessionProtectionPolicy() != null
                && other.getNewGameSessionProtectionPolicy().equals(
                        this.getNewGameSessionProtectionPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getNewGameSessionProtectionPolicy() == null) ? 0
                        : getNewGameSessionProtectionPolicy().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFleetAttributesRequest clone() {
        return (UpdateFleetAttributesRequest) super.clone();
    }
}