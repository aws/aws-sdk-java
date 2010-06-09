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
 * Container for the parameters to the {@link com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#describeJobFlows(DescribeJobFlowsRequest) DescribeJobFlows operation}.
 * <p>
 * DescribeJobFlows returns a list of job flows that match all of the
 * supplied parameters. The parameters can include a list of job flow
 * IDs, job flow states, and restrictions on job flow creation date and
 * time.
 * </p>
 * <p>
 * Regardless of supplied parameters, only job flows created within the
 * last two months are returned.
 * </p>
 * <p>
 * If no parameters are supplied, then job flows matching either the
 * following criteria are returned:
 * </p>
 * 
 * <ul>
 * <li>Job flows created and completed in the last two weeks.</li>
 * <li> Job flows created within the last two months that are in one of
 * the following states: <code>RUNNING</code> ,
 * 
 * <code>WAITING</code> ,
 * 
 * <code>SHUTTING_DOWN</code> ,
 * 
 * <code>STARTING</code> .
 * </li>
 * 
 * </ul>
 * <p>
 * Amazon Elastic MapReduce can return a maximum of 512 job flow
 * descriptions.
 * </p>
 *
 * @see com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#describeJobFlows(DescribeJobFlowsRequest)
 */
public class DescribeJobFlowsRequest extends AmazonWebServiceRequest {

    /**
     * Return only job flows created after this date and time.
     */
    private java.util.Date createdAfter;

    /**
     * Return only job flows created before this date and time.
     */
    private java.util.Date createdBefore;

    /**
     * Return only job flows whose job flow ID is contained in this list.
     */
    private java.util.List<String> jobFlowIds;

    /**
     * Return only job flows whose state is contained in this list.
     */
    private java.util.List<String> jobFlowStates;

    /**
     * Return only job flows created after this date and time.
     *
     * @return Return only job flows created after this date and time.
     */
    public java.util.Date getCreatedAfter() {
        return createdAfter;
    }
    
    /**
     * Return only job flows created after this date and time.
     *
     * @param createdAfter Return only job flows created after this date and time.
     */
    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }
    
    /**
     * Return only job flows created after this date and time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdAfter Return only job flows created after this date and time.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeJobFlowsRequest withCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
        return this;
    }
    
    
    /**
     * Return only job flows created before this date and time.
     *
     * @return Return only job flows created before this date and time.
     */
    public java.util.Date getCreatedBefore() {
        return createdBefore;
    }
    
    /**
     * Return only job flows created before this date and time.
     *
     * @param createdBefore Return only job flows created before this date and time.
     */
    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }
    
    /**
     * Return only job flows created before this date and time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdBefore Return only job flows created before this date and time.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeJobFlowsRequest withCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
        return this;
    }
    
    
    /**
     * Return only job flows whose job flow ID is contained in this list.
     *
     * @return Return only job flows whose job flow ID is contained in this list.
     */
    public java.util.List<String> getJobFlowIds() {
        if (jobFlowIds == null) {
            jobFlowIds = new java.util.ArrayList<String>();
        }
        return jobFlowIds;
    }
    
    /**
     * Return only job flows whose job flow ID is contained in this list.
     *
     * @param jobFlowIds Return only job flows whose job flow ID is contained in this list.
     */
    public void setJobFlowIds(java.util.Collection<String> jobFlowIds) {
        java.util.List<String> jobFlowIdsCopy = new java.util.ArrayList<String>();
        if (jobFlowIds != null) {
            jobFlowIdsCopy.addAll(jobFlowIds);
        }
        this.jobFlowIds = jobFlowIdsCopy;
    }
    
    /**
     * Return only job flows whose job flow ID is contained in this list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowIds Return only job flows whose job flow ID is contained in this list.
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
     * Return only job flows whose job flow ID is contained in this list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowIds Return only job flows whose job flow ID is contained in this list.
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
     * Return only job flows whose state is contained in this list.
     *
     * @return Return only job flows whose state is contained in this list.
     */
    public java.util.List<String> getJobFlowStates() {
        if (jobFlowStates == null) {
            jobFlowStates = new java.util.ArrayList<String>();
        }
        return jobFlowStates;
    }
    
    /**
     * Return only job flows whose state is contained in this list.
     *
     * @param jobFlowStates Return only job flows whose state is contained in this list.
     */
    public void setJobFlowStates(java.util.Collection<String> jobFlowStates) {
        java.util.List<String> jobFlowStatesCopy = new java.util.ArrayList<String>();
        if (jobFlowStates != null) {
            jobFlowStatesCopy.addAll(jobFlowStates);
        }
        this.jobFlowStates = jobFlowStatesCopy;
    }
    
    /**
     * Return only job flows whose state is contained in this list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowStates Return only job flows whose state is contained in this list.
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
     * Return only job flows whose state is contained in this list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowStates Return only job flows whose state is contained in this list.
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
        
        sb.append("CreatedAfter: " + createdAfter + ", ");
        sb.append("CreatedBefore: " + createdBefore + ", ");
        sb.append("JobFlowIds: " + jobFlowIds + ", ");
        sb.append("JobFlowStates: " + jobFlowStates + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    