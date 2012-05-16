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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeBundleTasks(DescribeBundleTasksRequest) DescribeBundleTasks operation}.
 * <p>
 * The DescribeBundleTasks operation describes in-progress and recent bundle tasks. Complete and failed tasks are removed from the list a short time
 * after completion. If no bundle ids are given, all bundle tasks are returned.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeBundleTasks(DescribeBundleTasksRequest)
 */
public class DescribeBundleTasksRequest extends AmazonWebServiceRequest {

    /**
     * The list of bundle task IDs to describe.
     */
    private java.util.List<String> bundleIds;

    /**
     * A list of filters used to match properties for BundleTasks. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * The list of bundle task IDs to describe.
     *
     * @return The list of bundle task IDs to describe.
     */
    public java.util.List<String> getBundleIds() {
        
        if (bundleIds == null) {
            bundleIds = new java.util.ArrayList<String>();
        }
        return bundleIds;
    }
    
    /**
     * The list of bundle task IDs to describe.
     *
     * @param bundleIds The list of bundle task IDs to describe.
     */
    public void setBundleIds(java.util.Collection<String> bundleIds) {
        if (bundleIds == null) {
            this.bundleIds = null;
            return;
        }

        java.util.List<String> bundleIdsCopy = new java.util.ArrayList<String>(bundleIds.size());
        bundleIdsCopy.addAll(bundleIds);
        this.bundleIds = bundleIdsCopy;
    }
    
    /**
     * The list of bundle task IDs to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bundleIds The list of bundle task IDs to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeBundleTasksRequest withBundleIds(String... bundleIds) {
        if (getBundleIds() == null) setBundleIds(new java.util.ArrayList<String>(bundleIds.length));
        for (String value : bundleIds) {
            getBundleIds().add(value);
        }
        return this;
    }
    
    /**
     * The list of bundle task IDs to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bundleIds The list of bundle task IDs to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeBundleTasksRequest withBundleIds(java.util.Collection<String> bundleIds) {
        if (bundleIds == null) {
            this.bundleIds = null;
        } else {
            java.util.List<String> bundleIdsCopy = new java.util.ArrayList<String>(bundleIds.size());
            bundleIdsCopy.addAll(bundleIds);
            this.bundleIds = bundleIdsCopy;
        }

        return this;
    }
    
    /**
     * A list of filters used to match properties for BundleTasks. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for BundleTasks. For a
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
     * A list of filters used to match properties for BundleTasks. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for BundleTasks. For a
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
     * A list of filters used to match properties for BundleTasks. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for BundleTasks. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeBundleTasksRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for BundleTasks. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for BundleTasks. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeBundleTasksRequest withFilters(java.util.Collection<Filter> filters) {
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
        if (bundleIds != null) sb.append("BundleIds: " + bundleIds + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBundleIds() == null) ? 0 : getBundleIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeBundleTasksRequest == false) return false;
        DescribeBundleTasksRequest other = (DescribeBundleTasksRequest)obj;
        
        if (other.getBundleIds() == null ^ this.getBundleIds() == null) return false;
        if (other.getBundleIds() != null && other.getBundleIds().equals(this.getBundleIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    