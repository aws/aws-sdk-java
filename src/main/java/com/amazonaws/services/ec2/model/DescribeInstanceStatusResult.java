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

/**
 * Describe Instance Status Result
 */
public class DescribeInstanceStatusResult {

    /**
     * Collection of instance statuses describing the state of the requested
     * instances.
     */
    private java.util.List<InstanceStatus> instanceStatuses;

    /**
     * A string specifying the next paginated set of results to return.
     */
    private String nextToken;

    /**
     * Collection of instance statuses describing the state of the requested
     * instances.
     *
     * @return Collection of instance statuses describing the state of the requested
     *         instances.
     */
    public java.util.List<InstanceStatus> getInstanceStatuses() {
        
        if (instanceStatuses == null) {
            instanceStatuses = new java.util.ArrayList<InstanceStatus>();
        }
        return instanceStatuses;
    }
    
    /**
     * Collection of instance statuses describing the state of the requested
     * instances.
     *
     * @param instanceStatuses Collection of instance statuses describing the state of the requested
     *         instances.
     */
    public void setInstanceStatuses(java.util.Collection<InstanceStatus> instanceStatuses) {
        java.util.List<InstanceStatus> instanceStatusesCopy = new java.util.ArrayList<InstanceStatus>();
        if (instanceStatuses != null) {
            instanceStatusesCopy.addAll(instanceStatuses);
        }
        this.instanceStatuses = instanceStatusesCopy;
    }
    
    /**
     * Collection of instance statuses describing the state of the requested
     * instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceStatuses Collection of instance statuses describing the state of the requested
     *         instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstanceStatusResult withInstanceStatuses(InstanceStatus... instanceStatuses) {
        if (getInstanceStatuses() == null) setInstanceStatuses(new java.util.ArrayList<InstanceStatus>());
        for (InstanceStatus value : instanceStatuses) {
            getInstanceStatuses().add(value);
        }
        return this;
    }
    
    /**
     * Collection of instance statuses describing the state of the requested
     * instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceStatuses Collection of instance statuses describing the state of the requested
     *         instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstanceStatusResult withInstanceStatuses(java.util.Collection<InstanceStatus> instanceStatuses) {
        java.util.List<InstanceStatus> instanceStatusesCopy = new java.util.ArrayList<InstanceStatus>();
        if (instanceStatuses != null) {
            instanceStatusesCopy.addAll(instanceStatuses);
        }
        this.instanceStatuses = instanceStatusesCopy;

        return this;
    }
    
    /**
     * A string specifying the next paginated set of results to return.
     *
     * @return A string specifying the next paginated set of results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string specifying the next paginated set of results to return.
     *
     * @param nextToken A string specifying the next paginated set of results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string specifying the next paginated set of results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A string specifying the next paginated set of results to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstanceStatusResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        sb.append("InstanceStatuses: " + instanceStatuses + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    