/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model;

import java.io.Serializable;


/**
 * <p>
 * Describes a snapshot.
 * </p>
 */
public class Snapshot implements Serializable {

    /**
     * The snapshot identifier that is provided in the request.
     */
    private String snapshotIdentifier;

    /**
     * The identifier of the cluster for which the snapshot was taken.
     */
    private String clusterIdentifier;

    /**
     * The time (UTC) when Amazon Redshift began the snapshot. A snapshot
     * contains a copy of the cluster data as of this exact time.
     */
    private java.util.Date snapshotCreateTime;

    /**
     * The snapshot status. The value of the status depends on the API
     * operation used. <ul> <li><a>CreateClusterSnapshot</a> and
     * <a>CopyClusterSnapshot</a> returns status as "creating". </li>
     * <li><a>DescribeClusterSnapshots</a> returns status as "creating",
     * "available", or "failed".</li> <li><a>DeleteClusterSnapshot</a>
     * returns status as "deleted".</li> </ul>
     */
    private String status;

    /**
     * The port that the cluster is listening on.
     */
    private Integer port;

    /**
     * The Availability Zone in which the cluster was created.
     */
    private String availabilityZone;

    /**
     * The time (UTC) when the cluster was originally created.
     */
    private java.util.Date clusterCreateTime;

    /**
     * The master user name for the cluster.
     */
    private String masterUsername;

    /**
     * The version ID of the Amazon Redshift engine that is running on the
     * cluster.
     */
    private String clusterVersion;

    /**
     * The snapshot type. Snapshots created using
     * <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> will be of
     * type "manual".
     */
    private String snapshotType;

    /**
     * The node type of the nodes in the cluster.
     */
    private String nodeType;

    /**
     * The number of nodes in the cluster.
     */
    private Integer numberOfNodes;

    /**
     * The name of the database that was created when the cluster was
     * created.
     */
    private String dBName;

    /**
     * The VPC identifier of the cluster if the snapshot is from a cluster in
     * a VPC. Otherwise, this field is not in the output.
     */
    private String vpcId;

    /**
     * If <code>true</code>, the data in the snapshot is encrypted at rest.
     */
    private Boolean encrypted;

    /**
     * A boolean that indicates whether the snapshot data is encrypted using
     * the HSM keys of the source cluster. <code>true</code> indicates that
     * the data is encrypted using HSM keys.
     */
    private Boolean encryptedWithHSM;

    /**
     * A list of the AWS customer accounts authorized to restore the
     * snapshot. Returns <code>null</code> if no accounts are authorized.
     * Visible only to the snapshot owner.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AccountWithRestoreAccess> accountsWithRestoreAccess;

    /**
     * For manual snapshots, the AWS customer account used to create or copy
     * the snapshot. For automatic snapshots, the owner of the cluster. The
     * owner can perform all snapshot actions, such as sharing a manual
     * snapshot.
     */
    private String ownerAccount;

    /**
     * The size of the complete set of backup data that would be used to
     * restore the cluster.
     */
    private Double totalBackupSizeInMegaBytes;

    /**
     * The size of the incremental backup.
     */
    private Double actualIncrementalBackupSizeInMegaBytes;

    /**
     * The number of megabytes that have been transferred to the snapshot
     * backup.
     */
    private Double backupProgressInMegaBytes;

    /**
     * The number of megabytes per second being transferred to the snapshot
     * backup. Returns <code>0</code> for a completed backup.
     */
    private Double currentBackupRateInMegaBytesPerSecond;

    /**
     * The estimate of the time remaining before the snapshot backup will
     * complete. Returns <code>0</code> for a completed backup.
     */
    private Long estimatedSecondsToCompletion;

    /**
     * The amount of time an in-progress snapshot backup has been running, or
     * the amount of time it took a completed backup to finish.
     */
    private Long elapsedTimeInSeconds;

    /**
     * The source region from which the snapshot was copied.
     */
    private String sourceRegion;

    /**
     * The snapshot identifier that is provided in the request.
     *
     * @return The snapshot identifier that is provided in the request.
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }
    
    /**
     * The snapshot identifier that is provided in the request.
     *
     * @param snapshotIdentifier The snapshot identifier that is provided in the request.
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }
    
    /**
     * The snapshot identifier that is provided in the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIdentifier The snapshot identifier that is provided in the request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * The identifier of the cluster for which the snapshot was taken.
     *
     * @return The identifier of the cluster for which the snapshot was taken.
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The identifier of the cluster for which the snapshot was taken.
     *
     * @param clusterIdentifier The identifier of the cluster for which the snapshot was taken.
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The identifier of the cluster for which the snapshot was taken.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The identifier of the cluster for which the snapshot was taken.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * The time (UTC) when Amazon Redshift began the snapshot. A snapshot
     * contains a copy of the cluster data as of this exact time.
     *
     * @return The time (UTC) when Amazon Redshift began the snapshot. A snapshot
     *         contains a copy of the cluster data as of this exact time.
     */
    public java.util.Date getSnapshotCreateTime() {
        return snapshotCreateTime;
    }
    
    /**
     * The time (UTC) when Amazon Redshift began the snapshot. A snapshot
     * contains a copy of the cluster data as of this exact time.
     *
     * @param snapshotCreateTime The time (UTC) when Amazon Redshift began the snapshot. A snapshot
     *         contains a copy of the cluster data as of this exact time.
     */
    public void setSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }
    
    /**
     * The time (UTC) when Amazon Redshift began the snapshot. A snapshot
     * contains a copy of the cluster data as of this exact time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotCreateTime The time (UTC) when Amazon Redshift began the snapshot. A snapshot
     *         contains a copy of the cluster data as of this exact time.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
        return this;
    }

    /**
     * The snapshot status. The value of the status depends on the API
     * operation used. <ul> <li><a>CreateClusterSnapshot</a> and
     * <a>CopyClusterSnapshot</a> returns status as "creating". </li>
     * <li><a>DescribeClusterSnapshots</a> returns status as "creating",
     * "available", or "failed".</li> <li><a>DeleteClusterSnapshot</a>
     * returns status as "deleted".</li> </ul>
     *
     * @return The snapshot status. The value of the status depends on the API
     *         operation used. <ul> <li><a>CreateClusterSnapshot</a> and
     *         <a>CopyClusterSnapshot</a> returns status as "creating". </li>
     *         <li><a>DescribeClusterSnapshots</a> returns status as "creating",
     *         "available", or "failed".</li> <li><a>DeleteClusterSnapshot</a>
     *         returns status as "deleted".</li> </ul>
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The snapshot status. The value of the status depends on the API
     * operation used. <ul> <li><a>CreateClusterSnapshot</a> and
     * <a>CopyClusterSnapshot</a> returns status as "creating". </li>
     * <li><a>DescribeClusterSnapshots</a> returns status as "creating",
     * "available", or "failed".</li> <li><a>DeleteClusterSnapshot</a>
     * returns status as "deleted".</li> </ul>
     *
     * @param status The snapshot status. The value of the status depends on the API
     *         operation used. <ul> <li><a>CreateClusterSnapshot</a> and
     *         <a>CopyClusterSnapshot</a> returns status as "creating". </li>
     *         <li><a>DescribeClusterSnapshots</a> returns status as "creating",
     *         "available", or "failed".</li> <li><a>DeleteClusterSnapshot</a>
     *         returns status as "deleted".</li> </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The snapshot status. The value of the status depends on the API
     * operation used. <ul> <li><a>CreateClusterSnapshot</a> and
     * <a>CopyClusterSnapshot</a> returns status as "creating". </li>
     * <li><a>DescribeClusterSnapshots</a> returns status as "creating",
     * "available", or "failed".</li> <li><a>DeleteClusterSnapshot</a>
     * returns status as "deleted".</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The snapshot status. The value of the status depends on the API
     *         operation used. <ul> <li><a>CreateClusterSnapshot</a> and
     *         <a>CopyClusterSnapshot</a> returns status as "creating". </li>
     *         <li><a>DescribeClusterSnapshots</a> returns status as "creating",
     *         "available", or "failed".</li> <li><a>DeleteClusterSnapshot</a>
     *         returns status as "deleted".</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The port that the cluster is listening on.
     *
     * @return The port that the cluster is listening on.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port that the cluster is listening on.
     *
     * @param port The port that the cluster is listening on.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port that the cluster is listening on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port that the cluster is listening on.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * The Availability Zone in which the cluster was created.
     *
     * @return The Availability Zone in which the cluster was created.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone in which the cluster was created.
     *
     * @param availabilityZone The Availability Zone in which the cluster was created.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone in which the cluster was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Availability Zone in which the cluster was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The time (UTC) when the cluster was originally created.
     *
     * @return The time (UTC) when the cluster was originally created.
     */
    public java.util.Date getClusterCreateTime() {
        return clusterCreateTime;
    }
    
    /**
     * The time (UTC) when the cluster was originally created.
     *
     * @param clusterCreateTime The time (UTC) when the cluster was originally created.
     */
    public void setClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
    }
    
    /**
     * The time (UTC) when the cluster was originally created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterCreateTime The time (UTC) when the cluster was originally created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
        return this;
    }

    /**
     * The master user name for the cluster.
     *
     * @return The master user name for the cluster.
     */
    public String getMasterUsername() {
        return masterUsername;
    }
    
    /**
     * The master user name for the cluster.
     *
     * @param masterUsername The master user name for the cluster.
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }
    
    /**
     * The master user name for the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUsername The master user name for the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * The version ID of the Amazon Redshift engine that is running on the
     * cluster.
     *
     * @return The version ID of the Amazon Redshift engine that is running on the
     *         cluster.
     */
    public String getClusterVersion() {
        return clusterVersion;
    }
    
    /**
     * The version ID of the Amazon Redshift engine that is running on the
     * cluster.
     *
     * @param clusterVersion The version ID of the Amazon Redshift engine that is running on the
     *         cluster.
     */
    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }
    
    /**
     * The version ID of the Amazon Redshift engine that is running on the
     * cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterVersion The version ID of the Amazon Redshift engine that is running on the
     *         cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * The snapshot type. Snapshots created using
     * <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> will be of
     * type "manual".
     *
     * @return The snapshot type. Snapshots created using
     *         <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> will be of
     *         type "manual".
     */
    public String getSnapshotType() {
        return snapshotType;
    }
    
    /**
     * The snapshot type. Snapshots created using
     * <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> will be of
     * type "manual".
     *
     * @param snapshotType The snapshot type. Snapshots created using
     *         <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> will be of
     *         type "manual".
     */
    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }
    
    /**
     * The snapshot type. Snapshots created using
     * <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> will be of
     * type "manual".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotType The snapshot type. Snapshots created using
     *         <a>CreateClusterSnapshot</a> and <a>CopyClusterSnapshot</a> will be of
     *         type "manual".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * The node type of the nodes in the cluster.
     *
     * @return The node type of the nodes in the cluster.
     */
    public String getNodeType() {
        return nodeType;
    }
    
    /**
     * The node type of the nodes in the cluster.
     *
     * @param nodeType The node type of the nodes in the cluster.
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }
    
    /**
     * The node type of the nodes in the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeType The node type of the nodes in the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * The number of nodes in the cluster.
     *
     * @return The number of nodes in the cluster.
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }
    
    /**
     * The number of nodes in the cluster.
     *
     * @param numberOfNodes The number of nodes in the cluster.
     */
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }
    
    /**
     * The number of nodes in the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param numberOfNodes The number of nodes in the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * The name of the database that was created when the cluster was
     * created.
     *
     * @return The name of the database that was created when the cluster was
     *         created.
     */
    public String getDBName() {
        return dBName;
    }
    
    /**
     * The name of the database that was created when the cluster was
     * created.
     *
     * @param dBName The name of the database that was created when the cluster was
     *         created.
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }
    
    /**
     * The name of the database that was created when the cluster was
     * created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBName The name of the database that was created when the cluster was
     *         created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * The VPC identifier of the cluster if the snapshot is from a cluster in
     * a VPC. Otherwise, this field is not in the output.
     *
     * @return The VPC identifier of the cluster if the snapshot is from a cluster in
     *         a VPC. Otherwise, this field is not in the output.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The VPC identifier of the cluster if the snapshot is from a cluster in
     * a VPC. Otherwise, this field is not in the output.
     *
     * @param vpcId The VPC identifier of the cluster if the snapshot is from a cluster in
     *         a VPC. Otherwise, this field is not in the output.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The VPC identifier of the cluster if the snapshot is from a cluster in
     * a VPC. Otherwise, this field is not in the output.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The VPC identifier of the cluster if the snapshot is from a cluster in
     *         a VPC. Otherwise, this field is not in the output.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * If <code>true</code>, the data in the snapshot is encrypted at rest.
     *
     * @return If <code>true</code>, the data in the snapshot is encrypted at rest.
     */
    public Boolean isEncrypted() {
        return encrypted;
    }
    
    /**
     * If <code>true</code>, the data in the snapshot is encrypted at rest.
     *
     * @param encrypted If <code>true</code>, the data in the snapshot is encrypted at rest.
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }
    
    /**
     * If <code>true</code>, the data in the snapshot is encrypted at rest.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encrypted If <code>true</code>, the data in the snapshot is encrypted at rest.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * If <code>true</code>, the data in the snapshot is encrypted at rest.
     *
     * @return If <code>true</code>, the data in the snapshot is encrypted at rest.
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * A boolean that indicates whether the snapshot data is encrypted using
     * the HSM keys of the source cluster. <code>true</code> indicates that
     * the data is encrypted using HSM keys.
     *
     * @return A boolean that indicates whether the snapshot data is encrypted using
     *         the HSM keys of the source cluster. <code>true</code> indicates that
     *         the data is encrypted using HSM keys.
     */
    public Boolean isEncryptedWithHSM() {
        return encryptedWithHSM;
    }
    
    /**
     * A boolean that indicates whether the snapshot data is encrypted using
     * the HSM keys of the source cluster. <code>true</code> indicates that
     * the data is encrypted using HSM keys.
     *
     * @param encryptedWithHSM A boolean that indicates whether the snapshot data is encrypted using
     *         the HSM keys of the source cluster. <code>true</code> indicates that
     *         the data is encrypted using HSM keys.
     */
    public void setEncryptedWithHSM(Boolean encryptedWithHSM) {
        this.encryptedWithHSM = encryptedWithHSM;
    }
    
    /**
     * A boolean that indicates whether the snapshot data is encrypted using
     * the HSM keys of the source cluster. <code>true</code> indicates that
     * the data is encrypted using HSM keys.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encryptedWithHSM A boolean that indicates whether the snapshot data is encrypted using
     *         the HSM keys of the source cluster. <code>true</code> indicates that
     *         the data is encrypted using HSM keys.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withEncryptedWithHSM(Boolean encryptedWithHSM) {
        this.encryptedWithHSM = encryptedWithHSM;
        return this;
    }

    /**
     * A boolean that indicates whether the snapshot data is encrypted using
     * the HSM keys of the source cluster. <code>true</code> indicates that
     * the data is encrypted using HSM keys.
     *
     * @return A boolean that indicates whether the snapshot data is encrypted using
     *         the HSM keys of the source cluster. <code>true</code> indicates that
     *         the data is encrypted using HSM keys.
     */
    public Boolean getEncryptedWithHSM() {
        return encryptedWithHSM;
    }

    /**
     * A list of the AWS customer accounts authorized to restore the
     * snapshot. Returns <code>null</code> if no accounts are authorized.
     * Visible only to the snapshot owner.
     *
     * @return A list of the AWS customer accounts authorized to restore the
     *         snapshot. Returns <code>null</code> if no accounts are authorized.
     *         Visible only to the snapshot owner.
     */
    public java.util.List<AccountWithRestoreAccess> getAccountsWithRestoreAccess() {
        if (accountsWithRestoreAccess == null) {
              accountsWithRestoreAccess = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountWithRestoreAccess>();
              accountsWithRestoreAccess.setAutoConstruct(true);
        }
        return accountsWithRestoreAccess;
    }
    
    /**
     * A list of the AWS customer accounts authorized to restore the
     * snapshot. Returns <code>null</code> if no accounts are authorized.
     * Visible only to the snapshot owner.
     *
     * @param accountsWithRestoreAccess A list of the AWS customer accounts authorized to restore the
     *         snapshot. Returns <code>null</code> if no accounts are authorized.
     *         Visible only to the snapshot owner.
     */
    public void setAccountsWithRestoreAccess(java.util.Collection<AccountWithRestoreAccess> accountsWithRestoreAccess) {
        if (accountsWithRestoreAccess == null) {
            this.accountsWithRestoreAccess = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AccountWithRestoreAccess> accountsWithRestoreAccessCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountWithRestoreAccess>(accountsWithRestoreAccess.size());
        accountsWithRestoreAccessCopy.addAll(accountsWithRestoreAccess);
        this.accountsWithRestoreAccess = accountsWithRestoreAccessCopy;
    }
    
    /**
     * A list of the AWS customer accounts authorized to restore the
     * snapshot. Returns <code>null</code> if no accounts are authorized.
     * Visible only to the snapshot owner.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountsWithRestoreAccess A list of the AWS customer accounts authorized to restore the
     *         snapshot. Returns <code>null</code> if no accounts are authorized.
     *         Visible only to the snapshot owner.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withAccountsWithRestoreAccess(AccountWithRestoreAccess... accountsWithRestoreAccess) {
        if (getAccountsWithRestoreAccess() == null) setAccountsWithRestoreAccess(new java.util.ArrayList<AccountWithRestoreAccess>(accountsWithRestoreAccess.length));
        for (AccountWithRestoreAccess value : accountsWithRestoreAccess) {
            getAccountsWithRestoreAccess().add(value);
        }
        return this;
    }
    
    /**
     * A list of the AWS customer accounts authorized to restore the
     * snapshot. Returns <code>null</code> if no accounts are authorized.
     * Visible only to the snapshot owner.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountsWithRestoreAccess A list of the AWS customer accounts authorized to restore the
     *         snapshot. Returns <code>null</code> if no accounts are authorized.
     *         Visible only to the snapshot owner.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withAccountsWithRestoreAccess(java.util.Collection<AccountWithRestoreAccess> accountsWithRestoreAccess) {
        if (accountsWithRestoreAccess == null) {
            this.accountsWithRestoreAccess = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AccountWithRestoreAccess> accountsWithRestoreAccessCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AccountWithRestoreAccess>(accountsWithRestoreAccess.size());
            accountsWithRestoreAccessCopy.addAll(accountsWithRestoreAccess);
            this.accountsWithRestoreAccess = accountsWithRestoreAccessCopy;
        }

        return this;
    }

    /**
     * For manual snapshots, the AWS customer account used to create or copy
     * the snapshot. For automatic snapshots, the owner of the cluster. The
     * owner can perform all snapshot actions, such as sharing a manual
     * snapshot.
     *
     * @return For manual snapshots, the AWS customer account used to create or copy
     *         the snapshot. For automatic snapshots, the owner of the cluster. The
     *         owner can perform all snapshot actions, such as sharing a manual
     *         snapshot.
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }
    
    /**
     * For manual snapshots, the AWS customer account used to create or copy
     * the snapshot. For automatic snapshots, the owner of the cluster. The
     * owner can perform all snapshot actions, such as sharing a manual
     * snapshot.
     *
     * @param ownerAccount For manual snapshots, the AWS customer account used to create or copy
     *         the snapshot. For automatic snapshots, the owner of the cluster. The
     *         owner can perform all snapshot actions, such as sharing a manual
     *         snapshot.
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }
    
    /**
     * For manual snapshots, the AWS customer account used to create or copy
     * the snapshot. For automatic snapshots, the owner of the cluster. The
     * owner can perform all snapshot actions, such as sharing a manual
     * snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerAccount For manual snapshots, the AWS customer account used to create or copy
     *         the snapshot. For automatic snapshots, the owner of the cluster. The
     *         owner can perform all snapshot actions, such as sharing a manual
     *         snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * The size of the complete set of backup data that would be used to
     * restore the cluster.
     *
     * @return The size of the complete set of backup data that would be used to
     *         restore the cluster.
     */
    public Double getTotalBackupSizeInMegaBytes() {
        return totalBackupSizeInMegaBytes;
    }
    
    /**
     * The size of the complete set of backup data that would be used to
     * restore the cluster.
     *
     * @param totalBackupSizeInMegaBytes The size of the complete set of backup data that would be used to
     *         restore the cluster.
     */
    public void setTotalBackupSizeInMegaBytes(Double totalBackupSizeInMegaBytes) {
        this.totalBackupSizeInMegaBytes = totalBackupSizeInMegaBytes;
    }
    
    /**
     * The size of the complete set of backup data that would be used to
     * restore the cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param totalBackupSizeInMegaBytes The size of the complete set of backup data that would be used to
     *         restore the cluster.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withTotalBackupSizeInMegaBytes(Double totalBackupSizeInMegaBytes) {
        this.totalBackupSizeInMegaBytes = totalBackupSizeInMegaBytes;
        return this;
    }

    /**
     * The size of the incremental backup.
     *
     * @return The size of the incremental backup.
     */
    public Double getActualIncrementalBackupSizeInMegaBytes() {
        return actualIncrementalBackupSizeInMegaBytes;
    }
    
    /**
     * The size of the incremental backup.
     *
     * @param actualIncrementalBackupSizeInMegaBytes The size of the incremental backup.
     */
    public void setActualIncrementalBackupSizeInMegaBytes(Double actualIncrementalBackupSizeInMegaBytes) {
        this.actualIncrementalBackupSizeInMegaBytes = actualIncrementalBackupSizeInMegaBytes;
    }
    
    /**
     * The size of the incremental backup.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param actualIncrementalBackupSizeInMegaBytes The size of the incremental backup.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withActualIncrementalBackupSizeInMegaBytes(Double actualIncrementalBackupSizeInMegaBytes) {
        this.actualIncrementalBackupSizeInMegaBytes = actualIncrementalBackupSizeInMegaBytes;
        return this;
    }

    /**
     * The number of megabytes that have been transferred to the snapshot
     * backup.
     *
     * @return The number of megabytes that have been transferred to the snapshot
     *         backup.
     */
    public Double getBackupProgressInMegaBytes() {
        return backupProgressInMegaBytes;
    }
    
    /**
     * The number of megabytes that have been transferred to the snapshot
     * backup.
     *
     * @param backupProgressInMegaBytes The number of megabytes that have been transferred to the snapshot
     *         backup.
     */
    public void setBackupProgressInMegaBytes(Double backupProgressInMegaBytes) {
        this.backupProgressInMegaBytes = backupProgressInMegaBytes;
    }
    
    /**
     * The number of megabytes that have been transferred to the snapshot
     * backup.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backupProgressInMegaBytes The number of megabytes that have been transferred to the snapshot
     *         backup.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withBackupProgressInMegaBytes(Double backupProgressInMegaBytes) {
        this.backupProgressInMegaBytes = backupProgressInMegaBytes;
        return this;
    }

    /**
     * The number of megabytes per second being transferred to the snapshot
     * backup. Returns <code>0</code> for a completed backup.
     *
     * @return The number of megabytes per second being transferred to the snapshot
     *         backup. Returns <code>0</code> for a completed backup.
     */
    public Double getCurrentBackupRateInMegaBytesPerSecond() {
        return currentBackupRateInMegaBytesPerSecond;
    }
    
    /**
     * The number of megabytes per second being transferred to the snapshot
     * backup. Returns <code>0</code> for a completed backup.
     *
     * @param currentBackupRateInMegaBytesPerSecond The number of megabytes per second being transferred to the snapshot
     *         backup. Returns <code>0</code> for a completed backup.
     */
    public void setCurrentBackupRateInMegaBytesPerSecond(Double currentBackupRateInMegaBytesPerSecond) {
        this.currentBackupRateInMegaBytesPerSecond = currentBackupRateInMegaBytesPerSecond;
    }
    
    /**
     * The number of megabytes per second being transferred to the snapshot
     * backup. Returns <code>0</code> for a completed backup.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param currentBackupRateInMegaBytesPerSecond The number of megabytes per second being transferred to the snapshot
     *         backup. Returns <code>0</code> for a completed backup.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withCurrentBackupRateInMegaBytesPerSecond(Double currentBackupRateInMegaBytesPerSecond) {
        this.currentBackupRateInMegaBytesPerSecond = currentBackupRateInMegaBytesPerSecond;
        return this;
    }

    /**
     * The estimate of the time remaining before the snapshot backup will
     * complete. Returns <code>0</code> for a completed backup.
     *
     * @return The estimate of the time remaining before the snapshot backup will
     *         complete. Returns <code>0</code> for a completed backup.
     */
    public Long getEstimatedSecondsToCompletion() {
        return estimatedSecondsToCompletion;
    }
    
    /**
     * The estimate of the time remaining before the snapshot backup will
     * complete. Returns <code>0</code> for a completed backup.
     *
     * @param estimatedSecondsToCompletion The estimate of the time remaining before the snapshot backup will
     *         complete. Returns <code>0</code> for a completed backup.
     */
    public void setEstimatedSecondsToCompletion(Long estimatedSecondsToCompletion) {
        this.estimatedSecondsToCompletion = estimatedSecondsToCompletion;
    }
    
    /**
     * The estimate of the time remaining before the snapshot backup will
     * complete. Returns <code>0</code> for a completed backup.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param estimatedSecondsToCompletion The estimate of the time remaining before the snapshot backup will
     *         complete. Returns <code>0</code> for a completed backup.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withEstimatedSecondsToCompletion(Long estimatedSecondsToCompletion) {
        this.estimatedSecondsToCompletion = estimatedSecondsToCompletion;
        return this;
    }

    /**
     * The amount of time an in-progress snapshot backup has been running, or
     * the amount of time it took a completed backup to finish.
     *
     * @return The amount of time an in-progress snapshot backup has been running, or
     *         the amount of time it took a completed backup to finish.
     */
    public Long getElapsedTimeInSeconds() {
        return elapsedTimeInSeconds;
    }
    
    /**
     * The amount of time an in-progress snapshot backup has been running, or
     * the amount of time it took a completed backup to finish.
     *
     * @param elapsedTimeInSeconds The amount of time an in-progress snapshot backup has been running, or
     *         the amount of time it took a completed backup to finish.
     */
    public void setElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
    }
    
    /**
     * The amount of time an in-progress snapshot backup has been running, or
     * the amount of time it took a completed backup to finish.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param elapsedTimeInSeconds The amount of time an in-progress snapshot backup has been running, or
     *         the amount of time it took a completed backup to finish.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
        return this;
    }

    /**
     * The source region from which the snapshot was copied.
     *
     * @return The source region from which the snapshot was copied.
     */
    public String getSourceRegion() {
        return sourceRegion;
    }
    
    /**
     * The source region from which the snapshot was copied.
     *
     * @param sourceRegion The source region from which the snapshot was copied.
     */
    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }
    
    /**
     * The source region from which the snapshot was copied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceRegion The source region from which the snapshot was copied.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Snapshot withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSnapshotIdentifier() != null) sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getClusterIdentifier() != null) sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getSnapshotCreateTime() != null) sb.append("SnapshotCreateTime: " + getSnapshotCreateTime() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getClusterCreateTime() != null) sb.append("ClusterCreateTime: " + getClusterCreateTime() + ",");
        if (getMasterUsername() != null) sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getClusterVersion() != null) sb.append("ClusterVersion: " + getClusterVersion() + ",");
        if (getSnapshotType() != null) sb.append("SnapshotType: " + getSnapshotType() + ",");
        if (getNodeType() != null) sb.append("NodeType: " + getNodeType() + ",");
        if (getNumberOfNodes() != null) sb.append("NumberOfNodes: " + getNumberOfNodes() + ",");
        if (getDBName() != null) sb.append("DBName: " + getDBName() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (isEncrypted() != null) sb.append("Encrypted: " + isEncrypted() + ",");
        if (isEncryptedWithHSM() != null) sb.append("EncryptedWithHSM: " + isEncryptedWithHSM() + ",");
        if (getAccountsWithRestoreAccess() != null) sb.append("AccountsWithRestoreAccess: " + getAccountsWithRestoreAccess() + ",");
        if (getOwnerAccount() != null) sb.append("OwnerAccount: " + getOwnerAccount() + ",");
        if (getTotalBackupSizeInMegaBytes() != null) sb.append("TotalBackupSizeInMegaBytes: " + getTotalBackupSizeInMegaBytes() + ",");
        if (getActualIncrementalBackupSizeInMegaBytes() != null) sb.append("ActualIncrementalBackupSizeInMegaBytes: " + getActualIncrementalBackupSizeInMegaBytes() + ",");
        if (getBackupProgressInMegaBytes() != null) sb.append("BackupProgressInMegaBytes: " + getBackupProgressInMegaBytes() + ",");
        if (getCurrentBackupRateInMegaBytesPerSecond() != null) sb.append("CurrentBackupRateInMegaBytesPerSecond: " + getCurrentBackupRateInMegaBytesPerSecond() + ",");
        if (getEstimatedSecondsToCompletion() != null) sb.append("EstimatedSecondsToCompletion: " + getEstimatedSecondsToCompletion() + ",");
        if (getElapsedTimeInSeconds() != null) sb.append("ElapsedTimeInSeconds: " + getElapsedTimeInSeconds() + ",");
        if (getSourceRegion() != null) sb.append("SourceRegion: " + getSourceRegion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotCreateTime() == null) ? 0 : getSnapshotCreateTime().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getClusterCreateTime() == null) ? 0 : getClusterCreateTime().hashCode()); 
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode()); 
        hashCode = prime * hashCode + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode()); 
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode()); 
        hashCode = prime * hashCode + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode()); 
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode()); 
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((isEncrypted() == null) ? 0 : isEncrypted().hashCode()); 
        hashCode = prime * hashCode + ((isEncryptedWithHSM() == null) ? 0 : isEncryptedWithHSM().hashCode()); 
        hashCode = prime * hashCode + ((getAccountsWithRestoreAccess() == null) ? 0 : getAccountsWithRestoreAccess().hashCode()); 
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode()); 
        hashCode = prime * hashCode + ((getTotalBackupSizeInMegaBytes() == null) ? 0 : getTotalBackupSizeInMegaBytes().hashCode()); 
        hashCode = prime * hashCode + ((getActualIncrementalBackupSizeInMegaBytes() == null) ? 0 : getActualIncrementalBackupSizeInMegaBytes().hashCode()); 
        hashCode = prime * hashCode + ((getBackupProgressInMegaBytes() == null) ? 0 : getBackupProgressInMegaBytes().hashCode()); 
        hashCode = prime * hashCode + ((getCurrentBackupRateInMegaBytesPerSecond() == null) ? 0 : getCurrentBackupRateInMegaBytesPerSecond().hashCode()); 
        hashCode = prime * hashCode + ((getEstimatedSecondsToCompletion() == null) ? 0 : getEstimatedSecondsToCompletion().hashCode()); 
        hashCode = prime * hashCode + ((getElapsedTimeInSeconds() == null) ? 0 : getElapsedTimeInSeconds().hashCode()); 
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Snapshot == false) return false;
        Snapshot other = (Snapshot)obj;
        
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null) return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false) return false; 
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.getSnapshotCreateTime() == null ^ this.getSnapshotCreateTime() == null) return false;
        if (other.getSnapshotCreateTime() != null && other.getSnapshotCreateTime().equals(this.getSnapshotCreateTime()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null) return false;
        if (other.getClusterCreateTime() != null && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false) return false; 
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null) return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false) return false; 
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null) return false;
        if (other.getClusterVersion() != null && other.getClusterVersion().equals(this.getClusterVersion()) == false) return false; 
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null) return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false) return false; 
        if (other.getNodeType() == null ^ this.getNodeType() == null) return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false) return false; 
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null) return false;
        if (other.getNumberOfNodes() != null && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false) return false; 
        if (other.getDBName() == null ^ this.getDBName() == null) return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.isEncrypted() == null ^ this.isEncrypted() == null) return false;
        if (other.isEncrypted() != null && other.isEncrypted().equals(this.isEncrypted()) == false) return false; 
        if (other.isEncryptedWithHSM() == null ^ this.isEncryptedWithHSM() == null) return false;
        if (other.isEncryptedWithHSM() != null && other.isEncryptedWithHSM().equals(this.isEncryptedWithHSM()) == false) return false; 
        if (other.getAccountsWithRestoreAccess() == null ^ this.getAccountsWithRestoreAccess() == null) return false;
        if (other.getAccountsWithRestoreAccess() != null && other.getAccountsWithRestoreAccess().equals(this.getAccountsWithRestoreAccess()) == false) return false; 
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null) return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false) return false; 
        if (other.getTotalBackupSizeInMegaBytes() == null ^ this.getTotalBackupSizeInMegaBytes() == null) return false;
        if (other.getTotalBackupSizeInMegaBytes() != null && other.getTotalBackupSizeInMegaBytes().equals(this.getTotalBackupSizeInMegaBytes()) == false) return false; 
        if (other.getActualIncrementalBackupSizeInMegaBytes() == null ^ this.getActualIncrementalBackupSizeInMegaBytes() == null) return false;
        if (other.getActualIncrementalBackupSizeInMegaBytes() != null && other.getActualIncrementalBackupSizeInMegaBytes().equals(this.getActualIncrementalBackupSizeInMegaBytes()) == false) return false; 
        if (other.getBackupProgressInMegaBytes() == null ^ this.getBackupProgressInMegaBytes() == null) return false;
        if (other.getBackupProgressInMegaBytes() != null && other.getBackupProgressInMegaBytes().equals(this.getBackupProgressInMegaBytes()) == false) return false; 
        if (other.getCurrentBackupRateInMegaBytesPerSecond() == null ^ this.getCurrentBackupRateInMegaBytesPerSecond() == null) return false;
        if (other.getCurrentBackupRateInMegaBytesPerSecond() != null && other.getCurrentBackupRateInMegaBytesPerSecond().equals(this.getCurrentBackupRateInMegaBytesPerSecond()) == false) return false; 
        if (other.getEstimatedSecondsToCompletion() == null ^ this.getEstimatedSecondsToCompletion() == null) return false;
        if (other.getEstimatedSecondsToCompletion() != null && other.getEstimatedSecondsToCompletion().equals(this.getEstimatedSecondsToCompletion()) == false) return false; 
        if (other.getElapsedTimeInSeconds() == null ^ this.getElapsedTimeInSeconds() == null) return false;
        if (other.getElapsedTimeInSeconds() != null && other.getElapsedTimeInSeconds().equals(this.getElapsedTimeInSeconds()) == false) return false; 
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null) return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false) return false; 
        return true;
    }
    
}
    