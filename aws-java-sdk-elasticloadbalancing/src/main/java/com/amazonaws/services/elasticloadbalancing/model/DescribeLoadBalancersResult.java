/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

/**
 * 
 */
public class DescribeLoadBalancersResult implements Serializable, Cloneable {

    /**
     * Information about the load balancers.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancerDescription> loadBalancerDescriptions;

    /**
     * The marker to use when requesting the next set of results. If there
     * are no additional results, the string is empty.
     */
    private String nextMarker;

    /**
     * Information about the load balancers.
     *
     * @return Information about the load balancers.
     */
    public java.util.List<LoadBalancerDescription> getLoadBalancerDescriptions() {
        if (loadBalancerDescriptions == null) {
              loadBalancerDescriptions = new com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancerDescription>();
              loadBalancerDescriptions.setAutoConstruct(true);
        }
        return loadBalancerDescriptions;
    }
    
    /**
     * Information about the load balancers.
     *
     * @param loadBalancerDescriptions Information about the load balancers.
     */
    public void setLoadBalancerDescriptions(java.util.Collection<LoadBalancerDescription> loadBalancerDescriptions) {
        if (loadBalancerDescriptions == null) {
            this.loadBalancerDescriptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancerDescription> loadBalancerDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancerDescription>(loadBalancerDescriptions.size());
        loadBalancerDescriptionsCopy.addAll(loadBalancerDescriptions);
        this.loadBalancerDescriptions = loadBalancerDescriptionsCopy;
    }
    
    /**
     * Information about the load balancers.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLoadBalancerDescriptions(java.util.Collection)}
     * or {@link #withLoadBalancerDescriptions(java.util.Collection)} if you
     * want to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerDescriptions Information about the load balancers.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancersResult withLoadBalancerDescriptions(LoadBalancerDescription... loadBalancerDescriptions) {
        if (getLoadBalancerDescriptions() == null) setLoadBalancerDescriptions(new java.util.ArrayList<LoadBalancerDescription>(loadBalancerDescriptions.length));
        for (LoadBalancerDescription value : loadBalancerDescriptions) {
            getLoadBalancerDescriptions().add(value);
        }
        return this;
    }
    
    /**
     * Information about the load balancers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerDescriptions Information about the load balancers.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancersResult withLoadBalancerDescriptions(java.util.Collection<LoadBalancerDescription> loadBalancerDescriptions) {
        if (loadBalancerDescriptions == null) {
            this.loadBalancerDescriptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancerDescription> loadBalancerDescriptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancerDescription>(loadBalancerDescriptions.size());
            loadBalancerDescriptionsCopy.addAll(loadBalancerDescriptions);
            this.loadBalancerDescriptions = loadBalancerDescriptionsCopy;
        }

        return this;
    }

    /**
     * The marker to use when requesting the next set of results. If there
     * are no additional results, the string is empty.
     *
     * @return The marker to use when requesting the next set of results. If there
     *         are no additional results, the string is empty.
     */
    public String getNextMarker() {
        return nextMarker;
    }
    
    /**
     * The marker to use when requesting the next set of results. If there
     * are no additional results, the string is empty.
     *
     * @param nextMarker The marker to use when requesting the next set of results. If there
     *         are no additional results, the string is empty.
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }
    
    /**
     * The marker to use when requesting the next set of results. If there
     * are no additional results, the string is empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextMarker The marker to use when requesting the next set of results. If there
     *         are no additional results, the string is empty.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancersResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
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
        if (getLoadBalancerDescriptions() != null) sb.append("LoadBalancerDescriptions: " + getLoadBalancerDescriptions() + ",");
        if (getNextMarker() != null) sb.append("NextMarker: " + getNextMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerDescriptions() == null) ? 0 : getLoadBalancerDescriptions().hashCode()); 
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLoadBalancersResult == false) return false;
        DescribeLoadBalancersResult other = (DescribeLoadBalancersResult)obj;
        
        if (other.getLoadBalancerDescriptions() == null ^ this.getLoadBalancerDescriptions() == null) return false;
        if (other.getLoadBalancerDescriptions() != null && other.getLoadBalancerDescriptions().equals(this.getLoadBalancerDescriptions()) == false) return false; 
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeLoadBalancersResult clone() {
        try {
            return (DescribeLoadBalancersResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    