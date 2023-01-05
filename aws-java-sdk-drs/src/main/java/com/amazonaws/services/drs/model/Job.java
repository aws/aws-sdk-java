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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A job is an asynchronous workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/Job" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Job implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of a Job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time of when the Job was created.
     * </p>
     */
    private String creationDateTime;
    /**
     * <p>
     * The date and time of when the Job ended.
     * </p>
     */
    private String endDateTime;
    /**
     * <p>
     * A string representing who initiated the Job.
     * </p>
     */
    private String initiatedBy;
    /**
     * <p>
     * The ID of the Job.
     * </p>
     */
    private String jobID;
    /**
     * <p>
     * A list of servers that the Job is acting upon.
     * </p>
     */
    private java.util.List<ParticipatingServer> participatingServers;
    /**
     * <p>
     * The status of the Job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A list of tags associated with the Job.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The type of the Job.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ARN of a Job.
     * </p>
     * 
     * @param arn
     *        The ARN of a Job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of a Job.
     * </p>
     * 
     * @return The ARN of a Job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of a Job.
     * </p>
     * 
     * @param arn
     *        The ARN of a Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time of when the Job was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time of when the Job was created.
     */

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time of when the Job was created.
     * </p>
     * 
     * @return The date and time of when the Job was created.
     */

    public String getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time of when the Job was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time of when the Job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCreationDateTime(String creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time of when the Job ended.
     * </p>
     * 
     * @param endDateTime
     *        The date and time of when the Job ended.
     */

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The date and time of when the Job ended.
     * </p>
     * 
     * @return The date and time of when the Job ended.
     */

    public String getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * The date and time of when the Job ended.
     * </p>
     * 
     * @param endDateTime
     *        The date and time of when the Job ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withEndDateTime(String endDateTime) {
        setEndDateTime(endDateTime);
        return this;
    }

    /**
     * <p>
     * A string representing who initiated the Job.
     * </p>
     * 
     * @param initiatedBy
     *        A string representing who initiated the Job.
     * @see InitiatedBy
     */

    public void setInitiatedBy(String initiatedBy) {
        this.initiatedBy = initiatedBy;
    }

    /**
     * <p>
     * A string representing who initiated the Job.
     * </p>
     * 
     * @return A string representing who initiated the Job.
     * @see InitiatedBy
     */

    public String getInitiatedBy() {
        return this.initiatedBy;
    }

    /**
     * <p>
     * A string representing who initiated the Job.
     * </p>
     * 
     * @param initiatedBy
     *        A string representing who initiated the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InitiatedBy
     */

    public Job withInitiatedBy(String initiatedBy) {
        setInitiatedBy(initiatedBy);
        return this;
    }

    /**
     * <p>
     * A string representing who initiated the Job.
     * </p>
     * 
     * @param initiatedBy
     *        A string representing who initiated the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InitiatedBy
     */

    public Job withInitiatedBy(InitiatedBy initiatedBy) {
        this.initiatedBy = initiatedBy.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the Job.
     * </p>
     * 
     * @param jobID
     *        The ID of the Job.
     */

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    /**
     * <p>
     * The ID of the Job.
     * </p>
     * 
     * @return The ID of the Job.
     */

    public String getJobID() {
        return this.jobID;
    }

    /**
     * <p>
     * The ID of the Job.
     * </p>
     * 
     * @param jobID
     *        The ID of the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withJobID(String jobID) {
        setJobID(jobID);
        return this;
    }

    /**
     * <p>
     * A list of servers that the Job is acting upon.
     * </p>
     * 
     * @return A list of servers that the Job is acting upon.
     */

    public java.util.List<ParticipatingServer> getParticipatingServers() {
        return participatingServers;
    }

    /**
     * <p>
     * A list of servers that the Job is acting upon.
     * </p>
     * 
     * @param participatingServers
     *        A list of servers that the Job is acting upon.
     */

    public void setParticipatingServers(java.util.Collection<ParticipatingServer> participatingServers) {
        if (participatingServers == null) {
            this.participatingServers = null;
            return;
        }

        this.participatingServers = new java.util.ArrayList<ParticipatingServer>(participatingServers);
    }

    /**
     * <p>
     * A list of servers that the Job is acting upon.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParticipatingServers(java.util.Collection)} or {@link #withParticipatingServers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param participatingServers
     *        A list of servers that the Job is acting upon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withParticipatingServers(ParticipatingServer... participatingServers) {
        if (this.participatingServers == null) {
            setParticipatingServers(new java.util.ArrayList<ParticipatingServer>(participatingServers.length));
        }
        for (ParticipatingServer ele : participatingServers) {
            this.participatingServers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of servers that the Job is acting upon.
     * </p>
     * 
     * @param participatingServers
     *        A list of servers that the Job is acting upon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withParticipatingServers(java.util.Collection<ParticipatingServer> participatingServers) {
        setParticipatingServers(participatingServers);
        return this;
    }

    /**
     * <p>
     * The status of the Job.
     * </p>
     * 
     * @param status
     *        The status of the Job.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Job.
     * </p>
     * 
     * @return The status of the Job.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Job.
     * </p>
     * 
     * @param status
     *        The status of the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Job withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Job.
     * </p>
     * 
     * @param status
     *        The status of the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Job withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A list of tags associated with the Job.
     * </p>
     * 
     * @return A list of tags associated with the Job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with the Job.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the Job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags associated with the Job.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Job#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Job addTagsEntry(String key, String value) {
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

    public Job clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of the Job.
     * </p>
     * 
     * @param type
     *        The type of the Job.
     * @see JobType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the Job.
     * </p>
     * 
     * @return The type of the Job.
     * @see JobType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the Job.
     * </p>
     * 
     * @param type
     *        The type of the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public Job withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the Job.
     * </p>
     * 
     * @param type
     *        The type of the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public Job withType(JobType type) {
        this.type = type.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: ").append(getEndDateTime()).append(",");
        if (getInitiatedBy() != null)
            sb.append("InitiatedBy: ").append(getInitiatedBy()).append(",");
        if (getJobID() != null)
            sb.append("JobID: ").append(getJobID()).append(",");
        if (getParticipatingServers() != null)
            sb.append("ParticipatingServers: ").append(getParticipatingServers()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***").append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Job == false)
            return false;
        Job other = (Job) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        if (other.getInitiatedBy() == null ^ this.getInitiatedBy() == null)
            return false;
        if (other.getInitiatedBy() != null && other.getInitiatedBy().equals(this.getInitiatedBy()) == false)
            return false;
        if (other.getJobID() == null ^ this.getJobID() == null)
            return false;
        if (other.getJobID() != null && other.getJobID().equals(this.getJobID()) == false)
            return false;
        if (other.getParticipatingServers() == null ^ this.getParticipatingServers() == null)
            return false;
        if (other.getParticipatingServers() != null && other.getParticipatingServers().equals(this.getParticipatingServers()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        hashCode = prime * hashCode + ((getInitiatedBy() == null) ? 0 : getInitiatedBy().hashCode());
        hashCode = prime * hashCode + ((getJobID() == null) ? 0 : getJobID().hashCode());
        hashCode = prime * hashCode + ((getParticipatingServers() == null) ? 0 : getParticipatingServers().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Job clone() {
        try {
            return (Job) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.JobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
