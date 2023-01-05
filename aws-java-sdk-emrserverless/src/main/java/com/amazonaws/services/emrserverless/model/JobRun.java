/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a job run. A job run is a unit of work, such as a Spark JAR, Hive query, or SparkSQL query, that
 * you submit to an EMR Serverless application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/JobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobRun implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the application the job is running on.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The ID of the job run.
     * </p>
     */
    private String jobRunId;
    /**
     * <p>
     * The optional job run name. This doesn't have to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The user who created the job run.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The date and time when the job run was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time when the job run was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     */
    private String executionRole;
    /**
     * <p>
     * The state of the job run.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The state details of the job run.
     * </p>
     */
    private String stateDetails;
    /**
     * <p>
     * The EMR release version associated with the application your job is running on.
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
     * The job driver for the job run.
     * </p>
     */
    private JobDriver jobDriver;
    /**
     * <p>
     * The tags assigned to the job run.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The aggregate vCPU, memory, and storage resources used from the time job start executing till the time job is
     * terminated, rounded up to the nearest second.
     * </p>
     */
    private TotalResourceUtilization totalResourceUtilization;

    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * The job run total execution duration in seconds. This field is only available for job runs in a
     * <code>COMPLETED</code>, <code>FAILED</code>, or <code>CANCELLED</code> state.
     * </p>
     */
    private Integer totalExecutionDurationSeconds;

    /**
     * <p>
     * The ID of the application the job is running on.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application the job is running on.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application the job is running on.
     * </p>
     * 
     * @return The ID of the application the job is running on.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application the job is running on.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application the job is running on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The ID of the job run.
     * </p>
     * 
     * @param jobRunId
     *        The ID of the job run.
     */

    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    /**
     * <p>
     * The ID of the job run.
     * </p>
     * 
     * @return The ID of the job run.
     */

    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * <p>
     * The ID of the job run.
     * </p>
     * 
     * @param jobRunId
     *        The ID of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withJobRunId(String jobRunId) {
        setJobRunId(jobRunId);
        return this;
    }

    /**
     * <p>
     * The optional job run name. This doesn't have to be unique.
     * </p>
     * 
     * @param name
     *        The optional job run name. This doesn't have to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The optional job run name. This doesn't have to be unique.
     * </p>
     * 
     * @return The optional job run name. This doesn't have to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The optional job run name. This doesn't have to be unique.
     * </p>
     * 
     * @param name
     *        The optional job run name. This doesn't have to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     * 
     * @param arn
     *        The execution role ARN of the job run.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     * 
     * @return The execution role ARN of the job run.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     * 
     * @param arn
     *        The execution role ARN of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withArn(String arn) {
        setArn(arn);
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
     * The date and time when the job run was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the job run was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time when the job run was updated.
     * </p>
     * 
     * @return The date and time when the job run was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time when the job run was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time when the job run was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     * 
     * @param executionRole
     *        The execution role ARN of the job run.
     */

    public void setExecutionRole(String executionRole) {
        this.executionRole = executionRole;
    }

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     * 
     * @return The execution role ARN of the job run.
     */

    public String getExecutionRole() {
        return this.executionRole;
    }

    /**
     * <p>
     * The execution role ARN of the job run.
     * </p>
     * 
     * @param executionRole
     *        The execution role ARN of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withExecutionRole(String executionRole) {
        setExecutionRole(executionRole);
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
     * The state details of the job run.
     * </p>
     * 
     * @param stateDetails
     *        The state details of the job run.
     */

    public void setStateDetails(String stateDetails) {
        this.stateDetails = stateDetails;
    }

    /**
     * <p>
     * The state details of the job run.
     * </p>
     * 
     * @return The state details of the job run.
     */

    public String getStateDetails() {
        return this.stateDetails;
    }

    /**
     * <p>
     * The state details of the job run.
     * </p>
     * 
     * @param stateDetails
     *        The state details of the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withStateDetails(String stateDetails) {
        setStateDetails(stateDetails);
        return this;
    }

    /**
     * <p>
     * The EMR release version associated with the application your job is running on.
     * </p>
     * 
     * @param releaseLabel
     *        The EMR release version associated with the application your job is running on.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The EMR release version associated with the application your job is running on.
     * </p>
     * 
     * @return The EMR release version associated with the application your job is running on.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * The EMR release version associated with the application your job is running on.
     * </p>
     * 
     * @param releaseLabel
     *        The EMR release version associated with the application your job is running on.
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
     * The job driver for the job run.
     * </p>
     * 
     * @param jobDriver
     *        The job driver for the job run.
     */

    public void setJobDriver(JobDriver jobDriver) {
        this.jobDriver = jobDriver;
    }

    /**
     * <p>
     * The job driver for the job run.
     * </p>
     * 
     * @return The job driver for the job run.
     */

    public JobDriver getJobDriver() {
        return this.jobDriver;
    }

    /**
     * <p>
     * The job driver for the job run.
     * </p>
     * 
     * @param jobDriver
     *        The job driver for the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withJobDriver(JobDriver jobDriver) {
        setJobDriver(jobDriver);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the job run.
     * </p>
     * 
     * @return The tags assigned to the job run.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the job run.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the job run.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the job run.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the job run.
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
     * <p>
     * The aggregate vCPU, memory, and storage resources used from the time job start executing till the time job is
     * terminated, rounded up to the nearest second.
     * </p>
     * 
     * @param totalResourceUtilization
     *        The aggregate vCPU, memory, and storage resources used from the time job start executing till the time job
     *        is terminated, rounded up to the nearest second.
     */

    public void setTotalResourceUtilization(TotalResourceUtilization totalResourceUtilization) {
        this.totalResourceUtilization = totalResourceUtilization;
    }

    /**
     * <p>
     * The aggregate vCPU, memory, and storage resources used from the time job start executing till the time job is
     * terminated, rounded up to the nearest second.
     * </p>
     * 
     * @return The aggregate vCPU, memory, and storage resources used from the time job start executing till the time
     *         job is terminated, rounded up to the nearest second.
     */

    public TotalResourceUtilization getTotalResourceUtilization() {
        return this.totalResourceUtilization;
    }

    /**
     * <p>
     * The aggregate vCPU, memory, and storage resources used from the time job start executing till the time job is
     * terminated, rounded up to the nearest second.
     * </p>
     * 
     * @param totalResourceUtilization
     *        The aggregate vCPU, memory, and storage resources used from the time job start executing till the time job
     *        is terminated, rounded up to the nearest second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withTotalResourceUtilization(TotalResourceUtilization totalResourceUtilization) {
        setTotalResourceUtilization(totalResourceUtilization);
        return this;
    }

    /**
     * @param networkConfiguration
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * @return
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * @param networkConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * The job run total execution duration in seconds. This field is only available for job runs in a
     * <code>COMPLETED</code>, <code>FAILED</code>, or <code>CANCELLED</code> state.
     * </p>
     * 
     * @param totalExecutionDurationSeconds
     *        The job run total execution duration in seconds. This field is only available for job runs in a
     *        <code>COMPLETED</code>, <code>FAILED</code>, or <code>CANCELLED</code> state.
     */

    public void setTotalExecutionDurationSeconds(Integer totalExecutionDurationSeconds) {
        this.totalExecutionDurationSeconds = totalExecutionDurationSeconds;
    }

    /**
     * <p>
     * The job run total execution duration in seconds. This field is only available for job runs in a
     * <code>COMPLETED</code>, <code>FAILED</code>, or <code>CANCELLED</code> state.
     * </p>
     * 
     * @return The job run total execution duration in seconds. This field is only available for job runs in a
     *         <code>COMPLETED</code>, <code>FAILED</code>, or <code>CANCELLED</code> state.
     */

    public Integer getTotalExecutionDurationSeconds() {
        return this.totalExecutionDurationSeconds;
    }

    /**
     * <p>
     * The job run total execution duration in seconds. This field is only available for job runs in a
     * <code>COMPLETED</code>, <code>FAILED</code>, or <code>CANCELLED</code> state.
     * </p>
     * 
     * @param totalExecutionDurationSeconds
     *        The job run total execution duration in seconds. This field is only available for job runs in a
     *        <code>COMPLETED</code>, <code>FAILED</code>, or <code>CANCELLED</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRun withTotalExecutionDurationSeconds(Integer totalExecutionDurationSeconds) {
        setTotalExecutionDurationSeconds(totalExecutionDurationSeconds);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getJobRunId() != null)
            sb.append("JobRunId: ").append(getJobRunId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getExecutionRole() != null)
            sb.append("ExecutionRole: ").append(getExecutionRole()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateDetails() != null)
            sb.append("StateDetails: ").append(getStateDetails()).append(",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: ").append(getReleaseLabel()).append(",");
        if (getConfigurationOverrides() != null)
            sb.append("ConfigurationOverrides: ").append(getConfigurationOverrides()).append(",");
        if (getJobDriver() != null)
            sb.append("JobDriver: ").append(getJobDriver()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTotalResourceUtilization() != null)
            sb.append("TotalResourceUtilization: ").append(getTotalResourceUtilization()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getTotalExecutionDurationSeconds() != null)
            sb.append("TotalExecutionDurationSeconds: ").append(getTotalExecutionDurationSeconds());
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
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getJobRunId() == null ^ this.getJobRunId() == null)
            return false;
        if (other.getJobRunId() != null && other.getJobRunId().equals(this.getJobRunId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getExecutionRole() == null ^ this.getExecutionRole() == null)
            return false;
        if (other.getExecutionRole() != null && other.getExecutionRole().equals(this.getExecutionRole()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateDetails() == null ^ this.getStateDetails() == null)
            return false;
        if (other.getStateDetails() != null && other.getStateDetails().equals(this.getStateDetails()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTotalResourceUtilization() == null ^ this.getTotalResourceUtilization() == null)
            return false;
        if (other.getTotalResourceUtilization() != null && other.getTotalResourceUtilization().equals(this.getTotalResourceUtilization()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getTotalExecutionDurationSeconds() == null ^ this.getTotalExecutionDurationSeconds() == null)
            return false;
        if (other.getTotalExecutionDurationSeconds() != null
                && other.getTotalExecutionDurationSeconds().equals(this.getTotalExecutionDurationSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getJobRunId() == null) ? 0 : getJobRunId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getExecutionRole() == null) ? 0 : getExecutionRole().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateDetails() == null) ? 0 : getStateDetails().hashCode());
        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getConfigurationOverrides() == null) ? 0 : getConfigurationOverrides().hashCode());
        hashCode = prime * hashCode + ((getJobDriver() == null) ? 0 : getJobDriver().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTotalResourceUtilization() == null) ? 0 : getTotalResourceUtilization().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTotalExecutionDurationSeconds() == null) ? 0 : getTotalExecutionDurationSeconds().hashCode());
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
        com.amazonaws.services.emrserverless.model.transform.JobRunMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
