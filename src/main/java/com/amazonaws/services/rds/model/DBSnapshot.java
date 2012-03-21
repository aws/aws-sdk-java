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
 * <li> CreateDBSnapshot </li>
 * <li> DeleteDBSnapshot </li>
 * 
 * </ul>
 * <p>
 * This data type is used as a response element in the
 * DescribeDBSnapshots action.
 * </p>
 */
public class DBSnapshot {

    /**
     * Specifies the identifier for the DB Snapshot.
     */
    private String dBSnapshotIdentifier;

    /**
     * Specifies the the DBInstanceIdentifier of the DB Instance this DB
     * Snapshot was created from.
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
     * Specifies the status of this DB Snapshot.
     */
    private String status;

    /**
     * Specifies the port that the database engine was listening on at the
     * time of the snapshot.
     */
    private Integer port;

    /**
     * Specifies the name of the Availability Zone the DB Instance was
     * located in at the time of the DB Snapshot.
     */
    private String availabilityZone;

    /**
     * Provides the Vpc Id associated with the DB Snapshot.
     */
    private String vpcId;

    /**
     * Specifies the time (UTC) when the snapshot was taken.
     */
    private java.util.Date instanceCreateTime;

    /**
     * Provides the master username for the DB Instance.
     */
    private String masterUsername;

    /**
     * Specifies the version of the database engine.
     */
    private String engineVersion;

    /**
     * License model information for the restored DB Instance.
     */
    private String licenseModel;

    /**
     * Provides the type of the DB Snapshot.
     */
    private String snapshotType;

    /**
     * Specifies the identifier for the DB Snapshot.
     *
     * @return Specifies the identifier for the DB Snapshot.
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }
    
    /**
     * Specifies the identifier for the DB Snapshot.
     *
     * @param dBSnapshotIdentifier Specifies the identifier for the DB Snapshot.
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }
    
    /**
     * Specifies the identifier for the DB Snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshotIdentifier Specifies the identifier for the DB Snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBSnapshot withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
    }
    
    
    /**
     * Specifies the the DBInstanceIdentifier of the DB Instance this DB
     * Snapshot was created from.
     *
     * @return Specifies the the DBInstanceIdentifier of the DB Instance this DB
     *         Snapshot was created from.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * Specifies the the DBInstanceIdentifier of the DB Instance this DB
     * Snapshot was created from.
     *
     * @param dBInstanceIdentifier Specifies the the DBInstanceIdentifier of the DB Instance this DB
     *         Snapshot was created from.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * Specifies the the DBInstanceIdentifier of the DB Instance this DB
     * Snapshot was created from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier Specifies the the DBInstanceIdentifier of the DB Instance this DB
     *         Snapshot was created from.
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
     * Specifies the status of this DB Snapshot.
     *
     * @return Specifies the status of this DB Snapshot.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Specifies the status of this DB Snapshot.
     *
     * @param status Specifies the status of this DB Snapshot.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Specifies the status of this DB Snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status Specifies the status of this DB Snapshot.
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
     * Specifies the name of the Availability Zone the DB Instance was
     * located in at the time of the DB Snapshot.
     *
     * @return Specifies the name of the Availability Zone the DB Instance was
     *         located in at the time of the DB Snapshot.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * Specifies the name of the Availability Zone the DB Instance was
     * located in at the time of the DB Snapshot.
     *
     * @param availabilityZone Specifies the name of the Availability Zone the DB Instance was
     *         located in at the time of the DB Snapshot.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * Specifies the name of the Availability Zone the DB Instance was
     * located in at the time of the DB Snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone Specifies the name of the Availability Zone the DB Instance was
     *         located in at the time of the DB Snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBSnapshot withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * Provides the Vpc Id associated with the DB Snapshot.
     *
     * @return Provides the Vpc Id associated with the DB Snapshot.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * Provides the Vpc Id associated with the DB Snapshot.
     *
     * @param vpcId Provides the Vpc Id associated with the DB Snapshot.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * Provides the Vpc Id associated with the DB Snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId Provides the Vpc Id associated with the DB Snapshot.
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
     * Provides the master username for the DB Instance.
     *
     * @return Provides the master username for the DB Instance.
     */
    public String getMasterUsername() {
        return masterUsername;
    }
    
    /**
     * Provides the master username for the DB Instance.
     *
     * @param masterUsername Provides the master username for the DB Instance.
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }
    
    /**
     * Provides the master username for the DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUsername Provides the master username for the DB Instance.
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
     * License model information for the restored DB Instance.
     *
     * @return License model information for the restored DB Instance.
     */
    public String getLicenseModel() {
        return licenseModel;
    }
    
    /**
     * License model information for the restored DB Instance.
     *
     * @param licenseModel License model information for the restored DB Instance.
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }
    
    /**
     * License model information for the restored DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseModel License model information for the restored DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBSnapshot withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }
    
    
    /**
     * Provides the type of the DB Snapshot.
     *
     * @return Provides the type of the DB Snapshot.
     */
    public String getSnapshotType() {
        return snapshotType;
    }
    
    /**
     * Provides the type of the DB Snapshot.
     *
     * @param snapshotType Provides the type of the DB Snapshot.
     */
    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }
    
    /**
     * Provides the type of the DB Snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotType Provides the type of the DB Snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DBSnapshot withSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
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
        if (dBSnapshotIdentifier != null) sb.append("DBSnapshotIdentifier: " + dBSnapshotIdentifier + ", ");
        if (dBInstanceIdentifier != null) sb.append("DBInstanceIdentifier: " + dBInstanceIdentifier + ", ");
        if (snapshotCreateTime != null) sb.append("SnapshotCreateTime: " + snapshotCreateTime + ", ");
        if (engine != null) sb.append("Engine: " + engine + ", ");
        if (allocatedStorage != null) sb.append("AllocatedStorage: " + allocatedStorage + ", ");
        if (status != null) sb.append("Status: " + status + ", ");
        if (port != null) sb.append("Port: " + port + ", ");
        if (availabilityZone != null) sb.append("AvailabilityZone: " + availabilityZone + ", ");
        if (vpcId != null) sb.append("VpcId: " + vpcId + ", ");
        if (instanceCreateTime != null) sb.append("InstanceCreateTime: " + instanceCreateTime + ", ");
        if (masterUsername != null) sb.append("MasterUsername: " + masterUsername + ", ");
        if (engineVersion != null) sb.append("EngineVersion: " + engineVersion + ", ");
        if (licenseModel != null) sb.append("LicenseModel: " + licenseModel + ", ");
        if (snapshotType != null) sb.append("SnapshotType: " + snapshotType + ", ");
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
        return true;
    }
    
}
    