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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/DiscoverPollEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiscoverPollEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The endpoint for the Amazon ECS agent to poll.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The telemetry endpoint for the Amazon ECS agent.
     * </p>
     */
    private String telemetryEndpoint;

    /**
     * <p>
     * The endpoint for the Amazon ECS agent to poll.
     * </p>
     * 
     * @param endpoint
     *        The endpoint for the Amazon ECS agent to poll.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint for the Amazon ECS agent to poll.
     * </p>
     * 
     * @return The endpoint for the Amazon ECS agent to poll.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint for the Amazon ECS agent to poll.
     * </p>
     * 
     * @param endpoint
     *        The endpoint for the Amazon ECS agent to poll.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverPollEndpointResult withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The telemetry endpoint for the Amazon ECS agent.
     * </p>
     * 
     * @param telemetryEndpoint
     *        The telemetry endpoint for the Amazon ECS agent.
     */

    public void setTelemetryEndpoint(String telemetryEndpoint) {
        this.telemetryEndpoint = telemetryEndpoint;
    }

    /**
     * <p>
     * The telemetry endpoint for the Amazon ECS agent.
     * </p>
     * 
     * @return The telemetry endpoint for the Amazon ECS agent.
     */

    public String getTelemetryEndpoint() {
        return this.telemetryEndpoint;
    }

    /**
     * <p>
     * The telemetry endpoint for the Amazon ECS agent.
     * </p>
     * 
     * @param telemetryEndpoint
     *        The telemetry endpoint for the Amazon ECS agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DiscoverPollEndpointResult withTelemetryEndpoint(String telemetryEndpoint) {
        setTelemetryEndpoint(telemetryEndpoint);
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
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getTelemetryEndpoint() != null)
            sb.append("TelemetryEndpoint: ").append(getTelemetryEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DiscoverPollEndpointResult == false)
            return false;
        DiscoverPollEndpointResult other = (DiscoverPollEndpointResult) obj;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getTelemetryEndpoint() == null ^ this.getTelemetryEndpoint() == null)
            return false;
        if (other.getTelemetryEndpoint() != null && other.getTelemetryEndpoint().equals(this.getTelemetryEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getTelemetryEndpoint() == null) ? 0 : getTelemetryEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public DiscoverPollEndpointResult clone() {
        try {
            return (DiscoverPollEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
