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
 * Describe Subnets Result
 */
public class DescribeSubnetsResult {

    private java.util.List<Subnet> subnets;

    /**
     * Returns the value of the Subnets property for this object.
     *
     * @return The value of the Subnets property for this object.
     */
    public java.util.List<Subnet> getSubnets() {
        if (subnets == null) {
            subnets = new java.util.ArrayList<Subnet>();
        }
        return subnets;
    }
    
    /**
     * Sets the value of the Subnets property for this object.
     *
     * @param subnets The new value for the Subnets property for this object.
     */
    public void setSubnets(java.util.Collection<Subnet> subnets) {
        java.util.List<Subnet> subnetsCopy = new java.util.ArrayList<Subnet>();
        if (subnets != null) {
            subnetsCopy.addAll(subnets);
        }
        this.subnets = subnetsCopy;
    }
    
    /**
     * Sets the value of the Subnets property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets The new value for the Subnets property for this object.
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
     * Sets the value of the Subnets property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnets The new value for the Subnets property for this object.
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
    
}
    