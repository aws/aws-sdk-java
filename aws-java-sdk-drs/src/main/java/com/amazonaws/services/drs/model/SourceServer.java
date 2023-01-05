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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/SourceServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceServer implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Source Server.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The Data Replication Info of the Source Server.
     * </p>
     */
    private DataReplicationInfo dataReplicationInfo;
    /**
     * <p>
     * The status of the last recovery launch of this Source Server.
     * </p>
     */
    private String lastLaunchResult;
    /**
     * <p>
     * The lifecycle information of this Source Server.
     * </p>
     */
    private LifeCycle lifeCycle;
    /**
     * <p>
     * The ID of the Recovery Instance associated with this Source Server.
     * </p>
     */
    private String recoveryInstanceId;
    /**
     * <p>
     * Replication direction of the Source Server.
     * </p>
     */
    private String replicationDirection;
    /**
     * <p>
     * For EC2-originated Source Servers which have been failed over and then failed back, this value will mean the ARN
     * of the Source Server on the opposite replication direction.
     * </p>
     */
    private String reversedDirectionSourceServerArn;
    /**
     * <p>
     * Source cloud properties of the Source Server.
     * </p>
     */
    private SourceCloudProperties sourceCloudProperties;
    /**
     * <p>
     * The source properties of the Source Server.
     * </p>
     */
    private SourceProperties sourceProperties;
    /**
     * <p>
     * The ID of the Source Server.
     * </p>
     */
    private String sourceServerID;
    /**
     * <p>
     * The staging area of the source server.
     * </p>
     */
    private StagingArea stagingArea;
    /**
     * <p>
     * The tags associated with the Source Server.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the Source Server.
     * </p>
     * 
     * @param arn
     *        The ARN of the Source Server.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the Source Server.
     * </p>
     * 
     * @return The ARN of the Source Server.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the Source Server.
     * </p>
     * 
     * @param arn
     *        The ARN of the Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The Data Replication Info of the Source Server.
     * </p>
     * 
     * @param dataReplicationInfo
     *        The Data Replication Info of the Source Server.
     */

    public void setDataReplicationInfo(DataReplicationInfo dataReplicationInfo) {
        this.dataReplicationInfo = dataReplicationInfo;
    }

    /**
     * <p>
     * The Data Replication Info of the Source Server.
     * </p>
     * 
     * @return The Data Replication Info of the Source Server.
     */

    public DataReplicationInfo getDataReplicationInfo() {
        return this.dataReplicationInfo;
    }

    /**
     * <p>
     * The Data Replication Info of the Source Server.
     * </p>
     * 
     * @param dataReplicationInfo
     *        The Data Replication Info of the Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withDataReplicationInfo(DataReplicationInfo dataReplicationInfo) {
        setDataReplicationInfo(dataReplicationInfo);
        return this;
    }

    /**
     * <p>
     * The status of the last recovery launch of this Source Server.
     * </p>
     * 
     * @param lastLaunchResult
     *        The status of the last recovery launch of this Source Server.
     * @see LastLaunchResult
     */

    public void setLastLaunchResult(String lastLaunchResult) {
        this.lastLaunchResult = lastLaunchResult;
    }

    /**
     * <p>
     * The status of the last recovery launch of this Source Server.
     * </p>
     * 
     * @return The status of the last recovery launch of this Source Server.
     * @see LastLaunchResult
     */

    public String getLastLaunchResult() {
        return this.lastLaunchResult;
    }

    /**
     * <p>
     * The status of the last recovery launch of this Source Server.
     * </p>
     * 
     * @param lastLaunchResult
     *        The status of the last recovery launch of this Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastLaunchResult
     */

    public SourceServer withLastLaunchResult(String lastLaunchResult) {
        setLastLaunchResult(lastLaunchResult);
        return this;
    }

    /**
     * <p>
     * The status of the last recovery launch of this Source Server.
     * </p>
     * 
     * @param lastLaunchResult
     *        The status of the last recovery launch of this Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LastLaunchResult
     */

    public SourceServer withLastLaunchResult(LastLaunchResult lastLaunchResult) {
        this.lastLaunchResult = lastLaunchResult.toString();
        return this;
    }

    /**
     * <p>
     * The lifecycle information of this Source Server.
     * </p>
     * 
     * @param lifeCycle
     *        The lifecycle information of this Source Server.
     */

    public void setLifeCycle(LifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    /**
     * <p>
     * The lifecycle information of this Source Server.
     * </p>
     * 
     * @return The lifecycle information of this Source Server.
     */

    public LifeCycle getLifeCycle() {
        return this.lifeCycle;
    }

    /**
     * <p>
     * The lifecycle information of this Source Server.
     * </p>
     * 
     * @param lifeCycle
     *        The lifecycle information of this Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withLifeCycle(LifeCycle lifeCycle) {
        setLifeCycle(lifeCycle);
        return this;
    }

    /**
     * <p>
     * The ID of the Recovery Instance associated with this Source Server.
     * </p>
     * 
     * @param recoveryInstanceId
     *        The ID of the Recovery Instance associated with this Source Server.
     */

    public void setRecoveryInstanceId(String recoveryInstanceId) {
        this.recoveryInstanceId = recoveryInstanceId;
    }

    /**
     * <p>
     * The ID of the Recovery Instance associated with this Source Server.
     * </p>
     * 
     * @return The ID of the Recovery Instance associated with this Source Server.
     */

    public String getRecoveryInstanceId() {
        return this.recoveryInstanceId;
    }

    /**
     * <p>
     * The ID of the Recovery Instance associated with this Source Server.
     * </p>
     * 
     * @param recoveryInstanceId
     *        The ID of the Recovery Instance associated with this Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withRecoveryInstanceId(String recoveryInstanceId) {
        setRecoveryInstanceId(recoveryInstanceId);
        return this;
    }

    /**
     * <p>
     * Replication direction of the Source Server.
     * </p>
     * 
     * @param replicationDirection
     *        Replication direction of the Source Server.
     * @see ReplicationDirection
     */

    public void setReplicationDirection(String replicationDirection) {
        this.replicationDirection = replicationDirection;
    }

    /**
     * <p>
     * Replication direction of the Source Server.
     * </p>
     * 
     * @return Replication direction of the Source Server.
     * @see ReplicationDirection
     */

    public String getReplicationDirection() {
        return this.replicationDirection;
    }

    /**
     * <p>
     * Replication direction of the Source Server.
     * </p>
     * 
     * @param replicationDirection
     *        Replication direction of the Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationDirection
     */

    public SourceServer withReplicationDirection(String replicationDirection) {
        setReplicationDirection(replicationDirection);
        return this;
    }

    /**
     * <p>
     * Replication direction of the Source Server.
     * </p>
     * 
     * @param replicationDirection
     *        Replication direction of the Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationDirection
     */

    public SourceServer withReplicationDirection(ReplicationDirection replicationDirection) {
        this.replicationDirection = replicationDirection.toString();
        return this;
    }

    /**
     * <p>
     * For EC2-originated Source Servers which have been failed over and then failed back, this value will mean the ARN
     * of the Source Server on the opposite replication direction.
     * </p>
     * 
     * @param reversedDirectionSourceServerArn
     *        For EC2-originated Source Servers which have been failed over and then failed back, this value will mean
     *        the ARN of the Source Server on the opposite replication direction.
     */

    public void setReversedDirectionSourceServerArn(String reversedDirectionSourceServerArn) {
        this.reversedDirectionSourceServerArn = reversedDirectionSourceServerArn;
    }

    /**
     * <p>
     * For EC2-originated Source Servers which have been failed over and then failed back, this value will mean the ARN
     * of the Source Server on the opposite replication direction.
     * </p>
     * 
     * @return For EC2-originated Source Servers which have been failed over and then failed back, this value will mean
     *         the ARN of the Source Server on the opposite replication direction.
     */

    public String getReversedDirectionSourceServerArn() {
        return this.reversedDirectionSourceServerArn;
    }

    /**
     * <p>
     * For EC2-originated Source Servers which have been failed over and then failed back, this value will mean the ARN
     * of the Source Server on the opposite replication direction.
     * </p>
     * 
     * @param reversedDirectionSourceServerArn
     *        For EC2-originated Source Servers which have been failed over and then failed back, this value will mean
     *        the ARN of the Source Server on the opposite replication direction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withReversedDirectionSourceServerArn(String reversedDirectionSourceServerArn) {
        setReversedDirectionSourceServerArn(reversedDirectionSourceServerArn);
        return this;
    }

    /**
     * <p>
     * Source cloud properties of the Source Server.
     * </p>
     * 
     * @param sourceCloudProperties
     *        Source cloud properties of the Source Server.
     */

    public void setSourceCloudProperties(SourceCloudProperties sourceCloudProperties) {
        this.sourceCloudProperties = sourceCloudProperties;
    }

    /**
     * <p>
     * Source cloud properties of the Source Server.
     * </p>
     * 
     * @return Source cloud properties of the Source Server.
     */

    public SourceCloudProperties getSourceCloudProperties() {
        return this.sourceCloudProperties;
    }

    /**
     * <p>
     * Source cloud properties of the Source Server.
     * </p>
     * 
     * @param sourceCloudProperties
     *        Source cloud properties of the Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withSourceCloudProperties(SourceCloudProperties sourceCloudProperties) {
        setSourceCloudProperties(sourceCloudProperties);
        return this;
    }

    /**
     * <p>
     * The source properties of the Source Server.
     * </p>
     * 
     * @param sourceProperties
     *        The source properties of the Source Server.
     */

    public void setSourceProperties(SourceProperties sourceProperties) {
        this.sourceProperties = sourceProperties;
    }

    /**
     * <p>
     * The source properties of the Source Server.
     * </p>
     * 
     * @return The source properties of the Source Server.
     */

    public SourceProperties getSourceProperties() {
        return this.sourceProperties;
    }

    /**
     * <p>
     * The source properties of the Source Server.
     * </p>
     * 
     * @param sourceProperties
     *        The source properties of the Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withSourceProperties(SourceProperties sourceProperties) {
        setSourceProperties(sourceProperties);
        return this;
    }

    /**
     * <p>
     * The ID of the Source Server.
     * </p>
     * 
     * @param sourceServerID
     *        The ID of the Source Server.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * The ID of the Source Server.
     * </p>
     * 
     * @return The ID of the Source Server.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * The ID of the Source Server.
     * </p>
     * 
     * @param sourceServerID
     *        The ID of the Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
        return this;
    }

    /**
     * <p>
     * The staging area of the source server.
     * </p>
     * 
     * @param stagingArea
     *        The staging area of the source server.
     */

    public void setStagingArea(StagingArea stagingArea) {
        this.stagingArea = stagingArea;
    }

    /**
     * <p>
     * The staging area of the source server.
     * </p>
     * 
     * @return The staging area of the source server.
     */

    public StagingArea getStagingArea() {
        return this.stagingArea;
    }

    /**
     * <p>
     * The staging area of the source server.
     * </p>
     * 
     * @param stagingArea
     *        The staging area of the source server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withStagingArea(StagingArea stagingArea) {
        setStagingArea(stagingArea);
        return this;
    }

    /**
     * <p>
     * The tags associated with the Source Server.
     * </p>
     * 
     * @return The tags associated with the Source Server.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the Source Server.
     * </p>
     * 
     * @param tags
     *        The tags associated with the Source Server.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags associated with the Source Server.
     * </p>
     * 
     * @param tags
     *        The tags associated with the Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see SourceServer#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SourceServer addTagsEntry(String key, String value) {
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

    public SourceServer clearTagsEntries() {
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
        if (getLastLaunchResult() != null)
            sb.append("LastLaunchResult: ").append(getLastLaunchResult()).append(",");
        if (getLifeCycle() != null)
            sb.append("LifeCycle: ").append(getLifeCycle()).append(",");
        if (getRecoveryInstanceId() != null)
            sb.append("RecoveryInstanceId: ").append(getRecoveryInstanceId()).append(",");
        if (getReplicationDirection() != null)
            sb.append("ReplicationDirection: ").append(getReplicationDirection()).append(",");
        if (getReversedDirectionSourceServerArn() != null)
            sb.append("ReversedDirectionSourceServerArn: ").append(getReversedDirectionSourceServerArn()).append(",");
        if (getSourceCloudProperties() != null)
            sb.append("SourceCloudProperties: ").append(getSourceCloudProperties()).append(",");
        if (getSourceProperties() != null)
            sb.append("SourceProperties: ").append(getSourceProperties()).append(",");
        if (getSourceServerID() != null)
            sb.append("SourceServerID: ").append(getSourceServerID()).append(",");
        if (getStagingArea() != null)
            sb.append("StagingArea: ").append(getStagingArea()).append(",");
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

        if (obj instanceof SourceServer == false)
            return false;
        SourceServer other = (SourceServer) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDataReplicationInfo() == null ^ this.getDataReplicationInfo() == null)
            return false;
        if (other.getDataReplicationInfo() != null && other.getDataReplicationInfo().equals(this.getDataReplicationInfo()) == false)
            return false;
        if (other.getLastLaunchResult() == null ^ this.getLastLaunchResult() == null)
            return false;
        if (other.getLastLaunchResult() != null && other.getLastLaunchResult().equals(this.getLastLaunchResult()) == false)
            return false;
        if (other.getLifeCycle() == null ^ this.getLifeCycle() == null)
            return false;
        if (other.getLifeCycle() != null && other.getLifeCycle().equals(this.getLifeCycle()) == false)
            return false;
        if (other.getRecoveryInstanceId() == null ^ this.getRecoveryInstanceId() == null)
            return false;
        if (other.getRecoveryInstanceId() != null && other.getRecoveryInstanceId().equals(this.getRecoveryInstanceId()) == false)
            return false;
        if (other.getReplicationDirection() == null ^ this.getReplicationDirection() == null)
            return false;
        if (other.getReplicationDirection() != null && other.getReplicationDirection().equals(this.getReplicationDirection()) == false)
            return false;
        if (other.getReversedDirectionSourceServerArn() == null ^ this.getReversedDirectionSourceServerArn() == null)
            return false;
        if (other.getReversedDirectionSourceServerArn() != null
                && other.getReversedDirectionSourceServerArn().equals(this.getReversedDirectionSourceServerArn()) == false)
            return false;
        if (other.getSourceCloudProperties() == null ^ this.getSourceCloudProperties() == null)
            return false;
        if (other.getSourceCloudProperties() != null && other.getSourceCloudProperties().equals(this.getSourceCloudProperties()) == false)
            return false;
        if (other.getSourceProperties() == null ^ this.getSourceProperties() == null)
            return false;
        if (other.getSourceProperties() != null && other.getSourceProperties().equals(this.getSourceProperties()) == false)
            return false;
        if (other.getSourceServerID() == null ^ this.getSourceServerID() == null)
            return false;
        if (other.getSourceServerID() != null && other.getSourceServerID().equals(this.getSourceServerID()) == false)
            return false;
        if (other.getStagingArea() == null ^ this.getStagingArea() == null)
            return false;
        if (other.getStagingArea() != null && other.getStagingArea().equals(this.getStagingArea()) == false)
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
        hashCode = prime * hashCode + ((getLastLaunchResult() == null) ? 0 : getLastLaunchResult().hashCode());
        hashCode = prime * hashCode + ((getLifeCycle() == null) ? 0 : getLifeCycle().hashCode());
        hashCode = prime * hashCode + ((getRecoveryInstanceId() == null) ? 0 : getRecoveryInstanceId().hashCode());
        hashCode = prime * hashCode + ((getReplicationDirection() == null) ? 0 : getReplicationDirection().hashCode());
        hashCode = prime * hashCode + ((getReversedDirectionSourceServerArn() == null) ? 0 : getReversedDirectionSourceServerArn().hashCode());
        hashCode = prime * hashCode + ((getSourceCloudProperties() == null) ? 0 : getSourceCloudProperties().hashCode());
        hashCode = prime * hashCode + ((getSourceProperties() == null) ? 0 : getSourceProperties().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        hashCode = prime * hashCode + ((getStagingArea() == null) ? 0 : getStagingArea().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public SourceServer clone() {
        try {
            return (SourceServer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.SourceServerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
