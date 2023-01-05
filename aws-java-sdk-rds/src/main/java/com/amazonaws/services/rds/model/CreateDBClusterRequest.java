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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of Availability Zones (AZs) where DB instances in the DB cluster can be created.
     * </p>
     * <p>
     * For information on Amazon Web Services Regions and Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * The number of days for which automated backups are retained.
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
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified CharacterSet.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String characterSetName;
    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS doesn't
     * create a database in the DB cluster you are creating.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase string.
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
     * Example: <code>my-cluster1</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a value, then
     * the default DB cluster parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB cluster parameter group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String dBClusterParameterGroupName;
    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
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
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for Aurora PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for MySQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html">MySQL on Amazon RDS
     * Versions</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html">Amazon
     * Aurora PostgreSQL releases and engine versions</a> in the <i>Amazon Aurora User Guide</i>.
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
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts">Amazon RDS
     * for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The port number on which the instances in the DB cluster accept connections.
     * </p>
     * <p>
     * <b>RDS for MySQL and Aurora MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>RDS for PostgreSQL and Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * The password for the master database user. This password can contain any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 8 to 41 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified option group.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region. To view the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     * > Backup window</a> in the <i>Amazon Aurora User Guide</i>.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a read
     * replica.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String replicationSourceIdentifier;
    /**
     * <p>
     * Tags to assign to the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * A value that indicates whether the DB cluster is encrypted.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * When a KMS key isn't specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon RDS will use the KMS key
     * used to encrypt the source. Otherwise, Amazon RDS will use your default KMS key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled and <code>ReplicationSourceIdentifier</code> isn't
     * specified, then Amazon RDS will use your default KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a different
     * default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * If you create a read replica of an encrypted DB cluster in another Amazon Web Services Region, you must set
     * <code>KmsKeyId</code> to a KMS key identifier that is valid in the destination Amazon Web Services Region. This
     * KMS key is used to encrypt the read replica in that Amazon Web Services Region.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * When you are replicating a DB cluster from one Amazon Web Services GovCloud (US) Region to another, an URL that
     * contains a Signature Version 4 signed request for the <code>CreateDBCluster</code> operation to be called in the
     * source Amazon Web Services Region where the DB cluster is replicated from. Specify <code>PreSignedUrl</code> only
     * when you are performing cross-Region replication from an encrypted DB cluster.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBCluster</code> API operation that can run in the
     * source Amazon Web Services Region that contains the encrypted DB cluster to copy.
     * </p>
     * <p>
     * The presigned URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the KMS key to use to encrypt the copy of the DB cluster in
     * the destination Amazon Web Services Region. This should refer to the same KMS key for both the
     * <code>CreateDBCluster</code> operation that is called in the destination Amazon Web Services Region, and the
     * operation contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the Amazon Web Services Region that Aurora read replica will be
     * created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for the encrypted DB cluster to be copied.
     * This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web Services Region. For
     * example, if you are copying an encrypted DB cluster from the us-west-2 Amazon Web Services Region, then your
     * <code>ReplicationSourceIdentifier</code> would look like Example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (Amazon Web Services Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a presigned URL that is a valid request for the operation that can run in
     * the source Amazon Web Services Region.
     * </p>
     * </note>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String preSignedUrl;
    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;
    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora MySQL DB clusters only
     * </p>
     */
    private Long backtrackWindow;
    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on
     * the DB engine being used.
     * </p>
     * <p>
     * <b>RDS for MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>RDS for PostgreSQL</b>
     * </p>
     * <p>
     * Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Possible value is <code>postgresql</code>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> enableCloudwatchLogsExports;
    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     * <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.
     * </p>
     * <p>
     * The <code>parallelquery</code> engine mode isn't required for Aurora MySQL version 1.23 and higher 1.x versions,
     * and version 2.09 and higher 2.x versions.
     * </p>
     * <p>
     * The <code>global</code> engine mode isn't required for Aurora MySQL version 1.22 and higher 1.x versions, and
     * <code>global</code> engine mode isn't required for any 2.x versions.
     * </p>
     * <p>
     * The <code>multimaster</code> engine mode only applies for DB clusters created with Aurora MySQL version 5.6.10a.
     * </p>
     * <p>
     * The <code>serverless</code> engine mode only applies for Aurora Serverless v1 DB clusters.
     * </p>
     * <p>
     * For Aurora PostgreSQL, the <code>global</code> engine mode isn't required, and both the
     * <code>parallelquery</code> and the <code>multimaster</code> engine modes currently aren't supported.
     * </p>
     * <p>
     * Limitations and requirements apply to some DB engine modes. For more information, see the following sections in
     * the <i>Amazon Aurora User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     * >Limitations of Aurora Serverless v1</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.requirements.html">
     * Requirements for Aurora Serverless v2</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     * >Limitations of Parallel Query</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     * >Limitations of Aurora Global Databases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     * >Limitations of Multi-Master Clusters</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String engineMode;
    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private ScalingConfiguration scalingConfiguration;
    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection isn't enabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String globalClusterIdentifier;
    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless v1 DB cluster. By default,
     * the HTTP endpoint is disabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless v1 DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless v1</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private Boolean enableHttpEndpoint;
    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * The Active Directory directory ID to create the DB cluster in.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos authentication to authenticate users that connect to
     * the DB cluster.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String domain;
    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String domainIAMRoleName;
    /**
     * <p>
     * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an
     * Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed on Aurora DB clusters
     * that are secondary clusters in an Aurora global database.
     * </p>
     * <p>
     * You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     * parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     * changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value
     * is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but it does
     * nothing until then.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private Boolean enableGlobalWriteForwarding;
    /**
     * <p>
     * The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example db.m6gd.xlarge. Not
     * all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance class</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private String dBClusterInstanceClass;
    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * Specifies the storage type to be associated with the DB cluster.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid values: <code>io1</code>
     * </p>
     * <p>
     * When specified, a value for the <code>Iops</code> parameter is required.
     * </p>
     * <p>
     * Default: <code>io1</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     * instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * For information about valid IOPS values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS Provisioned
     * IOPS storage</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * A value that indicates whether the DB cluster is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access isn't permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a
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
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
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
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during the
     * maintenance window. By default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB cluster. To
     * turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, also set <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private Integer monitoringInterval;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon
     * CloudWatch Logs. An example is <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a
     * monitoring role, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting up and enabling Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, supply a <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private String monitoringRoleArn;
    /**
     * <p>
     * A value that indicates whether to turn on Performance Insights for the DB cluster.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
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
     * If you don't specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default KMS
     * key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     * different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
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
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private Integer performanceInsightsRetentionPeriod;

    private ServerlessV2ScalingConfiguration serverlessV2ScalingConfiguration;
    /**
     * <p>
     * The network type of the DB cluster.
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
     * The network type is determined by the <code>DBSubnetGroup</code> specified for the DB cluster. A
     * <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     * <code>DUAL</code>).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     * Working with a DB instance in a VPC</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String networkType;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String dBSystemId;
    /**
     * <p>
     * A value that indicates whether to manage the master user password with Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password management with
     * Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html">Password management
     * with Amazon Web Services Secrets Manager</a> in the <i>Amazon Aurora User Guide.</i>
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Boolean manageMasterUserPassword;
    /**
     * <p>
     * The Amazon Web Services KMS key identifier to encrypt a secret that is automatically generated and managed in
     * Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets Manager
     * for the DB cluster.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String masterUserSecretKmsKeyId;
    /** The region where the source instance is located. */
    private String sourceRegion;

    /**
     * <p>
     * A list of Availability Zones (AZs) where DB instances in the DB cluster can be created.
     * </p>
     * <p>
     * For information on Amazon Web Services Regions and Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A list of Availability Zones (AZs) where DB instances in the DB cluster can be created.</p>
     *         <p>
     *         For information on Amazon Web Services Regions and Availability Zones, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *         >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * A list of Availability Zones (AZs) where DB instances in the DB cluster can be created.
     * </p>
     * <p>
     * For information on Amazon Web Services Regions and Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones (AZs) where DB instances in the DB cluster can be created.</p>
     *        <p>
     *        For information on Amazon Web Services Regions and Availability Zones, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(availabilityZones);
    }

    /**
     * <p>
     * A list of Availability Zones (AZs) where DB instances in the DB cluster can be created.
     * </p>
     * <p>
     * For information on Amazon Web Services Regions and Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones (AZs) where DB instances in the DB cluster can be created.</p>
     *        <p>
     *        For information on Amazon Web Services Regions and Availability Zones, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones (AZs) where DB instances in the DB cluster can be created.
     * </p>
     * <p>
     * For information on Amazon Web Services Regions and Availability Zones, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones (AZs) where DB instances in the DB cluster can be created.</p>
     *        <p>
     *        For information on Amazon Web Services Regions and Availability Zones, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Choosing the Regions and Availability Zones</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained.
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
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained.</p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 1 to 35
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained.
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
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The number of days for which automated backups are retained.</p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be a value from 1 to 35
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained.
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
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained.</p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 1 to 35
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified CharacterSet.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param characterSetName
     *        A value that indicates that the DB cluster should be associated with the specified CharacterSet.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified CharacterSet.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates that the DB cluster should be associated with the specified CharacterSet.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified CharacterSet.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param characterSetName
     *        A value that indicates that the DB cluster should be associated with the specified CharacterSet.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withCharacterSetName(String characterSetName) {
        setCharacterSetName(characterSetName);
        return this;
    }

    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS doesn't
     * create a database in the DB cluster you are creating.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param databaseName
     *        The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS
     *        doesn't create a database in the DB cluster you are creating.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS doesn't
     * create a database in the DB cluster you are creating.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS
     *         doesn't create a database in the DB cluster you are creating.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS doesn't
     * create a database in the DB cluster you are creating.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param databaseName
     *        The name for your database of up to 64 alphanumeric characters. If you do not provide a name, Amazon RDS
     *        doesn't create a database in the DB cluster you are creating.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase string.
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
     * Example: <code>my-cluster1</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier. This parameter is stored as a lowercase string.</p>
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
     *        Example: <code>my-cluster1</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase string.
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
     * Example: <code>my-cluster1</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The DB cluster identifier. This parameter is stored as a lowercase string.</p>
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
     *         Example: <code>my-cluster1</code>
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier. This parameter is stored as a lowercase string.
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
     * Example: <code>my-cluster1</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier. This parameter is stored as a lowercase string.</p>
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
     *        Example: <code>my-cluster1</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a value, then
     * the default DB cluster parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB cluster parameter group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a
     *        value, then the default DB cluster parameter group for the specified DB engine and version is used.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing DB cluster parameter group.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a value, then
     * the default DB cluster parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB cluster parameter group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a
     *         value, then the default DB cluster parameter group for the specified DB engine and version is used.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the name of an existing DB cluster parameter group.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getDBClusterParameterGroupName() {
        return this.dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a value, then
     * the default DB cluster parameter group for the specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB cluster parameter group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to associate with this DB cluster. If you do not specify a
     *        value, then the default DB cluster parameter group for the specified DB engine and version is used.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing DB cluster parameter group.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        setDBClusterParameterGroupName(dBClusterParameterGroupName);
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A list of EC2 VPC security groups to associate with this DB cluster.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with this DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
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
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with this DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with this DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBSubnetGroupName
     *        A DB subnet group to associate with this DB cluster.</p>
     *        <p>
     *        This setting is required to create a Multi-AZ DB cluster.
     *        </p>
     *        <p>
     *        Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     *        </p>
     *        <p>
     *        Example: <code>mydbsubnetgroup</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A DB subnet group to associate with this DB cluster.</p>
     *         <p>
     *         This setting is required to create a Multi-AZ DB cluster.
     *         </p>
     *         <p>
     *         Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     *         </p>
     *         <p>
     *         Example: <code>mydbsubnetgroup</code>
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB cluster.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     * </p>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBSubnetGroupName
     *        A DB subnet group to associate with this DB cluster.</p>
     *        <p>
     *        This setting is required to create a Multi-AZ DB cluster.
     *        </p>
     *        <p>
     *        Constraints: Must match the name of an existing DBSubnetGroup. Must not be default.
     *        </p>
     *        <p>
     *        Example: <code>mydbsubnetgroup</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
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
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param engine
     *        The name of the database engine to be used for this DB cluster.</p>
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
     *        <code>mysql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
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
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The name of the database engine to be used for this DB cluster.</p>
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
     *         <code>mysql</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>postgres</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this DB cluster.
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
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param engine
     *        The name of the database engine to be used for this DB cluster.</p>
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
     *        <code>mysql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for Aurora PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for MySQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html">MySQL on Amazon RDS
     * Versions</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html">Amazon
     * Aurora PostgreSQL releases and engine versions</a> in the <i>Amazon Aurora User Guide</i>.
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
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts">Amazon RDS
     * for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to use.</p>
     *        <p>
     *        To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora, use
     *        the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for Aurora PostgreSQL, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for RDS for MySQL, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for RDS for PostgreSQL, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        <b>Aurora MySQL</b>
     *        </p>
     *        <p>
     *        For information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html">MySQL on
     *        Amazon RDS Versions</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        <b>Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        For information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html"
     *        >Amazon Aurora PostgreSQL releases and engine versions</a> in the <i>Amazon Aurora User Guide</i>.
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
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        For information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts"
     *        >Amazon RDS for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for Aurora PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for MySQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html">MySQL on Amazon RDS
     * Versions</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html">Amazon
     * Aurora PostgreSQL releases and engine versions</a> in the <i>Amazon Aurora User Guide</i>.
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
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts">Amazon RDS
     * for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The version number of the database engine to use.</p>
     *         <p>
     *         To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora,
     *         use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for Aurora PostgreSQL, use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for RDS for MySQL, use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for RDS for PostgreSQL, use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         <b>Aurora MySQL</b>
     *         </p>
     *         <p>
     *         For information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html">MySQL on
     *         Amazon RDS Versions</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         <b>Aurora PostgreSQL</b>
     *         </p>
     *         <p>
     *         For information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html"
     *         >Amazon Aurora PostgreSQL releases and engine versions</a> in the <i>Amazon Aurora User Guide</i>.
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
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         For information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts"
     *         >Amazon RDS for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora, use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for Aurora PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for MySQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for RDS for PostgreSQL, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html">MySQL on Amazon RDS
     * Versions</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html">Amazon
     * Aurora PostgreSQL releases and engine versions</a> in the <i>Amazon Aurora User Guide</i>.
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
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * For information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts">Amazon RDS
     * for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to use.</p>
     *        <p>
     *        To list all of the available engine versions for MySQL 5.6-compatible Aurora, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for MySQL 5.7-compatible and MySQL 8.0-compatible Aurora, use
     *        the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for Aurora PostgreSQL, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for RDS for MySQL, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine mysql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for RDS for PostgreSQL, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine postgres --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        <b>Aurora MySQL</b>
     *        </p>
     *        <p>
     *        For information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraMySQL.Updates.html">MySQL on
     *        Amazon RDS Versions</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        <b>Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        For information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/AuroraPostgreSQL.Updates.20180305.html"
     *        >Amazon Aurora PostgreSQL releases and engine versions</a> in the <i>Amazon Aurora User Guide</i>.
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
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        For information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts"
     *        >Amazon RDS for PostgreSQL versions and extensions</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The port number on which the instances in the DB cluster accept connections.
     * </p>
     * <p>
     * <b>RDS for MySQL and Aurora MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>RDS for PostgreSQL and Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param port
     *        The port number on which the instances in the DB cluster accept connections.</p>
     *        <p>
     *        <b>RDS for MySQL and Aurora MySQL</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>RDS for PostgreSQL and Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        Default: <code>5432</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the instances in the DB cluster accept connections.
     * </p>
     * <p>
     * <b>RDS for MySQL and Aurora MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>RDS for PostgreSQL and Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The port number on which the instances in the DB cluster accept connections.</p>
     *         <p>
     *         <b>RDS for MySQL and Aurora MySQL</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         <b>RDS for PostgreSQL and Aurora PostgreSQL</b>
     *         </p>
     *         <p>
     *         Default: <code>5432</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the instances in the DB cluster accept connections.
     * </p>
     * <p>
     * <b>RDS for MySQL and Aurora MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>RDS for PostgreSQL and Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param port
     *        The port number on which the instances in the DB cluster accept connections.</p>
     *        <p>
     *        <b>RDS for MySQL and Aurora MySQL</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>RDS for PostgreSQL and Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        Default: <code>5432</code>
     *        </p>
     *        <p>
     *        Valid values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param masterUsername
     *        The name of the master user for the DB cluster.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 16 letters or numbers.
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
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The name of the master user for the DB cluster.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 16 letters or numbers.
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
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param masterUsername
     *        The name of the master user for the DB cluster.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 16 letters or numbers.
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
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The password for the master database user. This password can contain any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 8 to 41 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master database user. This password can contain any printable ASCII character except
     *        "/", """, or "@".</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 8 to 41 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The password for the master database user. This password can contain any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 8 to 41 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The password for the master database user. This password can contain any printable ASCII character except
     *         "/", """, or "@".</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 8 to 41 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The password for the master database user. This password can contain any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 8 to 41 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master database user. This password can contain any printable ASCII character except
     *        "/", """, or "@".</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 8 to 41 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified option group.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     * 
     * @param optionGroupName
     *        A value that indicates that the DB cluster should be associated with the specified option group.</p>
     *        <p>
     *        DB clusters are associated with a default option group that can't be modified.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified option group.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     * 
     * @return A value that indicates that the DB cluster should be associated with the specified option group.</p>
     *         <p>
     *         DB clusters are associated with a default option group that can't be modified.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified option group.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     * 
     * @param optionGroupName
     *        A value that indicates that the DB cluster should be associated with the specified option group.</p>
     *        <p>
     *        DB clusters are associated with a default option group that can't be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region. To view the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     * > Backup window</a> in the <i>Amazon Aurora User Guide</i>.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled using the
     *        <code>BackupRetentionPeriod</code> parameter.</p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *        Services Region. To view the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     *        > Backup window</a> in the <i>Amazon Aurora User Guide</i>.
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
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region. To view the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     * > Backup window</a> in the <i>Amazon Aurora User Guide</i>.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The daily time range during which automated backups are created if automated backups are enabled using
     *         the <code>BackupRetentionPeriod</code> parameter.</p>
     *         <p>
     *         The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *         Services Region. To view the time blocks available, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     *         > Backup window</a> in the <i>Amazon Aurora User Guide</i>.
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
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region. To view the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     * > Backup window</a> in the <i>Amazon Aurora User Guide</i>.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled using the
     *        <code>BackupRetentionPeriod</code> parameter.</p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *        Services Region. To view the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Managing.Backups.html#Aurora.Managing.Backups.BackupWindow"
     *        > Backup window</a> in the <i>Amazon Aurora User Guide</i>.
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
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *        Services Region, occurring on a random day of the week. To see the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *        > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *         <p>
     *         Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *         Services Region, occurring on a random day of the week. To see the time blocks available, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *         > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *         </p>
     *         <p>
     *         Constraints: Minimum 30-minute window.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *        Services Region, occurring on a random day of the week. To see the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *        > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a read
     * replica.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param replicationSourceIdentifier
     *        The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a
     *        read replica.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setReplicationSourceIdentifier(String replicationSourceIdentifier) {
        this.replicationSourceIdentifier = replicationSourceIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a read
     * replica.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a
     *         read replica.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getReplicationSourceIdentifier() {
        return this.replicationSourceIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a read
     * replica.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param replicationSourceIdentifier
     *        The Amazon Resource Name (ARN) of the source DB instance or DB cluster if this DB cluster is created as a
     *        read replica.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withReplicationSourceIdentifier(String replicationSourceIdentifier) {
        setReplicationSourceIdentifier(replicationSourceIdentifier);
        return this;
    }

    /**
     * <p>
     * Tags to assign to the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return Tags to assign to the DB cluster.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Tags to assign to the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param tags
     *        Tags to assign to the DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
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
     * Tags to assign to the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Tags to assign to the DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withTags(Tag... tags) {
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
     * Tags to assign to the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param tags
     *        Tags to assign to the DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is encrypted.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param storageEncrypted
     *        A value that indicates whether the DB cluster is encrypted.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is encrypted.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether the DB cluster is encrypted.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is encrypted.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param storageEncrypted
     *        A value that indicates whether the DB cluster is encrypted.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is encrypted.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether the DB cluster is encrypted.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * When a KMS key isn't specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon RDS will use the KMS key
     * used to encrypt the source. Otherwise, Amazon RDS will use your default KMS key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled and <code>ReplicationSourceIdentifier</code> isn't
     * specified, then Amazon RDS will use your default KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a different
     * default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * If you create a read replica of an encrypted DB cluster in another Amazon Web Services Region, you must set
     * <code>KmsKeyId</code> to a KMS key identifier that is valid in the destination Amazon Web Services Region. This
     * KMS key is used to encrypt the read replica in that Amazon Web Services Region.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier for an encrypted DB cluster.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        When a KMS key isn't specified in <code>KmsKeyId</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon RDS will use the
     *        KMS key used to encrypt the source. Otherwise, Amazon RDS will use your default KMS key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the <code>StorageEncrypted</code> parameter is enabled and <code>ReplicationSourceIdentifier</code>
     *        isn't specified, then Amazon RDS will use your default KMS key.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     *        different default KMS key for each Amazon Web Services Region.
     *        </p>
     *        <p>
     *        If you create a read replica of an encrypted DB cluster in another Amazon Web Services Region, you must
     *        set <code>KmsKeyId</code> to a KMS key identifier that is valid in the destination Amazon Web Services
     *        Region. This KMS key is used to encrypt the read replica in that Amazon Web Services Region.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * When a KMS key isn't specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon RDS will use the KMS key
     * used to encrypt the source. Otherwise, Amazon RDS will use your default KMS key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled and <code>ReplicationSourceIdentifier</code> isn't
     * specified, then Amazon RDS will use your default KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a different
     * default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * If you create a read replica of an encrypted DB cluster in another Amazon Web Services Region, you must set
     * <code>KmsKeyId</code> to a KMS key identifier that is valid in the destination Amazon Web Services Region. This
     * KMS key is used to encrypt the read replica in that Amazon Web Services Region.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier for an encrypted DB cluster.</p>
     *         <p>
     *         The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *         key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *         </p>
     *         <p>
     *         When a KMS key isn't specified in <code>KmsKeyId</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon RDS will use the
     *         KMS key used to encrypt the source. Otherwise, Amazon RDS will use your default KMS key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the <code>StorageEncrypted</code> parameter is enabled and <code>ReplicationSourceIdentifier</code>
     *         isn't specified, then Amazon RDS will use your default KMS key.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     *         different default KMS key for each Amazon Web Services Region.
     *         </p>
     *         <p>
     *         If you create a read replica of an encrypted DB cluster in another Amazon Web Services Region, you must
     *         set <code>KmsKeyId</code> to a KMS key identifier that is valid in the destination Amazon Web Services
     *         Region. This KMS key is used to encrypt the read replica in that Amazon Web Services Region.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted DB cluster.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * When a KMS key isn't specified in <code>KmsKeyId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon RDS will use the KMS key
     * used to encrypt the source. Otherwise, Amazon RDS will use your default KMS key.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is enabled and <code>ReplicationSourceIdentifier</code> isn't
     * specified, then Amazon RDS will use your default KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a different
     * default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * If you create a read replica of an encrypted DB cluster in another Amazon Web Services Region, you must set
     * <code>KmsKeyId</code> to a KMS key identifier that is valid in the destination Amazon Web Services Region. This
     * KMS key is used to encrypt the read replica in that Amazon Web Services Region.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier for an encrypted DB cluster.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        When a KMS key isn't specified in <code>KmsKeyId</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>ReplicationSourceIdentifier</code> identifies an encrypted source, then Amazon RDS will use the
     *        KMS key used to encrypt the source. Otherwise, Amazon RDS will use your default KMS key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the <code>StorageEncrypted</code> parameter is enabled and <code>ReplicationSourceIdentifier</code>
     *        isn't specified, then Amazon RDS will use your default KMS key.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     *        different default KMS key for each Amazon Web Services Region.
     *        </p>
     *        <p>
     *        If you create a read replica of an encrypted DB cluster in another Amazon Web Services Region, you must
     *        set <code>KmsKeyId</code> to a KMS key identifier that is valid in the destination Amazon Web Services
     *        Region. This KMS key is used to encrypt the read replica in that Amazon Web Services Region.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * When you are replicating a DB cluster from one Amazon Web Services GovCloud (US) Region to another, an URL that
     * contains a Signature Version 4 signed request for the <code>CreateDBCluster</code> operation to be called in the
     * source Amazon Web Services Region where the DB cluster is replicated from. Specify <code>PreSignedUrl</code> only
     * when you are performing cross-Region replication from an encrypted DB cluster.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBCluster</code> API operation that can run in the
     * source Amazon Web Services Region that contains the encrypted DB cluster to copy.
     * </p>
     * <p>
     * The presigned URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the KMS key to use to encrypt the copy of the DB cluster in
     * the destination Amazon Web Services Region. This should refer to the same KMS key for both the
     * <code>CreateDBCluster</code> operation that is called in the destination Amazon Web Services Region, and the
     * operation contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the Amazon Web Services Region that Aurora read replica will be
     * created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for the encrypted DB cluster to be copied.
     * This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web Services Region. For
     * example, if you are copying an encrypted DB cluster from the us-west-2 Amazon Web Services Region, then your
     * <code>ReplicationSourceIdentifier</code> would look like Example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (Amazon Web Services Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a presigned URL that is a valid request for the operation that can run in
     * the source Amazon Web Services Region.
     * </p>
     * </note>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param preSignedUrl
     *        When you are replicating a DB cluster from one Amazon Web Services GovCloud (US) Region to another, an URL
     *        that contains a Signature Version 4 signed request for the <code>CreateDBCluster</code> operation to be
     *        called in the source Amazon Web Services Region where the DB cluster is replicated from. Specify
     *        <code>PreSignedUrl</code> only when you are performing cross-Region replication from an encrypted DB
     *        cluster.</p>
     *        <p>
     *        The presigned URL must be a valid request for the <code>CreateDBCluster</code> API operation that can run
     *        in the source Amazon Web Services Region that contains the encrypted DB cluster to copy.
     *        </p>
     *        <p>
     *        The presigned URL request must contain the following parameter values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KmsKeyId</code> - The KMS key identifier for the KMS key to use to encrypt the copy of the DB
     *        cluster in the destination Amazon Web Services Region. This should refer to the same KMS key for both the
     *        <code>CreateDBCluster</code> operation that is called in the destination Amazon Web Services Region, and
     *        the operation contained in the presigned URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DestinationRegion</code> - The name of the Amazon Web Services Region that Aurora read replica will
     *        be created in.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for the encrypted DB cluster to be
     *        copied. This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web
     *        Services Region. For example, if you are copying an encrypted DB cluster from the us-west-2 Amazon Web
     *        Services Region, then your <code>ReplicationSourceIdentifier</code> would look like Example:
     *        <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn how to generate a Signature Version 4 signed request, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating
     *        Requests: Using Query Parameters (Amazon Web Services Signature Version 4)</a> and <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     *        Process</a>.
     *        </p>
     *        <note>
     *        <p>
     *        If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     *        <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually.
     *        Specifying <code>SourceRegion</code> autogenerates a presigned URL that is a valid request for the
     *        operation that can run in the source Amazon Web Services Region.
     *        </p>
     *        </note>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * <p>
     * When you are replicating a DB cluster from one Amazon Web Services GovCloud (US) Region to another, an URL that
     * contains a Signature Version 4 signed request for the <code>CreateDBCluster</code> operation to be called in the
     * source Amazon Web Services Region where the DB cluster is replicated from. Specify <code>PreSignedUrl</code> only
     * when you are performing cross-Region replication from an encrypted DB cluster.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBCluster</code> API operation that can run in the
     * source Amazon Web Services Region that contains the encrypted DB cluster to copy.
     * </p>
     * <p>
     * The presigned URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the KMS key to use to encrypt the copy of the DB cluster in
     * the destination Amazon Web Services Region. This should refer to the same KMS key for both the
     * <code>CreateDBCluster</code> operation that is called in the destination Amazon Web Services Region, and the
     * operation contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the Amazon Web Services Region that Aurora read replica will be
     * created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for the encrypted DB cluster to be copied.
     * This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web Services Region. For
     * example, if you are copying an encrypted DB cluster from the us-west-2 Amazon Web Services Region, then your
     * <code>ReplicationSourceIdentifier</code> would look like Example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (Amazon Web Services Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a presigned URL that is a valid request for the operation that can run in
     * the source Amazon Web Services Region.
     * </p>
     * </note>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return When you are replicating a DB cluster from one Amazon Web Services GovCloud (US) Region to another, an
     *         URL that contains a Signature Version 4 signed request for the <code>CreateDBCluster</code> operation to
     *         be called in the source Amazon Web Services Region where the DB cluster is replicated from. Specify
     *         <code>PreSignedUrl</code> only when you are performing cross-Region replication from an encrypted DB
     *         cluster.</p>
     *         <p>
     *         The presigned URL must be a valid request for the <code>CreateDBCluster</code> API operation that can run
     *         in the source Amazon Web Services Region that contains the encrypted DB cluster to copy.
     *         </p>
     *         <p>
     *         The presigned URL request must contain the following parameter values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KmsKeyId</code> - The KMS key identifier for the KMS key to use to encrypt the copy of the DB
     *         cluster in the destination Amazon Web Services Region. This should refer to the same KMS key for both the
     *         <code>CreateDBCluster</code> operation that is called in the destination Amazon Web Services Region, and
     *         the operation contained in the presigned URL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DestinationRegion</code> - The name of the Amazon Web Services Region that Aurora read replica will
     *         be created in.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for the encrypted DB cluster to be
     *         copied. This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web
     *         Services Region. For example, if you are copying an encrypted DB cluster from the us-west-2 Amazon Web
     *         Services Region, then your <code>ReplicationSourceIdentifier</code> would look like Example:
     *         <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To learn how to generate a Signature Version 4 signed request, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating
     *         Requests: Using Query Parameters (Amazon Web Services Signature Version 4)</a> and <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4
     *         Signing Process</a>.
     *         </p>
     *         <note>
     *         <p>
     *         If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code>
     *         (or <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually.
     *         Specifying <code>SourceRegion</code> autogenerates a presigned URL that is a valid request for the
     *         operation that can run in the source Amazon Web Services Region.
     *         </p>
     *         </note>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getPreSignedUrl() {
        return this.preSignedUrl;
    }

    /**
     * <p>
     * When you are replicating a DB cluster from one Amazon Web Services GovCloud (US) Region to another, an URL that
     * contains a Signature Version 4 signed request for the <code>CreateDBCluster</code> operation to be called in the
     * source Amazon Web Services Region where the DB cluster is replicated from. Specify <code>PreSignedUrl</code> only
     * when you are performing cross-Region replication from an encrypted DB cluster.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBCluster</code> API operation that can run in the
     * source Amazon Web Services Region that contains the encrypted DB cluster to copy.
     * </p>
     * <p>
     * The presigned URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the KMS key to use to encrypt the copy of the DB cluster in
     * the destination Amazon Web Services Region. This should refer to the same KMS key for both the
     * <code>CreateDBCluster</code> operation that is called in the destination Amazon Web Services Region, and the
     * operation contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the Amazon Web Services Region that Aurora read replica will be
     * created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for the encrypted DB cluster to be copied.
     * This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web Services Region. For
     * example, if you are copying an encrypted DB cluster from the us-west-2 Amazon Web Services Region, then your
     * <code>ReplicationSourceIdentifier</code> would look like Example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (Amazon Web Services Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a presigned URL that is a valid request for the operation that can run in
     * the source Amazon Web Services Region.
     * </p>
     * </note>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param preSignedUrl
     *        When you are replicating a DB cluster from one Amazon Web Services GovCloud (US) Region to another, an URL
     *        that contains a Signature Version 4 signed request for the <code>CreateDBCluster</code> operation to be
     *        called in the source Amazon Web Services Region where the DB cluster is replicated from. Specify
     *        <code>PreSignedUrl</code> only when you are performing cross-Region replication from an encrypted DB
     *        cluster.</p>
     *        <p>
     *        The presigned URL must be a valid request for the <code>CreateDBCluster</code> API operation that can run
     *        in the source Amazon Web Services Region that contains the encrypted DB cluster to copy.
     *        </p>
     *        <p>
     *        The presigned URL request must contain the following parameter values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>KmsKeyId</code> - The KMS key identifier for the KMS key to use to encrypt the copy of the DB
     *        cluster in the destination Amazon Web Services Region. This should refer to the same KMS key for both the
     *        <code>CreateDBCluster</code> operation that is called in the destination Amazon Web Services Region, and
     *        the operation contained in the presigned URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DestinationRegion</code> - The name of the Amazon Web Services Region that Aurora read replica will
     *        be created in.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReplicationSourceIdentifier</code> - The DB cluster identifier for the encrypted DB cluster to be
     *        copied. This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web
     *        Services Region. For example, if you are copying an encrypted DB cluster from the us-west-2 Amazon Web
     *        Services Region, then your <code>ReplicationSourceIdentifier</code> would look like Example:
     *        <code>arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster1</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn how to generate a Signature Version 4 signed request, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating
     *        Requests: Using Query Parameters (Amazon Web Services Signature Version 4)</a> and <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     *        Process</a>.
     *        </p>
     *        <note>
     *        <p>
     *        If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     *        <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually.
     *        Specifying <code>SourceRegion</code> autogenerates a presigned URL that is a valid request for the
     *        operation that can run in the source Amazon Web Services Region.
     *        </p>
     *        </note>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withPreSignedUrl(String preSignedUrl) {
        setPreSignedUrl(preSignedUrl);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *        (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *        Database Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *         (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *         Database Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *        (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *        Database Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
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
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *         (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *         Database Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean isEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora MySQL DB clusters only
     * </p>
     * 
     * @param backtrackWindow
     *        The target backtrack window, in seconds. To disable backtracking, set this value to 0.</p>
     *        <p>
     *        Default: 0
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora MySQL DB clusters only
     */

    public void setBacktrackWindow(Long backtrackWindow) {
        this.backtrackWindow = backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora MySQL DB clusters only
     * </p>
     * 
     * @return The target backtrack window, in seconds. To disable backtracking, set this value to 0.</p>
     *         <p>
     *         Default: 0
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora MySQL DB clusters only
     */

    public Long getBacktrackWindow() {
        return this.backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora MySQL DB clusters only
     * </p>
     * 
     * @param backtrackWindow
     *        The target backtrack window, in seconds. To disable backtracking, set this value to 0.</p>
     *        <p>
     *        Default: 0
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora MySQL DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withBacktrackWindow(Long backtrackWindow) {
        setBacktrackWindow(backtrackWindow);
        return this;
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list depend on
     * the DB engine being used.
     * </p>
     * <p>
     * <b>RDS for MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>RDS for PostgreSQL</b>
     * </p>
     * <p>
     * Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Possible value is <code>postgresql</code>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list
     *         depend on the DB engine being used.</p>
     *         <p>
     *         <b>RDS for MySQL</b>
     *         </p>
     *         <p>
     *         Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     *         </p>
     *         <p>
     *         <b>RDS for PostgreSQL</b>
     *         </p>
     *         <p>
     *         Possible values are <code>postgresql</code> and <code>upgrade</code>.
     *         </p>
     *         <p>
     *         <b>Aurora MySQL</b>
     *         </p>
     *         <p>
     *         Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *         <code>slowquery</code>.
     *         </p>
     *         <p>
     *         <b>Aurora PostgreSQL</b>
     *         </p>
     *         <p>
     *         Possible value is <code>postgresql</code>.
     *         </p>
     *         <p>
     *         For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
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
     * the DB engine being used.
     * </p>
     * <p>
     * <b>RDS for MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>RDS for PostgreSQL</b>
     * </p>
     * <p>
     * Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Possible value is <code>postgresql</code>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list
     *        depend on the DB engine being used.</p>
     *        <p>
     *        <b>RDS for MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>RDS for PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>postgresql</code> and <code>upgrade</code>.
     *        </p>
     *        <p>
     *        <b>Aurora MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *        <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible value is <code>postgresql</code>.
     *        </p>
     *        <p>
     *        For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
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
     * the DB engine being used.
     * </p>
     * <p>
     * <b>RDS for MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>RDS for PostgreSQL</b>
     * </p>
     * <p>
     * Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Possible value is <code>postgresql</code>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnableCloudwatchLogsExports(java.util.Collection)} or
     * {@link #withEnableCloudwatchLogsExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list
     *        depend on the DB engine being used.</p>
     *        <p>
     *        <b>RDS for MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>RDS for PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>postgresql</code> and <code>upgrade</code>.
     *        </p>
     *        <p>
     *        <b>Aurora MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *        <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible value is <code>postgresql</code>.
     *        </p>
     *        <p>
     *        For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEnableCloudwatchLogsExports(String... enableCloudwatchLogsExports) {
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
     * the DB engine being used.
     * </p>
     * <p>
     * <b>RDS for MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>RDS for PostgreSQL</b>
     * </p>
     * <p>
     * Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Possible value is <code>postgresql</code>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of log types that need to be enabled for exporting to CloudWatch Logs. The values in the list
     *        depend on the DB engine being used.</p>
     *        <p>
     *        <b>RDS for MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>RDS for PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>postgresql</code> and <code>upgrade</code>.
     *        </p>
     *        <p>
     *        <b>Aurora MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *        <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible value is <code>postgresql</code>.
     *        </p>
     *        <p>
     *        For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
        setEnableCloudwatchLogsExports(enableCloudwatchLogsExports);
        return this;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     * <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.
     * </p>
     * <p>
     * The <code>parallelquery</code> engine mode isn't required for Aurora MySQL version 1.23 and higher 1.x versions,
     * and version 2.09 and higher 2.x versions.
     * </p>
     * <p>
     * The <code>global</code> engine mode isn't required for Aurora MySQL version 1.22 and higher 1.x versions, and
     * <code>global</code> engine mode isn't required for any 2.x versions.
     * </p>
     * <p>
     * The <code>multimaster</code> engine mode only applies for DB clusters created with Aurora MySQL version 5.6.10a.
     * </p>
     * <p>
     * The <code>serverless</code> engine mode only applies for Aurora Serverless v1 DB clusters.
     * </p>
     * <p>
     * For Aurora PostgreSQL, the <code>global</code> engine mode isn't required, and both the
     * <code>parallelquery</code> and the <code>multimaster</code> engine modes currently aren't supported.
     * </p>
     * <p>
     * Limitations and requirements apply to some DB engine modes. For more information, see the following sections in
     * the <i>Amazon Aurora User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     * >Limitations of Aurora Serverless v1</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.requirements.html">
     * Requirements for Aurora Serverless v2</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     * >Limitations of Parallel Query</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     * >Limitations of Aurora Global Databases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     * >Limitations of Multi-Master Clusters</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param engineMode
     *        The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     *        <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.</p>
     *        <p>
     *        The <code>parallelquery</code> engine mode isn't required for Aurora MySQL version 1.23 and higher 1.x
     *        versions, and version 2.09 and higher 2.x versions.
     *        </p>
     *        <p>
     *        The <code>global</code> engine mode isn't required for Aurora MySQL version 1.22 and higher 1.x versions,
     *        and <code>global</code> engine mode isn't required for any 2.x versions.
     *        </p>
     *        <p>
     *        The <code>multimaster</code> engine mode only applies for DB clusters created with Aurora MySQL version
     *        5.6.10a.
     *        </p>
     *        <p>
     *        The <code>serverless</code> engine mode only applies for Aurora Serverless v1 DB clusters.
     *        </p>
     *        <p>
     *        For Aurora PostgreSQL, the <code>global</code> engine mode isn't required, and both the
     *        <code>parallelquery</code> and the <code>multimaster</code> engine modes currently aren't supported.
     *        </p>
     *        <p>
     *        Limitations and requirements apply to some DB engine modes. For more information, see the following
     *        sections in the <i>Amazon Aurora User Guide</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     *        >Limitations of Aurora Serverless v1</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.requirements.html"
     *        >Requirements for Aurora Serverless v2</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     *        >Limitations of Parallel Query</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     *        >Limitations of Aurora Global Databases</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     *        >Limitations of Multi-Master Clusters</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setEngineMode(String engineMode) {
        this.engineMode = engineMode;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     * <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.
     * </p>
     * <p>
     * The <code>parallelquery</code> engine mode isn't required for Aurora MySQL version 1.23 and higher 1.x versions,
     * and version 2.09 and higher 2.x versions.
     * </p>
     * <p>
     * The <code>global</code> engine mode isn't required for Aurora MySQL version 1.22 and higher 1.x versions, and
     * <code>global</code> engine mode isn't required for any 2.x versions.
     * </p>
     * <p>
     * The <code>multimaster</code> engine mode only applies for DB clusters created with Aurora MySQL version 5.6.10a.
     * </p>
     * <p>
     * The <code>serverless</code> engine mode only applies for Aurora Serverless v1 DB clusters.
     * </p>
     * <p>
     * For Aurora PostgreSQL, the <code>global</code> engine mode isn't required, and both the
     * <code>parallelquery</code> and the <code>multimaster</code> engine modes currently aren't supported.
     * </p>
     * <p>
     * Limitations and requirements apply to some DB engine modes. For more information, see the following sections in
     * the <i>Amazon Aurora User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     * >Limitations of Aurora Serverless v1</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.requirements.html">
     * Requirements for Aurora Serverless v2</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     * >Limitations of Parallel Query</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     * >Limitations of Aurora Global Databases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     * >Limitations of Multi-Master Clusters</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     *         <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.</p>
     *         <p>
     *         The <code>parallelquery</code> engine mode isn't required for Aurora MySQL version 1.23 and higher 1.x
     *         versions, and version 2.09 and higher 2.x versions.
     *         </p>
     *         <p>
     *         The <code>global</code> engine mode isn't required for Aurora MySQL version 1.22 and higher 1.x versions,
     *         and <code>global</code> engine mode isn't required for any 2.x versions.
     *         </p>
     *         <p>
     *         The <code>multimaster</code> engine mode only applies for DB clusters created with Aurora MySQL version
     *         5.6.10a.
     *         </p>
     *         <p>
     *         The <code>serverless</code> engine mode only applies for Aurora Serverless v1 DB clusters.
     *         </p>
     *         <p>
     *         For Aurora PostgreSQL, the <code>global</code> engine mode isn't required, and both the
     *         <code>parallelquery</code> and the <code>multimaster</code> engine modes currently aren't supported.
     *         </p>
     *         <p>
     *         Limitations and requirements apply to some DB engine modes. For more information, see the following
     *         sections in the <i>Amazon Aurora User Guide</i>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     *         >Limitations of Aurora Serverless v1</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.requirements.html"
     *         >Requirements for Aurora Serverless v2</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     *         >Limitations of Parallel Query</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     *         >Limitations of Aurora Global Databases</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     *         >Limitations of Multi-Master Clusters</a>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getEngineMode() {
        return this.engineMode;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     * <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.
     * </p>
     * <p>
     * The <code>parallelquery</code> engine mode isn't required for Aurora MySQL version 1.23 and higher 1.x versions,
     * and version 2.09 and higher 2.x versions.
     * </p>
     * <p>
     * The <code>global</code> engine mode isn't required for Aurora MySQL version 1.22 and higher 1.x versions, and
     * <code>global</code> engine mode isn't required for any 2.x versions.
     * </p>
     * <p>
     * The <code>multimaster</code> engine mode only applies for DB clusters created with Aurora MySQL version 5.6.10a.
     * </p>
     * <p>
     * The <code>serverless</code> engine mode only applies for Aurora Serverless v1 DB clusters.
     * </p>
     * <p>
     * For Aurora PostgreSQL, the <code>global</code> engine mode isn't required, and both the
     * <code>parallelquery</code> and the <code>multimaster</code> engine modes currently aren't supported.
     * </p>
     * <p>
     * Limitations and requirements apply to some DB engine modes. For more information, see the following sections in
     * the <i>Amazon Aurora User Guide</i>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     * >Limitations of Aurora Serverless v1</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.requirements.html">
     * Requirements for Aurora Serverless v2</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     * >Limitations of Parallel Query</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     * >Limitations of Aurora Global Databases</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     * >Limitations of Multi-Master Clusters</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param engineMode
     *        The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>,
     *        <code>parallelquery</code>, <code>global</code>, or <code>multimaster</code>.</p>
     *        <p>
     *        The <code>parallelquery</code> engine mode isn't required for Aurora MySQL version 1.23 and higher 1.x
     *        versions, and version 2.09 and higher 2.x versions.
     *        </p>
     *        <p>
     *        The <code>global</code> engine mode isn't required for Aurora MySQL version 1.22 and higher 1.x versions,
     *        and <code>global</code> engine mode isn't required for any 2.x versions.
     *        </p>
     *        <p>
     *        The <code>multimaster</code> engine mode only applies for DB clusters created with Aurora MySQL version
     *        5.6.10a.
     *        </p>
     *        <p>
     *        The <code>serverless</code> engine mode only applies for Aurora Serverless v1 DB clusters.
     *        </p>
     *        <p>
     *        For Aurora PostgreSQL, the <code>global</code> engine mode isn't required, and both the
     *        <code>parallelquery</code> and the <code>multimaster</code> engine modes currently aren't supported.
     *        </p>
     *        <p>
     *        Limitations and requirements apply to some DB engine modes. For more information, see the following
     *        sections in the <i>Amazon Aurora User Guide</i>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html#aurora-serverless.limitations"
     *        >Limitations of Aurora Serverless v1</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless-v2.requirements.html"
     *        >Requirements for Aurora Serverless v2</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-mysql-parallel-query.html#aurora-mysql-parallel-query-limitations"
     *        >Limitations of Parallel Query</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database.limitations"
     *        >Limitations of Aurora Global Databases</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-multi-master.html#aurora-multi-master-limitations"
     *        >Limitations of Multi-Master Clusters</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEngineMode(String engineMode) {
        setEngineMode(engineMode);
        return this;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param scalingConfiguration
     *        For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public ScalingConfiguration getScalingConfiguration() {
        return this.scalingConfiguration;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param scalingConfiguration
     *        For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        setScalingConfiguration(scalingConfiguration);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection isn't enabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection isn't enabled.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection isn't enabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection isn't enabled.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection isn't enabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection isn't enabled.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection isn't enabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection isn't enabled.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database
     *        cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setGlobalClusterIdentifier(String globalClusterIdentifier) {
        this.globalClusterIdentifier = globalClusterIdentifier;
    }

    /**
     * <p>
     * The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database
     *         cluster.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }

    /**
     * <p>
     * The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param globalClusterIdentifier
     *        The global cluster ID of an Aurora cluster that becomes the primary cluster in the new global database
     *        cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withGlobalClusterIdentifier(String globalClusterIdentifier) {
        setGlobalClusterIdentifier(globalClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless v1 DB cluster. By default,
     * the HTTP endpoint is disabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless v1 DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless v1</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableHttpEndpoint
     *        A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless v1 DB cluster. By
     *        default, the HTTP endpoint is disabled.</p>
     *        <p>
     *        When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *        Aurora Serverless v1 DB cluster. You can also query your database from inside the RDS console with the
     *        query editor.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *        Aurora Serverless v1</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setEnableHttpEndpoint(Boolean enableHttpEndpoint) {
        this.enableHttpEndpoint = enableHttpEndpoint;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless v1 DB cluster. By default,
     * the HTTP endpoint is disabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless v1 DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless v1</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless v1 DB cluster. By
     *         default, the HTTP endpoint is disabled.</p>
     *         <p>
     *         When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *         Aurora Serverless v1 DB cluster. You can also query your database from inside the RDS console with the
     *         query editor.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *         Aurora Serverless v1</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean getEnableHttpEndpoint() {
        return this.enableHttpEndpoint;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless v1 DB cluster. By default,
     * the HTTP endpoint is disabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless v1 DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless v1</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableHttpEndpoint
     *        A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless v1 DB cluster. By
     *        default, the HTTP endpoint is disabled.</p>
     *        <p>
     *        When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *        Aurora Serverless v1 DB cluster. You can also query your database from inside the RDS console with the
     *        query editor.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *        Aurora Serverless v1</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEnableHttpEndpoint(Boolean enableHttpEndpoint) {
        setEnableHttpEndpoint(enableHttpEndpoint);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless v1 DB cluster. By default,
     * the HTTP endpoint is disabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless v1 DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless v1</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless v1 DB cluster. By
     *         default, the HTTP endpoint is disabled.</p>
     *         <p>
     *         When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *         Aurora Serverless v1 DB cluster. You can also query your database from inside the RDS console with the
     *         query editor.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *         Aurora Serverless v1</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean isEnableHttpEndpoint() {
        return this.enableHttpEndpoint;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *        default is not to copy them.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *         default is not to copy them.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *        default is not to copy them.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *         default is not to copy them.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * The Active Directory directory ID to create the DB cluster in.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos authentication to authenticate users that connect to
     * the DB cluster.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param domain
     *        The Active Directory directory ID to create the DB cluster in.</p>
     *        <p>
     *        For Amazon Aurora DB clusters, Amazon RDS can use Kerberos authentication to authenticate users that
     *        connect to the DB cluster.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     *        authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to create the DB cluster in.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos authentication to authenticate users that connect to
     * the DB cluster.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The Active Directory directory ID to create the DB cluster in.</p>
     *         <p>
     *         For Amazon Aurora DB clusters, Amazon RDS can use Kerberos authentication to authenticate users that
     *         connect to the DB cluster.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     *         authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to create the DB cluster in.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos authentication to authenticate users that connect to
     * the DB cluster.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param domain
     *        The Active Directory directory ID to create the DB cluster in.</p>
     *        <p>
     *        For Amazon Aurora DB clusters, Amazon RDS can use Kerberos authentication to authenticate users that
     *        connect to the DB cluster.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     *        authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return Specify the name of the IAM role to be used when making API calls to the Directory Service.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getDomainIAMRoleName() {
        return this.domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDomainIAMRoleName(String domainIAMRoleName) {
        setDomainIAMRoleName(domainIAMRoleName);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an
     * Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed on Aurora DB clusters
     * that are secondary clusters in an Aurora global database.
     * </p>
     * <p>
     * You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     * parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     * changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value
     * is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but it does
     * nothing until then.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableGlobalWriteForwarding
     *        A value that indicates whether to enable this DB cluster to forward write operations to the primary
     *        cluster of an Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed
     *        on Aurora DB clusters that are secondary clusters in an Aurora global database.</p>
     *        <p>
     *        You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     *        parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     *        changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this
     *        value is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but
     *        it does nothing until then.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setEnableGlobalWriteForwarding(Boolean enableGlobalWriteForwarding) {
        this.enableGlobalWriteForwarding = enableGlobalWriteForwarding;
    }

    /**
     * <p>
     * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an
     * Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed on Aurora DB clusters
     * that are secondary clusters in an Aurora global database.
     * </p>
     * <p>
     * You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     * parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     * changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value
     * is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but it does
     * nothing until then.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to enable this DB cluster to forward write operations to the primary
     *         cluster of an Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed
     *         on Aurora DB clusters that are secondary clusters in an Aurora global database.</p>
     *         <p>
     *         You can set this value only on Aurora DB clusters that are members of an Aurora global database. With
     *         this parameter enabled, a secondary cluster can forward writes to the current primary cluster and the
     *         resulting changes are replicated back to this cluster. For the primary DB cluster of an Aurora global
     *         database, this value is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a>
     *         API operation, but it does nothing until then.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean getEnableGlobalWriteForwarding() {
        return this.enableGlobalWriteForwarding;
    }

    /**
     * <p>
     * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an
     * Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed on Aurora DB clusters
     * that are secondary clusters in an Aurora global database.
     * </p>
     * <p>
     * You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     * parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     * changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value
     * is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but it does
     * nothing until then.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableGlobalWriteForwarding
     *        A value that indicates whether to enable this DB cluster to forward write operations to the primary
     *        cluster of an Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed
     *        on Aurora DB clusters that are secondary clusters in an Aurora global database.</p>
     *        <p>
     *        You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     *        parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     *        changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this
     *        value is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but
     *        it does nothing until then.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEnableGlobalWriteForwarding(Boolean enableGlobalWriteForwarding) {
        setEnableGlobalWriteForwarding(enableGlobalWriteForwarding);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable this DB cluster to forward write operations to the primary cluster of an
     * Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed on Aurora DB clusters
     * that are secondary clusters in an Aurora global database.
     * </p>
     * <p>
     * You can set this value only on Aurora DB clusters that are members of an Aurora global database. With this
     * parameter enabled, a secondary cluster can forward writes to the current primary cluster and the resulting
     * changes are replicated back to this cluster. For the primary DB cluster of an Aurora global database, this value
     * is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a> API operation, but it does
     * nothing until then.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to enable this DB cluster to forward write operations to the primary
     *         cluster of an Aurora global database (<a>GlobalCluster</a>). By default, write operations are not allowed
     *         on Aurora DB clusters that are secondary clusters in an Aurora global database.</p>
     *         <p>
     *         You can set this value only on Aurora DB clusters that are members of an Aurora global database. With
     *         this parameter enabled, a secondary cluster can forward writes to the current primary cluster and the
     *         resulting changes are replicated back to this cluster. For the primary DB cluster of an Aurora global
     *         database, this value is used immediately if the primary is demoted by the <a>FailoverGlobalCluster</a>
     *         API operation, but it does nothing until then.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean isEnableGlobalWriteForwarding() {
        return this.enableGlobalWriteForwarding;
    }

    /**
     * <p>
     * The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example db.m6gd.xlarge. Not
     * all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance class</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param dBClusterInstanceClass
     *        The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example
     *        db.m6gd.xlarge. Not all DB instance classes are available in all Amazon Web Services Regions, or for all
     *        database engines.</p>
     *        <p>
     *        For the full list of DB instance classes and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance
     *        class</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting is required to create a Multi-AZ DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setDBClusterInstanceClass(String dBClusterInstanceClass) {
        this.dBClusterInstanceClass = dBClusterInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example db.m6gd.xlarge. Not
     * all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance class</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example
     *         db.m6gd.xlarge. Not all DB instance classes are available in all Amazon Web Services Regions, or for all
     *         database engines.</p>
     *         <p>
     *         For the full list of DB instance classes and availability for your engine, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance
     *         class</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         This setting is required to create a Multi-AZ DB cluster.
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public String getDBClusterInstanceClass() {
        return this.dBClusterInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example db.m6gd.xlarge. Not
     * all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance class</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param dBClusterInstanceClass
     *        The compute and memory capacity of each DB instance in the Multi-AZ DB cluster, for example
     *        db.m6gd.xlarge. Not all DB instance classes are available in all Amazon Web Services Regions, or for all
     *        database engines.</p>
     *        <p>
     *        For the full list of DB instance classes and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance
     *        class</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting is required to create a Multi-AZ DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDBClusterInstanceClass(String dBClusterInstanceClass) {
        setDBClusterInstanceClass(dBClusterInstanceClass);
        return this;
    }

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster.</p>
     *        <p>
     *        This setting is required to create a Multi-AZ DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster.</p>
     *         <p>
     *         This setting is required to create a Multi-AZ DB cluster.
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage in gibibytes (GiB) to allocate to each DB instance in the Multi-AZ DB cluster.</p>
     *        <p>
     *        This setting is required to create a Multi-AZ DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB cluster.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid values: <code>io1</code>
     * </p>
     * <p>
     * When specified, a value for the <code>Iops</code> parameter is required.
     * </p>
     * <p>
     * Default: <code>io1</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB cluster.</p>
     *        <p>
     *        This setting is required to create a Multi-AZ DB cluster.
     *        </p>
     *        <p>
     *        Valid values: <code>io1</code>
     *        </p>
     *        <p>
     *        When specified, a value for the <code>Iops</code> parameter is required.
     *        </p>
     *        <p>
     *        Default: <code>io1</code>
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB cluster.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid values: <code>io1</code>
     * </p>
     * <p>
     * When specified, a value for the <code>Iops</code> parameter is required.
     * </p>
     * <p>
     * Default: <code>io1</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return Specifies the storage type to be associated with the DB cluster.</p>
     *         <p>
     *         This setting is required to create a Multi-AZ DB cluster.
     *         </p>
     *         <p>
     *         Valid values: <code>io1</code>
     *         </p>
     *         <p>
     *         When specified, a value for the <code>Iops</code> parameter is required.
     *         </p>
     *         <p>
     *         Default: <code>io1</code>
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB cluster.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid values: <code>io1</code>
     * </p>
     * <p>
     * When specified, a value for the <code>Iops</code> parameter is required.
     * </p>
     * <p>
     * Default: <code>io1</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB cluster.</p>
     *        <p>
     *        This setting is required to create a Multi-AZ DB cluster.
     *        </p>
     *        <p>
     *        Valid values: <code>io1</code>
     *        </p>
     *        <p>
     *        When specified, a value for the <code>Iops</code> parameter is required.
     *        </p>
     *        <p>
     *        Default: <code>io1</code>
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     * instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * For information about valid IOPS values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS Provisioned
     * IOPS storage</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     *        instance in the Multi-AZ DB cluster.</p>
     *        <p>
     *        For information about valid IOPS values, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS
     *        Provisioned IOPS storage</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting is required to create a Multi-AZ DB cluster.
     *        </p>
     *        <p>
     *        Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     * instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * For information about valid IOPS values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS Provisioned
     * IOPS storage</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     *         instance in the Multi-AZ DB cluster.</p>
     *         <p>
     *         For information about valid IOPS values, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS
     *         Provisioned IOPS storage</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         This setting is required to create a Multi-AZ DB cluster.
     *         </p>
     *         <p>
     *         Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     * instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * For information about valid IOPS values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS Provisioned
     * IOPS storage</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting is required to create a Multi-AZ DB cluster.
     * </p>
     * <p>
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     *        instance in the Multi-AZ DB cluster.</p>
     *        <p>
     *        For information about valid IOPS values, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS
     *        Provisioned IOPS storage</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting is required to create a Multi-AZ DB cluster.
     *        </p>
     *        <p>
     *        Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access isn't permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a
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
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
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
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param publiclyAccessible
     *        A value that indicates whether the DB cluster is publicly accessible.</p>
     *        <p>
     *        When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *        IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *        from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *        group it uses. That public access isn't permitted if the security group assigned to the DB cluster doesn't
     *        permit it.
     *        </p>
     *        <p>
     *        When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves
     *        to a private IP address.
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
     *        If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     *        private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
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
     *        If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is
     *        private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access isn't permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a
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
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
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
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return A value that indicates whether the DB cluster is publicly accessible.</p>
     *         <p>
     *         When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *         IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *         from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *         group it uses. That public access isn't permitted if the security group assigned to the DB cluster
     *         doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves
     *         to a private IP address.
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
     *         If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster
     *         is private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
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
     *         If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is
     *         private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access isn't permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a
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
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
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
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param publiclyAccessible
     *        A value that indicates whether the DB cluster is publicly accessible.</p>
     *        <p>
     *        When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *        IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *        from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *        group it uses. That public access isn't permitted if the security group assigned to the DB cluster doesn't
     *        permit it.
     *        </p>
     *        <p>
     *        When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves
     *        to a private IP address.
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
     *        If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     *        private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
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
     *        If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is
     *        private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access isn't permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a
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
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
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
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return A value that indicates whether the DB cluster is publicly accessible.</p>
     *         <p>
     *         When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *         IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *         from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *         group it uses. That public access isn't permitted if the security group assigned to the DB cluster
     *         doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves
     *         to a private IP address.
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
     *         If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster
     *         is private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
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
     *         If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is
     *         private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during the
     * maintenance window. By default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during
     *        the maintenance window. By default, minor engine upgrades are applied automatically.</p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during the
     * maintenance window. By default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during
     *         the maintenance window. By default, minor engine upgrades are applied automatically.</p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during the
     * maintenance window. By default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during
     *        the maintenance window. By default, minor engine upgrades are applied automatically.</p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during the
     * maintenance window. By default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return A value that indicates whether minor engine upgrades are applied automatically to the DB cluster during
     *         the maintenance window. By default, minor engine upgrades are applied automatically.</p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB cluster. To
     * turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, also set <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        cluster. To turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, also set <code>MonitoringInterval</code> to a value other
     *        than 0.
     *        </p>
     *        <p>
     *        Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB cluster. To
     * turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, also set <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *         cluster. To turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *         <p>
     *         If <code>MonitoringRoleArn</code> is specified, also set <code>MonitoringInterval</code> to a value other
     *         than 0.
     *         </p>
     *         <p>
     *         Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Integer getMonitoringInterval() {
        return this.monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB cluster. To
     * turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, also set <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        cluster. To turn off collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, also set <code>MonitoringInterval</code> to a value other
     *        than 0.
     *        </p>
     *        <p>
     *        Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withMonitoringInterval(Integer monitoringInterval) {
        setMonitoringInterval(monitoringInterval);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon
     * CloudWatch Logs. An example is <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a
     * monitoring role, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting up and enabling Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, supply a <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param monitoringRoleArn
     *        The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to
     *        Amazon CloudWatch Logs. An example is <code>arn:aws:iam:123456789012:role/emaccess</code>. For information
     *        on creating a monitoring role, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     *        >Setting up and enabling Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        If <code>MonitoringInterval</code> is set to a value other than 0, supply a <code>MonitoringRoleArn</code>
     *        value.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon
     * CloudWatch Logs. An example is <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a
     * monitoring role, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting up and enabling Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, supply a <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to
     *         Amazon CloudWatch Logs. An example is <code>arn:aws:iam:123456789012:role/emaccess</code>. For
     *         information on creating a monitoring role, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     *         >Setting up and enabling Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.</p>
     *         <p>
     *         If <code>MonitoringInterval</code> is set to a value other than 0, supply a
     *         <code>MonitoringRoleArn</code> value.
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public String getMonitoringRoleArn() {
        return this.monitoringRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to Amazon
     * CloudWatch Logs. An example is <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a
     * monitoring role, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting up and enabling Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, supply a <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param monitoringRoleArn
     *        The Amazon Resource Name (ARN) for the IAM role that permits RDS to send Enhanced Monitoring metrics to
     *        Amazon CloudWatch Logs. An example is <code>arn:aws:iam:123456789012:role/emaccess</code>. For information
     *        on creating a monitoring role, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     *        >Setting up and enabling Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        If <code>MonitoringInterval</code> is set to a value other than 0, supply a <code>MonitoringRoleArn</code>
     *        value.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withMonitoringRoleArn(String monitoringRoleArn) {
        setMonitoringRoleArn(monitoringRoleArn);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to turn on Performance Insights for the DB cluster.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param enablePerformanceInsights
     *        A value that indicates whether to turn on Performance Insights for the DB cluster.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon
     *        Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        this.enablePerformanceInsights = enablePerformanceInsights;
    }

    /**
     * <p>
     * A value that indicates whether to turn on Performance Insights for the DB cluster.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to turn on Performance Insights for the DB cluster.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon
     *         Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Boolean getEnablePerformanceInsights() {
        return this.enablePerformanceInsights;
    }

    /**
     * <p>
     * A value that indicates whether to turn on Performance Insights for the DB cluster.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param enablePerformanceInsights
     *        A value that indicates whether to turn on Performance Insights for the DB cluster.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon
     *        Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        setEnablePerformanceInsights(enablePerformanceInsights);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to turn on Performance Insights for the DB cluster.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to turn on Performance Insights for the DB cluster.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html"> Using Amazon
     *         Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
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
     * If you don't specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default KMS
     * key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     * different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param performanceInsightsKMSKeyId
     *        The Amazon Web Services KMS key identifier for encryption of Performance Insights data.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key.
     *        </p>
     *        <p>
     *        If you don't specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     *        default KMS key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services
     *        account has a different default KMS key for each Amazon Web Services Region.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
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
     * If you don't specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default KMS
     * key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     * different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier for encryption of Performance Insights data.</p>
     *         <p>
     *         The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *         key.
     *         </p>
     *         <p>
     *         If you don't specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     *         default KMS key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web
     *         Services account has a different default KMS key for each Amazon Web Services Region.
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
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
     * If you don't specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your default KMS
     * key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     * different default KMS key for each Amazon Web Services Region.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param performanceInsightsKMSKeyId
     *        The Amazon Web Services KMS key identifier for encryption of Performance Insights data.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key.
     *        </p>
     *        <p>
     *        If you don't specify a value for <code>PerformanceInsightsKMSKeyId</code>, then Amazon RDS uses your
     *        default KMS key. There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services
     *        account has a different default KMS key for each Amazon Web Services Region.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
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
     * Valid for: Multi-AZ DB clusters only
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
     *        Valid for: Multi-AZ DB clusters only
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
     * Valid for: Multi-AZ DB clusters only
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
     *         Valid for: Multi-AZ DB clusters only
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
     * Valid for: Multi-AZ DB clusters only
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
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
        setPerformanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod);
        return this;
    }

    /**
     * @param serverlessV2ScalingConfiguration
     */

    public void setServerlessV2ScalingConfiguration(ServerlessV2ScalingConfiguration serverlessV2ScalingConfiguration) {
        this.serverlessV2ScalingConfiguration = serverlessV2ScalingConfiguration;
    }

    /**
     * @return
     */

    public ServerlessV2ScalingConfiguration getServerlessV2ScalingConfiguration() {
        return this.serverlessV2ScalingConfiguration;
    }

    /**
     * @param serverlessV2ScalingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withServerlessV2ScalingConfiguration(ServerlessV2ScalingConfiguration serverlessV2ScalingConfiguration) {
        setServerlessV2ScalingConfiguration(serverlessV2ScalingConfiguration);
        return this;
    }

    /**
     * <p>
     * The network type of the DB cluster.
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
     * The network type is determined by the <code>DBSubnetGroup</code> specified for the DB cluster. A
     * <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     * <code>DUAL</code>).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     * Working with a DB instance in a VPC</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param networkType
     *        The network type of the DB cluster.</p>
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
     *        The network type is determined by the <code>DBSubnetGroup</code> specified for the DB cluster. A
     *        <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     *        <code>DUAL</code>).
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     *        Working with a DB instance in a VPC</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    /**
     * <p>
     * The network type of the DB cluster.
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
     * The network type is determined by the <code>DBSubnetGroup</code> specified for the DB cluster. A
     * <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     * <code>DUAL</code>).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     * Working with a DB instance in a VPC</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The network type of the DB cluster.</p>
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
     *         The network type is determined by the <code>DBSubnetGroup</code> specified for the DB cluster. A
     *         <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     *         <code>DUAL</code>).
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html"
     *         > Working with a DB instance in a VPC</a> in the <i>Amazon Aurora User Guide.</i>
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * <p>
     * The network type of the DB cluster.
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
     * The network type is determined by the <code>DBSubnetGroup</code> specified for the DB cluster. A
     * <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     * <code>DUAL</code>).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     * Working with a DB instance in a VPC</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param networkType
     *        The network type of the DB cluster.</p>
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
     *        The network type is determined by the <code>DBSubnetGroup</code> specified for the DB cluster. A
     *        <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     *        <code>DUAL</code>).
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     *        Working with a DB instance in a VPC</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withNetworkType(String networkType) {
        setNetworkType(networkType);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param dBSystemId
     *        Reserved for future use.
     */

    public void setDBSystemId(String dBSystemId) {
        this.dBSystemId = dBSystemId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getDBSystemId() {
        return this.dBSystemId;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param dBSystemId
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withDBSystemId(String dBSystemId) {
        setDBSystemId(dBSystemId);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to manage the master user password with Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password management with
     * Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html">Password management
     * with Amazon Web Services Secrets Manager</a> in the <i>Amazon Aurora User Guide.</i>
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param manageMasterUserPassword
     *        A value that indicates whether to manage the master user password with Amazon Web Services Secrets
     *        Manager.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password management
     *        with Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide</i> and <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html">Password
     *        management with Amazon Web Services Secrets Manager</a> in the <i>Amazon Aurora User Guide.</i>
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
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
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
     * Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html">Password management
     * with Amazon Web Services Secrets Manager</a> in the <i>Amazon Aurora User Guide.</i>
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether to manage the master user password with Amazon Web Services Secrets
     *         Manager.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password
     *         management with Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide</i> and <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html">Password
     *         management with Amazon Web Services Secrets Manager</a> in the <i>Amazon Aurora User Guide.</i>
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
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
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
     * Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html">Password management
     * with Amazon Web Services Secrets Manager</a> in the <i>Amazon Aurora User Guide.</i>
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param manageMasterUserPassword
     *        A value that indicates whether to manage the master user password with Amazon Web Services Secrets
     *        Manager.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password management
     *        with Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide</i> and <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html">Password
     *        management with Amazon Web Services Secrets Manager</a> in the <i>Amazon Aurora User Guide.</i>
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
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withManageMasterUserPassword(Boolean manageMasterUserPassword) {
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
     * Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html">Password management
     * with Amazon Web Services Secrets Manager</a> in the <i>Amazon Aurora User Guide.</i>
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether to manage the master user password with Amazon Web Services Secrets
     *         Manager.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-secrets-manager.html">Password
     *         management with Amazon Web Services Secrets Manager</a> in the <i>Amazon RDS User Guide</i> and <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/rds-secrets-manager.html">Password
     *         management with Amazon Web Services Secrets Manager</a> in the <i>Amazon Aurora User Guide.</i>
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
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
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
     * for the DB cluster.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param masterUserSecretKmsKeyId
     *        The Amazon Web Services KMS key identifier to encrypt a secret that is automatically generated and managed
     *        in Amazon Web Services Secrets Manager.</p>
     *        <p>
     *        This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets
     *        Manager for the DB cluster.
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
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
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
     * for the DB cluster.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier to encrypt a secret that is automatically generated and
     *         managed in Amazon Web Services Secrets Manager.</p>
     *         <p>
     *         This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets
     *         Manager for the DB cluster.
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
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
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
     * for the DB cluster.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param masterUserSecretKmsKeyId
     *        The Amazon Web Services KMS key identifier to encrypt a secret that is automatically generated and managed
     *        in Amazon Web Services Secrets Manager.</p>
     *        <p>
     *        This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets
     *        Manager for the DB cluster.
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
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withMasterUserSecretKmsKeyId(String masterUserSecretKmsKeyId) {
        setMasterUserSecretKmsKeyId(masterUserSecretKmsKeyId);
        return this;
    }

    /**
     * The region where the source instance is located.
     * 
     * @param sourceRegion
     *        The region where the source instance is located.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * The region where the source instance is located.
     * 
     * @return The region where the source instance is located.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * The region where the source instance is located.
     * 
     * @param sourceRegion
     *        The region where the source instance is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterRequest withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: ").append(getCharacterSetName()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: ").append(getDBClusterParameterGroupName()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: ").append(getDBSubnetGroupName()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append(getMasterUserPassword()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getReplicationSourceIdentifier() != null)
            sb.append("ReplicationSourceIdentifier: ").append(getReplicationSourceIdentifier()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getPreSignedUrl() != null)
            sb.append("PreSignedUrl: ").append(getPreSignedUrl()).append(",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: ").append(getEnableIAMDatabaseAuthentication()).append(",");
        if (getBacktrackWindow() != null)
            sb.append("BacktrackWindow: ").append(getBacktrackWindow()).append(",");
        if (getEnableCloudwatchLogsExports() != null)
            sb.append("EnableCloudwatchLogsExports: ").append(getEnableCloudwatchLogsExports()).append(",");
        if (getEngineMode() != null)
            sb.append("EngineMode: ").append(getEngineMode()).append(",");
        if (getScalingConfiguration() != null)
            sb.append("ScalingConfiguration: ").append(getScalingConfiguration()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getGlobalClusterIdentifier() != null)
            sb.append("GlobalClusterIdentifier: ").append(getGlobalClusterIdentifier()).append(",");
        if (getEnableHttpEndpoint() != null)
            sb.append("EnableHttpEndpoint: ").append(getEnableHttpEndpoint()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: ").append(getDomainIAMRoleName()).append(",");
        if (getEnableGlobalWriteForwarding() != null)
            sb.append("EnableGlobalWriteForwarding: ").append(getEnableGlobalWriteForwarding()).append(",");
        if (getDBClusterInstanceClass() != null)
            sb.append("DBClusterInstanceClass: ").append(getDBClusterInstanceClass()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getMonitoringInterval() != null)
            sb.append("MonitoringInterval: ").append(getMonitoringInterval()).append(",");
        if (getMonitoringRoleArn() != null)
            sb.append("MonitoringRoleArn: ").append(getMonitoringRoleArn()).append(",");
        if (getEnablePerformanceInsights() != null)
            sb.append("EnablePerformanceInsights: ").append(getEnablePerformanceInsights()).append(",");
        if (getPerformanceInsightsKMSKeyId() != null)
            sb.append("PerformanceInsightsKMSKeyId: ").append(getPerformanceInsightsKMSKeyId()).append(",");
        if (getPerformanceInsightsRetentionPeriod() != null)
            sb.append("PerformanceInsightsRetentionPeriod: ").append(getPerformanceInsightsRetentionPeriod()).append(",");
        if (getServerlessV2ScalingConfiguration() != null)
            sb.append("ServerlessV2ScalingConfiguration: ").append(getServerlessV2ScalingConfiguration()).append(",");
        if (getNetworkType() != null)
            sb.append("NetworkType: ").append(getNetworkType()).append(",");
        if (getDBSystemId() != null)
            sb.append("DBSystemId: ").append(getDBSystemId()).append(",");
        if (getManageMasterUserPassword() != null)
            sb.append("ManageMasterUserPassword: ").append(getManageMasterUserPassword()).append(",");
        if (getMasterUserSecretKmsKeyId() != null)
            sb.append("MasterUserSecretKmsKeyId: ").append(getMasterUserSecretKmsKeyId()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBClusterRequest == false)
            return false;
        CreateDBClusterRequest other = (CreateDBClusterRequest) obj;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBClusterParameterGroupName() == null ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null && other.getDBClusterParameterGroupName().equals(this.getDBClusterParameterGroupName()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getReplicationSourceIdentifier() == null ^ this.getReplicationSourceIdentifier() == null)
            return false;
        if (other.getReplicationSourceIdentifier() != null && other.getReplicationSourceIdentifier().equals(this.getReplicationSourceIdentifier()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPreSignedUrl() == null ^ this.getPreSignedUrl() == null)
            return false;
        if (other.getPreSignedUrl() != null && other.getPreSignedUrl().equals(this.getPreSignedUrl()) == false)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() == null ^ this.getEnableIAMDatabaseAuthentication() == null)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() != null
                && other.getEnableIAMDatabaseAuthentication().equals(this.getEnableIAMDatabaseAuthentication()) == false)
            return false;
        if (other.getBacktrackWindow() == null ^ this.getBacktrackWindow() == null)
            return false;
        if (other.getBacktrackWindow() != null && other.getBacktrackWindow().equals(this.getBacktrackWindow()) == false)
            return false;
        if (other.getEnableCloudwatchLogsExports() == null ^ this.getEnableCloudwatchLogsExports() == null)
            return false;
        if (other.getEnableCloudwatchLogsExports() != null && other.getEnableCloudwatchLogsExports().equals(this.getEnableCloudwatchLogsExports()) == false)
            return false;
        if (other.getEngineMode() == null ^ this.getEngineMode() == null)
            return false;
        if (other.getEngineMode() != null && other.getEngineMode().equals(this.getEngineMode()) == false)
            return false;
        if (other.getScalingConfiguration() == null ^ this.getScalingConfiguration() == null)
            return false;
        if (other.getScalingConfiguration() != null && other.getScalingConfiguration().equals(this.getScalingConfiguration()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getGlobalClusterIdentifier() == null ^ this.getGlobalClusterIdentifier() == null)
            return false;
        if (other.getGlobalClusterIdentifier() != null && other.getGlobalClusterIdentifier().equals(this.getGlobalClusterIdentifier()) == false)
            return false;
        if (other.getEnableHttpEndpoint() == null ^ this.getEnableHttpEndpoint() == null)
            return false;
        if (other.getEnableHttpEndpoint() != null && other.getEnableHttpEndpoint().equals(this.getEnableHttpEndpoint()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null)
            return false;
        if (other.getDomainIAMRoleName() != null && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false)
            return false;
        if (other.getEnableGlobalWriteForwarding() == null ^ this.getEnableGlobalWriteForwarding() == null)
            return false;
        if (other.getEnableGlobalWriteForwarding() != null && other.getEnableGlobalWriteForwarding().equals(this.getEnableGlobalWriteForwarding()) == false)
            return false;
        if (other.getDBClusterInstanceClass() == null ^ this.getDBClusterInstanceClass() == null)
            return false;
        if (other.getDBClusterInstanceClass() != null && other.getDBClusterInstanceClass().equals(this.getDBClusterInstanceClass()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getMonitoringInterval() == null ^ this.getMonitoringInterval() == null)
            return false;
        if (other.getMonitoringInterval() != null && other.getMonitoringInterval().equals(this.getMonitoringInterval()) == false)
            return false;
        if (other.getMonitoringRoleArn() == null ^ this.getMonitoringRoleArn() == null)
            return false;
        if (other.getMonitoringRoleArn() != null && other.getMonitoringRoleArn().equals(this.getMonitoringRoleArn()) == false)
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
        if (other.getServerlessV2ScalingConfiguration() == null ^ this.getServerlessV2ScalingConfiguration() == null)
            return false;
        if (other.getServerlessV2ScalingConfiguration() != null
                && other.getServerlessV2ScalingConfiguration().equals(this.getServerlessV2ScalingConfiguration()) == false)
            return false;
        if (other.getNetworkType() == null ^ this.getNetworkType() == null)
            return false;
        if (other.getNetworkType() != null && other.getNetworkType().equals(this.getNetworkType()) == false)
            return false;
        if (other.getDBSystemId() == null ^ this.getDBSystemId() == null)
            return false;
        if (other.getDBSystemId() != null && other.getDBSystemId().equals(this.getDBSystemId()) == false)
            return false;
        if (other.getManageMasterUserPassword() == null ^ this.getManageMasterUserPassword() == null)
            return false;
        if (other.getManageMasterUserPassword() != null && other.getManageMasterUserPassword().equals(this.getManageMasterUserPassword()) == false)
            return false;
        if (other.getMasterUserSecretKmsKeyId() == null ^ this.getMasterUserSecretKmsKeyId() == null)
            return false;
        if (other.getMasterUserSecretKmsKeyId() != null && other.getMasterUserSecretKmsKeyId().equals(this.getMasterUserSecretKmsKeyId()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getReplicationSourceIdentifier() == null) ? 0 : getReplicationSourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPreSignedUrl() == null) ? 0 : getPreSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getEnableIAMDatabaseAuthentication() == null) ? 0 : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode + ((getBacktrackWindow() == null) ? 0 : getBacktrackWindow().hashCode());
        hashCode = prime * hashCode + ((getEnableCloudwatchLogsExports() == null) ? 0 : getEnableCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getEngineMode() == null) ? 0 : getEngineMode().hashCode());
        hashCode = prime * hashCode + ((getScalingConfiguration() == null) ? 0 : getScalingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getGlobalClusterIdentifier() == null) ? 0 : getGlobalClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnableHttpEndpoint() == null) ? 0 : getEnableHttpEndpoint().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        hashCode = prime * hashCode + ((getEnableGlobalWriteForwarding() == null) ? 0 : getEnableGlobalWriteForwarding().hashCode());
        hashCode = prime * hashCode + ((getDBClusterInstanceClass() == null) ? 0 : getDBClusterInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode());
        hashCode = prime * hashCode + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEnablePerformanceInsights() == null) ? 0 : getEnablePerformanceInsights().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsKMSKeyId() == null) ? 0 : getPerformanceInsightsKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsRetentionPeriod() == null) ? 0 : getPerformanceInsightsRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getServerlessV2ScalingConfiguration() == null) ? 0 : getServerlessV2ScalingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNetworkType() == null) ? 0 : getNetworkType().hashCode());
        hashCode = prime * hashCode + ((getDBSystemId() == null) ? 0 : getDBSystemId().hashCode());
        hashCode = prime * hashCode + ((getManageMasterUserPassword() == null) ? 0 : getManageMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getMasterUserSecretKmsKeyId() == null) ? 0 : getMasterUserSecretKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBClusterRequest clone() {
        return (CreateDBClusterRequest) super.clone();
    }

}
