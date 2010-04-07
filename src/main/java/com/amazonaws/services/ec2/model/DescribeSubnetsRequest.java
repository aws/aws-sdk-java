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
 * Describe Subnets Request
 */
public class DescribeSubnetsRequest extends AmazonWebServiceRequest {

    private java.util.List<String> subnetIds;

    private java.util.List<Filter> filters;

    /**
     * Returns the value of the SubnetIds property for this object.
     *
     * @return The value of the SubnetIds property for this object.
     */
    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new java.util.ArrayList<String>();
        }
        return subnetIds;
    }
    
    /**
     * Sets the value of the SubnetIds property for this object.
     *
     * @param subnetIds The new value for the SubnetIds property for this object.
     */
    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        java.util.List<String> subnetIdsCopy = new java.util.ArrayList<String>();
        if (subnetIds != null) {
            subnetIdsCopy.addAll(subnetIds);
        }
        this.subnetIds = subnetIdsCopy;
    }
    
    /**
     * Sets the value of the SubnetIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds The new value for the SubnetIds property for this object.
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
     * Sets the value of the SubnetIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetIds The new value for the SubnetIds property for this object.
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
     * Returns the value of the Filters property for this object.
     *
     * @return The value of the Filters property for this object.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * Sets the value of the Filters property for this object.
     *
     * @param filters The new value for the Filters property for this object.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;
    }
    
    /**
     * Sets the value of the Filters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The new value for the Filters property for this object.
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
     * Sets the value of the Filters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The new value for the Filters property for this object.
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
    
}
    