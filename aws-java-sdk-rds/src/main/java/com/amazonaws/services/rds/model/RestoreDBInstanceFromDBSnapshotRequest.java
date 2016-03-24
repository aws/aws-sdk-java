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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#restoreDBInstanceFromDBSnapshot(RestoreDBInstanceFromDBSnapshotRequest) RestoreDBInstanceFromDBSnapshot operation}.
 * <p>
 * Creates a new DB instance from a DB snapshot. The target database is
 * created from the source database restore point with the most of
 * original configuration with the default security group and the default
 * DB parameter group. By default, the new DB instance is created as a
 * single-AZ deployment except when the instance is a SQL Server instance
 * that has an option group that is associated with mirroring; in this
 * case, the instance becomes a mirrored AZ deployment and not a
 * single-AZ deployment.
 * </p>
 * <p>
 * If your intent is to replace your original DB instance with the new,
 * restored DB instance, then rename your original DB instance before you
 * call the RestoreDBInstanceFromDBSnapshot action. RDS does not allow
 * two DB instances with the same name. Once you have renamed your
 * original DB instance with a different identifier, then you can pass
 * the original name of the DB instance as the DBInstanceIdentifier in
 * the call to the RestoreDBInstanceFromDBSnapshot action. The result is
 * that you will replace the original DB instance with the DB instance
 * created from the snapshot.
 * </p>
 * <p>
 * If you are restoring from a shared manual DB snapshot, the
 * <code>DBSnapshotIdentifier</code> must be the ARN of the shared DB
 * snapshot.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#restoreDBInstanceFromDBSnapshot(RestoreDBInstanceFromDBSnapshotRequest)
 */
public class RestoreDBInstanceFromDBSnapshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Name of the DB instance to create from the DB snapshot. This parameter
     * isn't case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to
     * 63 alphanumeric characters or hyphens (1 to 15 for SQL Server)</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>my-snapshot-id</code>
     */
    private String dBInstanceIdentifier;

    /**
     * The identifier for the DB snapshot to restore from. <p>Constraints:
     * <ul> <li>Must contain from 1 to 255 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul> <p>If you
     * are restoring from a shared manual DB snapshot, the
     * <code>DBSnapshotIdentifier</code> must be the ARN of the shared DB
     * snapshot.
     */
    private String dBSnapshotIdentifier;

    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     * <p>Valid Values: <code>db.t1.micro | db.m1.small | db.m1.medium |
     * db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     * db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     * db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     * db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     * db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     * db.t2.medium | db.t2.large</code>
     */
    private String dBInstanceClass;

    /**
     * The port number on which the database accepts connections. <p>Default:
     * The same port as the original DB instance <p>Constraints: Value must
     * be <code>1150-65535</code>
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
     * The DB subnet group name to use for the new instance. <p>Constraints:
     * Must contain no more than 255 alphanumeric characters, periods,
     * underscores, spaces, or hyphens. Must not be default. <p>Example:
     * <code>mySubnetgroup</code>
     */
    private String dBSubnetGroupName;

    /**
     * Specifies if the DB instance is a Multi-AZ deployment. <p>Constraint:
     * You cannot specify the AvailabilityZone parameter if the MultiAZ
     * parameter is set to <code>true</code>.
     */
    private Boolean multiAZ;

    /**
     * Specifies the accessibility options for the DB instance. A value of
     * true specifies an Internet-facing instance with a publicly resolvable
     * DNS name, which resolves to a public IP address. A value of false
     * specifies an internal instance with a DNS name that resolves to a
     * private IP address. <p> Default: The default behavior varies depending
     * on whether a VPC has been requested or not. The following list shows
     * the default behavior in each case. <ul> <li> <b>Default VPC:</b>
     * true</li> <li> <b>VPC:</b> false</li> </ul> <p> If no DB subnet group
     * has been specified as part of the request and the PubliclyAccessible
     * value has not been set, the DB instance will be publicly accessible.
     * If a specific DB subnet group has been specified as part of the
     * request and the PubliclyAccessible value has not been set, the DB
     * instance will be private.
     */
    private Boolean publiclyAccessible;

    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB instance during the maintenance window.
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * License model information for the restored DB instance. <p> Default:
     * Same as source. <p> Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     */
    private String licenseModel;

    /**
     * The database name for the restored DB instance. <note> <p>This
     * parameter doesn't apply to the MySQL or MariaDB engines. </note>
     */
    private String dBName;

    /**
     * The database engine to use for the new instance. <p>Default: The same
     * as source <p>Constraint: Must be compatible with the engine of the
     * source <p> Valid Values: <code>MySQL</code> | <code>mariadb</code> |
     * <code>oracle-se1</code> | <code>oracle-se</code> |
     * <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     * <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     * <code>sqlserver-web</code> | <code>postgres</code> |
     * <code>aurora</code>
     */
    private String engine;

    /**
     * Specifies the amount of provisioned IOPS for the DB instance,
     * expressed in I/O operations per second. If this parameter is not
     * specified, the IOPS value will be taken from the backup. If this
     * parameter is set to 0, the new instance will be converted to a
     * non-PIOPS instance, which will take additional time, though your DB
     * instance will be available for connections before the conversion
     * starts. <p> Constraints: Must be an integer greater than 1000. <p>
     * <b>SQL Server</b> <p>Setting the IOPS value for the SQL Server
     * database engine is not supported.
     */
    private Integer iops;

    /**
     * The name of the option group to be used for the restored DB instance.
     * <p>Permanent options, such as the TDE option for Oracle Advanced
     * Security TDE, cannot be removed from an option group, and that option
     * group cannot be removed from a DB instance once it is associated with
     * a DB instance
     */
    private String optionGroupName;

    /**
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Specifies the storage type to be associated with the DB instance. <p>
     * Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     * <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     * <code>Iops</code> parameter is specified; otherwise
     * <code>standard</code>
     */
    private String storageType;

    /**
     * The ARN from the Key Store with which to associate the instance for
     * TDE encryption.
     */
    private String tdeCredentialArn;

    /**
     * The password for the given ARN from the Key Store in order to access
     * the device.
     */
    private String tdeCredentialPassword;

    /**
     * Specify the Active Directory Domain to restore the instance in.
     */
    private String domain;

    /**
     * True to copy all tags from the restored DB instance to snapshots of
     * the DB instance; otherwise false. The default is false.
     */
    private Boolean copyTagsToSnapshot;

    /**
     * Specify the name of the IAM role to be used when making API calls to
     * the Directory Service.
     */
    private String domainIAMRoleName;

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
     * @param dBInstanceIdentifier Name of the DB instance to create from the
     * DB snapshot. This parameter isn't case-sensitive. <p>Constraints: <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens (1 to
     * 15 for SQL Server)</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul> <p>Example: <code>my-snapshot-id</code>
     * @param dBSnapshotIdentifier The identifier for the DB snapshot to
     * restore from. <p>Constraints: <ul> <li>Must contain from 1 to 255
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul> <p>If you are restoring from a shared manual DB
     * snapshot, the <code>DBSnapshotIdentifier</code> must be the ARN of the
     * shared DB snapshot.
     */
    public RestoreDBInstanceFromDBSnapshotRequest(String dBInstanceIdentifier, String dBSnapshotIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        setDBSnapshotIdentifier(dBSnapshotIdentifier);
    }

    /**
     * Name of the DB instance to create from the DB snapshot. This parameter
     * isn't case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to
     * 63 alphanumeric characters or hyphens (1 to 15 for SQL Server)</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>my-snapshot-id</code>
     *
     * @return Name of the DB instance to create from the DB snapshot. This parameter
     *         isn't case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to
     *         63 alphanumeric characters or hyphens (1 to 15 for SQL Server)</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul> <p>Example:
     *         <code>my-snapshot-id</code>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * Name of the DB instance to create from the DB snapshot. This parameter
     * isn't case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to
     * 63 alphanumeric characters or hyphens (1 to 15 for SQL Server)</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>my-snapshot-id</code>
     *
     * @param dBInstanceIdentifier Name of the DB instance to create from the DB snapshot. This parameter
     *         isn't case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to
     *         63 alphanumeric characters or hyphens (1 to 15 for SQL Server)</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul> <p>Example:
     *         <code>my-snapshot-id</code>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * Name of the DB instance to create from the DB snapshot. This parameter
     * isn't case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to
     * 63 alphanumeric characters or hyphens (1 to 15 for SQL Server)</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>my-snapshot-id</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier Name of the DB instance to create from the DB snapshot. This parameter
     *         isn't case-sensitive. <p>Constraints: <ul> <li>Must contain from 1 to
     *         63 alphanumeric characters or hyphens (1 to 15 for SQL Server)</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul> <p>Example:
     *         <code>my-snapshot-id</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceFromDBSnapshotRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * The identifier for the DB snapshot to restore from. <p>Constraints:
     * <ul> <li>Must contain from 1 to 255 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul> <p>If you
     * are restoring from a shared manual DB snapshot, the
     * <code>DBSnapshotIdentifier</code> must be the ARN of the shared DB
     * snapshot.
     *
     * @return The identifier for the DB snapshot to restore from. <p>Constraints:
     *         <ul> <li>Must contain from 1 to 255 alphanumeric characters or
     *         hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     *         with a hyphen or contain two consecutive hyphens</li> </ul> <p>If you
     *         are restoring from a shared manual DB snapshot, the
     *         <code>DBSnapshotIdentifier</code> must be the ARN of the shared DB
     *         snapshot.
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the DB snapshot to restore from. <p>Constraints:
     * <ul> <li>Must contain from 1 to 255 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul> <p>If you
     * are restoring from a shared manual DB snapshot, the
     * <code>DBSnapshotIdentifier</code> must be the ARN of the shared DB
     * snapshot.
     *
     * @param dBSnapshotIdentifier The identifier for the DB snapshot to restore from. <p>Constraints:
     *         <ul> <li>Must contain from 1 to 255 alphanumeric characters or
     *         hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     *         with a hyphen or contain two consecutive hyphens</li> </ul> <p>If you
     *         are restoring from a shared manual DB snapshot, the
     *         <code>DBSnapshotIdentifier</code> must be the ARN of the shared DB
     *         snapshot.
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the DB snapshot to restore from. <p>Constraints:
     * <ul> <li>Must contain from 1 to 255 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul> <p>If you
     * are restoring from a shared manual DB snapshot, the
     * <code>DBSnapshotIdentifier</code> must be the ARN of the shared DB
     * snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshotIdentifier The identifier for the DB snapshot to restore from. <p>Constraints:
     *         <ul> <li>Must contain from 1 to 255 alphanumeric characters or
     *         hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     *         with a hyphen or contain two consecutive hyphens</li> </ul> <p>If you
     *         are restoring from a shared manual DB snapshot, the
     *         <code>DBSnapshotIdentifier</code> must be the ARN of the shared DB
     *         snapshot.
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
     * <p>Valid Values: <code>db.t1.micro | db.m1.small | db.m1.medium |
     * db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     * db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     * db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     * db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     * db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     * db.t2.medium | db.t2.large</code>
     *
     * @return The compute and memory capacity of the Amazon RDS DB instance.
     *         <p>Valid Values: <code>db.t1.micro | db.m1.small | db.m1.medium |
     *         db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     *         db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     *         db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     *         db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     *         db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     *         db.t2.medium | db.t2.large</code>
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     * <p>Valid Values: <code>db.t1.micro | db.m1.small | db.m1.medium |
     * db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     * db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     * db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     * db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     * db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     * db.t2.medium | db.t2.large</code>
     *
     * @param dBInstanceClass The compute and memory capacity of the Amazon RDS DB instance.
     *         <p>Valid Values: <code>db.t1.micro | db.m1.small | db.m1.medium |
     *         db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     *         db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     *         db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     *         db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     *         db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     *         db.t2.medium | db.t2.large</code>
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     * <p>Valid Values: <code>db.t1.micro | db.m1.small | db.m1.medium |
     * db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     * db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     * db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     * db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     * db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     * db.t2.medium | db.t2.large</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The compute and memory capacity of the Amazon RDS DB instance.
     *         <p>Valid Values: <code>db.t1.micro | db.m1.small | db.m1.medium |
     *         db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     *         db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     *         db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     *         db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     *         db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     *         db.t2.medium | db.t2.large</code>
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
     * The same port as the original DB instance <p>Constraints: Value must
     * be <code>1150-65535</code>
     *
     * @return The port number on which the database accepts connections. <p>Default:
     *         The same port as the original DB instance <p>Constraints: Value must
     *         be <code>1150-65535</code>
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which the database accepts connections. <p>Default:
     * The same port as the original DB instance <p>Constraints: Value must
     * be <code>1150-65535</code>
     *
     * @param port The port number on which the database accepts connections. <p>Default:
     *         The same port as the original DB instance <p>Constraints: Value must
     *         be <code>1150-65535</code>
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which the database accepts connections. <p>Default:
     * The same port as the original DB instance <p>Constraints: Value must
     * be <code>1150-65535</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which the database accepts connections. <p>Default:
     *         The same port as the original DB instance <p>Constraints: Value must
     *         be <code>1150-65535</code>
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
     * The DB subnet group name to use for the new instance. <p>Constraints:
     * Must contain no more than 255 alphanumeric characters, periods,
     * underscores, spaces, or hyphens. Must not be default. <p>Example:
     * <code>mySubnetgroup</code>
     *
     * @return The DB subnet group name to use for the new instance. <p>Constraints:
     *         Must contain no more than 255 alphanumeric characters, periods,
     *         underscores, spaces, or hyphens. Must not be default. <p>Example:
     *         <code>mySubnetgroup</code>
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }
    
    /**
     * The DB subnet group name to use for the new instance. <p>Constraints:
     * Must contain no more than 255 alphanumeric characters, periods,
     * underscores, spaces, or hyphens. Must not be default. <p>Example:
     * <code>mySubnetgroup</code>
     *
     * @param dBSubnetGroupName The DB subnet group name to use for the new instance. <p>Constraints:
     *         Must contain no more than 255 alphanumeric characters, periods,
     *         underscores, spaces, or hyphens. Must not be default. <p>Example:
     *         <code>mySubnetgroup</code>
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }
    
    /**
     * The DB subnet group name to use for the new instance. <p>Constraints:
     * Must contain no more than 255 alphanumeric characters, periods,
     * underscores, spaces, or hyphens. Must not be default. <p>Example:
     * <code>mySubnetgroup</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroupName The DB subnet group name to use for the new instance. <p>Constraints:
     *         Must contain no more than 255 alphanumeric characters, periods,
     *         underscores, spaces, or hyphens. Must not be default. <p>Example:
     *         <code>mySubnetgroup</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceFromDBSnapshotRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * Specifies if the DB instance is a Multi-AZ deployment. <p>Constraint:
     * You cannot specify the AvailabilityZone parameter if the MultiAZ
     * parameter is set to <code>true</code>.
     *
     * @return Specifies if the DB instance is a Multi-AZ deployment. <p>Constraint:
     *         You cannot specify the AvailabilityZone parameter if the MultiAZ
     *         parameter is set to <code>true</code>.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Specifies if the DB instance is a Multi-AZ deployment. <p>Constraint:
     * You cannot specify the AvailabilityZone parameter if the MultiAZ
     * parameter is set to <code>true</code>.
     *
     * @param multiAZ Specifies if the DB instance is a Multi-AZ deployment. <p>Constraint:
     *         You cannot specify the AvailabilityZone parameter if the MultiAZ
     *         parameter is set to <code>true</code>.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Specifies if the DB instance is a Multi-AZ deployment. <p>Constraint:
     * You cannot specify the AvailabilityZone parameter if the MultiAZ
     * parameter is set to <code>true</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ Specifies if the DB instance is a Multi-AZ deployment. <p>Constraint:
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
     * Specifies if the DB instance is a Multi-AZ deployment. <p>Constraint:
     * You cannot specify the AvailabilityZone parameter if the MultiAZ
     * parameter is set to <code>true</code>.
     *
     * @return Specifies if the DB instance is a Multi-AZ deployment. <p>Constraint:
     *         You cannot specify the AvailabilityZone parameter if the MultiAZ
     *         parameter is set to <code>true</code>.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * Specifies the accessibility options for the DB instance. A value of
     * true specifies an Internet-facing instance with a publicly resolvable
     * DNS name, which resolves to a public IP address. A value of false
     * specifies an internal instance with a DNS name that resolves to a
     * private IP address. <p> Default: The default behavior varies depending
     * on whether a VPC has been requested or not. The following list shows
     * the default behavior in each case. <ul> <li> <b>Default VPC:</b>
     * true</li> <li> <b>VPC:</b> false</li> </ul> <p> If no DB subnet group
     * has been specified as part of the request and the PubliclyAccessible
     * value has not been set, the DB instance will be publicly accessible.
     * If a specific DB subnet group has been specified as part of the
     * request and the PubliclyAccessible value has not been set, the DB
     * instance will be private.
     *
     * @return Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li> <b>Default VPC:</b>
     *         true</li> <li> <b>VPC:</b> false</li> </ul> <p> If no DB subnet group
     *         has been specified as part of the request and the PubliclyAccessible
     *         value has not been set, the DB instance will be publicly accessible.
     *         If a specific DB subnet group has been specified as part of the
     *         request and the PubliclyAccessible value has not been set, the DB
     *         instance will be private.
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }
    
    /**
     * Specifies the accessibility options for the DB instance. A value of
     * true specifies an Internet-facing instance with a publicly resolvable
     * DNS name, which resolves to a public IP address. A value of false
     * specifies an internal instance with a DNS name that resolves to a
     * private IP address. <p> Default: The default behavior varies depending
     * on whether a VPC has been requested or not. The following list shows
     * the default behavior in each case. <ul> <li> <b>Default VPC:</b>
     * true</li> <li> <b>VPC:</b> false</li> </ul> <p> If no DB subnet group
     * has been specified as part of the request and the PubliclyAccessible
     * value has not been set, the DB instance will be publicly accessible.
     * If a specific DB subnet group has been specified as part of the
     * request and the PubliclyAccessible value has not been set, the DB
     * instance will be private.
     *
     * @param publiclyAccessible Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li> <b>Default VPC:</b>
     *         true</li> <li> <b>VPC:</b> false</li> </ul> <p> If no DB subnet group
     *         has been specified as part of the request and the PubliclyAccessible
     *         value has not been set, the DB instance will be publicly accessible.
     *         If a specific DB subnet group has been specified as part of the
     *         request and the PubliclyAccessible value has not been set, the DB
     *         instance will be private.
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }
    
    /**
     * Specifies the accessibility options for the DB instance. A value of
     * true specifies an Internet-facing instance with a publicly resolvable
     * DNS name, which resolves to a public IP address. A value of false
     * specifies an internal instance with a DNS name that resolves to a
     * private IP address. <p> Default: The default behavior varies depending
     * on whether a VPC has been requested or not. The following list shows
     * the default behavior in each case. <ul> <li> <b>Default VPC:</b>
     * true</li> <li> <b>VPC:</b> false</li> </ul> <p> If no DB subnet group
     * has been specified as part of the request and the PubliclyAccessible
     * value has not been set, the DB instance will be publicly accessible.
     * If a specific DB subnet group has been specified as part of the
     * request and the PubliclyAccessible value has not been set, the DB
     * instance will be private.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publiclyAccessible Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li> <b>Default VPC:</b>
     *         true</li> <li> <b>VPC:</b> false</li> </ul> <p> If no DB subnet group
     *         has been specified as part of the request and the PubliclyAccessible
     *         value has not been set, the DB instance will be publicly accessible.
     *         If a specific DB subnet group has been specified as part of the
     *         request and the PubliclyAccessible value has not been set, the DB
     *         instance will be private.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceFromDBSnapshotRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * Specifies the accessibility options for the DB instance. A value of
     * true specifies an Internet-facing instance with a publicly resolvable
     * DNS name, which resolves to a public IP address. A value of false
     * specifies an internal instance with a DNS name that resolves to a
     * private IP address. <p> Default: The default behavior varies depending
     * on whether a VPC has been requested or not. The following list shows
     * the default behavior in each case. <ul> <li> <b>Default VPC:</b>
     * true</li> <li> <b>VPC:</b> false</li> </ul> <p> If no DB subnet group
     * has been specified as part of the request and the PubliclyAccessible
     * value has not been set, the DB instance will be publicly accessible.
     * If a specific DB subnet group has been specified as part of the
     * request and the PubliclyAccessible value has not been set, the DB
     * instance will be private.
     *
     * @return Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li> <b>Default VPC:</b>
     *         true</li> <li> <b>VPC:</b> false</li> </ul> <p> If no DB subnet group
     *         has been specified as part of the request and the PubliclyAccessible
     *         value has not been set, the DB instance will be publicly accessible.
     *         If a specific DB subnet group has been specified as part of the
     *         request and the PubliclyAccessible value has not been set, the DB
     *         instance will be private.
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB instance during the maintenance window.
     *
     * @return Indicates that minor version upgrades will be applied automatically to
     *         the DB instance during the maintenance window.
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB instance during the maintenance window.
     *
     * @param autoMinorVersionUpgrade Indicates that minor version upgrades will be applied automatically to
     *         the DB instance during the maintenance window.
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB instance during the maintenance window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Indicates that minor version upgrades will be applied automatically to
     *         the DB instance during the maintenance window.
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
     * the DB instance during the maintenance window.
     *
     * @return Indicates that minor version upgrades will be applied automatically to
     *         the DB instance during the maintenance window.
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * License model information for the restored DB instance. <p> Default:
     * Same as source. <p> Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     *
     * @return License model information for the restored DB instance. <p> Default:
     *         Same as source. <p> Valid values: <code>license-included</code> |
     *         <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     */
    public String getLicenseModel() {
        return licenseModel;
    }
    
    /**
     * License model information for the restored DB instance. <p> Default:
     * Same as source. <p> Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     *
     * @param licenseModel License model information for the restored DB instance. <p> Default:
     *         Same as source. <p> Valid values: <code>license-included</code> |
     *         <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }
    
    /**
     * License model information for the restored DB instance. <p> Default:
     * Same as source. <p> Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseModel License model information for the restored DB instance. <p> Default:
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
     * The database name for the restored DB instance. <note> <p>This
     * parameter doesn't apply to the MySQL or MariaDB engines. </note>
     *
     * @return The database name for the restored DB instance. <note> <p>This
     *         parameter doesn't apply to the MySQL or MariaDB engines. </note>
     */
    public String getDBName() {
        return dBName;
    }
    
    /**
     * The database name for the restored DB instance. <note> <p>This
     * parameter doesn't apply to the MySQL or MariaDB engines. </note>
     *
     * @param dBName The database name for the restored DB instance. <note> <p>This
     *         parameter doesn't apply to the MySQL or MariaDB engines. </note>
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }
    
    /**
     * The database name for the restored DB instance. <note> <p>This
     * parameter doesn't apply to the MySQL or MariaDB engines. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBName The database name for the restored DB instance. <note> <p>This
     *         parameter doesn't apply to the MySQL or MariaDB engines. </note>
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
     * source <p> Valid Values: <code>MySQL</code> | <code>mariadb</code> |
     * <code>oracle-se1</code> | <code>oracle-se</code> |
     * <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     * <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     * <code>sqlserver-web</code> | <code>postgres</code> |
     * <code>aurora</code>
     *
     * @return The database engine to use for the new instance. <p>Default: The same
     *         as source <p>Constraint: Must be compatible with the engine of the
     *         source <p> Valid Values: <code>MySQL</code> | <code>mariadb</code> |
     *         <code>oracle-se1</code> | <code>oracle-se</code> |
     *         <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     *         <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     *         <code>sqlserver-web</code> | <code>postgres</code> |
     *         <code>aurora</code>
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The database engine to use for the new instance. <p>Default: The same
     * as source <p>Constraint: Must be compatible with the engine of the
     * source <p> Valid Values: <code>MySQL</code> | <code>mariadb</code> |
     * <code>oracle-se1</code> | <code>oracle-se</code> |
     * <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     * <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     * <code>sqlserver-web</code> | <code>postgres</code> |
     * <code>aurora</code>
     *
     * @param engine The database engine to use for the new instance. <p>Default: The same
     *         as source <p>Constraint: Must be compatible with the engine of the
     *         source <p> Valid Values: <code>MySQL</code> | <code>mariadb</code> |
     *         <code>oracle-se1</code> | <code>oracle-se</code> |
     *         <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     *         <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     *         <code>sqlserver-web</code> | <code>postgres</code> |
     *         <code>aurora</code>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The database engine to use for the new instance. <p>Default: The same
     * as source <p>Constraint: Must be compatible with the engine of the
     * source <p> Valid Values: <code>MySQL</code> | <code>mariadb</code> |
     * <code>oracle-se1</code> | <code>oracle-se</code> |
     * <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     * <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     * <code>sqlserver-web</code> | <code>postgres</code> |
     * <code>aurora</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The database engine to use for the new instance. <p>Default: The same
     *         as source <p>Constraint: Must be compatible with the engine of the
     *         source <p> Valid Values: <code>MySQL</code> | <code>mariadb</code> |
     *         <code>oracle-se1</code> | <code>oracle-se</code> |
     *         <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     *         <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     *         <code>sqlserver-web</code> | <code>postgres</code> |
     *         <code>aurora</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceFromDBSnapshotRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * Specifies the amount of provisioned IOPS for the DB instance,
     * expressed in I/O operations per second. If this parameter is not
     * specified, the IOPS value will be taken from the backup. If this
     * parameter is set to 0, the new instance will be converted to a
     * non-PIOPS instance, which will take additional time, though your DB
     * instance will be available for connections before the conversion
     * starts. <p> Constraints: Must be an integer greater than 1000. <p>
     * <b>SQL Server</b> <p>Setting the IOPS value for the SQL Server
     * database engine is not supported.
     *
     * @return Specifies the amount of provisioned IOPS for the DB instance,
     *         expressed in I/O operations per second. If this parameter is not
     *         specified, the IOPS value will be taken from the backup. If this
     *         parameter is set to 0, the new instance will be converted to a
     *         non-PIOPS instance, which will take additional time, though your DB
     *         instance will be available for connections before the conversion
     *         starts. <p> Constraints: Must be an integer greater than 1000. <p>
     *         <b>SQL Server</b> <p>Setting the IOPS value for the SQL Server
     *         database engine is not supported.
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * Specifies the amount of provisioned IOPS for the DB instance,
     * expressed in I/O operations per second. If this parameter is not
     * specified, the IOPS value will be taken from the backup. If this
     * parameter is set to 0, the new instance will be converted to a
     * non-PIOPS instance, which will take additional time, though your DB
     * instance will be available for connections before the conversion
     * starts. <p> Constraints: Must be an integer greater than 1000. <p>
     * <b>SQL Server</b> <p>Setting the IOPS value for the SQL Server
     * database engine is not supported.
     *
     * @param iops Specifies the amount of provisioned IOPS for the DB instance,
     *         expressed in I/O operations per second. If this parameter is not
     *         specified, the IOPS value will be taken from the backup. If this
     *         parameter is set to 0, the new instance will be converted to a
     *         non-PIOPS instance, which will take additional time, though your DB
     *         instance will be available for connections before the conversion
     *         starts. <p> Constraints: Must be an integer greater than 1000. <p>
     *         <b>SQL Server</b> <p>Setting the IOPS value for the SQL Server
     *         database engine is not supported.
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * Specifies the amount of provisioned IOPS for the DB instance,
     * expressed in I/O operations per second. If this parameter is not
     * specified, the IOPS value will be taken from the backup. If this
     * parameter is set to 0, the new instance will be converted to a
     * non-PIOPS instance, which will take additional time, though your DB
     * instance will be available for connections before the conversion
     * starts. <p> Constraints: Must be an integer greater than 1000. <p>
     * <b>SQL Server</b> <p>Setting the IOPS value for the SQL Server
     * database engine is not supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iops Specifies the amount of provisioned IOPS for the DB instance,
     *         expressed in I/O operations per second. If this parameter is not
     *         specified, the IOPS value will be taken from the backup. If this
     *         parameter is set to 0, the new instance will be converted to a
     *         non-PIOPS instance, which will take additional time, though your DB
     *         instance will be available for connections before the conversion
     *         starts. <p> Constraints: Must be an integer greater than 1000. <p>
     *         <b>SQL Server</b> <p>Setting the IOPS value for the SQL Server
     *         database engine is not supported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceFromDBSnapshotRequest withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * The name of the option group to be used for the restored DB instance.
     * <p>Permanent options, such as the TDE option for Oracle Advanced
     * Security TDE, cannot be removed from an option group, and that option
     * group cannot be removed from a DB instance once it is associated with
     * a DB instance
     *
     * @return The name of the option group to be used for the restored DB instance.
     *         <p>Permanent options, such as the TDE option for Oracle Advanced
     *         Security TDE, cannot be removed from an option group, and that option
     *         group cannot be removed from a DB instance once it is associated with
     *         a DB instance
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * The name of the option group to be used for the restored DB instance.
     * <p>Permanent options, such as the TDE option for Oracle Advanced
     * Security TDE, cannot be removed from an option group, and that option
     * group cannot be removed from a DB instance once it is associated with
     * a DB instance
     *
     * @param optionGroupName The name of the option group to be used for the restored DB instance.
     *         <p>Permanent options, such as the TDE option for Oracle Advanced
     *         Security TDE, cannot be removed from an option group, and that option
     *         group cannot be removed from a DB instance once it is associated with
     *         a DB instance
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * The name of the option group to be used for the restored DB instance.
     * <p>Permanent options, such as the TDE option for Oracle Advanced
     * Security TDE, cannot be removed from an option group, and that option
     * group cannot be removed from a DB instance once it is associated with
     * a DB instance
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName The name of the option group to be used for the restored DB instance.
     *         <p>Permanent options, such as the TDE option for Oracle Advanced
     *         Security TDE, cannot be removed from an option group, and that option
     *         group cannot be removed from a DB instance once it is associated with
     *         a DB instance
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceFromDBSnapshotRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * A list of tags.
     *
     * @return A list of tags.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags.
     *
     * @param tags A list of tags.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceFromDBSnapshotRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceFromDBSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * Specifies the storage type to be associated with the DB instance. <p>
     * Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     * <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     * <code>Iops</code> parameter is specified; otherwise
     * <code>standard</code>
     *
     * @return Specifies the storage type to be associated with the DB instance. <p>
     *         Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     *         <code>io1</code>, you must also include a value for the
     *         <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     *         <code>Iops</code> parameter is specified; otherwise
     *         <code>standard</code>
     */
    public String getStorageType() {
        return storageType;
    }
    
    /**
     * Specifies the storage type to be associated with the DB instance. <p>
     * Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     * <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     * <code>Iops</code> parameter is specified; otherwise
     * <code>standard</code>
     *
     * @param storageType Specifies the storage type to be associated with the DB instance. <p>
     *         Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     *         <code>io1</code>, you must also include a value for the
     *         <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     *         <code>Iops</code> parameter is specified; otherwise
     *         <code>standard</code>
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }
    
    /**
     * Specifies the storage type to be associated with the DB instance. <p>
     * Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     * <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     * <code>Iops</code> parameter is specified; otherwise
     * <code>standard</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param storageType Specifies the storage type to be associated with the DB instance. <p>
     *         Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     *         <code>io1</code>, you must also include a value for the
     *         <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     *         <code>Iops</code> parameter is specified; otherwise
     *         <code>standard</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceFromDBSnapshotRequest withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * The ARN from the Key Store with which to associate the instance for
     * TDE encryption.
     *
     * @return The ARN from the Key Store with which to associate the instance for
     *         TDE encryption.
     */
    public String getTdeCredentialArn() {
        return tdeCredentialArn;
    }
    
    /**
     * The ARN from the Key Store with which to associate the instance for
     * TDE encryption.
     *
     * @param tdeCredentialArn The ARN from the Key Store with which to associate the instance for
     *         TDE encryption.
     */
    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }
    
    /**
     * The ARN from the Key Store with which to associate the instance for
     * TDE encryption.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tdeCredentialArn The ARN from the Key Store with which to associate the instance for
     *         TDE encryption.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceFromDBSnapshotRequest withTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
        return this;
    }

    /**
     * The password for the given ARN from the Key Store in order to access
     * the device.
     *
     * @return The password for the given ARN from the Key Store in order to access
     *         the device.
     */
    public String getTdeCredentialPassword() {
        return tdeCredentialPassword;
    }
    
    /**
     * The password for the given ARN from the Key Store in order to access
     * the device.
     *
     * @param tdeCredentialPassword The password for the given ARN from the Key Store in order to access
     *         the device.
     */
    public void setTdeCredentialPassword(String tdeCredentialPassword) {
        this.tdeCredentialPassword = tdeCredentialPassword;
    }
    
    /**
     * The password for the given ARN from the Key Store in order to access
     * the device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tdeCredentialPassword The password for the given ARN from the Key Store in order to access
     *         the device.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceFromDBSnapshotRequest withTdeCredentialPassword(String tdeCredentialPassword) {
        this.tdeCredentialPassword = tdeCredentialPassword;
        return this;
    }

    /**
     * Specify the Active Directory Domain to restore the instance in.
     *
     * @return Specify the Active Directory Domain to restore the instance in.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * Specify the Active Directory Domain to restore the instance in.
     *
     * @param domain Specify the Active Directory Domain to restore the instance in.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * Specify the Active Directory Domain to restore the instance in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domain Specify the Active Directory Domain to restore the instance in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceFromDBSnapshotRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * True to copy all tags from the restored DB instance to snapshots of
     * the DB instance; otherwise false. The default is false.
     *
     * @return True to copy all tags from the restored DB instance to snapshots of
     *         the DB instance; otherwise false. The default is false.
     */
    public Boolean isCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }
    
    /**
     * True to copy all tags from the restored DB instance to snapshots of
     * the DB instance; otherwise false. The default is false.
     *
     * @param copyTagsToSnapshot True to copy all tags from the restored DB instance to snapshots of
     *         the DB instance; otherwise false. The default is false.
     */
    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }
    
    /**
     * True to copy all tags from the restored DB instance to snapshots of
     * the DB instance; otherwise false. The default is false.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param copyTagsToSnapshot True to copy all tags from the restored DB instance to snapshots of
     *         the DB instance; otherwise false. The default is false.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceFromDBSnapshotRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        return this;
    }

    /**
     * True to copy all tags from the restored DB instance to snapshots of
     * the DB instance; otherwise false. The default is false.
     *
     * @return True to copy all tags from the restored DB instance to snapshots of
     *         the DB instance; otherwise false. The default is false.
     */
    public Boolean getCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * Specify the name of the IAM role to be used when making API calls to
     * the Directory Service.
     *
     * @return Specify the name of the IAM role to be used when making API calls to
     *         the Directory Service.
     */
    public String getDomainIAMRoleName() {
        return domainIAMRoleName;
    }
    
    /**
     * Specify the name of the IAM role to be used when making API calls to
     * the Directory Service.
     *
     * @param domainIAMRoleName Specify the name of the IAM role to be used when making API calls to
     *         the Directory Service.
     */
    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }
    
    /**
     * Specify the name of the IAM role to be used when making API calls to
     * the Directory Service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainIAMRoleName Specify the name of the IAM role to be used when making API calls to
     *         the Directory Service.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceFromDBSnapshotRequest withDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
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
        if (getDBInstanceIdentifier() != null) sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getDBSnapshotIdentifier() != null) sb.append("DBSnapshotIdentifier: " + getDBSnapshotIdentifier() + ",");
        if (getDBInstanceClass() != null) sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getDBSubnetGroupName() != null) sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (isMultiAZ() != null) sb.append("MultiAZ: " + isMultiAZ() + ",");
        if (isPubliclyAccessible() != null) sb.append("PubliclyAccessible: " + isPubliclyAccessible() + ",");
        if (isAutoMinorVersionUpgrade() != null) sb.append("AutoMinorVersionUpgrade: " + isAutoMinorVersionUpgrade() + ",");
        if (getLicenseModel() != null) sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getDBName() != null) sb.append("DBName: " + getDBName() + ",");
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getIops() != null) sb.append("Iops: " + getIops() + ",");
        if (getOptionGroupName() != null) sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getStorageType() != null) sb.append("StorageType: " + getStorageType() + ",");
        if (getTdeCredentialArn() != null) sb.append("TdeCredentialArn: " + getTdeCredentialArn() + ",");
        if (getTdeCredentialPassword() != null) sb.append("TdeCredentialPassword: " + getTdeCredentialPassword() + ",");
        if (getDomain() != null) sb.append("Domain: " + getDomain() + ",");
        if (isCopyTagsToSnapshot() != null) sb.append("CopyTagsToSnapshot: " + isCopyTagsToSnapshot() + ",");
        if (getDomainIAMRoleName() != null) sb.append("DomainIAMRoleName: " + getDomainIAMRoleName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((isMultiAZ() == null) ? 0 : isMultiAZ().hashCode()); 
        hashCode = prime * hashCode + ((isPubliclyAccessible() == null) ? 0 : isPubliclyAccessible().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode()); 
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode()); 
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode()); 
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode()); 
        hashCode = prime * hashCode + ((getTdeCredentialPassword() == null) ? 0 : getTdeCredentialPassword().hashCode()); 
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        hashCode = prime * hashCode + ((isCopyTagsToSnapshot() == null) ? 0 : isCopyTagsToSnapshot().hashCode()); 
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RestoreDBInstanceFromDBSnapshotRequest == false) return false;
        RestoreDBInstanceFromDBSnapshotRequest other = (RestoreDBInstanceFromDBSnapshotRequest)obj;
        
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null) return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false) return false; 
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
        if (other.isPubliclyAccessible() == null ^ this.isPubliclyAccessible() == null) return false;
        if (other.isPubliclyAccessible() != null && other.isPubliclyAccessible().equals(this.isPubliclyAccessible()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null) return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false) return false; 
        if (other.getDBName() == null ^ this.getDBName() == null) return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false) return false; 
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getStorageType() == null ^ this.getStorageType() == null) return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false) return false; 
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null) return false;
        if (other.getTdeCredentialArn() != null && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false) return false; 
        if (other.getTdeCredentialPassword() == null ^ this.getTdeCredentialPassword() == null) return false;
        if (other.getTdeCredentialPassword() != null && other.getTdeCredentialPassword().equals(this.getTdeCredentialPassword()) == false) return false; 
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.isCopyTagsToSnapshot() == null ^ this.isCopyTagsToSnapshot() == null) return false;
        if (other.isCopyTagsToSnapshot() != null && other.isCopyTagsToSnapshot().equals(this.isCopyTagsToSnapshot()) == false) return false; 
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null) return false;
        if (other.getDomainIAMRoleName() != null && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false) return false; 
        return true;
    }
    
    @Override
    public RestoreDBInstanceFromDBSnapshotRequest clone() {
        
            return (RestoreDBInstanceFromDBSnapshotRequest) super.clone();
    }

}
    