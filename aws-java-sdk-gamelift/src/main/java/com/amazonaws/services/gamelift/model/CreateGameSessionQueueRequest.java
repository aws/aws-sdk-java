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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSessionQueue" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGameSessionQueueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds
     * this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     * </p>
     */
    private Integer timeoutInSeconds;
    /**
     * <p>
     * Collection of latency policies to apply when processing game sessions placement requests with player latency
     * information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest
     * latency values. With just one policy, it is enforced at the start of the game session placement for the duration
     * period. With multiple policies, each policy is enforced consecutively for its duration period. For example, a
     * queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the remainder of
     * the placement. A player latency policy must set a value for MaximumIndividualPlayerLatencyMilliseconds; if none
     * is set, this API requests will fail.
     * </p>
     */
    private java.util.List<PlayerLatencyPolicy> playerLatencyPolicies;
    /**
     * <p>
     * List of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified by
     * either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
     * </p>
     */
    private java.util.List<GameSessionQueueDestination> destinations;

    /**
     * <p>
     * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with game session queue. Queue names must be unique within each
     *        region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
     * </p>
     * 
     * @return Descriptive label that is associated with game session queue. Queue names must be unique within each
     *         region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with game session queue. Queue names must be unique within each
     *        region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionQueueRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds
     * this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     * </p>
     * 
     * @param timeoutInSeconds
     *        Maximum time, in seconds, that a new game session placement request remains in the queue. When a request
     *        exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     */

    public void setTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * Maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds
     * this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     * </p>
     * 
     * @return Maximum time, in seconds, that a new game session placement request remains in the queue. When a request
     *         exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     */

    public Integer getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * Maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds
     * this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     * </p>
     * 
     * @param timeoutInSeconds
     *        Maximum time, in seconds, that a new game session placement request remains in the queue. When a request
     *        exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionQueueRequest withTimeoutInSeconds(Integer timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * Collection of latency policies to apply when processing game sessions placement requests with player latency
     * information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest
     * latency values. With just one policy, it is enforced at the start of the game session placement for the duration
     * period. With multiple policies, each policy is enforced consecutively for its duration period. For example, a
     * queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the remainder of
     * the placement. A player latency policy must set a value for MaximumIndividualPlayerLatencyMilliseconds; if none
     * is set, this API requests will fail.
     * </p>
     * 
     * @return Collection of latency policies to apply when processing game sessions placement requests with player
     *         latency information. Multiple policies are evaluated in order of the maximum latency value, starting with
     *         the lowest latency values. With just one policy, it is enforced at the start of the game session
     *         placement for the duration period. With multiple policies, each policy is enforced consecutively for its
     *         duration period. For example, a queue might enforce a 60-second policy followed by a 120-second policy,
     *         and then no policy for the remainder of the placement. A player latency policy must set a value for
     *         MaximumIndividualPlayerLatencyMilliseconds; if none is set, this API requests will fail.
     */

    public java.util.List<PlayerLatencyPolicy> getPlayerLatencyPolicies() {
        return playerLatencyPolicies;
    }

    /**
     * <p>
     * Collection of latency policies to apply when processing game sessions placement requests with player latency
     * information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest
     * latency values. With just one policy, it is enforced at the start of the game session placement for the duration
     * period. With multiple policies, each policy is enforced consecutively for its duration period. For example, a
     * queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the remainder of
     * the placement. A player latency policy must set a value for MaximumIndividualPlayerLatencyMilliseconds; if none
     * is set, this API requests will fail.
     * </p>
     * 
     * @param playerLatencyPolicies
     *        Collection of latency policies to apply when processing game sessions placement requests with player
     *        latency information. Multiple policies are evaluated in order of the maximum latency value, starting with
     *        the lowest latency values. With just one policy, it is enforced at the start of the game session placement
     *        for the duration period. With multiple policies, each policy is enforced consecutively for its duration
     *        period. For example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no
     *        policy for the remainder of the placement. A player latency policy must set a value for
     *        MaximumIndividualPlayerLatencyMilliseconds; if none is set, this API requests will fail.
     */

    public void setPlayerLatencyPolicies(java.util.Collection<PlayerLatencyPolicy> playerLatencyPolicies) {
        if (playerLatencyPolicies == null) {
            this.playerLatencyPolicies = null;
            return;
        }

        this.playerLatencyPolicies = new java.util.ArrayList<PlayerLatencyPolicy>(playerLatencyPolicies);
    }

    /**
     * <p>
     * Collection of latency policies to apply when processing game sessions placement requests with player latency
     * information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest
     * latency values. With just one policy, it is enforced at the start of the game session placement for the duration
     * period. With multiple policies, each policy is enforced consecutively for its duration period. For example, a
     * queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the remainder of
     * the placement. A player latency policy must set a value for MaximumIndividualPlayerLatencyMilliseconds; if none
     * is set, this API requests will fail.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlayerLatencyPolicies(java.util.Collection)} or
     * {@link #withPlayerLatencyPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param playerLatencyPolicies
     *        Collection of latency policies to apply when processing game sessions placement requests with player
     *        latency information. Multiple policies are evaluated in order of the maximum latency value, starting with
     *        the lowest latency values. With just one policy, it is enforced at the start of the game session placement
     *        for the duration period. With multiple policies, each policy is enforced consecutively for its duration
     *        period. For example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no
     *        policy for the remainder of the placement. A player latency policy must set a value for
     *        MaximumIndividualPlayerLatencyMilliseconds; if none is set, this API requests will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionQueueRequest withPlayerLatencyPolicies(PlayerLatencyPolicy... playerLatencyPolicies) {
        if (this.playerLatencyPolicies == null) {
            setPlayerLatencyPolicies(new java.util.ArrayList<PlayerLatencyPolicy>(playerLatencyPolicies.length));
        }
        for (PlayerLatencyPolicy ele : playerLatencyPolicies) {
            this.playerLatencyPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of latency policies to apply when processing game sessions placement requests with player latency
     * information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest
     * latency values. With just one policy, it is enforced at the start of the game session placement for the duration
     * period. With multiple policies, each policy is enforced consecutively for its duration period. For example, a
     * queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the remainder of
     * the placement. A player latency policy must set a value for MaximumIndividualPlayerLatencyMilliseconds; if none
     * is set, this API requests will fail.
     * </p>
     * 
     * @param playerLatencyPolicies
     *        Collection of latency policies to apply when processing game sessions placement requests with player
     *        latency information. Multiple policies are evaluated in order of the maximum latency value, starting with
     *        the lowest latency values. With just one policy, it is enforced at the start of the game session placement
     *        for the duration period. With multiple policies, each policy is enforced consecutively for its duration
     *        period. For example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no
     *        policy for the remainder of the placement. A player latency policy must set a value for
     *        MaximumIndividualPlayerLatencyMilliseconds; if none is set, this API requests will fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionQueueRequest withPlayerLatencyPolicies(java.util.Collection<PlayerLatencyPolicy> playerLatencyPolicies) {
        setPlayerLatencyPolicies(playerLatencyPolicies);
        return this;
    }

    /**
     * <p>
     * List of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified by
     * either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
     * </p>
     * 
     * @return List of fleets that can be used to fulfill game session placement requests in the queue. Fleets are
     *         identified by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference
     *         order.
     */

    public java.util.List<GameSessionQueueDestination> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * List of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified by
     * either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
     * </p>
     * 
     * @param destinations
     *        List of fleets that can be used to fulfill game session placement requests in the queue. Fleets are
     *        identified by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference
     *        order.
     */

    public void setDestinations(java.util.Collection<GameSessionQueueDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<GameSessionQueueDestination>(destinations);
    }

    /**
     * <p>
     * List of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified by
     * either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        List of fleets that can be used to fulfill game session placement requests in the queue. Fleets are
     *        identified by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference
     *        order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionQueueRequest withDestinations(GameSessionQueueDestination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<GameSessionQueueDestination>(destinations.length));
        }
        for (GameSessionQueueDestination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified by
     * either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
     * </p>
     * 
     * @param destinations
     *        List of fleets that can be used to fulfill game session placement requests in the queue. Fleets are
     *        identified by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference
     *        order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionQueueRequest withDestinations(java.util.Collection<GameSessionQueueDestination> destinations) {
        setDestinations(destinations);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: ").append(getTimeoutInSeconds()).append(",");
        if (getPlayerLatencyPolicies() != null)
            sb.append("PlayerLatencyPolicies: ").append(getPlayerLatencyPolicies()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGameSessionQueueRequest == false)
            return false;
        CreateGameSessionQueueRequest other = (CreateGameSessionQueueRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        if (other.getPlayerLatencyPolicies() == null ^ this.getPlayerLatencyPolicies() == null)
            return false;
        if (other.getPlayerLatencyPolicies() != null && other.getPlayerLatencyPolicies().equals(this.getPlayerLatencyPolicies()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getPlayerLatencyPolicies() == null) ? 0 : getPlayerLatencyPolicies().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        return hashCode;
    }

    @Override
    public CreateGameSessionQueueRequest clone() {
        return (CreateGameSessionQueueRequest) super.clone();
    }

}
