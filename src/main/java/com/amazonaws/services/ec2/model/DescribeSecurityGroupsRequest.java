/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSecurityGroups(DescribeSecurityGroupsRequest) DescribeSecurityGroups operation}.
 * <p>
 * The DescribeSecurityGroups operation returns information about
 * security groups that you own.
 * </p>
 * <p>
 * If you specify security group names, information about those security
 * group is returned. Otherwise, information for all security group is
 * returned. If you specify a group that does not exist, a fault is
 * returned.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSecurityGroups(DescribeSecurityGroupsRequest)
 */
public class DescribeSecurityGroupsRequest extends AmazonWebServiceRequest {

    /**
     * The optional list of Amazon EC2 security groups to describe.
     */
    private java.util.List<String> groupNames;

    private java.util.List<String> groupIds;

    /**
     * A list of filters used to match properties for SecurityGroups. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * The optional list of Amazon EC2 security groups to describe.
     *
     * @return The optional list of Amazon EC2 security groups to describe.
     */
    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
            groupNames = new java.util.ArrayList<String>();
        }
        return groupNames;
    }
    
    /**
     * The optional list of Amazon EC2 security groups to describe.
     *
     * @param groupNames The optional list of Amazon EC2 security groups to describe.
     */
    public void setGroupNames(java.util.Collection<String> groupNames) {
        java.util.List<String> groupNamesCopy = new java.util.ArrayList<String>();
        if (groupNames != null) {
            groupNamesCopy.addAll(groupNames);
        }
        this.groupNames = groupNamesCopy;
    }
    
    /**
     * The optional list of Amazon EC2 security groups to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames The optional list of Amazon EC2 security groups to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSecurityGroupsRequest withGroupNames(String... groupNames) {
        for (String value : groupNames) {
            getGroupNames().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of Amazon EC2 security groups to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupNames The optional list of Amazon EC2 security groups to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSecurityGroupsRequest withGroupNames(java.util.Collection<String> groupNames) {
        java.util.List<String> groupNamesCopy = new java.util.ArrayList<String>();
        if (groupNames != null) {
            groupNamesCopy.addAll(groupNames);
        }
        this.groupNames = groupNamesCopy;

        return this;
    }
    
    /**
     * Returns the value of the GroupIds property for this object.
     *
     * @return The value of the GroupIds property for this object.
     */
    public java.util.List<String> getGroupIds() {
        if (groupIds == null) {
            groupIds = new java.util.ArrayList<String>();
        }
        return groupIds;
    }
    
    /**
     * Sets the value of the GroupIds property for this object.
     *
     * @param groupIds The new value for the GroupIds property for this object.
     */
    public void setGroupIds(java.util.Collection<String> groupIds) {
        java.util.List<String> groupIdsCopy = new java.util.ArrayList<String>();
        if (groupIds != null) {
            groupIdsCopy.addAll(groupIds);
        }
        this.groupIds = groupIdsCopy;
    }
    
    /**
     * Sets the value of the GroupIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupIds The new value for the GroupIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSecurityGroupsRequest withGroupIds(String... groupIds) {
        for (String value : groupIds) {
            getGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the GroupIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groupIds The new value for the GroupIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSecurityGroupsRequest withGroupIds(java.util.Collection<String> groupIds) {
        java.util.List<String> groupIdsCopy = new java.util.ArrayList<String>();
        if (groupIds != null) {
            groupIdsCopy.addAll(groupIds);
        }
        this.groupIds = groupIdsCopy;

        return this;
    }
    
    /**
     * A list of filters used to match properties for SecurityGroups. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for SecurityGroups. For a
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
     * A list of filters used to match properties for SecurityGroups. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for SecurityGroups. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;
    }
    
    /**
     * A list of filters used to match properties for SecurityGroups. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for SecurityGroups. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSecurityGroupsRequest withFilters(Filter... filters) {
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for SecurityGroups. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for SecurityGroups. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSecurityGroupsRequest withFilters(java.util.Collection<Filter> filters) {
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
        sb.append("GroupNames: " + groupNames + ", ");
        sb.append("GroupIds: " + groupIds + ", ");
        sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    