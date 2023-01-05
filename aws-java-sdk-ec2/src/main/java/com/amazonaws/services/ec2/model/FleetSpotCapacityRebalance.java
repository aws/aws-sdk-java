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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an elevated risk of being
 * interrupted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FleetSpotCapacityRebalance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetSpotCapacityRebalance implements Serializable, Cloneable {

    /**
     * <p>
     * The replacement strategy to use. Only available for fleets of type <code>maintain</code>.
     * </p>
     * <p>
     * <code>launch</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance notification is emitted
     * for an existing Spot Instance in the fleet. EC2 Fleet does not terminate the instances that receive a rebalance
     * notification. You can terminate the old instances, or you can leave them running. You are charged for all
     * instances while they are running.
     * </p>
     * <p>
     * <code>launch-before-terminate</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance
     * notification is emitted for an existing Spot Instance in the fleet, and then, after a delay that you specify (in
     * <code>TerminationDelay</code>), terminates the instances that received a rebalance notification.
     * </p>
     */
    private String replacementStrategy;
    /**
     * <p>
     * The amount of time (in seconds) that Amazon EC2 waits before terminating the old Spot Instance after launching a
     * new replacement Spot Instance.
     * </p>
     * <p>
     * Required when <code>ReplacementStrategy</code> is set to <code>launch-before-terminate</code>.
     * </p>
     * <p>
     * Not valid when <code>ReplacementStrategy</code> is set to <code>launch</code>.
     * </p>
     * <p>
     * Valid values: Minimum value of <code>120</code> seconds. Maximum value of <code>7200</code> seconds.
     * </p>
     */
    private Integer terminationDelay;

    /**
     * <p>
     * The replacement strategy to use. Only available for fleets of type <code>maintain</code>.
     * </p>
     * <p>
     * <code>launch</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance notification is emitted
     * for an existing Spot Instance in the fleet. EC2 Fleet does not terminate the instances that receive a rebalance
     * notification. You can terminate the old instances, or you can leave them running. You are charged for all
     * instances while they are running.
     * </p>
     * <p>
     * <code>launch-before-terminate</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance
     * notification is emitted for an existing Spot Instance in the fleet, and then, after a delay that you specify (in
     * <code>TerminationDelay</code>), terminates the instances that received a rebalance notification.
     * </p>
     * 
     * @param replacementStrategy
     *        The replacement strategy to use. Only available for fleets of type <code>maintain</code>.</p>
     *        <p>
     *        <code>launch</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance notification is
     *        emitted for an existing Spot Instance in the fleet. EC2 Fleet does not terminate the instances that
     *        receive a rebalance notification. You can terminate the old instances, or you can leave them running. You
     *        are charged for all instances while they are running.
     *        </p>
     *        <p>
     *        <code>launch-before-terminate</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance
     *        notification is emitted for an existing Spot Instance in the fleet, and then, after a delay that you
     *        specify (in <code>TerminationDelay</code>), terminates the instances that received a rebalance
     *        notification.
     * @see FleetReplacementStrategy
     */

    public void setReplacementStrategy(String replacementStrategy) {
        this.replacementStrategy = replacementStrategy;
    }

    /**
     * <p>
     * The replacement strategy to use. Only available for fleets of type <code>maintain</code>.
     * </p>
     * <p>
     * <code>launch</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance notification is emitted
     * for an existing Spot Instance in the fleet. EC2 Fleet does not terminate the instances that receive a rebalance
     * notification. You can terminate the old instances, or you can leave them running. You are charged for all
     * instances while they are running.
     * </p>
     * <p>
     * <code>launch-before-terminate</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance
     * notification is emitted for an existing Spot Instance in the fleet, and then, after a delay that you specify (in
     * <code>TerminationDelay</code>), terminates the instances that received a rebalance notification.
     * </p>
     * 
     * @return The replacement strategy to use. Only available for fleets of type <code>maintain</code>.</p>
     *         <p>
     *         <code>launch</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance notification is
     *         emitted for an existing Spot Instance in the fleet. EC2 Fleet does not terminate the instances that
     *         receive a rebalance notification. You can terminate the old instances, or you can leave them running. You
     *         are charged for all instances while they are running.
     *         </p>
     *         <p>
     *         <code>launch-before-terminate</code> - EC2 Fleet launches a new replacement Spot Instance when a
     *         rebalance notification is emitted for an existing Spot Instance in the fleet, and then, after a delay
     *         that you specify (in <code>TerminationDelay</code>), terminates the instances that received a rebalance
     *         notification.
     * @see FleetReplacementStrategy
     */

    public String getReplacementStrategy() {
        return this.replacementStrategy;
    }

    /**
     * <p>
     * The replacement strategy to use. Only available for fleets of type <code>maintain</code>.
     * </p>
     * <p>
     * <code>launch</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance notification is emitted
     * for an existing Spot Instance in the fleet. EC2 Fleet does not terminate the instances that receive a rebalance
     * notification. You can terminate the old instances, or you can leave them running. You are charged for all
     * instances while they are running.
     * </p>
     * <p>
     * <code>launch-before-terminate</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance
     * notification is emitted for an existing Spot Instance in the fleet, and then, after a delay that you specify (in
     * <code>TerminationDelay</code>), terminates the instances that received a rebalance notification.
     * </p>
     * 
     * @param replacementStrategy
     *        The replacement strategy to use. Only available for fleets of type <code>maintain</code>.</p>
     *        <p>
     *        <code>launch</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance notification is
     *        emitted for an existing Spot Instance in the fleet. EC2 Fleet does not terminate the instances that
     *        receive a rebalance notification. You can terminate the old instances, or you can leave them running. You
     *        are charged for all instances while they are running.
     *        </p>
     *        <p>
     *        <code>launch-before-terminate</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance
     *        notification is emitted for an existing Spot Instance in the fleet, and then, after a delay that you
     *        specify (in <code>TerminationDelay</code>), terminates the instances that received a rebalance
     *        notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetReplacementStrategy
     */

    public FleetSpotCapacityRebalance withReplacementStrategy(String replacementStrategy) {
        setReplacementStrategy(replacementStrategy);
        return this;
    }

    /**
     * <p>
     * The replacement strategy to use. Only available for fleets of type <code>maintain</code>.
     * </p>
     * <p>
     * <code>launch</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance notification is emitted
     * for an existing Spot Instance in the fleet. EC2 Fleet does not terminate the instances that receive a rebalance
     * notification. You can terminate the old instances, or you can leave them running. You are charged for all
     * instances while they are running.
     * </p>
     * <p>
     * <code>launch-before-terminate</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance
     * notification is emitted for an existing Spot Instance in the fleet, and then, after a delay that you specify (in
     * <code>TerminationDelay</code>), terminates the instances that received a rebalance notification.
     * </p>
     * 
     * @param replacementStrategy
     *        The replacement strategy to use. Only available for fleets of type <code>maintain</code>.</p>
     *        <p>
     *        <code>launch</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance notification is
     *        emitted for an existing Spot Instance in the fleet. EC2 Fleet does not terminate the instances that
     *        receive a rebalance notification. You can terminate the old instances, or you can leave them running. You
     *        are charged for all instances while they are running.
     *        </p>
     *        <p>
     *        <code>launch-before-terminate</code> - EC2 Fleet launches a new replacement Spot Instance when a rebalance
     *        notification is emitted for an existing Spot Instance in the fleet, and then, after a delay that you
     *        specify (in <code>TerminationDelay</code>), terminates the instances that received a rebalance
     *        notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetReplacementStrategy
     */

    public FleetSpotCapacityRebalance withReplacementStrategy(FleetReplacementStrategy replacementStrategy) {
        this.replacementStrategy = replacementStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The amount of time (in seconds) that Amazon EC2 waits before terminating the old Spot Instance after launching a
     * new replacement Spot Instance.
     * </p>
     * <p>
     * Required when <code>ReplacementStrategy</code> is set to <code>launch-before-terminate</code>.
     * </p>
     * <p>
     * Not valid when <code>ReplacementStrategy</code> is set to <code>launch</code>.
     * </p>
     * <p>
     * Valid values: Minimum value of <code>120</code> seconds. Maximum value of <code>7200</code> seconds.
     * </p>
     * 
     * @param terminationDelay
     *        The amount of time (in seconds) that Amazon EC2 waits before terminating the old Spot Instance after
     *        launching a new replacement Spot Instance.</p>
     *        <p>
     *        Required when <code>ReplacementStrategy</code> is set to <code>launch-before-terminate</code>.
     *        </p>
     *        <p>
     *        Not valid when <code>ReplacementStrategy</code> is set to <code>launch</code>.
     *        </p>
     *        <p>
     *        Valid values: Minimum value of <code>120</code> seconds. Maximum value of <code>7200</code> seconds.
     */

    public void setTerminationDelay(Integer terminationDelay) {
        this.terminationDelay = terminationDelay;
    }

    /**
     * <p>
     * The amount of time (in seconds) that Amazon EC2 waits before terminating the old Spot Instance after launching a
     * new replacement Spot Instance.
     * </p>
     * <p>
     * Required when <code>ReplacementStrategy</code> is set to <code>launch-before-terminate</code>.
     * </p>
     * <p>
     * Not valid when <code>ReplacementStrategy</code> is set to <code>launch</code>.
     * </p>
     * <p>
     * Valid values: Minimum value of <code>120</code> seconds. Maximum value of <code>7200</code> seconds.
     * </p>
     * 
     * @return The amount of time (in seconds) that Amazon EC2 waits before terminating the old Spot Instance after
     *         launching a new replacement Spot Instance.</p>
     *         <p>
     *         Required when <code>ReplacementStrategy</code> is set to <code>launch-before-terminate</code>.
     *         </p>
     *         <p>
     *         Not valid when <code>ReplacementStrategy</code> is set to <code>launch</code>.
     *         </p>
     *         <p>
     *         Valid values: Minimum value of <code>120</code> seconds. Maximum value of <code>7200</code> seconds.
     */

    public Integer getTerminationDelay() {
        return this.terminationDelay;
    }

    /**
     * <p>
     * The amount of time (in seconds) that Amazon EC2 waits before terminating the old Spot Instance after launching a
     * new replacement Spot Instance.
     * </p>
     * <p>
     * Required when <code>ReplacementStrategy</code> is set to <code>launch-before-terminate</code>.
     * </p>
     * <p>
     * Not valid when <code>ReplacementStrategy</code> is set to <code>launch</code>.
     * </p>
     * <p>
     * Valid values: Minimum value of <code>120</code> seconds. Maximum value of <code>7200</code> seconds.
     * </p>
     * 
     * @param terminationDelay
     *        The amount of time (in seconds) that Amazon EC2 waits before terminating the old Spot Instance after
     *        launching a new replacement Spot Instance.</p>
     *        <p>
     *        Required when <code>ReplacementStrategy</code> is set to <code>launch-before-terminate</code>.
     *        </p>
     *        <p>
     *        Not valid when <code>ReplacementStrategy</code> is set to <code>launch</code>.
     *        </p>
     *        <p>
     *        Valid values: Minimum value of <code>120</code> seconds. Maximum value of <code>7200</code> seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetSpotCapacityRebalance withTerminationDelay(Integer terminationDelay) {
        setTerminationDelay(terminationDelay);
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
        if (getReplacementStrategy() != null)
            sb.append("ReplacementStrategy: ").append(getReplacementStrategy()).append(",");
        if (getTerminationDelay() != null)
            sb.append("TerminationDelay: ").append(getTerminationDelay());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetSpotCapacityRebalance == false)
            return false;
        FleetSpotCapacityRebalance other = (FleetSpotCapacityRebalance) obj;
        if (other.getReplacementStrategy() == null ^ this.getReplacementStrategy() == null)
            return false;
        if (other.getReplacementStrategy() != null && other.getReplacementStrategy().equals(this.getReplacementStrategy()) == false)
            return false;
        if (other.getTerminationDelay() == null ^ this.getTerminationDelay() == null)
            return false;
        if (other.getTerminationDelay() != null && other.getTerminationDelay().equals(this.getTerminationDelay()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplacementStrategy() == null) ? 0 : getReplacementStrategy().hashCode());
        hashCode = prime * hashCode + ((getTerminationDelay() == null) ? 0 : getTerminationDelay().hashCode());
        return hashCode;
    }

    @Override
    public FleetSpotCapacityRebalance clone() {
        try {
            return (FleetSpotCapacityRebalance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
