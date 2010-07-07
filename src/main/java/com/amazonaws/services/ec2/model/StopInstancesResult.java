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
 * The result of calling the StopInstances operation. Contains details
 * on how the specified instances are changing state.
 * </p>
 */
public class StopInstancesResult {

    /**
     * The list of the stopping instances and details on how their state has
     * changed.
     */
    private java.util.List<InstanceStateChange> stoppingInstances;

    /**
     * The list of the stopping instances and details on how their state has
     * changed.
     *
     * @return The list of the stopping instances and details on how their state has
     *         changed.
     */
    public java.util.List<InstanceStateChange> getStoppingInstances() {
        if (stoppingInstances == null) {
            stoppingInstances = new java.util.ArrayList<InstanceStateChange>();
        }
        return stoppingInstances;
    }
    
    /**
     * The list of the stopping instances and details on how their state has
     * changed.
     *
     * @param stoppingInstances The list of the stopping instances and details on how their state has
     *         changed.
     */
    public void setStoppingInstances(java.util.Collection<InstanceStateChange> stoppingInstances) {
        java.util.List<InstanceStateChange> stoppingInstancesCopy = new java.util.ArrayList<InstanceStateChange>();
        if (stoppingInstances != null) {
            stoppingInstancesCopy.addAll(stoppingInstances);
        }
        this.stoppingInstances = stoppingInstancesCopy;
    }
    
    /**
     * The list of the stopping instances and details on how their state has
     * changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stoppingInstances The list of the stopping instances and details on how their state has
     *         changed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StopInstancesResult withStoppingInstances(InstanceStateChange... stoppingInstances) {
        for (InstanceStateChange value : stoppingInstances) {
            getStoppingInstances().add(value);
        }
        return this;
    }
    
    /**
     * The list of the stopping instances and details on how their state has
     * changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stoppingInstances The list of the stopping instances and details on how their state has
     *         changed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StopInstancesResult withStoppingInstances(java.util.Collection<InstanceStateChange> stoppingInstances) {
        java.util.List<InstanceStateChange> stoppingInstancesCopy = new java.util.ArrayList<InstanceStateChange>();
        if (stoppingInstances != null) {
            stoppingInstancesCopy.addAll(stoppingInstances);
        }
        this.stoppingInstances = stoppingInstancesCopy;

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
        sb.append("StoppingInstances: " + stoppingInstances + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    