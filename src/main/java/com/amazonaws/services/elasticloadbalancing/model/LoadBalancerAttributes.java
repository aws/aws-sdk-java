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
 * The <code>LoadBalancerAttributes</code> data type.
 * </p>
 */
public class LoadBalancerAttributes implements Serializable {

    /**
     * The name of the load balancer attribute.
     */
    private CrossZoneLoadBalancing crossZoneLoadBalancing;

    /**
     * The name of the load balancer attribute.
     *
     * @return The name of the load balancer attribute.
     */
    public CrossZoneLoadBalancing getCrossZoneLoadBalancing() {
        return crossZoneLoadBalancing;
    }
    
    /**
     * The name of the load balancer attribute.
     *
     * @param crossZoneLoadBalancing The name of the load balancer attribute.
     */
    public void setCrossZoneLoadBalancing(CrossZoneLoadBalancing crossZoneLoadBalancing) {
        this.crossZoneLoadBalancing = crossZoneLoadBalancing;
    }
    
    /**
     * The name of the load balancer attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param crossZoneLoadBalancing The name of the load balancer attribute.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public LoadBalancerAttributes withCrossZoneLoadBalancing(CrossZoneLoadBalancing crossZoneLoadBalancing) {
        this.crossZoneLoadBalancing = crossZoneLoadBalancing;
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
        if (getCrossZoneLoadBalancing() != null) sb.append("CrossZoneLoadBalancing: " + getCrossZoneLoadBalancing() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCrossZoneLoadBalancing() == null) ? 0 : getCrossZoneLoadBalancing().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof LoadBalancerAttributes == false) return false;
        LoadBalancerAttributes other = (LoadBalancerAttributes)obj;
        
        if (other.getCrossZoneLoadBalancing() == null ^ this.getCrossZoneLoadBalancing() == null) return false;
        if (other.getCrossZoneLoadBalancing() != null && other.getCrossZoneLoadBalancing().equals(this.getCrossZoneLoadBalancing()) == false) return false; 
        return true;
    }
    
}
    