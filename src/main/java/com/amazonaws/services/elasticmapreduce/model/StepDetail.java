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
 * Step Detail
 */
public class StepDetail {
        
    private StepConfig stepConfig;

    private StepExecutionStatusDetail executionStatusDetail;

    /**
     * Returns the value of the StepConfig property for this object.
     *
     * @return The value of the StepConfig property for this object.
     */
    public StepConfig getStepConfig() {
        return stepConfig;
    }
    
    /**
     * Sets the value of the StepConfig property for this object.
     *
     * @param stepConfig The new value for the StepConfig property for this object.
     */
    public void setStepConfig(StepConfig stepConfig) {
        this.stepConfig = stepConfig;
    }
    
    /**
     * Sets the value of the StepConfig property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stepConfig The new value for the StepConfig property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepDetail withStepConfig(StepConfig stepConfig) {
        this.stepConfig = stepConfig;
        return this;
    }
    
    
    /**
     * Returns the value of the ExecutionStatusDetail property for this
     * object.
     *
     * @return The value of the ExecutionStatusDetail property for this object.
     */
    public StepExecutionStatusDetail getExecutionStatusDetail() {
        return executionStatusDetail;
    }
    
    /**
     * Sets the value of the ExecutionStatusDetail property for this object.
     *
     * @param executionStatusDetail The new value for the ExecutionStatusDetail property for this object.
     */
    public void setExecutionStatusDetail(StepExecutionStatusDetail executionStatusDetail) {
        this.executionStatusDetail = executionStatusDetail;
    }
    
    /**
     * Sets the value of the ExecutionStatusDetail property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionStatusDetail The new value for the ExecutionStatusDetail property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepDetail withExecutionStatusDetail(StepExecutionStatusDetail executionStatusDetail) {
        this.executionStatusDetail = executionStatusDetail;
        return this;
    }
    
    
}
    