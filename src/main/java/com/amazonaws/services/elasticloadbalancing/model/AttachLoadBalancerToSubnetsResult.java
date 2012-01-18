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
 * The output for the AttachLoadBalancerToSubnets action.
 * </p>
 */
public class AttachLoadBalancerToSubnetsResult {

    /**
     * A list of subnet IDs added for the LoadBalancer.
     */
    private java.util.List<String> subnets;

    /**
     * A list of subnet IDs added for the LoadBalancer.
     *
     * @return A list of subnet IDs added for the LoadBalancer.
     */
    public java.util.List<String> getSubnets() {
        
        if (subnets == null) {
            subnets = new java.util.ArrayList<String>();
        }
        return subnets;
    }
    
    /**
     * A list of subnet IDs added for the LoadBalancer.
     *
     * @param subnets A list of subnet IDs added for the LoadBalancer.
     */
    public void setSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
            return;
        }

        java.util.List<String> subnetsCopy = new java.util.ArrayList<String>(subnets.size());
        subnetsCopy.addAll(subnets);
        this.subnets = subnetsCopy;
    }
    
    /**
     * A list of subnet IDs added for the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets A list of subnet IDs added for the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AttachLoadBalancerToSubnetsResult withSubnets(String... subnets) {
        if (getSubnets() == null) setSubnets(new java.util.ArrayList<String>(subnets.length));
        for (String value : subnets) {
            getSubnets().add(value);
        }
        return this;
    }
    
    /**
     * A list of subnet IDs added for the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets A list of subnet IDs added for the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AttachLoadBalancerToSubnetsResult withSubnets(java.util.Collection<String> subnets) {
        if (subnets == null) {
            this.subnets = null;
        } else {
            java.util.List<String> subnetsCopy = new java.util.ArrayList<String>(subnets.size());
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
        if (subnets != null) sb.append("Subnets: " + subnets + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubnets() == null) ? 0 : getSubnets().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof AttachLoadBalancerToSubnetsResult == false) return false;
        AttachLoadBalancerToSubnetsResult other = (AttachLoadBalancerToSubnetsResult)obj;
        
        if (other.getSubnets() == null ^ this.getSubnets() == null) return false;
        if (other.getSubnets() != null && other.getSubnets().equals(this.getSubnets()) == false) return false; 
        return true;
    }
    
}
    