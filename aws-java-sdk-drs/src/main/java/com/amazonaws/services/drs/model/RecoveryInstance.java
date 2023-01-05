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
 * A Recovery Instance is a replica of a Source Server running on EC2.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/RecoveryInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryInstance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Recovery Instance.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Data Replication Info of the Recovery Instance.
     * </p>
     */
    private RecoveryInstanceDataReplicationInfo dataReplicationInfo;
    /**
     * <p>
     * The EC2 instance ID of the Recovery Instance.
     * </p>
     */
    private String ec2InstanceID;
    /**
     * <p>
     * The state of the EC2 instance for this Recovery Instance.
     * </p>
     */
    private String ec2InstanceState;
    /**
     * <p>
     * An object representing failback related information of the Recovery Instance.
     * </p>
     */
    private RecoveryInstanceFailback failback;
    /**
     * <p>
     * Whether this Recovery Instance was created for a drill or for an actual Recovery event.
     * </p>
     */
    private Boolean isDrill;
    /**
     * <p>
     * The ID of the Job that created the Recovery Instance.
     * </p>
     */
    private String jobID;
    /**
     * <p>
     * Environment (On Premises / AWS) of the instance that the recovery instance originated from.
     * </p>
     */
    private String originEnvironment;
    /**
     * <p>
     * The date and time of the Point in Time (PIT) snapshot that this Recovery Instance was launched from.
     * </p>
     */
    private String pointInTimeSnapshotDateTime;
    /**
     * <p>
     * The ID of the Recovery Instance.
     * </p>
     */
    private String recoveryInstanceID;
    /**
     * <p>
     * Properties of the Recovery Instance machine.
     * </p>
     */
    private RecoveryInstanceProperties recoveryInstanceProperties;
    /**
     * <p>
     * The Source Server ID that this Recovery Instance is associated with.
     * </p>
     */
    private String sourceServerID;
    /**
     * <p>
     * An array of tags that are associated with the Recovery Instance.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the Recovery Instance.
     * </p>
     * 
     * @param arn
     *        The ARN of the Recovery Instance.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the Recovery Instance.
     * </p>
     * 
     * @return The ARN of the Recovery Instance.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the Recovery Instance.
     * </p>
     * 
     * @param arn
     *        The ARN of the Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstance withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Data Replication Info of the Recovery Instance.
     * </p>
     * 
     * @param dataReplicationInfo
     *        The Data Replication Info of the Recovery Instance.
     */

    public void setDataReplicationInfo(RecoveryInstanceDataReplicationInfo dataReplicationInfo) {
        this.dataReplicationInfo = dataReplicationInfo;
    }

    /**
     * <p>
     * The Data Replication Info of the Recovery Instance.
     * </p>
     * 
     * @return The Data Replication Info of the Recovery Instance.
     */

    public RecoveryInstanceDataReplicationInfo getDataReplicationInfo() {
        return this.dataReplicationInfo;
    }

    /**
     * <p>
     * The Data Replication Info of the Recovery Instance.
     * </p>
     * 
     * @param dataReplicationInfo
     *        The Data Replication Info of the Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstance withDataReplicationInfo(RecoveryInstanceDataReplicationInfo dataReplicationInfo) {
        setDataReplicationInfo(dataReplicationInfo);
        return this;
    }

    /**
     * <p>
     * The EC2 instance ID of the Recovery Instance.
     * </p>
     * 
     * @param ec2InstanceID
     *        The EC2 instance ID of the Recovery Instance.
     */

    public void setEc2InstanceID(String ec2InstanceID) {
        this.ec2InstanceID = ec2InstanceID;
    }

    /**
     * <p>
     * The EC2 instance ID of the Recovery Instance.
     * </p>
     * 
     * @return The EC2 instance ID of the Recovery Instance.
     */

    public String getEc2InstanceID() {
        return this.ec2InstanceID;
    }

    /**
     * <p>
     * The EC2 instance ID of the Recovery Instance.
     * </p>
     * 
     * @param ec2InstanceID
     *        The EC2 instance ID of the Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstance withEc2InstanceID(String ec2InstanceID) {
        setEc2InstanceID(ec2InstanceID);
        return this;
    }

    /**
     * <p>
     * The state of the EC2 instance for this Recovery Instance.
     * </p>
     * 
     * @param ec2InstanceState
     *        The state of the EC2 instance for this Recovery Instance.
     * @see EC2InstanceState
     */

    public void setEc2InstanceState(String ec2InstanceState) {
        this.ec2InstanceState = ec2InstanceState;
    }

    /**
     * <p>
     * The state of the EC2 instance for this Recovery Instance.
     * </p>
     * 
     * @return The state of the EC2 instance for this Recovery Instance.
     * @see EC2InstanceState
     */

    public String getEc2InstanceState() {
        return this.ec2InstanceState;
    }

    /**
     * <p>
     * The state of the EC2 instance for this Recovery Instance.
     * </p>
     * 
     * @param ec2InstanceState
     *        The state of the EC2 instance for this Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceState
     */

    public RecoveryInstance withEc2InstanceState(String ec2InstanceState) {
        setEc2InstanceState(ec2InstanceState);
        return this;
    }

    /**
     * <p>
     * The state of the EC2 instance for this Recovery Instance.
     * </p>
     * 
     * @param ec2InstanceState
     *        The state of the EC2 instance for this Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceState
     */

    public RecoveryInstance withEc2InstanceState(EC2InstanceState ec2InstanceState) {
        this.ec2InstanceState = ec2InstanceState.toString();
        return this;
    }

    /**
     * <p>
     * An object representing failback related information of the Recovery Instance.
     * </p>
     * 
     * @param failback
     *        An object representing failback related information of the Recovery Instance.
     */

    public void setFailback(RecoveryInstanceFailback failback) {
        this.failback = failback;
    }

    /**
     * <p>
     * An object representing failback related information of the Recovery Instance.
     * </p>
     * 
     * @return An object representing failback related information of the Recovery Instance.
     */

    public RecoveryInstanceFailback getFailback() {
        return this.failback;
    }

    /**
     * <p>
     * An object representing failback related information of the Recovery Instance.
     * </p>
     * 
     * @param failback
     *        An object representing failback related information of the Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstance withFailback(RecoveryInstanceFailback failback) {
        setFailback(failback);
        return this;
    }

    /**
     * <p>
     * Whether this Recovery Instance was created for a drill or for an actual Recovery event.
     * </p>
     * 
     * @param isDrill
     *        Whether this Recovery Instance was created for a drill or for an actual Recovery event.
     */

    public void setIsDrill(Boolean isDrill) {
        this.isDrill = isDrill;
    }

    /**
     * <p>
     * Whether this Recovery Instance was created for a drill or for an actual Recovery event.
     * </p>
     * 
     * @return Whether this Recovery Instance was created for a drill or for an actual Recovery event.
     */

    public Boolean getIsDrill() {
        return this.isDrill;
    }

    /**
     * <p>
     * Whether this Recovery Instance was created for a drill or for an actual Recovery event.
     * </p>
     * 
     * @param isDrill
     *        Whether this Recovery Instance was created for a drill or for an actual Recovery event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstance withIsDrill(Boolean isDrill) {
        setIsDrill(isDrill);
        return this;
    }

    /**
     * <p>
     * Whether this Recovery Instance was created for a drill or for an actual Recovery event.
     * </p>
     * 
     * @return Whether this Recovery Instance was created for a drill or for an actual Recovery event.
     */

    public Boolean isDrill() {
        return this.isDrill;
    }

    /**
     * <p>
     * The ID of the Job that created the Recovery Instance.
     * </p>
     * 
     * @param jobID
     *        The ID of the Job that created the Recovery Instance.
     */

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    /**
     * <p>
     * The ID of the Job that created the Recovery Instance.
     * </p>
     * 
     * @return The ID of the Job that created the Recovery Instance.
     */

    public String getJobID() {
        return this.jobID;
    }

    /**
     * <p>
     * The ID of the Job that created the Recovery Instance.
     * </p>
     * 
     * @param jobID
     *        The ID of the Job that created the Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstance withJobID(String jobID) {
        setJobID(jobID);
        return this;
    }

    /**
     * <p>
     * Environment (On Premises / AWS) of the instance that the recovery instance originated from.
     * </p>
     * 
     * @param originEnvironment
     *        Environment (On Premises / AWS) of the instance that the recovery instance originated from.
     * @see OriginEnvironment
     */

    public void setOriginEnvironment(String originEnvironment) {
        this.originEnvironment = originEnvironment;
    }

    /**
     * <p>
     * Environment (On Premises / AWS) of the instance that the recovery instance originated from.
     * </p>
     * 
     * @return Environment (On Premises / AWS) of the instance that the recovery instance originated from.
     * @see OriginEnvironment
     */

    public String getOriginEnvironment() {
        return this.originEnvironment;
    }

    /**
     * <p>
     * Environment (On Premises / AWS) of the instance that the recovery instance originated from.
     * </p>
     * 
     * @param originEnvironment
     *        Environment (On Premises / AWS) of the instance that the recovery instance originated from.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginEnvironment
     */

    public RecoveryInstance withOriginEnvironment(String originEnvironment) {
        setOriginEnvironment(originEnvironment);
        return this;
    }

    /**
     * <p>
     * Environment (On Premises / AWS) of the instance that the recovery instance originated from.
     * </p>
     * 
     * @param originEnvironment
     *        Environment (On Premises / AWS) of the instance that the recovery instance originated from.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginEnvironment
     */

    public RecoveryInstance withOriginEnvironment(OriginEnvironment originEnvironment) {
        this.originEnvironment = originEnvironment.toString();
        return this;
    }

    /**
     * <p>
     * The date and time of the Point in Time (PIT) snapshot that this Recovery Instance was launched from.
     * </p>
     * 
     * @param pointInTimeSnapshotDateTime
     *        The date and time of the Point in Time (PIT) snapshot that this Recovery Instance was launched from.
     */

    public void setPointInTimeSnapshotDateTime(String pointInTimeSnapshotDateTime) {
        this.pointInTimeSnapshotDateTime = pointInTimeSnapshotDateTime;
    }

    /**
     * <p>
     * The date and time of the Point in Time (PIT) snapshot that this Recovery Instance was launched from.
     * </p>
     * 
     * @return The date and time of the Point in Time (PIT) snapshot that this Recovery Instance was launched from.
     */

    public String getPointInTimeSnapshotDateTime() {
        return this.pointInTimeSnapshotDateTime;
    }

    /**
     * <p>
     * The date and time of the Point in Time (PIT) snapshot that this Recovery Instance was launched from.
     * </p>
     * 
     * @param pointInTimeSnapshotDateTime
     *        The date and time of the Point in Time (PIT) snapshot that this Recovery Instance was launched from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstance withPointInTimeSnapshotDateTime(String pointInTimeSnapshotDateTime) {
        setPointInTimeSnapshotDateTime(pointInTimeSnapshotDateTime);
        return this;
    }

    /**
     * <p>
     * The ID of the Recovery Instance.
     * </p>
     * 
     * @param recoveryInstanceID
     *        The ID of the Recovery Instance.
     */

    public void setRecoveryInstanceID(String recoveryInstanceID) {
        this.recoveryInstanceID = recoveryInstanceID;
    }

    /**
     * <p>
     * The ID of the Recovery Instance.
     * </p>
     * 
     * @return The ID of the Recovery Instance.
     */

    public String getRecoveryInstanceID() {
        return this.recoveryInstanceID;
    }

    /**
     * <p>
     * The ID of the Recovery Instance.
     * </p>
     * 
     * @param recoveryInstanceID
     *        The ID of the Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstance withRecoveryInstanceID(String recoveryInstanceID) {
        setRecoveryInstanceID(recoveryInstanceID);
        return this;
    }

    /**
     * <p>
     * Properties of the Recovery Instance machine.
     * </p>
     * 
     * @param recoveryInstanceProperties
     *        Properties of the Recovery Instance machine.
     */

    public void setRecoveryInstanceProperties(RecoveryInstanceProperties recoveryInstanceProperties) {
        this.recoveryInstanceProperties = recoveryInstanceProperties;
    }

    /**
     * <p>
     * Properties of the Recovery Instance machine.
     * </p>
     * 
     * @return Properties of the Recovery Instance machine.
     */

    public RecoveryInstanceProperties getRecoveryInstanceProperties() {
        return this.recoveryInstanceProperties;
    }

    /**
     * <p>
     * Properties of the Recovery Instance machine.
     * </p>
     * 
     * @param recoveryInstanceProperties
     *        Properties of the Recovery Instance machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstance withRecoveryInstanceProperties(RecoveryInstanceProperties recoveryInstanceProperties) {
        setRecoveryInstanceProperties(recoveryInstanceProperties);
        return this;
    }

    /**
     * <p>
     * The Source Server ID that this Recovery Instance is associated with.
     * </p>
     * 
     * @param sourceServerID
     *        The Source Server ID that this Recovery Instance is associated with.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * The Source Server ID that this Recovery Instance is associated with.
     * </p>
     * 
     * @return The Source Server ID that this Recovery Instance is associated with.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * The Source Server ID that this Recovery Instance is associated with.
     * </p>
     * 
     * @param sourceServerID
     *        The Source Server ID that this Recovery Instance is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstance withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
        return this;
    }

    /**
     * <p>
     * An array of tags that are associated with the Recovery Instance.
     * </p>
     * 
     * @return An array of tags that are associated with the Recovery Instance.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of tags that are associated with the Recovery Instance.
     * </p>
     * 
     * @param tags
     *        An array of tags that are associated with the Recovery Instance.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * An array of tags that are associated with the Recovery Instance.
     * </p>
     * 
     * @param tags
     *        An array of tags that are associated with the Recovery Instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstance withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see RecoveryInstance#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryInstance addTagsEntry(String key, String value) {
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

    public RecoveryInstance clearTagsEntries() {
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDataReplicationInfo() != null)
            sb.append("DataReplicationInfo: ").append(getDataReplicationInfo()).append(",");
        if (getEc2InstanceID() != null)
            sb.append("Ec2InstanceID: ").append(getEc2InstanceID()).append(",");
        if (getEc2InstanceState() != null)
            sb.append("Ec2InstanceState: ").append(getEc2InstanceState()).append(",");
        if (getFailback() != null)
            sb.append("Failback: ").append(getFailback()).append(",");
        if (getIsDrill() != null)
            sb.append("IsDrill: ").append(getIsDrill()).append(",");
        if (getJobID() != null)
            sb.append("JobID: ").append(getJobID()).append(",");
        if (getOriginEnvironment() != null)
            sb.append("OriginEnvironment: ").append(getOriginEnvironment()).append(",");
        if (getPointInTimeSnapshotDateTime() != null)
            sb.append("PointInTimeSnapshotDateTime: ").append(getPointInTimeSnapshotDateTime()).append(",");
        if (getRecoveryInstanceID() != null)
            sb.append("RecoveryInstanceID: ").append(getRecoveryInstanceID()).append(",");
        if (getRecoveryInstanceProperties() != null)
            sb.append("RecoveryInstanceProperties: ").append(getRecoveryInstanceProperties()).append(",");
        if (getSourceServerID() != null)
            sb.append("SourceServerID: ").append(getSourceServerID()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryInstance == false)
            return false;
        RecoveryInstance other = (RecoveryInstance) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDataReplicationInfo() == null ^ this.getDataReplicationInfo() == null)
            return false;
        if (other.getDataReplicationInfo() != null && other.getDataReplicationInfo().equals(this.getDataReplicationInfo()) == false)
            return false;
        if (other.getEc2InstanceID() == null ^ this.getEc2InstanceID() == null)
            return false;
        if (other.getEc2InstanceID() != null && other.getEc2InstanceID().equals(this.getEc2InstanceID()) == false)
            return false;
        if (other.getEc2InstanceState() == null ^ this.getEc2InstanceState() == null)
            return false;
        if (other.getEc2InstanceState() != null && other.getEc2InstanceState().equals(this.getEc2InstanceState()) == false)
            return false;
        if (other.getFailback() == null ^ this.getFailback() == null)
            return false;
        if (other.getFailback() != null && other.getFailback().equals(this.getFailback()) == false)
            return false;
        if (other.getIsDrill() == null ^ this.getIsDrill() == null)
            return false;
        if (other.getIsDrill() != null && other.getIsDrill().equals(this.getIsDrill()) == false)
            return false;
        if (other.getJobID() == null ^ this.getJobID() == null)
            return false;
        if (other.getJobID() != null && other.getJobID().equals(this.getJobID()) == false)
            return false;
        if (other.getOriginEnvironment() == null ^ this.getOriginEnvironment() == null)
            return false;
        if (other.getOriginEnvironment() != null && other.getOriginEnvironment().equals(this.getOriginEnvironment()) == false)
            return false;
        if (other.getPointInTimeSnapshotDateTime() == null ^ this.getPointInTimeSnapshotDateTime() == null)
            return false;
        if (other.getPointInTimeSnapshotDateTime() != null && other.getPointInTimeSnapshotDateTime().equals(this.getPointInTimeSnapshotDateTime()) == false)
            return false;
        if (other.getRecoveryInstanceID() == null ^ this.getRecoveryInstanceID() == null)
            return false;
        if (other.getRecoveryInstanceID() != null && other.getRecoveryInstanceID().equals(this.getRecoveryInstanceID()) == false)
            return false;
        if (other.getRecoveryInstanceProperties() == null ^ this.getRecoveryInstanceProperties() == null)
            return false;
        if (other.getRecoveryInstanceProperties() != null && other.getRecoveryInstanceProperties().equals(this.getRecoveryInstanceProperties()) == false)
            return false;
        if (other.getSourceServerID() == null ^ this.getSourceServerID() == null)
            return false;
        if (other.getSourceServerID() != null && other.getSourceServerID().equals(this.getSourceServerID()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDataReplicationInfo() == null) ? 0 : getDataReplicationInfo().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceID() == null) ? 0 : getEc2InstanceID().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceState() == null) ? 0 : getEc2InstanceState().hashCode());
        hashCode = prime * hashCode + ((getFailback() == null) ? 0 : getFailback().hashCode());
        hashCode = prime * hashCode + ((getIsDrill() == null) ? 0 : getIsDrill().hashCode());
        hashCode = prime * hashCode + ((getJobID() == null) ? 0 : getJobID().hashCode());
        hashCode = prime * hashCode + ((getOriginEnvironment() == null) ? 0 : getOriginEnvironment().hashCode());
        hashCode = prime * hashCode + ((getPointInTimeSnapshotDateTime() == null) ? 0 : getPointInTimeSnapshotDateTime().hashCode());
        hashCode = prime * hashCode + ((getRecoveryInstanceID() == null) ? 0 : getRecoveryInstanceID().hashCode());
        hashCode = prime * hashCode + ((getRecoveryInstanceProperties() == null) ? 0 : getRecoveryInstanceProperties().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public RecoveryInstance clone() {
        try {
            return (RecoveryInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.RecoveryInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
