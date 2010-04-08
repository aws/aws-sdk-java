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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request to describe the available Amazon EC2 regions.
 * </p>
 */
public class DescribeRegionsRequest extends AmazonWebServiceRequest {

    /**
     * The optional list of regions to describe.
     */
    private java.util.List<String> regionNames;

    /**
     * The optional list of regions to describe.
     *
     * @return The optional list of regions to describe.
     */
    public java.util.List<String> getRegionNames() {
        if (regionNames == null) {
            regionNames = new java.util.ArrayList<String>();
        }
        return regionNames;
    }
    
    /**
     * The optional list of regions to describe.
     *
     * @param regionNames The optional list of regions to describe.
     */
    public void setRegionNames(java.util.Collection<String> regionNames) {
        java.util.List<String> regionNamesCopy = new java.util.ArrayList<String>();
        if (regionNames != null) {
            regionNamesCopy.addAll(regionNames);
        }
        this.regionNames = regionNamesCopy;
    }
    
    /**
     * The optional list of regions to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param regionNames The optional list of regions to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeRegionsRequest withRegionNames(String... regionNames) {
        for (String value : regionNames) {
            getRegionNames().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of regions to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param regionNames The optional list of regions to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeRegionsRequest withRegionNames(java.util.Collection<String> regionNames) {
        java.util.List<String> regionNamesCopy = new java.util.ArrayList<String>();
        if (regionNames != null) {
            regionNamesCopy.addAll(regionNames);
        }
        this.regionNames = regionNamesCopy;

        return this;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("RegionNames: " + regionNames + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    