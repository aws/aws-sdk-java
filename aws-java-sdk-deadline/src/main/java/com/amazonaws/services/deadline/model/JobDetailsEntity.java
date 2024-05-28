/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The job details for a specific job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/JobDetailsEntity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobDetailsEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The job attachment settings.
     * </p>
     */
    private JobAttachmentSettings jobAttachmentSettings;
    /**
     * <p>
     * The job ID.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The user name and group that the job uses when run.
     * </p>
     */
    private JobRunAsUser jobRunAsUser;
    /**
     * <p>
     * The log group name.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The parameters.
     * </p>
     */
    private java.util.Map<String, JobParameter> parameters;
    /**
     * <p>
     * The path mapping rules.
     * </p>
     */
    private java.util.List<PathMappingRule> pathMappingRules;
    /**
     * <p>
     * The queue role ARN.
     * </p>
     */
    private String queueRoleArn;
    /**
     * <p>
     * The schema version.
     * </p>
     */
    private String schemaVersion;

    /**
     * <p>
     * The job attachment settings.
     * </p>
     * 
     * @param jobAttachmentSettings
     *        The job attachment settings.
     */

    public void setJobAttachmentSettings(JobAttachmentSettings jobAttachmentSettings) {
        this.jobAttachmentSettings = jobAttachmentSettings;
    }

    /**
     * <p>
     * The job attachment settings.
     * </p>
     * 
     * @return The job attachment settings.
     */

    public JobAttachmentSettings getJobAttachmentSettings() {
        return this.jobAttachmentSettings;
    }

    /**
     * <p>
     * The job attachment settings.
     * </p>
     * 
     * @param jobAttachmentSettings
     *        The job attachment settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetailsEntity withJobAttachmentSettings(JobAttachmentSettings jobAttachmentSettings) {
        setJobAttachmentSettings(jobAttachmentSettings);
        return this;
    }

    /**
     * <p>
     * The job ID.
     * </p>
     * 
     * @param jobId
     *        The job ID.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID.
     * </p>
     * 
     * @return The job ID.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID.
     * </p>
     * 
     * @param jobId
     *        The job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetailsEntity withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The user name and group that the job uses when run.
     * </p>
     * 
     * @param jobRunAsUser
     *        The user name and group that the job uses when run.
     */

    public void setJobRunAsUser(JobRunAsUser jobRunAsUser) {
        this.jobRunAsUser = jobRunAsUser;
    }

    /**
     * <p>
     * The user name and group that the job uses when run.
     * </p>
     * 
     * @return The user name and group that the job uses when run.
     */

    public JobRunAsUser getJobRunAsUser() {
        return this.jobRunAsUser;
    }

    /**
     * <p>
     * The user name and group that the job uses when run.
     * </p>
     * 
     * @param jobRunAsUser
     *        The user name and group that the job uses when run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetailsEntity withJobRunAsUser(JobRunAsUser jobRunAsUser) {
        setJobRunAsUser(jobRunAsUser);
        return this;
    }

    /**
     * <p>
     * The log group name.
     * </p>
     * 
     * @param logGroupName
     *        The log group name.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The log group name.
     * </p>
     * 
     * @return The log group name.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The log group name.
     * </p>
     * 
     * @param logGroupName
     *        The log group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetailsEntity withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The parameters.
     * </p>
     * 
     * @return The parameters.
     */

    public java.util.Map<String, JobParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters.
     * </p>
     * 
     * @param parameters
     *        The parameters.
     */

    public void setParameters(java.util.Map<String, JobParameter> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters.
     * </p>
     * 
     * @param parameters
     *        The parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetailsEntity withParameters(java.util.Map<String, JobParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see JobDetailsEntity#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public JobDetailsEntity addParametersEntry(String key, JobParameter value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, JobParameter>();
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

    public JobDetailsEntity clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The path mapping rules.
     * </p>
     * 
     * @return The path mapping rules.
     */

    public java.util.List<PathMappingRule> getPathMappingRules() {
        return pathMappingRules;
    }

    /**
     * <p>
     * The path mapping rules.
     * </p>
     * 
     * @param pathMappingRules
     *        The path mapping rules.
     */

    public void setPathMappingRules(java.util.Collection<PathMappingRule> pathMappingRules) {
        if (pathMappingRules == null) {
            this.pathMappingRules = null;
            return;
        }

        this.pathMappingRules = new java.util.ArrayList<PathMappingRule>(pathMappingRules);
    }

    /**
     * <p>
     * The path mapping rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPathMappingRules(java.util.Collection)} or {@link #withPathMappingRules(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pathMappingRules
     *        The path mapping rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetailsEntity withPathMappingRules(PathMappingRule... pathMappingRules) {
        if (this.pathMappingRules == null) {
            setPathMappingRules(new java.util.ArrayList<PathMappingRule>(pathMappingRules.length));
        }
        for (PathMappingRule ele : pathMappingRules) {
            this.pathMappingRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The path mapping rules.
     * </p>
     * 
     * @param pathMappingRules
     *        The path mapping rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetailsEntity withPathMappingRules(java.util.Collection<PathMappingRule> pathMappingRules) {
        setPathMappingRules(pathMappingRules);
        return this;
    }

    /**
     * <p>
     * The queue role ARN.
     * </p>
     * 
     * @param queueRoleArn
     *        The queue role ARN.
     */

    public void setQueueRoleArn(String queueRoleArn) {
        this.queueRoleArn = queueRoleArn;
    }

    /**
     * <p>
     * The queue role ARN.
     * </p>
     * 
     * @return The queue role ARN.
     */

    public String getQueueRoleArn() {
        return this.queueRoleArn;
    }

    /**
     * <p>
     * The queue role ARN.
     * </p>
     * 
     * @param queueRoleArn
     *        The queue role ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetailsEntity withQueueRoleArn(String queueRoleArn) {
        setQueueRoleArn(queueRoleArn);
        return this;
    }

    /**
     * <p>
     * The schema version.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version.
     */

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The schema version.
     * </p>
     * 
     * @return The schema version.
     */

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * <p>
     * The schema version.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetailsEntity withSchemaVersion(String schemaVersion) {
        setSchemaVersion(schemaVersion);
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
        if (getJobAttachmentSettings() != null)
            sb.append("JobAttachmentSettings: ").append(getJobAttachmentSettings()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobRunAsUser() != null)
            sb.append("JobRunAsUser: ").append(getJobRunAsUser()).append(",");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append("***Sensitive Data Redacted***").append(",");
        if (getPathMappingRules() != null)
            sb.append("PathMappingRules: ").append("***Sensitive Data Redacted***").append(",");
        if (getQueueRoleArn() != null)
            sb.append("QueueRoleArn: ").append(getQueueRoleArn()).append(",");
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: ").append(getSchemaVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobDetailsEntity == false)
            return false;
        JobDetailsEntity other = (JobDetailsEntity) obj;
        if (other.getJobAttachmentSettings() == null ^ this.getJobAttachmentSettings() == null)
            return false;
        if (other.getJobAttachmentSettings() != null && other.getJobAttachmentSettings().equals(this.getJobAttachmentSettings()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobRunAsUser() == null ^ this.getJobRunAsUser() == null)
            return false;
        if (other.getJobRunAsUser() != null && other.getJobRunAsUser().equals(this.getJobRunAsUser()) == false)
            return false;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getPathMappingRules() == null ^ this.getPathMappingRules() == null)
            return false;
        if (other.getPathMappingRules() != null && other.getPathMappingRules().equals(this.getPathMappingRules()) == false)
            return false;
        if (other.getQueueRoleArn() == null ^ this.getQueueRoleArn() == null)
            return false;
        if (other.getQueueRoleArn() != null && other.getQueueRoleArn().equals(this.getQueueRoleArn()) == false)
            return false;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobAttachmentSettings() == null) ? 0 : getJobAttachmentSettings().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobRunAsUser() == null) ? 0 : getJobRunAsUser().hashCode());
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getPathMappingRules() == null) ? 0 : getPathMappingRules().hashCode());
        hashCode = prime * hashCode + ((getQueueRoleArn() == null) ? 0 : getQueueRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        return hashCode;
    }

    @Override
    public JobDetailsEntity clone() {
        try {
            return (JobDetailsEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.JobDetailsEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
