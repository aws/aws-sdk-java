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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBInstanceReadReplica(CreateDBInstanceReadReplicaRequest) CreateDBInstanceReadReplica operation}.
 * <p>
 * Creates a DB Instance that acts as a Read Replica of a source DB
 * Instance.
 * </p>
 * <p>
 * All Read Replica DB Instances are created as Single-AZ deployments
 * with backups disabled. All other DB Instance attributes (including DB
 * Security Groups and DB Parameter Groups) are inherited from the source
 * DB Instance, except as specified below.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> The source DB Instance must have backup retention
 * enabled.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBInstanceReadReplica(CreateDBInstanceReadReplicaRequest)
 */
public class CreateDBInstanceReadReplicaRequest extends AmazonWebServiceRequest {

    /**
     * The DB Instance identifier of the Read Replica. This is the unique key
     * that identifies a DB Instance. This parameter is stored as a lowercase
     * string.
     */
    private String dBInstanceIdentifier;

    /**
     * The identifier of the DB Instance that will act as the source for the
     * Read Replica. Each DB Instance can have up to five Read Replicas.
     */
    private String sourceDBInstanceIdentifier;

    /**
     * The compute and memory capacity of the Read Replica.
     */
    private String dBInstanceClass;

    /**
     * The Amazon EC2 Availability Zone that the Read Replica will be created
     * in.
     */
    private String availabilityZone;

    /**
     * The port number that the DB Instance uses for connections.
     */
    private Integer port;

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Read Replica during the maintenance window.
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * Default constructor for a new CreateDBInstanceReadReplicaRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateDBInstanceReadReplicaRequest() {}
    
    /**
     * Constructs a new CreateDBInstanceReadReplicaRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBInstanceIdentifier The DB Instance identifier of the Read
     * Replica. This is the unique key that identifies a DB Instance. This
     * parameter is stored as a lowercase string.
     * @param sourceDBInstanceIdentifier The identifier of the DB Instance
     * that will act as the source for the Read Replica. Each DB Instance can
     * have up to five Read Replicas.
     */
    public CreateDBInstanceReadReplicaRequest(String dBInstanceIdentifier, String sourceDBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier of the Read Replica. This is the unique key
     * that identifies a DB Instance. This parameter is stored as a lowercase
     * string.
     *
     * @return The DB Instance identifier of the Read Replica. This is the unique key
     *         that identifies a DB Instance. This parameter is stored as a lowercase
     *         string.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier of the Read Replica. This is the unique key
     * that identifies a DB Instance. This parameter is stored as a lowercase
     * string.
     *
     * @param dBInstanceIdentifier The DB Instance identifier of the Read Replica. This is the unique key
     *         that identifies a DB Instance. This parameter is stored as a lowercase
     *         string.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier of the Read Replica. This is the unique key
     * that identifies a DB Instance. This parameter is stored as a lowercase
     * string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB Instance identifier of the Read Replica. This is the unique key
     *         that identifies a DB Instance. This parameter is stored as a lowercase
     *         string.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceReadReplicaRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }
    
    
    /**
     * The identifier of the DB Instance that will act as the source for the
     * Read Replica. Each DB Instance can have up to five Read Replicas.
     *
     * @return The identifier of the DB Instance that will act as the source for the
     *         Read Replica. Each DB Instance can have up to five Read Replicas.
     */
    public String getSourceDBInstanceIdentifier() {
        return sourceDBInstanceIdentifier;
    }
    
    /**
     * The identifier of the DB Instance that will act as the source for the
     * Read Replica. Each DB Instance can have up to five Read Replicas.
     *
     * @param sourceDBInstanceIdentifier The identifier of the DB Instance that will act as the source for the
     *         Read Replica. Each DB Instance can have up to five Read Replicas.
     */
    public void setSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
    }
    
    /**
     * The identifier of the DB Instance that will act as the source for the
     * Read Replica. Each DB Instance can have up to five Read Replicas.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDBInstanceIdentifier The identifier of the DB Instance that will act as the source for the
     *         Read Replica. Each DB Instance can have up to five Read Replicas.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceReadReplicaRequest withSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
        return this;
    }
    
    
    /**
     * The compute and memory capacity of the Read Replica.
     *
     * @return The compute and memory capacity of the Read Replica.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the Read Replica.
     *
     * @param dBInstanceClass The compute and memory capacity of the Read Replica.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the Read Replica.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The compute and memory capacity of the Read Replica.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceReadReplicaRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }
    
    
    /**
     * The Amazon EC2 Availability Zone that the Read Replica will be created
     * in.
     *
     * @return The Amazon EC2 Availability Zone that the Read Replica will be created
     *         in.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Amazon EC2 Availability Zone that the Read Replica will be created
     * in.
     *
     * @param availabilityZone The Amazon EC2 Availability Zone that the Read Replica will be created
     *         in.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Amazon EC2 Availability Zone that the Read Replica will be created
     * in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Amazon EC2 Availability Zone that the Read Replica will be created
     *         in.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceReadReplicaRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * The port number that the DB Instance uses for connections.
     *
     * @return The port number that the DB Instance uses for connections.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number that the DB Instance uses for connections.
     *
     * @param port The port number that the DB Instance uses for connections.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number that the DB Instance uses for connections.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number that the DB Instance uses for connections.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceReadReplicaRequest withPort(Integer port) {
        this.port = port;
        return this;
    }
    
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Read Replica during the maintenance window.
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
     *         the Read Replica during the maintenance window.
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Read Replica during the maintenance window.
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the Read Replica during the maintenance window.
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Read Replica during the maintenance window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the Read Replica during the maintenance window.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceReadReplicaRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }
    
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Read Replica during the maintenance window.
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
     *         the Read Replica during the maintenance window.
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
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
        sb.append("SourceDBInstanceIdentifier: " + sourceDBInstanceIdentifier + ", ");
        sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("Port: " + port + ", ");
        sb.append("AutoMinorVersionUpgrade: " + autoMinorVersionUpgrade + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    