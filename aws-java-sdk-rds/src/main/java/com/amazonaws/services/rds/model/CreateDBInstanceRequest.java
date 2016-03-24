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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBInstance(CreateDBInstanceRequest) CreateDBInstance operation}.
 * <p>
 * Creates a new DB instance.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBInstance(CreateDBInstanceRequest)
 */
public class CreateDBInstanceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The meaning of this parameter differs according to the database engine
     * you use. <p>Type: String <p> <b>MySQL</b> <p>The name of the database
     * to create when the DB instance is created. If this parameter is not
     * specified, no database is created in the DB instance. <p>Constraints:
     * <ul> <li>Must contain 1 to 64 alphanumeric characters</li> <li>Cannot
     * be a word reserved by the specified database engine</li> </ul> <p>
     * <b>MariaDB</b> <p>The name of the database to create when the DB
     * instance is created. If this parameter is not specified, no database
     * is created in the DB instance. <p>Constraints: <ul> <li>Must contain 1
     * to 64 alphanumeric characters</li> <li>Cannot be a word reserved by
     * the specified database engine</li> </ul> <p> <b>PostgreSQL</b> <p>The
     * name of the database to create when the DB instance is created. If
     * this parameter is not specified, the default "postgres" database is
     * created in the DB instance. <p>Constraints: <ul> <li>Must contain 1 to
     * 63 alphanumeric characters</li> <li>Must begin with a letter or an
     * underscore. Subsequent characters can be letters, underscores, or
     * digits (0-9).</li> <li>Cannot be a word reserved by the specified
     * database engine</li> </ul> <p> <b>Oracle</b> <p> The Oracle System ID
     * (SID) of the created DB instance. <p>Default: <code>ORCL</code>
     * <p>Constraints: <ul> <li>Cannot be longer than 8 characters</li> </ul>
     * <p> <b>SQL Server</b> <p>Not applicable. Must be null. <p> <b>Amazon
     * Aurora</b> <p>The name of the database to create when the primary
     * instance of the DB cluster is created. If this parameter is not
     * specified, no database is created in the DB instance. <p>Constraints:
     * <ul> <li>Must contain 1 to 64 alphanumeric characters</li> <li>Cannot
     * be a word reserved by the specified database engine</li> </ul>
     */
    private String dBName;

    /**
     * The DB instance identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens (1 to 15 for SQL Server).</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul> <p>Example:
     * <code>mydbinstance</code>
     */
    private String dBInstanceIdentifier;

    /**
     * The amount of storage (in gigabytes) to be initially allocated for the
     * database instance. <p> Type: Integer <p> <b>MySQL</b> <p> Constraints:
     * Must be an integer from 5 to 6144. <p> <b>MariaDB</b> <p> Constraints:
     * Must be an integer from 5 to 6144. <p> <b>PostgreSQL</b> <p>
     * Constraints: Must be an integer from 5 to 6144. <p> <b>Oracle</b> <p>
     * Constraints: Must be an integer from 10 to 6144. <p> <b>SQL Server</b>
     * <p> Constraints: Must be an integer from 200 to 4096 (Standard Edition
     * and Enterprise Edition) or from 20 to 4096 (Express Edition and Web
     * Edition)
     */
    private Integer allocatedStorage;

    /**
     * The compute and memory capacity of the DB instance. <p> Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     * db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge |
     * db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     * db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     * db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     * db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     * db.t2.medium | db.t2.large</code>
     */
    private String dBInstanceClass;

    /**
     * The name of the database engine to be used for this instance. <p>
     * Valid Values: <code>MySQL</code> | <code>mariadb</code> |
     * <code>oracle-se1</code> | <code>oracle-se</code> |
     * <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     * <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     * <code>sqlserver-web</code> | <code>postgres</code> |
     * <code>aurora</code> <p> Not every database engine is available for
     * every AWS region.
     */
    private String engine;

    /**
     * The name of master user for the client DB instance. <p> <b>MySQL</b>
     * <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     * <li>First character must be a letter.</li> <li>Cannot be a reserved
     * word for the chosen database engine.</li> </ul> <p> <b>MariaDB</b>
     * <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     * <li>Cannot be a reserved word for the chosen database engine.</li>
     * </ul> <p>Type: String <p> <b>Oracle</b> <p>Constraints: <ul> <li>Must
     * be 1 to 30 alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul> <p> <b>SQL Server</b> <p>Constraints: <ul> <li>Must
     * be 1 to 128 alphanumeric characters.</li> <li>First character must be
     * a letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul> <p> <b>PostgreSQL</b> <p>Constraints: <ul> <li>Must
     * be 1 to 63 alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul>
     */
    private String masterUsername;

    /**
     * The password for the master database user. Can be any printable ASCII
     * character except "/", """, or "@". <p>Type: String <p> <b>MySQL</b>
     * <p> Constraints: Must contain from 8 to 41 characters. <p>
     * <b>MariaDB</b> <p> Constraints: Must contain from 8 to 41 characters.
     * <p> <b>Oracle</b> <p> Constraints: Must contain from 8 to 30
     * characters. <p> <b>SQL Server</b> <p> Constraints: Must contain from 8
     * to 128 characters. <p> <b>PostgreSQL</b> <p> Constraints: Must contain
     * from 8 to 128 characters. <p> <b>Amazon Aurora</b> <p> Constraints:
     * Must contain from 8 to 41 characters.
     */
    private String masterUserPassword;

    /**
     * A list of DB security groups to associate with this DB instance. <p>
     * Default: The default DB security group for the database engine.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> dBSecurityGroups;

    /**
     * A list of EC2 VPC security groups to associate with this DB instance.
     * <p> Default: The default EC2 VPC security group for the DB subnet
     * group's VPC.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIds;

    /**
     * The EC2 Availability Zone that the database instance will be created
     * in. For information on regions and Availability Zones, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>. <p> Default: A random, system-chosen
     * Availability Zone in the endpoint's region. <p> Example:
     * <code>us-east-1d</code> <p> Constraint: The AvailabilityZone parameter
     * cannot be specified if the MultiAZ parameter is set to
     * <code>true</code>. The specified Availability Zone must be in the same
     * region as the current endpoint.
     */
    private String availabilityZone;

    /**
     * A DB subnet group to associate with this DB instance. <p> If there is
     * no DB subnet group, then it is a non-VPC DB instance.
     */
    private String dBSubnetGroupName;

    /**
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBMaintenance.html">DB
     * Instance Maintenance</a>. <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     */
    private String preferredMaintenanceWindow;

    /**
     * The name of the DB parameter group to associate with this DB instance.
     * If this argument is omitted, the default DBParameterGroup for the
     * specified engine will be used. <p> Constraints: <ul> <li>Must be 1 to
     * 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     */
    private String dBParameterGroupName;

    /**
     * The number of days for which automated backups are retained. Setting
     * this parameter to a positive number enables backups. Setting this
     * parameter to 0 disables automated backups. <p> Default: 1
     * <p>Constraints: <ul> <li>Must be a value from 0 to 35</li> <li>Cannot
     * be set to 0 if the DB instance is a source to Read Replicas</li> </ul>
     */
    private Integer backupRetentionPeriod;

    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.BackingUpAndRestoringAmazonRDSInstances.html">DB
     * Instance Backups</a>. <p> Default: A 30-minute window selected at
     * random from an 8-hour block of time per region. To see the time blocks
     * available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     * <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     * Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     * maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     */
    private String preferredBackupWindow;

    /**
     * The port number on which the database accepts connections. <p>
     * <b>MySQL</b> <p> Default: <code>3306</code> <p> Valid Values:
     * <code>1150-65535</code> <p>Type: Integer <p> <b>MariaDB</b> <p>
     * Default: <code>3306</code> <p> Valid Values: <code>1150-65535</code>
     * <p>Type: Integer <p> <b>PostgreSQL</b> <p> Default: <code>5432</code>
     * <p> Valid Values: <code>1150-65535</code> <p>Type: Integer <p>
     * <b>Oracle</b> <p> Default: <code>1521</code> <p> Valid Values:
     * <code>1150-65535</code> <p> <b>SQL Server</b> <p> Default:
     * <code>1433</code> <p> Valid Values: <code>1150-65535</code> except for
     * <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * <p> <b>Amazon Aurora</b> <p> Default: <code>3306</code> <p> Valid
     * Values: <code>1150-65535</code> <p>Type: Integer
     */
    private Integer port;

    /**
     * Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     * the AvailabilityZone parameter if the MultiAZ parameter is set to
     * true. Do not set this value if you want a Multi-AZ deployment for a
     * SQL Server DB instance. Multi-AZ for SQL Server is set using the
     * Mirroring option in an option group.
     */
    private Boolean multiAZ;

    /**
     * The version number of the database engine to use. <p> The following
     * are the database engines and major and minor versions that are
     * available with Amazon RDS. Not every database engine is available for
     * every AWS region. <p><b>MySQL</b> <ul> <li><b>Version 5.1 (Only
     * available in the following regions: ap-northeast-1, ap-southeast-1,
     * ap-southeast-2, eu-west-1, sa-east-1, us-west-1, us-west-2):</b>
     * <code> 5.1.73a | 5.1.73b</code></li> <li><b>Version 5.5 (Only
     * available in the following regions: ap-northeast-1, ap-southeast-1,
     * ap-southeast-2, eu-west-1, sa-east-1, us-west-1, us-west-2):</b>
     * <code> 5.5.40 | 5.5.40a</code></li> <li><b>Version 5.5 (Available in
     * all regions):</b> <code> 5.5.40b | 5.5.41 | 5.5.42</code></li>
     * <li><b>Version 5.6 (Available in all regions):</b> <code> 5.6.19a |
     * 5.6.19b | 5.6.21 | 5.6.21b | 5.6.22 | 5.6.23 | 5.6.27</code></li>
     * <li><b>Version 5.7 (Available in all regions):</b> <code>
     * 5.7.10</code></li> </ul> <p><b>MariaDB</b> <ul> <li><b>Version 10.0
     * (Available in all regions except AWS GovCloud (US) Region
     * (us-gov-west-1)):</b> <code> 10.0.17 </code></li> </ul> <p><b>Oracle
     * Database Enterprise Edition (oracle-ee)</b> <ul> <li><b>Version 11.2
     * (Only available in the following regions: ap-northeast-1,
     * ap-southeast-1, ap-southeast-2, eu-west-1, sa-east-1, us-west-1,
     * us-west-2):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 | 11.2.0.2.v5 |
     * 11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version 11.2 (Available
     * in all regions):</b> <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 |
     * 11.2.0.4.v1 | 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version
     * 12.1 (Available in all regions):</b> <code>12.1.0.1.v1 | 12.1.0.1.v2 |
     * 12.1.0.2.v1 </code></li> </ul> <p><b>Oracle Database Standard Edition
     * (oracle-se)</b> <ul> <li><b>Version 11.2 (Only available in the
     * following regions: us-west-1):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 |
     * 11.2.0.2.v5 | 11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version
     * 11.2 (Only available in the following regions: eu-central-1,
     * us-west-1):</b> <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 |
     * 11.2.0.4.v1 | 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version
     * 12.1 (Only available in the following regions: eu-central-1,
     * us-west-1):</b> <code>12.1.0.1.v1 | 12.1.0.1.v2</code></li> </ul>
     * <p><b>Oracle Database Standard Edition One (oracle-se1)</b> <ul>
     * <li><b>Version 11.2 (Only available in the following regions:
     * us-west-1):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 | 11.2.0.2.v5 |
     * 11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version 11.2 (Only
     * available in the following regions: eu-central-1, us-west-1):</b>
     * <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 | 11.2.0.4.v1 |
     * 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version 12.1 (Only
     * available in the following regions: eu-central-1, us-west-1):</b>
     * <code> 12.1.0.1.v1 | 12.1.0.1.v2</code></li> </ul>
     * <p><b>PostgreSQL</b> <ul> <li><b>Version 9.3 (Only available in the
     * following regions: ap-northeast-1, ap-southeast-1, ap-southeast-2,
     * eu-west-1, sa-east-1, us-west-1, us-west-2):</b> <code> 9.3.1 |
     * 9.3.2</code></li> <li><b>Version 9.3 (Available in all regions):</b>
     * <code> 9.3.3 | 9.3.5 | 9.3.6 | 9.3.9 | 9.3.10</code></li>
     * <li><b>Version 9.4 (Available in all regions):</b> <code> 9.4.1 |
     * 9.4.4 | 9.4.5</code></li> </ul> <p><b>Microsoft SQL Server Enterprise
     * Edition (sqlserver-ee)</b> <ul> <li><b>Version 10.50 (Available in all
     * regions):</b> <code> 10.50.2789.0.v1</code></li> <li><b>Version 10.50
     * (Available in all regions):</b> <code> 10.50.6000.34.v1</code></li>
     * <li><b>Version 11.00 (Available in all regions):</b> <code>
     * 11.00.2100.60.v1</code></li> <li><b>Version 11.00 (Available in all
     * regions):</b> <code> 11.00.5058.0.v1</code></li> </ul> <p><b>Microsoft
     * SQL Server Express Edition (sqlserver-ex)</b> <ul> <li><b>Version
     * 10.50 (Available in all regions):</b> <code>
     * 10.50.2789.0.v1</code></li> <li><b>Version 10.50 (Available in all
     * regions):</b> <code> 10.50.6000.34.v1</code></li> <li><b>Version 11.00
     * (Available in all regions):</b> <code> 11.00.2100.60.v1</code></li>
     * <li><b>Version 11.00 (Available in all regions):</b> <code>
     * 11.00.5058.0.v1</code></li> <li><b>Version 12.00 (Available in all
     * regions):</b> <code> 12.00.4422.0.v1</code></li> </ul> <p><b>Microsoft
     * SQL Server Standard Edition (sqlserver-se)</b> <ul> <li><b>Version
     * 10.50 (Available in all regions):</b> <code>
     * 10.50.2789.0.v1</code></li> <li><b>Version 10.50 (Available in all
     * regions):</b> <code> 10.50.6000.34.v1</code></li> <li><b>Version 11.00
     * (Available in all regions):</b> <code> 11.00.2100.60.v1</code></li>
     * <li><b>Version 11.00 (Available in all regions):</b> <code>
     * 11.00.5058.0.v1</code></li> <li><b>Version 12.00 (Available in all
     * regions):</b> <code> 12.00.4422.0.v1</code></li> </ul> <p><b>Microsoft
     * SQL Server Web Edition (sqlserver-web)</b> <ul> <li><b>Version 10.50
     * (Available in all regions):</b> <code> 10.50.2789.0.v1</code></li>
     * <li><b>Version 10.50 (Available in all regions):</b> <code>
     * 10.50.6000.34.v1</code></li> <li><b>Version 11.00 (Available in all
     * regions):</b> <code> 11.00.2100.60.v1</code></li> <li><b>Version 11.00
     * (Available in all regions):</b> <code> 11.00.5058.0.v1</code></li>
     * <li><b>Version 12.00 (Available in all regions):</b> <code>
     * 12.00.4422.0.v1</code></li> </ul>
     */
    private String engineVersion;

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the DB instance during the maintenance window. <p>Default:
     * <code>true</code>
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * License model information for this DB instance. <p> Valid values:
     * <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     */
    private String licenseModel;

    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance. <p>Constraints: Must be a
     * multiple between 3 and 10 of the storage amount for the DB instance.
     * Must also be an integer multiple of 1000. For example, if the size of
     * your DB instance is 500 GB, then your <code>Iops</code> value can be
     * 2000, 3000, 4000, or 5000.
     */
    private Integer iops;

    /**
     * Indicates that the DB instance should be associated with the specified
     * option group. <p> Permanent options, such as the TDE option for Oracle
     * Advanced Security TDE, cannot be removed from an option group, and
     * that option group cannot be removed from a DB instance once it is
     * associated with a DB instance
     */
    private String optionGroupName;

    /**
     * For supported engines, indicates that the DB instance should be
     * associated with the specified CharacterSet.
     */
    private String characterSetName;

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
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The identifier of the DB cluster that the instance will belong to.
     * <p>For information on creating a DB cluster, see
     * <a>CreateDBCluster</a>. <p>Type: String
     */
    private String dBClusterIdentifier;

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
     * Specifies whether the DB instance is encrypted. <p> Default: false
     */
    private Boolean storageEncrypted;

    /**
     * The KMS key identifier for an encrypted DB instance. <p>The KMS key
     * identifier is the Amazon Resource Name (ARN) for the KMS encryption
     * key. If you are creating a DB instance with the same AWS account that
     * owns the KMS encryption key used to encrypt the new DB instance, then
     * you can use the KMS key alias instead of the ARN for the KM encryption
     * key. <p>If the <code>StorageEncrypted</code> parameter is true, and
     * you do not specify a value for the <code>KmsKeyId</code> parameter,
     * then Amazon RDS will use your default encryption key. AWS KMS creates
     * the default encryption key for your AWS account. Your AWS account has
     * a different default encryption key for each AWS region.
     */
    private String kmsKeyId;

    /**
     * Specify the Active Directory Domain to create the instance in.
     */
    private String domain;

    /**
     * True to copy all tags from the DB instance to snapshots of the DB
     * instance; otherwise false. The default is false.
     */
    private Boolean copyTagsToSnapshot;

    /**
     * The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the DB instance. To disable collecting
     * Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     * <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     * Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     */
    private Integer monitoringInterval;

    /**
     * The ARN for the IAM role that permits RDS to send enhanced monitoring
     * metrics to CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information
     * on creating a monitoring role, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a>. <p>If
     * <code>MonitoringInterval</code> is set to a value other than 0, then
     * you must supply a <code>MonitoringRoleArn</code> value.
     */
    private String monitoringRoleArn;

    /**
     * Specify the name of the IAM role to be used when making API calls to
     * the Directory Service.
     */
    private String domainIAMRoleName;

    /**
     * A value that specifies the order in which an Aurora Replica is
     * promoted to the primary instance after a failure of the existing
     * primary instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>. <p>Default: 1 <p>Valid
     * Values: 0 - 15
     */
    private Integer promotionTier;

    /**
     * Default constructor for a new CreateDBInstanceRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateDBInstanceRequest() {}
    
    /**
     * Constructs a new CreateDBInstanceRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBInstanceIdentifier The DB instance identifier. This parameter
     * is stored as a lowercase string. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens (1 to 15 for SQL
     * Server).</li> <li>First character must be a letter.</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens.</li> </ul>
     * <p>Example: <code>mydbinstance</code>
     * @param allocatedStorage The amount of storage (in gigabytes) to be
     * initially allocated for the database instance. <p> Type: Integer <p>
     * <b>MySQL</b> <p> Constraints: Must be an integer from 5 to 6144. <p>
     * <b>MariaDB</b> <p> Constraints: Must be an integer from 5 to 6144. <p>
     * <b>PostgreSQL</b> <p> Constraints: Must be an integer from 5 to 6144.
     * <p> <b>Oracle</b> <p> Constraints: Must be an integer from 10 to 6144.
     * <p> <b>SQL Server</b> <p> Constraints: Must be an integer from 200 to
     * 4096 (Standard Edition and Enterprise Edition) or from 20 to 4096
     * (Express Edition and Web Edition)
     * @param dBInstanceClass The compute and memory capacity of the DB
     * instance. <p> Valid Values: <code>db.t1.micro | db.m1.small |
     * db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge
     * |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large |
     * db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge |
     * db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large |
     * db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge |
     * db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * @param engine The name of the database engine to be used for this
     * instance. <p> Valid Values: <code>MySQL</code> | <code>mariadb</code>
     * | <code>oracle-se1</code> | <code>oracle-se</code> |
     * <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     * <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     * <code>sqlserver-web</code> | <code>postgres</code> |
     * <code>aurora</code> <p> Not every database engine is available for
     * every AWS region.
     * @param masterUsername The name of master user for the client DB
     * instance. <p> <b>MySQL</b> <p>Constraints: <ul> <li>Must be 1 to 16
     * alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul> <p> <b>MariaDB</b> <p>Constraints: <ul> <li>Must be
     * 1 to 16 alphanumeric characters.</li> <li>Cannot be a reserved word
     * for the chosen database engine.</li> </ul> <p>Type: String <p>
     * <b>Oracle</b> <p>Constraints: <ul> <li>Must be 1 to 30 alphanumeric
     * characters.</li> <li>First character must be a letter.</li> <li>Cannot
     * be a reserved word for the chosen database engine.</li> </ul> <p>
     * <b>SQL Server</b> <p>Constraints: <ul> <li>Must be 1 to 128
     * alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul> <p> <b>PostgreSQL</b> <p>Constraints: <ul> <li>Must
     * be 1 to 63 alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul>
     * @param masterUserPassword The password for the master database user.
     * Can be any printable ASCII character except "/", """, or "@". <p>Type:
     * String <p> <b>MySQL</b> <p> Constraints: Must contain from 8 to 41
     * characters. <p> <b>MariaDB</b> <p> Constraints: Must contain from 8 to
     * 41 characters. <p> <b>Oracle</b> <p> Constraints: Must contain from 8
     * to 30 characters. <p> <b>SQL Server</b> <p> Constraints: Must contain
     * from 8 to 128 characters. <p> <b>PostgreSQL</b> <p> Constraints: Must
     * contain from 8 to 128 characters. <p> <b>Amazon Aurora</b> <p>
     * Constraints: Must contain from 8 to 41 characters.
     */
    public CreateDBInstanceRequest(String dBInstanceIdentifier, Integer allocatedStorage, String dBInstanceClass, String engine, String masterUsername, String masterUserPassword) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        setAllocatedStorage(allocatedStorage);
        setDBInstanceClass(dBInstanceClass);
        setEngine(engine);
        setMasterUsername(masterUsername);
        setMasterUserPassword(masterUserPassword);
    }

    /**
     * The meaning of this parameter differs according to the database engine
     * you use. <p>Type: String <p> <b>MySQL</b> <p>The name of the database
     * to create when the DB instance is created. If this parameter is not
     * specified, no database is created in the DB instance. <p>Constraints:
     * <ul> <li>Must contain 1 to 64 alphanumeric characters</li> <li>Cannot
     * be a word reserved by the specified database engine</li> </ul> <p>
     * <b>MariaDB</b> <p>The name of the database to create when the DB
     * instance is created. If this parameter is not specified, no database
     * is created in the DB instance. <p>Constraints: <ul> <li>Must contain 1
     * to 64 alphanumeric characters</li> <li>Cannot be a word reserved by
     * the specified database engine</li> </ul> <p> <b>PostgreSQL</b> <p>The
     * name of the database to create when the DB instance is created. If
     * this parameter is not specified, the default "postgres" database is
     * created in the DB instance. <p>Constraints: <ul> <li>Must contain 1 to
     * 63 alphanumeric characters</li> <li>Must begin with a letter or an
     * underscore. Subsequent characters can be letters, underscores, or
     * digits (0-9).</li> <li>Cannot be a word reserved by the specified
     * database engine</li> </ul> <p> <b>Oracle</b> <p> The Oracle System ID
     * (SID) of the created DB instance. <p>Default: <code>ORCL</code>
     * <p>Constraints: <ul> <li>Cannot be longer than 8 characters</li> </ul>
     * <p> <b>SQL Server</b> <p>Not applicable. Must be null. <p> <b>Amazon
     * Aurora</b> <p>The name of the database to create when the primary
     * instance of the DB cluster is created. If this parameter is not
     * specified, no database is created in the DB instance. <p>Constraints:
     * <ul> <li>Must contain 1 to 64 alphanumeric characters</li> <li>Cannot
     * be a word reserved by the specified database engine</li> </ul>
     *
     * @return The meaning of this parameter differs according to the database engine
     *         you use. <p>Type: String <p> <b>MySQL</b> <p>The name of the database
     *         to create when the DB instance is created. If this parameter is not
     *         specified, no database is created in the DB instance. <p>Constraints:
     *         <ul> <li>Must contain 1 to 64 alphanumeric characters</li> <li>Cannot
     *         be a word reserved by the specified database engine</li> </ul> <p>
     *         <b>MariaDB</b> <p>The name of the database to create when the DB
     *         instance is created. If this parameter is not specified, no database
     *         is created in the DB instance. <p>Constraints: <ul> <li>Must contain 1
     *         to 64 alphanumeric characters</li> <li>Cannot be a word reserved by
     *         the specified database engine</li> </ul> <p> <b>PostgreSQL</b> <p>The
     *         name of the database to create when the DB instance is created. If
     *         this parameter is not specified, the default "postgres" database is
     *         created in the DB instance. <p>Constraints: <ul> <li>Must contain 1 to
     *         63 alphanumeric characters</li> <li>Must begin with a letter or an
     *         underscore. Subsequent characters can be letters, underscores, or
     *         digits (0-9).</li> <li>Cannot be a word reserved by the specified
     *         database engine</li> </ul> <p> <b>Oracle</b> <p> The Oracle System ID
     *         (SID) of the created DB instance. <p>Default: <code>ORCL</code>
     *         <p>Constraints: <ul> <li>Cannot be longer than 8 characters</li> </ul>
     *         <p> <b>SQL Server</b> <p>Not applicable. Must be null. <p> <b>Amazon
     *         Aurora</b> <p>The name of the database to create when the primary
     *         instance of the DB cluster is created. If this parameter is not
     *         specified, no database is created in the DB instance. <p>Constraints:
     *         <ul> <li>Must contain 1 to 64 alphanumeric characters</li> <li>Cannot
     *         be a word reserved by the specified database engine</li> </ul>
     */
    public String getDBName() {
        return dBName;
    }
    
    /**
     * The meaning of this parameter differs according to the database engine
     * you use. <p>Type: String <p> <b>MySQL</b> <p>The name of the database
     * to create when the DB instance is created. If this parameter is not
     * specified, no database is created in the DB instance. <p>Constraints:
     * <ul> <li>Must contain 1 to 64 alphanumeric characters</li> <li>Cannot
     * be a word reserved by the specified database engine</li> </ul> <p>
     * <b>MariaDB</b> <p>The name of the database to create when the DB
     * instance is created. If this parameter is not specified, no database
     * is created in the DB instance. <p>Constraints: <ul> <li>Must contain 1
     * to 64 alphanumeric characters</li> <li>Cannot be a word reserved by
     * the specified database engine</li> </ul> <p> <b>PostgreSQL</b> <p>The
     * name of the database to create when the DB instance is created. If
     * this parameter is not specified, the default "postgres" database is
     * created in the DB instance. <p>Constraints: <ul> <li>Must contain 1 to
     * 63 alphanumeric characters</li> <li>Must begin with a letter or an
     * underscore. Subsequent characters can be letters, underscores, or
     * digits (0-9).</li> <li>Cannot be a word reserved by the specified
     * database engine</li> </ul> <p> <b>Oracle</b> <p> The Oracle System ID
     * (SID) of the created DB instance. <p>Default: <code>ORCL</code>
     * <p>Constraints: <ul> <li>Cannot be longer than 8 characters</li> </ul>
     * <p> <b>SQL Server</b> <p>Not applicable. Must be null. <p> <b>Amazon
     * Aurora</b> <p>The name of the database to create when the primary
     * instance of the DB cluster is created. If this parameter is not
     * specified, no database is created in the DB instance. <p>Constraints:
     * <ul> <li>Must contain 1 to 64 alphanumeric characters</li> <li>Cannot
     * be a word reserved by the specified database engine</li> </ul>
     *
     * @param dBName The meaning of this parameter differs according to the database engine
     *         you use. <p>Type: String <p> <b>MySQL</b> <p>The name of the database
     *         to create when the DB instance is created. If this parameter is not
     *         specified, no database is created in the DB instance. <p>Constraints:
     *         <ul> <li>Must contain 1 to 64 alphanumeric characters</li> <li>Cannot
     *         be a word reserved by the specified database engine</li> </ul> <p>
     *         <b>MariaDB</b> <p>The name of the database to create when the DB
     *         instance is created. If this parameter is not specified, no database
     *         is created in the DB instance. <p>Constraints: <ul> <li>Must contain 1
     *         to 64 alphanumeric characters</li> <li>Cannot be a word reserved by
     *         the specified database engine</li> </ul> <p> <b>PostgreSQL</b> <p>The
     *         name of the database to create when the DB instance is created. If
     *         this parameter is not specified, the default "postgres" database is
     *         created in the DB instance. <p>Constraints: <ul> <li>Must contain 1 to
     *         63 alphanumeric characters</li> <li>Must begin with a letter or an
     *         underscore. Subsequent characters can be letters, underscores, or
     *         digits (0-9).</li> <li>Cannot be a word reserved by the specified
     *         database engine</li> </ul> <p> <b>Oracle</b> <p> The Oracle System ID
     *         (SID) of the created DB instance. <p>Default: <code>ORCL</code>
     *         <p>Constraints: <ul> <li>Cannot be longer than 8 characters</li> </ul>
     *         <p> <b>SQL Server</b> <p>Not applicable. Must be null. <p> <b>Amazon
     *         Aurora</b> <p>The name of the database to create when the primary
     *         instance of the DB cluster is created. If this parameter is not
     *         specified, no database is created in the DB instance. <p>Constraints:
     *         <ul> <li>Must contain 1 to 64 alphanumeric characters</li> <li>Cannot
     *         be a word reserved by the specified database engine</li> </ul>
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }
    
    /**
     * The meaning of this parameter differs according to the database engine
     * you use. <p>Type: String <p> <b>MySQL</b> <p>The name of the database
     * to create when the DB instance is created. If this parameter is not
     * specified, no database is created in the DB instance. <p>Constraints:
     * <ul> <li>Must contain 1 to 64 alphanumeric characters</li> <li>Cannot
     * be a word reserved by the specified database engine</li> </ul> <p>
     * <b>MariaDB</b> <p>The name of the database to create when the DB
     * instance is created. If this parameter is not specified, no database
     * is created in the DB instance. <p>Constraints: <ul> <li>Must contain 1
     * to 64 alphanumeric characters</li> <li>Cannot be a word reserved by
     * the specified database engine</li> </ul> <p> <b>PostgreSQL</b> <p>The
     * name of the database to create when the DB instance is created. If
     * this parameter is not specified, the default "postgres" database is
     * created in the DB instance. <p>Constraints: <ul> <li>Must contain 1 to
     * 63 alphanumeric characters</li> <li>Must begin with a letter or an
     * underscore. Subsequent characters can be letters, underscores, or
     * digits (0-9).</li> <li>Cannot be a word reserved by the specified
     * database engine</li> </ul> <p> <b>Oracle</b> <p> The Oracle System ID
     * (SID) of the created DB instance. <p>Default: <code>ORCL</code>
     * <p>Constraints: <ul> <li>Cannot be longer than 8 characters</li> </ul>
     * <p> <b>SQL Server</b> <p>Not applicable. Must be null. <p> <b>Amazon
     * Aurora</b> <p>The name of the database to create when the primary
     * instance of the DB cluster is created. If this parameter is not
     * specified, no database is created in the DB instance. <p>Constraints:
     * <ul> <li>Must contain 1 to 64 alphanumeric characters</li> <li>Cannot
     * be a word reserved by the specified database engine</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBName The meaning of this parameter differs according to the database engine
     *         you use. <p>Type: String <p> <b>MySQL</b> <p>The name of the database
     *         to create when the DB instance is created. If this parameter is not
     *         specified, no database is created in the DB instance. <p>Constraints:
     *         <ul> <li>Must contain 1 to 64 alphanumeric characters</li> <li>Cannot
     *         be a word reserved by the specified database engine</li> </ul> <p>
     *         <b>MariaDB</b> <p>The name of the database to create when the DB
     *         instance is created. If this parameter is not specified, no database
     *         is created in the DB instance. <p>Constraints: <ul> <li>Must contain 1
     *         to 64 alphanumeric characters</li> <li>Cannot be a word reserved by
     *         the specified database engine</li> </ul> <p> <b>PostgreSQL</b> <p>The
     *         name of the database to create when the DB instance is created. If
     *         this parameter is not specified, the default "postgres" database is
     *         created in the DB instance. <p>Constraints: <ul> <li>Must contain 1 to
     *         63 alphanumeric characters</li> <li>Must begin with a letter or an
     *         underscore. Subsequent characters can be letters, underscores, or
     *         digits (0-9).</li> <li>Cannot be a word reserved by the specified
     *         database engine</li> </ul> <p> <b>Oracle</b> <p> The Oracle System ID
     *         (SID) of the created DB instance. <p>Default: <code>ORCL</code>
     *         <p>Constraints: <ul> <li>Cannot be longer than 8 characters</li> </ul>
     *         <p> <b>SQL Server</b> <p>Not applicable. Must be null. <p> <b>Amazon
     *         Aurora</b> <p>The name of the database to create when the primary
     *         instance of the DB cluster is created. If this parameter is not
     *         specified, no database is created in the DB instance. <p>Constraints:
     *         <ul> <li>Must contain 1 to 64 alphanumeric characters</li> <li>Cannot
     *         be a word reserved by the specified database engine</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * The DB instance identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens (1 to 15 for SQL Server).</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul> <p>Example:
     * <code>mydbinstance</code>
     *
     * @return The DB instance identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens (1 to 15 for SQL Server).</li>
     *         <li>First character must be a letter.</li> <li>Cannot end with a
     *         hyphen or contain two consecutive hyphens.</li> </ul> <p>Example:
     *         <code>mydbinstance</code>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens (1 to 15 for SQL Server).</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul> <p>Example:
     * <code>mydbinstance</code>
     *
     * @param dBInstanceIdentifier The DB instance identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens (1 to 15 for SQL Server).</li>
     *         <li>First character must be a letter.</li> <li>Cannot end with a
     *         hyphen or contain two consecutive hyphens.</li> </ul> <p>Example:
     *         <code>mydbinstance</code>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens (1 to 15 for SQL Server).</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul> <p>Example:
     * <code>mydbinstance</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB instance identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens (1 to 15 for SQL Server).</li>
     *         <li>First character must be a letter.</li> <li>Cannot end with a
     *         hyphen or contain two consecutive hyphens.</li> </ul> <p>Example:
     *         <code>mydbinstance</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * The amount of storage (in gigabytes) to be initially allocated for the
     * database instance. <p> Type: Integer <p> <b>MySQL</b> <p> Constraints:
     * Must be an integer from 5 to 6144. <p> <b>MariaDB</b> <p> Constraints:
     * Must be an integer from 5 to 6144. <p> <b>PostgreSQL</b> <p>
     * Constraints: Must be an integer from 5 to 6144. <p> <b>Oracle</b> <p>
     * Constraints: Must be an integer from 10 to 6144. <p> <b>SQL Server</b>
     * <p> Constraints: Must be an integer from 200 to 4096 (Standard Edition
     * and Enterprise Edition) or from 20 to 4096 (Express Edition and Web
     * Edition)
     *
     * @return The amount of storage (in gigabytes) to be initially allocated for the
     *         database instance. <p> Type: Integer <p> <b>MySQL</b> <p> Constraints:
     *         Must be an integer from 5 to 6144. <p> <b>MariaDB</b> <p> Constraints:
     *         Must be an integer from 5 to 6144. <p> <b>PostgreSQL</b> <p>
     *         Constraints: Must be an integer from 5 to 6144. <p> <b>Oracle</b> <p>
     *         Constraints: Must be an integer from 10 to 6144. <p> <b>SQL Server</b>
     *         <p> Constraints: Must be an integer from 200 to 4096 (Standard Edition
     *         and Enterprise Edition) or from 20 to 4096 (Express Edition and Web
     *         Edition)
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }
    
    /**
     * The amount of storage (in gigabytes) to be initially allocated for the
     * database instance. <p> Type: Integer <p> <b>MySQL</b> <p> Constraints:
     * Must be an integer from 5 to 6144. <p> <b>MariaDB</b> <p> Constraints:
     * Must be an integer from 5 to 6144. <p> <b>PostgreSQL</b> <p>
     * Constraints: Must be an integer from 5 to 6144. <p> <b>Oracle</b> <p>
     * Constraints: Must be an integer from 10 to 6144. <p> <b>SQL Server</b>
     * <p> Constraints: Must be an integer from 200 to 4096 (Standard Edition
     * and Enterprise Edition) or from 20 to 4096 (Express Edition and Web
     * Edition)
     *
     * @param allocatedStorage The amount of storage (in gigabytes) to be initially allocated for the
     *         database instance. <p> Type: Integer <p> <b>MySQL</b> <p> Constraints:
     *         Must be an integer from 5 to 6144. <p> <b>MariaDB</b> <p> Constraints:
     *         Must be an integer from 5 to 6144. <p> <b>PostgreSQL</b> <p>
     *         Constraints: Must be an integer from 5 to 6144. <p> <b>Oracle</b> <p>
     *         Constraints: Must be an integer from 10 to 6144. <p> <b>SQL Server</b>
     *         <p> Constraints: Must be an integer from 200 to 4096 (Standard Edition
     *         and Enterprise Edition) or from 20 to 4096 (Express Edition and Web
     *         Edition)
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }
    
    /**
     * The amount of storage (in gigabytes) to be initially allocated for the
     * database instance. <p> Type: Integer <p> <b>MySQL</b> <p> Constraints:
     * Must be an integer from 5 to 6144. <p> <b>MariaDB</b> <p> Constraints:
     * Must be an integer from 5 to 6144. <p> <b>PostgreSQL</b> <p>
     * Constraints: Must be an integer from 5 to 6144. <p> <b>Oracle</b> <p>
     * Constraints: Must be an integer from 10 to 6144. <p> <b>SQL Server</b>
     * <p> Constraints: Must be an integer from 200 to 4096 (Standard Edition
     * and Enterprise Edition) or from 20 to 4096 (Express Edition and Web
     * Edition)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocatedStorage The amount of storage (in gigabytes) to be initially allocated for the
     *         database instance. <p> Type: Integer <p> <b>MySQL</b> <p> Constraints:
     *         Must be an integer from 5 to 6144. <p> <b>MariaDB</b> <p> Constraints:
     *         Must be an integer from 5 to 6144. <p> <b>PostgreSQL</b> <p>
     *         Constraints: Must be an integer from 5 to 6144. <p> <b>Oracle</b> <p>
     *         Constraints: Must be an integer from 10 to 6144. <p> <b>SQL Server</b>
     *         <p> Constraints: Must be an integer from 200 to 4096 (Standard Edition
     *         and Enterprise Edition) or from 20 to 4096 (Express Edition and Web
     *         Edition)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * The compute and memory capacity of the DB instance. <p> Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     * db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge |
     * db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     * db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     * db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     * db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     * db.t2.medium | db.t2.large</code>
     *
     * @return The compute and memory capacity of the DB instance. <p> Valid Values:
     *         <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     *         db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge |
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
     * The compute and memory capacity of the DB instance. <p> Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     * db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge |
     * db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     * db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     * db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     * db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     * db.t2.medium | db.t2.large</code>
     *
     * @param dBInstanceClass The compute and memory capacity of the DB instance. <p> Valid Values:
     *         <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     *         db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge |
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
     * The compute and memory capacity of the DB instance. <p> Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     * db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge |
     * db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     * db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     * db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     * db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     * db.t2.medium | db.t2.large</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The compute and memory capacity of the DB instance. <p> Valid Values:
     *         <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     *         db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge |
     *         db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     *         db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     *         db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     *         db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     *         db.t2.medium | db.t2.large</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * The name of the database engine to be used for this instance. <p>
     * Valid Values: <code>MySQL</code> | <code>mariadb</code> |
     * <code>oracle-se1</code> | <code>oracle-se</code> |
     * <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     * <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     * <code>sqlserver-web</code> | <code>postgres</code> |
     * <code>aurora</code> <p> Not every database engine is available for
     * every AWS region.
     *
     * @return The name of the database engine to be used for this instance. <p>
     *         Valid Values: <code>MySQL</code> | <code>mariadb</code> |
     *         <code>oracle-se1</code> | <code>oracle-se</code> |
     *         <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     *         <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     *         <code>sqlserver-web</code> | <code>postgres</code> |
     *         <code>aurora</code> <p> Not every database engine is available for
     *         every AWS region.
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The name of the database engine to be used for this instance. <p>
     * Valid Values: <code>MySQL</code> | <code>mariadb</code> |
     * <code>oracle-se1</code> | <code>oracle-se</code> |
     * <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     * <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     * <code>sqlserver-web</code> | <code>postgres</code> |
     * <code>aurora</code> <p> Not every database engine is available for
     * every AWS region.
     *
     * @param engine The name of the database engine to be used for this instance. <p>
     *         Valid Values: <code>MySQL</code> | <code>mariadb</code> |
     *         <code>oracle-se1</code> | <code>oracle-se</code> |
     *         <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     *         <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     *         <code>sqlserver-web</code> | <code>postgres</code> |
     *         <code>aurora</code> <p> Not every database engine is available for
     *         every AWS region.
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The name of the database engine to be used for this instance. <p>
     * Valid Values: <code>MySQL</code> | <code>mariadb</code> |
     * <code>oracle-se1</code> | <code>oracle-se</code> |
     * <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     * <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     * <code>sqlserver-web</code> | <code>postgres</code> |
     * <code>aurora</code> <p> Not every database engine is available for
     * every AWS region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The name of the database engine to be used for this instance. <p>
     *         Valid Values: <code>MySQL</code> | <code>mariadb</code> |
     *         <code>oracle-se1</code> | <code>oracle-se</code> |
     *         <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     *         <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     *         <code>sqlserver-web</code> | <code>postgres</code> |
     *         <code>aurora</code> <p> Not every database engine is available for
     *         every AWS region.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * The name of master user for the client DB instance. <p> <b>MySQL</b>
     * <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     * <li>First character must be a letter.</li> <li>Cannot be a reserved
     * word for the chosen database engine.</li> </ul> <p> <b>MariaDB</b>
     * <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     * <li>Cannot be a reserved word for the chosen database engine.</li>
     * </ul> <p>Type: String <p> <b>Oracle</b> <p>Constraints: <ul> <li>Must
     * be 1 to 30 alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul> <p> <b>SQL Server</b> <p>Constraints: <ul> <li>Must
     * be 1 to 128 alphanumeric characters.</li> <li>First character must be
     * a letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul> <p> <b>PostgreSQL</b> <p>Constraints: <ul> <li>Must
     * be 1 to 63 alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul>
     *
     * @return The name of master user for the client DB instance. <p> <b>MySQL</b>
     *         <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     *         <li>First character must be a letter.</li> <li>Cannot be a reserved
     *         word for the chosen database engine.</li> </ul> <p> <b>MariaDB</b>
     *         <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     *         <li>Cannot be a reserved word for the chosen database engine.</li>
     *         </ul> <p>Type: String <p> <b>Oracle</b> <p>Constraints: <ul> <li>Must
     *         be 1 to 30 alphanumeric characters.</li> <li>First character must be a
     *         letter.</li> <li>Cannot be a reserved word for the chosen database
     *         engine.</li> </ul> <p> <b>SQL Server</b> <p>Constraints: <ul> <li>Must
     *         be 1 to 128 alphanumeric characters.</li> <li>First character must be
     *         a letter.</li> <li>Cannot be a reserved word for the chosen database
     *         engine.</li> </ul> <p> <b>PostgreSQL</b> <p>Constraints: <ul> <li>Must
     *         be 1 to 63 alphanumeric characters.</li> <li>First character must be a
     *         letter.</li> <li>Cannot be a reserved word for the chosen database
     *         engine.</li> </ul>
     */
    public String getMasterUsername() {
        return masterUsername;
    }
    
    /**
     * The name of master user for the client DB instance. <p> <b>MySQL</b>
     * <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     * <li>First character must be a letter.</li> <li>Cannot be a reserved
     * word for the chosen database engine.</li> </ul> <p> <b>MariaDB</b>
     * <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     * <li>Cannot be a reserved word for the chosen database engine.</li>
     * </ul> <p>Type: String <p> <b>Oracle</b> <p>Constraints: <ul> <li>Must
     * be 1 to 30 alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul> <p> <b>SQL Server</b> <p>Constraints: <ul> <li>Must
     * be 1 to 128 alphanumeric characters.</li> <li>First character must be
     * a letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul> <p> <b>PostgreSQL</b> <p>Constraints: <ul> <li>Must
     * be 1 to 63 alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul>
     *
     * @param masterUsername The name of master user for the client DB instance. <p> <b>MySQL</b>
     *         <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     *         <li>First character must be a letter.</li> <li>Cannot be a reserved
     *         word for the chosen database engine.</li> </ul> <p> <b>MariaDB</b>
     *         <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     *         <li>Cannot be a reserved word for the chosen database engine.</li>
     *         </ul> <p>Type: String <p> <b>Oracle</b> <p>Constraints: <ul> <li>Must
     *         be 1 to 30 alphanumeric characters.</li> <li>First character must be a
     *         letter.</li> <li>Cannot be a reserved word for the chosen database
     *         engine.</li> </ul> <p> <b>SQL Server</b> <p>Constraints: <ul> <li>Must
     *         be 1 to 128 alphanumeric characters.</li> <li>First character must be
     *         a letter.</li> <li>Cannot be a reserved word for the chosen database
     *         engine.</li> </ul> <p> <b>PostgreSQL</b> <p>Constraints: <ul> <li>Must
     *         be 1 to 63 alphanumeric characters.</li> <li>First character must be a
     *         letter.</li> <li>Cannot be a reserved word for the chosen database
     *         engine.</li> </ul>
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }
    
    /**
     * The name of master user for the client DB instance. <p> <b>MySQL</b>
     * <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     * <li>First character must be a letter.</li> <li>Cannot be a reserved
     * word for the chosen database engine.</li> </ul> <p> <b>MariaDB</b>
     * <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     * <li>Cannot be a reserved word for the chosen database engine.</li>
     * </ul> <p>Type: String <p> <b>Oracle</b> <p>Constraints: <ul> <li>Must
     * be 1 to 30 alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul> <p> <b>SQL Server</b> <p>Constraints: <ul> <li>Must
     * be 1 to 128 alphanumeric characters.</li> <li>First character must be
     * a letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul> <p> <b>PostgreSQL</b> <p>Constraints: <ul> <li>Must
     * be 1 to 63 alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUsername The name of master user for the client DB instance. <p> <b>MySQL</b>
     *         <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     *         <li>First character must be a letter.</li> <li>Cannot be a reserved
     *         word for the chosen database engine.</li> </ul> <p> <b>MariaDB</b>
     *         <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     *         <li>Cannot be a reserved word for the chosen database engine.</li>
     *         </ul> <p>Type: String <p> <b>Oracle</b> <p>Constraints: <ul> <li>Must
     *         be 1 to 30 alphanumeric characters.</li> <li>First character must be a
     *         letter.</li> <li>Cannot be a reserved word for the chosen database
     *         engine.</li> </ul> <p> <b>SQL Server</b> <p>Constraints: <ul> <li>Must
     *         be 1 to 128 alphanumeric characters.</li> <li>First character must be
     *         a letter.</li> <li>Cannot be a reserved word for the chosen database
     *         engine.</li> </ul> <p> <b>PostgreSQL</b> <p>Constraints: <ul> <li>Must
     *         be 1 to 63 alphanumeric characters.</li> <li>First character must be a
     *         letter.</li> <li>Cannot be a reserved word for the chosen database
     *         engine.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * The password for the master database user. Can be any printable ASCII
     * character except "/", """, or "@". <p>Type: String <p> <b>MySQL</b>
     * <p> Constraints: Must contain from 8 to 41 characters. <p>
     * <b>MariaDB</b> <p> Constraints: Must contain from 8 to 41 characters.
     * <p> <b>Oracle</b> <p> Constraints: Must contain from 8 to 30
     * characters. <p> <b>SQL Server</b> <p> Constraints: Must contain from 8
     * to 128 characters. <p> <b>PostgreSQL</b> <p> Constraints: Must contain
     * from 8 to 128 characters. <p> <b>Amazon Aurora</b> <p> Constraints:
     * Must contain from 8 to 41 characters.
     *
     * @return The password for the master database user. Can be any printable ASCII
     *         character except "/", """, or "@". <p>Type: String <p> <b>MySQL</b>
     *         <p> Constraints: Must contain from 8 to 41 characters. <p>
     *         <b>MariaDB</b> <p> Constraints: Must contain from 8 to 41 characters.
     *         <p> <b>Oracle</b> <p> Constraints: Must contain from 8 to 30
     *         characters. <p> <b>SQL Server</b> <p> Constraints: Must contain from 8
     *         to 128 characters. <p> <b>PostgreSQL</b> <p> Constraints: Must contain
     *         from 8 to 128 characters. <p> <b>Amazon Aurora</b> <p> Constraints:
     *         Must contain from 8 to 41 characters.
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }
    
    /**
     * The password for the master database user. Can be any printable ASCII
     * character except "/", """, or "@". <p>Type: String <p> <b>MySQL</b>
     * <p> Constraints: Must contain from 8 to 41 characters. <p>
     * <b>MariaDB</b> <p> Constraints: Must contain from 8 to 41 characters.
     * <p> <b>Oracle</b> <p> Constraints: Must contain from 8 to 30
     * characters. <p> <b>SQL Server</b> <p> Constraints: Must contain from 8
     * to 128 characters. <p> <b>PostgreSQL</b> <p> Constraints: Must contain
     * from 8 to 128 characters. <p> <b>Amazon Aurora</b> <p> Constraints:
     * Must contain from 8 to 41 characters.
     *
     * @param masterUserPassword The password for the master database user. Can be any printable ASCII
     *         character except "/", """, or "@". <p>Type: String <p> <b>MySQL</b>
     *         <p> Constraints: Must contain from 8 to 41 characters. <p>
     *         <b>MariaDB</b> <p> Constraints: Must contain from 8 to 41 characters.
     *         <p> <b>Oracle</b> <p> Constraints: Must contain from 8 to 30
     *         characters. <p> <b>SQL Server</b> <p> Constraints: Must contain from 8
     *         to 128 characters. <p> <b>PostgreSQL</b> <p> Constraints: Must contain
     *         from 8 to 128 characters. <p> <b>Amazon Aurora</b> <p> Constraints:
     *         Must contain from 8 to 41 characters.
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }
    
    /**
     * The password for the master database user. Can be any printable ASCII
     * character except "/", """, or "@". <p>Type: String <p> <b>MySQL</b>
     * <p> Constraints: Must contain from 8 to 41 characters. <p>
     * <b>MariaDB</b> <p> Constraints: Must contain from 8 to 41 characters.
     * <p> <b>Oracle</b> <p> Constraints: Must contain from 8 to 30
     * characters. <p> <b>SQL Server</b> <p> Constraints: Must contain from 8
     * to 128 characters. <p> <b>PostgreSQL</b> <p> Constraints: Must contain
     * from 8 to 128 characters. <p> <b>Amazon Aurora</b> <p> Constraints:
     * Must contain from 8 to 41 characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUserPassword The password for the master database user. Can be any printable ASCII
     *         character except "/", """, or "@". <p>Type: String <p> <b>MySQL</b>
     *         <p> Constraints: Must contain from 8 to 41 characters. <p>
     *         <b>MariaDB</b> <p> Constraints: Must contain from 8 to 41 characters.
     *         <p> <b>Oracle</b> <p> Constraints: Must contain from 8 to 30
     *         characters. <p> <b>SQL Server</b> <p> Constraints: Must contain from 8
     *         to 128 characters. <p> <b>PostgreSQL</b> <p> Constraints: Must contain
     *         from 8 to 128 characters. <p> <b>Amazon Aurora</b> <p> Constraints:
     *         Must contain from 8 to 41 characters.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * A list of DB security groups to associate with this DB instance. <p>
     * Default: The default DB security group for the database engine.
     *
     * @return A list of DB security groups to associate with this DB instance. <p>
     *         Default: The default DB security group for the database engine.
     */
    public java.util.List<String> getDBSecurityGroups() {
        if (dBSecurityGroups == null) {
              dBSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              dBSecurityGroups.setAutoConstruct(true);
        }
        return dBSecurityGroups;
    }
    
    /**
     * A list of DB security groups to associate with this DB instance. <p>
     * Default: The default DB security group for the database engine.
     *
     * @param dBSecurityGroups A list of DB security groups to associate with this DB instance. <p>
     *         Default: The default DB security group for the database engine.
     */
    public void setDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> dBSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dBSecurityGroups.size());
        dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        this.dBSecurityGroups = dBSecurityGroupsCopy;
    }
    
    /**
     * A list of DB security groups to associate with this DB instance. <p>
     * Default: The default DB security group for the database engine.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDBSecurityGroups(java.util.Collection)} or {@link
     * #withDBSecurityGroups(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of DB security groups to associate with this DB instance. <p>
     *         Default: The default DB security group for the database engine.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withDBSecurityGroups(String... dBSecurityGroups) {
        if (getDBSecurityGroups() == null) setDBSecurityGroups(new java.util.ArrayList<String>(dBSecurityGroups.length));
        for (String value : dBSecurityGroups) {
            getDBSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of DB security groups to associate with this DB instance. <p>
     * Default: The default DB security group for the database engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of DB security groups to associate with this DB instance. <p>
     *         Default: The default DB security group for the database engine.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> dBSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dBSecurityGroups.size());
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
            this.dBSecurityGroups = dBSecurityGroupsCopy;
        }

        return this;
    }

    /**
     * A list of EC2 VPC security groups to associate with this DB instance.
     * <p> Default: The default EC2 VPC security group for the DB subnet
     * group's VPC.
     *
     * @return A list of EC2 VPC security groups to associate with this DB instance.
     *         <p> Default: The default EC2 VPC security group for the DB subnet
     *         group's VPC.
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
              vpcSecurityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcSecurityGroupIds.setAutoConstruct(true);
        }
        return vpcSecurityGroupIds;
    }
    
    /**
     * A list of EC2 VPC security groups to associate with this DB instance.
     * <p> Default: The default EC2 VPC security group for the DB subnet
     * group's VPC.
     *
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB instance.
     *         <p> Default: The default EC2 VPC security group for the DB subnet
     *         group's VPC.
     */
    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcSecurityGroupIds.size());
        vpcSecurityGroupIdsCopy.addAll(vpcSecurityGroupIds);
        this.vpcSecurityGroupIds = vpcSecurityGroupIdsCopy;
    }
    
    /**
     * A list of EC2 VPC security groups to associate with this DB instance.
     * <p> Default: The default EC2 VPC security group for the DB subnet
     * group's VPC.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVpcSecurityGroupIds(java.util.Collection)} or
     * {@link #withVpcSecurityGroupIds(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB instance.
     *         <p> Default: The default EC2 VPC security group for the DB subnet
     *         group's VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (getVpcSecurityGroupIds() == null) setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        for (String value : vpcSecurityGroupIds) {
            getVpcSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of EC2 VPC security groups to associate with this DB instance.
     * <p> Default: The default EC2 VPC security group for the DB subnet
     * group's VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB instance.
     *         <p> Default: The default EC2 VPC security group for the DB subnet
     *         group's VPC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcSecurityGroupIds.size());
            vpcSecurityGroupIdsCopy.addAll(vpcSecurityGroupIds);
            this.vpcSecurityGroupIds = vpcSecurityGroupIdsCopy;
        }

        return this;
    }

    /**
     * The EC2 Availability Zone that the database instance will be created
     * in. For information on regions and Availability Zones, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>. <p> Default: A random, system-chosen
     * Availability Zone in the endpoint's region. <p> Example:
     * <code>us-east-1d</code> <p> Constraint: The AvailabilityZone parameter
     * cannot be specified if the MultiAZ parameter is set to
     * <code>true</code>. The specified Availability Zone must be in the same
     * region as the current endpoint.
     *
     * @return The EC2 Availability Zone that the database instance will be created
     *         in. For information on regions and Availability Zones, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     *         and Availability Zones</a>. <p> Default: A random, system-chosen
     *         Availability Zone in the endpoint's region. <p> Example:
     *         <code>us-east-1d</code> <p> Constraint: The AvailabilityZone parameter
     *         cannot be specified if the MultiAZ parameter is set to
     *         <code>true</code>. The specified Availability Zone must be in the same
     *         region as the current endpoint.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The EC2 Availability Zone that the database instance will be created
     * in. For information on regions and Availability Zones, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>. <p> Default: A random, system-chosen
     * Availability Zone in the endpoint's region. <p> Example:
     * <code>us-east-1d</code> <p> Constraint: The AvailabilityZone parameter
     * cannot be specified if the MultiAZ parameter is set to
     * <code>true</code>. The specified Availability Zone must be in the same
     * region as the current endpoint.
     *
     * @param availabilityZone The EC2 Availability Zone that the database instance will be created
     *         in. For information on regions and Availability Zones, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     *         and Availability Zones</a>. <p> Default: A random, system-chosen
     *         Availability Zone in the endpoint's region. <p> Example:
     *         <code>us-east-1d</code> <p> Constraint: The AvailabilityZone parameter
     *         cannot be specified if the MultiAZ parameter is set to
     *         <code>true</code>. The specified Availability Zone must be in the same
     *         region as the current endpoint.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The EC2 Availability Zone that the database instance will be created
     * in. For information on regions and Availability Zones, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>. <p> Default: A random, system-chosen
     * Availability Zone in the endpoint's region. <p> Example:
     * <code>us-east-1d</code> <p> Constraint: The AvailabilityZone parameter
     * cannot be specified if the MultiAZ parameter is set to
     * <code>true</code>. The specified Availability Zone must be in the same
     * region as the current endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The EC2 Availability Zone that the database instance will be created
     *         in. For information on regions and Availability Zones, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     *         and Availability Zones</a>. <p> Default: A random, system-chosen
     *         Availability Zone in the endpoint's region. <p> Example:
     *         <code>us-east-1d</code> <p> Constraint: The AvailabilityZone parameter
     *         cannot be specified if the MultiAZ parameter is set to
     *         <code>true</code>. The specified Availability Zone must be in the same
     *         region as the current endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * A DB subnet group to associate with this DB instance. <p> If there is
     * no DB subnet group, then it is a non-VPC DB instance.
     *
     * @return A DB subnet group to associate with this DB instance. <p> If there is
     *         no DB subnet group, then it is a non-VPC DB instance.
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }
    
    /**
     * A DB subnet group to associate with this DB instance. <p> If there is
     * no DB subnet group, then it is a non-VPC DB instance.
     *
     * @param dBSubnetGroupName A DB subnet group to associate with this DB instance. <p> If there is
     *         no DB subnet group, then it is a non-VPC DB instance.
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }
    
    /**
     * A DB subnet group to associate with this DB instance. <p> If there is
     * no DB subnet group, then it is a non-VPC DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroupName A DB subnet group to associate with this DB instance. <p> If there is
     *         no DB subnet group, then it is a non-VPC DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBMaintenance.html">DB
     * Instance Maintenance</a>. <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     *
     * @return The weekly time range during which system maintenance can occur, in
     *         Universal Coordinated Time (UTC). For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBMaintenance.html">DB
     *         Instance Maintenance</a>. <p> Format:
     *         <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A 30-minute window
     *         selected at random from an 8-hour block of time per region, occurring
     *         on a random day of the week. To see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         <p>Constraints: Minimum 30-minute window.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBMaintenance.html">DB
     * Instance Maintenance</a>. <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     *
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can occur, in
     *         Universal Coordinated Time (UTC). For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBMaintenance.html">DB
     *         Instance Maintenance</a>. <p> Format:
     *         <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A 30-minute window
     *         selected at random from an 8-hour block of time per region, occurring
     *         on a random day of the week. To see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         <p>Constraints: Minimum 30-minute window.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBMaintenance.html">DB
     * Instance Maintenance</a>. <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can occur, in
     *         Universal Coordinated Time (UTC). For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBMaintenance.html">DB
     *         Instance Maintenance</a>. <p> Format:
     *         <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A 30-minute window
     *         selected at random from an 8-hour block of time per region, occurring
     *         on a random day of the week. To see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         <p>Constraints: Minimum 30-minute window.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * The name of the DB parameter group to associate with this DB instance.
     * If this argument is omitted, the default DBParameterGroup for the
     * specified engine will be used. <p> Constraints: <ul> <li>Must be 1 to
     * 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @return The name of the DB parameter group to associate with this DB instance.
     *         If this argument is omitted, the default DBParameterGroup for the
     *         specified engine will be used. <p> Constraints: <ul> <li>Must be 1 to
     *         255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * The name of the DB parameter group to associate with this DB instance.
     * If this argument is omitted, the default DBParameterGroup for the
     * specified engine will be used. <p> Constraints: <ul> <li>Must be 1 to
     * 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @param dBParameterGroupName The name of the DB parameter group to associate with this DB instance.
     *         If this argument is omitted, the default DBParameterGroup for the
     *         specified engine will be used. <p> Constraints: <ul> <li>Must be 1 to
     *         255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * The name of the DB parameter group to associate with this DB instance.
     * If this argument is omitted, the default DBParameterGroup for the
     * specified engine will be used. <p> Constraints: <ul> <li>Must be 1 to
     * 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName The name of the DB parameter group to associate with this DB instance.
     *         If this argument is omitted, the default DBParameterGroup for the
     *         specified engine will be used. <p> Constraints: <ul> <li>Must be 1 to
     *         255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }

    /**
     * The number of days for which automated backups are retained. Setting
     * this parameter to a positive number enables backups. Setting this
     * parameter to 0 disables automated backups. <p> Default: 1
     * <p>Constraints: <ul> <li>Must be a value from 0 to 35</li> <li>Cannot
     * be set to 0 if the DB instance is a source to Read Replicas</li> </ul>
     *
     * @return The number of days for which automated backups are retained. Setting
     *         this parameter to a positive number enables backups. Setting this
     *         parameter to 0 disables automated backups. <p> Default: 1
     *         <p>Constraints: <ul> <li>Must be a value from 0 to 35</li> <li>Cannot
     *         be set to 0 if the DB instance is a source to Read Replicas</li> </ul>
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }
    
    /**
     * The number of days for which automated backups are retained. Setting
     * this parameter to a positive number enables backups. Setting this
     * parameter to 0 disables automated backups. <p> Default: 1
     * <p>Constraints: <ul> <li>Must be a value from 0 to 35</li> <li>Cannot
     * be set to 0 if the DB instance is a source to Read Replicas</li> </ul>
     *
     * @param backupRetentionPeriod The number of days for which automated backups are retained. Setting
     *         this parameter to a positive number enables backups. Setting this
     *         parameter to 0 disables automated backups. <p> Default: 1
     *         <p>Constraints: <ul> <li>Must be a value from 0 to 35</li> <li>Cannot
     *         be set to 0 if the DB instance is a source to Read Replicas</li> </ul>
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }
    
    /**
     * The number of days for which automated backups are retained. Setting
     * this parameter to a positive number enables backups. Setting this
     * parameter to 0 disables automated backups. <p> Default: 1
     * <p>Constraints: <ul> <li>Must be a value from 0 to 35</li> <li>Cannot
     * be set to 0 if the DB instance is a source to Read Replicas</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backupRetentionPeriod The number of days for which automated backups are retained. Setting
     *         this parameter to a positive number enables backups. Setting this
     *         parameter to 0 disables automated backups. <p> Default: 1
     *         <p>Constraints: <ul> <li>Must be a value from 0 to 35</li> <li>Cannot
     *         be set to 0 if the DB instance is a source to Read Replicas</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.BackingUpAndRestoringAmazonRDSInstances.html">DB
     * Instance Backups</a>. <p> Default: A 30-minute window selected at
     * random from an 8-hour block of time per region. To see the time blocks
     * available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     * <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     * Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     * maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     *
     * @return The daily time range during which automated backups are created if
     *         automated backups are enabled, using the
     *         <code>BackupRetentionPeriod</code> parameter. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.BackingUpAndRestoringAmazonRDSInstances.html">DB
     *         Instance Backups</a>. <p> Default: A 30-minute window selected at
     *         random from an 8-hour block of time per region. To see the time blocks
     *         available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     *         <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     *         Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     *         maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.BackingUpAndRestoringAmazonRDSInstances.html">DB
     * Instance Backups</a>. <p> Default: A 30-minute window selected at
     * random from an 8-hour block of time per region. To see the time blocks
     * available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     * <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     * Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     * maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled, using the
     *         <code>BackupRetentionPeriod</code> parameter. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.BackingUpAndRestoringAmazonRDSInstances.html">DB
     *         Instance Backups</a>. <p> Default: A 30-minute window selected at
     *         random from an 8-hour block of time per region. To see the time blocks
     *         available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     *         <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     *         Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     *         maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.BackingUpAndRestoringAmazonRDSInstances.html">DB
     * Instance Backups</a>. <p> Default: A 30-minute window selected at
     * random from an 8-hour block of time per region. To see the time blocks
     * available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     * <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     * Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     * maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled, using the
     *         <code>BackupRetentionPeriod</code> parameter. For more information,
     *         see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.BackingUpAndRestoringAmazonRDSInstances.html">DB
     *         Instance Backups</a>. <p> Default: A 30-minute window selected at
     *         random from an 8-hour block of time per region. To see the time blocks
     *         available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     *         <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     *         Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     *         maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * The port number on which the database accepts connections. <p>
     * <b>MySQL</b> <p> Default: <code>3306</code> <p> Valid Values:
     * <code>1150-65535</code> <p>Type: Integer <p> <b>MariaDB</b> <p>
     * Default: <code>3306</code> <p> Valid Values: <code>1150-65535</code>
     * <p>Type: Integer <p> <b>PostgreSQL</b> <p> Default: <code>5432</code>
     * <p> Valid Values: <code>1150-65535</code> <p>Type: Integer <p>
     * <b>Oracle</b> <p> Default: <code>1521</code> <p> Valid Values:
     * <code>1150-65535</code> <p> <b>SQL Server</b> <p> Default:
     * <code>1433</code> <p> Valid Values: <code>1150-65535</code> except for
     * <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * <p> <b>Amazon Aurora</b> <p> Default: <code>3306</code> <p> Valid
     * Values: <code>1150-65535</code> <p>Type: Integer
     *
     * @return The port number on which the database accepts connections. <p>
     *         <b>MySQL</b> <p> Default: <code>3306</code> <p> Valid Values:
     *         <code>1150-65535</code> <p>Type: Integer <p> <b>MariaDB</b> <p>
     *         Default: <code>3306</code> <p> Valid Values: <code>1150-65535</code>
     *         <p>Type: Integer <p> <b>PostgreSQL</b> <p> Default: <code>5432</code>
     *         <p> Valid Values: <code>1150-65535</code> <p>Type: Integer <p>
     *         <b>Oracle</b> <p> Default: <code>1521</code> <p> Valid Values:
     *         <code>1150-65535</code> <p> <b>SQL Server</b> <p> Default:
     *         <code>1433</code> <p> Valid Values: <code>1150-65535</code> except for
     *         <code>1434</code>, <code>3389</code>, <code>47001</code>,
     *         <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     *         <p> <b>Amazon Aurora</b> <p> Default: <code>3306</code> <p> Valid
     *         Values: <code>1150-65535</code> <p>Type: Integer
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which the database accepts connections. <p>
     * <b>MySQL</b> <p> Default: <code>3306</code> <p> Valid Values:
     * <code>1150-65535</code> <p>Type: Integer <p> <b>MariaDB</b> <p>
     * Default: <code>3306</code> <p> Valid Values: <code>1150-65535</code>
     * <p>Type: Integer <p> <b>PostgreSQL</b> <p> Default: <code>5432</code>
     * <p> Valid Values: <code>1150-65535</code> <p>Type: Integer <p>
     * <b>Oracle</b> <p> Default: <code>1521</code> <p> Valid Values:
     * <code>1150-65535</code> <p> <b>SQL Server</b> <p> Default:
     * <code>1433</code> <p> Valid Values: <code>1150-65535</code> except for
     * <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * <p> <b>Amazon Aurora</b> <p> Default: <code>3306</code> <p> Valid
     * Values: <code>1150-65535</code> <p>Type: Integer
     *
     * @param port The port number on which the database accepts connections. <p>
     *         <b>MySQL</b> <p> Default: <code>3306</code> <p> Valid Values:
     *         <code>1150-65535</code> <p>Type: Integer <p> <b>MariaDB</b> <p>
     *         Default: <code>3306</code> <p> Valid Values: <code>1150-65535</code>
     *         <p>Type: Integer <p> <b>PostgreSQL</b> <p> Default: <code>5432</code>
     *         <p> Valid Values: <code>1150-65535</code> <p>Type: Integer <p>
     *         <b>Oracle</b> <p> Default: <code>1521</code> <p> Valid Values:
     *         <code>1150-65535</code> <p> <b>SQL Server</b> <p> Default:
     *         <code>1433</code> <p> Valid Values: <code>1150-65535</code> except for
     *         <code>1434</code>, <code>3389</code>, <code>47001</code>,
     *         <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     *         <p> <b>Amazon Aurora</b> <p> Default: <code>3306</code> <p> Valid
     *         Values: <code>1150-65535</code> <p>Type: Integer
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which the database accepts connections. <p>
     * <b>MySQL</b> <p> Default: <code>3306</code> <p> Valid Values:
     * <code>1150-65535</code> <p>Type: Integer <p> <b>MariaDB</b> <p>
     * Default: <code>3306</code> <p> Valid Values: <code>1150-65535</code>
     * <p>Type: Integer <p> <b>PostgreSQL</b> <p> Default: <code>5432</code>
     * <p> Valid Values: <code>1150-65535</code> <p>Type: Integer <p>
     * <b>Oracle</b> <p> Default: <code>1521</code> <p> Valid Values:
     * <code>1150-65535</code> <p> <b>SQL Server</b> <p> Default:
     * <code>1433</code> <p> Valid Values: <code>1150-65535</code> except for
     * <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * <p> <b>Amazon Aurora</b> <p> Default: <code>3306</code> <p> Valid
     * Values: <code>1150-65535</code> <p>Type: Integer
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which the database accepts connections. <p>
     *         <b>MySQL</b> <p> Default: <code>3306</code> <p> Valid Values:
     *         <code>1150-65535</code> <p>Type: Integer <p> <b>MariaDB</b> <p>
     *         Default: <code>3306</code> <p> Valid Values: <code>1150-65535</code>
     *         <p>Type: Integer <p> <b>PostgreSQL</b> <p> Default: <code>5432</code>
     *         <p> Valid Values: <code>1150-65535</code> <p>Type: Integer <p>
     *         <b>Oracle</b> <p> Default: <code>1521</code> <p> Valid Values:
     *         <code>1150-65535</code> <p> <b>SQL Server</b> <p> Default:
     *         <code>1433</code> <p> Valid Values: <code>1150-65535</code> except for
     *         <code>1434</code>, <code>3389</code>, <code>47001</code>,
     *         <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     *         <p> <b>Amazon Aurora</b> <p> Default: <code>3306</code> <p> Valid
     *         Values: <code>1150-65535</code> <p>Type: Integer
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     * the AvailabilityZone parameter if the MultiAZ parameter is set to
     * true. Do not set this value if you want a Multi-AZ deployment for a
     * SQL Server DB instance. Multi-AZ for SQL Server is set using the
     * Mirroring option in an option group.
     *
     * @return Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     *         the AvailabilityZone parameter if the MultiAZ parameter is set to
     *         true. Do not set this value if you want a Multi-AZ deployment for a
     *         SQL Server DB instance. Multi-AZ for SQL Server is set using the
     *         Mirroring option in an option group.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     * the AvailabilityZone parameter if the MultiAZ parameter is set to
     * true. Do not set this value if you want a Multi-AZ deployment for a
     * SQL Server DB instance. Multi-AZ for SQL Server is set using the
     * Mirroring option in an option group.
     *
     * @param multiAZ Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     *         the AvailabilityZone parameter if the MultiAZ parameter is set to
     *         true. Do not set this value if you want a Multi-AZ deployment for a
     *         SQL Server DB instance. Multi-AZ for SQL Server is set using the
     *         Mirroring option in an option group.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     * the AvailabilityZone parameter if the MultiAZ parameter is set to
     * true. Do not set this value if you want a Multi-AZ deployment for a
     * SQL Server DB instance. Multi-AZ for SQL Server is set using the
     * Mirroring option in an option group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     *         the AvailabilityZone parameter if the MultiAZ parameter is set to
     *         true. Do not set this value if you want a Multi-AZ deployment for a
     *         SQL Server DB instance. Multi-AZ for SQL Server is set using the
     *         Mirroring option in an option group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     * the AvailabilityZone parameter if the MultiAZ parameter is set to
     * true. Do not set this value if you want a Multi-AZ deployment for a
     * SQL Server DB instance. Multi-AZ for SQL Server is set using the
     * Mirroring option in an option group.
     *
     * @return Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     *         the AvailabilityZone parameter if the MultiAZ parameter is set to
     *         true. Do not set this value if you want a Multi-AZ deployment for a
     *         SQL Server DB instance. Multi-AZ for SQL Server is set using the
     *         Mirroring option in an option group.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * The version number of the database engine to use. <p> The following
     * are the database engines and major and minor versions that are
     * available with Amazon RDS. Not every database engine is available for
     * every AWS region. <p><b>MySQL</b> <ul> <li><b>Version 5.1 (Only
     * available in the following regions: ap-northeast-1, ap-southeast-1,
     * ap-southeast-2, eu-west-1, sa-east-1, us-west-1, us-west-2):</b>
     * <code> 5.1.73a | 5.1.73b</code></li> <li><b>Version 5.5 (Only
     * available in the following regions: ap-northeast-1, ap-southeast-1,
     * ap-southeast-2, eu-west-1, sa-east-1, us-west-1, us-west-2):</b>
     * <code> 5.5.40 | 5.5.40a</code></li> <li><b>Version 5.5 (Available in
     * all regions):</b> <code> 5.5.40b | 5.5.41 | 5.5.42</code></li>
     * <li><b>Version 5.6 (Available in all regions):</b> <code> 5.6.19a |
     * 5.6.19b | 5.6.21 | 5.6.21b | 5.6.22 | 5.6.23 | 5.6.27</code></li>
     * <li><b>Version 5.7 (Available in all regions):</b> <code>
     * 5.7.10</code></li> </ul> <p><b>MariaDB</b> <ul> <li><b>Version 10.0
     * (Available in all regions except AWS GovCloud (US) Region
     * (us-gov-west-1)):</b> <code> 10.0.17 </code></li> </ul> <p><b>Oracle
     * Database Enterprise Edition (oracle-ee)</b> <ul> <li><b>Version 11.2
     * (Only available in the following regions: ap-northeast-1,
     * ap-southeast-1, ap-southeast-2, eu-west-1, sa-east-1, us-west-1,
     * us-west-2):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 | 11.2.0.2.v5 |
     * 11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version 11.2 (Available
     * in all regions):</b> <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 |
     * 11.2.0.4.v1 | 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version
     * 12.1 (Available in all regions):</b> <code>12.1.0.1.v1 | 12.1.0.1.v2 |
     * 12.1.0.2.v1 </code></li> </ul> <p><b>Oracle Database Standard Edition
     * (oracle-se)</b> <ul> <li><b>Version 11.2 (Only available in the
     * following regions: us-west-1):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 |
     * 11.2.0.2.v5 | 11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version
     * 11.2 (Only available in the following regions: eu-central-1,
     * us-west-1):</b> <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 |
     * 11.2.0.4.v1 | 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version
     * 12.1 (Only available in the following regions: eu-central-1,
     * us-west-1):</b> <code>12.1.0.1.v1 | 12.1.0.1.v2</code></li> </ul>
     * <p><b>Oracle Database Standard Edition One (oracle-se1)</b> <ul>
     * <li><b>Version 11.2 (Only available in the following regions:
     * us-west-1):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 | 11.2.0.2.v5 |
     * 11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version 11.2 (Only
     * available in the following regions: eu-central-1, us-west-1):</b>
     * <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 | 11.2.0.4.v1 |
     * 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version 12.1 (Only
     * available in the following regions: eu-central-1, us-west-1):</b>
     * <code> 12.1.0.1.v1 | 12.1.0.1.v2</code></li> </ul>
     * <p><b>PostgreSQL</b> <ul> <li><b>Version 9.3 (Only available in the
     * following regions: ap-northeast-1, ap-southeast-1, ap-southeast-2,
     * eu-west-1, sa-east-1, us-west-1, us-west-2):</b> <code> 9.3.1 |
     * 9.3.2</code></li> <li><b>Version 9.3 (Available in all regions):</b>
     * <code> 9.3.3 | 9.3.5 | 9.3.6 | 9.3.9 | 9.3.10</code></li>
     * <li><b>Version 9.4 (Available in all regions):</b> <code> 9.4.1 |
     * 9.4.4 | 9.4.5</code></li> </ul> <p><b>Microsoft SQL Server Enterprise
     * Edition (sqlserver-ee)</b> <ul> <li><b>Version 10.50 (Available in all
     * regions):</b> <code> 10.50.2789.0.v1</code></li> <li><b>Version 10.50
     * (Available in all regions):</b> <code> 10.50.6000.34.v1</code></li>
     * <li><b>Version 11.00 (Available in all regions):</b> <code>
     * 11.00.2100.60.v1</code></li> <li><b>Version 11.00 (Available in all
     * regions):</b> <code> 11.00.5058.0.v1</code></li> </ul> <p><b>Microsoft
     * SQL Server Express Edition (sqlserver-ex)</b> <ul> <li><b>Version
     * 10.50 (Available in all regions):</b> <code>
     * 10.50.2789.0.v1</code></li> <li><b>Version 10.50 (Available in all
     * regions):</b> <code> 10.50.6000.34.v1</code></li> <li><b>Version 11.00
     * (Available in all regions):</b> <code> 11.00.2100.60.v1</code></li>
     * <li><b>Version 11.00 (Available in all regions):</b> <code>
     * 11.00.5058.0.v1</code></li> <li><b>Version 12.00 (Available in all
     * regions):</b> <code> 12.00.4422.0.v1</code></li> </ul> <p><b>Microsoft
     * SQL Server Standard Edition (sqlserver-se)</b> <ul> <li><b>Version
     * 10.50 (Available in all regions):</b> <code>
     * 10.50.2789.0.v1</code></li> <li><b>Version 10.50 (Available in all
     * regions):</b> <code> 10.50.6000.34.v1</code></li> <li><b>Version 11.00
     * (Available in all regions):</b> <code> 11.00.2100.60.v1</code></li>
     * <li><b>Version 11.00 (Available in all regions):</b> <code>
     * 11.00.5058.0.v1</code></li> <li><b>Version 12.00 (Available in all
     * regions):</b> <code> 12.00.4422.0.v1</code></li> </ul> <p><b>Microsoft
     * SQL Server Web Edition (sqlserver-web)</b> <ul> <li><b>Version 10.50
     * (Available in all regions):</b> <code> 10.50.2789.0.v1</code></li>
     * <li><b>Version 10.50 (Available in all regions):</b> <code>
     * 10.50.6000.34.v1</code></li> <li><b>Version 11.00 (Available in all
     * regions):</b> <code> 11.00.2100.60.v1</code></li> <li><b>Version 11.00
     * (Available in all regions):</b> <code> 11.00.5058.0.v1</code></li>
     * <li><b>Version 12.00 (Available in all regions):</b> <code>
     * 12.00.4422.0.v1</code></li> </ul>
     *
     * @return The version number of the database engine to use. <p> The following
     *         are the database engines and major and minor versions that are
     *         available with Amazon RDS. Not every database engine is available for
     *         every AWS region. <p><b>MySQL</b> <ul> <li><b>Version 5.1 (Only
     *         available in the following regions: ap-northeast-1, ap-southeast-1,
     *         ap-southeast-2, eu-west-1, sa-east-1, us-west-1, us-west-2):</b>
     *         <code> 5.1.73a | 5.1.73b</code></li> <li><b>Version 5.5 (Only
     *         available in the following regions: ap-northeast-1, ap-southeast-1,
     *         ap-southeast-2, eu-west-1, sa-east-1, us-west-1, us-west-2):</b>
     *         <code> 5.5.40 | 5.5.40a</code></li> <li><b>Version 5.5 (Available in
     *         all regions):</b> <code> 5.5.40b | 5.5.41 | 5.5.42</code></li>
     *         <li><b>Version 5.6 (Available in all regions):</b> <code> 5.6.19a |
     *         5.6.19b | 5.6.21 | 5.6.21b | 5.6.22 | 5.6.23 | 5.6.27</code></li>
     *         <li><b>Version 5.7 (Available in all regions):</b> <code>
     *         5.7.10</code></li> </ul> <p><b>MariaDB</b> <ul> <li><b>Version 10.0
     *         (Available in all regions except AWS GovCloud (US) Region
     *         (us-gov-west-1)):</b> <code> 10.0.17 </code></li> </ul> <p><b>Oracle
     *         Database Enterprise Edition (oracle-ee)</b> <ul> <li><b>Version 11.2
     *         (Only available in the following regions: ap-northeast-1,
     *         ap-southeast-1, ap-southeast-2, eu-west-1, sa-east-1, us-west-1,
     *         us-west-2):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 | 11.2.0.2.v5 |
     *         11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version 11.2 (Available
     *         in all regions):</b> <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 |
     *         11.2.0.4.v1 | 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version
     *         12.1 (Available in all regions):</b> <code>12.1.0.1.v1 | 12.1.0.1.v2 |
     *         12.1.0.2.v1 </code></li> </ul> <p><b>Oracle Database Standard Edition
     *         (oracle-se)</b> <ul> <li><b>Version 11.2 (Only available in the
     *         following regions: us-west-1):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 |
     *         11.2.0.2.v5 | 11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version
     *         11.2 (Only available in the following regions: eu-central-1,
     *         us-west-1):</b> <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 |
     *         11.2.0.4.v1 | 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version
     *         12.1 (Only available in the following regions: eu-central-1,
     *         us-west-1):</b> <code>12.1.0.1.v1 | 12.1.0.1.v2</code></li> </ul>
     *         <p><b>Oracle Database Standard Edition One (oracle-se1)</b> <ul>
     *         <li><b>Version 11.2 (Only available in the following regions:
     *         us-west-1):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 | 11.2.0.2.v5 |
     *         11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version 11.2 (Only
     *         available in the following regions: eu-central-1, us-west-1):</b>
     *         <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 | 11.2.0.4.v1 |
     *         11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version 12.1 (Only
     *         available in the following regions: eu-central-1, us-west-1):</b>
     *         <code> 12.1.0.1.v1 | 12.1.0.1.v2</code></li> </ul>
     *         <p><b>PostgreSQL</b> <ul> <li><b>Version 9.3 (Only available in the
     *         following regions: ap-northeast-1, ap-southeast-1, ap-southeast-2,
     *         eu-west-1, sa-east-1, us-west-1, us-west-2):</b> <code> 9.3.1 |
     *         9.3.2</code></li> <li><b>Version 9.3 (Available in all regions):</b>
     *         <code> 9.3.3 | 9.3.5 | 9.3.6 | 9.3.9 | 9.3.10</code></li>
     *         <li><b>Version 9.4 (Available in all regions):</b> <code> 9.4.1 |
     *         9.4.4 | 9.4.5</code></li> </ul> <p><b>Microsoft SQL Server Enterprise
     *         Edition (sqlserver-ee)</b> <ul> <li><b>Version 10.50 (Available in all
     *         regions):</b> <code> 10.50.2789.0.v1</code></li> <li><b>Version 10.50
     *         (Available in all regions):</b> <code> 10.50.6000.34.v1</code></li>
     *         <li><b>Version 11.00 (Available in all regions):</b> <code>
     *         11.00.2100.60.v1</code></li> <li><b>Version 11.00 (Available in all
     *         regions):</b> <code> 11.00.5058.0.v1</code></li> </ul> <p><b>Microsoft
     *         SQL Server Express Edition (sqlserver-ex)</b> <ul> <li><b>Version
     *         10.50 (Available in all regions):</b> <code>
     *         10.50.2789.0.v1</code></li> <li><b>Version 10.50 (Available in all
     *         regions):</b> <code> 10.50.6000.34.v1</code></li> <li><b>Version 11.00
     *         (Available in all regions):</b> <code> 11.00.2100.60.v1</code></li>
     *         <li><b>Version 11.00 (Available in all regions):</b> <code>
     *         11.00.5058.0.v1</code></li> <li><b>Version 12.00 (Available in all
     *         regions):</b> <code> 12.00.4422.0.v1</code></li> </ul> <p><b>Microsoft
     *         SQL Server Standard Edition (sqlserver-se)</b> <ul> <li><b>Version
     *         10.50 (Available in all regions):</b> <code>
     *         10.50.2789.0.v1</code></li> <li><b>Version 10.50 (Available in all
     *         regions):</b> <code> 10.50.6000.34.v1</code></li> <li><b>Version 11.00
     *         (Available in all regions):</b> <code> 11.00.2100.60.v1</code></li>
     *         <li><b>Version 11.00 (Available in all regions):</b> <code>
     *         11.00.5058.0.v1</code></li> <li><b>Version 12.00 (Available in all
     *         regions):</b> <code> 12.00.4422.0.v1</code></li> </ul> <p><b>Microsoft
     *         SQL Server Web Edition (sqlserver-web)</b> <ul> <li><b>Version 10.50
     *         (Available in all regions):</b> <code> 10.50.2789.0.v1</code></li>
     *         <li><b>Version 10.50 (Available in all regions):</b> <code>
     *         10.50.6000.34.v1</code></li> <li><b>Version 11.00 (Available in all
     *         regions):</b> <code> 11.00.2100.60.v1</code></li> <li><b>Version 11.00
     *         (Available in all regions):</b> <code> 11.00.5058.0.v1</code></li>
     *         <li><b>Version 12.00 (Available in all regions):</b> <code>
     *         12.00.4422.0.v1</code></li> </ul>
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The version number of the database engine to use. <p> The following
     * are the database engines and major and minor versions that are
     * available with Amazon RDS. Not every database engine is available for
     * every AWS region. <p><b>MySQL</b> <ul> <li><b>Version 5.1 (Only
     * available in the following regions: ap-northeast-1, ap-southeast-1,
     * ap-southeast-2, eu-west-1, sa-east-1, us-west-1, us-west-2):</b>
     * <code> 5.1.73a | 5.1.73b</code></li> <li><b>Version 5.5 (Only
     * available in the following regions: ap-northeast-1, ap-southeast-1,
     * ap-southeast-2, eu-west-1, sa-east-1, us-west-1, us-west-2):</b>
     * <code> 5.5.40 | 5.5.40a</code></li> <li><b>Version 5.5 (Available in
     * all regions):</b> <code> 5.5.40b | 5.5.41 | 5.5.42</code></li>
     * <li><b>Version 5.6 (Available in all regions):</b> <code> 5.6.19a |
     * 5.6.19b | 5.6.21 | 5.6.21b | 5.6.22 | 5.6.23 | 5.6.27</code></li>
     * <li><b>Version 5.7 (Available in all regions):</b> <code>
     * 5.7.10</code></li> </ul> <p><b>MariaDB</b> <ul> <li><b>Version 10.0
     * (Available in all regions except AWS GovCloud (US) Region
     * (us-gov-west-1)):</b> <code> 10.0.17 </code></li> </ul> <p><b>Oracle
     * Database Enterprise Edition (oracle-ee)</b> <ul> <li><b>Version 11.2
     * (Only available in the following regions: ap-northeast-1,
     * ap-southeast-1, ap-southeast-2, eu-west-1, sa-east-1, us-west-1,
     * us-west-2):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 | 11.2.0.2.v5 |
     * 11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version 11.2 (Available
     * in all regions):</b> <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 |
     * 11.2.0.4.v1 | 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version
     * 12.1 (Available in all regions):</b> <code>12.1.0.1.v1 | 12.1.0.1.v2 |
     * 12.1.0.2.v1 </code></li> </ul> <p><b>Oracle Database Standard Edition
     * (oracle-se)</b> <ul> <li><b>Version 11.2 (Only available in the
     * following regions: us-west-1):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 |
     * 11.2.0.2.v5 | 11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version
     * 11.2 (Only available in the following regions: eu-central-1,
     * us-west-1):</b> <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 |
     * 11.2.0.4.v1 | 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version
     * 12.1 (Only available in the following regions: eu-central-1,
     * us-west-1):</b> <code>12.1.0.1.v1 | 12.1.0.1.v2</code></li> </ul>
     * <p><b>Oracle Database Standard Edition One (oracle-se1)</b> <ul>
     * <li><b>Version 11.2 (Only available in the following regions:
     * us-west-1):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 | 11.2.0.2.v5 |
     * 11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version 11.2 (Only
     * available in the following regions: eu-central-1, us-west-1):</b>
     * <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 | 11.2.0.4.v1 |
     * 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version 12.1 (Only
     * available in the following regions: eu-central-1, us-west-1):</b>
     * <code> 12.1.0.1.v1 | 12.1.0.1.v2</code></li> </ul>
     * <p><b>PostgreSQL</b> <ul> <li><b>Version 9.3 (Only available in the
     * following regions: ap-northeast-1, ap-southeast-1, ap-southeast-2,
     * eu-west-1, sa-east-1, us-west-1, us-west-2):</b> <code> 9.3.1 |
     * 9.3.2</code></li> <li><b>Version 9.3 (Available in all regions):</b>
     * <code> 9.3.3 | 9.3.5 | 9.3.6 | 9.3.9 | 9.3.10</code></li>
     * <li><b>Version 9.4 (Available in all regions):</b> <code> 9.4.1 |
     * 9.4.4 | 9.4.5</code></li> </ul> <p><b>Microsoft SQL Server Enterprise
     * Edition (sqlserver-ee)</b> <ul> <li><b>Version 10.50 (Available in all
     * regions):</b> <code> 10.50.2789.0.v1</code></li> <li><b>Version 10.50
     * (Available in all regions):</b> <code> 10.50.6000.34.v1</code></li>
     * <li><b>Version 11.00 (Available in all regions):</b> <code>
     * 11.00.2100.60.v1</code></li> <li><b>Version 11.00 (Available in all
     * regions):</b> <code> 11.00.5058.0.v1</code></li> </ul> <p><b>Microsoft
     * SQL Server Express Edition (sqlserver-ex)</b> <ul> <li><b>Version
     * 10.50 (Available in all regions):</b> <code>
     * 10.50.2789.0.v1</code></li> <li><b>Version 10.50 (Available in all
     * regions):</b> <code> 10.50.6000.34.v1</code></li> <li><b>Version 11.00
     * (Available in all regions):</b> <code> 11.00.2100.60.v1</code></li>
     * <li><b>Version 11.00 (Available in all regions):</b> <code>
     * 11.00.5058.0.v1</code></li> <li><b>Version 12.00 (Available in all
     * regions):</b> <code> 12.00.4422.0.v1</code></li> </ul> <p><b>Microsoft
     * SQL Server Standard Edition (sqlserver-se)</b> <ul> <li><b>Version
     * 10.50 (Available in all regions):</b> <code>
     * 10.50.2789.0.v1</code></li> <li><b>Version 10.50 (Available in all
     * regions):</b> <code> 10.50.6000.34.v1</code></li> <li><b>Version 11.00
     * (Available in all regions):</b> <code> 11.00.2100.60.v1</code></li>
     * <li><b>Version 11.00 (Available in all regions):</b> <code>
     * 11.00.5058.0.v1</code></li> <li><b>Version 12.00 (Available in all
     * regions):</b> <code> 12.00.4422.0.v1</code></li> </ul> <p><b>Microsoft
     * SQL Server Web Edition (sqlserver-web)</b> <ul> <li><b>Version 10.50
     * (Available in all regions):</b> <code> 10.50.2789.0.v1</code></li>
     * <li><b>Version 10.50 (Available in all regions):</b> <code>
     * 10.50.6000.34.v1</code></li> <li><b>Version 11.00 (Available in all
     * regions):</b> <code> 11.00.2100.60.v1</code></li> <li><b>Version 11.00
     * (Available in all regions):</b> <code> 11.00.5058.0.v1</code></li>
     * <li><b>Version 12.00 (Available in all regions):</b> <code>
     * 12.00.4422.0.v1</code></li> </ul>
     *
     * @param engineVersion The version number of the database engine to use. <p> The following
     *         are the database engines and major and minor versions that are
     *         available with Amazon RDS. Not every database engine is available for
     *         every AWS region. <p><b>MySQL</b> <ul> <li><b>Version 5.1 (Only
     *         available in the following regions: ap-northeast-1, ap-southeast-1,
     *         ap-southeast-2, eu-west-1, sa-east-1, us-west-1, us-west-2):</b>
     *         <code> 5.1.73a | 5.1.73b</code></li> <li><b>Version 5.5 (Only
     *         available in the following regions: ap-northeast-1, ap-southeast-1,
     *         ap-southeast-2, eu-west-1, sa-east-1, us-west-1, us-west-2):</b>
     *         <code> 5.5.40 | 5.5.40a</code></li> <li><b>Version 5.5 (Available in
     *         all regions):</b> <code> 5.5.40b | 5.5.41 | 5.5.42</code></li>
     *         <li><b>Version 5.6 (Available in all regions):</b> <code> 5.6.19a |
     *         5.6.19b | 5.6.21 | 5.6.21b | 5.6.22 | 5.6.23 | 5.6.27</code></li>
     *         <li><b>Version 5.7 (Available in all regions):</b> <code>
     *         5.7.10</code></li> </ul> <p><b>MariaDB</b> <ul> <li><b>Version 10.0
     *         (Available in all regions except AWS GovCloud (US) Region
     *         (us-gov-west-1)):</b> <code> 10.0.17 </code></li> </ul> <p><b>Oracle
     *         Database Enterprise Edition (oracle-ee)</b> <ul> <li><b>Version 11.2
     *         (Only available in the following regions: ap-northeast-1,
     *         ap-southeast-1, ap-southeast-2, eu-west-1, sa-east-1, us-west-1,
     *         us-west-2):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 | 11.2.0.2.v5 |
     *         11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version 11.2 (Available
     *         in all regions):</b> <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 |
     *         11.2.0.4.v1 | 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version
     *         12.1 (Available in all regions):</b> <code>12.1.0.1.v1 | 12.1.0.1.v2 |
     *         12.1.0.2.v1 </code></li> </ul> <p><b>Oracle Database Standard Edition
     *         (oracle-se)</b> <ul> <li><b>Version 11.2 (Only available in the
     *         following regions: us-west-1):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 |
     *         11.2.0.2.v5 | 11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version
     *         11.2 (Only available in the following regions: eu-central-1,
     *         us-west-1):</b> <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 |
     *         11.2.0.4.v1 | 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version
     *         12.1 (Only available in the following regions: eu-central-1,
     *         us-west-1):</b> <code>12.1.0.1.v1 | 12.1.0.1.v2</code></li> </ul>
     *         <p><b>Oracle Database Standard Edition One (oracle-se1)</b> <ul>
     *         <li><b>Version 11.2 (Only available in the following regions:
     *         us-west-1):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 | 11.2.0.2.v5 |
     *         11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version 11.2 (Only
     *         available in the following regions: eu-central-1, us-west-1):</b>
     *         <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 | 11.2.0.4.v1 |
     *         11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version 12.1 (Only
     *         available in the following regions: eu-central-1, us-west-1):</b>
     *         <code> 12.1.0.1.v1 | 12.1.0.1.v2</code></li> </ul>
     *         <p><b>PostgreSQL</b> <ul> <li><b>Version 9.3 (Only available in the
     *         following regions: ap-northeast-1, ap-southeast-1, ap-southeast-2,
     *         eu-west-1, sa-east-1, us-west-1, us-west-2):</b> <code> 9.3.1 |
     *         9.3.2</code></li> <li><b>Version 9.3 (Available in all regions):</b>
     *         <code> 9.3.3 | 9.3.5 | 9.3.6 | 9.3.9 | 9.3.10</code></li>
     *         <li><b>Version 9.4 (Available in all regions):</b> <code> 9.4.1 |
     *         9.4.4 | 9.4.5</code></li> </ul> <p><b>Microsoft SQL Server Enterprise
     *         Edition (sqlserver-ee)</b> <ul> <li><b>Version 10.50 (Available in all
     *         regions):</b> <code> 10.50.2789.0.v1</code></li> <li><b>Version 10.50
     *         (Available in all regions):</b> <code> 10.50.6000.34.v1</code></li>
     *         <li><b>Version 11.00 (Available in all regions):</b> <code>
     *         11.00.2100.60.v1</code></li> <li><b>Version 11.00 (Available in all
     *         regions):</b> <code> 11.00.5058.0.v1</code></li> </ul> <p><b>Microsoft
     *         SQL Server Express Edition (sqlserver-ex)</b> <ul> <li><b>Version
     *         10.50 (Available in all regions):</b> <code>
     *         10.50.2789.0.v1</code></li> <li><b>Version 10.50 (Available in all
     *         regions):</b> <code> 10.50.6000.34.v1</code></li> <li><b>Version 11.00
     *         (Available in all regions):</b> <code> 11.00.2100.60.v1</code></li>
     *         <li><b>Version 11.00 (Available in all regions):</b> <code>
     *         11.00.5058.0.v1</code></li> <li><b>Version 12.00 (Available in all
     *         regions):</b> <code> 12.00.4422.0.v1</code></li> </ul> <p><b>Microsoft
     *         SQL Server Standard Edition (sqlserver-se)</b> <ul> <li><b>Version
     *         10.50 (Available in all regions):</b> <code>
     *         10.50.2789.0.v1</code></li> <li><b>Version 10.50 (Available in all
     *         regions):</b> <code> 10.50.6000.34.v1</code></li> <li><b>Version 11.00
     *         (Available in all regions):</b> <code> 11.00.2100.60.v1</code></li>
     *         <li><b>Version 11.00 (Available in all regions):</b> <code>
     *         11.00.5058.0.v1</code></li> <li><b>Version 12.00 (Available in all
     *         regions):</b> <code> 12.00.4422.0.v1</code></li> </ul> <p><b>Microsoft
     *         SQL Server Web Edition (sqlserver-web)</b> <ul> <li><b>Version 10.50
     *         (Available in all regions):</b> <code> 10.50.2789.0.v1</code></li>
     *         <li><b>Version 10.50 (Available in all regions):</b> <code>
     *         10.50.6000.34.v1</code></li> <li><b>Version 11.00 (Available in all
     *         regions):</b> <code> 11.00.2100.60.v1</code></li> <li><b>Version 11.00
     *         (Available in all regions):</b> <code> 11.00.5058.0.v1</code></li>
     *         <li><b>Version 12.00 (Available in all regions):</b> <code>
     *         12.00.4422.0.v1</code></li> </ul>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The version number of the database engine to use. <p> The following
     * are the database engines and major and minor versions that are
     * available with Amazon RDS. Not every database engine is available for
     * every AWS region. <p><b>MySQL</b> <ul> <li><b>Version 5.1 (Only
     * available in the following regions: ap-northeast-1, ap-southeast-1,
     * ap-southeast-2, eu-west-1, sa-east-1, us-west-1, us-west-2):</b>
     * <code> 5.1.73a | 5.1.73b</code></li> <li><b>Version 5.5 (Only
     * available in the following regions: ap-northeast-1, ap-southeast-1,
     * ap-southeast-2, eu-west-1, sa-east-1, us-west-1, us-west-2):</b>
     * <code> 5.5.40 | 5.5.40a</code></li> <li><b>Version 5.5 (Available in
     * all regions):</b> <code> 5.5.40b | 5.5.41 | 5.5.42</code></li>
     * <li><b>Version 5.6 (Available in all regions):</b> <code> 5.6.19a |
     * 5.6.19b | 5.6.21 | 5.6.21b | 5.6.22 | 5.6.23 | 5.6.27</code></li>
     * <li><b>Version 5.7 (Available in all regions):</b> <code>
     * 5.7.10</code></li> </ul> <p><b>MariaDB</b> <ul> <li><b>Version 10.0
     * (Available in all regions except AWS GovCloud (US) Region
     * (us-gov-west-1)):</b> <code> 10.0.17 </code></li> </ul> <p><b>Oracle
     * Database Enterprise Edition (oracle-ee)</b> <ul> <li><b>Version 11.2
     * (Only available in the following regions: ap-northeast-1,
     * ap-southeast-1, ap-southeast-2, eu-west-1, sa-east-1, us-west-1,
     * us-west-2):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 | 11.2.0.2.v5 |
     * 11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version 11.2 (Available
     * in all regions):</b> <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 |
     * 11.2.0.4.v1 | 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version
     * 12.1 (Available in all regions):</b> <code>12.1.0.1.v1 | 12.1.0.1.v2 |
     * 12.1.0.2.v1 </code></li> </ul> <p><b>Oracle Database Standard Edition
     * (oracle-se)</b> <ul> <li><b>Version 11.2 (Only available in the
     * following regions: us-west-1):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 |
     * 11.2.0.2.v5 | 11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version
     * 11.2 (Only available in the following regions: eu-central-1,
     * us-west-1):</b> <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 |
     * 11.2.0.4.v1 | 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version
     * 12.1 (Only available in the following regions: eu-central-1,
     * us-west-1):</b> <code>12.1.0.1.v1 | 12.1.0.1.v2</code></li> </ul>
     * <p><b>Oracle Database Standard Edition One (oracle-se1)</b> <ul>
     * <li><b>Version 11.2 (Only available in the following regions:
     * us-west-1):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 | 11.2.0.2.v5 |
     * 11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version 11.2 (Only
     * available in the following regions: eu-central-1, us-west-1):</b>
     * <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 | 11.2.0.4.v1 |
     * 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version 12.1 (Only
     * available in the following regions: eu-central-1, us-west-1):</b>
     * <code> 12.1.0.1.v1 | 12.1.0.1.v2</code></li> </ul>
     * <p><b>PostgreSQL</b> <ul> <li><b>Version 9.3 (Only available in the
     * following regions: ap-northeast-1, ap-southeast-1, ap-southeast-2,
     * eu-west-1, sa-east-1, us-west-1, us-west-2):</b> <code> 9.3.1 |
     * 9.3.2</code></li> <li><b>Version 9.3 (Available in all regions):</b>
     * <code> 9.3.3 | 9.3.5 | 9.3.6 | 9.3.9 | 9.3.10</code></li>
     * <li><b>Version 9.4 (Available in all regions):</b> <code> 9.4.1 |
     * 9.4.4 | 9.4.5</code></li> </ul> <p><b>Microsoft SQL Server Enterprise
     * Edition (sqlserver-ee)</b> <ul> <li><b>Version 10.50 (Available in all
     * regions):</b> <code> 10.50.2789.0.v1</code></li> <li><b>Version 10.50
     * (Available in all regions):</b> <code> 10.50.6000.34.v1</code></li>
     * <li><b>Version 11.00 (Available in all regions):</b> <code>
     * 11.00.2100.60.v1</code></li> <li><b>Version 11.00 (Available in all
     * regions):</b> <code> 11.00.5058.0.v1</code></li> </ul> <p><b>Microsoft
     * SQL Server Express Edition (sqlserver-ex)</b> <ul> <li><b>Version
     * 10.50 (Available in all regions):</b> <code>
     * 10.50.2789.0.v1</code></li> <li><b>Version 10.50 (Available in all
     * regions):</b> <code> 10.50.6000.34.v1</code></li> <li><b>Version 11.00
     * (Available in all regions):</b> <code> 11.00.2100.60.v1</code></li>
     * <li><b>Version 11.00 (Available in all regions):</b> <code>
     * 11.00.5058.0.v1</code></li> <li><b>Version 12.00 (Available in all
     * regions):</b> <code> 12.00.4422.0.v1</code></li> </ul> <p><b>Microsoft
     * SQL Server Standard Edition (sqlserver-se)</b> <ul> <li><b>Version
     * 10.50 (Available in all regions):</b> <code>
     * 10.50.2789.0.v1</code></li> <li><b>Version 10.50 (Available in all
     * regions):</b> <code> 10.50.6000.34.v1</code></li> <li><b>Version 11.00
     * (Available in all regions):</b> <code> 11.00.2100.60.v1</code></li>
     * <li><b>Version 11.00 (Available in all regions):</b> <code>
     * 11.00.5058.0.v1</code></li> <li><b>Version 12.00 (Available in all
     * regions):</b> <code> 12.00.4422.0.v1</code></li> </ul> <p><b>Microsoft
     * SQL Server Web Edition (sqlserver-web)</b> <ul> <li><b>Version 10.50
     * (Available in all regions):</b> <code> 10.50.2789.0.v1</code></li>
     * <li><b>Version 10.50 (Available in all regions):</b> <code>
     * 10.50.6000.34.v1</code></li> <li><b>Version 11.00 (Available in all
     * regions):</b> <code> 11.00.2100.60.v1</code></li> <li><b>Version 11.00
     * (Available in all regions):</b> <code> 11.00.5058.0.v1</code></li>
     * <li><b>Version 12.00 (Available in all regions):</b> <code>
     * 12.00.4422.0.v1</code></li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version number of the database engine to use. <p> The following
     *         are the database engines and major and minor versions that are
     *         available with Amazon RDS. Not every database engine is available for
     *         every AWS region. <p><b>MySQL</b> <ul> <li><b>Version 5.1 (Only
     *         available in the following regions: ap-northeast-1, ap-southeast-1,
     *         ap-southeast-2, eu-west-1, sa-east-1, us-west-1, us-west-2):</b>
     *         <code> 5.1.73a | 5.1.73b</code></li> <li><b>Version 5.5 (Only
     *         available in the following regions: ap-northeast-1, ap-southeast-1,
     *         ap-southeast-2, eu-west-1, sa-east-1, us-west-1, us-west-2):</b>
     *         <code> 5.5.40 | 5.5.40a</code></li> <li><b>Version 5.5 (Available in
     *         all regions):</b> <code> 5.5.40b | 5.5.41 | 5.5.42</code></li>
     *         <li><b>Version 5.6 (Available in all regions):</b> <code> 5.6.19a |
     *         5.6.19b | 5.6.21 | 5.6.21b | 5.6.22 | 5.6.23 | 5.6.27</code></li>
     *         <li><b>Version 5.7 (Available in all regions):</b> <code>
     *         5.7.10</code></li> </ul> <p><b>MariaDB</b> <ul> <li><b>Version 10.0
     *         (Available in all regions except AWS GovCloud (US) Region
     *         (us-gov-west-1)):</b> <code> 10.0.17 </code></li> </ul> <p><b>Oracle
     *         Database Enterprise Edition (oracle-ee)</b> <ul> <li><b>Version 11.2
     *         (Only available in the following regions: ap-northeast-1,
     *         ap-southeast-1, ap-southeast-2, eu-west-1, sa-east-1, us-west-1,
     *         us-west-2):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 | 11.2.0.2.v5 |
     *         11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version 11.2 (Available
     *         in all regions):</b> <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 |
     *         11.2.0.4.v1 | 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version
     *         12.1 (Available in all regions):</b> <code>12.1.0.1.v1 | 12.1.0.1.v2 |
     *         12.1.0.2.v1 </code></li> </ul> <p><b>Oracle Database Standard Edition
     *         (oracle-se)</b> <ul> <li><b>Version 11.2 (Only available in the
     *         following regions: us-west-1):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 |
     *         11.2.0.2.v5 | 11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version
     *         11.2 (Only available in the following regions: eu-central-1,
     *         us-west-1):</b> <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 |
     *         11.2.0.4.v1 | 11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version
     *         12.1 (Only available in the following regions: eu-central-1,
     *         us-west-1):</b> <code>12.1.0.1.v1 | 12.1.0.1.v2</code></li> </ul>
     *         <p><b>Oracle Database Standard Edition One (oracle-se1)</b> <ul>
     *         <li><b>Version 11.2 (Only available in the following regions:
     *         us-west-1):</b> <code> 11.2.0.2.v3 | 11.2.0.2.v4 | 11.2.0.2.v5 |
     *         11.2.0.2.v6 | 11.2.0.2.v7</code></li> <li><b>Version 11.2 (Only
     *         available in the following regions: eu-central-1, us-west-1):</b>
     *         <code> 11.2.0.3.v1 | 11.2.0.3.v2 | 11.2.0.3.v3 | 11.2.0.4.v1 |
     *         11.2.0.4.v3 | 11.2.0.4.v4</code></li> <li><b>Version 12.1 (Only
     *         available in the following regions: eu-central-1, us-west-1):</b>
     *         <code> 12.1.0.1.v1 | 12.1.0.1.v2</code></li> </ul>
     *         <p><b>PostgreSQL</b> <ul> <li><b>Version 9.3 (Only available in the
     *         following regions: ap-northeast-1, ap-southeast-1, ap-southeast-2,
     *         eu-west-1, sa-east-1, us-west-1, us-west-2):</b> <code> 9.3.1 |
     *         9.3.2</code></li> <li><b>Version 9.3 (Available in all regions):</b>
     *         <code> 9.3.3 | 9.3.5 | 9.3.6 | 9.3.9 | 9.3.10</code></li>
     *         <li><b>Version 9.4 (Available in all regions):</b> <code> 9.4.1 |
     *         9.4.4 | 9.4.5</code></li> </ul> <p><b>Microsoft SQL Server Enterprise
     *         Edition (sqlserver-ee)</b> <ul> <li><b>Version 10.50 (Available in all
     *         regions):</b> <code> 10.50.2789.0.v1</code></li> <li><b>Version 10.50
     *         (Available in all regions):</b> <code> 10.50.6000.34.v1</code></li>
     *         <li><b>Version 11.00 (Available in all regions):</b> <code>
     *         11.00.2100.60.v1</code></li> <li><b>Version 11.00 (Available in all
     *         regions):</b> <code> 11.00.5058.0.v1</code></li> </ul> <p><b>Microsoft
     *         SQL Server Express Edition (sqlserver-ex)</b> <ul> <li><b>Version
     *         10.50 (Available in all regions):</b> <code>
     *         10.50.2789.0.v1</code></li> <li><b>Version 10.50 (Available in all
     *         regions):</b> <code> 10.50.6000.34.v1</code></li> <li><b>Version 11.00
     *         (Available in all regions):</b> <code> 11.00.2100.60.v1</code></li>
     *         <li><b>Version 11.00 (Available in all regions):</b> <code>
     *         11.00.5058.0.v1</code></li> <li><b>Version 12.00 (Available in all
     *         regions):</b> <code> 12.00.4422.0.v1</code></li> </ul> <p><b>Microsoft
     *         SQL Server Standard Edition (sqlserver-se)</b> <ul> <li><b>Version
     *         10.50 (Available in all regions):</b> <code>
     *         10.50.2789.0.v1</code></li> <li><b>Version 10.50 (Available in all
     *         regions):</b> <code> 10.50.6000.34.v1</code></li> <li><b>Version 11.00
     *         (Available in all regions):</b> <code> 11.00.2100.60.v1</code></li>
     *         <li><b>Version 11.00 (Available in all regions):</b> <code>
     *         11.00.5058.0.v1</code></li> <li><b>Version 12.00 (Available in all
     *         regions):</b> <code> 12.00.4422.0.v1</code></li> </ul> <p><b>Microsoft
     *         SQL Server Web Edition (sqlserver-web)</b> <ul> <li><b>Version 10.50
     *         (Available in all regions):</b> <code> 10.50.2789.0.v1</code></li>
     *         <li><b>Version 10.50 (Available in all regions):</b> <code>
     *         10.50.6000.34.v1</code></li> <li><b>Version 11.00 (Available in all
     *         regions):</b> <code> 11.00.2100.60.v1</code></li> <li><b>Version 11.00
     *         (Available in all regions):</b> <code> 11.00.5058.0.v1</code></li>
     *         <li><b>Version 12.00 (Available in all regions):</b> <code>
     *         12.00.4422.0.v1</code></li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the DB instance during the maintenance window. <p>Default:
     * <code>true</code>
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
     *         the DB instance during the maintenance window. <p>Default:
     *         <code>true</code>
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the DB instance during the maintenance window. <p>Default:
     * <code>true</code>
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the DB instance during the maintenance window. <p>Default:
     *         <code>true</code>
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the DB instance during the maintenance window. <p>Default:
     * <code>true</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the DB instance during the maintenance window. <p>Default:
     *         <code>true</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the DB instance during the maintenance window. <p>Default:
     * <code>true</code>
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
     *         the DB instance during the maintenance window. <p>Default:
     *         <code>true</code>
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * License model information for this DB instance. <p> Valid values:
     * <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     *
     * @return License model information for this DB instance. <p> Valid values:
     *         <code>license-included</code> | <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     */
    public String getLicenseModel() {
        return licenseModel;
    }
    
    /**
     * License model information for this DB instance. <p> Valid values:
     * <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     *
     * @param licenseModel License model information for this DB instance. <p> Valid values:
     *         <code>license-included</code> | <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }
    
    /**
     * License model information for this DB instance. <p> Valid values:
     * <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseModel License model information for this DB instance. <p> Valid values:
     *         <code>license-included</code> | <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance. <p>Constraints: Must be a
     * multiple between 3 and 10 of the storage amount for the DB instance.
     * Must also be an integer multiple of 1000. For example, if the size of
     * your DB instance is 500 GB, then your <code>Iops</code> value can be
     * 2000, 3000, 4000, or 5000.
     *
     * @return The amount of Provisioned IOPS (input/output operations per second) to
     *         be initially allocated for the DB instance. <p>Constraints: Must be a
     *         multiple between 3 and 10 of the storage amount for the DB instance.
     *         Must also be an integer multiple of 1000. For example, if the size of
     *         your DB instance is 500 GB, then your <code>Iops</code> value can be
     *         2000, 3000, 4000, or 5000.
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance. <p>Constraints: Must be a
     * multiple between 3 and 10 of the storage amount for the DB instance.
     * Must also be an integer multiple of 1000. For example, if the size of
     * your DB instance is 500 GB, then your <code>Iops</code> value can be
     * 2000, 3000, 4000, or 5000.
     *
     * @param iops The amount of Provisioned IOPS (input/output operations per second) to
     *         be initially allocated for the DB instance. <p>Constraints: Must be a
     *         multiple between 3 and 10 of the storage amount for the DB instance.
     *         Must also be an integer multiple of 1000. For example, if the size of
     *         your DB instance is 500 GB, then your <code>Iops</code> value can be
     *         2000, 3000, 4000, or 5000.
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance. <p>Constraints: Must be a
     * multiple between 3 and 10 of the storage amount for the DB instance.
     * Must also be an integer multiple of 1000. For example, if the size of
     * your DB instance is 500 GB, then your <code>Iops</code> value can be
     * 2000, 3000, 4000, or 5000.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iops The amount of Provisioned IOPS (input/output operations per second) to
     *         be initially allocated for the DB instance. <p>Constraints: Must be a
     *         multiple between 3 and 10 of the storage amount for the DB instance.
     *         Must also be an integer multiple of 1000. For example, if the size of
     *         your DB instance is 500 GB, then your <code>Iops</code> value can be
     *         2000, 3000, 4000, or 5000.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * Indicates that the DB instance should be associated with the specified
     * option group. <p> Permanent options, such as the TDE option for Oracle
     * Advanced Security TDE, cannot be removed from an option group, and
     * that option group cannot be removed from a DB instance once it is
     * associated with a DB instance
     *
     * @return Indicates that the DB instance should be associated with the specified
     *         option group. <p> Permanent options, such as the TDE option for Oracle
     *         Advanced Security TDE, cannot be removed from an option group, and
     *         that option group cannot be removed from a DB instance once it is
     *         associated with a DB instance
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * Indicates that the DB instance should be associated with the specified
     * option group. <p> Permanent options, such as the TDE option for Oracle
     * Advanced Security TDE, cannot be removed from an option group, and
     * that option group cannot be removed from a DB instance once it is
     * associated with a DB instance
     *
     * @param optionGroupName Indicates that the DB instance should be associated with the specified
     *         option group. <p> Permanent options, such as the TDE option for Oracle
     *         Advanced Security TDE, cannot be removed from an option group, and
     *         that option group cannot be removed from a DB instance once it is
     *         associated with a DB instance
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * Indicates that the DB instance should be associated with the specified
     * option group. <p> Permanent options, such as the TDE option for Oracle
     * Advanced Security TDE, cannot be removed from an option group, and
     * that option group cannot be removed from a DB instance once it is
     * associated with a DB instance
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName Indicates that the DB instance should be associated with the specified
     *         option group. <p> Permanent options, such as the TDE option for Oracle
     *         Advanced Security TDE, cannot be removed from an option group, and
     *         that option group cannot be removed from a DB instance once it is
     *         associated with a DB instance
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * For supported engines, indicates that the DB instance should be
     * associated with the specified CharacterSet.
     *
     * @return For supported engines, indicates that the DB instance should be
     *         associated with the specified CharacterSet.
     */
    public String getCharacterSetName() {
        return characterSetName;
    }
    
    /**
     * For supported engines, indicates that the DB instance should be
     * associated with the specified CharacterSet.
     *
     * @param characterSetName For supported engines, indicates that the DB instance should be
     *         associated with the specified CharacterSet.
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }
    
    /**
     * For supported engines, indicates that the DB instance should be
     * associated with the specified CharacterSet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param characterSetName For supported engines, indicates that the DB instance should be
     *         associated with the specified CharacterSet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
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
    public CreateDBInstanceRequest withPubliclyAccessible(Boolean publiclyAccessible) {
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
    public CreateDBInstanceRequest withTags(Tag... tags) {
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
    public CreateDBInstanceRequest withTags(java.util.Collection<Tag> tags) {
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
     * The identifier of the DB cluster that the instance will belong to.
     * <p>For information on creating a DB cluster, see
     * <a>CreateDBCluster</a>. <p>Type: String
     *
     * @return The identifier of the DB cluster that the instance will belong to.
     *         <p>For information on creating a DB cluster, see
     *         <a>CreateDBCluster</a>. <p>Type: String
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }
    
    /**
     * The identifier of the DB cluster that the instance will belong to.
     * <p>For information on creating a DB cluster, see
     * <a>CreateDBCluster</a>. <p>Type: String
     *
     * @param dBClusterIdentifier The identifier of the DB cluster that the instance will belong to.
     *         <p>For information on creating a DB cluster, see
     *         <a>CreateDBCluster</a>. <p>Type: String
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }
    
    /**
     * The identifier of the DB cluster that the instance will belong to.
     * <p>For information on creating a DB cluster, see
     * <a>CreateDBCluster</a>. <p>Type: String
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterIdentifier The identifier of the DB cluster that the instance will belong to.
     *         <p>For information on creating a DB cluster, see
     *         <a>CreateDBCluster</a>. <p>Type: String
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
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
    public CreateDBInstanceRequest withStorageType(String storageType) {
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
    public CreateDBInstanceRequest withTdeCredentialArn(String tdeCredentialArn) {
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
    public CreateDBInstanceRequest withTdeCredentialPassword(String tdeCredentialPassword) {
        this.tdeCredentialPassword = tdeCredentialPassword;
        return this;
    }

    /**
     * Specifies whether the DB instance is encrypted. <p> Default: false
     *
     * @return Specifies whether the DB instance is encrypted. <p> Default: false
     */
    public Boolean isStorageEncrypted() {
        return storageEncrypted;
    }
    
    /**
     * Specifies whether the DB instance is encrypted. <p> Default: false
     *
     * @param storageEncrypted Specifies whether the DB instance is encrypted. <p> Default: false
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }
    
    /**
     * Specifies whether the DB instance is encrypted. <p> Default: false
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param storageEncrypted Specifies whether the DB instance is encrypted. <p> Default: false
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * Specifies whether the DB instance is encrypted. <p> Default: false
     *
     * @return Specifies whether the DB instance is encrypted. <p> Default: false
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * The KMS key identifier for an encrypted DB instance. <p>The KMS key
     * identifier is the Amazon Resource Name (ARN) for the KMS encryption
     * key. If you are creating a DB instance with the same AWS account that
     * owns the KMS encryption key used to encrypt the new DB instance, then
     * you can use the KMS key alias instead of the ARN for the KM encryption
     * key. <p>If the <code>StorageEncrypted</code> parameter is true, and
     * you do not specify a value for the <code>KmsKeyId</code> parameter,
     * then Amazon RDS will use your default encryption key. AWS KMS creates
     * the default encryption key for your AWS account. Your AWS account has
     * a different default encryption key for each AWS region.
     *
     * @return The KMS key identifier for an encrypted DB instance. <p>The KMS key
     *         identifier is the Amazon Resource Name (ARN) for the KMS encryption
     *         key. If you are creating a DB instance with the same AWS account that
     *         owns the KMS encryption key used to encrypt the new DB instance, then
     *         you can use the KMS key alias instead of the ARN for the KM encryption
     *         key. <p>If the <code>StorageEncrypted</code> parameter is true, and
     *         you do not specify a value for the <code>KmsKeyId</code> parameter,
     *         then Amazon RDS will use your default encryption key. AWS KMS creates
     *         the default encryption key for your AWS account. Your AWS account has
     *         a different default encryption key for each AWS region.
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }
    
    /**
     * The KMS key identifier for an encrypted DB instance. <p>The KMS key
     * identifier is the Amazon Resource Name (ARN) for the KMS encryption
     * key. If you are creating a DB instance with the same AWS account that
     * owns the KMS encryption key used to encrypt the new DB instance, then
     * you can use the KMS key alias instead of the ARN for the KM encryption
     * key. <p>If the <code>StorageEncrypted</code> parameter is true, and
     * you do not specify a value for the <code>KmsKeyId</code> parameter,
     * then Amazon RDS will use your default encryption key. AWS KMS creates
     * the default encryption key for your AWS account. Your AWS account has
     * a different default encryption key for each AWS region.
     *
     * @param kmsKeyId The KMS key identifier for an encrypted DB instance. <p>The KMS key
     *         identifier is the Amazon Resource Name (ARN) for the KMS encryption
     *         key. If you are creating a DB instance with the same AWS account that
     *         owns the KMS encryption key used to encrypt the new DB instance, then
     *         you can use the KMS key alias instead of the ARN for the KM encryption
     *         key. <p>If the <code>StorageEncrypted</code> parameter is true, and
     *         you do not specify a value for the <code>KmsKeyId</code> parameter,
     *         then Amazon RDS will use your default encryption key. AWS KMS creates
     *         the default encryption key for your AWS account. Your AWS account has
     *         a different default encryption key for each AWS region.
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }
    
    /**
     * The KMS key identifier for an encrypted DB instance. <p>The KMS key
     * identifier is the Amazon Resource Name (ARN) for the KMS encryption
     * key. If you are creating a DB instance with the same AWS account that
     * owns the KMS encryption key used to encrypt the new DB instance, then
     * you can use the KMS key alias instead of the ARN for the KM encryption
     * key. <p>If the <code>StorageEncrypted</code> parameter is true, and
     * you do not specify a value for the <code>KmsKeyId</code> parameter,
     * then Amazon RDS will use your default encryption key. AWS KMS creates
     * the default encryption key for your AWS account. Your AWS account has
     * a different default encryption key for each AWS region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kmsKeyId The KMS key identifier for an encrypted DB instance. <p>The KMS key
     *         identifier is the Amazon Resource Name (ARN) for the KMS encryption
     *         key. If you are creating a DB instance with the same AWS account that
     *         owns the KMS encryption key used to encrypt the new DB instance, then
     *         you can use the KMS key alias instead of the ARN for the KM encryption
     *         key. <p>If the <code>StorageEncrypted</code> parameter is true, and
     *         you do not specify a value for the <code>KmsKeyId</code> parameter,
     *         then Amazon RDS will use your default encryption key. AWS KMS creates
     *         the default encryption key for your AWS account. Your AWS account has
     *         a different default encryption key for each AWS region.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * Specify the Active Directory Domain to create the instance in.
     *
     * @return Specify the Active Directory Domain to create the instance in.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * Specify the Active Directory Domain to create the instance in.
     *
     * @param domain Specify the Active Directory Domain to create the instance in.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * Specify the Active Directory Domain to create the instance in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domain Specify the Active Directory Domain to create the instance in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * True to copy all tags from the DB instance to snapshots of the DB
     * instance; otherwise false. The default is false.
     *
     * @return True to copy all tags from the DB instance to snapshots of the DB
     *         instance; otherwise false. The default is false.
     */
    public Boolean isCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }
    
    /**
     * True to copy all tags from the DB instance to snapshots of the DB
     * instance; otherwise false. The default is false.
     *
     * @param copyTagsToSnapshot True to copy all tags from the DB instance to snapshots of the DB
     *         instance; otherwise false. The default is false.
     */
    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }
    
    /**
     * True to copy all tags from the DB instance to snapshots of the DB
     * instance; otherwise false. The default is false.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param copyTagsToSnapshot True to copy all tags from the DB instance to snapshots of the DB
     *         instance; otherwise false. The default is false.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        return this;
    }

    /**
     * True to copy all tags from the DB instance to snapshots of the DB
     * instance; otherwise false. The default is false.
     *
     * @return True to copy all tags from the DB instance to snapshots of the DB
     *         instance; otherwise false. The default is false.
     */
    public Boolean getCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the DB instance. To disable collecting
     * Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     * <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     * Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *
     * @return The interval, in seconds, between points when Enhanced Monitoring
     *         metrics are collected for the DB instance. To disable collecting
     *         Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     *         <code>MonitoringRoleArn</code> is specified, then you must also set
     *         <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     *         Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     */
    public Integer getMonitoringInterval() {
        return monitoringInterval;
    }
    
    /**
     * The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the DB instance. To disable collecting
     * Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     * <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     * Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *
     * @param monitoringInterval The interval, in seconds, between points when Enhanced Monitoring
     *         metrics are collected for the DB instance. To disable collecting
     *         Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     *         <code>MonitoringRoleArn</code> is specified, then you must also set
     *         <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     *         Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     */
    public void setMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
    }
    
    /**
     * The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the DB instance. To disable collecting
     * Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     * <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     * Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monitoringInterval The interval, in seconds, between points when Enhanced Monitoring
     *         metrics are collected for the DB instance. To disable collecting
     *         Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     *         <code>MonitoringRoleArn</code> is specified, then you must also set
     *         <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     *         Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
        return this;
    }

    /**
     * The ARN for the IAM role that permits RDS to send enhanced monitoring
     * metrics to CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information
     * on creating a monitoring role, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a>. <p>If
     * <code>MonitoringInterval</code> is set to a value other than 0, then
     * you must supply a <code>MonitoringRoleArn</code> value.
     *
     * @return The ARN for the IAM role that permits RDS to send enhanced monitoring
     *         metrics to CloudWatch Logs. For example,
     *         <code>arn:aws:iam:123456789012:role/emaccess</code>. For information
     *         on creating a monitoring role, go to <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     *         create an IAM role for Amazon RDS Enhanced Monitoring</a>. <p>If
     *         <code>MonitoringInterval</code> is set to a value other than 0, then
     *         you must supply a <code>MonitoringRoleArn</code> value.
     */
    public String getMonitoringRoleArn() {
        return monitoringRoleArn;
    }
    
    /**
     * The ARN for the IAM role that permits RDS to send enhanced monitoring
     * metrics to CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information
     * on creating a monitoring role, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a>. <p>If
     * <code>MonitoringInterval</code> is set to a value other than 0, then
     * you must supply a <code>MonitoringRoleArn</code> value.
     *
     * @param monitoringRoleArn The ARN for the IAM role that permits RDS to send enhanced monitoring
     *         metrics to CloudWatch Logs. For example,
     *         <code>arn:aws:iam:123456789012:role/emaccess</code>. For information
     *         on creating a monitoring role, go to <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     *         create an IAM role for Amazon RDS Enhanced Monitoring</a>. <p>If
     *         <code>MonitoringInterval</code> is set to a value other than 0, then
     *         you must supply a <code>MonitoringRoleArn</code> value.
     */
    public void setMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
    }
    
    /**
     * The ARN for the IAM role that permits RDS to send enhanced monitoring
     * metrics to CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information
     * on creating a monitoring role, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a>. <p>If
     * <code>MonitoringInterval</code> is set to a value other than 0, then
     * you must supply a <code>MonitoringRoleArn</code> value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monitoringRoleArn The ARN for the IAM role that permits RDS to send enhanced monitoring
     *         metrics to CloudWatch Logs. For example,
     *         <code>arn:aws:iam:123456789012:role/emaccess</code>. For information
     *         on creating a monitoring role, go to <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     *         create an IAM role for Amazon RDS Enhanced Monitoring</a>. <p>If
     *         <code>MonitoringInterval</code> is set to a value other than 0, then
     *         you must supply a <code>MonitoringRoleArn</code> value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
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
    public CreateDBInstanceRequest withDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
        return this;
    }

    /**
     * A value that specifies the order in which an Aurora Replica is
     * promoted to the primary instance after a failure of the existing
     * primary instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>. <p>Default: 1 <p>Valid
     * Values: 0 - 15
     *
     * @return A value that specifies the order in which an Aurora Replica is
     *         promoted to the primary instance after a failure of the existing
     *         primary instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     *         Fault Tolerance for an Aurora DB Cluster</a>. <p>Default: 1 <p>Valid
     *         Values: 0 - 15
     */
    public Integer getPromotionTier() {
        return promotionTier;
    }
    
    /**
     * A value that specifies the order in which an Aurora Replica is
     * promoted to the primary instance after a failure of the existing
     * primary instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>. <p>Default: 1 <p>Valid
     * Values: 0 - 15
     *
     * @param promotionTier A value that specifies the order in which an Aurora Replica is
     *         promoted to the primary instance after a failure of the existing
     *         primary instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     *         Fault Tolerance for an Aurora DB Cluster</a>. <p>Default: 1 <p>Valid
     *         Values: 0 - 15
     */
    public void setPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
    }
    
    /**
     * A value that specifies the order in which an Aurora Replica is
     * promoted to the primary instance after a failure of the existing
     * primary instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>. <p>Default: 1 <p>Valid
     * Values: 0 - 15
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param promotionTier A value that specifies the order in which an Aurora Replica is
     *         promoted to the primary instance after a failure of the existing
     *         primary instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     *         Fault Tolerance for an Aurora DB Cluster</a>. <p>Default: 1 <p>Valid
     *         Values: 0 - 15
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceRequest withPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
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
        if (getDBName() != null) sb.append("DBName: " + getDBName() + ",");
        if (getDBInstanceIdentifier() != null) sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getAllocatedStorage() != null) sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getDBInstanceClass() != null) sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getMasterUsername() != null) sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getMasterUserPassword() != null) sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getDBSecurityGroups() != null) sb.append("DBSecurityGroups: " + getDBSecurityGroups() + ",");
        if (getVpcSecurityGroupIds() != null) sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getDBSubnetGroupName() != null) sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getDBParameterGroupName() != null) sb.append("DBParameterGroupName: " + getDBParameterGroupName() + ",");
        if (getBackupRetentionPeriod() != null) sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getPreferredBackupWindow() != null) sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (isMultiAZ() != null) sb.append("MultiAZ: " + isMultiAZ() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (isAutoMinorVersionUpgrade() != null) sb.append("AutoMinorVersionUpgrade: " + isAutoMinorVersionUpgrade() + ",");
        if (getLicenseModel() != null) sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getIops() != null) sb.append("Iops: " + getIops() + ",");
        if (getOptionGroupName() != null) sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getCharacterSetName() != null) sb.append("CharacterSetName: " + getCharacterSetName() + ",");
        if (isPubliclyAccessible() != null) sb.append("PubliclyAccessible: " + isPubliclyAccessible() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getDBClusterIdentifier() != null) sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getStorageType() != null) sb.append("StorageType: " + getStorageType() + ",");
        if (getTdeCredentialArn() != null) sb.append("TdeCredentialArn: " + getTdeCredentialArn() + ",");
        if (getTdeCredentialPassword() != null) sb.append("TdeCredentialPassword: " + getTdeCredentialPassword() + ",");
        if (isStorageEncrypted() != null) sb.append("StorageEncrypted: " + isStorageEncrypted() + ",");
        if (getKmsKeyId() != null) sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getDomain() != null) sb.append("Domain: " + getDomain() + ",");
        if (isCopyTagsToSnapshot() != null) sb.append("CopyTagsToSnapshot: " + isCopyTagsToSnapshot() + ",");
        if (getMonitoringInterval() != null) sb.append("MonitoringInterval: " + getMonitoringInterval() + ",");
        if (getMonitoringRoleArn() != null) sb.append("MonitoringRoleArn: " + getMonitoringRoleArn() + ",");
        if (getDomainIAMRoleName() != null) sb.append("DomainIAMRoleName: " + getDomainIAMRoleName() + ",");
        if (getPromotionTier() != null) sb.append("PromotionTier: " + getPromotionTier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode()); 
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode()); 
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroups() == null) ? 0 : getDBSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        hashCode = prime * hashCode + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((isMultiAZ() == null) ? 0 : isMultiAZ().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode()); 
        hashCode = prime * hashCode + ((isPubliclyAccessible() == null) ? 0 : isPubliclyAccessible().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode()); 
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode()); 
        hashCode = prime * hashCode + ((getTdeCredentialPassword() == null) ? 0 : getTdeCredentialPassword().hashCode()); 
        hashCode = prime * hashCode + ((isStorageEncrypted() == null) ? 0 : isStorageEncrypted().hashCode()); 
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        hashCode = prime * hashCode + ((isCopyTagsToSnapshot() == null) ? 0 : isCopyTagsToSnapshot().hashCode()); 
        hashCode = prime * hashCode + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode()); 
        hashCode = prime * hashCode + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode()); 
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode()); 
        hashCode = prime * hashCode + ((getPromotionTier() == null) ? 0 : getPromotionTier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDBInstanceRequest == false) return false;
        CreateDBInstanceRequest other = (CreateDBInstanceRequest)obj;
        
        if (other.getDBName() == null ^ this.getDBName() == null) return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false) return false; 
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null) return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false) return false; 
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null) return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false) return false; 
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null) return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false) return false; 
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null) return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false) return false; 
        if (other.getDBSecurityGroups() == null ^ this.getDBSecurityGroups() == null) return false;
        if (other.getDBSecurityGroups() != null && other.getDBSecurityGroups().equals(this.getDBSecurityGroups()) == false) return false; 
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null) return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null) return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null) return false;
        if (other.getDBParameterGroupName() != null && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false) return false; 
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null) return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false) return false; 
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null) return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.isMultiAZ() == null ^ this.isMultiAZ() == null) return false;
        if (other.isMultiAZ() != null && other.isMultiAZ().equals(this.isMultiAZ()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null) return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false) return false; 
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null) return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false) return false; 
        if (other.isPubliclyAccessible() == null ^ this.isPubliclyAccessible() == null) return false;
        if (other.isPubliclyAccessible() != null && other.isPubliclyAccessible().equals(this.isPubliclyAccessible()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null) return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false) return false; 
        if (other.getStorageType() == null ^ this.getStorageType() == null) return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false) return false; 
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null) return false;
        if (other.getTdeCredentialArn() != null && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false) return false; 
        if (other.getTdeCredentialPassword() == null ^ this.getTdeCredentialPassword() == null) return false;
        if (other.getTdeCredentialPassword() != null && other.getTdeCredentialPassword().equals(this.getTdeCredentialPassword()) == false) return false; 
        if (other.isStorageEncrypted() == null ^ this.isStorageEncrypted() == null) return false;
        if (other.isStorageEncrypted() != null && other.isStorageEncrypted().equals(this.isStorageEncrypted()) == false) return false; 
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null) return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false) return false; 
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.isCopyTagsToSnapshot() == null ^ this.isCopyTagsToSnapshot() == null) return false;
        if (other.isCopyTagsToSnapshot() != null && other.isCopyTagsToSnapshot().equals(this.isCopyTagsToSnapshot()) == false) return false; 
        if (other.getMonitoringInterval() == null ^ this.getMonitoringInterval() == null) return false;
        if (other.getMonitoringInterval() != null && other.getMonitoringInterval().equals(this.getMonitoringInterval()) == false) return false; 
        if (other.getMonitoringRoleArn() == null ^ this.getMonitoringRoleArn() == null) return false;
        if (other.getMonitoringRoleArn() != null && other.getMonitoringRoleArn().equals(this.getMonitoringRoleArn()) == false) return false; 
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null) return false;
        if (other.getDomainIAMRoleName() != null && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false) return false; 
        if (other.getPromotionTier() == null ^ this.getPromotionTier() == null) return false;
        if (other.getPromotionTier() != null && other.getPromotionTier().equals(this.getPromotionTier()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateDBInstanceRequest clone() {
        
            return (CreateDBInstanceRequest) super.clone();
    }

}
    