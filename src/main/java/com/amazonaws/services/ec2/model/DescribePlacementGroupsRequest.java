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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describePlacementGroups(DescribePlacementGroupsRequest) DescribePlacementGroups operation}.
 * <p>
 * Returns information about one or more PlacementGroup instances in a user's account.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describePlacementGroups(DescribePlacementGroupsRequest)
 */
public class DescribePlacementGroupsRequest extends AmazonWebServiceRequest {

    /**
     * The name of the <code>PlacementGroup</code>.
     */
    private java.util.List<String> groupNames;

    /**
     * A list of filters used to match properties for Placement Groups. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * The name of the <code>PlacementGroup</code>.
     *
     * @return The name of the <code>PlacementGroup</code>.
     */
    public java.util.List<String> getGroupNames() {
        
        if (groupNames == null) {
            groupNames = new java.util.ArrayList<String>();
        }
        return groupNames;
    }
    
    /**
     * The name of the <code>PlacementGroup</code>.
     *
     * @param groupNames The name of the <code>PlacementGroup</code>.
     */
    public void setGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
            return;
        }

        java.util.List<String> groupNamesCopy = new java.util.ArrayList<String>(groupNames.size());
        groupNamesCopy.addAll(groupNames);
        this.groupNames = groupNamesCopy;
    }
    
    /**
     * The name of the <code>PlacementGroup</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames The name of the <code>PlacementGroup</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribePlacementGroupsRequest withGroupNames(String... groupNames) {
        if (getGroupNames() == null) setGroupNames(new java.util.ArrayList<String>(groupNames.length));
        for (String value : groupNames) {
            getGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * The name of the <code>PlacementGroup</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames The name of the <code>PlacementGroup</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribePlacementGroupsRequest withGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
        } else {
            java.util.List<String> groupNamesCopy = new java.util.ArrayList<String>(groupNames.size());
            groupNamesCopy.addAll(groupNames);
            this.groupNames = groupNamesCopy;
        }

        return this;
    }
    
    /**
     * A list of filters used to match properties for Placement Groups. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Placement Groups. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
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
     * A list of filters used to match properties for Placement Groups. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Placement Groups. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
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
     * A list of filters used to match properties for Placement Groups. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Placement Groups. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribePlacementGroupsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for Placement Groups. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Placement Groups. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribePlacementGroupsRequest withFilters(java.util.Collection<Filter> filters) {
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
        if (groupNames != null) sb.append("GroupNames: " + groupNames + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGroupNames() == null) ? 0 : getGroupNames().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribePlacementGroupsRequest == false) return false;
        DescribePlacementGroupsRequest other = (DescribePlacementGroupsRequest)obj;
        
        if (other.getGroupNames() == null ^ this.getGroupNames() == null) return false;
        if (other.getGroupNames() != null && other.getGroupNames().equals(this.getGroupNames()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    