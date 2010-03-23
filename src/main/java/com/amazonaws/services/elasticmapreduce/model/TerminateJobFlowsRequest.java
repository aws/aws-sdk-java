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
 * Terminate Job Flows Request
 */
public class TerminateJobFlowsRequest extends AmazonWebServiceRequest {
        
    private java.util.List<String> jobFlowIds;

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
    public TerminateJobFlowsRequest withJobFlowIds(String... jobFlowIds) {
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
    public TerminateJobFlowsRequest withJobFlowIds(java.util.Collection<String> jobFlowIds) {
        java.util.List<String> jobFlowIdsCopy = new java.util.ArrayList<String>();
        if (jobFlowIds != null) {
            jobFlowIdsCopy.addAll(jobFlowIds);
        }
        this.jobFlowIds = jobFlowIdsCopy;

        return this;
    }
    
}
    