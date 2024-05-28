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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateRoutingProfileAgentAvailabilityTimer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRoutingProfileAgentAvailabilityTimerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     */
    private String routingProfileId;
    /**
     * <p>
     * Whether agents with this routing profile will have their routing order calculated based on <i>time since their
     * last inbound contact</i> or <i>longest idle time</i>.
     * </p>
     */
    private String agentAvailabilityTimer;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *         ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoutingProfileAgentAvailabilityTimerRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     * 
     * @param routingProfileId
     *        The identifier of the routing profile.
     */

    public void setRoutingProfileId(String routingProfileId) {
        this.routingProfileId = routingProfileId;
    }

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     * 
     * @return The identifier of the routing profile.
     */

    public String getRoutingProfileId() {
        return this.routingProfileId;
    }

    /**
     * <p>
     * The identifier of the routing profile.
     * </p>
     * 
     * @param routingProfileId
     *        The identifier of the routing profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRoutingProfileAgentAvailabilityTimerRequest withRoutingProfileId(String routingProfileId) {
        setRoutingProfileId(routingProfileId);
        return this;
    }

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order calculated based on <i>time since their
     * last inbound contact</i> or <i>longest idle time</i>.
     * </p>
     * 
     * @param agentAvailabilityTimer
     *        Whether agents with this routing profile will have their routing order calculated based on <i>time since
     *        their last inbound contact</i> or <i>longest idle time</i>.
     * @see AgentAvailabilityTimer
     */

    public void setAgentAvailabilityTimer(String agentAvailabilityTimer) {
        this.agentAvailabilityTimer = agentAvailabilityTimer;
    }

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order calculated based on <i>time since their
     * last inbound contact</i> or <i>longest idle time</i>.
     * </p>
     * 
     * @return Whether agents with this routing profile will have their routing order calculated based on <i>time since
     *         their last inbound contact</i> or <i>longest idle time</i>.
     * @see AgentAvailabilityTimer
     */

    public String getAgentAvailabilityTimer() {
        return this.agentAvailabilityTimer;
    }

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order calculated based on <i>time since their
     * last inbound contact</i> or <i>longest idle time</i>.
     * </p>
     * 
     * @param agentAvailabilityTimer
     *        Whether agents with this routing profile will have their routing order calculated based on <i>time since
     *        their last inbound contact</i> or <i>longest idle time</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentAvailabilityTimer
     */

    public UpdateRoutingProfileAgentAvailabilityTimerRequest withAgentAvailabilityTimer(String agentAvailabilityTimer) {
        setAgentAvailabilityTimer(agentAvailabilityTimer);
        return this;
    }

    /**
     * <p>
     * Whether agents with this routing profile will have their routing order calculated based on <i>time since their
     * last inbound contact</i> or <i>longest idle time</i>.
     * </p>
     * 
     * @param agentAvailabilityTimer
     *        Whether agents with this routing profile will have their routing order calculated based on <i>time since
     *        their last inbound contact</i> or <i>longest idle time</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentAvailabilityTimer
     */

    public UpdateRoutingProfileAgentAvailabilityTimerRequest withAgentAvailabilityTimer(AgentAvailabilityTimer agentAvailabilityTimer) {
        this.agentAvailabilityTimer = agentAvailabilityTimer.toString();
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getRoutingProfileId() != null)
            sb.append("RoutingProfileId: ").append(getRoutingProfileId()).append(",");
        if (getAgentAvailabilityTimer() != null)
            sb.append("AgentAvailabilityTimer: ").append(getAgentAvailabilityTimer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRoutingProfileAgentAvailabilityTimerRequest == false)
            return false;
        UpdateRoutingProfileAgentAvailabilityTimerRequest other = (UpdateRoutingProfileAgentAvailabilityTimerRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getRoutingProfileId() == null ^ this.getRoutingProfileId() == null)
            return false;
        if (other.getRoutingProfileId() != null && other.getRoutingProfileId().equals(this.getRoutingProfileId()) == false)
            return false;
        if (other.getAgentAvailabilityTimer() == null ^ this.getAgentAvailabilityTimer() == null)
            return false;
        if (other.getAgentAvailabilityTimer() != null && other.getAgentAvailabilityTimer().equals(this.getAgentAvailabilityTimer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getRoutingProfileId() == null) ? 0 : getRoutingProfileId().hashCode());
        hashCode = prime * hashCode + ((getAgentAvailabilityTimer() == null) ? 0 : getAgentAvailabilityTimer().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRoutingProfileAgentAvailabilityTimerRequest clone() {
        return (UpdateRoutingProfileAgentAvailabilityTimerRequest) super.clone();
    }

}
