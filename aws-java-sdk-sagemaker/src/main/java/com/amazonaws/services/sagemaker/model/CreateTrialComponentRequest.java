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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTrialComponent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrialComponentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the component. The name must be unique in your AWS account and is not case-sensitive.
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
     * The status of the component. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * Completed
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
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
     * The hyperparameters for the component.
     * </p>
     */
    private java.util.Map<String, TrialComponentParameterValue> parameters;
    /**
     * <p>
     * The input artifacts for the component. Examples of input artifacts are datasets, algorithms, hyperparameters,
     * source code, and instance types.
     * </p>
     */
    private java.util.Map<String, TrialComponentArtifact> inputArtifacts;
    /**
     * <p>
     * The output artifacts for the component. Examples of output artifacts are metrics, snapshots, logs, and images.
     * </p>
     */
    private java.util.Map<String, TrialComponentArtifact> outputArtifacts;
    /**
     * <p>
     * A list of tags to associate with the component. You can use <a>Search</a> API to search on the tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the component. The name must be unique in your AWS account and is not case-sensitive.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the component. The name must be unique in your AWS account and is not case-sensitive.
     */

    public void setTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
    }

    /**
     * <p>
     * The name of the component. The name must be unique in your AWS account and is not case-sensitive.
     * </p>
     * 
     * @return The name of the component. The name must be unique in your AWS account and is not case-sensitive.
     */

    public String getTrialComponentName() {
        return this.trialComponentName;
    }

    /**
     * <p>
     * The name of the component. The name must be unique in your AWS account and is not case-sensitive.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the component. The name must be unique in your AWS account and is not case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialComponentRequest withTrialComponentName(String trialComponentName) {
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

    public CreateTrialComponentRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The status of the component. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * Completed
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the component. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        InProgress
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Completed
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed
     *        </p>
     *        </li>
     */

    public void setStatus(TrialComponentStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the component. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * Completed
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the component. States include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         InProgress
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Completed
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed
     *         </p>
     *         </li>
     */

    public TrialComponentStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the component. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress
     * </p>
     * </li>
     * <li>
     * <p>
     * Completed
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the component. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        InProgress
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Completed
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialComponentRequest withStatus(TrialComponentStatus status) {
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

    public CreateTrialComponentRequest withStartTime(java.util.Date startTime) {
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

    public CreateTrialComponentRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The hyperparameters for the component.
     * </p>
     * 
     * @return The hyperparameters for the component.
     */

    public java.util.Map<String, TrialComponentParameterValue> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The hyperparameters for the component.
     * </p>
     * 
     * @param parameters
     *        The hyperparameters for the component.
     */

    public void setParameters(java.util.Map<String, TrialComponentParameterValue> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The hyperparameters for the component.
     * </p>
     * 
     * @param parameters
     *        The hyperparameters for the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialComponentRequest withParameters(java.util.Map<String, TrialComponentParameterValue> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see CreateTrialComponentRequest#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialComponentRequest addParametersEntry(String key, TrialComponentParameterValue value) {
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

    public CreateTrialComponentRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The input artifacts for the component. Examples of input artifacts are datasets, algorithms, hyperparameters,
     * source code, and instance types.
     * </p>
     * 
     * @return The input artifacts for the component. Examples of input artifacts are datasets, algorithms,
     *         hyperparameters, source code, and instance types.
     */

    public java.util.Map<String, TrialComponentArtifact> getInputArtifacts() {
        return inputArtifacts;
    }

    /**
     * <p>
     * The input artifacts for the component. Examples of input artifacts are datasets, algorithms, hyperparameters,
     * source code, and instance types.
     * </p>
     * 
     * @param inputArtifacts
     *        The input artifacts for the component. Examples of input artifacts are datasets, algorithms,
     *        hyperparameters, source code, and instance types.
     */

    public void setInputArtifacts(java.util.Map<String, TrialComponentArtifact> inputArtifacts) {
        this.inputArtifacts = inputArtifacts;
    }

    /**
     * <p>
     * The input artifacts for the component. Examples of input artifacts are datasets, algorithms, hyperparameters,
     * source code, and instance types.
     * </p>
     * 
     * @param inputArtifacts
     *        The input artifacts for the component. Examples of input artifacts are datasets, algorithms,
     *        hyperparameters, source code, and instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialComponentRequest withInputArtifacts(java.util.Map<String, TrialComponentArtifact> inputArtifacts) {
        setInputArtifacts(inputArtifacts);
        return this;
    }

    /**
     * Add a single InputArtifacts entry
     *
     * @see CreateTrialComponentRequest#withInputArtifacts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialComponentRequest addInputArtifactsEntry(String key, TrialComponentArtifact value) {
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

    public CreateTrialComponentRequest clearInputArtifactsEntries() {
        this.inputArtifacts = null;
        return this;
    }

    /**
     * <p>
     * The output artifacts for the component. Examples of output artifacts are metrics, snapshots, logs, and images.
     * </p>
     * 
     * @return The output artifacts for the component. Examples of output artifacts are metrics, snapshots, logs, and
     *         images.
     */

    public java.util.Map<String, TrialComponentArtifact> getOutputArtifacts() {
        return outputArtifacts;
    }

    /**
     * <p>
     * The output artifacts for the component. Examples of output artifacts are metrics, snapshots, logs, and images.
     * </p>
     * 
     * @param outputArtifacts
     *        The output artifacts for the component. Examples of output artifacts are metrics, snapshots, logs, and
     *        images.
     */

    public void setOutputArtifacts(java.util.Map<String, TrialComponentArtifact> outputArtifacts) {
        this.outputArtifacts = outputArtifacts;
    }

    /**
     * <p>
     * The output artifacts for the component. Examples of output artifacts are metrics, snapshots, logs, and images.
     * </p>
     * 
     * @param outputArtifacts
     *        The output artifacts for the component. Examples of output artifacts are metrics, snapshots, logs, and
     *        images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialComponentRequest withOutputArtifacts(java.util.Map<String, TrialComponentArtifact> outputArtifacts) {
        setOutputArtifacts(outputArtifacts);
        return this;
    }

    /**
     * Add a single OutputArtifacts entry
     *
     * @see CreateTrialComponentRequest#withOutputArtifacts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialComponentRequest addOutputArtifactsEntry(String key, TrialComponentArtifact value) {
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

    public CreateTrialComponentRequest clearOutputArtifactsEntries() {
        this.outputArtifacts = null;
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the component. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @return A list of tags to associate with the component. You can use <a>Search</a> API to search on the tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with the component. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the component. You can use <a>Search</a> API to search on the tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to associate with the component. You can use <a>Search</a> API to search on the tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the component. You can use <a>Search</a> API to search on the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialComponentRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the component. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the component. You can use <a>Search</a> API to search on the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrialComponentRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getInputArtifacts() != null)
            sb.append("InputArtifacts: ").append(getInputArtifacts()).append(",");
        if (getOutputArtifacts() != null)
            sb.append("OutputArtifacts: ").append(getOutputArtifacts()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrialComponentRequest == false)
            return false;
        CreateTrialComponentRequest other = (CreateTrialComponentRequest) obj;
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
        if (other.getInputArtifacts() == null ^ this.getInputArtifacts() == null)
            return false;
        if (other.getInputArtifacts() != null && other.getInputArtifacts().equals(this.getInputArtifacts()) == false)
            return false;
        if (other.getOutputArtifacts() == null ^ this.getOutputArtifacts() == null)
            return false;
        if (other.getOutputArtifacts() != null && other.getOutputArtifacts().equals(this.getOutputArtifacts()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getInputArtifacts() == null) ? 0 : getInputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getOutputArtifacts() == null) ? 0 : getOutputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrialComponentRequest clone() {
        return (CreateTrialComponentRequest) super.clone();
    }

}
