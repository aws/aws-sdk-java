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
 * Step Config
 */
public class StepConfig {

    private String name;

    private String actionOnFailure;

    private HadoopJarStepConfig hadoopJarStep;

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
    public StepConfig withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * Returns the value of the ActionOnFailure property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>TERMINATE_JOB_FLOW|CANCEL_AND_WAIT|CONTINUE<br/>
     *
     * @return The value of the ActionOnFailure property for this object.
     */
    public String getActionOnFailure() {
        return actionOnFailure;
    }
    
    /**
     * Sets the value of the ActionOnFailure property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>TERMINATE_JOB_FLOW|CANCEL_AND_WAIT|CONTINUE<br/>
     *
     * @param actionOnFailure The new value for the ActionOnFailure property for this object.
     */
    public void setActionOnFailure(String actionOnFailure) {
        this.actionOnFailure = actionOnFailure;
    }
    
    /**
     * Sets the value of the ActionOnFailure property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>TERMINATE_JOB_FLOW|CANCEL_AND_WAIT|CONTINUE<br/>
     *
     * @param actionOnFailure The new value for the ActionOnFailure property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepConfig withActionOnFailure(String actionOnFailure) {
        this.actionOnFailure = actionOnFailure;
        return this;
    }
    
    
    /**
     * Returns the value of the HadoopJarStep property for this object.
     *
     * @return The value of the HadoopJarStep property for this object.
     */
    public HadoopJarStepConfig getHadoopJarStep() {
        return hadoopJarStep;
    }
    
    /**
     * Sets the value of the HadoopJarStep property for this object.
     *
     * @param hadoopJarStep The new value for the HadoopJarStep property for this object.
     */
    public void setHadoopJarStep(HadoopJarStepConfig hadoopJarStep) {
        this.hadoopJarStep = hadoopJarStep;
    }
    
    /**
     * Sets the value of the HadoopJarStep property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hadoopJarStep The new value for the HadoopJarStep property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepConfig withHadoopJarStep(HadoopJarStepConfig hadoopJarStep) {
        this.hadoopJarStep = hadoopJarStep;
        return this;
    }
    
    
}
    