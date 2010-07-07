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
     * Specifies the time (UTC) when the snapshot was taken.
     */
    private java.util.Date instanceCreateTime;

    /**
     * Provides the master username for the DB Instance.
     */
    private String masterUsername;

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
        sb.append("DBSnapshotIdentifier: " + dBSnapshotIdentifier + ", ");
        sb.append("DBInstanceIdentifier: " + dBInstanceIdentifier + ", ");
        sb.append("SnapshotCreateTime: " + snapshotCreateTime + ", ");
        sb.append("Engine: " + engine + ", ");
        sb.append("AllocatedStorage: " + allocatedStorage + ", ");
        sb.append("Status: " + status + ", ");
        sb.append("Port: " + port + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("InstanceCreateTime: " + instanceCreateTime + ", ");
        sb.append("MasterUsername: " + masterUsername + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    