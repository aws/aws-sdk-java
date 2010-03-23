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
 * Describe Vpcs Result
 */
public class DescribeVpcsResult {
        
    private java.util.List<Vpc> vpcs;

    /**
     * Returns the value of the Vpcs property for this object.
     *
     * @return The value of the Vpcs property for this object.
     */
    public java.util.List<Vpc> getVpcs() {
        if (vpcs == null) {
            vpcs = new java.util.ArrayList<Vpc>();
        }
        return vpcs;
    }
    
    /**
     * Sets the value of the Vpcs property for this object.
     *
     * @param vpcs The new value for the Vpcs property for this object.
     */
    public void setVpcs(java.util.Collection<Vpc> vpcs) {
        java.util.List<Vpc> vpcsCopy = new java.util.ArrayList<Vpc>();
        if (vpcs != null) {
            vpcsCopy.addAll(vpcs);
        }
        this.vpcs = vpcsCopy;
    }
    
    /**
     * Sets the value of the Vpcs property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcs The new value for the Vpcs property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpcsResult withVpcs(Vpc... vpcs) {
        for (Vpc value : vpcs) {
            getVpcs().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Vpcs property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcs The new value for the Vpcs property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeVpcsResult withVpcs(java.util.Collection<Vpc> vpcs) {
        java.util.List<Vpc> vpcsCopy = new java.util.ArrayList<Vpc>();
        if (vpcs != null) {
            vpcsCopy.addAll(vpcs);
        }
        this.vpcs = vpcsCopy;

        return this;
    }
    
}
    