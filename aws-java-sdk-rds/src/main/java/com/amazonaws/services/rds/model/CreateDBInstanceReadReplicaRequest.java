/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The DB instance identifier of the Read Replica. This identifier is the unique key that identifies a DB instance.
     * This parameter is stored as a lowercase string.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The identifier of the DB instance that will act as the source for the Read Replica. Each DB instance can have up
     * to five Read Replicas.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier of an existing MySQL, MariaDB, Oracle, or PostgreSQL DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6 or later.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the limitations of Oracle Read Replicas, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica Limitations
     * with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or
     * later (9.4.7 and higher for cross-region replication).
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB instance must have automatic backups enabled, its backup retention period must be greater than
     * 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in the same AWS Region as the Read Replica, specify a valid DB instance identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in a different AWS Region than the Read Replica, specify a valid DB instance ARN.
     * For more information, go to <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceDBInstanceIdentifier;
    /**
     * <p>
     * The compute and memory capacity of the Read Replica, for example, <code>db.m4.large</code>. Not all DB instance
     * classes are available in all AWS Regions, or for all database engines. For the full list of DB instance classes,
     * and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: Inherits from the source DB instance.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The Amazon EC2 Availability Zone that the Read Replica is created in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.
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
     * Specifies whether the Read Replica is in a Multi-AZ deployment.
     * </p>
     * <p>
     * You can create a Read Replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     * Availability Zone for failover support for the replica. Creating your Read Replica as a Multi-AZ DB instance is
     * independent of whether the source database is a Multi-AZ DB instance.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * Indicates that minor engine upgrades are applied automatically to the Read Replica during the maintenance window.
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
     */
    private String optionGroupName;
    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance
     * with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an
     * internal instance with a DNS name that resolves to a private IP address. For more information, see
     * <a>CreateDBInstance</a>.
     * </p>
     */
    private Boolean publiclyAccessible;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Specifies a DB subnet group for the DB instance. The new DB instance is created in the VPC associated with the DB
     * subnet group. If no DB subnet group is specified, then the new DB instance is not created in a VPC.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can only be specified if the source DB instance identifier specifies a DB instance in another AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB subnet group must be in the same AWS Region in which the operation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * All Read Replicas in one AWS Region that are created from the same source DB instance must either:&gt;
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify DB subnet groups from the same VPC. All these Read Replicas are created in the same VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not specify a DB subnet group. All these Read Replicas are created outside of any VPC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the Read Replica.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * Specifies the storage type to be associated with the Read Replica.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>standard</code>
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * True to copy all tags from the Read Replica to snapshots of the Read Replica, and otherwise false. The default is
     * false.
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the Read Replica. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
     * other than 0.
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
     */
    private String monitoringRoleArn;
    /**
     * <p>
     * The AWS KMS key ID for an encrypted Read Replica. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     * identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you create an encrypted Read Replica in the same AWS Region as the source DB instance, then you do not have to
     * specify a value for this parameter. The Read Replica is encrypted with the same KMS key as the source DB
     * instance.
     * </p>
     * <p>
     * If you create an encrypted Read Replica in a different AWS Region, then you must specify a KMS key for the
     * destination AWS Region. KMS encryption keys are specific to the AWS Region that they are created in, and you
     * can't use encryption keys from one AWS Region in another AWS Region.
     * </p>
     * <p>
     * You can't create an encrypted Read Replica from an unencrypted DB instance.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the <code>CreateDBInstanceReadReplica</code> API
     * action in the source AWS Region that contains the source DB instance.
     * </p>
     * <p>
     * You must specify this parameter when you create an encrypted Read Replica from another AWS Region by using the
     * Amazon RDS API. You can specify the <code>--source-region</code> option instead of this parameter when you create
     * an encrypted Read Replica from another AWS Region by using the AWS CLI.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API action that can be
     * executed in the source AWS Region that contains the encrypted source DB instance. The presigned URL request must
     * contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the encrypted Read Replica is created in. This AWS Region is
     * the same one where the <code>CreateDBInstanceReadReplica</code> action is called that contains this presigned
     * URL.
     * </p>
     * <p>
     * For example, if you create an encrypted DB instance in the us-west-1 AWS Region, from a source DB instance in the
     * us-east-2 AWS Region, then you call the <code>CreateDBInstanceReadReplica</code> action in the us-east-1 AWS
     * Region and provide a presigned URL that contains a call to the <code>CreateDBInstanceReadReplica</code> action in
     * the us-west-2 AWS Region. For this example, the <code>DestinationRegion</code> in the presigned URL must be set
     * to the us-east-1 AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to encrypt the Read Replica in the
     * destination AWS Region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code> action
     * that is called in the destination AWS Region, and the action contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted DB instance to be
     * replicated. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For
     * example, if you are creating an encrypted Read Replica from a DB instance in the us-west-2 AWS Region, then your
     * <code>SourceDBInstanceIdentifier</code> looks like the following example:
     * <code>arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     * Process</a>.
     * </p>
     */
    private String preSignedUrl;
    /**
     * <p>
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise
     * false.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database engines
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora MySQL 5.6 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;
    /**
     * <p>
     * True to enable Performance Insights for the Read Replica, and otherwise false.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     */
    private Boolean enablePerformanceInsights;
    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource
     * Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     */
    private String performanceInsightsKMSKeyId;
    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
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
     */
    private com.amazonaws.internal.SdkInternalList<String> enableCloudwatchLogsExports;
    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProcessorFeature> processorFeatures;
    /**
     * <p>
     * A value that specifies that the DB instance class of the DB instance uses its default processor features.
     * </p>
     */
    private Boolean useDefaultProcessorFeatures;
    /**
     * <p>
     * Indicates if the DB instance should have deletion protection enabled. The database can't be deleted when this
     * value is set to true. The default is false. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     */
    private Boolean deletionProtection;
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
     *        The DB instance identifier of the Read Replica. This identifier is the unique key that identifies a DB
     *        instance. This parameter is stored as a lowercase string.
     * @param sourceDBInstanceIdentifier
     *        The identifier of the DB instance that will act as the source for the Read Replica. Each DB instance can
     *        have up to five Read Replicas.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier of an existing MySQL, MariaDB, Oracle, or PostgreSQL DB instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6 or later.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the limitations of Oracle Read Replicas, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica
     *        Limitations with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5
     *        or later (9.4.7 and higher for cross-region replication).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The specified DB instance must have automatic backups enabled, its backup retention period must be greater
     *        than 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB instance is in the same AWS Region as the Read Replica, specify a valid DB instance
     *        identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB instance is in a different AWS Region than the Read Replica, specify a valid DB instance
     *        ARN. For more information, go to <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *        > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        </li>
     */
    public CreateDBInstanceReadReplicaRequest(String dBInstanceIdentifier, String sourceDBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        setSourceDBInstanceIdentifier(sourceDBInstanceIdentifier);
    }

    /**
     * <p>
     * The DB instance identifier of the Read Replica. This identifier is the unique key that identifies a DB instance.
     * This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier of the Read Replica. This identifier is the unique key that identifies a DB
     *        instance. This parameter is stored as a lowercase string.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier of the Read Replica. This identifier is the unique key that identifies a DB instance.
     * This parameter is stored as a lowercase string.
     * </p>
     * 
     * @return The DB instance identifier of the Read Replica. This identifier is the unique key that identifies a DB
     *         instance. This parameter is stored as a lowercase string.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier of the Read Replica. This identifier is the unique key that identifies a DB instance.
     * This parameter is stored as a lowercase string.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier of the Read Replica. This identifier is the unique key that identifies a DB
     *        instance. This parameter is stored as a lowercase string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the DB instance that will act as the source for the Read Replica. Each DB instance can have up
     * to five Read Replicas.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier of an existing MySQL, MariaDB, Oracle, or PostgreSQL DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6 or later.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the limitations of Oracle Read Replicas, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica Limitations
     * with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or
     * later (9.4.7 and higher for cross-region replication).
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB instance must have automatic backups enabled, its backup retention period must be greater than
     * 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in the same AWS Region as the Read Replica, specify a valid DB instance identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in a different AWS Region than the Read Replica, specify a valid DB instance ARN.
     * For more information, go to <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceDBInstanceIdentifier
     *        The identifier of the DB instance that will act as the source for the Read Replica. Each DB instance can
     *        have up to five Read Replicas.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier of an existing MySQL, MariaDB, Oracle, or PostgreSQL DB instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6 or later.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the limitations of Oracle Read Replicas, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica
     *        Limitations with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5
     *        or later (9.4.7 and higher for cross-region replication).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The specified DB instance must have automatic backups enabled, its backup retention period must be greater
     *        than 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB instance is in the same AWS Region as the Read Replica, specify a valid DB instance
     *        identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB instance is in a different AWS Region than the Read Replica, specify a valid DB instance
     *        ARN. For more information, go to <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *        > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        </li>
     */

    public void setSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB instance that will act as the source for the Read Replica. Each DB instance can have up
     * to five Read Replicas.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier of an existing MySQL, MariaDB, Oracle, or PostgreSQL DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6 or later.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the limitations of Oracle Read Replicas, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica Limitations
     * with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or
     * later (9.4.7 and higher for cross-region replication).
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB instance must have automatic backups enabled, its backup retention period must be greater than
     * 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in the same AWS Region as the Read Replica, specify a valid DB instance identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in a different AWS Region than the Read Replica, specify a valid DB instance ARN.
     * For more information, go to <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the DB instance that will act as the source for the Read Replica. Each DB instance can
     *         have up to five Read Replicas.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be the identifier of an existing MySQL, MariaDB, Oracle, or PostgreSQL DB instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6 or later.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For the limitations of Oracle Read Replicas, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica
     *         Limitations with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5
     *         or later (9.4.7 and higher for cross-region replication).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The specified DB instance must have automatic backups enabled, its backup retention period must be
     *         greater than 0.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source DB instance is in the same AWS Region as the Read Replica, specify a valid DB instance
     *         identifier.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source DB instance is in a different AWS Region than the Read Replica, specify a valid DB instance
     *         ARN. For more information, go to <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *         > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         </li>
     */

    public String getSourceDBInstanceIdentifier() {
        return this.sourceDBInstanceIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB instance that will act as the source for the Read Replica. Each DB instance can have up
     * to five Read Replicas.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier of an existing MySQL, MariaDB, Oracle, or PostgreSQL DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6 or later.
     * </p>
     * </li>
     * <li>
     * <p>
     * For the limitations of Oracle Read Replicas, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica Limitations
     * with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or
     * later (9.4.7 and higher for cross-region replication).
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB instance must have automatic backups enabled, its backup retention period must be greater than
     * 0.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in the same AWS Region as the Read Replica, specify a valid DB instance identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in a different AWS Region than the Read Replica, specify a valid DB instance ARN.
     * For more information, go to <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceDBInstanceIdentifier
     *        The identifier of the DB instance that will act as the source for the Read Replica. Each DB instance can
     *        have up to five Read Replicas.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier of an existing MySQL, MariaDB, Oracle, or PostgreSQL DB instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6 or later.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For the limitations of Oracle Read Replicas, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Read Replica
     *        Limitations with Oracle</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5
     *        or later (9.4.7 and higher for cross-region replication).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The specified DB instance must have automatic backups enabled, its backup retention period must be greater
     *        than 0.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB instance is in the same AWS Region as the Read Replica, specify a valid DB instance
     *        identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB instance is in a different AWS Region than the Read Replica, specify a valid DB instance
     *        ARN. For more information, go to <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *        > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
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
     * The compute and memory capacity of the Read Replica, for example, <code>db.m4.large</code>. Not all DB instance
     * classes are available in all AWS Regions, or for all database engines. For the full list of DB instance classes,
     * and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: Inherits from the source DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The compute and memory capacity of the Read Replica, for example, <code>db.m4.large</code>. Not all DB
     *        instance classes are available in all AWS Regions, or for all database engines. For the full list of DB
     *        instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *        Class</a> in the <i>Amazon RDS User Guide.</i> </p>
     *        <p>
     *        Default: Inherits from the source DB instance.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the Read Replica, for example, <code>db.m4.large</code>. Not all DB instance
     * classes are available in all AWS Regions, or for all database engines. For the full list of DB instance classes,
     * and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: Inherits from the source DB instance.
     * </p>
     * 
     * @return The compute and memory capacity of the Read Replica, for example, <code>db.m4.large</code>. Not all DB
     *         instance classes are available in all AWS Regions, or for all database engines. For the full list of DB
     *         instance classes, and availability for your engine, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *         Class</a> in the <i>Amazon RDS User Guide.</i> </p>
     *         <p>
     *         Default: Inherits from the source DB instance.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the Read Replica, for example, <code>db.m4.large</code>. Not all DB instance
     * classes are available in all AWS Regions, or for all database engines. For the full list of DB instance classes,
     * and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Default: Inherits from the source DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The compute and memory capacity of the Read Replica, for example, <code>db.m4.large</code>. Not all DB
     *        instance classes are available in all AWS Regions, or for all database engines. For the full list of DB
     *        instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *        Class</a> in the <i>Amazon RDS User Guide.</i> </p>
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
     * The Amazon EC2 Availability Zone that the Read Replica is created in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * 
     * @param availabilityZone
     *        The Amazon EC2 Availability Zone that the Read Replica is created in.</p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1d</code>
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone that the Read Replica is created in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * 
     * @return The Amazon EC2 Availability Zone that the Read Replica is created in.</p>
     *         <p>
     *         Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.
     *         </p>
     *         <p>
     *         Example: <code>us-east-1d</code>
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone that the Read Replica is created in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * 
     * @param availabilityZone
     *        The Amazon EC2 Availability Zone that the Read Replica is created in.</p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone in the endpoint's AWS Region.
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
     * Specifies whether the Read Replica is in a Multi-AZ deployment.
     * </p>
     * <p>
     * You can create a Read Replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     * Availability Zone for failover support for the replica. Creating your Read Replica as a Multi-AZ DB instance is
     * independent of whether the source database is a Multi-AZ DB instance.
     * </p>
     * 
     * @param multiAZ
     *        Specifies whether the Read Replica is in a Multi-AZ deployment. </p>
     *        <p>
     *        You can create a Read Replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     *        Availability Zone for failover support for the replica. Creating your Read Replica as a Multi-AZ DB
     *        instance is independent of whether the source database is a Multi-AZ DB instance.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies whether the Read Replica is in a Multi-AZ deployment.
     * </p>
     * <p>
     * You can create a Read Replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     * Availability Zone for failover support for the replica. Creating your Read Replica as a Multi-AZ DB instance is
     * independent of whether the source database is a Multi-AZ DB instance.
     * </p>
     * 
     * @return Specifies whether the Read Replica is in a Multi-AZ deployment. </p>
     *         <p>
     *         You can create a Read Replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     *         Availability Zone for failover support for the replica. Creating your Read Replica as a Multi-AZ DB
     *         instance is independent of whether the source database is a Multi-AZ DB instance.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Specifies whether the Read Replica is in a Multi-AZ deployment.
     * </p>
     * <p>
     * You can create a Read Replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     * Availability Zone for failover support for the replica. Creating your Read Replica as a Multi-AZ DB instance is
     * independent of whether the source database is a Multi-AZ DB instance.
     * </p>
     * 
     * @param multiAZ
     *        Specifies whether the Read Replica is in a Multi-AZ deployment. </p>
     *        <p>
     *        You can create a Read Replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     *        Availability Zone for failover support for the replica. Creating your Read Replica as a Multi-AZ DB
     *        instance is independent of whether the source database is a Multi-AZ DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Read Replica is in a Multi-AZ deployment.
     * </p>
     * <p>
     * You can create a Read Replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     * Availability Zone for failover support for the replica. Creating your Read Replica as a Multi-AZ DB instance is
     * independent of whether the source database is a Multi-AZ DB instance.
     * </p>
     * 
     * @return Specifies whether the Read Replica is in a Multi-AZ deployment. </p>
     *         <p>
     *         You can create a Read Replica as a Multi-AZ DB instance. RDS creates a standby of your replica in another
     *         Availability Zone for failover support for the replica. Creating your Read Replica as a Multi-AZ DB
     *         instance is independent of whether the source database is a Multi-AZ DB instance.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Indicates that minor engine upgrades are applied automatically to the Read Replica during the maintenance window.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor engine upgrades are applied automatically to the Read Replica during the maintenance
     *        window.</p>
     *        <p>
     *        Default: Inherits from the source DB instance
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor engine upgrades are applied automatically to the Read Replica during the maintenance window.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * 
     * @return Indicates that minor engine upgrades are applied automatically to the Read Replica during the maintenance
     *         window.</p>
     *         <p>
     *         Default: Inherits from the source DB instance
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor engine upgrades are applied automatically to the Read Replica during the maintenance window.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor engine upgrades are applied automatically to the Read Replica during the maintenance
     *        window.</p>
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
     * Indicates that minor engine upgrades are applied automatically to the Read Replica during the maintenance window.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * 
     * @return Indicates that minor engine upgrades are applied automatically to the Read Replica during the maintenance
     *         window.</p>
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
     * 
     * @param optionGroupName
     *        The option group the DB instance is associated with. If omitted, the option group associated with the
     *        source instance is used.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The option group the DB instance is associated with. If omitted, the option group associated with the source
     * instance is used.
     * </p>
     * 
     * @return The option group the DB instance is associated with. If omitted, the option group associated with the
     *         source instance is used.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The option group the DB instance is associated with. If omitted, the option group associated with the source
     * instance is used.
     * </p>
     * 
     * @param optionGroupName
     *        The option group the DB instance is associated with. If omitted, the option group associated with the
     *        source instance is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance
     * with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an
     * internal instance with a DNS name that resolves to a private IP address. For more information, see
     * <a>CreateDBInstance</a>.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing
     *        instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false
     *        specifies an internal instance with a DNS name that resolves to a private IP address. For more
     *        information, see <a>CreateDBInstance</a>.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance
     * with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an
     * internal instance with a DNS name that resolves to a private IP address. For more information, see
     * <a>CreateDBInstance</a>.
     * </p>
     * 
     * @return Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing
     *         instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a private IP address. For more
     *         information, see <a>CreateDBInstance</a>.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance
     * with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an
     * internal instance with a DNS name that resolves to a private IP address. For more information, see
     * <a>CreateDBInstance</a>.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing
     *        instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false
     *        specifies an internal instance with a DNS name that resolves to a private IP address. For more
     *        information, see <a>CreateDBInstance</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance
     * with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an
     * internal instance with a DNS name that resolves to a private IP address. For more information, see
     * <a>CreateDBInstance</a>.
     * </p>
     * 
     * @return Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing
     *         instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a private IP address. For more
     *         information, see <a>CreateDBInstance</a>.
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
     * subnet group. If no DB subnet group is specified, then the new DB instance is not created in a VPC.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can only be specified if the source DB instance identifier specifies a DB instance in another AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB subnet group must be in the same AWS Region in which the operation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * All Read Replicas in one AWS Region that are created from the same source DB instance must either:&gt;
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify DB subnet groups from the same VPC. All these Read Replicas are created in the same VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not specify a DB subnet group. All these Read Replicas are created outside of any VPC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        Specifies a DB subnet group for the DB instance. The new DB instance is created in the VPC associated with
     *        the DB subnet group. If no DB subnet group is specified, then the new DB instance is not created in a
     *        VPC.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can only be specified if the source DB instance identifier specifies a DB instance in another AWS Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing DBSubnetGroup.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The specified DB subnet group must be in the same AWS Region in which the operation is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        All Read Replicas in one AWS Region that are created from the same source DB instance must either:&gt;
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify DB subnet groups from the same VPC. All these Read Replicas are created in the same VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not specify a DB subnet group. All these Read Replicas are created outside of any VPC.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * Specifies a DB subnet group for the DB instance. The new DB instance is created in the VPC associated with the DB
     * subnet group. If no DB subnet group is specified, then the new DB instance is not created in a VPC.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can only be specified if the source DB instance identifier specifies a DB instance in another AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB subnet group must be in the same AWS Region in which the operation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * All Read Replicas in one AWS Region that are created from the same source DB instance must either:&gt;
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify DB subnet groups from the same VPC. All these Read Replicas are created in the same VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not specify a DB subnet group. All these Read Replicas are created outside of any VPC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @return Specifies a DB subnet group for the DB instance. The new DB instance is created in the VPC associated
     *         with the DB subnet group. If no DB subnet group is specified, then the new DB instance is not created in
     *         a VPC.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can only be specified if the source DB instance identifier specifies a DB instance in another AWS Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If supplied, must match the name of an existing DBSubnetGroup.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The specified DB subnet group must be in the same AWS Region in which the operation is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         All Read Replicas in one AWS Region that are created from the same source DB instance must either:&gt;
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specify DB subnet groups from the same VPC. All these Read Replicas are created in the same VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not specify a DB subnet group. All these Read Replicas are created outside of any VPC.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>mySubnetgroup</code>
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * Specifies a DB subnet group for the DB instance. The new DB instance is created in the VPC associated with the DB
     * subnet group. If no DB subnet group is specified, then the new DB instance is not created in a VPC.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can only be specified if the source DB instance identifier specifies a DB instance in another AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB subnet group must be in the same AWS Region in which the operation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * All Read Replicas in one AWS Region that are created from the same source DB instance must either:&gt;
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify DB subnet groups from the same VPC. All these Read Replicas are created in the same VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not specify a DB subnet group. All these Read Replicas are created outside of any VPC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        Specifies a DB subnet group for the DB instance. The new DB instance is created in the VPC associated with
     *        the DB subnet group. If no DB subnet group is specified, then the new DB instance is not created in a
     *        VPC.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can only be specified if the source DB instance identifier specifies a DB instance in another AWS Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing DBSubnetGroup.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The specified DB subnet group must be in the same AWS Region in which the operation is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        All Read Replicas in one AWS Region that are created from the same source DB instance must either:&gt;
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify DB subnet groups from the same VPC. All these Read Replicas are created in the same VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not specify a DB subnet group. All these Read Replicas are created outside of any VPC.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the Read Replica.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * 
     * @return A list of EC2 VPC security groups to associate with the Read Replica. </p>
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
     * A list of EC2 VPC security groups to associate with the Read Replica.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with the Read Replica. </p>
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
     * A list of EC2 VPC security groups to associate with the Read Replica.
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
     *        A list of EC2 VPC security groups to associate with the Read Replica. </p>
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
     * A list of EC2 VPC security groups to associate with the Read Replica.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with the Read Replica. </p>
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
     * Specifies the storage type to be associated with the Read Replica.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>standard</code>
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the Read Replica.</p>
     *        <p>
     *        Valid values: <code>standard | gp2 | io1</code>
     *        </p>
     *        <p>
     *        If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>standard</code>
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the Read Replica.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>standard</code>
     * </p>
     * 
     * @return Specifies the storage type to be associated with the Read Replica.</p>
     *         <p>
     *         Valid values: <code>standard | gp2 | io1</code>
     *         </p>
     *         <p>
     *         If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     *         </p>
     *         <p>
     *         Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise
     *         <code>standard</code>
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the Read Replica.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>standard</code>
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the Read Replica.</p>
     *        <p>
     *        Valid values: <code>standard | gp2 | io1</code>
     *        </p>
     *        <p>
     *        If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>standard</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the Read Replica to snapshots of the Read Replica, and otherwise false. The default is
     * false.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        True to copy all tags from the Read Replica to snapshots of the Read Replica, and otherwise false. The
     *        default is false.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * True to copy all tags from the Read Replica to snapshots of the Read Replica, and otherwise false. The default is
     * false.
     * </p>
     * 
     * @return True to copy all tags from the Read Replica to snapshots of the Read Replica, and otherwise false. The
     *         default is false.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * True to copy all tags from the Read Replica to snapshots of the Read Replica, and otherwise false. The default is
     * false.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        True to copy all tags from the Read Replica to snapshots of the Read Replica, and otherwise false. The
     *        default is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the Read Replica to snapshots of the Read Replica, and otherwise false. The default is
     * false.
     * </p>
     * 
     * @return True to copy all tags from the Read Replica to snapshots of the Read Replica, and otherwise false. The
     *         default is false.
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the Read Replica. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the Read
     *        Replica. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to
     *        a value other than 0.
     *        </p>
     *        <p>
     *        Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     */

    public void setMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the Read Replica. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * 
     * @return The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the Read
     *         Replica. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *         <p>
     *         If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to
     *         a value other than 0.
     *         </p>
     *         <p>
     *         Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     */

    public Integer getMonitoringInterval() {
        return this.monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the Read Replica. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the Read
     *        Replica. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to
     *        a value other than 0.
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
     * 
     * @return The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs.
     *         For example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a
     *         monitoring role, go to <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole"
     *         >To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide</i>.</p>
     *         <p>
     *         If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     *         <code>MonitoringRoleArn</code> value.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withMonitoringRoleArn(String monitoringRoleArn) {
        setMonitoringRoleArn(monitoringRoleArn);
        return this;
    }

    /**
     * <p>
     * The AWS KMS key ID for an encrypted Read Replica. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     * identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you create an encrypted Read Replica in the same AWS Region as the source DB instance, then you do not have to
     * specify a value for this parameter. The Read Replica is encrypted with the same KMS key as the source DB
     * instance.
     * </p>
     * <p>
     * If you create an encrypted Read Replica in a different AWS Region, then you must specify a KMS key for the
     * destination AWS Region. KMS encryption keys are specific to the AWS Region that they are created in, and you
     * can't use encryption keys from one AWS Region in another AWS Region.
     * </p>
     * <p>
     * You can't create an encrypted Read Replica from an unencrypted DB instance.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key ID for an encrypted Read Replica. The KMS key ID is the Amazon Resource Name (ARN), KMS
     *        key identifier, or the KMS key alias for the KMS encryption key. </p>
     *        <p>
     *        If you create an encrypted Read Replica in the same AWS Region as the source DB instance, then you do not
     *        have to specify a value for this parameter. The Read Replica is encrypted with the same KMS key as the
     *        source DB instance.
     *        </p>
     *        <p>
     *        If you create an encrypted Read Replica in a different AWS Region, then you must specify a KMS key for the
     *        destination AWS Region. KMS encryption keys are specific to the AWS Region that they are created in, and
     *        you can't use encryption keys from one AWS Region in another AWS Region.
     *        </p>
     *        <p>
     *        You can't create an encrypted Read Replica from an unencrypted DB instance.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID for an encrypted Read Replica. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     * identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you create an encrypted Read Replica in the same AWS Region as the source DB instance, then you do not have to
     * specify a value for this parameter. The Read Replica is encrypted with the same KMS key as the source DB
     * instance.
     * </p>
     * <p>
     * If you create an encrypted Read Replica in a different AWS Region, then you must specify a KMS key for the
     * destination AWS Region. KMS encryption keys are specific to the AWS Region that they are created in, and you
     * can't use encryption keys from one AWS Region in another AWS Region.
     * </p>
     * <p>
     * You can't create an encrypted Read Replica from an unencrypted DB instance.
     * </p>
     * 
     * @return The AWS KMS key ID for an encrypted Read Replica. The KMS key ID is the Amazon Resource Name (ARN), KMS
     *         key identifier, or the KMS key alias for the KMS encryption key. </p>
     *         <p>
     *         If you create an encrypted Read Replica in the same AWS Region as the source DB instance, then you do not
     *         have to specify a value for this parameter. The Read Replica is encrypted with the same KMS key as the
     *         source DB instance.
     *         </p>
     *         <p>
     *         If you create an encrypted Read Replica in a different AWS Region, then you must specify a KMS key for
     *         the destination AWS Region. KMS encryption keys are specific to the AWS Region that they are created in,
     *         and you can't use encryption keys from one AWS Region in another AWS Region.
     *         </p>
     *         <p>
     *         You can't create an encrypted Read Replica from an unencrypted DB instance.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID for an encrypted Read Replica. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     * identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * <p>
     * If you create an encrypted Read Replica in the same AWS Region as the source DB instance, then you do not have to
     * specify a value for this parameter. The Read Replica is encrypted with the same KMS key as the source DB
     * instance.
     * </p>
     * <p>
     * If you create an encrypted Read Replica in a different AWS Region, then you must specify a KMS key for the
     * destination AWS Region. KMS encryption keys are specific to the AWS Region that they are created in, and you
     * can't use encryption keys from one AWS Region in another AWS Region.
     * </p>
     * <p>
     * You can't create an encrypted Read Replica from an unencrypted DB instance.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key ID for an encrypted Read Replica. The KMS key ID is the Amazon Resource Name (ARN), KMS
     *        key identifier, or the KMS key alias for the KMS encryption key. </p>
     *        <p>
     *        If you create an encrypted Read Replica in the same AWS Region as the source DB instance, then you do not
     *        have to specify a value for this parameter. The Read Replica is encrypted with the same KMS key as the
     *        source DB instance.
     *        </p>
     *        <p>
     *        If you create an encrypted Read Replica in a different AWS Region, then you must specify a KMS key for the
     *        destination AWS Region. KMS encryption keys are specific to the AWS Region that they are created in, and
     *        you can't use encryption keys from one AWS Region in another AWS Region.
     *        </p>
     *        <p>
     *        You can't create an encrypted Read Replica from an unencrypted DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the <code>CreateDBInstanceReadReplica</code> API
     * action in the source AWS Region that contains the source DB instance.
     * </p>
     * <p>
     * You must specify this parameter when you create an encrypted Read Replica from another AWS Region by using the
     * Amazon RDS API. You can specify the <code>--source-region</code> option instead of this parameter when you create
     * an encrypted Read Replica from another AWS Region by using the AWS CLI.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API action that can be
     * executed in the source AWS Region that contains the encrypted source DB instance. The presigned URL request must
     * contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the encrypted Read Replica is created in. This AWS Region is
     * the same one where the <code>CreateDBInstanceReadReplica</code> action is called that contains this presigned
     * URL.
     * </p>
     * <p>
     * For example, if you create an encrypted DB instance in the us-west-1 AWS Region, from a source DB instance in the
     * us-east-2 AWS Region, then you call the <code>CreateDBInstanceReadReplica</code> action in the us-east-1 AWS
     * Region and provide a presigned URL that contains a call to the <code>CreateDBInstanceReadReplica</code> action in
     * the us-west-2 AWS Region. For this example, the <code>DestinationRegion</code> in the presigned URL must be set
     * to the us-east-1 AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to encrypt the Read Replica in the
     * destination AWS Region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code> action
     * that is called in the destination AWS Region, and the action contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted DB instance to be
     * replicated. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For
     * example, if you are creating an encrypted Read Replica from a DB instance in the us-west-2 AWS Region, then your
     * <code>SourceDBInstanceIdentifier</code> looks like the following example:
     * <code>arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     * Process</a>.
     * </p>
     * 
     * @param preSignedUrl
     *        The URL that contains a Signature Version 4 signed request for the
     *        <code>CreateDBInstanceReadReplica</code> API action in the source AWS Region that contains the source DB
     *        instance. </p>
     *        <p>
     *        You must specify this parameter when you create an encrypted Read Replica from another AWS Region by using
     *        the Amazon RDS API. You can specify the <code>--source-region</code> option instead of this parameter when
     *        you create an encrypted Read Replica from another AWS Region by using the AWS CLI.
     *        </p>
     *        <p>
     *        The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API action that
     *        can be executed in the source AWS Region that contains the encrypted source DB instance. The presigned URL
     *        request must contain the following parameter values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DestinationRegion</code> - The AWS Region that the encrypted Read Replica is created in. This AWS
     *        Region is the same one where the <code>CreateDBInstanceReadReplica</code> action is called that contains
     *        this presigned URL.
     *        </p>
     *        <p>
     *        For example, if you create an encrypted DB instance in the us-west-1 AWS Region, from a source DB instance
     *        in the us-east-2 AWS Region, then you call the <code>CreateDBInstanceReadReplica</code> action in the
     *        us-east-1 AWS Region and provide a presigned URL that contains a call to the
     *        <code>CreateDBInstanceReadReplica</code> action in the us-west-2 AWS Region. For this example, the
     *        <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 AWS Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to encrypt the Read Replica in the
     *        destination AWS Region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code>
     *        action that is called in the destination AWS Region, and the action contained in the presigned URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted DB instance to be
     *        replicated. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region.
     *        For example, if you are creating an encrypted Read Replica from a DB instance in the us-west-2 AWS Region,
     *        then your <code>SourceDBInstanceIdentifier</code> looks like the following example:
     *        <code>arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-20161115</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn how to generate a Signature Version 4 signed request, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *        Requests: Using Query Parameters (AWS Signature Version 4)</a> and <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     *        Process</a>.
     */

    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the <code>CreateDBInstanceReadReplica</code> API
     * action in the source AWS Region that contains the source DB instance.
     * </p>
     * <p>
     * You must specify this parameter when you create an encrypted Read Replica from another AWS Region by using the
     * Amazon RDS API. You can specify the <code>--source-region</code> option instead of this parameter when you create
     * an encrypted Read Replica from another AWS Region by using the AWS CLI.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API action that can be
     * executed in the source AWS Region that contains the encrypted source DB instance. The presigned URL request must
     * contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the encrypted Read Replica is created in. This AWS Region is
     * the same one where the <code>CreateDBInstanceReadReplica</code> action is called that contains this presigned
     * URL.
     * </p>
     * <p>
     * For example, if you create an encrypted DB instance in the us-west-1 AWS Region, from a source DB instance in the
     * us-east-2 AWS Region, then you call the <code>CreateDBInstanceReadReplica</code> action in the us-east-1 AWS
     * Region and provide a presigned URL that contains a call to the <code>CreateDBInstanceReadReplica</code> action in
     * the us-west-2 AWS Region. For this example, the <code>DestinationRegion</code> in the presigned URL must be set
     * to the us-east-1 AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to encrypt the Read Replica in the
     * destination AWS Region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code> action
     * that is called in the destination AWS Region, and the action contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted DB instance to be
     * replicated. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For
     * example, if you are creating an encrypted Read Replica from a DB instance in the us-west-2 AWS Region, then your
     * <code>SourceDBInstanceIdentifier</code> looks like the following example:
     * <code>arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     * Process</a>.
     * </p>
     * 
     * @return The URL that contains a Signature Version 4 signed request for the
     *         <code>CreateDBInstanceReadReplica</code> API action in the source AWS Region that contains the source DB
     *         instance. </p>
     *         <p>
     *         You must specify this parameter when you create an encrypted Read Replica from another AWS Region by
     *         using the Amazon RDS API. You can specify the <code>--source-region</code> option instead of this
     *         parameter when you create an encrypted Read Replica from another AWS Region by using the AWS CLI.
     *         </p>
     *         <p>
     *         The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API action
     *         that can be executed in the source AWS Region that contains the encrypted source DB instance. The
     *         presigned URL request must contain the following parameter values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DestinationRegion</code> - The AWS Region that the encrypted Read Replica is created in. This AWS
     *         Region is the same one where the <code>CreateDBInstanceReadReplica</code> action is called that contains
     *         this presigned URL.
     *         </p>
     *         <p>
     *         For example, if you create an encrypted DB instance in the us-west-1 AWS Region, from a source DB
     *         instance in the us-east-2 AWS Region, then you call the <code>CreateDBInstanceReadReplica</code> action
     *         in the us-east-1 AWS Region and provide a presigned URL that contains a call to the
     *         <code>CreateDBInstanceReadReplica</code> action in the us-west-2 AWS Region. For this example, the
     *         <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 AWS Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to encrypt the Read Replica in the
     *         destination AWS Region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code>
     *         action that is called in the destination AWS Region, and the action contained in the presigned URL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted DB instance to be
     *         replicated. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region.
     *         For example, if you are creating an encrypted Read Replica from a DB instance in the us-west-2 AWS
     *         Region, then your <code>SourceDBInstanceIdentifier</code> looks like the following example:
     *         <code>arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-20161115</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To learn how to generate a Signature Version 4 signed request, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *         Requests: Using Query Parameters (AWS Signature Version 4)</a> and <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     *         Process</a>.
     */

    public String getPreSignedUrl() {
        return this.preSignedUrl;
    }

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the <code>CreateDBInstanceReadReplica</code> API
     * action in the source AWS Region that contains the source DB instance.
     * </p>
     * <p>
     * You must specify this parameter when you create an encrypted Read Replica from another AWS Region by using the
     * Amazon RDS API. You can specify the <code>--source-region</code> option instead of this parameter when you create
     * an encrypted Read Replica from another AWS Region by using the AWS CLI.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API action that can be
     * executed in the source AWS Region that contains the encrypted source DB instance. The presigned URL request must
     * contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the encrypted Read Replica is created in. This AWS Region is
     * the same one where the <code>CreateDBInstanceReadReplica</code> action is called that contains this presigned
     * URL.
     * </p>
     * <p>
     * For example, if you create an encrypted DB instance in the us-west-1 AWS Region, from a source DB instance in the
     * us-east-2 AWS Region, then you call the <code>CreateDBInstanceReadReplica</code> action in the us-east-1 AWS
     * Region and provide a presigned URL that contains a call to the <code>CreateDBInstanceReadReplica</code> action in
     * the us-west-2 AWS Region. For this example, the <code>DestinationRegion</code> in the presigned URL must be set
     * to the us-east-1 AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to encrypt the Read Replica in the
     * destination AWS Region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code> action
     * that is called in the destination AWS Region, and the action contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted DB instance to be
     * replicated. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region. For
     * example, if you are creating an encrypted Read Replica from a DB instance in the us-west-2 AWS Region, then your
     * <code>SourceDBInstanceIdentifier</code> looks like the following example:
     * <code>arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     * Process</a>.
     * </p>
     * 
     * @param preSignedUrl
     *        The URL that contains a Signature Version 4 signed request for the
     *        <code>CreateDBInstanceReadReplica</code> API action in the source AWS Region that contains the source DB
     *        instance. </p>
     *        <p>
     *        You must specify this parameter when you create an encrypted Read Replica from another AWS Region by using
     *        the Amazon RDS API. You can specify the <code>--source-region</code> option instead of this parameter when
     *        you create an encrypted Read Replica from another AWS Region by using the AWS CLI.
     *        </p>
     *        <p>
     *        The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API action that
     *        can be executed in the source AWS Region that contains the encrypted source DB instance. The presigned URL
     *        request must contain the following parameter values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DestinationRegion</code> - The AWS Region that the encrypted Read Replica is created in. This AWS
     *        Region is the same one where the <code>CreateDBInstanceReadReplica</code> action is called that contains
     *        this presigned URL.
     *        </p>
     *        <p>
     *        For example, if you create an encrypted DB instance in the us-west-1 AWS Region, from a source DB instance
     *        in the us-east-2 AWS Region, then you call the <code>CreateDBInstanceReadReplica</code> action in the
     *        us-east-1 AWS Region and provide a presigned URL that contains a call to the
     *        <code>CreateDBInstanceReadReplica</code> action in the us-west-2 AWS Region. For this example, the
     *        <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 AWS Region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to encrypt the Read Replica in the
     *        destination AWS Region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code>
     *        action that is called in the destination AWS Region, and the action contained in the presigned URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted DB instance to be
     *        replicated. This identifier must be in the Amazon Resource Name (ARN) format for the source AWS Region.
     *        For example, if you are creating an encrypted Read Replica from a DB instance in the us-west-2 AWS Region,
     *        then your <code>SourceDBInstanceIdentifier</code> looks like the following example:
     *        <code>arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-20161115</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn how to generate a Signature Version 4 signed request, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html">Authenticating
     *        Requests: Using Query Parameters (AWS Signature Version 4)</a> and <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4 Signing
     *        Process</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withPreSignedUrl(String preSignedUrl) {
        setPreSignedUrl(preSignedUrl);
        return this;
    }

    /**
     * <p>
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise
     * false.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database engines
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora MySQL 5.6 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and
     *        otherwise false.</p>
     *        <p>
     *        You can enable IAM database authentication for the following database engines
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For MySQL 5.6, minor version 5.6.34 or higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For MySQL 5.7, minor version 5.7.16 or higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Aurora MySQL 5.6 or higher
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise
     * false.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database engines
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora MySQL 5.6 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and
     *         otherwise false.</p>
     *         <p>
     *         You can enable IAM database authentication for the following database engines
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For MySQL 5.6, minor version 5.6.34 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For MySQL 5.7, minor version 5.7.16 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora MySQL 5.6 or higher
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise
     * false.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database engines
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora MySQL 5.6 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and
     *        otherwise false.</p>
     *        <p>
     *        You can enable IAM database authentication for the following database engines
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For MySQL 5.6, minor version 5.6.34 or higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For MySQL 5.7, minor version 5.7.16 or higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Aurora MySQL 5.6 or higher
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        setEnableIAMDatabaseAuthentication(enableIAMDatabaseAuthentication);
        return this;
    }

    /**
     * <p>
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise
     * false.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database engines
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora MySQL 5.6 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and
     *         otherwise false.</p>
     *         <p>
     *         You can enable IAM database authentication for the following database engines
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For MySQL 5.6, minor version 5.6.34 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For MySQL 5.7, minor version 5.7.16 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora MySQL 5.6 or higher
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * True to enable Performance Insights for the Read Replica, and otherwise false.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param enablePerformanceInsights
     *        True to enable Performance Insights for the Read Replica, and otherwise false. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *        Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     */

    public void setEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        this.enablePerformanceInsights = enablePerformanceInsights;
    }

    /**
     * <p>
     * True to enable Performance Insights for the Read Replica, and otherwise false.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @return True to enable Performance Insights for the Read Replica, and otherwise false. </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *         Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     */

    public Boolean getEnablePerformanceInsights() {
        return this.enablePerformanceInsights;
    }

    /**
     * <p>
     * True to enable Performance Insights for the Read Replica, and otherwise false.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param enablePerformanceInsights
     *        True to enable Performance Insights for the Read Replica, and otherwise false. </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *        Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        setEnablePerformanceInsights(enablePerformanceInsights);
        return this;
    }

    /**
     * <p>
     * True to enable Performance Insights for the Read Replica, and otherwise false.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @return True to enable Performance Insights for the Read Replica, and otherwise false. </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *         Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     */

    public Boolean isEnablePerformanceInsights() {
        return this.enablePerformanceInsights;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource
     * Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * 
     * @param performanceInsightsKMSKeyId
     *        The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon
     *        Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.
     */

    public void setPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
        this.performanceInsightsKMSKeyId = performanceInsightsKMSKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource
     * Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * 
     * @return The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon
     *         Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.
     */

    public String getPerformanceInsightsKMSKeyId() {
        return this.performanceInsightsKMSKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon Resource
     * Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.
     * </p>
     * 
     * @param performanceInsightsKMSKeyId
     *        The AWS KMS key identifier for encryption of Performance Insights data. The KMS key ID is the Amazon
     *        Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
        setPerformanceInsightsKMSKeyId(performanceInsightsKMSKeyId);
        return this;
    }

    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     * </p>
     * 
     * @param performanceInsightsRetentionPeriod
     *        The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     */

    public void setPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
        this.performanceInsightsRetentionPeriod = performanceInsightsRetentionPeriod;
    }

    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     * </p>
     * 
     * @return The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     */

    public Integer getPerformanceInsightsRetentionPeriod() {
        return this.performanceInsightsRetentionPeriod;
    }

    /**
     * <p>
     * The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
     * </p>
     * 
     * @param performanceInsightsRetentionPeriod
     *        The amount of time, in days, to retain Performance Insights data. Valid values are 7 or 731 (2 years).
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
     * 
     * @return The list of logs that the new DB instance is to export to CloudWatch Logs. The values in the list depend
     *         on the DB engine being used. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon RDS User Guide</i>.
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
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the new DB instance is to export to CloudWatch Logs. The values in the list depend
     *        on the DB engine being used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon RDS User Guide</i>.
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnableCloudwatchLogsExports(java.util.Collection)} or
     * {@link #withEnableCloudwatchLogsExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the new DB instance is to export to CloudWatch Logs. The values in the list depend
     *        on the DB engine being used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon RDS User Guide</i>.
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
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the new DB instance is to export to CloudWatch Logs. The values in the list depend
     *        on the DB engine being used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon RDS User Guide</i>.
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
     * 
     * @return The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
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
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessorFeatures(java.util.Collection)} or {@link #withProcessorFeatures(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
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
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
        return this;
    }

    /**
     * <p>
     * A value that specifies that the DB instance class of the DB instance uses its default processor features.
     * </p>
     * 
     * @param useDefaultProcessorFeatures
     *        A value that specifies that the DB instance class of the DB instance uses its default processor features.
     */

    public void setUseDefaultProcessorFeatures(Boolean useDefaultProcessorFeatures) {
        this.useDefaultProcessorFeatures = useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * A value that specifies that the DB instance class of the DB instance uses its default processor features.
     * </p>
     * 
     * @return A value that specifies that the DB instance class of the DB instance uses its default processor features.
     */

    public Boolean getUseDefaultProcessorFeatures() {
        return this.useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * A value that specifies that the DB instance class of the DB instance uses its default processor features.
     * </p>
     * 
     * @param useDefaultProcessorFeatures
     *        A value that specifies that the DB instance class of the DB instance uses its default processor features.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withUseDefaultProcessorFeatures(Boolean useDefaultProcessorFeatures) {
        setUseDefaultProcessorFeatures(useDefaultProcessorFeatures);
        return this;
    }

    /**
     * <p>
     * A value that specifies that the DB instance class of the DB instance uses its default processor features.
     * </p>
     * 
     * @return A value that specifies that the DB instance class of the DB instance uses its default processor features.
     */

    public Boolean isUseDefaultProcessorFeatures() {
        return this.useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * Indicates if the DB instance should have deletion protection enabled. The database can't be deleted when this
     * value is set to true. The default is false. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates if the DB instance should have deletion protection enabled. The database can't be deleted when
     *        this value is set to true. The default is false. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *        Instance</a>.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Indicates if the DB instance should have deletion protection enabled. The database can't be deleted when this
     * value is set to true. The default is false. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @return Indicates if the DB instance should have deletion protection enabled. The database can't be deleted when
     *         this value is set to true. The default is false. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *         Instance</a>.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Indicates if the DB instance should have deletion protection enabled. The database can't be deleted when this
     * value is set to true. The default is false. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates if the DB instance should have deletion protection enabled. The database can't be deleted when
     *        this value is set to true. The default is false. For more information, see <a
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
     * Indicates if the DB instance should have deletion protection enabled. The database can't be deleted when this
     * value is set to true. The default is false. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @return Indicates if the DB instance should have deletion protection enabled. The database can't be deleted when
     *         this value is set to true. The default is false. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *         Instance</a>.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
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
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBInstanceReadReplicaRequest clone() {
        return (CreateDBInstanceReadReplicaRequest) super.clone();
    }

}
