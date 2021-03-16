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
 * Sets a latency cap for individual players when placing a game session. With a latency policy in force, a game session
 * cannot be placed in a fleet location where a player reports latency higher than the cap. Latency policies are used
 * only with placement request that provide player latency information. Player latency policies can be stacked to
 * gradually relax latency requirements over time.
 * </p>
 * <p>
 * Latency policies are part of a <a>GameSessionQueue</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/PlayerLatencyPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlayerLatencyPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum latency value that is allowed for any player, in milliseconds. All policies must have a value set for
     * this property.
     * </p>
     */
    private Integer maximumIndividualPlayerLatencyMilliseconds;
    /**
     * <p>
     * The length of time, in seconds, that the policy is enforced while placing a new game session. A null value for
     * this property means that the policy is enforced until the queue times out.
     * </p>
     */
    private Integer policyDurationSeconds;

    /**
     * <p>
     * The maximum latency value that is allowed for any player, in milliseconds. All policies must have a value set for
     * this property.
     * </p>
     * 
     * @param maximumIndividualPlayerLatencyMilliseconds
     *        The maximum latency value that is allowed for any player, in milliseconds. All policies must have a value
     *        set for this property.
     */

    public void setMaximumIndividualPlayerLatencyMilliseconds(Integer maximumIndividualPlayerLatencyMilliseconds) {
        this.maximumIndividualPlayerLatencyMilliseconds = maximumIndividualPlayerLatencyMilliseconds;
    }

    /**
     * <p>
     * The maximum latency value that is allowed for any player, in milliseconds. All policies must have a value set for
     * this property.
     * </p>
     * 
     * @return The maximum latency value that is allowed for any player, in milliseconds. All policies must have a value
     *         set for this property.
     */

    public Integer getMaximumIndividualPlayerLatencyMilliseconds() {
        return this.maximumIndividualPlayerLatencyMilliseconds;
    }

    /**
     * <p>
     * The maximum latency value that is allowed for any player, in milliseconds. All policies must have a value set for
     * this property.
     * </p>
     * 
     * @param maximumIndividualPlayerLatencyMilliseconds
     *        The maximum latency value that is allowed for any player, in milliseconds. All policies must have a value
     *        set for this property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayerLatencyPolicy withMaximumIndividualPlayerLatencyMilliseconds(Integer maximumIndividualPlayerLatencyMilliseconds) {
        setMaximumIndividualPlayerLatencyMilliseconds(maximumIndividualPlayerLatencyMilliseconds);
        return this;
    }

    /**
     * <p>
     * The length of time, in seconds, that the policy is enforced while placing a new game session. A null value for
     * this property means that the policy is enforced until the queue times out.
     * </p>
     * 
     * @param policyDurationSeconds
     *        The length of time, in seconds, that the policy is enforced while placing a new game session. A null value
     *        for this property means that the policy is enforced until the queue times out.
     */

    public void setPolicyDurationSeconds(Integer policyDurationSeconds) {
        this.policyDurationSeconds = policyDurationSeconds;
    }

    /**
     * <p>
     * The length of time, in seconds, that the policy is enforced while placing a new game session. A null value for
     * this property means that the policy is enforced until the queue times out.
     * </p>
     * 
     * @return The length of time, in seconds, that the policy is enforced while placing a new game session. A null
     *         value for this property means that the policy is enforced until the queue times out.
     */

    public Integer getPolicyDurationSeconds() {
        return this.policyDurationSeconds;
    }

    /**
     * <p>
     * The length of time, in seconds, that the policy is enforced while placing a new game session. A null value for
     * this property means that the policy is enforced until the queue times out.
     * </p>
     * 
     * @param policyDurationSeconds
     *        The length of time, in seconds, that the policy is enforced while placing a new game session. A null value
     *        for this property means that the policy is enforced until the queue times out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlayerLatencyPolicy withPolicyDurationSeconds(Integer policyDurationSeconds) {
        setPolicyDurationSeconds(policyDurationSeconds);
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
        if (getMaximumIndividualPlayerLatencyMilliseconds() != null)
            sb.append("MaximumIndividualPlayerLatencyMilliseconds: ").append(getMaximumIndividualPlayerLatencyMilliseconds()).append(",");
        if (getPolicyDurationSeconds() != null)
            sb.append("PolicyDurationSeconds: ").append(getPolicyDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlayerLatencyPolicy == false)
            return false;
        PlayerLatencyPolicy other = (PlayerLatencyPolicy) obj;
        if (other.getMaximumIndividualPlayerLatencyMilliseconds() == null ^ this.getMaximumIndividualPlayerLatencyMilliseconds() == null)
            return false;
        if (other.getMaximumIndividualPlayerLatencyMilliseconds() != null
                && other.getMaximumIndividualPlayerLatencyMilliseconds().equals(this.getMaximumIndividualPlayerLatencyMilliseconds()) == false)
            return false;
        if (other.getPolicyDurationSeconds() == null ^ this.getPolicyDurationSeconds() == null)
            return false;
        if (other.getPolicyDurationSeconds() != null && other.getPolicyDurationSeconds().equals(this.getPolicyDurationSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaximumIndividualPlayerLatencyMilliseconds() == null) ? 0 : getMaximumIndividualPlayerLatencyMilliseconds().hashCode());
        hashCode = prime * hashCode + ((getPolicyDurationSeconds() == null) ? 0 : getPolicyDurationSeconds().hashCode());
        return hashCode;
    }

    @Override
    public PlayerLatencyPolicy clone() {
        try {
            return (PlayerLatencyPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.PlayerLatencyPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
