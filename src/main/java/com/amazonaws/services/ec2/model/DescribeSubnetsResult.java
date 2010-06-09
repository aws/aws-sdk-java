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
package com.amazonaws.services.ec2.model;

/**
 * <p>
 * 
 * </p>
 */
public class DescribeSubnetsResult {

    /**
     * Contains a set of one or more <a>Subnet</a> instances.
     */
    private java.util.List<Subnet> subnets;

    /**
     * Contains a set of one or more <a>Subnet</a> instances.
     *
     * @return Contains a set of one or more <a>Subnet</a> instances.
     */
    public java.util.List<Subnet> getSubnets() {
        if (subnets == null) {
            subnets = new java.util.ArrayList<Subnet>();
        }
        return subnets;
    }
    
    /**
     * Contains a set of one or more <a>Subnet</a> instances.
     *
     * @param subnets Contains a set of one or more <a>Subnet</a> instances.
     */
    public void setSubnets(java.util.Collection<Subnet> subnets) {
        java.util.List<Subnet> subnetsCopy = new java.util.ArrayList<Subnet>();
        if (subnets != null) {
            subnetsCopy.addAll(subnets);
        }
        this.subnets = subnetsCopy;
    }
    
    /**
     * Contains a set of one or more <a>Subnet</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets Contains a set of one or more <a>Subnet</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSubnetsResult withSubnets(Subnet... subnets) {
        for (Subnet value : subnets) {
            getSubnets().add(value);
        }
        return this;
    }
    
    /**
     * Contains a set of one or more <a>Subnet</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets Contains a set of one or more <a>Subnet</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSubnetsResult withSubnets(java.util.Collection<Subnet> subnets) {
        java.util.List<Subnet> subnetsCopy = new java.util.ArrayList<Subnet>();
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
    