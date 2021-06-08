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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The Spot Instance replacement strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an
 * elevated risk of being interrupted. For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#ec2-fleet-capacity-rebalance"
 * >Capacity rebalancing</a> in the <i>Amazon EC2 User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FleetSpotCapacityRebalanceRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetSpotCapacityRebalanceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The replacement strategy to use. Only available for fleets of type <code>maintain</code>.
     * </p>
     * <p>
     * To allow EC2 Fleet to launch a replacement Spot Instance when an instance rebalance notification is emitted for
     * an existing Spot Instance in the fleet, specify <code>launch</code>. You must specify a value, otherwise you get
     * an error.
     * </p>
     * <note>
     * <p>
     * When a replacement instance is launched, the instance marked for rebalance is not automatically terminated. You
     * can terminate it, or you can leave it running. You are charged for all instances while they are running.
     * </p>
     * </note>
     */
    private String replacementStrategy;

    /**
     * <p>
     * The replacement strategy to use. Only available for fleets of type <code>maintain</code>.
     * </p>
     * <p>
     * To allow EC2 Fleet to launch a replacement Spot Instance when an instance rebalance notification is emitted for
     * an existing Spot Instance in the fleet, specify <code>launch</code>. You must specify a value, otherwise you get
     * an error.
     * </p>
     * <note>
     * <p>
     * When a replacement instance is launched, the instance marked for rebalance is not automatically terminated. You
     * can terminate it, or you can leave it running. You are charged for all instances while they are running.
     * </p>
     * </note>
     * 
     * @param replacementStrategy
     *        The replacement strategy to use. Only available for fleets of type <code>maintain</code>.</p>
     *        <p>
     *        To allow EC2 Fleet to launch a replacement Spot Instance when an instance rebalance notification is
     *        emitted for an existing Spot Instance in the fleet, specify <code>launch</code>. You must specify a value,
     *        otherwise you get an error.
     *        </p>
     *        <note>
     *        <p>
     *        When a replacement instance is launched, the instance marked for rebalance is not automatically
     *        terminated. You can terminate it, or you can leave it running. You are charged for all instances while
     *        they are running.
     *        </p>
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
     * To allow EC2 Fleet to launch a replacement Spot Instance when an instance rebalance notification is emitted for
     * an existing Spot Instance in the fleet, specify <code>launch</code>. You must specify a value, otherwise you get
     * an error.
     * </p>
     * <note>
     * <p>
     * When a replacement instance is launched, the instance marked for rebalance is not automatically terminated. You
     * can terminate it, or you can leave it running. You are charged for all instances while they are running.
     * </p>
     * </note>
     * 
     * @return The replacement strategy to use. Only available for fleets of type <code>maintain</code>.</p>
     *         <p>
     *         To allow EC2 Fleet to launch a replacement Spot Instance when an instance rebalance notification is
     *         emitted for an existing Spot Instance in the fleet, specify <code>launch</code>. You must specify a
     *         value, otherwise you get an error.
     *         </p>
     *         <note>
     *         <p>
     *         When a replacement instance is launched, the instance marked for rebalance is not automatically
     *         terminated. You can terminate it, or you can leave it running. You are charged for all instances while
     *         they are running.
     *         </p>
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
     * To allow EC2 Fleet to launch a replacement Spot Instance when an instance rebalance notification is emitted for
     * an existing Spot Instance in the fleet, specify <code>launch</code>. You must specify a value, otherwise you get
     * an error.
     * </p>
     * <note>
     * <p>
     * When a replacement instance is launched, the instance marked for rebalance is not automatically terminated. You
     * can terminate it, or you can leave it running. You are charged for all instances while they are running.
     * </p>
     * </note>
     * 
     * @param replacementStrategy
     *        The replacement strategy to use. Only available for fleets of type <code>maintain</code>.</p>
     *        <p>
     *        To allow EC2 Fleet to launch a replacement Spot Instance when an instance rebalance notification is
     *        emitted for an existing Spot Instance in the fleet, specify <code>launch</code>. You must specify a value,
     *        otherwise you get an error.
     *        </p>
     *        <note>
     *        <p>
     *        When a replacement instance is launched, the instance marked for rebalance is not automatically
     *        terminated. You can terminate it, or you can leave it running. You are charged for all instances while
     *        they are running.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetReplacementStrategy
     */

    public FleetSpotCapacityRebalanceRequest withReplacementStrategy(String replacementStrategy) {
        setReplacementStrategy(replacementStrategy);
        return this;
    }

    /**
     * <p>
     * The replacement strategy to use. Only available for fleets of type <code>maintain</code>.
     * </p>
     * <p>
     * To allow EC2 Fleet to launch a replacement Spot Instance when an instance rebalance notification is emitted for
     * an existing Spot Instance in the fleet, specify <code>launch</code>. You must specify a value, otherwise you get
     * an error.
     * </p>
     * <note>
     * <p>
     * When a replacement instance is launched, the instance marked for rebalance is not automatically terminated. You
     * can terminate it, or you can leave it running. You are charged for all instances while they are running.
     * </p>
     * </note>
     * 
     * @param replacementStrategy
     *        The replacement strategy to use. Only available for fleets of type <code>maintain</code>.</p>
     *        <p>
     *        To allow EC2 Fleet to launch a replacement Spot Instance when an instance rebalance notification is
     *        emitted for an existing Spot Instance in the fleet, specify <code>launch</code>. You must specify a value,
     *        otherwise you get an error.
     *        </p>
     *        <note>
     *        <p>
     *        When a replacement instance is launched, the instance marked for rebalance is not automatically
     *        terminated. You can terminate it, or you can leave it running. You are charged for all instances while
     *        they are running.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetReplacementStrategy
     */

    public FleetSpotCapacityRebalanceRequest withReplacementStrategy(FleetReplacementStrategy replacementStrategy) {
        this.replacementStrategy = replacementStrategy.toString();
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
            sb.append("ReplacementStrategy: ").append(getReplacementStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetSpotCapacityRebalanceRequest == false)
            return false;
        FleetSpotCapacityRebalanceRequest other = (FleetSpotCapacityRebalanceRequest) obj;
        if (other.getReplacementStrategy() == null ^ this.getReplacementStrategy() == null)
            return false;
        if (other.getReplacementStrategy() != null && other.getReplacementStrategy().equals(this.getReplacementStrategy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplacementStrategy() == null) ? 0 : getReplacementStrategy().hashCode());
        return hashCode;
    }

    @Override
    public FleetSpotCapacityRebalanceRequest clone() {
        try {
            return (FleetSpotCapacityRebalanceRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
