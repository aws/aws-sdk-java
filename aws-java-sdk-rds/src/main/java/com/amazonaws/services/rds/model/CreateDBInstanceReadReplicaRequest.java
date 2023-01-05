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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBInstanceReadReplica" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBInstanceReadReplicaRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB instance identifier of the read replica. This identifier is the unique key that identifies a DB instance.
     * This parameter is stored as a lowercase string.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The identifier of the DB instance that will act as the source for the read replica. Each DB instance can have up
     * to five read replicas.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier of an existing MySQL, MariaDB, Oracle, PostgreSQL, or SQL Server DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a MySQL read replica only if the source is running MySQL 5.6 or later.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the limitations of Oracle read replicas, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica Limitations
     * with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the limitations of SQL Server read replicas, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/SQLServer.ReadReplicas.Limitations.html">Read
     * Replica Limitations with Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or later (9.4.7 and higher
     * for cross-Region replication).
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB instance must have automatic backups enabled, that is, its backup retention period must be
     * greater than 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in the same Amazon Web Services Region as the read replica, specify a valid DB
     * instance identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in a different Amazon Web Services Region from the read replica, specify a valid DB
     * instance ARN. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * >Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>. This doesn't apply to SQL Server or
     * RDS Custom, which don't support cross-Region replicas.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceDBInstanceIdentifier;
    /**
     * <p>
     * The compute and memory capacity of the read replica, for example db.m4.large. Not all DB instance classes are
     * available in all Amazon Web Services Regions, or for all database engines. For the full list of DB instance
     * classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The Availability Zone (AZ) where the read replica will be created.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's Amazon Web Services Region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The port number that the DB instance uses for connections.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * A value that indicates whether the read replica is in a Multi-AZ deployment.
     * </p>
     * <p>
     * You can create a read replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     * Availability Zone for failover support for the replica. Creating your read replica as a Multi-AZ DB instance is
     * independent of whether the source database is a Multi-AZ DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the read replica during the
     * maintenance window.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The option group the DB instance is associated with. If omitted, the option group associated with the source
     * instance is used.
     * </p>
     * <note>
     * <p>
     * For SQL Server, you must use the option group associated with the source instance.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then Amazon RDS uses the
     * <code>DBParameterGroup</code> of source DB instance for a same Region read replica, or the default
     * <code>DBParameterGroup</code> for the specified DB engine for a cross-Region read replica.
     * </p>
     * <p>
     * Specifying a parameter group for this operation is only supported for MySQL and Oracle DB instances. It isn't
     * supported for RDS Custom.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     */
    private String dBParameterGroupName;
    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access isn't permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     */
    private Boolean publiclyAccessible;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Specifies a DB subnet group for the DB instance. The new DB instance is created in the VPC associated with the DB
     * subnet group. If no DB subnet group is specified, then the new DB instance isn't created in a VPC.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can only be specified if the source DB instance identifier specifies a DB instance in another Amazon Web Services
     * Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB subnet group must be in the same Amazon Web Services Region in which the operation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * All read replicas in one Amazon Web Services Region that are created from the same source DB instance must
     * either:&gt;
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify DB subnet groups from the same VPC. All these read replicas are created in the same VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not specify a DB subnet group. All these read replicas are created outside of any VPC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * A list of Amazon EC2 VPC security groups to associate with the read replica.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * Specifies the storage type to be associated with the read replica.
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
     */
    private String storageType;
    /**
     * <p>
     * A value that indicates whether to copy all tags from the read replica to snapshots of the read replica. By
     * default, tags are not copied.
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the read replica. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
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
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go
     * to <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.
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
     * The Amazon Web Services KMS key identifier for an encrypted read replica.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <p>
     * If you create an encrypted read replica in the same Amazon Web Services Region as the source DB instance, then do
     * not specify a value for this parameter. A read replica in the same Amazon Web Services Region is always encrypted
     * with the same KMS key as the source DB instance.
     * </p>
     * <p>
     * If you create an encrypted read replica in a different Amazon Web Services Region, then you must specify a KMS
     * key identifier for the destination Amazon Web Services Region. KMS keys are specific to the Amazon Web Services
     * Region that they are created in, and you can't use KMS keys from one Amazon Web Services Region in another Amazon
     * Web Services Region.
     * </p>
     * <p>
     * You can't create an encrypted read replica from an unencrypted DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom, which uses the same KMS key as the primary replica.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * When you are creating a read replica from one Amazon Web Services GovCloud (US) Region to another or from one
     * China Amazon Web Services Region to another, the URL that contains a Signature Version 4 signed request for the
     * <code>CreateDBInstanceReadReplica</code> API operation in the source Amazon Web Services Region that contains the
     * source DB instance.
     * </p>
     * <p>
     * This setting applies only to Amazon Web Services GovCloud (US) Regions and China Amazon Web Services Regions.
     * It's ignored in other Amazon Web Services Regions.
     * </p>
     * <p>
     * You must specify this parameter when you create an encrypted read replica from another Amazon Web Services Region
     * by using the Amazon RDS API. Don't specify <code>PreSignedUrl</code> when you are creating an encrypted read
     * replica in the same Amazon Web Services Region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API operation that can
     * run in the source Amazon Web Services Region that contains the encrypted source DB instance. The presigned URL
     * request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The Amazon Web Services Region that the encrypted read replica is created in.
     * This Amazon Web Services Region is the same one where the <code>CreateDBInstanceReadReplica</code> operation is
     * called that contains this presigned URL.
     * </p>
     * <p>
     * For example, if you create an encrypted DB instance in the us-west-1 Amazon Web Services Region, from a source DB
     * instance in the us-east-2 Amazon Web Services Region, then you call the <code>CreateDBInstanceReadReplica</code>
     * operation in the us-east-1 Amazon Web Services Region and provide a presigned URL that contains a call to the
     * <code>CreateDBInstanceReadReplica</code> operation in the us-west-2 Amazon Web Services Region. For this example,
     * the <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the read replica in the destination
     * Amazon Web Services Region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code>
     * operation that is called in the destination Amazon Web Services Region, and the operation contained in the
     * presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted DB instance to be
     * replicated. This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web Services
     * Region. For example, if you are creating an encrypted read replica from a DB instance in the us-west-2 Amazon Web
     * Services Region, then your <code>SourceDBInstanceIdentifier</code> looks like the following example:
     * <code>arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests:
     * Using Query Parameters (Amazon Web Services Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     * Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a presigned URL that is a valid request for the operation that can run in
     * the source Amazon Web Services Region.
     * </p>
     * <p>
     * <code>SourceRegion</code> isn't supported for SQL Server, because Amazon RDS for SQL Server doesn't support
     * cross-Region read replicas.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private String preSignedUrl;
    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;
    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the read replica.
     * </p>
     * <p>
     * For more information, see <a
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
     * The list of logs that the new DB instance is to export to CloudWatch Logs. The values in the list depend on the
     * DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
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
     */
    private com.amazonaws.internal.SdkInternalList<ProcessorFeature> processorFeatures;
    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private Boolean useDefaultProcessorFeatures;
    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted
     * when deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     */
    private Boolean deletionProtection;
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
     */
    private String domain;
    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private String domainIAMRoleName;
    /**
     * <p>
     * The open mode of the replica database: mounted or read-only.
     * </p>
     * <note>
     * <p>
     * This parameter is only supported for Oracle DB instances.
     * </p>
     * </note>
     * <p>
     * Mounted DB replicas are included in Oracle Database Enterprise Edition. The main use case for mounted replicas is
     * cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the
     * mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload.
     * </p>
     * <p>
     * You can create a combination of mounted and read-only DB replicas for the same primary DB instance. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For RDS Custom, you must specify this parameter and set it to <code>mounted</code>. The value won't be set by
     * default. After replica creation, you can manage the open mode manually.
     * </p>
     */
    private String replicaMode;
    /**
     * <p>
     * The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     * <p>
     * For more information about this setting, including limitations that apply to it, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling">
     * Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     */
    private Integer maxAllocatedStorage;
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
     * The network type is determined by the <code>DBSubnetGroup</code> specified for read replica. A
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
     * Specifies the storage throughput value for the read replica.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     * </p>
     */
    private Integer storageThroughput;
    /**
     * <p>
     * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts read replica.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the read replica
     * from outside of its virtual private cloud (VPC) on your local network.
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
    /** The region where the source instance is located. */
    private String sourceRegion;

    /**
     * Default constructor for CreateDBInstanceReadReplicaRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreateDBInstanceReadReplicaRequest() {
    }

    /**
     * Constructs a new CreateDBInstanceReadReplicaRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier of the read replica. This identifier is the unique key that identifies a DB
     *        instance. This parameter is stored as a lowercase string.
     * @param sourceDBInstanceIdentifier
     *        The identifier of the DB instance that will act as the source for the read replica. Each DB instance can
     *        have up to five read replicas.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier of an existing MySQL, MariaDB, Oracle, PostgreSQL, or SQL Server DB instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a DB instance that is a MySQL read replica only if the source is running MySQL 5.6 or later.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the limitations of Oracle read replicas, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica
     *        Limitations with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the limitations of SQL Server read replicas, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/SQLServer.ReadReplicas.Limitations.html">Read
     *        Replica Limitations with Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or later (9.4.7 and
     *        higher for cross-Region replication).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The specified DB instance must have automatic backups enabled, that is, its backup retention period must
     *        be greater than 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB instance is in the same Amazon Web Services Region as the read replica, specify a valid
     *        DB instance identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB instance is in a different Amazon Web Services Region from the read replica, specify a
     *        valid DB instance ARN. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *        >Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>. This doesn't apply to SQL
     *        Server or RDS Custom, which don't support cross-Region replicas.
     *        </p>
     *        </li>
     */
    public CreateDBInstanceReadReplicaRequest(String dBInstanceIdentifier, String sourceDBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        setSourceDBInstanceIdentifier(sourceDBInstanceIdentifier);
    }

    /**
     * <p>
     * The DB instance identifier of the read replica. This identifier is the unique key that identifies a DB instance.
     * This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier of the read replica. This identifier is the unique key that identifies a DB
     *        instance. This parameter is stored as a lowercase string.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier of the read replica. This identifier is the unique key that identifies a DB instance.
     * This parameter is stored as a lowercase string.
     * </p>
     * 
     * @return The DB instance identifier of the read replica. This identifier is the unique key that identifies a DB
     *         instance. This parameter is stored as a lowercase string.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier of the read replica. This identifier is the unique key that identifies a DB instance.
     * This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier of the read replica. This identifier is the unique key that identifies a DB
     *        instance. This parameter is stored as a lowercase string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the DB instance that will act as the source for the read replica. Each DB instance can have up
     * to five read replicas.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier of an existing MySQL, MariaDB, Oracle, PostgreSQL, or SQL Server DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a MySQL read replica only if the source is running MySQL 5.6 or later.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the limitations of Oracle read replicas, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica Limitations
     * with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the limitations of SQL Server read replicas, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/SQLServer.ReadReplicas.Limitations.html">Read
     * Replica Limitations with Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or later (9.4.7 and higher
     * for cross-Region replication).
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB instance must have automatic backups enabled, that is, its backup retention period must be
     * greater than 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in the same Amazon Web Services Region as the read replica, specify a valid DB
     * instance identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in a different Amazon Web Services Region from the read replica, specify a valid DB
     * instance ARN. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * >Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>. This doesn't apply to SQL Server or
     * RDS Custom, which don't support cross-Region replicas.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceDBInstanceIdentifier
     *        The identifier of the DB instance that will act as the source for the read replica. Each DB instance can
     *        have up to five read replicas.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier of an existing MySQL, MariaDB, Oracle, PostgreSQL, or SQL Server DB instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a DB instance that is a MySQL read replica only if the source is running MySQL 5.6 or later.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the limitations of Oracle read replicas, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica
     *        Limitations with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the limitations of SQL Server read replicas, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/SQLServer.ReadReplicas.Limitations.html">Read
     *        Replica Limitations with Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or later (9.4.7 and
     *        higher for cross-Region replication).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The specified DB instance must have automatic backups enabled, that is, its backup retention period must
     *        be greater than 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB instance is in the same Amazon Web Services Region as the read replica, specify a valid
     *        DB instance identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB instance is in a different Amazon Web Services Region from the read replica, specify a
     *        valid DB instance ARN. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *        >Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>. This doesn't apply to SQL
     *        Server or RDS Custom, which don't support cross-Region replicas.
     *        </p>
     *        </li>
     */

    public void setSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB instance that will act as the source for the read replica. Each DB instance can have up
     * to five read replicas.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier of an existing MySQL, MariaDB, Oracle, PostgreSQL, or SQL Server DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a MySQL read replica only if the source is running MySQL 5.6 or later.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the limitations of Oracle read replicas, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica Limitations
     * with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the limitations of SQL Server read replicas, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/SQLServer.ReadReplicas.Limitations.html">Read
     * Replica Limitations with Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or later (9.4.7 and higher
     * for cross-Region replication).
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB instance must have automatic backups enabled, that is, its backup retention period must be
     * greater than 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in the same Amazon Web Services Region as the read replica, specify a valid DB
     * instance identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in a different Amazon Web Services Region from the read replica, specify a valid DB
     * instance ARN. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * >Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>. This doesn't apply to SQL Server or
     * RDS Custom, which don't support cross-Region replicas.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the DB instance that will act as the source for the read replica. Each DB instance can
     *         have up to five read replicas.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be the identifier of an existing MySQL, MariaDB, Oracle, PostgreSQL, or SQL Server DB instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can specify a DB instance that is a MySQL read replica only if the source is running MySQL 5.6 or later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the limitations of Oracle read replicas, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica
     *         Limitations with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the limitations of SQL Server read replicas, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/SQLServer.ReadReplicas.Limitations.html"
     *         >Read Replica Limitations with Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can specify a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or later (9.4.7 and
     *         higher for cross-Region replication).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The specified DB instance must have automatic backups enabled, that is, its backup retention period must
     *         be greater than 0.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source DB instance is in the same Amazon Web Services Region as the read replica, specify a valid
     *         DB instance identifier.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source DB instance is in a different Amazon Web Services Region from the read replica, specify a
     *         valid DB instance ARN. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *         >Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>. This doesn't apply to SQL
     *         Server or RDS Custom, which don't support cross-Region replicas.
     *         </p>
     *         </li>
     */

    public String getSourceDBInstanceIdentifier() {
        return this.sourceDBInstanceIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB instance that will act as the source for the read replica. Each DB instance can have up
     * to five read replicas.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier of an existing MySQL, MariaDB, Oracle, PostgreSQL, or SQL Server DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a MySQL read replica only if the source is running MySQL 5.6 or later.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the limitations of Oracle read replicas, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica Limitations
     * with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the limitations of SQL Server read replicas, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/SQLServer.ReadReplicas.Limitations.html">Read
     * Replica Limitations with Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or later (9.4.7 and higher
     * for cross-Region replication).
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB instance must have automatic backups enabled, that is, its backup retention period must be
     * greater than 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in the same Amazon Web Services Region as the read replica, specify a valid DB
     * instance identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in a different Amazon Web Services Region from the read replica, specify a valid DB
     * instance ARN. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * >Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>. This doesn't apply to SQL Server or
     * RDS Custom, which don't support cross-Region replicas.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceDBInstanceIdentifier
     *        The identifier of the DB instance that will act as the source for the read replica. Each DB instance can
     *        have up to five read replicas.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier of an existing MySQL, MariaDB, Oracle, PostgreSQL, or SQL Server DB instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a DB instance that is a MySQL read replica only if the source is running MySQL 5.6 or later.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the limitations of Oracle read replicas, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica
     *        Limitations with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the limitations of SQL Server read replicas, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/SQLServer.ReadReplicas.Limitations.html">Read
     *        Replica Limitations with Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or later (9.4.7 and
     *        higher for cross-Region replication).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The specified DB instance must have automatic backups enabled, that is, its backup retention period must
     *        be greater than 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB instance is in the same Amazon Web Services Region as the read replica, specify a valid
     *        DB instance identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB instance is in a different Amazon Web Services Region from the read replica, specify a
     *        valid DB instance ARN. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *        >Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>. This doesn't apply to SQL
     *        Server or RDS Custom, which don't support cross-Region replicas.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        setSourceDBInstanceIdentifier(sourceDBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the read replica, for example db.m4.large. Not all DB instance classes are
     * available in all Amazon Web Services Regions, or for all database engines. For the full list of DB instance
     * classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The compute and memory capacity of the read replica, for example db.m4.large. Not all DB instance classes
     *        are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB
     *        instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *        Class</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        Default: Inherits from the source DB instance.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the read replica, for example db.m4.large. Not all DB instance classes are
     * available in all Amazon Web Services Regions, or for all database engines. For the full list of DB instance
     * classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance.
     * </p>
     * 
     * @return The compute and memory capacity of the read replica, for example db.m4.large. Not all DB instance classes
     *         are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB
     *         instance classes, and availability for your engine, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *         Class</a> in the <i>Amazon RDS User Guide</i>.</p>
     *         <p>
     *         Default: Inherits from the source DB instance.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the read replica, for example db.m4.large. Not all DB instance classes are
     * available in all Amazon Web Services Regions, or for all database engines. For the full list of DB instance
     * classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The compute and memory capacity of the read replica, for example db.m4.large. Not all DB instance classes
     *        are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB
     *        instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *        Class</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        Default: Inherits from the source DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The Availability Zone (AZ) where the read replica will be created.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's Amazon Web Services Region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone (AZ) where the read replica will be created.</p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone in the endpoint's Amazon Web Services Region.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1d</code>
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone (AZ) where the read replica will be created.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's Amazon Web Services Region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * 
     * @return The Availability Zone (AZ) where the read replica will be created.</p>
     *         <p>
     *         Default: A random, system-chosen Availability Zone in the endpoint's Amazon Web Services Region.
     *         </p>
     *         <p>
     *         Example: <code>us-east-1d</code>
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone (AZ) where the read replica will be created.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's Amazon Web Services Region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone (AZ) where the read replica will be created.</p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone in the endpoint's Amazon Web Services Region.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1d</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The port number that the DB instance uses for connections.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * 
     * @param port
     *        The port number that the DB instance uses for connections.</p>
     *        <p>
     *        Default: Inherits from the source DB instance
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number that the DB instance uses for connections.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * 
     * @return The port number that the DB instance uses for connections.</p>
     *         <p>
     *         Default: Inherits from the source DB instance
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code>
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number that the DB instance uses for connections.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * 
     * @param port
     *        The port number that the DB instance uses for connections.</p>
     *        <p>
     *        Default: Inherits from the source DB instance
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the read replica is in a Multi-AZ deployment.
     * </p>
     * <p>
     * You can create a read replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     * Availability Zone for failover support for the replica. Creating your read replica as a Multi-AZ DB instance is
     * independent of whether the source database is a Multi-AZ DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param multiAZ
     *        A value that indicates whether the read replica is in a Multi-AZ deployment.</p>
     *        <p>
     *        You can create a read replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     *        Availability Zone for failover support for the replica. Creating your read replica as a Multi-AZ DB
     *        instance is independent of whether the source database is a Multi-AZ DB instance.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether the read replica is in a Multi-AZ deployment.
     * </p>
     * <p>
     * You can create a read replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     * Availability Zone for failover support for the replica. Creating your read replica as a Multi-AZ DB instance is
     * independent of whether the source database is a Multi-AZ DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return A value that indicates whether the read replica is in a Multi-AZ deployment.</p>
     *         <p>
     *         You can create a read replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     *         Availability Zone for failover support for the replica. Creating your read replica as a Multi-AZ DB
     *         instance is independent of whether the source database is a Multi-AZ DB instance.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether the read replica is in a Multi-AZ deployment.
     * </p>
     * <p>
     * You can create a read replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     * Availability Zone for failover support for the replica. Creating your read replica as a Multi-AZ DB instance is
     * independent of whether the source database is a Multi-AZ DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param multiAZ
     *        A value that indicates whether the read replica is in a Multi-AZ deployment.</p>
     *        <p>
     *        You can create a read replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     *        Availability Zone for failover support for the replica. Creating your read replica as a Multi-AZ DB
     *        instance is independent of whether the source database is a Multi-AZ DB instance.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the read replica is in a Multi-AZ deployment.
     * </p>
     * <p>
     * You can create a read replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     * Availability Zone for failover support for the replica. Creating your read replica as a Multi-AZ DB instance is
     * independent of whether the source database is a Multi-AZ DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return A value that indicates whether the read replica is in a Multi-AZ deployment.</p>
     *         <p>
     *         You can create a read replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     *         Availability Zone for failover support for the replica. Creating your read replica as a Multi-AZ DB
     *         instance is independent of whether the source database is a Multi-AZ DB instance.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the read replica during the
     * maintenance window.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        A value that indicates whether minor engine upgrades are applied automatically to the read replica during
     *        the maintenance window.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Default: Inherits from the source DB instance
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the read replica during the
     * maintenance window.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * 
     * @return A value that indicates whether minor engine upgrades are applied automatically to the read replica during
     *         the maintenance window.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         Default: Inherits from the source DB instance
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the read replica during the
     * maintenance window.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        A value that indicates whether minor engine upgrades are applied automatically to the read replica during
     *        the maintenance window.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Default: Inherits from the source DB instance
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied automatically to the read replica during the
     * maintenance window.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * 
     * @return A value that indicates whether minor engine upgrades are applied automatically to the read replica during
     *         the maintenance window.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         Default: Inherits from the source DB instance
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     *        instance.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     * 
     * @return The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     *         instance.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The option group the DB instance is associated with. If omitted, the option group associated with the source
     * instance is used.
     * </p>
     * <note>
     * <p>
     * For SQL Server, you must use the option group associated with the source instance.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param optionGroupName
     *        The option group the DB instance is associated with. If omitted, the option group associated with the
     *        source instance is used.</p> <note>
     *        <p>
     *        For SQL Server, you must use the option group associated with the source instance.
     *        </p>
     *        </note>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The option group the DB instance is associated with. If omitted, the option group associated with the source
     * instance is used.
     * </p>
     * <note>
     * <p>
     * For SQL Server, you must use the option group associated with the source instance.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return The option group the DB instance is associated with. If omitted, the option group associated with the
     *         source instance is used.</p> <note>
     *         <p>
     *         For SQL Server, you must use the option group associated with the source instance.
     *         </p>
     *         </note>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The option group the DB instance is associated with. If omitted, the option group associated with the source
     * instance is used.
     * </p>
     * <note>
     * <p>
     * For SQL Server, you must use the option group associated with the source instance.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param optionGroupName
     *        The option group the DB instance is associated with. If omitted, the option group associated with the
     *        source instance is used.</p> <note>
     *        <p>
     *        For SQL Server, you must use the option group associated with the source instance.
     *        </p>
     *        </note>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then Amazon RDS uses the
     * <code>DBParameterGroup</code> of source DB instance for a same Region read replica, or the default
     * <code>DBParameterGroup</code> for the specified DB engine for a cross-Region read replica.
     * </p>
     * <p>
     * Specifying a parameter group for this operation is only supported for MySQL and Oracle DB instances. It isn't
     * supported for RDS Custom.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group to associate with this DB instance.</p>
     *        <p>
     *        If you do not specify a value for <code>DBParameterGroupName</code>, then Amazon RDS uses the
     *        <code>DBParameterGroup</code> of source DB instance for a same Region read replica, or the default
     *        <code>DBParameterGroup</code> for the specified DB engine for a cross-Region read replica.
     *        </p>
     *        <p>
     *        Specifying a parameter group for this operation is only supported for MySQL and Oracle DB instances. It
     *        isn't supported for RDS Custom.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     */

    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then Amazon RDS uses the
     * <code>DBParameterGroup</code> of source DB instance for a same Region read replica, or the default
     * <code>DBParameterGroup</code> for the specified DB engine for a cross-Region read replica.
     * </p>
     * <p>
     * Specifying a parameter group for this operation is only supported for MySQL and Oracle DB instances. It isn't
     * supported for RDS Custom.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the DB parameter group to associate with this DB instance.</p>
     *         <p>
     *         If you do not specify a value for <code>DBParameterGroupName</code>, then Amazon RDS uses the
     *         <code>DBParameterGroup</code> of source DB instance for a same Region read replica, or the default
     *         <code>DBParameterGroup</code> for the specified DB engine for a cross-Region read replica.
     *         </p>
     *         <p>
     *         Specifying a parameter group for this operation is only supported for MySQL and Oracle DB instances. It
     *         isn't supported for RDS Custom.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     */

    public String getDBParameterGroupName() {
        return this.dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then Amazon RDS uses the
     * <code>DBParameterGroup</code> of source DB instance for a same Region read replica, or the default
     * <code>DBParameterGroup</code> for the specified DB engine for a cross-Region read replica.
     * </p>
     * <p>
     * Specifying a parameter group for this operation is only supported for MySQL and Oracle DB instances. It isn't
     * supported for RDS Custom.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group to associate with this DB instance.</p>
     *        <p>
     *        If you do not specify a value for <code>DBParameterGroupName</code>, then Amazon RDS uses the
     *        <code>DBParameterGroup</code> of source DB instance for a same Region read replica, or the default
     *        <code>DBParameterGroup</code> for the specified DB engine for a cross-Region read replica.
     *        </p>
     *        <p>
     *        Specifying a parameter group for this operation is only supported for MySQL and Oracle DB instances. It
     *        isn't supported for RDS Custom.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withDBParameterGroupName(String dBParameterGroupName) {
        setDBParameterGroupName(dBParameterGroupName);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access isn't permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     * 
     * @param publiclyAccessible
     *        A value that indicates whether the DB instance is publicly accessible.</p>
     *        <p>
     *        When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *        IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *        from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *        group it uses. That public access isn't permitted if the security group assigned to the DB cluster doesn't
     *        permit it.
     *        </p>
     *        <p>
     *        When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that
     *        resolves to a private IP address.
     *        </p>
     *        <p>
     *        For more information, see <a>CreateDBInstance</a>.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access isn't permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     * 
     * @return A value that indicates whether the DB instance is publicly accessible.</p>
     *         <p>
     *         When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *         IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *         from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *         group it uses. That public access isn't permitted if the security group assigned to the DB cluster
     *         doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that
     *         resolves to a private IP address.
     *         </p>
     *         <p>
     *         For more information, see <a>CreateDBInstance</a>.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access isn't permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     * 
     * @param publiclyAccessible
     *        A value that indicates whether the DB instance is publicly accessible.</p>
     *        <p>
     *        When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *        IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *        from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *        group it uses. That public access isn't permitted if the security group assigned to the DB cluster doesn't
     *        permit it.
     *        </p>
     *        <p>
     *        When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that
     *        resolves to a private IP address.
     *        </p>
     *        <p>
     *        For more information, see <a>CreateDBInstance</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access isn't permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * For more information, see <a>CreateDBInstance</a>.
     * </p>
     * 
     * @return A value that indicates whether the DB instance is publicly accessible.</p>
     *         <p>
     *         When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *         IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *         from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *         group it uses. That public access isn't permitted if the security group assigned to the DB cluster
     *         doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB instance isn't publicly accessible, it is an internal DB instance with a DNS name that
     *         resolves to a private IP address.
     *         </p>
     *         <p>
     *         For more information, see <a>CreateDBInstance</a>.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
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

    public CreateDBInstanceReadReplicaRequest withTags(Tag... tags) {
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

    public CreateDBInstanceReadReplicaRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies a DB subnet group for the DB instance. The new DB instance is created in the VPC associated with the DB
     * subnet group. If no DB subnet group is specified, then the new DB instance isn't created in a VPC.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can only be specified if the source DB instance identifier specifies a DB instance in another Amazon Web Services
     * Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB subnet group must be in the same Amazon Web Services Region in which the operation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * All read replicas in one Amazon Web Services Region that are created from the same source DB instance must
     * either:&gt;
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify DB subnet groups from the same VPC. All these read replicas are created in the same VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not specify a DB subnet group. All these read replicas are created outside of any VPC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        Specifies a DB subnet group for the DB instance. The new DB instance is created in the VPC associated with
     *        the DB subnet group. If no DB subnet group is specified, then the new DB instance isn't created in a
     *        VPC.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can only be specified if the source DB instance identifier specifies a DB instance in another Amazon Web
     *        Services Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing DBSubnetGroup.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The specified DB subnet group must be in the same Amazon Web Services Region in which the operation is
     *        running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        All read replicas in one Amazon Web Services Region that are created from the same source DB instance must
     *        either:&gt;
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify DB subnet groups from the same VPC. All these read replicas are created in the same VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not specify a DB subnet group. All these read replicas are created outside of any VPC.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mydbsubnetgroup</code>
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * Specifies a DB subnet group for the DB instance. The new DB instance is created in the VPC associated with the DB
     * subnet group. If no DB subnet group is specified, then the new DB instance isn't created in a VPC.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can only be specified if the source DB instance identifier specifies a DB instance in another Amazon Web Services
     * Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB subnet group must be in the same Amazon Web Services Region in which the operation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * All read replicas in one Amazon Web Services Region that are created from the same source DB instance must
     * either:&gt;
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify DB subnet groups from the same VPC. All these read replicas are created in the same VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not specify a DB subnet group. All these read replicas are created outside of any VPC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * 
     * @return Specifies a DB subnet group for the DB instance. The new DB instance is created in the VPC associated
     *         with the DB subnet group. If no DB subnet group is specified, then the new DB instance isn't created in a
     *         VPC.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can only be specified if the source DB instance identifier specifies a DB instance in another Amazon Web
     *         Services Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If supplied, must match the name of an existing DBSubnetGroup.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The specified DB subnet group must be in the same Amazon Web Services Region in which the operation is
     *         running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         All read replicas in one Amazon Web Services Region that are created from the same source DB instance
     *         must either:&gt;
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specify DB subnet groups from the same VPC. All these read replicas are created in the same VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not specify a DB subnet group. All these read replicas are created outside of any VPC.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>mydbsubnetgroup</code>
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * Specifies a DB subnet group for the DB instance. The new DB instance is created in the VPC associated with the DB
     * subnet group. If no DB subnet group is specified, then the new DB instance isn't created in a VPC.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can only be specified if the source DB instance identifier specifies a DB instance in another Amazon Web Services
     * Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB subnet group must be in the same Amazon Web Services Region in which the operation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * All read replicas in one Amazon Web Services Region that are created from the same source DB instance must
     * either:&gt;
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify DB subnet groups from the same VPC. All these read replicas are created in the same VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not specify a DB subnet group. All these read replicas are created outside of any VPC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        Specifies a DB subnet group for the DB instance. The new DB instance is created in the VPC associated with
     *        the DB subnet group. If no DB subnet group is specified, then the new DB instance isn't created in a
     *        VPC.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can only be specified if the source DB instance identifier specifies a DB instance in another Amazon Web
     *        Services Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing DBSubnetGroup.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The specified DB subnet group must be in the same Amazon Web Services Region in which the operation is
     *        running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        All read replicas in one Amazon Web Services Region that are created from the same source DB instance must
     *        either:&gt;
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify DB subnet groups from the same VPC. All these read replicas are created in the same VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not specify a DB subnet group. All these read replicas are created outside of any VPC.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mydbsubnetgroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * A list of Amazon EC2 VPC security groups to associate with the read replica.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * 
     * @return A list of Amazon EC2 VPC security groups to associate with the read replica.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
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
     * A list of Amazon EC2 VPC security groups to associate with the read replica.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of Amazon EC2 VPC security groups to associate with the read replica.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
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
     * A list of Amazon EC2 VPC security groups to associate with the read replica.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
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
     *        A list of Amazon EC2 VPC security groups to associate with the read replica.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of Amazon EC2 VPC security groups to associate with the read replica.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of Amazon EC2 VPC security groups to associate with the read replica.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the read replica.
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
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the read replica.</p>
     *        <p>
     *        Valid values: <code>gp2 | gp3 | io1 | standard</code>
     *        </p>
     *        <p>
     *        If you specify <code>io1</code> or <code>gp3</code>, you must also include a value for the
     *        <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the read replica.
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
     * 
     * @return Specifies the storage type to be associated with the read replica.</p>
     *         <p>
     *         Valid values: <code>gp2 | gp3 | io1 | standard</code>
     *         </p>
     *         <p>
     *         If you specify <code>io1</code> or <code>gp3</code>, you must also include a value for the
     *         <code>Iops</code> parameter.
     *         </p>
     *         <p>
     *         Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the read replica.
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
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the read replica.</p>
     *        <p>
     *        Valid values: <code>gp2 | gp3 | io1 | standard</code>
     *        </p>
     *        <p>
     *        If you specify <code>io1</code> or <code>gp3</code>, you must also include a value for the
     *        <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>gp2</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the read replica to snapshots of the read replica. By
     * default, tags are not copied.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the read replica to snapshots of the read replica. By
     *        default, tags are not copied.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the read replica to snapshots of the read replica. By
     * default, tags are not copied.
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the read replica to snapshots of the read replica.
     *         By default, tags are not copied.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the read replica to snapshots of the read replica. By
     * default, tags are not copied.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the read replica to snapshots of the read replica. By
     *        default, tags are not copied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the read replica to snapshots of the read replica. By
     * default, tags are not copied.
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the read replica to snapshots of the read replica.
     *         By default, tags are not copied.
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the read replica. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
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
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the read
     *        replica. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to
     *        a value other than 0.
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
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the read replica. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * 
     * @return The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the read
     *         replica. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *         <p>
     *         If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to
     *         a value other than 0.
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
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the read replica. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
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
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the read
     *        replica. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to
     *        a value other than 0.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withMonitoringInterval(Integer monitoringInterval) {
        setMonitoringInterval(monitoringInterval);
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go
     * to <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.
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
     *        role, go to <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole"
     *        >To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.</p>
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
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go
     * to <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.
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
     *         monitoring role, go to <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole"
     *         >To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.</p>
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
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go
     * to <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.
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
     *        role, go to <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole"
     *        >To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     *        <code>MonitoringRoleArn</code> value.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withMonitoringRoleArn(String monitoringRoleArn) {
        setMonitoringRoleArn(monitoringRoleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted read replica.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <p>
     * If you create an encrypted read replica in the same Amazon Web Services Region as the source DB instance, then do
     * not specify a value for this parameter. A read replica in the same Amazon Web Services Region is always encrypted
     * with the same KMS key as the source DB instance.
     * </p>
     * <p>
     * If you create an encrypted read replica in a different Amazon Web Services Region, then you must specify a KMS
     * key identifier for the destination Amazon Web Services Region. KMS keys are specific to the Amazon Web Services
     * Region that they are created in, and you can't use KMS keys from one Amazon Web Services Region in another Amazon
     * Web Services Region.
     * </p>
     * <p>
     * You can't create an encrypted read replica from an unencrypted DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom, which uses the same KMS key as the primary replica.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier for an encrypted read replica.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key.
     *        </p>
     *        <p>
     *        If you create an encrypted read replica in the same Amazon Web Services Region as the source DB instance,
     *        then do not specify a value for this parameter. A read replica in the same Amazon Web Services Region is
     *        always encrypted with the same KMS key as the source DB instance.
     *        </p>
     *        <p>
     *        If you create an encrypted read replica in a different Amazon Web Services Region, then you must specify a
     *        KMS key identifier for the destination Amazon Web Services Region. KMS keys are specific to the Amazon Web
     *        Services Region that they are created in, and you can't use KMS keys from one Amazon Web Services Region
     *        in another Amazon Web Services Region.
     *        </p>
     *        <p>
     *        You can't create an encrypted read replica from an unencrypted DB instance.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom, which uses the same KMS key as the primary replica.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted read replica.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <p>
     * If you create an encrypted read replica in the same Amazon Web Services Region as the source DB instance, then do
     * not specify a value for this parameter. A read replica in the same Amazon Web Services Region is always encrypted
     * with the same KMS key as the source DB instance.
     * </p>
     * <p>
     * If you create an encrypted read replica in a different Amazon Web Services Region, then you must specify a KMS
     * key identifier for the destination Amazon Web Services Region. KMS keys are specific to the Amazon Web Services
     * Region that they are created in, and you can't use KMS keys from one Amazon Web Services Region in another Amazon
     * Web Services Region.
     * </p>
     * <p>
     * You can't create an encrypted read replica from an unencrypted DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom, which uses the same KMS key as the primary replica.
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier for an encrypted read replica.</p>
     *         <p>
     *         The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *         key.
     *         </p>
     *         <p>
     *         If you create an encrypted read replica in the same Amazon Web Services Region as the source DB instance,
     *         then do not specify a value for this parameter. A read replica in the same Amazon Web Services Region is
     *         always encrypted with the same KMS key as the source DB instance.
     *         </p>
     *         <p>
     *         If you create an encrypted read replica in a different Amazon Web Services Region, then you must specify
     *         a KMS key identifier for the destination Amazon Web Services Region. KMS keys are specific to the Amazon
     *         Web Services Region that they are created in, and you can't use KMS keys from one Amazon Web Services
     *         Region in another Amazon Web Services Region.
     *         </p>
     *         <p>
     *         You can't create an encrypted read replica from an unencrypted DB instance.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom, which uses the same KMS key as the primary replica.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for an encrypted read replica.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
     * </p>
     * <p>
     * If you create an encrypted read replica in the same Amazon Web Services Region as the source DB instance, then do
     * not specify a value for this parameter. A read replica in the same Amazon Web Services Region is always encrypted
     * with the same KMS key as the source DB instance.
     * </p>
     * <p>
     * If you create an encrypted read replica in a different Amazon Web Services Region, then you must specify a KMS
     * key identifier for the destination Amazon Web Services Region. KMS keys are specific to the Amazon Web Services
     * Region that they are created in, and you can't use KMS keys from one Amazon Web Services Region in another Amazon
     * Web Services Region.
     * </p>
     * <p>
     * You can't create an encrypted read replica from an unencrypted DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom, which uses the same KMS key as the primary replica.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier for an encrypted read replica.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key.
     *        </p>
     *        <p>
     *        If you create an encrypted read replica in the same Amazon Web Services Region as the source DB instance,
     *        then do not specify a value for this parameter. A read replica in the same Amazon Web Services Region is
     *        always encrypted with the same KMS key as the source DB instance.
     *        </p>
     *        <p>
     *        If you create an encrypted read replica in a different Amazon Web Services Region, then you must specify a
     *        KMS key identifier for the destination Amazon Web Services Region. KMS keys are specific to the Amazon Web
     *        Services Region that they are created in, and you can't use KMS keys from one Amazon Web Services Region
     *        in another Amazon Web Services Region.
     *        </p>
     *        <p>
     *        You can't create an encrypted read replica from an unencrypted DB instance.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom, which uses the same KMS key as the primary replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * When you are creating a read replica from one Amazon Web Services GovCloud (US) Region to another or from one
     * China Amazon Web Services Region to another, the URL that contains a Signature Version 4 signed request for the
     * <code>CreateDBInstanceReadReplica</code> API operation in the source Amazon Web Services Region that contains the
     * source DB instance.
     * </p>
     * <p>
     * This setting applies only to Amazon Web Services GovCloud (US) Regions and China Amazon Web Services Regions.
     * It's ignored in other Amazon Web Services Regions.
     * </p>
     * <p>
     * You must specify this parameter when you create an encrypted read replica from another Amazon Web Services Region
     * by using the Amazon RDS API. Don't specify <code>PreSignedUrl</code> when you are creating an encrypted read
     * replica in the same Amazon Web Services Region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API operation that can
     * run in the source Amazon Web Services Region that contains the encrypted source DB instance. The presigned URL
     * request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The Amazon Web Services Region that the encrypted read replica is created in.
     * This Amazon Web Services Region is the same one where the <code>CreateDBInstanceReadReplica</code> operation is
     * called that contains this presigned URL.
     * </p>
     * <p>
     * For example, if you create an encrypted DB instance in the us-west-1 Amazon Web Services Region, from a source DB
     * instance in the us-east-2 Amazon Web Services Region, then you call the <code>CreateDBInstanceReadReplica</code>
     * operation in the us-east-1 Amazon Web Services Region and provide a presigned URL that contains a call to the
     * <code>CreateDBInstanceReadReplica</code> operation in the us-west-2 Amazon Web Services Region. For this example,
     * the <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the read replica in the destination
     * Amazon Web Services Region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code>
     * operation that is called in the destination Amazon Web Services Region, and the operation contained in the
     * presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted DB instance to be
     * replicated. This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web Services
     * Region. For example, if you are creating an encrypted read replica from a DB instance in the us-west-2 Amazon Web
     * Services Region, then your <code>SourceDBInstanceIdentifier</code> looks like the following example:
     * <code>arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests:
     * Using Query Parameters (Amazon Web Services Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     * Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a presigned URL that is a valid request for the operation that can run in
     * the source Amazon Web Services Region.
     * </p>
     * <p>
     * <code>SourceRegion</code> isn't supported for SQL Server, because Amazon RDS for SQL Server doesn't support
     * cross-Region read replicas.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param preSignedUrl
     *        When you are creating a read replica from one Amazon Web Services GovCloud (US) Region to another or from
     *        one China Amazon Web Services Region to another, the URL that contains a Signature Version 4 signed
     *        request for the <code>CreateDBInstanceReadReplica</code> API operation in the source Amazon Web Services
     *        Region that contains the source DB instance.</p>
     *        <p>
     *        This setting applies only to Amazon Web Services GovCloud (US) Regions and China Amazon Web Services
     *        Regions. It's ignored in other Amazon Web Services Regions.
     *        </p>
     *        <p>
     *        You must specify this parameter when you create an encrypted read replica from another Amazon Web Services
     *        Region by using the Amazon RDS API. Don't specify <code>PreSignedUrl</code> when you are creating an
     *        encrypted read replica in the same Amazon Web Services Region.
     *        </p>
     *        <p>
     *        The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API operation
     *        that can run in the source Amazon Web Services Region that contains the encrypted source DB instance. The
     *        presigned URL request must contain the following parameter values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DestinationRegion</code> - The Amazon Web Services Region that the encrypted read replica is created
     *        in. This Amazon Web Services Region is the same one where the <code>CreateDBInstanceReadReplica</code>
     *        operation is called that contains this presigned URL.
     *        </p>
     *        <p>
     *        For example, if you create an encrypted DB instance in the us-west-1 Amazon Web Services Region, from a
     *        source DB instance in the us-east-2 Amazon Web Services Region, then you call the
     *        <code>CreateDBInstanceReadReplica</code> operation in the us-east-1 Amazon Web Services Region and provide
     *        a presigned URL that contains a call to the <code>CreateDBInstanceReadReplica</code> operation in the
     *        us-west-2 Amazon Web Services Region. For this example, the <code>DestinationRegion</code> in the
     *        presigned URL must be set to the us-east-1 Amazon Web Services Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the read replica in the
     *        destination Amazon Web Services Region. This is the same identifier for both the
     *        <code>CreateDBInstanceReadReplica</code> operation that is called in the destination Amazon Web Services
     *        Region, and the operation contained in the presigned URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted DB instance to be
     *        replicated. This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web
     *        Services Region. For example, if you are creating an encrypted read replica from a DB instance in the
     *        us-west-2 Amazon Web Services Region, then your <code>SourceDBInstanceIdentifier</code> looks like the
     *        following example: <code>arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-20161115</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn how to generate a Signature Version 4 signed request, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *        Requests: Using Query Parameters (Amazon Web Services Signature Version 4)</a> and <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     *        Process</a>.
     *        </p>
     *        <note>
     *        <p>
     *        If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     *        <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually.
     *        Specifying <code>SourceRegion</code> autogenerates a presigned URL that is a valid request for the
     *        operation that can run in the source Amazon Web Services Region.
     *        </p>
     *        <p>
     *        <code>SourceRegion</code> isn't supported for SQL Server, because Amazon RDS for SQL Server doesn't
     *        support cross-Region read replicas.
     *        </p>
     *        </note>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     */

    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * <p>
     * When you are creating a read replica from one Amazon Web Services GovCloud (US) Region to another or from one
     * China Amazon Web Services Region to another, the URL that contains a Signature Version 4 signed request for the
     * <code>CreateDBInstanceReadReplica</code> API operation in the source Amazon Web Services Region that contains the
     * source DB instance.
     * </p>
     * <p>
     * This setting applies only to Amazon Web Services GovCloud (US) Regions and China Amazon Web Services Regions.
     * It's ignored in other Amazon Web Services Regions.
     * </p>
     * <p>
     * You must specify this parameter when you create an encrypted read replica from another Amazon Web Services Region
     * by using the Amazon RDS API. Don't specify <code>PreSignedUrl</code> when you are creating an encrypted read
     * replica in the same Amazon Web Services Region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API operation that can
     * run in the source Amazon Web Services Region that contains the encrypted source DB instance. The presigned URL
     * request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The Amazon Web Services Region that the encrypted read replica is created in.
     * This Amazon Web Services Region is the same one where the <code>CreateDBInstanceReadReplica</code> operation is
     * called that contains this presigned URL.
     * </p>
     * <p>
     * For example, if you create an encrypted DB instance in the us-west-1 Amazon Web Services Region, from a source DB
     * instance in the us-east-2 Amazon Web Services Region, then you call the <code>CreateDBInstanceReadReplica</code>
     * operation in the us-east-1 Amazon Web Services Region and provide a presigned URL that contains a call to the
     * <code>CreateDBInstanceReadReplica</code> operation in the us-west-2 Amazon Web Services Region. For this example,
     * the <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the read replica in the destination
     * Amazon Web Services Region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code>
     * operation that is called in the destination Amazon Web Services Region, and the operation contained in the
     * presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted DB instance to be
     * replicated. This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web Services
     * Region. For example, if you are creating an encrypted read replica from a DB instance in the us-west-2 Amazon Web
     * Services Region, then your <code>SourceDBInstanceIdentifier</code> looks like the following example:
     * <code>arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests:
     * Using Query Parameters (Amazon Web Services Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     * Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a presigned URL that is a valid request for the operation that can run in
     * the source Amazon Web Services Region.
     * </p>
     * <p>
     * <code>SourceRegion</code> isn't supported for SQL Server, because Amazon RDS for SQL Server doesn't support
     * cross-Region read replicas.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return When you are creating a read replica from one Amazon Web Services GovCloud (US) Region to another or from
     *         one China Amazon Web Services Region to another, the URL that contains a Signature Version 4 signed
     *         request for the <code>CreateDBInstanceReadReplica</code> API operation in the source Amazon Web Services
     *         Region that contains the source DB instance.</p>
     *         <p>
     *         This setting applies only to Amazon Web Services GovCloud (US) Regions and China Amazon Web Services
     *         Regions. It's ignored in other Amazon Web Services Regions.
     *         </p>
     *         <p>
     *         You must specify this parameter when you create an encrypted read replica from another Amazon Web
     *         Services Region by using the Amazon RDS API. Don't specify <code>PreSignedUrl</code> when you are
     *         creating an encrypted read replica in the same Amazon Web Services Region.
     *         </p>
     *         <p>
     *         The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API operation
     *         that can run in the source Amazon Web Services Region that contains the encrypted source DB instance. The
     *         presigned URL request must contain the following parameter values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DestinationRegion</code> - The Amazon Web Services Region that the encrypted read replica is
     *         created in. This Amazon Web Services Region is the same one where the
     *         <code>CreateDBInstanceReadReplica</code> operation is called that contains this presigned URL.
     *         </p>
     *         <p>
     *         For example, if you create an encrypted DB instance in the us-west-1 Amazon Web Services Region, from a
     *         source DB instance in the us-east-2 Amazon Web Services Region, then you call the
     *         <code>CreateDBInstanceReadReplica</code> operation in the us-east-1 Amazon Web Services Region and
     *         provide a presigned URL that contains a call to the <code>CreateDBInstanceReadReplica</code> operation in
     *         the us-west-2 Amazon Web Services Region. For this example, the <code>DestinationRegion</code> in the
     *         presigned URL must be set to the us-east-1 Amazon Web Services Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the read replica in the
     *         destination Amazon Web Services Region. This is the same identifier for both the
     *         <code>CreateDBInstanceReadReplica</code> operation that is called in the destination Amazon Web Services
     *         Region, and the operation contained in the presigned URL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted DB instance to be
     *         replicated. This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web
     *         Services Region. For example, if you are creating an encrypted read replica from a DB instance in the
     *         us-west-2 Amazon Web Services Region, then your <code>SourceDBInstanceIdentifier</code> looks like the
     *         following example: <code>arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-20161115</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To learn how to generate a Signature Version 4 signed request, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *         Requests: Using Query Parameters (Amazon Web Services Signature Version 4)</a> and <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     *         Process</a>.
     *         </p>
     *         <note>
     *         <p>
     *         If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code>
     *         (or <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually.
     *         Specifying <code>SourceRegion</code> autogenerates a presigned URL that is a valid request for the
     *         operation that can run in the source Amazon Web Services Region.
     *         </p>
     *         <p>
     *         <code>SourceRegion</code> isn't supported for SQL Server, because Amazon RDS for SQL Server doesn't
     *         support cross-Region read replicas.
     *         </p>
     *         </note>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public String getPreSignedUrl() {
        return this.preSignedUrl;
    }

    /**
     * <p>
     * When you are creating a read replica from one Amazon Web Services GovCloud (US) Region to another or from one
     * China Amazon Web Services Region to another, the URL that contains a Signature Version 4 signed request for the
     * <code>CreateDBInstanceReadReplica</code> API operation in the source Amazon Web Services Region that contains the
     * source DB instance.
     * </p>
     * <p>
     * This setting applies only to Amazon Web Services GovCloud (US) Regions and China Amazon Web Services Regions.
     * It's ignored in other Amazon Web Services Regions.
     * </p>
     * <p>
     * You must specify this parameter when you create an encrypted read replica from another Amazon Web Services Region
     * by using the Amazon RDS API. Don't specify <code>PreSignedUrl</code> when you are creating an encrypted read
     * replica in the same Amazon Web Services Region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API operation that can
     * run in the source Amazon Web Services Region that contains the encrypted source DB instance. The presigned URL
     * request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The Amazon Web Services Region that the encrypted read replica is created in.
     * This Amazon Web Services Region is the same one where the <code>CreateDBInstanceReadReplica</code> operation is
     * called that contains this presigned URL.
     * </p>
     * <p>
     * For example, if you create an encrypted DB instance in the us-west-1 Amazon Web Services Region, from a source DB
     * instance in the us-east-2 Amazon Web Services Region, then you call the <code>CreateDBInstanceReadReplica</code>
     * operation in the us-east-1 Amazon Web Services Region and provide a presigned URL that contains a call to the
     * <code>CreateDBInstanceReadReplica</code> operation in the us-west-2 Amazon Web Services Region. For this example,
     * the <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 Amazon Web Services Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the read replica in the destination
     * Amazon Web Services Region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code>
     * operation that is called in the destination Amazon Web Services Region, and the operation contained in the
     * presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted DB instance to be
     * replicated. This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web Services
     * Region. For example, if you are creating an encrypted read replica from a DB instance in the us-west-2 Amazon Web
     * Services Region, then your <code>SourceDBInstanceIdentifier</code> looks like the following example:
     * <code>arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests:
     * Using Query Parameters (Amazon Web Services Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     * Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     * <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a presigned URL that is a valid request for the operation that can run in
     * the source Amazon Web Services Region.
     * </p>
     * <p>
     * <code>SourceRegion</code> isn't supported for SQL Server, because Amazon RDS for SQL Server doesn't support
     * cross-Region read replicas.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param preSignedUrl
     *        When you are creating a read replica from one Amazon Web Services GovCloud (US) Region to another or from
     *        one China Amazon Web Services Region to another, the URL that contains a Signature Version 4 signed
     *        request for the <code>CreateDBInstanceReadReplica</code> API operation in the source Amazon Web Services
     *        Region that contains the source DB instance.</p>
     *        <p>
     *        This setting applies only to Amazon Web Services GovCloud (US) Regions and China Amazon Web Services
     *        Regions. It's ignored in other Amazon Web Services Regions.
     *        </p>
     *        <p>
     *        You must specify this parameter when you create an encrypted read replica from another Amazon Web Services
     *        Region by using the Amazon RDS API. Don't specify <code>PreSignedUrl</code> when you are creating an
     *        encrypted read replica in the same Amazon Web Services Region.
     *        </p>
     *        <p>
     *        The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API operation
     *        that can run in the source Amazon Web Services Region that contains the encrypted source DB instance. The
     *        presigned URL request must contain the following parameter values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DestinationRegion</code> - The Amazon Web Services Region that the encrypted read replica is created
     *        in. This Amazon Web Services Region is the same one where the <code>CreateDBInstanceReadReplica</code>
     *        operation is called that contains this presigned URL.
     *        </p>
     *        <p>
     *        For example, if you create an encrypted DB instance in the us-west-1 Amazon Web Services Region, from a
     *        source DB instance in the us-east-2 Amazon Web Services Region, then you call the
     *        <code>CreateDBInstanceReadReplica</code> operation in the us-east-1 Amazon Web Services Region and provide
     *        a presigned URL that contains a call to the <code>CreateDBInstanceReadReplica</code> operation in the
     *        us-west-2 Amazon Web Services Region. For this example, the <code>DestinationRegion</code> in the
     *        presigned URL must be set to the us-east-1 Amazon Web Services Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the read replica in the
     *        destination Amazon Web Services Region. This is the same identifier for both the
     *        <code>CreateDBInstanceReadReplica</code> operation that is called in the destination Amazon Web Services
     *        Region, and the operation contained in the presigned URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted DB instance to be
     *        replicated. This identifier must be in the Amazon Resource Name (ARN) format for the source Amazon Web
     *        Services Region. For example, if you are creating an encrypted read replica from a DB instance in the
     *        us-west-2 Amazon Web Services Region, then your <code>SourceDBInstanceIdentifier</code> looks like the
     *        following example: <code>arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-20161115</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn how to generate a Signature Version 4 signed request, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *        Requests: Using Query Parameters (Amazon Web Services Signature Version 4)</a> and <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     *        Process</a>.
     *        </p>
     *        <note>
     *        <p>
     *        If you are using an Amazon Web Services SDK tool or the CLI, you can specify <code>SourceRegion</code> (or
     *        <code>--source-region</code> for the CLI) instead of specifying <code>PreSignedUrl</code> manually.
     *        Specifying <code>SourceRegion</code> autogenerates a presigned URL that is a valid request for the
     *        operation that can run in the source Amazon Web Services Region.
     *        </p>
     *        <p>
     *        <code>SourceRegion</code> isn't supported for SQL Server, because Amazon RDS for SQL Server doesn't
     *        support cross-Region read replicas.
     *        </p>
     *        </note>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withPreSignedUrl(String preSignedUrl) {
        setPreSignedUrl(preSignedUrl);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *        (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *        <p>
     *        For more information about IAM database authentication, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *        Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
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
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *         (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *         <p>
     *         For more information about IAM database authentication, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *         Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
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
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *        (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *        <p>
     *        For more information about IAM database authentication, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *        Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        setEnableIAMDatabaseAuthentication(enableIAMDatabaseAuthentication);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *         (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *         <p>
     *         For more information about IAM database authentication, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *         Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public Boolean isEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the read replica.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param enablePerformanceInsights
     *        A value that indicates whether to enable Performance Insights for the read replica.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *        Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     */

    public void setEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        this.enablePerformanceInsights = enablePerformanceInsights;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the read replica.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return A value that indicates whether to enable Performance Insights for the read replica.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *         Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public Boolean getEnablePerformanceInsights() {
        return this.enablePerformanceInsights;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the read replica.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param enablePerformanceInsights
     *        A value that indicates whether to enable Performance Insights for the read replica.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *        Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        setEnablePerformanceInsights(enablePerformanceInsights);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable Performance Insights for the read replica.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return A value that indicates whether to enable Performance Insights for the read replica.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *         Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
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

    public CreateDBInstanceReadReplicaRequest withPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
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

    public CreateDBInstanceReadReplicaRequest withPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
        setPerformanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The list of logs that the new DB instance is to export to CloudWatch Logs. The values in the list depend on the
     * DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return The list of logs that the new DB instance is to export to CloudWatch Logs. The values in the list depend
     *         on the DB engine being used. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon RDS User Guide</i>.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public java.util.List<String> getEnableCloudwatchLogsExports() {
        if (enableCloudwatchLogsExports == null) {
            enableCloudwatchLogsExports = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return enableCloudwatchLogsExports;
    }

    /**
     * <p>
     * The list of logs that the new DB instance is to export to CloudWatch Logs. The values in the list depend on the
     * DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the new DB instance is to export to CloudWatch Logs. The values in the list depend
     *        on the DB engine being used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
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
     * The list of logs that the new DB instance is to export to CloudWatch Logs. The values in the list depend on the
     * DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnableCloudwatchLogsExports(java.util.Collection)} or
     * {@link #withEnableCloudwatchLogsExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the new DB instance is to export to CloudWatch Logs. The values in the list depend
     *        on the DB engine being used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withEnableCloudwatchLogsExports(String... enableCloudwatchLogsExports) {
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
     * The list of logs that the new DB instance is to export to CloudWatch Logs. The values in the list depend on the
     * DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the new DB instance is to export to CloudWatch Logs. The values in the list depend
     *        on the DB engine being used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
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
     * 
     * @return The number of CPU cores and the number of threads per core for the DB instance class of the DB
     *         instance.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
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
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB
     *        instance.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withProcessorFeatures(ProcessorFeature... processorFeatures) {
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
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB
     *        instance.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param useDefaultProcessorFeatures
     *        A value that indicates whether the DB instance class of the DB instance uses its default processor
     *        features.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     */

    public void setUseDefaultProcessorFeatures(Boolean useDefaultProcessorFeatures) {
        this.useDefaultProcessorFeatures = useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return A value that indicates whether the DB instance class of the DB instance uses its default processor
     *         features.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public Boolean getUseDefaultProcessorFeatures() {
        return this.useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param useDefaultProcessorFeatures
     *        A value that indicates whether the DB instance class of the DB instance uses its default processor
     *        features.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withUseDefaultProcessorFeatures(Boolean useDefaultProcessorFeatures) {
        setUseDefaultProcessorFeatures(useDefaultProcessorFeatures);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return A value that indicates whether the DB instance class of the DB instance uses its default processor
     *         features.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public Boolean isUseDefaultProcessorFeatures() {
        return this.useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance has deletion protection enabled. The database can't be deleted
     * when deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB instance has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection isn't enabled. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *        Instance</a>.
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
     * 
     * @return A value that indicates whether the DB instance has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection isn't enabled. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *         Instance</a>.
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
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB instance has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection isn't enabled. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *        Instance</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withDeletionProtection(Boolean deletionProtection) {
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
     * 
     * @return A value that indicates whether the DB instance has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection isn't enabled. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *         Instance</a>.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
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
     * 
     * @return Specify the name of the IAM role to be used when making API calls to the Directory Service.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
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
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withDomainIAMRoleName(String domainIAMRoleName) {
        setDomainIAMRoleName(domainIAMRoleName);
        return this;
    }

    /**
     * <p>
     * The open mode of the replica database: mounted or read-only.
     * </p>
     * <note>
     * <p>
     * This parameter is only supported for Oracle DB instances.
     * </p>
     * </note>
     * <p>
     * Mounted DB replicas are included in Oracle Database Enterprise Edition. The main use case for mounted replicas is
     * cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the
     * mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload.
     * </p>
     * <p>
     * You can create a combination of mounted and read-only DB replicas for the same primary DB instance. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For RDS Custom, you must specify this parameter and set it to <code>mounted</code>. The value won't be set by
     * default. After replica creation, you can manage the open mode manually.
     * </p>
     * 
     * @param replicaMode
     *        The open mode of the replica database: mounted or read-only.</p> <note>
     *        <p>
     *        This parameter is only supported for Oracle DB instances.
     *        </p>
     *        </note>
     *        <p>
     *        Mounted DB replicas are included in Oracle Database Enterprise Edition. The main use case for mounted
     *        replicas is cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit
     *        information to the mounted replica. Because it doesn't accept user connections, a mounted replica can't
     *        serve a read-only workload.
     *        </p>
     *        <p>
     *        You can create a combination of mounted and read-only DB replicas for the same primary DB instance. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with
     *        Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        For RDS Custom, you must specify this parameter and set it to <code>mounted</code>. The value won't be set
     *        by default. After replica creation, you can manage the open mode manually.
     * @see ReplicaMode
     */

    public void setReplicaMode(String replicaMode) {
        this.replicaMode = replicaMode;
    }

    /**
     * <p>
     * The open mode of the replica database: mounted or read-only.
     * </p>
     * <note>
     * <p>
     * This parameter is only supported for Oracle DB instances.
     * </p>
     * </note>
     * <p>
     * Mounted DB replicas are included in Oracle Database Enterprise Edition. The main use case for mounted replicas is
     * cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the
     * mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload.
     * </p>
     * <p>
     * You can create a combination of mounted and read-only DB replicas for the same primary DB instance. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For RDS Custom, you must specify this parameter and set it to <code>mounted</code>. The value won't be set by
     * default. After replica creation, you can manage the open mode manually.
     * </p>
     * 
     * @return The open mode of the replica database: mounted or read-only.</p> <note>
     *         <p>
     *         This parameter is only supported for Oracle DB instances.
     *         </p>
     *         </note>
     *         <p>
     *         Mounted DB replicas are included in Oracle Database Enterprise Edition. The main use case for mounted
     *         replicas is cross-Region disaster recovery. The primary database doesn't use Active Data Guard to
     *         transmit information to the mounted replica. Because it doesn't accept user connections, a mounted
     *         replica can't serve a read-only workload.
     *         </p>
     *         <p>
     *         You can create a combination of mounted and read-only DB replicas for the same primary DB instance. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with
     *         Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         For RDS Custom, you must specify this parameter and set it to <code>mounted</code>. The value won't be
     *         set by default. After replica creation, you can manage the open mode manually.
     * @see ReplicaMode
     */

    public String getReplicaMode() {
        return this.replicaMode;
    }

    /**
     * <p>
     * The open mode of the replica database: mounted or read-only.
     * </p>
     * <note>
     * <p>
     * This parameter is only supported for Oracle DB instances.
     * </p>
     * </note>
     * <p>
     * Mounted DB replicas are included in Oracle Database Enterprise Edition. The main use case for mounted replicas is
     * cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the
     * mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload.
     * </p>
     * <p>
     * You can create a combination of mounted and read-only DB replicas for the same primary DB instance. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For RDS Custom, you must specify this parameter and set it to <code>mounted</code>. The value won't be set by
     * default. After replica creation, you can manage the open mode manually.
     * </p>
     * 
     * @param replicaMode
     *        The open mode of the replica database: mounted or read-only.</p> <note>
     *        <p>
     *        This parameter is only supported for Oracle DB instances.
     *        </p>
     *        </note>
     *        <p>
     *        Mounted DB replicas are included in Oracle Database Enterprise Edition. The main use case for mounted
     *        replicas is cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit
     *        information to the mounted replica. Because it doesn't accept user connections, a mounted replica can't
     *        serve a read-only workload.
     *        </p>
     *        <p>
     *        You can create a combination of mounted and read-only DB replicas for the same primary DB instance. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with
     *        Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        For RDS Custom, you must specify this parameter and set it to <code>mounted</code>. The value won't be set
     *        by default. After replica creation, you can manage the open mode manually.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaMode
     */

    public CreateDBInstanceReadReplicaRequest withReplicaMode(String replicaMode) {
        setReplicaMode(replicaMode);
        return this;
    }

    /**
     * <p>
     * The open mode of the replica database: mounted or read-only.
     * </p>
     * <note>
     * <p>
     * This parameter is only supported for Oracle DB instances.
     * </p>
     * </note>
     * <p>
     * Mounted DB replicas are included in Oracle Database Enterprise Edition. The main use case for mounted replicas is
     * cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the
     * mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload.
     * </p>
     * <p>
     * You can create a combination of mounted and read-only DB replicas for the same primary DB instance. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For RDS Custom, you must specify this parameter and set it to <code>mounted</code>. The value won't be set by
     * default. After replica creation, you can manage the open mode manually.
     * </p>
     * 
     * @param replicaMode
     *        The open mode of the replica database: mounted or read-only.</p> <note>
     *        <p>
     *        This parameter is only supported for Oracle DB instances.
     *        </p>
     *        </note>
     *        <p>
     *        Mounted DB replicas are included in Oracle Database Enterprise Edition. The main use case for mounted
     *        replicas is cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit
     *        information to the mounted replica. Because it doesn't accept user connections, a mounted replica can't
     *        serve a read-only workload.
     *        </p>
     *        <p>
     *        You can create a combination of mounted and read-only DB replicas for the same primary DB instance. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with
     *        Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        For RDS Custom, you must specify this parameter and set it to <code>mounted</code>. The value won't be set
     *        by default. After replica creation, you can manage the open mode manually.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaMode
     */

    public CreateDBInstanceReadReplicaRequest withReplicaMode(ReplicaMode replicaMode) {
        this.replicaMode = replicaMode.toString();
        return this;
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
     * 
     * @param maxAllocatedStorage
     *        The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the DB
     *        instance.</p>
     *        <p>
     *        For more information about this setting, including limitations that apply to it, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling"
     *        > Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User
     *        Guide</i>.
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
     * 
     * @return The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the DB
     *         instance.</p>
     *         <p>
     *         For more information about this setting, including limitations that apply to it, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling"
     *         > Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User
     *         Guide</i>.
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
     * 
     * @param maxAllocatedStorage
     *        The upper limit in gibibytes (GiB) to which Amazon RDS can automatically scale the storage of the DB
     *        instance.</p>
     *        <p>
     *        For more information about this setting, including limitations that apply to it, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PIOPS.StorageTypes.html#USER_PIOPS.Autoscaling"
     *        > Managing capacity automatically with Amazon RDS storage autoscaling</a> in the <i>Amazon RDS User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withMaxAllocatedStorage(Integer maxAllocatedStorage) {
        setMaxAllocatedStorage(maxAllocatedStorage);
        return this;
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

    public CreateDBInstanceReadReplicaRequest withCustomIamInstanceProfile(String customIamInstanceProfile) {
        setCustomIamInstanceProfile(customIamInstanceProfile);
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
     * The network type is determined by the <code>DBSubnetGroup</code> specified for read replica. A
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
     *        The network type is determined by the <code>DBSubnetGroup</code> specified for read replica. A
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
     * The network type is determined by the <code>DBSubnetGroup</code> specified for read replica. A
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
     *         The network type is determined by the <code>DBSubnetGroup</code> specified for read replica. A
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
     * The network type is determined by the <code>DBSubnetGroup</code> specified for read replica. A
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
     *        The network type is determined by the <code>DBSubnetGroup</code> specified for read replica. A
     *        <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     *        <code>DUAL</code>).
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     *        Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withNetworkType(String networkType) {
        setNetworkType(networkType);
        return this;
    }

    /**
     * <p>
     * Specifies the storage throughput value for the read replica.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     * </p>
     * 
     * @param storageThroughput
     *        Specifies the storage throughput value for the read replica.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom or Amazon Aurora.
     */

    public void setStorageThroughput(Integer storageThroughput) {
        this.storageThroughput = storageThroughput;
    }

    /**
     * <p>
     * Specifies the storage throughput value for the read replica.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     * </p>
     * 
     * @return Specifies the storage throughput value for the read replica.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom or Amazon Aurora.
     */

    public Integer getStorageThroughput() {
        return this.storageThroughput;
    }

    /**
     * <p>
     * Specifies the storage throughput value for the read replica.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     * </p>
     * 
     * @param storageThroughput
     *        Specifies the storage throughput value for the read replica.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom or Amazon Aurora.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withStorageThroughput(Integer storageThroughput) {
        setStorageThroughput(storageThroughput);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts read replica.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the read replica
     * from outside of its virtual private cloud (VPC) on your local network.
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
     *        A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts read
     *        replica.</p>
     *        <p>
     *        A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     *        on-premises network. For some use cases, a CoIP can provide lower latency for connections to the read
     *        replica from outside of its virtual private cloud (VPC) on your local network.
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
     * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts read replica.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the read replica
     * from outside of its virtual private cloud (VPC) on your local network.
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
     * @return A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts read
     *         replica.</p>
     *         <p>
     *         A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     *         on-premises network. For some use cases, a CoIP can provide lower latency for connections to the read
     *         replica from outside of its virtual private cloud (VPC) on your local network.
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
     * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts read replica.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the read replica
     * from outside of its virtual private cloud (VPC) on your local network.
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
     *        A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts read
     *        replica.</p>
     *        <p>
     *        A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     *        on-premises network. For some use cases, a CoIP can provide lower latency for connections to the read
     *        replica from outside of its virtual private cloud (VPC) on your local network.
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

    public CreateDBInstanceReadReplicaRequest withEnableCustomerOwnedIp(Boolean enableCustomerOwnedIp) {
        setEnableCustomerOwnedIp(enableCustomerOwnedIp);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts read replica.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the read replica
     * from outside of its virtual private cloud (VPC) on your local network.
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
     * @return A value that indicates whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts read
     *         replica.</p>
     *         <p>
     *         A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     *         on-premises network. For some use cases, a CoIP can provide lower latency for connections to the read
     *         replica from outside of its virtual private cloud (VPC) on your local network.
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

    public CreateDBInstanceReadReplicaRequest withSourceRegion(String sourceRegion) {
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getSourceDBInstanceIdentifier() != null)
            sb.append("SourceDBInstanceIdentifier: ").append(getSourceDBInstanceIdentifier()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: ").append(getDBParameterGroupName()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: ").append(getDBSubnetGroupName()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot()).append(",");
        if (getMonitoringInterval() != null)
            sb.append("MonitoringInterval: ").append(getMonitoringInterval()).append(",");
        if (getMonitoringRoleArn() != null)
            sb.append("MonitoringRoleArn: ").append(getMonitoringRoleArn()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getPreSignedUrl() != null)
            sb.append("PreSignedUrl: ").append(getPreSignedUrl()).append(",");
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
        if (getUseDefaultProcessorFeatures() != null)
            sb.append("UseDefaultProcessorFeatures: ").append(getUseDefaultProcessorFeatures()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: ").append(getDomainIAMRoleName()).append(",");
        if (getReplicaMode() != null)
            sb.append("ReplicaMode: ").append(getReplicaMode()).append(",");
        if (getMaxAllocatedStorage() != null)
            sb.append("MaxAllocatedStorage: ").append(getMaxAllocatedStorage()).append(",");
        if (getCustomIamInstanceProfile() != null)
            sb.append("CustomIamInstanceProfile: ").append(getCustomIamInstanceProfile()).append(",");
        if (getNetworkType() != null)
            sb.append("NetworkType: ").append(getNetworkType()).append(",");
        if (getStorageThroughput() != null)
            sb.append("StorageThroughput: ").append(getStorageThroughput()).append(",");
        if (getEnableCustomerOwnedIp() != null)
            sb.append("EnableCustomerOwnedIp: ").append(getEnableCustomerOwnedIp()).append(",");
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

        if (obj instanceof CreateDBInstanceReadReplicaRequest == false)
            return false;
        CreateDBInstanceReadReplicaRequest other = (CreateDBInstanceReadReplicaRequest) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getSourceDBInstanceIdentifier() == null ^ this.getSourceDBInstanceIdentifier() == null)
            return false;
        if (other.getSourceDBInstanceIdentifier() != null && other.getSourceDBInstanceIdentifier().equals(this.getSourceDBInstanceIdentifier()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
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
        if (other.getUseDefaultProcessorFeatures() == null ^ this.getUseDefaultProcessorFeatures() == null)
            return false;
        if (other.getUseDefaultProcessorFeatures() != null && other.getUseDefaultProcessorFeatures().equals(this.getUseDefaultProcessorFeatures()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null)
            return false;
        if (other.getDomainIAMRoleName() != null && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false)
            return false;
        if (other.getReplicaMode() == null ^ this.getReplicaMode() == null)
            return false;
        if (other.getReplicaMode() != null && other.getReplicaMode().equals(this.getReplicaMode()) == false)
            return false;
        if (other.getMaxAllocatedStorage() == null ^ this.getMaxAllocatedStorage() == null)
            return false;
        if (other.getMaxAllocatedStorage() != null && other.getMaxAllocatedStorage().equals(this.getMaxAllocatedStorage()) == false)
            return false;
        if (other.getCustomIamInstanceProfile() == null ^ this.getCustomIamInstanceProfile() == null)
            return false;
        if (other.getCustomIamInstanceProfile() != null && other.getCustomIamInstanceProfile().equals(this.getCustomIamInstanceProfile()) == false)
            return false;
        if (other.getNetworkType() == null ^ this.getNetworkType() == null)
            return false;
        if (other.getNetworkType() != null && other.getNetworkType().equals(this.getNetworkType()) == false)
            return false;
        if (other.getStorageThroughput() == null ^ this.getStorageThroughput() == null)
            return false;
        if (other.getStorageThroughput() != null && other.getStorageThroughput().equals(this.getStorageThroughput()) == false)
            return false;
        if (other.getEnableCustomerOwnedIp() == null ^ this.getEnableCustomerOwnedIp() == null)
            return false;
        if (other.getEnableCustomerOwnedIp() != null && other.getEnableCustomerOwnedIp().equals(this.getEnableCustomerOwnedIp()) == false)
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

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceDBInstanceIdentifier() == null) ? 0 : getSourceDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode());
        hashCode = prime * hashCode + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPreSignedUrl() == null) ? 0 : getPreSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getEnableIAMDatabaseAuthentication() == null) ? 0 : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode + ((getEnablePerformanceInsights() == null) ? 0 : getEnablePerformanceInsights().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsKMSKeyId() == null) ? 0 : getPerformanceInsightsKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsRetentionPeriod() == null) ? 0 : getPerformanceInsightsRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getEnableCloudwatchLogsExports() == null) ? 0 : getEnableCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getUseDefaultProcessorFeatures() == null) ? 0 : getUseDefaultProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        hashCode = prime * hashCode + ((getReplicaMode() == null) ? 0 : getReplicaMode().hashCode());
        hashCode = prime * hashCode + ((getMaxAllocatedStorage() == null) ? 0 : getMaxAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getCustomIamInstanceProfile() == null) ? 0 : getCustomIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getNetworkType() == null) ? 0 : getNetworkType().hashCode());
        hashCode = prime * hashCode + ((getStorageThroughput() == null) ? 0 : getStorageThroughput().hashCode());
        hashCode = prime * hashCode + ((getEnableCustomerOwnedIp() == null) ? 0 : getEnableCustomerOwnedIp().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBInstanceReadReplicaRequest clone() {
        return (CreateDBInstanceReadReplicaRequest) super.clone();
    }

}
