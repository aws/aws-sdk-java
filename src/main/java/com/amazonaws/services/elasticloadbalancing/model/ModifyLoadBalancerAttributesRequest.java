/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest) ModifyLoadBalancerAttributes operation}.
 * <p>
 * Modifies the attributes of a specified load balancer.
 * </p>
 * <p>
 * You can modify the load balancer attributes, such as
 * <code>AccessLogs</code> ,
 * <code>ConnectionDraining</code> , and
 * <code>CrossZoneLoadBalancing</code> by either enabling or disabling
 * them.
 * </p>
 * <p>
 * For information on cross-zone load balancing, see <b>Request
 * Routing</b> and for information on connection draining, see
 * <b>Connection Draining</b> in the
 * <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html"> Concepts </a> section of the <i>Elastic Load Balancer Developer Guide</i> . For information on access logs, see <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/access-log-collection.html"> Access Logs </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#modifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest)
 */
public class ModifyLoadBalancerAttributesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the load balancer.
     */
    private String loadBalancerName;

    /**
     * Attributes of the load balancer.
     */
    private LoadBalancerAttributes loadBalancerAttributes;

    /**
     * The name of the load balancer.
     *
     * @return The name of the load balancer.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name of the load balancer.
     *
     * @param loadBalancerName The name of the load balancer.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name of the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name of the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyLoadBalancerAttributesRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * Attributes of the load balancer.
     *
     * @return Attributes of the load balancer.
     */
    public LoadBalancerAttributes getLoadBalancerAttributes() {
        return loadBalancerAttributes;
    }
    
    /**
     * Attributes of the load balancer.
     *
     * @param loadBalancerAttributes Attributes of the load balancer.
     */
    public void setLoadBalancerAttributes(LoadBalancerAttributes loadBalancerAttributes) {
        this.loadBalancerAttributes = loadBalancerAttributes;
    }
    
    /**
     * Attributes of the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerAttributes Attributes of the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyLoadBalancerAttributesRequest withLoadBalancerAttributes(LoadBalancerAttributes loadBalancerAttributes) {
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
        if (getLoadBalancerName() != null) sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getLoadBalancerAttributes() != null) sb.append("LoadBalancerAttributes: " + getLoadBalancerAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getLoadBalancerAttributes() == null) ? 0 : getLoadBalancerAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyLoadBalancerAttributesRequest == false) return false;
        ModifyLoadBalancerAttributesRequest other = (ModifyLoadBalancerAttributesRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getLoadBalancerAttributes() == null ^ this.getLoadBalancerAttributes() == null) return false;
        if (other.getLoadBalancerAttributes() != null && other.getLoadBalancerAttributes().equals(this.getLoadBalancerAttributes()) == false) return false; 
        return true;
    }
    
}
    