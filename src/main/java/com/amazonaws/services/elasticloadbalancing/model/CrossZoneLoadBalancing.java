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
 * The <code>CrossZoneLoadBalancing</code> data type.
 * </p>
 */
public class CrossZoneLoadBalancing implements Serializable {

    /**
     * Specifies whether cross-zone load balancing is enabled for the load
     * balancer.
     */
    private Boolean enabled;

    /**
     * Specifies whether cross-zone load balancing is enabled for the load
     * balancer.
     *
     * @return Specifies whether cross-zone load balancing is enabled for the load
     *         balancer.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Specifies whether cross-zone load balancing is enabled for the load
     * balancer.
     *
     * @param enabled Specifies whether cross-zone load balancing is enabled for the load
     *         balancer.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Specifies whether cross-zone load balancing is enabled for the load
     * balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Specifies whether cross-zone load balancing is enabled for the load
     *         balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CrossZoneLoadBalancing withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Specifies whether cross-zone load balancing is enabled for the load
     * balancer.
     *
     * @return Specifies whether cross-zone load balancing is enabled for the load
     *         balancer.
     */
    public Boolean getEnabled() {
        return enabled;
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
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CrossZoneLoadBalancing == false) return false;
        CrossZoneLoadBalancing other = (CrossZoneLoadBalancing)obj;
        
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        return true;
    }
    
}
    