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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Policy that limits the number of game sessions a player can create on the same fleet. This optional policy gives game
 * owners control over how players can consume available game server resources. A resource creation policy makes the
 * following statement:
 * "An individual player can create a maximum number of new game sessions within a specified time period".
 * </p>
 * <p>
 * The policy is evaluated when a player tries to create a new game session. For example, with a policy of 10 new game
 * sessions and a time period of 60 minutes, on receiving a <code>CreateGameSession</code> request, Amazon GameLift
 * checks that the player (identified by <code>CreatorId</code>) has created fewer than 10 game sessions in the past 60
 * minutes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ResourceCreationLimitPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceCreationLimitPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Maximum number of game sessions that an individual can create during the policy period.
     * </p>
     */
    private Integer newGameSessionsPerCreator;
    /**
     * <p>
     * Time span used in evaluating the resource creation limit policy.
     * </p>
     */
    private Integer policyPeriodInMinutes;

    /**
     * <p>
     * Maximum number of game sessions that an individual can create during the policy period.
     * </p>
     * 
     * @param newGameSessionsPerCreator
     *        Maximum number of game sessions that an individual can create during the policy period.
     */

    public void setNewGameSessionsPerCreator(Integer newGameSessionsPerCreator) {
        this.newGameSessionsPerCreator = newGameSessionsPerCreator;
    }

    /**
     * <p>
     * Maximum number of game sessions that an individual can create during the policy period.
     * </p>
     * 
     * @return Maximum number of game sessions that an individual can create during the policy period.
     */

    public Integer getNewGameSessionsPerCreator() {
        return this.newGameSessionsPerCreator;
    }

    /**
     * <p>
     * Maximum number of game sessions that an individual can create during the policy period.
     * </p>
     * 
     * @param newGameSessionsPerCreator
     *        Maximum number of game sessions that an individual can create during the policy period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceCreationLimitPolicy withNewGameSessionsPerCreator(Integer newGameSessionsPerCreator) {
        setNewGameSessionsPerCreator(newGameSessionsPerCreator);
        return this;
    }

    /**
     * <p>
     * Time span used in evaluating the resource creation limit policy.
     * </p>
     * 
     * @param policyPeriodInMinutes
     *        Time span used in evaluating the resource creation limit policy.
     */

    public void setPolicyPeriodInMinutes(Integer policyPeriodInMinutes) {
        this.policyPeriodInMinutes = policyPeriodInMinutes;
    }

    /**
     * <p>
     * Time span used in evaluating the resource creation limit policy.
     * </p>
     * 
     * @return Time span used in evaluating the resource creation limit policy.
     */

    public Integer getPolicyPeriodInMinutes() {
        return this.policyPeriodInMinutes;
    }

    /**
     * <p>
     * Time span used in evaluating the resource creation limit policy.
     * </p>
     * 
     * @param policyPeriodInMinutes
     *        Time span used in evaluating the resource creation limit policy.
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
