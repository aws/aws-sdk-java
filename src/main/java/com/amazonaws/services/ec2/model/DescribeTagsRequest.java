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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeTags(DescribeTagsRequest) DescribeTags operation}.
 * <p>
 * Describes the tags for the specified resources.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeTags(DescribeTagsRequest)
 */
public class DescribeTagsRequest extends AmazonWebServiceRequest {

    /**
     * A list of filters used to match tags associated with the specified
     * tags.
     */
    private java.util.List<Filter> filters;

    /**
     * Default constructor for a new DescribeTagsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeTagsRequest() {}
    
    /**
     * Constructs a new DescribeTagsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param filters A list of filters used to match tags associated with
     * the specified tags.
     */
    public DescribeTagsRequest(java.util.List<Filter> filters) {
        this.filters = filters;
    }
    
    /**
     * A list of filters used to match tags associated with the specified
     * tags.
     *
     * @return A list of filters used to match tags associated with the specified
     *         tags.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * A list of filters used to match tags associated with the specified
     * tags.
     *
     * @param filters A list of filters used to match tags associated with the specified
     *         tags.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;
    }
    
    /**
     * A list of filters used to match tags associated with the specified
     * tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match tags associated with the specified
     *         tags.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeTagsRequest withFilters(Filter... filters) {
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match tags associated with the specified
     * tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match tags associated with the specified
     *         tags.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeTagsRequest withFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;

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
        sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    