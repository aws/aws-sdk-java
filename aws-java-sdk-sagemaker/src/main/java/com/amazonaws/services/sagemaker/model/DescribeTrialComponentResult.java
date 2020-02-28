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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeTrialComponent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrialComponentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the trial component.
     * </p>
     */
    private String trialComponentName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial component.
     * </p>
     */
    private String trialComponentArn;
    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source and, optionally, the job type.
     * </p>
     */
    private TrialComponentSource source;
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
     * When the component was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Who created the component.
     * </p>
     */
    private UserContext createdBy;
    /**
     * <p>
     * When the component was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * Who last modified the component.
     * </p>
     */
    private UserContext lastModifiedBy;
    /**
     * <p>
     * The hyperparameters of the component.
     * </p>
     */
    private java.util.Map<String, TrialComponentParameterValue> parameters;
    /**
     * <p>
     * The input artifacts of the component.
     * </p>
     */
    private java.util.Map<String, TrialComponentArtifact> inputArtifacts;
    /**
     * <p>
     * The output artifacts of the component.
     * </p>
     */
    private java.util.Map<String, TrialComponentArtifact> outputArtifacts;
    /**
     * <p>
     * The metrics for the component.
     * </p>
     */
    private java.util.List<TrialComponentMetricSummary> metrics;

    /**
     * <p>
     * The name of the trial component.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the trial component.
     */

    public void setTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
    }

    /**
     * <p>
     * The name of the trial component.
     * </p>
     * 
     * @return The name of the trial component.
     */

    public String getTrialComponentName() {
        return this.trialComponentName;
    }

    /**
     * <p>
     * The name of the trial component.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult withTrialComponentName(String trialComponentName) {
        setTrialComponentName(trialComponentName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial component.
     * </p>
     * 
     * @param trialComponentArn
     *        The Amazon Resource Name (ARN) of the trial component.
     */

    public void setTrialComponentArn(String trialComponentArn) {
        this.trialComponentArn = trialComponentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial component.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the trial component.
     */

    public String getTrialComponentArn() {
        return this.trialComponentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial component.
     * </p>
     * 
     * @param trialComponentArn
     *        The Amazon Resource Name (ARN) of the trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult withTrialComponentArn(String trialComponentArn) {
        setTrialComponentArn(trialComponentArn);
        return this;
    }

    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     *        <code>TrialComponentName</code> is displayed.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
     * </p>
     * 
     * @return The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     *         <code>TrialComponentName</code> is displayed.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     * <code>TrialComponentName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the component as displayed. If <code>DisplayName</code> isn't specified,
     *        <code>TrialComponentName</code> is displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source and, optionally, the job type.
     * </p>
     * 
     * @param source
     *        The Amazon Resource Name (ARN) of the source and, optionally, the job type.
     */

    public void setSource(TrialComponentSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source and, optionally, the job type.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source and, optionally, the job type.
     */

    public TrialComponentSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source and, optionally, the job type.
     * </p>
     * 
     * @param source
     *        The Amazon Resource Name (ARN) of the source and, optionally, the job type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult withSource(TrialComponentSource source) {
        setSource(source);
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

    public DescribeTrialComponentResult withStatus(TrialComponentStatus status) {
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

    public DescribeTrialComponentResult withStartTime(java.util.Date startTime) {
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

    public DescribeTrialComponentResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * When the component was created.
     * </p>
     * 
     * @param creationTime
     *        When the component was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the component was created.
     * </p>
     * 
     * @return When the component was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the component was created.
     * </p>
     * 
     * @param creationTime
     *        When the component was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Who created the component.
     * </p>
     * 
     * @param createdBy
     *        Who created the component.
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Who created the component.
     * </p>
     * 
     * @return Who created the component.
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * Who created the component.
     * </p>
     * 
     * @param createdBy
     *        Who created the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * When the component was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the component was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the component was last modified.
     * </p>
     * 
     * @return When the component was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the component was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the component was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * Who last modified the component.
     * </p>
     * 
     * @param lastModifiedBy
     *        Who last modified the component.
     */

    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * Who last modified the component.
     * </p>
     * 
     * @return Who last modified the component.
     */

    public UserContext getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * Who last modified the component.
     * </p>
     * 
     * @param lastModifiedBy
     *        Who last modified the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult withLastModifiedBy(UserContext lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The hyperparameters of the component.
     * </p>
     * 
     * @return The hyperparameters of the component.
     */

    public java.util.Map<String, TrialComponentParameterValue> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The hyperparameters of the component.
     * </p>
     * 
     * @param parameters
     *        The hyperparameters of the component.
     */

    public void setParameters(java.util.Map<String, TrialComponentParameterValue> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The hyperparameters of the component.
     * </p>
     * 
     * @param parameters
     *        The hyperparameters of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult withParameters(java.util.Map<String, TrialComponentParameterValue> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see DescribeTrialComponentResult#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult addParametersEntry(String key, TrialComponentParameterValue value) {
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

    public DescribeTrialComponentResult clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The input artifacts of the component.
     * </p>
     * 
     * @return The input artifacts of the component.
     */

    public java.util.Map<String, TrialComponentArtifact> getInputArtifacts() {
        return inputArtifacts;
    }

    /**
     * <p>
     * The input artifacts of the component.
     * </p>
     * 
     * @param inputArtifacts
     *        The input artifacts of the component.
     */

    public void setInputArtifacts(java.util.Map<String, TrialComponentArtifact> inputArtifacts) {
        this.inputArtifacts = inputArtifacts;
    }

    /**
     * <p>
     * The input artifacts of the component.
     * </p>
     * 
     * @param inputArtifacts
     *        The input artifacts of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult withInputArtifacts(java.util.Map<String, TrialComponentArtifact> inputArtifacts) {
        setInputArtifacts(inputArtifacts);
        return this;
    }

    /**
     * Add a single InputArtifacts entry
     *
     * @see DescribeTrialComponentResult#withInputArtifacts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult addInputArtifactsEntry(String key, TrialComponentArtifact value) {
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

    public DescribeTrialComponentResult clearInputArtifactsEntries() {
        this.inputArtifacts = null;
        return this;
    }

    /**
     * <p>
     * The output artifacts of the component.
     * </p>
     * 
     * @return The output artifacts of the component.
     */

    public java.util.Map<String, TrialComponentArtifact> getOutputArtifacts() {
        return outputArtifacts;
    }

    /**
     * <p>
     * The output artifacts of the component.
     * </p>
     * 
     * @param outputArtifacts
     *        The output artifacts of the component.
     */

    public void setOutputArtifacts(java.util.Map<String, TrialComponentArtifact> outputArtifacts) {
        this.outputArtifacts = outputArtifacts;
    }

    /**
     * <p>
     * The output artifacts of the component.
     * </p>
     * 
     * @param outputArtifacts
     *        The output artifacts of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult withOutputArtifacts(java.util.Map<String, TrialComponentArtifact> outputArtifacts) {
        setOutputArtifacts(outputArtifacts);
        return this;
    }

    /**
     * Add a single OutputArtifacts entry
     *
     * @see DescribeTrialComponentResult#withOutputArtifacts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult addOutputArtifactsEntry(String key, TrialComponentArtifact value) {
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

    public DescribeTrialComponentResult clearOutputArtifactsEntries() {
        this.outputArtifacts = null;
        return this;
    }

    /**
     * <p>
     * The metrics for the component.
     * </p>
     * 
     * @return The metrics for the component.
     */

    public java.util.List<TrialComponentMetricSummary> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * The metrics for the component.
     * </p>
     * 
     * @param metrics
     *        The metrics for the component.
     */

    public void setMetrics(java.util.Collection<TrialComponentMetricSummary> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new java.util.ArrayList<TrialComponentMetricSummary>(metrics);
    }

    /**
     * <p>
     * The metrics for the component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        The metrics for the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult withMetrics(TrialComponentMetricSummary... metrics) {
        if (this.metrics == null) {
            setMetrics(new java.util.ArrayList<TrialComponentMetricSummary>(metrics.length));
        }
        for (TrialComponentMetricSummary ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metrics for the component.
     * </p>
     * 
     * @param metrics
     *        The metrics for the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTrialComponentResult withMetrics(java.util.Collection<TrialComponentMetricSummary> metrics) {
        setMetrics(metrics);
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
        if (getTrialComponentArn() != null)
            sb.append("TrialComponentArn: ").append(getTrialComponentArn()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getInputArtifacts() != null)
            sb.append("InputArtifacts: ").append(getInputArtifacts()).append(",");
        if (getOutputArtifacts() != null)
            sb.append("OutputArtifacts: ").append(getOutputArtifacts()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrialComponentResult == false)
            return false;
        DescribeTrialComponentResult other = (DescribeTrialComponentResult) obj;
        if (other.getTrialComponentName() == null ^ this.getTrialComponentName() == null)
            return false;
        if (other.getTrialComponentName() != null && other.getTrialComponentName().equals(this.getTrialComponentName()) == false)
            return false;
        if (other.getTrialComponentArn() == null ^ this.getTrialComponentArn() == null)
            return false;
        if (other.getTrialComponentArn() != null && other.getTrialComponentArn().equals(this.getTrialComponentArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
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
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
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
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialComponentName() == null) ? 0 : getTrialComponentName().hashCode());
        hashCode = prime * hashCode + ((getTrialComponentArn() == null) ? 0 : getTrialComponentArn().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getInputArtifacts() == null) ? 0 : getInputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getOutputArtifacts() == null) ? 0 : getOutputArtifacts().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrialComponentResult clone() {
        try {
            return (DescribeTrialComponentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
