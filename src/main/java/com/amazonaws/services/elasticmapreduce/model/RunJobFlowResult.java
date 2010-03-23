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
 * Run Job Flow Result
 */
public class RunJobFlowResult {
        
    private String jobFlowId;

    /**
     * Returns the value of the JobFlowId property for this object.
     *
     * @return The value of the JobFlowId property for this object.
     */
    public String getJobFlowId() {
        return jobFlowId;
    }
    
    /**
     * Sets the value of the JobFlowId property for this object.
     *
     * @param jobFlowId The new value for the JobFlowId property for this object.
     */
    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }
    
    /**
     * Sets the value of the JobFlowId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowId The new value for the JobFlowId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RunJobFlowResult withJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
        return this;
    }
    
    
}
    