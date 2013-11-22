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
 * <li> CreateDBSnapshot </li>
 * <li> DeleteDBSnapshot </li>
 * 
 * </ul>
 * <p>
 * This data type is used as a response element in the DescribeDBSnapshots action.
 * </p>
 */
public class DBSnapshot implements Serializable {

    /**
     * Specifies the identifier for the DB snapshot.
     */
    private String dBSnapshotIdentifier;

    /**
     * Specifies the DB instance identifier of the DB instance this DB
     * snapshot was created from.
     */
    private String dBInstanceIdentifier;

    /**
     * Provides the time (UTC) when the snapshot was taken.
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
     * Specifies the status of this DB snapshot.
     */
    private String status;

    /**
     * Specifies the port that the database engine was listening on at the
     * time of the snapshot.
     */
    private Integer port;

    /**
     * Specifies the name of the Availability Zone the DB instance was
     * located in at the time of the DB snapshot.
     */
    private String availabilityZone;

    /**
     * Provides the Vpc Id associated with the DB snapshot.
     */
    private String vpcId;

    /**
     * Specifies the time (UTC) when the snapshot was taken.
     */
    private java.util.Date instanceCreateTime;

    /**
     * Provides the master username for the DB snapshot.
     */
    private String masterUsername;

    /**
     * Specifies the version of the database engine.
     */
    private String engineVersion;

    /**
     * License model information for the restored DB instance.
     */
    private String licenseModel;

    /**
     * Provides the type of the DB snapshot.
     */
    private String snapshotType;

    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value of
     * the DB instance at the time of the snapshot.
     */
    private Integer iops;

    /**
     * Provides the option group name for the DB snapshot.
     */
    private String optionGroupName;

    /**
     * The percentage of the estimated data that has been transferred.
     */
    private Integer percentProgress;

    /**
     * The region that the DB snapshot was created in or copied from.
     */
    private String sourceRegion;

    /**
     * Specifies the identifier for the DB snapshot.
     *
     * @return Specifies the identifier for the DB snapshot.
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }
    
    /**
     * Specifies the identifier for the DB snapshot.
     *
     * @param dBSnapshotIdentifier Specifies the identifier for the DB snapshot.
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }
    
    /**
     * Specifies the identifier for the DB snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshotIdentifier Specifies the identifier for the DB snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
    }

    /**
     * Specifies the DB instance identifier of the DB instance this DB
     * snapshot was created from.
     *
     * @return Specifies the DB instance identifier of the DB instance this DB
     *         snapshot was created from.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * Specifies the DB instance identifier of the DB instance this DB
     * snapshot was created from.
     *
     * @param dBInstanceIdentifier Specifies the DB instance identifier of the DB instance this DB
     *         snapshot was created from.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * Specifies the DB instance identifier of the DB instance this DB
     * snapshot was created from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier Specifies the DB instance identifier of the DB instance this DB
     *         snapshot was created from.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * Provides the time (UTC) when the snapshot was taken.
     *
     * @return Provides the time (UTC) when the snapshot was taken.
     */
    public java.util.Date getSnapshotCreateTime() {
        return snapshotCreateTime;
    }
    
    /**
     * Provides the time (UTC) when the snapshot was taken.
     *
     * @param snapshotCreateTime Provides the time (UTC) when the snapshot was taken.
     */
    public void setSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }
    
    /**
     * Provides the time (UTC) when the snapshot was taken.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotCreateTime Provides the time (UTC) when the snapshot was taken.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withSnapshotCreateTime(java.util.Date snapshotCreateTime) {
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
    public DBSnapshot withEngine(String engine) {
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
    public DBSnapshot withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * Specifies the status of this DB snapshot.
     *
     * @return Specifies the status of this DB snapshot.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Specifies the status of this DB snapshot.
     *
     * @param status Specifies the status of this DB snapshot.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Specifies the status of this DB snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status Specifies the status of this DB snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Specifies the port that the database engine was listening on at the
     * time of the snapshot.
     *
     * @return Specifies the port that the database engine was listening on at the
     *         time of the snapshot.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * Specifies the port that the database engine was listening on at the
     * time of the snapshot.
     *
     * @param port Specifies the port that the database engine was listening on at the
     *         time of the snapshot.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * Specifies the port that the database engine was listening on at the
     * time of the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port Specifies the port that the database engine was listening on at the
     *         time of the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Specifies the name of the Availability Zone the DB instance was
     * located in at the time of the DB snapshot.
     *
     * @return Specifies the name of the Availability Zone the DB instance was
     *         located in at the time of the DB snapshot.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * Specifies the name of the Availability Zone the DB instance was
     * located in at the time of the DB snapshot.
     *
     * @param availabilityZone Specifies the name of the Availability Zone the DB instance was
     *         located in at the time of the DB snapshot.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * Specifies the name of the Availability Zone the DB instance was
     * located in at the time of the DB snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone Specifies the name of the Availability Zone the DB instance was
     *         located in at the time of the DB snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * Provides the Vpc Id associated with the DB snapshot.
     *
     * @return Provides the Vpc Id associated with the DB snapshot.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * Provides the Vpc Id associated with the DB snapshot.
     *
     * @param vpcId Provides the Vpc Id associated with the DB snapshot.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * Provides the Vpc Id associated with the DB snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId Provides the Vpc Id associated with the DB snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * Specifies the time (UTC) when the snapshot was taken.
     *
     * @return Specifies the time (UTC) when the snapshot was taken.
     */
    public java.util.Date getInstanceCreateTime() {
        return instanceCreateTime;
    }
    
    /**
     * Specifies the time (UTC) when the snapshot was taken.
     *
     * @param instanceCreateTime Specifies the time (UTC) when the snapshot was taken.
     */
    public void setInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }
    
    /**
     * Specifies the time (UTC) when the snapshot was taken.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCreateTime Specifies the time (UTC) when the snapshot was taken.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
        return this;
    }

    /**
     * Provides the master username for the DB snapshot.
     *
     * @return Provides the master username for the DB snapshot.
     */
    public String getMasterUsername() {
        return masterUsername;
    }
    
    /**
     * Provides the master username for the DB snapshot.
     *
     * @param masterUsername Provides the master username for the DB snapshot.
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }
    
    /**
     * Provides the master username for the DB snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUsername Provides the master username for the DB snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * Specifies the version of the database engine.
     *
     * @return Specifies the version of the database engine.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * Specifies the version of the database engine.
     *
     * @param engineVersion Specifies the version of the database engine.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * Specifies the version of the database engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion Specifies the version of the database engine.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * License model information for the restored DB instance.
     *
     * @return License model information for the restored DB instance.
     */
    public String getLicenseModel() {
        return licenseModel;
    }
    
    /**
     * License model information for the restored DB instance.
     *
     * @param licenseModel License model information for the restored DB instance.
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }
    
    /**
     * License model information for the restored DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseModel License model information for the restored DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * Provides the type of the DB snapshot.
     *
     * @return Provides the type of the DB snapshot.
     */
    public String getSnapshotType() {
        return snapshotType;
    }
    
    /**
     * Provides the type of the DB snapshot.
     *
     * @param snapshotType Provides the type of the DB snapshot.
     */
    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }
    
    /**
     * Provides the type of the DB snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotType Provides the type of the DB snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value of
     * the DB instance at the time of the snapshot.
     *
     * @return Specifies the Provisioned IOPS (I/O operations per second) value of
     *         the DB instance at the time of the snapshot.
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value of
     * the DB instance at the time of the snapshot.
     *
     * @param iops Specifies the Provisioned IOPS (I/O operations per second) value of
     *         the DB instance at the time of the snapshot.
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * Specifies the Provisioned IOPS (I/O operations per second) value of
     * the DB instance at the time of the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iops Specifies the Provisioned IOPS (I/O operations per second) value of
     *         the DB instance at the time of the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * Provides the option group name for the DB snapshot.
     *
     * @return Provides the option group name for the DB snapshot.
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * Provides the option group name for the DB snapshot.
     *
     * @param optionGroupName Provides the option group name for the DB snapshot.
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * Provides the option group name for the DB snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName Provides the option group name for the DB snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * The percentage of the estimated data that has been transferred.
     *
     * @return The percentage of the estimated data that has been transferred.
     */
    public Integer getPercentProgress() {
        return percentProgress;
    }
    
    /**
     * The percentage of the estimated data that has been transferred.
     *
     * @param percentProgress The percentage of the estimated data that has been transferred.
     */
    public void setPercentProgress(Integer percentProgress) {
        this.percentProgress = percentProgress;
    }
    
    /**
     * The percentage of the estimated data that has been transferred.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param percentProgress The percentage of the estimated data that has been transferred.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withPercentProgress(Integer percentProgress) {
        this.percentProgress = percentProgress;
        return this;
    }

    /**
     * The region that the DB snapshot was created in or copied from.
     *
     * @return The region that the DB snapshot was created in or copied from.
     */
    public String getSourceRegion() {
        return sourceRegion;
    }
    
    /**
     * The region that the DB snapshot was created in or copied from.
     *
     * @param sourceRegion The region that the DB snapshot was created in or copied from.
     */
    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }
    
    /**
     * The region that the DB snapshot was created in or copied from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceRegion The region that the DB snapshot was created in or copied from.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DBSnapshot withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
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
        if (getDBSnapshotIdentifier() != null) sb.append("DBSnapshotIdentifier: " + getDBSnapshotIdentifier() + ",");
        if (getDBInstanceIdentifier() != null) sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getSnapshotCreateTime() != null) sb.append("SnapshotCreateTime: " + getSnapshotCreateTime() + ",");
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getAllocatedStorage() != null) sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getInstanceCreateTime() != null) sb.append("InstanceCreateTime: " + getInstanceCreateTime() + ",");
        if (getMasterUsername() != null) sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getLicenseModel() != null) sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getSnapshotType() != null) sb.append("SnapshotType: " + getSnapshotType() + ",");
        if (getIops() != null) sb.append("Iops: " + getIops() + ",");
        if (getOptionGroupName() != null) sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getPercentProgress() != null) sb.append("PercentProgress: " + getPercentProgress() + ",");
        if (getSourceRegion() != null) sb.append("SourceRegion: " + getSourceRegion() );
        sb.append("}");
        return sb.toString();
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DBSnapshot == false) return false;
        DBSnapshot other = (DBSnapshot)obj;
        
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null) return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false) return false; 
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
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
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getInstanceCreateTime() == null ^ this.getInstanceCreateTime() == null) return false;
        if (other.getInstanceCreateTime() != null && other.getInstanceCreateTime().equals(this.getInstanceCreateTime()) == false) return false; 
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null) return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null) return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false) return false; 
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null) return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false) return false; 
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        if (other.getPercentProgress() == null ^ this.getPercentProgress() == null) return false;
        if (other.getPercentProgress() != null && other.getPercentProgress().equals(this.getPercentProgress()) == false) return false; 
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null) return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false) return false; 
        return true;
    }
    
}
    