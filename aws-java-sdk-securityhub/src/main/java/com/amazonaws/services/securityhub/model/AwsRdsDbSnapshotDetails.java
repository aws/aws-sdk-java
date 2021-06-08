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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about an Amazon RDS DB cluster snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbSnapshotDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbSnapshotDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name or ARN of the DB snapshot that is used to restore the DB instance.
     * </p>
     */
    private String dbSnapshotIdentifier;
    /**
     * <p>
     * A name for the DB instance.
     * </p>
     */
    private String dbInstanceIdentifier;
    /**
     * <p>
     * When the snapshot was taken in Coordinated Universal Time (UTC).
     * </p>
     */
    private String snapshotCreateTime;
    /**
     * <p>
     * The name of the database engine to use for this DB instance.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the database instance.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The status of this DB snapshot.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The port that the database engine was listening on at the time of the snapshot.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Specifies the name of the Availability Zone in which the DB instance was located at the time of the DB snapshot.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The VPC ID associated with the DB snapshot.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Specifies the time in Coordinated Universal Time (UTC) when the DB instance, from which the snapshot was taken,
     * was created.
     * </p>
     */
    private String instanceCreateTime;
    /**
     * <p>
     * The master user name for the DB snapshot.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * The version of the database engine.
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
     * The type of the DB snapshot.
     * </p>
     */
    private String snapshotType;
    /**
     * <p>
     * The provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The option group name for the DB snapshot.
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
     * The DB snapshot ARN that the DB snapshot was copied from.
     * </p>
     */
    private String sourceDbSnapshotIdentifier;
    /**
     * <p>
     * The storage type associated with the DB snapshot.
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
     * Whether the DB snapshot is encrypted.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * If <code>Encrypted</code> is <code>true</code>, the AWS KMS key identifier for the encrypted DB snapshot.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The time zone of the DB snapshot.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * Whether mapping of IAM accounts to database accounts is enabled.
     * </p>
     */
    private Boolean iamDatabaseAuthenticationEnabled;
    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     */
    private java.util.List<AwsRdsDbProcessorFeature> processorFeatures;
    /**
     * <p>
     * The identifier for the source DB instance.
     * </p>
     */
    private String dbiResourceId;

    /**
     * <p>
     * The name or ARN of the DB snapshot that is used to restore the DB instance.
     * </p>
     * 
     * @param dbSnapshotIdentifier
     *        The name or ARN of the DB snapshot that is used to restore the DB instance.
     */

    public void setDbSnapshotIdentifier(String dbSnapshotIdentifier) {
        this.dbSnapshotIdentifier = dbSnapshotIdentifier;
    }

    /**
     * <p>
     * The name or ARN of the DB snapshot that is used to restore the DB instance.
     * </p>
     * 
     * @return The name or ARN of the DB snapshot that is used to restore the DB instance.
     */

    public String getDbSnapshotIdentifier() {
        return this.dbSnapshotIdentifier;
    }

    /**
     * <p>
     * The name or ARN of the DB snapshot that is used to restore the DB instance.
     * </p>
     * 
     * @param dbSnapshotIdentifier
     *        The name or ARN of the DB snapshot that is used to restore the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withDbSnapshotIdentifier(String dbSnapshotIdentifier) {
        setDbSnapshotIdentifier(dbSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * A name for the DB instance.
     * </p>
     * 
     * @param dbInstanceIdentifier
     *        A name for the DB instance.
     */

    public void setDbInstanceIdentifier(String dbInstanceIdentifier) {
        this.dbInstanceIdentifier = dbInstanceIdentifier;
    }

    /**
     * <p>
     * A name for the DB instance.
     * </p>
     * 
     * @return A name for the DB instance.
     */

    public String getDbInstanceIdentifier() {
        return this.dbInstanceIdentifier;
    }

    /**
     * <p>
     * A name for the DB instance.
     * </p>
     * 
     * @param dbInstanceIdentifier
     *        A name for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withDbInstanceIdentifier(String dbInstanceIdentifier) {
        setDbInstanceIdentifier(dbInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * When the snapshot was taken in Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param snapshotCreateTime
     *        When the snapshot was taken in Coordinated Universal Time (UTC).
     */

    public void setSnapshotCreateTime(String snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }

    /**
     * <p>
     * When the snapshot was taken in Coordinated Universal Time (UTC).
     * </p>
     * 
     * @return When the snapshot was taken in Coordinated Universal Time (UTC).
     */

    public String getSnapshotCreateTime() {
        return this.snapshotCreateTime;
    }

    /**
     * <p>
     * When the snapshot was taken in Coordinated Universal Time (UTC).
     * </p>
     * 
     * @param snapshotCreateTime
     *        When the snapshot was taken in Coordinated Universal Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withSnapshotCreateTime(String snapshotCreateTime) {
        setSnapshotCreateTime(snapshotCreateTime);
        return this;
    }

    /**
     * <p>
     * The name of the database engine to use for this DB instance.
     * </p>
     * 
     * @param engine
     *        The name of the database engine to use for this DB instance.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine to use for this DB instance.
     * </p>
     * 
     * @return The name of the database engine to use for this DB instance.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine to use for this DB instance.
     * </p>
     * 
     * @param engine
     *        The name of the database engine to use for this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the database instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) to be initially allocated for the database instance.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the database instance.
     * </p>
     * 
     * @return The amount of storage (in gigabytes) to be initially allocated for the database instance.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the database instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) to be initially allocated for the database instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The status of this DB snapshot.
     * </p>
     * 
     * @param status
     *        The status of this DB snapshot.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this DB snapshot.
     * </p>
     * 
     * @return The status of this DB snapshot.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of this DB snapshot.
     * </p>
     * 
     * @param status
     *        The status of this DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The port that the database engine was listening on at the time of the snapshot.
     * </p>
     * 
     * @param port
     *        The port that the database engine was listening on at the time of the snapshot.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port that the database engine was listening on at the time of the snapshot.
     * </p>
     * 
     * @return The port that the database engine was listening on at the time of the snapshot.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port that the database engine was listening on at the time of the snapshot.
     * </p>
     * 
     * @param port
     *        The port that the database engine was listening on at the time of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone in which the DB instance was located at the time of the DB snapshot.
     * </p>
     * 
     * @param availabilityZone
     *        Specifies the name of the Availability Zone in which the DB instance was located at the time of the DB
     *        snapshot.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone in which the DB instance was located at the time of the DB snapshot.
     * </p>
     * 
     * @return Specifies the name of the Availability Zone in which the DB instance was located at the time of the DB
     *         snapshot.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone in which the DB instance was located at the time of the DB snapshot.
     * </p>
     * 
     * @param availabilityZone
     *        Specifies the name of the Availability Zone in which the DB instance was located at the time of the DB
     *        snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The VPC ID associated with the DB snapshot.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID associated with the DB snapshot.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID associated with the DB snapshot.
     * </p>
     * 
     * @return The VPC ID associated with the DB snapshot.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID associated with the DB snapshot.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID associated with the DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Specifies the time in Coordinated Universal Time (UTC) when the DB instance, from which the snapshot was taken,
     * was created.
     * </p>
     * 
     * @param instanceCreateTime
     *        Specifies the time in Coordinated Universal Time (UTC) when the DB instance, from which the snapshot was
     *        taken, was created.
     */

    public void setInstanceCreateTime(String instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }

    /**
     * <p>
     * Specifies the time in Coordinated Universal Time (UTC) when the DB instance, from which the snapshot was taken,
     * was created.
     * </p>
     * 
     * @return Specifies the time in Coordinated Universal Time (UTC) when the DB instance, from which the snapshot was
     *         taken, was created.
     */

    public String getInstanceCreateTime() {
        return this.instanceCreateTime;
    }

    /**
     * <p>
     * Specifies the time in Coordinated Universal Time (UTC) when the DB instance, from which the snapshot was taken,
     * was created.
     * </p>
     * 
     * @param instanceCreateTime
     *        Specifies the time in Coordinated Universal Time (UTC) when the DB instance, from which the snapshot was
     *        taken, was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withInstanceCreateTime(String instanceCreateTime) {
        setInstanceCreateTime(instanceCreateTime);
        return this;
    }

    /**
     * <p>
     * The master user name for the DB snapshot.
     * </p>
     * 
     * @param masterUsername
     *        The master user name for the DB snapshot.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The master user name for the DB snapshot.
     * </p>
     * 
     * @return The master user name for the DB snapshot.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The master user name for the DB snapshot.
     * </p>
     * 
     * @param masterUsername
     *        The master user name for the DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The version of the database engine.
     * </p>
     * 
     * @param engineVersion
     *        The version of the database engine.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the database engine.
     * </p>
     * 
     * @return The version of the database engine.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the database engine.
     * </p>
     * 
     * @param engineVersion
     *        The version of the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withEngineVersion(String engineVersion) {
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

    public AwsRdsDbSnapshotDetails withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * The type of the DB snapshot.
     * </p>
     * 
     * @param snapshotType
     *        The type of the DB snapshot.
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The type of the DB snapshot.
     * </p>
     * 
     * @return The type of the DB snapshot.
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p>
     * The type of the DB snapshot.
     * </p>
     * 
     * @param snapshotType
     *        The type of the DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withSnapshotType(String snapshotType) {
        setSnapshotType(snapshotType);
        return this;
    }

    /**
     * <p>
     * The provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * </p>
     * 
     * @param iops
     *        The provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * </p>
     * 
     * @return The provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * </p>
     * 
     * @param iops
     *        The provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The option group name for the DB snapshot.
     * </p>
     * 
     * @param optionGroupName
     *        The option group name for the DB snapshot.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The option group name for the DB snapshot.
     * </p>
     * 
     * @return The option group name for the DB snapshot.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The option group name for the DB snapshot.
     * </p>
     * 
     * @param optionGroupName
     *        The option group name for the DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withOptionGroupName(String optionGroupName) {
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

    public AwsRdsDbSnapshotDetails withPercentProgress(Integer percentProgress) {
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

    public AwsRdsDbSnapshotDetails withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
        return this;
    }

    /**
     * <p>
     * The DB snapshot ARN that the DB snapshot was copied from.
     * </p>
     * 
     * @param sourceDbSnapshotIdentifier
     *        The DB snapshot ARN that the DB snapshot was copied from.
     */

    public void setSourceDbSnapshotIdentifier(String sourceDbSnapshotIdentifier) {
        this.sourceDbSnapshotIdentifier = sourceDbSnapshotIdentifier;
    }

    /**
     * <p>
     * The DB snapshot ARN that the DB snapshot was copied from.
     * </p>
     * 
     * @return The DB snapshot ARN that the DB snapshot was copied from.
     */

    public String getSourceDbSnapshotIdentifier() {
        return this.sourceDbSnapshotIdentifier;
    }

    /**
     * <p>
     * The DB snapshot ARN that the DB snapshot was copied from.
     * </p>
     * 
     * @param sourceDbSnapshotIdentifier
     *        The DB snapshot ARN that the DB snapshot was copied from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withSourceDbSnapshotIdentifier(String sourceDbSnapshotIdentifier) {
        setSourceDbSnapshotIdentifier(sourceDbSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The storage type associated with the DB snapshot.
     * </p>
     * 
     * @param storageType
     *        The storage type associated with the DB snapshot.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The storage type associated with the DB snapshot.
     * </p>
     * 
     * @return The storage type associated with the DB snapshot.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The storage type associated with the DB snapshot.
     * </p>
     * 
     * @param storageType
     *        The storage type associated with the DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withStorageType(String storageType) {
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

    public AwsRdsDbSnapshotDetails withTdeCredentialArn(String tdeCredentialArn) {
        setTdeCredentialArn(tdeCredentialArn);
        return this;
    }

    /**
     * <p>
     * Whether the DB snapshot is encrypted.
     * </p>
     * 
     * @param encrypted
     *        Whether the DB snapshot is encrypted.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Whether the DB snapshot is encrypted.
     * </p>
     * 
     * @return Whether the DB snapshot is encrypted.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Whether the DB snapshot is encrypted.
     * </p>
     * 
     * @param encrypted
     *        Whether the DB snapshot is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Whether the DB snapshot is encrypted.
     * </p>
     * 
     * @return Whether the DB snapshot is encrypted.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * If <code>Encrypted</code> is <code>true</code>, the AWS KMS key identifier for the encrypted DB snapshot.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>Encrypted</code> is <code>true</code>, the AWS KMS key identifier for the encrypted DB snapshot.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If <code>Encrypted</code> is <code>true</code>, the AWS KMS key identifier for the encrypted DB snapshot.
     * </p>
     * 
     * @return If <code>Encrypted</code> is <code>true</code>, the AWS KMS key identifier for the encrypted DB snapshot.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * If <code>Encrypted</code> is <code>true</code>, the AWS KMS key identifier for the encrypted DB snapshot.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>Encrypted</code> is <code>true</code>, the AWS KMS key identifier for the encrypted DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The time zone of the DB snapshot.
     * </p>
     * 
     * @param timezone
     *        The time zone of the DB snapshot.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone of the DB snapshot.
     * </p>
     * 
     * @return The time zone of the DB snapshot.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The time zone of the DB snapshot.
     * </p>
     * 
     * @param timezone
     *        The time zone of the DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * Whether mapping of IAM accounts to database accounts is enabled.
     * </p>
     * 
     * @param iamDatabaseAuthenticationEnabled
     *        Whether mapping of IAM accounts to database accounts is enabled.
     */

    public void setIamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
        this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * Whether mapping of IAM accounts to database accounts is enabled.
     * </p>
     * 
     * @return Whether mapping of IAM accounts to database accounts is enabled.
     */

    public Boolean getIamDatabaseAuthenticationEnabled() {
        return this.iamDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * Whether mapping of IAM accounts to database accounts is enabled.
     * </p>
     * 
     * @param iamDatabaseAuthenticationEnabled
     *        Whether mapping of IAM accounts to database accounts is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withIamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
        setIamDatabaseAuthenticationEnabled(iamDatabaseAuthenticationEnabled);
        return this;
    }

    /**
     * <p>
     * Whether mapping of IAM accounts to database accounts is enabled.
     * </p>
     * 
     * @return Whether mapping of IAM accounts to database accounts is enabled.
     */

    public Boolean isIamDatabaseAuthenticationEnabled() {
        return this.iamDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * 
     * @return The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     */

    public java.util.List<AwsRdsDbProcessorFeature> getProcessorFeatures() {
        return processorFeatures;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     */

    public void setProcessorFeatures(java.util.Collection<AwsRdsDbProcessorFeature> processorFeatures) {
        if (processorFeatures == null) {
            this.processorFeatures = null;
            return;
        }

        this.processorFeatures = new java.util.ArrayList<AwsRdsDbProcessorFeature>(processorFeatures);
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessorFeatures(java.util.Collection)} or {@link #withProcessorFeatures(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withProcessorFeatures(AwsRdsDbProcessorFeature... processorFeatures) {
        if (this.processorFeatures == null) {
            setProcessorFeatures(new java.util.ArrayList<AwsRdsDbProcessorFeature>(processorFeatures.length));
        }
        for (AwsRdsDbProcessorFeature ele : processorFeatures) {
            this.processorFeatures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withProcessorFeatures(java.util.Collection<AwsRdsDbProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
        return this;
    }

    /**
     * <p>
     * The identifier for the source DB instance.
     * </p>
     * 
     * @param dbiResourceId
     *        The identifier for the source DB instance.
     */

    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * The identifier for the source DB instance.
     * </p>
     * 
     * @return The identifier for the source DB instance.
     */

    public String getDbiResourceId() {
        return this.dbiResourceId;
    }

    /**
     * <p>
     * The identifier for the source DB instance.
     * </p>
     * 
     * @param dbiResourceId
     *        The identifier for the source DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbSnapshotDetails withDbiResourceId(String dbiResourceId) {
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
        if (getDbSnapshotIdentifier() != null)
            sb.append("DbSnapshotIdentifier: ").append(getDbSnapshotIdentifier()).append(",");
        if (getDbInstanceIdentifier() != null)
            sb.append("DbInstanceIdentifier: ").append(getDbInstanceIdentifier()).append(",");
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
        if (getSourceDbSnapshotIdentifier() != null)
            sb.append("SourceDbSnapshotIdentifier: ").append(getSourceDbSnapshotIdentifier()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: ").append(getTdeCredentialArn()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getIamDatabaseAuthenticationEnabled() != null)
            sb.append("IamDatabaseAuthenticationEnabled: ").append(getIamDatabaseAuthenticationEnabled()).append(",");
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

        if (obj instanceof AwsRdsDbSnapshotDetails == false)
            return false;
        AwsRdsDbSnapshotDetails other = (AwsRdsDbSnapshotDetails) obj;
        if (other.getDbSnapshotIdentifier() == null ^ this.getDbSnapshotIdentifier() == null)
            return false;
        if (other.getDbSnapshotIdentifier() != null && other.getDbSnapshotIdentifier().equals(this.getDbSnapshotIdentifier()) == false)
            return false;
        if (other.getDbInstanceIdentifier() == null ^ this.getDbInstanceIdentifier() == null)
            return false;
        if (other.getDbInstanceIdentifier() != null && other.getDbInstanceIdentifier().equals(this.getDbInstanceIdentifier()) == false)
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
        if (other.getSourceDbSnapshotIdentifier() == null ^ this.getSourceDbSnapshotIdentifier() == null)
            return false;
        if (other.getSourceDbSnapshotIdentifier() != null && other.getSourceDbSnapshotIdentifier().equals(this.getSourceDbSnapshotIdentifier()) == false)
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
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getIamDatabaseAuthenticationEnabled() == null ^ this.getIamDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIamDatabaseAuthenticationEnabled() != null
                && other.getIamDatabaseAuthenticationEnabled().equals(this.getIamDatabaseAuthenticationEnabled()) == false)
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

        hashCode = prime * hashCode + ((getDbSnapshotIdentifier() == null) ? 0 : getDbSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDbInstanceIdentifier() == null) ? 0 : getDbInstanceIdentifier().hashCode());
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
        hashCode = prime * hashCode + ((getSourceDbSnapshotIdentifier() == null) ? 0 : getSourceDbSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getIamDatabaseAuthenticationEnabled() == null) ? 0 : getIamDatabaseAuthenticationEnabled().hashCode());
        hashCode = prime * hashCode + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbSnapshotDetails clone() {
        try {
            return (AwsRdsDbSnapshotDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbSnapshotDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
