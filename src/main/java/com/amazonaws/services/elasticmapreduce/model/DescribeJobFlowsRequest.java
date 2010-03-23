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
package com.amazonaws.services.elasticmapreduce.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Describe Job Flows Request
 */
public class DescribeJobFlowsRequest extends AmazonWebServiceRequest {
        
    private java.util.Date createdAfter;

    private java.util.Date createdBefore;

    private java.util.List<String> jobFlowIds;

    private java.util.List<String> jobFlowStates;

    /**
     * Returns the value of the CreatedAfter property for this object.
     *
     * @return The value of the CreatedAfter property for this object.
     */
    public java.util.Date getCreatedAfter() {
        return createdAfter;
    }
    
    /**
     * Sets the value of the CreatedAfter property for this object.
     *
     * @param createdAfter The new value for the CreatedAfter property for this object.
     */
    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }
    
    /**
     * Sets the value of the CreatedAfter property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAfter The new value for the CreatedAfter property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeJobFlowsRequest withCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
        return this;
    }
    
    
    /**
     * Returns the value of the CreatedBefore property for this object.
     *
     * @return The value of the CreatedBefore property for this object.
     */
    public java.util.Date getCreatedBefore() {
        return createdBefore;
    }
    
    /**
     * Sets the value of the CreatedBefore property for this object.
     *
     * @param createdBefore The new value for the CreatedBefore property for this object.
     */
    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }
    
    /**
     * Sets the value of the CreatedBefore property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdBefore The new value for the CreatedBefore property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeJobFlowsRequest withCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
        return this;
    }
    
    
    /**
     * Returns the value of the JobFlowIds property for this object.
     *
     * @return The value of the JobFlowIds property for this object.
     */
    public java.util.List<String> getJobFlowIds() {
        if (jobFlowIds == null) {
            jobFlowIds = new java.util.ArrayList<String>();
        }
        return jobFlowIds;
    }
    
    /**
     * Sets the value of the JobFlowIds property for this object.
     *
     * @param jobFlowIds The new value for the JobFlowIds property for this object.
     */
    public void setJobFlowIds(java.util.Collection<String> jobFlowIds) {
        java.util.List<String> jobFlowIdsCopy = new java.util.ArrayList<String>();
        if (jobFlowIds != null) {
            jobFlowIdsCopy.addAll(jobFlowIds);
        }
        this.jobFlowIds = jobFlowIdsCopy;
    }
    
    /**
     * Sets the value of the JobFlowIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowIds The new value for the JobFlowIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeJobFlowsRequest withJobFlowIds(String... jobFlowIds) {
        for (String value : jobFlowIds) {
            getJobFlowIds().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the JobFlowIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowIds The new value for the JobFlowIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeJobFlowsRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        java.util.List<String> jobFlowIdsCopy = new java.util.ArrayList<String>();
        if (jobFlowIds != null) {
            jobFlowIdsCopy.addAll(jobFlowIds);
        }
        this.jobFlowIds = jobFlowIdsCopy;

        return this;
    }
    
    /**
     * Returns the value of the JobFlowStates property for this object.
     *
     * @return The value of the JobFlowStates property for this object.
     */
    public java.util.List<String> getJobFlowStates() {
        if (jobFlowStates == null) {
            jobFlowStates = new java.util.ArrayList<String>();
        }
        return jobFlowStates;
    }
    
    /**
     * Sets the value of the JobFlowStates property for this object.
     *
     * @param jobFlowStates The new value for the JobFlowStates property for this object.
     */
    public void setJobFlowStates(java.util.Collection<String> jobFlowStates) {
        java.util.List<String> jobFlowStatesCopy = new java.util.ArrayList<String>();
        if (jobFlowStates != null) {
            jobFlowStatesCopy.addAll(jobFlowStates);
        }
        this.jobFlowStates = jobFlowStatesCopy;
    }
    
    /**
     * Sets the value of the JobFlowStates property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowStates The new value for the JobFlowStates property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeJobFlowsRequest withJobFlowStates(String... jobFlowStates) {
        for (String value : jobFlowStates) {
            getJobFlowStates().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the JobFlowStates property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowStates The new value for the JobFlowStates property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeJobFlowsRequest withJobFlowStates(java.util.Collection<String> jobFlowStates) {
        java.util.List<String> jobFlowStatesCopy = new java.util.ArrayList<String>();
        if (jobFlowStates != null) {
            jobFlowStatesCopy.addAll(jobFlowStates);
        }
        this.jobFlowStates = jobFlowStatesCopy;

        return this;
    }
    
}
    