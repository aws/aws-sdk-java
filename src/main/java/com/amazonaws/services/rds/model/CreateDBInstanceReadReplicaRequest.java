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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBInstanceReadReplica(CreateDBInstanceReadReplicaRequest) CreateDBInstanceReadReplica operation}.
 * <p>
 * Creates a DB Instance that acts as a Read Replica of a source DB Instance.
 * </p>
 * <p>
 * All Read Replica DB Instances are created as Single-AZ deployments with backups disabled. All other DB Instance attributes (including DB Security
 * Groups and DB Parameter Groups) are inherited from the source DB Instance, except as specified below.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> The source DB Instance must have backup retention enabled.
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
     * <p>Constraints: Must be the identifier of an existing DB Instance that
     * is not already a Read Replica DB Instance.
     */
    private String sourceDBInstanceIdentifier;

    /**
     * The compute and memory capacity of the Read Replica. <p> Valid Values:
     * <code>db.m1.small | db.m1.large | db.m1.xlarge | db.m2.xlarge
     * |db.m2.2xlarge | db.m2.4xlarge</code> <p>Default: Inherits from the
     * source DB Instance.
     */
    private String dBInstanceClass;

    /**
     * The Amazon EC2 Availability Zone that the Read Replica will be created
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code>
     */
    private String availabilityZone;

    /**
     * The port number that the DB Instance uses for connections. <p>Default:
     * Inherits from the source DB Instance <p>Valid Values:
     * <code>1150-65535</code>
     */
    private Integer port;

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Read Replica during the maintenance window. <p>Default: Inherits
     * from the source DB Instance
     */
    private Boolean autoMinorVersionUpgrade;

    private String optionGroupName;

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
     * have up to five Read Replicas. <p>Constraints: Must be the identifier
     * of an existing DB Instance that is not already a Read Replica DB
     * Instance.
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
     * <p>Constraints: Must be the identifier of an existing DB Instance that
     * is not already a Read Replica DB Instance.
     *
     * @return The identifier of the DB Instance that will act as the source for the
     *         Read Replica. Each DB Instance can have up to five Read Replicas.
     *         <p>Constraints: Must be the identifier of an existing DB Instance that
     *         is not already a Read Replica DB Instance.
     */
    public String getSourceDBInstanceIdentifier() {
        return sourceDBInstanceIdentifier;
    }
    
    /**
     * The identifier of the DB Instance that will act as the source for the
     * Read Replica. Each DB Instance can have up to five Read Replicas.
     * <p>Constraints: Must be the identifier of an existing DB Instance that
     * is not already a Read Replica DB Instance.
     *
     * @param sourceDBInstanceIdentifier The identifier of the DB Instance that will act as the source for the
     *         Read Replica. Each DB Instance can have up to five Read Replicas.
     *         <p>Constraints: Must be the identifier of an existing DB Instance that
     *         is not already a Read Replica DB Instance.
     */
    public void setSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
    }
    
    /**
     * The identifier of the DB Instance that will act as the source for the
     * Read Replica. Each DB Instance can have up to five Read Replicas.
     * <p>Constraints: Must be the identifier of an existing DB Instance that
     * is not already a Read Replica DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDBInstanceIdentifier The identifier of the DB Instance that will act as the source for the
     *         Read Replica. Each DB Instance can have up to five Read Replicas.
     *         <p>Constraints: Must be the identifier of an existing DB Instance that
     *         is not already a Read Replica DB Instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceReadReplicaRequest withSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
        return this;
    }
    
    
    /**
     * The compute and memory capacity of the Read Replica. <p> Valid Values:
     * <code>db.m1.small | db.m1.large | db.m1.xlarge | db.m2.xlarge
     * |db.m2.2xlarge | db.m2.4xlarge</code> <p>Default: Inherits from the
     * source DB Instance.
     *
     * @return The compute and memory capacity of the Read Replica. <p> Valid Values:
     *         <code>db.m1.small | db.m1.large | db.m1.xlarge | db.m2.xlarge
     *         |db.m2.2xlarge | db.m2.4xlarge</code> <p>Default: Inherits from the
     *         source DB Instance.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the Read Replica. <p> Valid Values:
     * <code>db.m1.small | db.m1.large | db.m1.xlarge | db.m2.xlarge
     * |db.m2.2xlarge | db.m2.4xlarge</code> <p>Default: Inherits from the
     * source DB Instance.
     *
     * @param dBInstanceClass The compute and memory capacity of the Read Replica. <p> Valid Values:
     *         <code>db.m1.small | db.m1.large | db.m1.xlarge | db.m2.xlarge
     *         |db.m2.2xlarge | db.m2.4xlarge</code> <p>Default: Inherits from the
     *         source DB Instance.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the Read Replica. <p> Valid Values:
     * <code>db.m1.small | db.m1.large | db.m1.xlarge | db.m2.xlarge
     * |db.m2.2xlarge | db.m2.4xlarge</code> <p>Default: Inherits from the
     * source DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The compute and memory capacity of the Read Replica. <p> Valid Values:
     *         <code>db.m1.small | db.m1.large | db.m1.xlarge | db.m2.xlarge
     *         |db.m2.2xlarge | db.m2.4xlarge</code> <p>Default: Inherits from the
     *         source DB Instance.
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
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code>
     *
     * @return The Amazon EC2 Availability Zone that the Read Replica will be created
     *         in. <p> Default: A random, system-chosen Availability Zone in the
     *         endpoint's region. <p> Example: <code>us-east-1d</code>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Amazon EC2 Availability Zone that the Read Replica will be created
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code>
     *
     * @param availabilityZone The Amazon EC2 Availability Zone that the Read Replica will be created
     *         in. <p> Default: A random, system-chosen Availability Zone in the
     *         endpoint's region. <p> Example: <code>us-east-1d</code>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Amazon EC2 Availability Zone that the Read Replica will be created
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Amazon EC2 Availability Zone that the Read Replica will be created
     *         in. <p> Default: A random, system-chosen Availability Zone in the
     *         endpoint's region. <p> Example: <code>us-east-1d</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceReadReplicaRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * The port number that the DB Instance uses for connections. <p>Default:
     * Inherits from the source DB Instance <p>Valid Values:
     * <code>1150-65535</code>
     *
     * @return The port number that the DB Instance uses for connections. <p>Default:
     *         Inherits from the source DB Instance <p>Valid Values:
     *         <code>1150-65535</code>
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number that the DB Instance uses for connections. <p>Default:
     * Inherits from the source DB Instance <p>Valid Values:
     * <code>1150-65535</code>
     *
     * @param port The port number that the DB Instance uses for connections. <p>Default:
     *         Inherits from the source DB Instance <p>Valid Values:
     *         <code>1150-65535</code>
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number that the DB Instance uses for connections. <p>Default:
     * Inherits from the source DB Instance <p>Valid Values:
     * <code>1150-65535</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number that the DB Instance uses for connections. <p>Default:
     *         Inherits from the source DB Instance <p>Valid Values:
     *         <code>1150-65535</code>
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
     * the Read Replica during the maintenance window. <p>Default: Inherits
     * from the source DB Instance
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
     *         the Read Replica during the maintenance window. <p>Default: Inherits
     *         from the source DB Instance
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Read Replica during the maintenance window. <p>Default: Inherits
     * from the source DB Instance
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the Read Replica during the maintenance window. <p>Default: Inherits
     *         from the source DB Instance
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Read Replica during the maintenance window. <p>Default: Inherits
     * from the source DB Instance
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the Read Replica during the maintenance window. <p>Default: Inherits
     *         from the source DB Instance
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
     * the Read Replica during the maintenance window. <p>Default: Inherits
     * from the source DB Instance
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
     *         the Read Replica during the maintenance window. <p>Default: Inherits
     *         from the source DB Instance
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Returns the value of the OptionGroupName property for this object.
     *
     * @return The value of the OptionGroupName property for this object.
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * Sets the value of the OptionGroupName property for this object.
     *
     * @param optionGroupName The new value for the OptionGroupName property for this object.
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * Sets the value of the OptionGroupName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName The new value for the OptionGroupName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateDBInstanceReadReplicaRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
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
        if (sourceDBInstanceIdentifier != null) sb.append("SourceDBInstanceIdentifier: " + sourceDBInstanceIdentifier + ", ");
        if (dBInstanceClass != null) sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        if (availabilityZone != null) sb.append("AvailabilityZone: " + availabilityZone + ", ");
        if (port != null) sb.append("Port: " + port + ", ");
        if (autoMinorVersionUpgrade != null) sb.append("AutoMinorVersionUpgrade: " + autoMinorVersionUpgrade + ", ");
        if (optionGroupName != null) sb.append("OptionGroupName: " + optionGroupName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSourceDBInstanceIdentifier() == null) ? 0 : getSourceDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CreateDBInstanceReadReplicaRequest == false) return false;
        CreateDBInstanceReadReplicaRequest other = (CreateDBInstanceReadReplicaRequest)obj;
        
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.getSourceDBInstanceIdentifier() == null ^ this.getSourceDBInstanceIdentifier() == null) return false;
        if (other.getSourceDBInstanceIdentifier() != null && other.getSourceDBInstanceIdentifier().equals(this.getSourceDBInstanceIdentifier()) == false) return false; 
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null) return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        return true;
    }
    
}
    