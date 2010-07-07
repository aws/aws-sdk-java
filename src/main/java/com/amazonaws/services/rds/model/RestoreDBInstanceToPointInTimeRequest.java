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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#restoreDBInstanceToPointInTime(RestoreDBInstanceToPointInTimeRequest) RestoreDBInstanceToPointInTime operation}.
 * <p>
 * This API creates a new RDS instance from a point-in-time system
 * snapshot. The target database is created from the source database
 * restore point with the same configuration as the original source
 * database, except that the new RDS instance is created with the default
 * security group.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#restoreDBInstanceToPointInTime(RestoreDBInstanceToPointInTimeRequest)
 */
public class RestoreDBInstanceToPointInTimeRequest extends AmazonWebServiceRequest {

    /**
     * The identifier of the source DB Instance from which to restore.
     */
    private String sourceDBInstanceIdentifier;

    /**
     * The name of the new database instance to be created.
     */
    private String targetDBInstanceIdentifier;

    /**
     * The date and time from to restore from.
     */
    private java.util.Date restoreTime;

    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) the DB Instance
     * is restored from the latest backup time.
     */
    private Boolean useLatestRestorableTime;

    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     */
    private String dBInstanceClass;

    /**
     * The port number on which the database accepts connections.
     */
    private Integer port;

    /**
     * The EC2 Availability Zone that the database instance will be created
     * in.
     */
    private String availabilityZone;

    private Boolean multiAZ;

    /**
     * The identifier of the source DB Instance from which to restore.
     *
     * @return The identifier of the source DB Instance from which to restore.
     */
    public String getSourceDBInstanceIdentifier() {
        return sourceDBInstanceIdentifier;
    }
    
    /**
     * The identifier of the source DB Instance from which to restore.
     *
     * @param sourceDBInstanceIdentifier The identifier of the source DB Instance from which to restore.
     */
    public void setSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
    }
    
    /**
     * The identifier of the source DB Instance from which to restore.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDBInstanceIdentifier The identifier of the source DB Instance from which to restore.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
        return this;
    }
    
    
    /**
     * The name of the new database instance to be created.
     *
     * @return The name of the new database instance to be created.
     */
    public String getTargetDBInstanceIdentifier() {
        return targetDBInstanceIdentifier;
    }
    
    /**
     * The name of the new database instance to be created.
     *
     * @param targetDBInstanceIdentifier The name of the new database instance to be created.
     */
    public void setTargetDBInstanceIdentifier(String targetDBInstanceIdentifier) {
        this.targetDBInstanceIdentifier = targetDBInstanceIdentifier;
    }
    
    /**
     * The name of the new database instance to be created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetDBInstanceIdentifier The name of the new database instance to be created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withTargetDBInstanceIdentifier(String targetDBInstanceIdentifier) {
        this.targetDBInstanceIdentifier = targetDBInstanceIdentifier;
        return this;
    }
    
    
    /**
     * The date and time from to restore from.
     *
     * @return The date and time from to restore from.
     */
    public java.util.Date getRestoreTime() {
        return restoreTime;
    }
    
    /**
     * The date and time from to restore from.
     *
     * @param restoreTime The date and time from to restore from.
     */
    public void setRestoreTime(java.util.Date restoreTime) {
        this.restoreTime = restoreTime;
    }
    
    /**
     * The date and time from to restore from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param restoreTime The date and time from to restore from.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withRestoreTime(java.util.Date restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    
    
    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) the DB Instance
     * is restored from the latest backup time.
     *
     * @return Specifies whether (<i>true</i>) or not (<i>false</i>) the DB Instance
     *         is restored from the latest backup time.
     */
    public Boolean isUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }
    
    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) the DB Instance
     * is restored from the latest backup time.
     *
     * @param useLatestRestorableTime Specifies whether (<i>true</i>) or not (<i>false</i>) the DB Instance
     *         is restored from the latest backup time.
     */
    public void setUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
    }
    
    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) the DB Instance
     * is restored from the latest backup time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param useLatestRestorableTime Specifies whether (<i>true</i>) or not (<i>false</i>) the DB Instance
     *         is restored from the latest backup time.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
        return this;
    }
    
    
    /**
     * Specifies whether (<i>true</i>) or not (<i>false</i>) the DB Instance
     * is restored from the latest backup time.
     *
     * @return Specifies whether (<i>true</i>) or not (<i>false</i>) the DB Instance
     *         is restored from the latest backup time.
     */
    public Boolean getUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }
    
    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     *
     * @return The compute and memory capacity of the Amazon RDS DB instance.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     *
     * @param dBInstanceClass The compute and memory capacity of the Amazon RDS DB instance.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The compute and memory capacity of the Amazon RDS DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }
    
    
    /**
     * The port number on which the database accepts connections.
     *
     * @return The port number on which the database accepts connections.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which the database accepts connections.
     *
     * @param port The port number on which the database accepts connections.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which the database accepts connections.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which the database accepts connections.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withPort(Integer port) {
        this.port = port;
        return this;
    }
    
    
    /**
     * The EC2 Availability Zone that the database instance will be created
     * in.
     *
     * @return The EC2 Availability Zone that the database instance will be created
     *         in.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The EC2 Availability Zone that the database instance will be created
     * in.
     *
     * @param availabilityZone The EC2 Availability Zone that the database instance will be created
     *         in.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The EC2 Availability Zone that the database instance will be created
     * in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The EC2 Availability Zone that the database instance will be created
     *         in.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * Returns the value of the MultiAZ property for this object.
     *
     * @return The value of the MultiAZ property for this object.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Sets the value of the MultiAZ property for this object.
     *
     * @param multiAZ The new value for the MultiAZ property for this object.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Sets the value of the MultiAZ property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ The new value for the MultiAZ property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }
    
    
    /**
     * Returns the value of the MultiAZ property for this object.
     *
     * @return The value of the MultiAZ property for this object.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
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
        sb.append("SourceDBInstanceIdentifier: " + sourceDBInstanceIdentifier + ", ");
        sb.append("TargetDBInstanceIdentifier: " + targetDBInstanceIdentifier + ", ");
        sb.append("RestoreTime: " + restoreTime + ", ");
        sb.append("UseLatestRestorableTime: " + useLatestRestorableTime + ", ");
        sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        sb.append("Port: " + port + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("MultiAZ: " + multiAZ + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    