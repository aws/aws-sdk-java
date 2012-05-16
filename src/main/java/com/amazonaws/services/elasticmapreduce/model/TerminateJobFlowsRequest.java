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
package com.amazonaws.services.elasticmapreduce.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#terminateJobFlows(TerminateJobFlowsRequest) TerminateJobFlows operation}.
 * <p>
 * TerminateJobFlows shuts a list of job flows down. When a job flow is shut down, any step not yet completed is canceled and the EC2 instances on which
 * the job flow is running are stopped. Any log files not already saved are uploaded to Amazon S3 if a LogUri was specified when the job flow was
 * created.
 * </p>
 *
 * @see com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#terminateJobFlows(TerminateJobFlowsRequest)
 */
public class TerminateJobFlowsRequest extends AmazonWebServiceRequest {

    /**
     * A list of job flows to be shutdown.
     */
    private java.util.List<String> jobFlowIds;

    /**
     * Default constructor for a new TerminateJobFlowsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public TerminateJobFlowsRequest() {}
    
    /**
     * Constructs a new TerminateJobFlowsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param jobFlowIds A list of job flows to be shutdown.
     */
    public TerminateJobFlowsRequest(java.util.List<String> jobFlowIds) {
        this.jobFlowIds = jobFlowIds;
    }

    
    
    /**
     * A list of job flows to be shutdown.
     *
     * @return A list of job flows to be shutdown.
     */
    public java.util.List<String> getJobFlowIds() {
        
        if (jobFlowIds == null) {
            jobFlowIds = new java.util.ArrayList<String>();
        }
        return jobFlowIds;
    }
    
    /**
     * A list of job flows to be shutdown.
     *
     * @param jobFlowIds A list of job flows to be shutdown.
     */
    public void setJobFlowIds(java.util.Collection<String> jobFlowIds) {
        if (jobFlowIds == null) {
            this.jobFlowIds = null;
            return;
        }

        java.util.List<String> jobFlowIdsCopy = new java.util.ArrayList<String>(jobFlowIds.size());
        jobFlowIdsCopy.addAll(jobFlowIds);
        this.jobFlowIds = jobFlowIdsCopy;
    }
    
    /**
     * A list of job flows to be shutdown.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowIds A list of job flows to be shutdown.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateJobFlowsRequest withJobFlowIds(String... jobFlowIds) {
        if (getJobFlowIds() == null) setJobFlowIds(new java.util.ArrayList<String>(jobFlowIds.length));
        for (String value : jobFlowIds) {
            getJobFlowIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of job flows to be shutdown.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowIds A list of job flows to be shutdown.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public TerminateJobFlowsRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        if (jobFlowIds == null) {
            this.jobFlowIds = null;
        } else {
            java.util.List<String> jobFlowIdsCopy = new java.util.ArrayList<String>(jobFlowIds.size());
            jobFlowIdsCopy.addAll(jobFlowIds);
            this.jobFlowIds = jobFlowIdsCopy;
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
        if (jobFlowIds != null) sb.append("JobFlowIds: " + jobFlowIds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getJobFlowIds() == null) ? 0 : getJobFlowIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof TerminateJobFlowsRequest == false) return false;
        TerminateJobFlowsRequest other = (TerminateJobFlowsRequest)obj;
        
        if (other.getJobFlowIds() == null ^ this.getJobFlowIds() == null) return false;
        if (other.getJobFlowIds() != null && other.getJobFlowIds().equals(this.getJobFlowIds()) == false) return false; 
        return true;
    }
    
}
    