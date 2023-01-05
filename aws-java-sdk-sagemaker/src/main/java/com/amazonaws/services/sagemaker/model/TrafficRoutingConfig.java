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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the traffic routing strategy during an endpoint deployment to shift traffic from the old fleet to the new
 * fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrafficRoutingConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficRoutingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Traffic routing strategy type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_AT_ONCE</code>: Endpoint traffic shifts to the new fleet in a single step.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANARY</code>: Endpoint traffic shifts to the new fleet in two steps. The first step is the canary, which
     * is a small portion of the traffic. The second step is the remainder of the traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LINEAR</code>: Endpoint traffic shifts to the new fleet in n steps of a configurable size.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The waiting time (in seconds) between incremental steps to turn on traffic on the new endpoint fleet.
     * </p>
     */
    private Integer waitIntervalInSeconds;
    /**
     * <p>
     * Batch size for the first step to turn on traffic on the new endpoint fleet. <code>Value</code> must be less than
     * or equal to 50% of the variant's total instance count.
     * </p>
     */
    private CapacitySize canarySize;
    /**
     * <p>
     * Batch size for each step to turn on traffic on the new endpoint fleet. <code>Value</code> must be 10-50% of the
     * variant's total instance count.
     * </p>
     */
    private CapacitySize linearStepSize;

    /**
     * <p>
     * Traffic routing strategy type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_AT_ONCE</code>: Endpoint traffic shifts to the new fleet in a single step.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANARY</code>: Endpoint traffic shifts to the new fleet in two steps. The first step is the canary, which
     * is a small portion of the traffic. The second step is the remainder of the traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LINEAR</code>: Endpoint traffic shifts to the new fleet in n steps of a configurable size.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Traffic routing strategy type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_AT_ONCE</code>: Endpoint traffic shifts to the new fleet in a single step.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANARY</code>: Endpoint traffic shifts to the new fleet in two steps. The first step is the canary,
     *        which is a small portion of the traffic. The second step is the remainder of the traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LINEAR</code>: Endpoint traffic shifts to the new fleet in n steps of a configurable size.
     *        </p>
     *        </li>
     * @see TrafficRoutingConfigType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Traffic routing strategy type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_AT_ONCE</code>: Endpoint traffic shifts to the new fleet in a single step.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANARY</code>: Endpoint traffic shifts to the new fleet in two steps. The first step is the canary, which
     * is a small portion of the traffic. The second step is the remainder of the traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LINEAR</code>: Endpoint traffic shifts to the new fleet in n steps of a configurable size.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Traffic routing strategy type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL_AT_ONCE</code>: Endpoint traffic shifts to the new fleet in a single step.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANARY</code>: Endpoint traffic shifts to the new fleet in two steps. The first step is the canary,
     *         which is a small portion of the traffic. The second step is the remainder of the traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LINEAR</code>: Endpoint traffic shifts to the new fleet in n steps of a configurable size.
     *         </p>
     *         </li>
     * @see TrafficRoutingConfigType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Traffic routing strategy type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_AT_ONCE</code>: Endpoint traffic shifts to the new fleet in a single step.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANARY</code>: Endpoint traffic shifts to the new fleet in two steps. The first step is the canary, which
     * is a small portion of the traffic. The second step is the remainder of the traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LINEAR</code>: Endpoint traffic shifts to the new fleet in n steps of a configurable size.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Traffic routing strategy type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_AT_ONCE</code>: Endpoint traffic shifts to the new fleet in a single step.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANARY</code>: Endpoint traffic shifts to the new fleet in two steps. The first step is the canary,
     *        which is a small portion of the traffic. The second step is the remainder of the traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LINEAR</code>: Endpoint traffic shifts to the new fleet in n steps of a configurable size.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficRoutingConfigType
     */

    public TrafficRoutingConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Traffic routing strategy type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_AT_ONCE</code>: Endpoint traffic shifts to the new fleet in a single step.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANARY</code>: Endpoint traffic shifts to the new fleet in two steps. The first step is the canary, which
     * is a small portion of the traffic. The second step is the remainder of the traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LINEAR</code>: Endpoint traffic shifts to the new fleet in n steps of a configurable size.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        Traffic routing strategy type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_AT_ONCE</code>: Endpoint traffic shifts to the new fleet in a single step.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANARY</code>: Endpoint traffic shifts to the new fleet in two steps. The first step is the canary,
     *        which is a small portion of the traffic. The second step is the remainder of the traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LINEAR</code>: Endpoint traffic shifts to the new fleet in n steps of a configurable size.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficRoutingConfigType
     */

    public TrafficRoutingConfig withType(TrafficRoutingConfigType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The waiting time (in seconds) between incremental steps to turn on traffic on the new endpoint fleet.
     * </p>
     * 
     * @param waitIntervalInSeconds
     *        The waiting time (in seconds) between incremental steps to turn on traffic on the new endpoint fleet.
     */

    public void setWaitIntervalInSeconds(Integer waitIntervalInSeconds) {
        this.waitIntervalInSeconds = waitIntervalInSeconds;
    }

    /**
     * <p>
     * The waiting time (in seconds) between incremental steps to turn on traffic on the new endpoint fleet.
     * </p>
     * 
     * @return The waiting time (in seconds) between incremental steps to turn on traffic on the new endpoint fleet.
     */

    public Integer getWaitIntervalInSeconds() {
        return this.waitIntervalInSeconds;
    }

    /**
     * <p>
     * The waiting time (in seconds) between incremental steps to turn on traffic on the new endpoint fleet.
     * </p>
     * 
     * @param waitIntervalInSeconds
     *        The waiting time (in seconds) between incremental steps to turn on traffic on the new endpoint fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficRoutingConfig withWaitIntervalInSeconds(Integer waitIntervalInSeconds) {
        setWaitIntervalInSeconds(waitIntervalInSeconds);
        return this;
    }

    /**
     * <p>
     * Batch size for the first step to turn on traffic on the new endpoint fleet. <code>Value</code> must be less than
     * or equal to 50% of the variant's total instance count.
     * </p>
     * 
     * @param canarySize
     *        Batch size for the first step to turn on traffic on the new endpoint fleet. <code>Value</code> must be
     *        less than or equal to 50% of the variant's total instance count.
     */

    public void setCanarySize(CapacitySize canarySize) {
        this.canarySize = canarySize;
    }

    /**
     * <p>
     * Batch size for the first step to turn on traffic on the new endpoint fleet. <code>Value</code> must be less than
     * or equal to 50% of the variant's total instance count.
     * </p>
     * 
     * @return Batch size for the first step to turn on traffic on the new endpoint fleet. <code>Value</code> must be
     *         less than or equal to 50% of the variant's total instance count.
     */

    public CapacitySize getCanarySize() {
        return this.canarySize;
    }

    /**
     * <p>
     * Batch size for the first step to turn on traffic on the new endpoint fleet. <code>Value</code> must be less than
     * or equal to 50% of the variant's total instance count.
     * </p>
     * 
     * @param canarySize
     *        Batch size for the first step to turn on traffic on the new endpoint fleet. <code>Value</code> must be
     *        less than or equal to 50% of the variant's total instance count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficRoutingConfig withCanarySize(CapacitySize canarySize) {
        setCanarySize(canarySize);
        return this;
    }

    /**
     * <p>
     * Batch size for each step to turn on traffic on the new endpoint fleet. <code>Value</code> must be 10-50% of the
     * variant's total instance count.
     * </p>
     * 
     * @param linearStepSize
     *        Batch size for each step to turn on traffic on the new endpoint fleet. <code>Value</code> must be 10-50%
     *        of the variant's total instance count.
     */

    public void setLinearStepSize(CapacitySize linearStepSize) {
        this.linearStepSize = linearStepSize;
    }

    /**
     * <p>
     * Batch size for each step to turn on traffic on the new endpoint fleet. <code>Value</code> must be 10-50% of the
     * variant's total instance count.
     * </p>
     * 
     * @return Batch size for each step to turn on traffic on the new endpoint fleet. <code>Value</code> must be 10-50%
     *         of the variant's total instance count.
     */

    public CapacitySize getLinearStepSize() {
        return this.linearStepSize;
    }

    /**
     * <p>
     * Batch size for each step to turn on traffic on the new endpoint fleet. <code>Value</code> must be 10-50% of the
     * variant's total instance count.
     * </p>
     * 
     * @param linearStepSize
     *        Batch size for each step to turn on traffic on the new endpoint fleet. <code>Value</code> must be 10-50%
     *        of the variant's total instance count.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficRoutingConfig withLinearStepSize(CapacitySize linearStepSize) {
        setLinearStepSize(linearStepSize);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getWaitIntervalInSeconds() != null)
            sb.append("WaitIntervalInSeconds: ").append(getWaitIntervalInSeconds()).append(",");
        if (getCanarySize() != null)
            sb.append("CanarySize: ").append(getCanarySize()).append(",");
        if (getLinearStepSize() != null)
            sb.append("LinearStepSize: ").append(getLinearStepSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficRoutingConfig == false)
            return false;
        TrafficRoutingConfig other = (TrafficRoutingConfig) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getWaitIntervalInSeconds() == null ^ this.getWaitIntervalInSeconds() == null)
            return false;
        if (other.getWaitIntervalInSeconds() != null && other.getWaitIntervalInSeconds().equals(this.getWaitIntervalInSeconds()) == false)
            return false;
        if (other.getCanarySize() == null ^ this.getCanarySize() == null)
            return false;
        if (other.getCanarySize() != null && other.getCanarySize().equals(this.getCanarySize()) == false)
            return false;
        if (other.getLinearStepSize() == null ^ this.getLinearStepSize() == null)
            return false;
        if (other.getLinearStepSize() != null && other.getLinearStepSize().equals(this.getLinearStepSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getWaitIntervalInSeconds() == null) ? 0 : getWaitIntervalInSeconds().hashCode());
        hashCode = prime * hashCode + ((getCanarySize() == null) ? 0 : getCanarySize().hashCode());
        hashCode = prime * hashCode + ((getLinearStepSize() == null) ? 0 : getLinearStepSize().hashCode());
        return hashCode;
    }

    @Override
    public TrafficRoutingConfig clone() {
        try {
            return (TrafficRoutingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrafficRoutingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
