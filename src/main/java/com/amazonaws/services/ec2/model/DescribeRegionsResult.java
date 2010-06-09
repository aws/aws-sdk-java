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
 * The result of describing the available Amazon EC2 regions.
 * </p>
 */
public class DescribeRegionsResult {

    /**
     * The list of described Amazon EC2 regions.
     */
    private java.util.List<Region> regions;

    /**
     * The list of described Amazon EC2 regions.
     *
     * @return The list of described Amazon EC2 regions.
     */
    public java.util.List<Region> getRegions() {
        if (regions == null) {
            regions = new java.util.ArrayList<Region>();
        }
        return regions;
    }
    
    /**
     * The list of described Amazon EC2 regions.
     *
     * @param regions The list of described Amazon EC2 regions.
     */
    public void setRegions(java.util.Collection<Region> regions) {
        java.util.List<Region> regionsCopy = new java.util.ArrayList<Region>();
        if (regions != null) {
            regionsCopy.addAll(regions);
        }
        this.regions = regionsCopy;
    }
    
    /**
     * The list of described Amazon EC2 regions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param regions The list of described Amazon EC2 regions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeRegionsResult withRegions(Region... regions) {
        for (Region value : regions) {
            getRegions().add(value);
        }
        return this;
    }
    
    /**
     * The list of described Amazon EC2 regions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param regions The list of described Amazon EC2 regions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeRegionsResult withRegions(java.util.Collection<Region> regions) {
        java.util.List<Region> regionsCopy = new java.util.ArrayList<Region>();
        if (regions != null) {
            regionsCopy.addAll(regions);
        }
        this.regions = regionsCopy;

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
        
        sb.append("Regions: " + regions + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    