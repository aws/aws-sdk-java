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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeRegionsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeRegions(DescribeRegionsRequest) DescribeRegions operation}.
 * <p>
 * The DescribeRegions operation describes regions zones that are currently available to the account.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeRegions(DescribeRegionsRequest)
 */
public class DescribeRegionsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeRegionsRequest> {

    /**
     * The optional list of regions to describe.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> regionNames;

    /**
     * A list of filters used to match properties for Regions. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The optional list of regions to describe.
     *
     * @return The optional list of regions to describe.
     */
    public java.util.List<String> getRegionNames() {
        if (regionNames == null) {
              regionNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              regionNames.setAutoConstruct(true);
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
        com.amazonaws.internal.ListWithAutoConstructFlag<String> regionNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(regionNames.size());
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
            com.amazonaws.internal.ListWithAutoConstructFlag<String> regionNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(regionNames.size());
            regionNamesCopy.addAll(regionNames);
            this.regionNames = regionNamesCopy;
        }

        return this;
    }

    /**
     * A list of filters used to match properties for Regions. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Regions. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for Regions. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Regions. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * A list of filters used to match properties for Regions. For a complete
     * reference to the available filter keys for this operation, see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Regions. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
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
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Regions. For a complete
     *         reference to the available filter keys for this operation, see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeRegionsRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeRegionsRequest> getDryRunRequest() {
        Request<DescribeRegionsRequest> request = new DescribeRegionsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getRegionNames() != null) sb.append("RegionNames: " + getRegionNames() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
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
    