/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A policy that puts limits on the number of game sessions that a player can create within a specified span of time.
 * With this policy, you can control players' ability to consume available resources.
 * </p>
 * <p>
 * The policy is evaluated when a player tries to create a new game session. On receiving a
 * <code>CreateGameSession</code> request, GameLift checks that the player (identified by <code>CreatorId</code>) has
 * created fewer than game session limit in the specified time period.
 * </p>
 * <p>
 * The resource creation limit policy is included in <a>FleetAttributes</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ResourceCreationLimitPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceCreationLimitPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of game sessions that an individual can create during the policy period.
     * </p>
     */
    private Integer newGameSessionsPerCreator;
    /**
     * <p>
     * The time span used in evaluating the resource creation limit policy.
     * </p>
     */
    private Integer policyPeriodInMinutes;

    /**
     * <p>
     * The maximum number of game sessions that an individual can create during the policy period.
     * </p>
     * 
     * @param newGameSessionsPerCreator
     *        The maximum number of game sessions that an individual can create during the policy period.
     */

    public void setNewGameSessionsPerCreator(Integer newGameSessionsPerCreator) {
        this.newGameSessionsPerCreator = newGameSessionsPerCreator;
    }

    /**
     * <p>
     * The maximum number of game sessions that an individual can create during the policy period.
     * </p>
     * 
     * @return The maximum number of game sessions that an individual can create during the policy period.
     */

    public Integer getNewGameSessionsPerCreator() {
        return this.newGameSessionsPerCreator;
    }

    /**
     * <p>
     * The maximum number of game sessions that an individual can create during the policy period.
     * </p>
     * 
     * @param newGameSessionsPerCreator
     *        The maximum number of game sessions that an individual can create during the policy period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCreationLimitPolicy withNewGameSessionsPerCreator(Integer newGameSessionsPerCreator) {
        setNewGameSessionsPerCreator(newGameSessionsPerCreator);
        return this;
    }

    /**
     * <p>
     * The time span used in evaluating the resource creation limit policy.
     * </p>
     * 
     * @param policyPeriodInMinutes
     *        The time span used in evaluating the resource creation limit policy.
     */

    public void setPolicyPeriodInMinutes(Integer policyPeriodInMinutes) {
        this.policyPeriodInMinutes = policyPeriodInMinutes;
    }

    /**
     * <p>
     * The time span used in evaluating the resource creation limit policy.
     * </p>
     * 
     * @return The time span used in evaluating the resource creation limit policy.
     */

    public Integer getPolicyPeriodInMinutes() {
        return this.policyPeriodInMinutes;
    }

    /**
     * <p>
     * The time span used in evaluating the resource creation limit policy.
     * </p>
     * 
     * @param policyPeriodInMinutes
     *        The time span used in evaluating the resource creation limit policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCreationLimitPolicy withPolicyPeriodInMinutes(Integer policyPeriodInMinutes) {
        setPolicyPeriodInMinutes(policyPeriodInMinutes);
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
        if (getNewGameSessionsPerCreator() != null)
            sb.append("NewGameSessionsPerCreator: ").append(getNewGameSessionsPerCreator()).append(",");
        if (getPolicyPeriodInMinutes() != null)
            sb.append("PolicyPeriodInMinutes: ").append(getPolicyPeriodInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceCreationLimitPolicy == false)
            return false;
        ResourceCreationLimitPolicy other = (ResourceCreationLimitPolicy) obj;
        if (other.getNewGameSessionsPerCreator() == null ^ this.getNewGameSessionsPerCreator() == null)
            return false;
        if (other.getNewGameSessionsPerCreator() != null && other.getNewGameSessionsPerCreator().equals(this.getNewGameSessionsPerCreator()) == false)
            return false;
        if (other.getPolicyPeriodInMinutes() == null ^ this.getPolicyPeriodInMinutes() == null)
            return false;
        if (other.getPolicyPeriodInMinutes() != null && other.getPolicyPeriodInMinutes().equals(this.getPolicyPeriodInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNewGameSessionsPerCreator() == null) ? 0 : getNewGameSessionsPerCreator().hashCode());
        hashCode = prime * hashCode + ((getPolicyPeriodInMinutes() == null) ? 0 : getPolicyPeriodInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public ResourceCreationLimitPolicy clone() {
        try {
            return (ResourceCreationLimitPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ResourceCreationLimitPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
