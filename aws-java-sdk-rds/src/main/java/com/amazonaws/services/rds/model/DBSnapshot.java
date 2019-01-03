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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the details of an Amazon RDS DB snapshot.
 * </p>
 * <p>
 * This data type is used as a response element in the <a>DescribeDBSnapshots</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBSnapshot implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the identifier for the DB snapshot.
     * </p>
     */
    private String dBSnapshotIdentifier;
    /**
     * <p>
     * Specifies the DB instance identifier of the DB instance this DB snapshot was created from.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date snapshotCreateTime;
    /**
     * <p>
     * Specifies the name of the database engine.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * Specifies the status of this DB snapshot.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies the port that the database engine was listening on at the time of the snapshot.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Provides the VPC ID associated with the DB snapshot.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Specifies the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date instanceCreateTime;
    /**
     * <p>
     * Provides the master username for the DB snapshot.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * Specifies the version of the database engine.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * Provides the type of the DB snapshot.
     * </p>
     */
    private String snapshotType;
    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * Provides the option group name for the DB snapshot.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * The percentage of the estimated data that has been transferred.
     * </p>
     */
    private Integer percentProgress;
    /**
     * <p>
     * The AWS Region that the DB snapshot was created in or copied from.
     * </p>
     */
    private String sourceRegion;
    /**
     * <p>
     * The DB snapshot Amazon Resource Name (ARN) that the DB snapshot was copied from. It only has value in case of
     * cross-customer or cross-region copy.
     * </p>
     */
    private String sourceDBSnapshotIdentifier;
    /**
     * <p>
     * Specifies the storage type associated with DB snapshot.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     */
    private String tdeCredentialArn;
    /**
     * <p>
     * Specifies whether the DB snapshot is encrypted.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * If <code>Encrypted</code> is true, the AWS KMS key identifier for the encrypted DB snapshot.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * </p>
     */
    private String dBSnapshotArn;
    /**
     * <p>
     * The time zone of the DB snapshot. In most cases, the <code>Timezone</code> element is empty.
     * <code>Timezone</code> content appears only for snapshots taken from Microsoft SQL Server DB instances that were
     * created with a time zone specified.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     */
    private Boolean iAMDatabaseAuthenticationEnabled;
    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance when the
     * DB snapshot was created.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProcessorFeature> processorFeatures;
    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
     * </p>
     */
    private String dbiResourceId;

    /**
     * <p>
     * Specifies the identifier for the DB snapshot.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        Specifies the identifier for the DB snapshot.
     */

    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * Specifies the identifier for the DB snapshot.
     * </p>
     * 
     * @return Specifies the identifier for the DB snapshot.
     */

    public String getDBSnapshotIdentifier() {
        return this.dBSnapshotIdentifier;
    }

    /**
     * <p>
     * Specifies the identifier for the DB snapshot.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        Specifies the identifier for the DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        setDBSnapshotIdentifier(dBSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the DB instance identifier of the DB instance this DB snapshot was created from.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        Specifies the DB instance identifier of the DB instance this DB snapshot was created from.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * Specifies the DB instance identifier of the DB instance this DB snapshot was created from.
     * </p>
     * 
     * @return Specifies the DB instance identifier of the DB instance this DB snapshot was created from.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * Specifies the DB instance identifier of the DB instance this DB snapshot was created from.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        Specifies the DB instance identifier of the DB instance this DB snapshot was created from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param snapshotCreateTime
     *        Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     */

    public void setSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }

    /**
     * <p>
     * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     */

    public java.util.Date getSnapshotCreateTime() {
        return this.snapshotCreateTime;
    }

    /**
     * <p>
     * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param snapshotCreateTime
     *        Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        setSnapshotCreateTime(snapshotCreateTime);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the database engine.
     * </p>
     * 
     * @param engine
     *        Specifies the name of the database engine.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Specifies the name of the database engine.
     * </p>
     * 
     * @return Specifies the name of the database engine.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * Specifies the name of the database engine.
     * </p>
     * 
     * @param engine
     *        Specifies the name of the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     * 
     * @param allocatedStorage
     *        Specifies the allocated storage size in gibibytes (GiB).
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     * 
     * @return Specifies the allocated storage size in gibibytes (GiB).
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     * 
     * @param allocatedStorage
     *        Specifies the allocated storage size in gibibytes (GiB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * Specifies the status of this DB snapshot.
     * </p>
     * 
     * @param status
     *        Specifies the status of this DB snapshot.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of this DB snapshot.
     * </p>
     * 
     * @return Specifies the status of this DB snapshot.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the status of this DB snapshot.
     * </p>
     * 
     * @param status
     *        Specifies the status of this DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the port that the database engine was listening on at the time of the snapshot.
     * </p>
     * 
     * @param port
     *        Specifies the port that the database engine was listening on at the time of the snapshot.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Specifies the port that the database engine was listening on at the time of the snapshot.
     * </p>
     * 
     * @return Specifies the port that the database engine was listening on at the time of the snapshot.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * Specifies the port that the database engine was listening on at the time of the snapshot.
     * </p>
     * 
     * @param port
     *        Specifies the port that the database engine was listening on at the time of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * </p>
     * 
     * @param availabilityZone
     *        Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * </p>
     * 
     * @return Specifies the name of the Availability Zone the DB instance was located in at the time of the DB
     *         snapshot.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * </p>
     * 
     * @param availabilityZone
     *        Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB snapshot.
     * </p>
     * 
     * @param vpcId
     *        Provides the VPC ID associated with the DB snapshot.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB snapshot.
     * </p>
     * 
     * @return Provides the VPC ID associated with the DB snapshot.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB snapshot.
     * </p>
     * 
     * @param vpcId
     *        Provides the VPC ID associated with the DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Specifies the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param instanceCreateTime
     *        Specifies the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     */

    public void setInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }

    /**
     * <p>
     * Specifies the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return Specifies the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     */

    public java.util.Date getInstanceCreateTime() {
        return this.instanceCreateTime;
    }

    /**
     * <p>
     * Specifies the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param instanceCreateTime
     *        Specifies the time when the snapshot was taken, in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withInstanceCreateTime(java.util.Date instanceCreateTime) {
        setInstanceCreateTime(instanceCreateTime);
        return this;
    }

    /**
     * <p>
     * Provides the master username for the DB snapshot.
     * </p>
     * 
     * @param masterUsername
     *        Provides the master username for the DB snapshot.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * Provides the master username for the DB snapshot.
     * </p>
     * 
     * @return Provides the master username for the DB snapshot.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * Provides the master username for the DB snapshot.
     * </p>
     * 
     * @param masterUsername
     *        Provides the master username for the DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * Specifies the version of the database engine.
     * </p>
     * 
     * @param engineVersion
     *        Specifies the version of the database engine.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Specifies the version of the database engine.
     * </p>
     * 
     * @return Specifies the version of the database engine.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * Specifies the version of the database engine.
     * </p>
     * 
     * @param engineVersion
     *        Specifies the version of the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     * 
     * @param licenseModel
     *        License model information for the restored DB instance.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     * 
     * @return License model information for the restored DB instance.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     * 
     * @param licenseModel
     *        License model information for the restored DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * Provides the type of the DB snapshot.
     * </p>
     * 
     * @param snapshotType
     *        Provides the type of the DB snapshot.
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * Provides the type of the DB snapshot.
     * </p>
     * 
     * @return Provides the type of the DB snapshot.
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p>
     * Provides the type of the DB snapshot.
     * </p>
     * 
     * @param snapshotType
     *        Provides the type of the DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withSnapshotType(String snapshotType) {
        setSnapshotType(snapshotType);
        return this;
    }

    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * </p>
     * 
     * @param iops
     *        Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the
     *        snapshot.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * </p>
     * 
     * @return Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the
     *         snapshot.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * </p>
     * 
     * @param iops
     *        Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the
     *        snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Provides the option group name for the DB snapshot.
     * </p>
     * 
     * @param optionGroupName
     *        Provides the option group name for the DB snapshot.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * Provides the option group name for the DB snapshot.
     * </p>
     * 
     * @return Provides the option group name for the DB snapshot.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * Provides the option group name for the DB snapshot.
     * </p>
     * 
     * @param optionGroupName
     *        Provides the option group name for the DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
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

    public DBSnapshot withPercentProgress(Integer percentProgress) {
        setPercentProgress(percentProgress);
        return this;
    }

    /**
     * <p>
     * The AWS Region that the DB snapshot was created in or copied from.
     * </p>
     * 
     * @param sourceRegion
     *        The AWS Region that the DB snapshot was created in or copied from.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The AWS Region that the DB snapshot was created in or copied from.
     * </p>
     * 
     * @return The AWS Region that the DB snapshot was created in or copied from.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * <p>
     * The AWS Region that the DB snapshot was created in or copied from.
     * </p>
     * 
     * @param sourceRegion
     *        The AWS Region that the DB snapshot was created in or copied from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * The DB snapshot Amazon Resource Name (ARN) that the DB snapshot was copied from. It only has value in case of
     * cross-customer or cross-region copy.
     * </p>
     * 
     * @param sourceDBSnapshotIdentifier
     *        The DB snapshot Amazon Resource Name (ARN) that the DB snapshot was copied from. It only has value in case
     *        of cross-customer or cross-region copy.
     */

    public void setSourceDBSnapshotIdentifier(String sourceDBSnapshotIdentifier) {
        this.sourceDBSnapshotIdentifier = sourceDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The DB snapshot Amazon Resource Name (ARN) that the DB snapshot was copied from. It only has value in case of
     * cross-customer or cross-region copy.
     * </p>
     * 
     * @return The DB snapshot Amazon Resource Name (ARN) that the DB snapshot was copied from. It only has value in
     *         case of cross-customer or cross-region copy.
     */

    public String getSourceDBSnapshotIdentifier() {
        return this.sourceDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The DB snapshot Amazon Resource Name (ARN) that the DB snapshot was copied from. It only has value in case of
     * cross-customer or cross-region copy.
     * </p>
     * 
     * @param sourceDBSnapshotIdentifier
     *        The DB snapshot Amazon Resource Name (ARN) that the DB snapshot was copied from. It only has value in case
     *        of cross-customer or cross-region copy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withSourceDBSnapshotIdentifier(String sourceDBSnapshotIdentifier) {
        setSourceDBSnapshotIdentifier(sourceDBSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the storage type associated with DB snapshot.
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type associated with DB snapshot.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type associated with DB snapshot.
     * </p>
     * 
     * @return Specifies the storage type associated with DB snapshot.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Specifies the storage type associated with DB snapshot.
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type associated with DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which to associate the instance for TDE encryption.
     */

    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * 
     * @return The ARN from the key store with which to associate the instance for TDE encryption.
     */

    public String getTdeCredentialArn() {
        return this.tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which to associate the instance for TDE encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withTdeCredentialArn(String tdeCredentialArn) {
        setTdeCredentialArn(tdeCredentialArn);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB snapshot is encrypted.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the DB snapshot is encrypted.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Specifies whether the DB snapshot is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB snapshot is encrypted.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Specifies whether the DB snapshot is encrypted.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the DB snapshot is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB snapshot is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB snapshot is encrypted.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * If <code>Encrypted</code> is true, the AWS KMS key identifier for the encrypted DB snapshot.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>Encrypted</code> is true, the AWS KMS key identifier for the encrypted DB snapshot.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If <code>Encrypted</code> is true, the AWS KMS key identifier for the encrypted DB snapshot.
     * </p>
     * 
     * @return If <code>Encrypted</code> is true, the AWS KMS key identifier for the encrypted DB snapshot.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * If <code>Encrypted</code> is true, the AWS KMS key identifier for the encrypted DB snapshot.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>Encrypted</code> is true, the AWS KMS key identifier for the encrypted DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * </p>
     * 
     * @param dBSnapshotArn
     *        The Amazon Resource Name (ARN) for the DB snapshot.
     */

    public void setDBSnapshotArn(String dBSnapshotArn) {
        this.dBSnapshotArn = dBSnapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the DB snapshot.
     */

    public String getDBSnapshotArn() {
        return this.dBSnapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * </p>
     * 
     * @param dBSnapshotArn
     *        The Amazon Resource Name (ARN) for the DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withDBSnapshotArn(String dBSnapshotArn) {
        setDBSnapshotArn(dBSnapshotArn);
        return this;
    }

    /**
     * <p>
     * The time zone of the DB snapshot. In most cases, the <code>Timezone</code> element is empty.
     * <code>Timezone</code> content appears only for snapshots taken from Microsoft SQL Server DB instances that were
     * created with a time zone specified.
     * </p>
     * 
     * @param timezone
     *        The time zone of the DB snapshot. In most cases, the <code>Timezone</code> element is empty.
     *        <code>Timezone</code> content appears only for snapshots taken from Microsoft SQL Server DB instances that
     *        were created with a time zone specified.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone of the DB snapshot. In most cases, the <code>Timezone</code> element is empty.
     * <code>Timezone</code> content appears only for snapshots taken from Microsoft SQL Server DB instances that were
     * created with a time zone specified.
     * </p>
     * 
     * @return The time zone of the DB snapshot. In most cases, the <code>Timezone</code> element is empty.
     *         <code>Timezone</code> content appears only for snapshots taken from Microsoft SQL Server DB instances
     *         that were created with a time zone specified.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The time zone of the DB snapshot. In most cases, the <code>Timezone</code> element is empty.
     * <code>Timezone</code> content appears only for snapshots taken from Microsoft SQL Server DB instances that were
     * created with a time zone specified.
     * </p>
     * 
     * @param timezone
     *        The time zone of the DB snapshot. In most cases, the <code>Timezone</code> element is empty.
     *        <code>Timezone</code> content appears only for snapshots taken from Microsoft SQL Server DB instances that
     *        were created with a time zone specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *        otherwise false.
     */

    public void setIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * 
     * @return True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *         otherwise false.
     */

    public Boolean getIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *        otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        setIAMDatabaseAuthenticationEnabled(iAMDatabaseAuthenticationEnabled);
        return this;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * 
     * @return True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *         otherwise false.
     */

    public Boolean isIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance when the
     * DB snapshot was created.
     * </p>
     * 
     * @return The number of CPU cores and the number of threads per core for the DB instance class of the DB instance
     *         when the DB snapshot was created.
     */

    public java.util.List<ProcessorFeature> getProcessorFeatures() {
        if (processorFeatures == null) {
            processorFeatures = new com.amazonaws.internal.SdkInternalList<ProcessorFeature>();
        }
        return processorFeatures;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance when the
     * DB snapshot was created.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB instance
     *        when the DB snapshot was created.
     */

    public void setProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        if (processorFeatures == null) {
            this.processorFeatures = null;
            return;
        }

        this.processorFeatures = new com.amazonaws.internal.SdkInternalList<ProcessorFeature>(processorFeatures);
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance when the
     * DB snapshot was created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessorFeatures(java.util.Collection)} or {@link #withProcessorFeatures(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB instance
     *        when the DB snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withProcessorFeatures(ProcessorFeature... processorFeatures) {
        if (this.processorFeatures == null) {
            setProcessorFeatures(new com.amazonaws.internal.SdkInternalList<ProcessorFeature>(processorFeatures.length));
        }
        for (ProcessorFeature ele : processorFeatures) {
            this.processorFeatures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance when the
     * DB snapshot was created.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB instance
     *        when the DB snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
        return this;
    }

    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
     * </p>
     * 
     * @param dbiResourceId
     *        The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
     */

    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
     * </p>
     * 
     * @return The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
     */

    public String getDbiResourceId() {
        return this.dbiResourceId;
    }

    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
     * </p>
     * 
     * @param dbiResourceId
     *        The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBSnapshot withDbiResourceId(String dbiResourceId) {
        setDbiResourceId(dbiResourceId);
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
        if (getDBSnapshotIdentifier() != null)
            sb.append("DBSnapshotIdentifier: ").append(getDBSnapshotIdentifier()).append(",");
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getSnapshotCreateTime() != null)
            sb.append("SnapshotCreateTime: ").append(getSnapshotCreateTime()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getInstanceCreateTime() != null)
            sb.append("InstanceCreateTime: ").append(getInstanceCreateTime()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: ").append(getSnapshotType()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getPercentProgress() != null)
            sb.append("PercentProgress: ").append(getPercentProgress()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion()).append(",");
        if (getSourceDBSnapshotIdentifier() != null)
            sb.append("SourceDBSnapshotIdentifier: ").append(getSourceDBSnapshotIdentifier()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: ").append(getTdeCredentialArn()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getDBSnapshotArn() != null)
            sb.append("DBSnapshotArn: ").append(getDBSnapshotArn()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: ").append(getIAMDatabaseAuthenticationEnabled()).append(",");
        if (getProcessorFeatures() != null)
            sb.append("ProcessorFeatures: ").append(getProcessorFeatures()).append(",");
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: ").append(getDbiResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBSnapshot == false)
            return false;
        DBSnapshot other = (DBSnapshot) obj;
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null)
            return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false)
            return false;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getSnapshotCreateTime() == null ^ this.getSnapshotCreateTime() == null)
            return false;
        if (other.getSnapshotCreateTime() != null && other.getSnapshotCreateTime().equals(this.getSnapshotCreateTime()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
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
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getInstanceCreateTime() == null ^ this.getInstanceCreateTime() == null)
            return false;
        if (other.getInstanceCreateTime() != null && other.getInstanceCreateTime().equals(this.getInstanceCreateTime()) == false)
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
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getPercentProgress() == null ^ this.getPercentProgress() == null)
            return false;
        if (other.getPercentProgress() != null && other.getPercentProgress().equals(this.getPercentProgress()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getSourceDBSnapshotIdentifier() == null ^ this.getSourceDBSnapshotIdentifier() == null)
            return false;
        if (other.getSourceDBSnapshotIdentifier() != null && other.getSourceDBSnapshotIdentifier().equals(this.getSourceDBSnapshotIdentifier()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null)
            return false;
        if (other.getTdeCredentialArn() != null && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDBSnapshotArn() == null ^ this.getDBSnapshotArn() == null)
            return false;
        if (other.getDBSnapshotArn() != null && other.getDBSnapshotArn().equals(this.getDBSnapshotArn()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() == null ^ this.getIAMDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() != null
                && other.getIAMDatabaseAuthenticationEnabled().equals(this.getIAMDatabaseAuthenticationEnabled()) == false)
            return false;
        if (other.getProcessorFeatures() == null ^ this.getProcessorFeatures() == null)
            return false;
        if (other.getProcessorFeatures() != null && other.getProcessorFeatures().equals(this.getProcessorFeatures()) == false)
            return false;
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCreateTime() == null) ? 0 : getSnapshotCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getInstanceCreateTime() == null) ? 0 : getInstanceCreateTime().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getPercentProgress() == null) ? 0 : getPercentProgress().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime * hashCode + ((getSourceDBSnapshotIdentifier() == null) ? 0 : getSourceDBSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDBSnapshotArn() == null) ? 0 : getDBSnapshotArn().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0 : getIAMDatabaseAuthenticationEnabled().hashCode());
        hashCode = prime * hashCode + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        return hashCode;
    }

    @Override
    public DBSnapshot clone() {
        try {
            return (DBSnapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
