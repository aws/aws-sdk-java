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
 * The result of calling the StartInstances operation. Contains details
 * on how the specified instances are changing state.
 * </p>
 */
public class StartInstancesResult {

    /**
     * The list of the starting instances and details on how their state has
     * changed.
     */
    private java.util.List<InstanceStateChange> startingInstances;

    /**
     * The list of the starting instances and details on how their state has
     * changed.
     *
     * @return The list of the starting instances and details on how their state has
     *         changed.
     */
    public java.util.List<InstanceStateChange> getStartingInstances() {
        if (startingInstances == null) {
            startingInstances = new java.util.ArrayList<InstanceStateChange>();
        }
        return startingInstances;
    }
    
    /**
     * The list of the starting instances and details on how their state has
     * changed.
     *
     * @param startingInstances The list of the starting instances and details on how their state has
     *         changed.
     */
    public void setStartingInstances(java.util.Collection<InstanceStateChange> startingInstances) {
        java.util.List<InstanceStateChange> startingInstancesCopy = new java.util.ArrayList<InstanceStateChange>();
        if (startingInstances != null) {
            startingInstancesCopy.addAll(startingInstances);
        }
        this.startingInstances = startingInstancesCopy;
    }
    
    /**
     * The list of the starting instances and details on how their state has
     * changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startingInstances The list of the starting instances and details on how their state has
     *         changed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StartInstancesResult withStartingInstances(InstanceStateChange... startingInstances) {
        for (InstanceStateChange value : startingInstances) {
            getStartingInstances().add(value);
        }
        return this;
    }
    
    /**
     * The list of the starting instances and details on how their state has
     * changed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startingInstances The list of the starting instances and details on how their state has
     *         changed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StartInstancesResult withStartingInstances(java.util.Collection<InstanceStateChange> startingInstances) {
        java.util.List<InstanceStateChange> startingInstancesCopy = new java.util.ArrayList<InstanceStateChange>();
        if (startingInstances != null) {
            startingInstancesCopy.addAll(startingInstances);
        }
        this.startingInstances = startingInstancesCopy;

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
        sb.append("StartingInstances: " + startingInstances + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    