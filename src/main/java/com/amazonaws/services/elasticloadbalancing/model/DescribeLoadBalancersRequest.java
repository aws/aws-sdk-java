/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#describeLoadBalancers(DescribeLoadBalancersRequest) DescribeLoadBalancers operation}.
 * <p>
 * Returns detailed configuration information for all the load balancers
 * created for the account. If you specify load balancer names, the
 * action returns configuration information of the specified load
 * balancers.
 * </p>
 * <p>
 * <b>NOTE:</b> In order to retrieve this information, you must provide
 * the same account credentials that was used to create the load
 * balancer.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#describeLoadBalancers(DescribeLoadBalancersRequest)
 */
public class DescribeLoadBalancersRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A list of load balancer names associated with the account.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> loadBalancerNames;

    /**
     * An optional parameter used for pagination of results from this call.
     * If specified, the response includes only records beyond the marker.
     */
    private String marker;

    /**
     * The number of results returned in each page. The default is 400. You
     * cannot specify a page size greater than 400 or less than 1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 400<br/>
     */
    private Integer pageSize;

    /**
     * Default constructor for a new DescribeLoadBalancersRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeLoadBalancersRequest() {}
    
    /**
     * Constructs a new DescribeLoadBalancersRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerNames A list of load balancer names associated with
     * the account.
     */
    public DescribeLoadBalancersRequest(java.util.List<String> loadBalancerNames) {
        setLoadBalancerNames(loadBalancerNames);
    }

    /**
     * A list of load balancer names associated with the account.
     *
     * @return A list of load balancer names associated with the account.
     */
    public java.util.List<String> getLoadBalancerNames() {
        if (loadBalancerNames == null) {
              loadBalancerNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              loadBalancerNames.setAutoConstruct(true);
        }
        return loadBalancerNames;
    }
    
    /**
     * A list of load balancer names associated with the account.
     *
     * @param loadBalancerNames A list of load balancer names associated with the account.
     */
    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> loadBalancerNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(loadBalancerNames.size());
        loadBalancerNamesCopy.addAll(loadBalancerNames);
        this.loadBalancerNames = loadBalancerNamesCopy;
    }
    
    /**
     * A list of load balancer names associated with the account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames A list of load balancer names associated with the account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancersRequest withLoadBalancerNames(String... loadBalancerNames) {
        if (getLoadBalancerNames() == null) setLoadBalancerNames(new java.util.ArrayList<String>(loadBalancerNames.length));
        for (String value : loadBalancerNames) {
            getLoadBalancerNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of load balancer names associated with the account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames A list of load balancer names associated with the account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancersRequest withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> loadBalancerNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(loadBalancerNames.size());
            loadBalancerNamesCopy.addAll(loadBalancerNames);
            this.loadBalancerNames = loadBalancerNamesCopy;
        }

        return this;
    }

    /**
     * An optional parameter used for pagination of results from this call.
     * If specified, the response includes only records beyond the marker.
     *
     * @return An optional parameter used for pagination of results from this call.
     *         If specified, the response includes only records beyond the marker.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional parameter used for pagination of results from this call.
     * If specified, the response includes only records beyond the marker.
     *
     * @param marker An optional parameter used for pagination of results from this call.
     *         If specified, the response includes only records beyond the marker.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional parameter used for pagination of results from this call.
     * If specified, the response includes only records beyond the marker.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional parameter used for pagination of results from this call.
     *         If specified, the response includes only records beyond the marker.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * The number of results returned in each page. The default is 400. You
     * cannot specify a page size greater than 400 or less than 1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 400<br/>
     *
     * @return The number of results returned in each page. The default is 400. You
     *         cannot specify a page size greater than 400 or less than 1.
     */
    public Integer getPageSize() {
        return pageSize;
    }
    
    /**
     * The number of results returned in each page. The default is 400. You
     * cannot specify a page size greater than 400 or less than 1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 400<br/>
     *
     * @param pageSize The number of results returned in each page. The default is 400. You
     *         cannot specify a page size greater than 400 or less than 1.
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    
    /**
     * The number of results returned in each page. The default is 400. You
     * cannot specify a page size greater than 400 or less than 1.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 400<br/>
     *
     * @param pageSize The number of results returned in each page. The default is 400. You
     *         cannot specify a page size greater than 400 or less than 1.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLoadBalancersRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
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
        if (getLoadBalancerNames() != null) sb.append("LoadBalancerNames: " + getLoadBalancerNames() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getPageSize() != null) sb.append("PageSize: " + getPageSize() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerNames() == null) ? 0 : getLoadBalancerNames().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLoadBalancersRequest == false) return false;
        DescribeLoadBalancersRequest other = (DescribeLoadBalancersRequest)obj;
        
        if (other.getLoadBalancerNames() == null ^ this.getLoadBalancerNames() == null) return false;
        if (other.getLoadBalancerNames() != null && other.getLoadBalancerNames().equals(this.getLoadBalancerNames()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getPageSize() == null ^ this.getPageSize() == null) return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false) return false; 
        return true;
    }
    
}
    