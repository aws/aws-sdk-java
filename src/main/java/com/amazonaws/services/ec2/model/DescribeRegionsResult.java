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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * The result of describing the available Amazon EC2 regions.
 * </p>
 */
public class DescribeRegionsResult implements Serializable {

    /**
     * The list of described Amazon EC2 regions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Region> regions;

    /**
     * The list of described Amazon EC2 regions.
     *
     * @return The list of described Amazon EC2 regions.
     */
    public java.util.List<Region> getRegions() {
        if (regions == null) {
              regions = new com.amazonaws.internal.ListWithAutoConstructFlag<Region>();
              regions.setAutoConstruct(true);
        }
        return regions;
    }
    
    /**
     * The list of described Amazon EC2 regions.
     *
     * @param regions The list of described Amazon EC2 regions.
     */
    public void setRegions(java.util.Collection<Region> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Region> regionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Region>(regions.size());
        regionsCopy.addAll(regions);
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
        if (getRegions() == null) setRegions(new java.util.ArrayList<Region>(regions.length));
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
        if (regions == null) {
            this.regions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Region> regionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Region>(regions.size());
            regionsCopy.addAll(regions);
            this.regions = regionsCopy;
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
        if (getRegions() != null) sb.append("Regions: " + getRegions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeRegionsResult == false) return false;
        DescribeRegionsResult other = (DescribeRegionsResult)obj;
        
        if (other.getRegions() == null ^ this.getRegions() == null) return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false) return false; 
        return true;
    }
    
}
    