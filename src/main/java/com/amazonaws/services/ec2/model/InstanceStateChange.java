/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents a state change for a specific EC2 instance.
 * </p>
 */
public class InstanceStateChange {

    /**
     * The ID of the instance whose state changed.
     */
    private String instanceId;

    /**
     * The current state of the specified instance.
     */
    private InstanceState currentState;

    /**
     * The previous state of the specified instance.
     */
    private InstanceState previousState;

    /**
     * The ID of the instance whose state changed.
     *
     * @return The ID of the instance whose state changed.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance whose state changed.
     *
     * @param instanceId The ID of the instance whose state changed.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance whose state changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance whose state changed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceStateChange withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * The current state of the specified instance.
     *
     * @return The current state of the specified instance.
     */
    public InstanceState getCurrentState() {
        return currentState;
    }
    
    /**
     * The current state of the specified instance.
     *
     * @param currentState The current state of the specified instance.
     */
    public void setCurrentState(InstanceState currentState) {
        this.currentState = currentState;
    }
    
    /**
     * The current state of the specified instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param currentState The current state of the specified instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceStateChange withCurrentState(InstanceState currentState) {
        this.currentState = currentState;
        return this;
    }
    
    
    /**
     * The previous state of the specified instance.
     *
     * @return The previous state of the specified instance.
     */
    public InstanceState getPreviousState() {
        return previousState;
    }
    
    /**
     * The previous state of the specified instance.
     *
     * @param previousState The previous state of the specified instance.
     */
    public void setPreviousState(InstanceState previousState) {
        this.previousState = previousState;
    }
    
    /**
     * The previous state of the specified instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param previousState The previous state of the specified instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InstanceStateChange withPreviousState(InstanceState previousState) {
        this.previousState = previousState;
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
        
        sb.append("InstanceId: " + instanceId + ", ");
        sb.append("CurrentState: " + currentState + ", ");
        sb.append("PreviousState: " + previousState + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    