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
 * Combines the execution state and configuration of a step.
 * </p>
 */
public class StepDetail {

    /**
     * The step configuration.
     */
    private StepConfig stepConfig;

    /**
     * The description of the step status.
     */
    private StepExecutionStatusDetail executionStatusDetail;

    /**
     * Default constructor for a new StepDetail object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public StepDetail() {}
    
    /**
     * Constructs a new StepDetail object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param stepConfig The step configuration.
     * @param executionStatusDetail The description of the step status.
     */
    public StepDetail(StepConfig stepConfig, StepExecutionStatusDetail executionStatusDetail) {
        this.stepConfig = stepConfig;
        this.executionStatusDetail = executionStatusDetail;
    }
    
    /**
     * The step configuration.
     *
     * @return The step configuration.
     */
    public StepConfig getStepConfig() {
        return stepConfig;
    }
    
    /**
     * The step configuration.
     *
     * @param stepConfig The step configuration.
     */
    public void setStepConfig(StepConfig stepConfig) {
        this.stepConfig = stepConfig;
    }
    
    /**
     * The step configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stepConfig The step configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepDetail withStepConfig(StepConfig stepConfig) {
        this.stepConfig = stepConfig;
        return this;
    }
    
    
    /**
     * The description of the step status.
     *
     * @return The description of the step status.
     */
    public StepExecutionStatusDetail getExecutionStatusDetail() {
        return executionStatusDetail;
    }
    
    /**
     * The description of the step status.
     *
     * @param executionStatusDetail The description of the step status.
     */
    public void setExecutionStatusDetail(StepExecutionStatusDetail executionStatusDetail) {
        this.executionStatusDetail = executionStatusDetail;
    }
    
    /**
     * The description of the step status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionStatusDetail The description of the step status.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepDetail withExecutionStatusDetail(StepExecutionStatusDetail executionStatusDetail) {
        this.executionStatusDetail = executionStatusDetail;
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
        sb.append("StepConfig: " + stepConfig + ", ");
        sb.append("ExecutionStatusDetail: " + executionStatusDetail + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    