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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the details for an Amazon RDS DB cluster snapshot
 * </p>
 * <p>
 * This data type is used as a response element in the <code>DescribeDBClusterSnapshots</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBClusterSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBClusterSnapshot implements Serializable, Cloneable {

    /**
     * <p>
     * The list of Availability Zones (AZs) where instances in the DB cluster snapshot can be restored.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * The identifier for the DB cluster snapshot.
     * </p>
     */
    private String dBClusterSnapshotIdentifier;
    /**
     * <p>
     * The DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date snapshotCreateTime;
    /**
     * <p>
     * The name of the database engine for this DB cluster snapshot.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The engine mode of the database engine for this DB cluster snapshot.
     * </p>
     */
    private String engineMode;
    /**
     * <p>
     * The allocated storage size of the DB cluster snapshot in gibibytes (GiB).
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The status of this DB cluster snapshot. Valid statuses are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>copying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The port that the DB cluster was listening on at the time of the snapshot.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The VPC ID associated with the DB cluster snapshot.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date clusterCreateTime;
    /**
     * <p>
     * The master username for this DB cluster snapshot.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * The version of the database engine for this DB cluster snapshot.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The license model information for this DB cluster snapshot.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * The type of the DB cluster snapshot.
     * </p>
     */
    private String snapshotType;
    /**
     * <p>
     * The percentage of the estimated data that has been transferred.
     * </p>
     */
    private Integer percentProgress;
    /**
     * <p>
     * Indicates whether the DB cluster snapshot is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the Amazon Web Services KMS key identifier for the encrypted DB cluster
     * snapshot.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster snapshot.
     * </p>
     */
    private String dBClusterSnapshotArn;
    /**
     * <p>
     * If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN) for the
     * source DB cluster snapshot, otherwise, a null value.
     * </p>
     */
    private String sourceDBClusterSnapshotArn;
    /**
     * <p>
     * Indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database
     * accounts is enabled.
     * </p>
     */
    private Boolean iAMDatabaseAuthenticationEnabled;

    private com.amazonaws.internal.SdkInternalList<Tag> tagList;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String dBSystemId;
    /**
     * <p>
     * The storage type associated with the DB cluster snapshot.
     * </p>
     * <p>
     * This setting is only for Aurora DB clusters.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The resource ID of the DB cluster that this DB cluster snapshot was created from.
     * </p>
     */
    private String dbClusterResourceId;
    /**
     * <p>
     * The storage throughput for the DB cluster snapshot. The throughput is automatically set based on the IOPS that
     * you provision, and is not configurable.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     */
    private Integer storageThroughput;

    /**
     * <p>
     * The list of Availability Zones (AZs) where instances in the DB cluster snapshot can be restored.
     * </p>
     * 
     * @return The list of Availability Zones (AZs) where instances in the DB cluster snapshot can be restored.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * The list of Availability Zones (AZs) where instances in the DB cluster snapshot can be restored.
     * </p>
     * 
     * @param availabilityZones
     *        The list of Availability Zones (AZs) where instances in the DB cluster snapshot can be restored.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(availabilityZones);
    }

    /**
     * <p>
     * The list of Availability Zones (AZs) where instances in the DB cluster snapshot can be restored.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The list of Availability Zones (AZs) where instances in the DB cluster snapshot can be restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Availability Zones (AZs) where instances in the DB cluster snapshot can be restored.
     * </p>
     * 
     * @param availabilityZones
     *        The list of Availability Zones (AZs) where instances in the DB cluster snapshot can be restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The identifier for the DB cluster snapshot.
     * </p>
     * 
     * @param dBClusterSnapshotIdentifier
     *        The identifier for the DB cluster snapshot.
     */

    public void setDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the DB cluster snapshot.
     * </p>
     * 
     * @return The identifier for the DB cluster snapshot.
     */

    public String getDBClusterSnapshotIdentifier() {
        return this.dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the DB cluster snapshot.
     * </p>
     * 
     * @param dBClusterSnapshotIdentifier
     *        The identifier for the DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        setDBClusterSnapshotIdentifier(dBClusterSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     * </p>
     * 
     * @return The DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier of the DB cluster that this DB cluster snapshot was created from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param snapshotCreateTime
     *        The time when the snapshot was taken, in Universal Coordinated Time (UTC).
     */

    public void setSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }

    /**
     * <p>
     * The time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return The time when the snapshot was taken, in Universal Coordinated Time (UTC).
     */

    public java.util.Date getSnapshotCreateTime() {
        return this.snapshotCreateTime;
    }

    /**
     * <p>
     * The time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param snapshotCreateTime
     *        The time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        setSnapshotCreateTime(snapshotCreateTime);
        return this;
    }

    /**
     * <p>
     * The name of the database engine for this DB cluster snapshot.
     * </p>
     * 
     * @param engine
     *        The name of the database engine for this DB cluster snapshot.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine for this DB cluster snapshot.
     * </p>
     * 
     * @return The name of the database engine for this DB cluster snapshot.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine for this DB cluster snapshot.
     * </p>
     * 
     * @param engine
     *        The name of the database engine for this DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The engine mode of the database engine for this DB cluster snapshot.
     * </p>
     * 
     * @param engineMode
     *        The engine mode of the database engine for this DB cluster snapshot.
     */

    public void setEngineMode(String engineMode) {
        this.engineMode = engineMode;
    }

    /**
     * <p>
     * The engine mode of the database engine for this DB cluster snapshot.
     * </p>
     * 
     * @return The engine mode of the database engine for this DB cluster snapshot.
     */

    public String getEngineMode() {
        return this.engineMode;
    }

    /**
     * <p>
     * The engine mode of the database engine for this DB cluster snapshot.
     * </p>
     * 
     * @param engineMode
     *        The engine mode of the database engine for this DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withEngineMode(String engineMode) {
        setEngineMode(engineMode);
        return this;
    }

    /**
     * <p>
     * The allocated storage size of the DB cluster snapshot in gibibytes (GiB).
     * </p>
     * 
     * @param allocatedStorage
     *        The allocated storage size of the DB cluster snapshot in gibibytes (GiB).
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The allocated storage size of the DB cluster snapshot in gibibytes (GiB).
     * </p>
     * 
     * @return The allocated storage size of the DB cluster snapshot in gibibytes (GiB).
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The allocated storage size of the DB cluster snapshot in gibibytes (GiB).
     * </p>
     * 
     * @param allocatedStorage
     *        The allocated storage size of the DB cluster snapshot in gibibytes (GiB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The status of this DB cluster snapshot. Valid statuses are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>copying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of this DB cluster snapshot. Valid statuses are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>available</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>copying</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>creating</code>
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this DB cluster snapshot. Valid statuses are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>copying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of this DB cluster snapshot. Valid statuses are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>available</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>copying</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>creating</code>
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of this DB cluster snapshot. Valid statuses are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>available</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>copying</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of this DB cluster snapshot. Valid statuses are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>available</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>copying</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>creating</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The port that the DB cluster was listening on at the time of the snapshot.
     * </p>
     * 
     * @param port
     *        The port that the DB cluster was listening on at the time of the snapshot.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port that the DB cluster was listening on at the time of the snapshot.
     * </p>
     * 
     * @return The port that the DB cluster was listening on at the time of the snapshot.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port that the DB cluster was listening on at the time of the snapshot.
     * </p>
     * 
     * @param port
     *        The port that the DB cluster was listening on at the time of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The VPC ID associated with the DB cluster snapshot.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID associated with the DB cluster snapshot.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID associated with the DB cluster snapshot.
     * </p>
     * 
     * @return The VPC ID associated with the DB cluster snapshot.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID associated with the DB cluster snapshot.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID associated with the DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param clusterCreateTime
     *        The time when the DB cluster was created, in Universal Coordinated Time (UTC).
     */

    public void setClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
    }

    /**
     * <p>
     * The time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return The time when the DB cluster was created, in Universal Coordinated Time (UTC).
     */

    public java.util.Date getClusterCreateTime() {
        return this.clusterCreateTime;
    }

    /**
     * <p>
     * The time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param clusterCreateTime
     *        The time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withClusterCreateTime(java.util.Date clusterCreateTime) {
        setClusterCreateTime(clusterCreateTime);
        return this;
    }

    /**
     * <p>
     * The master username for this DB cluster snapshot.
     * </p>
     * 
     * @param masterUsername
     *        The master username for this DB cluster snapshot.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The master username for this DB cluster snapshot.
     * </p>
     * 
     * @return The master username for this DB cluster snapshot.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The master username for this DB cluster snapshot.
     * </p>
     * 
     * @param masterUsername
     *        The master username for this DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The version of the database engine for this DB cluster snapshot.
     * </p>
     * 
     * @param engineVersion
     *        The version of the database engine for this DB cluster snapshot.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the database engine for this DB cluster snapshot.
     * </p>
     * 
     * @return The version of the database engine for this DB cluster snapshot.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the database engine for this DB cluster snapshot.
     * </p>
     * 
     * @param engineVersion
     *        The version of the database engine for this DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The license model information for this DB cluster snapshot.
     * </p>
     * 
     * @param licenseModel
     *        The license model information for this DB cluster snapshot.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model information for this DB cluster snapshot.
     * </p>
     * 
     * @return The license model information for this DB cluster snapshot.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The license model information for this DB cluster snapshot.
     * </p>
     * 
     * @param licenseModel
     *        The license model information for this DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * The type of the DB cluster snapshot.
     * </p>
     * 
     * @param snapshotType
     *        The type of the DB cluster snapshot.
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The type of the DB cluster snapshot.
     * </p>
     * 
     * @return The type of the DB cluster snapshot.
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p>
     * The type of the DB cluster snapshot.
     * </p>
     * 
     * @param snapshotType
     *        The type of the DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withSnapshotType(String snapshotType) {
        setSnapshotType(snapshotType);
        return this;
    }

    /**
     * <p>
     * The percentage of the estimated data that has been transferred.
     * </p>
     * 
     * @param percentProgress
     *        The percentage of the estimated data that has been transferred.
     */

    public void setPercentProgress(Integer percentProgress) {
        this.percentProgress = percentProgress;
    }

    /**
     * <p>
     * The percentage of the estimated data that has been transferred.
     * </p>
     * 
     * @return The percentage of the estimated data that has been transferred.
     */

    public Integer getPercentProgress() {
        return this.percentProgress;
    }

    /**
     * <p>
     * The percentage of the estimated data that has been transferred.
     * </p>
     * 
     * @param percentProgress
     *        The percentage of the estimated data that has been transferred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withPercentProgress(Integer percentProgress) {
        setPercentProgress(percentProgress);
        return this;
    }

    /**
     * <p>
     * Indicates whether the DB cluster snapshot is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Indicates whether the DB cluster snapshot is encrypted.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Indicates whether the DB cluster snapshot is encrypted.
     * </p>
     * 
     * @return Indicates whether the DB cluster snapshot is encrypted.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * Indicates whether the DB cluster snapshot is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Indicates whether the DB cluster snapshot is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the DB cluster snapshot is encrypted.
     * </p>
     * 
     * @return Indicates whether the DB cluster snapshot is encrypted.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the Amazon Web Services KMS key identifier for the encrypted DB cluster
     * snapshot.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is true, the Amazon Web Services KMS key identifier for the encrypted DB
     *        cluster snapshot.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the Amazon Web Services KMS key identifier for the encrypted DB cluster
     * snapshot.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * 
     * @return If <code>StorageEncrypted</code> is true, the Amazon Web Services KMS key identifier for the encrypted DB
     *         cluster snapshot.</p>
     *         <p>
     *         The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *         key.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the Amazon Web Services KMS key identifier for the encrypted DB cluster
     * snapshot.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is true, the Amazon Web Services KMS key identifier for the encrypted DB
     *        cluster snapshot.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster snapshot.
     * </p>
     * 
     * @param dBClusterSnapshotArn
     *        The Amazon Resource Name (ARN) for the DB cluster snapshot.
     */

    public void setDBClusterSnapshotArn(String dBClusterSnapshotArn) {
        this.dBClusterSnapshotArn = dBClusterSnapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster snapshot.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the DB cluster snapshot.
     */

    public String getDBClusterSnapshotArn() {
        return this.dBClusterSnapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster snapshot.
     * </p>
     * 
     * @param dBClusterSnapshotArn
     *        The Amazon Resource Name (ARN) for the DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withDBClusterSnapshotArn(String dBClusterSnapshotArn) {
        setDBClusterSnapshotArn(dBClusterSnapshotArn);
        return this;
    }

    /**
     * <p>
     * If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN) for the
     * source DB cluster snapshot, otherwise, a null value.
     * </p>
     * 
     * @param sourceDBClusterSnapshotArn
     *        If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN)
     *        for the source DB cluster snapshot, otherwise, a null value.
     */

    public void setSourceDBClusterSnapshotArn(String sourceDBClusterSnapshotArn) {
        this.sourceDBClusterSnapshotArn = sourceDBClusterSnapshotArn;
    }

    /**
     * <p>
     * If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN) for the
     * source DB cluster snapshot, otherwise, a null value.
     * </p>
     * 
     * @return If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN)
     *         for the source DB cluster snapshot, otherwise, a null value.
     */

    public String getSourceDBClusterSnapshotArn() {
        return this.sourceDBClusterSnapshotArn;
    }

    /**
     * <p>
     * If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN) for the
     * source DB cluster snapshot, otherwise, a null value.
     * </p>
     * 
     * @param sourceDBClusterSnapshotArn
     *        If the DB cluster snapshot was copied from a source DB cluster snapshot, the Amazon Resource Name (ARN)
     *        for the source DB cluster snapshot, otherwise, a null value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withSourceDBClusterSnapshotArn(String sourceDBClusterSnapshotArn) {
        setSourceDBClusterSnapshotArn(sourceDBClusterSnapshotArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database
     * accounts is enabled.
     * </p>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        Indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database
     *        accounts is enabled.
     */

    public void setIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * Indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database
     * accounts is enabled.
     * </p>
     * 
     * @return Indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to
     *         database accounts is enabled.
     */

    public Boolean getIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * Indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database
     * accounts is enabled.
     * </p>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        Indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database
     *        accounts is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        setIAMDatabaseAuthenticationEnabled(iAMDatabaseAuthenticationEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database
     * accounts is enabled.
     * </p>
     * 
     * @return Indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to
     *         database accounts is enabled.
     */

    public Boolean isIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTagList() {
        if (tagList == null) {
            tagList = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tagList;
    }

    /**
     * @param tagList
     */

    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new com.amazonaws.internal.SdkInternalList<Tag>(tagList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withTagList(Tag... tagList) {
        if (this.tagList == null) {
            setTagList(new com.amazonaws.internal.SdkInternalList<Tag>(tagList.length));
        }
        for (Tag ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * @param tagList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param dBSystemId
     *        Reserved for future use.
     */

    public void setDBSystemId(String dBSystemId) {
        this.dBSystemId = dBSystemId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getDBSystemId() {
        return this.dBSystemId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param dBSystemId
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withDBSystemId(String dBSystemId) {
        setDBSystemId(dBSystemId);
        return this;
    }

    /**
     * <p>
     * The storage type associated with the DB cluster snapshot.
     * </p>
     * <p>
     * This setting is only for Aurora DB clusters.
     * </p>
     * 
     * @param storageType
     *        The storage type associated with the DB cluster snapshot.</p>
     *        <p>
     *        This setting is only for Aurora DB clusters.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The storage type associated with the DB cluster snapshot.
     * </p>
     * <p>
     * This setting is only for Aurora DB clusters.
     * </p>
     * 
     * @return The storage type associated with the DB cluster snapshot.</p>
     *         <p>
     *         This setting is only for Aurora DB clusters.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The storage type associated with the DB cluster snapshot.
     * </p>
     * <p>
     * This setting is only for Aurora DB clusters.
     * </p>
     * 
     * @param storageType
     *        The storage type associated with the DB cluster snapshot.</p>
     *        <p>
     *        This setting is only for Aurora DB clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The resource ID of the DB cluster that this DB cluster snapshot was created from.
     * </p>
     * 
     * @param dbClusterResourceId
     *        The resource ID of the DB cluster that this DB cluster snapshot was created from.
     */

    public void setDbClusterResourceId(String dbClusterResourceId) {
        this.dbClusterResourceId = dbClusterResourceId;
    }

    /**
     * <p>
     * The resource ID of the DB cluster that this DB cluster snapshot was created from.
     * </p>
     * 
     * @return The resource ID of the DB cluster that this DB cluster snapshot was created from.
     */

    public String getDbClusterResourceId() {
        return this.dbClusterResourceId;
    }

    /**
     * <p>
     * The resource ID of the DB cluster that this DB cluster snapshot was created from.
     * </p>
     * 
     * @param dbClusterResourceId
     *        The resource ID of the DB cluster that this DB cluster snapshot was created from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withDbClusterResourceId(String dbClusterResourceId) {
        setDbClusterResourceId(dbClusterResourceId);
        return this;
    }

    /**
     * <p>
     * The storage throughput for the DB cluster snapshot. The throughput is automatically set based on the IOPS that
     * you provision, and is not configurable.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     * 
     * @param storageThroughput
     *        The storage throughput for the DB cluster snapshot. The throughput is automatically set based on the IOPS
     *        that you provision, and is not configurable.</p>
     *        <p>
     *        This setting is only for non-Aurora Multi-AZ DB clusters.
     */

    public void setStorageThroughput(Integer storageThroughput) {
        this.storageThroughput = storageThroughput;
    }

    /**
     * <p>
     * The storage throughput for the DB cluster snapshot. The throughput is automatically set based on the IOPS that
     * you provision, and is not configurable.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     * 
     * @return The storage throughput for the DB cluster snapshot. The throughput is automatically set based on the IOPS
     *         that you provision, and is not configurable.</p>
     *         <p>
     *         This setting is only for non-Aurora Multi-AZ DB clusters.
     */

    public Integer getStorageThroughput() {
        return this.storageThroughput;
    }

    /**
     * <p>
     * The storage throughput for the DB cluster snapshot. The throughput is automatically set based on the IOPS that
     * you provision, and is not configurable.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     * 
     * @param storageThroughput
     *        The storage throughput for the DB cluster snapshot. The throughput is automatically set based on the IOPS
     *        that you provision, and is not configurable.</p>
     *        <p>
     *        This setting is only for non-Aurora Multi-AZ DB clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterSnapshot withStorageThroughput(Integer storageThroughput) {
        setStorageThroughput(storageThroughput);
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getDBClusterSnapshotIdentifier() != null)
            sb.append("DBClusterSnapshotIdentifier: ").append(getDBClusterSnapshotIdentifier()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getSnapshotCreateTime() != null)
            sb.append("SnapshotCreateTime: ").append(getSnapshotCreateTime()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineMode() != null)
            sb.append("EngineMode: ").append(getEngineMode()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getClusterCreateTime() != null)
            sb.append("ClusterCreateTime: ").append(getClusterCreateTime()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: ").append(getSnapshotType()).append(",");
        if (getPercentProgress() != null)
            sb.append("PercentProgress: ").append(getPercentProgress()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getDBClusterSnapshotArn() != null)
            sb.append("DBClusterSnapshotArn: ").append(getDBClusterSnapshotArn()).append(",");
        if (getSourceDBClusterSnapshotArn() != null)
            sb.append("SourceDBClusterSnapshotArn: ").append(getSourceDBClusterSnapshotArn()).append(",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: ").append(getIAMDatabaseAuthenticationEnabled()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList()).append(",");
        if (getDBSystemId() != null)
            sb.append("DBSystemId: ").append(getDBSystemId()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getDbClusterResourceId() != null)
            sb.append("DbClusterResourceId: ").append(getDbClusterResourceId()).append(",");
        if (getStorageThroughput() != null)
            sb.append("StorageThroughput: ").append(getStorageThroughput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBClusterSnapshot == false)
            return false;
        DBClusterSnapshot other = (DBClusterSnapshot) obj;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getDBClusterSnapshotIdentifier() == null ^ this.getDBClusterSnapshotIdentifier() == null)
            return false;
        if (other.getDBClusterSnapshotIdentifier() != null && other.getDBClusterSnapshotIdentifier().equals(this.getDBClusterSnapshotIdentifier()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotCreateTime() == null ^ this.getSnapshotCreateTime() == null)
            return false;
        if (other.getSnapshotCreateTime() != null && other.getSnapshotCreateTime().equals(this.getSnapshotCreateTime()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineMode() == null ^ this.getEngineMode() == null)
            return false;
        if (other.getEngineMode() != null && other.getEngineMode().equals(this.getEngineMode()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null)
            return false;
        if (other.getClusterCreateTime() != null && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false)
            return false;
        if (other.getPercentProgress() == null ^ this.getPercentProgress() == null)
            return false;
        if (other.getPercentProgress() != null && other.getPercentProgress().equals(this.getPercentProgress()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDBClusterSnapshotArn() == null ^ this.getDBClusterSnapshotArn() == null)
            return false;
        if (other.getDBClusterSnapshotArn() != null && other.getDBClusterSnapshotArn().equals(this.getDBClusterSnapshotArn()) == false)
            return false;
        if (other.getSourceDBClusterSnapshotArn() == null ^ this.getSourceDBClusterSnapshotArn() == null)
            return false;
        if (other.getSourceDBClusterSnapshotArn() != null && other.getSourceDBClusterSnapshotArn().equals(this.getSourceDBClusterSnapshotArn()) == false)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() == null ^ this.getIAMDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() != null
                && other.getIAMDatabaseAuthenticationEnabled().equals(this.getIAMDatabaseAuthenticationEnabled()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        if (other.getDBSystemId() == null ^ this.getDBSystemId() == null)
            return false;
        if (other.getDBSystemId() != null && other.getDBSystemId().equals(this.getDBSystemId()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getDbClusterResourceId() == null ^ this.getDbClusterResourceId() == null)
            return false;
        if (other.getDbClusterResourceId() != null && other.getDbClusterResourceId().equals(this.getDbClusterResourceId()) == false)
            return false;
        if (other.getStorageThroughput() == null ^ this.getStorageThroughput() == null)
            return false;
        if (other.getStorageThroughput() != null && other.getStorageThroughput().equals(this.getStorageThroughput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getDBClusterSnapshotIdentifier() == null) ? 0 : getDBClusterSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCreateTime() == null) ? 0 : getSnapshotCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineMode() == null) ? 0 : getEngineMode().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getClusterCreateTime() == null) ? 0 : getClusterCreateTime().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getPercentProgress() == null) ? 0 : getPercentProgress().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDBClusterSnapshotArn() == null) ? 0 : getDBClusterSnapshotArn().hashCode());
        hashCode = prime * hashCode + ((getSourceDBClusterSnapshotArn() == null) ? 0 : getSourceDBClusterSnapshotArn().hashCode());
        hashCode = prime * hashCode + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0 : getIAMDatabaseAuthenticationEnabled().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        hashCode = prime * hashCode + ((getDBSystemId() == null) ? 0 : getDBSystemId().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getDbClusterResourceId() == null) ? 0 : getDbClusterResourceId().hashCode());
        hashCode = prime * hashCode + ((getStorageThroughput() == null) ? 0 : getStorageThroughput().hashCode());
        return hashCode;
    }

    @Override
    public DBClusterSnapshot clone() {
        try {
            return (DBClusterSnapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
