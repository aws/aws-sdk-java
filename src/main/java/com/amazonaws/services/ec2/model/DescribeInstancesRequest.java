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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeInstances(DescribeInstancesRequest) DescribeInstances operation}.
 * <p>
 * The DescribeInstances operation returns information about instances that you own.
 * </p>
 * <p>
 * If you specify one or more instance IDs, Amazon EC2 returns information for those instances. If you do not specify instance IDs, Amazon EC2 returns
 * information for all relevant instances. If you specify an invalid instance ID, a fault is returned. If you specify an instance that you do not own, it
 * will not be included in the returned results.
 * </p>
 * <p>
 * Recently terminated instances might appear in the returned results. This interval is usually less than one hour.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeInstances(DescribeInstancesRequest)
 */
public class DescribeInstancesRequest extends AmazonWebServiceRequest {

    /**
     * An optional list of the instances to describe.
     */
    private java.util.List<String> instanceIds;

    /**
     * A list of filters used to match properties for Instances. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * Reference/index.html?ApiReference-query-DescribeInstances.html">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * An optional list of the instances to describe.
     *
     * @return An optional list of the instances to describe.
     */
    public java.util.List<String> getInstanceIds() {
        
        if (instanceIds == null) {
            instanceIds = new java.util.ArrayList<String>();
        }
        return instanceIds;
    }
    
    /**
     * An optional list of the instances to describe.
     *
     * @param instanceIds An optional list of the instances to describe.
     */
    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        java.util.List<String> instanceIdsCopy = new java.util.ArrayList<String>(instanceIds.size());
        instanceIdsCopy.addAll(instanceIds);
        this.instanceIds = instanceIdsCopy;
    }
    
    /**
     * An optional list of the instances to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds An optional list of the instances to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstancesRequest withInstanceIds(String... instanceIds) {
        if (getInstanceIds() == null) setInstanceIds(new java.util.ArrayList<String>(instanceIds.length));
        for (String value : instanceIds) {
            getInstanceIds().add(value);
        }
        return this;
    }
    
    /**
     * An optional list of the instances to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceIds An optional list of the instances to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
        } else {
            java.util.List<String> instanceIdsCopy = new java.util.ArrayList<String>(instanceIds.size());
            instanceIdsCopy.addAll(instanceIds);
            this.instanceIds = instanceIdsCopy;
        }

        return this;
    }
    
    /**
     * A list of filters used to match properties for Instances. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * Reference/index.html?ApiReference-query-DescribeInstances.html">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Instances. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         Reference/index.html?ApiReference-query-DescribeInstances.html">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for Instances. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * Reference/index.html?ApiReference-query-DescribeInstances.html">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Instances. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         Reference/index.html?ApiReference-query-DescribeInstances.html">Amazon
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
     * A list of filters used to match properties for Instances. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * Reference/index.html?ApiReference-query-DescribeInstances.html">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Instances. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         Reference/index.html?ApiReference-query-DescribeInstances.html">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstancesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for Instances. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * Reference/index.html?ApiReference-query-DescribeInstances.html">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Instances. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         Reference/index.html?ApiReference-query-DescribeInstances.html">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstancesRequest withFilters(java.util.Collection<Filter> filters) {
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
        if (instanceIds != null) sb.append("InstanceIds: " + instanceIds + ", ");
        if (filters != null) sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeInstancesRequest == false) return false;
        DescribeInstancesRequest other = (DescribeInstancesRequest)obj;
        
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null) return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    