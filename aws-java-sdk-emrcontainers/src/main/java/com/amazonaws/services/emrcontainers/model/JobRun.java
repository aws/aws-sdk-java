/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This entity describes a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query,
 * that you submit to Amazon EMR on EKS.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/JobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobRun implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the job run.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the job run.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the job run's virtual cluster.
     * </p>
     */
    private String virtualClusterId;
    /**
     * <p>
     * The ARN of job run.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The state of the job run.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The client token used to start a job run.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The release version of Amazon EMR.
     * </p>
     */
    private String releaseLabel;
    /**
     * <p>
     * The configuration settings that are used to override default configuration.
     * </p>
     */
    private ConfigurationOverrides configurationOverrides;
    /**
     * <p>
     * Parameters of job driver for the job run.
     * </p>
     */
    private JobDriver jobDriver;
    /**
     * <p>
     * The date and time when the job run was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user who created the job run.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The date and time when the job run has finished.
     * </p>
     */
    private java.util.Date finishedAt;
    /**
     * <p>
     * Additional details of the job run state.
     * </p>
     */
    private String stateDetails;
    /**
     * <p>
     * The reasons why the job run has failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The assigned tags of the job run.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the job run.
     * </p>
     * 
     * @param id
     *        The ID of the job run.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the job run.
     * </p>
     * 
     * @return The ID of the job run.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the job run.
     * </p>
     * 
     * @param id
     *        The ID of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the job run.
     * </p>
     * 
     * @param name
     *        The name of the job run.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the job run.
     * </p>
     * 
     * @return The name of the job run.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the job run.
     * </p>
     * 
     * @param name
     *        The name of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the job run's virtual cluster.
     * </p>
     * 
     * @param virtualClusterId
     *        The ID of the job run's virtual cluster.
     */

    public void setVirtualClusterId(String virtualClusterId) {
        this.virtualClusterId = virtualClusterId;
    }

    /**
     * <p>
     * The ID of the job run's virtual cluster.
     * </p>
     * 
     * @return The ID of the job run's virtual cluster.
     */

    public String getVirtualClusterId() {
        return this.virtualClusterId;
    }

    /**
     * <p>
     * The ID of the job run's virtual cluster.
     * </p>
     * 
     * @param virtualClusterId
     *        The ID of the job run's virtual cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withVirtualClusterId(String virtualClusterId) {
        setVirtualClusterId(virtualClusterId);
        return this;
    }

    /**
     * <p>
     * The ARN of job run.
     * </p>
     * 
     * @param arn
     *        The ARN of job run.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of job run.
     * </p>
     * 
     * @return The ARN of job run.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of job run.
     * </p>
     * 
     * @param arn
     *        The ARN of job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The state of the job run.
     * </p>
     * 
     * @param state
     *        The state of the job run.
     * @see JobRunState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the job run.
     * </p>
     * 
     * @return The state of the job run.
     * @see JobRunState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the job run.
     * </p>
     * 
     * @param state
     *        The state of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public JobRun withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the job run.
     * </p>
     * 
     * @param state
     *        The state of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobRunState
     */

    public JobRun withState(JobRunState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The client token used to start a job run.
     * </p>
     * 
     * @param clientToken
     *        The client token used to start a job run.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token used to start a job run.
     * </p>
     * 
     * @return The client token used to start a job run.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token used to start a job run.
     * </p>
     * 
     * @param clientToken
     *        The client token used to start a job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     * 
     * @param executionRoleArn
     *        The execution role ARN of the job run.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     * 
     * @return The execution role ARN of the job run.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     * 
     * @param executionRoleArn
     *        The execution role ARN of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The release version of Amazon EMR.
     * </p>
     * 
     * @param releaseLabel
     *        The release version of Amazon EMR.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The release version of Amazon EMR.
     * </p>
     * 
     * @return The release version of Amazon EMR.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * The release version of Amazon EMR.
     * </p>
     * 
     * @param releaseLabel
     *        The release version of Amazon EMR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
        return this;
    }

    /**
     * <p>
     * The configuration settings that are used to override default configuration.
     * </p>
     * 
     * @param configurationOverrides
     *        The configuration settings that are used to override default configuration.
     */

    public void setConfigurationOverrides(ConfigurationOverrides configurationOverrides) {
        this.configurationOverrides = configurationOverrides;
    }

    /**
     * <p>
     * The configuration settings that are used to override default configuration.
     * </p>
     * 
     * @return The configuration settings that are used to override default configuration.
     */

    public ConfigurationOverrides getConfigurationOverrides() {
        return this.configurationOverrides;
    }

    /**
     * <p>
     * The configuration settings that are used to override default configuration.
     * </p>
     * 
     * @param configurationOverrides
     *        The configuration settings that are used to override default configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withConfigurationOverrides(ConfigurationOverrides configurationOverrides) {
        setConfigurationOverrides(configurationOverrides);
        return this;
    }

    /**
     * <p>
     * Parameters of job driver for the job run.
     * </p>
     * 
     * @param jobDriver
     *        Parameters of job driver for the job run.
     */

    public void setJobDriver(JobDriver jobDriver) {
        this.jobDriver = jobDriver;
    }

    /**
     * <p>
     * Parameters of job driver for the job run.
     * </p>
     * 
     * @return Parameters of job driver for the job run.
     */

    public JobDriver getJobDriver() {
        return this.jobDriver;
    }

    /**
     * <p>
     * Parameters of job driver for the job run.
     * </p>
     * 
     * @param jobDriver
     *        Parameters of job driver for the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withJobDriver(JobDriver jobDriver) {
        setJobDriver(jobDriver);
        return this;
    }

    /**
     * <p>
     * The date and time when the job run was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the job run was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the job run was created.
     * </p>
     * 
     * @return The date and time when the job run was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the job run was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the job run was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user who created the job run.
     * </p>
     * 
     * @param createdBy
     *        The user who created the job run.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user who created the job run.
     * </p>
     * 
     * @return The user who created the job run.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user who created the job run.
     * </p>
     * 
     * @param createdBy
     *        The user who created the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The date and time when the job run has finished.
     * </p>
     * 
     * @param finishedAt
     *        The date and time when the job run has finished.
     */

    public void setFinishedAt(java.util.Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    /**
     * <p>
     * The date and time when the job run has finished.
     * </p>
     * 
     * @return The date and time when the job run has finished.
     */

    public java.util.Date getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * <p>
     * The date and time when the job run has finished.
     * </p>
     * 
     * @param finishedAt
     *        The date and time when the job run has finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withFinishedAt(java.util.Date finishedAt) {
        setFinishedAt(finishedAt);
        return this;
    }

    /**
     * <p>
     * Additional details of the job run state.
     * </p>
     * 
     * @param stateDetails
     *        Additional details of the job run state.
     */

    public void setStateDetails(String stateDetails) {
        this.stateDetails = stateDetails;
    }

    /**
     * <p>
     * Additional details of the job run state.
     * </p>
     * 
     * @return Additional details of the job run state.
     */

    public String getStateDetails() {
        return this.stateDetails;
    }

    /**
     * <p>
     * Additional details of the job run state.
     * </p>
     * 
     * @param stateDetails
     *        Additional details of the job run state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withStateDetails(String stateDetails) {
        setStateDetails(stateDetails);
        return this;
    }

    /**
     * <p>
     * The reasons why the job run has failed.
     * </p>
     * 
     * @param failureReason
     *        The reasons why the job run has failed.
     * @see FailureReason
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reasons why the job run has failed.
     * </p>
     * 
     * @return The reasons why the job run has failed.
     * @see FailureReason
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reasons why the job run has failed.
     * </p>
     * 
     * @param failureReason
     *        The reasons why the job run has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureReason
     */

    public JobRun withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The reasons why the job run has failed.
     * </p>
     * 
     * @param failureReason
     *        The reasons why the job run has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureReason
     */

    public JobRun withFailureReason(FailureReason failureReason) {
        this.failureReason = failureReason.toString();
        return this;
    }

    /**
     * <p>
     * The assigned tags of the job run.
     * </p>
     * 
     * @return The assigned tags of the job run.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The assigned tags of the job run.
     * </p>
     * 
     * @param tags
     *        The assigned tags of the job run.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The assigned tags of the job run.
     * </p>
     * 
     * @param tags
     *        The assigned tags of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see JobRun#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public JobRun addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun clearTagsEntries() {
        this.tags = null;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVirtualClusterId() != null)
            sb.append("VirtualClusterId: ").append(getVirtualClusterId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: ").append(getReleaseLabel()).append(",");
        if (getConfigurationOverrides() != null)
            sb.append("ConfigurationOverrides: ").append(getConfigurationOverrides()).append(",");
        if (getJobDriver() != null)
            sb.append("JobDriver: ").append(getJobDriver()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getFinishedAt() != null)
            sb.append("FinishedAt: ").append(getFinishedAt()).append(",");
        if (getStateDetails() != null)
            sb.append("StateDetails: ").append(getStateDetails()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
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

        if (obj instanceof JobRun == false)
            return false;
        JobRun other = (JobRun) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVirtualClusterId() == null ^ this.getVirtualClusterId() == null)
            return false;
        if (other.getVirtualClusterId() != null && other.getVirtualClusterId().equals(this.getVirtualClusterId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null)
            return false;
        if (other.getReleaseLabel() != null && other.getReleaseLabel().equals(this.getReleaseLabel()) == false)
            return false;
        if (other.getConfigurationOverrides() == null ^ this.getConfigurationOverrides() == null)
            return false;
        if (other.getConfigurationOverrides() != null && other.getConfigurationOverrides().equals(this.getConfigurationOverrides()) == false)
            return false;
        if (other.getJobDriver() == null ^ this.getJobDriver() == null)
            return false;
        if (other.getJobDriver() != null && other.getJobDriver().equals(this.getJobDriver()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getFinishedAt() == null ^ this.getFinishedAt() == null)
            return false;
        if (other.getFinishedAt() != null && other.getFinishedAt().equals(this.getFinishedAt()) == false)
            return false;
        if (other.getStateDetails() == null ^ this.getStateDetails() == null)
            return false;
        if (other.getStateDetails() != null && other.getStateDetails().equals(this.getStateDetails()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVirtualClusterId() == null) ? 0 : getVirtualClusterId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getConfigurationOverrides() == null) ? 0 : getConfigurationOverrides().hashCode());
        hashCode = prime * hashCode + ((getJobDriver() == null) ? 0 : getJobDriver().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getFinishedAt() == null) ? 0 : getFinishedAt().hashCode());
        hashCode = prime * hashCode + ((getStateDetails() == null) ? 0 : getStateDetails().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public JobRun clone() {
        try {
            return (JobRun) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.JobRunMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
