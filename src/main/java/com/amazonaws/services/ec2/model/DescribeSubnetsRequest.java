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
 * 
 * </p>
 */
public class DescribeSubnetsRequest extends AmazonWebServiceRequest {

    /**
     * A set of one or more subnet IDs.
     */
    private java.util.List<String> subnetIds;

    /**
     * 
     */
    private java.util.List<Filter> filters;

    /**
     * A set of one or more subnet IDs.
     *
     * @return A set of one or more subnet IDs.
     */
    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new java.util.ArrayList<String>();
        }
        return subnetIds;
    }
    
    /**
     * A set of one or more subnet IDs.
     *
     * @param subnetIds A set of one or more subnet IDs.
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        java.util.List<String> subnetIdsCopy = new java.util.ArrayList<String>();
        if (subnetIds != null) {
            subnetIdsCopy.addAll(subnetIds);
        }
        this.subnetIds = subnetIdsCopy;
    }
    
    /**
     * A set of one or more subnet IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds A set of one or more subnet IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSubnetsRequest withSubnetIds(String... subnetIds) {
        for (String value : subnetIds) {
            getSubnetIds().add(value);
        }
        return this;
    }
    
    /**
     * A set of one or more subnet IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds A set of one or more subnet IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSubnetsRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        java.util.List<String> subnetIdsCopy = new java.util.ArrayList<String>();
        if (subnetIds != null) {
            subnetIdsCopy.addAll(subnetIds);
        }
        this.subnetIds = subnetIdsCopy;

        return this;
    }
    
    /**
     * 
     *
     * @return 
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * 
     *
     * @param filters 
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSubnetsRequest withFilters(Filter... filters) {
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSubnetsRequest withFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;

        return this;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("SubnetIds: " + subnetIds + ", ");
        sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    