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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the status of an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Any scheduled events associated with the instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceStatusEvent> events;
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The intended state of the instance. <a>DescribeInstanceStatus</a> requires that an instance be in the
     * <code>running</code> state.
     * </p>
     */
    private InstanceState instanceState;
    /**
     * <p>
     * Reports impaired functionality that stems from issues internal to the instance, such as impaired reachability.
     * </p>
     */
    private InstanceStatusSummary instanceStatus;
    /**
     * <p>
     * Reports impaired functionality that stems from issues related to the systems that support an instance, such as
     * hardware failures and network connectivity problems.
     * </p>
     */
    private InstanceStatusSummary systemStatus;

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the instance.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     * 
     * @return The Availability Zone of the instance.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone of the instance.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStatus withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Any scheduled events associated with the instance.
     * </p>
     * 
     * @return Any scheduled events associated with the instance.
     */

    public java.util.List<InstanceStatusEvent> getEvents() {
        if (events == null) {
            events = new com.amazonaws.internal.SdkInternalList<InstanceStatusEvent>();
        }
        return events;
    }

    /**
     * <p>
     * Any scheduled events associated with the instance.
     * </p>
     * 
     * @param events
     *        Any scheduled events associated with the instance.
     */

    public void setEvents(java.util.Collection<InstanceStatusEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new com.amazonaws.internal.SdkInternalList<InstanceStatusEvent>(events);
    }

    /**
     * <p>
     * Any scheduled events associated with the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        Any scheduled events associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStatus withEvents(InstanceStatusEvent... events) {
        if (this.events == null) {
            setEvents(new com.amazonaws.internal.SdkInternalList<InstanceStatusEvent>(events.length));
        }
        for (InstanceStatusEvent ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any scheduled events associated with the instance.
     * </p>
     * 
     * @param events
     *        Any scheduled events associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStatus withEvents(java.util.Collection<InstanceStatusEvent> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStatus withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The intended state of the instance. <a>DescribeInstanceStatus</a> requires that an instance be in the
     * <code>running</code> state.
     * </p>
     * 
     * @param instanceState
     *        The intended state of the instance. <a>DescribeInstanceStatus</a> requires that an instance be in the
     *        <code>running</code> state.
     */

    public void setInstanceState(InstanceState instanceState) {
        this.instanceState = instanceState;
    }

    /**
     * <p>
     * The intended state of the instance. <a>DescribeInstanceStatus</a> requires that an instance be in the
     * <code>running</code> state.
     * </p>
     * 
     * @return The intended state of the instance. <a>DescribeInstanceStatus</a> requires that an instance be in the
     *         <code>running</code> state.
     */

    public InstanceState getInstanceState() {
        return this.instanceState;
    }

    /**
     * <p>
     * The intended state of the instance. <a>DescribeInstanceStatus</a> requires that an instance be in the
     * <code>running</code> state.
     * </p>
     * 
     * @param instanceState
     *        The intended state of the instance. <a>DescribeInstanceStatus</a> requires that an instance be in the
     *        <code>running</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStatus withInstanceState(InstanceState instanceState) {
        setInstanceState(instanceState);
        return this;
    }

    /**
     * <p>
     * Reports impaired functionality that stems from issues internal to the instance, such as impaired reachability.
     * </p>
     * 
     * @param instanceStatus
     *        Reports impaired functionality that stems from issues internal to the instance, such as impaired
     *        reachability.
     */

    public void setInstanceStatus(InstanceStatusSummary instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    /**
     * <p>
     * Reports impaired functionality that stems from issues internal to the instance, such as impaired reachability.
     * </p>
     * 
     * @return Reports impaired functionality that stems from issues internal to the instance, such as impaired
     *         reachability.
     */

    public InstanceStatusSummary getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * <p>
     * Reports impaired functionality that stems from issues internal to the instance, such as impaired reachability.
     * </p>
     * 
     * @param instanceStatus
     *        Reports impaired functionality that stems from issues internal to the instance, such as impaired
     *        reachability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStatus withInstanceStatus(InstanceStatusSummary instanceStatus) {
        setInstanceStatus(instanceStatus);
        return this;
    }

    /**
     * <p>
     * Reports impaired functionality that stems from issues related to the systems that support an instance, such as
     * hardware failures and network connectivity problems.
     * </p>
     * 
     * @param systemStatus
     *        Reports impaired functionality that stems from issues related to the systems that support an instance,
     *        such as hardware failures and network connectivity problems.
     */

    public void setSystemStatus(InstanceStatusSummary systemStatus) {
        this.systemStatus = systemStatus;
    }

    /**
     * <p>
     * Reports impaired functionality that stems from issues related to the systems that support an instance, such as
     * hardware failures and network connectivity problems.
     * </p>
     * 
     * @return Reports impaired functionality that stems from issues related to the systems that support an instance,
     *         such as hardware failures and network connectivity problems.
     */

    public InstanceStatusSummary getSystemStatus() {
        return this.systemStatus;
    }

    /**
     * <p>
     * Reports impaired functionality that stems from issues related to the systems that support an instance, such as
     * hardware failures and network connectivity problems.
     * </p>
     * 
     * @param systemStatus
     *        Reports impaired functionality that stems from issues related to the systems that support an instance,
     *        such as hardware failures and network connectivity problems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStatus withSystemStatus(InstanceStatusSummary systemStatus) {
        setSystemStatus(systemStatus);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceState() != null)
            sb.append("InstanceState: ").append(getInstanceState()).append(",");
        if (getInstanceStatus() != null)
            sb.append("InstanceStatus: ").append(getInstanceStatus()).append(",");
        if (getSystemStatus() != null)
            sb.append("SystemStatus: ").append(getSystemStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceStatus == false)
            return false;
        InstanceStatus other = (InstanceStatus) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceState() == null ^ this.getInstanceState() == null)
            return false;
        if (other.getInstanceState() != null && other.getInstanceState().equals(this.getInstanceState()) == false)
            return false;
        if (other.getInstanceStatus() == null ^ this.getInstanceStatus() == null)
            return false;
        if (other.getInstanceStatus() != null && other.getInstanceStatus().equals(this.getInstanceStatus()) == false)
            return false;
        if (other.getSystemStatus() == null ^ this.getSystemStatus() == null)
            return false;
        if (other.getSystemStatus() != null && other.getSystemStatus().equals(this.getSystemStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceState() == null) ? 0 : getInstanceState().hashCode());
        hashCode = prime * hashCode + ((getInstanceStatus() == null) ? 0 : getInstanceStatus().hashCode());
        hashCode = prime * hashCode + ((getSystemStatus() == null) ? 0 : getSystemStatus().hashCode());
        return hashCode;
    }

    @Override
    public InstanceStatus clone() {
        try {
            return (InstanceStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
