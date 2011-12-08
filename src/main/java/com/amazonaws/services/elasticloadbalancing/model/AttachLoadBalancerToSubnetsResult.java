/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        java.util.List<String> subnetsCopy = new java.util.ArrayList<String>();
        if (subnets != null) {
            subnetsCopy.addAll(subnets);
        }
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
        if (getSubnets() == null) setSubnets(new java.util.ArrayList<String>());
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
        java.util.List<String> subnetsCopy = new java.util.ArrayList<String>();
        if (subnets != null) {
            subnetsCopy.addAll(subnets);
        }
        this.subnets = subnetsCopy;

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
        sb.append("Subnets: " + subnets + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    