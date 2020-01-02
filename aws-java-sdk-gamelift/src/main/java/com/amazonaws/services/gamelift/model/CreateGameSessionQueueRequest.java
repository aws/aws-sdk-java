/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * A descriptive label that is associated with game session queue. Queue names must be unique within each Region.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The maximum time, in seconds, that a new game session placement request remains in the queue. When a request
     * exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     * </p>
     */
    private Integer timeoutInSeconds;
    /**
     * <p>
     * A collection of latency policies to apply when processing game sessions placement requests with player latency
     * information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest
     * latency values. With just one policy, the policy is enforced at the start of the game session placement for the
     * duration period. With multiple policies, each policy is enforced consecutively for its duration period. For
     * example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the
     * remainder of the placement. A player latency policy must set a value for
     * <code>MaximumIndividualPlayerLatencyMilliseconds</code>. If none is set, this API request fails.
     * </p>
     */
    private java.util.List<PlayerLatencyPolicy> playerLatencyPolicies;
    /**
     * <p>
     * A list of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified
     * by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
     * </p>
     */
    private java.util.List<GameSessionQueueDestination> destinations;
    /**
     * <p>
     * A list of labels to assign to the new game session queue resource. Tags are developer-defined key-value pairs.
     * Tagging AWS resources are useful for resource management, access management and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     * Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>,
     * <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be
     * lower than stated. See the AWS General Reference for actual tagging limits.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A descriptive label that is associated with game session queue. Queue names must be unique within each Region.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with game session queue. Queue names must be unique within each
     *        Region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive label that is associated with game session queue. Queue names must be unique within each Region.
     * </p>
     * 
     * @return A descriptive label that is associated with game session queue. Queue names must be unique within each
     *         Region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive label that is associated with game session queue. Queue names must be unique within each Region.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with game session queue. Queue names must be unique within each
     *        Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionQueueRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The maximum time, in seconds, that a new game session placement request remains in the queue. When a request
     * exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The maximum time, in seconds, that a new game session placement request remains in the queue. When a
     *        request exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     */

    public void setTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * The maximum time, in seconds, that a new game session placement request remains in the queue. When a request
     * exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     * </p>
     * 
     * @return The maximum time, in seconds, that a new game session placement request remains in the queue. When a
     *         request exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     */

    public Integer getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * The maximum time, in seconds, that a new game session placement request remains in the queue. When a request
     * exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The maximum time, in seconds, that a new game session placement request remains in the queue. When a
     *        request exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionQueueRequest withTimeoutInSeconds(Integer timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * A collection of latency policies to apply when processing game sessions placement requests with player latency
     * information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest
     * latency values. With just one policy, the policy is enforced at the start of the game session placement for the
     * duration period. With multiple policies, each policy is enforced consecutively for its duration period. For
     * example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the
     * remainder of the placement. A player latency policy must set a value for
     * <code>MaximumIndividualPlayerLatencyMilliseconds</code>. If none is set, this API request fails.
     * </p>
     * 
     * @return A collection of latency policies to apply when processing game sessions placement requests with player
     *         latency information. Multiple policies are evaluated in order of the maximum latency value, starting with
     *         the lowest latency values. With just one policy, the policy is enforced at the start of the game session
     *         placement for the duration period. With multiple policies, each policy is enforced consecutively for its
     *         duration period. For example, a queue might enforce a 60-second policy followed by a 120-second policy,
     *         and then no policy for the remainder of the placement. A player latency policy must set a value for
     *         <code>MaximumIndividualPlayerLatencyMilliseconds</code>. If none is set, this API request fails.
     */

    public java.util.List<PlayerLatencyPolicy> getPlayerLatencyPolicies() {
        return playerLatencyPolicies;
    }

    /**
     * <p>
     * A collection of latency policies to apply when processing game sessions placement requests with player latency
     * information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest
     * latency values. With just one policy, the policy is enforced at the start of the game session placement for the
     * duration period. With multiple policies, each policy is enforced consecutively for its duration period. For
     * example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the
     * remainder of the placement. A player latency policy must set a value for
     * <code>MaximumIndividualPlayerLatencyMilliseconds</code>. If none is set, this API request fails.
     * </p>
     * 
     * @param playerLatencyPolicies
     *        A collection of latency policies to apply when processing game sessions placement requests with player
     *        latency information. Multiple policies are evaluated in order of the maximum latency value, starting with
     *        the lowest latency values. With just one policy, the policy is enforced at the start of the game session
     *        placement for the duration period. With multiple policies, each policy is enforced consecutively for its
     *        duration period. For example, a queue might enforce a 60-second policy followed by a 120-second policy,
     *        and then no policy for the remainder of the placement. A player latency policy must set a value for
     *        <code>MaximumIndividualPlayerLatencyMilliseconds</code>. If none is set, this API request fails.
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
     * A collection of latency policies to apply when processing game sessions placement requests with player latency
     * information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest
     * latency values. With just one policy, the policy is enforced at the start of the game session placement for the
     * duration period. With multiple policies, each policy is enforced consecutively for its duration period. For
     * example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the
     * remainder of the placement. A player latency policy must set a value for
     * <code>MaximumIndividualPlayerLatencyMilliseconds</code>. If none is set, this API request fails.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlayerLatencyPolicies(java.util.Collection)} or
     * {@link #withPlayerLatencyPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param playerLatencyPolicies
     *        A collection of latency policies to apply when processing game sessions placement requests with player
     *        latency information. Multiple policies are evaluated in order of the maximum latency value, starting with
     *        the lowest latency values. With just one policy, the policy is enforced at the start of the game session
     *        placement for the duration period. With multiple policies, each policy is enforced consecutively for its
     *        duration period. For example, a queue might enforce a 60-second policy followed by a 120-second policy,
     *        and then no policy for the remainder of the placement. A player latency policy must set a value for
     *        <code>MaximumIndividualPlayerLatencyMilliseconds</code>. If none is set, this API request fails.
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
     * A collection of latency policies to apply when processing game sessions placement requests with player latency
     * information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest
     * latency values. With just one policy, the policy is enforced at the start of the game session placement for the
     * duration period. With multiple policies, each policy is enforced consecutively for its duration period. For
     * example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the
     * remainder of the placement. A player latency policy must set a value for
     * <code>MaximumIndividualPlayerLatencyMilliseconds</code>. If none is set, this API request fails.
     * </p>
     * 
     * @param playerLatencyPolicies
     *        A collection of latency policies to apply when processing game sessions placement requests with player
     *        latency information. Multiple policies are evaluated in order of the maximum latency value, starting with
     *        the lowest latency values. With just one policy, the policy is enforced at the start of the game session
     *        placement for the duration period. With multiple policies, each policy is enforced consecutively for its
     *        duration period. For example, a queue might enforce a 60-second policy followed by a 120-second policy,
     *        and then no policy for the remainder of the placement. A player latency policy must set a value for
     *        <code>MaximumIndividualPlayerLatencyMilliseconds</code>. If none is set, this API request fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionQueueRequest withPlayerLatencyPolicies(java.util.Collection<PlayerLatencyPolicy> playerLatencyPolicies) {
        setPlayerLatencyPolicies(playerLatencyPolicies);
        return this;
    }

    /**
     * <p>
     * A list of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified
     * by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
     * </p>
     * 
     * @return A list of fleets that can be used to fulfill game session placement requests in the queue. Fleets are
     *         identified by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference
     *         order.
     */

    public java.util.List<GameSessionQueueDestination> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * A list of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified
     * by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
     * </p>
     * 
     * @param destinations
     *        A list of fleets that can be used to fulfill game session placement requests in the queue. Fleets are
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
     * A list of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified
     * by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        A list of fleets that can be used to fulfill game session placement requests in the queue. Fleets are
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
     * A list of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified
     * by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
     * </p>
     * 
     * @param destinations
     *        A list of fleets that can be used to fulfill game session placement requests in the queue. Fleets are
     *        identified by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference
     *        order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionQueueRequest withDestinations(java.util.Collection<GameSessionQueueDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new game session queue resource. Tags are developer-defined key-value pairs.
     * Tagging AWS resources are useful for resource management, access management and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     * Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>,
     * <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be
     * lower than stated. See the AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @return A list of labels to assign to the new game session queue resource. Tags are developer-defined key-value
     *         pairs. Tagging AWS resources are useful for resource management, access management and cost allocation.
     *         For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *         Tagging AWS Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *         <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *         The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of labels to assign to the new game session queue resource. Tags are developer-defined key-value pairs.
     * Tagging AWS resources are useful for resource management, access management and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     * Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>,
     * <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be
     * lower than stated. See the AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new game session queue resource. Tags are developer-defined key-value
     *        pairs. Tagging AWS resources are useful for resource management, access management and cost allocation.
     *        For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *        Tagging AWS Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of labels to assign to the new game session queue resource. Tags are developer-defined key-value pairs.
     * Tagging AWS resources are useful for resource management, access management and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     * Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>,
     * <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be
     * lower than stated. See the AWS General Reference for actual tagging limits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new game session queue resource. Tags are developer-defined key-value
     *        pairs. Tagging AWS resources are useful for resource management, access management and cost allocation.
     *        For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *        Tagging AWS Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionQueueRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new game session queue resource. Tags are developer-defined key-value pairs.
     * Tagging AWS resources are useful for resource management, access management and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging AWS
     * Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use <a>TagResource</a>,
     * <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags. The maximum tag limit may be
     * lower than stated. See the AWS General Reference for actual tagging limits.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new game session queue resource. Tags are developer-defined key-value
     *        pairs. Tagging AWS resources are useful for resource management, access management and cost allocation.
     *        For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *        Tagging AWS Resources</a> in the <i>AWS General Reference</i>. Once the resource is created, you can use
     *        <a>TagResource</a>, <a>UntagResource</a>, and <a>ListTagsForResource</a> to add, remove, and view tags.
     *        The maximum tag limit may be lower than stated. See the AWS General Reference for actual tagging limits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGameSessionQueueRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateGameSessionQueueRequest clone() {
        return (CreateGameSessionQueueRequest) super.clone();
    }

}
