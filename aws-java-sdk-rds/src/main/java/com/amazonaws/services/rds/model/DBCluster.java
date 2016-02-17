/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains the result of a successful invocation of the following
 * actions:
 * </p>
 * 
 * <ul>
 * <li> CreateDBCluster </li>
 * <li> DeleteDBCluster </li>
 * <li> FailoverDBCluster </li>
 * <li> ModifyDBCluster </li>
 * <li> RestoreDBClusterFromSnapshot </li>
 * 
 * </ul>
 * <p>
 * This data type is used as a response element in the DescribeDBClusters
 * action.
 * </p>
 */
public class DBCluster implements Serializable, Cloneable {

    /**
     * Specifies the allocated storage size in gigabytes (GB).
     */
    private Integer allocatedStorage;

    /**
     * Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

    /**
     * Specifies the number of days for which automatic DB snapshots are
     * retained.
     */
    private Integer backupRetentionPeriod;

    /**
     * If present, specifies the name of the character set that this cluster
     * is associated with.
     */
    private String characterSetName;

    /**
     * Contains the name of the initial database of this DB cluster that was
     * provided at create time, if one was specified when the DB cluster was
     * created. This same name is returned for the life of the DB cluster.
     */
    private String databaseName;

    /**
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     */
    private String dBClusterIdentifier;

    /**
     * Specifies the name of the DB cluster parameter group for the DB
     * cluster.
     */
    private String dBClusterParameterGroup;

    /**
     * Specifies information on the subnet group associated with the DB
     * cluster, including the name, description, and subnets in the subnet
     * group.
     */
    private String dBSubnetGroup;

    /**
     * Specifies the current state of this DB cluster.
     */
    private String status;

    /**
     * Specifies the progress of the operation as a percentage.
     */
    private String percentProgress;

    /**
     * Specifies the earliest time to which a database can be restored with
     * point-in-time restore.
     */
    private java.util.Date earliestRestorableTime;

    /**
     * Specifies the connection endpoint for the primary instance of the DB
     * cluster.
     */
    private String endpoint;

    /**
     * Provides the name of the database engine to be used for this DB
     * cluster.
     */
    private String engine;

    /**
     * Indicates the database engine version.
     */
    private String engineVersion;

    /**
     * Specifies the latest time to which a database can be restored with
     * point-in-time restore.
     */
    private java.util.Date latestRestorableTime;

    /**
     * Specifies the port that the database engine is listening on.
     */
    private Integer port;

    /**
     * Contains the master username for the DB cluster.
     */
    private String masterUsername;

    /**
     * Provides the list of option group memberships for this DB cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterOptionGroupStatus> dBClusterOptionGroupMemberships;

    /**
     * Specifies the daily time range during which automated backups are
     * created if automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>.
     */
    private String preferredBackupWindow;

    /**
     * Specifies the weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     */
    private String preferredMaintenanceWindow;

    /**
     * Provides the list of instances that make up the DB cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterMember> dBClusterMembers;

    /**
     * Provides a list of VPC security groups that the DB cluster belongs to.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership> vpcSecurityGroups;

    /**
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     */
    private String hostedZoneId;

    /**
     * Specifies whether the DB cluster is encrypted.
     */
    private Boolean storageEncrypted;

    /**
     * If <code>StorageEncrypted</code> is true, the KMS key identifier for
     * the encrypted DB cluster.
     */
    private String kmsKeyId;

    /**
     * The region-unique, immutable identifier for the DB cluster. This
     * identifier is found in AWS CloudTrail log entries whenever the KMS key
     * for the DB cluster is accessed.
     */
    private String dbClusterResourceId;

    /**
     * Specifies the allocated storage size in gigabytes (GB).
     *
     * @return Specifies the allocated storage size in gigabytes (GB).
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }
    
    /**
     * Specifies the allocated storage size in gigabytes (GB).
     *
     * @param allocatedStorage Specifies the allocated storage size in gigabytes (GB).
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }
    
    /**
     * Specifies the allocated storage size in gigabytes (GB).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocatedStorage Specifies the allocated storage size in gigabytes (GB).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in.
     *
     * @return Provides the list of EC2 Availability Zones that instances in the DB
     *         cluster can be created in.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in.
     *
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
     *         cluster can be created in.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(availabilityZones.size());
        availabilityZonesCopy.addAll(availabilityZones);
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAvailabilityZones(java.util.Collection)} or
     * {@link #withAvailabilityZones(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
     *         cluster can be created in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
     *         cluster can be created in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(availabilityZones.size());
            availabilityZonesCopy.addAll(availabilityZones);
            this.availabilityZones = availabilityZonesCopy;
        }

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
    public DBCluster withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * If present, specifies the name of the character set that this cluster
     * is associated with.
     *
     * @return If present, specifies the name of the character set that this cluster
     *         is associated with.
     */
    public String getCharacterSetName() {
        return characterSetName;
    }
    
    /**
     * If present, specifies the name of the character set that this cluster
     * is associated with.
     *
     * @param characterSetName If present, specifies the name of the character set that this cluster
     *         is associated with.
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }
    
    /**
     * If present, specifies the name of the character set that this cluster
     * is associated with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param characterSetName If present, specifies the name of the character set that this cluster
     *         is associated with.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * Contains the name of the initial database of this DB cluster that was
     * provided at create time, if one was specified when the DB cluster was
     * created. This same name is returned for the life of the DB cluster.
     *
     * @return Contains the name of the initial database of this DB cluster that was
     *         provided at create time, if one was specified when the DB cluster was
     *         created. This same name is returned for the life of the DB cluster.
     */
    public String getDatabaseName() {
        return databaseName;
    }
    
    /**
     * Contains the name of the initial database of this DB cluster that was
     * provided at create time, if one was specified when the DB cluster was
     * created. This same name is returned for the life of the DB cluster.
     *
     * @param databaseName Contains the name of the initial database of this DB cluster that was
     *         provided at create time, if one was specified when the DB cluster was
     *         created. This same name is returned for the life of the DB cluster.
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
    
    /**
     * Contains the name of the initial database of this DB cluster that was
     * provided at create time, if one was specified when the DB cluster was
     * created. This same name is returned for the life of the DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param databaseName Contains the name of the initial database of this DB cluster that was
     *         provided at create time, if one was specified when the DB cluster was
     *         created. This same name is returned for the life of the DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     *
     * @return Contains a user-supplied DB cluster identifier. This identifier is the
     *         unique key that identifies a DB cluster.
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }
    
    /**
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     *
     * @param dBClusterIdentifier Contains a user-supplied DB cluster identifier. This identifier is the
     *         unique key that identifies a DB cluster.
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }
    
    /**
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterIdentifier Contains a user-supplied DB cluster identifier. This identifier is the
     *         unique key that identifies a DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * Specifies the name of the DB cluster parameter group for the DB
     * cluster.
     *
     * @return Specifies the name of the DB cluster parameter group for the DB
     *         cluster.
     */
    public String getDBClusterParameterGroup() {
        return dBClusterParameterGroup;
    }
    
    /**
     * Specifies the name of the DB cluster parameter group for the DB
     * cluster.
     *
     * @param dBClusterParameterGroup Specifies the name of the DB cluster parameter group for the DB
     *         cluster.
     */
    public void setDBClusterParameterGroup(String dBClusterParameterGroup) {
        this.dBClusterParameterGroup = dBClusterParameterGroup;
    }
    
    /**
     * Specifies the name of the DB cluster parameter group for the DB
     * cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterParameterGroup Specifies the name of the DB cluster parameter group for the DB
     *         cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withDBClusterParameterGroup(String dBClusterParameterGroup) {
        this.dBClusterParameterGroup = dBClusterParameterGroup;
        return this;
    }

    /**
     * Specifies information on the subnet group associated with the DB
     * cluster, including the name, description, and subnets in the subnet
     * group.
     *
     * @return Specifies information on the subnet group associated with the DB
     *         cluster, including the name, description, and subnets in the subnet
     *         group.
     */
    public String getDBSubnetGroup() {
        return dBSubnetGroup;
    }
    
    /**
     * Specifies information on the subnet group associated with the DB
     * cluster, including the name, description, and subnets in the subnet
     * group.
     *
     * @param dBSubnetGroup Specifies information on the subnet group associated with the DB
     *         cluster, including the name, description, and subnets in the subnet
     *         group.
     */
    public void setDBSubnetGroup(String dBSubnetGroup) {
        this.dBSubnetGroup = dBSubnetGroup;
    }
    
    /**
     * Specifies information on the subnet group associated with the DB
     * cluster, including the name, description, and subnets in the subnet
     * group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroup Specifies information on the subnet group associated with the DB
     *         cluster, including the name, description, and subnets in the subnet
     *         group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withDBSubnetGroup(String dBSubnetGroup) {
        this.dBSubnetGroup = dBSubnetGroup;
        return this;
    }

    /**
     * Specifies the current state of this DB cluster.
     *
     * @return Specifies the current state of this DB cluster.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Specifies the current state of this DB cluster.
     *
     * @param status Specifies the current state of this DB cluster.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Specifies the current state of this DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status Specifies the current state of this DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the progress of the operation as a percentage.
     *
     * @return Specifies the progress of the operation as a percentage.
     */
    public String getPercentProgress() {
        return percentProgress;
    }
    
    /**
     * Specifies the progress of the operation as a percentage.
     *
     * @param percentProgress Specifies the progress of the operation as a percentage.
     */
    public void setPercentProgress(String percentProgress) {
        this.percentProgress = percentProgress;
    }
    
    /**
     * Specifies the progress of the operation as a percentage.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param percentProgress Specifies the progress of the operation as a percentage.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withPercentProgress(String percentProgress) {
        this.percentProgress = percentProgress;
        return this;
    }

    /**
     * Specifies the earliest time to which a database can be restored with
     * point-in-time restore.
     *
     * @return Specifies the earliest time to which a database can be restored with
     *         point-in-time restore.
     */
    public java.util.Date getEarliestRestorableTime() {
        return earliestRestorableTime;
    }
    
    /**
     * Specifies the earliest time to which a database can be restored with
     * point-in-time restore.
     *
     * @param earliestRestorableTime Specifies the earliest time to which a database can be restored with
     *         point-in-time restore.
     */
    public void setEarliestRestorableTime(java.util.Date earliestRestorableTime) {
        this.earliestRestorableTime = earliestRestorableTime;
    }
    
    /**
     * Specifies the earliest time to which a database can be restored with
     * point-in-time restore.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param earliestRestorableTime Specifies the earliest time to which a database can be restored with
     *         point-in-time restore.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withEarliestRestorableTime(java.util.Date earliestRestorableTime) {
        this.earliestRestorableTime = earliestRestorableTime;
        return this;
    }

    /**
     * Specifies the connection endpoint for the primary instance of the DB
     * cluster.
     *
     * @return Specifies the connection endpoint for the primary instance of the DB
     *         cluster.
     */
    public String getEndpoint() {
        return endpoint;
    }
    
    /**
     * Specifies the connection endpoint for the primary instance of the DB
     * cluster.
     *
     * @param endpoint Specifies the connection endpoint for the primary instance of the DB
     *         cluster.
     */
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
    
    /**
     * Specifies the connection endpoint for the primary instance of the DB
     * cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endpoint Specifies the connection endpoint for the primary instance of the DB
     *         cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Provides the name of the database engine to be used for this DB
     * cluster.
     *
     * @return Provides the name of the database engine to be used for this DB
     *         cluster.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * Provides the name of the database engine to be used for this DB
     * cluster.
     *
     * @param engine Provides the name of the database engine to be used for this DB
     *         cluster.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * Provides the name of the database engine to be used for this DB
     * cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine Provides the name of the database engine to be used for this DB
     *         cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withEngine(String engine) {
        this.engine = engine;
        return this;
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
    public DBCluster withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
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
    public DBCluster withLatestRestorableTime(java.util.Date latestRestorableTime) {
        this.latestRestorableTime = latestRestorableTime;
        return this;
    }

    /**
     * Specifies the port that the database engine is listening on.
     *
     * @return Specifies the port that the database engine is listening on.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * Specifies the port that the database engine is listening on.
     *
     * @param port Specifies the port that the database engine is listening on.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * Specifies the port that the database engine is listening on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port Specifies the port that the database engine is listening on.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Contains the master username for the DB cluster.
     *
     * @return Contains the master username for the DB cluster.
     */
    public String getMasterUsername() {
        return masterUsername;
    }
    
    /**
     * Contains the master username for the DB cluster.
     *
     * @param masterUsername Contains the master username for the DB cluster.
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }
    
    /**
     * Contains the master username for the DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUsername Contains the master username for the DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * Provides the list of option group memberships for this DB cluster.
     *
     * @return Provides the list of option group memberships for this DB cluster.
     */
    public java.util.List<DBClusterOptionGroupStatus> getDBClusterOptionGroupMemberships() {
        if (dBClusterOptionGroupMemberships == null) {
              dBClusterOptionGroupMemberships = new com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterOptionGroupStatus>();
              dBClusterOptionGroupMemberships.setAutoConstruct(true);
        }
        return dBClusterOptionGroupMemberships;
    }
    
    /**
     * Provides the list of option group memberships for this DB cluster.
     *
     * @param dBClusterOptionGroupMemberships Provides the list of option group memberships for this DB cluster.
     */
    public void setDBClusterOptionGroupMemberships(java.util.Collection<DBClusterOptionGroupStatus> dBClusterOptionGroupMemberships) {
        if (dBClusterOptionGroupMemberships == null) {
            this.dBClusterOptionGroupMemberships = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterOptionGroupStatus> dBClusterOptionGroupMembershipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterOptionGroupStatus>(dBClusterOptionGroupMemberships.size());
        dBClusterOptionGroupMembershipsCopy.addAll(dBClusterOptionGroupMemberships);
        this.dBClusterOptionGroupMemberships = dBClusterOptionGroupMembershipsCopy;
    }
    
    /**
     * Provides the list of option group memberships for this DB cluster.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link
     * #setDBClusterOptionGroupMemberships(java.util.Collection)} or {@link
     * #withDBClusterOptionGroupMemberships(java.util.Collection)} if you
     * want to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterOptionGroupMemberships Provides the list of option group memberships for this DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withDBClusterOptionGroupMemberships(DBClusterOptionGroupStatus... dBClusterOptionGroupMemberships) {
        if (getDBClusterOptionGroupMemberships() == null) setDBClusterOptionGroupMemberships(new java.util.ArrayList<DBClusterOptionGroupStatus>(dBClusterOptionGroupMemberships.length));
        for (DBClusterOptionGroupStatus value : dBClusterOptionGroupMemberships) {
            getDBClusterOptionGroupMemberships().add(value);
        }
        return this;
    }
    
    /**
     * Provides the list of option group memberships for this DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterOptionGroupMemberships Provides the list of option group memberships for this DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withDBClusterOptionGroupMemberships(java.util.Collection<DBClusterOptionGroupStatus> dBClusterOptionGroupMemberships) {
        if (dBClusterOptionGroupMemberships == null) {
            this.dBClusterOptionGroupMemberships = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterOptionGroupStatus> dBClusterOptionGroupMembershipsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterOptionGroupStatus>(dBClusterOptionGroupMemberships.size());
            dBClusterOptionGroupMembershipsCopy.addAll(dBClusterOptionGroupMemberships);
            this.dBClusterOptionGroupMemberships = dBClusterOptionGroupMembershipsCopy;
        }

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
    public DBCluster withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * Specifies the weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     *
     * @return Specifies the weekly time range during which system maintenance can
     *         occur, in Universal Coordinated Time (UTC).
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * Specifies the weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     *
     * @param preferredMaintenanceWindow Specifies the weekly time range during which system maintenance can
     *         occur, in Universal Coordinated Time (UTC).
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * Specifies the weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow Specifies the weekly time range during which system maintenance can
     *         occur, in Universal Coordinated Time (UTC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * Provides the list of instances that make up the DB cluster.
     *
     * @return Provides the list of instances that make up the DB cluster.
     */
    public java.util.List<DBClusterMember> getDBClusterMembers() {
        if (dBClusterMembers == null) {
              dBClusterMembers = new com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterMember>();
              dBClusterMembers.setAutoConstruct(true);
        }
        return dBClusterMembers;
    }
    
    /**
     * Provides the list of instances that make up the DB cluster.
     *
     * @param dBClusterMembers Provides the list of instances that make up the DB cluster.
     */
    public void setDBClusterMembers(java.util.Collection<DBClusterMember> dBClusterMembers) {
        if (dBClusterMembers == null) {
            this.dBClusterMembers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterMember> dBClusterMembersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterMember>(dBClusterMembers.size());
        dBClusterMembersCopy.addAll(dBClusterMembers);
        this.dBClusterMembers = dBClusterMembersCopy;
    }
    
    /**
     * Provides the list of instances that make up the DB cluster.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDBClusterMembers(java.util.Collection)} or {@link
     * #withDBClusterMembers(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterMembers Provides the list of instances that make up the DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withDBClusterMembers(DBClusterMember... dBClusterMembers) {
        if (getDBClusterMembers() == null) setDBClusterMembers(new java.util.ArrayList<DBClusterMember>(dBClusterMembers.length));
        for (DBClusterMember value : dBClusterMembers) {
            getDBClusterMembers().add(value);
        }
        return this;
    }
    
    /**
     * Provides the list of instances that make up the DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterMembers Provides the list of instances that make up the DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withDBClusterMembers(java.util.Collection<DBClusterMember> dBClusterMembers) {
        if (dBClusterMembers == null) {
            this.dBClusterMembers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterMember> dBClusterMembersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterMember>(dBClusterMembers.size());
            dBClusterMembersCopy.addAll(dBClusterMembers);
            this.dBClusterMembers = dBClusterMembersCopy;
        }

        return this;
    }

    /**
     * Provides a list of VPC security groups that the DB cluster belongs to.
     *
     * @return Provides a list of VPC security groups that the DB cluster belongs to.
     */
    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroups() {
        if (vpcSecurityGroups == null) {
              vpcSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<VpcSecurityGroupMembership>();
              vpcSecurityGroups.setAutoConstruct(true);
        }
        return vpcSecurityGroups;
    }
    
    /**
     * Provides a list of VPC security groups that the DB cluster belongs to.
     *
     * @param vpcSecurityGroups Provides a list of VPC security groups that the DB cluster belongs to.
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
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVpcSecurityGroups(java.util.Collection)} or
     * {@link #withVpcSecurityGroups(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroups Provides a list of VPC security groups that the DB cluster belongs to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withVpcSecurityGroups(VpcSecurityGroupMembership... vpcSecurityGroups) {
        if (getVpcSecurityGroups() == null) setVpcSecurityGroups(new java.util.ArrayList<VpcSecurityGroupMembership>(vpcSecurityGroups.length));
        for (VpcSecurityGroupMembership value : vpcSecurityGroups) {
            getVpcSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroups Provides a list of VPC security groups that the DB cluster belongs to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withVpcSecurityGroups(java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
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
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     *
     * @return Specifies the ID that Amazon Route 53 assigns when you create a hosted
     *         zone.
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }
    
    /**
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     *
     * @param hostedZoneId Specifies the ID that Amazon Route 53 assigns when you create a hosted
     *         zone.
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }
    
    /**
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostedZoneId Specifies the ID that Amazon Route 53 assigns when you create a hosted
     *         zone.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * Specifies whether the DB cluster is encrypted.
     *
     * @return Specifies whether the DB cluster is encrypted.
     */
    public Boolean isStorageEncrypted() {
        return storageEncrypted;
    }
    
    /**
     * Specifies whether the DB cluster is encrypted.
     *
     * @param storageEncrypted Specifies whether the DB cluster is encrypted.
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }
    
    /**
     * Specifies whether the DB cluster is encrypted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param storageEncrypted Specifies whether the DB cluster is encrypted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * Specifies whether the DB cluster is encrypted.
     *
     * @return Specifies whether the DB cluster is encrypted.
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * If <code>StorageEncrypted</code> is true, the KMS key identifier for
     * the encrypted DB cluster.
     *
     * @return If <code>StorageEncrypted</code> is true, the KMS key identifier for
     *         the encrypted DB cluster.
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }
    
    /**
     * If <code>StorageEncrypted</code> is true, the KMS key identifier for
     * the encrypted DB cluster.
     *
     * @param kmsKeyId If <code>StorageEncrypted</code> is true, the KMS key identifier for
     *         the encrypted DB cluster.
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }
    
    /**
     * If <code>StorageEncrypted</code> is true, the KMS key identifier for
     * the encrypted DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kmsKeyId If <code>StorageEncrypted</code> is true, the KMS key identifier for
     *         the encrypted DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * The region-unique, immutable identifier for the DB cluster. This
     * identifier is found in AWS CloudTrail log entries whenever the KMS key
     * for the DB cluster is accessed.
     *
     * @return The region-unique, immutable identifier for the DB cluster. This
     *         identifier is found in AWS CloudTrail log entries whenever the KMS key
     *         for the DB cluster is accessed.
     */
    public String getDbClusterResourceId() {
        return dbClusterResourceId;
    }
    
    /**
     * The region-unique, immutable identifier for the DB cluster. This
     * identifier is found in AWS CloudTrail log entries whenever the KMS key
     * for the DB cluster is accessed.
     *
     * @param dbClusterResourceId The region-unique, immutable identifier for the DB cluster. This
     *         identifier is found in AWS CloudTrail log entries whenever the KMS key
     *         for the DB cluster is accessed.
     */
    public void setDbClusterResourceId(String dbClusterResourceId) {
        this.dbClusterResourceId = dbClusterResourceId;
    }
    
    /**
     * The region-unique, immutable identifier for the DB cluster. This
     * identifier is found in AWS CloudTrail log entries whenever the KMS key
     * for the DB cluster is accessed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dbClusterResourceId The region-unique, immutable identifier for the DB cluster. This
     *         identifier is found in AWS CloudTrail log entries whenever the KMS key
     *         for the DB cluster is accessed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBCluster withDbClusterResourceId(String dbClusterResourceId) {
        this.dbClusterResourceId = dbClusterResourceId;
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
        if (getAllocatedStorage() != null) sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getAvailabilityZones() != null) sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getBackupRetentionPeriod() != null) sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getCharacterSetName() != null) sb.append("CharacterSetName: " + getCharacterSetName() + ",");
        if (getDatabaseName() != null) sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getDBClusterIdentifier() != null) sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getDBClusterParameterGroup() != null) sb.append("DBClusterParameterGroup: " + getDBClusterParameterGroup() + ",");
        if (getDBSubnetGroup() != null) sb.append("DBSubnetGroup: " + getDBSubnetGroup() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getPercentProgress() != null) sb.append("PercentProgress: " + getPercentProgress() + ",");
        if (getEarliestRestorableTime() != null) sb.append("EarliestRestorableTime: " + getEarliestRestorableTime() + ",");
        if (getEndpoint() != null) sb.append("Endpoint: " + getEndpoint() + ",");
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getLatestRestorableTime() != null) sb.append("LatestRestorableTime: " + getLatestRestorableTime() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getMasterUsername() != null) sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getDBClusterOptionGroupMemberships() != null) sb.append("DBClusterOptionGroupMemberships: " + getDBClusterOptionGroupMemberships() + ",");
        if (getPreferredBackupWindow() != null) sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getDBClusterMembers() != null) sb.append("DBClusterMembers: " + getDBClusterMembers() + ",");
        if (getVpcSecurityGroups() != null) sb.append("VpcSecurityGroups: " + getVpcSecurityGroups() + ",");
        if (getHostedZoneId() != null) sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (isStorageEncrypted() != null) sb.append("StorageEncrypted: " + isStorageEncrypted() + ",");
        if (getKmsKeyId() != null) sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getDbClusterResourceId() != null) sb.append("DbClusterResourceId: " + getDbClusterResourceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode()); 
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode()); 
        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode()); 
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode()); 
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDBClusterParameterGroup() == null) ? 0 : getDBClusterParameterGroup().hashCode()); 
        hashCode = prime * hashCode + ((getDBSubnetGroup() == null) ? 0 : getDBSubnetGroup().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getPercentProgress() == null) ? 0 : getPercentProgress().hashCode()); 
        hashCode = prime * hashCode + ((getEarliestRestorableTime() == null) ? 0 : getEarliestRestorableTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode()); 
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getLatestRestorableTime() == null) ? 0 : getLatestRestorableTime().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode()); 
        hashCode = prime * hashCode + ((getDBClusterOptionGroupMemberships() == null) ? 0 : getDBClusterOptionGroupMemberships().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        hashCode = prime * hashCode + ((getDBClusterMembers() == null) ? 0 : getDBClusterMembers().hashCode()); 
        hashCode = prime * hashCode + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode()); 
        hashCode = prime * hashCode + ((isStorageEncrypted() == null) ? 0 : isStorageEncrypted().hashCode()); 
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getDbClusterResourceId() == null) ? 0 : getDbClusterResourceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DBCluster == false) return false;
        DBCluster other = (DBCluster)obj;
        
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null) return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false) return false; 
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null) return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false) return false; 
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null) return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false) return false; 
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null) return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false) return false; 
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null) return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false) return false; 
        if (other.getDBClusterParameterGroup() == null ^ this.getDBClusterParameterGroup() == null) return false;
        if (other.getDBClusterParameterGroup() != null && other.getDBClusterParameterGroup().equals(this.getDBClusterParameterGroup()) == false) return false; 
        if (other.getDBSubnetGroup() == null ^ this.getDBSubnetGroup() == null) return false;
        if (other.getDBSubnetGroup() != null && other.getDBSubnetGroup().equals(this.getDBSubnetGroup()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getPercentProgress() == null ^ this.getPercentProgress() == null) return false;
        if (other.getPercentProgress() != null && other.getPercentProgress().equals(this.getPercentProgress()) == false) return false; 
        if (other.getEarliestRestorableTime() == null ^ this.getEarliestRestorableTime() == null) return false;
        if (other.getEarliestRestorableTime() != null && other.getEarliestRestorableTime().equals(this.getEarliestRestorableTime()) == false) return false; 
        if (other.getEndpoint() == null ^ this.getEndpoint() == null) return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false) return false; 
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getLatestRestorableTime() == null ^ this.getLatestRestorableTime() == null) return false;
        if (other.getLatestRestorableTime() != null && other.getLatestRestorableTime().equals(this.getLatestRestorableTime()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null) return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false) return false; 
        if (other.getDBClusterOptionGroupMemberships() == null ^ this.getDBClusterOptionGroupMemberships() == null) return false;
        if (other.getDBClusterOptionGroupMemberships() != null && other.getDBClusterOptionGroupMemberships().equals(this.getDBClusterOptionGroupMemberships()) == false) return false; 
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null) return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.getDBClusterMembers() == null ^ this.getDBClusterMembers() == null) return false;
        if (other.getDBClusterMembers() != null && other.getDBClusterMembers().equals(this.getDBClusterMembers()) == false) return false; 
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null) return false;
        if (other.getVpcSecurityGroups() != null && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false) return false; 
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null) return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false) return false; 
        if (other.isStorageEncrypted() == null ^ this.isStorageEncrypted() == null) return false;
        if (other.isStorageEncrypted() != null && other.isStorageEncrypted().equals(this.isStorageEncrypted()) == false) return false; 
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null) return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false) return false; 
        if (other.getDbClusterResourceId() == null ^ this.getDbClusterResourceId() == null) return false;
        if (other.getDbClusterResourceId() != null && other.getDbClusterResourceId().equals(this.getDbClusterResourceId()) == false) return false; 
        return true;
    }
    
    @Override
    public DBCluster clone() {
        try {
            return (DBCluster) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    