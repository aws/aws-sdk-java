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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/DescribeNodeFromTemplateJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNodeFromTemplateJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * When the job was created.
     * </p>
     */
    private java.util.Date createdTime;
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
     * When the job was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The node's description.
     * </p>
     */
    private String nodeDescription;
    /**
     * <p>
     * The node's name.
     * </p>
     */
    private String nodeName;
    /**
     * <p>
     * The job's output package name.
     * </p>
     */
    private String outputPackageName;
    /**
     * <p>
     * The job's output package version.
     * </p>
     */
    private String outputPackageVersion;
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
     * The job's template parameters.
     * </p>
     */
    private java.util.Map<String, String> templateParameters;
    /**
     * <p>
     * The job's template type.
     * </p>
     */
    private String templateType;

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

    public DescribeNodeFromTemplateJobResult withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
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

    public DescribeNodeFromTemplateJobResult withJobId(String jobId) {
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

    public DescribeNodeFromTemplateJobResult withJobTags(JobResourceTags... jobTags) {
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

    public DescribeNodeFromTemplateJobResult withJobTags(java.util.Collection<JobResourceTags> jobTags) {
        setJobTags(jobTags);
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

    public DescribeNodeFromTemplateJobResult withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The node's description.
     * </p>
     * 
     * @param nodeDescription
     *        The node's description.
     */

    public void setNodeDescription(String nodeDescription) {
        this.nodeDescription = nodeDescription;
    }

    /**
     * <p>
     * The node's description.
     * </p>
     * 
     * @return The node's description.
     */

    public String getNodeDescription() {
        return this.nodeDescription;
    }

    /**
     * <p>
     * The node's description.
     * </p>
     * 
     * @param nodeDescription
     *        The node's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeFromTemplateJobResult withNodeDescription(String nodeDescription) {
        setNodeDescription(nodeDescription);
        return this;
    }

    /**
     * <p>
     * The node's name.
     * </p>
     * 
     * @param nodeName
     *        The node's name.
     */

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * <p>
     * The node's name.
     * </p>
     * 
     * @return The node's name.
     */

    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * <p>
     * The node's name.
     * </p>
     * 
     * @param nodeName
     *        The node's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeFromTemplateJobResult withNodeName(String nodeName) {
        setNodeName(nodeName);
        return this;
    }

    /**
     * <p>
     * The job's output package name.
     * </p>
     * 
     * @param outputPackageName
     *        The job's output package name.
     */

    public void setOutputPackageName(String outputPackageName) {
        this.outputPackageName = outputPackageName;
    }

    /**
     * <p>
     * The job's output package name.
     * </p>
     * 
     * @return The job's output package name.
     */

    public String getOutputPackageName() {
        return this.outputPackageName;
    }

    /**
     * <p>
     * The job's output package name.
     * </p>
     * 
     * @param outputPackageName
     *        The job's output package name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeFromTemplateJobResult withOutputPackageName(String outputPackageName) {
        setOutputPackageName(outputPackageName);
        return this;
    }

    /**
     * <p>
     * The job's output package version.
     * </p>
     * 
     * @param outputPackageVersion
     *        The job's output package version.
     */

    public void setOutputPackageVersion(String outputPackageVersion) {
        this.outputPackageVersion = outputPackageVersion;
    }

    /**
     * <p>
     * The job's output package version.
     * </p>
     * 
     * @return The job's output package version.
     */

    public String getOutputPackageVersion() {
        return this.outputPackageVersion;
    }

    /**
     * <p>
     * The job's output package version.
     * </p>
     * 
     * @param outputPackageVersion
     *        The job's output package version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeFromTemplateJobResult withOutputPackageVersion(String outputPackageVersion) {
        setOutputPackageVersion(outputPackageVersion);
        return this;
    }

    /**
     * <p>
     * The job's status.
     * </p>
     * 
     * @param status
     *        The job's status.
     * @see NodeFromTemplateJobStatus
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
     * @see NodeFromTemplateJobStatus
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
     * @see NodeFromTemplateJobStatus
     */

    public DescribeNodeFromTemplateJobResult withStatus(String status) {
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
     * @see NodeFromTemplateJobStatus
     */

    public DescribeNodeFromTemplateJobResult withStatus(NodeFromTemplateJobStatus status) {
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

    public DescribeNodeFromTemplateJobResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The job's template parameters.
     * </p>
     * 
     * @return The job's template parameters.
     */

    public java.util.Map<String, String> getTemplateParameters() {
        return templateParameters;
    }

    /**
     * <p>
     * The job's template parameters.
     * </p>
     * 
     * @param templateParameters
     *        The job's template parameters.
     */

    public void setTemplateParameters(java.util.Map<String, String> templateParameters) {
        this.templateParameters = templateParameters;
    }

    /**
     * <p>
     * The job's template parameters.
     * </p>
     * 
     * @param templateParameters
     *        The job's template parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeFromTemplateJobResult withTemplateParameters(java.util.Map<String, String> templateParameters) {
        setTemplateParameters(templateParameters);
        return this;
    }

    /**
     * Add a single TemplateParameters entry
     *
     * @see DescribeNodeFromTemplateJobResult#withTemplateParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeFromTemplateJobResult addTemplateParametersEntry(String key, String value) {
        if (null == this.templateParameters) {
            this.templateParameters = new java.util.HashMap<String, String>();
        }
        if (this.templateParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.templateParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TemplateParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNodeFromTemplateJobResult clearTemplateParametersEntries() {
        this.templateParameters = null;
        return this;
    }

    /**
     * <p>
     * The job's template type.
     * </p>
     * 
     * @param templateType
     *        The job's template type.
     * @see TemplateType
     */

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The job's template type.
     * </p>
     * 
     * @return The job's template type.
     * @see TemplateType
     */

    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * <p>
     * The job's template type.
     * </p>
     * 
     * @param templateType
     *        The job's template type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateType
     */

    public DescribeNodeFromTemplateJobResult withTemplateType(String templateType) {
        setTemplateType(templateType);
        return this;
    }

    /**
     * <p>
     * The job's template type.
     * </p>
     * 
     * @param templateType
     *        The job's template type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemplateType
     */

    public DescribeNodeFromTemplateJobResult withTemplateType(TemplateType templateType) {
        this.templateType = templateType.toString();
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
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobTags() != null)
            sb.append("JobTags: ").append(getJobTags()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getNodeDescription() != null)
            sb.append("NodeDescription: ").append(getNodeDescription()).append(",");
        if (getNodeName() != null)
            sb.append("NodeName: ").append(getNodeName()).append(",");
        if (getOutputPackageName() != null)
            sb.append("OutputPackageName: ").append(getOutputPackageName()).append(",");
        if (getOutputPackageVersion() != null)
            sb.append("OutputPackageVersion: ").append(getOutputPackageVersion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getTemplateParameters() != null)
            sb.append("TemplateParameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getTemplateType() != null)
            sb.append("TemplateType: ").append(getTemplateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNodeFromTemplateJobResult == false)
            return false;
        DescribeNodeFromTemplateJobResult other = (DescribeNodeFromTemplateJobResult) obj;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobTags() == null ^ this.getJobTags() == null)
            return false;
        if (other.getJobTags() != null && other.getJobTags().equals(this.getJobTags()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getNodeDescription() == null ^ this.getNodeDescription() == null)
            return false;
        if (other.getNodeDescription() != null && other.getNodeDescription().equals(this.getNodeDescription()) == false)
            return false;
        if (other.getNodeName() == null ^ this.getNodeName() == null)
            return false;
        if (other.getNodeName() != null && other.getNodeName().equals(this.getNodeName()) == false)
            return false;
        if (other.getOutputPackageName() == null ^ this.getOutputPackageName() == null)
            return false;
        if (other.getOutputPackageName() != null && other.getOutputPackageName().equals(this.getOutputPackageName()) == false)
            return false;
        if (other.getOutputPackageVersion() == null ^ this.getOutputPackageVersion() == null)
            return false;
        if (other.getOutputPackageVersion() != null && other.getOutputPackageVersion().equals(this.getOutputPackageVersion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getTemplateParameters() == null ^ this.getTemplateParameters() == null)
            return false;
        if (other.getTemplateParameters() != null && other.getTemplateParameters().equals(this.getTemplateParameters()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobTags() == null) ? 0 : getJobTags().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getNodeDescription() == null) ? 0 : getNodeDescription().hashCode());
        hashCode = prime * hashCode + ((getNodeName() == null) ? 0 : getNodeName().hashCode());
        hashCode = prime * hashCode + ((getOutputPackageName() == null) ? 0 : getOutputPackageName().hashCode());
        hashCode = prime * hashCode + ((getOutputPackageVersion() == null) ? 0 : getOutputPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getTemplateParameters() == null) ? 0 : getTemplateParameters().hashCode());
        hashCode = prime * hashCode + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNodeFromTemplateJobResult clone() {
        try {
            return (DescribeNodeFromTemplateJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
