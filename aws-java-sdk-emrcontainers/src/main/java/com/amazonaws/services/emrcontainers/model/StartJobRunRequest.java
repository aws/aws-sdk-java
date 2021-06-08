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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/StartJobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartJobRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the job run.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The virtual cluster ID for which the job run request is submitted.
     * </p>
     */
    private String virtualClusterId;
    /**
     * <p>
     * The client idempotency token of the job run request.
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
     * The Amazon EMR release version to use for the job run.
     * </p>
     */
    private String releaseLabel;
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
     * The tags assigned to job runs.
     * </p>
     */
    private java.util.Map<String, String> tags;

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

    public StartJobRunRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The virtual cluster ID for which the job run request is submitted.
     * </p>
     * 
     * @param virtualClusterId
     *        The virtual cluster ID for which the job run request is submitted.
     */

    public void setVirtualClusterId(String virtualClusterId) {
        this.virtualClusterId = virtualClusterId;
    }

    /**
     * <p>
     * The virtual cluster ID for which the job run request is submitted.
     * </p>
     * 
     * @return The virtual cluster ID for which the job run request is submitted.
     */

    public String getVirtualClusterId() {
        return this.virtualClusterId;
    }

    /**
     * <p>
     * The virtual cluster ID for which the job run request is submitted.
     * </p>
     * 
     * @param virtualClusterId
     *        The virtual cluster ID for which the job run request is submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withVirtualClusterId(String virtualClusterId) {
        setVirtualClusterId(virtualClusterId);
        return this;
    }

    /**
     * <p>
     * The client idempotency token of the job run request.
     * </p>
     * 
     * @param clientToken
     *        The client idempotency token of the job run request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client idempotency token of the job run request.
     * </p>
     * 
     * @return The client idempotency token of the job run request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client idempotency token of the job run request.
     * </p>
     * 
     * @param clientToken
     *        The client idempotency token of the job run request.
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
     * The Amazon EMR release version to use for the job run.
     * </p>
     * 
     * @param releaseLabel
     *        The Amazon EMR release version to use for the job run.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The Amazon EMR release version to use for the job run.
     * </p>
     * 
     * @return The Amazon EMR release version to use for the job run.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * The Amazon EMR release version to use for the job run.
     * </p>
     * 
     * @param releaseLabel
     *        The Amazon EMR release version to use for the job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartJobRunRequest withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
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
     * The tags assigned to job runs.
     * </p>
     * 
     * @return The tags assigned to job runs.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to job runs.
     * </p>
     * 
     * @param tags
     *        The tags assigned to job runs.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to job runs.
     * </p>
     * 
     * @param tags
     *        The tags assigned to job runs.
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVirtualClusterId() != null)
            sb.append("VirtualClusterId: ").append(getVirtualClusterId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: ").append(getReleaseLabel()).append(",");
        if (getJobDriver() != null)
            sb.append("JobDriver: ").append(getJobDriver()).append(",");
        if (getConfigurationOverrides() != null)
            sb.append("ConfigurationOverrides: ").append(getConfigurationOverrides()).append(",");
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

        if (obj instanceof StartJobRunRequest == false)
            return false;
        StartJobRunRequest other = (StartJobRunRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVirtualClusterId() == null ^ this.getVirtualClusterId() == null)
            return false;
        if (other.getVirtualClusterId() != null && other.getVirtualClusterId().equals(this.getVirtualClusterId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVirtualClusterId() == null) ? 0 : getVirtualClusterId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getJobDriver() == null) ? 0 : getJobDriver().hashCode());
        hashCode = prime * hashCode + ((getConfigurationOverrides() == null) ? 0 : getConfigurationOverrides().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartJobRunRequest clone() {
        return (StartJobRunRequest) super.clone();
    }

}
