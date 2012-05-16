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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeNetworkAcls(DescribeNetworkAclsRequest) DescribeNetworkAcls operation}.
 * <p>
 * Gives you information about the network ACLs in your VPC. You can filter the results to return information only about ACLs that match criteria you
 * specify. For example, you could get information only the ACL associated with a particular subnet. The ACL must match at least one of the specified
 * values for it to be included in the results.
 * </p>
 * <p>
 * You can specify multiple filters (e.g., the ACL is associated with a particular subnet and has an egress entry that denies traffic to a particular
 * port). The result includes information for a particular ACL only if it matches all your filters. If there's no match, no special message is returned;
 * the response is simply empty.
 * </p>
 * <p>
 * You can use wildcards with the filter values: an asterisk matches zero or more characters, and <code>?</code> matches exactly one character. You can
 * escape special characters using a backslash before the character. For example, a value of <code>\*amazon\?\\</code> searches for the literal string
 * <code>*amazon?\</code> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeNetworkAcls(DescribeNetworkAclsRequest)
 */
public class DescribeNetworkAclsRequest extends AmazonWebServiceRequest {

    /**
     * One or more network ACL IDs.
     */
    private java.util.List<String> networkAclIds;

    /**
     * A list of filters used to match properties for Network ACLs. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * One or more network ACL IDs.
     *
     * @return One or more network ACL IDs.
     */
    public java.util.List<String> getNetworkAclIds() {
        
        if (networkAclIds == null) {
            networkAclIds = new java.util.ArrayList<String>();
        }
        return networkAclIds;
    }
    
    /**
     * One or more network ACL IDs.
     *
     * @param networkAclIds One or more network ACL IDs.
     */
    public void setNetworkAclIds(java.util.Collection<String> networkAclIds) {
        if (networkAclIds == null) {
            this.networkAclIds = null;
            return;
        }

        java.util.List<String> networkAclIdsCopy = new java.util.ArrayList<String>(networkAclIds.size());
        networkAclIdsCopy.addAll(networkAclIds);
        this.networkAclIds = networkAclIdsCopy;
    }
    
    /**
     * One or more network ACL IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAclIds One or more network ACL IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeNetworkAclsRequest withNetworkAclIds(String... networkAclIds) {
        if (getNetworkAclIds() == null) setNetworkAclIds(new java.util.ArrayList<String>(networkAclIds.length));
        for (String value : networkAclIds) {
            getNetworkAclIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more network ACL IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkAclIds One or more network ACL IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeNetworkAclsRequest withNetworkAclIds(java.util.Collection<String> networkAclIds) {
        if (networkAclIds == null) {
            this.networkAclIds = null;
        } else {
            java.util.List<String> networkAclIdsCopy = new java.util.ArrayList<String>(networkAclIds.size());
            networkAclIdsCopy.addAll(networkAclIds);
            this.networkAclIds = networkAclIdsCopy;
        }

        return this;
    }
    
    /**
     * A list of filters used to match properties for Network ACLs. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Network ACLs. For a
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
     * A list of filters used to match properties for Network ACLs. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Network ACLs. For a
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
     * A list of filters used to match properties for Network ACLs. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Network ACLs. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeNetworkAclsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for Network ACLs. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Network ACLs. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeNetworkAclsRequest withFilters(java.util.Collection<Filter> filters) {
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
        if (networkAclIds != null) sb.append("NetworkAclIds: " + networkAclIds + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkAclIds() == null) ? 0 : getNetworkAclIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeNetworkAclsRequest == false) return false;
        DescribeNetworkAclsRequest other = (DescribeNetworkAclsRequest)obj;
        
        if (other.getNetworkAclIds() == null ^ this.getNetworkAclIds() == null) return false;
        if (other.getNetworkAclIds() != null && other.getNetworkAclIds().equals(this.getNetworkAclIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    