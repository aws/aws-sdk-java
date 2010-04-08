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
 * 
 */
public class JobFlowDetail {

    /**
     * An ID that uniquely identifies the job flow.
     */
    private String jobFlowId;

    /**
     * The name of the job flow.
     */
    private String name;

    /**
     * The URI for the location of the log files on Amazon S3.
     */
    private String logUri;

    /**
     * A container for the execution status description of the job flow.
     */
    private JobFlowExecutionStatusDetail executionStatusDetail;

    /**
     * A container for the instances detail of the job flow.
     */
    private JobFlowInstancesDetail instances;

    /**
     * A list of <a>Step</a> instances applied to data in the job flow.
     */
    private java.util.List<StepDetail> steps;

    private java.util.List<BootstrapActionDetail> bootstrapActions;

    /**
     * An ID that uniquely identifies the job flow.
     *
     * @return An ID that uniquely identifies the job flow.
     */
    public String getJobFlowId() {
        return jobFlowId;
    }
    
    /**
     * An ID that uniquely identifies the job flow.
     *
     * @param jobFlowId An ID that uniquely identifies the job flow.
     */
    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }
    
    /**
     * An ID that uniquely identifies the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobFlowId An ID that uniquely identifies the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
        return this;
    }
    
    
    /**
     * The name of the job flow.
     *
     * @return The name of the job flow.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the job flow.
     *
     * @param name The name of the job flow.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * The URI for the location of the log files on Amazon S3.
     *
     * @return The URI for the location of the log files on Amazon S3.
     */
    public String getLogUri() {
        return logUri;
    }
    
    /**
     * The URI for the location of the log files on Amazon S3.
     *
     * @param logUri The URI for the location of the log files on Amazon S3.
     */
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }
    
    /**
     * The URI for the location of the log files on Amazon S3.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logUri The URI for the location of the log files on Amazon S3.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }
    
    
    /**
     * A container for the execution status description of the job flow.
     *
     * @return A container for the execution status description of the job flow.
     */
    public JobFlowExecutionStatusDetail getExecutionStatusDetail() {
        return executionStatusDetail;
    }
    
    /**
     * A container for the execution status description of the job flow.
     *
     * @param executionStatusDetail A container for the execution status description of the job flow.
     */
    public void setExecutionStatusDetail(JobFlowExecutionStatusDetail executionStatusDetail) {
        this.executionStatusDetail = executionStatusDetail;
    }
    
    /**
     * A container for the execution status description of the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param executionStatusDetail A container for the execution status description of the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withExecutionStatusDetail(JobFlowExecutionStatusDetail executionStatusDetail) {
        this.executionStatusDetail = executionStatusDetail;
        return this;
    }
    
    
    /**
     * A container for the instances detail of the job flow.
     *
     * @return A container for the instances detail of the job flow.
     */
    public JobFlowInstancesDetail getInstances() {
        return instances;
    }
    
    /**
     * A container for the instances detail of the job flow.
     *
     * @param instances A container for the instances detail of the job flow.
     */
    public void setInstances(JobFlowInstancesDetail instances) {
        this.instances = instances;
    }
    
    /**
     * A container for the instances detail of the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances A container for the instances detail of the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withInstances(JobFlowInstancesDetail instances) {
        this.instances = instances;
        return this;
    }
    
    
    /**
     * A list of <a>Step</a> instances applied to data in the job flow.
     *
     * @return A list of <a>Step</a> instances applied to data in the job flow.
     */
    public java.util.List<StepDetail> getSteps() {
        if (steps == null) {
            steps = new java.util.ArrayList<StepDetail>();
        }
        return steps;
    }
    
    /**
     * A list of <a>Step</a> instances applied to data in the job flow.
     *
     * @param steps A list of <a>Step</a> instances applied to data in the job flow.
     */
    public void setSteps(java.util.Collection<StepDetail> steps) {
        java.util.List<StepDetail> stepsCopy = new java.util.ArrayList<StepDetail>();
        if (steps != null) {
            stepsCopy.addAll(steps);
        }
        this.steps = stepsCopy;
    }
    
    /**
     * A list of <a>Step</a> instances applied to data in the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps A list of <a>Step</a> instances applied to data in the job flow.
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
     * A list of <a>Step</a> instances applied to data in the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps A list of <a>Step</a> instances applied to data in the job flow.
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
    
    /**
     * Returns the value of the BootstrapActions property for this object.
     *
     * @return The value of the BootstrapActions property for this object.
     */
    public java.util.List<BootstrapActionDetail> getBootstrapActions() {
        if (bootstrapActions == null) {
            bootstrapActions = new java.util.ArrayList<BootstrapActionDetail>();
        }
        return bootstrapActions;
    }
    
    /**
     * Sets the value of the BootstrapActions property for this object.
     *
     * @param bootstrapActions The new value for the BootstrapActions property for this object.
     */
    public void setBootstrapActions(java.util.Collection<BootstrapActionDetail> bootstrapActions) {
        java.util.List<BootstrapActionDetail> bootstrapActionsCopy = new java.util.ArrayList<BootstrapActionDetail>();
        if (bootstrapActions != null) {
            bootstrapActionsCopy.addAll(bootstrapActions);
        }
        this.bootstrapActions = bootstrapActionsCopy;
    }
    
    /**
     * Sets the value of the BootstrapActions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bootstrapActions The new value for the BootstrapActions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withBootstrapActions(BootstrapActionDetail... bootstrapActions) {
        for (BootstrapActionDetail value : bootstrapActions) {
            getBootstrapActions().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the BootstrapActions property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bootstrapActions The new value for the BootstrapActions property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public JobFlowDetail withBootstrapActions(java.util.Collection<BootstrapActionDetail> bootstrapActions) {
        java.util.List<BootstrapActionDetail> bootstrapActionsCopy = new java.util.ArrayList<BootstrapActionDetail>();
        if (bootstrapActions != null) {
            bootstrapActionsCopy.addAll(bootstrapActions);
        }
        this.bootstrapActions = bootstrapActionsCopy;

        return this;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("JobFlowId: " + jobFlowId + ", ");
        sb.append("Name: " + name + ", ");
        sb.append("LogUri: " + logUri + ", ");
        sb.append("ExecutionStatusDetail: " + executionStatusDetail + ", ");
        sb.append("Instances: " + instances + ", ");
        sb.append("Steps: " + steps + ", ");
        sb.append("BootstrapActions: " + bootstrapActions + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    