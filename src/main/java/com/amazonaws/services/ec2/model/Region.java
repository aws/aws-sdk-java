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
 * Represents an Amazon EC2 region. EC2 regions are completely isolated from each other.
 * </p>
 */
public class Region implements Serializable {

    /**
     * Name of the region.
     */
    private String regionName;

    /**
     * Region service endpoint.
     */
    private String endpoint;

    /**
     * Name of the region.
     *
     * @return Name of the region.
     */
    public String getRegionName() {
        return regionName;
    }
    
    /**
     * Name of the region.
     *
     * @param regionName Name of the region.
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
    
    /**
     * Name of the region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param regionName Name of the region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Region withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * Region service endpoint.
     *
     * @return Region service endpoint.
     */
    public String getEndpoint() {
        return endpoint;
    }
    
    /**
     * Region service endpoint.
     *
     * @param endpoint Region service endpoint.
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
    
    /**
     * Region service endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endpoint Region service endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Region withEndpoint(String endpoint) {
        this.endpoint = endpoint;
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
        if (getRegionName() != null) sb.append("RegionName: " + getRegionName() + ",");
        if (getEndpoint() != null) sb.append("Endpoint: " + getEndpoint() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRegionName() == null) ? 0 : getRegionName().hashCode()); 
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Region == false) return false;
        Region other = (Region)obj;
        
        if (other.getRegionName() == null ^ this.getRegionName() == null) return false;
        if (other.getRegionName() != null && other.getRegionName().equals(this.getRegionName()) == false) return false; 
        if (other.getEndpoint() == null ^ this.getEndpoint() == null) return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false) return false; 
        return true;
    }
    
}
    