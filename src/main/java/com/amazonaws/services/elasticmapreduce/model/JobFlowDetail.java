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
 * Job Flow Detail
 */
public class JobFlowDetail {

    private String jobFlowId;

    private String name;

    private String logUri;

    private JobFlowExecutionStatusDetail executionStatusDetail;

    private JobFlowInstancesDetail instances;

    private java.util.List<StepDetail> steps;

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
    public JobFlowDetail withJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
        return this;
    }
    
    
    /**
     * Returns the value of the Name property for this object.
     *
     * @return The value of the Name property for this object.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     *
     * @param name The new value for the Name property for this object.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The new value for the Name property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * Returns the value of the LogUri property for this object.
     *
     * @return The value of the LogUri property for this object.
     */
    public String getLogUri() {
        return logUri;
    }
    
    /**
     * Sets the value of the LogUri property for this object.
     *
     * @param logUri The new value for the LogUri property for this object.
     */
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }
    
    /**
     * Sets the value of the LogUri property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logUri The new value for the LogUri property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }
    
    
    /**
     * Returns the value of the ExecutionStatusDetail property for this
     * object.
     *
     * @return The value of the ExecutionStatusDetail property for this object.
     */
    public JobFlowExecutionStatusDetail getExecutionStatusDetail() {
        return executionStatusDetail;
    }
    
    /**
     * Sets the value of the ExecutionStatusDetail property for this object.
     *
     * @param executionStatusDetail The new value for the ExecutionStatusDetail property for this object.
     */
    public void setExecutionStatusDetail(JobFlowExecutionStatusDetail executionStatusDetail) {
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
    public JobFlowDetail withExecutionStatusDetail(JobFlowExecutionStatusDetail executionStatusDetail) {
        this.executionStatusDetail = executionStatusDetail;
        return this;
    }
    
    
    /**
     * Returns the value of the Instances property for this object.
     *
     * @return The value of the Instances property for this object.
     */
    public JobFlowInstancesDetail getInstances() {
        return instances;
    }
    
    /**
     * Sets the value of the Instances property for this object.
     *
     * @param instances The new value for the Instances property for this object.
     */
    public void setInstances(JobFlowInstancesDetail instances) {
        this.instances = instances;
    }
    
    /**
     * Sets the value of the Instances property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances The new value for the Instances property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withInstances(JobFlowInstancesDetail instances) {
        this.instances = instances;
        return this;
    }
    
    
    /**
     * Returns the value of the Steps property for this object.
     *
     * @return The value of the Steps property for this object.
     */
    public java.util.List<StepDetail> getSteps() {
        if (steps == null) {
            steps = new java.util.ArrayList<StepDetail>();
        }
        return steps;
    }
    
    /**
     * Sets the value of the Steps property for this object.
     *
     * @param steps The new value for the Steps property for this object.
     */
    public void setSteps(java.util.Collection<StepDetail> steps) {
        java.util.List<StepDetail> stepsCopy = new java.util.ArrayList<StepDetail>();
        if (steps != null) {
            stepsCopy.addAll(steps);
        }
        this.steps = stepsCopy;
    }
    
    /**
     * Sets the value of the Steps property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps The new value for the Steps property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withSteps(StepDetail... steps) {
        for (StepDetail value : steps) {
            getSteps().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Steps property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps The new value for the Steps property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withSteps(java.util.Collection<StepDetail> steps) {
        java.util.List<StepDetail> stepsCopy = new java.util.ArrayList<StepDetail>();
        if (steps != null) {
            stepsCopy.addAll(steps);
        }
        this.steps = stepsCopy;

        return this;
    }
    
}
    