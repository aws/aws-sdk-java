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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;


/**
 * <p>
 * The following element is returned in a structure named <code>DescribeLoadBalancerAttributesResult</code> .
 * </p>
 */
public class DescribeLoadBalancerAttributesResult implements Serializable {

    /**
     * The load balancer attributes structure.
     */
    private LoadBalancerAttributes loadBalancerAttributes;

    /**
     * The load balancer attributes structure.
     *
     * @return The load balancer attributes structure.
     */
    public LoadBalancerAttributes getLoadBalancerAttributes() {
        return loadBalancerAttributes;
    }
    
    /**
     * The load balancer attributes structure.
     *
     * @param loadBalancerAttributes The load balancer attributes structure.
     */
    public void setLoadBalancerAttributes(LoadBalancerAttributes loadBalancerAttributes) {
        this.loadBalancerAttributes = loadBalancerAttributes;
    }
    
    /**
     * The load balancer attributes structure.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerAttributes The load balancer attributes structure.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeLoadBalancerAttributesResult withLoadBalancerAttributes(LoadBalancerAttributes loadBalancerAttributes) {
        this.loadBalancerAttributes = loadBalancerAttributes;
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
        if (getLoadBalancerAttributes() != null) sb.append("LoadBalancerAttributes: " + getLoadBalancerAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerAttributes() == null) ? 0 : getLoadBalancerAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLoadBalancerAttributesResult == false) return false;
        DescribeLoadBalancerAttributesResult other = (DescribeLoadBalancerAttributesResult)obj;
        
        if (other.getLoadBalancerAttributes() == null ^ this.getLoadBalancerAttributes() == null) return false;
        if (other.getLoadBalancerAttributes() != null && other.getLoadBalancerAttributes().equals(this.getLoadBalancerAttributes()) == false) return false; 
        return true;
    }
    
}
    