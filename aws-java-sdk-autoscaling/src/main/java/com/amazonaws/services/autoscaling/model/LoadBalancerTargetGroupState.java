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
 * Describes the state of a target group.
 * </p>
 * <p>
 * If you attach a target group to an existing Auto Scaling group, the initial state is <code>Adding</code>. The state
 * transitions to <code>Added</code> after all Auto Scaling instances are registered with the target group. If Elastic
 * Load Balancing health checks are enabled, the state transitions to <code>InService</code> after at least one Auto
 * Scaling instance passes the health check. If EC2 health checks are enabled instead, the target group remains in the
 * <code>Added</code> state.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/LoadBalancerTargetGroupState"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerTargetGroupState implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     */
    private String loadBalancerTargetGroupARN;
    /**
     * <p>
     * The state of the target group.
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
     * <code>InService</code> - At least one Auto Scaling instance passed an ELB health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The Auto Scaling instances are being deregistered from the target group. If connection
     * draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the
     * instances.
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
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param loadBalancerTargetGroupARN
     *        The Amazon Resource Name (ARN) of the target group.
     */

    public void setLoadBalancerTargetGroupARN(String loadBalancerTargetGroupARN) {
        this.loadBalancerTargetGroupARN = loadBalancerTargetGroupARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the target group.
     */

    public String getLoadBalancerTargetGroupARN() {
        return this.loadBalancerTargetGroupARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the target group.
     * </p>
     * 
     * @param loadBalancerTargetGroupARN
     *        The Amazon Resource Name (ARN) of the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTargetGroupState withLoadBalancerTargetGroupARN(String loadBalancerTargetGroupARN) {
        setLoadBalancerTargetGroupARN(loadBalancerTargetGroupARN);
        return this;
    }

    /**
     * <p>
     * The state of the target group.
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
     * <code>InService</code> - At least one Auto Scaling instance passed an ELB health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The Auto Scaling instances are being deregistered from the target group. If connection
     * draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the
     * instances.
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
     *        The state of the target group.</p>
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
     *        <code>InService</code> - At least one Auto Scaling instance passed an ELB health check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Removing</code> - The Auto Scaling instances are being deregistered from the target group. If
     *        connection draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before
     *        deregistering the instances.
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
     * The state of the target group.
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
     * <code>InService</code> - At least one Auto Scaling instance passed an ELB health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The Auto Scaling instances are being deregistered from the target group. If connection
     * draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the
     * instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removed</code> - All Auto Scaling instances are deregistered from the target group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the target group.</p>
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
     *         <code>InService</code> - At least one Auto Scaling instance passed an ELB health check.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Removing</code> - The Auto Scaling instances are being deregistered from the target group. If
     *         connection draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before
     *         deregistering the instances.
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
     * The state of the target group.
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
     * <code>InService</code> - At least one Auto Scaling instance passed an ELB health check.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Removing</code> - The Auto Scaling instances are being deregistered from the target group. If connection
     * draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before deregistering the
     * instances.
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
     *        The state of the target group.</p>
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
     *        <code>InService</code> - At least one Auto Scaling instance passed an ELB health check.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Removing</code> - The Auto Scaling instances are being deregistered from the target group. If
     *        connection draining is enabled, Elastic Load Balancing waits for in-flight requests to complete before
     *        deregistering the instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Removed</code> - All Auto Scaling instances are deregistered from the target group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerTargetGroupState withState(String state) {
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
        if (getLoadBalancerTargetGroupARN() != null)
            sb.append("LoadBalancerTargetGroupARN: ").append(getLoadBalancerTargetGroupARN()).append(",");
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

        if (obj instanceof LoadBalancerTargetGroupState == false)
            return false;
        LoadBalancerTargetGroupState other = (LoadBalancerTargetGroupState) obj;
        if (other.getLoadBalancerTargetGroupARN() == null ^ this.getLoadBalancerTargetGroupARN() == null)
            return false;
        if (other.getLoadBalancerTargetGroupARN() != null && other.getLoadBalancerTargetGroupARN().equals(this.getLoadBalancerTargetGroupARN()) == false)
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

        hashCode = prime * hashCode + ((getLoadBalancerTargetGroupARN() == null) ? 0 : getLoadBalancerTargetGroupARN().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancerTargetGroupState clone() {
        try {
            return (LoadBalancerTargetGroupState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
