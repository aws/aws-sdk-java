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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#restoreDBInstanceFromDBSnapshot(RestoreDBInstanceFromDBSnapshotRequest) RestoreDBInstanceFromDBSnapshot operation}.
 * <p>
 * This API creates a new DB Instance to an arbitrary point-in-time.
 * Users can restore to any point in time before the latestRestorableTime
 * for up to backupRetentionPeriod days. The target database is created
 * from the source database with the same configuration as the original
 * database except that the DB instance is created with the default DB
 * security group.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#restoreDBInstanceFromDBSnapshot(RestoreDBInstanceFromDBSnapshotRequest)
 */
public class RestoreDBInstanceFromDBSnapshotRequest extends AmazonWebServiceRequest {

    /**
     * The identifier for the DB Snapshot to restore from.
     */
    private String dBInstanceIdentifier;

    /**
     * Name of the DB Instance to create from the DB Snapshot. This parameter
     * isn't case sensitive.
     */
    private String dBSnapshotIdentifier;

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
     * The identifier for the DB Snapshot to restore from.
     *
     * @return The identifier for the DB Snapshot to restore from.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The identifier for the DB Snapshot to restore from.
     *
     * @param dBInstanceIdentifier The identifier for the DB Snapshot to restore from.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The identifier for the DB Snapshot to restore from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The identifier for the DB Snapshot to restore from.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceFromDBSnapshotRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }
    
    
    /**
     * Name of the DB Instance to create from the DB Snapshot. This parameter
     * isn't case sensitive.
     *
     * @return Name of the DB Instance to create from the DB Snapshot. This parameter
     *         isn't case sensitive.
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }
    
    /**
     * Name of the DB Instance to create from the DB Snapshot. This parameter
     * isn't case sensitive.
     *
     * @param dBSnapshotIdentifier Name of the DB Instance to create from the DB Snapshot. This parameter
     *         isn't case sensitive.
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }
    
    /**
     * Name of the DB Instance to create from the DB Snapshot. This parameter
     * isn't case sensitive.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshotIdentifier Name of the DB Instance to create from the DB Snapshot. This parameter
     *         isn't case sensitive.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceFromDBSnapshotRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
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
    public RestoreDBInstanceFromDBSnapshotRequest withDBInstanceClass(String dBInstanceClass) {
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
    public RestoreDBInstanceFromDBSnapshotRequest withPort(Integer port) {
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
    public RestoreDBInstanceFromDBSnapshotRequest withAvailabilityZone(String availabilityZone) {
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
    public RestoreDBInstanceFromDBSnapshotRequest withMultiAZ(Boolean multiAZ) {
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
        sb.append("DBInstanceIdentifier: " + dBInstanceIdentifier + ", ");
        sb.append("DBSnapshotIdentifier: " + dBSnapshotIdentifier + ", ");
        sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        sb.append("Port: " + port + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("MultiAZ: " + multiAZ + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    