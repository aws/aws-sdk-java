/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the state of a traffic source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/TrafficSourceState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficSourceState implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the traffic source. Currently, this is the Amazon Resource Name (ARN) for a VPC Lattice
     * target group.
     * </p>
     */
    private String trafficSource;
    /**
     * <p>
     * The following are the possible states for a VPC Lattice target group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The Auto Scaling instances are being registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All Auto Scaling instances are registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - At least one Auto Scaling instance passed the <code>VPC_LATTICE</code> health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The Auto Scaling instances are being deregistered from the target group. If connection
     * draining is enabled, VPC Lattice waits for in-flight requests to complete before deregistering the instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removed</code> - All Auto Scaling instances are deregistered from the target group.
     * </p>
     * </li>
     * </ul>
     */
    private String state;

    /**
     * <p>
     * The unique identifier of the traffic source. Currently, this is the Amazon Resource Name (ARN) for a VPC Lattice
     * target group.
     * </p>
     * 
     * @param trafficSource
     *        The unique identifier of the traffic source. Currently, this is the Amazon Resource Name (ARN) for a VPC
     *        Lattice target group.
     */

    public void setTrafficSource(String trafficSource) {
        this.trafficSource = trafficSource;
    }

    /**
     * <p>
     * The unique identifier of the traffic source. Currently, this is the Amazon Resource Name (ARN) for a VPC Lattice
     * target group.
     * </p>
     * 
     * @return The unique identifier of the traffic source. Currently, this is the Amazon Resource Name (ARN) for a VPC
     *         Lattice target group.
     */

    public String getTrafficSource() {
        return this.trafficSource;
    }

    /**
     * <p>
     * The unique identifier of the traffic source. Currently, this is the Amazon Resource Name (ARN) for a VPC Lattice
     * target group.
     * </p>
     * 
     * @param trafficSource
     *        The unique identifier of the traffic source. Currently, this is the Amazon Resource Name (ARN) for a VPC
     *        Lattice target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficSourceState withTrafficSource(String trafficSource) {
        setTrafficSource(trafficSource);
        return this;
    }

    /**
     * <p>
     * The following are the possible states for a VPC Lattice target group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The Auto Scaling instances are being registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All Auto Scaling instances are registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - At least one Auto Scaling instance passed the <code>VPC_LATTICE</code> health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The Auto Scaling instances are being deregistered from the target group. If connection
     * draining is enabled, VPC Lattice waits for in-flight requests to complete before deregistering the instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removed</code> - All Auto Scaling instances are deregistered from the target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The following are the possible states for a VPC Lattice target group:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Adding</code> - The Auto Scaling instances are being registered with the target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Added</code> - All Auto Scaling instances are registered with the target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InService</code> - At least one Auto Scaling instance passed the <code>VPC_LATTICE</code> health
     *        check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Removing</code> - The Auto Scaling instances are being deregistered from the target group. If
     *        connection draining is enabled, VPC Lattice waits for in-flight requests to complete before deregistering
     *        the instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Removed</code> - All Auto Scaling instances are deregistered from the target group.
     *        </p>
     *        </li>
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The following are the possible states for a VPC Lattice target group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The Auto Scaling instances are being registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All Auto Scaling instances are registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - At least one Auto Scaling instance passed the <code>VPC_LATTICE</code> health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The Auto Scaling instances are being deregistered from the target group. If connection
     * draining is enabled, VPC Lattice waits for in-flight requests to complete before deregistering the instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removed</code> - All Auto Scaling instances are deregistered from the target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The following are the possible states for a VPC Lattice target group:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Adding</code> - The Auto Scaling instances are being registered with the target group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Added</code> - All Auto Scaling instances are registered with the target group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InService</code> - At least one Auto Scaling instance passed the <code>VPC_LATTICE</code> health
     *         check.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Removing</code> - The Auto Scaling instances are being deregistered from the target group. If
     *         connection draining is enabled, VPC Lattice waits for in-flight requests to complete before deregistering
     *         the instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Removed</code> - All Auto Scaling instances are deregistered from the target group.
     *         </p>
     *         </li>
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The following are the possible states for a VPC Lattice target group:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The Auto Scaling instances are being registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All Auto Scaling instances are registered with the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - At least one Auto Scaling instance passed the <code>VPC_LATTICE</code> health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The Auto Scaling instances are being deregistered from the target group. If connection
     * draining is enabled, VPC Lattice waits for in-flight requests to complete before deregistering the instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removed</code> - All Auto Scaling instances are deregistered from the target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        The following are the possible states for a VPC Lattice target group:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Adding</code> - The Auto Scaling instances are being registered with the target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Added</code> - All Auto Scaling instances are registered with the target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InService</code> - At least one Auto Scaling instance passed the <code>VPC_LATTICE</code> health
     *        check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Removing</code> - The Auto Scaling instances are being deregistered from the target group. If
     *        connection draining is enabled, VPC Lattice waits for in-flight requests to complete before deregistering
     *        the instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Removed</code> - All Auto Scaling instances are deregistered from the target group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficSourceState withState(String state) {
        setState(state);
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
        if (getTrafficSource() != null)
            sb.append("TrafficSource: ").append(getTrafficSource()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficSourceState == false)
            return false;
        TrafficSourceState other = (TrafficSourceState) obj;
        if (other.getTrafficSource() == null ^ this.getTrafficSource() == null)
            return false;
        if (other.getTrafficSource() != null && other.getTrafficSource().equals(this.getTrafficSource()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficSource() == null) ? 0 : getTrafficSource().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public TrafficSourceState clone() {
        try {
            return (TrafficSourceState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
