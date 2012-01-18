/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specification of a job flow step.
 * </p>
 */
public class StepConfig {

    /**
     * The name of the job flow step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String name;

    /**
     * Specifies the action to take if the job flow step fails.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, CANCEL_AND_WAIT, CONTINUE
     */
    private String actionOnFailure;

    /**
     * Specifies the JAR file used for the job flow step.
     */
    private HadoopJarStepConfig hadoopJarStep;

    /**
     * Default constructor for a new StepConfig object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public StepConfig() {}
    
    /**
     * Constructs a new StepConfig object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name The name of the job flow step.
     * @param hadoopJarStep Specifies the JAR file used for the job flow
     * step.
     */
    public StepConfig(String name, HadoopJarStepConfig hadoopJarStep) {
        this.name = name;
        this.hadoopJarStep = hadoopJarStep;
    }

    
    
    /**
     * The name of the job flow step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name of the job flow step.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the job flow step.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name The name of the job flow step.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the job flow step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param name The name of the job flow step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepConfig withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * Specifies the action to take if the job flow step fails.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, CANCEL_AND_WAIT, CONTINUE
     *
     * @return Specifies the action to take if the job flow step fails.
     *
     * @see ActionOnFailure
     */
    public String getActionOnFailure() {
        return actionOnFailure;
    }
    
    /**
     * Specifies the action to take if the job flow step fails.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, CANCEL_AND_WAIT, CONTINUE
     *
     * @param actionOnFailure Specifies the action to take if the job flow step fails.
     *
     * @see ActionOnFailure
     */
    public void setActionOnFailure(String actionOnFailure) {
        this.actionOnFailure = actionOnFailure;
    }
    
    /**
     * Specifies the action to take if the job flow step fails.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, CANCEL_AND_WAIT, CONTINUE
     *
     * @param actionOnFailure Specifies the action to take if the job flow step fails.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ActionOnFailure
     */
    public StepConfig withActionOnFailure(String actionOnFailure) {
        this.actionOnFailure = actionOnFailure;
        return this;
    }
    
    
    /**
     * Specifies the action to take if the job flow step fails.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, CANCEL_AND_WAIT, CONTINUE
     *
     * @param actionOnFailure Specifies the action to take if the job flow step fails.
     *
     * @see ActionOnFailure
     */
    public void setActionOnFailure(ActionOnFailure actionOnFailure) {
        this.actionOnFailure = actionOnFailure.toString();
    }
    
    /**
     * Specifies the action to take if the job flow step fails.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE_JOB_FLOW, CANCEL_AND_WAIT, CONTINUE
     *
     * @param actionOnFailure Specifies the action to take if the job flow step fails.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ActionOnFailure
     */
    public StepConfig withActionOnFailure(ActionOnFailure actionOnFailure) {
        this.actionOnFailure = actionOnFailure.toString();
        return this;
    }
    
    /**
     * Specifies the JAR file used for the job flow step.
     *
     * @return Specifies the JAR file used for the job flow step.
     */
    public HadoopJarStepConfig getHadoopJarStep() {
        return hadoopJarStep;
    }
    
    /**
     * Specifies the JAR file used for the job flow step.
     *
     * @param hadoopJarStep Specifies the JAR file used for the job flow step.
     */
    public void setHadoopJarStep(HadoopJarStepConfig hadoopJarStep) {
        this.hadoopJarStep = hadoopJarStep;
    }
    
    /**
     * Specifies the JAR file used for the job flow step.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hadoopJarStep Specifies the JAR file used for the job flow step.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public StepConfig withHadoopJarStep(HadoopJarStepConfig hadoopJarStep) {
        this.hadoopJarStep = hadoopJarStep;
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
        if (name != null) sb.append("Name: " + name + ", ");
        if (actionOnFailure != null) sb.append("ActionOnFailure: " + actionOnFailure + ", ");
        if (hadoopJarStep != null) sb.append("HadoopJarStep: " + hadoopJarStep + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getActionOnFailure() == null) ? 0 : getActionOnFailure().hashCode()); 
        hashCode = prime * hashCode + ((getHadoopJarStep() == null) ? 0 : getHadoopJarStep().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof StepConfig == false) return false;
        StepConfig other = (StepConfig)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getActionOnFailure() == null ^ this.getActionOnFailure() == null) return false;
        if (other.getActionOnFailure() != null && other.getActionOnFailure().equals(this.getActionOnFailure()) == false) return false; 
        if (other.getHadoopJarStep() == null ^ this.getHadoopJarStep() == null) return false;
        if (other.getHadoopJarStep() != null && other.getHadoopJarStep().equals(this.getHadoopJarStep()) == false) return false; 
        return true;
    }
    
}
    