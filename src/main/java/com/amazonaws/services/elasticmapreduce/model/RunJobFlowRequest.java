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
 * <p>
 * Input to the RunJobFlow operation.
 * </p>
 */
public class RunJobFlowRequest extends AmazonWebServiceRequest {

    /**
     * The name of the job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * Specifies the location in Amazon S3 to write the log files of the job
     * flow. If a value is not provided, logs are not created.
     */
    private String logUri;

    /**
     * A JSON string for selecting additional features.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String additionalInfo;

    /**
     * A specification of the number and type of Amazon EC2 instances on
     * which to run the job flow.
     */
    private JobFlowInstancesConfig instances;

    /**
     * A list of steps to be executed by the job flow.
     */
    private java.util.List<StepConfig> steps;

    /**
     * A list of bootstrap actions that will be run before Hadoop is started
     * on the job flow.
     */
    private java.util.List<BootstrapActionConfig> bootstrapActions;

    /**
     * The name of the job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the job flow.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the job flow.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The name of the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RunJobFlowRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * Specifies the location in Amazon S3 to write the log files of the job
     * flow. If a value is not provided, logs are not created.
     *
     * @return Specifies the location in Amazon S3 to write the log files of the job
     *         flow. If a value is not provided, logs are not created.
     */
    public String getLogUri() {
        return logUri;
    }
    
    /**
     * Specifies the location in Amazon S3 to write the log files of the job
     * flow. If a value is not provided, logs are not created.
     *
     * @param logUri Specifies the location in Amazon S3 to write the log files of the job
     *         flow. If a value is not provided, logs are not created.
     */
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }
    
    /**
     * Specifies the location in Amazon S3 to write the log files of the job
     * flow. If a value is not provided, logs are not created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logUri Specifies the location in Amazon S3 to write the log files of the job
     *         flow. If a value is not provided, logs are not created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RunJobFlowRequest withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }
    
    
    /**
     * A JSON string for selecting additional features.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return A JSON string for selecting additional features.
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }
    
    /**
     * A JSON string for selecting additional features.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param additionalInfo A JSON string for selecting additional features.
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    /**
     * A JSON string for selecting additional features.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param additionalInfo A JSON string for selecting additional features.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RunJobFlowRequest withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }
    
    
    /**
     * A specification of the number and type of Amazon EC2 instances on
     * which to run the job flow.
     *
     * @return A specification of the number and type of Amazon EC2 instances on
     *         which to run the job flow.
     */
    public JobFlowInstancesConfig getInstances() {
        return instances;
    }
    
    /**
     * A specification of the number and type of Amazon EC2 instances on
     * which to run the job flow.
     *
     * @param instances A specification of the number and type of Amazon EC2 instances on
     *         which to run the job flow.
     */
    public void setInstances(JobFlowInstancesConfig instances) {
        this.instances = instances;
    }
    
    /**
     * A specification of the number and type of Amazon EC2 instances on
     * which to run the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances A specification of the number and type of Amazon EC2 instances on
     *         which to run the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RunJobFlowRequest withInstances(JobFlowInstancesConfig instances) {
        this.instances = instances;
        return this;
    }
    
    
    /**
     * A list of steps to be executed by the job flow.
     *
     * @return A list of steps to be executed by the job flow.
     */
    public java.util.List<StepConfig> getSteps() {
        if (steps == null) {
            steps = new java.util.ArrayList<StepConfig>();
        }
        return steps;
    }
    
    /**
     * A list of steps to be executed by the job flow.
     *
     * @param steps A list of steps to be executed by the job flow.
     */
    public void setSteps(java.util.Collection<StepConfig> steps) {
        java.util.List<StepConfig> stepsCopy = new java.util.ArrayList<StepConfig>();
        if (steps != null) {
            stepsCopy.addAll(steps);
        }
        this.steps = stepsCopy;
    }
    
    /**
     * A list of steps to be executed by the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps A list of steps to be executed by the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RunJobFlowRequest withSteps(StepConfig... steps) {
        for (StepConfig value : steps) {
            getSteps().add(value);
        }
        return this;
    }
    
    /**
     * A list of steps to be executed by the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps A list of steps to be executed by the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RunJobFlowRequest withSteps(java.util.Collection<StepConfig> steps) {
        java.util.List<StepConfig> stepsCopy = new java.util.ArrayList<StepConfig>();
        if (steps != null) {
            stepsCopy.addAll(steps);
        }
        this.steps = stepsCopy;

        return this;
    }
    
    /**
     * A list of bootstrap actions that will be run before Hadoop is started
     * on the job flow.
     *
     * @return A list of bootstrap actions that will be run before Hadoop is started
     *         on the job flow.
     */
    public java.util.List<BootstrapActionConfig> getBootstrapActions() {
        if (bootstrapActions == null) {
            bootstrapActions = new java.util.ArrayList<BootstrapActionConfig>();
        }
        return bootstrapActions;
    }
    
    /**
     * A list of bootstrap actions that will be run before Hadoop is started
     * on the job flow.
     *
     * @param bootstrapActions A list of bootstrap actions that will be run before Hadoop is started
     *         on the job flow.
     */
    public void setBootstrapActions(java.util.Collection<BootstrapActionConfig> bootstrapActions) {
        java.util.List<BootstrapActionConfig> bootstrapActionsCopy = new java.util.ArrayList<BootstrapActionConfig>();
        if (bootstrapActions != null) {
            bootstrapActionsCopy.addAll(bootstrapActions);
        }
        this.bootstrapActions = bootstrapActionsCopy;
    }
    
    /**
     * A list of bootstrap actions that will be run before Hadoop is started
     * on the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bootstrapActions A list of bootstrap actions that will be run before Hadoop is started
     *         on the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RunJobFlowRequest withBootstrapActions(BootstrapActionConfig... bootstrapActions) {
        for (BootstrapActionConfig value : bootstrapActions) {
            getBootstrapActions().add(value);
        }
        return this;
    }
    
    /**
     * A list of bootstrap actions that will be run before Hadoop is started
     * on the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bootstrapActions A list of bootstrap actions that will be run before Hadoop is started
     *         on the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RunJobFlowRequest withBootstrapActions(java.util.Collection<BootstrapActionConfig> bootstrapActions) {
        java.util.List<BootstrapActionConfig> bootstrapActionsCopy = new java.util.ArrayList<BootstrapActionConfig>();
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
        
        sb.append("Name: " + name + ", ");
        sb.append("LogUri: " + logUri + ", ");
        sb.append("AdditionalInfo: " + additionalInfo + ", ");
        sb.append("Instances: " + instances + ", ");
        sb.append("Steps: " + steps + ", ");
        sb.append("BootstrapActions: " + bootstrapActions + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    