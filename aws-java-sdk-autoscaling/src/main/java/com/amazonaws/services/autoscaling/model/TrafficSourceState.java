/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * This is replaced by <code>Identifier</code>.
     * </p>
     */
    @Deprecated
    private String trafficSource;
    /**
     * <p>
     * Describes the current state of a traffic source.
     * </p>
     * <p>
     * The state values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The Auto Scaling instances are being registered with the load balancer or target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All Auto Scaling instances are registered with the load balancer or target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - For an Elastic Load Balancing load balancer or target group, at least one Auto Scaling
     * instance passed an <code>ELB</code> health check. For VPC Lattice, at least one Auto Scaling instance passed an
     * <code>VPC_LATTICE</code> health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The Auto Scaling instances are being deregistered from the load balancer or target group.
     * If connection draining (deregistration delay) is enabled, Elastic Load Balancing or VPC Lattice waits for
     * in-flight requests to complete before deregistering the instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removed</code> - All Auto Scaling instances are deregistered from the load balancer or target group.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * The unique identifier of the traffic source.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * Provides additional context for the value of <code>Identifier</code>.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb</code> if <code>Identifier</code> is the name of a Classic Load Balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elbv2</code> if <code>Identifier</code> is the ARN of an Application Load Balancer, Gateway Load Balancer,
     * or Network Load Balancer target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-lattice</code> if <code>Identifier</code> is the ARN of a VPC Lattice target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Required if the identifier is the name of a Classic Load Balancer.
     * </p>
     */
    private String type;

    /**
     * <p>
     * This is replaced by <code>Identifier</code>.
     * </p>
     * 
     * @param trafficSource
     *        This is replaced by <code>Identifier</code>.
     */
    @Deprecated
    public void setTrafficSource(String trafficSource) {
        this.trafficSource = trafficSource;
    }

    /**
     * <p>
     * This is replaced by <code>Identifier</code>.
     * </p>
     * 
     * @return This is replaced by <code>Identifier</code>.
     */
    @Deprecated
    public String getTrafficSource() {
        return this.trafficSource;
    }

    /**
     * <p>
     * This is replaced by <code>Identifier</code>.
     * </p>
     * 
     * @param trafficSource
     *        This is replaced by <code>Identifier</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public TrafficSourceState withTrafficSource(String trafficSource) {
        setTrafficSource(trafficSource);
        return this;
    }

    /**
     * <p>
     * Describes the current state of a traffic source.
     * </p>
     * <p>
     * The state values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The Auto Scaling instances are being registered with the load balancer or target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All Auto Scaling instances are registered with the load balancer or target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - For an Elastic Load Balancing load balancer or target group, at least one Auto Scaling
     * instance passed an <code>ELB</code> health check. For VPC Lattice, at least one Auto Scaling instance passed an
     * <code>VPC_LATTICE</code> health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The Auto Scaling instances are being deregistered from the load balancer or target group.
     * If connection draining (deregistration delay) is enabled, Elastic Load Balancing or VPC Lattice waits for
     * in-flight requests to complete before deregistering the instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removed</code> - All Auto Scaling instances are deregistered from the load balancer or target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        Describes the current state of a traffic source.</p>
     *        <p>
     *        The state values are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Adding</code> - The Auto Scaling instances are being registered with the load balancer or target
     *        group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Added</code> - All Auto Scaling instances are registered with the load balancer or target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InService</code> - For an Elastic Load Balancing load balancer or target group, at least one Auto
     *        Scaling instance passed an <code>ELB</code> health check. For VPC Lattice, at least one Auto Scaling
     *        instance passed an <code>VPC_LATTICE</code> health check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Removing</code> - The Auto Scaling instances are being deregistered from the load balancer or target
     *        group. If connection draining (deregistration delay) is enabled, Elastic Load Balancing or VPC Lattice
     *        waits for in-flight requests to complete before deregistering the instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Removed</code> - All Auto Scaling instances are deregistered from the load balancer or target group.
     *        </p>
     *        </li>
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Describes the current state of a traffic source.
     * </p>
     * <p>
     * The state values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The Auto Scaling instances are being registered with the load balancer or target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All Auto Scaling instances are registered with the load balancer or target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - For an Elastic Load Balancing load balancer or target group, at least one Auto Scaling
     * instance passed an <code>ELB</code> health check. For VPC Lattice, at least one Auto Scaling instance passed an
     * <code>VPC_LATTICE</code> health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The Auto Scaling instances are being deregistered from the load balancer or target group.
     * If connection draining (deregistration delay) is enabled, Elastic Load Balancing or VPC Lattice waits for
     * in-flight requests to complete before deregistering the instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removed</code> - All Auto Scaling instances are deregistered from the load balancer or target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the current state of a traffic source.</p>
     *         <p>
     *         The state values are as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Adding</code> - The Auto Scaling instances are being registered with the load balancer or target
     *         group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Added</code> - All Auto Scaling instances are registered with the load balancer or target group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InService</code> - For an Elastic Load Balancing load balancer or target group, at least one Auto
     *         Scaling instance passed an <code>ELB</code> health check. For VPC Lattice, at least one Auto Scaling
     *         instance passed an <code>VPC_LATTICE</code> health check.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Removing</code> - The Auto Scaling instances are being deregistered from the load balancer or
     *         target group. If connection draining (deregistration delay) is enabled, Elastic Load Balancing or VPC
     *         Lattice waits for in-flight requests to complete before deregistering the instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Removed</code> - All Auto Scaling instances are deregistered from the load balancer or target
     *         group.
     *         </p>
     *         </li>
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Describes the current state of a traffic source.
     * </p>
     * <p>
     * The state values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The Auto Scaling instances are being registered with the load balancer or target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All Auto Scaling instances are registered with the load balancer or target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - For an Elastic Load Balancing load balancer or target group, at least one Auto Scaling
     * instance passed an <code>ELB</code> health check. For VPC Lattice, at least one Auto Scaling instance passed an
     * <code>VPC_LATTICE</code> health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The Auto Scaling instances are being deregistered from the load balancer or target group.
     * If connection draining (deregistration delay) is enabled, Elastic Load Balancing or VPC Lattice waits for
     * in-flight requests to complete before deregistering the instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removed</code> - All Auto Scaling instances are deregistered from the load balancer or target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        Describes the current state of a traffic source.</p>
     *        <p>
     *        The state values are as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Adding</code> - The Auto Scaling instances are being registered with the load balancer or target
     *        group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Added</code> - All Auto Scaling instances are registered with the load balancer or target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InService</code> - For an Elastic Load Balancing load balancer or target group, at least one Auto
     *        Scaling instance passed an <code>ELB</code> health check. For VPC Lattice, at least one Auto Scaling
     *        instance passed an <code>VPC_LATTICE</code> health check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Removing</code> - The Auto Scaling instances are being deregistered from the load balancer or target
     *        group. If connection draining (deregistration delay) is enabled, Elastic Load Balancing or VPC Lattice
     *        waits for in-flight requests to complete before deregistering the instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Removed</code> - All Auto Scaling instances are deregistered from the load balancer or target group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficSourceState withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the traffic source.
     * </p>
     * 
     * @param identifier
     *        The unique identifier of the traffic source.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The unique identifier of the traffic source.
     * </p>
     * 
     * @return The unique identifier of the traffic source.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The unique identifier of the traffic source.
     * </p>
     * 
     * @param identifier
     *        The unique identifier of the traffic source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficSourceState withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * Provides additional context for the value of <code>Identifier</code>.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb</code> if <code>Identifier</code> is the name of a Classic Load Balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elbv2</code> if <code>Identifier</code> is the ARN of an Application Load Balancer, Gateway Load Balancer,
     * or Network Load Balancer target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-lattice</code> if <code>Identifier</code> is the ARN of a VPC Lattice target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Required if the identifier is the name of a Classic Load Balancer.
     * </p>
     * 
     * @param type
     *        Provides additional context for the value of <code>Identifier</code>.</p>
     *        <p>
     *        The following lists the valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>elb</code> if <code>Identifier</code> is the name of a Classic Load Balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elbv2</code> if <code>Identifier</code> is the ARN of an Application Load Balancer, Gateway Load
     *        Balancer, or Network Load Balancer target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-lattice</code> if <code>Identifier</code> is the ARN of a VPC Lattice target group.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Required if the identifier is the name of a Classic Load Balancer.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Provides additional context for the value of <code>Identifier</code>.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb</code> if <code>Identifier</code> is the name of a Classic Load Balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elbv2</code> if <code>Identifier</code> is the ARN of an Application Load Balancer, Gateway Load Balancer,
     * or Network Load Balancer target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-lattice</code> if <code>Identifier</code> is the ARN of a VPC Lattice target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Required if the identifier is the name of a Classic Load Balancer.
     * </p>
     * 
     * @return Provides additional context for the value of <code>Identifier</code>.</p>
     *         <p>
     *         The following lists the valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>elb</code> if <code>Identifier</code> is the name of a Classic Load Balancer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>elbv2</code> if <code>Identifier</code> is the ARN of an Application Load Balancer, Gateway Load
     *         Balancer, or Network Load Balancer target group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpc-lattice</code> if <code>Identifier</code> is the ARN of a VPC Lattice target group.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Required if the identifier is the name of a Classic Load Balancer.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Provides additional context for the value of <code>Identifier</code>.
     * </p>
     * <p>
     * The following lists the valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>elb</code> if <code>Identifier</code> is the name of a Classic Load Balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>elbv2</code> if <code>Identifier</code> is the ARN of an Application Load Balancer, Gateway Load Balancer,
     * or Network Load Balancer target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-lattice</code> if <code>Identifier</code> is the ARN of a VPC Lattice target group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Required if the identifier is the name of a Classic Load Balancer.
     * </p>
     * 
     * @param type
     *        Provides additional context for the value of <code>Identifier</code>.</p>
     *        <p>
     *        The following lists the valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>elb</code> if <code>Identifier</code> is the name of a Classic Load Balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>elbv2</code> if <code>Identifier</code> is the ARN of an Application Load Balancer, Gateway Load
     *        Balancer, or Network Load Balancer target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-lattice</code> if <code>Identifier</code> is the ARN of a VPC Lattice target group.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Required if the identifier is the name of a Classic Load Balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficSourceState withType(String type) {
        setType(type);
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
            sb.append("State: ").append(getState()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
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
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficSource() == null) ? 0 : getTrafficSource().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
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
