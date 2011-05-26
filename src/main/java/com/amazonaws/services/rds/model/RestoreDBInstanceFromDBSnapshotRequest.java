/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Restores a DB Instance to an arbitrary point-in-time. Users can
 * restore to any point in time before the latestRestorableTime for up to
 * backupRetentionPeriod days. The target database is created from the
 * source database with the same configuration as the original database
 * except that the DB instance is created with the default DB security
 * group.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#restoreDBInstanceFromDBSnapshot(RestoreDBInstanceFromDBSnapshotRequest)
 */
public class RestoreDBInstanceFromDBSnapshotRequest extends AmazonWebServiceRequest {

    /**
     * The identifier for the DB Snapshot to restore from. <p>Constraints:
     * <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    private String dBInstanceIdentifier;

    /**
     * Name of the DB Instance to create from the DB Snapshot. This parameter
     * isn't case sensitive. <p>Constraints: <ul> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example: <code>my-snapshot-id</code>
     */
    private String dBSnapshotIdentifier;

    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     * <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     * db.m2.2xlarge | db.m2.4xlarge</code>
     */
    private String dBInstanceClass;

    /**
     * The port number on which the database accepts connections. <p>Default:
     * The same port as the original DB Instance <p>Constraints: Value must
     * be <code>1115-65535</code>
     */
    private Integer port;

    /**
     * The EC2 Availability Zone that the database instance will be created
     * in. <p>Default: A random, system-chosen Availability Zone.
     * <p>Constraint: You cannot specify the AvailabilityZone parameter if
     * the MultiAZ parameter is set to <code>true</code>. <p>Example:
     * <code>us-east-1a</code>
     */
    private String availabilityZone;

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
     * parameter doesn't apply to the MySQL engine. </note>
     */
    private String dBName;

    /**
     * The database engine to use for the new instance. <p>Default: The same
     * as source <p>Constraint: Must be compatible with the engine of the
     * source <p>Example: <code>oracle-ee</code>
     */
    private String engine;

    /**
     * Default constructor for a new RestoreDBInstanceFromDBSnapshotRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RestoreDBInstanceFromDBSnapshotRequest() {}
    
    /**
     * Constructs a new RestoreDBInstanceFromDBSnapshotRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBInstanceIdentifier The identifier for the DB Snapshot to
     * restore from. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     * @param dBSnapshotIdentifier Name of the DB Instance to create from the
     * DB Snapshot. This parameter isn't case sensitive. <p>Constraints: <ul>
     * <li>Must contain from 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>my-snapshot-id</code>
     */
    public RestoreDBInstanceFromDBSnapshotRequest(String dBInstanceIdentifier, String dBSnapshotIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the DB Snapshot to restore from. <p>Constraints:
     * <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @return The identifier for the DB Snapshot to restore from. <p>Constraints:
     *         <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     *         hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     *         with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The identifier for the DB Snapshot to restore from. <p>Constraints:
     * <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul>
     *
     * @param dBInstanceIdentifier The identifier for the DB Snapshot to restore from. <p>Constraints:
     *         <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     *         hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     *         with a hyphen or contain two consecutive hyphens</li> </ul>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The identifier for the DB Snapshot to restore from. <p>Constraints:
     * <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The identifier for the DB Snapshot to restore from. <p>Constraints:
     *         <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     *         hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     *         with a hyphen or contain two consecutive hyphens</li> </ul>
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
     * isn't case sensitive. <p>Constraints: <ul> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example: <code>my-snapshot-id</code>
     *
     * @return Name of the DB Instance to create from the DB Snapshot. This parameter
     *         isn't case sensitive. <p>Constraints: <ul> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <p>Example: <code>my-snapshot-id</code>
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }
    
    /**
     * Name of the DB Instance to create from the DB Snapshot. This parameter
     * isn't case sensitive. <p>Constraints: <ul> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example: <code>my-snapshot-id</code>
     *
     * @param dBSnapshotIdentifier Name of the DB Instance to create from the DB Snapshot. This parameter
     *         isn't case sensitive. <p>Constraints: <ul> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <p>Example: <code>my-snapshot-id</code>
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }
    
    /**
     * Name of the DB Instance to create from the DB Snapshot. This parameter
     * isn't case sensitive. <p>Constraints: <ul> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example: <code>my-snapshot-id</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshotIdentifier Name of the DB Instance to create from the DB Snapshot. This parameter
     *         isn't case sensitive. <p>Constraints: <ul> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <p>Example: <code>my-snapshot-id</code>
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
     * <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     * db.m2.2xlarge | db.m2.4xlarge</code>
     *
     * @return The compute and memory capacity of the Amazon RDS DB instance.
     *         <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     *         db.m2.2xlarge | db.m2.4xlarge</code>
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     * <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     * db.m2.2xlarge | db.m2.4xlarge</code>
     *
     * @param dBInstanceClass The compute and memory capacity of the Amazon RDS DB instance.
     *         <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     *         db.m2.2xlarge | db.m2.4xlarge</code>
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     * <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     * db.m2.2xlarge | db.m2.4xlarge</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The compute and memory capacity of the Amazon RDS DB instance.
     *         <p>Valid Values: <code>db.m1.small | db.m1.large | db.m1.xlarge |
     *         db.m2.2xlarge | db.m2.4xlarge</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceFromDBSnapshotRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }
    
    
    /**
     * The port number on which the database accepts connections. <p>Default:
     * The same port as the original DB Instance <p>Constraints: Value must
     * be <code>1115-65535</code>
     *
     * @return The port number on which the database accepts connections. <p>Default:
     *         The same port as the original DB Instance <p>Constraints: Value must
     *         be <code>1115-65535</code>
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which the database accepts connections. <p>Default:
     * The same port as the original DB Instance <p>Constraints: Value must
     * be <code>1115-65535</code>
     *
     * @param port The port number on which the database accepts connections. <p>Default:
     *         The same port as the original DB Instance <p>Constraints: Value must
     *         be <code>1115-65535</code>
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which the database accepts connections. <p>Default:
     * The same port as the original DB Instance <p>Constraints: Value must
     * be <code>1115-65535</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which the database accepts connections. <p>Default:
     *         The same port as the original DB Instance <p>Constraints: Value must
     *         be <code>1115-65535</code>
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
     * in. <p>Default: A random, system-chosen Availability Zone.
     * <p>Constraint: You cannot specify the AvailabilityZone parameter if
     * the MultiAZ parameter is set to <code>true</code>. <p>Example:
     * <code>us-east-1a</code>
     *
     * @return The EC2 Availability Zone that the database instance will be created
     *         in. <p>Default: A random, system-chosen Availability Zone.
     *         <p>Constraint: You cannot specify the AvailabilityZone parameter if
     *         the MultiAZ parameter is set to <code>true</code>. <p>Example:
     *         <code>us-east-1a</code>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The EC2 Availability Zone that the database instance will be created
     * in. <p>Default: A random, system-chosen Availability Zone.
     * <p>Constraint: You cannot specify the AvailabilityZone parameter if
     * the MultiAZ parameter is set to <code>true</code>. <p>Example:
     * <code>us-east-1a</code>
     *
     * @param availabilityZone The EC2 Availability Zone that the database instance will be created
     *         in. <p>Default: A random, system-chosen Availability Zone.
     *         <p>Constraint: You cannot specify the AvailabilityZone parameter if
     *         the MultiAZ parameter is set to <code>true</code>. <p>Example:
     *         <code>us-east-1a</code>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The EC2 Availability Zone that the database instance will be created
     * in. <p>Default: A random, system-chosen Availability Zone.
     * <p>Constraint: You cannot specify the AvailabilityZone parameter if
     * the MultiAZ parameter is set to <code>true</code>. <p>Example:
     * <code>us-east-1a</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The EC2 Availability Zone that the database instance will be created
     *         in. <p>Default: A random, system-chosen Availability Zone.
     *         <p>Constraint: You cannot specify the AvailabilityZone parameter if
     *         the MultiAZ parameter is set to <code>true</code>. <p>Example:
     *         <code>us-east-1a</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceFromDBSnapshotRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
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
    public RestoreDBInstanceFromDBSnapshotRequest withMultiAZ(Boolean multiAZ) {
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
    public RestoreDBInstanceFromDBSnapshotRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
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
    public RestoreDBInstanceFromDBSnapshotRequest withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }
    
    
    /**
     * The database name for the restored DB Instance. <note> <p>This
     * parameter doesn't apply to the MySQL engine. </note>
     *
     * @return The database name for the restored DB Instance. <note> <p>This
     *         parameter doesn't apply to the MySQL engine. </note>
     */
    public String getDBName() {
        return dBName;
    }
    
    /**
     * The database name for the restored DB Instance. <note> <p>This
     * parameter doesn't apply to the MySQL engine. </note>
     *
     * @param dBName The database name for the restored DB Instance. <note> <p>This
     *         parameter doesn't apply to the MySQL engine. </note>
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }
    
    /**
     * The database name for the restored DB Instance. <note> <p>This
     * parameter doesn't apply to the MySQL engine. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBName The database name for the restored DB Instance. <note> <p>This
     *         parameter doesn't apply to the MySQL engine. </note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RestoreDBInstanceFromDBSnapshotRequest withDBName(String dBName) {
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
    public RestoreDBInstanceFromDBSnapshotRequest withEngine(String engine) {
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
        sb.append("DBInstanceIdentifier: " + dBInstanceIdentifier + ", ");
        sb.append("DBSnapshotIdentifier: " + dBSnapshotIdentifier + ", ");
        sb.append("DBInstanceClass: " + dBInstanceClass + ", ");
        sb.append("Port: " + port + ", ");
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("MultiAZ: " + multiAZ + ", ");
        sb.append("AutoMinorVersionUpgrade: " + autoMinorVersionUpgrade + ", ");
        sb.append("LicenseModel: " + licenseModel + ", ");
        sb.append("DBName: " + dBName + ", ");
        sb.append("Engine: " + engine + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    