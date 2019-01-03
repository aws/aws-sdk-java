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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The status of the instance fleet.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/InstanceFleetStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceFleetStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A code representing the instance fleet status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code>—The instance fleet is provisioning EC2 resources and is not yet ready to run jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been provisioned and the bootstrap actions
     * specified for the instances are underway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>—EC2 instances and other resources are running. They are either executing jobs or waiting to
     * execute jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIZING</code>—A resize operation is underway. EC2 instances are either being added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>—A resize operation could not complete. Existing EC2 instances are running, but instances
     * can't be added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code>—The instance fleet is no longer active, and all EC2 instances have been terminated.
     * </p>
     * </li>
     * </ul>
     */
    private String state;
    /**
     * <p>
     * Provides status change reason details for the instance fleet.
     * </p>
     */
    private InstanceFleetStateChangeReason stateChangeReason;
    /**
     * <p>
     * Provides historical timestamps for the instance fleet, including the time of creation, the time it became ready
     * to run jobs, and the time of termination.
     * </p>
     */
    private InstanceFleetTimeline timeline;

    /**
     * <p>
     * A code representing the instance fleet status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code>—The instance fleet is provisioning EC2 resources and is not yet ready to run jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been provisioned and the bootstrap actions
     * specified for the instances are underway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>—EC2 instances and other resources are running. They are either executing jobs or waiting to
     * execute jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIZING</code>—A resize operation is underway. EC2 instances are either being added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>—A resize operation could not complete. Existing EC2 instances are running, but instances
     * can't be added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code>—The instance fleet is no longer active, and all EC2 instances have been terminated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        A code representing the instance fleet status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code>—The instance fleet is provisioning EC2 resources and is not yet ready to run
     *        jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been provisioned and the bootstrap
     *        actions specified for the instances are underway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>—EC2 instances and other resources are running. They are either executing jobs or
     *        waiting to execute jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESIZING</code>—A resize operation is underway. EC2 instances are either being added or removed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPENDED</code>—A resize operation could not complete. Existing EC2 instances are running, but
     *        instances can't be added or removed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATED</code>—The instance fleet is no longer active, and all EC2 instances have been
     *        terminated.
     *        </p>
     *        </li>
     * @see InstanceFleetState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * A code representing the instance fleet status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code>—The instance fleet is provisioning EC2 resources and is not yet ready to run jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been provisioned and the bootstrap actions
     * specified for the instances are underway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>—EC2 instances and other resources are running. They are either executing jobs or waiting to
     * execute jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIZING</code>—A resize operation is underway. EC2 instances are either being added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>—A resize operation could not complete. Existing EC2 instances are running, but instances
     * can't be added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code>—The instance fleet is no longer active, and all EC2 instances have been terminated.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A code representing the instance fleet status.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PROVISIONING</code>—The instance fleet is provisioning EC2 resources and is not yet ready to run
     *         jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been provisioned and the bootstrap
     *         actions specified for the instances are underway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RUNNING</code>—EC2 instances and other resources are running. They are either executing jobs or
     *         waiting to execute jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESIZING</code>—A resize operation is underway. EC2 instances are either being added or removed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUSPENDED</code>—A resize operation could not complete. Existing EC2 instances are running, but
     *         instances can't be added or removed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TERMINATED</code>—The instance fleet is no longer active, and all EC2 instances have been
     *         terminated.
     *         </p>
     *         </li>
     * @see InstanceFleetState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * A code representing the instance fleet status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code>—The instance fleet is provisioning EC2 resources and is not yet ready to run jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been provisioned and the bootstrap actions
     * specified for the instances are underway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>—EC2 instances and other resources are running. They are either executing jobs or waiting to
     * execute jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIZING</code>—A resize operation is underway. EC2 instances are either being added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>—A resize operation could not complete. Existing EC2 instances are running, but instances
     * can't be added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code>—The instance fleet is no longer active, and all EC2 instances have been terminated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        A code representing the instance fleet status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code>—The instance fleet is provisioning EC2 resources and is not yet ready to run
     *        jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been provisioned and the bootstrap
     *        actions specified for the instances are underway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>—EC2 instances and other resources are running. They are either executing jobs or
     *        waiting to execute jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESIZING</code>—A resize operation is underway. EC2 instances are either being added or removed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPENDED</code>—A resize operation could not complete. Existing EC2 instances are running, but
     *        instances can't be added or removed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATED</code>—The instance fleet is no longer active, and all EC2 instances have been
     *        terminated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceFleetState
     */

    public InstanceFleetStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * A code representing the instance fleet status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code>—The instance fleet is provisioning EC2 resources and is not yet ready to run jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been provisioned and the bootstrap actions
     * specified for the instances are underway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>—EC2 instances and other resources are running. They are either executing jobs or waiting to
     * execute jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIZING</code>—A resize operation is underway. EC2 instances are either being added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>—A resize operation could not complete. Existing EC2 instances are running, but instances
     * can't be added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code>—The instance fleet is no longer active, and all EC2 instances have been terminated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        A code representing the instance fleet status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code>—The instance fleet is provisioning EC2 resources and is not yet ready to run
     *        jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been provisioned and the bootstrap
     *        actions specified for the instances are underway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>—EC2 instances and other resources are running. They are either executing jobs or
     *        waiting to execute jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESIZING</code>—A resize operation is underway. EC2 instances are either being added or removed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPENDED</code>—A resize operation could not complete. Existing EC2 instances are running, but
     *        instances can't be added or removed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATED</code>—The instance fleet is no longer active, and all EC2 instances have been
     *        terminated.
     *        </p>
     *        </li>
     * @see InstanceFleetState
     */

    public void setState(InstanceFleetState state) {
        withState(state);
    }

    /**
     * <p>
     * A code representing the instance fleet status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code>—The instance fleet is provisioning EC2 resources and is not yet ready to run jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been provisioned and the bootstrap actions
     * specified for the instances are underway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>—EC2 instances and other resources are running. They are either executing jobs or waiting to
     * execute jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESIZING</code>—A resize operation is underway. EC2 instances are either being added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUSPENDED</code>—A resize operation could not complete. Existing EC2 instances are running, but instances
     * can't be added or removed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TERMINATED</code>—The instance fleet is no longer active, and all EC2 instances have been terminated.
     * </p>
     * </li>
     * </ul>
     * 
     * @param state
     *        A code representing the instance fleet status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code>—The instance fleet is provisioning EC2 resources and is not yet ready to run
     *        jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOOTSTRAPPING</code>—EC2 instances and other resources have been provisioned and the bootstrap
     *        actions specified for the instances are underway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>—EC2 instances and other resources are running. They are either executing jobs or
     *        waiting to execute jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RESIZING</code>—A resize operation is underway. EC2 instances are either being added or removed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUSPENDED</code>—A resize operation could not complete. Existing EC2 instances are running, but
     *        instances can't be added or removed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATING</code>—The instance fleet is terminating EC2 instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TERMINATED</code>—The instance fleet is no longer active, and all EC2 instances have been
     *        terminated.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceFleetState
     */

    public InstanceFleetStatus withState(InstanceFleetState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Provides status change reason details for the instance fleet.
     * </p>
     * 
     * @param stateChangeReason
     *        Provides status change reason details for the instance fleet.
     */

    public void setStateChangeReason(InstanceFleetStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * Provides status change reason details for the instance fleet.
     * </p>
     * 
     * @return Provides status change reason details for the instance fleet.
     */

    public InstanceFleetStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * <p>
     * Provides status change reason details for the instance fleet.
     * </p>
     * 
     * @param stateChangeReason
     *        Provides status change reason details for the instance fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetStatus withStateChangeReason(InstanceFleetStateChangeReason stateChangeReason) {
        setStateChangeReason(stateChangeReason);
        return this;
    }

    /**
     * <p>
     * Provides historical timestamps for the instance fleet, including the time of creation, the time it became ready
     * to run jobs, and the time of termination.
     * </p>
     * 
     * @param timeline
     *        Provides historical timestamps for the instance fleet, including the time of creation, the time it became
     *        ready to run jobs, and the time of termination.
     */

    public void setTimeline(InstanceFleetTimeline timeline) {
        this.timeline = timeline;
    }

    /**
     * <p>
     * Provides historical timestamps for the instance fleet, including the time of creation, the time it became ready
     * to run jobs, and the time of termination.
     * </p>
     * 
     * @return Provides historical timestamps for the instance fleet, including the time of creation, the time it became
     *         ready to run jobs, and the time of termination.
     */

    public InstanceFleetTimeline getTimeline() {
        return this.timeline;
    }

    /**
     * <p>
     * Provides historical timestamps for the instance fleet, including the time of creation, the time it became ready
     * to run jobs, and the time of termination.
     * </p>
     * 
     * @param timeline
     *        Provides historical timestamps for the instance fleet, including the time of creation, the time it became
     *        ready to run jobs, and the time of termination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceFleetStatus withTimeline(InstanceFleetTimeline timeline) {
        setTimeline(timeline);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateChangeReason() != null)
            sb.append("StateChangeReason: ").append(getStateChangeReason()).append(",");
        if (getTimeline() != null)
            sb.append("Timeline: ").append(getTimeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceFleetStatus == false)
            return false;
        InstanceFleetStatus other = (InstanceFleetStatus) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null)
            return false;
        if (other.getStateChangeReason() != null && other.getStateChangeReason().equals(this.getStateChangeReason()) == false)
            return false;
        if (other.getTimeline() == null ^ this.getTimeline() == null)
            return false;
        if (other.getTimeline() != null && other.getTimeline().equals(this.getTimeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateChangeReason() == null) ? 0 : getStateChangeReason().hashCode());
        hashCode = prime * hashCode + ((getTimeline() == null) ? 0 : getTimeline().hashCode());
        return hashCode;
    }

    @Override
    public InstanceFleetStatus clone() {
        try {
            return (InstanceFleetStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceFleetStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
