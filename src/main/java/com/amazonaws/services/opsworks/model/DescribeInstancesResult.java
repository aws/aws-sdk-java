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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the response to a <code>DescribeInstances</code> request.
 * </p>
 */
public class DescribeInstancesResult implements Serializable {

    /**
     * An array of <code>Instance</code> objects that describe the instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instances;

    /**
     * An array of <code>Instance</code> objects that describe the instances.
     *
     * @return An array of <code>Instance</code> objects that describe the instances.
     */
    public java.util.List<Instance> getInstances() {
        if (instances == null) {
              instances = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>();
              instances.setAutoConstruct(true);
        }
        return instances;
    }
    
    /**
     * An array of <code>Instance</code> objects that describe the instances.
     *
     * @param instances An array of <code>Instance</code> objects that describe the instances.
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>(instances.size());
        instancesCopy.addAll(instances);
        this.instances = instancesCopy;
    }
    
    /**
     * An array of <code>Instance</code> objects that describe the instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances An array of <code>Instance</code> objects that describe the instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstancesResult withInstances(Instance... instances) {
        if (getInstances() == null) setInstances(new java.util.ArrayList<Instance>(instances.length));
        for (Instance value : instances) {
            getInstances().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>Instance</code> objects that describe the instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances An array of <code>Instance</code> objects that describe the instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstancesResult withInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>(instances.size());
            instancesCopy.addAll(instances);
            this.instances = instancesCopy;
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
        if (getInstances() != null) sb.append("Instances: " + getInstances() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeInstancesResult == false) return false;
        DescribeInstancesResult other = (DescribeInstancesResult)obj;
        
        if (other.getInstances() == null ^ this.getInstances() == null) return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false) return false; 
        return true;
    }
    
}
    