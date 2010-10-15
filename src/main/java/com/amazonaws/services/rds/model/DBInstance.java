/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 * </p>
 */
public class DBInstance {

    /**
     * Specifies a user-supplied database identifier. This is the unique key
     * that identifies a DB Instance.
     */
    private String dBInstanceIdentifier;

    /**
     * Specifies the name of the compute and memory capacity class of the DB
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
     * Specifies the name of the initial database of this instance that was
     * provided at create time, if one was specified when the DB Instance was
     * created. This same name is returned for the life of the DB Instance.
     */
    private String dBName;

    /**
     * Specifies the endpoint type.
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
     * <i>BackupRetentionPeriod</i>.
     */
    private String preferredBackupWindow;

    /**
     * Specifies the number of days for which automatic DB Snapshots are
     * retained.
     */
    private Integer backupRetentionPeriod;

    /**
     * Provides List of DB Security Group elements containing only
     * <i>DBSecurityGroup.Name</i> and <i>DBSecurityGroup.Status</i>
     * sub-elements.
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
     * Specifies the weekly time range (in UTC) during which system
     * maintenance can occur.
     */
    private String preferredMaintenanceWindow;

    /**
     * Specifies that changes to the DB Instance are pending. This element is
     * only included when changes are pending. Specific changes are
     * identified by sub-elements.
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
     * Specifies a user-supplied database identifier. This is the unique key
     * that identifies a DB Instance.
     *
     * @return Specifies a user-supplied database identifier. This is the unique key
     *         that identifies a DB Instance.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * Specifies a user-supplied database identifier. This is the unique key
     * that identifies a DB Instance.
     *
     * @param dBInstanceIdentifier Specifies a user-supplied database identifier. This is the unique key
     *         that identifies a DB Instance.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * Specifies a user-supplied database identifier. This is the unique key
     * that identifies a DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier Specifies a user-supplied database identifier. This is the unique key
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
     * Specifies the name of the compute and memory capacity class of the DB
     * Instance.
     *
     * @return Specifies the name of the compute and memory capacity class of the DB
     *         Instance.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * Specifies the name of the compute and memory capacity class of the DB
     * Instance.
     *
     * @param dBInstanceClass Specifies the name of the compute and memory capacity class of the DB
     *         Instance.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * Specifies the name of the compute and memory capacity class of the DB
     * Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass Specifies the name of the compute and memory capacity class of the DB
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
     * Specifies the name of the initial database of this instance that was
     * provided at create time, if one was specified when the DB Instance was
     * created. This same name is returned for the life of the DB Instance.
     *
     * @return Specifies the name of the initial database of this instance that was
     *         provided at create time, if one was specified when the DB Instance was
     *         created. This same name is returned for the life of the DB Instance.
     */
    public String getDBName() {
        return dBName;
    }
    
    /**
     * Specifies the name of the initial database of this instance that was
     * provided at create time, if one was specified when the DB Instance was
     * created. This same name is returned for the life of the DB Instance.
     *
     * @param dBName Specifies the name of the initial database of this instance that was
     *         provided at create time, if one was specified when the DB Instance was
     *         created. This same name is returned for the life of the DB Instance.
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }
    
    /**
     * Specifies the name of the initial database of this instance that was
     * provided at create time, if one was specified when the DB Instance was
     * created. This same name is returned for the life of the DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBName Specifies the name of the initial database of this instance that was
     *         provided at create time, if one was specified when the DB Instance was
     *         created. This same name is returned for the life of the DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBInstance withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }
    
    
    /**
     * Specifies the endpoint type.
     *
     * @return Specifies the endpoint type.
     */
    public Endpoint getEndpoint() {
        return endpoint;
    }
    
    /**
     * Specifies the endpoint type.
     *
     * @param endpoint Specifies the endpoint type.
     */
    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }
    
    /**
     * Specifies the endpoint type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endpoint Specifies the endpoint type.
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
     * <i>BackupRetentionPeriod</i>.
     *
     * @return Specifies the daily time range during which automated backups are
     *         created if automated backups are enabled, as determined by the
     *         <i>BackupRetentionPeriod</i>.
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }
    
    /**
     * Specifies the daily time range during which automated backups are
     * created if automated backups are enabled, as determined by the
     * <i>BackupRetentionPeriod</i>.
     *
     * @param preferredBackupWindow Specifies the daily time range during which automated backups are
     *         created if automated backups are enabled, as determined by the
     *         <i>BackupRetentionPeriod</i>.
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }
    
    /**
     * Specifies the daily time range during which automated backups are
     * created if automated backups are enabled, as determined by the
     * <i>BackupRetentionPeriod</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredBackupWindow Specifies the daily time range during which automated backups are
     *         created if automated backups are enabled, as determined by the
     *         <i>BackupRetentionPeriod</i>.
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
     * <i>DBSecurityGroup.Name</i> and <i>DBSecurityGroup.Status</i>
     * sub-elements.
     *
     * @return Provides List of DB Security Group elements containing only
     *         <i>DBSecurityGroup.Name</i> and <i>DBSecurityGroup.Status</i>
     *         sub-elements.
     */
    public java.util.List<DBSecurityGroupMembership> getDBSecurityGroups() {
        if (dBSecurityGroups == null) {
            dBSecurityGroups = new java.util.ArrayList<DBSecurityGroupMembership>();
        }
        return dBSecurityGroups;
    }
    
    /**
     * Provides List of DB Security Group elements containing only
     * <i>DBSecurityGroup.Name</i> and <i>DBSecurityGroup.Status</i>
     * sub-elements.
     *
     * @param dBSecurityGroups Provides List of DB Security Group elements containing only
     *         <i>DBSecurityGroup.Name</i> and <i>DBSecurityGroup.Status</i>
     *         sub-elements.
     */
    public void setDBSecurityGroups(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroups) {
        java.util.List<DBSecurityGroupMembership> dBSecurityGroupsCopy = new java.util.ArrayList<DBSecurityGroupMembership>();
        if (dBSecurityGroups != null) {
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        }
        this.dBSecurityGroups = dBSecurityGroupsCopy;
    }
    
    /**
     * Provides List of DB Security Group elements containing only
     * <i>DBSecurityGroup.Name</i> and <i>DBSecurityGroup.Status</i>
     * sub-elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups Provides List of DB Security Group elements containing only
     *         <i>DBSecurityGroup.Name</i> and <i>DBSecurityGroup.Status</i>
     *         sub-elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBInstance withDBSecurityGroups(DBSecurityGroupMembership... dBSecurityGroups) {
        for (DBSecurityGroupMembership value : dBSecurityGroups) {
            getDBSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * Provides List of DB Security Group elements containing only
     * <i>DBSecurityGroup.Name</i> and <i>DBSecurityGroup.Status</i>
     * sub-elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups Provides List of DB Security Group elements containing only
     *         <i>DBSecurityGroup.Name</i> and <i>DBSecurityGroup.Status</i>
     *         sub-elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBInstance withDBSecurityGroups(java.util.Collection<DBSecurityGroupMembership> dBSecurityGroups) {
        java.util.List<DBSecurityGroupMembership> dBSecurityGroupsCopy = new java.util.ArrayList<DBSecurityGroupMembership>();
        if (dBSecurityGroups != null) {
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        }
        this.dBSecurityGroups = dBSecurityGroupsCopy;

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
        java.util.List<DBParameterGroupStatus> dBParameterGroupsCopy = new java.util.ArrayList<DBParameterGroupStatus>();
        if (dBParameterGroups != null) {
            dBParameterGroupsCopy.addAll(dBParameterGroups);
        }
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
        java.util.List<DBParameterGroupStatus> dBParameterGroupsCopy = new java.util.ArrayList<DBParameterGroupStatus>();
        if (dBParameterGroups != null) {
            dBParameterGroupsCopy.addAll(dBParameterGroups);
        }
        this.dBParameterGroups = dBParameterGroupsCopy;

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
     * identified by sub-elements.
     *
     * @return Specifies that changes to the DB Instance are pending. This element is
     *         only included when changes are pending. Specific changes are
     *         identified by sub-elements.
     */
    public PendingModifiedValues getPendingModifiedValues() {
        return pendingModifiedValues;
    }
    
    /**
     * Specifies that changes to the DB Instance are pending. This element is
     * only included when changes are pending. Specific changes are
     * identified by sub-elements.
     *
     * @param pendingModifiedValues Specifies that changes to the DB Instance are pending. This element is
     *         only included when changes are pending. Specific changes are
     *         identified by sub-elements.
     */
    public void setPendingModifiedValues(PendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }
    
    /**
     * Specifies that changes to the DB Instance are pending. This element is
     * only included when changes are pending. Specific changes are
     * identified by sub-elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pendingModifiedValues Specifies that changes to the DB Instance are pending. This element is
     *         only included when changes are pending. Specific changes are
     *         identified by sub-elements.
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
        java.util.List<String> readReplicaDBInstanceIdentifiersCopy = new java.util.ArrayList<String>();
        if (readReplicaDBInstanceIdentifiers != null) {
            readReplicaDBInstanceIdentifiersCopy.addAll(readReplicaDBInstanceIdentifiers);
        }
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
        java.util.List<String> readReplicaDBInstanceIdentifiersCopy = new java.util.ArrayList<String>();
        if (readReplicaDBInstanceIdentifiers != null) {
            readReplicaDBInstanceIdentifiersCopy.addAll(readReplicaDBInstanceIdentifiers);
        }
        this.readReplicaDBInstanceIdentifiers = readReplicaDBInstanceIdentifiersCopy;

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
        sb.append("DBInstanceIdentifier: " + dBInstanceIdentifier + ", ");
        sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        sb.append("Engine: " + engine + ", ");
        sb.append("DBInstanceStatus: " + dBInstanceStatus + ", ");
        sb.append("MasterUsername: " + masterUsername + ", ");
        sb.append("DBName: " + dBName + ", ");
        sb.append("Endpoint: " + endpoint + ", ");
        sb.append("AllocatedStorage: " + allocatedStorage + ", ");
        sb.append("InstanceCreateTime: " + instanceCreateTime + ", ");
        sb.append("PreferredBackupWindow: " + preferredBackupWindow + ", ");
        sb.append("BackupRetentionPeriod: " + backupRetentionPeriod + ", ");
        sb.append("DBSecurityGroups: " + dBSecurityGroups + ", ");
        sb.append("DBParameterGroups: " + dBParameterGroups + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("PreferredMaintenanceWindow: " + preferredMaintenanceWindow + ", ");
        sb.append("PendingModifiedValues: " + pendingModifiedValues + ", ");
        sb.append("LatestRestorableTime: " + latestRestorableTime + ", ");
        sb.append("MultiAZ: " + multiAZ + ", ");
        sb.append("EngineVersion: " + engineVersion + ", ");
        sb.append("AutoMinorVersionUpgrade: " + autoMinorVersionUpgrade + ", ");
        sb.append("ReadReplicaSourceDBInstanceIdentifier: " + readReplicaSourceDBInstanceIdentifier + ", ");
        sb.append("ReadReplicaDBInstanceIdentifiers: " + readReplicaDBInstanceIdentifiers + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    