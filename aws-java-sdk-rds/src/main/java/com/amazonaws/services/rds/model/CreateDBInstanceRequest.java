/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter isn't specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter isn't specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter isn't specified, a database
     * named <code>postgres</code> is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created DB instance. If you specify <code>null</code>, the default value
     * <code>ORCL</code> is used. You can't specify the string NULL, or any other reserved word, for <code>DBName</code>
     * .
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 8 characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Amazon RDS Custom for Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created RDS Custom DB instance. If you don't specify a value, the default value
     * is <code>ORCL</code>.
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must contain 1 to 8 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must contain a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be a word reserved by the database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Amazon RDS Custom for SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>Amazon Aurora MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the primary DB instance of the Aurora MySQL DB cluster is created. If
     * this parameter isn't specified for an Aurora MySQL DB cluster, no database is created in the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must contain 1 to 64 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be a word reserved by the database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Amazon Aurora PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the primary DB instance of the Aurora PostgreSQL DB cluster is created.
     * If this parameter isn't specified for an Aurora PostgreSQL DB cluster, a database named <code>postgres</code> is
     * created in the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must contain 1 to 63 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must begin with a letter. Subsequent characters can be letters, underscores, or digits (0 to 9).
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be a word reserved by the database engine.
     * </p>
     * </li>
     * </ul>
     */
    private String dBName;
    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to allocate for the DB instance.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database increases,
     * though you are only charged for the space that you use in an Aurora cluster volume.
     * </p>
     * <p>
     * <b>Amazon RDS Custom</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 40 to 65536 for RDS Custom for Oracle, 16384
     * for RDS Custom for SQL Server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 40 to 65536 for RDS Custom for Oracle, 16384 for RDS
     * Custom for SQL Server.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 10 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 20 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 100 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 100 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 20 to 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 1024.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The compute and memory capacity of the DB instance, for example db.m5.large. Not all DB instance classes are
     * available in all Amazon Web Services Regions, or for all database engines. For the full list of DB instance
     * classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance
     * classes</a> in the <i>Amazon RDS User Guide</i> or <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html">Aurora DB
     * instance classes</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Not every database engine is available for every Amazon Web Services Region.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-ee (for RDS Custom for Oracle instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-sqlserver-ee (for RDS Custom for SQL Server instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-sqlserver-se (for RDS Custom for SQL Server instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-sqlserver-web (for RDS Custom for SQL Server instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-cdb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-cdb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     */
    private String engine;
    /**
     * <p>
     * The name for the master user.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The name for the master user is managed by the DB cluster.
     * </p>
     * <p>
     * <b>Amazon RDS</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 16 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     */
    private String masterUsername;
    /**
     * <p>
     * The password for the master user. The password can include any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The password for the master user is managed by the DB cluster.
     * </p>
     * <p>
     * Constraints: Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * A list of DB security groups to associate with this DB instance.
     * </p>
     * <p>
     * This setting applies to the legacy EC2-Classic platform, which is no longer used to create new DB instances. Use
     * the <code>VpcSecurityGroupIds</code> setting instead.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dBSecurityGroups;
    /**
     * <p>
     * A list of Amazon EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The Availability Zone (AZ) where the database will be created. For information on Amazon Web Services Regions and
     * Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Each Aurora DB cluster hosts copies of its storage in three separate Availability Zones. Specify one of these
     * Availability Zones. Aurora automatically chooses an appropriate Availability Zone if you don't specify one.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's Amazon Web Services Region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The <code>AvailabilityZone</code> parameter can't be specified if the DB instance is a Multi-AZ
     * deployment. The specified Availability Zone must be in the same Amazon Web Services Region as the current
     * endpoint.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * A DB subnet group to associate with this DB instance.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a>.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance. If you do not specify a value, then the
     * default DB parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String dBParameterGroupName;
    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this parameter to a positive number enables
     * backups. Setting this parameter to 0 disables automated backups.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The retention period for automated backups is managed by the DB cluster.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 for an RDS Custom for Oracle DB instance
     * </p>
     * </li>
     * </ul>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. The default is a 30-minute window selected at random from an 8-hour
     * block of time for each Amazon Web Services Region. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Backup window</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is managed by the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>,
     * <code>3343</code>, <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment. You can't set the
     * <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. DB instance Availability Zones (AZs) are managed by the DB cluster.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * For a list of valid engine versions, use the <code>DescribeDBEngineVersions</code> operation.
     * </p>
     * <p>
     * The following are the database engines and links to information about the major and minor versions that are
     * available with Amazon RDS. Not every database engine is available for every Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The version number of the database engine to be used by the DB instance is managed by the DB
     * cluster.
     * </p>
     * <p>
     * <b>Amazon RDS Custom for Oracle</b>
     * </p>
     * <p>
     * A custom engine version (CEV) that you have previously created. This setting is required for RDS Custom for
     * Oracle. The CEV name has the following format: 19.<i>customized_string</i>. A valid CEV name is
     * <code>19.my_cev1</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-creating.html#custom-creating.create">
     * Creating an RDS Custom for Oracle DB instance</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon RDS Custom for SQL Server</b>
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits-MS.html">RDS Custom for
     * SQL Server general requirements</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt"
     * >MariaDB on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * For information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.VersionSupport"
     * >Microsoft SQL Server Versions on Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt">MySQL on
     * Amazon RDS Versions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html">Oracle
     * Database Engine Release Notes</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts">Amazon RDS
     * for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the DB instance during the
     * maintenance window. By default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * If you create an RDS Custom DB instance, you must set <code>AutoMinorVersionUpgrade</code> to <code>false</code>.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance. For information about valid IOPS values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html">Amazon RDS DB instance
     * storage</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL DB instances, must be a multiple between .5 and 50 of the
     * storage amount for the DB instance. For SQL Server DB instances, must be a multiple between 1 and 50 of the
     * storage amount for the DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB cluster.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * A value that indicates that the DB instance should be associated with the specified option group.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group. Also, that option group can't be removed from a DB instance after it is associated with a DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * For supported engines, this value indicates that the DB instance should be associated with the specified
     * <code>CharacterSet</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom. However, if you need to change the character set, you can change it on
     * the database itself.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The character set is managed by the DB cluster. For more information, see
     * <code>CreateDBCluster</code>.
     * </p>
     */
    private String characterSetName;
    /**
     * <p>
     * The name of the NCHAR character set for the Oracle DB instance.
     * </p>
     * <p>
     * This parameter doesn't apply to RDS Custom.
     * </p>
     */
    private String ncharCharacterSetName;
    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB instance's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB instance's VPC. Access to the DB instance is ultimately controlled by the security group it
     * uses. That public access is not permitted if the security group assigned to the DB instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB instance is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB instance is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * Tags to assign to the DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The identifier of the DB cluster that the instance will belong to.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>gp2 | gp3 | io1 | standard</code>
     * </p>
     * <p>
     * If you specify <code>io1</code> or <code>gp3</code>, you must also include a value for the <code>Iops</code>
     * parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB cluster.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     */
    private String tdeCredentialArn;
    /**
     * <p>
     * The password for the given ARN from the key store in order to access the device.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private String tdeCredentialPassword;
    /**
     * <p>
     * A value that indicates whether the DB instance is encrypted. By default, it isn't encrypted.
     * </p>
     * <p>
     * For RDS Custom instances, either set this parameter to <code>true</code> or leave it unset. If you set this
     * parameter to <code>false</code>, RDS reports an error.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The encryption for DB instances is managed by the DB cluster.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted DB instance.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The Amazon Web Services KMS key identifier is managed by the DB cluster. For more information,
     * see <code>CreateDBCluster</code>.
     * </p>
     * <p>
     * If <code>StorageEncrypted</code> is enabled, and you do not specify a value for the <code>KmsKeyId</code>
     * parameter, then Amazon RDS uses your default KMS key. There is a default KMS key for your Amazon Web Services
     * account. Your Amazon Web Services account has a different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Amazon RDS Custom</b>
     * </p>
     * <p>
     * A KMS key is required for RDS Custom instances. For most RDS engines, if you leave this parameter empty while
     * enabling <code>StorageEncrypted</code>, the engine uses the default KMS key. However, RDS Custom doesn't use the
     * default key when this parameter is empty. You must explicitly specify a key.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Active Directory directory ID to create the DB instance in. Currently, only MySQL, Microsoft SQL Server,
     * Oracle, and PostgreSQL DB instances can be created in an Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The domain is managed by the DB cluster.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * A value that indicates whether to copy tags from the DB instance to snapshots of the DB instance. By default,
     * tags are not copied.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB
     * instance has no effect on the DB cluster setting.
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collection of Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     */
    private Integer monitoringInterval;
    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private String monitoringRoleArn;
    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The domain is managed by the DB cluster.
     * </p>
     */
    private String domainIAMRoleName;
    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     */
    private Integer promotionTier;
    /**
     * <p>
     * The time zone of the DB instance. The time zone parameter is currently supported only by <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     * >Microsoft SQL Server</a>.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Mapping Amazon Web Services IAM accounts to database accounts is managed by the DB cluster.
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;
    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the DB instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private Boolean enablePerformanceInsights;
    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of Performance Insights data.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <p>
     * If you do not specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default KMS
     * key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     * different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private String performanceInsightsKMSKeyId;
    /**
     * <p>
     * The number of days to retain Performance Insights data. The default is 7 days. The following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 7
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>month</i> * 31, where <i>month</i> is a number of months from 1-23
     * </p>
     * </li>
     * <li>
     * <p>
     * 731
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, the following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 93 (3 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * 341 (11 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * 589 (19 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * 731
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a retention period such as 94, which isn't a valid value, RDS issues an error.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private Integer performanceInsightsRetentionPeriod;
    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on
     * the DB engine. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * > Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. CloudWatch Logs exports are managed by the DB cluster.
     * </p>
     * <p>
     * <b>RDS Custom</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Possible values are <code>agent</code> and <code>error</code>.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Possible values are <code>alert</code>, <code>audit</code>, <code>listener</code>, <code>trace</code>, and
     * <code>oemagent</code>.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> enableCloudwatchLogsExports;
    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProcessorFeature> processorFeatures;
    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted
     * when deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You can enable or disable deletion protection for the DB cluster. For more information, see
     * <code>CreateDBCluster</code>. DB instances in a DB cluster can be deleted even when deletion protection is
     * enabled for the DB cluster.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     * <p>
     * For more information about this setting, including limitations that apply to it, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling">
     * Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB cluster.
     * </p>
     */
    private Integer maxAllocatedStorage;
    /**
     * <p>
     * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from
     * outside of its virtual private cloud (VPC) on your local network.
     * </p>
     * <p>
     * For more information about RDS on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on
     * Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about CoIPs, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/routing.html#ip-addressing">Customer-owned IP
     * addresses</a> in the <i>Amazon Web Services Outposts User Guide</i>.
     * </p>
     */
    private Boolean enableCustomerOwnedIp;
    /**
     * <p>
     * The instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB instance. The
     * instance profile must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The profile must exist in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * The profile must have an IAM role that Amazon EC2 has permissions to assume.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance profile name and the associated IAM role name must start with the prefix <code>AWSRDSCustom</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the list of permissions required for the IAM role, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-setup-orcl.html#custom-setup-orcl.iam-vpc">
     * Configure IAM and your VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting is required for RDS Custom.
     * </p>
     */
    private String customIamInstanceProfile;
    /**
     * <p>
     * Specifies where automated backups and manual snapshots are stored.
     * </p>
     * <p>
     * Possible values are <code>outposts</code> (Amazon Web Services Outposts) and <code>region</code> (Amazon Web
     * Services Region). The default is <code>region</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on
     * Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     */
    private String backupTarget;
    /**
     * <p>
     * The network type of the DB instance.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IPV4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DUAL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The network type is determined by the <code>DBSubnetGroup</code> specified for the DB instance. A
     * <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     * <code>DUAL</code>).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html"> Working
     * with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private String networkType;
    /**
     * <p>
     * Specifies the storage throughput value for the DB instance.
     * </p>
     * <p>
     * This setting applies only to the <code>gp3</code> storage type.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     * </p>
     */
    private Integer storageThroughput;
    /**
     * <p>
     * A value that indicates whether to manage the master user password with Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password management with
     * Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't manage the master user password with Amazon Web Services Secrets Manager if <code>MasterUserPassword</code>
     * is specified.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean manageMasterUserPassword;
    /**
     * <p>
     * The Amazon Web Services KMS key identifier to encrypt a secret that is automatically generated and managed in
     * Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets Manager
     * for the DB instance.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * If you don't specify <code>MasterUserSecretKmsKeyId</code>, then the <code>aws/secretsmanager</code> KMS key is
     * used to encrypt the secret. If the secret is in a different Amazon Web Services account, then you can't use the
     * <code>aws/secretsmanager</code> KMS key to encrypt the secret, and you must use a customer managed KMS key.
     * </p>
     * <p>
     * There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a different
     * default KMS key for each Amazon Web Services Region.
     * </p>
     */
    private String masterUserSecretKmsKeyId;

    /**
     * Default constructor for CreateDBInstanceRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateDBInstanceRequest() {
    }

    /**
     * Constructs a new CreateDBInstanceRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mydbinstance</code>
     * @param allocatedStorage
     *        The amount of storage in gibibytes (GiB) to allocate for the DB instance.
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database
     *        increases, though you are only charged for the space that you use in an Aurora cluster volume.
     *        </p>
     *        <p>
     *        <b>Amazon RDS Custom</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3): Must be an integer from 40 to 65536 for RDS Custom for Oracle,
     *        16384 for RDS Custom for SQL Server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1): Must be an integer from 40 to 65536 for RDS Custom for Oracle, 16384 for
     *        RDS Custom for SQL Server.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic storage (standard): Must be an integer from 5 to 3072.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic storage (standard): Must be an integer from 5 to 3072.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic storage (standard): Must be an integer from 5 to 3072.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic storage (standard): Must be an integer from 10 to 3072.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Enterprise and Standard editions: Must be an integer from 20 to 16384.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Web and Express editions: Must be an integer from 20 to 16384.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Enterprise and Standard editions: Must be an integer from 100 to 16384.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Web and Express editions: Must be an integer from 100 to 16384.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic storage (standard):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Enterprise and Standard editions: Must be an integer from 20 to 1024.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Web and Express editions: Must be an integer from 20 to 1024.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @param dBInstanceClass
     *        The compute and memory capacity of the DB instance, for example db.m5.large. Not all DB instance classes
     *        are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB
     *        instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance
     *        classes</a> in the <i>Amazon RDS User Guide</i> or <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html">Aurora
     *        DB instance classes</a> in the <i>Amazon Aurora User Guide</i>.
     * @param engine
     *        The name of the database engine to be used for this instance.</p>
     *        <p>
     *        Not every database engine is available for every Amazon Web Services Region.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-mysql</code> (for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-oracle-ee (for RDS Custom for Oracle instances)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-sqlserver-ee (for RDS Custom for SQL Server instances)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-sqlserver-se (for RDS Custom for SQL Server instances)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-sqlserver-web (for RDS Custom for SQL Server instances)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mysql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee-cdb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2-cdb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web</code>
     *        </p>
     *        </li>
     * @param masterUsername
     *        The name for the master user.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The name for the master user is managed by the DB cluster.
     *        </p>
     *        <p>
     *        <b>Amazon RDS</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be 1 to 16 letters, numbers, or underscores.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     * @param masterUserPassword
     *        The password for the master user. The password can include any printable ASCII character except "/",
     *        """, or "@".</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The password for the master user is managed by the DB cluster.
     *        </p>
     *        <p>
     *        Constraints: Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 30 characters.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     */
    public CreateDBInstanceRequest(String dBInstanceIdentifier, Integer allocatedStorage, String dBInstanceClass, String engine, String masterUsername,
            String masterUserPassword) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        setAllocatedStorage(allocatedStorage);
        setDBInstanceClass(dBInstanceClass);
        setEngine(engine);
        setMasterUsername(masterUsername);
        setMasterUserPassword(masterUserPassword);
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter isn't specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter isn't specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter isn't specified, a database
     * named <code>postgres</code> is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created DB instance. If you specify <code>null</code>, the default value
     * <code>ORCL</code> is used. You can't specify the string NULL, or any other reserved word, for <code>DBName</code>
     * .
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 8 characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Amazon RDS Custom for Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created RDS Custom DB instance. If you don't specify a value, the default value
     * is <code>ORCL</code>.
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must contain 1 to 8 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must contain a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be a word reserved by the database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Amazon RDS Custom for SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>Amazon Aurora MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the primary DB instance of the Aurora MySQL DB cluster is created. If
     * this parameter isn't specified for an Aurora MySQL DB cluster, no database is created in the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must contain 1 to 64 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be a word reserved by the database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Amazon Aurora PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the primary DB instance of the Aurora PostgreSQL DB cluster is created.
     * If this parameter isn't specified for an Aurora PostgreSQL DB cluster, a database named <code>postgres</code> is
     * created in the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must contain 1 to 63 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must begin with a letter. Subsequent characters can be letters, underscores, or digits (0 to 9).
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be a word reserved by the database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBName
     *        The meaning of this parameter differs according to the database engine you use.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the DB instance is created. If this parameter isn't specified, no
     *        database is created in the DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 64 letters or numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a word reserved by the specified database engine
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the DB instance is created. If this parameter isn't specified, no
     *        database is created in the DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 64 letters or numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a word reserved by the specified database engine
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the DB instance is created. If this parameter isn't specified, a
     *        database named <code>postgres</code> is created in the DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 63 letters, numbers, or underscores.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a word reserved by the specified database engine
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        The Oracle System ID (SID) of the created DB instance. If you specify <code>null</code>, the default value
     *        <code>ORCL</code> is used. You can't specify the string NULL, or any other reserved word, for
     *        <code>DBName</code>.
     *        </p>
     *        <p>
     *        Default: <code>ORCL</code>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be longer than 8 characters
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Amazon RDS Custom for Oracle</b>
     *        </p>
     *        <p>
     *        The Oracle System ID (SID) of the created RDS Custom DB instance. If you don't specify a value, the
     *        default value is <code>ORCL</code>.
     *        </p>
     *        <p>
     *        Default: <code>ORCL</code>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        It must contain 1 to 8 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must contain a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can't be a word reserved by the database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Amazon RDS Custom for SQL Server</b>
     *        </p>
     *        <p>
     *        Not applicable. Must be null.
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Not applicable. Must be null.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora MySQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the primary DB instance of the Aurora MySQL DB cluster is created.
     *        If this parameter isn't specified for an Aurora MySQL DB cluster, no database is created in the DB
     *        cluster.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        It must contain 1 to 64 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can't be a word reserved by the database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Amazon Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the primary DB instance of the Aurora PostgreSQL DB cluster is
     *        created. If this parameter isn't specified for an Aurora PostgreSQL DB cluster, a database named
     *        <code>postgres</code> is created in the DB cluster.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        It must contain 1 to 63 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must begin with a letter. Subsequent characters can be letters, underscores, or digits (0 to 9).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can't be a word reserved by the database engine.
     *        </p>
     *        </li>
     */

    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter isn't specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter isn't specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter isn't specified, a database
     * named <code>postgres</code> is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created DB instance. If you specify <code>null</code>, the default value
     * <code>ORCL</code> is used. You can't specify the string NULL, or any other reserved word, for <code>DBName</code>
     * .
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 8 characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Amazon RDS Custom for Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created RDS Custom DB instance. If you don't specify a value, the default value
     * is <code>ORCL</code>.
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must contain 1 to 8 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must contain a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be a word reserved by the database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Amazon RDS Custom for SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>Amazon Aurora MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the primary DB instance of the Aurora MySQL DB cluster is created. If
     * this parameter isn't specified for an Aurora MySQL DB cluster, no database is created in the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must contain 1 to 64 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be a word reserved by the database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Amazon Aurora PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the primary DB instance of the Aurora PostgreSQL DB cluster is created.
     * If this parameter isn't specified for an Aurora PostgreSQL DB cluster, a database named <code>postgres</code> is
     * created in the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must contain 1 to 63 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must begin with a letter. Subsequent characters can be letters, underscores, or digits (0 to 9).
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be a word reserved by the database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The meaning of this parameter differs according to the database engine you use.</p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         The name of the database to create when the DB instance is created. If this parameter isn't specified, no
     *         database is created in the DB instance.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1 to 64 letters or numbers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a word reserved by the specified database engine
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         The name of the database to create when the DB instance is created. If this parameter isn't specified, no
     *         database is created in the DB instance.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1 to 64 letters or numbers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a word reserved by the specified database engine
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         The name of the database to create when the DB instance is created. If this parameter isn't specified, a
     *         database named <code>postgres</code> is created in the DB instance.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1 to 63 letters, numbers, or underscores.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a word reserved by the specified database engine
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         The Oracle System ID (SID) of the created DB instance. If you specify <code>null</code>, the default
     *         value <code>ORCL</code> is used. You can't specify the string NULL, or any other reserved word, for
     *         <code>DBName</code>.
     *         </p>
     *         <p>
     *         Default: <code>ORCL</code>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be longer than 8 characters
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Amazon RDS Custom for Oracle</b>
     *         </p>
     *         <p>
     *         The Oracle System ID (SID) of the created RDS Custom DB instance. If you don't specify a value, the
     *         default value is <code>ORCL</code>.
     *         </p>
     *         <p>
     *         Default: <code>ORCL</code>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         It must contain 1 to 8 alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It must contain a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It can't be a word reserved by the database engine.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Amazon RDS Custom for SQL Server</b>
     *         </p>
     *         <p>
     *         Not applicable. Must be null.
     *         </p>
     *         <p>
     *         <b>SQL Server</b>
     *         </p>
     *         <p>
     *         Not applicable. Must be null.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora MySQL</b>
     *         </p>
     *         <p>
     *         The name of the database to create when the primary DB instance of the Aurora MySQL DB cluster is
     *         created. If this parameter isn't specified for an Aurora MySQL DB cluster, no database is created in the
     *         DB cluster.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         It must contain 1 to 64 alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It can't be a word reserved by the database engine.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Amazon Aurora PostgreSQL</b>
     *         </p>
     *         <p>
     *         The name of the database to create when the primary DB instance of the Aurora PostgreSQL DB cluster is
     *         created. If this parameter isn't specified for an Aurora PostgreSQL DB cluster, a database named
     *         <code>postgres</code> is created in the DB cluster.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         It must contain 1 to 63 alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It must begin with a letter. Subsequent characters can be letters, underscores, or digits (0 to 9).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It can't be a word reserved by the database engine.
     *         </p>
     *         </li>
     */

    public String getDBName() {
        return this.dBName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter isn't specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter isn't specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter isn't specified, a database
     * named <code>postgres</code> is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created DB instance. If you specify <code>null</code>, the default value
     * <code>ORCL</code> is used. You can't specify the string NULL, or any other reserved word, for <code>DBName</code>
     * .
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 8 characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Amazon RDS Custom for Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created RDS Custom DB instance. If you don't specify a value, the default value
     * is <code>ORCL</code>.
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must contain 1 to 8 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must contain a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be a word reserved by the database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Amazon RDS Custom for SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>Amazon Aurora MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the primary DB instance of the Aurora MySQL DB cluster is created. If
     * this parameter isn't specified for an Aurora MySQL DB cluster, no database is created in the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must contain 1 to 64 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be a word reserved by the database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Amazon Aurora PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the primary DB instance of the Aurora PostgreSQL DB cluster is created.
     * If this parameter isn't specified for an Aurora PostgreSQL DB cluster, a database named <code>postgres</code> is
     * created in the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must contain 1 to 63 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * It must begin with a letter. Subsequent characters can be letters, underscores, or digits (0 to 9).
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be a word reserved by the database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBName
     *        The meaning of this parameter differs according to the database engine you use.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the DB instance is created. If this parameter isn't specified, no
     *        database is created in the DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 64 letters or numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a word reserved by the specified database engine
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the DB instance is created. If this parameter isn't specified, no
     *        database is created in the DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 64 letters or numbers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a word reserved by the specified database engine
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the DB instance is created. If this parameter isn't specified, a
     *        database named <code>postgres</code> is created in the DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 63 letters, numbers, or underscores.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must begin with a letter. Subsequent characters can be letters, underscores, or digits (0-9).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a word reserved by the specified database engine
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        The Oracle System ID (SID) of the created DB instance. If you specify <code>null</code>, the default value
     *        <code>ORCL</code> is used. You can't specify the string NULL, or any other reserved word, for
     *        <code>DBName</code>.
     *        </p>
     *        <p>
     *        Default: <code>ORCL</code>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be longer than 8 characters
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Amazon RDS Custom for Oracle</b>
     *        </p>
     *        <p>
     *        The Oracle System ID (SID) of the created RDS Custom DB instance. If you don't specify a value, the
     *        default value is <code>ORCL</code>.
     *        </p>
     *        <p>
     *        Default: <code>ORCL</code>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        It must contain 1 to 8 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must contain a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can't be a word reserved by the database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Amazon RDS Custom for SQL Server</b>
     *        </p>
     *        <p>
     *        Not applicable. Must be null.
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Not applicable. Must be null.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora MySQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the primary DB instance of the Aurora MySQL DB cluster is created.
     *        If this parameter isn't specified for an Aurora MySQL DB cluster, no database is created in the DB
     *        cluster.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        It must contain 1 to 64 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can't be a word reserved by the database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Amazon Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the primary DB instance of the Aurora PostgreSQL DB cluster is
     *        created. If this parameter isn't specified for an Aurora PostgreSQL DB cluster, a database named
     *        <code>postgres</code> is created in the DB cluster.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        It must contain 1 to 63 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It must begin with a letter. Subsequent characters can be letters, underscores, or digits (0 to 9).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can't be a word reserved by the database engine.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBName(String dBName) {
        setDBName(dBName);
        return this;
    }

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mydbinstance</code>
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     * 
     * @return The DB instance identifier. This parameter is stored as a lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>mydbinstance</code>
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mydbinstance</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to allocate for the DB instance.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database increases,
     * though you are only charged for the space that you use in an Aurora cluster volume.
     * </p>
     * <p>
     * <b>Amazon RDS Custom</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 40 to 65536 for RDS Custom for Oracle, 16384
     * for RDS Custom for SQL Server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 40 to 65536 for RDS Custom for Oracle, 16384 for RDS
     * Custom for SQL Server.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 10 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 20 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 100 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 100 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 20 to 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 1024.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param allocatedStorage
     *        The amount of storage in gibibytes (GiB) to allocate for the DB instance.</p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database
     *        increases, though you are only charged for the space that you use in an Aurora cluster volume.
     *        </p>
     *        <p>
     *        <b>Amazon RDS Custom</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3): Must be an integer from 40 to 65536 for RDS Custom for Oracle,
     *        16384 for RDS Custom for SQL Server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1): Must be an integer from 40 to 65536 for RDS Custom for Oracle, 16384 for
     *        RDS Custom for SQL Server.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic storage (standard): Must be an integer from 5 to 3072.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic storage (standard): Must be an integer from 5 to 3072.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic storage (standard): Must be an integer from 5 to 3072.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic storage (standard): Must be an integer from 10 to 3072.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Enterprise and Standard editions: Must be an integer from 20 to 16384.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Web and Express editions: Must be an integer from 20 to 16384.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Enterprise and Standard editions: Must be an integer from 100 to 16384.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Web and Express editions: Must be an integer from 100 to 16384.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic storage (standard):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Enterprise and Standard editions: Must be an integer from 20 to 1024.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Web and Express editions: Must be an integer from 20 to 1024.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to allocate for the DB instance.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database increases,
     * though you are only charged for the space that you use in an Aurora cluster volume.
     * </p>
     * <p>
     * <b>Amazon RDS Custom</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 40 to 65536 for RDS Custom for Oracle, 16384
     * for RDS Custom for SQL Server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 40 to 65536 for RDS Custom for Oracle, 16384 for RDS
     * Custom for SQL Server.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 10 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 20 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 100 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 100 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 20 to 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 1024.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The amount of storage in gibibytes (GiB) to allocate for the DB instance.</p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database
     *         increases, though you are only charged for the space that you use in an Aurora cluster volume.
     *         </p>
     *         <p>
     *         <b>Amazon RDS Custom</b>
     *         </p>
     *         <p>
     *         Constraints to the amount of storage for each storage type are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General Purpose (SSD) storage (gp2, gp3): Must be an integer from 40 to 65536 for RDS Custom for Oracle,
     *         16384 for RDS Custom for SQL Server.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Provisioned IOPS storage (io1): Must be an integer from 40 to 65536 for RDS Custom for Oracle, 16384 for
     *         RDS Custom for SQL Server.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Constraints to the amount of storage for each storage type are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Magnetic storage (standard): Must be an integer from 5 to 3072.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Constraints to the amount of storage for each storage type are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Magnetic storage (standard): Must be an integer from 5 to 3072.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Constraints to the amount of storage for each storage type are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Magnetic storage (standard): Must be an integer from 5 to 3072.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Constraints to the amount of storage for each storage type are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Magnetic storage (standard): Must be an integer from 10 to 3072.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>SQL Server</b>
     *         </p>
     *         <p>
     *         Constraints to the amount of storage for each storage type are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General Purpose (SSD) storage (gp2, gp3):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Enterprise and Standard editions: Must be an integer from 20 to 16384.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Web and Express editions: Must be an integer from 20 to 16384.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Provisioned IOPS storage (io1):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Enterprise and Standard editions: Must be an integer from 100 to 16384.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Web and Express editions: Must be an integer from 100 to 16384.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Magnetic storage (standard):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Enterprise and Standard editions: Must be an integer from 20 to 1024.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Web and Express editions: Must be an integer from 20 to 1024.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to allocate for the DB instance.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database increases,
     * though you are only charged for the space that you use in an Aurora cluster volume.
     * </p>
     * <p>
     * <b>Amazon RDS Custom</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 40 to 65536 for RDS Custom for Oracle, 16384
     * for RDS Custom for SQL Server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 40 to 65536 for RDS Custom for Oracle, 16384 for RDS
     * Custom for SQL Server.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 10 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2, gp3):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 20 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 100 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 100 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 20 to 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 1024.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param allocatedStorage
     *        The amount of storage in gibibytes (GiB) to allocate for the DB instance.</p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database
     *        increases, though you are only charged for the space that you use in an Aurora cluster volume.
     *        </p>
     *        <p>
     *        <b>Amazon RDS Custom</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3): Must be an integer from 40 to 65536 for RDS Custom for Oracle,
     *        16384 for RDS Custom for SQL Server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1): Must be an integer from 40 to 65536 for RDS Custom for Oracle, 16384 for
     *        RDS Custom for SQL Server.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic storage (standard): Must be an integer from 5 to 3072.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic storage (standard): Must be an integer from 5 to 3072.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic storage (standard): Must be an integer from 5 to 3072.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3): Must be an integer from 20 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic storage (standard): Must be an integer from 10 to 3072.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints to the amount of storage for each storage type are the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        General Purpose (SSD) storage (gp2, gp3):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Enterprise and Standard editions: Must be an integer from 20 to 16384.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Web and Express editions: Must be an integer from 20 to 16384.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Provisioned IOPS storage (io1):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Enterprise and Standard editions: Must be an integer from 100 to 16384.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Web and Express editions: Must be an integer from 100 to 16384.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        Magnetic storage (standard):
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Enterprise and Standard editions: Must be an integer from 20 to 1024.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Web and Express editions: Must be an integer from 20 to 1024.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the DB instance, for example db.m5.large. Not all DB instance classes are
     * available in all Amazon Web Services Regions, or for all database engines. For the full list of DB instance
     * classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance
     * classes</a> in the <i>Amazon RDS User Guide</i> or <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html">Aurora DB
     * instance classes</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param dBInstanceClass
     *        The compute and memory capacity of the DB instance, for example db.m5.large. Not all DB instance classes
     *        are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB
     *        instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance
     *        classes</a> in the <i>Amazon RDS User Guide</i> or <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html">Aurora
     *        DB instance classes</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the DB instance, for example db.m5.large. Not all DB instance classes are
     * available in all Amazon Web Services Regions, or for all database engines. For the full list of DB instance
     * classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance
     * classes</a> in the <i>Amazon RDS User Guide</i> or <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html">Aurora DB
     * instance classes</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @return The compute and memory capacity of the DB instance, for example db.m5.large. Not all DB instance classes
     *         are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB
     *         instance classes, and availability for your engine, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance
     *         classes</a> in the <i>Amazon RDS User Guide</i> or <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html">Aurora
     *         DB instance classes</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the DB instance, for example db.m5.large. Not all DB instance classes are
     * available in all Amazon Web Services Regions, or for all database engines. For the full list of DB instance
     * classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance
     * classes</a> in the <i>Amazon RDS User Guide</i> or <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html">Aurora DB
     * instance classes</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param dBInstanceClass
     *        The compute and memory capacity of the DB instance, for example db.m5.large. Not all DB instance classes
     *        are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB
     *        instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance
     *        classes</a> in the <i>Amazon RDS User Guide</i> or <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html">Aurora
     *        DB instance classes</a> in the <i>Amazon Aurora User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Not every database engine is available for every Amazon Web Services Region.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-ee (for RDS Custom for Oracle instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-sqlserver-ee (for RDS Custom for SQL Server instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-sqlserver-se (for RDS Custom for SQL Server instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-sqlserver-web (for RDS Custom for SQL Server instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-cdb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-cdb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The name of the database engine to be used for this instance.</p>
     *        <p>
     *        Not every database engine is available for every Amazon Web Services Region.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-mysql</code> (for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-oracle-ee (for RDS Custom for Oracle instances)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-sqlserver-ee (for RDS Custom for SQL Server instances)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-sqlserver-se (for RDS Custom for SQL Server instances)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-sqlserver-web (for RDS Custom for SQL Server instances)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mysql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee-cdb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2-cdb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web</code>
     *        </p>
     *        </li>
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Not every database engine is available for every Amazon Web Services Region.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-ee (for RDS Custom for Oracle instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-sqlserver-ee (for RDS Custom for SQL Server instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-sqlserver-se (for RDS Custom for SQL Server instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-sqlserver-web (for RDS Custom for SQL Server instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-cdb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-cdb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the database engine to be used for this instance.</p>
     *         <p>
     *         Not every database engine is available for every Amazon Web Services Region.
     *         </p>
     *         <p>
     *         Valid Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>aurora-mysql</code> (for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>aurora-postgresql</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>custom-oracle-ee (for RDS Custom for Oracle instances)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>custom-sqlserver-ee (for RDS Custom for SQL Server instances)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>custom-sqlserver-se (for RDS Custom for SQL Server instances)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>custom-sqlserver-web (for RDS Custom for SQL Server instances)</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mariadb</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mysql</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-ee</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-ee-cdb</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se2</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se2-cdb</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>postgres</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ee</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-se</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ex</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-web</code>
     *         </p>
     *         </li>
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Not every database engine is available for every Amazon Web Services Region.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-oracle-ee (for RDS Custom for Oracle instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-sqlserver-ee (for RDS Custom for SQL Server instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-sqlserver-se (for RDS Custom for SQL Server instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>custom-sqlserver-web (for RDS Custom for SQL Server instances)</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee-cdb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2-cdb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The name of the database engine to be used for this instance.</p>
     *        <p>
     *        Not every database engine is available for every Amazon Web Services Region.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-mysql</code> (for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>aurora-postgresql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-oracle-ee (for RDS Custom for Oracle instances)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-sqlserver-ee (for RDS Custom for SQL Server instances)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-sqlserver-se (for RDS Custom for SQL Server instances)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>custom-sqlserver-web (for RDS Custom for SQL Server instances)</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mysql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee-cdb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2-cdb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The name for the master user.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The name for the master user is managed by the DB cluster.
     * </p>
     * <p>
     * <b>Amazon RDS</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 16 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUsername
     *        The name for the master user.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The name for the master user is managed by the DB cluster.
     *        </p>
     *        <p>
     *        <b>Amazon RDS</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be 1 to 16 letters, numbers, or underscores.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The name for the master user.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The name for the master user is managed by the DB cluster.
     * </p>
     * <p>
     * <b>Amazon RDS</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 16 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name for the master user.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The name for the master user is managed by the DB cluster.
     *         </p>
     *         <p>
     *         <b>Amazon RDS</b>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Required.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be 1 to 16 letters, numbers, or underscores.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a reserved word for the chosen database engine.
     *         </p>
     *         </li>
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The name for the master user.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The name for the master user is managed by the DB cluster.
     * </p>
     * <p>
     * <b>Amazon RDS</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 16 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUsername
     *        The name for the master user.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The name for the master user is managed by the DB cluster.
     *        </p>
     *        <p>
     *        <b>Amazon RDS</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Required.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be 1 to 16 letters, numbers, or underscores.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The password for the master user. The password can include any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The password for the master user is managed by the DB cluster.
     * </p>
     * <p>
     * Constraints: Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master user. The password can include any printable ASCII character except "/",
     *        """, or "@".</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The password for the master user is managed by the DB cluster.
     *        </p>
     *        <p>
     *        Constraints: Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 30 characters.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user. The password can include any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The password for the master user is managed by the DB cluster.
     * </p>
     * <p>
     * Constraints: Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * 
     * @return The password for the master user. The password can include any printable ASCII character except "/",
     *         """, or "@".</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The password for the master user is managed by the DB cluster.
     *         </p>
     *         <p>
     *         Constraints: Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 41 characters.
     *         </p>
     *         <p>
     *         <b>Microsoft SQL Server</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 128 characters.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 41 characters.
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 30 characters.
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 128 characters.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user. The password can include any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The password for the master user is managed by the DB cluster.
     * </p>
     * <p>
     * Constraints: Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master user. The password can include any printable ASCII character except "/",
     *        """, or "@".</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The password for the master user is managed by the DB cluster.
     *        </p>
     *        <p>
     *        Constraints: Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 30 characters.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * A list of DB security groups to associate with this DB instance.
     * </p>
     * <p>
     * This setting applies to the legacy EC2-Classic platform, which is no longer used to create new DB instances. Use
     * the <code>VpcSecurityGroupIds</code> setting instead.
     * </p>
     * 
     * @return A list of DB security groups to associate with this DB instance.</p>
     *         <p>
     *         This setting applies to the legacy EC2-Classic platform, which is no longer used to create new DB
     *         instances. Use the <code>VpcSecurityGroupIds</code> setting instead.
     */

    public java.util.List<String> getDBSecurityGroups() {
        if (dBSecurityGroups == null) {
            dBSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dBSecurityGroups;
    }

    /**
     * <p>
     * A list of DB security groups to associate with this DB instance.
     * </p>
     * <p>
     * This setting applies to the legacy EC2-Classic platform, which is no longer used to create new DB instances. Use
     * the <code>VpcSecurityGroupIds</code> setting instead.
     * </p>
     * 
     * @param dBSecurityGroups
     *        A list of DB security groups to associate with this DB instance.</p>
     *        <p>
     *        This setting applies to the legacy EC2-Classic platform, which is no longer used to create new DB
     *        instances. Use the <code>VpcSecurityGroupIds</code> setting instead.
     */

    public void setDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }

        this.dBSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>(dBSecurityGroups);
    }

    /**
     * <p>
     * A list of DB security groups to associate with this DB instance.
     * </p>
     * <p>
     * This setting applies to the legacy EC2-Classic platform, which is no longer used to create new DB instances. Use
     * the <code>VpcSecurityGroupIds</code> setting instead.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBSecurityGroups(java.util.Collection)} or {@link #withDBSecurityGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dBSecurityGroups
     *        A list of DB security groups to associate with this DB instance.</p>
     *        <p>
     *        This setting applies to the legacy EC2-Classic platform, which is no longer used to create new DB
     *        instances. Use the <code>VpcSecurityGroupIds</code> setting instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBSecurityGroups(String... dBSecurityGroups) {
        if (this.dBSecurityGroups == null) {
            setDBSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(dBSecurityGroups.length));
        }
        for (String ele : dBSecurityGroups) {
            this.dBSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DB security groups to associate with this DB instance.
     * </p>
     * <p>
     * This setting applies to the legacy EC2-Classic platform, which is no longer used to create new DB instances. Use
     * the <code>VpcSecurityGroupIds</code> setting instead.
     * </p>
     * 
     * @param dBSecurityGroups
     *        A list of DB security groups to associate with this DB instance.</p>
     *        <p>
     *        This setting applies to the legacy EC2-Classic platform, which is no longer used to create new DB
     *        instances. Use the <code>VpcSecurityGroupIds</code> setting instead.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        setDBSecurityGroups(dBSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of Amazon EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * 
     * @return A list of Amazon EC2 VPC security groups to associate with this DB instance.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster.
     *         </p>
     *         <p>
     *         Default: The default EC2 VPC security group for the DB subnet group's VPC.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of Amazon EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of Amazon EC2 VPC security groups to associate with this DB instance.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster.
     *        </p>
     *        <p>
     *        Default: The default EC2 VPC security group for the DB subnet group's VPC.
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of Amazon EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of Amazon EC2 VPC security groups to associate with this DB instance.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster.
     *        </p>
     *        <p>
     *        Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Amazon EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of Amazon EC2 VPC security groups to associate with this DB instance.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster.
     *        </p>
     *        <p>
     *        Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The Availability Zone (AZ) where the database will be created. For information on Amazon Web Services Regions and
     * Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Each Aurora DB cluster hosts copies of its storage in three separate Availability Zones. Specify one of these
     * Availability Zones. Aurora automatically chooses an appropriate Availability Zone if you don't specify one.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's Amazon Web Services Region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The <code>AvailabilityZone</code> parameter can't be specified if the DB instance is a Multi-AZ
     * deployment. The specified Availability Zone must be in the same Amazon Web Services Region as the current
     * endpoint.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone (AZ) where the database will be created. For information on Amazon Web Services
     *        Regions and Availability Zones, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Regions and Availability Zones</a>.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Each Aurora DB cluster hosts copies of its storage in three separate Availability Zones. Specify one of
     *        these Availability Zones. Aurora automatically chooses an appropriate Availability Zone if you don't
     *        specify one.
     *        </p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone in the endpoint's Amazon Web Services Region.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1d</code>
     *        </p>
     *        <p>
     *        Constraint: The <code>AvailabilityZone</code> parameter can't be specified if the DB instance is a
     *        Multi-AZ deployment. The specified Availability Zone must be in the same Amazon Web Services Region as the
     *        current endpoint.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone (AZ) where the database will be created. For information on Amazon Web Services Regions and
     * Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Each Aurora DB cluster hosts copies of its storage in three separate Availability Zones. Specify one of these
     * Availability Zones. Aurora automatically chooses an appropriate Availability Zone if you don't specify one.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's Amazon Web Services Region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The <code>AvailabilityZone</code> parameter can't be specified if the DB instance is a Multi-AZ
     * deployment. The specified Availability Zone must be in the same Amazon Web Services Region as the current
     * endpoint.
     * </p>
     * 
     * @return The Availability Zone (AZ) where the database will be created. For information on Amazon Web Services
     *         Regions and Availability Zones, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *         >Regions and Availability Zones</a>.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Each Aurora DB cluster hosts copies of its storage in three separate Availability Zones. Specify one of
     *         these Availability Zones. Aurora automatically chooses an appropriate Availability Zone if you don't
     *         specify one.
     *         </p>
     *         <p>
     *         Default: A random, system-chosen Availability Zone in the endpoint's Amazon Web Services Region.
     *         </p>
     *         <p>
     *         Example: <code>us-east-1d</code>
     *         </p>
     *         <p>
     *         Constraint: The <code>AvailabilityZone</code> parameter can't be specified if the DB instance is a
     *         Multi-AZ deployment. The specified Availability Zone must be in the same Amazon Web Services Region as
     *         the current endpoint.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone (AZ) where the database will be created. For information on Amazon Web Services Regions and
     * Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Each Aurora DB cluster hosts copies of its storage in three separate Availability Zones. Specify one of these
     * Availability Zones. Aurora automatically chooses an appropriate Availability Zone if you don't specify one.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's Amazon Web Services Region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The <code>AvailabilityZone</code> parameter can't be specified if the DB instance is a Multi-AZ
     * deployment. The specified Availability Zone must be in the same Amazon Web Services Region as the current
     * endpoint.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone (AZ) where the database will be created. For information on Amazon Web Services
     *        Regions and Availability Zones, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Regions and Availability Zones</a>.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Each Aurora DB cluster hosts copies of its storage in three separate Availability Zones. Specify one of
     *        these Availability Zones. Aurora automatically chooses an appropriate Availability Zone if you don't
     *        specify one.
     *        </p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone in the endpoint's Amazon Web Services Region.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1d</code>
     *        </p>
     *        <p>
     *        Constraint: The <code>AvailabilityZone</code> parameter can't be specified if the DB instance is a
     *        Multi-AZ deployment. The specified Availability Zone must be in the same Amazon Web Services Region as the
     *        current endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB instance.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        A DB subnet group to associate with this DB instance.</p>
     *        <p>
     *        Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     *        </p>
     *        <p>
     *        Example: <code>mydbsubnetgroup</code>
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB instance.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * 
     * @return A DB subnet group to associate with this DB instance.</p>
     *         <p>
     *         Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     *         </p>
     *         <p>
     *         Example: <code>mydbsubnetgroup</code>
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB instance.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        A DB subnet group to associate with this DB instance.</p>
     *        <p>
     *        Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     *        </p>
     *        <p>
     *        Example: <code>mydbsubnetgroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a>.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC).
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     *        >Amazon RDS Maintenance Window</a>.</p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *        Services Region, occurring on a random day of the week.
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a>.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @return The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC).
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     *         >Amazon RDS Maintenance Window</a>.</p>
     *         <p>
     *         Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *         Services Region, occurring on a random day of the week.
     *         </p>
     *         <p>
     *         Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *         </p>
     *         <p>
     *         Constraints: Minimum 30-minute window.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC). For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a>.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The time range each week during which system maintenance can occur, in Universal Coordinated Time (UTC).
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     *        >Amazon RDS Maintenance Window</a>.</p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *        Services Region, occurring on a random day of the week.
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance. If you do not specify a value, then the
     * default DB parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group to associate with this DB instance. If you do not specify a value, then
     *        the default DB parameter group for the specified DB engine and version is used.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        It must be 1 to 255 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     */

    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance. If you do not specify a value, then the
     * default DB parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the DB parameter group to associate with this DB instance. If you do not specify a value,
     *         then the default DB parameter group for the specified DB engine and version is used.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         It must be 1 to 255 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     */

    public String getDBParameterGroupName() {
        return this.dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance. If you do not specify a value, then the
     * default DB parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group to associate with this DB instance. If you do not specify a value, then
     *        the default DB parameter group for the specified DB engine and version is used.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        It must be 1 to 255 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBParameterGroupName(String dBParameterGroupName) {
        setDBParameterGroupName(dBParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this parameter to a positive number enables
     * backups. Setting this parameter to 0 disables automated backups.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The retention period for automated backups is managed by the DB cluster.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 for an RDS Custom for Oracle DB instance
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained. Setting this parameter to a positive number
     *        enables backups. Setting this parameter to 0 disables automated backups.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The retention period for automated backups is managed by the DB cluster.
     *        </p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 0 to 35
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be set to 0 if the DB instance is a source to read replicas
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be set to 0 for an RDS Custom for Oracle DB instance
     *        </p>
     *        </li>
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this parameter to a positive number enables
     * backups. Setting this parameter to 0 disables automated backups.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The retention period for automated backups is managed by the DB cluster.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 for an RDS Custom for Oracle DB instance
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of days for which automated backups are retained. Setting this parameter to a positive number
     *         enables backups. Setting this parameter to 0 disables automated backups.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The retention period for automated backups is managed by the DB cluster.
     *         </p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be a value from 0 to 35
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be set to 0 if the DB instance is a source to read replicas
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be set to 0 for an RDS Custom for Oracle DB instance
     *         </p>
     *         </li>
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this parameter to a positive number enables
     * backups. Setting this parameter to 0 disables automated backups.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The retention period for automated backups is managed by the DB cluster.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 for an RDS Custom for Oracle DB instance
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained. Setting this parameter to a positive number
     *        enables backups. Setting this parameter to 0 disables automated backups.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The retention period for automated backups is managed by the DB cluster.
     *        </p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 0 to 35
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be set to 0 if the DB instance is a source to read replicas
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be set to 0 for an RDS Custom for Oracle DB instance
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. The default is a 30-minute window selected at random from an 8-hour
     * block of time for each Amazon Web Services Region. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Backup window</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is managed by the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled, using
     *        the <code>BackupRetentionPeriod</code> parameter. The default is a 30-minute window selected at random
     *        from an 8-hour block of time for each Amazon Web Services Region. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *        >Backup window</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The daily time range for creating automated backups is managed by the DB cluster.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the format <code>hh24:mi-hh24:mi</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. The default is a 30-minute window selected at random from an 8-hour
     * block of time for each Amazon Web Services Region. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Backup window</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is managed by the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The daily time range during which automated backups are created if automated backups are enabled, using
     *         the <code>BackupRetentionPeriod</code> parameter. The default is a 30-minute window selected at random
     *         from an 8-hour block of time for each Amazon Web Services Region. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *         >Backup window</a> in the <i>Amazon RDS User Guide</i>.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The daily time range for creating automated backups is managed by the DB cluster.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the format <code>hh24:mi-hh24:mi</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be in Universal Coordinated Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not conflict with the preferred maintenance window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 30 minutes.
     *         </p>
     *         </li>
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. The default is a 30-minute window selected at random from an 8-hour
     * block of time for each Amazon Web Services Region. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Backup window</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is managed by the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled, using
     *        the <code>BackupRetentionPeriod</code> parameter. The default is a 30-minute window selected at random
     *        from an 8-hour block of time for each Amazon Web Services Region. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *        >Backup window</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The daily time range for creating automated backups is managed by the DB cluster.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the format <code>hh24:mi-hh24:mi</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>,
     * <code>3343</code>, <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * 
     * @param port
     *        The port number on which the database accepts connections.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Default: <code>5432</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Default: <code>1521</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Default: <code>1433</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>,
     *        <code>3343</code>, <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>,
     * <code>3343</code>, <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * 
     * @return The port number on which the database accepts connections.</p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Default: <code>5432</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Default: <code>1521</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         <b>SQL Server</b>
     *         </p>
     *         <p>
     *         Default: <code>1433</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>,
     *         <code>3343</code>, <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Type: Integer
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>,
     * <code>3343</code>, <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * 
     * @param port
     *        The port number on which the database accepts connections.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Default: <code>5432</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Default: <code>1521</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Default: <code>1433</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>,
     *        <code>3343</code>, <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment. You can't set the
     * <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. DB instance Availability Zones (AZs) are managed by the DB cluster.
     * </p>
     * 
     * @param multiAZ
     *        A value that indicates whether the DB instance is a Multi-AZ deployment. You can't set the
     *        <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. DB instance Availability Zones (AZs) are managed by the DB cluster.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment. You can't set the
     * <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. DB instance Availability Zones (AZs) are managed by the DB cluster.
     * </p>
     * 
     * @return A value that indicates whether the DB instance is a Multi-AZ deployment. You can't set the
     *         <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. DB instance Availability Zones (AZs) are managed by the DB cluster.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment. You can't set the
     * <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. DB instance Availability Zones (AZs) are managed by the DB cluster.
     * </p>
     * 
     * @param multiAZ
     *        A value that indicates whether the DB instance is a Multi-AZ deployment. You can't set the
     *        <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. DB instance Availability Zones (AZs) are managed by the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment. You can't set the
     * <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. DB instance Availability Zones (AZs) are managed by the DB cluster.
     * </p>
     * 
     * @return A value that indicates whether the DB instance is a Multi-AZ deployment. You can't set the
     *         <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. DB instance Availability Zones (AZs) are managed by the DB cluster.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * For a list of valid engine versions, use the <code>DescribeDBEngineVersions</code> operation.
     * </p>
     * <p>
     * The following are the database engines and links to information about the major and minor versions that are
     * available with Amazon RDS. Not every database engine is available for every Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The version number of the database engine to be used by the DB instance is managed by the DB
     * cluster.
     * </p>
     * <p>
     * <b>Amazon RDS Custom for Oracle</b>
     * </p>
     * <p>
     * A custom engine version (CEV) that you have previously created. This setting is required for RDS Custom for
     * Oracle. The CEV name has the following format: 19.<i>customized_string</i>. A valid CEV name is
     * <code>19.my_cev1</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-creating.html#custom-creating.create">
     * Creating an RDS Custom for Oracle DB instance</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon RDS Custom for SQL Server</b>
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits-MS.html">RDS Custom for
     * SQL Server general requirements</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt"
     * >MariaDB on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * For information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.VersionSupport"
     * >Microsoft SQL Server Versions on Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt">MySQL on
     * Amazon RDS Versions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html">Oracle
     * Database Engine Release Notes</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts">Amazon RDS
     * for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to use.</p>
     *        <p>
     *        For a list of valid engine versions, use the <code>DescribeDBEngineVersions</code> operation.
     *        </p>
     *        <p>
     *        The following are the database engines and links to information about the major and minor versions that
     *        are available with Amazon RDS. Not every database engine is available for every Amazon Web Services
     *        Region.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The version number of the database engine to be used by the DB instance is managed by the
     *        DB cluster.
     *        </p>
     *        <p>
     *        <b>Amazon RDS Custom for Oracle</b>
     *        </p>
     *        <p>
     *        A custom engine version (CEV) that you have previously created. This setting is required for RDS Custom
     *        for Oracle. The CEV name has the following format: 19.<i>customized_string</i>. A valid CEV name is
     *        <code>19.my_cev1</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-creating.html#custom-creating.create">
     *        Creating an RDS Custom for Oracle DB instance</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        <b>Amazon RDS Custom for SQL Server</b>
     *        </p>
     *        <p>
     *        See <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits-MS.html">RDS Custom
     *        for SQL Server general requirements</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        For information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt"
     *        >MariaDB on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        For information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.VersionSupport"
     *        >Microsoft SQL Server Versions on Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        For information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt"
     *        >MySQL on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        For information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html">Oracle
     *        Database Engine Release Notes</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        For information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts"
     *        >Amazon RDS for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide</i>.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * For a list of valid engine versions, use the <code>DescribeDBEngineVersions</code> operation.
     * </p>
     * <p>
     * The following are the database engines and links to information about the major and minor versions that are
     * available with Amazon RDS. Not every database engine is available for every Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The version number of the database engine to be used by the DB instance is managed by the DB
     * cluster.
     * </p>
     * <p>
     * <b>Amazon RDS Custom for Oracle</b>
     * </p>
     * <p>
     * A custom engine version (CEV) that you have previously created. This setting is required for RDS Custom for
     * Oracle. The CEV name has the following format: 19.<i>customized_string</i>. A valid CEV name is
     * <code>19.my_cev1</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-creating.html#custom-creating.create">
     * Creating an RDS Custom for Oracle DB instance</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon RDS Custom for SQL Server</b>
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits-MS.html">RDS Custom for
     * SQL Server general requirements</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt"
     * >MariaDB on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * For information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.VersionSupport"
     * >Microsoft SQL Server Versions on Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt">MySQL on
     * Amazon RDS Versions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html">Oracle
     * Database Engine Release Notes</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts">Amazon RDS
     * for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @return The version number of the database engine to use.</p>
     *         <p>
     *         For a list of valid engine versions, use the <code>DescribeDBEngineVersions</code> operation.
     *         </p>
     *         <p>
     *         The following are the database engines and links to information about the major and minor versions that
     *         are available with Amazon RDS. Not every database engine is available for every Amazon Web Services
     *         Region.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The version number of the database engine to be used by the DB instance is managed by the
     *         DB cluster.
     *         </p>
     *         <p>
     *         <b>Amazon RDS Custom for Oracle</b>
     *         </p>
     *         <p>
     *         A custom engine version (CEV) that you have previously created. This setting is required for RDS Custom
     *         for Oracle. The CEV name has the following format: 19.<i>customized_string</i>. A valid CEV name is
     *         <code>19.my_cev1</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-creating.html#custom-creating.create"
     *         > Creating an RDS Custom for Oracle DB instance</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         <b>Amazon RDS Custom for SQL Server</b>
     *         </p>
     *         <p>
     *         See <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits-MS.html">RDS
     *         Custom for SQL Server general requirements</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         For information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt"
     *         >MariaDB on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         <b>Microsoft SQL Server</b>
     *         </p>
     *         <p>
     *         For information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.VersionSupport"
     *         >Microsoft SQL Server Versions on Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         For information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt">MySQL
     *         on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         For information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html"
     *         >Oracle Database Engine Release Notes</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         For information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts"
     *         >Amazon RDS for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide</i>.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * For a list of valid engine versions, use the <code>DescribeDBEngineVersions</code> operation.
     * </p>
     * <p>
     * The following are the database engines and links to information about the major and minor versions that are
     * available with Amazon RDS. Not every database engine is available for every Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The version number of the database engine to be used by the DB instance is managed by the DB
     * cluster.
     * </p>
     * <p>
     * <b>Amazon RDS Custom for Oracle</b>
     * </p>
     * <p>
     * A custom engine version (CEV) that you have previously created. This setting is required for RDS Custom for
     * Oracle. The CEV name has the following format: 19.<i>customized_string</i>. A valid CEV name is
     * <code>19.my_cev1</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-creating.html#custom-creating.create">
     * Creating an RDS Custom for Oracle DB instance</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon RDS Custom for SQL Server</b>
     * </p>
     * <p>
     * See <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits-MS.html">RDS Custom for
     * SQL Server general requirements</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt"
     * >MariaDB on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * For information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.VersionSupport"
     * >Microsoft SQL Server Versions on Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt">MySQL on
     * Amazon RDS Versions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html">Oracle
     * Database Engine Release Notes</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts">Amazon RDS
     * for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to use.</p>
     *        <p>
     *        For a list of valid engine versions, use the <code>DescribeDBEngineVersions</code> operation.
     *        </p>
     *        <p>
     *        The following are the database engines and links to information about the major and minor versions that
     *        are available with Amazon RDS. Not every database engine is available for every Amazon Web Services
     *        Region.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The version number of the database engine to be used by the DB instance is managed by the
     *        DB cluster.
     *        </p>
     *        <p>
     *        <b>Amazon RDS Custom for Oracle</b>
     *        </p>
     *        <p>
     *        A custom engine version (CEV) that you have previously created. This setting is required for RDS Custom
     *        for Oracle. The CEV name has the following format: 19.<i>customized_string</i>. A valid CEV name is
     *        <code>19.my_cev1</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-creating.html#custom-creating.create">
     *        Creating an RDS Custom for Oracle DB instance</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        <b>Amazon RDS Custom for SQL Server</b>
     *        </p>
     *        <p>
     *        See <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits-MS.html">RDS Custom
     *        for SQL Server general requirements</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        For information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt"
     *        >MariaDB on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        For information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.VersionSupport"
     *        >Microsoft SQL Server Versions on Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        For information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt"
     *        >MySQL on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        For information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html">Oracle
     *        Database Engine Release Notes</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        For information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts"
     *        >Amazon RDS for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the DB instance during the
     * maintenance window. By default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * If you create an RDS Custom DB instance, you must set <code>AutoMinorVersionUpgrade</code> to <code>false</code>.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        A value that indicates whether minor engine upgrades are applied automatically to the DB instance during
     *        the maintenance window. By default, minor engine upgrades are applied automatically.</p>
     *        <p>
     *        If you create an RDS Custom DB instance, you must set <code>AutoMinorVersionUpgrade</code> to
     *        <code>false</code>.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the DB instance during the
     * maintenance window. By default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * If you create an RDS Custom DB instance, you must set <code>AutoMinorVersionUpgrade</code> to <code>false</code>.
     * </p>
     * 
     * @return A value that indicates whether minor engine upgrades are applied automatically to the DB instance during
     *         the maintenance window. By default, minor engine upgrades are applied automatically.</p>
     *         <p>
     *         If you create an RDS Custom DB instance, you must set <code>AutoMinorVersionUpgrade</code> to
     *         <code>false</code>.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the DB instance during the
     * maintenance window. By default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * If you create an RDS Custom DB instance, you must set <code>AutoMinorVersionUpgrade</code> to <code>false</code>.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        A value that indicates whether minor engine upgrades are applied automatically to the DB instance during
     *        the maintenance window. By default, minor engine upgrades are applied automatically.</p>
     *        <p>
     *        If you create an RDS Custom DB instance, you must set <code>AutoMinorVersionUpgrade</code> to
     *        <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the DB instance during the
     * maintenance window. By default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * If you create an RDS Custom DB instance, you must set <code>AutoMinorVersionUpgrade</code> to <code>false</code>.
     * </p>
     * 
     * @return A value that indicates whether minor engine upgrades are applied automatically to the DB instance during
     *         the maintenance window. By default, minor engine upgrades are applied automatically.</p>
     *         <p>
     *         If you create an RDS Custom DB instance, you must set <code>AutoMinorVersionUpgrade</code> to
     *         <code>false</code>.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * 
     * @param licenseModel
     *        License model information for this DB instance.</p>
     *        <p>
     *        Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *        <code>general-public-license</code>
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * 
     * @return License model information for this DB instance.</p>
     *         <p>
     *         Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * 
     * @param licenseModel
     *        License model information for this DB instance.</p>
     *        <p>
     *        Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *        <code>general-public-license</code>
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance. For information about valid IOPS values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html">Amazon RDS DB instance
     * storage</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL DB instances, must be a multiple between .5 and 50 of the
     * storage amount for the DB instance. For SQL Server DB instances, must be a multiple between 1 and 50 of the
     * storage amount for the DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB cluster.
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     *        instance. For information about valid IOPS values, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html">Amazon RDS DB instance
     *        storage</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL DB instances, must be a multiple between .5 and 50
     *        of the storage amount for the DB instance. For SQL Server DB instances, must be a multiple between 1 and
     *        50 of the storage amount for the DB instance.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Storage is managed by the DB cluster.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance. For information about valid IOPS values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html">Amazon RDS DB instance
     * storage</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL DB instances, must be a multiple between .5 and 50 of the
     * storage amount for the DB instance. For SQL Server DB instances, must be a multiple between 1 and 50 of the
     * storage amount for the DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB cluster.
     * </p>
     * 
     * @return The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     *         instance. For information about valid IOPS values, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html">Amazon RDS DB instance
     *         storage</a> in the <i>Amazon RDS User Guide</i>.</p>
     *         <p>
     *         Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL DB instances, must be a multiple between .5 and
     *         50 of the storage amount for the DB instance. For SQL Server DB instances, must be a multiple between 1
     *         and 50 of the storage amount for the DB instance.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Storage is managed by the DB cluster.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance. For information about valid IOPS values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html">Amazon RDS DB instance
     * storage</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL DB instances, must be a multiple between .5 and 50 of the
     * storage amount for the DB instance. For SQL Server DB instances, must be a multiple between 1 and 50 of the
     * storage amount for the DB instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB cluster.
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     *        instance. For information about valid IOPS values, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html">Amazon RDS DB instance
     *        storage</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL DB instances, must be a multiple between .5 and 50
     *        of the storage amount for the DB instance. For SQL Server DB instances, must be a multiple between 1 and
     *        50 of the storage amount for the DB instance.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Storage is managed by the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * A value that indicates that the DB instance should be associated with the specified option group.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group. Also, that option group can't be removed from a DB instance after it is associated with a DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * 
     * @param optionGroupName
     *        A value that indicates that the DB instance should be associated with the specified option group.</p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *        option group. Also, that option group can't be removed from a DB instance after it is associated with a DB
     *        instance.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * A value that indicates that the DB instance should be associated with the specified option group.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group. Also, that option group can't be removed from a DB instance after it is associated with a DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * 
     * @return A value that indicates that the DB instance should be associated with the specified option group.</p>
     *         <p>
     *         Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *         option group. Also, that option group can't be removed from a DB instance after it is associated with a
     *         DB instance.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * A value that indicates that the DB instance should be associated with the specified option group.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group. Also, that option group can't be removed from a DB instance after it is associated with a DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * 
     * @param optionGroupName
     *        A value that indicates that the DB instance should be associated with the specified option group.</p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *        option group. Also, that option group can't be removed from a DB instance after it is associated with a DB
     *        instance.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * For supported engines, this value indicates that the DB instance should be associated with the specified
     * <code>CharacterSet</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom. However, if you need to change the character set, you can change it on
     * the database itself.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The character set is managed by the DB cluster. For more information, see
     * <code>CreateDBCluster</code>.
     * </p>
     * 
     * @param characterSetName
     *        For supported engines, this value indicates that the DB instance should be associated with the specified
     *        <code>CharacterSet</code>.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom. However, if you need to change the character set, you can change
     *        it on the database itself.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The character set is managed by the DB cluster. For more information, see
     *        <code>CreateDBCluster</code>.
     */

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * For supported engines, this value indicates that the DB instance should be associated with the specified
     * <code>CharacterSet</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom. However, if you need to change the character set, you can change it on
     * the database itself.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The character set is managed by the DB cluster. For more information, see
     * <code>CreateDBCluster</code>.
     * </p>
     * 
     * @return For supported engines, this value indicates that the DB instance should be associated with the specified
     *         <code>CharacterSet</code>.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom. However, if you need to change the character set, you can
     *         change it on the database itself.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The character set is managed by the DB cluster. For more information, see
     *         <code>CreateDBCluster</code>.
     */

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * <p>
     * For supported engines, this value indicates that the DB instance should be associated with the specified
     * <code>CharacterSet</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom. However, if you need to change the character set, you can change it on
     * the database itself.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The character set is managed by the DB cluster. For more information, see
     * <code>CreateDBCluster</code>.
     * </p>
     * 
     * @param characterSetName
     *        For supported engines, this value indicates that the DB instance should be associated with the specified
     *        <code>CharacterSet</code>.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom. However, if you need to change the character set, you can change
     *        it on the database itself.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The character set is managed by the DB cluster. For more information, see
     *        <code>CreateDBCluster</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withCharacterSetName(String characterSetName) {
        setCharacterSetName(characterSetName);
        return this;
    }

    /**
     * <p>
     * The name of the NCHAR character set for the Oracle DB instance.
     * </p>
     * <p>
     * This parameter doesn't apply to RDS Custom.
     * </p>
     * 
     * @param ncharCharacterSetName
     *        The name of the NCHAR character set for the Oracle DB instance.</p>
     *        <p>
     *        This parameter doesn't apply to RDS Custom.
     */

    public void setNcharCharacterSetName(String ncharCharacterSetName) {
        this.ncharCharacterSetName = ncharCharacterSetName;
    }

    /**
     * <p>
     * The name of the NCHAR character set for the Oracle DB instance.
     * </p>
     * <p>
     * This parameter doesn't apply to RDS Custom.
     * </p>
     * 
     * @return The name of the NCHAR character set for the Oracle DB instance.</p>
     *         <p>
     *         This parameter doesn't apply to RDS Custom.
     */

    public String getNcharCharacterSetName() {
        return this.ncharCharacterSetName;
    }

    /**
     * <p>
     * The name of the NCHAR character set for the Oracle DB instance.
     * </p>
     * <p>
     * This parameter doesn't apply to RDS Custom.
     * </p>
     * 
     * @param ncharCharacterSetName
     *        The name of the NCHAR character set for the Oracle DB instance.</p>
     *        <p>
     *        This parameter doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withNcharCharacterSetName(String ncharCharacterSetName) {
        setNcharCharacterSetName(ncharCharacterSetName);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB instance's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB instance's VPC. Access to the DB instance is ultimately controlled by the security group it
     * uses. That public access is not permitted if the security group assigned to the DB instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB instance is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB instance is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     * 
     * @param publiclyAccessible
     *        A value that indicates whether the DB instance is publicly accessible.</p>
     *        <p>
     *        When the DB instance is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *        IP address from within the DB instance's virtual private cloud (VPC). It resolves to the public IP address
     *        from outside of the DB instance's VPC. Access to the DB instance is ultimately controlled by the security
     *        group it uses. That public access is not permitted if the security group assigned to the DB instance
     *        doesn't permit it.
     *        </p>
     *        <p>
     *        When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that
     *        resolves to a private IP address.
     *        </p>
     *        <p>
     *        Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     *        </p>
     *        <p>
     *        If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified,
     *        the following applies:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB instance
     *        is private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the default VPC in the target Region has an internet gateway attached to it, the DB instance is public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     *        following applies:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB instance is
     *        private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the subnets are part of a VPC that has an internet gateway attached to it, the DB instance is public.
     *        </p>
     *        </li>
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB instance's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB instance's VPC. Access to the DB instance is ultimately controlled by the security group it
     * uses. That public access is not permitted if the security group assigned to the DB instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB instance is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB instance is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A value that indicates whether the DB instance is publicly accessible.</p>
     *         <p>
     *         When the DB instance is publicly accessible, its Domain Name System (DNS) endpoint resolves to the
     *         private IP address from within the DB instance's virtual private cloud (VPC). It resolves to the public
     *         IP address from outside of the DB instance's VPC. Access to the DB instance is ultimately controlled by
     *         the security group it uses. That public access is not permitted if the security group assigned to the DB
     *         instance doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that
     *         resolves to a private IP address.
     *         </p>
     *         <p>
     *         Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     *         </p>
     *         <p>
     *         If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified,
     *         the following applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB instance
     *         is private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the default VPC in the target Region has an internet gateway attached to it, the DB instance is
     *         public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     *         following applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB instance is
     *         private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that has an internet gateway attached to it, the DB instance is public.
     *         </p>
     *         </li>
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB instance's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB instance's VPC. Access to the DB instance is ultimately controlled by the security group it
     * uses. That public access is not permitted if the security group assigned to the DB instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB instance is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB instance is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     * 
     * @param publiclyAccessible
     *        A value that indicates whether the DB instance is publicly accessible.</p>
     *        <p>
     *        When the DB instance is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *        IP address from within the DB instance's virtual private cloud (VPC). It resolves to the public IP address
     *        from outside of the DB instance's VPC. Access to the DB instance is ultimately controlled by the security
     *        group it uses. That public access is not permitted if the security group assigned to the DB instance
     *        doesn't permit it.
     *        </p>
     *        <p>
     *        When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that
     *        resolves to a private IP address.
     *        </p>
     *        <p>
     *        Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     *        </p>
     *        <p>
     *        If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified,
     *        the following applies:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB instance
     *        is private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the default VPC in the target Region has an internet gateway attached to it, the DB instance is public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     *        following applies:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB instance is
     *        private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the subnets are part of a VPC that has an internet gateway attached to it, the DB instance is public.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB instance's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB instance's VPC. Access to the DB instance is ultimately controlled by the security group it
     * uses. That public access is not permitted if the security group assigned to the DB instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB instance is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB instance is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A value that indicates whether the DB instance is publicly accessible.</p>
     *         <p>
     *         When the DB instance is publicly accessible, its Domain Name System (DNS) endpoint resolves to the
     *         private IP address from within the DB instance's virtual private cloud (VPC). It resolves to the public
     *         IP address from outside of the DB instance's VPC. Access to the DB instance is ultimately controlled by
     *         the security group it uses. That public access is not permitted if the security group assigned to the DB
     *         instance doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that
     *         resolves to a private IP address.
     *         </p>
     *         <p>
     *         Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     *         </p>
     *         <p>
     *         If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified,
     *         the following applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB instance
     *         is private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the default VPC in the target Region has an internet gateway attached to it, the DB instance is
     *         public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     *         following applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB instance is
     *         private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that has an internet gateway attached to it, the DB instance is public.
     *         </p>
     *         </li>
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Tags to assign to the DB instance.
     * </p>
     * 
     * @return Tags to assign to the DB instance.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Tags to assign to the DB instance.
     * </p>
     * 
     * @param tags
     *        Tags to assign to the DB instance.
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
     * Tags to assign to the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to assign to the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Tags to assign to the DB instance.
     * </p>
     * 
     * @param tags
     *        Tags to assign to the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The identifier of the DB cluster that the instance will belong to.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The identifier of the DB cluster that the instance will belong to.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster that the instance will belong to.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return The identifier of the DB cluster that the instance will belong to.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster that the instance will belong to.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The identifier of the DB cluster that the instance will belong to.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>gp2 | gp3 | io1 | standard</code>
     * </p>
     * <p>
     * If you specify <code>io1</code> or <code>gp3</code>, you must also include a value for the <code>Iops</code>
     * parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB cluster.
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB instance.</p>
     *        <p>
     *        Valid values: <code>gp2 | gp3 | io1 | standard</code>
     *        </p>
     *        <p>
     *        If you specify <code>io1</code> or <code>gp3</code>, you must also include a value for the
     *        <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Storage is managed by the DB cluster.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>gp2 | gp3 | io1 | standard</code>
     * </p>
     * <p>
     * If you specify <code>io1</code> or <code>gp3</code>, you must also include a value for the <code>Iops</code>
     * parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB cluster.
     * </p>
     * 
     * @return Specifies the storage type to be associated with the DB instance.</p>
     *         <p>
     *         Valid values: <code>gp2 | gp3 | io1 | standard</code>
     *         </p>
     *         <p>
     *         If you specify <code>io1</code> or <code>gp3</code>, you must also include a value for the
     *         <code>Iops</code> parameter.
     *         </p>
     *         <p>
     *         Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Storage is managed by the DB cluster.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>gp2 | gp3 | io1 | standard</code>
     * </p>
     * <p>
     * If you specify <code>io1</code> or <code>gp3</code>, you must also include a value for the <code>Iops</code>
     * parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB cluster.
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB instance.</p>
     *        <p>
     *        Valid values: <code>gp2 | gp3 | io1 | standard</code>
     *        </p>
     *        <p>
     *        If you specify <code>io1</code> or <code>gp3</code>, you must also include a value for the
     *        <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Storage is managed by the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which to associate the instance for TDE encryption.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable.
     */

    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * 
     * @return The ARN from the key store with which to associate the instance for TDE encryption.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable.
     */

    public String getTdeCredentialArn() {
        return this.tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which to associate the instance for TDE encryption.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withTdeCredentialArn(String tdeCredentialArn) {
        setTdeCredentialArn(tdeCredentialArn);
        return this;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the device.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param tdeCredentialPassword
     *        The password for the given ARN from the key store in order to access the device.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     */

    public void setTdeCredentialPassword(String tdeCredentialPassword) {
        this.tdeCredentialPassword = tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the device.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return The password for the given ARN from the key store in order to access the device.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public String getTdeCredentialPassword() {
        return this.tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the device.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param tdeCredentialPassword
     *        The password for the given ARN from the key store in order to access the device.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withTdeCredentialPassword(String tdeCredentialPassword) {
        setTdeCredentialPassword(tdeCredentialPassword);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is encrypted. By default, it isn't encrypted.
     * </p>
     * <p>
     * For RDS Custom instances, either set this parameter to <code>true</code> or leave it unset. If you set this
     * parameter to <code>false</code>, RDS reports an error.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The encryption for DB instances is managed by the DB cluster.
     * </p>
     * 
     * @param storageEncrypted
     *        A value that indicates whether the DB instance is encrypted. By default, it isn't encrypted.</p>
     *        <p>
     *        For RDS Custom instances, either set this parameter to <code>true</code> or leave it unset. If you set
     *        this parameter to <code>false</code>, RDS reports an error.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The encryption for DB instances is managed by the DB cluster.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is encrypted. By default, it isn't encrypted.
     * </p>
     * <p>
     * For RDS Custom instances, either set this parameter to <code>true</code> or leave it unset. If you set this
     * parameter to <code>false</code>, RDS reports an error.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The encryption for DB instances is managed by the DB cluster.
     * </p>
     * 
     * @return A value that indicates whether the DB instance is encrypted. By default, it isn't encrypted.</p>
     *         <p>
     *         For RDS Custom instances, either set this parameter to <code>true</code> or leave it unset. If you set
     *         this parameter to <code>false</code>, RDS reports an error.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The encryption for DB instances is managed by the DB cluster.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is encrypted. By default, it isn't encrypted.
     * </p>
     * <p>
     * For RDS Custom instances, either set this parameter to <code>true</code> or leave it unset. If you set this
     * parameter to <code>false</code>, RDS reports an error.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The encryption for DB instances is managed by the DB cluster.
     * </p>
     * 
     * @param storageEncrypted
     *        A value that indicates whether the DB instance is encrypted. By default, it isn't encrypted.</p>
     *        <p>
     *        For RDS Custom instances, either set this parameter to <code>true</code> or leave it unset. If you set
     *        this parameter to <code>false</code>, RDS reports an error.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The encryption for DB instances is managed by the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is encrypted. By default, it isn't encrypted.
     * </p>
     * <p>
     * For RDS Custom instances, either set this parameter to <code>true</code> or leave it unset. If you set this
     * parameter to <code>false</code>, RDS reports an error.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The encryption for DB instances is managed by the DB cluster.
     * </p>
     * 
     * @return A value that indicates whether the DB instance is encrypted. By default, it isn't encrypted.</p>
     *         <p>
     *         For RDS Custom instances, either set this parameter to <code>true</code> or leave it unset. If you set
     *         this parameter to <code>false</code>, RDS reports an error.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The encryption for DB instances is managed by the DB cluster.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted DB instance.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The Amazon Web Services KMS key identifier is managed by the DB cluster. For more information,
     * see <code>CreateDBCluster</code>.
     * </p>
     * <p>
     * If <code>StorageEncrypted</code> is enabled, and you do not specify a value for the <code>KmsKeyId</code>
     * parameter, then Amazon RDS uses your default KMS key. There is a default KMS key for your Amazon Web Services
     * account. Your Amazon Web Services account has a different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Amazon RDS Custom</b>
     * </p>
     * <p>
     * A KMS key is required for RDS Custom instances. For most RDS engines, if you leave this parameter empty while
     * enabling <code>StorageEncrypted</code>, the engine uses the default KMS key. However, RDS Custom doesn't use the
     * default key when this parameter is empty. You must explicitly specify a key.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier for an encrypted DB instance.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The Amazon Web Services KMS key identifier is managed by the DB cluster. For more
     *        information, see <code>CreateDBCluster</code>.
     *        </p>
     *        <p>
     *        If <code>StorageEncrypted</code> is enabled, and you do not specify a value for the <code>KmsKeyId</code>
     *        parameter, then Amazon RDS uses your default KMS key. There is a default KMS key for your Amazon Web
     *        Services account. Your Amazon Web Services account has a different default KMS key for each Amazon Web
     *        Services Region.
     *        </p>
     *        <p>
     *        <b>Amazon RDS Custom</b>
     *        </p>
     *        <p>
     *        A KMS key is required for RDS Custom instances. For most RDS engines, if you leave this parameter empty
     *        while enabling <code>StorageEncrypted</code>, the engine uses the default KMS key. However, RDS Custom
     *        doesn't use the default key when this parameter is empty. You must explicitly specify a key.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted DB instance.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The Amazon Web Services KMS key identifier is managed by the DB cluster. For more information,
     * see <code>CreateDBCluster</code>.
     * </p>
     * <p>
     * If <code>StorageEncrypted</code> is enabled, and you do not specify a value for the <code>KmsKeyId</code>
     * parameter, then Amazon RDS uses your default KMS key. There is a default KMS key for your Amazon Web Services
     * account. Your Amazon Web Services account has a different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Amazon RDS Custom</b>
     * </p>
     * <p>
     * A KMS key is required for RDS Custom instances. For most RDS engines, if you leave this parameter empty while
     * enabling <code>StorageEncrypted</code>, the engine uses the default KMS key. However, RDS Custom doesn't use the
     * default key when this parameter is empty. You must explicitly specify a key.
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier for an encrypted DB instance.</p>
     *         <p>
     *         The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *         key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The Amazon Web Services KMS key identifier is managed by the DB cluster. For more
     *         information, see <code>CreateDBCluster</code>.
     *         </p>
     *         <p>
     *         If <code>StorageEncrypted</code> is enabled, and you do not specify a value for the <code>KmsKeyId</code>
     *         parameter, then Amazon RDS uses your default KMS key. There is a default KMS key for your Amazon Web
     *         Services account. Your Amazon Web Services account has a different default KMS key for each Amazon Web
     *         Services Region.
     *         </p>
     *         <p>
     *         <b>Amazon RDS Custom</b>
     *         </p>
     *         <p>
     *         A KMS key is required for RDS Custom instances. For most RDS engines, if you leave this parameter empty
     *         while enabling <code>StorageEncrypted</code>, the engine uses the default KMS key. However, RDS Custom
     *         doesn't use the default key when this parameter is empty. You must explicitly specify a key.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted DB instance.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The Amazon Web Services KMS key identifier is managed by the DB cluster. For more information,
     * see <code>CreateDBCluster</code>.
     * </p>
     * <p>
     * If <code>StorageEncrypted</code> is enabled, and you do not specify a value for the <code>KmsKeyId</code>
     * parameter, then Amazon RDS uses your default KMS key. There is a default KMS key for your Amazon Web Services
     * account. Your Amazon Web Services account has a different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * <b>Amazon RDS Custom</b>
     * </p>
     * <p>
     * A KMS key is required for RDS Custom instances. For most RDS engines, if you leave this parameter empty while
     * enabling <code>StorageEncrypted</code>, the engine uses the default KMS key. However, RDS Custom doesn't use the
     * default key when this parameter is empty. You must explicitly specify a key.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier for an encrypted DB instance.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The Amazon Web Services KMS key identifier is managed by the DB cluster. For more
     *        information, see <code>CreateDBCluster</code>.
     *        </p>
     *        <p>
     *        If <code>StorageEncrypted</code> is enabled, and you do not specify a value for the <code>KmsKeyId</code>
     *        parameter, then Amazon RDS uses your default KMS key. There is a default KMS key for your Amazon Web
     *        Services account. Your Amazon Web Services account has a different default KMS key for each Amazon Web
     *        Services Region.
     *        </p>
     *        <p>
     *        <b>Amazon RDS Custom</b>
     *        </p>
     *        <p>
     *        A KMS key is required for RDS Custom instances. For most RDS engines, if you leave this parameter empty
     *        while enabling <code>StorageEncrypted</code>, the engine uses the default KMS key. However, RDS Custom
     *        doesn't use the default key when this parameter is empty. You must explicitly specify a key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Active Directory directory ID to create the DB instance in. Currently, only MySQL, Microsoft SQL Server,
     * Oracle, and PostgreSQL DB instances can be created in an Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The domain is managed by the DB cluster.
     * </p>
     * 
     * @param domain
     *        The Active Directory directory ID to create the DB instance in. Currently, only MySQL, Microsoft SQL
     *        Server, Oracle, and PostgreSQL DB instances can be created in an Active Directory Domain.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     *        Authentication</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The domain is managed by the DB cluster.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to create the DB instance in. Currently, only MySQL, Microsoft SQL Server,
     * Oracle, and PostgreSQL DB instances can be created in an Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The domain is managed by the DB cluster.
     * </p>
     * 
     * @return The Active Directory directory ID to create the DB instance in. Currently, only MySQL, Microsoft SQL
     *         Server, Oracle, and PostgreSQL DB instances can be created in an Active Directory Domain.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     *         Authentication</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The domain is managed by the DB cluster.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to create the DB instance in. Currently, only MySQL, Microsoft SQL Server,
     * Oracle, and PostgreSQL DB instances can be created in an Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The domain is managed by the DB cluster.
     * </p>
     * 
     * @param domain
     *        The Active Directory directory ID to create the DB instance in. Currently, only MySQL, Microsoft SQL
     *        Server, Oracle, and PostgreSQL DB instances can be created in an Active Directory Domain.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     *        Authentication</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The domain is managed by the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy tags from the DB instance to snapshots of the DB instance. By default,
     * tags are not copied.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB
     * instance has no effect on the DB cluster setting.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy tags from the DB instance to snapshots of the DB instance. By
     *        default, tags are not copied.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora
     *        DB instance has no effect on the DB cluster setting.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy tags from the DB instance to snapshots of the DB instance. By default,
     * tags are not copied.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB
     * instance has no effect on the DB cluster setting.
     * </p>
     * 
     * @return A value that indicates whether to copy tags from the DB instance to snapshots of the DB instance. By
     *         default, tags are not copied.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora
     *         DB instance has no effect on the DB cluster setting.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy tags from the DB instance to snapshots of the DB instance. By default,
     * tags are not copied.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB
     * instance has no effect on the DB cluster setting.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy tags from the DB instance to snapshots of the DB instance. By
     *        default, tags are not copied.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora
     *        DB instance has no effect on the DB cluster setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy tags from the DB instance to snapshots of the DB instance. By default,
     * tags are not copied.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora DB
     * instance has no effect on the DB cluster setting.
     * </p>
     * 
     * @return A value that indicates whether to copy tags from the DB instance to snapshots of the DB instance. By
     *         default, tags are not copied.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Copying tags to snapshots is managed by the DB cluster. Setting this value for an Aurora
     *         DB instance has no effect on the DB cluster setting.
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collection of Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        instance. To disable collection of Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, then you must set <code>MonitoringInterval</code> to a
     *        value other than 0.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     */

    public void setMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collection of Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * 
     * @return The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *         instance. To disable collection of Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *         <p>
     *         If <code>MonitoringRoleArn</code> is specified, then you must set <code>MonitoringInterval</code> to a
     *         value other than 0.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     */

    public Integer getMonitoringInterval() {
        return this.monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collection of Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        instance. To disable collection of Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, then you must set <code>MonitoringInterval</code> to a
     *        value other than 0.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withMonitoringInterval(Integer monitoringInterval) {
        setMonitoringInterval(monitoringInterval);
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs.
     *        For example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring
     *        role, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     *        >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     *        <code>MonitoringRoleArn</code> value.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     */

    public void setMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs.
     *         For example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a
     *         monitoring role, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     *         >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.</p>
     *         <p>
     *         If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     *         <code>MonitoringRoleArn</code> value.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public String getMonitoringRoleArn() {
        return this.monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs.
     *        For example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring
     *        role, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     *        >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     *        <code>MonitoringRoleArn</code> value.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withMonitoringRoleArn(String monitoringRoleArn) {
        setMonitoringRoleArn(monitoringRoleArn);
        return this;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The domain is managed by the DB cluster.
     * </p>
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The domain is managed by the DB cluster.
     */

    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The domain is managed by the DB cluster.
     * </p>
     * 
     * @return Specify the name of the IAM role to be used when making API calls to the Directory Service.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The domain is managed by the DB cluster.
     */

    public String getDomainIAMRoleName() {
        return this.domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The domain is managed by the DB cluster.
     * </p>
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. The domain is managed by the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDomainIAMRoleName(String domainIAMRoleName) {
        setDomainIAMRoleName(domainIAMRoleName);
        return this;
    }

    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a
     *        failure of the existing primary instance. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     *        > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Valid Values: 0 - 15
     */

    public void setPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
    }

    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     * 
     * @return A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a
     *         failure of the existing primary instance. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     *         > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Valid Values: 0 - 15
     */

    public Integer getPromotionTier() {
        return this.promotionTier;
    }

    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a
     *        failure of the existing primary instance. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.FaultTolerance"
     *        > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Valid Values: 0 - 15
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withPromotionTier(Integer promotionTier) {
        setPromotionTier(promotionTier);
        return this;
    }

    /**
     * <p>
     * The time zone of the DB instance. The time zone parameter is currently supported only by <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     * >Microsoft SQL Server</a>.
     * </p>
     * 
     * @param timezone
     *        The time zone of the DB instance. The time zone parameter is currently supported only by <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     *        >Microsoft SQL Server</a>.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone of the DB instance. The time zone parameter is currently supported only by <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     * >Microsoft SQL Server</a>.
     * </p>
     * 
     * @return The time zone of the DB instance. The time zone parameter is currently supported only by <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     *         >Microsoft SQL Server</a>.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The time zone of the DB instance. The time zone parameter is currently supported only by <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     * >Microsoft SQL Server</a>.
     * </p>
     * 
     * @param timezone
     *        The time zone of the DB instance. The time zone parameter is currently supported only by <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     *        >Microsoft SQL Server</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Mapping Amazon Web Services IAM accounts to database accounts is managed by the DB cluster.
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *        (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *        Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Mapping Amazon Web Services IAM accounts to database accounts is managed by the DB
     *        cluster.
     */

    public void setEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Mapping Amazon Web Services IAM accounts to database accounts is managed by the DB cluster.
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *         (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *         Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Mapping Amazon Web Services IAM accounts to database accounts is managed by the DB
     *         cluster.
     */

    public Boolean getEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Mapping Amazon Web Services IAM accounts to database accounts is managed by the DB cluster.
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *        (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *        Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Mapping Amazon Web Services IAM accounts to database accounts is managed by the DB
     *        cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        setEnableIAMDatabaseAuthentication(enableIAMDatabaseAuthentication);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Mapping Amazon Web Services IAM accounts to database accounts is managed by the DB cluster.
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *         (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *         Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Mapping Amazon Web Services IAM accounts to database accounts is managed by the DB
     *         cluster.
     */

    public Boolean isEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the DB instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param enablePerformanceInsights
     *        A value that indicates whether to enable Performance Insights for the DB instance. For more information,
     *        see <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *        Performance Insights</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     */

    public void setEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        this.enablePerformanceInsights = enablePerformanceInsights;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the DB instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return A value that indicates whether to enable Performance Insights for the DB instance. For more information,
     *         see <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *         Performance Insights</a> in the <i>Amazon RDS User Guide</i>.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public Boolean getEnablePerformanceInsights() {
        return this.enablePerformanceInsights;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the DB instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param enablePerformanceInsights
     *        A value that indicates whether to enable Performance Insights for the DB instance. For more information,
     *        see <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *        Performance Insights</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        setEnablePerformanceInsights(enablePerformanceInsights);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the DB instance. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return A value that indicates whether to enable Performance Insights for the DB instance. For more information,
     *         see <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *         Performance Insights</a> in the <i>Amazon RDS User Guide</i>.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public Boolean isEnablePerformanceInsights() {
        return this.enablePerformanceInsights;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of Performance Insights data.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <p>
     * If you do not specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default KMS
     * key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     * different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param performanceInsightsKMSKeyId
     *        The Amazon Web Services KMS key identifier for encryption of Performance Insights data.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key.
     *        </p>
     *        <p>
     *        If you do not specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     *        default KMS key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services
     *        account has a different default KMS key for each Amazon Web Services Region.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     */

    public void setPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
        this.performanceInsightsKMSKeyId = performanceInsightsKMSKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of Performance Insights data.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <p>
     * If you do not specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default KMS
     * key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     * different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier for encryption of Performance Insights data.</p>
     *         <p>
     *         The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *         key.
     *         </p>
     *         <p>
     *         If you do not specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     *         default KMS key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web
     *         Services account has a different default KMS key for each Amazon Web Services Region.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public String getPerformanceInsightsKMSKeyId() {
        return this.performanceInsightsKMSKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of Performance Insights data.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <p>
     * If you do not specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default KMS
     * key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     * different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param performanceInsightsKMSKeyId
     *        The Amazon Web Services KMS key identifier for encryption of Performance Insights data.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key.
     *        </p>
     *        <p>
     *        If you do not specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     *        default KMS key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services
     *        account has a different default KMS key for each Amazon Web Services Region.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
        setPerformanceInsightsKMSKeyId(performanceInsightsKMSKeyId);
        return this;
    }

    /**
     * <p>
     * The number of days to retain Performance Insights data. The default is 7 days. The following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 7
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>month</i> * 31, where <i>month</i> is a number of months from 1-23
     * </p>
     * </li>
     * <li>
     * <p>
     * 731
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, the following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 93 (3 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * 341 (11 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * 589 (19 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * 731
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a retention period such as 94, which isn't a valid value, RDS issues an error.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param performanceInsightsRetentionPeriod
     *        The number of days to retain Performance Insights data. The default is 7 days. The following values are
     *        valid:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        7
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>month</i> * 31, where <i>month</i> is a number of months from 1-23
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        731
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, the following values are valid:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        93 (3 months * 31)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        341 (11 months * 31)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        589 (19 months * 31)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        731
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify a retention period such as 94, which isn't a valid value, RDS issues an error.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     */

    public void setPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
        this.performanceInsightsRetentionPeriod = performanceInsightsRetentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain Performance Insights data. The default is 7 days. The following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 7
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>month</i> * 31, where <i>month</i> is a number of months from 1-23
     * </p>
     * </li>
     * <li>
     * <p>
     * 731
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, the following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 93 (3 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * 341 (11 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * 589 (19 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * 731
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a retention period such as 94, which isn't a valid value, RDS issues an error.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return The number of days to retain Performance Insights data. The default is 7 days. The following values are
     *         valid:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         7
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>month</i> * 31, where <i>month</i> is a number of months from 1-23
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         731
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, the following values are valid:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         93 (3 months * 31)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         341 (11 months * 31)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         589 (19 months * 31)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         731
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify a retention period such as 94, which isn't a valid value, RDS issues an error.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public Integer getPerformanceInsightsRetentionPeriod() {
        return this.performanceInsightsRetentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain Performance Insights data. The default is 7 days. The following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 7
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>month</i> * 31, where <i>month</i> is a number of months from 1-23
     * </p>
     * </li>
     * <li>
     * <p>
     * 731
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, the following values are valid:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 93 (3 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * 341 (11 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * 589 (19 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * 731
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify a retention period such as 94, which isn't a valid value, RDS issues an error.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param performanceInsightsRetentionPeriod
     *        The number of days to retain Performance Insights data. The default is 7 days. The following values are
     *        valid:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        7
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>month</i> * 31, where <i>month</i> is a number of months from 1-23
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        731
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, the following values are valid:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        93 (3 months * 31)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        341 (11 months * 31)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        589 (19 months * 31)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        731
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify a retention period such as 94, which isn't a valid value, RDS issues an error.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
        setPerformanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on
     * the DB engine. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * > Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. CloudWatch Logs exports are managed by the DB cluster.
     * </p>
     * <p>
     * <b>RDS Custom</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Possible values are <code>agent</code> and <code>error</code>.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Possible values are <code>alert</code>, <code>audit</code>, <code>listener</code>, <code>trace</code>, and
     * <code>oemagent</code>.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * </p>
     * 
     * @return The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list
     *         depend on the DB engine. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         > Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. CloudWatch Logs exports are managed by the DB cluster.
     *         </p>
     *         <p>
     *         <b>RDS Custom</b>
     *         </p>
     *         <p>
     *         Not applicable.
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *         <code>slowquery</code>.
     *         </p>
     *         <p>
     *         <b>Microsoft SQL Server</b>
     *         </p>
     *         <p>
     *         Possible values are <code>agent</code> and <code>error</code>.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *         <code>slowquery</code>.
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Possible values are <code>alert</code>, <code>audit</code>, <code>listener</code>, <code>trace</code>,
     *         and <code>oemagent</code>.
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Possible values are <code>postgresql</code> and <code>upgrade</code>.
     */

    public java.util.List<String> getEnableCloudwatchLogsExports() {
        if (enableCloudwatchLogsExports == null) {
            enableCloudwatchLogsExports = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return enableCloudwatchLogsExports;
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on
     * the DB engine. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * > Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. CloudWatch Logs exports are managed by the DB cluster.
     * </p>
     * <p>
     * <b>RDS Custom</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Possible values are <code>agent</code> and <code>error</code>.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Possible values are <code>alert</code>, <code>audit</code>, <code>listener</code>, <code>trace</code>, and
     * <code>oemagent</code>.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list
     *        depend on the DB engine. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        > Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. CloudWatch Logs exports are managed by the DB cluster.
     *        </p>
     *        <p>
     *        <b>RDS Custom</b>
     *        </p>
     *        <p>
     *        Not applicable.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *        <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        Possible values are <code>agent</code> and <code>error</code>.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *        <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Possible values are <code>alert</code>, <code>audit</code>, <code>listener</code>, <code>trace</code>, and
     *        <code>oemagent</code>.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>postgresql</code> and <code>upgrade</code>.
     */

    public void setEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
        if (enableCloudwatchLogsExports == null) {
            this.enableCloudwatchLogsExports = null;
            return;
        }

        this.enableCloudwatchLogsExports = new com.amazonaws.internal.SdkInternalList<String>(enableCloudwatchLogsExports);
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on
     * the DB engine. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * > Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. CloudWatch Logs exports are managed by the DB cluster.
     * </p>
     * <p>
     * <b>RDS Custom</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Possible values are <code>agent</code> and <code>error</code>.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Possible values are <code>alert</code>, <code>audit</code>, <code>listener</code>, <code>trace</code>, and
     * <code>oemagent</code>.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnableCloudwatchLogsExports(java.util.Collection)} or
     * {@link #withEnableCloudwatchLogsExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list
     *        depend on the DB engine. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        > Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. CloudWatch Logs exports are managed by the DB cluster.
     *        </p>
     *        <p>
     *        <b>RDS Custom</b>
     *        </p>
     *        <p>
     *        Not applicable.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *        <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        Possible values are <code>agent</code> and <code>error</code>.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *        <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Possible values are <code>alert</code>, <code>audit</code>, <code>listener</code>, <code>trace</code>, and
     *        <code>oemagent</code>.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withEnableCloudwatchLogsExports(String... enableCloudwatchLogsExports) {
        if (this.enableCloudwatchLogsExports == null) {
            setEnableCloudwatchLogsExports(new com.amazonaws.internal.SdkInternalList<String>(enableCloudwatchLogsExports.length));
        }
        for (String ele : enableCloudwatchLogsExports) {
            this.enableCloudwatchLogsExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on
     * the DB engine. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * > Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. CloudWatch Logs exports are managed by the DB cluster.
     * </p>
     * <p>
     * <b>RDS Custom</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Possible values are <code>agent</code> and <code>error</code>.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Possible values are <code>alert</code>, <code>audit</code>, <code>listener</code>, <code>trace</code>, and
     * <code>oemagent</code>.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list
     *        depend on the DB engine. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        > Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. CloudWatch Logs exports are managed by the DB cluster.
     *        </p>
     *        <p>
     *        <b>RDS Custom</b>
     *        </p>
     *        <p>
     *        Not applicable.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *        <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        Possible values are <code>agent</code> and <code>error</code>.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *        <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Possible values are <code>alert</code>, <code>audit</code>, <code>listener</code>, <code>trace</code>, and
     *        <code>oemagent</code>.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
        setEnableCloudwatchLogsExports(enableCloudwatchLogsExports);
        return this;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * 
     * @return The number of CPU cores and the number of threads per core for the DB instance class of the DB
     *         instance.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable.
     */

    public java.util.List<ProcessorFeature> getProcessorFeatures() {
        if (processorFeatures == null) {
            processorFeatures = new com.amazonaws.internal.SdkInternalList<ProcessorFeature>();
        }
        return processorFeatures;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB
     *        instance.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable.
     */

    public void setProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        if (processorFeatures == null) {
            this.processorFeatures = null;
            return;
        }

        this.processorFeatures = new com.amazonaws.internal.SdkInternalList<ProcessorFeature>(processorFeatures);
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessorFeatures(java.util.Collection)} or {@link #withProcessorFeatures(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB
     *        instance.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withProcessorFeatures(ProcessorFeature... processorFeatures) {
        if (this.processorFeatures == null) {
            setProcessorFeatures(new com.amazonaws.internal.SdkInternalList<ProcessorFeature>(processorFeatures.length));
        }
        for (ProcessorFeature ele : processorFeatures) {
            this.processorFeatures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB
     *        instance.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted
     * when deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You can enable or disable deletion protection for the DB cluster. For more information, see
     * <code>CreateDBCluster</code>. DB instances in a DB cluster can be deleted even when deletion protection is
     * enabled for the DB cluster.
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB instance has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection isn't enabled. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *        Instance</a>.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. You can enable or disable deletion protection for the DB cluster. For more information,
     *        see <code>CreateDBCluster</code>. DB instances in a DB cluster can be deleted even when deletion
     *        protection is enabled for the DB cluster.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted
     * when deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You can enable or disable deletion protection for the DB cluster. For more information, see
     * <code>CreateDBCluster</code>. DB instances in a DB cluster can be deleted even when deletion protection is
     * enabled for the DB cluster.
     * </p>
     * 
     * @return A value that indicates whether the DB instance has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection isn't enabled. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *         Instance</a>.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. You can enable or disable deletion protection for the DB cluster. For more information,
     *         see <code>CreateDBCluster</code>. DB instances in a DB cluster can be deleted even when deletion
     *         protection is enabled for the DB cluster.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted
     * when deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You can enable or disable deletion protection for the DB cluster. For more information, see
     * <code>CreateDBCluster</code>. DB instances in a DB cluster can be deleted even when deletion protection is
     * enabled for the DB cluster.
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB instance has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection isn't enabled. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *        Instance</a>.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. You can enable or disable deletion protection for the DB cluster. For more information,
     *        see <code>CreateDBCluster</code>. DB instances in a DB cluster can be deleted even when deletion
     *        protection is enabled for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted
     * when deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You can enable or disable deletion protection for the DB cluster. For more information, see
     * <code>CreateDBCluster</code>. DB instances in a DB cluster can be deleted even when deletion protection is
     * enabled for the DB cluster.
     * </p>
     * 
     * @return A value that indicates whether the DB instance has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection isn't enabled. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *         Instance</a>.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. You can enable or disable deletion protection for the DB cluster. For more information,
     *         see <code>CreateDBCluster</code>. DB instances in a DB cluster can be deleted even when deletion
     *         protection is enabled for the DB cluster.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     * <p>
     * For more information about this setting, including limitations that apply to it, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling">
     * Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB cluster.
     * </p>
     * 
     * @param maxAllocatedStorage
     *        The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the DB
     *        instance.</p>
     *        <p>
     *        For more information about this setting, including limitations that apply to it, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling"
     *        > Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User
     *        Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Storage is managed by the DB cluster.
     */

    public void setMaxAllocatedStorage(Integer maxAllocatedStorage) {
        this.maxAllocatedStorage = maxAllocatedStorage;
    }

    /**
     * <p>
     * The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     * <p>
     * For more information about this setting, including limitations that apply to it, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling">
     * Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB cluster.
     * </p>
     * 
     * @return The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the DB
     *         instance.</p>
     *         <p>
     *         For more information about this setting, including limitations that apply to it, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling"
     *         > Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User
     *         Guide</i>.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Storage is managed by the DB cluster.
     */

    public Integer getMaxAllocatedStorage() {
        return this.maxAllocatedStorage;
    }

    /**
     * <p>
     * The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     * <p>
     * For more information about this setting, including limitations that apply to it, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling">
     * Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB cluster.
     * </p>
     * 
     * @param maxAllocatedStorage
     *        The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the DB
     *        instance.</p>
     *        <p>
     *        For more information about this setting, including limitations that apply to it, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling"
     *        > Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User
     *        Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Storage is managed by the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withMaxAllocatedStorage(Integer maxAllocatedStorage) {
        setMaxAllocatedStorage(maxAllocatedStorage);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from
     * outside of its virtual private cloud (VPC) on your local network.
     * </p>
     * <p>
     * For more information about RDS on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on
     * Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about CoIPs, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/routing.html#ip-addressing">Customer-owned IP
     * addresses</a> in the <i>Amazon Web Services Outposts User Guide</i>.
     * </p>
     * 
     * @param enableCustomerOwnedIp
     *        A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB
     *        instance.</p>
     *        <p>
     *        A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     *        on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB
     *        instance from outside of its virtual private cloud (VPC) on your local network.
     *        </p>
     *        <p>
     *        For more information about RDS on Outposts, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS
     *        on Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        For more information about CoIPs, see <a
     *        href="https://docs.aws.amazon.com/outposts/latest/userguide/routing.html#ip-addressing">Customer-owned IP
     *        addresses</a> in the <i>Amazon Web Services Outposts User Guide</i>.
     */

    public void setEnableCustomerOwnedIp(Boolean enableCustomerOwnedIp) {
        this.enableCustomerOwnedIp = enableCustomerOwnedIp;
    }

    /**
     * <p>
     * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from
     * outside of its virtual private cloud (VPC) on your local network.
     * </p>
     * <p>
     * For more information about RDS on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on
     * Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about CoIPs, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/routing.html#ip-addressing">Customer-owned IP
     * addresses</a> in the <i>Amazon Web Services Outposts User Guide</i>.
     * </p>
     * 
     * @return A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB
     *         instance.</p>
     *         <p>
     *         A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     *         on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB
     *         instance from outside of its virtual private cloud (VPC) on your local network.
     *         </p>
     *         <p>
     *         For more information about RDS on Outposts, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon
     *         RDS on Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         For more information about CoIPs, see <a
     *         href="https://docs.aws.amazon.com/outposts/latest/userguide/routing.html#ip-addressing">Customer-owned IP
     *         addresses</a> in the <i>Amazon Web Services Outposts User Guide</i>.
     */

    public Boolean getEnableCustomerOwnedIp() {
        return this.enableCustomerOwnedIp;
    }

    /**
     * <p>
     * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from
     * outside of its virtual private cloud (VPC) on your local network.
     * </p>
     * <p>
     * For more information about RDS on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on
     * Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about CoIPs, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/routing.html#ip-addressing">Customer-owned IP
     * addresses</a> in the <i>Amazon Web Services Outposts User Guide</i>.
     * </p>
     * 
     * @param enableCustomerOwnedIp
     *        A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB
     *        instance.</p>
     *        <p>
     *        A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     *        on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB
     *        instance from outside of its virtual private cloud (VPC) on your local network.
     *        </p>
     *        <p>
     *        For more information about RDS on Outposts, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS
     *        on Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        For more information about CoIPs, see <a
     *        href="https://docs.aws.amazon.com/outposts/latest/userguide/routing.html#ip-addressing">Customer-owned IP
     *        addresses</a> in the <i>Amazon Web Services Outposts User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withEnableCustomerOwnedIp(Boolean enableCustomerOwnedIp) {
        setEnableCustomerOwnedIp(enableCustomerOwnedIp);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from
     * outside of its virtual private cloud (VPC) on your local network.
     * </p>
     * <p>
     * For more information about RDS on Outposts, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on
     * Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about CoIPs, see <a
     * href="https://docs.aws.amazon.com/outposts/latest/userguide/routing.html#ip-addressing">Customer-owned IP
     * addresses</a> in the <i>Amazon Web Services Outposts User Guide</i>.
     * </p>
     * 
     * @return A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB
     *         instance.</p>
     *         <p>
     *         A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     *         on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB
     *         instance from outside of its virtual private cloud (VPC) on your local network.
     *         </p>
     *         <p>
     *         For more information about RDS on Outposts, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon
     *         RDS on Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         For more information about CoIPs, see <a
     *         href="https://docs.aws.amazon.com/outposts/latest/userguide/routing.html#ip-addressing">Customer-owned IP
     *         addresses</a> in the <i>Amazon Web Services Outposts User Guide</i>.
     */

    public Boolean isEnableCustomerOwnedIp() {
        return this.enableCustomerOwnedIp;
    }

    /**
     * <p>
     * The instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB instance. The
     * instance profile must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The profile must exist in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * The profile must have an IAM role that Amazon EC2 has permissions to assume.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance profile name and the associated IAM role name must start with the prefix <code>AWSRDSCustom</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the list of permissions required for the IAM role, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-setup-orcl.html#custom-setup-orcl.iam-vpc">
     * Configure IAM and your VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting is required for RDS Custom.
     * </p>
     * 
     * @param customIamInstanceProfile
     *        The instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB instance. The
     *        instance profile must meet the following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The profile must exist in your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The profile must have an IAM role that Amazon EC2 has permissions to assume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The instance profile name and the associated IAM role name must start with the prefix
     *        <code>AWSRDSCustom</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For the list of permissions required for the IAM role, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-setup-orcl.html#custom-setup-orcl.iam-vpc">
     *        Configure IAM and your VPC</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting is required for RDS Custom.
     */

    public void setCustomIamInstanceProfile(String customIamInstanceProfile) {
        this.customIamInstanceProfile = customIamInstanceProfile;
    }

    /**
     * <p>
     * The instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB instance. The
     * instance profile must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The profile must exist in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * The profile must have an IAM role that Amazon EC2 has permissions to assume.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance profile name and the associated IAM role name must start with the prefix <code>AWSRDSCustom</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the list of permissions required for the IAM role, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-setup-orcl.html#custom-setup-orcl.iam-vpc">
     * Configure IAM and your VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting is required for RDS Custom.
     * </p>
     * 
     * @return The instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB instance. The
     *         instance profile must meet the following requirements:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The profile must exist in your account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The profile must have an IAM role that Amazon EC2 has permissions to assume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance profile name and the associated IAM role name must start with the prefix
     *         <code>AWSRDSCustom</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For the list of permissions required for the IAM role, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-setup-orcl.html#custom-setup-orcl.iam-vpc"
     *         > Configure IAM and your VPC</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         This setting is required for RDS Custom.
     */

    public String getCustomIamInstanceProfile() {
        return this.customIamInstanceProfile;
    }

    /**
     * <p>
     * The instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB instance. The
     * instance profile must meet the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The profile must exist in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * The profile must have an IAM role that Amazon EC2 has permissions to assume.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance profile name and the associated IAM role name must start with the prefix <code>AWSRDSCustom</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the list of permissions required for the IAM role, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-setup-orcl.html#custom-setup-orcl.iam-vpc">
     * Configure IAM and your VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting is required for RDS Custom.
     * </p>
     * 
     * @param customIamInstanceProfile
     *        The instance profile associated with the underlying Amazon EC2 instance of an RDS Custom DB instance. The
     *        instance profile must meet the following requirements:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The profile must exist in your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The profile must have an IAM role that Amazon EC2 has permissions to assume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The instance profile name and the associated IAM role name must start with the prefix
     *        <code>AWSRDSCustom</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For the list of permissions required for the IAM role, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-setup-orcl.html#custom-setup-orcl.iam-vpc">
     *        Configure IAM and your VPC</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting is required for RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withCustomIamInstanceProfile(String customIamInstanceProfile) {
        setCustomIamInstanceProfile(customIamInstanceProfile);
        return this;
    }

    /**
     * <p>
     * Specifies where automated backups and manual snapshots are stored.
     * </p>
     * <p>
     * Possible values are <code>outposts</code> (Amazon Web Services Outposts) and <code>region</code> (Amazon Web
     * Services Region). The default is <code>region</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on
     * Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param backupTarget
     *        Specifies where automated backups and manual snapshots are stored.</p>
     *        <p>
     *        Possible values are <code>outposts</code> (Amazon Web Services Outposts) and <code>region</code> (Amazon
     *        Web Services Region). The default is <code>region</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS
     *        on Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     */

    public void setBackupTarget(String backupTarget) {
        this.backupTarget = backupTarget;
    }

    /**
     * <p>
     * Specifies where automated backups and manual snapshots are stored.
     * </p>
     * <p>
     * Possible values are <code>outposts</code> (Amazon Web Services Outposts) and <code>region</code> (Amazon Web
     * Services Region). The default is <code>region</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on
     * Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @return Specifies where automated backups and manual snapshots are stored.</p>
     *         <p>
     *         Possible values are <code>outposts</code> (Amazon Web Services Outposts) and <code>region</code> (Amazon
     *         Web Services Region). The default is <code>region</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon
     *         RDS on Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     */

    public String getBackupTarget() {
        return this.backupTarget;
    }

    /**
     * <p>
     * Specifies where automated backups and manual snapshots are stored.
     * </p>
     * <p>
     * Possible values are <code>outposts</code> (Amazon Web Services Outposts) and <code>region</code> (Amazon Web
     * Services Region). The default is <code>region</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on
     * Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param backupTarget
     *        Specifies where automated backups and manual snapshots are stored.</p>
     *        <p>
     *        Possible values are <code>outposts</code> (Amazon Web Services Outposts) and <code>region</code> (Amazon
     *        Web Services Region). The default is <code>region</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS
     *        on Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withBackupTarget(String backupTarget) {
        setBackupTarget(backupTarget);
        return this;
    }

    /**
     * <p>
     * The network type of the DB instance.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IPV4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DUAL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The network type is determined by the <code>DBSubnetGroup</code> specified for the DB instance. A
     * <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     * <code>DUAL</code>).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html"> Working
     * with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param networkType
     *        The network type of the DB instance.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IPV4</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DUAL</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The network type is determined by the <code>DBSubnetGroup</code> specified for the DB instance. A
     *        <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     *        <code>DUAL</code>).
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     *        Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     */

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    /**
     * <p>
     * The network type of the DB instance.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IPV4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DUAL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The network type is determined by the <code>DBSubnetGroup</code> specified for the DB instance. A
     * <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     * <code>DUAL</code>).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html"> Working
     * with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return The network type of the DB instance.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IPV4</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DUAL</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The network type is determined by the <code>DBSubnetGroup</code> specified for the DB instance. A
     *         <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     *         <code>DUAL</code>).
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     *         Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     */

    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * <p>
     * The network type of the DB instance.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IPV4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DUAL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The network type is determined by the <code>DBSubnetGroup</code> specified for the DB instance. A
     * <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     * <code>DUAL</code>).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html"> Working
     * with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param networkType
     *        The network type of the DB instance.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IPV4</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DUAL</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The network type is determined by the <code>DBSubnetGroup</code> specified for the DB instance. A
     *        <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     *        <code>DUAL</code>).
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     *        Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withNetworkType(String networkType) {
        setNetworkType(networkType);
        return this;
    }

    /**
     * <p>
     * Specifies the storage throughput value for the DB instance.
     * </p>
     * <p>
     * This setting applies only to the <code>gp3</code> storage type.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     * </p>
     * 
     * @param storageThroughput
     *        Specifies the storage throughput value for the DB instance.</p>
     *        <p>
     *        This setting applies only to the <code>gp3</code> storage type.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom or Amazon Aurora.
     */

    public void setStorageThroughput(Integer storageThroughput) {
        this.storageThroughput = storageThroughput;
    }

    /**
     * <p>
     * Specifies the storage throughput value for the DB instance.
     * </p>
     * <p>
     * This setting applies only to the <code>gp3</code> storage type.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     * </p>
     * 
     * @return Specifies the storage throughput value for the DB instance.</p>
     *         <p>
     *         This setting applies only to the <code>gp3</code> storage type.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom or Amazon Aurora.
     */

    public Integer getStorageThroughput() {
        return this.storageThroughput;
    }

    /**
     * <p>
     * Specifies the storage throughput value for the DB instance.
     * </p>
     * <p>
     * This setting applies only to the <code>gp3</code> storage type.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     * </p>
     * 
     * @param storageThroughput
     *        Specifies the storage throughput value for the DB instance.</p>
     *        <p>
     *        This setting applies only to the <code>gp3</code> storage type.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom or Amazon Aurora.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withStorageThroughput(Integer storageThroughput) {
        setStorageThroughput(storageThroughput);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to manage the master user password with Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password management with
     * Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't manage the master user password with Amazon Web Services Secrets Manager if <code>MasterUserPassword</code>
     * is specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param manageMasterUserPassword
     *        A value that indicates whether to manage the master user password with Amazon Web Services Secrets
     *        Manager.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password management
     *        with Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't manage the master user password with Amazon Web Services Secrets Manager if
     *        <code>MasterUserPassword</code> is specified.
     *        </p>
     *        </li>
     */

    public void setManageMasterUserPassword(Boolean manageMasterUserPassword) {
        this.manageMasterUserPassword = manageMasterUserPassword;
    }

    /**
     * <p>
     * A value that indicates whether to manage the master user password with Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password management with
     * Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't manage the master user password with Amazon Web Services Secrets Manager if <code>MasterUserPassword</code>
     * is specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A value that indicates whether to manage the master user password with Amazon Web Services Secrets
     *         Manager.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password
     *         management with Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't manage the master user password with Amazon Web Services Secrets Manager if
     *         <code>MasterUserPassword</code> is specified.
     *         </p>
     *         </li>
     */

    public Boolean getManageMasterUserPassword() {
        return this.manageMasterUserPassword;
    }

    /**
     * <p>
     * A value that indicates whether to manage the master user password with Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password management with
     * Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't manage the master user password with Amazon Web Services Secrets Manager if <code>MasterUserPassword</code>
     * is specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param manageMasterUserPassword
     *        A value that indicates whether to manage the master user password with Amazon Web Services Secrets
     *        Manager.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password management
     *        with Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't manage the master user password with Amazon Web Services Secrets Manager if
     *        <code>MasterUserPassword</code> is specified.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withManageMasterUserPassword(Boolean manageMasterUserPassword) {
        setManageMasterUserPassword(manageMasterUserPassword);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to manage the master user password with Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password management with
     * Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't manage the master user password with Amazon Web Services Secrets Manager if <code>MasterUserPassword</code>
     * is specified.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A value that indicates whether to manage the master user password with Amazon Web Services Secrets
     *         Manager.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password
     *         management with Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't manage the master user password with Amazon Web Services Secrets Manager if
     *         <code>MasterUserPassword</code> is specified.
     *         </p>
     *         </li>
     */

    public Boolean isManageMasterUserPassword() {
        return this.manageMasterUserPassword;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier to encrypt a secret that is automatically generated and managed in
     * Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets Manager
     * for the DB instance.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * If you don't specify <code>MasterUserSecretKmsKeyId</code>, then the <code>aws/secretsmanager</code> KMS key is
     * used to encrypt the secret. If the secret is in a different Amazon Web Services account, then you can't use the
     * <code>aws/secretsmanager</code> KMS key to encrypt the secret, and you must use a customer managed KMS key.
     * </p>
     * <p>
     * There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a different
     * default KMS key for each Amazon Web Services Region.
     * </p>
     * 
     * @param masterUserSecretKmsKeyId
     *        The Amazon Web Services KMS key identifier to encrypt a secret that is automatically generated and managed
     *        in Amazon Web Services Secrets Manager.</p>
     *        <p>
     *        This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets
     *        Manager for the DB instance.
     *        </p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        If you don't specify <code>MasterUserSecretKmsKeyId</code>, then the <code>aws/secretsmanager</code> KMS
     *        key is used to encrypt the secret. If the secret is in a different Amazon Web Services account, then you
     *        can't use the <code>aws/secretsmanager</code> KMS key to encrypt the secret, and you must use a customer
     *        managed KMS key.
     *        </p>
     *        <p>
     *        There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     *        different default KMS key for each Amazon Web Services Region.
     */

    public void setMasterUserSecretKmsKeyId(String masterUserSecretKmsKeyId) {
        this.masterUserSecretKmsKeyId = masterUserSecretKmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier to encrypt a secret that is automatically generated and managed in
     * Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets Manager
     * for the DB instance.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * If you don't specify <code>MasterUserSecretKmsKeyId</code>, then the <code>aws/secretsmanager</code> KMS key is
     * used to encrypt the secret. If the secret is in a different Amazon Web Services account, then you can't use the
     * <code>aws/secretsmanager</code> KMS key to encrypt the secret, and you must use a customer managed KMS key.
     * </p>
     * <p>
     * There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a different
     * default KMS key for each Amazon Web Services Region.
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier to encrypt a secret that is automatically generated and
     *         managed in Amazon Web Services Secrets Manager.</p>
     *         <p>
     *         This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets
     *         Manager for the DB instance.
     *         </p>
     *         <p>
     *         The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *         key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *         </p>
     *         <p>
     *         If you don't specify <code>MasterUserSecretKmsKeyId</code>, then the <code>aws/secretsmanager</code> KMS
     *         key is used to encrypt the secret. If the secret is in a different Amazon Web Services account, then you
     *         can't use the <code>aws/secretsmanager</code> KMS key to encrypt the secret, and you must use a customer
     *         managed KMS key.
     *         </p>
     *         <p>
     *         There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     *         different default KMS key for each Amazon Web Services Region.
     */

    public String getMasterUserSecretKmsKeyId() {
        return this.masterUserSecretKmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier to encrypt a secret that is automatically generated and managed in
     * Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets Manager
     * for the DB instance.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * If you don't specify <code>MasterUserSecretKmsKeyId</code>, then the <code>aws/secretsmanager</code> KMS key is
     * used to encrypt the secret. If the secret is in a different Amazon Web Services account, then you can't use the
     * <code>aws/secretsmanager</code> KMS key to encrypt the secret, and you must use a customer managed KMS key.
     * </p>
     * <p>
     * There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a different
     * default KMS key for each Amazon Web Services Region.
     * </p>
     * 
     * @param masterUserSecretKmsKeyId
     *        The Amazon Web Services KMS key identifier to encrypt a secret that is automatically generated and managed
     *        in Amazon Web Services Secrets Manager.</p>
     *        <p>
     *        This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets
     *        Manager for the DB instance.
     *        </p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        If you don't specify <code>MasterUserSecretKmsKeyId</code>, then the <code>aws/secretsmanager</code> KMS
     *        key is used to encrypt the secret. If the secret is in a different Amazon Web Services account, then you
     *        can't use the <code>aws/secretsmanager</code> KMS key to encrypt the secret, and you must use a customer
     *        managed KMS key.
     *        </p>
     *        <p>
     *        There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     *        different default KMS key for each Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withMasterUserSecretKmsKeyId(String masterUserSecretKmsKeyId) {
        setMasterUserSecretKmsKeyId(masterUserSecretKmsKeyId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDBName() != null)
            sb.append("DBName: ").append(getDBName()).append(",");
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append(getMasterUserPassword()).append(",");
        if (getDBSecurityGroups() != null)
            sb.append("DBSecurityGroups: ").append(getDBSecurityGroups()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: ").append(getDBSubnetGroupName()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: ").append(getDBParameterGroupName()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: ").append(getCharacterSetName()).append(",");
        if (getNcharCharacterSetName() != null)
            sb.append("NcharCharacterSetName: ").append(getNcharCharacterSetName()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: ").append(getTdeCredentialArn()).append(",");
        if (getTdeCredentialPassword() != null)
            sb.append("TdeCredentialPassword: ").append(getTdeCredentialPassword()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot()).append(",");
        if (getMonitoringInterval() != null)
            sb.append("MonitoringInterval: ").append(getMonitoringInterval()).append(",");
        if (getMonitoringRoleArn() != null)
            sb.append("MonitoringRoleArn: ").append(getMonitoringRoleArn()).append(",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: ").append(getDomainIAMRoleName()).append(",");
        if (getPromotionTier() != null)
            sb.append("PromotionTier: ").append(getPromotionTier()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: ").append(getEnableIAMDatabaseAuthentication()).append(",");
        if (getEnablePerformanceInsights() != null)
            sb.append("EnablePerformanceInsights: ").append(getEnablePerformanceInsights()).append(",");
        if (getPerformanceInsightsKMSKeyId() != null)
            sb.append("PerformanceInsightsKMSKeyId: ").append(getPerformanceInsightsKMSKeyId()).append(",");
        if (getPerformanceInsightsRetentionPeriod() != null)
            sb.append("PerformanceInsightsRetentionPeriod: ").append(getPerformanceInsightsRetentionPeriod()).append(",");
        if (getEnableCloudwatchLogsExports() != null)
            sb.append("EnableCloudwatchLogsExports: ").append(getEnableCloudwatchLogsExports()).append(",");
        if (getProcessorFeatures() != null)
            sb.append("ProcessorFeatures: ").append(getProcessorFeatures()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getMaxAllocatedStorage() != null)
            sb.append("MaxAllocatedStorage: ").append(getMaxAllocatedStorage()).append(",");
        if (getEnableCustomerOwnedIp() != null)
            sb.append("EnableCustomerOwnedIp: ").append(getEnableCustomerOwnedIp()).append(",");
        if (getCustomIamInstanceProfile() != null)
            sb.append("CustomIamInstanceProfile: ").append(getCustomIamInstanceProfile()).append(",");
        if (getBackupTarget() != null)
            sb.append("BackupTarget: ").append(getBackupTarget()).append(",");
        if (getNetworkType() != null)
            sb.append("NetworkType: ").append(getNetworkType()).append(",");
        if (getStorageThroughput() != null)
            sb.append("StorageThroughput: ").append(getStorageThroughput()).append(",");
        if (getManageMasterUserPassword() != null)
            sb.append("ManageMasterUserPassword: ").append(getManageMasterUserPassword()).append(",");
        if (getMasterUserSecretKmsKeyId() != null)
            sb.append("MasterUserSecretKmsKeyId: ").append(getMasterUserSecretKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBInstanceRequest == false)
            return false;
        CreateDBInstanceRequest other = (CreateDBInstanceRequest) obj;
        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getDBSecurityGroups() == null ^ this.getDBSecurityGroups() == null)
            return false;
        if (other.getDBSecurityGroups() != null && other.getDBSecurityGroups().equals(this.getDBSecurityGroups()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false)
            return false;
        if (other.getNcharCharacterSetName() == null ^ this.getNcharCharacterSetName() == null)
            return false;
        if (other.getNcharCharacterSetName() != null && other.getNcharCharacterSetName().equals(this.getNcharCharacterSetName()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
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
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        if (other.getMonitoringInterval() == null ^ this.getMonitoringInterval() == null)
            return false;
        if (other.getMonitoringInterval() != null && other.getMonitoringInterval().equals(this.getMonitoringInterval()) == false)
            return false;
        if (other.getMonitoringRoleArn() == null ^ this.getMonitoringRoleArn() == null)
            return false;
        if (other.getMonitoringRoleArn() != null && other.getMonitoringRoleArn().equals(this.getMonitoringRoleArn()) == false)
            return false;
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null)
            return false;
        if (other.getDomainIAMRoleName() != null && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false)
            return false;
        if (other.getPromotionTier() == null ^ this.getPromotionTier() == null)
            return false;
        if (other.getPromotionTier() != null && other.getPromotionTier().equals(this.getPromotionTier()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() == null ^ this.getEnableIAMDatabaseAuthentication() == null)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() != null
                && other.getEnableIAMDatabaseAuthentication().equals(this.getEnableIAMDatabaseAuthentication()) == false)
            return false;
        if (other.getEnablePerformanceInsights() == null ^ this.getEnablePerformanceInsights() == null)
            return false;
        if (other.getEnablePerformanceInsights() != null && other.getEnablePerformanceInsights().equals(this.getEnablePerformanceInsights()) == false)
            return false;
        if (other.getPerformanceInsightsKMSKeyId() == null ^ this.getPerformanceInsightsKMSKeyId() == null)
            return false;
        if (other.getPerformanceInsightsKMSKeyId() != null && other.getPerformanceInsightsKMSKeyId().equals(this.getPerformanceInsightsKMSKeyId()) == false)
            return false;
        if (other.getPerformanceInsightsRetentionPeriod() == null ^ this.getPerformanceInsightsRetentionPeriod() == null)
            return false;
        if (other.getPerformanceInsightsRetentionPeriod() != null
                && other.getPerformanceInsightsRetentionPeriod().equals(this.getPerformanceInsightsRetentionPeriod()) == false)
            return false;
        if (other.getEnableCloudwatchLogsExports() == null ^ this.getEnableCloudwatchLogsExports() == null)
            return false;
        if (other.getEnableCloudwatchLogsExports() != null && other.getEnableCloudwatchLogsExports().equals(this.getEnableCloudwatchLogsExports()) == false)
            return false;
        if (other.getProcessorFeatures() == null ^ this.getProcessorFeatures() == null)
            return false;
        if (other.getProcessorFeatures() != null && other.getProcessorFeatures().equals(this.getProcessorFeatures()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getMaxAllocatedStorage() == null ^ this.getMaxAllocatedStorage() == null)
            return false;
        if (other.getMaxAllocatedStorage() != null && other.getMaxAllocatedStorage().equals(this.getMaxAllocatedStorage()) == false)
            return false;
        if (other.getEnableCustomerOwnedIp() == null ^ this.getEnableCustomerOwnedIp() == null)
            return false;
        if (other.getEnableCustomerOwnedIp() != null && other.getEnableCustomerOwnedIp().equals(this.getEnableCustomerOwnedIp()) == false)
            return false;
        if (other.getCustomIamInstanceProfile() == null ^ this.getCustomIamInstanceProfile() == null)
            return false;
        if (other.getCustomIamInstanceProfile() != null && other.getCustomIamInstanceProfile().equals(this.getCustomIamInstanceProfile()) == false)
            return false;
        if (other.getBackupTarget() == null ^ this.getBackupTarget() == null)
            return false;
        if (other.getBackupTarget() != null && other.getBackupTarget().equals(this.getBackupTarget()) == false)
            return false;
        if (other.getNetworkType() == null ^ this.getNetworkType() == null)
            return false;
        if (other.getNetworkType() != null && other.getNetworkType().equals(this.getNetworkType()) == false)
            return false;
        if (other.getStorageThroughput() == null ^ this.getStorageThroughput() == null)
            return false;
        if (other.getStorageThroughput() != null && other.getStorageThroughput().equals(this.getStorageThroughput()) == false)
            return false;
        if (other.getManageMasterUserPassword() == null ^ this.getManageMasterUserPassword() == null)
            return false;
        if (other.getManageMasterUserPassword() != null && other.getManageMasterUserPassword().equals(this.getManageMasterUserPassword()) == false)
            return false;
        if (other.getMasterUserSecretKmsKeyId() == null ^ this.getMasterUserSecretKmsKeyId() == null)
            return false;
        if (other.getMasterUserSecretKmsKeyId() != null && other.getMasterUserSecretKmsKeyId().equals(this.getMasterUserSecretKmsKeyId()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getNcharCharacterSetName() == null) ? 0 : getNcharCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialPassword() == null) ? 0 : getTdeCredentialPassword().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode());
        hashCode = prime * hashCode + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        hashCode = prime * hashCode + ((getPromotionTier() == null) ? 0 : getPromotionTier().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getEnableIAMDatabaseAuthentication() == null) ? 0 : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode + ((getEnablePerformanceInsights() == null) ? 0 : getEnablePerformanceInsights().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsKMSKeyId() == null) ? 0 : getPerformanceInsightsKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsRetentionPeriod() == null) ? 0 : getPerformanceInsightsRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getEnableCloudwatchLogsExports() == null) ? 0 : getEnableCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getMaxAllocatedStorage() == null) ? 0 : getMaxAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getEnableCustomerOwnedIp() == null) ? 0 : getEnableCustomerOwnedIp().hashCode());
        hashCode = prime * hashCode + ((getCustomIamInstanceProfile() == null) ? 0 : getCustomIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getBackupTarget() == null) ? 0 : getBackupTarget().hashCode());
        hashCode = prime * hashCode + ((getNetworkType() == null) ? 0 : getNetworkType().hashCode());
        hashCode = prime * hashCode + ((getStorageThroughput() == null) ? 0 : getStorageThroughput().hashCode());
        hashCode = prime * hashCode + ((getManageMasterUserPassword() == null) ? 0 : getManageMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getMasterUserSecretKmsKeyId() == null) ? 0 : getMasterUserSecretKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBInstanceRequest clone() {
        return (CreateDBInstanceRequest) super.clone();
    }

}
