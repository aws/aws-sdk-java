/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Configuration of a queue used to process game session placement requests. The queue configuration identifies the
 * fleets that new game session can be placed on, given available resources, and the length of time a request can remain
 * in the queue waiting for placement.
 * </p>
 * <p>
 * Queue-related operations include:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateGameSessionQueue</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessionQueues</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateGameSessionQueue</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteGameSessionQueue</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GameSessionQueue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameSessionQueue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Descriptive label that is associated with queue. Queue names must be unique within each region.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds
     * this time, the game session placement changes to a TIMED_OUT status.
     * </p>
     */
    private Integer timeoutInSeconds;
    /**
     * <p>
     * List of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified by
     * either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
     * </p>
     */
    private java.util.List<GameSessionQueueDestination> destinations;

    /**
     * <p>
     * Descriptive label that is associated with queue. Queue names must be unique within each region.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with queue. Queue names must be unique within each region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label that is associated with queue. Queue names must be unique within each region.
     * </p>
     * 
     * @return Descriptive label that is associated with queue. Queue names must be unique within each region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label that is associated with queue. Queue names must be unique within each region.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with queue. Queue names must be unique within each region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionQueue withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds
     * this time, the game session placement changes to a TIMED_OUT status.
     * </p>
     * 
     * @param timeoutInSeconds
     *        Maximum time, in seconds, that a new game session placement request remains in the queue. When a request
     *        exceeds this time, the game session placement changes to a TIMED_OUT status.
     */

    public void setTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * Maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds
     * this time, the game session placement changes to a TIMED_OUT status.
     * </p>
     * 
     * @return Maximum time, in seconds, that a new game session placement request remains in the queue. When a request
     *         exceeds this time, the game session placement changes to a TIMED_OUT status.
     */

    public Integer getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * Maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds
     * this time, the game session placement changes to a TIMED_OUT status.
     * </p>
     * 
     * @param timeoutInSeconds
     *        Maximum time, in seconds, that a new game session placement request remains in the queue. When a request
     *        exceeds this time, the game session placement changes to a TIMED_OUT status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionQueue withTimeoutInSeconds(Integer timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
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

    public GameSessionQueue withDestinations(GameSessionQueueDestination... destinations) {
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

    public GameSessionQueue withDestinations(java.util.Collection<GameSessionQueueDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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

        if (obj instanceof GameSessionQueue == false)
            return false;
        GameSessionQueue other = (GameSessionQueue) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
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
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        return hashCode;
    }

    @Override
    public GameSessionQueue clone() {
        try {
            return (GameSessionQueue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.GameSessionQueueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
