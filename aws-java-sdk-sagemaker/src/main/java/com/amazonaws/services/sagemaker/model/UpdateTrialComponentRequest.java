/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateTrialComponent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTrialComponentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the component to update.
     * </p>
     */
    private String trialComponentName;
    /**
     * <p>
     * The name of the component as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>TrialComponentName</code> is displayed.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The new status of the component.
     * </p>
     */
    private TrialComponentStatus status;
    /**
     * <p>
     * When the component started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * When the component ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Replaces all of the component's hyperparameters with the specified hyperparameters.
     * </p>
     */
    private java.util.Map<String, TrialComponentParameterValue> parameters;
    /**
     * <p>
     * The hyperparameters to remove from the component.
     * </p>
     */
    private java.util.List<String> parametersToRemove;
    /**
     * <p>
     * Replaces all of the component's input artifacts with the specified artifacts.
     * </p>
     */
    private java.util.Map<String, TrialComponentArtifact> inputArtifacts;
    /**
     * <p>
     * The input artifacts to remove from the component.
     * </p>
     */
    private java.util.List<String> inputArtifactsToRemove;
    /**
     * <p>
     * Replaces all of the component's output artifacts with the specified artifacts.
     * </p>
     */
    private java.util.Map<String, TrialComponentArtifact> outputArtifacts;
    /**
     * <p>
     * The output artifacts to remove from the component.
     * </p>
     */
    private java.util.List<String> outputArtifactsToRemove;

    /**
     * <p>
     * The name of the component to update.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the component to update.
     */

    public void setTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
    }

    /**
     * <p>
     * The name of the component to update.
     * </p>
     * 
     * @return The name of the component to update.
     */

    public String getTrialComponentName() {
        return this.trialComponentName;
    }

    /**
     * <p>
     * The name of the component to update.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the component to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest withTrialComponentName(String trialComponentName) {
        setTrialComponentName(trialComponentName);
        return this;
    }

    /**
     * <p>
     * The name of the component as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>TrialComponentName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the component as displayed. The name doesn't need to be unique. If <code>DisplayName</code>
     *        isn't specified, <code>TrialComponentName</code> is displayed.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the component as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>TrialComponentName</code> is displayed.
     * </p>
     * 
     * @return The name of the component as displayed. The name doesn't need to be unique. If <code>DisplayName</code>
     *         isn't specified, <code>TrialComponentName</code> is displayed.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the component as displayed. The name doesn't need to be unique. If <code>DisplayName</code> isn't
     * specified, <code>TrialComponentName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the component as displayed. The name doesn't need to be unique. If <code>DisplayName</code>
     *        isn't specified, <code>TrialComponentName</code> is displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The new status of the component.
     * </p>
     * 
     * @param status
     *        The new status of the component.
     */

    public void setStatus(TrialComponentStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The new status of the component.
     * </p>
     * 
     * @return The new status of the component.
     */

    public TrialComponentStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The new status of the component.
     * </p>
     * 
     * @param status
     *        The new status of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest withStatus(TrialComponentStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * When the component started.
     * </p>
     * 
     * @param startTime
     *        When the component started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * When the component started.
     * </p>
     * 
     * @return When the component started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * When the component started.
     * </p>
     * 
     * @param startTime
     *        When the component started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * When the component ended.
     * </p>
     * 
     * @param endTime
     *        When the component ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * When the component ended.
     * </p>
     * 
     * @return When the component ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * When the component ended.
     * </p>
     * 
     * @param endTime
     *        When the component ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Replaces all of the component's hyperparameters with the specified hyperparameters.
     * </p>
     * 
     * @return Replaces all of the component's hyperparameters with the specified hyperparameters.
     */

    public java.util.Map<String, TrialComponentParameterValue> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * Replaces all of the component's hyperparameters with the specified hyperparameters.
     * </p>
     * 
     * @param parameters
     *        Replaces all of the component's hyperparameters with the specified hyperparameters.
     */

    public void setParameters(java.util.Map<String, TrialComponentParameterValue> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Replaces all of the component's hyperparameters with the specified hyperparameters.
     * </p>
     * 
     * @param parameters
     *        Replaces all of the component's hyperparameters with the specified hyperparameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest withParameters(java.util.Map<String, TrialComponentParameterValue> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see UpdateTrialComponentRequest#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest addParametersEntry(String key, TrialComponentParameterValue value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, TrialComponentParameterValue>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The hyperparameters to remove from the component.
     * </p>
     * 
     * @return The hyperparameters to remove from the component.
     */

    public java.util.List<String> getParametersToRemove() {
        return parametersToRemove;
    }

    /**
     * <p>
     * The hyperparameters to remove from the component.
     * </p>
     * 
     * @param parametersToRemove
     *        The hyperparameters to remove from the component.
     */

    public void setParametersToRemove(java.util.Collection<String> parametersToRemove) {
        if (parametersToRemove == null) {
            this.parametersToRemove = null;
            return;
        }

        this.parametersToRemove = new java.util.ArrayList<String>(parametersToRemove);
    }

    /**
     * <p>
     * The hyperparameters to remove from the component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParametersToRemove(java.util.Collection)} or {@link #withParametersToRemove(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param parametersToRemove
     *        The hyperparameters to remove from the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest withParametersToRemove(String... parametersToRemove) {
        if (this.parametersToRemove == null) {
            setParametersToRemove(new java.util.ArrayList<String>(parametersToRemove.length));
        }
        for (String ele : parametersToRemove) {
            this.parametersToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The hyperparameters to remove from the component.
     * </p>
     * 
     * @param parametersToRemove
     *        The hyperparameters to remove from the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest withParametersToRemove(java.util.Collection<String> parametersToRemove) {
        setParametersToRemove(parametersToRemove);
        return this;
    }

    /**
     * <p>
     * Replaces all of the component's input artifacts with the specified artifacts.
     * </p>
     * 
     * @return Replaces all of the component's input artifacts with the specified artifacts.
     */

    public java.util.Map<String, TrialComponentArtifact> getInputArtifacts() {
        return inputArtifacts;
    }

    /**
     * <p>
     * Replaces all of the component's input artifacts with the specified artifacts.
     * </p>
     * 
     * @param inputArtifacts
     *        Replaces all of the component's input artifacts with the specified artifacts.
     */

    public void setInputArtifacts(java.util.Map<String, TrialComponentArtifact> inputArtifacts) {
        this.inputArtifacts = inputArtifacts;
    }

    /**
     * <p>
     * Replaces all of the component's input artifacts with the specified artifacts.
     * </p>
     * 
     * @param inputArtifacts
     *        Replaces all of the component's input artifacts with the specified artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest withInputArtifacts(java.util.Map<String, TrialComponentArtifact> inputArtifacts) {
        setInputArtifacts(inputArtifacts);
        return this;
    }

    /**
     * Add a single InputArtifacts entry
     *
     * @see UpdateTrialComponentRequest#withInputArtifacts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest addInputArtifactsEntry(String key, TrialComponentArtifact value) {
        if (null == this.inputArtifacts) {
            this.inputArtifacts = new java.util.HashMap<String, TrialComponentArtifact>();
        }
        if (this.inputArtifacts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.inputArtifacts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into InputArtifacts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest clearInputArtifactsEntries() {
        this.inputArtifacts = null;
        return this;
    }

    /**
     * <p>
     * The input artifacts to remove from the component.
     * </p>
     * 
     * @return The input artifacts to remove from the component.
     */

    public java.util.List<String> getInputArtifactsToRemove() {
        return inputArtifactsToRemove;
    }

    /**
     * <p>
     * The input artifacts to remove from the component.
     * </p>
     * 
     * @param inputArtifactsToRemove
     *        The input artifacts to remove from the component.
     */

    public void setInputArtifactsToRemove(java.util.Collection<String> inputArtifactsToRemove) {
        if (inputArtifactsToRemove == null) {
            this.inputArtifactsToRemove = null;
            return;
        }

        this.inputArtifactsToRemove = new java.util.ArrayList<String>(inputArtifactsToRemove);
    }

    /**
     * <p>
     * The input artifacts to remove from the component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputArtifactsToRemove(java.util.Collection)} or
     * {@link #withInputArtifactsToRemove(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param inputArtifactsToRemove
     *        The input artifacts to remove from the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest withInputArtifactsToRemove(String... inputArtifactsToRemove) {
        if (this.inputArtifactsToRemove == null) {
            setInputArtifactsToRemove(new java.util.ArrayList<String>(inputArtifactsToRemove.length));
        }
        for (String ele : inputArtifactsToRemove) {
            this.inputArtifactsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The input artifacts to remove from the component.
     * </p>
     * 
     * @param inputArtifactsToRemove
     *        The input artifacts to remove from the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest withInputArtifactsToRemove(java.util.Collection<String> inputArtifactsToRemove) {
        setInputArtifactsToRemove(inputArtifactsToRemove);
        return this;
    }

    /**
     * <p>
     * Replaces all of the component's output artifacts with the specified artifacts.
     * </p>
     * 
     * @return Replaces all of the component's output artifacts with the specified artifacts.
     */

    public java.util.Map<String, TrialComponentArtifact> getOutputArtifacts() {
        return outputArtifacts;
    }

    /**
     * <p>
     * Replaces all of the component's output artifacts with the specified artifacts.
     * </p>
     * 
     * @param outputArtifacts
     *        Replaces all of the component's output artifacts with the specified artifacts.
     */

    public void setOutputArtifacts(java.util.Map<String, TrialComponentArtifact> outputArtifacts) {
        this.outputArtifacts = outputArtifacts;
    }

    /**
     * <p>
     * Replaces all of the component's output artifacts with the specified artifacts.
     * </p>
     * 
     * @param outputArtifacts
     *        Replaces all of the component's output artifacts with the specified artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest withOutputArtifacts(java.util.Map<String, TrialComponentArtifact> outputArtifacts) {
        setOutputArtifacts(outputArtifacts);
        return this;
    }

    /**
     * Add a single OutputArtifacts entry
     *
     * @see UpdateTrialComponentRequest#withOutputArtifacts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest addOutputArtifactsEntry(String key, TrialComponentArtifact value) {
        if (null == this.outputArtifacts) {
            this.outputArtifacts = new java.util.HashMap<String, TrialComponentArtifact>();
        }
        if (this.outputArtifacts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.outputArtifacts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OutputArtifacts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest clearOutputArtifactsEntries() {
        this.outputArtifacts = null;
        return this;
    }

    /**
     * <p>
     * The output artifacts to remove from the component.
     * </p>
     * 
     * @return The output artifacts to remove from the component.
     */

    public java.util.List<String> getOutputArtifactsToRemove() {
        return outputArtifactsToRemove;
    }

    /**
     * <p>
     * The output artifacts to remove from the component.
     * </p>
     * 
     * @param outputArtifactsToRemove
     *        The output artifacts to remove from the component.
     */

    public void setOutputArtifactsToRemove(java.util.Collection<String> outputArtifactsToRemove) {
        if (outputArtifactsToRemove == null) {
            this.outputArtifactsToRemove = null;
            return;
        }

        this.outputArtifactsToRemove = new java.util.ArrayList<String>(outputArtifactsToRemove);
    }

    /**
     * <p>
     * The output artifacts to remove from the component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputArtifactsToRemove(java.util.Collection)} or
     * {@link #withOutputArtifactsToRemove(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param outputArtifactsToRemove
     *        The output artifacts to remove from the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest withOutputArtifactsToRemove(String... outputArtifactsToRemove) {
        if (this.outputArtifactsToRemove == null) {
            setOutputArtifactsToRemove(new java.util.ArrayList<String>(outputArtifactsToRemove.length));
        }
        for (String ele : outputArtifactsToRemove) {
            this.outputArtifactsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The output artifacts to remove from the component.
     * </p>
     * 
     * @param outputArtifactsToRemove
     *        The output artifacts to remove from the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTrialComponentRequest withOutputArtifactsToRemove(java.util.Collection<String> outputArtifactsToRemove) {
        setOutputArtifactsToRemove(outputArtifactsToRemove);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTrialComponentName() != null)
            sb.append("TrialComponentName: ").append(getTrialComponentName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getParametersToRemove() != null)
            sb.append("ParametersToRemove: ").append(getParametersToRemove()).append(",");
        if (getInputArtifacts() != null)
            sb.append("InputArtifacts: ").append(getInputArtifacts()).append(",");
        if (getInputArtifactsToRemove() != null)
            sb.append("InputArtifactsToRemove: ").append(getInputArtifactsToRemove()).append(",");
        if (getOutputArtifacts() != null)
            sb.append("OutputArtifacts: ").append(getOutputArtifacts()).append(",");
        if (getOutputArtifactsToRemove() != null)
            sb.append("OutputArtifactsToRemove: ").append(getOutputArtifactsToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrialComponentRequest == false)
            return false;
        UpdateTrialComponentRequest other = (UpdateTrialComponentRequest) obj;
        if (other.getTrialComponentName() == null ^ this.getTrialComponentName() == null)
            return false;
        if (other.getTrialComponentName() != null && other.getTrialComponentName().equals(this.getTrialComponentName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getParametersToRemove() == null ^ this.getParametersToRemove() == null)
            return false;
        if (other.getParametersToRemove() != null && other.getParametersToRemove().equals(this.getParametersToRemove()) == false)
            return false;
        if (other.getInputArtifacts() == null ^ this.getInputArtifacts() == null)
            return false;
        if (other.getInputArtifacts() != null && other.getInputArtifacts().equals(this.getInputArtifacts()) == false)
            return false;
        if (other.getInputArtifactsToRemove() == null ^ this.getInputArtifactsToRemove() == null)
            return false;
        if (other.getInputArtifactsToRemove() != null && other.getInputArtifactsToRemove().equals(this.getInputArtifactsToRemove()) == false)
            return false;
        if (other.getOutputArtifacts() == null ^ this.getOutputArtifacts() == null)
            return false;
        if (other.getOutputArtifacts() != null && other.getOutputArtifacts().equals(this.getOutputArtifacts()) == false)
            return false;
        if (other.getOutputArtifactsToRemove() == null ^ this.getOutputArtifactsToRemove() == null)
            return false;
        if (other.getOutputArtifactsToRemove() != null && other.getOutputArtifactsToRemove().equals(this.getOutputArtifactsToRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialComponentName() == null) ? 0 : getTrialComponentName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getParametersToRemove() == null) ? 0 : getParametersToRemove().hashCode());
        hashCode = prime * hashCode + ((getInputArtifacts() == null) ? 0 : getInputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getInputArtifactsToRemove() == null) ? 0 : getInputArtifactsToRemove().hashCode());
        hashCode = prime * hashCode + ((getOutputArtifacts() == null) ? 0 : getOutputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getOutputArtifactsToRemove() == null) ? 0 : getOutputArtifactsToRemove().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrialComponentRequest clone() {
        return (UpdateTrialComponentRequest) super.clone();
    }

}
