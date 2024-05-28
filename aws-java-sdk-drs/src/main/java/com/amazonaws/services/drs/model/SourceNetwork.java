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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The ARN of the Source Network.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/SourceNetwork" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceNetwork implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the Source Network.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * CloudFormation stack name that was deployed for recovering the Source Network.
     * </p>
     */
    private String cfnStackName;
    /**
     * <p>
     * An object containing information regarding the last recovery of the Source Network.
     * </p>
     */
    private RecoveryLifeCycle lastRecovery;
    /**
     * <p>
     * ID of the recovered VPC following Source Network recovery.
     * </p>
     */
    private String launchedVpcID;
    /**
     * <p>
     * Status of Source Network Replication. Possible values: (a) STOPPED - Source Network is not replicating. (b)
     * IN_PROGRESS - Source Network is being replicated. (c) PROTECTED - Source Network was replicated successfully and
     * is being synchronized for changes. (d) ERROR - Source Network replication has failed
     * </p>
     */
    private String replicationStatus;
    /**
     * <p>
     * Error details in case Source Network replication status is ERROR.
     * </p>
     */
    private String replicationStatusDetails;
    /**
     * <p>
     * Account ID containing the VPC protected by the Source Network.
     * </p>
     */
    private String sourceAccountID;
    /**
     * <p>
     * Source Network ID.
     * </p>
     */
    private String sourceNetworkID;
    /**
     * <p>
     * Region containing the VPC protected by the Source Network.
     * </p>
     */
    private String sourceRegion;
    /**
     * <p>
     * VPC ID protected by the Source Network.
     * </p>
     */
    private String sourceVpcID;
    /**
     * <p>
     * A list of tags associated with the Source Network.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ARN of the Source Network.
     * </p>
     * 
     * @param arn
     *        The ARN of the Source Network.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the Source Network.
     * </p>
     * 
     * @return The ARN of the Source Network.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the Source Network.
     * </p>
     * 
     * @param arn
     *        The ARN of the Source Network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceNetwork withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * CloudFormation stack name that was deployed for recovering the Source Network.
     * </p>
     * 
     * @param cfnStackName
     *        CloudFormation stack name that was deployed for recovering the Source Network.
     */

    public void setCfnStackName(String cfnStackName) {
        this.cfnStackName = cfnStackName;
    }

    /**
     * <p>
     * CloudFormation stack name that was deployed for recovering the Source Network.
     * </p>
     * 
     * @return CloudFormation stack name that was deployed for recovering the Source Network.
     */

    public String getCfnStackName() {
        return this.cfnStackName;
    }

    /**
     * <p>
     * CloudFormation stack name that was deployed for recovering the Source Network.
     * </p>
     * 
     * @param cfnStackName
     *        CloudFormation stack name that was deployed for recovering the Source Network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceNetwork withCfnStackName(String cfnStackName) {
        setCfnStackName(cfnStackName);
        return this;
    }

    /**
     * <p>
     * An object containing information regarding the last recovery of the Source Network.
     * </p>
     * 
     * @param lastRecovery
     *        An object containing information regarding the last recovery of the Source Network.
     */

    public void setLastRecovery(RecoveryLifeCycle lastRecovery) {
        this.lastRecovery = lastRecovery;
    }

    /**
     * <p>
     * An object containing information regarding the last recovery of the Source Network.
     * </p>
     * 
     * @return An object containing information regarding the last recovery of the Source Network.
     */

    public RecoveryLifeCycle getLastRecovery() {
        return this.lastRecovery;
    }

    /**
     * <p>
     * An object containing information regarding the last recovery of the Source Network.
     * </p>
     * 
     * @param lastRecovery
     *        An object containing information regarding the last recovery of the Source Network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceNetwork withLastRecovery(RecoveryLifeCycle lastRecovery) {
        setLastRecovery(lastRecovery);
        return this;
    }

    /**
     * <p>
     * ID of the recovered VPC following Source Network recovery.
     * </p>
     * 
     * @param launchedVpcID
     *        ID of the recovered VPC following Source Network recovery.
     */

    public void setLaunchedVpcID(String launchedVpcID) {
        this.launchedVpcID = launchedVpcID;
    }

    /**
     * <p>
     * ID of the recovered VPC following Source Network recovery.
     * </p>
     * 
     * @return ID of the recovered VPC following Source Network recovery.
     */

    public String getLaunchedVpcID() {
        return this.launchedVpcID;
    }

    /**
     * <p>
     * ID of the recovered VPC following Source Network recovery.
     * </p>
     * 
     * @param launchedVpcID
     *        ID of the recovered VPC following Source Network recovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceNetwork withLaunchedVpcID(String launchedVpcID) {
        setLaunchedVpcID(launchedVpcID);
        return this;
    }

    /**
     * <p>
     * Status of Source Network Replication. Possible values: (a) STOPPED - Source Network is not replicating. (b)
     * IN_PROGRESS - Source Network is being replicated. (c) PROTECTED - Source Network was replicated successfully and
     * is being synchronized for changes. (d) ERROR - Source Network replication has failed
     * </p>
     * 
     * @param replicationStatus
     *        Status of Source Network Replication. Possible values: (a) STOPPED - Source Network is not replicating.
     *        (b) IN_PROGRESS - Source Network is being replicated. (c) PROTECTED - Source Network was replicated
     *        successfully and is being synchronized for changes. (d) ERROR - Source Network replication has failed
     * @see ReplicationStatus
     */

    public void setReplicationStatus(String replicationStatus) {
        this.replicationStatus = replicationStatus;
    }

    /**
     * <p>
     * Status of Source Network Replication. Possible values: (a) STOPPED - Source Network is not replicating. (b)
     * IN_PROGRESS - Source Network is being replicated. (c) PROTECTED - Source Network was replicated successfully and
     * is being synchronized for changes. (d) ERROR - Source Network replication has failed
     * </p>
     * 
     * @return Status of Source Network Replication. Possible values: (a) STOPPED - Source Network is not replicating.
     *         (b) IN_PROGRESS - Source Network is being replicated. (c) PROTECTED - Source Network was replicated
     *         successfully and is being synchronized for changes. (d) ERROR - Source Network replication has failed
     * @see ReplicationStatus
     */

    public String getReplicationStatus() {
        return this.replicationStatus;
    }

    /**
     * <p>
     * Status of Source Network Replication. Possible values: (a) STOPPED - Source Network is not replicating. (b)
     * IN_PROGRESS - Source Network is being replicated. (c) PROTECTED - Source Network was replicated successfully and
     * is being synchronized for changes. (d) ERROR - Source Network replication has failed
     * </p>
     * 
     * @param replicationStatus
     *        Status of Source Network Replication. Possible values: (a) STOPPED - Source Network is not replicating.
     *        (b) IN_PROGRESS - Source Network is being replicated. (c) PROTECTED - Source Network was replicated
     *        successfully and is being synchronized for changes. (d) ERROR - Source Network replication has failed
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationStatus
     */

    public SourceNetwork withReplicationStatus(String replicationStatus) {
        setReplicationStatus(replicationStatus);
        return this;
    }

    /**
     * <p>
     * Status of Source Network Replication. Possible values: (a) STOPPED - Source Network is not replicating. (b)
     * IN_PROGRESS - Source Network is being replicated. (c) PROTECTED - Source Network was replicated successfully and
     * is being synchronized for changes. (d) ERROR - Source Network replication has failed
     * </p>
     * 
     * @param replicationStatus
     *        Status of Source Network Replication. Possible values: (a) STOPPED - Source Network is not replicating.
     *        (b) IN_PROGRESS - Source Network is being replicated. (c) PROTECTED - Source Network was replicated
     *        successfully and is being synchronized for changes. (d) ERROR - Source Network replication has failed
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationStatus
     */

    public SourceNetwork withReplicationStatus(ReplicationStatus replicationStatus) {
        this.replicationStatus = replicationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Error details in case Source Network replication status is ERROR.
     * </p>
     * 
     * @param replicationStatusDetails
     *        Error details in case Source Network replication status is ERROR.
     */

    public void setReplicationStatusDetails(String replicationStatusDetails) {
        this.replicationStatusDetails = replicationStatusDetails;
    }

    /**
     * <p>
     * Error details in case Source Network replication status is ERROR.
     * </p>
     * 
     * @return Error details in case Source Network replication status is ERROR.
     */

    public String getReplicationStatusDetails() {
        return this.replicationStatusDetails;
    }

    /**
     * <p>
     * Error details in case Source Network replication status is ERROR.
     * </p>
     * 
     * @param replicationStatusDetails
     *        Error details in case Source Network replication status is ERROR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceNetwork withReplicationStatusDetails(String replicationStatusDetails) {
        setReplicationStatusDetails(replicationStatusDetails);
        return this;
    }

    /**
     * <p>
     * Account ID containing the VPC protected by the Source Network.
     * </p>
     * 
     * @param sourceAccountID
     *        Account ID containing the VPC protected by the Source Network.
     */

    public void setSourceAccountID(String sourceAccountID) {
        this.sourceAccountID = sourceAccountID;
    }

    /**
     * <p>
     * Account ID containing the VPC protected by the Source Network.
     * </p>
     * 
     * @return Account ID containing the VPC protected by the Source Network.
     */

    public String getSourceAccountID() {
        return this.sourceAccountID;
    }

    /**
     * <p>
     * Account ID containing the VPC protected by the Source Network.
     * </p>
     * 
     * @param sourceAccountID
     *        Account ID containing the VPC protected by the Source Network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceNetwork withSourceAccountID(String sourceAccountID) {
        setSourceAccountID(sourceAccountID);
        return this;
    }

    /**
     * <p>
     * Source Network ID.
     * </p>
     * 
     * @param sourceNetworkID
     *        Source Network ID.
     */

    public void setSourceNetworkID(String sourceNetworkID) {
        this.sourceNetworkID = sourceNetworkID;
    }

    /**
     * <p>
     * Source Network ID.
     * </p>
     * 
     * @return Source Network ID.
     */

    public String getSourceNetworkID() {
        return this.sourceNetworkID;
    }

    /**
     * <p>
     * Source Network ID.
     * </p>
     * 
     * @param sourceNetworkID
     *        Source Network ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceNetwork withSourceNetworkID(String sourceNetworkID) {
        setSourceNetworkID(sourceNetworkID);
        return this;
    }

    /**
     * <p>
     * Region containing the VPC protected by the Source Network.
     * </p>
     * 
     * @param sourceRegion
     *        Region containing the VPC protected by the Source Network.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * Region containing the VPC protected by the Source Network.
     * </p>
     * 
     * @return Region containing the VPC protected by the Source Network.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * Region containing the VPC protected by the Source Network.
     * </p>
     * 
     * @param sourceRegion
     *        Region containing the VPC protected by the Source Network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceNetwork withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * VPC ID protected by the Source Network.
     * </p>
     * 
     * @param sourceVpcID
     *        VPC ID protected by the Source Network.
     */

    public void setSourceVpcID(String sourceVpcID) {
        this.sourceVpcID = sourceVpcID;
    }

    /**
     * <p>
     * VPC ID protected by the Source Network.
     * </p>
     * 
     * @return VPC ID protected by the Source Network.
     */

    public String getSourceVpcID() {
        return this.sourceVpcID;
    }

    /**
     * <p>
     * VPC ID protected by the Source Network.
     * </p>
     * 
     * @param sourceVpcID
     *        VPC ID protected by the Source Network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceNetwork withSourceVpcID(String sourceVpcID) {
        setSourceVpcID(sourceVpcID);
        return this;
    }

    /**
     * <p>
     * A list of tags associated with the Source Network.
     * </p>
     * 
     * @return A list of tags associated with the Source Network.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with the Source Network.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the Source Network.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of tags associated with the Source Network.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with the Source Network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceNetwork withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see SourceNetwork#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SourceNetwork addTagsEntry(String key, String value) {
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

    public SourceNetwork clearTagsEntries() {
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
        if (getCfnStackName() != null)
            sb.append("CfnStackName: ").append("***Sensitive Data Redacted***").append(",");
        if (getLastRecovery() != null)
            sb.append("LastRecovery: ").append(getLastRecovery()).append(",");
        if (getLaunchedVpcID() != null)
            sb.append("LaunchedVpcID: ").append(getLaunchedVpcID()).append(",");
        if (getReplicationStatus() != null)
            sb.append("ReplicationStatus: ").append(getReplicationStatus()).append(",");
        if (getReplicationStatusDetails() != null)
            sb.append("ReplicationStatusDetails: ").append("***Sensitive Data Redacted***").append(",");
        if (getSourceAccountID() != null)
            sb.append("SourceAccountID: ").append(getSourceAccountID()).append(",");
        if (getSourceNetworkID() != null)
            sb.append("SourceNetworkID: ").append(getSourceNetworkID()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion()).append(",");
        if (getSourceVpcID() != null)
            sb.append("SourceVpcID: ").append(getSourceVpcID()).append(",");
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

        if (obj instanceof SourceNetwork == false)
            return false;
        SourceNetwork other = (SourceNetwork) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCfnStackName() == null ^ this.getCfnStackName() == null)
            return false;
        if (other.getCfnStackName() != null && other.getCfnStackName().equals(this.getCfnStackName()) == false)
            return false;
        if (other.getLastRecovery() == null ^ this.getLastRecovery() == null)
            return false;
        if (other.getLastRecovery() != null && other.getLastRecovery().equals(this.getLastRecovery()) == false)
            return false;
        if (other.getLaunchedVpcID() == null ^ this.getLaunchedVpcID() == null)
            return false;
        if (other.getLaunchedVpcID() != null && other.getLaunchedVpcID().equals(this.getLaunchedVpcID()) == false)
            return false;
        if (other.getReplicationStatus() == null ^ this.getReplicationStatus() == null)
            return false;
        if (other.getReplicationStatus() != null && other.getReplicationStatus().equals(this.getReplicationStatus()) == false)
            return false;
        if (other.getReplicationStatusDetails() == null ^ this.getReplicationStatusDetails() == null)
            return false;
        if (other.getReplicationStatusDetails() != null && other.getReplicationStatusDetails().equals(this.getReplicationStatusDetails()) == false)
            return false;
        if (other.getSourceAccountID() == null ^ this.getSourceAccountID() == null)
            return false;
        if (other.getSourceAccountID() != null && other.getSourceAccountID().equals(this.getSourceAccountID()) == false)
            return false;
        if (other.getSourceNetworkID() == null ^ this.getSourceNetworkID() == null)
            return false;
        if (other.getSourceNetworkID() != null && other.getSourceNetworkID().equals(this.getSourceNetworkID()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getSourceVpcID() == null ^ this.getSourceVpcID() == null)
            return false;
        if (other.getSourceVpcID() != null && other.getSourceVpcID().equals(this.getSourceVpcID()) == false)
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
        hashCode = prime * hashCode + ((getCfnStackName() == null) ? 0 : getCfnStackName().hashCode());
        hashCode = prime * hashCode + ((getLastRecovery() == null) ? 0 : getLastRecovery().hashCode());
        hashCode = prime * hashCode + ((getLaunchedVpcID() == null) ? 0 : getLaunchedVpcID().hashCode());
        hashCode = prime * hashCode + ((getReplicationStatus() == null) ? 0 : getReplicationStatus().hashCode());
        hashCode = prime * hashCode + ((getReplicationStatusDetails() == null) ? 0 : getReplicationStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getSourceAccountID() == null) ? 0 : getSourceAccountID().hashCode());
        hashCode = prime * hashCode + ((getSourceNetworkID() == null) ? 0 : getSourceNetworkID().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getSourceVpcID() == null) ? 0 : getSourceVpcID().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public SourceNetwork clone() {
        try {
            return (SourceNetwork) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.SourceNetworkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
