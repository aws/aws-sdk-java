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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribePackageImportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePackageImportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The job's client token.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * When the job was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The job's input config.
     * </p>
     */
    private PackageImportJobInputConfig inputConfig;
    /**
     * <p>
     * The job's ID.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The job's tags.
     * </p>
     */
    private java.util.List<JobResourceTags> jobTags;
    /**
     * <p>
     * The job's type.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * When the job was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The job's output.
     * </p>
     */
    private PackageImportJobOutput output;
    /**
     * <p>
     * The job's output config.
     * </p>
     */
    private PackageImportJobOutputConfig outputConfig;
    /**
     * <p>
     * The job's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The job's status message.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The job's client token.
     * </p>
     * 
     * @param clientToken
     *        The job's client token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The job's client token.
     * </p>
     * 
     * @return The job's client token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The job's client token.
     * </p>
     * 
     * @param clientToken
     *        The job's client token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageImportJobResult withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @param createdTime
     *        When the job was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @return When the job was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * When the job was created.
     * </p>
     * 
     * @param createdTime
     *        When the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageImportJobResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The job's input config.
     * </p>
     * 
     * @param inputConfig
     *        The job's input config.
     */

    public void setInputConfig(PackageImportJobInputConfig inputConfig) {
        this.inputConfig = inputConfig;
    }

    /**
     * <p>
     * The job's input config.
     * </p>
     * 
     * @return The job's input config.
     */

    public PackageImportJobInputConfig getInputConfig() {
        return this.inputConfig;
    }

    /**
     * <p>
     * The job's input config.
     * </p>
     * 
     * @param inputConfig
     *        The job's input config.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageImportJobResult withInputConfig(PackageImportJobInputConfig inputConfig) {
        setInputConfig(inputConfig);
        return this;
    }

    /**
     * <p>
     * The job's ID.
     * </p>
     * 
     * @param jobId
     *        The job's ID.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job's ID.
     * </p>
     * 
     * @return The job's ID.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job's ID.
     * </p>
     * 
     * @param jobId
     *        The job's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageImportJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The job's tags.
     * </p>
     * 
     * @return The job's tags.
     */

    public java.util.List<JobResourceTags> getJobTags() {
        return jobTags;
    }

    /**
     * <p>
     * The job's tags.
     * </p>
     * 
     * @param jobTags
     *        The job's tags.
     */

    public void setJobTags(java.util.Collection<JobResourceTags> jobTags) {
        if (jobTags == null) {
            this.jobTags = null;
            return;
        }

        this.jobTags = new java.util.ArrayList<JobResourceTags>(jobTags);
    }

    /**
     * <p>
     * The job's tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setJobTags(java.util.Collection)} or {@link #withJobTags(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param jobTags
     *        The job's tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageImportJobResult withJobTags(JobResourceTags... jobTags) {
        if (this.jobTags == null) {
            setJobTags(new java.util.ArrayList<JobResourceTags>(jobTags.length));
        }
        for (JobResourceTags ele : jobTags) {
            this.jobTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The job's tags.
     * </p>
     * 
     * @param jobTags
     *        The job's tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageImportJobResult withJobTags(java.util.Collection<JobResourceTags> jobTags) {
        setJobTags(jobTags);
        return this;
    }

    /**
     * <p>
     * The job's type.
     * </p>
     * 
     * @param jobType
     *        The job's type.
     * @see PackageImportJobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The job's type.
     * </p>
     * 
     * @return The job's type.
     * @see PackageImportJobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * The job's type.
     * </p>
     * 
     * @param jobType
     *        The job's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageImportJobType
     */

    public DescribePackageImportJobResult withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * The job's type.
     * </p>
     * 
     * @param jobType
     *        The job's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageImportJobType
     */

    public DescribePackageImportJobResult withJobType(PackageImportJobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * When the job was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        When the job was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * When the job was updated.
     * </p>
     * 
     * @return When the job was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * When the job was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        When the job was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageImportJobResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The job's output.
     * </p>
     * 
     * @param output
     *        The job's output.
     */

    public void setOutput(PackageImportJobOutput output) {
        this.output = output;
    }

    /**
     * <p>
     * The job's output.
     * </p>
     * 
     * @return The job's output.
     */

    public PackageImportJobOutput getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The job's output.
     * </p>
     * 
     * @param output
     *        The job's output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageImportJobResult withOutput(PackageImportJobOutput output) {
        setOutput(output);
        return this;
    }

    /**
     * <p>
     * The job's output config.
     * </p>
     * 
     * @param outputConfig
     *        The job's output config.
     */

    public void setOutputConfig(PackageImportJobOutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * The job's output config.
     * </p>
     * 
     * @return The job's output config.
     */

    public PackageImportJobOutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * The job's output config.
     * </p>
     * 
     * @param outputConfig
     *        The job's output config.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageImportJobResult withOutputConfig(PackageImportJobOutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param status
     *        The job's status.
     * @see PackageImportJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @return The job's status.
     * @see PackageImportJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param status
     *        The job's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageImportJobStatus
     */

    public DescribePackageImportJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param status
     *        The job's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PackageImportJobStatus
     */

    public DescribePackageImportJobResult withStatus(PackageImportJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The job's status message.
     * </p>
     * 
     * @param statusMessage
     *        The job's status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The job's status message.
     * </p>
     * 
     * @return The job's status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The job's status message.
     * </p>
     * 
     * @param statusMessage
     *        The job's status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackageImportJobResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getInputConfig() != null)
            sb.append("InputConfig: ").append(getInputConfig()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobTags() != null)
            sb.append("JobTags: ").append(getJobTags()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append(getOutput()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePackageImportJobResult == false)
            return false;
        DescribePackageImportJobResult other = (DescribePackageImportJobResult) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getInputConfig() == null ^ this.getInputConfig() == null)
            return false;
        if (other.getInputConfig() != null && other.getInputConfig().equals(this.getInputConfig()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobTags() == null ^ this.getJobTags() == null)
            return false;
        if (other.getJobTags() != null && other.getJobTags().equals(this.getJobTags()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getInputConfig() == null) ? 0 : getInputConfig().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobTags() == null) ? 0 : getJobTags().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public DescribePackageImportJobResult clone() {
        try {
            return (DescribePackageImportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
