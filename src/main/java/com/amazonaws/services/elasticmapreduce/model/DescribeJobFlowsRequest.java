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

    /**
     * A date specifying that descriptions of job flows created after this
     * date should be returned.
     */
    private java.util.Date createdAfter;

    /**
     * A date specifying that descriptions of job flows created before this
     * date should be returned.
     */
    private java.util.Date createdBefore;

    /**
     * A list of job flow IDs used to specify which job flow descriptions
     * should be returned.
     */
    private java.util.List<String> jobFlowIds;

    /**
     * <p/>
     */
    private java.util.List<String> jobFlowStates;

    /**
     * A date specifying that descriptions of job flows created after this
     * date should be returned.
     *
     * @return A date specifying that descriptions of job flows created after this
     *         date should be returned.
     */
    public java.util.Date getCreatedAfter() {
        return createdAfter;
    }
    
    /**
     * A date specifying that descriptions of job flows created after this
     * date should be returned.
     *
     * @param createdAfter A date specifying that descriptions of job flows created after this
     *         date should be returned.
     */
    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }
    
    /**
     * A date specifying that descriptions of job flows created after this
     * date should be returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAfter A date specifying that descriptions of job flows created after this
     *         date should be returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeJobFlowsRequest withCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
        return this;
    }
    
    
    /**
     * A date specifying that descriptions of job flows created before this
     * date should be returned.
     *
     * @return A date specifying that descriptions of job flows created before this
     *         date should be returned.
     */
    public java.util.Date getCreatedBefore() {
        return createdBefore;
    }
    
    /**
     * A date specifying that descriptions of job flows created before this
     * date should be returned.
     *
     * @param createdBefore A date specifying that descriptions of job flows created before this
     *         date should be returned.
     */
    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }
    
    /**
     * A date specifying that descriptions of job flows created before this
     * date should be returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdBefore A date specifying that descriptions of job flows created before this
     *         date should be returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeJobFlowsRequest withCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
        return this;
    }
    
    
    /**
     * A list of job flow IDs used to specify which job flow descriptions
     * should be returned.
     *
     * @return A list of job flow IDs used to specify which job flow descriptions
     *         should be returned.
     */
    public java.util.List<String> getJobFlowIds() {
        if (jobFlowIds == null) {
            jobFlowIds = new java.util.ArrayList<String>();
        }
        return jobFlowIds;
    }
    
    /**
     * A list of job flow IDs used to specify which job flow descriptions
     * should be returned.
     *
     * @param jobFlowIds A list of job flow IDs used to specify which job flow descriptions
     *         should be returned.
     */
    public void setJobFlowIds(java.util.Collection<String> jobFlowIds) {
        java.util.List<String> jobFlowIdsCopy = new java.util.ArrayList<String>();
        if (jobFlowIds != null) {
            jobFlowIdsCopy.addAll(jobFlowIds);
        }
        this.jobFlowIds = jobFlowIdsCopy;
    }
    
    /**
     * A list of job flow IDs used to specify which job flow descriptions
     * should be returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowIds A list of job flow IDs used to specify which job flow descriptions
     *         should be returned.
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
     * A list of job flow IDs used to specify which job flow descriptions
     * should be returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowIds A list of job flow IDs used to specify which job flow descriptions
     *         should be returned.
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
     * <p/>
     *
     * @return <p/>
     */
    public java.util.List<String> getJobFlowStates() {
        if (jobFlowStates == null) {
            jobFlowStates = new java.util.ArrayList<String>();
        }
        return jobFlowStates;
    }
    
    /**
     * <p/>
     *
     * @param jobFlowStates <p/>
     */
    public void setJobFlowStates(java.util.Collection<String> jobFlowStates) {
        java.util.List<String> jobFlowStatesCopy = new java.util.ArrayList<String>();
        if (jobFlowStates != null) {
            jobFlowStatesCopy.addAll(jobFlowStates);
        }
        this.jobFlowStates = jobFlowStatesCopy;
    }
    
    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowStates <p/>
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
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowStates <p/>
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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("CreatedAfter: " + createdAfter + ", ");
        sb.append("CreatedBefore: " + createdBefore + ", ");
        sb.append("JobFlowIds: " + jobFlowIds + ", ");
        sb.append("JobFlowStates: " + jobFlowStates + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    