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
 * Run Job Flow Request
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
     * The URI for the log files. If a value is not provided, logs are not
     * generated.
     */
    private String logUri;

    private String additionalInfo;

    /**
     * <p/>
     */
    private JobFlowInstancesConfig instances;

    /**
     * A list of <a>Step</a> instances containing information about the steps
     * to be executed.
     */
    private java.util.List<StepConfig> steps;

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
     * The URI for the log files. If a value is not provided, logs are not
     * generated.
     *
     * @return The URI for the log files. If a value is not provided, logs are not
     *         generated.
     */
    public String getLogUri() {
        return logUri;
    }
    
    /**
     * The URI for the log files. If a value is not provided, logs are not
     * generated.
     *
     * @param logUri The URI for the log files. If a value is not provided, logs are not
     *         generated.
     */
    public void setLogUri(String logUri) {
        this.logUri = logUri;
    }
    
    /**
     * The URI for the log files. If a value is not provided, logs are not
     * generated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logUri The URI for the log files. If a value is not provided, logs are not
     *         generated.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RunJobFlowRequest withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }
    
    
    /**
     * Returns the value of the AdditionalInfo property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The value of the AdditionalInfo property for this object.
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }
    
    /**
     * Sets the value of the AdditionalInfo property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param additionalInfo The new value for the AdditionalInfo property for this object.
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    /**
     * Sets the value of the AdditionalInfo property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param additionalInfo The new value for the AdditionalInfo property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RunJobFlowRequest withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }
    
    
    /**
     * <p/>
     *
     * @return <p/>
     */
    public JobFlowInstancesConfig getInstances() {
        return instances;
    }
    
    /**
     * <p/>
     *
     * @param instances <p/>
     */
    public void setInstances(JobFlowInstancesConfig instances) {
        this.instances = instances;
    }
    
    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances <p/>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RunJobFlowRequest withInstances(JobFlowInstancesConfig instances) {
        this.instances = instances;
        return this;
    }
    
    
    /**
     * A list of <a>Step</a> instances containing information about the steps
     * to be executed.
     *
     * @return A list of <a>Step</a> instances containing information about the steps
     *         to be executed.
     */
    public java.util.List<StepConfig> getSteps() {
        if (steps == null) {
            steps = new java.util.ArrayList<StepConfig>();
        }
        return steps;
    }
    
    /**
     * A list of <a>Step</a> instances containing information about the steps
     * to be executed.
     *
     * @param steps A list of <a>Step</a> instances containing information about the steps
     *         to be executed.
     */
    public void setSteps(java.util.Collection<StepConfig> steps) {
        java.util.List<StepConfig> stepsCopy = new java.util.ArrayList<StepConfig>();
        if (steps != null) {
            stepsCopy.addAll(steps);
        }
        this.steps = stepsCopy;
    }
    
    /**
     * A list of <a>Step</a> instances containing information about the steps
     * to be executed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps A list of <a>Step</a> instances containing information about the steps
     *         to be executed.
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
     * A list of <a>Step</a> instances containing information about the steps
     * to be executed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param steps A list of <a>Step</a> instances containing information about the steps
     *         to be executed.
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
     * Returns the value of the BootstrapActions property for this object.
     *
     * @return The value of the BootstrapActions property for this object.
     */
    public java.util.List<BootstrapActionConfig> getBootstrapActions() {
        if (bootstrapActions == null) {
            bootstrapActions = new java.util.ArrayList<BootstrapActionConfig>();
        }
        return bootstrapActions;
    }
    
    /**
     * Sets the value of the BootstrapActions property for this object.
     *
     * @param bootstrapActions The new value for the BootstrapActions property for this object.
     */
    public void setBootstrapActions(java.util.Collection<BootstrapActionConfig> bootstrapActions) {
        java.util.List<BootstrapActionConfig> bootstrapActionsCopy = new java.util.ArrayList<BootstrapActionConfig>();
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
    public RunJobFlowRequest withBootstrapActions(BootstrapActionConfig... bootstrapActions) {
        for (BootstrapActionConfig value : bootstrapActions) {
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
    