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
 * An automated backup of a DB instance. It it consists of system backups, transaction logs, and the database instance
 * properties that existed at the time you deleted the source instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBInstanceAutomatedBackup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBInstanceAutomatedBackup implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the automated backup.
     * </p>
     */
    private String dBInstanceArn;
    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
     * </p>
     */
    private String dbiResourceId;
    /**
     * <p>
     * The AWS Region associated with the automated backup.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The customer id of the instance that is/was associated with the automated backup.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * Earliest and latest time an instance can be restored to.
     * </p>
     */
    private RestoreWindow restoreWindow;
    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * Provides a list of status information for an automated backup:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - automated backups for current instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>retained</code> - automated backups for deleted instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code> - automated backups that are waiting for the first automated snapshot to be available.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The port number that the automated backup used for connections.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The Availability Zone that the automated backup was created in. For information on AWS Regions and Availability
     * Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Provides the VPC ID associated with the DB instance
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Provides the date and time that the DB instance was created.
     * </p>
     */
    private java.util.Date instanceCreateTime;
    /**
     * <p>
     * The license model of an automated backup.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * The name of the database engine for this automated backup.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version of the database engine for the automated backup.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * License model information for the automated backup.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * The IOPS (I/O operations per second) value for the automated backup.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The option group the automated backup is associated with. If omitted, the default option group for the engine
     * specified is used.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * The ARN from the key store with which the automated backup is associated for TDE encryption.
     * </p>
     */
    private String tdeCredentialArn;
    /**
     * <p>
     * Specifies whether the automated backup is encrypted.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * Specifies the storage type associated with the automated backup.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The AWS KMS key ID for an automated backup. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier,
     * or the KMS key alias for the KMS encryption key.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The time zone of the automated backup. In most cases, the <code>Timezone</code> element is empty.
     * <code>Timezone</code> content appears only for Microsoft SQL Server DB instances that were created with a time
     * zone specified.
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
     * The Amazon Resource Name (ARN) for the automated backup.
     * </p>
     * 
     * @param dBInstanceArn
     *        The Amazon Resource Name (ARN) for the automated backup.
     */

    public void setDBInstanceArn(String dBInstanceArn) {
        this.dBInstanceArn = dBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the automated backup.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the automated backup.
     */

    public String getDBInstanceArn() {
        return this.dBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the automated backup.
     * </p>
     * 
     * @param dBInstanceArn
     *        The Amazon Resource Name (ARN) for the automated backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withDBInstanceArn(String dBInstanceArn) {
        setDBInstanceArn(dBInstanceArn);
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

    public DBInstanceAutomatedBackup withDbiResourceId(String dbiResourceId) {
        setDbiResourceId(dbiResourceId);
        return this;
    }

    /**
     * <p>
     * The AWS Region associated with the automated backup.
     * </p>
     * 
     * @param region
     *        The AWS Region associated with the automated backup.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region associated with the automated backup.
     * </p>
     * 
     * @return The AWS Region associated with the automated backup.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region associated with the automated backup.
     * </p>
     * 
     * @param region
     *        The AWS Region associated with the automated backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The customer id of the instance that is/was associated with the automated backup.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The customer id of the instance that is/was associated with the automated backup.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The customer id of the instance that is/was associated with the automated backup.
     * </p>
     * 
     * @return The customer id of the instance that is/was associated with the automated backup.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The customer id of the instance that is/was associated with the automated backup.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The customer id of the instance that is/was associated with the automated backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * Earliest and latest time an instance can be restored to.
     * </p>
     * 
     * @param restoreWindow
     *        Earliest and latest time an instance can be restored to.
     */

    public void setRestoreWindow(RestoreWindow restoreWindow) {
        this.restoreWindow = restoreWindow;
    }

    /**
     * <p>
     * Earliest and latest time an instance can be restored to.
     * </p>
     * 
     * @return Earliest and latest time an instance can be restored to.
     */

    public RestoreWindow getRestoreWindow() {
        return this.restoreWindow;
    }

    /**
     * <p>
     * Earliest and latest time an instance can be restored to.
     * </p>
     * 
     * @param restoreWindow
     *        Earliest and latest time an instance can be restored to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withRestoreWindow(RestoreWindow restoreWindow) {
        setRestoreWindow(restoreWindow);
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

    public DBInstanceAutomatedBackup withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * Provides a list of status information for an automated backup:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - automated backups for current instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>retained</code> - automated backups for deleted instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code> - automated backups that are waiting for the first automated snapshot to be available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Provides a list of status information for an automated backup:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - automated backups for current instances
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>retained</code> - automated backups for deleted instances
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>creating</code> - automated backups that are waiting for the first automated snapshot to be
     *        available.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Provides a list of status information for an automated backup:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - automated backups for current instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>retained</code> - automated backups for deleted instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code> - automated backups that are waiting for the first automated snapshot to be available.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Provides a list of status information for an automated backup:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>active</code> - automated backups for current instances
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>retained</code> - automated backups for deleted instances
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>creating</code> - automated backups that are waiting for the first automated snapshot to be
     *         available.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Provides a list of status information for an automated backup:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - automated backups for current instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>retained</code> - automated backups for deleted instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code> - automated backups that are waiting for the first automated snapshot to be available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Provides a list of status information for an automated backup:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>active</code> - automated backups for current instances
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>retained</code> - automated backups for deleted instances
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>creating</code> - automated backups that are waiting for the first automated snapshot to be
     *        available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The port number that the automated backup used for connections.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * 
     * @param port
     *        The port number that the automated backup used for connections.</p>
     *        <p>
     *        Default: Inherits from the source DB instance
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
     * Default: Inherits from the source DB instance
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * 
     * @return The port number that the automated backup used for connections.</p>
     *         <p>
     *         Default: Inherits from the source DB instance
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
     * Default: Inherits from the source DB instance
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * 
     * @param port
     *        The port number that the automated backup used for connections.</p>
     *        <p>
     *        Default: Inherits from the source DB instance
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The Availability Zone that the automated backup was created in. For information on AWS Regions and Availability
     * Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone that the automated backup was created in. For information on AWS Regions and
     *        Availability Zones, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Regions and Availability Zones</a>.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone that the automated backup was created in. For information on AWS Regions and Availability
     * Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     * </p>
     * 
     * @return The Availability Zone that the automated backup was created in. For information on AWS Regions and
     *         Availability Zones, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *         >Regions and Availability Zones</a>.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone that the automated backup was created in. For information on AWS Regions and Availability
     * Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone that the automated backup was created in. For information on AWS Regions and
     *        Availability Zones, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Regions and Availability Zones</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB instance
     * </p>
     * 
     * @param vpcId
     *        Provides the VPC ID associated with the DB instance
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB instance
     * </p>
     * 
     * @return Provides the VPC ID associated with the DB instance
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB instance
     * </p>
     * 
     * @param vpcId
     *        Provides the VPC ID associated with the DB instance
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Provides the date and time that the DB instance was created.
     * </p>
     * 
     * @param instanceCreateTime
     *        Provides the date and time that the DB instance was created.
     */

    public void setInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }

    /**
     * <p>
     * Provides the date and time that the DB instance was created.
     * </p>
     * 
     * @return Provides the date and time that the DB instance was created.
     */

    public java.util.Date getInstanceCreateTime() {
        return this.instanceCreateTime;
    }

    /**
     * <p>
     * Provides the date and time that the DB instance was created.
     * </p>
     * 
     * @param instanceCreateTime
     *        Provides the date and time that the DB instance was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withInstanceCreateTime(java.util.Date instanceCreateTime) {
        setInstanceCreateTime(instanceCreateTime);
        return this;
    }

    /**
     * <p>
     * The license model of an automated backup.
     * </p>
     * 
     * @param masterUsername
     *        The license model of an automated backup.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The license model of an automated backup.
     * </p>
     * 
     * @return The license model of an automated backup.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The license model of an automated backup.
     * </p>
     * 
     * @param masterUsername
     *        The license model of an automated backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

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

    public DBInstanceAutomatedBackup withEngine(String engine) {
        setEngine(engine);
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

    public DBInstanceAutomatedBackup withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * License model information for the automated backup.
     * </p>
     * 
     * @param licenseModel
     *        License model information for the automated backup.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * License model information for the automated backup.
     * </p>
     * 
     * @return License model information for the automated backup.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * License model information for the automated backup.
     * </p>
     * 
     * @param licenseModel
     *        License model information for the automated backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * The IOPS (I/O operations per second) value for the automated backup.
     * </p>
     * 
     * @param iops
     *        The IOPS (I/O operations per second) value for the automated backup.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The IOPS (I/O operations per second) value for the automated backup.
     * </p>
     * 
     * @return The IOPS (I/O operations per second) value for the automated backup.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The IOPS (I/O operations per second) value for the automated backup.
     * </p>
     * 
     * @param iops
     *        The IOPS (I/O operations per second) value for the automated backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The option group the automated backup is associated with. If omitted, the default option group for the engine
     * specified is used.
     * </p>
     * 
     * @param optionGroupName
     *        The option group the automated backup is associated with. If omitted, the default option group for the
     *        engine specified is used.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The option group the automated backup is associated with. If omitted, the default option group for the engine
     * specified is used.
     * </p>
     * 
     * @return The option group the automated backup is associated with. If omitted, the default option group for the
     *         engine specified is used.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The option group the automated backup is associated with. If omitted, the default option group for the engine
     * specified is used.
     * </p>
     * 
     * @param optionGroupName
     *        The option group the automated backup is associated with. If omitted, the default option group for the
     *        engine specified is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * The ARN from the key store with which the automated backup is associated for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which the automated backup is associated for TDE encryption.
     */

    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which the automated backup is associated for TDE encryption.
     * </p>
     * 
     * @return The ARN from the key store with which the automated backup is associated for TDE encryption.
     */

    public String getTdeCredentialArn() {
        return this.tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which the automated backup is associated for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which the automated backup is associated for TDE encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withTdeCredentialArn(String tdeCredentialArn) {
        setTdeCredentialArn(tdeCredentialArn);
        return this;
    }

    /**
     * <p>
     * Specifies whether the automated backup is encrypted.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the automated backup is encrypted.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Specifies whether the automated backup is encrypted.
     * </p>
     * 
     * @return Specifies whether the automated backup is encrypted.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Specifies whether the automated backup is encrypted.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether the automated backup is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the automated backup is encrypted.
     * </p>
     * 
     * @return Specifies whether the automated backup is encrypted.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Specifies the storage type associated with the automated backup.
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type associated with the automated backup.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type associated with the automated backup.
     * </p>
     * 
     * @return Specifies the storage type associated with the automated backup.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Specifies the storage type associated with the automated backup.
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type associated with the automated backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The AWS KMS key ID for an automated backup. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier,
     * or the KMS key alias for the KMS encryption key.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key ID for an automated backup. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     *        identifier, or the KMS key alias for the KMS encryption key.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID for an automated backup. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier,
     * or the KMS key alias for the KMS encryption key.
     * </p>
     * 
     * @return The AWS KMS key ID for an automated backup. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     *         identifier, or the KMS key alias for the KMS encryption key.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID for an automated backup. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier,
     * or the KMS key alias for the KMS encryption key.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key ID for an automated backup. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     *        identifier, or the KMS key alias for the KMS encryption key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The time zone of the automated backup. In most cases, the <code>Timezone</code> element is empty.
     * <code>Timezone</code> content appears only for Microsoft SQL Server DB instances that were created with a time
     * zone specified.
     * </p>
     * 
     * @param timezone
     *        The time zone of the automated backup. In most cases, the <code>Timezone</code> element is empty.
     *        <code>Timezone</code> content appears only for Microsoft SQL Server DB instances that were created with a
     *        time zone specified.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone of the automated backup. In most cases, the <code>Timezone</code> element is empty.
     * <code>Timezone</code> content appears only for Microsoft SQL Server DB instances that were created with a time
     * zone specified.
     * </p>
     * 
     * @return The time zone of the automated backup. In most cases, the <code>Timezone</code> element is empty.
     *         <code>Timezone</code> content appears only for Microsoft SQL Server DB instances that were created with a
     *         time zone specified.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The time zone of the automated backup. In most cases, the <code>Timezone</code> element is empty.
     * <code>Timezone</code> content appears only for Microsoft SQL Server DB instances that were created with a time
     * zone specified.
     * </p>
     * 
     * @param timezone
     *        The time zone of the automated backup. In most cases, the <code>Timezone</code> element is empty.
     *        <code>Timezone</code> content appears only for Microsoft SQL Server DB instances that were created with a
     *        time zone specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstanceAutomatedBackup withTimezone(String timezone) {
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

    public DBInstanceAutomatedBackup withIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
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
        if (getDBInstanceArn() != null)
            sb.append("DBInstanceArn: ").append(getDBInstanceArn()).append(",");
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: ").append(getDbiResourceId()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getRestoreWindow() != null)
            sb.append("RestoreWindow: ").append(getRestoreWindow()).append(",");
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
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: ").append(getTdeCredentialArn()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: ").append(getIAMDatabaseAuthenticationEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBInstanceAutomatedBackup == false)
            return false;
        DBInstanceAutomatedBackup other = (DBInstanceAutomatedBackup) obj;
        if (other.getDBInstanceArn() == null ^ this.getDBInstanceArn() == null)
            return false;
        if (other.getDBInstanceArn() != null && other.getDBInstanceArn().equals(this.getDBInstanceArn()) == false)
            return false;
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getRestoreWindow() == null ^ this.getRestoreWindow() == null)
            return false;
        if (other.getRestoreWindow() != null && other.getRestoreWindow().equals(this.getRestoreWindow()) == false)
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
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null)
            return false;
        if (other.getTdeCredentialArn() != null && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceArn() == null) ? 0 : getDBInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRestoreWindow() == null) ? 0 : getRestoreWindow().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getInstanceCreateTime() == null) ? 0 : getInstanceCreateTime().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0 : getIAMDatabaseAuthenticationEnabled().hashCode());
        return hashCode;
    }

    @Override
    public DBInstanceAutomatedBackup clone() {
        try {
            return (DBInstanceAutomatedBackup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
