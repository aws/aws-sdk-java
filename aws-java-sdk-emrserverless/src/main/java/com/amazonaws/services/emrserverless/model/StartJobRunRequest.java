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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/StartJobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartJobRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application on which to run the job.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The client idempotency token of the job run to start. Its value must be unique for each request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The execution role ARN for the job run.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The job driver for the job run.
     * </p>
     */
    private JobDriver jobDriver;
    /**
     * <p>
     * The configuration overrides for the job run.
     * </p>
     */
    private ConfigurationOverrides configurationOverrides;
    /**
     * <p>
     * The tags assigned to the job run.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The maximum duration for the job run to run. If the job run runs beyond this duration, it will be automatically
     * cancelled.
     * </p>
     */
    private Long executionTimeoutMinutes;
    /**
     * <p>
     * The optional job run name. This doesn't have to be unique.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ID of the application on which to run the job.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application on which to run the job.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application on which to run the job.
     * </p>
     * 
     * @return The ID of the application on which to run the job.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application on which to run the job.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application on which to run the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The client idempotency token of the job run to start. Its value must be unique for each request.
     * </p>
     * 
     * @param clientToken
     *        The client idempotency token of the job run to start. Its value must be unique for each request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client idempotency token of the job run to start. Its value must be unique for each request.
     * </p>
     * 
     * @return The client idempotency token of the job run to start. Its value must be unique for each request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client idempotency token of the job run to start. Its value must be unique for each request.
     * </p>
     * 
     * @param clientToken
     *        The client idempotency token of the job run to start. Its value must be unique for each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The execution role ARN for the job run.
     * </p>
     * 
     * @param executionRoleArn
     *        The execution role ARN for the job run.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The execution role ARN for the job run.
     * </p>
     * 
     * @return The execution role ARN for the job run.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The execution role ARN for the job run.
     * </p>
     * 
     * @param executionRoleArn
     *        The execution role ARN for the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
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

    public StartJobRunRequest withJobDriver(JobDriver jobDriver) {
        setJobDriver(jobDriver);
        return this;
    }

    /**
     * <p>
     * The configuration overrides for the job run.
     * </p>
     * 
     * @param configurationOverrides
     *        The configuration overrides for the job run.
     */

    public void setConfigurationOverrides(ConfigurationOverrides configurationOverrides) {
        this.configurationOverrides = configurationOverrides;
    }

    /**
     * <p>
     * The configuration overrides for the job run.
     * </p>
     * 
     * @return The configuration overrides for the job run.
     */

    public ConfigurationOverrides getConfigurationOverrides() {
        return this.configurationOverrides;
    }

    /**
     * <p>
     * The configuration overrides for the job run.
     * </p>
     * 
     * @param configurationOverrides
     *        The configuration overrides for the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withConfigurationOverrides(ConfigurationOverrides configurationOverrides) {
        setConfigurationOverrides(configurationOverrides);
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

    public StartJobRunRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartJobRunRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest addTagsEntry(String key, String value) {
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

    public StartJobRunRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The maximum duration for the job run to run. If the job run runs beyond this duration, it will be automatically
     * cancelled.
     * </p>
     * 
     * @param executionTimeoutMinutes
     *        The maximum duration for the job run to run. If the job run runs beyond this duration, it will be
     *        automatically cancelled.
     */

    public void setExecutionTimeoutMinutes(Long executionTimeoutMinutes) {
        this.executionTimeoutMinutes = executionTimeoutMinutes;
    }

    /**
     * <p>
     * The maximum duration for the job run to run. If the job run runs beyond this duration, it will be automatically
     * cancelled.
     * </p>
     * 
     * @return The maximum duration for the job run to run. If the job run runs beyond this duration, it will be
     *         automatically cancelled.
     */

    public Long getExecutionTimeoutMinutes() {
        return this.executionTimeoutMinutes;
    }

    /**
     * <p>
     * The maximum duration for the job run to run. If the job run runs beyond this duration, it will be automatically
     * cancelled.
     * </p>
     * 
     * @param executionTimeoutMinutes
     *        The maximum duration for the job run to run. If the job run runs beyond this duration, it will be
     *        automatically cancelled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withExecutionTimeoutMinutes(Long executionTimeoutMinutes) {
        setExecutionTimeoutMinutes(executionTimeoutMinutes);
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

    public StartJobRunRequest withName(String name) {
        setName(name);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getJobDriver() != null)
            sb.append("JobDriver: ").append(getJobDriver()).append(",");
        if (getConfigurationOverrides() != null)
            sb.append("ConfigurationOverrides: ").append(getConfigurationOverrides()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getExecutionTimeoutMinutes() != null)
            sb.append("ExecutionTimeoutMinutes: ").append(getExecutionTimeoutMinutes()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartJobRunRequest == false)
            return false;
        StartJobRunRequest other = (StartJobRunRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getJobDriver() == null ^ this.getJobDriver() == null)
            return false;
        if (other.getJobDriver() != null && other.getJobDriver().equals(this.getJobDriver()) == false)
            return false;
        if (other.getConfigurationOverrides() == null ^ this.getConfigurationOverrides() == null)
            return false;
        if (other.getConfigurationOverrides() != null && other.getConfigurationOverrides().equals(this.getConfigurationOverrides()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getExecutionTimeoutMinutes() == null ^ this.getExecutionTimeoutMinutes() == null)
            return false;
        if (other.getExecutionTimeoutMinutes() != null && other.getExecutionTimeoutMinutes().equals(this.getExecutionTimeoutMinutes()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getJobDriver() == null) ? 0 : getJobDriver().hashCode());
        hashCode = prime * hashCode + ((getConfigurationOverrides() == null) ? 0 : getConfigurationOverrides().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getExecutionTimeoutMinutes() == null) ? 0 : getExecutionTimeoutMinutes().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public StartJobRunRequest clone() {
        return (StartJobRunRequest) super.clone();
    }

}
