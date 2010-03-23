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

/**
 * Describe Job Flows Result
 */
public class DescribeJobFlowsResult {
        
    private java.util.List<JobFlowDetail> jobFlows;

    /**
     * Returns the value of the JobFlows property for this object.
     *
     * @return The value of the JobFlows property for this object.
     */
    public java.util.List<JobFlowDetail> getJobFlows() {
        if (jobFlows == null) {
            jobFlows = new java.util.ArrayList<JobFlowDetail>();
        }
        return jobFlows;
    }
    
    /**
     * Sets the value of the JobFlows property for this object.
     *
     * @param jobFlows The new value for the JobFlows property for this object.
     */
    public void setJobFlows(java.util.Collection<JobFlowDetail> jobFlows) {
        java.util.List<JobFlowDetail> jobFlowsCopy = new java.util.ArrayList<JobFlowDetail>();
        if (jobFlows != null) {
            jobFlowsCopy.addAll(jobFlows);
        }
        this.jobFlows = jobFlowsCopy;
    }
    
    /**
     * Sets the value of the JobFlows property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlows The new value for the JobFlows property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeJobFlowsResult withJobFlows(JobFlowDetail... jobFlows) {
        for (JobFlowDetail value : jobFlows) {
            getJobFlows().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the JobFlows property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlows The new value for the JobFlows property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeJobFlowsResult withJobFlows(java.util.Collection<JobFlowDetail> jobFlows) {
        java.util.List<JobFlowDetail> jobFlowsCopy = new java.util.ArrayList<JobFlowDetail>();
        if (jobFlows != null) {
            jobFlowsCopy.addAll(jobFlows);
        }
        this.jobFlows = jobFlowsCopy;

        return this;
    }
    
}
    