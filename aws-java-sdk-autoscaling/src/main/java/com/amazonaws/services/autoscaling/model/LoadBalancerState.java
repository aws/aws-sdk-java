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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the state of a Classic Load Balancer.
 * </p>
 * <p>
 * If you specify a load balancer when creating the Auto Scaling group, the state of the load balancer is
 * <code>InService</code>.
 * </p>
 * <p>
 * If you attach a load balancer to an existing Auto Scaling group, the initial state is <code>Adding</code>. The state
 * transitions to <code>Added</code> after all instances in the group are registered with the load balancer. If Elastic
 * Load Balancing health checks are enabled for the load balancer, the state transitions to <code>InService</code> after
 * at least one instance in the group passes the health check. If EC2 health checks are enabled instead, the load
 * balancer remains in the <code>Added</code> state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/LoadBalancerState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerState implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * One of the following load balancer states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The instances in the group are being registered with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All instances in the group are registered with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - At least one instance in the group passed an ELB health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The instances in the group are being deregistered from the load balancer. If connection
     * draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removed</code> - All instances in the group are deregistered from the load balancer.
     * </p>
     * </li>
     * </ul>
     */
    private String state;

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @return The name of the load balancer.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerState withLoadBalancerName(String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * One of the following load balancer states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The instances in the group are being registered with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All instances in the group are registered with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - At least one instance in the group passed an ELB health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The instances in the group are being deregistered from the load balancer. If connection
     * draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removed</code> - All instances in the group are deregistered from the load balancer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        One of the following load balancer states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Adding</code> - The instances in the group are being registered with the load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Added</code> - All instances in the group are registered with the load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InService</code> - At least one instance in the group passed an ELB health check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Removing</code> - The instances in the group are being deregistered from the load balancer. If
     *        connection draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before
     *        deregistering the instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Removed</code> - All instances in the group are deregistered from the load balancer.
     *        </p>
     *        </li>
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * One of the following load balancer states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The instances in the group are being registered with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All instances in the group are registered with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - At least one instance in the group passed an ELB health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The instances in the group are being deregistered from the load balancer. If connection
     * draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removed</code> - All instances in the group are deregistered from the load balancer.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One of the following load balancer states:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Adding</code> - The instances in the group are being registered with the load balancer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Added</code> - All instances in the group are registered with the load balancer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InService</code> - At least one instance in the group passed an ELB health check.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Removing</code> - The instances in the group are being deregistered from the load balancer. If
     *         connection draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before
     *         deregistering the instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Removed</code> - All instances in the group are deregistered from the load balancer.
     *         </p>
     *         </li>
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * One of the following load balancer states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Adding</code> - The instances in the group are being registered with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Added</code> - All instances in the group are registered with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InService</code> - At least one instance in the group passed an ELB health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The instances in the group are being deregistered from the load balancer. If connection
     * draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removed</code> - All instances in the group are deregistered from the load balancer.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        One of the following load balancer states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Adding</code> - The instances in the group are being registered with the load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Added</code> - All instances in the group are registered with the load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InService</code> - At least one instance in the group passed an ELB health check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Removing</code> - The instances in the group are being deregistered from the load balancer. If
     *        connection draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before
     *        deregistering the instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Removed</code> - All instances in the group are deregistered from the load balancer.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerState withState(String state) {
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: ").append(getLoadBalancerName()).append(",");
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

        if (obj instanceof LoadBalancerState == false)
            return false;
        LoadBalancerState other = (LoadBalancerState) obj;
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false)
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

        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancerState clone() {
        try {
            return (LoadBalancerState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
