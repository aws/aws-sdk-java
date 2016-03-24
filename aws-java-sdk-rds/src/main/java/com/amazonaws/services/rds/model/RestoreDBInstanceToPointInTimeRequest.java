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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#restoreDBInstanceToPointInTime(RestoreDBInstanceToPointInTimeRequest) RestoreDBInstanceToPointInTime operation}.
 * <p>
 * Restores a DB instance to an arbitrary point in time. You can restore
 * to any point in time before the time identified by the
 * LatestRestorableTime property. You can restore to a point up to the
 * number of days specified by the BackupRetentionPeriod property.
 * </p>
 * <p>
 * The target database is created with most of the original
 * configuration, but in a system-selected availability zone, with the
 * default security group, the default subnet group, and the default DB
 * parameter group. By default, the new DB instance is created as a
 * single-AZ deployment except when the instance is a SQL Server instance
 * that has an option group that is associated with mirroring; in this
 * case, the instance becomes a mirrored deployment and not a single-AZ
 * deployment.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#restoreDBInstanceToPointInTime(RestoreDBInstanceToPointInTimeRequest)
 */
public class RestoreDBInstanceToPointInTimeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier of the source DB instance from which to restore.
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
     * time in Universal Coordinated Time (UTC) format <p>Constraints: <ul>
     * <li>Must be before the latest restorable time for the DB instance</li>
     * <li>Cannot be specified if UseLatestRestorableTime parameter is
     * true</li> </ul> <p>Example: <code>2009-09-07T23:45:00Z</code>
     */
    private java.util.Date restoreTime;

    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the
     * DB instance is restored from the latest backup time. <p>Default:
     * <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     * parameter is provided.
     */
    private Boolean useLatestRestorableTime;

    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     * <p>Valid Values: <code>db.t1.micro | db.m1.small | db.m1.medium |
     * db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     * db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     * db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     * db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     * db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     * db.t2.medium | db.t2.large</code> <p>Default: The same DBInstanceClass
     * as the original DB instance.
     */
    private String dBInstanceClass;

    /**
     * The port number on which the database accepts connections.
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB instance.
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
     * the default behavior in each case. <ul> <li> <b>Default
     * VPC:</b>true</li> <li> <b>VPC:</b>false</li> </ul> <p> If no DB subnet
     * group has been specified as part of the request and the
     * PubliclyAccessible value has not been set, the DB instance will be
     * publicly accessible. If a specific DB subnet group has been specified
     * as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be private.
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
     * parameter is not used for the MySQL or MariaDB engines. </note>
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
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance. <p> Constraints: Must be
     * an integer greater than 1000. <p> <b>SQL Server</b> <p>Setting the
     * IOPS value for the SQL Server database engine is not supported.
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
     * True to copy all tags from the restored DB instance to snapshots of
     * the DB instance; otherwise false. The default is false.
     */
    private Boolean copyTagsToSnapshot;

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
     * Specify the name of the IAM role to be used when making API calls to
     * the Directory Service.
     */
    private String domainIAMRoleName;

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
     * instance from which to restore. <p>Constraints: <ul> <li>Must be the
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
        setSourceDBInstanceIdentifier(sourceDBInstanceIdentifier);
        setTargetDBInstanceIdentifier(targetDBInstanceIdentifier);
    }

    /**
     * The identifier of the source DB instance from which to restore.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing
     * database instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     *
     * @return The identifier of the source DB instance from which to restore.
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
     * The identifier of the source DB instance from which to restore.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing
     * database instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     *
     * @param sourceDBInstanceIdentifier The identifier of the source DB instance from which to restore.
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
     * The identifier of the source DB instance from which to restore.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing
     * database instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDBInstanceIdentifier The identifier of the source DB instance from which to restore.
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
     * time in Universal Coordinated Time (UTC) format <p>Constraints: <ul>
     * <li>Must be before the latest restorable time for the DB instance</li>
     * <li>Cannot be specified if UseLatestRestorableTime parameter is
     * true</li> </ul> <p>Example: <code>2009-09-07T23:45:00Z</code>
     *
     * @return The date and time to restore from. <p>Valid Values: Value must be a
     *         time in Universal Coordinated Time (UTC) format <p>Constraints: <ul>
     *         <li>Must be before the latest restorable time for the DB instance</li>
     *         <li>Cannot be specified if UseLatestRestorableTime parameter is
     *         true</li> </ul> <p>Example: <code>2009-09-07T23:45:00Z</code>
     */
    public java.util.Date getRestoreTime() {
        return restoreTime;
    }
    
    /**
     * The date and time to restore from. <p>Valid Values: Value must be a
     * time in Universal Coordinated Time (UTC) format <p>Constraints: <ul>
     * <li>Must be before the latest restorable time for the DB instance</li>
     * <li>Cannot be specified if UseLatestRestorableTime parameter is
     * true</li> </ul> <p>Example: <code>2009-09-07T23:45:00Z</code>
     *
     * @param restoreTime The date and time to restore from. <p>Valid Values: Value must be a
     *         time in Universal Coordinated Time (UTC) format <p>Constraints: <ul>
     *         <li>Must be before the latest restorable time for the DB instance</li>
     *         <li>Cannot be specified if UseLatestRestorableTime parameter is
     *         true</li> </ul> <p>Example: <code>2009-09-07T23:45:00Z</code>
     */
    public void setRestoreTime(java.util.Date restoreTime) {
        this.restoreTime = restoreTime;
    }
    
    /**
     * The date and time to restore from. <p>Valid Values: Value must be a
     * time in Universal Coordinated Time (UTC) format <p>Constraints: <ul>
     * <li>Must be before the latest restorable time for the DB instance</li>
     * <li>Cannot be specified if UseLatestRestorableTime parameter is
     * true</li> </ul> <p>Example: <code>2009-09-07T23:45:00Z</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param restoreTime The date and time to restore from. <p>Valid Values: Value must be a
     *         time in Universal Coordinated Time (UTC) format <p>Constraints: <ul>
     *         <li>Must be before the latest restorable time for the DB instance</li>
     *         <li>Cannot be specified if UseLatestRestorableTime parameter is
     *         true</li> </ul> <p>Example: <code>2009-09-07T23:45:00Z</code>
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
     * DB instance is restored from the latest backup time. <p>Default:
     * <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     * parameter is provided.
     *
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>) the
     *         DB instance is restored from the latest backup time. <p>Default:
     *         <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     *         parameter is provided.
     */
    public Boolean isUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the
     * DB instance is restored from the latest backup time. <p>Default:
     * <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     * parameter is provided.
     *
     * @param useLatestRestorableTime Specifies whether (<code>true</code>) or not (<code>false</code>) the
     *         DB instance is restored from the latest backup time. <p>Default:
     *         <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     *         parameter is provided.
     */
    public void setUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
    }
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the
     * DB instance is restored from the latest backup time. <p>Default:
     * <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     * parameter is provided.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param useLatestRestorableTime Specifies whether (<code>true</code>) or not (<code>false</code>) the
     *         DB instance is restored from the latest backup time. <p>Default:
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
     * DB instance is restored from the latest backup time. <p>Default:
     * <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     * parameter is provided.
     *
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>) the
     *         DB instance is restored from the latest backup time. <p>Default:
     *         <code>false</code> <p>Constraints: Cannot be specified if RestoreTime
     *         parameter is provided.
     */
    public Boolean getUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }

    /**
     * The compute and memory capacity of the Amazon RDS DB instance.
     * <p>Valid Values: <code>db.t1.micro | db.m1.small | db.m1.medium |
     * db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     * db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     * db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     * db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     * db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     * db.t2.medium | db.t2.large</code> <p>Default: The same DBInstanceClass
     * as the original DB instance.
     *
     * @return The compute and memory capacity of the Amazon RDS DB instance.
     *         <p>Valid Values: <code>db.t1.micro | db.m1.small | db.m1.medium |
     *         db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     *         db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     *         db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     *         db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     *         db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     *         db.t2.medium | db.t2.large</code> <p>Default: The same DBInstanceClass
     *         as the original DB instance.
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
     * db.t2.medium | db.t2.large</code> <p>Default: The same DBInstanceClass
     * as the original DB instance.
     *
     * @param dBInstanceClass The compute and memory capacity of the Amazon RDS DB instance.
     *         <p>Valid Values: <code>db.t1.micro | db.m1.small | db.m1.medium |
     *         db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     *         db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     *         db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     *         db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     *         db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     *         db.t2.medium | db.t2.large</code> <p>Default: The same DBInstanceClass
     *         as the original DB instance.
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
     * db.t2.medium | db.t2.large</code> <p>Default: The same DBInstanceClass
     * as the original DB instance.
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
     *         db.t2.medium | db.t2.large</code> <p>Default: The same DBInstanceClass
     *         as the original DB instance.
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
     * same port as the original DB instance.
     *
     * @return The port number on which the database accepts connections.
     *         <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     *         same port as the original DB instance.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which the database accepts connections.
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB instance.
     *
     * @param port The port number on which the database accepts connections.
     *         <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     *         same port as the original DB instance.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which the database accepts connections.
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which the database accepts connections.
     *         <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     *         same port as the original DB instance.
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
    public RestoreDBInstanceToPointInTimeRequest withDBSubnetGroupName(String dBSubnetGroupName) {
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
    public RestoreDBInstanceToPointInTimeRequest withMultiAZ(Boolean multiAZ) {
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
     * the default behavior in each case. <ul> <li> <b>Default
     * VPC:</b>true</li> <li> <b>VPC:</b>false</li> </ul> <p> If no DB subnet
     * group has been specified as part of the request and the
     * PubliclyAccessible value has not been set, the DB instance will be
     * publicly accessible. If a specific DB subnet group has been specified
     * as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be private.
     *
     * @return Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li> <b>Default
     *         VPC:</b>true</li> <li> <b>VPC:</b>false</li> </ul> <p> If no DB subnet
     *         group has been specified as part of the request and the
     *         PubliclyAccessible value has not been set, the DB instance will be
     *         publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been
     *         set, the DB instance will be private.
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
     * the default behavior in each case. <ul> <li> <b>Default
     * VPC:</b>true</li> <li> <b>VPC:</b>false</li> </ul> <p> If no DB subnet
     * group has been specified as part of the request and the
     * PubliclyAccessible value has not been set, the DB instance will be
     * publicly accessible. If a specific DB subnet group has been specified
     * as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be private.
     *
     * @param publiclyAccessible Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li> <b>Default
     *         VPC:</b>true</li> <li> <b>VPC:</b>false</li> </ul> <p> If no DB subnet
     *         group has been specified as part of the request and the
     *         PubliclyAccessible value has not been set, the DB instance will be
     *         publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been
     *         set, the DB instance will be private.
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
     * the default behavior in each case. <ul> <li> <b>Default
     * VPC:</b>true</li> <li> <b>VPC:</b>false</li> </ul> <p> If no DB subnet
     * group has been specified as part of the request and the
     * PubliclyAccessible value has not been set, the DB instance will be
     * publicly accessible. If a specific DB subnet group has been specified
     * as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be private.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publiclyAccessible Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li> <b>Default
     *         VPC:</b>true</li> <li> <b>VPC:</b>false</li> </ul> <p> If no DB subnet
     *         group has been specified as part of the request and the
     *         PubliclyAccessible value has not been set, the DB instance will be
     *         publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been
     *         set, the DB instance will be private.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceToPointInTimeRequest withPubliclyAccessible(Boolean publiclyAccessible) {
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
     * the default behavior in each case. <ul> <li> <b>Default
     * VPC:</b>true</li> <li> <b>VPC:</b>false</li> </ul> <p> If no DB subnet
     * group has been specified as part of the request and the
     * PubliclyAccessible value has not been set, the DB instance will be
     * publicly accessible. If a specific DB subnet group has been specified
     * as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be private.
     *
     * @return Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li> <b>Default
     *         VPC:</b>true</li> <li> <b>VPC:</b>false</li> </ul> <p> If no DB subnet
     *         group has been specified as part of the request and the
     *         PubliclyAccessible value has not been set, the DB instance will be
     *         publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been
     *         set, the DB instance will be private.
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
    public RestoreDBInstanceToPointInTimeRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
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
    public RestoreDBInstanceToPointInTimeRequest withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * The database name for the restored DB instance. <note> <p>This
     * parameter is not used for the MySQL or MariaDB engines. </note>
     *
     * @return The database name for the restored DB instance. <note> <p>This
     *         parameter is not used for the MySQL or MariaDB engines. </note>
     */
    public String getDBName() {
        return dBName;
    }
    
    /**
     * The database name for the restored DB instance. <note> <p>This
     * parameter is not used for the MySQL or MariaDB engines. </note>
     *
     * @param dBName The database name for the restored DB instance. <note> <p>This
     *         parameter is not used for the MySQL or MariaDB engines. </note>
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }
    
    /**
     * The database name for the restored DB instance. <note> <p>This
     * parameter is not used for the MySQL or MariaDB engines. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBName The database name for the restored DB instance. <note> <p>This
     *         parameter is not used for the MySQL or MariaDB engines. </note>
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
    public RestoreDBInstanceToPointInTimeRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance. <p> Constraints: Must be
     * an integer greater than 1000. <p> <b>SQL Server</b> <p>Setting the
     * IOPS value for the SQL Server database engine is not supported.
     *
     * @return The amount of Provisioned IOPS (input/output operations per second) to
     *         be initially allocated for the DB instance. <p> Constraints: Must be
     *         an integer greater than 1000. <p> <b>SQL Server</b> <p>Setting the
     *         IOPS value for the SQL Server database engine is not supported.
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance. <p> Constraints: Must be
     * an integer greater than 1000. <p> <b>SQL Server</b> <p>Setting the
     * IOPS value for the SQL Server database engine is not supported.
     *
     * @param iops The amount of Provisioned IOPS (input/output operations per second) to
     *         be initially allocated for the DB instance. <p> Constraints: Must be
     *         an integer greater than 1000. <p> <b>SQL Server</b> <p>Setting the
     *         IOPS value for the SQL Server database engine is not supported.
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance. <p> Constraints: Must be
     * an integer greater than 1000. <p> <b>SQL Server</b> <p>Setting the
     * IOPS value for the SQL Server database engine is not supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iops The amount of Provisioned IOPS (input/output operations per second) to
     *         be initially allocated for the DB instance. <p> Constraints: Must be
     *         an integer greater than 1000. <p> <b>SQL Server</b> <p>Setting the
     *         IOPS value for the SQL Server database engine is not supported.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBInstanceToPointInTimeRequest withIops(Integer iops) {
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
    public RestoreDBInstanceToPointInTimeRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
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
    public RestoreDBInstanceToPointInTimeRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
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
    public RestoreDBInstanceToPointInTimeRequest withTags(Tag... tags) {
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
    public RestoreDBInstanceToPointInTimeRequest withTags(java.util.Collection<Tag> tags) {
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
    public RestoreDBInstanceToPointInTimeRequest withStorageType(String storageType) {
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
    public RestoreDBInstanceToPointInTimeRequest withTdeCredentialArn(String tdeCredentialArn) {
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
    public RestoreDBInstanceToPointInTimeRequest withTdeCredentialPassword(String tdeCredentialPassword) {
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
    public RestoreDBInstanceToPointInTimeRequest withDomain(String domain) {
        this.domain = domain;
        return this;
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
    public RestoreDBInstanceToPointInTimeRequest withDomainIAMRoleName(String domainIAMRoleName) {
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
        if (getSourceDBInstanceIdentifier() != null) sb.append("SourceDBInstanceIdentifier: " + getSourceDBInstanceIdentifier() + ",");
        if (getTargetDBInstanceIdentifier() != null) sb.append("TargetDBInstanceIdentifier: " + getTargetDBInstanceIdentifier() + ",");
        if (getRestoreTime() != null) sb.append("RestoreTime: " + getRestoreTime() + ",");
        if (isUseLatestRestorableTime() != null) sb.append("UseLatestRestorableTime: " + isUseLatestRestorableTime() + ",");
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
        if (isCopyTagsToSnapshot() != null) sb.append("CopyTagsToSnapshot: " + isCopyTagsToSnapshot() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getStorageType() != null) sb.append("StorageType: " + getStorageType() + ",");
        if (getTdeCredentialArn() != null) sb.append("TdeCredentialArn: " + getTdeCredentialArn() + ",");
        if (getTdeCredentialPassword() != null) sb.append("TdeCredentialPassword: " + getTdeCredentialPassword() + ",");
        if (getDomain() != null) sb.append("Domain: " + getDomain() + ",");
        if (getDomainIAMRoleName() != null) sb.append("DomainIAMRoleName: " + getDomainIAMRoleName() );
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
        hashCode = prime * hashCode + ((isPubliclyAccessible() == null) ? 0 : isPubliclyAccessible().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode()); 
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode()); 
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((isCopyTagsToSnapshot() == null) ? 0 : isCopyTagsToSnapshot().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode()); 
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode()); 
        hashCode = prime * hashCode + ((getTdeCredentialPassword() == null) ? 0 : getTdeCredentialPassword().hashCode()); 
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode()); 
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
        if (other.isCopyTagsToSnapshot() == null ^ this.isCopyTagsToSnapshot() == null) return false;
        if (other.isCopyTagsToSnapshot() != null && other.isCopyTagsToSnapshot().equals(this.isCopyTagsToSnapshot()) == false) return false; 
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
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null) return false;
        if (other.getDomainIAMRoleName() != null && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false) return false; 
        return true;
    }
    
    @Override
    public RestoreDBInstanceToPointInTimeRequest clone() {
        
            return (RestoreDBInstanceToPointInTimeRequest) super.clone();
    }

}
    