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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFleetAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet to update attribute metadata for. You can use either the fleet ID or ARN value.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A human-readable description of a fleet.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The game session protection policy to apply to all new instances created in this fleet. Instances that already
     * exist are not affected. You can set protection for individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     */
    private String newGameSessionProtectionPolicy;
    /**
     * <p>
     * Policy settings that limit the number of game sessions an individual player can create over a span of time.
     * </p>
     */
    private ResourceCreationLimitPolicy resourceCreationLimitPolicy;
    /**
     * <p>
     * The name of a metric group to add this fleet to. Use a metric group in Amazon CloudWatch to aggregate the metrics
     * from multiple fleets. Provide an existing metric group name, or create a new metric group by providing a new
     * name. A fleet can only be in one metric group at a time.
     * </p>
     */
    private java.util.List<String> metricGroups;

    /**
     * <p>
     * A unique identifier for the fleet to update attribute metadata for. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to update attribute metadata for. You can use either the fleet ID or ARN
     *        value.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to update attribute metadata for. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @return A unique identifier for the fleet to update attribute metadata for. You can use either the fleet ID or
     *         ARN value.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet to update attribute metadata for. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet to update attribute metadata for. You can use either the fleet ID or ARN
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetAttributesRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     * 
     * @return A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetAttributesRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A human-readable description of a fleet.
     * </p>
     * 
     * @param description
     *        A human-readable description of a fleet.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A human-readable description of a fleet.
     * </p>
     * 
     * @return A human-readable description of a fleet.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A human-readable description of a fleet.
     * </p>
     * 
     * @param description
     *        A human-readable description of a fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetAttributesRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The game session protection policy to apply to all new instances created in this fleet. Instances that already
     * exist are not affected. You can set protection for individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        The game session protection policy to apply to all new instances created in this fleet. Instances that
     *        already exist are not affected. You can set protection for individual instances using
     *        <a>UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @see ProtectionPolicy
     */

    public void setNewGameSessionProtectionPolicy(String newGameSessionProtectionPolicy) {
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
    }

    /**
     * <p>
     * The game session protection policy to apply to all new instances created in this fleet. Instances that already
     * exist are not affected. You can set protection for individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The game session protection policy to apply to all new instances created in this fleet. Instances that
     *         already exist are not affected. You can set protection for individual instances using
     *         <a>UpdateGameSession</a>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *         during a scale-down event.
     *         </p>
     *         </li>
     * @see ProtectionPolicy
     */

    public String getNewGameSessionProtectionPolicy() {
        return this.newGameSessionProtectionPolicy;
    }

    /**
     * <p>
     * The game session protection policy to apply to all new instances created in this fleet. Instances that already
     * exist are not affected. You can set protection for individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        The game session protection policy to apply to all new instances created in this fleet. Instances that
     *        already exist are not affected. You can set protection for individual instances using
     *        <a>UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionPolicy
     */

    public UpdateFleetAttributesRequest withNewGameSessionProtectionPolicy(String newGameSessionProtectionPolicy) {
        setNewGameSessionProtectionPolicy(newGameSessionProtectionPolicy);
        return this;
    }

    /**
     * <p>
     * The game session protection policy to apply to all new instances created in this fleet. Instances that already
     * exist are not affected. You can set protection for individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        The game session protection policy to apply to all new instances created in this fleet. Instances that
     *        already exist are not affected. You can set protection for individual instances using
     *        <a>UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @see ProtectionPolicy
     */

    public void setNewGameSessionProtectionPolicy(ProtectionPolicy newGameSessionProtectionPolicy) {
        withNewGameSessionProtectionPolicy(newGameSessionProtectionPolicy);
    }

    /**
     * <p>
     * The game session protection policy to apply to all new instances created in this fleet. Instances that already
     * exist are not affected. You can set protection for individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        The game session protection policy to apply to all new instances created in this fleet. Instances that
     *        already exist are not affected. You can set protection for individual instances using
     *        <a>UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionPolicy
     */

    public UpdateFleetAttributesRequest withNewGameSessionProtectionPolicy(ProtectionPolicy newGameSessionProtectionPolicy) {
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy.toString();
        return this;
    }

    /**
     * <p>
     * Policy settings that limit the number of game sessions an individual player can create over a span of time.
     * </p>
     * 
     * @param resourceCreationLimitPolicy
     *        Policy settings that limit the number of game sessions an individual player can create over a span of
     *        time.
     */

    public void setResourceCreationLimitPolicy(ResourceCreationLimitPolicy resourceCreationLimitPolicy) {
        this.resourceCreationLimitPolicy = resourceCreationLimitPolicy;
    }

    /**
     * <p>
     * Policy settings that limit the number of game sessions an individual player can create over a span of time.
     * </p>
     * 
     * @return Policy settings that limit the number of game sessions an individual player can create over a span of
     *         time.
     */

    public ResourceCreationLimitPolicy getResourceCreationLimitPolicy() {
        return this.resourceCreationLimitPolicy;
    }

    /**
     * <p>
     * Policy settings that limit the number of game sessions an individual player can create over a span of time.
     * </p>
     * 
     * @param resourceCreationLimitPolicy
     *        Policy settings that limit the number of game sessions an individual player can create over a span of
     *        time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetAttributesRequest withResourceCreationLimitPolicy(ResourceCreationLimitPolicy resourceCreationLimitPolicy) {
        setResourceCreationLimitPolicy(resourceCreationLimitPolicy);
        return this;
    }

    /**
     * <p>
     * The name of a metric group to add this fleet to. Use a metric group in Amazon CloudWatch to aggregate the metrics
     * from multiple fleets. Provide an existing metric group name, or create a new metric group by providing a new
     * name. A fleet can only be in one metric group at a time.
     * </p>
     * 
     * @return The name of a metric group to add this fleet to. Use a metric group in Amazon CloudWatch to aggregate the
     *         metrics from multiple fleets. Provide an existing metric group name, or create a new metric group by
     *         providing a new name. A fleet can only be in one metric group at a time.
     */

    public java.util.List<String> getMetricGroups() {
        return metricGroups;
    }

    /**
     * <p>
     * The name of a metric group to add this fleet to. Use a metric group in Amazon CloudWatch to aggregate the metrics
     * from multiple fleets. Provide an existing metric group name, or create a new metric group by providing a new
     * name. A fleet can only be in one metric group at a time.
     * </p>
     * 
     * @param metricGroups
     *        The name of a metric group to add this fleet to. Use a metric group in Amazon CloudWatch to aggregate the
     *        metrics from multiple fleets. Provide an existing metric group name, or create a new metric group by
     *        providing a new name. A fleet can only be in one metric group at a time.
     */

    public void setMetricGroups(java.util.Collection<String> metricGroups) {
        if (metricGroups == null) {
            this.metricGroups = null;
            return;
        }

        this.metricGroups = new java.util.ArrayList<String>(metricGroups);
    }

    /**
     * <p>
     * The name of a metric group to add this fleet to. Use a metric group in Amazon CloudWatch to aggregate the metrics
     * from multiple fleets. Provide an existing metric group name, or create a new metric group by providing a new
     * name. A fleet can only be in one metric group at a time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricGroups(java.util.Collection)} or {@link #withMetricGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricGroups
     *        The name of a metric group to add this fleet to. Use a metric group in Amazon CloudWatch to aggregate the
     *        metrics from multiple fleets. Provide an existing metric group name, or create a new metric group by
     *        providing a new name. A fleet can only be in one metric group at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetAttributesRequest withMetricGroups(String... metricGroups) {
        if (this.metricGroups == null) {
            setMetricGroups(new java.util.ArrayList<String>(metricGroups.length));
        }
        for (String ele : metricGroups) {
            this.metricGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of a metric group to add this fleet to. Use a metric group in Amazon CloudWatch to aggregate the metrics
     * from multiple fleets. Provide an existing metric group name, or create a new metric group by providing a new
     * name. A fleet can only be in one metric group at a time.
     * </p>
     * 
     * @param metricGroups
     *        The name of a metric group to add this fleet to. Use a metric group in Amazon CloudWatch to aggregate the
     *        metrics from multiple fleets. Provide an existing metric group name, or create a new metric group by
     *        providing a new name. A fleet can only be in one metric group at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFleetAttributesRequest withMetricGroups(java.util.Collection<String> metricGroups) {
        setMetricGroups(metricGroups);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNewGameSessionProtectionPolicy() != null)
            sb.append("NewGameSessionProtectionPolicy: ").append(getNewGameSessionProtectionPolicy()).append(",");
        if (getResourceCreationLimitPolicy() != null)
            sb.append("ResourceCreationLimitPolicy: ").append(getResourceCreationLimitPolicy()).append(",");
        if (getMetricGroups() != null)
            sb.append("MetricGroups: ").append(getMetricGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFleetAttributesRequest == false)
            return false;
        UpdateFleetAttributesRequest other = (UpdateFleetAttributesRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNewGameSessionProtectionPolicy() == null ^ this.getNewGameSessionProtectionPolicy() == null)
            return false;
        if (other.getNewGameSessionProtectionPolicy() != null
                && other.getNewGameSessionProtectionPolicy().equals(this.getNewGameSessionProtectionPolicy()) == false)
            return false;
        if (other.getResourceCreationLimitPolicy() == null ^ this.getResourceCreationLimitPolicy() == null)
            return false;
        if (other.getResourceCreationLimitPolicy() != null && other.getResourceCreationLimitPolicy().equals(this.getResourceCreationLimitPolicy()) == false)
            return false;
        if (other.getMetricGroups() == null ^ this.getMetricGroups() == null)
            return false;
        if (other.getMetricGroups() != null && other.getMetricGroups().equals(this.getMetricGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNewGameSessionProtectionPolicy() == null) ? 0 : getNewGameSessionProtectionPolicy().hashCode());
        hashCode = prime * hashCode + ((getResourceCreationLimitPolicy() == null) ? 0 : getResourceCreationLimitPolicy().hashCode());
        hashCode = prime * hashCode + ((getMetricGroups() == null) ? 0 : getMetricGroups().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFleetAttributesRequest clone() {
        return (UpdateFleetAttributesRequest) super.clone();
    }

}
