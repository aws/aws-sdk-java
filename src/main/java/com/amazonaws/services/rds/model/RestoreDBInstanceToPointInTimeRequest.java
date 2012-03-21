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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#restoreDBInstanceToPointInTime(RestoreDBInstanceToPointInTimeRequest) RestoreDBInstanceToPointInTime operation}.
 * <p>
 * Restores a DB Instance to an arbitrary point-in-time. Users can
 * restore to any point in time before the latestRestorableTime for up to
 * backupRetentionPeriod days. The target database is created from the
 * source database with the same configuration as the original database
 * except that the DB instance is created with the default DB security
 * group.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#restoreDBInstanceToPointInTime(RestoreDBInstanceToPointInTimeRequest)
 */
public class RestoreDBInstanceToPointInTimeRequest extends AmazonWebServiceRequest {

    /**
     * The identifier of the source DB Instance from which to restore.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing
     * database instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     */
    private String sourceDBInstanceIdentifier;

    /**
     * The name of the new database instance to be created. <p>Constraints:
     * <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    private String targetDBInstanceIdentifier;

    /**
     * The date and time to restore from. <p>Valid Values: Value must be a
     * UTC time <p>Constraints: <ul> <li>Must be before the latest restorable
     * time for the DB Instance</li> <li>Cannot be specified if
     * UseLatestRestorableTime parameter is true</li> </ul> <p>Example:
     * <code>2009-09-07T23:45:00Z</code>
     */
    private java.util.Date restoreTime;

    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the
     * DB Instance is restored from the latest backup time. <p>Default:
     * <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     * parameter is provided.
     */
    private Boolean useLatestRestorableTime;

    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     * <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     * db.m2.2xlarge | db.m2.4xlarge</code> <p>Default: The same
     * DBInstanceClass as the original DB Instance.
     */
    private String dBInstanceClass;

    /**
     * The port number on which the database accepts connections.
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB Instance.
     */
    private Integer port;

    /**
     * The EC2 Availability Zone that the database instance will be created
     * in. <p>Default: A random, system-chosen Availability Zone.
     * <p>Constraint: You cannot specify the AvailabilityZone parameter if
     * the MultiAZ parameter is set to true. <p>Example:
     * <code>us-east-1a</code>
     */
    private String availabilityZone;

    /**
     * The DB subnet group name to use for the new instance.
     */
    private String dBSubnetGroupName;

    /**
     * Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraint:
     * You cannot specify the AvailabilityZone parameter if the MultiAZ
     * parameter is set to <code>true</code>.
     */
    private Boolean multiAZ;

    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB Instance during the maintenance window.
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * License model information for the restored DB Instance. <p> Default:
     * Same as source. <p> Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     */
    private String licenseModel;

    /**
     * The database name for the restored DB Instance. <note> <p>This
     * parameter is not used for the MySQL engine. </note>
     */
    private String dBName;

    /**
     * The database engine to use for the new instance. <p>Default: The same
     * as source <p>Constraint: Must be compatible with the engine of the
     * source <p>Example: <code>oracle-ee</code>
     */
    private String engine;

    /**
     * Default constructor for a new RestoreDBInstanceToPointInTimeRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RestoreDBInstanceToPointInTimeRequest() {}
    
    /**
     * Constructs a new RestoreDBInstanceToPointInTimeRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param sourceDBInstanceIdentifier The identifier of the source DB
     * Instance from which to restore. <p>Constraints: <ul> <li>Must be the
     * identifier of an existing database instance</li> <li>Must contain from
     * 1 to 63 alphanumeric characters or hyphens</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     * @param targetDBInstanceIdentifier The name of the new database
     * instance to be created. <p>Constraints: <ul> <li>Must contain from 1
     * to 63 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     */
    public RestoreDBInstanceToPointInTimeRequest(String sourceDBInstanceIdentifier, String targetDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
        this.targetDBInstanceIdentifier = targetDBInstanceIdentifier;
    }

    
    
    /**
     * The identifier of the source DB Instance from which to restore.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing
     * database instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     *
     * @return The identifier of the source DB Instance from which to restore.
     *         <p>Constraints: <ul> <li>Must be the identifier of an existing
     *         database instance</li> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul>
     */
    public String getSourceDBInstanceIdentifier() {
        return sourceDBInstanceIdentifier;
    }
    
    /**
     * The identifier of the source DB Instance from which to restore.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing
     * database instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     *
     * @param sourceDBInstanceIdentifier The identifier of the source DB Instance from which to restore.
     *         <p>Constraints: <ul> <li>Must be the identifier of an existing
     *         database instance</li> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul>
     */
    public void setSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
    }
    
    /**
     * The identifier of the source DB Instance from which to restore.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing
     * database instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDBInstanceIdentifier The identifier of the source DB Instance from which to restore.
     *         <p>Constraints: <ul> <li>Must be the identifier of an existing
     *         database instance</li> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
        return this;
    }
    
    
    /**
     * The name of the new database instance to be created. <p>Constraints:
     * <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @return The name of the new database instance to be created. <p>Constraints:
     *         <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     *         hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     *         with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    public String getTargetDBInstanceIdentifier() {
        return targetDBInstanceIdentifier;
    }
    
    /**
     * The name of the new database instance to be created. <p>Constraints:
     * <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @param targetDBInstanceIdentifier The name of the new database instance to be created. <p>Constraints:
     *         <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     *         hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     *         with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    public void setTargetDBInstanceIdentifier(String targetDBInstanceIdentifier) {
        this.targetDBInstanceIdentifier = targetDBInstanceIdentifier;
    }
    
    /**
     * The name of the new database instance to be created. <p>Constraints:
     * <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetDBInstanceIdentifier The name of the new database instance to be created. <p>Constraints:
     *         <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     *         hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     *         with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withTargetDBInstanceIdentifier(String targetDBInstanceIdentifier) {
        this.targetDBInstanceIdentifier = targetDBInstanceIdentifier;
        return this;
    }
    
    
    /**
     * The date and time to restore from. <p>Valid Values: Value must be a
     * UTC time <p>Constraints: <ul> <li>Must be before the latest restorable
     * time for the DB Instance</li> <li>Cannot be specified if
     * UseLatestRestorableTime parameter is true</li> </ul> <p>Example:
     * <code>2009-09-07T23:45:00Z</code>
     *
     * @return The date and time to restore from. <p>Valid Values: Value must be a
     *         UTC time <p>Constraints: <ul> <li>Must be before the latest restorable
     *         time for the DB Instance</li> <li>Cannot be specified if
     *         UseLatestRestorableTime parameter is true</li> </ul> <p>Example:
     *         <code>2009-09-07T23:45:00Z</code>
     */
    public java.util.Date getRestoreTime() {
        return restoreTime;
    }
    
    /**
     * The date and time to restore from. <p>Valid Values: Value must be a
     * UTC time <p>Constraints: <ul> <li>Must be before the latest restorable
     * time for the DB Instance</li> <li>Cannot be specified if
     * UseLatestRestorableTime parameter is true</li> </ul> <p>Example:
     * <code>2009-09-07T23:45:00Z</code>
     *
     * @param restoreTime The date and time to restore from. <p>Valid Values: Value must be a
     *         UTC time <p>Constraints: <ul> <li>Must be before the latest restorable
     *         time for the DB Instance</li> <li>Cannot be specified if
     *         UseLatestRestorableTime parameter is true</li> </ul> <p>Example:
     *         <code>2009-09-07T23:45:00Z</code>
     */
    public void setRestoreTime(java.util.Date restoreTime) {
        this.restoreTime = restoreTime;
    }
    
    /**
     * The date and time to restore from. <p>Valid Values: Value must be a
     * UTC time <p>Constraints: <ul> <li>Must be before the latest restorable
     * time for the DB Instance</li> <li>Cannot be specified if
     * UseLatestRestorableTime parameter is true</li> </ul> <p>Example:
     * <code>2009-09-07T23:45:00Z</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param restoreTime The date and time to restore from. <p>Valid Values: Value must be a
     *         UTC time <p>Constraints: <ul> <li>Must be before the latest restorable
     *         time for the DB Instance</li> <li>Cannot be specified if
     *         UseLatestRestorableTime parameter is true</li> </ul> <p>Example:
     *         <code>2009-09-07T23:45:00Z</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withRestoreTime(java.util.Date restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the
     * DB Instance is restored from the latest backup time. <p>Default:
     * <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     * parameter is provided.
     *
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>) the
     *         DB Instance is restored from the latest backup time. <p>Default:
     *         <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     *         parameter is provided.
     */
    public Boolean isUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the
     * DB Instance is restored from the latest backup time. <p>Default:
     * <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     * parameter is provided.
     *
     * @param useLatestRestorableTime Specifies whether (<code>true</code>) or not (<code>false</code>) the
     *         DB Instance is restored from the latest backup time. <p>Default:
     *         <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     *         parameter is provided.
     */
    public void setUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
    }
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the
     * DB Instance is restored from the latest backup time. <p>Default:
     * <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     * parameter is provided.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param useLatestRestorableTime Specifies whether (<code>true</code>) or not (<code>false</code>) the
     *         DB Instance is restored from the latest backup time. <p>Default:
     *         <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     *         parameter is provided.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
        return this;
    }
    
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the
     * DB Instance is restored from the latest backup time. <p>Default:
     * <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     * parameter is provided.
     *
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>) the
     *         DB Instance is restored from the latest backup time. <p>Default:
     *         <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     *         parameter is provided.
     */
    public Boolean getUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }
    
    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     * <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     * db.m2.2xlarge | db.m2.4xlarge</code> <p>Default: The same
     * DBInstanceClass as the original DB Instance.
     *
     * @return The compute and memory capacity of the Amazon RDS DB instance.
     *         <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     *         db.m2.2xlarge | db.m2.4xlarge</code> <p>Default: The same
     *         DBInstanceClass as the original DB Instance.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     * <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     * db.m2.2xlarge | db.m2.4xlarge</code> <p>Default: The same
     * DBInstanceClass as the original DB Instance.
     *
     * @param dBInstanceClass The compute and memory capacity of the Amazon RDS DB instance.
     *         <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     *         db.m2.2xlarge | db.m2.4xlarge</code> <p>Default: The same
     *         DBInstanceClass as the original DB Instance.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     * <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     * db.m2.2xlarge | db.m2.4xlarge</code> <p>Default: The same
     * DBInstanceClass as the original DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The compute and memory capacity of the Amazon RDS DB instance.
     *         <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     *         db.m2.2xlarge | db.m2.4xlarge</code> <p>Default: The same
     *         DBInstanceClass as the original DB Instance.
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
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB Instance.
     *
     * @return The port number on which the database accepts connections.
     *         <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     *         same port as the original DB Instance.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which the database accepts connections.
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB Instance.
     *
     * @param port The port number on which the database accepts connections.
     *         <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     *         same port as the original DB Instance.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which the database accepts connections.
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB Instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which the database accepts connections.
     *         <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     *         same port as the original DB Instance.
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
     * in. <p>Default: A random, system-chosen Availability Zone.
     * <p>Constraint: You cannot specify the AvailabilityZone parameter if
     * the MultiAZ parameter is set to true. <p>Example:
     * <code>us-east-1a</code>
     *
     * @return The EC2 Availability Zone that the database instance will be created
     *         in. <p>Default: A random, system-chosen Availability Zone.
     *         <p>Constraint: You cannot specify the AvailabilityZone parameter if
     *         the MultiAZ parameter is set to true. <p>Example:
     *         <code>us-east-1a</code>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The EC2 Availability Zone that the database instance will be created
     * in. <p>Default: A random, system-chosen Availability Zone.
     * <p>Constraint: You cannot specify the AvailabilityZone parameter if
     * the MultiAZ parameter is set to true. <p>Example:
     * <code>us-east-1a</code>
     *
     * @param availabilityZone The EC2 Availability Zone that the database instance will be created
     *         in. <p>Default: A random, system-chosen Availability Zone.
     *         <p>Constraint: You cannot specify the AvailabilityZone parameter if
     *         the MultiAZ parameter is set to true. <p>Example:
     *         <code>us-east-1a</code>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The EC2 Availability Zone that the database instance will be created
     * in. <p>Default: A random, system-chosen Availability Zone.
     * <p>Constraint: You cannot specify the AvailabilityZone parameter if
     * the MultiAZ parameter is set to true. <p>Example:
     * <code>us-east-1a</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The EC2 Availability Zone that the database instance will be created
     *         in. <p>Default: A random, system-chosen Availability Zone.
     *         <p>Constraint: You cannot specify the AvailabilityZone parameter if
     *         the MultiAZ parameter is set to true. <p>Example:
     *         <code>us-east-1a</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * The DB subnet group name to use for the new instance.
     *
     * @return The DB subnet group name to use for the new instance.
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }
    
    /**
     * The DB subnet group name to use for the new instance.
     *
     * @param dBSubnetGroupName The DB subnet group name to use for the new instance.
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }
    
    /**
     * The DB subnet group name to use for the new instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroupName The DB subnet group name to use for the new instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }
    
    
    /**
     * Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraint:
     * You cannot specify the AvailabilityZone parameter if the MultiAZ
     * parameter is set to <code>true</code>.
     *
     * @return Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraint:
     *         You cannot specify the AvailabilityZone parameter if the MultiAZ
     *         parameter is set to <code>true</code>.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraint:
     * You cannot specify the AvailabilityZone parameter if the MultiAZ
     * parameter is set to <code>true</code>.
     *
     * @param multiAZ Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraint:
     *         You cannot specify the AvailabilityZone parameter if the MultiAZ
     *         parameter is set to <code>true</code>.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraint:
     * You cannot specify the AvailabilityZone parameter if the MultiAZ
     * parameter is set to <code>true</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraint:
     *         You cannot specify the AvailabilityZone parameter if the MultiAZ
     *         parameter is set to <code>true</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }
    
    
    /**
     * Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraint:
     * You cannot specify the AvailabilityZone parameter if the MultiAZ
     * parameter is set to <code>true</code>.
     *
     * @return Specifies if the DB Instance is a Multi-AZ deployment. <p>Constraint:
     *         You cannot specify the AvailabilityZone parameter if the MultiAZ
     *         parameter is set to <code>true</code>.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB Instance during the maintenance window.
     *
     * @return Indicates that minor version upgrades will be applied automatically to
     *         the DB Instance during the maintenance window.
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB Instance during the maintenance window.
     *
     * @param autoMinorVersionUpgrade Indicates that minor version upgrades will be applied automatically to
     *         the DB Instance during the maintenance window.
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB Instance during the maintenance window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Indicates that minor version upgrades will be applied automatically to
     *         the DB Instance during the maintenance window.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }
    
    
    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB Instance during the maintenance window.
     *
     * @return Indicates that minor version upgrades will be applied automatically to
     *         the DB Instance during the maintenance window.
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * License model information for the restored DB Instance. <p> Default:
     * Same as source. <p> Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     *
     * @return License model information for the restored DB Instance. <p> Default:
     *         Same as source. <p> Valid values: <code>license-included</code> |
     *         <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     */
    public String getLicenseModel() {
        return licenseModel;
    }
    
    /**
     * License model information for the restored DB Instance. <p> Default:
     * Same as source. <p> Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     *
     * @param licenseModel License model information for the restored DB Instance. <p> Default:
     *         Same as source. <p> Valid values: <code>license-included</code> |
     *         <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }
    
    /**
     * License model information for the restored DB Instance. <p> Default:
     * Same as source. <p> Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseModel License model information for the restored DB Instance. <p> Default:
     *         Same as source. <p> Valid values: <code>license-included</code> |
     *         <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }
    
    
    /**
     * The database name for the restored DB Instance. <note> <p>This
     * parameter is not used for the MySQL engine. </note>
     *
     * @return The database name for the restored DB Instance. <note> <p>This
     *         parameter is not used for the MySQL engine. </note>
     */
    public String getDBName() {
        return dBName;
    }
    
    /**
     * The database name for the restored DB Instance. <note> <p>This
     * parameter is not used for the MySQL engine. </note>
     *
     * @param dBName The database name for the restored DB Instance. <note> <p>This
     *         parameter is not used for the MySQL engine. </note>
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }
    
    /**
     * The database name for the restored DB Instance. <note> <p>This
     * parameter is not used for the MySQL engine. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBName The database name for the restored DB Instance. <note> <p>This
     *         parameter is not used for the MySQL engine. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }
    
    
    /**
     * The database engine to use for the new instance. <p>Default: The same
     * as source <p>Constraint: Must be compatible with the engine of the
     * source <p>Example: <code>oracle-ee</code>
     *
     * @return The database engine to use for the new instance. <p>Default: The same
     *         as source <p>Constraint: Must be compatible with the engine of the
     *         source <p>Example: <code>oracle-ee</code>
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The database engine to use for the new instance. <p>Default: The same
     * as source <p>Constraint: Must be compatible with the engine of the
     * source <p>Example: <code>oracle-ee</code>
     *
     * @param engine The database engine to use for the new instance. <p>Default: The same
     *         as source <p>Constraint: Must be compatible with the engine of the
     *         source <p>Example: <code>oracle-ee</code>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The database engine to use for the new instance. <p>Default: The same
     * as source <p>Constraint: Must be compatible with the engine of the
     * source <p>Example: <code>oracle-ee</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The database engine to use for the new instance. <p>Default: The same
     *         as source <p>Constraint: Must be compatible with the engine of the
     *         source <p>Example: <code>oracle-ee</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceToPointInTimeRequest withEngine(String engine) {
        this.engine = engine;
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
        if (sourceDBInstanceIdentifier != null) sb.append("SourceDBInstanceIdentifier: " + sourceDBInstanceIdentifier + ", ");
        if (targetDBInstanceIdentifier != null) sb.append("TargetDBInstanceIdentifier: " + targetDBInstanceIdentifier + ", ");
        if (restoreTime != null) sb.append("RestoreTime: " + restoreTime + ", ");
        if (useLatestRestorableTime != null) sb.append("UseLatestRestorableTime: " + useLatestRestorableTime + ", ");
        if (dBInstanceClass != null) sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        if (port != null) sb.append("Port: " + port + ", ");
        if (availabilityZone != null) sb.append("AvailabilityZone: " + availabilityZone + ", ");
        if (dBSubnetGroupName != null) sb.append("DBSubnetGroupName: " + dBSubnetGroupName + ", ");
        if (multiAZ != null) sb.append("MultiAZ: " + multiAZ + ", ");
        if (autoMinorVersionUpgrade != null) sb.append("AutoMinorVersionUpgrade: " + autoMinorVersionUpgrade + ", ");
        if (licenseModel != null) sb.append("LicenseModel: " + licenseModel + ", ");
        if (dBName != null) sb.append("DBName: " + dBName + ", ");
        if (engine != null) sb.append("Engine: " + engine + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceDBInstanceIdentifier() == null) ? 0 : getSourceDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getTargetDBInstanceIdentifier() == null) ? 0 : getTargetDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getRestoreTime() == null) ? 0 : getRestoreTime().hashCode()); 
        hashCode = prime * hashCode + ((isUseLatestRestorableTime() == null) ? 0 : isUseLatestRestorableTime().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((isMultiAZ() == null) ? 0 : isMultiAZ().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode()); 
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode()); 
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof RestoreDBInstanceToPointInTimeRequest == false) return false;
        RestoreDBInstanceToPointInTimeRequest other = (RestoreDBInstanceToPointInTimeRequest)obj;
        
        if (other.getSourceDBInstanceIdentifier() == null ^ this.getSourceDBInstanceIdentifier() == null) return false;
        if (other.getSourceDBInstanceIdentifier() != null && other.getSourceDBInstanceIdentifier().equals(this.getSourceDBInstanceIdentifier()) == false) return false; 
        if (other.getTargetDBInstanceIdentifier() == null ^ this.getTargetDBInstanceIdentifier() == null) return false;
        if (other.getTargetDBInstanceIdentifier() != null && other.getTargetDBInstanceIdentifier().equals(this.getTargetDBInstanceIdentifier()) == false) return false; 
        if (other.getRestoreTime() == null ^ this.getRestoreTime() == null) return false;
        if (other.getRestoreTime() != null && other.getRestoreTime().equals(this.getRestoreTime()) == false) return false; 
        if (other.isUseLatestRestorableTime() == null ^ this.isUseLatestRestorableTime() == null) return false;
        if (other.isUseLatestRestorableTime() != null && other.isUseLatestRestorableTime().equals(this.isUseLatestRestorableTime()) == false) return false; 
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null) return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null) return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false) return false; 
        if (other.isMultiAZ() == null ^ this.isMultiAZ() == null) return false;
        if (other.isMultiAZ() != null && other.isMultiAZ().equals(this.isMultiAZ()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null) return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false) return false; 
        if (other.getDBName() == null ^ this.getDBName() == null) return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false) return false; 
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        return true;
    }
    
}
    