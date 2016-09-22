/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
public class RestoreDBInstanceToPointInTimeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the source DB instance from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier of an existing database instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     */
    private String sourceDBInstanceIdentifier;
    /**
     * <p>
     * The name of the new database instance to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     */
    private String targetDBInstanceIdentifier;
    /**
     * <p>
     * The date and time to restore from.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be specified if UseLatestRestorableTime parameter is true
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2009-09-07T23:45:00Z</code>
     * </p>
     */
    private java.util.Date restoreTime;
    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the DB instance is restored from the latest
     * backup time.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if RestoreTime parameter is provided.
     * </p>
     */
    private Boolean useLatestRestorableTime;
    /**
     * <p>
     * The compute and memory capacity of the Amazon RDS DB instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     * <p>
     * Default: The same DBInstanceClass as the original DB instance.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB instance.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The EC2 Availability Zone that the database instance will be created in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to true.
     * </p>
     * <p>
     * Example: <code>us-east-1a</code>
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The DB subnet group name to use for the new instance.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to
     * <code>true</code>.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance
     * with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an
     * internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether a VPC has been requested or not. The following list
     * shows the default behavior in each case.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Default VPC:</b>true
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC:</b>false
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified as part of the
     * request and the PubliclyAccessible value has not been set, the DB instance will be private.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * Indicates that minor version upgrades will be applied automatically to the DB instance during the maintenance
     * window.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     * <p>
     * Default: Same as source.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * The database name for the restored DB instance.
     * </p>
     * <note>
     * <p>
     * This parameter is not used for the MySQL or MariaDB engines.
     * </p>
     * </note>
     */
    private String dBName;
    /**
     * <p>
     * The database engine to use for the new instance.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * <p>
     * Valid Values: <code>MySQL</code> | <code>mariadb</code> | <code>oracle-se1</code> | <code>oracle-se</code> |
     * <code>oracle-ee</code> | <code>sqlserver-ee</code> | <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     * <code>sqlserver-web</code> | <code>postgres</code> | <code>aurora</code>
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     * <p>
     * Constraints: Must be an integer greater than 1000.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Setting the IOPS value for the SQL Server database engine is not supported.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The name of the option group to be used for the restored DB instance.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an option
     * group, and that option group cannot be removed from a DB instance once it is associated with a DB instance
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * True to copy all tags from the restored DB instance to snapshots of the DB instance; otherwise false. The default
     * is false.
     * </p>
     */
    private Boolean copyTagsToSnapshot;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified; otherwise <code>standard</code>
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The ARN from the Key Store with which to associate the instance for TDE encryption.
     * </p>
     */
    private String tdeCredentialArn;
    /**
     * <p>
     * The password for the given ARN from the Key Store in order to access the device.
     * </p>
     */
    private String tdeCredentialPassword;
    /**
     * <p>
     * Specify the Active Directory Domain to restore the instance in.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     */
    private String domainIAMRoleName;

    /**
     * Default constructor for RestoreDBInstanceToPointInTimeRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize the object after creating it.
     */
    public RestoreDBInstanceToPointInTimeRequest() {
    }

    /**
     * Constructs a new RestoreDBInstanceToPointInTimeRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param sourceDBInstanceIdentifier
     *        The identifier of the source DB instance from which to restore.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier of an existing database instance
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     * @param targetDBInstanceIdentifier
     *        The name of the new database instance to be created.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     */
    public RestoreDBInstanceToPointInTimeRequest(String sourceDBInstanceIdentifier, String targetDBInstanceIdentifier) {
        setSourceDBInstanceIdentifier(sourceDBInstanceIdentifier);
        setTargetDBInstanceIdentifier(targetDBInstanceIdentifier);
    }

    /**
     * <p>
     * The identifier of the source DB instance from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier of an existing database instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceDBInstanceIdentifier
     *        The identifier of the source DB instance from which to restore.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier of an existing database instance
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     */

    public void setSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
    }

    /**
     * <p>
     * The identifier of the source DB instance from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier of an existing database instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the source DB instance from which to restore.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be the identifier of an existing database instance
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     */

    public String getSourceDBInstanceIdentifier() {
        return this.sourceDBInstanceIdentifier;
    }

    /**
     * <p>
     * The identifier of the source DB instance from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier of an existing database instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceDBInstanceIdentifier
     *        The identifier of the source DB instance from which to restore.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier of an existing database instance
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        setSourceDBInstanceIdentifier(sourceDBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the new database instance to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetDBInstanceIdentifier
     *        The name of the new database instance to be created.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     */

    public void setTargetDBInstanceIdentifier(String targetDBInstanceIdentifier) {
        this.targetDBInstanceIdentifier = targetDBInstanceIdentifier;
    }

    /**
     * <p>
     * The name of the new database instance to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the new database instance to be created.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     */

    public String getTargetDBInstanceIdentifier() {
        return this.targetDBInstanceIdentifier;
    }

    /**
     * <p>
     * The name of the new database instance to be created.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param targetDBInstanceIdentifier
     *        The name of the new database instance to be created.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withTargetDBInstanceIdentifier(String targetDBInstanceIdentifier) {
        setTargetDBInstanceIdentifier(targetDBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The date and time to restore from.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be specified if UseLatestRestorableTime parameter is true
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2009-09-07T23:45:00Z</code>
     * </p>
     * 
     * @param restoreTime
     *        The date and time to restore from.</p>
     *        <p>
     *        Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be before the latest restorable time for the DB instance
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be specified if UseLatestRestorableTime parameter is true
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>2009-09-07T23:45:00Z</code>
     */

    public void setRestoreTime(java.util.Date restoreTime) {
        this.restoreTime = restoreTime;
    }

    /**
     * <p>
     * The date and time to restore from.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be specified if UseLatestRestorableTime parameter is true
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2009-09-07T23:45:00Z</code>
     * </p>
     * 
     * @return The date and time to restore from.</p>
     *         <p>
     *         Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be before the latest restorable time for the DB instance
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be specified if UseLatestRestorableTime parameter is true
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>2009-09-07T23:45:00Z</code>
     */

    public java.util.Date getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * <p>
     * The date and time to restore from.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be specified if UseLatestRestorableTime parameter is true
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2009-09-07T23:45:00Z</code>
     * </p>
     * 
     * @param restoreTime
     *        The date and time to restore from.</p>
     *        <p>
     *        Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be before the latest restorable time for the DB instance
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be specified if UseLatestRestorableTime parameter is true
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>2009-09-07T23:45:00Z</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withRestoreTime(java.util.Date restoreTime) {
        setRestoreTime(restoreTime);
        return this;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the DB instance is restored from the latest
     * backup time.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if RestoreTime parameter is provided.
     * </p>
     * 
     * @param useLatestRestorableTime
     *        Specifies whether (<code>true</code>) or not (<code>false</code>) the DB instance is restored from the
     *        latest backup time. </p>
     *        <p>
     *        Default: <code>false</code>
     *        </p>
     *        <p>
     *        Constraints: Cannot be specified if RestoreTime parameter is provided.
     */

    public void setUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the DB instance is restored from the latest
     * backup time.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if RestoreTime parameter is provided.
     * </p>
     * 
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>) the DB instance is restored from the
     *         latest backup time. </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     *         <p>
     *         Constraints: Cannot be specified if RestoreTime parameter is provided.
     */

    public Boolean getUseLatestRestorableTime() {
        return this.useLatestRestorableTime;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the DB instance is restored from the latest
     * backup time.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if RestoreTime parameter is provided.
     * </p>
     * 
     * @param useLatestRestorableTime
     *        Specifies whether (<code>true</code>) or not (<code>false</code>) the DB instance is restored from the
     *        latest backup time. </p>
     *        <p>
     *        Default: <code>false</code>
     *        </p>
     *        <p>
     *        Constraints: Cannot be specified if RestoreTime parameter is provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        setUseLatestRestorableTime(useLatestRestorableTime);
        return this;
    }

    /**
     * <p>
     * Specifies whether (<code>true</code>) or not (<code>false</code>) the DB instance is restored from the latest
     * backup time.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if RestoreTime parameter is provided.
     * </p>
     * 
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>) the DB instance is restored from the
     *         latest backup time. </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     *         <p>
     *         Constraints: Cannot be specified if RestoreTime parameter is provided.
     */

    public Boolean isUseLatestRestorableTime() {
        return this.useLatestRestorableTime;
    }

    /**
     * <p>
     * The compute and memory capacity of the Amazon RDS DB instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     * <p>
     * Default: The same DBInstanceClass as the original DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The compute and memory capacity of the Amazon RDS DB instance.</p>
     *        <p>
     *        Valid Values:
     *        <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     *        </p>
     *        <p>
     *        Default: The same DBInstanceClass as the original DB instance.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the Amazon RDS DB instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     * <p>
     * Default: The same DBInstanceClass as the original DB instance.
     * </p>
     * 
     * @return The compute and memory capacity of the Amazon RDS DB instance.</p>
     *         <p>
     *         Valid Values:
     *         <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     *         </p>
     *         <p>
     *         Default: The same DBInstanceClass as the original DB instance.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the Amazon RDS DB instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     * <p>
     * Default: The same DBInstanceClass as the original DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The compute and memory capacity of the Amazon RDS DB instance.</p>
     *        <p>
     *        Valid Values:
     *        <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     *        </p>
     *        <p>
     *        Default: The same DBInstanceClass as the original DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB instance.
     * </p>
     * 
     * @param port
     *        The port number on which the database accepts connections.</p>
     *        <p>
     *        Constraints: Value must be <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Default: The same port as the original DB instance.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB instance.
     * </p>
     * 
     * @return The port number on which the database accepts connections.</p>
     *         <p>
     *         Constraints: Value must be <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Default: The same port as the original DB instance.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB instance.
     * </p>
     * 
     * @param port
     *        The port number on which the database accepts connections.</p>
     *        <p>
     *        Constraints: Value must be <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Default: The same port as the original DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The EC2 Availability Zone that the database instance will be created in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to true.
     * </p>
     * <p>
     * Example: <code>us-east-1a</code>
     * </p>
     * 
     * @param availabilityZone
     *        The EC2 Availability Zone that the database instance will be created in.</p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone.
     *        </p>
     *        <p>
     *        Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to true.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1a</code>
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The EC2 Availability Zone that the database instance will be created in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to true.
     * </p>
     * <p>
     * Example: <code>us-east-1a</code>
     * </p>
     * 
     * @return The EC2 Availability Zone that the database instance will be created in.</p>
     *         <p>
     *         Default: A random, system-chosen Availability Zone.
     *         </p>
     *         <p>
     *         Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to true.
     *         </p>
     *         <p>
     *         Example: <code>us-east-1a</code>
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The EC2 Availability Zone that the database instance will be created in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to true.
     * </p>
     * <p>
     * Example: <code>us-east-1a</code>
     * </p>
     * 
     * @param availabilityZone
     *        The EC2 Availability Zone that the database instance will be created in.</p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone.
     *        </p>
     *        <p>
     *        Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to true.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1a</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The DB subnet group name to use for the new instance.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The DB subnet group name to use for the new instance.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or
     *        hyphens. Must not be default.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The DB subnet group name to use for the new instance.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @return The DB subnet group name to use for the new instance.</p>
     *         <p>
     *         Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or
     *         hyphens. Must not be default.
     *         </p>
     *         <p>
     *         Example: <code>mySubnetgroup</code>
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * The DB subnet group name to use for the new instance.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The DB subnet group name to use for the new instance.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or
     *        hyphens. Must not be default.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to
     * <code>true</code>.
     * </p>
     * 
     * @param multiAZ
     *        Specifies if the DB instance is a Multi-AZ deployment.</p>
     *        <p>
     *        Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to
     *        <code>true</code>.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to
     * <code>true</code>.
     * </p>
     * 
     * @return Specifies if the DB instance is a Multi-AZ deployment.</p>
     *         <p>
     *         Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to
     *         <code>true</code>.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to
     * <code>true</code>.
     * </p>
     * 
     * @param multiAZ
     *        Specifies if the DB instance is a Multi-AZ deployment.</p>
     *        <p>
     *        Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to
     * <code>true</code>.
     * </p>
     * 
     * @return Specifies if the DB instance is a Multi-AZ deployment.</p>
     *         <p>
     *         Constraint: You cannot specify the AvailabilityZone parameter if the MultiAZ parameter is set to
     *         <code>true</code>.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance
     * with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an
     * internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether a VPC has been requested or not. The following list
     * shows the default behavior in each case.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Default VPC:</b>true
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC:</b>false
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified as part of the
     * request and the PubliclyAccessible value has not been set, the DB instance will be private.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing
     *        instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false
     *        specifies an internal instance with a DNS name that resolves to a private IP address.</p>
     *        <p>
     *        Default: The default behavior varies depending on whether a VPC has been requested or not. The following
     *        list shows the default behavior in each case.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Default VPC:</b>true
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>VPC:</b>false
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not
     *        been set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified as
     *        part of the request and the PubliclyAccessible value has not been set, the DB instance will be private.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance
     * with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an
     * internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether a VPC has been requested or not. The following list
     * shows the default behavior in each case.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Default VPC:</b>true
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC:</b>false
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified as part of the
     * request and the PubliclyAccessible value has not been set, the DB instance will be private.
     * </p>
     * 
     * @return Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing
     *         instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a private IP address.</p>
     *         <p>
     *         Default: The default behavior varies depending on whether a VPC has been requested or not. The following
     *         list shows the default behavior in each case.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Default VPC:</b>true
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>VPC:</b>false
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not
     *         been set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been set, the DB instance will be
     *         private.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance
     * with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an
     * internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether a VPC has been requested or not. The following list
     * shows the default behavior in each case.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Default VPC:</b>true
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC:</b>false
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified as part of the
     * request and the PubliclyAccessible value has not been set, the DB instance will be private.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing
     *        instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false
     *        specifies an internal instance with a DNS name that resolves to a private IP address.</p>
     *        <p>
     *        Default: The default behavior varies depending on whether a VPC has been requested or not. The following
     *        list shows the default behavior in each case.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Default VPC:</b>true
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>VPC:</b>false
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not
     *        been set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified as
     *        part of the request and the PubliclyAccessible value has not been set, the DB instance will be private.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance
     * with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an
     * internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether a VPC has been requested or not. The following list
     * shows the default behavior in each case.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Default VPC:</b>true
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC:</b>false
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified as part of the
     * request and the PubliclyAccessible value has not been set, the DB instance will be private.
     * </p>
     * 
     * @return Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing
     *         instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a private IP address.</p>
     *         <p>
     *         Default: The default behavior varies depending on whether a VPC has been requested or not. The following
     *         list shows the default behavior in each case.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Default VPC:</b>true
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>VPC:</b>false
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not
     *         been set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been set, the DB instance will be
     *         private.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Indicates that minor version upgrades will be applied automatically to the DB instance during the maintenance
     * window.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor version upgrades will be applied automatically to the DB instance during the
     *        maintenance window.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version upgrades will be applied automatically to the DB instance during the maintenance
     * window.
     * </p>
     * 
     * @return Indicates that minor version upgrades will be applied automatically to the DB instance during the
     *         maintenance window.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version upgrades will be applied automatically to the DB instance during the maintenance
     * window.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor version upgrades will be applied automatically to the DB instance during the
     *        maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Indicates that minor version upgrades will be applied automatically to the DB instance during the maintenance
     * window.
     * </p>
     * 
     * @return Indicates that minor version upgrades will be applied automatically to the DB instance during the
     *         maintenance window.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     * <p>
     * Default: Same as source.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * 
     * @param licenseModel
     *        License model information for the restored DB instance.</p>
     *        <p>
     *        Default: Same as source.
     *        </p>
     *        <p>
     *        Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *        <code>general-public-license</code>
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     * <p>
     * Default: Same as source.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * 
     * @return License model information for the restored DB instance.</p>
     *         <p>
     *         Default: Same as source.
     *         </p>
     *         <p>
     *         Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     * <p>
     * Default: Same as source.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * 
     * @param licenseModel
     *        License model information for the restored DB instance.</p>
     *        <p>
     *        Default: Same as source.
     *        </p>
     *        <p>
     *        Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *        <code>general-public-license</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * The database name for the restored DB instance.
     * </p>
     * <note>
     * <p>
     * This parameter is not used for the MySQL or MariaDB engines.
     * </p>
     * </note>
     * 
     * @param dBName
     *        The database name for the restored DB instance.</p> <note>
     *        <p>
     *        This parameter is not used for the MySQL or MariaDB engines.
     *        </p>
     */

    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The database name for the restored DB instance.
     * </p>
     * <note>
     * <p>
     * This parameter is not used for the MySQL or MariaDB engines.
     * </p>
     * </note>
     * 
     * @return The database name for the restored DB instance.</p> <note>
     *         <p>
     *         This parameter is not used for the MySQL or MariaDB engines.
     *         </p>
     */

    public String getDBName() {
        return this.dBName;
    }

    /**
     * <p>
     * The database name for the restored DB instance.
     * </p>
     * <note>
     * <p>
     * This parameter is not used for the MySQL or MariaDB engines.
     * </p>
     * </note>
     * 
     * @param dBName
     *        The database name for the restored DB instance.</p> <note>
     *        <p>
     *        This parameter is not used for the MySQL or MariaDB engines.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDBName(String dBName) {
        setDBName(dBName);
        return this;
    }

    /**
     * <p>
     * The database engine to use for the new instance.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * <p>
     * Valid Values: <code>MySQL</code> | <code>mariadb</code> | <code>oracle-se1</code> | <code>oracle-se</code> |
     * <code>oracle-ee</code> | <code>sqlserver-ee</code> | <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     * <code>sqlserver-web</code> | <code>postgres</code> | <code>aurora</code>
     * </p>
     * 
     * @param engine
     *        The database engine to use for the new instance.</p>
     *        <p>
     *        Default: The same as source
     *        </p>
     *        <p>
     *        Constraint: Must be compatible with the engine of the source
     *        </p>
     *        <p>
     *        Valid Values: <code>MySQL</code> | <code>mariadb</code> | <code>oracle-se1</code> | <code>oracle-se</code>
     *        | <code>oracle-ee</code> | <code>sqlserver-ee</code> | <code>sqlserver-se</code> |
     *        <code>sqlserver-ex</code> | <code>sqlserver-web</code> | <code>postgres</code> | <code>aurora</code>
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database engine to use for the new instance.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * <p>
     * Valid Values: <code>MySQL</code> | <code>mariadb</code> | <code>oracle-se1</code> | <code>oracle-se</code> |
     * <code>oracle-ee</code> | <code>sqlserver-ee</code> | <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     * <code>sqlserver-web</code> | <code>postgres</code> | <code>aurora</code>
     * </p>
     * 
     * @return The database engine to use for the new instance.</p>
     *         <p>
     *         Default: The same as source
     *         </p>
     *         <p>
     *         Constraint: Must be compatible with the engine of the source
     *         </p>
     *         <p>
     *         Valid Values: <code>MySQL</code> | <code>mariadb</code> | <code>oracle-se1</code> |
     *         <code>oracle-se</code> | <code>oracle-ee</code> | <code>sqlserver-ee</code> | <code>sqlserver-se</code> |
     *         <code>sqlserver-ex</code> | <code>sqlserver-web</code> | <code>postgres</code> | <code>aurora</code>
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The database engine to use for the new instance.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * <p>
     * Valid Values: <code>MySQL</code> | <code>mariadb</code> | <code>oracle-se1</code> | <code>oracle-se</code> |
     * <code>oracle-ee</code> | <code>sqlserver-ee</code> | <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     * <code>sqlserver-web</code> | <code>postgres</code> | <code>aurora</code>
     * </p>
     * 
     * @param engine
     *        The database engine to use for the new instance.</p>
     *        <p>
     *        Default: The same as source
     *        </p>
     *        <p>
     *        Constraint: Must be compatible with the engine of the source
     *        </p>
     *        <p>
     *        Valid Values: <code>MySQL</code> | <code>mariadb</code> | <code>oracle-se1</code> | <code>oracle-se</code>
     *        | <code>oracle-ee</code> | <code>sqlserver-ee</code> | <code>sqlserver-se</code> |
     *        <code>sqlserver-ex</code> | <code>sqlserver-web</code> | <code>postgres</code> | <code>aurora</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     * <p>
     * Constraints: Must be an integer greater than 1000.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Setting the IOPS value for the SQL Server database engine is not supported.
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     *        instance.</p>
     *        <p>
     *        Constraints: Must be an integer greater than 1000.
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Setting the IOPS value for the SQL Server database engine is not supported.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     * <p>
     * Constraints: Must be an integer greater than 1000.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Setting the IOPS value for the SQL Server database engine is not supported.
     * </p>
     * 
     * @return The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     *         instance.</p>
     *         <p>
     *         Constraints: Must be an integer greater than 1000.
     *         </p>
     *         <p>
     *         <b>SQL Server</b>
     *         </p>
     *         <p>
     *         Setting the IOPS value for the SQL Server database engine is not supported.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     * <p>
     * Constraints: Must be an integer greater than 1000.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Setting the IOPS value for the SQL Server database engine is not supported.
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     *        instance.</p>
     *        <p>
     *        Constraints: Must be an integer greater than 1000.
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Setting the IOPS value for the SQL Server database engine is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The name of the option group to be used for the restored DB instance.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an option
     * group, and that option group cannot be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @param optionGroupName
     *        The name of the option group to be used for the restored DB instance.</p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an
     *        option group, and that option group cannot be removed from a DB instance once it is associated with a DB
     *        instance
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to be used for the restored DB instance.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an option
     * group, and that option group cannot be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @return The name of the option group to be used for the restored DB instance.</p>
     *         <p>
     *         Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an
     *         option group, and that option group cannot be removed from a DB instance once it is associated with a DB
     *         instance
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to be used for the restored DB instance.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an option
     * group, and that option group cannot be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @param optionGroupName
     *        The name of the option group to be used for the restored DB instance.</p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an
     *        option group, and that option group cannot be removed from a DB instance once it is associated with a DB
     *        instance
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the restored DB instance to snapshots of the DB instance; otherwise false. The default
     * is false.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        True to copy all tags from the restored DB instance to snapshots of the DB instance; otherwise false. The
     *        default is false.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * True to copy all tags from the restored DB instance to snapshots of the DB instance; otherwise false. The default
     * is false.
     * </p>
     * 
     * @return True to copy all tags from the restored DB instance to snapshots of the DB instance; otherwise false. The
     *         default is false.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * True to copy all tags from the restored DB instance to snapshots of the DB instance; otherwise false. The default
     * is false.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        True to copy all tags from the restored DB instance to snapshots of the DB instance; otherwise false. The
     *        default is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the restored DB instance to snapshots of the DB instance; otherwise false. The default
     * is false.
     * </p>
     * 
     * @return True to copy all tags from the restored DB instance to snapshots of the DB instance; otherwise false. The
     *         default is false.
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified; otherwise <code>standard</code>
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB instance.</p>
     *        <p>
     *        Valid values: <code>standard | gp2 | io1</code>
     *        </p>
     *        <p>
     *        If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        Default: <code>io1</code> if the <code>Iops</code> parameter is specified; otherwise <code>standard</code>
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified; otherwise <code>standard</code>
     * </p>
     * 
     * @return Specifies the storage type to be associated with the DB instance.</p>
     *         <p>
     *         Valid values: <code>standard | gp2 | io1</code>
     *         </p>
     *         <p>
     *         If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     *         </p>
     *         <p>
     *         Default: <code>io1</code> if the <code>Iops</code> parameter is specified; otherwise
     *         <code>standard</code>
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified; otherwise <code>standard</code>
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB instance.</p>
     *        <p>
     *        Valid values: <code>standard | gp2 | io1</code>
     *        </p>
     *        <p>
     *        If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        Default: <code>io1</code> if the <code>Iops</code> parameter is specified; otherwise <code>standard</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The ARN from the Key Store with which to associate the instance for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the Key Store with which to associate the instance for TDE encryption.
     */

    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the Key Store with which to associate the instance for TDE encryption.
     * </p>
     * 
     * @return The ARN from the Key Store with which to associate the instance for TDE encryption.
     */

    public String getTdeCredentialArn() {
        return this.tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the Key Store with which to associate the instance for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the Key Store with which to associate the instance for TDE encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withTdeCredentialArn(String tdeCredentialArn) {
        setTdeCredentialArn(tdeCredentialArn);
        return this;
    }

    /**
     * <p>
     * The password for the given ARN from the Key Store in order to access the device.
     * </p>
     * 
     * @param tdeCredentialPassword
     *        The password for the given ARN from the Key Store in order to access the device.
     */

    public void setTdeCredentialPassword(String tdeCredentialPassword) {
        this.tdeCredentialPassword = tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the Key Store in order to access the device.
     * </p>
     * 
     * @return The password for the given ARN from the Key Store in order to access the device.
     */

    public String getTdeCredentialPassword() {
        return this.tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the Key Store in order to access the device.
     * </p>
     * 
     * @param tdeCredentialPassword
     *        The password for the given ARN from the Key Store in order to access the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withTdeCredentialPassword(String tdeCredentialPassword) {
        setTdeCredentialPassword(tdeCredentialPassword);
        return this;
    }

    /**
     * <p>
     * Specify the Active Directory Domain to restore the instance in.
     * </p>
     * 
     * @param domain
     *        Specify the Active Directory Domain to restore the instance in.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Specify the Active Directory Domain to restore the instance in.
     * </p>
     * 
     * @return Specify the Active Directory Domain to restore the instance in.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Specify the Active Directory Domain to restore the instance in.
     * </p>
     * 
     * @param domain
     *        Specify the Active Directory Domain to restore the instance in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.
     */

    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * 
     * @return Specify the name of the IAM role to be used when making API calls to the Directory Service.
     */

    public String getDomainIAMRoleName() {
        return this.domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDomainIAMRoleName(String domainIAMRoleName) {
        setDomainIAMRoleName(domainIAMRoleName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSourceDBInstanceIdentifier() != null)
            sb.append("SourceDBInstanceIdentifier: " + getSourceDBInstanceIdentifier() + ",");
        if (getTargetDBInstanceIdentifier() != null)
            sb.append("TargetDBInstanceIdentifier: " + getTargetDBInstanceIdentifier() + ",");
        if (getRestoreTime() != null)
            sb.append("RestoreTime: " + getRestoreTime() + ",");
        if (getUseLatestRestorableTime() != null)
            sb.append("UseLatestRestorableTime: " + getUseLatestRestorableTime() + ",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: " + getMultiAZ() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: " + getAutoMinorVersionUpgrade() + ",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getDBName() != null)
            sb.append("DBName: " + getDBName() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: " + getCopyTagsToSnapshot() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: " + getTdeCredentialArn() + ",");
        if (getTdeCredentialPassword() != null)
            sb.append("TdeCredentialPassword: " + getTdeCredentialPassword() + ",");
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: " + getDomainIAMRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreDBInstanceToPointInTimeRequest == false)
            return false;
        RestoreDBInstanceToPointInTimeRequest other = (RestoreDBInstanceToPointInTimeRequest) obj;
        if (other.getSourceDBInstanceIdentifier() == null ^ this.getSourceDBInstanceIdentifier() == null)
            return false;
        if (other.getSourceDBInstanceIdentifier() != null && other.getSourceDBInstanceIdentifier().equals(this.getSourceDBInstanceIdentifier()) == false)
            return false;
        if (other.getTargetDBInstanceIdentifier() == null ^ this.getTargetDBInstanceIdentifier() == null)
            return false;
        if (other.getTargetDBInstanceIdentifier() != null && other.getTargetDBInstanceIdentifier().equals(this.getTargetDBInstanceIdentifier()) == false)
            return false;
        if (other.getRestoreTime() == null ^ this.getRestoreTime() == null)
            return false;
        if (other.getRestoreTime() != null && other.getRestoreTime().equals(this.getRestoreTime()) == false)
            return false;
        if (other.getUseLatestRestorableTime() == null ^ this.getUseLatestRestorableTime() == null)
            return false;
        if (other.getUseLatestRestorableTime() != null && other.getUseLatestRestorableTime().equals(this.getUseLatestRestorableTime()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null)
            return false;
        if (other.getTdeCredentialArn() != null && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false)
            return false;
        if (other.getTdeCredentialPassword() == null ^ this.getTdeCredentialPassword() == null)
            return false;
        if (other.getTdeCredentialPassword() != null && other.getTdeCredentialPassword().equals(this.getTdeCredentialPassword()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null)
            return false;
        if (other.getDomainIAMRoleName() != null && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceDBInstanceIdentifier() == null) ? 0 : getSourceDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetDBInstanceIdentifier() == null) ? 0 : getTargetDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRestoreTime() == null) ? 0 : getRestoreTime().hashCode());
        hashCode = prime * hashCode + ((getUseLatestRestorableTime() == null) ? 0 : getUseLatestRestorableTime().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialPassword() == null) ? 0 : getTdeCredentialPassword().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        return hashCode;
    }

    @Override
    public RestoreDBInstanceToPointInTimeRequest clone() {
        return (RestoreDBInstanceToPointInTimeRequest) super.clone();
    }
}
