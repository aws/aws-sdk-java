/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the result of a successful invocation of the following
 * actions:
 * </p>
 * 
 * <ul>
 * <li> CreateDBInstance </li>
 * <li> DeleteDBInstance </li>
 * <li> ModifyDBInstance </li>
 * 
 * </ul>
 * <p>
 * This data type is used as a response element in the
 * DescribeDBInstances action.
 * </p>
 */
public class DBInstance {

    /**
     * Contains a user-supplied database identifier. This is the unique key
     * that identifies a DB Instance.
     */
    private String dBInstanceIdentifier;

    /**
     * Contains the name of the compute and memory capacity class of the DB
     * Instance.
     */
    private String dBInstanceClass;

    /**
     * Provides the name of the database engine to be used for this DB
     * Instance.
     */
    private String engine;

    /**
     * Specifies the current state of this database.
     */
    private String dBInstanceStatus;

    /**
     * Contains the master username for the DB Instance.
     */
    private String masterUsername;

    /**
     * The meaning of this parameter differs according to the database engine
     * you use. <p><b>MySQL</b> <p> Contains the name of the initial database
     * of this instance that was provided at create time, if one was
     * specified when the DB Instance was created. This same name is returned
     * for the life of the DB Instance. <p>Type: String <p><b>Oracle</b> <p>
     * Contains the Oracle System ID (SID) of the created DB Instance.
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
     * Provides the date and time the DB Instance was created.
     */
    private java.util.Date instanceCreateTime;

    /**
     * Specifies the daily time range during which automated backups are
     * created if automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>.
     */
    private String preferredBackupWindow;

    /**
     * Specifies the number of days for which automatic DB Snapshots are
     * retained.
     */
    private Integer backupRetentionPeriod;

    /**
     * Provides List of DB Security Group elements containing only
     * <code>DBSecurityGroup.Name</code> and
     * <code>DBSecurityGroup.Status</code> subelements.
     */
    private java.util.List<DBSecurityGroupMembership> dBSecurityGroups;

    /**
     * Provides the list of DB Parameter Groups applied to this DB Instance.
     */
    private java.util.List<DBParameterGroupStatus> dBParameterGroups;

    /**
     * Specifies the name of the Availability Zone the DB Instance is located
     * in.
     */
    private String availabilityZone;

    /**
     * Provides the inforamtion of the subnet group associated with the DB
     * instance, including the name, descrption and subnets in the subnet
     * group.
     */
    private DBSubnetGroup dBSubnetGroup;

    /**
     * Specifies the weekly time range (in UTC) during which system
     * maintenance can occur.
     */
    private String preferredMaintenanceWindow;

    /**
     * Specifies that changes to the DB Instance are pending. This element is
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
     * Specifies if the DB Instance is a Multi-AZ deployment.
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
     * Contains the identifier of the source DB Instance if this DB Instance
     * is a Read Replica.
     */
    private String readReplicaSourceDBInstanceIdentifier;

    /**
     * Contains one or more identifiers of the Read Replicas associated with
     * this DB Instance.
     */
    private java.util.List<String> readReplicaDBInstanceIdentifiers;

    /**
     * License model information for this DB Instance.
     */
    private String licenseModel;

    /**
     * Contains a user-supplied database identifier. This is the unique key
     * that identifies a DB Instance.
     *
     * @return Contains a user-supplied database identifier. This is the unique key
     *         that identifies a DB Instance.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * Contains a user-supplied database identifier. This is the unique key
     * that identifies a DB Instance.
     *
     * @param dBInstanceIdentifier Contains a user-supplied database identifier. This is the unique key
     *         that identifies a DB Instance.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * Contains a user-supplied database identifier. This is the unique key
     * that identifies a DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier Contains a user-supplied database identifier. This is the unique key
     *         that identifies a DB Instance.
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
     * Instance.
     *
     * @return Contains the name of the compute and memory capacity class of the DB
     *         Instance.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * Contains the name of the compute and memory capacity class of the DB
     * Instance.
     *
     * @param dBInstanceClass Contains the name of the compute and memory capacity class of the DB
     *         Instance.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * Contains the name of the compute and memory capacity class of the DB
     * Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass Contains the name of the compute and memory capacity class of the DB
     *         Instance.
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
     * Instance.
     *
     * @return Provides the name of the database engine to be used for this DB
     *         Instance.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * Provides the name of the database engine to be used for this DB
     * Instance.
     *
     * @param engine Provides the name of the database engine to be used for this DB
     *         Instance.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * Provides the name of the database engine to be used for this DB
     * Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine Provides the name of the database engine to be used for this DB
     *         Instance.
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
     * Contains the master username for the DB Instance.
     *
     * @return Contains the master username for the DB Instance.
     */
    public String getMasterUsername() {
        return masterUsername;
    }
    
    /**
     * Contains the master username for the DB Instance.
     *
     * @param masterUsername Contains the master username for the DB Instance.
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }
    
    /**
     * Contains the master username for the DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUsername Contains the master username for the DB Instance.
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
     * you use. <p><b>MySQL</b> <p> Contains the name of the initial database
     * of this instance that was provided at create time, if one was
     * specified when the DB Instance was created. This same name is returned
     * for the life of the DB Instance. <p>Type: String <p><b>Oracle</b> <p>
     * Contains the Oracle System ID (SID) of the created DB Instance.
     *
     * @return The meaning of this parameter differs according to the database engine
     *         you use. <p><b>MySQL</b> <p> Contains the name of the initial database
     *         of this instance that was provided at create time, if one was
     *         specified when the DB Instance was created. This same name is returned
     *         for the life of the DB Instance. <p>Type: String <p><b>Oracle</b> <p>
     *         Contains the Oracle System ID (SID) of the created DB Instance.
     */
    public String getDBName() {
        return dBName;
    }
    
    /**
     * The meaning of this parameter differs according to the database engine
     * you use. <p><b>MySQL</b> <p> Contains the name of the initial database
     * of this instance that was provided at create time, if one was
     * specified when the DB Instance was created. This same name is returned
     * for the life of the DB Instance. <p>Type: String <p><b>Oracle</b> <p>
     * Contains the Oracle System ID (SID) of the created DB Instance.
     *
     * @param dBName The meaning of this parameter differs according to the database engine
     *         you use. <p><b>MySQL</b> <p> Contains the name of the initial database
     *         of this instance that was provided at create time, if one was
     *         specified when the DB Instance was created. This same name is returned
     *         for the life of the DB Instance. <p>Type: String <p><b>Oracle</b> <p>
     *         Contains the Oracle System ID (SID) of the created DB Instance.
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }
    
    /**
     * The meaning of this parameter differs according to the database engine
     * you use. <p><b>MySQL</b> <p> Contains the name of the initial database
     * of this instance that was provided at create time, if one was
     * specified when the DB Instance was created. This same name is returned
     * for the life of the DB Instance. <p>Type: String <p><b>Oracle</b> <p>
     * Contains the Oracle System ID (SID) of the created DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBName The meaning of this parameter differs according to the database engine
     *         you use. <p><b>MySQL</b> <p> Contains the name of the initial database
     *         of this instance that was provided at create time, if one was
     *         specified when the DB Instance was created. This same name is returned
     *         for the life of the DB Instance. <p>Type: String <p><b>Oracle</b> <p>
     *         Contains the Oracle System ID (SID) of the created DB Instance.
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
     * Provides the date and time the DB Instance was created.
     *
     * @return Provides the date and time the DB Instance was created.
     */
    public java.util.Date getInstanceCreateTime() {
        return instanceCreateTime;
    }
    
    /**
     * Provides the date and time the DB Instance was created.
     *
     * @param instanceCreateTime Provides the date and time the DB Instance was created.
     */
    public void setInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }
    
    /**
     * Provides the date and time the DB Instance was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCreateTime Provides the date and time the DB Instance was created.
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
     * Specifies the number of days for which automatic DB Snapshots are
     * retained.
     *
     * @return Specifies the number of days for which automatic DB Snapshots are
     *         retained.
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }
    
    /**
     * Specifies the number of days for which automatic DB Snapshots are
     * retained.
     *
     * @param backupRetentionPeriod Specifies the number of days for which automatic DB Snapshots are
     *         retained.
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }
    
    /**
     * Specifies the number of days for which automatic DB Snapshots are
     * retained.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backupRetentionPeriod Specifies the number of days for which automatic DB Snapshots are
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
     * Provides List of DB Security Group elements containing only
     * <code>DBSecurityGroup.Name</code> and
     * <code>DBSecurityGroup.Status</code> subelements.
     *
     * @return Provides List of DB Security Group elements containing only
     *         <code>DBSecurityGroup.Name</code> and
     *         <code>DBSecurityGroup.Status</code> subelements.
     */
    public java.util.List<DBSecurityGroupMembership> getDBSecurityGroups() {
        
        if (dBSecurityGroups == null) {
            dBSecurityGroups = new java.util.ArrayList<DBSecurityGroupMembership>();
        }
        return dBSecurityGroups;
    }
    
    /**
     * Provides List of DB Security Group elements containing only
     * <code>DBSecurityGroup.Name</code> and
     * <code>DBSecurityGroup.Status</code> subelements.
     *
     * @param dBSecurityGroups Provides List of DB Security Group elements containing only
     *         <code>DBSecurityGroup.Name</code> and
     *         <code>DBSecurityGroup.Status</code> subelements.
     */
    public void setDBSecurityGroups(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }

        java.util.List<DBSecurityGroupMembership> dBSecurityGroupsCopy = new java.util.ArrayList<DBSecurityGroupMembership>(dBSecurityGroups.size());
        dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        this.dBSecurityGroups = dBSecurityGroupsCopy;
    }
    
    /**
     * Provides List of DB Security Group elements containing only
     * <code>DBSecurityGroup.Name</code> and
     * <code>DBSecurityGroup.Status</code> subelements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups Provides List of DB Security Group elements containing only
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
     * Provides List of DB Security Group elements containing only
     * <code>DBSecurityGroup.Name</code> and
     * <code>DBSecurityGroup.Status</code> subelements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups Provides List of DB Security Group elements containing only
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
            java.util.List<DBSecurityGroupMembership> dBSecurityGroupsCopy = new java.util.ArrayList<DBSecurityGroupMembership>(dBSecurityGroups.size());
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
            this.dBSecurityGroups = dBSecurityGroupsCopy;
        }

        return this;
    }
    
    /**
     * Provides the list of DB Parameter Groups applied to this DB Instance.
     *
     * @return Provides the list of DB Parameter Groups applied to this DB Instance.
     */
    public java.util.List<DBParameterGroupStatus> getDBParameterGroups() {
        
        if (dBParameterGroups == null) {
            dBParameterGroups = new java.util.ArrayList<DBParameterGroupStatus>();
        }
        return dBParameterGroups;
    }
    
    /**
     * Provides the list of DB Parameter Groups applied to this DB Instance.
     *
     * @param dBParameterGroups Provides the list of DB Parameter Groups applied to this DB Instance.
     */
    public void setDBParameterGroups(java.util.Collection<DBParameterGroupStatus> dBParameterGroups) {
        if (dBParameterGroups == null) {
            this.dBParameterGroups = null;
            return;
        }

        java.util.List<DBParameterGroupStatus> dBParameterGroupsCopy = new java.util.ArrayList<DBParameterGroupStatus>(dBParameterGroups.size());
        dBParameterGroupsCopy.addAll(dBParameterGroups);
        this.dBParameterGroups = dBParameterGroupsCopy;
    }
    
    /**
     * Provides the list of DB Parameter Groups applied to this DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroups Provides the list of DB Parameter Groups applied to this DB Instance.
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
     * Provides the list of DB Parameter Groups applied to this DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroups Provides the list of DB Parameter Groups applied to this DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBInstance withDBParameterGroups(java.util.Collection<DBParameterGroupStatus> dBParameterGroups) {
        if (dBParameterGroups == null) {
            this.dBParameterGroups = null;
        } else {
            java.util.List<DBParameterGroupStatus> dBParameterGroupsCopy = new java.util.ArrayList<DBParameterGroupStatus>(dBParameterGroups.size());
            dBParameterGroupsCopy.addAll(dBParameterGroups);
            this.dBParameterGroups = dBParameterGroupsCopy;
        }

        return this;
    }
    
    /**
     * Specifies the name of the Availability Zone the DB Instance is located
     * in.
     *
     * @return Specifies the name of the Availability Zone the DB Instance is located
     *         in.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * Specifies the name of the Availability Zone the DB Instance is located
     * in.
     *
     * @param availabilityZone Specifies the name of the Availability Zone the DB Instance is located
     *         in.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * Specifies the name of the Availability Zone the DB Instance is located
     * in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone Specifies the name of the Availability Zone the DB Instance is located
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
     * Provides the inforamtion of the subnet group associated with the DB
     * instance, including the name, descrption and subnets in the subnet
     * group.
     *
     * @return Provides the inforamtion of the subnet group associated with the DB
     *         instance, including the name, descrption and subnets in the subnet
     *         group.
     */
    public DBSubnetGroup getDBSubnetGroup() {
        return dBSubnetGroup;
    }
    
    /**
     * Provides the inforamtion of the subnet group associated with the DB
     * instance, including the name, descrption and subnets in the subnet
     * group.
     *
     * @param dBSubnetGroup Provides the inforamtion of the subnet group associated with the DB
     *         instance, including the name, descrption and subnets in the subnet
     *         group.
     */
    public void setDBSubnetGroup(DBSubnetGroup dBSubnetGroup) {
        this.dBSubnetGroup = dBSubnetGroup;
    }
    
    /**
     * Provides the inforamtion of the subnet group associated with the DB
     * instance, including the name, descrption and subnets in the subnet
     * group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroup Provides the inforamtion of the subnet group associated with the DB
     *         instance, including the name, descrption and subnets in the subnet
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
     * Specifies that changes to the DB Instance are pending. This element is
     * only included when changes are pending. Specific changes are
     * identified by subelements.
     *
     * @return Specifies that changes to the DB Instance are pending. This element is
     *         only included when changes are pending. Specific changes are
     *         identified by subelements.
     */
    public PendingModifiedValues getPendingModifiedValues() {
        return pendingModifiedValues;
    }
    
    /**
     * Specifies that changes to the DB Instance are pending. This element is
     * only included when changes are pending. Specific changes are
     * identified by subelements.
     *
     * @param pendingModifiedValues Specifies that changes to the DB Instance are pending. This element is
     *         only included when changes are pending. Specific changes are
     *         identified by subelements.
     */
    public void setPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }
    
    /**
     * Specifies that changes to the DB Instance are pending. This element is
     * only included when changes are pending. Specific changes are
     * identified by subelements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pendingModifiedValues Specifies that changes to the DB Instance are pending. This element is
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
     * Specifies if the DB Instance is a Multi-AZ deployment.
     *
     * @return Specifies if the DB Instance is a Multi-AZ deployment.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Specifies if the DB Instance is a Multi-AZ deployment.
     *
     * @param multiAZ Specifies if the DB Instance is a Multi-AZ deployment.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Specifies if the DB Instance is a Multi-AZ deployment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ Specifies if the DB Instance is a Multi-AZ deployment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBInstance withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }
    
    
    /**
     * Specifies if the DB Instance is a Multi-AZ deployment.
     *
     * @return Specifies if the DB Instance is a Multi-AZ deployment.
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
     * Contains the identifier of the source DB Instance if this DB Instance
     * is a Read Replica.
     *
     * @return Contains the identifier of the source DB Instance if this DB Instance
     *         is a Read Replica.
     */
    public String getReadReplicaSourceDBInstanceIdentifier() {
        return readReplicaSourceDBInstanceIdentifier;
    }
    
    /**
     * Contains the identifier of the source DB Instance if this DB Instance
     * is a Read Replica.
     *
     * @param readReplicaSourceDBInstanceIdentifier Contains the identifier of the source DB Instance if this DB Instance
     *         is a Read Replica.
     */
    public void setReadReplicaSourceDBInstanceIdentifier(String readReplicaSourceDBInstanceIdentifier) {
        this.readReplicaSourceDBInstanceIdentifier = readReplicaSourceDBInstanceIdentifier;
    }
    
    /**
     * Contains the identifier of the source DB Instance if this DB Instance
     * is a Read Replica.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readReplicaSourceDBInstanceIdentifier Contains the identifier of the source DB Instance if this DB Instance
     *         is a Read Replica.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBInstance withReadReplicaSourceDBInstanceIdentifier(String readReplicaSourceDBInstanceIdentifier) {
        this.readReplicaSourceDBInstanceIdentifier = readReplicaSourceDBInstanceIdentifier;
        return this;
    }
    
    
    /**
     * Contains one or more identifiers of the Read Replicas associated with
     * this DB Instance.
     *
     * @return Contains one or more identifiers of the Read Replicas associated with
     *         this DB Instance.
     */
    public java.util.List<String> getReadReplicaDBInstanceIdentifiers() {
        
        if (readReplicaDBInstanceIdentifiers == null) {
            readReplicaDBInstanceIdentifiers = new java.util.ArrayList<String>();
        }
        return readReplicaDBInstanceIdentifiers;
    }
    
    /**
     * Contains one or more identifiers of the Read Replicas associated with
     * this DB Instance.
     *
     * @param readReplicaDBInstanceIdentifiers Contains one or more identifiers of the Read Replicas associated with
     *         this DB Instance.
     */
    public void setReadReplicaDBInstanceIdentifiers(java.util.Collection<String> readReplicaDBInstanceIdentifiers) {
        if (readReplicaDBInstanceIdentifiers == null) {
            this.readReplicaDBInstanceIdentifiers = null;
            return;
        }

        java.util.List<String> readReplicaDBInstanceIdentifiersCopy = new java.util.ArrayList<String>(readReplicaDBInstanceIdentifiers.size());
        readReplicaDBInstanceIdentifiersCopy.addAll(readReplicaDBInstanceIdentifiers);
        this.readReplicaDBInstanceIdentifiers = readReplicaDBInstanceIdentifiersCopy;
    }
    
    /**
     * Contains one or more identifiers of the Read Replicas associated with
     * this DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readReplicaDBInstanceIdentifiers Contains one or more identifiers of the Read Replicas associated with
     *         this DB Instance.
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
     * Contains one or more identifiers of the Read Replicas associated with
     * this DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param readReplicaDBInstanceIdentifiers Contains one or more identifiers of the Read Replicas associated with
     *         this DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBInstance withReadReplicaDBInstanceIdentifiers(java.util.Collection<String> readReplicaDBInstanceIdentifiers) {
        if (readReplicaDBInstanceIdentifiers == null) {
            this.readReplicaDBInstanceIdentifiers = null;
        } else {
            java.util.List<String> readReplicaDBInstanceIdentifiersCopy = new java.util.ArrayList<String>(readReplicaDBInstanceIdentifiers.size());
            readReplicaDBInstanceIdentifiersCopy.addAll(readReplicaDBInstanceIdentifiers);
            this.readReplicaDBInstanceIdentifiers = readReplicaDBInstanceIdentifiersCopy;
        }

        return this;
    }
    
    /**
     * License model information for this DB Instance.
     *
     * @return License model information for this DB Instance.
     */
    public String getLicenseModel() {
        return licenseModel;
    }
    
    /**
     * License model information for this DB Instance.
     *
     * @param licenseModel License model information for this DB Instance.
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }
    
    /**
     * License model information for this DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseModel License model information for this DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBInstance withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
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
        if (dBInstanceIdentifier != null) sb.append("DBInstanceIdentifier: " + dBInstanceIdentifier + ", ");
        if (dBInstanceClass != null) sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        if (engine != null) sb.append("Engine: " + engine + ", ");
        if (dBInstanceStatus != null) sb.append("DBInstanceStatus: " + dBInstanceStatus + ", ");
        if (masterUsername != null) sb.append("MasterUsername: " + masterUsername + ", ");
        if (dBName != null) sb.append("DBName: " + dBName + ", ");
        if (endpoint != null) sb.append("Endpoint: " + endpoint + ", ");
        if (allocatedStorage != null) sb.append("AllocatedStorage: " + allocatedStorage + ", ");
        if (instanceCreateTime != null) sb.append("InstanceCreateTime: " + instanceCreateTime + ", ");
        if (preferredBackupWindow != null) sb.append("PreferredBackupWindow: " + preferredBackupWindow + ", ");
        if (backupRetentionPeriod != null) sb.append("BackupRetentionPeriod: " + backupRetentionPeriod + ", ");
        if (dBSecurityGroups != null) sb.append("DBSecurityGroups: " + dBSecurityGroups + ", ");
        if (dBParameterGroups != null) sb.append("DBParameterGroups: " + dBParameterGroups + ", ");
        if (availabilityZone != null) sb.append("AvailabilityZone: " + availabilityZone + ", ");
        if (dBSubnetGroup != null) sb.append("DBSubnetGroup: " + dBSubnetGroup + ", ");
        if (preferredMaintenanceWindow != null) sb.append("PreferredMaintenanceWindow: " + preferredMaintenanceWindow + ", ");
        if (pendingModifiedValues != null) sb.append("PendingModifiedValues: " + pendingModifiedValues + ", ");
        if (latestRestorableTime != null) sb.append("LatestRestorableTime: " + latestRestorableTime + ", ");
        if (multiAZ != null) sb.append("MultiAZ: " + multiAZ + ", ");
        if (engineVersion != null) sb.append("EngineVersion: " + engineVersion + ", ");
        if (autoMinorVersionUpgrade != null) sb.append("AutoMinorVersionUpgrade: " + autoMinorVersionUpgrade + ", ");
        if (readReplicaSourceDBInstanceIdentifier != null) sb.append("ReadReplicaSourceDBInstanceIdentifier: " + readReplicaSourceDBInstanceIdentifier + ", ");
        if (readReplicaDBInstanceIdentifiers != null) sb.append("ReadReplicaDBInstanceIdentifiers: " + readReplicaDBInstanceIdentifiers + ", ");
        if (licenseModel != null) sb.append("LicenseModel: " + licenseModel + ", ");
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
        return true;
    }
    
}
    