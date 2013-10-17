/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;


/**
 * <p>
 * The output for the DescribeJobFlows operation.
 * </p>
 */
public class DescribeJobFlowsResult implements Serializable {

    /**
     * A list of job flows matching the parameters supplied.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<JobFlowDetail> jobFlows;

    /**
     * A list of job flows matching the parameters supplied.
     *
     * @return A list of job flows matching the parameters supplied.
     */
    public java.util.List<JobFlowDetail> getJobFlows() {
        if (jobFlows == null) {
              jobFlows = new com.amazonaws.internal.ListWithAutoConstructFlag<JobFlowDetail>();
              jobFlows.setAutoConstruct(true);
        }
        return jobFlows;
    }
    
    /**
     * A list of job flows matching the parameters supplied.
     *
     * @param jobFlows A list of job flows matching the parameters supplied.
     */
    public void setJobFlows(java.util.Collection<JobFlowDetail> jobFlows) {
        if (jobFlows == null) {
            this.jobFlows = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<JobFlowDetail> jobFlowsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<JobFlowDetail>(jobFlows.size());
        jobFlowsCopy.addAll(jobFlows);
        this.jobFlows = jobFlowsCopy;
    }
    
    /**
     * A list of job flows matching the parameters supplied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlows A list of job flows matching the parameters supplied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobFlowsResult withJobFlows(JobFlowDetail... jobFlows) {
        if (getJobFlows() == null) setJobFlows(new java.util.ArrayList<JobFlowDetail>(jobFlows.length));
        for (JobFlowDetail value : jobFlows) {
            getJobFlows().add(value);
        }
        return this;
    }
    
    /**
     * A list of job flows matching the parameters supplied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlows A list of job flows matching the parameters supplied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobFlowsResult withJobFlows(java.util.Collection<JobFlowDetail> jobFlows) {
        if (jobFlows == null) {
            this.jobFlows = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<JobFlowDetail> jobFlowsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<JobFlowDetail>(jobFlows.size());
            jobFlowsCopy.addAll(jobFlows);
            this.jobFlows = jobFlowsCopy;
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
        if (getJobFlows() != null) sb.append("JobFlows: " + getJobFlows() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getJobFlows() == null) ? 0 : getJobFlows().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeJobFlowsResult == false) return false;
        DescribeJobFlowsResult other = (DescribeJobFlowsResult)obj;
        
        if (other.getJobFlows() == null ^ this.getJobFlows() == null) return false;
        if (other.getJobFlows() != null && other.getJobFlows().equals(this.getJobFlows()) == false) return false; 
        return true;
    }
    
}
    