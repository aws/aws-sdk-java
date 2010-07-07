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
 * Describe Load Balancers Result
 */
public class DescribeLoadBalancersResult {

    private java.util.List<LoadBalancerDescription> loadBalancerDescriptions;

    /**
     * Returns the value of the LoadBalancerDescriptions property for this
     * object.
     *
     * @return The value of the LoadBalancerDescriptions property for this object.
     */
    public java.util.List<LoadBalancerDescription> getLoadBalancerDescriptions() {
        if (loadBalancerDescriptions == null) {
            loadBalancerDescriptions = new java.util.ArrayList<LoadBalancerDescription>();
        }
        return loadBalancerDescriptions;
    }
    
    /**
     * Sets the value of the LoadBalancerDescriptions property for this
     * object.
     *
     * @param loadBalancerDescriptions The new value for the LoadBalancerDescriptions property for this
     *         object.
     */
    public void setLoadBalancerDescriptions(java.util.Collection<LoadBalancerDescription> loadBalancerDescriptions) {
        java.util.List<LoadBalancerDescription> loadBalancerDescriptionsCopy = new java.util.ArrayList<LoadBalancerDescription>();
        if (loadBalancerDescriptions != null) {
            loadBalancerDescriptionsCopy.addAll(loadBalancerDescriptions);
        }
        this.loadBalancerDescriptions = loadBalancerDescriptionsCopy;
    }
    
    /**
     * Sets the value of the LoadBalancerDescriptions property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerDescriptions The new value for the LoadBalancerDescriptions property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLoadBalancersResult withLoadBalancerDescriptions(LoadBalancerDescription... loadBalancerDescriptions) {
        for (LoadBalancerDescription value : loadBalancerDescriptions) {
            getLoadBalancerDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the LoadBalancerDescriptions property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerDescriptions The new value for the LoadBalancerDescriptions property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLoadBalancersResult withLoadBalancerDescriptions(java.util.Collection<LoadBalancerDescription> loadBalancerDescriptions) {
        java.util.List<LoadBalancerDescription> loadBalancerDescriptionsCopy = new java.util.ArrayList<LoadBalancerDescription>();
        if (loadBalancerDescriptions != null) {
            loadBalancerDescriptionsCopy.addAll(loadBalancerDescriptions);
        }
        this.loadBalancerDescriptions = loadBalancerDescriptionsCopy;

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
        sb.append("LoadBalancerDescriptions: " + loadBalancerDescriptions + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    