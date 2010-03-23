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
        
    private String name;

    private String logUri;

    private JobFlowInstancesConfig instances;

    private java.util.List<StepConfig> steps;

    /**
     * Returns the value of the Name property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The value of the Name property for this object.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The new value for the Name property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RunJobFlowRequest withName(String name) {
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
    public RunJobFlowRequest withLogUri(String logUri) {
        this.logUri = logUri;
        return this;
    }
    
    
    /**
     * Returns the value of the Instances property for this object.
     *
     * @return The value of the Instances property for this object.
     */
    public JobFlowInstancesConfig getInstances() {
        return instances;
    }
    
    /**
     * Sets the value of the Instances property for this object.
     *
     * @param instances The new value for the Instances property for this object.
     */
    public void setInstances(JobFlowInstancesConfig instances) {
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
    public RunJobFlowRequest withInstances(JobFlowInstancesConfig instances) {
        this.instances = instances;
        return this;
    }
    
    
    /**
     * Returns the value of the Steps property for this object.
     *
     * @return The value of the Steps property for this object.
     */
    public java.util.List<StepConfig> getSteps() {
        if (steps == null) {
            steps = new java.util.ArrayList<StepConfig>();
        }
        return steps;
    }
    
    /**
     * Sets the value of the Steps property for this object.
     *
     * @param steps The new value for the Steps property for this object.
     */
    public void setSteps(java.util.Collection<StepConfig> steps) {
        java.util.List<StepConfig> stepsCopy = new java.util.ArrayList<StepConfig>();
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
    public RunJobFlowRequest withSteps(StepConfig... steps) {
        for (StepConfig value : steps) {
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
    public RunJobFlowRequest withSteps(java.util.Collection<StepConfig> steps) {
        java.util.List<StepConfig> stepsCopy = new java.util.ArrayList<StepConfig>();
        if (steps != null) {
            stepsCopy.addAll(steps);
        }
        this.steps = stepsCopy;

        return this;
    }
    
}
    