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
 * </p>
 */
public class StepConfig {

    /**
     * The name of the step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * Specifies what happens to the Amazon EC2 cluster when the job flow
     * results in an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>TERMINATE_JOB_FLOW|CANCEL_AND_WAIT|CONTINUE<br/>
     */
    private String actionOnFailure;

    /**
     * Specifies a Hadoop step.
     */
    private HadoopJarStepConfig hadoopJarStep;

    /**
     * The name of the step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the step.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The name of the step.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The name of the step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepConfig withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * Specifies what happens to the Amazon EC2 cluster when the job flow
     * results in an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>TERMINATE_JOB_FLOW|CANCEL_AND_WAIT|CONTINUE<br/>
     *
     * @return Specifies what happens to the Amazon EC2 cluster when the job flow
     *         results in an error.
     */
    public String getActionOnFailure() {
        return actionOnFailure;
    }
    
    /**
     * Specifies what happens to the Amazon EC2 cluster when the job flow
     * results in an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>TERMINATE_JOB_FLOW|CANCEL_AND_WAIT|CONTINUE<br/>
     *
     * @param actionOnFailure Specifies what happens to the Amazon EC2 cluster when the job flow
     *         results in an error.
     */
    public void setActionOnFailure(String actionOnFailure) {
        this.actionOnFailure = actionOnFailure;
    }
    
    /**
     * Specifies what happens to the Amazon EC2 cluster when the job flow
     * results in an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>TERMINATE_JOB_FLOW|CANCEL_AND_WAIT|CONTINUE<br/>
     *
     * @param actionOnFailure Specifies what happens to the Amazon EC2 cluster when the job flow
     *         results in an error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepConfig withActionOnFailure(String actionOnFailure) {
        this.actionOnFailure = actionOnFailure;
        return this;
    }
    
    
    /**
     * Specifies a Hadoop step.
     *
     * @return Specifies a Hadoop step.
     */
    public HadoopJarStepConfig getHadoopJarStep() {
        return hadoopJarStep;
    }
    
    /**
     * Specifies a Hadoop step.
     *
     * @param hadoopJarStep Specifies a Hadoop step.
     */
    public void setHadoopJarStep(HadoopJarStepConfig hadoopJarStep) {
        this.hadoopJarStep = hadoopJarStep;
    }
    
    /**
     * Specifies a Hadoop step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hadoopJarStep Specifies a Hadoop step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepConfig withHadoopJarStep(HadoopJarStepConfig hadoopJarStep) {
        this.hadoopJarStep = hadoopJarStep;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("Name: " + name + ", ");
        sb.append("ActionOnFailure: " + actionOnFailure + ", ");
        sb.append("HadoopJarStep: " + hadoopJarStep + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    