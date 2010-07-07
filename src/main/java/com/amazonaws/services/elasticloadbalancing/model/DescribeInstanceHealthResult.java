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
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * Describe Instance Health Result
 */
public class DescribeInstanceHealthResult {

    private java.util.List<InstanceState> instanceStates;

    /**
     * Returns the value of the InstanceStates property for this object.
     *
     * @return The value of the InstanceStates property for this object.
     */
    public java.util.List<InstanceState> getInstanceStates() {
        if (instanceStates == null) {
            instanceStates = new java.util.ArrayList<InstanceState>();
        }
        return instanceStates;
    }
    
    /**
     * Sets the value of the InstanceStates property for this object.
     *
     * @param instanceStates The new value for the InstanceStates property for this object.
     */
    public void setInstanceStates(java.util.Collection<InstanceState> instanceStates) {
        java.util.List<InstanceState> instanceStatesCopy = new java.util.ArrayList<InstanceState>();
        if (instanceStates != null) {
            instanceStatesCopy.addAll(instanceStates);
        }
        this.instanceStates = instanceStatesCopy;
    }
    
    /**
     * Sets the value of the InstanceStates property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceStates The new value for the InstanceStates property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstanceHealthResult withInstanceStates(InstanceState... instanceStates) {
        for (InstanceState value : instanceStates) {
            getInstanceStates().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the InstanceStates property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceStates The new value for the InstanceStates property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstanceHealthResult withInstanceStates(java.util.Collection<InstanceState> instanceStates) {
        java.util.List<InstanceState> instanceStatesCopy = new java.util.ArrayList<InstanceState>();
        if (instanceStates != null) {
            instanceStatesCopy.addAll(instanceStates);
        }
        this.instanceStates = instanceStatesCopy;

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
        sb.append("InstanceStates: " + instanceStates + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    