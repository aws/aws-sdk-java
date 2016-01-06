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
 * <li> CreateDBClusterSnapshot </li>
 * <li> DeleteDBClusterSnapshot </li>
 * 
 * </ul>
 * <p>
 * This data type is used as a response element in the
 * DescribeDBClusterSnapshots action.
 * </p>
 */
public class DBClusterSnapshot implements Serializable, Cloneable {

    /**
     * Provides the list of EC2 Availability Zones that instances in the DB
     * cluster snapshot can be restored in.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

    /**
     * Specifies the identifier for the DB cluster snapshot.
     */
    private String dBClusterSnapshotIdentifier;

    /**
     * Specifies the DB cluster identifier of the DB cluster that this DB
     * cluster snapshot was created from.
     */
    private String dBClusterIdentifier;

    /**
     * Provides the time when the snapshot was taken, in Universal
     * Coordinated Time (UTC).
     */
    private java.util.Date snapshotCreateTime;

    /**
     * Specifies the name of the database engine.
     */
    private String engine;

    /**
     * Specifies the allocated storage size in gigabytes (GB).
     */
    private Integer allocatedStorage;

    /**
     * Specifies the status of this DB cluster snapshot.
     */
    private String status;

    /**
     * Specifies the port that the DB cluster was listening on at the time of
     * the snapshot.
     */
    private Integer port;

    /**
     * Provides the VPC ID associated with the DB cluster snapshot.
     */
    private String vpcId;

    /**
     * Specifies the time when the DB cluster was created, in Universal
     * Coordinated Time (UTC).
     */
    private java.util.Date clusterCreateTime;

    /**
     * Provides the master username for the DB cluster snapshot.
     */
    private String masterUsername;

    /**
     * Provides the version of the database engine for this DB cluster
     * snapshot.
     */
    private String engineVersion;

    /**
     * Provides the license model information for this DB cluster snapshot.
     */
    private String licenseModel;

    /**
     * Provides the type of the DB cluster snapshot.
     */
    private String snapshotType;

    /**
     * Specifies the percentage of the estimated data that has been
     * transferred.
     */
    private Integer percentProgress;

    /**
     * Specifies whether the DB cluster snapshot is encrypted.
     */
    private Boolean storageEncrypted;

    /**
     * If <code>StorageEncrypted</code> is true, the KMS key identifier for
     * the encrypted DB cluster snapshot.
     */
    private String kmsKeyId;

    /**
     * Provides the list of EC2 Availability Zones that instances in the DB
     * cluster snapshot can be restored in.
     *
     * @return Provides the list of EC2 Availability Zones that instances in the DB
     *         cluster snapshot can be restored in.
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
     * cluster snapshot can be restored in.
     *
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
     *         cluster snapshot can be restored in.
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
     * cluster snapshot can be restored in.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAvailabilityZones(java.util.Collection)} or
     * {@link #withAvailabilityZones(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
     *         cluster snapshot can be restored in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * Provides the list of EC2 Availability Zones that instances in the DB
     * cluster snapshot can be restored in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the DB
     *         cluster snapshot can be restored in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withAvailabilityZones(java.util.Collection<String> availabilityZones) {
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
     * Specifies the identifier for the DB cluster snapshot.
     *
     * @return Specifies the identifier for the DB cluster snapshot.
     */
    public String getDBClusterSnapshotIdentifier() {
        return dBClusterSnapshotIdentifier;
    }
    
    /**
     * Specifies the identifier for the DB cluster snapshot.
     *
     * @param dBClusterSnapshotIdentifier Specifies the identifier for the DB cluster snapshot.
     */
    public void setDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
    }
    
    /**
     * Specifies the identifier for the DB cluster snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterSnapshotIdentifier Specifies the identifier for the DB cluster snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
        return this;
    }

    /**
     * Specifies the DB cluster identifier of the DB cluster that this DB
     * cluster snapshot was created from.
     *
     * @return Specifies the DB cluster identifier of the DB cluster that this DB
     *         cluster snapshot was created from.
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }
    
    /**
     * Specifies the DB cluster identifier of the DB cluster that this DB
     * cluster snapshot was created from.
     *
     * @param dBClusterIdentifier Specifies the DB cluster identifier of the DB cluster that this DB
     *         cluster snapshot was created from.
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }
    
    /**
     * Specifies the DB cluster identifier of the DB cluster that this DB
     * cluster snapshot was created from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterIdentifier Specifies the DB cluster identifier of the DB cluster that this DB
     *         cluster snapshot was created from.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * Provides the time when the snapshot was taken, in Universal
     * Coordinated Time (UTC).
     *
     * @return Provides the time when the snapshot was taken, in Universal
     *         Coordinated Time (UTC).
     */
    public java.util.Date getSnapshotCreateTime() {
        return snapshotCreateTime;
    }
    
    /**
     * Provides the time when the snapshot was taken, in Universal
     * Coordinated Time (UTC).
     *
     * @param snapshotCreateTime Provides the time when the snapshot was taken, in Universal
     *         Coordinated Time (UTC).
     */
    public void setSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }
    
    /**
     * Provides the time when the snapshot was taken, in Universal
     * Coordinated Time (UTC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotCreateTime Provides the time when the snapshot was taken, in Universal
     *         Coordinated Time (UTC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
        return this;
    }

    /**
     * Specifies the name of the database engine.
     *
     * @return Specifies the name of the database engine.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * Specifies the name of the database engine.
     *
     * @param engine Specifies the name of the database engine.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * Specifies the name of the database engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine Specifies the name of the database engine.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withEngine(String engine) {
        this.engine = engine;
        return this;
    }

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
    public DBClusterSnapshot withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * Specifies the status of this DB cluster snapshot.
     *
     * @return Specifies the status of this DB cluster snapshot.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Specifies the status of this DB cluster snapshot.
     *
     * @param status Specifies the status of this DB cluster snapshot.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Specifies the status of this DB cluster snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status Specifies the status of this DB cluster snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the port that the DB cluster was listening on at the time of
     * the snapshot.
     *
     * @return Specifies the port that the DB cluster was listening on at the time of
     *         the snapshot.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * Specifies the port that the DB cluster was listening on at the time of
     * the snapshot.
     *
     * @param port Specifies the port that the DB cluster was listening on at the time of
     *         the snapshot.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * Specifies the port that the DB cluster was listening on at the time of
     * the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port Specifies the port that the DB cluster was listening on at the time of
     *         the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Provides the VPC ID associated with the DB cluster snapshot.
     *
     * @return Provides the VPC ID associated with the DB cluster snapshot.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * Provides the VPC ID associated with the DB cluster snapshot.
     *
     * @param vpcId Provides the VPC ID associated with the DB cluster snapshot.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * Provides the VPC ID associated with the DB cluster snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId Provides the VPC ID associated with the DB cluster snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * Specifies the time when the DB cluster was created, in Universal
     * Coordinated Time (UTC).
     *
     * @return Specifies the time when the DB cluster was created, in Universal
     *         Coordinated Time (UTC).
     */
    public java.util.Date getClusterCreateTime() {
        return clusterCreateTime;
    }
    
    /**
     * Specifies the time when the DB cluster was created, in Universal
     * Coordinated Time (UTC).
     *
     * @param clusterCreateTime Specifies the time when the DB cluster was created, in Universal
     *         Coordinated Time (UTC).
     */
    public void setClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
    }
    
    /**
     * Specifies the time when the DB cluster was created, in Universal
     * Coordinated Time (UTC).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterCreateTime Specifies the time when the DB cluster was created, in Universal
     *         Coordinated Time (UTC).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
        return this;
    }

    /**
     * Provides the master username for the DB cluster snapshot.
     *
     * @return Provides the master username for the DB cluster snapshot.
     */
    public String getMasterUsername() {
        return masterUsername;
    }
    
    /**
     * Provides the master username for the DB cluster snapshot.
     *
     * @param masterUsername Provides the master username for the DB cluster snapshot.
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }
    
    /**
     * Provides the master username for the DB cluster snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUsername Provides the master username for the DB cluster snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * Provides the version of the database engine for this DB cluster
     * snapshot.
     *
     * @return Provides the version of the database engine for this DB cluster
     *         snapshot.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * Provides the version of the database engine for this DB cluster
     * snapshot.
     *
     * @param engineVersion Provides the version of the database engine for this DB cluster
     *         snapshot.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * Provides the version of the database engine for this DB cluster
     * snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion Provides the version of the database engine for this DB cluster
     *         snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * Provides the license model information for this DB cluster snapshot.
     *
     * @return Provides the license model information for this DB cluster snapshot.
     */
    public String getLicenseModel() {
        return licenseModel;
    }
    
    /**
     * Provides the license model information for this DB cluster snapshot.
     *
     * @param licenseModel Provides the license model information for this DB cluster snapshot.
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }
    
    /**
     * Provides the license model information for this DB cluster snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseModel Provides the license model information for this DB cluster snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * Provides the type of the DB cluster snapshot.
     *
     * @return Provides the type of the DB cluster snapshot.
     */
    public String getSnapshotType() {
        return snapshotType;
    }
    
    /**
     * Provides the type of the DB cluster snapshot.
     *
     * @param snapshotType Provides the type of the DB cluster snapshot.
     */
    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }
    
    /**
     * Provides the type of the DB cluster snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotType Provides the type of the DB cluster snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * Specifies the percentage of the estimated data that has been
     * transferred.
     *
     * @return Specifies the percentage of the estimated data that has been
     *         transferred.
     */
    public Integer getPercentProgress() {
        return percentProgress;
    }
    
    /**
     * Specifies the percentage of the estimated data that has been
     * transferred.
     *
     * @param percentProgress Specifies the percentage of the estimated data that has been
     *         transferred.
     */
    public void setPercentProgress(Integer percentProgress) {
        this.percentProgress = percentProgress;
    }
    
    /**
     * Specifies the percentage of the estimated data that has been
     * transferred.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param percentProgress Specifies the percentage of the estimated data that has been
     *         transferred.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withPercentProgress(Integer percentProgress) {
        this.percentProgress = percentProgress;
        return this;
    }

    /**
     * Specifies whether the DB cluster snapshot is encrypted.
     *
     * @return Specifies whether the DB cluster snapshot is encrypted.
     */
    public Boolean isStorageEncrypted() {
        return storageEncrypted;
    }
    
    /**
     * Specifies whether the DB cluster snapshot is encrypted.
     *
     * @param storageEncrypted Specifies whether the DB cluster snapshot is encrypted.
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }
    
    /**
     * Specifies whether the DB cluster snapshot is encrypted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param storageEncrypted Specifies whether the DB cluster snapshot is encrypted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * Specifies whether the DB cluster snapshot is encrypted.
     *
     * @return Specifies whether the DB cluster snapshot is encrypted.
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * If <code>StorageEncrypted</code> is true, the KMS key identifier for
     * the encrypted DB cluster snapshot.
     *
     * @return If <code>StorageEncrypted</code> is true, the KMS key identifier for
     *         the encrypted DB cluster snapshot.
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }
    
    /**
     * If <code>StorageEncrypted</code> is true, the KMS key identifier for
     * the encrypted DB cluster snapshot.
     *
     * @param kmsKeyId If <code>StorageEncrypted</code> is true, the KMS key identifier for
     *         the encrypted DB cluster snapshot.
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }
    
    /**
     * If <code>StorageEncrypted</code> is true, the KMS key identifier for
     * the encrypted DB cluster snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kmsKeyId If <code>StorageEncrypted</code> is true, the KMS key identifier for
     *         the encrypted DB cluster snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DBClusterSnapshot withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
        if (getAvailabilityZones() != null) sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getDBClusterSnapshotIdentifier() != null) sb.append("DBClusterSnapshotIdentifier: " + getDBClusterSnapshotIdentifier() + ",");
        if (getDBClusterIdentifier() != null) sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getSnapshotCreateTime() != null) sb.append("SnapshotCreateTime: " + getSnapshotCreateTime() + ",");
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getAllocatedStorage() != null) sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getClusterCreateTime() != null) sb.append("ClusterCreateTime: " + getClusterCreateTime() + ",");
        if (getMasterUsername() != null) sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getLicenseModel() != null) sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getSnapshotType() != null) sb.append("SnapshotType: " + getSnapshotType() + ",");
        if (getPercentProgress() != null) sb.append("PercentProgress: " + getPercentProgress() + ",");
        if (isStorageEncrypted() != null) sb.append("StorageEncrypted: " + isStorageEncrypted() + ",");
        if (getKmsKeyId() != null) sb.append("KmsKeyId: " + getKmsKeyId() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isStorageEncrypted() == null) ? 0 : isStorageEncrypted().hashCode()); 
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DBClusterSnapshot == false) return false;
        DBClusterSnapshot other = (DBClusterSnapshot)obj;
        
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        if (other.getDBClusterSnapshotIdentifier() == null ^ this.getDBClusterSnapshotIdentifier() == null) return false;
        if (other.getDBClusterSnapshotIdentifier() != null && other.getDBClusterSnapshotIdentifier().equals(this.getDBClusterSnapshotIdentifier()) == false) return false; 
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null) return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false) return false; 
        if (other.getSnapshotCreateTime() == null ^ this.getSnapshotCreateTime() == null) return false;
        if (other.getSnapshotCreateTime() != null && other.getSnapshotCreateTime().equals(this.getSnapshotCreateTime()) == false) return false; 
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null) return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null) return false;
        if (other.getClusterCreateTime() != null && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false) return false; 
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null) return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null) return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false) return false; 
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null) return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false) return false; 
        if (other.getPercentProgress() == null ^ this.getPercentProgress() == null) return false;
        if (other.getPercentProgress() != null && other.getPercentProgress().equals(this.getPercentProgress()) == false) return false; 
        if (other.isStorageEncrypted() == null ^ this.isStorageEncrypted() == null) return false;
        if (other.isStorageEncrypted() != null && other.isStorageEncrypted().equals(this.isStorageEncrypted()) == false) return false; 
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null) return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false) return false; 
        return true;
    }
    
    @Override
    public DBClusterSnapshot clone() {
        try {
            return (DBClusterSnapshot) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    