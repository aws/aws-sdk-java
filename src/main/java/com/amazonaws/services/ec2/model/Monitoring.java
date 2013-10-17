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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * Describes the monitoring status of an Amazon EC2 instance.
 * </p>
 */
public class Monitoring implements Serializable {

    /**
     * The state of monitoring on an Amazon EC2 instance (ex: enabled,
     * disabled).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, enabled, pending
     */
    private String state;

    /**
     * The state of monitoring on an Amazon EC2 instance (ex: enabled,
     * disabled).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, enabled, pending
     *
     * @return The state of monitoring on an Amazon EC2 instance (ex: enabled,
     *         disabled).
     *
     * @see MonitoringState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of monitoring on an Amazon EC2 instance (ex: enabled,
     * disabled).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, enabled, pending
     *
     * @param state The state of monitoring on an Amazon EC2 instance (ex: enabled,
     *         disabled).
     *
     * @see MonitoringState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of monitoring on an Amazon EC2 instance (ex: enabled,
     * disabled).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, enabled, pending
     *
     * @param state The state of monitoring on an Amazon EC2 instance (ex: enabled,
     *         disabled).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see MonitoringState
     */
    public Monitoring withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The state of monitoring on an Amazon EC2 instance (ex: enabled,
     * disabled).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, enabled, pending
     *
     * @param state The state of monitoring on an Amazon EC2 instance (ex: enabled,
     *         disabled).
     *
     * @see MonitoringState
     */
    public void setState(MonitoringState state) {
        this.state = state.toString();
    }
    
    /**
     * The state of monitoring on an Amazon EC2 instance (ex: enabled,
     * disabled).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>disabled, enabled, pending
     *
     * @param state The state of monitoring on an Amazon EC2 instance (ex: enabled,
     *         disabled).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see MonitoringState
     */
    public Monitoring withState(MonitoringState state) {
        this.state = state.toString();
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
        if (getState() != null) sb.append("State: " + getState() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Monitoring == false) return false;
        Monitoring other = (Monitoring)obj;
        
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        return true;
    }
    
}
    