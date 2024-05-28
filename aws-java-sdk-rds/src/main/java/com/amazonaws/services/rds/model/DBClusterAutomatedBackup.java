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
 * An automated backup of a DB cluster. It consists of system backups, transaction logs, and the database cluster
 * properties that existed at the time you deleted the source cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBClusterAutomatedBackup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBClusterAutomatedBackup implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the database engine for this automated backup.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The VPC ID associated with the DB cluster.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the automated backups.
     * </p>
     */
    private String dBClusterAutomatedBackupsArn;
    /**
     * <p>
     * The identifier for the source DB cluster, which can't be changed and which is unique to an Amazon Web Services
     * Region.
     * </p>
     */
    private String dBClusterIdentifier;

    private RestoreWindow restoreWindow;
    /**
     * <p>
     * The master user name of the automated backup.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * The resource ID for the source DB cluster, which can't be changed and which is unique to an Amazon Web Services
     * Region.
     * </p>
     */
    private String dbClusterResourceId;
    /**
     * <p>
     * The Amazon Web Services Region associated with the automated backup.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The license model information for this DB cluster automated backup.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * A list of status information for an automated backup:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>retained</code> - Automated backups for deleted clusters.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Indicates whether mapping of Amazon Web Services Identity and Access Management (IAM) accounts to database
     * accounts is enabled.
     * </p>
     */
    private Boolean iAMDatabaseAuthenticationEnabled;
    /**
     * <p>
     * The time when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date clusterCreateTime;
    /**
     * <p>
     * Indicates whether the source DB cluster is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * For all database engines except Amazon Aurora, <code>AllocatedStorage</code> specifies the allocated storage size
     * in gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns 1, because Aurora DB cluster storage
     * size isn't fixed, but instead automatically adjusts as needed.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The version of the database engine for the automated backup.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the source DB cluster.
     * </p>
     */
    private String dBClusterArn;
    /**
     * <p>
     * The retention period for the automated backups.
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * The engine mode of the database engine for the automated backup.
     * </p>
     */
    private String engineMode;
    /**
     * <p>
     * The Availability Zones where instances in the DB cluster can be created. For information on Amazon Web Services
     * Regions and Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * The port number that the automated backup used for connections.
     * </p>
     * <p>
     * Default: Inherits from the source DB cluster
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The Amazon Web Services KMS key ID for an automated backup.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The storage type associated with the DB cluster.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The IOPS (I/O operations per second) value for the automated backup.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup.
     * </p>
     */
    private String awsBackupRecoveryPointArn;
    /**
     * <p>
     * The storage throughput for the automated backup. The throughput is automatically set based on the IOPS that you
     * provision, and is not configurable.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     */
    private Integer storageThroughput;

    /**
     * <p>
     * The name of the database engine for this automated backup.
     * </p>
     * 
     * @param engine
     *        The name of the database engine for this automated backup.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine for this automated backup.
     * </p>
     * 
     * @return The name of the database engine for this automated backup.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine for this automated backup.
     * </p>
     * 
     * @param engine
     *        The name of the database engine for this automated backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The VPC ID associated with the DB cluster.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID associated with the DB cluster.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID associated with the DB cluster.
     * </p>
     * 
     * @return The VPC ID associated with the DB cluster.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID associated with the DB cluster.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID associated with the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the automated backups.
     * </p>
     * 
     * @param dBClusterAutomatedBackupsArn
     *        The Amazon Resource Name (ARN) for the automated backups.
     */

    public void setDBClusterAutomatedBackupsArn(String dBClusterAutomatedBackupsArn) {
        this.dBClusterAutomatedBackupsArn = dBClusterAutomatedBackupsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the automated backups.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the automated backups.
     */

    public String getDBClusterAutomatedBackupsArn() {
        return this.dBClusterAutomatedBackupsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the automated backups.
     * </p>
     * 
     * @param dBClusterAutomatedBackupsArn
     *        The Amazon Resource Name (ARN) for the automated backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withDBClusterAutomatedBackupsArn(String dBClusterAutomatedBackupsArn) {
        setDBClusterAutomatedBackupsArn(dBClusterAutomatedBackupsArn);
        return this;
    }

    /**
     * <p>
     * The identifier for the source DB cluster, which can't be changed and which is unique to an Amazon Web Services
     * Region.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The identifier for the source DB cluster, which can't be changed and which is unique to an Amazon Web
     *        Services Region.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier for the source DB cluster, which can't be changed and which is unique to an Amazon Web Services
     * Region.
     * </p>
     * 
     * @return The identifier for the source DB cluster, which can't be changed and which is unique to an Amazon Web
     *         Services Region.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier for the source DB cluster, which can't be changed and which is unique to an Amazon Web Services
     * Region.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The identifier for the source DB cluster, which can't be changed and which is unique to an Amazon Web
     *        Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * @param restoreWindow
     */

    public void setRestoreWindow(RestoreWindow restoreWindow) {
        this.restoreWindow = restoreWindow;
    }

    /**
     * @return
     */

    public RestoreWindow getRestoreWindow() {
        return this.restoreWindow;
    }

    /**
     * @param restoreWindow
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withRestoreWindow(RestoreWindow restoreWindow) {
        setRestoreWindow(restoreWindow);
        return this;
    }

    /**
     * <p>
     * The master user name of the automated backup.
     * </p>
     * 
     * @param masterUsername
     *        The master user name of the automated backup.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The master user name of the automated backup.
     * </p>
     * 
     * @return The master user name of the automated backup.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The master user name of the automated backup.
     * </p>
     * 
     * @param masterUsername
     *        The master user name of the automated backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The resource ID for the source DB cluster, which can't be changed and which is unique to an Amazon Web Services
     * Region.
     * </p>
     * 
     * @param dbClusterResourceId
     *        The resource ID for the source DB cluster, which can't be changed and which is unique to an Amazon Web
     *        Services Region.
     */

    public void setDbClusterResourceId(String dbClusterResourceId) {
        this.dbClusterResourceId = dbClusterResourceId;
    }

    /**
     * <p>
     * The resource ID for the source DB cluster, which can't be changed and which is unique to an Amazon Web Services
     * Region.
     * </p>
     * 
     * @return The resource ID for the source DB cluster, which can't be changed and which is unique to an Amazon Web
     *         Services Region.
     */

    public String getDbClusterResourceId() {
        return this.dbClusterResourceId;
    }

    /**
     * <p>
     * The resource ID for the source DB cluster, which can't be changed and which is unique to an Amazon Web Services
     * Region.
     * </p>
     * 
     * @param dbClusterResourceId
     *        The resource ID for the source DB cluster, which can't be changed and which is unique to an Amazon Web
     *        Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withDbClusterResourceId(String dbClusterResourceId) {
        setDbClusterResourceId(dbClusterResourceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region associated with the automated backup.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region associated with the automated backup.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region associated with the automated backup.
     * </p>
     * 
     * @return The Amazon Web Services Region associated with the automated backup.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region associated with the automated backup.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region associated with the automated backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The license model information for this DB cluster automated backup.
     * </p>
     * 
     * @param licenseModel
     *        The license model information for this DB cluster automated backup.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model information for this DB cluster automated backup.
     * </p>
     * 
     * @return The license model information for this DB cluster automated backup.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The license model information for this DB cluster automated backup.
     * </p>
     * 
     * @param licenseModel
     *        The license model information for this DB cluster automated backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * A list of status information for an automated backup:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>retained</code> - Automated backups for deleted clusters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        A list of status information for an automated backup:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>retained</code> - Automated backups for deleted clusters.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A list of status information for an automated backup:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>retained</code> - Automated backups for deleted clusters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of status information for an automated backup:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>retained</code> - Automated backups for deleted clusters.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A list of status information for an automated backup:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>retained</code> - Automated backups for deleted clusters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        A list of status information for an automated backup:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>retained</code> - Automated backups for deleted clusters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withStatus(String status) {
        setStatus(status);
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

    public DBClusterAutomatedBackup withIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
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

    public DBClusterAutomatedBackup withClusterCreateTime(java.util.Date clusterCreateTime) {
        setClusterCreateTime(clusterCreateTime);
        return this;
    }

    /**
     * <p>
     * Indicates whether the source DB cluster is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Indicates whether the source DB cluster is encrypted.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Indicates whether the source DB cluster is encrypted.
     * </p>
     * 
     * @return Indicates whether the source DB cluster is encrypted.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * Indicates whether the source DB cluster is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Indicates whether the source DB cluster is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the source DB cluster is encrypted.
     * </p>
     * 
     * @return Indicates whether the source DB cluster is encrypted.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * For all database engines except Amazon Aurora, <code>AllocatedStorage</code> specifies the allocated storage size
     * in gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns 1, because Aurora DB cluster storage
     * size isn't fixed, but instead automatically adjusts as needed.
     * </p>
     * 
     * @param allocatedStorage
     *        For all database engines except Amazon Aurora, <code>AllocatedStorage</code> specifies the allocated
     *        storage size in gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns 1, because
     *        Aurora DB cluster storage size isn't fixed, but instead automatically adjusts as needed.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * For all database engines except Amazon Aurora, <code>AllocatedStorage</code> specifies the allocated storage size
     * in gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns 1, because Aurora DB cluster storage
     * size isn't fixed, but instead automatically adjusts as needed.
     * </p>
     * 
     * @return For all database engines except Amazon Aurora, <code>AllocatedStorage</code> specifies the allocated
     *         storage size in gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns 1, because
     *         Aurora DB cluster storage size isn't fixed, but instead automatically adjusts as needed.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * For all database engines except Amazon Aurora, <code>AllocatedStorage</code> specifies the allocated storage size
     * in gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns 1, because Aurora DB cluster storage
     * size isn't fixed, but instead automatically adjusts as needed.
     * </p>
     * 
     * @param allocatedStorage
     *        For all database engines except Amazon Aurora, <code>AllocatedStorage</code> specifies the allocated
     *        storage size in gibibytes (GiB). For Aurora, <code>AllocatedStorage</code> always returns 1, because
     *        Aurora DB cluster storage size isn't fixed, but instead automatically adjusts as needed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The version of the database engine for the automated backup.
     * </p>
     * 
     * @param engineVersion
     *        The version of the database engine for the automated backup.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the database engine for the automated backup.
     * </p>
     * 
     * @return The version of the database engine for the automated backup.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the database engine for the automated backup.
     * </p>
     * 
     * @param engineVersion
     *        The version of the database engine for the automated backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the source DB cluster.
     * </p>
     * 
     * @param dBClusterArn
     *        The Amazon Resource Name (ARN) for the source DB cluster.
     */

    public void setDBClusterArn(String dBClusterArn) {
        this.dBClusterArn = dBClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the source DB cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the source DB cluster.
     */

    public String getDBClusterArn() {
        return this.dBClusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the source DB cluster.
     * </p>
     * 
     * @param dBClusterArn
     *        The Amazon Resource Name (ARN) for the source DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withDBClusterArn(String dBClusterArn) {
        setDBClusterArn(dBClusterArn);
        return this;
    }

    /**
     * <p>
     * The retention period for the automated backups.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The retention period for the automated backups.
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The retention period for the automated backups.
     * </p>
     * 
     * @return The retention period for the automated backups.
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The retention period for the automated backups.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The retention period for the automated backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The engine mode of the database engine for the automated backup.
     * </p>
     * 
     * @param engineMode
     *        The engine mode of the database engine for the automated backup.
     */

    public void setEngineMode(String engineMode) {
        this.engineMode = engineMode;
    }

    /**
     * <p>
     * The engine mode of the database engine for the automated backup.
     * </p>
     * 
     * @return The engine mode of the database engine for the automated backup.
     */

    public String getEngineMode() {
        return this.engineMode;
    }

    /**
     * <p>
     * The engine mode of the database engine for the automated backup.
     * </p>
     * 
     * @param engineMode
     *        The engine mode of the database engine for the automated backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withEngineMode(String engineMode) {
        setEngineMode(engineMode);
        return this;
    }

    /**
     * <p>
     * The Availability Zones where instances in the DB cluster can be created. For information on Amazon Web Services
     * Regions and Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
     * </p>
     * 
     * @return The Availability Zones where instances in the DB cluster can be created. For information on Amazon Web
     *         Services Regions and Availability Zones, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *         >Regions and Availability Zones</a>.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * The Availability Zones where instances in the DB cluster can be created. For information on Amazon Web Services
     * Regions and Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones where instances in the DB cluster can be created. For information on Amazon Web
     *        Services Regions and Availability Zones, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Regions and Availability Zones</a>.
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
     * The Availability Zones where instances in the DB cluster can be created. For information on Amazon Web Services
     * Regions and Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones where instances in the DB cluster can be created. For information on Amazon Web
     *        Services Regions and Availability Zones, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Regions and Availability Zones</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withAvailabilityZones(String... availabilityZones) {
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
     * The Availability Zones where instances in the DB cluster can be created. For information on Amazon Web Services
     * Regions and Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
     * </p>
     * 
     * @param availabilityZones
     *        The Availability Zones where instances in the DB cluster can be created. For information on Amazon Web
     *        Services Regions and Availability Zones, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Regions and Availability Zones</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The port number that the automated backup used for connections.
     * </p>
     * <p>
     * Default: Inherits from the source DB cluster
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * 
     * @param port
     *        The port number that the automated backup used for connections.</p>
     *        <p>
     *        Default: Inherits from the source DB cluster
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number that the automated backup used for connections.
     * </p>
     * <p>
     * Default: Inherits from the source DB cluster
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * 
     * @return The port number that the automated backup used for connections.</p>
     *         <p>
     *         Default: Inherits from the source DB cluster
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code>
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number that the automated backup used for connections.
     * </p>
     * <p>
     * Default: Inherits from the source DB cluster
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * 
     * @param port
     *        The port number that the automated backup used for connections.</p>
     *        <p>
     *        Default: Inherits from the source DB cluster
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key ID for an automated backup.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key ID for an automated backup.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key ID for an automated backup.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * 
     * @return The Amazon Web Services KMS key ID for an automated backup.</p>
     *         <p>
     *         The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *         key.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key ID for an automated backup.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key ID for an automated backup.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The storage type associated with the DB cluster.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     * 
     * @param storageType
     *        The storage type associated with the DB cluster.</p>
     *        <p>
     *        This setting is only for non-Aurora Multi-AZ DB clusters.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The storage type associated with the DB cluster.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     * 
     * @return The storage type associated with the DB cluster.</p>
     *         <p>
     *         This setting is only for non-Aurora Multi-AZ DB clusters.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The storage type associated with the DB cluster.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     * 
     * @param storageType
     *        The storage type associated with the DB cluster.</p>
     *        <p>
     *        This setting is only for non-Aurora Multi-AZ DB clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The IOPS (I/O operations per second) value for the automated backup.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     * 
     * @param iops
     *        The IOPS (I/O operations per second) value for the automated backup.</p>
     *        <p>
     *        This setting is only for non-Aurora Multi-AZ DB clusters.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The IOPS (I/O operations per second) value for the automated backup.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     * 
     * @return The IOPS (I/O operations per second) value for the automated backup.</p>
     *         <p>
     *         This setting is only for non-Aurora Multi-AZ DB clusters.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The IOPS (I/O operations per second) value for the automated backup.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     * 
     * @param iops
     *        The IOPS (I/O operations per second) value for the automated backup.</p>
     *        <p>
     *        This setting is only for non-Aurora Multi-AZ DB clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup.
     * </p>
     * 
     * @param awsBackupRecoveryPointArn
     *        The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup.
     */

    public void setAwsBackupRecoveryPointArn(String awsBackupRecoveryPointArn) {
        this.awsBackupRecoveryPointArn = awsBackupRecoveryPointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup.
     */

    public String getAwsBackupRecoveryPointArn() {
        return this.awsBackupRecoveryPointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup.
     * </p>
     * 
     * @param awsBackupRecoveryPointArn
     *        The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withAwsBackupRecoveryPointArn(String awsBackupRecoveryPointArn) {
        setAwsBackupRecoveryPointArn(awsBackupRecoveryPointArn);
        return this;
    }

    /**
     * <p>
     * The storage throughput for the automated backup. The throughput is automatically set based on the IOPS that you
     * provision, and is not configurable.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     * 
     * @param storageThroughput
     *        The storage throughput for the automated backup. The throughput is automatically set based on the IOPS
     *        that you provision, and is not configurable.</p>
     *        <p>
     *        This setting is only for non-Aurora Multi-AZ DB clusters.
     */

    public void setStorageThroughput(Integer storageThroughput) {
        this.storageThroughput = storageThroughput;
    }

    /**
     * <p>
     * The storage throughput for the automated backup. The throughput is automatically set based on the IOPS that you
     * provision, and is not configurable.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     * 
     * @return The storage throughput for the automated backup. The throughput is automatically set based on the IOPS
     *         that you provision, and is not configurable.</p>
     *         <p>
     *         This setting is only for non-Aurora Multi-AZ DB clusters.
     */

    public Integer getStorageThroughput() {
        return this.storageThroughput;
    }

    /**
     * <p>
     * The storage throughput for the automated backup. The throughput is automatically set based on the IOPS that you
     * provision, and is not configurable.
     * </p>
     * <p>
     * This setting is only for non-Aurora Multi-AZ DB clusters.
     * </p>
     * 
     * @param storageThroughput
     *        The storage throughput for the automated backup. The throughput is automatically set based on the IOPS
     *        that you provision, and is not configurable.</p>
     *        <p>
     *        This setting is only for non-Aurora Multi-AZ DB clusters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBClusterAutomatedBackup withStorageThroughput(Integer storageThroughput) {
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
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getDBClusterAutomatedBackupsArn() != null)
            sb.append("DBClusterAutomatedBackupsArn: ").append(getDBClusterAutomatedBackupsArn()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getRestoreWindow() != null)
            sb.append("RestoreWindow: ").append(getRestoreWindow()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getDbClusterResourceId() != null)
            sb.append("DbClusterResourceId: ").append(getDbClusterResourceId()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: ").append(getIAMDatabaseAuthenticationEnabled()).append(",");
        if (getClusterCreateTime() != null)
            sb.append("ClusterCreateTime: ").append(getClusterCreateTime()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getDBClusterArn() != null)
            sb.append("DBClusterArn: ").append(getDBClusterArn()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getEngineMode() != null)
            sb.append("EngineMode: ").append(getEngineMode()).append(",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getAwsBackupRecoveryPointArn() != null)
            sb.append("AwsBackupRecoveryPointArn: ").append(getAwsBackupRecoveryPointArn()).append(",");
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

        if (obj instanceof DBClusterAutomatedBackup == false)
            return false;
        DBClusterAutomatedBackup other = (DBClusterAutomatedBackup) obj;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getDBClusterAutomatedBackupsArn() == null ^ this.getDBClusterAutomatedBackupsArn() == null)
            return false;
        if (other.getDBClusterAutomatedBackupsArn() != null && other.getDBClusterAutomatedBackupsArn().equals(this.getDBClusterAutomatedBackupsArn()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getRestoreWindow() == null ^ this.getRestoreWindow() == null)
            return false;
        if (other.getRestoreWindow() != null && other.getRestoreWindow().equals(this.getRestoreWindow()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getDbClusterResourceId() == null ^ this.getDbClusterResourceId() == null)
            return false;
        if (other.getDbClusterResourceId() != null && other.getDbClusterResourceId().equals(this.getDbClusterResourceId()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() == null ^ this.getIAMDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() != null
                && other.getIAMDatabaseAuthenticationEnabled().equals(this.getIAMDatabaseAuthenticationEnabled()) == false)
            return false;
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null)
            return false;
        if (other.getClusterCreateTime() != null && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDBClusterArn() == null ^ this.getDBClusterArn() == null)
            return false;
        if (other.getDBClusterArn() != null && other.getDBClusterArn().equals(this.getDBClusterArn()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getEngineMode() == null ^ this.getEngineMode() == null)
            return false;
        if (other.getEngineMode() != null && other.getEngineMode().equals(this.getEngineMode()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getAwsBackupRecoveryPointArn() == null ^ this.getAwsBackupRecoveryPointArn() == null)
            return false;
        if (other.getAwsBackupRecoveryPointArn() != null && other.getAwsBackupRecoveryPointArn().equals(this.getAwsBackupRecoveryPointArn()) == false)
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

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getDBClusterAutomatedBackupsArn() == null) ? 0 : getDBClusterAutomatedBackupsArn().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRestoreWindow() == null) ? 0 : getRestoreWindow().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getDbClusterResourceId() == null) ? 0 : getDbClusterResourceId().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0 : getIAMDatabaseAuthenticationEnabled().hashCode());
        hashCode = prime * hashCode + ((getClusterCreateTime() == null) ? 0 : getClusterCreateTime().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getDBClusterArn() == null) ? 0 : getDBClusterArn().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getEngineMode() == null) ? 0 : getEngineMode().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getAwsBackupRecoveryPointArn() == null) ? 0 : getAwsBackupRecoveryPointArn().hashCode());
        hashCode = prime * hashCode + ((getStorageThroughput() == null) ? 0 : getStorageThroughput().hashCode());
        return hashCode;
    }

    @Override
    public DBClusterAutomatedBackup clone() {
        try {
            return (DBClusterAutomatedBackup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
