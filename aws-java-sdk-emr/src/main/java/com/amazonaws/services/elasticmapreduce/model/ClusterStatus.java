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
 * The detailed status of the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ClusterStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current state of the cluster.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason for the cluster status change.
     * </p>
     */
    private ClusterStateChangeReason stateChangeReason;
    /**
     * <p>
     * A timeline that represents the status of a cluster over the lifetime of the cluster.
     * </p>
     */
    private ClusterTimeline timeline;

    /**
     * <p>
     * The current state of the cluster.
     * </p>
     * 
     * @param state
     *        The current state of the cluster.
     * @see ClusterState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the cluster.
     * </p>
     * 
     * @return The current state of the cluster.
     * @see ClusterState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the cluster.
     * </p>
     * 
     * @param state
     *        The current state of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public ClusterStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the cluster.
     * </p>
     * 
     * @param state
     *        The current state of the cluster.
     * @see ClusterState
     */

    public void setState(ClusterState state) {
        withState(state);
    }

    /**
     * <p>
     * The current state of the cluster.
     * </p>
     * 
     * @param state
     *        The current state of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterState
     */

    public ClusterStatus withState(ClusterState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the cluster status change.
     * </p>
     * 
     * @param stateChangeReason
     *        The reason for the cluster status change.
     */

    public void setStateChangeReason(ClusterStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * The reason for the cluster status change.
     * </p>
     * 
     * @return The reason for the cluster status change.
     */

    public ClusterStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * <p>
     * The reason for the cluster status change.
     * </p>
     * 
     * @param stateChangeReason
     *        The reason for the cluster status change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterStatus withStateChangeReason(ClusterStateChangeReason stateChangeReason) {
        setStateChangeReason(stateChangeReason);
        return this;
    }

    /**
     * <p>
     * A timeline that represents the status of a cluster over the lifetime of the cluster.
     * </p>
     * 
     * @param timeline
     *        A timeline that represents the status of a cluster over the lifetime of the cluster.
     */

    public void setTimeline(ClusterTimeline timeline) {
        this.timeline = timeline;
    }

    /**
     * <p>
     * A timeline that represents the status of a cluster over the lifetime of the cluster.
     * </p>
     * 
     * @return A timeline that represents the status of a cluster over the lifetime of the cluster.
     */

    public ClusterTimeline getTimeline() {
        return this.timeline;
    }

    /**
     * <p>
     * A timeline that represents the status of a cluster over the lifetime of the cluster.
     * </p>
     * 
     * @param timeline
     *        A timeline that represents the status of a cluster over the lifetime of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterStatus withTimeline(ClusterTimeline timeline) {
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

        if (obj instanceof ClusterStatus == false)
            return false;
        ClusterStatus other = (ClusterStatus) obj;
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
    public ClusterStatus clone() {
        try {
            return (ClusterStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.ClusterStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
