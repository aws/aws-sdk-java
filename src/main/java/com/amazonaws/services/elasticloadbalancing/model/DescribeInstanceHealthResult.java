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
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * <p>
 * The output for the DescribeInstanceHealth action.
 * </p>
 */
public class DescribeInstanceHealthResult {

    /**
     * A list containing health information for the specified instances.
     */
    private java.util.List<InstanceState> instanceStates;

    /**
     * A list containing health information for the specified instances.
     *
     * @return A list containing health information for the specified instances.
     */
    public java.util.List<InstanceState> getInstanceStates() {
        
        if (instanceStates == null) {
            instanceStates = new java.util.ArrayList<InstanceState>();
        }
        return instanceStates;
    }
    
    /**
     * A list containing health information for the specified instances.
     *
     * @param instanceStates A list containing health information for the specified instances.
     */
    public void setInstanceStates(java.util.Collection<InstanceState> instanceStates) {
        if (instanceStates == null) {
            this.instanceStates = null;
            return;
        }

        java.util.List<InstanceState> instanceStatesCopy = new java.util.ArrayList<InstanceState>(instanceStates.size());
        instanceStatesCopy.addAll(instanceStates);
        this.instanceStates = instanceStatesCopy;
    }
    
    /**
     * A list containing health information for the specified instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceStates A list containing health information for the specified instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstanceHealthResult withInstanceStates(InstanceState... instanceStates) {
        if (getInstanceStates() == null) setInstanceStates(new java.util.ArrayList<InstanceState>(instanceStates.length));
        for (InstanceState value : instanceStates) {
            getInstanceStates().add(value);
        }
        return this;
    }
    
    /**
     * A list containing health information for the specified instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceStates A list containing health information for the specified instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstanceHealthResult withInstanceStates(java.util.Collection<InstanceState> instanceStates) {
        if (instanceStates == null) {
            this.instanceStates = null;
        } else {
            java.util.List<InstanceState> instanceStatesCopy = new java.util.ArrayList<InstanceState>(instanceStates.size());
            instanceStatesCopy.addAll(instanceStates);
            this.instanceStates = instanceStatesCopy;
        }

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
        if (instanceStates != null) sb.append("InstanceStates: " + instanceStates + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceStates() == null) ? 0 : getInstanceStates().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeInstanceHealthResult == false) return false;
        DescribeInstanceHealthResult other = (DescribeInstanceHealthResult)obj;
        
        if (other.getInstanceStates() == null ^ this.getInstanceStates() == null) return false;
        if (other.getInstanceStates() != null && other.getInstanceStates().equals(this.getInstanceStates()) == false) return false; 
        return true;
    }
    
}
    