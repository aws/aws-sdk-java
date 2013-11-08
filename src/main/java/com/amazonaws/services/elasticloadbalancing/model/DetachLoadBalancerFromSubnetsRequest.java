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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#detachLoadBalancerFromSubnets(DetachLoadBalancerFromSubnetsRequest) DetachLoadBalancerFromSubnets operation}.
 * <p>
 * Removes subnets from the set of configured subnets in the Amazon Virtual Private Cloud (Amazon VPC) for the load balancer.
 * </p>
 * <p>
 * After a subnet is removed all of the EC2 instances registered with the load balancer that are in the removed subnet will go into the
 * <i>OutOfService</i> state. When a subnet is removed, the load balancer will balance the traffic among the remaining routable subnets for the load
 * balancer.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#detachLoadBalancerFromSubnets(DetachLoadBalancerFromSubnetsRequest)
 */
public class DetachLoadBalancerFromSubnetsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name associated with the load balancer to be detached.
     */
    private String loadBalancerName;

    /**
     * A list of subnet IDs to remove from the set of configured subnets for
     * the load balancer.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> subnets;

    /**
     * The name associated with the load balancer to be detached.
     *
     * @return The name associated with the load balancer to be detached.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name associated with the load balancer to be detached.
     *
     * @param loadBalancerName The name associated with the load balancer to be detached.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name associated with the load balancer to be detached.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name associated with the load balancer to be detached.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DetachLoadBalancerFromSubnetsRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * A list of subnet IDs to remove from the set of configured subnets for
     * the load balancer.
     *
     * @return A list of subnet IDs to remove from the set of configured subnets for
     *         the load balancer.
     */
    public java.util.List<String> getSubnets() {
        if (subnets == null) {
              subnets = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              subnets.setAutoConstruct(true);
        }
        return subnets;
    }
    
    /**
     * A list of subnet IDs to remove from the set of configured subnets for
     * the load balancer.
     *
     * @param subnets A list of subnet IDs to remove from the set of configured subnets for
     *         the load balancer.
     */
    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnets.size());
        subnetsCopy.addAll(subnets);
        this.subnets = subnetsCopy;
    }
    
    /**
     * A list of subnet IDs to remove from the set of configured subnets for
     * the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets A list of subnet IDs to remove from the set of configured subnets for
     *         the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DetachLoadBalancerFromSubnetsRequest withSubnets(String... subnets) {
        if (getSubnets() == null) setSubnets(new java.util.ArrayList<String>(subnets.length));
        for (String value : subnets) {
            getSubnets().add(value);
        }
        return this;
    }
    
    /**
     * A list of subnet IDs to remove from the set of configured subnets for
     * the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets A list of subnet IDs to remove from the set of configured subnets for
     *         the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DetachLoadBalancerFromSubnetsRequest withSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> subnetsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(subnets.size());
            subnetsCopy.addAll(subnets);
            this.subnets = subnetsCopy;
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
        if (getLoadBalancerName() != null) sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getSubnets() != null) sb.append("Subnets: " + getSubnets() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DetachLoadBalancerFromSubnetsRequest == false) return false;
        DetachLoadBalancerFromSubnetsRequest other = (DetachLoadBalancerFromSubnetsRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getSubnets() == null ^ this.getSubnets() == null) return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false) return false; 
        return true;
    }
    
}
    