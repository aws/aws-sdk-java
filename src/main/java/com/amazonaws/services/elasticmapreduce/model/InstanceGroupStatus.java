/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;


/**
 * <p>
 * The details of the instance group status.
 * </p>
 */
public class InstanceGroupStatus implements Serializable {

    /**
     * The current state of the instance group. The following values are
     * deprecated: ARRESTED, SHUTTING_DOWN, and ENDED. Use SUSPENDED,
     * TERMINATING, and TERMINATED instead, respectively.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED
     */
    private String state;

    /**
     * The status change reason details for the instance group.
     */
    private InstanceGroupStateChangeReason stateChangeReason;

    /**
     * The timeline of the instance group status over time.
     */
    private InstanceGroupTimeline timeline;

    /**
     * The current state of the instance group. The following values are
     * deprecated: ARRESTED, SHUTTING_DOWN, and ENDED. Use SUSPENDED,
     * TERMINATING, and TERMINATED instead, respectively.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED
     *
     * @return The current state of the instance group. The following values are
     *         deprecated: ARRESTED, SHUTTING_DOWN, and ENDED. Use SUSPENDED,
     *         TERMINATING, and TERMINATED instead, respectively.
     *
     * @see InstanceGroupState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The current state of the instance group. The following values are
     * deprecated: ARRESTED, SHUTTING_DOWN, and ENDED. Use SUSPENDED,
     * TERMINATING, and TERMINATED instead, respectively.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED
     *
     * @param state The current state of the instance group. The following values are
     *         deprecated: ARRESTED, SHUTTING_DOWN, and ENDED. Use SUSPENDED,
     *         TERMINATING, and TERMINATED instead, respectively.
     *
     * @see InstanceGroupState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The current state of the instance group. The following values are
     * deprecated: ARRESTED, SHUTTING_DOWN, and ENDED. Use SUSPENDED,
     * TERMINATING, and TERMINATED instead, respectively.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED
     *
     * @param state The current state of the instance group. The following values are
     *         deprecated: ARRESTED, SHUTTING_DOWN, and ENDED. Use SUSPENDED,
     *         TERMINATING, and TERMINATED instead, respectively.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceGroupState
     */
    public InstanceGroupStatus withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The current state of the instance group. The following values are
     * deprecated: ARRESTED, SHUTTING_DOWN, and ENDED. Use SUSPENDED,
     * TERMINATING, and TERMINATED instead, respectively.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED
     *
     * @param state The current state of the instance group. The following values are
     *         deprecated: ARRESTED, SHUTTING_DOWN, and ENDED. Use SUSPENDED,
     *         TERMINATING, and TERMINATED instead, respectively.
     *
     * @see InstanceGroupState
     */
    public void setState(InstanceGroupState state) {
        this.state = state.toString();
    }
    
    /**
     * The current state of the instance group. The following values are
     * deprecated: ARRESTED, SHUTTING_DOWN, and ENDED. Use SUSPENDED,
     * TERMINATING, and TERMINATED instead, respectively.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONING, BOOTSTRAPPING, RUNNING, RESIZING, SUSPENDED, TERMINATING, TERMINATED, ARRESTED, SHUTTING_DOWN, ENDED
     *
     * @param state The current state of the instance group. The following values are
     *         deprecated: ARRESTED, SHUTTING_DOWN, and ENDED. Use SUSPENDED,
     *         TERMINATING, and TERMINATED instead, respectively.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InstanceGroupState
     */
    public InstanceGroupStatus withState(InstanceGroupState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * The status change reason details for the instance group.
     *
     * @return The status change reason details for the instance group.
     */
    public InstanceGroupStateChangeReason getStateChangeReason() {
        return stateChangeReason;
    }
    
    /**
     * The status change reason details for the instance group.
     *
     * @param stateChangeReason The status change reason details for the instance group.
     */
    public void setStateChangeReason(InstanceGroupStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }
    
    /**
     * The status change reason details for the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stateChangeReason The status change reason details for the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupStatus withStateChangeReason(InstanceGroupStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
        return this;
    }

    /**
     * The timeline of the instance group status over time.
     *
     * @return The timeline of the instance group status over time.
     */
    public InstanceGroupTimeline getTimeline() {
        return timeline;
    }
    
    /**
     * The timeline of the instance group status over time.
     *
     * @param timeline The timeline of the instance group status over time.
     */
    public void setTimeline(InstanceGroupTimeline timeline) {
        this.timeline = timeline;
    }
    
    /**
     * The timeline of the instance group status over time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param timeline The timeline of the instance group status over time.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupStatus withTimeline(InstanceGroupTimeline timeline) {
        this.timeline = timeline;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getStateChangeReason() != null) sb.append("StateChangeReason: " + getStateChangeReason() + ",");
        if (getTimeline() != null) sb.append("Timeline: " + getTimeline() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceGroupStatus == false) return false;
        InstanceGroupStatus other = (InstanceGroupStatus)obj;
        
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getStateChangeReason() == null ^ this.getStateChangeReason() == null) return false;
        if (other.getStateChangeReason() != null && other.getStateChangeReason().equals(this.getStateChangeReason()) == false) return false; 
        if (other.getTimeline() == null ^ this.getTimeline() == null) return false;
        if (other.getTimeline() != null && other.getTimeline().equals(this.getTimeline()) == false) return false; 
        return true;
    }
    
}
    