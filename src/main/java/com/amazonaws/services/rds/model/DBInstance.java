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
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the result of a successful invocation of the following actions:
 * </p>
 * 
 * <ul>
 * <li> CreateDBInstance </li>
 * <li> DeleteDBInstance </li>
 * <li> ModifyDBInstance </li>
 * 
 * </ul>
 * <p>
 * This data type is used as a response element in the DescribeDBInstances action.
 * </p>
 */
public class DBInstance implements Serializable {

    /**
     * Contains a user-supplied database identifier. This is the unique key
     * that identifies a DB instance.
     */
    private String dBInstanceIdentifier;

    /**
     * Contains the name of the compute and memory capacity class of the DB
     * instance.
     */
    private String dBInstanceClass;

    /**
     * Provides the name of the database engine to be used for this DB
     * instance.
     */
    private String engine;

    /**
     * Specifies the current state of this database.
     */
    private String dBInstanceStatus;

    /**
     * Contains the master username for the DB instance.
     */
    private String masterUsername;

    /**
     * The meaning of this parameter differs according to the database engine
     * you use. For example, this value returns only MySQL information when
     * returning values from CreateDBInstanceReadReplica since read replicas
     * are only supported for MySQL. <p><b>MySQL</b> <p> Contains the name of
     * the initial database of this instance that was provided at create
     * time, if one was specified when the DB instance was created. This same
     * name is returned for the life of the DB instance. <p>Type: String
     * <p><b>Oracle</b> <p> Contains the Oracle System ID (SID) of the
     * created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     */
    private String dBName;

    /**
     * Specifies the connection endpoint.
     */
    private Endpoint endpoint;

    /**
     * Specifies the allocated storage size specified in gigabytes.
     */
    private Integer allocatedStorage;

    /**
     * Provides the date and time the DB instance was created.
     */
    private java.util.Date instanceCreateTime;

    /**
     * Specifies the daily time range during which automated backups are
     * created if automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>.
     */
    private String preferredBackupWindow;

    /**
     * Specifies the number of days for which automatic DB snapshots are
     * retained.
     */
    private Integer backupRetentionPeriod;

    /**
     * Provides List of DB security group elements containing only
     * <code>DBSecurityGroup.Name</code> and
     * <code>DBSecurityGroup.Status</code> subelements.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroupMembership> dBSecurityGroups;

    /**
     * Provides List of VPC security group elements that the DB instance
     * belongs to.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership> vpcSecurityGroups;

    /**
     * Provides the list of DB parameter groups applied to this DB instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DBParameterGroupStatus> dBParameterGroups;

    /**
     * Specifies the name of the Availability Zone the DB instance is located
     * in.
     */
    private String availabilityZone;

    /**
     * Specifies information on the subnet group associated with the DB
     * instance, including the name, description, and subnets in the subnet
     * group.
     */
    private DBSubnetGroup dBSubnetGroup;

    /**
     * Specifies the weekly time range (in UTC) during which system
     * maintenance can occur.
     */
    private String preferredMaintenanceWindow;

    /**
     * Specifies that changes to the DB instance are pending. This element is
     * only included when changes are pending. Specific changes are
     * identified by subelements.
     */
    private PendingModifiedValues pendingModifiedValues;

    /**
     * Specifies the latest time to which a database can be restored with
     * point-in-time restore.
     */
    private java.util.Date latestRestorableTime;

    /**
     * Specifies if the DB instance is a Multi-AZ deployment.
     */
    private Boolean multiAZ;

    /**
     * Indicates the database engine version.
     */
    private String engineVersion;

    /**
     * Indicates that minor version patches are applied automatically.
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * Contains the identifier of the source DB instance if this DB instance
     * is a read replica.
     */
    private String readReplicaSourceDBInstanceIdentifier;

    /**
     * Contains one or more identifiers of the read replicas associated with
     * this DB instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> readReplicaDBInstanceIdentifiers;

    /**
     * License model information for this DB instance.
     */
    private String licenseModel;

    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value.
     */
    private Integer iops;

    /**
     * Provides the list of option group memberships for this DB instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<OptionGroupMembership> optionGroupMemberships;

    /**
     * If present, specifies the name of the character set that this instance
     * is associated with.
     */
    private String characterSetName;

    /**
     * If present, specifies the name of the secondary Availability Zone for
     * a DB instance with multi-AZ support.
     */
    private String secondaryAvailabilityZone;

    /**
     * Specifies the accessibility options for the DB instance. A value of
     * true specifies an Internet-facing instance with a publicly resolvable
     * DNS name, which resolves to a public IP address. A value of false
     * specifies an internal instance with a DNS name that resolves to a
     * private IP address. <p> Default: The default behavior varies depending
     * on whether a VPC has been requested or not. The following list shows
     * the default behavior in each case. <ul> <li><b>Default
     * VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     * group has been specified as part of the request and the
     * PubliclyAccessible value has not been set, the DB instance will be
     * publicly accessible. If a specific DB subnet group has been specified
     * as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be private.
     */
    private Boolean publiclyAccessible;

    /**
     * The status of a read replica. If the instance is not a read replica,
     * this will be blank.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DBInstanceStatusInfo> statusInfos;

    /**
     * Contains a user-supplied database identifier. This is the unique key
     * that identifies a DB instance.
     *
     * @return Contains a user-supplied database identifier. This is the unique key
     *         that identifies a DB instance.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * Contains a user-supplied database identifier. This is the unique key
     * that identifies a DB instance.
     *
     * @param dBInstanceIdentifier Contains a user-supplied database identifier. This is the unique key
     *         that identifies a DB instance.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * Contains a user-supplied database identifier. This is the unique key
     * that identifies a DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier Contains a user-supplied database identifier. This is the unique key
     *         that identifies a DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * Contains the name of the compute and memory capacity class of the DB
     * instance.
     *
     * @return Contains the name of the compute and memory capacity class of the DB
     *         instance.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * Contains the name of the compute and memory capacity class of the DB
     * instance.
     *
     * @param dBInstanceClass Contains the name of the compute and memory capacity class of the DB
     *         instance.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * Contains the name of the compute and memory capacity class of the DB
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass Contains the name of the compute and memory capacity class of the DB
     *         instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * Provides the name of the database engine to be used for this DB
     * instance.
     *
     * @return Provides the name of the database engine to be used for this DB
     *         instance.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * Provides the name of the database engine to be used for this DB
     * instance.
     *
     * @param engine Provides the name of the database engine to be used for this DB
     *         instance.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * Provides the name of the database engine to be used for this DB
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine Provides the name of the database engine to be used for this DB
     *         instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * Specifies the current state of this database.
     *
     * @return Specifies the current state of this database.
     */
    public String getDBInstanceStatus() {
        return dBInstanceStatus;
    }
    
    /**
     * Specifies the current state of this database.
     *
     * @param dBInstanceStatus Specifies the current state of this database.
     */
    public void setDBInstanceStatus(String dBInstanceStatus) {
        this.dBInstanceStatus = dBInstanceStatus;
    }
    
    /**
     * Specifies the current state of this database.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceStatus Specifies the current state of this database.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withDBInstanceStatus(String dBInstanceStatus) {
        this.dBInstanceStatus = dBInstanceStatus;
        return this;
    }

    /**
     * Contains the master username for the DB instance.
     *
     * @return Contains the master username for the DB instance.
     */
    public String getMasterUsername() {
        return masterUsername;
    }
    
    /**
     * Contains the master username for the DB instance.
     *
     * @param masterUsername Contains the master username for the DB instance.
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }
    
    /**
     * Contains the master username for the DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUsername Contains the master username for the DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * The meaning of this parameter differs according to the database engine
     * you use. For example, this value returns only MySQL information when
     * returning values from CreateDBInstanceReadReplica since read replicas
     * are only supported for MySQL. <p><b>MySQL</b> <p> Contains the name of
     * the initial database of this instance that was provided at create
     * time, if one was specified when the DB instance was created. This same
     * name is returned for the life of the DB instance. <p>Type: String
     * <p><b>Oracle</b> <p> Contains the Oracle System ID (SID) of the
     * created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     *
     * @return The meaning of this parameter differs according to the database engine
     *         you use. For example, this value returns only MySQL information when
     *         returning values from CreateDBInstanceReadReplica since read replicas
     *         are only supported for MySQL. <p><b>MySQL</b> <p> Contains the name of
     *         the initial database of this instance that was provided at create
     *         time, if one was specified when the DB instance was created. This same
     *         name is returned for the life of the DB instance. <p>Type: String
     *         <p><b>Oracle</b> <p> Contains the Oracle System ID (SID) of the
     *         created DB instance. Not shown when the returned parameters do not
     *         apply to an Oracle DB instance.
     */
    public String getDBName() {
        return dBName;
    }
    
    /**
     * The meaning of this parameter differs according to the database engine
     * you use. For example, this value returns only MySQL information when
     * returning values from CreateDBInstanceReadReplica since read replicas
     * are only supported for MySQL. <p><b>MySQL</b> <p> Contains the name of
     * the initial database of this instance that was provided at create
     * time, if one was specified when the DB instance was created. This same
     * name is returned for the life of the DB instance. <p>Type: String
     * <p><b>Oracle</b> <p> Contains the Oracle System ID (SID) of the
     * created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     *
     * @param dBName The meaning of this parameter differs according to the database engine
     *         you use. For example, this value returns only MySQL information when
     *         returning values from CreateDBInstanceReadReplica since read replicas
     *         are only supported for MySQL. <p><b>MySQL</b> <p> Contains the name of
     *         the initial database of this instance that was provided at create
     *         time, if one was specified when the DB instance was created. This same
     *         name is returned for the life of the DB instance. <p>Type: String
     *         <p><b>Oracle</b> <p> Contains the Oracle System ID (SID) of the
     *         created DB instance. Not shown when the returned parameters do not
     *         apply to an Oracle DB instance.
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }
    
    /**
     * The meaning of this parameter differs according to the database engine
     * you use. For example, this value returns only MySQL information when
     * returning values from CreateDBInstanceReadReplica since read replicas
     * are only supported for MySQL. <p><b>MySQL</b> <p> Contains the name of
     * the initial database of this instance that was provided at create
     * time, if one was specified when the DB instance was created. This same
     * name is returned for the life of the DB instance. <p>Type: String
     * <p><b>Oracle</b> <p> Contains the Oracle System ID (SID) of the
     * created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBName The meaning of this parameter differs according to the database engine
     *         you use. For example, this value returns only MySQL information when
     *         returning values from CreateDBInstanceReadReplica since read replicas
     *         are only supported for MySQL. <p><b>MySQL</b> <p> Contains the name of
     *         the initial database of this instance that was provided at create
     *         time, if one was specified when the DB instance was created. This same
     *         name is returned for the life of the DB instance. <p>Type: String
     *         <p><b>Oracle</b> <p> Contains the Oracle System ID (SID) of the
     *         created DB instance. Not shown when the returned parameters do not
     *         apply to an Oracle DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * Specifies the connection endpoint.
     *
     * @return Specifies the connection endpoint.
     */
    public Endpoint getEndpoint() {
        return endpoint;
    }
    
    /**
     * Specifies the connection endpoint.
     *
     * @param endpoint Specifies the connection endpoint.
     */
    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }
    
    /**
     * Specifies the connection endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endpoint Specifies the connection endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Specifies the allocated storage size specified in gigabytes.
     *
     * @return Specifies the allocated storage size specified in gigabytes.
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }
    
    /**
     * Specifies the allocated storage size specified in gigabytes.
     *
     * @param allocatedStorage Specifies the allocated storage size specified in gigabytes.
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }
    
    /**
     * Specifies the allocated storage size specified in gigabytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocatedStorage Specifies the allocated storage size specified in gigabytes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * Provides the date and time the DB instance was created.
     *
     * @return Provides the date and time the DB instance was created.
     */
    public java.util.Date getInstanceCreateTime() {
        return instanceCreateTime;
    }
    
    /**
     * Provides the date and time the DB instance was created.
     *
     * @param instanceCreateTime Provides the date and time the DB instance was created.
     */
    public void setInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }
    
    /**
     * Provides the date and time the DB instance was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCreateTime Provides the date and time the DB instance was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
        return this;
    }

    /**
     * Specifies the daily time range during which automated backups are
     * created if automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>.
     *
     * @return Specifies the daily time range during which automated backups are
     *         created if automated backups are enabled, as determined by the
     *         <code>BackupRetentionPeriod</code>.
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }
    
    /**
     * Specifies the daily time range during which automated backups are
     * created if automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>.
     *
     * @param preferredBackupWindow Specifies the daily time range during which automated backups are
     *         created if automated backups are enabled, as determined by the
     *         <code>BackupRetentionPeriod</code>.
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }
    
    /**
     * Specifies the daily time range during which automated backups are
     * created if automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredBackupWindow Specifies the daily time range during which automated backups are
     *         created if automated backups are enabled, as determined by the
     *         <code>BackupRetentionPeriod</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * Specifies the number of days for which automatic DB snapshots are
     * retained.
     *
     * @return Specifies the number of days for which automatic DB snapshots are
     *         retained.
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }
    
    /**
     * Specifies the number of days for which automatic DB snapshots are
     * retained.
     *
     * @param backupRetentionPeriod Specifies the number of days for which automatic DB snapshots are
     *         retained.
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }
    
    /**
     * Specifies the number of days for which automatic DB snapshots are
     * retained.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backupRetentionPeriod Specifies the number of days for which automatic DB snapshots are
     *         retained.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * Provides List of DB security group elements containing only
     * <code>DBSecurityGroup.Name</code> and
     * <code>DBSecurityGroup.Status</code> subelements.
     *
     * @return Provides List of DB security group elements containing only
     *         <code>DBSecurityGroup.Name</code> and
     *         <code>DBSecurityGroup.Status</code> subelements.
     */
    public java.util.List<DBSecurityGroupMembership> getDBSecurityGroups() {
        if (dBSecurityGroups == null) {
              dBSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroupMembership>();
              dBSecurityGroups.setAutoConstruct(true);
        }
        return dBSecurityGroups;
    }
    
    /**
     * Provides List of DB security group elements containing only
     * <code>DBSecurityGroup.Name</code> and
     * <code>DBSecurityGroup.Status</code> subelements.
     *
     * @param dBSecurityGroups Provides List of DB security group elements containing only
     *         <code>DBSecurityGroup.Name</code> and
     *         <code>DBSecurityGroup.Status</code> subelements.
     */
    public void setDBSecurityGroups(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroupMembership> dBSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroupMembership>(dBSecurityGroups.size());
        dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        this.dBSecurityGroups = dBSecurityGroupsCopy;
    }
    
    /**
     * Provides List of DB security group elements containing only
     * <code>DBSecurityGroup.Name</code> and
     * <code>DBSecurityGroup.Status</code> subelements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups Provides List of DB security group elements containing only
     *         <code>DBSecurityGroup.Name</code> and
     *         <code>DBSecurityGroup.Status</code> subelements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withDBSecurityGroups(DBSecurityGroupMembership... dBSecurityGroups) {
        if (getDBSecurityGroups() == null) setDBSecurityGroups(new java.util.ArrayList<DBSecurityGroupMembership>(dBSecurityGroups.length));
        for (DBSecurityGroupMembership value : dBSecurityGroups) {
            getDBSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * Provides List of DB security group elements containing only
     * <code>DBSecurityGroup.Name</code> and
     * <code>DBSecurityGroup.Status</code> subelements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups Provides List of DB security group elements containing only
     *         <code>DBSecurityGroup.Name</code> and
     *         <code>DBSecurityGroup.Status</code> subelements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withDBSecurityGroups(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroupMembership> dBSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroupMembership>(dBSecurityGroups.size());
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
            this.dBSecurityGroups = dBSecurityGroupsCopy;
        }

        return this;
    }

    /**
     * Provides List of VPC security group elements that the DB instance
     * belongs to.
     *
     * @return Provides List of VPC security group elements that the DB instance
     *         belongs to.
     */
    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroups() {
        if (vpcSecurityGroups == null) {
              vpcSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership>();
              vpcSecurityGroups.setAutoConstruct(true);
        }
        return vpcSecurityGroups;
    }
    
    /**
     * Provides List of VPC security group elements that the DB instance
     * belongs to.
     *
     * @param vpcSecurityGroups Provides List of VPC security group elements that the DB instance
     *         belongs to.
     */
    public void setVpcSecurityGroups(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership> vpcSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership>(vpcSecurityGroups.size());
        vpcSecurityGroupsCopy.addAll(vpcSecurityGroups);
        this.vpcSecurityGroups = vpcSecurityGroupsCopy;
    }
    
    /**
     * Provides List of VPC security group elements that the DB instance
     * belongs to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroups Provides List of VPC security group elements that the DB instance
     *         belongs to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withVpcSecurityGroups(VpcSecurityGroupMembership... vpcSecurityGroups) {
        if (getVpcSecurityGroups() == null) setVpcSecurityGroups(new java.util.ArrayList<VpcSecurityGroupMembership>(vpcSecurityGroups.length));
        for (VpcSecurityGroupMembership value : vpcSecurityGroups) {
            getVpcSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * Provides List of VPC security group elements that the DB instance
     * belongs to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroups Provides List of VPC security group elements that the DB instance
     *         belongs to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withVpcSecurityGroups(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership> vpcSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership>(vpcSecurityGroups.size());
            vpcSecurityGroupsCopy.addAll(vpcSecurityGroups);
            this.vpcSecurityGroups = vpcSecurityGroupsCopy;
        }

        return this;
    }

    /**
     * Provides the list of DB parameter groups applied to this DB instance.
     *
     * @return Provides the list of DB parameter groups applied to this DB instance.
     */
    public java.util.List<DBParameterGroupStatus> getDBParameterGroups() {
        if (dBParameterGroups == null) {
              dBParameterGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<DBParameterGroupStatus>();
              dBParameterGroups.setAutoConstruct(true);
        }
        return dBParameterGroups;
    }
    
    /**
     * Provides the list of DB parameter groups applied to this DB instance.
     *
     * @param dBParameterGroups Provides the list of DB parameter groups applied to this DB instance.
     */
    public void setDBParameterGroups(java.util.Collection<DBParameterGroupStatus> dBParameterGroups) {
        if (dBParameterGroups == null) {
            this.dBParameterGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DBParameterGroupStatus> dBParameterGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBParameterGroupStatus>(dBParameterGroups.size());
        dBParameterGroupsCopy.addAll(dBParameterGroups);
        this.dBParameterGroups = dBParameterGroupsCopy;
    }
    
    /**
     * Provides the list of DB parameter groups applied to this DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroups Provides the list of DB parameter groups applied to this DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withDBParameterGroups(DBParameterGroupStatus... dBParameterGroups) {
        if (getDBParameterGroups() == null) setDBParameterGroups(new java.util.ArrayList<DBParameterGroupStatus>(dBParameterGroups.length));
        for (DBParameterGroupStatus value : dBParameterGroups) {
            getDBParameterGroups().add(value);
        }
        return this;
    }
    
    /**
     * Provides the list of DB parameter groups applied to this DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroups Provides the list of DB parameter groups applied to this DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withDBParameterGroups(java.util.Collection<DBParameterGroupStatus> dBParameterGroups) {
        if (dBParameterGroups == null) {
            this.dBParameterGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DBParameterGroupStatus> dBParameterGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBParameterGroupStatus>(dBParameterGroups.size());
            dBParameterGroupsCopy.addAll(dBParameterGroups);
            this.dBParameterGroups = dBParameterGroupsCopy;
        }

        return this;
    }

    /**
     * Specifies the name of the Availability Zone the DB instance is located
     * in.
     *
     * @return Specifies the name of the Availability Zone the DB instance is located
     *         in.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * Specifies the name of the Availability Zone the DB instance is located
     * in.
     *
     * @param availabilityZone Specifies the name of the Availability Zone the DB instance is located
     *         in.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * Specifies the name of the Availability Zone the DB instance is located
     * in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone Specifies the name of the Availability Zone the DB instance is located
     *         in.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Specifies information on the subnet group associated with the DB
     * instance, including the name, description, and subnets in the subnet
     * group.
     *
     * @return Specifies information on the subnet group associated with the DB
     *         instance, including the name, description, and subnets in the subnet
     *         group.
     */
    public DBSubnetGroup getDBSubnetGroup() {
        return dBSubnetGroup;
    }
    
    /**
     * Specifies information on the subnet group associated with the DB
     * instance, including the name, description, and subnets in the subnet
     * group.
     *
     * @param dBSubnetGroup Specifies information on the subnet group associated with the DB
     *         instance, including the name, description, and subnets in the subnet
     *         group.
     */
    public void setDBSubnetGroup(DBSubnetGroup dBSubnetGroup) {
        this.dBSubnetGroup = dBSubnetGroup;
    }
    
    /**
     * Specifies information on the subnet group associated with the DB
     * instance, including the name, description, and subnets in the subnet
     * group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroup Specifies information on the subnet group associated with the DB
     *         instance, including the name, description, and subnets in the subnet
     *         group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withDBSubnetGroup(DBSubnetGroup dBSubnetGroup) {
        this.dBSubnetGroup = dBSubnetGroup;
        return this;
    }

    /**
     * Specifies the weekly time range (in UTC) during which system
     * maintenance can occur.
     *
     * @return Specifies the weekly time range (in UTC) during which system
     *         maintenance can occur.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * Specifies the weekly time range (in UTC) during which system
     * maintenance can occur.
     *
     * @param preferredMaintenanceWindow Specifies the weekly time range (in UTC) during which system
     *         maintenance can occur.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * Specifies the weekly time range (in UTC) during which system
     * maintenance can occur.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow Specifies the weekly time range (in UTC) during which system
     *         maintenance can occur.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * Specifies that changes to the DB instance are pending. This element is
     * only included when changes are pending. Specific changes are
     * identified by subelements.
     *
     * @return Specifies that changes to the DB instance are pending. This element is
     *         only included when changes are pending. Specific changes are
     *         identified by subelements.
     */
    public PendingModifiedValues getPendingModifiedValues() {
        return pendingModifiedValues;
    }
    
    /**
     * Specifies that changes to the DB instance are pending. This element is
     * only included when changes are pending. Specific changes are
     * identified by subelements.
     *
     * @param pendingModifiedValues Specifies that changes to the DB instance are pending. This element is
     *         only included when changes are pending. Specific changes are
     *         identified by subelements.
     */
    public void setPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }
    
    /**
     * Specifies that changes to the DB instance are pending. This element is
     * only included when changes are pending. Specific changes are
     * identified by subelements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pendingModifiedValues Specifies that changes to the DB instance are pending. This element is
     *         only included when changes are pending. Specific changes are
     *         identified by subelements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
        return this;
    }

    /**
     * Specifies the latest time to which a database can be restored with
     * point-in-time restore.
     *
     * @return Specifies the latest time to which a database can be restored with
     *         point-in-time restore.
     */
    public java.util.Date getLatestRestorableTime() {
        return latestRestorableTime;
    }
    
    /**
     * Specifies the latest time to which a database can be restored with
     * point-in-time restore.
     *
     * @param latestRestorableTime Specifies the latest time to which a database can be restored with
     *         point-in-time restore.
     */
    public void setLatestRestorableTime(java.util.Date latestRestorableTime) {
        this.latestRestorableTime = latestRestorableTime;
    }
    
    /**
     * Specifies the latest time to which a database can be restored with
     * point-in-time restore.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param latestRestorableTime Specifies the latest time to which a database can be restored with
     *         point-in-time restore.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withLatestRestorableTime(java.util.Date latestRestorableTime) {
        this.latestRestorableTime = latestRestorableTime;
        return this;
    }

    /**
     * Specifies if the DB instance is a Multi-AZ deployment.
     *
     * @return Specifies if the DB instance is a Multi-AZ deployment.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Specifies if the DB instance is a Multi-AZ deployment.
     *
     * @param multiAZ Specifies if the DB instance is a Multi-AZ deployment.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Specifies if the DB instance is a Multi-AZ deployment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ Specifies if the DB instance is a Multi-AZ deployment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * Specifies if the DB instance is a Multi-AZ deployment.
     *
     * @return Specifies if the DB instance is a Multi-AZ deployment.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * Indicates the database engine version.
     *
     * @return Indicates the database engine version.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * Indicates the database engine version.
     *
     * @param engineVersion Indicates the database engine version.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * Indicates the database engine version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion Indicates the database engine version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * Indicates that minor version patches are applied automatically.
     *
     * @return Indicates that minor version patches are applied automatically.
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor version patches are applied automatically.
     *
     * @param autoMinorVersionUpgrade Indicates that minor version patches are applied automatically.
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor version patches are applied automatically.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Indicates that minor version patches are applied automatically.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * Indicates that minor version patches are applied automatically.
     *
     * @return Indicates that minor version patches are applied automatically.
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * Contains the identifier of the source DB instance if this DB instance
     * is a read replica.
     *
     * @return Contains the identifier of the source DB instance if this DB instance
     *         is a read replica.
     */
    public String getReadReplicaSourceDBInstanceIdentifier() {
        return readReplicaSourceDBInstanceIdentifier;
    }
    
    /**
     * Contains the identifier of the source DB instance if this DB instance
     * is a read replica.
     *
     * @param readReplicaSourceDBInstanceIdentifier Contains the identifier of the source DB instance if this DB instance
     *         is a read replica.
     */
    public void setReadReplicaSourceDBInstanceIdentifier(String readReplicaSourceDBInstanceIdentifier) {
        this.readReplicaSourceDBInstanceIdentifier = readReplicaSourceDBInstanceIdentifier;
    }
    
    /**
     * Contains the identifier of the source DB instance if this DB instance
     * is a read replica.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readReplicaSourceDBInstanceIdentifier Contains the identifier of the source DB instance if this DB instance
     *         is a read replica.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withReadReplicaSourceDBInstanceIdentifier(String readReplicaSourceDBInstanceIdentifier) {
        this.readReplicaSourceDBInstanceIdentifier = readReplicaSourceDBInstanceIdentifier;
        return this;
    }

    /**
     * Contains one or more identifiers of the read replicas associated with
     * this DB instance.
     *
     * @return Contains one or more identifiers of the read replicas associated with
     *         this DB instance.
     */
    public java.util.List<String> getReadReplicaDBInstanceIdentifiers() {
        if (readReplicaDBInstanceIdentifiers == null) {
              readReplicaDBInstanceIdentifiers = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              readReplicaDBInstanceIdentifiers.setAutoConstruct(true);
        }
        return readReplicaDBInstanceIdentifiers;
    }
    
    /**
     * Contains one or more identifiers of the read replicas associated with
     * this DB instance.
     *
     * @param readReplicaDBInstanceIdentifiers Contains one or more identifiers of the read replicas associated with
     *         this DB instance.
     */
    public void setReadReplicaDBInstanceIdentifiers(java.util.Collection<String> readReplicaDBInstanceIdentifiers) {
        if (readReplicaDBInstanceIdentifiers == null) {
            this.readReplicaDBInstanceIdentifiers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> readReplicaDBInstanceIdentifiersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(readReplicaDBInstanceIdentifiers.size());
        readReplicaDBInstanceIdentifiersCopy.addAll(readReplicaDBInstanceIdentifiers);
        this.readReplicaDBInstanceIdentifiers = readReplicaDBInstanceIdentifiersCopy;
    }
    
    /**
     * Contains one or more identifiers of the read replicas associated with
     * this DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readReplicaDBInstanceIdentifiers Contains one or more identifiers of the read replicas associated with
     *         this DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withReadReplicaDBInstanceIdentifiers(String... readReplicaDBInstanceIdentifiers) {
        if (getReadReplicaDBInstanceIdentifiers() == null) setReadReplicaDBInstanceIdentifiers(new java.util.ArrayList<String>(readReplicaDBInstanceIdentifiers.length));
        for (String value : readReplicaDBInstanceIdentifiers) {
            getReadReplicaDBInstanceIdentifiers().add(value);
        }
        return this;
    }
    
    /**
     * Contains one or more identifiers of the read replicas associated with
     * this DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readReplicaDBInstanceIdentifiers Contains one or more identifiers of the read replicas associated with
     *         this DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withReadReplicaDBInstanceIdentifiers(java.util.Collection<String> readReplicaDBInstanceIdentifiers) {
        if (readReplicaDBInstanceIdentifiers == null) {
            this.readReplicaDBInstanceIdentifiers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> readReplicaDBInstanceIdentifiersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(readReplicaDBInstanceIdentifiers.size());
            readReplicaDBInstanceIdentifiersCopy.addAll(readReplicaDBInstanceIdentifiers);
            this.readReplicaDBInstanceIdentifiers = readReplicaDBInstanceIdentifiersCopy;
        }

        return this;
    }

    /**
     * License model information for this DB instance.
     *
     * @return License model information for this DB instance.
     */
    public String getLicenseModel() {
        return licenseModel;
    }
    
    /**
     * License model information for this DB instance.
     *
     * @param licenseModel License model information for this DB instance.
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }
    
    /**
     * License model information for this DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseModel License model information for this DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value.
     *
     * @return Specifies the Provisioned IOPS (I/O operations per second) value.
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value.
     *
     * @param iops Specifies the Provisioned IOPS (I/O operations per second) value.
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iops Specifies the Provisioned IOPS (I/O operations per second) value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * Provides the list of option group memberships for this DB instance.
     *
     * @return Provides the list of option group memberships for this DB instance.
     */
    public java.util.List<OptionGroupMembership> getOptionGroupMemberships() {
        if (optionGroupMemberships == null) {
              optionGroupMemberships = new com.amazonaws.internal.ListWithAutoConstructFlag<OptionGroupMembership>();
              optionGroupMemberships.setAutoConstruct(true);
        }
        return optionGroupMemberships;
    }
    
    /**
     * Provides the list of option group memberships for this DB instance.
     *
     * @param optionGroupMemberships Provides the list of option group memberships for this DB instance.
     */
    public void setOptionGroupMemberships(java.util.Collection<OptionGroupMembership> optionGroupMemberships) {
        if (optionGroupMemberships == null) {
            this.optionGroupMemberships = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<OptionGroupMembership> optionGroupMembershipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OptionGroupMembership>(optionGroupMemberships.size());
        optionGroupMembershipsCopy.addAll(optionGroupMemberships);
        this.optionGroupMemberships = optionGroupMembershipsCopy;
    }
    
    /**
     * Provides the list of option group memberships for this DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupMemberships Provides the list of option group memberships for this DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withOptionGroupMemberships(OptionGroupMembership... optionGroupMemberships) {
        if (getOptionGroupMemberships() == null) setOptionGroupMemberships(new java.util.ArrayList<OptionGroupMembership>(optionGroupMemberships.length));
        for (OptionGroupMembership value : optionGroupMemberships) {
            getOptionGroupMemberships().add(value);
        }
        return this;
    }
    
    /**
     * Provides the list of option group memberships for this DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupMemberships Provides the list of option group memberships for this DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withOptionGroupMemberships(java.util.Collection<OptionGroupMembership> optionGroupMemberships) {
        if (optionGroupMemberships == null) {
            this.optionGroupMemberships = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<OptionGroupMembership> optionGroupMembershipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OptionGroupMembership>(optionGroupMemberships.size());
            optionGroupMembershipsCopy.addAll(optionGroupMemberships);
            this.optionGroupMemberships = optionGroupMembershipsCopy;
        }

        return this;
    }

    /**
     * If present, specifies the name of the character set that this instance
     * is associated with.
     *
     * @return If present, specifies the name of the character set that this instance
     *         is associated with.
     */
    public String getCharacterSetName() {
        return characterSetName;
    }
    
    /**
     * If present, specifies the name of the character set that this instance
     * is associated with.
     *
     * @param characterSetName If present, specifies the name of the character set that this instance
     *         is associated with.
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }
    
    /**
     * If present, specifies the name of the character set that this instance
     * is associated with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param characterSetName If present, specifies the name of the character set that this instance
     *         is associated with.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * If present, specifies the name of the secondary Availability Zone for
     * a DB instance with multi-AZ support.
     *
     * @return If present, specifies the name of the secondary Availability Zone for
     *         a DB instance with multi-AZ support.
     */
    public String getSecondaryAvailabilityZone() {
        return secondaryAvailabilityZone;
    }
    
    /**
     * If present, specifies the name of the secondary Availability Zone for
     * a DB instance with multi-AZ support.
     *
     * @param secondaryAvailabilityZone If present, specifies the name of the secondary Availability Zone for
     *         a DB instance with multi-AZ support.
     */
    public void setSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        this.secondaryAvailabilityZone = secondaryAvailabilityZone;
    }
    
    /**
     * If present, specifies the name of the secondary Availability Zone for
     * a DB instance with multi-AZ support.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param secondaryAvailabilityZone If present, specifies the name of the secondary Availability Zone for
     *         a DB instance with multi-AZ support.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        this.secondaryAvailabilityZone = secondaryAvailabilityZone;
        return this;
    }

    /**
     * Specifies the accessibility options for the DB instance. A value of
     * true specifies an Internet-facing instance with a publicly resolvable
     * DNS name, which resolves to a public IP address. A value of false
     * specifies an internal instance with a DNS name that resolves to a
     * private IP address. <p> Default: The default behavior varies depending
     * on whether a VPC has been requested or not. The following list shows
     * the default behavior in each case. <ul> <li><b>Default
     * VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     * group has been specified as part of the request and the
     * PubliclyAccessible value has not been set, the DB instance will be
     * publicly accessible. If a specific DB subnet group has been specified
     * as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be private.
     *
     * @return Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li><b>Default
     *         VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     *         group has been specified as part of the request and the
     *         PubliclyAccessible value has not been set, the DB instance will be
     *         publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been
     *         set, the DB instance will be private.
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }
    
    /**
     * Specifies the accessibility options for the DB instance. A value of
     * true specifies an Internet-facing instance with a publicly resolvable
     * DNS name, which resolves to a public IP address. A value of false
     * specifies an internal instance with a DNS name that resolves to a
     * private IP address. <p> Default: The default behavior varies depending
     * on whether a VPC has been requested or not. The following list shows
     * the default behavior in each case. <ul> <li><b>Default
     * VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     * group has been specified as part of the request and the
     * PubliclyAccessible value has not been set, the DB instance will be
     * publicly accessible. If a specific DB subnet group has been specified
     * as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be private.
     *
     * @param publiclyAccessible Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li><b>Default
     *         VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     *         group has been specified as part of the request and the
     *         PubliclyAccessible value has not been set, the DB instance will be
     *         publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been
     *         set, the DB instance will be private.
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }
    
    /**
     * Specifies the accessibility options for the DB instance. A value of
     * true specifies an Internet-facing instance with a publicly resolvable
     * DNS name, which resolves to a public IP address. A value of false
     * specifies an internal instance with a DNS name that resolves to a
     * private IP address. <p> Default: The default behavior varies depending
     * on whether a VPC has been requested or not. The following list shows
     * the default behavior in each case. <ul> <li><b>Default
     * VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     * group has been specified as part of the request and the
     * PubliclyAccessible value has not been set, the DB instance will be
     * publicly accessible. If a specific DB subnet group has been specified
     * as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be private.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publiclyAccessible Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li><b>Default
     *         VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     *         group has been specified as part of the request and the
     *         PubliclyAccessible value has not been set, the DB instance will be
     *         publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been
     *         set, the DB instance will be private.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * Specifies the accessibility options for the DB instance. A value of
     * true specifies an Internet-facing instance with a publicly resolvable
     * DNS name, which resolves to a public IP address. A value of false
     * specifies an internal instance with a DNS name that resolves to a
     * private IP address. <p> Default: The default behavior varies depending
     * on whether a VPC has been requested or not. The following list shows
     * the default behavior in each case. <ul> <li><b>Default
     * VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     * group has been specified as part of the request and the
     * PubliclyAccessible value has not been set, the DB instance will be
     * publicly accessible. If a specific DB subnet group has been specified
     * as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be private.
     *
     * @return Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li><b>Default
     *         VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     *         group has been specified as part of the request and the
     *         PubliclyAccessible value has not been set, the DB instance will be
     *         publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been
     *         set, the DB instance will be private.
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * The status of a read replica. If the instance is not a read replica,
     * this will be blank.
     *
     * @return The status of a read replica. If the instance is not a read replica,
     *         this will be blank.
     */
    public java.util.List<DBInstanceStatusInfo> getStatusInfos() {
        if (statusInfos == null) {
              statusInfos = new com.amazonaws.internal.ListWithAutoConstructFlag<DBInstanceStatusInfo>();
              statusInfos.setAutoConstruct(true);
        }
        return statusInfos;
    }
    
    /**
     * The status of a read replica. If the instance is not a read replica,
     * this will be blank.
     *
     * @param statusInfos The status of a read replica. If the instance is not a read replica,
     *         this will be blank.
     */
    public void setStatusInfos(java.util.Collection<DBInstanceStatusInfo> statusInfos) {
        if (statusInfos == null) {
            this.statusInfos = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DBInstanceStatusInfo> statusInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBInstanceStatusInfo>(statusInfos.size());
        statusInfosCopy.addAll(statusInfos);
        this.statusInfos = statusInfosCopy;
    }
    
    /**
     * The status of a read replica. If the instance is not a read replica,
     * this will be blank.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusInfos The status of a read replica. If the instance is not a read replica,
     *         this will be blank.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withStatusInfos(DBInstanceStatusInfo... statusInfos) {
        if (getStatusInfos() == null) setStatusInfos(new java.util.ArrayList<DBInstanceStatusInfo>(statusInfos.length));
        for (DBInstanceStatusInfo value : statusInfos) {
            getStatusInfos().add(value);
        }
        return this;
    }
    
    /**
     * The status of a read replica. If the instance is not a read replica,
     * this will be blank.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusInfos The status of a read replica. If the instance is not a read replica,
     *         this will be blank.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBInstance withStatusInfos(java.util.Collection<DBInstanceStatusInfo> statusInfos) {
        if (statusInfos == null) {
            this.statusInfos = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DBInstanceStatusInfo> statusInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBInstanceStatusInfo>(statusInfos.size());
            statusInfosCopy.addAll(statusInfos);
            this.statusInfos = statusInfosCopy;
        }

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
        if (getDBInstanceIdentifier() != null) sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getDBInstanceClass() != null) sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getDBInstanceStatus() != null) sb.append("DBInstanceStatus: " + getDBInstanceStatus() + ",");
        if (getMasterUsername() != null) sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getDBName() != null) sb.append("DBName: " + getDBName() + ",");
        if (getEndpoint() != null) sb.append("Endpoint: " + getEndpoint() + ",");
        if (getAllocatedStorage() != null) sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getInstanceCreateTime() != null) sb.append("InstanceCreateTime: " + getInstanceCreateTime() + ",");
        if (getPreferredBackupWindow() != null) sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getBackupRetentionPeriod() != null) sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getDBSecurityGroups() != null) sb.append("DBSecurityGroups: " + getDBSecurityGroups() + ",");
        if (getVpcSecurityGroups() != null) sb.append("VpcSecurityGroups: " + getVpcSecurityGroups() + ",");
        if (getDBParameterGroups() != null) sb.append("DBParameterGroups: " + getDBParameterGroups() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getDBSubnetGroup() != null) sb.append("DBSubnetGroup: " + getDBSubnetGroup() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getPendingModifiedValues() != null) sb.append("PendingModifiedValues: " + getPendingModifiedValues() + ",");
        if (getLatestRestorableTime() != null) sb.append("LatestRestorableTime: " + getLatestRestorableTime() + ",");
        if (isMultiAZ() != null) sb.append("MultiAZ: " + isMultiAZ() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (isAutoMinorVersionUpgrade() != null) sb.append("AutoMinorVersionUpgrade: " + isAutoMinorVersionUpgrade() + ",");
        if (getReadReplicaSourceDBInstanceIdentifier() != null) sb.append("ReadReplicaSourceDBInstanceIdentifier: " + getReadReplicaSourceDBInstanceIdentifier() + ",");
        if (getReadReplicaDBInstanceIdentifiers() != null) sb.append("ReadReplicaDBInstanceIdentifiers: " + getReadReplicaDBInstanceIdentifiers() + ",");
        if (getLicenseModel() != null) sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getIops() != null) sb.append("Iops: " + getIops() + ",");
        if (getOptionGroupMemberships() != null) sb.append("OptionGroupMemberships: " + getOptionGroupMemberships() + ",");
        if (getCharacterSetName() != null) sb.append("CharacterSetName: " + getCharacterSetName() + ",");
        if (getSecondaryAvailabilityZone() != null) sb.append("SecondaryAvailabilityZone: " + getSecondaryAvailabilityZone() + ",");
        if (isPubliclyAccessible() != null) sb.append("PubliclyAccessible: " + isPubliclyAccessible() + ",");
        if (getStatusInfos() != null) sb.append("StatusInfos: " + getStatusInfos() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode()); 
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceStatus() == null) ? 0 : getDBInstanceStatus().hashCode()); 
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode()); 
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode()); 
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode()); 
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCreateTime() == null) ? 0 : getInstanceCreateTime().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode()); 
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroups() == null) ? 0 : getDBSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getDBParameterGroups() == null) ? 0 : getDBParameterGroups().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getDBSubnetGroup() == null) ? 0 : getDBSubnetGroup().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        hashCode = prime * hashCode + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode()); 
        hashCode = prime * hashCode + ((getLatestRestorableTime() == null) ? 0 : getLatestRestorableTime().hashCode()); 
        hashCode = prime * hashCode + ((isMultiAZ() == null) ? 0 : isMultiAZ().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getReadReplicaSourceDBInstanceIdentifier() == null) ? 0 : getReadReplicaSourceDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getReadReplicaDBInstanceIdentifiers() == null) ? 0 : getReadReplicaDBInstanceIdentifiers().hashCode()); 
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        hashCode = prime * hashCode + ((getOptionGroupMemberships() == null) ? 0 : getOptionGroupMemberships().hashCode()); 
        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode()); 
        hashCode = prime * hashCode + ((getSecondaryAvailabilityZone() == null) ? 0 : getSecondaryAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((isPubliclyAccessible() == null) ? 0 : isPubliclyAccessible().hashCode()); 
        hashCode = prime * hashCode + ((getStatusInfos() == null) ? 0 : getStatusInfos().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DBInstance == false) return false;
        DBInstance other = (DBInstance)obj;
        
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null) return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false) return false; 
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getDBInstanceStatus() == null ^ this.getDBInstanceStatus() == null) return false;
        if (other.getDBInstanceStatus() != null && other.getDBInstanceStatus().equals(this.getDBInstanceStatus()) == false) return false; 
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null) return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false) return false; 
        if (other.getDBName() == null ^ this.getDBName() == null) return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false) return false; 
        if (other.getEndpoint() == null ^ this.getEndpoint() == null) return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false) return false; 
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null) return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false) return false; 
        if (other.getInstanceCreateTime() == null ^ this.getInstanceCreateTime() == null) return false;
        if (other.getInstanceCreateTime() != null && other.getInstanceCreateTime().equals(this.getInstanceCreateTime()) == false) return false; 
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null) return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false) return false; 
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null) return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false) return false; 
        if (other.getDBSecurityGroups() == null ^ this.getDBSecurityGroups() == null) return false;
        if (other.getDBSecurityGroups() != null && other.getDBSecurityGroups().equals(this.getDBSecurityGroups()) == false) return false; 
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null) return false;
        if (other.getVpcSecurityGroups() != null && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false) return false; 
        if (other.getDBParameterGroups() == null ^ this.getDBParameterGroups() == null) return false;
        if (other.getDBParameterGroups() != null && other.getDBParameterGroups().equals(this.getDBParameterGroups()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getDBSubnetGroup() == null ^ this.getDBSubnetGroup() == null) return false;
        if (other.getDBSubnetGroup() != null && other.getDBSubnetGroup().equals(this.getDBSubnetGroup()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null) return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false) return false; 
        if (other.getLatestRestorableTime() == null ^ this.getLatestRestorableTime() == null) return false;
        if (other.getLatestRestorableTime() != null && other.getLatestRestorableTime().equals(this.getLatestRestorableTime()) == false) return false; 
        if (other.isMultiAZ() == null ^ this.isMultiAZ() == null) return false;
        if (other.isMultiAZ() != null && other.isMultiAZ().equals(this.isMultiAZ()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        if (other.getReadReplicaSourceDBInstanceIdentifier() == null ^ this.getReadReplicaSourceDBInstanceIdentifier() == null) return false;
        if (other.getReadReplicaSourceDBInstanceIdentifier() != null && other.getReadReplicaSourceDBInstanceIdentifier().equals(this.getReadReplicaSourceDBInstanceIdentifier()) == false) return false; 
        if (other.getReadReplicaDBInstanceIdentifiers() == null ^ this.getReadReplicaDBInstanceIdentifiers() == null) return false;
        if (other.getReadReplicaDBInstanceIdentifiers() != null && other.getReadReplicaDBInstanceIdentifiers().equals(this.getReadReplicaDBInstanceIdentifiers()) == false) return false; 
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null) return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false) return false; 
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        if (other.getOptionGroupMemberships() == null ^ this.getOptionGroupMemberships() == null) return false;
        if (other.getOptionGroupMemberships() != null && other.getOptionGroupMemberships().equals(this.getOptionGroupMemberships()) == false) return false; 
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null) return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false) return false; 
        if (other.getSecondaryAvailabilityZone() == null ^ this.getSecondaryAvailabilityZone() == null) return false;
        if (other.getSecondaryAvailabilityZone() != null && other.getSecondaryAvailabilityZone().equals(this.getSecondaryAvailabilityZone()) == false) return false; 
        if (other.isPubliclyAccessible() == null ^ this.isPubliclyAccessible() == null) return false;
        if (other.isPubliclyAccessible() != null && other.isPubliclyAccessible().equals(this.isPubliclyAccessible()) == false) return false; 
        if (other.getStatusInfos() == null ^ this.getStatusInfos() == null) return false;
        if (other.getStatusInfos() != null && other.getStatusInfos().equals(this.getStatusInfos()) == false) return false; 
        return true;
    }
    
}
    