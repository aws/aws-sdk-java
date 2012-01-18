/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes the monitoring status of an Amazon EC2 instance.
 * </p>
 */
public class Monitoring {

    /**
     * The state of monitoring on an Amazon EC2 instance (ex: enabled,
     * disabled).
     */
    private String state;

    /**
     * The state of monitoring on an Amazon EC2 instance (ex: enabled,
     * disabled).
     *
     * @return The state of monitoring on an Amazon EC2 instance (ex: enabled,
     *         disabled).
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of monitoring on an Amazon EC2 instance (ex: enabled,
     * disabled).
     *
     * @param state The state of monitoring on an Amazon EC2 instance (ex: enabled,
     *         disabled).
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of monitoring on an Amazon EC2 instance (ex: enabled,
     * disabled).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The state of monitoring on an Amazon EC2 instance (ex: enabled,
     *         disabled).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Monitoring withState(String state) {
        this.state = state;
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
        if (state != null) sb.append("State: " + state + ", ");
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
    