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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/Job" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Job implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * the ARN of the specific Job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Job creation time.
     * </p>
     */
    private String creationDateTime;
    /**
     * <p>
     * Job end time.
     * </p>
     */
    private String endDateTime;
    /**
     * <p>
     * Job initiated by field.
     * </p>
     */
    private String initiatedBy;
    /**
     * <p>
     * Job ID.
     * </p>
     */
    private String jobID;
    /**
     * <p>
     * Servers participating in a specific Job.
     * </p>
     */
    private java.util.List<ParticipatingServer> participatingServers;
    /**
     * <p>
     * Job status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Tags associated with spcific Job.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Job type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * the ARN of the specific Job.
     * </p>
     * 
     * @param arn
     *        the ARN of the specific Job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * the ARN of the specific Job.
     * </p>
     * 
     * @return the ARN of the specific Job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * the ARN of the specific Job.
     * </p>
     * 
     * @param arn
     *        the ARN of the specific Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Job creation time.
     * </p>
     * 
     * @param creationDateTime
     *        Job creation time.
     */

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * Job creation time.
     * </p>
     * 
     * @return Job creation time.
     */

    public String getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * Job creation time.
     * </p>
     * 
     * @param creationDateTime
     *        Job creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCreationDateTime(String creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * Job end time.
     * </p>
     * 
     * @param endDateTime
     *        Job end time.
     */

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * Job end time.
     * </p>
     * 
     * @return Job end time.
     */

    public String getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * Job end time.
     * </p>
     * 
     * @param endDateTime
     *        Job end time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withEndDateTime(String endDateTime) {
        setEndDateTime(endDateTime);
        return this;
    }

    /**
     * <p>
     * Job initiated by field.
     * </p>
     * 
     * @param initiatedBy
     *        Job initiated by field.
     * @see InitiatedBy
     */

    public void setInitiatedBy(String initiatedBy) {
        this.initiatedBy = initiatedBy;
    }

    /**
     * <p>
     * Job initiated by field.
     * </p>
     * 
     * @return Job initiated by field.
     * @see InitiatedBy
     */

    public String getInitiatedBy() {
        return this.initiatedBy;
    }

    /**
     * <p>
     * Job initiated by field.
     * </p>
     * 
     * @param initiatedBy
     *        Job initiated by field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InitiatedBy
     */

    public Job withInitiatedBy(String initiatedBy) {
        setInitiatedBy(initiatedBy);
        return this;
    }

    /**
     * <p>
     * Job initiated by field.
     * </p>
     * 
     * @param initiatedBy
     *        Job initiated by field.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InitiatedBy
     */

    public Job withInitiatedBy(InitiatedBy initiatedBy) {
        this.initiatedBy = initiatedBy.toString();
        return this;
    }

    /**
     * <p>
     * Job ID.
     * </p>
     * 
     * @param jobID
     *        Job ID.
     */

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    /**
     * <p>
     * Job ID.
     * </p>
     * 
     * @return Job ID.
     */

    public String getJobID() {
        return this.jobID;
    }

    /**
     * <p>
     * Job ID.
     * </p>
     * 
     * @param jobID
     *        Job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withJobID(String jobID) {
        setJobID(jobID);
        return this;
    }

    /**
     * <p>
     * Servers participating in a specific Job.
     * </p>
     * 
     * @return Servers participating in a specific Job.
     */

    public java.util.List<ParticipatingServer> getParticipatingServers() {
        return participatingServers;
    }

    /**
     * <p>
     * Servers participating in a specific Job.
     * </p>
     * 
     * @param participatingServers
     *        Servers participating in a specific Job.
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
     * Servers participating in a specific Job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParticipatingServers(java.util.Collection)} or {@link #withParticipatingServers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param participatingServers
     *        Servers participating in a specific Job.
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
     * Servers participating in a specific Job.
     * </p>
     * 
     * @param participatingServers
     *        Servers participating in a specific Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withParticipatingServers(java.util.Collection<ParticipatingServer> participatingServers) {
        setParticipatingServers(participatingServers);
        return this;
    }

    /**
     * <p>
     * Job status.
     * </p>
     * 
     * @param status
     *        Job status.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Job status.
     * </p>
     * 
     * @return Job status.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Job status.
     * </p>
     * 
     * @param status
     *        Job status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Job withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Job status.
     * </p>
     * 
     * @param status
     *        Job status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public Job withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Tags associated with spcific Job.
     * </p>
     * 
     * @return Tags associated with spcific Job.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with spcific Job.
     * </p>
     * 
     * @param tags
     *        Tags associated with spcific Job.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags associated with spcific Job.
     * </p>
     * 
     * @param tags
     *        Tags associated with spcific Job.
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
     * Job type.
     * </p>
     * 
     * @param type
     *        Job type.
     * @see JobType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Job type.
     * </p>
     * 
     * @return Job type.
     * @see JobType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Job type.
     * </p>
     * 
     * @param type
     *        Job type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public Job withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Job type.
     * </p>
     * 
     * @param type
     *        Job type.
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
        com.amazonaws.services.mgn.model.transform.JobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
