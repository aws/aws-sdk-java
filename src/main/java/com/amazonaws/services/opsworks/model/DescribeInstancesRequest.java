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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeInstances(DescribeInstancesRequest) DescribeInstances operation}.
 * <p>
 * Requests a description of a set of instances.
 * </p>
 * <p>
 * <b>NOTE:</b>You must specify at least one of the parameters.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeInstances(DescribeInstancesRequest)
 */
public class DescribeInstancesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A stack ID. If you use this parameter, <code>DescribeInstances</code>
     * returns descriptions of the instances associated with the specified
     * stack.
     */
    private String stackId;

    /**
     * A layer ID. If you use this parameter, <code>DescribeInstances</code>
     * returns descriptions of the instances associated with the specified
     * layer.
     */
    private String layerId;

    /**
     * An array of instance IDs to be described. If you use this parameter,
     * <code>DescribeInstances</code> returns a description of the specified
     * instances. Otherwise, it returns a description of every instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIds;

    /**
     * A stack ID. If you use this parameter, <code>DescribeInstances</code>
     * returns descriptions of the instances associated with the specified
     * stack.
     *
     * @return A stack ID. If you use this parameter, <code>DescribeInstances</code>
     *         returns descriptions of the instances associated with the specified
     *         stack.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * A stack ID. If you use this parameter, <code>DescribeInstances</code>
     * returns descriptions of the instances associated with the specified
     * stack.
     *
     * @param stackId A stack ID. If you use this parameter, <code>DescribeInstances</code>
     *         returns descriptions of the instances associated with the specified
     *         stack.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * A stack ID. If you use this parameter, <code>DescribeInstances</code>
     * returns descriptions of the instances associated with the specified
     * stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId A stack ID. If you use this parameter, <code>DescribeInstances</code>
     *         returns descriptions of the instances associated with the specified
     *         stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstancesRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * A layer ID. If you use this parameter, <code>DescribeInstances</code>
     * returns descriptions of the instances associated with the specified
     * layer.
     *
     * @return A layer ID. If you use this parameter, <code>DescribeInstances</code>
     *         returns descriptions of the instances associated with the specified
     *         layer.
     */
    public String getLayerId() {
        return layerId;
    }
    
    /**
     * A layer ID. If you use this parameter, <code>DescribeInstances</code>
     * returns descriptions of the instances associated with the specified
     * layer.
     *
     * @param layerId A layer ID. If you use this parameter, <code>DescribeInstances</code>
     *         returns descriptions of the instances associated with the specified
     *         layer.
     */
    public void setLayerId(String layerId) {
        this.layerId = layerId;
    }
    
    /**
     * A layer ID. If you use this parameter, <code>DescribeInstances</code>
     * returns descriptions of the instances associated with the specified
     * layer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param layerId A layer ID. If you use this parameter, <code>DescribeInstances</code>
     *         returns descriptions of the instances associated with the specified
     *         layer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstancesRequest withLayerId(String layerId) {
        this.layerId = layerId;
        return this;
    }

    /**
     * An array of instance IDs to be described. If you use this parameter,
     * <code>DescribeInstances</code> returns a description of the specified
     * instances. Otherwise, it returns a description of every instance.
     *
     * @return An array of instance IDs to be described. If you use this parameter,
     *         <code>DescribeInstances</code> returns a description of the specified
     *         instances. Otherwise, it returns a description of every instance.
     */
    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
              instanceIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              instanceIds.setAutoConstruct(true);
        }
        return instanceIds;
    }
    
    /**
     * An array of instance IDs to be described. If you use this parameter,
     * <code>DescribeInstances</code> returns a description of the specified
     * instances. Otherwise, it returns a description of every instance.
     *
     * @param instanceIds An array of instance IDs to be described. If you use this parameter,
     *         <code>DescribeInstances</code> returns a description of the specified
     *         instances. Otherwise, it returns a description of every instance.
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceIds.size());
        instanceIdsCopy.addAll(instanceIds);
        this.instanceIds = instanceIdsCopy;
    }
    
    /**
     * An array of instance IDs to be described. If you use this parameter,
     * <code>DescribeInstances</code> returns a description of the specified
     * instances. Otherwise, it returns a description of every instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds An array of instance IDs to be described. If you use this parameter,
     *         <code>DescribeInstances</code> returns a description of the specified
     *         instances. Otherwise, it returns a description of every instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstancesRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of instance IDs to be described. If you use this parameter,
     * <code>DescribeInstances</code> returns a description of the specified
     * instances. Otherwise, it returns a description of every instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds An array of instance IDs to be described. If you use this parameter,
     *         <code>DescribeInstances</code> returns a description of the specified
     *         instances. Otherwise, it returns a description of every instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> instanceIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(instanceIds.size());
            instanceIdsCopy.addAll(instanceIds);
            this.instanceIds = instanceIdsCopy;
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
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getLayerId() != null) sb.append("LayerId: " + getLayerId() + ",");
        if (getInstanceIds() != null) sb.append("InstanceIds: " + getInstanceIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getLayerId() == null) ? 0 : getLayerId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeInstancesRequest == false) return false;
        DescribeInstancesRequest other = (DescribeInstancesRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getLayerId() == null ^ this.getLayerId() == null) return false;
        if (other.getLayerId() != null && other.getLayerId().equals(this.getLayerId()) == false) return false; 
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null) return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false) return false; 
        return true;
    }
    
}
    