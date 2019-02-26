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
 * Represents a replication job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ReplicationJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the replication job.
     * </p>
     */
    private String replicationJobId;
    /**
     * <p>
     * The identifier of the server.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * The type of server.
     * </p>
     */
    private String serverType;
    /**
     * <p>
     * Information about the VM server.
     * </p>
     */
    private VmServer vmServer;
    /**
     * <p>
     * The seed replication time.
     * </p>
     */
    private java.util.Date seedReplicationTime;
    /**
     * <p>
     * The time between consecutive replication runs, in hours.
     * </p>
     */
    private Integer frequency;
    /** <p/> */
    private Boolean runOnce;
    /**
     * <p>
     * The start time of the next replication run.
     * </p>
     */
    private java.util.Date nextReplicationRunStartTime;
    /**
     * <p>
     * The license type to be used for the AMI created by a successful replication run.
     * </p>
     */
    private String licenseType;
    /**
     * <p>
     * The name of the IAM role to be used by the Server Migration Service.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The ID of the latest Amazon Machine Image (AMI).
     * </p>
     */
    private String latestAmiId;
    /**
     * <p>
     * The state of the replication job.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The description of the current status of the replication job.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The description of the replication job.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Number of recent AMIs to keep in the customer's account for a replication job. By default the value is set to
     * zero, meaning that all AMIs are kept.
     * </p>
     */
    private Integer numberOfRecentAmisToKeep;
    /**
     * <p>
     * Whether the replication job should produce encrypted AMIs or not. See also <code>KmsKeyId</code> below.
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
     * Information about the replication runs.
     * </p>
     */
    private java.util.List<ReplicationRun> replicationRunList;

    /**
     * <p>
     * The identifier of the replication job.
     * </p>
     * 
     * @param replicationJobId
     *        The identifier of the replication job.
     */

    public void setReplicationJobId(String replicationJobId) {
        this.replicationJobId = replicationJobId;
    }

    /**
     * <p>
     * The identifier of the replication job.
     * </p>
     * 
     * @return The identifier of the replication job.
     */

    public String getReplicationJobId() {
        return this.replicationJobId;
    }

    /**
     * <p>
     * The identifier of the replication job.
     * </p>
     * 
     * @param replicationJobId
     *        The identifier of the replication job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withReplicationJobId(String replicationJobId) {
        setReplicationJobId(replicationJobId);
        return this;
    }

    /**
     * <p>
     * The identifier of the server.
     * </p>
     * 
     * @param serverId
     *        The identifier of the server.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * The identifier of the server.
     * </p>
     * 
     * @return The identifier of the server.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * The identifier of the server.
     * </p>
     * 
     * @param serverId
     *        The identifier of the server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * The type of server.
     * </p>
     * 
     * @param serverType
     *        The type of server.
     * @see ServerType
     */

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    /**
     * <p>
     * The type of server.
     * </p>
     * 
     * @return The type of server.
     * @see ServerType
     */

    public String getServerType() {
        return this.serverType;
    }

    /**
     * <p>
     * The type of server.
     * </p>
     * 
     * @param serverType
     *        The type of server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerType
     */

    public ReplicationJob withServerType(String serverType) {
        setServerType(serverType);
        return this;
    }

    /**
     * <p>
     * The type of server.
     * </p>
     * 
     * @param serverType
     *        The type of server.
     * @see ServerType
     */

    public void setServerType(ServerType serverType) {
        withServerType(serverType);
    }

    /**
     * <p>
     * The type of server.
     * </p>
     * 
     * @param serverType
     *        The type of server.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerType
     */

    public ReplicationJob withServerType(ServerType serverType) {
        this.serverType = serverType.toString();
        return this;
    }

    /**
     * <p>
     * Information about the VM server.
     * </p>
     * 
     * @param vmServer
     *        Information about the VM server.
     */

    public void setVmServer(VmServer vmServer) {
        this.vmServer = vmServer;
    }

    /**
     * <p>
     * Information about the VM server.
     * </p>
     * 
     * @return Information about the VM server.
     */

    public VmServer getVmServer() {
        return this.vmServer;
    }

    /**
     * <p>
     * Information about the VM server.
     * </p>
     * 
     * @param vmServer
     *        Information about the VM server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withVmServer(VmServer vmServer) {
        setVmServer(vmServer);
        return this;
    }

    /**
     * <p>
     * The seed replication time.
     * </p>
     * 
     * @param seedReplicationTime
     *        The seed replication time.
     */

    public void setSeedReplicationTime(java.util.Date seedReplicationTime) {
        this.seedReplicationTime = seedReplicationTime;
    }

    /**
     * <p>
     * The seed replication time.
     * </p>
     * 
     * @return The seed replication time.
     */

    public java.util.Date getSeedReplicationTime() {
        return this.seedReplicationTime;
    }

    /**
     * <p>
     * The seed replication time.
     * </p>
     * 
     * @param seedReplicationTime
     *        The seed replication time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withSeedReplicationTime(java.util.Date seedReplicationTime) {
        setSeedReplicationTime(seedReplicationTime);
        return this;
    }

    /**
     * <p>
     * The time between consecutive replication runs, in hours.
     * </p>
     * 
     * @param frequency
     *        The time between consecutive replication runs, in hours.
     */

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * The time between consecutive replication runs, in hours.
     * </p>
     * 
     * @return The time between consecutive replication runs, in hours.
     */

    public Integer getFrequency() {
        return this.frequency;
    }

    /**
     * <p>
     * The time between consecutive replication runs, in hours.
     * </p>
     * 
     * @param frequency
     *        The time between consecutive replication runs, in hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withFrequency(Integer frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p/>
     * 
     * @param runOnce
     */

    public void setRunOnce(Boolean runOnce) {
        this.runOnce = runOnce;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean getRunOnce() {
        return this.runOnce;
    }

    /**
     * <p/>
     * 
     * @param runOnce
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withRunOnce(Boolean runOnce) {
        setRunOnce(runOnce);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean isRunOnce() {
        return this.runOnce;
    }

    /**
     * <p>
     * The start time of the next replication run.
     * </p>
     * 
     * @param nextReplicationRunStartTime
     *        The start time of the next replication run.
     */

    public void setNextReplicationRunStartTime(java.util.Date nextReplicationRunStartTime) {
        this.nextReplicationRunStartTime = nextReplicationRunStartTime;
    }

    /**
     * <p>
     * The start time of the next replication run.
     * </p>
     * 
     * @return The start time of the next replication run.
     */

    public java.util.Date getNextReplicationRunStartTime() {
        return this.nextReplicationRunStartTime;
    }

    /**
     * <p>
     * The start time of the next replication run.
     * </p>
     * 
     * @param nextReplicationRunStartTime
     *        The start time of the next replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withNextReplicationRunStartTime(java.util.Date nextReplicationRunStartTime) {
        setNextReplicationRunStartTime(nextReplicationRunStartTime);
        return this;
    }

    /**
     * <p>
     * The license type to be used for the AMI created by a successful replication run.
     * </p>
     * 
     * @param licenseType
     *        The license type to be used for the AMI created by a successful replication run.
     * @see LicenseType
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The license type to be used for the AMI created by a successful replication run.
     * </p>
     * 
     * @return The license type to be used for the AMI created by a successful replication run.
     * @see LicenseType
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * The license type to be used for the AMI created by a successful replication run.
     * </p>
     * 
     * @param licenseType
     *        The license type to be used for the AMI created by a successful replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public ReplicationJob withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * The license type to be used for the AMI created by a successful replication run.
     * </p>
     * 
     * @param licenseType
     *        The license type to be used for the AMI created by a successful replication run.
     * @see LicenseType
     */

    public void setLicenseType(LicenseType licenseType) {
        withLicenseType(licenseType);
    }

    /**
     * <p>
     * The license type to be used for the AMI created by a successful replication run.
     * </p>
     * 
     * @param licenseType
     *        The license type to be used for the AMI created by a successful replication run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseType
     */

    public ReplicationJob withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the IAM role to be used by the Server Migration Service.
     * </p>
     * 
     * @param roleName
     *        The name of the IAM role to be used by the Server Migration Service.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the IAM role to be used by the Server Migration Service.
     * </p>
     * 
     * @return The name of the IAM role to be used by the Server Migration Service.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the IAM role to be used by the Server Migration Service.
     * </p>
     * 
     * @param roleName
     *        The name of the IAM role to be used by the Server Migration Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The ID of the latest Amazon Machine Image (AMI).
     * </p>
     * 
     * @param latestAmiId
     *        The ID of the latest Amazon Machine Image (AMI).
     */

    public void setLatestAmiId(String latestAmiId) {
        this.latestAmiId = latestAmiId;
    }

    /**
     * <p>
     * The ID of the latest Amazon Machine Image (AMI).
     * </p>
     * 
     * @return The ID of the latest Amazon Machine Image (AMI).
     */

    public String getLatestAmiId() {
        return this.latestAmiId;
    }

    /**
     * <p>
     * The ID of the latest Amazon Machine Image (AMI).
     * </p>
     * 
     * @param latestAmiId
     *        The ID of the latest Amazon Machine Image (AMI).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withLatestAmiId(String latestAmiId) {
        setLatestAmiId(latestAmiId);
        return this;
    }

    /**
     * <p>
     * The state of the replication job.
     * </p>
     * 
     * @param state
     *        The state of the replication job.
     * @see ReplicationJobState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the replication job.
     * </p>
     * 
     * @return The state of the replication job.
     * @see ReplicationJobState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the replication job.
     * </p>
     * 
     * @param state
     *        The state of the replication job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationJobState
     */

    public ReplicationJob withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the replication job.
     * </p>
     * 
     * @param state
     *        The state of the replication job.
     * @see ReplicationJobState
     */

    public void setState(ReplicationJobState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the replication job.
     * </p>
     * 
     * @param state
     *        The state of the replication job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationJobState
     */

    public ReplicationJob withState(ReplicationJobState state) {
        this.state = state.toString();
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

    public ReplicationJob withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The description of the replication job.
     * </p>
     * 
     * @param description
     *        The description of the replication job.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the replication job.
     * </p>
     * 
     * @return The description of the replication job.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the replication job.
     * </p>
     * 
     * @param description
     *        The description of the replication job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Number of recent AMIs to keep in the customer's account for a replication job. By default the value is set to
     * zero, meaning that all AMIs are kept.
     * </p>
     * 
     * @param numberOfRecentAmisToKeep
     *        Number of recent AMIs to keep in the customer's account for a replication job. By default the value is set
     *        to zero, meaning that all AMIs are kept.
     */

    public void setNumberOfRecentAmisToKeep(Integer numberOfRecentAmisToKeep) {
        this.numberOfRecentAmisToKeep = numberOfRecentAmisToKeep;
    }

    /**
     * <p>
     * Number of recent AMIs to keep in the customer's account for a replication job. By default the value is set to
     * zero, meaning that all AMIs are kept.
     * </p>
     * 
     * @return Number of recent AMIs to keep in the customer's account for a replication job. By default the value is
     *         set to zero, meaning that all AMIs are kept.
     */

    public Integer getNumberOfRecentAmisToKeep() {
        return this.numberOfRecentAmisToKeep;
    }

    /**
     * <p>
     * Number of recent AMIs to keep in the customer's account for a replication job. By default the value is set to
     * zero, meaning that all AMIs are kept.
     * </p>
     * 
     * @param numberOfRecentAmisToKeep
     *        Number of recent AMIs to keep in the customer's account for a replication job. By default the value is set
     *        to zero, meaning that all AMIs are kept.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withNumberOfRecentAmisToKeep(Integer numberOfRecentAmisToKeep) {
        setNumberOfRecentAmisToKeep(numberOfRecentAmisToKeep);
        return this;
    }

    /**
     * <p>
     * Whether the replication job should produce encrypted AMIs or not. See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @param encrypted
     *        Whether the replication job should produce encrypted AMIs or not. See also <code>KmsKeyId</code> below.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Whether the replication job should produce encrypted AMIs or not. See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @return Whether the replication job should produce encrypted AMIs or not. See also <code>KmsKeyId</code> below.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Whether the replication job should produce encrypted AMIs or not. See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @param encrypted
     *        Whether the replication job should produce encrypted AMIs or not. See also <code>KmsKeyId</code> below.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Whether the replication job should produce encrypted AMIs or not. See also <code>KmsKeyId</code> below.
     * </p>
     * 
     * @return Whether the replication job should produce encrypted AMIs or not. See also <code>KmsKeyId</code> below.
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

    public ReplicationJob withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Information about the replication runs.
     * </p>
     * 
     * @return Information about the replication runs.
     */

    public java.util.List<ReplicationRun> getReplicationRunList() {
        return replicationRunList;
    }

    /**
     * <p>
     * Information about the replication runs.
     * </p>
     * 
     * @param replicationRunList
     *        Information about the replication runs.
     */

    public void setReplicationRunList(java.util.Collection<ReplicationRun> replicationRunList) {
        if (replicationRunList == null) {
            this.replicationRunList = null;
            return;
        }

        this.replicationRunList = new java.util.ArrayList<ReplicationRun>(replicationRunList);
    }

    /**
     * <p>
     * Information about the replication runs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationRunList(java.util.Collection)} or {@link #withReplicationRunList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param replicationRunList
     *        Information about the replication runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withReplicationRunList(ReplicationRun... replicationRunList) {
        if (this.replicationRunList == null) {
            setReplicationRunList(new java.util.ArrayList<ReplicationRun>(replicationRunList.length));
        }
        for (ReplicationRun ele : replicationRunList) {
            this.replicationRunList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the replication runs.
     * </p>
     * 
     * @param replicationRunList
     *        Information about the replication runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationJob withReplicationRunList(java.util.Collection<ReplicationRun> replicationRunList) {
        setReplicationRunList(replicationRunList);
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
        if (getReplicationJobId() != null)
            sb.append("ReplicationJobId: ").append(getReplicationJobId()).append(",");
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getServerType() != null)
            sb.append("ServerType: ").append(getServerType()).append(",");
        if (getVmServer() != null)
            sb.append("VmServer: ").append(getVmServer()).append(",");
        if (getSeedReplicationTime() != null)
            sb.append("SeedReplicationTime: ").append(getSeedReplicationTime()).append(",");
        if (getFrequency() != null)
            sb.append("Frequency: ").append(getFrequency()).append(",");
        if (getRunOnce() != null)
            sb.append("RunOnce: ").append(getRunOnce()).append(",");
        if (getNextReplicationRunStartTime() != null)
            sb.append("NextReplicationRunStartTime: ").append(getNextReplicationRunStartTime()).append(",");
        if (getLicenseType() != null)
            sb.append("LicenseType: ").append(getLicenseType()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName()).append(",");
        if (getLatestAmiId() != null)
            sb.append("LatestAmiId: ").append(getLatestAmiId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNumberOfRecentAmisToKeep() != null)
            sb.append("NumberOfRecentAmisToKeep: ").append(getNumberOfRecentAmisToKeep()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getReplicationRunList() != null)
            sb.append("ReplicationRunList: ").append(getReplicationRunList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationJob == false)
            return false;
        ReplicationJob other = (ReplicationJob) obj;
        if (other.getReplicationJobId() == null ^ this.getReplicationJobId() == null)
            return false;
        if (other.getReplicationJobId() != null && other.getReplicationJobId().equals(this.getReplicationJobId()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getServerType() == null ^ this.getServerType() == null)
            return false;
        if (other.getServerType() != null && other.getServerType().equals(this.getServerType()) == false)
            return false;
        if (other.getVmServer() == null ^ this.getVmServer() == null)
            return false;
        if (other.getVmServer() != null && other.getVmServer().equals(this.getVmServer()) == false)
            return false;
        if (other.getSeedReplicationTime() == null ^ this.getSeedReplicationTime() == null)
            return false;
        if (other.getSeedReplicationTime() != null && other.getSeedReplicationTime().equals(this.getSeedReplicationTime()) == false)
            return false;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getRunOnce() == null ^ this.getRunOnce() == null)
            return false;
        if (other.getRunOnce() != null && other.getRunOnce().equals(this.getRunOnce()) == false)
            return false;
        if (other.getNextReplicationRunStartTime() == null ^ this.getNextReplicationRunStartTime() == null)
            return false;
        if (other.getNextReplicationRunStartTime() != null && other.getNextReplicationRunStartTime().equals(this.getNextReplicationRunStartTime()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getLatestAmiId() == null ^ this.getLatestAmiId() == null)
            return false;
        if (other.getLatestAmiId() != null && other.getLatestAmiId().equals(this.getLatestAmiId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNumberOfRecentAmisToKeep() == null ^ this.getNumberOfRecentAmisToKeep() == null)
            return false;
        if (other.getNumberOfRecentAmisToKeep() != null && other.getNumberOfRecentAmisToKeep().equals(this.getNumberOfRecentAmisToKeep()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getReplicationRunList() == null ^ this.getReplicationRunList() == null)
            return false;
        if (other.getReplicationRunList() != null && other.getReplicationRunList().equals(this.getReplicationRunList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationJobId() == null) ? 0 : getReplicationJobId().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getServerType() == null) ? 0 : getServerType().hashCode());
        hashCode = prime * hashCode + ((getVmServer() == null) ? 0 : getVmServer().hashCode());
        hashCode = prime * hashCode + ((getSeedReplicationTime() == null) ? 0 : getSeedReplicationTime().hashCode());
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getRunOnce() == null) ? 0 : getRunOnce().hashCode());
        hashCode = prime * hashCode + ((getNextReplicationRunStartTime() == null) ? 0 : getNextReplicationRunStartTime().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode + ((getLatestAmiId() == null) ? 0 : getLatestAmiId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNumberOfRecentAmisToKeep() == null) ? 0 : getNumberOfRecentAmisToKeep().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getReplicationRunList() == null) ? 0 : getReplicationRunList().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationJob clone() {
        try {
            return (ReplicationJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servermigration.model.transform.ReplicationJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
