/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Specification of a job flow step.
 * </p>
 */
public class StepConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the job flow step.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The action to take if the job flow step fails.
     * </p>
     */
    private String actionOnFailure;
    /**
     * <p>
     * The JAR file used for the job flow step.
     * </p>
     */
    private HadoopJarStepConfig hadoopJarStep;

    /**
     * Default constructor for StepConfig object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public StepConfig() {
    }

    /**
     * Constructs a new StepConfig object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param name
     *        The name of the job flow step.
     * @param hadoopJarStep
     *        The JAR file used for the job flow step.
     */
    public StepConfig(String name, HadoopJarStepConfig hadoopJarStep) {
        setName(name);
        setHadoopJarStep(hadoopJarStep);
    }

    /**
     * <p>
     * The name of the job flow step.
     * </p>
     * 
     * @param name
     *        The name of the job flow step.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the job flow step.
     * </p>
     * 
     * @return The name of the job flow step.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the job flow step.
     * </p>
     * 
     * @param name
     *        The name of the job flow step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The action to take if the job flow step fails.
     * </p>
     * 
     * @param actionOnFailure
     *        The action to take if the job flow step fails.
     * @see ActionOnFailure
     */

    public void setActionOnFailure(String actionOnFailure) {
        this.actionOnFailure = actionOnFailure;
    }

    /**
     * <p>
     * The action to take if the job flow step fails.
     * </p>
     * 
     * @return The action to take if the job flow step fails.
     * @see ActionOnFailure
     */

    public String getActionOnFailure() {
        return this.actionOnFailure;
    }

    /**
     * <p>
     * The action to take if the job flow step fails.
     * </p>
     * 
     * @param actionOnFailure
     *        The action to take if the job flow step fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionOnFailure
     */

    public StepConfig withActionOnFailure(String actionOnFailure) {
        setActionOnFailure(actionOnFailure);
        return this;
    }

    /**
     * <p>
     * The action to take if the job flow step fails.
     * </p>
     * 
     * @param actionOnFailure
     *        The action to take if the job flow step fails.
     * @see ActionOnFailure
     */

    public void setActionOnFailure(ActionOnFailure actionOnFailure) {
        this.actionOnFailure = actionOnFailure.toString();
    }

    /**
     * <p>
     * The action to take if the job flow step fails.
     * </p>
     * 
     * @param actionOnFailure
     *        The action to take if the job flow step fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionOnFailure
     */

    public StepConfig withActionOnFailure(ActionOnFailure actionOnFailure) {
        setActionOnFailure(actionOnFailure);
        return this;
    }

    /**
     * <p>
     * The JAR file used for the job flow step.
     * </p>
     * 
     * @param hadoopJarStep
     *        The JAR file used for the job flow step.
     */

    public void setHadoopJarStep(HadoopJarStepConfig hadoopJarStep) {
        this.hadoopJarStep = hadoopJarStep;
    }

    /**
     * <p>
     * The JAR file used for the job flow step.
     * </p>
     * 
     * @return The JAR file used for the job flow step.
     */

    public HadoopJarStepConfig getHadoopJarStep() {
        return this.hadoopJarStep;
    }

    /**
     * <p>
     * The JAR file used for the job flow step.
     * </p>
     * 
     * @param hadoopJarStep
     *        The JAR file used for the job flow step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StepConfig withHadoopJarStep(HadoopJarStepConfig hadoopJarStep) {
        setHadoopJarStep(hadoopJarStep);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getActionOnFailure() != null)
            sb.append("ActionOnFailure: " + getActionOnFailure() + ",");
        if (getHadoopJarStep() != null)
            sb.append("HadoopJarStep: " + getHadoopJarStep());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepConfig == false)
            return false;
        StepConfig other = (StepConfig) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getActionOnFailure() == null ^ this.getActionOnFailure() == null)
            return false;
        if (other.getActionOnFailure() != null && other.getActionOnFailure().equals(this.getActionOnFailure()) == false)
            return false;
        if (other.getHadoopJarStep() == null ^ this.getHadoopJarStep() == null)
            return false;
        if (other.getHadoopJarStep() != null && other.getHadoopJarStep().equals(this.getHadoopJarStep()) == false)
            return false;
        return true;
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
    public StepConfig clone() {
        try {
            return (StepConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
