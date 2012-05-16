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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeRegions(DescribeRegionsRequest) DescribeRegions operation}.
 * <p>
 * The DescribeRegions operation describes regions zones that are currently available to the account.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeRegions(DescribeRegionsRequest)
 */
public class DescribeRegionsRequest extends AmazonWebServiceRequest {

    /**
     * The optional list of regions to describe.
     */
    private java.util.List<String> regionNames;

    /**
     * A list of filters used to match properties for Regions. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

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
        if (regionNames == null) {
            this.regionNames = null;
            return;
        }

        java.util.List<String> regionNamesCopy = new java.util.ArrayList<String>(regionNames.size());
        regionNamesCopy.addAll(regionNames);
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
        if (getRegionNames() == null) setRegionNames(new java.util.ArrayList<String>(regionNames.length));
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
        if (regionNames == null) {
            this.regionNames = null;
        } else {
            java.util.List<String> regionNamesCopy = new java.util.ArrayList<String>(regionNames.size());
            regionNamesCopy.addAll(regionNames);
            this.regionNames = regionNamesCopy;
        }

        return this;
    }
    
    /**
     * A list of filters used to match properties for Regions. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Regions. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for Regions. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Regions. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * A list of filters used to match properties for Regions. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Regions. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeRegionsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for Regions. For a complete
     * reference to the available filter keys for this operation, see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Regions. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeRegionsRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
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
        if (regionNames != null) sb.append("RegionNames: " + regionNames + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRegionNames() == null) ? 0 : getRegionNames().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeRegionsRequest == false) return false;
        DescribeRegionsRequest other = (DescribeRegionsRequest)obj;
        
        if (other.getRegionNames() == null ^ this.getRegionNames() == null) return false;
        if (other.getRegionNames() != null && other.getRegionNames().equals(this.getRegionNames()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    