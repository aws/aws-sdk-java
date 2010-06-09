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
 * <p>
 * The result of the RunJobFlow operation.
 * </p>
 */
public class RunJobFlowResult {

    /**
     * An unique identifier for the job flow.
     */
    private String jobFlowId;

    /**
     * An unique identifier for the job flow.
     *
     * @return An unique identifier for the job flow.
     */
    public String getJobFlowId() {
        return jobFlowId;
    }
    
    /**
     * An unique identifier for the job flow.
     *
     * @param jobFlowId An unique identifier for the job flow.
     */
    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }
    
    /**
     * An unique identifier for the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowId An unique identifier for the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RunJobFlowResult withJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
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
        
        sb.append("JobFlowId: " + jobFlowId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    