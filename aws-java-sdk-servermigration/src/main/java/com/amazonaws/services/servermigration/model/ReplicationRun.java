/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a replication run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ReplicationRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationRun implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the replication run.
     * </p>
     */
    private String replicationRunId;
    /**
     * <p>
     * The state of the replication run.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The type of replication run.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Details of the current stage of the replication run.
     * </p>
     */
    private ReplicationRunStageDetails stageDetails;
    /**
     * <p>
     * The description of the current status of the replication job.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The identifier of the Amazon Machine Image (AMI) from the replication run.
     * </p>
     */
    private String amiId;
    /**
     * <p>
     * The start time of the next replication run.
     * </p>
     */
    private java.util.Date scheduledStartTime;
    /**
     * <p>
     * The completion time of the last replication run.
     * </p>
     */
    private java.util.Date completedTime;
    /**
     * <p>
     * The description of the replication run.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Whether the replication run should produce encrypted AMI or not. See also <code>KmsKeyId</code> below.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS key alias
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key alias
     * </p>
     * </li>
     * </ul>
     * <p>
     * If encrypted is <i>true</i> but a KMS key id is not specified, the customer's default KMS key for EBS is used.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The identifier of the replication run.
     * </p>
     * 
     * @param replicationRunId
     *        The identifier of the replication run.
     */

    public void setReplicationRunId(String replicationRunId) {
        this.replicationRunId = replicationRunId;
    }

    /**
     * <p>
     * The identifier of the replication run.
     * </p>
     * 
     * @return The identifier of the replication run.
     */

    public String getReplicationRunId() {
        return this.replicationRunId;
    }

    /**
     * <p>
     * The identifier of the replication run.
     * </p>
     * 
     * @param replicationRunId
     *        The identifier of the replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRun withReplicationRunId(String replicationRunId) {
        setReplicationRunId(replicationRunId);
        return this;
    }

    /**
     * <p>
     * The state of the replication run.
     * </p>
     * 
     * @param state
     *        The state of the replication run.
     * @see ReplicationRunState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the replication run.
     * </p>
     * 
     * @return The state of the replication run.
     * @see ReplicationRunState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the replication run.
     * </p>
     * 
     * @param state
     *        The state of the replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationRunState
     */

    public ReplicationRun withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the replication run.
     * </p>
     * 
     * @param state
     *        The state of the replication run.
     * @see ReplicationRunState
     */

    public void setState(ReplicationRunState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the replication run.
     * </p>
     * 
     * @param state
     *        The state of the replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationRunState
     */

    public ReplicationRun withState(ReplicationRunState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The type of replication run.
     * </p>
     * 
     * @param type
     *        The type of replication run.
     * @see ReplicationRunType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of replication run.
     * </p>
     * 
     * @return The type of replication run.
     * @see ReplicationRunType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of replication run.
     * </p>
     * 
     * @param type
     *        The type of replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationRunType
     */

    public ReplicationRun withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of replication run.
     * </p>
     * 
     * @param type
     *        The type of replication run.
     * @see ReplicationRunType
     */

    public void setType(ReplicationRunType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of replication run.
     * </p>
     * 
     * @param type
     *        The type of replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationRunType
     */

    public ReplicationRun withType(ReplicationRunType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Details of the current stage of the replication run.
     * </p>
     * 
     * @param stageDetails
     *        Details of the current stage of the replication run.
     */

    public void setStageDetails(ReplicationRunStageDetails stageDetails) {
        this.stageDetails = stageDetails;
    }

    /**
     * <p>
     * Details of the current stage of the replication run.
     * </p>
     * 
     * @return Details of the current stage of the replication run.
     */

    public ReplicationRunStageDetails getStageDetails() {
        return this.stageDetails;
    }

    /**
     * <p>
     * Details of the current stage of the replication run.
     * </p>
     * 
     * @param stageDetails
     *        Details of the current stage of the replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRun withStageDetails(ReplicationRunStageDetails stageDetails) {
        setStageDetails(stageDetails);
        return this;
    }

    /**
     * <p>
     * The description of the current status of the replication job.
     * </p>
     * 
     * @param statusMessage
     *        The description of the current status of the replication job.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The description of the current status of the replication job.
     * </p>
     * 
     * @return The description of the current status of the replication job.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The description of the current status of the replication job.
     * </p>
     * 
     * @param statusMessage
     *        The description of the current status of the replication job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRun withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Machine Image (AMI) from the replication run.
     * </p>
     * 
     * @param amiId
     *        The identifier of the Amazon Machine Image (AMI) from the replication run.
     */

    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }

    /**
     * <p>
     * The identifier of the Amazon Machine Image (AMI) from the replication run.
     * </p>
     * 
     * @return The identifier of the Amazon Machine Image (AMI) from the replication run.
     */

    public String getAmiId() {
        return this.amiId;
    }

    /**
     * <p>
     * The identifier of the Amazon Machine Image (AMI) from the replication run.
     * </p>
     * 
     * @param amiId
     *        The identifier of the Amazon Machine Image (AMI) from the replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRun withAmiId(String amiId) {
        setAmiId(amiId);
        return this;
    }

    /**
     * <p>
     * The start time of the next replication run.
     * </p>
     * 
     * @param scheduledStartTime
     *        The start time of the next replication run.
     */

    public void setScheduledStartTime(java.util.Date scheduledStartTime) {
        this.scheduledStartTime = scheduledStartTime;
    }

    /**
     * <p>
     * The start time of the next replication run.
     * </p>
     * 
     * @return The start time of the next replication run.
     */

    public java.util.Date getScheduledStartTime() {
        return this.scheduledStartTime;
    }

    /**
     * <p>
     * The start time of the next replication run.
     * </p>
     * 
     * @param scheduledStartTime
     *        The start time of the next replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRun withScheduledStartTime(java.util.Date scheduledStartTime) {
        setScheduledStartTime(scheduledStartTime);
        return this;
    }

    /**
     * <p>
     * The completion time of the last replication run.
     * </p>
     * 
     * @param completedTime
     *        The completion time of the last replication run.
     */

    public void setCompletedTime(java.util.Date completedTime) {
        this.completedTime = completedTime;
    }

    /**
     * <p>
     * The completion time of the last replication run.
     * </p>
     * 
     * @return The completion time of the last replication run.
     */

    public java.util.Date getCompletedTime() {
        return this.completedTime;
    }

    /**
     * <p>
     * The completion time of the last replication run.
     * </p>
     * 
     * @param completedTime
     *        The completion time of the last replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRun withCompletedTime(java.util.Date completedTime) {
        setCompletedTime(completedTime);
        return this;
    }

    /**
     * <p>
     * The description of the replication run.
     * </p>
     * 
     * @param description
     *        The description of the replication run.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the replication run.
     * </p>
     * 
     * @return The description of the replication run.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the replication run.
     * </p>
     * 
     * @param description
     *        The description of the replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRun withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Whether the replication run should produce encrypted AMI or not. See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @param encrypted
     *        Whether the replication run should produce encrypted AMI or not. See also <code>KmsKeyId</code> below.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Whether the replication run should produce encrypted AMI or not. See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @return Whether the replication run should produce encrypted AMI or not. See also <code>KmsKeyId</code> below.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Whether the replication run should produce encrypted AMI or not. See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @param encrypted
     *        Whether the replication run should produce encrypted AMI or not. See also <code>KmsKeyId</code> below.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRun withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Whether the replication run should produce encrypted AMI or not. See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @return Whether the replication run should produce encrypted AMI or not. See also <code>KmsKeyId</code> below.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS key alias
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key alias
     * </p>
     * </li>
     * </ul>
     * <p>
     * If encrypted is <i>true</i> but a KMS key id is not specified, the customer's default KMS key for EBS is used.
     * </p>
     * 
     * @param kmsKeyId
     *        KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS key ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KMS key alias
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN referring to KMS key ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN referring to KMS key alias
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If encrypted is <i>true</i> but a KMS key id is not specified, the customer's default KMS key for EBS is
     *        used.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS key alias
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key alias
     * </p>
     * </li>
     * </ul>
     * <p>
     * If encrypted is <i>true</i> but a KMS key id is not specified, the customer's default KMS key for EBS is used.
     * </p>
     * 
     * @return KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS key ID
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         KMS key alias
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN referring to KMS key ID
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN referring to KMS key alias
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If encrypted is <i>true</i> but a KMS key id is not specified, the customer's default KMS key for EBS is
     *         used.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS key alias
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key ID
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN referring to KMS key alias
     * </p>
     * </li>
     * </ul>
     * <p>
     * If encrypted is <i>true</i> but a KMS key id is not specified, the customer's default KMS key for EBS is used.
     * </p>
     * 
     * @param kmsKeyId
     *        KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS key ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KMS key alias
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN referring to KMS key ID
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN referring to KMS key alias
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If encrypted is <i>true</i> but a KMS key id is not specified, the customer's default KMS key for EBS is
     *        used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationRun withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getReplicationRunId() != null)
            sb.append("ReplicationRunId: ").append(getReplicationRunId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStageDetails() != null)
            sb.append("StageDetails: ").append(getStageDetails()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getAmiId() != null)
            sb.append("AmiId: ").append(getAmiId()).append(",");
        if (getScheduledStartTime() != null)
            sb.append("ScheduledStartTime: ").append(getScheduledStartTime()).append(",");
        if (getCompletedTime() != null)
            sb.append("CompletedTime: ").append(getCompletedTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationRun == false)
            return false;
        ReplicationRun other = (ReplicationRun) obj;
        if (other.getReplicationRunId() == null ^ this.getReplicationRunId() == null)
            return false;
        if (other.getReplicationRunId() != null && other.getReplicationRunId().equals(this.getReplicationRunId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStageDetails() == null ^ this.getStageDetails() == null)
            return false;
        if (other.getStageDetails() != null && other.getStageDetails().equals(this.getStageDetails()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getAmiId() == null ^ this.getAmiId() == null)
            return false;
        if (other.getAmiId() != null && other.getAmiId().equals(this.getAmiId()) == false)
            return false;
        if (other.getScheduledStartTime() == null ^ this.getScheduledStartTime() == null)
            return false;
        if (other.getScheduledStartTime() != null && other.getScheduledStartTime().equals(this.getScheduledStartTime()) == false)
            return false;
        if (other.getCompletedTime() == null ^ this.getCompletedTime() == null)
            return false;
        if (other.getCompletedTime() != null && other.getCompletedTime().equals(this.getCompletedTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationRunId() == null) ? 0 : getReplicationRunId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStageDetails() == null) ? 0 : getStageDetails().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getAmiId() == null) ? 0 : getAmiId().hashCode());
        hashCode = prime * hashCode + ((getScheduledStartTime() == null) ? 0 : getScheduledStartTime().hashCode());
        hashCode = prime * hashCode + ((getCompletedTime() == null) ? 0 : getCompletedTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationRun clone() {
        try {
            return (ReplicationRun) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ReplicationRunMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
