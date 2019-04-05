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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Detailed information about a DB instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DBInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBInstance implements Serializable, Cloneable {

    /**
     * <p>
     * Contains a user-provided database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * Provides the name of the database engine to be used for this DB instance.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * Specifies the current state of this database.
     * </p>
     */
    private String dBInstanceStatus;
    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     */
    private Endpoint endpoint;
    /**
     * <p>
     * Provides the date and time that the DB instance was created.
     * </p>
     */
    private java.util.Date instanceCreateTime;
    /**
     * <p>
     * Specifies the daily time range during which automated backups are created if automated backups are enabled, as
     * determined by the <code>BackupRetentionPeriod</code>.
     * </p>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are retained.
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * Provides a list of VPC security group elements that the DB instance belongs to.
     * </p>
     */
    private java.util.List<VpcSecurityGroupMembership> vpcSecurityGroups;
    /**
     * <p>
     * Specifies the name of the Availability Zone that the DB instance is located in.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Specifies information on the subnet group that is associated with the DB instance, including the name,
     * description, and subnets in the subnet group.
     * </p>
     */
    private DBSubnetGroup dBSubnetGroup;
    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Specifies that changes to the DB instance are pending. This element is included only when changes are pending.
     * Specific changes are identified by subelements.
     * </p>
     */
    private PendingModifiedValues pendingModifiedValues;
    /**
     * <p>
     * Specifies the latest time to which a database can be restored with point-in-time restore.
     * </p>
     */
    private java.util.Date latestRestorableTime;
    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Indicates that minor version patches are applied automatically.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * Specifies the availability options for the DB instance. A value of <code>true</code> specifies an internet-facing
     * instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of
     * <code>false</code> specifies an internal instance with a DNS name that resolves to a private IP address.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The status of a read replica. If the instance is not a read replica, this is blank.
     * </p>
     */
    private java.util.List<DBInstanceStatusInfo> statusInfos;
    /**
     * <p>
     * Contains the name of the DB cluster that the DB instance is a member of if the DB instance is a member of a DB
     * cluster.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * If <code>StorageEncrypted</code> is <code>true</code>, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS key for the DB instance is accessed.
     * </p>
     */
    private String dbiResourceId;
    /**
     * <p>
     * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after
     * a failure of the existing primary instance.
     * </p>
     */
    private Integer promotionTier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB instance.
     * </p>
     */
    private String dBInstanceArn;
    /**
     * <p>
     * A list of log types that this DB instance is configured to export to Amazon CloudWatch Logs.
     * </p>
     */
    private java.util.List<String> enabledCloudwatchLogsExports;

    /**
     * <p>
     * Contains a user-provided database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        Contains a user-provided database identifier. This identifier is the unique key that identifies a DB
     *        instance.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains a user-provided database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     * 
     * @return Contains a user-provided database identifier. This identifier is the unique key that identifies a DB
     *         instance.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains a user-provided database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        Contains a user-provided database identifier. This identifier is the unique key that identifies a DB
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        Contains the name of the compute and memory capacity class of the DB instance.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     * 
     * @return Contains the name of the compute and memory capacity class of the DB instance.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        Contains the name of the compute and memory capacity class of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB instance.
     * </p>
     * 
     * @param engine
     *        Provides the name of the database engine to be used for this DB instance.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB instance.
     * </p>
     * 
     * @return Provides the name of the database engine to be used for this DB instance.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB instance.
     * </p>
     * 
     * @param engine
     *        Provides the name of the database engine to be used for this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * Specifies the current state of this database.
     * </p>
     * 
     * @param dBInstanceStatus
     *        Specifies the current state of this database.
     */

    public void setDBInstanceStatus(String dBInstanceStatus) {
        this.dBInstanceStatus = dBInstanceStatus;
    }

    /**
     * <p>
     * Specifies the current state of this database.
     * </p>
     * 
     * @return Specifies the current state of this database.
     */

    public String getDBInstanceStatus() {
        return this.dBInstanceStatus;
    }

    /**
     * <p>
     * Specifies the current state of this database.
     * </p>
     * 
     * @param dBInstanceStatus
     *        Specifies the current state of this database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBInstanceStatus(String dBInstanceStatus) {
        setDBInstanceStatus(dBInstanceStatus);
        return this;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     * 
     * @param endpoint
     *        Specifies the connection endpoint.
     */

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     * 
     * @return Specifies the connection endpoint.
     */

    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     * 
     * @param endpoint
     *        Specifies the connection endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withEndpoint(Endpoint endpoint) {
        setEndpoint(endpoint);
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

    public DBInstance withInstanceCreateTime(java.util.Date instanceCreateTime) {
        setInstanceCreateTime(instanceCreateTime);
        return this;
    }

    /**
     * <p>
     * Specifies the daily time range during which automated backups are created if automated backups are enabled, as
     * determined by the <code>BackupRetentionPeriod</code>.
     * </p>
     * 
     * @param preferredBackupWindow
     *        Specifies the daily time range during which automated backups are created if automated backups are
     *        enabled, as determined by the <code>BackupRetentionPeriod</code>.
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * Specifies the daily time range during which automated backups are created if automated backups are enabled, as
     * determined by the <code>BackupRetentionPeriod</code>.
     * </p>
     * 
     * @return Specifies the daily time range during which automated backups are created if automated backups are
     *         enabled, as determined by the <code>BackupRetentionPeriod</code>.
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * Specifies the daily time range during which automated backups are created if automated backups are enabled, as
     * determined by the <code>BackupRetentionPeriod</code>.
     * </p>
     * 
     * @param preferredBackupWindow
     *        Specifies the daily time range during which automated backups are created if automated backups are
     *        enabled, as determined by the <code>BackupRetentionPeriod</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        Specifies the number of days for which automatic DB snapshots are retained.
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are retained.
     * </p>
     * 
     * @return Specifies the number of days for which automatic DB snapshots are retained.
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        Specifies the number of days for which automatic DB snapshots are retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * Provides a list of VPC security group elements that the DB instance belongs to.
     * </p>
     * 
     * @return Provides a list of VPC security group elements that the DB instance belongs to.
     */

    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroups() {
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * Provides a list of VPC security group elements that the DB instance belongs to.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        Provides a list of VPC security group elements that the DB instance belongs to.
     */

    public void setVpcSecurityGroups(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }

        this.vpcSecurityGroups = new java.util.ArrayList<VpcSecurityGroupMembership>(vpcSecurityGroups);
    }

    /**
     * <p>
     * Provides a list of VPC security group elements that the DB instance belongs to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroups(java.util.Collection)} or {@link #withVpcSecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        Provides a list of VPC security group elements that the DB instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withVpcSecurityGroups(VpcSecurityGroupMembership... vpcSecurityGroups) {
        if (this.vpcSecurityGroups == null) {
            setVpcSecurityGroups(new java.util.ArrayList<VpcSecurityGroupMembership>(vpcSecurityGroups.length));
        }
        for (VpcSecurityGroupMembership ele : vpcSecurityGroups) {
            this.vpcSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides a list of VPC security group elements that the DB instance belongs to.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        Provides a list of VPC security group elements that the DB instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withVpcSecurityGroups(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone that the DB instance is located in.
     * </p>
     * 
     * @param availabilityZone
     *        Specifies the name of the Availability Zone that the DB instance is located in.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone that the DB instance is located in.
     * </p>
     * 
     * @return Specifies the name of the Availability Zone that the DB instance is located in.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone that the DB instance is located in.
     * </p>
     * 
     * @param availabilityZone
     *        Specifies the name of the Availability Zone that the DB instance is located in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Specifies information on the subnet group that is associated with the DB instance, including the name,
     * description, and subnets in the subnet group.
     * </p>
     * 
     * @param dBSubnetGroup
     *        Specifies information on the subnet group that is associated with the DB instance, including the name,
     *        description, and subnets in the subnet group.
     */

    public void setDBSubnetGroup(DBSubnetGroup dBSubnetGroup) {
        this.dBSubnetGroup = dBSubnetGroup;
    }

    /**
     * <p>
     * Specifies information on the subnet group that is associated with the DB instance, including the name,
     * description, and subnets in the subnet group.
     * </p>
     * 
     * @return Specifies information on the subnet group that is associated with the DB instance, including the name,
     *         description, and subnets in the subnet group.
     */

    public DBSubnetGroup getDBSubnetGroup() {
        return this.dBSubnetGroup;
    }

    /**
     * <p>
     * Specifies information on the subnet group that is associated with the DB instance, including the name,
     * description, and subnets in the subnet group.
     * </p>
     * 
     * @param dBSubnetGroup
     *        Specifies information on the subnet group that is associated with the DB instance, including the name,
     *        description, and subnets in the subnet group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBSubnetGroup(DBSubnetGroup dBSubnetGroup) {
        setDBSubnetGroup(dBSubnetGroup);
        return this;
    }

    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time
     *        (UTC).
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time
     *         (UTC).
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time
     *        (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Specifies that changes to the DB instance are pending. This element is included only when changes are pending.
     * Specific changes are identified by subelements.
     * </p>
     * 
     * @param pendingModifiedValues
     *        Specifies that changes to the DB instance are pending. This element is included only when changes are
     *        pending. Specific changes are identified by subelements.
     */

    public void setPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * Specifies that changes to the DB instance are pending. This element is included only when changes are pending.
     * Specific changes are identified by subelements.
     * </p>
     * 
     * @return Specifies that changes to the DB instance are pending. This element is included only when changes are
     *         pending. Specific changes are identified by subelements.
     */

    public PendingModifiedValues getPendingModifiedValues() {
        return this.pendingModifiedValues;
    }

    /**
     * <p>
     * Specifies that changes to the DB instance are pending. This element is included only when changes are pending.
     * Specific changes are identified by subelements.
     * </p>
     * 
     * @param pendingModifiedValues
     *        Specifies that changes to the DB instance are pending. This element is included only when changes are
     *        pending. Specific changes are identified by subelements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        setPendingModifiedValues(pendingModifiedValues);
        return this;
    }

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with point-in-time restore.
     * </p>
     * 
     * @param latestRestorableTime
     *        Specifies the latest time to which a database can be restored with point-in-time restore.
     */

    public void setLatestRestorableTime(java.util.Date latestRestorableTime) {
        this.latestRestorableTime = latestRestorableTime;
    }

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with point-in-time restore.
     * </p>
     * 
     * @return Specifies the latest time to which a database can be restored with point-in-time restore.
     */

    public java.util.Date getLatestRestorableTime() {
        return this.latestRestorableTime;
    }

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with point-in-time restore.
     * </p>
     * 
     * @param latestRestorableTime
     *        Specifies the latest time to which a database can be restored with point-in-time restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withLatestRestorableTime(java.util.Date latestRestorableTime) {
        setLatestRestorableTime(latestRestorableTime);
        return this;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @param engineVersion
     *        Indicates the database engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @return Indicates the database engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @param engineVersion
     *        Indicates the database engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Indicates that minor version patches are applied automatically.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor version patches are applied automatically.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version patches are applied automatically.
     * </p>
     * 
     * @return Indicates that minor version patches are applied automatically.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version patches are applied automatically.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor version patches are applied automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Indicates that minor version patches are applied automatically.
     * </p>
     * 
     * @return Indicates that minor version patches are applied automatically.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Specifies the availability options for the DB instance. A value of <code>true</code> specifies an internet-facing
     * instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of
     * <code>false</code> specifies an internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the availability options for the DB instance. A value of <code>true</code> specifies an
     *        internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A
     *        value of <code>false</code> specifies an internal instance with a DNS name that resolves to a private IP
     *        address.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the availability options for the DB instance. A value of <code>true</code> specifies an internet-facing
     * instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of
     * <code>false</code> specifies an internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * 
     * @return Specifies the availability options for the DB instance. A value of <code>true</code> specifies an
     *         internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A
     *         value of <code>false</code> specifies an internal instance with a DNS name that resolves to a private IP
     *         address.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the availability options for the DB instance. A value of <code>true</code> specifies an internet-facing
     * instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of
     * <code>false</code> specifies an internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the availability options for the DB instance. A value of <code>true</code> specifies an
     *        internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A
     *        value of <code>false</code> specifies an internal instance with a DNS name that resolves to a private IP
     *        address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies the availability options for the DB instance. A value of <code>true</code> specifies an internet-facing
     * instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of
     * <code>false</code> specifies an internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * 
     * @return Specifies the availability options for the DB instance. A value of <code>true</code> specifies an
     *         internet-facing instance with a publicly resolvable DNS name, which resolves to a public IP address. A
     *         value of <code>false</code> specifies an internal instance with a DNS name that resolves to a private IP
     *         address.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The status of a read replica. If the instance is not a read replica, this is blank.
     * </p>
     * 
     * @return The status of a read replica. If the instance is not a read replica, this is blank.
     */

    public java.util.List<DBInstanceStatusInfo> getStatusInfos() {
        return statusInfos;
    }

    /**
     * <p>
     * The status of a read replica. If the instance is not a read replica, this is blank.
     * </p>
     * 
     * @param statusInfos
     *        The status of a read replica. If the instance is not a read replica, this is blank.
     */

    public void setStatusInfos(java.util.Collection<DBInstanceStatusInfo> statusInfos) {
        if (statusInfos == null) {
            this.statusInfos = null;
            return;
        }

        this.statusInfos = new java.util.ArrayList<DBInstanceStatusInfo>(statusInfos);
    }

    /**
     * <p>
     * The status of a read replica. If the instance is not a read replica, this is blank.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatusInfos(java.util.Collection)} or {@link #withStatusInfos(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statusInfos
     *        The status of a read replica. If the instance is not a read replica, this is blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withStatusInfos(DBInstanceStatusInfo... statusInfos) {
        if (this.statusInfos == null) {
            setStatusInfos(new java.util.ArrayList<DBInstanceStatusInfo>(statusInfos.length));
        }
        for (DBInstanceStatusInfo ele : statusInfos) {
            this.statusInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of a read replica. If the instance is not a read replica, this is blank.
     * </p>
     * 
     * @param statusInfos
     *        The status of a read replica. If the instance is not a read replica, this is blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withStatusInfos(java.util.Collection<DBInstanceStatusInfo> statusInfos) {
        setStatusInfos(statusInfos);
        return this;
    }

    /**
     * <p>
     * Contains the name of the DB cluster that the DB instance is a member of if the DB instance is a member of a DB
     * cluster.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        Contains the name of the DB cluster that the DB instance is a member of if the DB instance is a member of
     *        a DB cluster.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * Contains the name of the DB cluster that the DB instance is a member of if the DB instance is a member of a DB
     * cluster.
     * </p>
     * 
     * @return Contains the name of the DB cluster that the DB instance is a member of if the DB instance is a member of
     *         a DB cluster.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * Contains the name of the DB cluster that the DB instance is a member of if the DB instance is a member of a DB
     * cluster.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        Contains the name of the DB cluster that the DB instance is a member of if the DB instance is a member of
     *        a DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB instance is encrypted.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB instance is encrypted.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB instance is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB instance is encrypted.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is <code>true</code>, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is <code>true</code>, the AWS KMS key identifier for the encrypted DB
     *        instance.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is <code>true</code>, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     * 
     * @return If <code>StorageEncrypted</code> is <code>true</code>, the AWS KMS key identifier for the encrypted DB
     *         instance.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is <code>true</code>, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is <code>true</code>, the AWS KMS key identifier for the encrypted DB
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS key for the DB instance is accessed.
     * </p>
     * 
     * @param dbiResourceId
     *        The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS
     *        CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
     */

    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS key for the DB instance is accessed.
     * </p>
     * 
     * @return The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS
     *         CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
     */

    public String getDbiResourceId() {
        return this.dbiResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS key for the DB instance is accessed.
     * </p>
     * 
     * @param dbiResourceId
     *        The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS
     *        CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDbiResourceId(String dbiResourceId) {
        setDbiResourceId(dbiResourceId);
        return this;
    }

    /**
     * <p>
     * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after
     * a failure of the existing primary instance.
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance
     *        after a failure of the existing primary instance.
     */

    public void setPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
    }

    /**
     * <p>
     * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after
     * a failure of the existing primary instance.
     * </p>
     * 
     * @return A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary
     *         instance after a failure of the existing primary instance.
     */

    public Integer getPromotionTier() {
        return this.promotionTier;
    }

    /**
     * <p>
     * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after
     * a failure of the existing primary instance.
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance
     *        after a failure of the existing primary instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withPromotionTier(Integer promotionTier) {
        setPromotionTier(promotionTier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB instance.
     * </p>
     * 
     * @param dBInstanceArn
     *        The Amazon Resource Name (ARN) for the DB instance.
     */

    public void setDBInstanceArn(String dBInstanceArn) {
        this.dBInstanceArn = dBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the DB instance.
     */

    public String getDBInstanceArn() {
        return this.dBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB instance.
     * </p>
     * 
     * @param dBInstanceArn
     *        The Amazon Resource Name (ARN) for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withDBInstanceArn(String dBInstanceArn) {
        setDBInstanceArn(dBInstanceArn);
        return this;
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return A list of log types that this DB instance is configured to export to Amazon CloudWatch Logs.
     */

    public java.util.List<String> getEnabledCloudwatchLogsExports() {
        return enabledCloudwatchLogsExports;
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param enabledCloudwatchLogsExports
     *        A list of log types that this DB instance is configured to export to Amazon CloudWatch Logs.
     */

    public void setEnabledCloudwatchLogsExports(java.util.Collection<String> enabledCloudwatchLogsExports) {
        if (enabledCloudwatchLogsExports == null) {
            this.enabledCloudwatchLogsExports = null;
            return;
        }

        this.enabledCloudwatchLogsExports = new java.util.ArrayList<String>(enabledCloudwatchLogsExports);
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to Amazon CloudWatch Logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledCloudwatchLogsExports(java.util.Collection)} or
     * {@link #withEnabledCloudwatchLogsExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enabledCloudwatchLogsExports
     *        A list of log types that this DB instance is configured to export to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withEnabledCloudwatchLogsExports(String... enabledCloudwatchLogsExports) {
        if (this.enabledCloudwatchLogsExports == null) {
            setEnabledCloudwatchLogsExports(new java.util.ArrayList<String>(enabledCloudwatchLogsExports.length));
        }
        for (String ele : enabledCloudwatchLogsExports) {
            this.enabledCloudwatchLogsExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param enabledCloudwatchLogsExports
     *        A list of log types that this DB instance is configured to export to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBInstance withEnabledCloudwatchLogsExports(java.util.Collection<String> enabledCloudwatchLogsExports) {
        setEnabledCloudwatchLogsExports(enabledCloudwatchLogsExports);
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getDBInstanceStatus() != null)
            sb.append("DBInstanceStatus: ").append(getDBInstanceStatus()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getInstanceCreateTime() != null)
            sb.append("InstanceCreateTime: ").append(getInstanceCreateTime()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: ").append(getVpcSecurityGroups()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getDBSubnetGroup() != null)
            sb.append("DBSubnetGroup: ").append(getDBSubnetGroup()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: ").append(getPendingModifiedValues()).append(",");
        if (getLatestRestorableTime() != null)
            sb.append("LatestRestorableTime: ").append(getLatestRestorableTime()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getStatusInfos() != null)
            sb.append("StatusInfos: ").append(getStatusInfos()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: ").append(getDbiResourceId()).append(",");
        if (getPromotionTier() != null)
            sb.append("PromotionTier: ").append(getPromotionTier()).append(",");
        if (getDBInstanceArn() != null)
            sb.append("DBInstanceArn: ").append(getDBInstanceArn()).append(",");
        if (getEnabledCloudwatchLogsExports() != null)
            sb.append("EnabledCloudwatchLogsExports: ").append(getEnabledCloudwatchLogsExports());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBInstance == false)
            return false;
        DBInstance other = (DBInstance) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getDBInstanceStatus() == null ^ this.getDBInstanceStatus() == null)
            return false;
        if (other.getDBInstanceStatus() != null && other.getDBInstanceStatus().equals(this.getDBInstanceStatus()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getInstanceCreateTime() == null ^ this.getInstanceCreateTime() == null)
            return false;
        if (other.getInstanceCreateTime() != null && other.getInstanceCreateTime().equals(this.getInstanceCreateTime()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDBSubnetGroup() == null ^ this.getDBSubnetGroup() == null)
            return false;
        if (other.getDBSubnetGroup() != null && other.getDBSubnetGroup().equals(this.getDBSubnetGroup()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
            return false;
        if (other.getLatestRestorableTime() == null ^ this.getLatestRestorableTime() == null)
            return false;
        if (other.getLatestRestorableTime() != null && other.getLatestRestorableTime().equals(this.getLatestRestorableTime()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getStatusInfos() == null ^ this.getStatusInfos() == null)
            return false;
        if (other.getStatusInfos() != null && other.getStatusInfos().equals(this.getStatusInfos()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        if (other.getPromotionTier() == null ^ this.getPromotionTier() == null)
            return false;
        if (other.getPromotionTier() != null && other.getPromotionTier().equals(this.getPromotionTier()) == false)
            return false;
        if (other.getDBInstanceArn() == null ^ this.getDBInstanceArn() == null)
            return false;
        if (other.getDBInstanceArn() != null && other.getDBInstanceArn().equals(this.getDBInstanceArn()) == false)
            return false;
        if (other.getEnabledCloudwatchLogsExports() == null ^ this.getEnabledCloudwatchLogsExports() == null)
            return false;
        if (other.getEnabledCloudwatchLogsExports() != null && other.getEnabledCloudwatchLogsExports().equals(this.getEnabledCloudwatchLogsExports()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceStatus() == null) ? 0 : getDBInstanceStatus().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getInstanceCreateTime() == null) ? 0 : getInstanceCreateTime().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroup() == null) ? 0 : getDBSubnetGroup().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime * hashCode + ((getLatestRestorableTime() == null) ? 0 : getLatestRestorableTime().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getStatusInfos() == null) ? 0 : getStatusInfos().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        hashCode = prime * hashCode + ((getPromotionTier() == null) ? 0 : getPromotionTier().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceArn() == null) ? 0 : getDBInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getEnabledCloudwatchLogsExports() == null) ? 0 : getEnabledCloudwatchLogsExports().hashCode());
        return hashCode;
    }

    @Override
    public DBInstance clone() {
        try {
            return (DBInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
