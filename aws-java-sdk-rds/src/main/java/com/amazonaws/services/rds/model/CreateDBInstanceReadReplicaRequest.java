/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Must be the identifier of an existing MySQL, MariaDB, or PostgreSQL DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or
     * later.
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
     * If the source DB instance is in the same region as the Read Replica, specify a valid DB instance identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in a different region than the Read Replica, specify a valid DB instance ARN. For
     * more information, go to <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceDBInstanceIdentifier;
    /**
     * <p>
     * The compute and memory capacity of the Read Replica. Note that not all instance classes are available in all
     * regions for all DB engines.
     * </p>
     * <p>
     * Valid Values:
     * <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     * <p>
     * Default: Inherits from the source DB instance.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The Amazon EC2 Availability Zone that the Read Replica will be created in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's region.
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
     * Indicates that minor engine upgrades will be applied automatically to the Read Replica during the maintenance
     * window.
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
     * The option group the DB instance will be associated with. If omitted, the default option group for the engine
     * specified will be used.
     * </p>
     */
    private String optionGroupName;
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

    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Specifies a DB subnet group for the DB instance. The new DB instance will be created in the VPC associated with
     * the DB subnet group. If no DB subnet group is specified, then the new DB instance is not created in a VPC.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can only be specified if the source DB instance identifier specifies a DB instance in another region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB subnet group must be in the same region in which the operation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * All Read Replicas in one region that are created from the same source DB instance must either:&gt;
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify DB subnet groups from the same VPC. All these Read Replicas will be created in the same VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not specify a DB subnet group. All these Read Replicas will be created outside of any VPC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
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
     * Specifies the storage type to be associated with the Read Replica.
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
     * True to copy all tags from the Read Replica to snapshots of the Read Replica; otherwise false. The default is
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
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a>.
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
     * If you create an unencrypted Read Replica and specify a value for the <code>KmsKeyId</code> parameter, Amazon RDS
     * encrypts the target Read Replica using the specified KMS encryption key.
     * </p>
     * <p>
     * If you create an encrypted Read Replica from your AWS account, you can specify a value for <code>KmsKeyId</code>
     * to encrypt the Read Replica with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code>
     * , then the Read Replica is encrypted with the same KMS key as the source DB instance.
     * </p>
     * <p>
     * If you create an encrypted Read Replica in a different AWS region, then you must specify a KMS key for the
     * destination AWS region. KMS encryption keys are specific to the region that they are created in, and you cannot
     * use encryption keys from one region in another region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the <code> CreateDBInstanceReadReplica</code> API
     * action in the AWS region that contains the source DB instance. The <code>PreSignedUrl</code> parameter must be
     * used when encrypting a Read Replica from another AWS region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API action that can be
     * executed in the source region that contains the encrypted DB instance. The presigned URL request must contain the
     * following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the Read Replica is created in. This region is the same one
     * where the <code>CreateDBInstanceReadReplica</code> action is called that contains this presigned URL.
     * </p>
     * <p>
     * For example, if you create an encrypted Read Replica in the us-east-1 region, and the source DB instance is in
     * the west-2 region, then you call the <code>CreateDBInstanceReadReplica</code> action in the us-east-1 region and
     * provide a presigned URL that contains a call to the <code>CreateDBInstanceReadReplica</code> action in the
     * us-west-2 region. For this example, the <code>DestinationRegion</code> in the presigned URL must be set to the
     * us-east-1 region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the Read Replica in the destination
     * region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code> action that is called
     * in the destination region, and the action contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted Read Replica to be
     * created. This identifier must be in the Amazon Resource Name (ARN) format for the source region. For example, if
     * you create an encrypted Read Replica from a DB instance in the us-west-2 region, then your
     * <code>SourceDBInstanceIdentifier</code> would look like this example:
     * <code> arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-instance-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     */
    private String preSignedUrl;
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
     *        Must be the identifier of an existing MySQL, MariaDB, or PostgreSQL DB instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5
     *        or later.
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
     *        If the source DB instance is in the same region as the Read Replica, specify a valid DB instance
     *        identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB instance is in a different region than the Read Replica, specify a valid DB instance ARN.
     *        For more information, go to <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *        > Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.
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
     * Must be the identifier of an existing MySQL, MariaDB, or PostgreSQL DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or
     * later.
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
     * If the source DB instance is in the same region as the Read Replica, specify a valid DB instance identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in a different region than the Read Replica, specify a valid DB instance ARN. For
     * more information, go to <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.
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
     *        Must be the identifier of an existing MySQL, MariaDB, or PostgreSQL DB instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5
     *        or later.
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
     *        If the source DB instance is in the same region as the Read Replica, specify a valid DB instance
     *        identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB instance is in a different region than the Read Replica, specify a valid DB instance ARN.
     *        For more information, go to <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *        > Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.
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
     * Must be the identifier of an existing MySQL, MariaDB, or PostgreSQL DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or
     * later.
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
     * If the source DB instance is in the same region as the Read Replica, specify a valid DB instance identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in a different region than the Read Replica, specify a valid DB instance ARN. For
     * more information, go to <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.
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
     *         Must be the identifier of an existing MySQL, MariaDB, or PostgreSQL DB instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5
     *         or later.
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
     *         If the source DB instance is in the same region as the Read Replica, specify a valid DB instance
     *         identifier.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source DB instance is in a different region than the Read Replica, specify a valid DB instance
     *         ARN. For more information, go to <a href=
     *         "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *         > Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.
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
     * Must be the identifier of an existing MySQL, MariaDB, or PostgreSQL DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5 or
     * later.
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
     * If the source DB instance is in the same region as the Read Replica, specify a valid DB instance identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB instance is in a different region than the Read Replica, specify a valid DB instance ARN. For
     * more information, go to <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.
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
     *        Must be the identifier of an existing MySQL, MariaDB, or PostgreSQL DB instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a DB instance that is a MySQL Read Replica only if the source is running MySQL 5.6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can specify a DB instance that is a PostgreSQL DB instance only if the source is running PostgreSQL 9.3.5
     *        or later.
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
     *        If the source DB instance is in the same region as the Read Replica, specify a valid DB instance
     *        identifier.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB instance is in a different region than the Read Replica, specify a valid DB instance ARN.
     *        For more information, go to <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *        > Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.
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
     * The compute and memory capacity of the Read Replica. Note that not all instance classes are available in all
     * regions for all DB engines.
     * </p>
     * <p>
     * Valid Values:
     * <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     * <p>
     * Default: Inherits from the source DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The compute and memory capacity of the Read Replica. Note that not all instance classes are available in
     *        all regions for all DB engines.</p>
     *        <p>
     *        Valid Values:
     *        <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     *        </p>
     *        <p>
     *        Default: Inherits from the source DB instance.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the Read Replica. Note that not all instance classes are available in all
     * regions for all DB engines.
     * </p>
     * <p>
     * Valid Values:
     * <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     * <p>
     * Default: Inherits from the source DB instance.
     * </p>
     * 
     * @return The compute and memory capacity of the Read Replica. Note that not all instance classes are available in
     *         all regions for all DB engines.</p>
     *         <p>
     *         Valid Values:
     *         <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     *         </p>
     *         <p>
     *         Default: Inherits from the source DB instance.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the Read Replica. Note that not all instance classes are available in all
     * regions for all DB engines.
     * </p>
     * <p>
     * Valid Values:
     * <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     * <p>
     * Default: Inherits from the source DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The compute and memory capacity of the Read Replica. Note that not all instance classes are available in
     *        all regions for all DB engines.</p>
     *        <p>
     *        Valid Values:
     *        <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     *        </p>
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
     * The Amazon EC2 Availability Zone that the Read Replica will be created in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * 
     * @param availabilityZone
     *        The Amazon EC2 Availability Zone that the Read Replica will be created in.</p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone in the endpoint's region.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1d</code>
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone that the Read Replica will be created in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * 
     * @return The Amazon EC2 Availability Zone that the Read Replica will be created in.</p>
     *         <p>
     *         Default: A random, system-chosen Availability Zone in the endpoint's region.
     *         </p>
     *         <p>
     *         Example: <code>us-east-1d</code>
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone that the Read Replica will be created in.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * 
     * @param availabilityZone
     *        The Amazon EC2 Availability Zone that the Read Replica will be created in.</p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone in the endpoint's region.
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
     * Indicates that minor engine upgrades will be applied automatically to the Read Replica during the maintenance
     * window.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor engine upgrades will be applied automatically to the Read Replica during the
     *        maintenance window.</p>
     *        <p>
     *        Default: Inherits from the source DB instance
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor engine upgrades will be applied automatically to the Read Replica during the maintenance
     * window.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * 
     * @return Indicates that minor engine upgrades will be applied automatically to the Read Replica during the
     *         maintenance window.</p>
     *         <p>
     *         Default: Inherits from the source DB instance
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor engine upgrades will be applied automatically to the Read Replica during the maintenance
     * window.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor engine upgrades will be applied automatically to the Read Replica during the
     *        maintenance window.</p>
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
     * Indicates that minor engine upgrades will be applied automatically to the Read Replica during the maintenance
     * window.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * 
     * @return Indicates that minor engine upgrades will be applied automatically to the Read Replica during the
     *         maintenance window.</p>
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
     * The option group the DB instance will be associated with. If omitted, the default option group for the engine
     * specified will be used.
     * </p>
     * 
     * @param optionGroupName
     *        The option group the DB instance will be associated with. If omitted, the default option group for the
     *        engine specified will be used.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The option group the DB instance will be associated with. If omitted, the default option group for the engine
     * specified will be used.
     * </p>
     * 
     * @return The option group the DB instance will be associated with. If omitted, the default option group for the
     *         engine specified will be used.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The option group the DB instance will be associated with. If omitted, the default option group for the engine
     * specified will be used.
     * </p>
     * 
     * @param optionGroupName
     *        The option group the DB instance will be associated with. If omitted, the default option group for the
     *        engine specified will be used.
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

    public CreateDBInstanceReadReplicaRequest withPubliclyAccessible(Boolean publiclyAccessible) {
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
     * Specifies a DB subnet group for the DB instance. The new DB instance will be created in the VPC associated with
     * the DB subnet group. If no DB subnet group is specified, then the new DB instance is not created in a VPC.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can only be specified if the source DB instance identifier specifies a DB instance in another region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB subnet group must be in the same region in which the operation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * All Read Replicas in one region that are created from the same source DB instance must either:&gt;
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify DB subnet groups from the same VPC. All these Read Replicas will be created in the same VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not specify a DB subnet group. All these Read Replicas will be created outside of any VPC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        Specifies a DB subnet group for the DB instance. The new DB instance will be created in the VPC associated
     *        with the DB subnet group. If no DB subnet group is specified, then the new DB instance is not created in a
     *        VPC.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can only be specified if the source DB instance identifier specifies a DB instance in another region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The specified DB subnet group must be in the same region in which the operation is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        All Read Replicas in one region that are created from the same source DB instance must either:&gt;
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify DB subnet groups from the same VPC. All these Read Replicas will be created in the same VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not specify a DB subnet group. All these Read Replicas will be created outside of any VPC.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
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
     * Specifies a DB subnet group for the DB instance. The new DB instance will be created in the VPC associated with
     * the DB subnet group. If no DB subnet group is specified, then the new DB instance is not created in a VPC.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can only be specified if the source DB instance identifier specifies a DB instance in another region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB subnet group must be in the same region in which the operation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * All Read Replicas in one region that are created from the same source DB instance must either:&gt;
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify DB subnet groups from the same VPC. All these Read Replicas will be created in the same VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not specify a DB subnet group. All these Read Replicas will be created outside of any VPC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @return Specifies a DB subnet group for the DB instance. The new DB instance will be created in the VPC
     *         associated with the DB subnet group. If no DB subnet group is specified, then the new DB instance is not
     *         created in a VPC.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can only be specified if the source DB instance identifier specifies a DB instance in another region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The specified DB subnet group must be in the same region in which the operation is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         All Read Replicas in one region that are created from the same source DB instance must either:&gt;
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specify DB subnet groups from the same VPC. All these Read Replicas will be created in the same VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not specify a DB subnet group. All these Read Replicas will be created outside of any VPC.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
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
     * Specifies a DB subnet group for the DB instance. The new DB instance will be created in the VPC associated with
     * the DB subnet group. If no DB subnet group is specified, then the new DB instance is not created in a VPC.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can only be specified if the source DB instance identifier specifies a DB instance in another region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The specified DB subnet group must be in the same region in which the operation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * All Read Replicas in one region that are created from the same source DB instance must either:&gt;
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify DB subnet groups from the same VPC. All these Read Replicas will be created in the same VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not specify a DB subnet group. All these Read Replicas will be created outside of any VPC.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        Specifies a DB subnet group for the DB instance. The new DB instance will be created in the VPC associated
     *        with the DB subnet group. If no DB subnet group is specified, then the new DB instance is not created in a
     *        VPC.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can only be specified if the source DB instance identifier specifies a DB instance in another region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The specified DB subnet group must be in the same region in which the operation is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        All Read Replicas in one region that are created from the same source DB instance must either:&gt;
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify DB subnet groups from the same VPC. All these Read Replicas will be created in the same VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not specify a DB subnet group. All these Read Replicas will be created outside of any VPC.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or
     *        hyphens. Must not be default.
     *        </p>
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
     * Specifies the storage type to be associated with the Read Replica.
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
     *        Specifies the storage type to be associated with the Read Replica.</p>
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
     * Specifies the storage type to be associated with the Read Replica.
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
     * @return Specifies the storage type to be associated with the Read Replica.</p>
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
     * Specifies the storage type to be associated with the Read Replica.
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
     *        Specifies the storage type to be associated with the Read Replica.</p>
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

    public CreateDBInstanceReadReplicaRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the Read Replica to snapshots of the Read Replica; otherwise false. The default is
     * false.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        True to copy all tags from the Read Replica to snapshots of the Read Replica; otherwise false. The default
     *        is false.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * True to copy all tags from the Read Replica to snapshots of the Read Replica; otherwise false. The default is
     * false.
     * </p>
     * 
     * @return True to copy all tags from the Read Replica to snapshots of the Read Replica; otherwise false. The
     *         default is false.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * True to copy all tags from the Read Replica to snapshots of the Read Replica; otherwise false. The default is
     * false.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        True to copy all tags from the Read Replica to snapshots of the Read Replica; otherwise false. The default
     *        is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the Read Replica to snapshots of the Read Replica; otherwise false. The default is
     * false.
     * </p>
     * 
     * @return True to copy all tags from the Read Replica to snapshots of the Read Replica; otherwise false. The
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
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. For
     *        example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring
     *        role, go to <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     *        create an IAM role for Amazon RDS Enhanced Monitoring</a>.</p>
     *        <p>
     *        If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     *        <code>MonitoringRoleArn</code> value.
     */

    public void setMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * 
     * @return The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. For
     *         example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring
     *         role, go to <a href=
     *         "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole"
     *         >To create an IAM role for Amazon RDS Enhanced Monitoring</a>.</p>
     *         <p>
     *         If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     *         <code>MonitoringRoleArn</code> value.
     */

    public String getMonitoringRoleArn() {
        return this.monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     * create an IAM role for Amazon RDS Enhanced Monitoring</a>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. For
     *        example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring
     *        role, go to <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">To
     *        create an IAM role for Amazon RDS Enhanced Monitoring</a>.</p>
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
     * If you create an unencrypted Read Replica and specify a value for the <code>KmsKeyId</code> parameter, Amazon RDS
     * encrypts the target Read Replica using the specified KMS encryption key.
     * </p>
     * <p>
     * If you create an encrypted Read Replica from your AWS account, you can specify a value for <code>KmsKeyId</code>
     * to encrypt the Read Replica with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code>
     * , then the Read Replica is encrypted with the same KMS key as the source DB instance.
     * </p>
     * <p>
     * If you create an encrypted Read Replica in a different AWS region, then you must specify a KMS key for the
     * destination AWS region. KMS encryption keys are specific to the region that they are created in, and you cannot
     * use encryption keys from one region in another region.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key ID for an encrypted Read Replica. The KMS key ID is the Amazon Resource Name (ARN), KMS
     *        key identifier, or the KMS key alias for the KMS encryption key. </p>
     *        <p>
     *        If you create an unencrypted Read Replica and specify a value for the <code>KmsKeyId</code> parameter,
     *        Amazon RDS encrypts the target Read Replica using the specified KMS encryption key.
     *        </p>
     *        <p>
     *        If you create an encrypted Read Replica from your AWS account, you can specify a value for
     *        <code>KmsKeyId</code> to encrypt the Read Replica with a new KMS encryption key. If you don't specify a
     *        value for <code>KmsKeyId</code>, then the Read Replica is encrypted with the same KMS key as the source DB
     *        instance.
     *        </p>
     *        <p>
     *        If you create an encrypted Read Replica in a different AWS region, then you must specify a KMS key for the
     *        destination AWS region. KMS encryption keys are specific to the region that they are created in, and you
     *        cannot use encryption keys from one region in another region.
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
     * If you create an unencrypted Read Replica and specify a value for the <code>KmsKeyId</code> parameter, Amazon RDS
     * encrypts the target Read Replica using the specified KMS encryption key.
     * </p>
     * <p>
     * If you create an encrypted Read Replica from your AWS account, you can specify a value for <code>KmsKeyId</code>
     * to encrypt the Read Replica with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code>
     * , then the Read Replica is encrypted with the same KMS key as the source DB instance.
     * </p>
     * <p>
     * If you create an encrypted Read Replica in a different AWS region, then you must specify a KMS key for the
     * destination AWS region. KMS encryption keys are specific to the region that they are created in, and you cannot
     * use encryption keys from one region in another region.
     * </p>
     * 
     * @return The AWS KMS key ID for an encrypted Read Replica. The KMS key ID is the Amazon Resource Name (ARN), KMS
     *         key identifier, or the KMS key alias for the KMS encryption key. </p>
     *         <p>
     *         If you create an unencrypted Read Replica and specify a value for the <code>KmsKeyId</code> parameter,
     *         Amazon RDS encrypts the target Read Replica using the specified KMS encryption key.
     *         </p>
     *         <p>
     *         If you create an encrypted Read Replica from your AWS account, you can specify a value for
     *         <code>KmsKeyId</code> to encrypt the Read Replica with a new KMS encryption key. If you don't specify a
     *         value for <code>KmsKeyId</code>, then the Read Replica is encrypted with the same KMS key as the source
     *         DB instance.
     *         </p>
     *         <p>
     *         If you create an encrypted Read Replica in a different AWS region, then you must specify a KMS key for
     *         the destination AWS region. KMS encryption keys are specific to the region that they are created in, and
     *         you cannot use encryption keys from one region in another region.
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
     * If you create an unencrypted Read Replica and specify a value for the <code>KmsKeyId</code> parameter, Amazon RDS
     * encrypts the target Read Replica using the specified KMS encryption key.
     * </p>
     * <p>
     * If you create an encrypted Read Replica from your AWS account, you can specify a value for <code>KmsKeyId</code>
     * to encrypt the Read Replica with a new KMS encryption key. If you don't specify a value for <code>KmsKeyId</code>
     * , then the Read Replica is encrypted with the same KMS key as the source DB instance.
     * </p>
     * <p>
     * If you create an encrypted Read Replica in a different AWS region, then you must specify a KMS key for the
     * destination AWS region. KMS encryption keys are specific to the region that they are created in, and you cannot
     * use encryption keys from one region in another region.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key ID for an encrypted Read Replica. The KMS key ID is the Amazon Resource Name (ARN), KMS
     *        key identifier, or the KMS key alias for the KMS encryption key. </p>
     *        <p>
     *        If you create an unencrypted Read Replica and specify a value for the <code>KmsKeyId</code> parameter,
     *        Amazon RDS encrypts the target Read Replica using the specified KMS encryption key.
     *        </p>
     *        <p>
     *        If you create an encrypted Read Replica from your AWS account, you can specify a value for
     *        <code>KmsKeyId</code> to encrypt the Read Replica with a new KMS encryption key. If you don't specify a
     *        value for <code>KmsKeyId</code>, then the Read Replica is encrypted with the same KMS key as the source DB
     *        instance.
     *        </p>
     *        <p>
     *        If you create an encrypted Read Replica in a different AWS region, then you must specify a KMS key for the
     *        destination AWS region. KMS encryption keys are specific to the region that they are created in, and you
     *        cannot use encryption keys from one region in another region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the <code> CreateDBInstanceReadReplica</code> API
     * action in the AWS region that contains the source DB instance. The <code>PreSignedUrl</code> parameter must be
     * used when encrypting a Read Replica from another AWS region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API action that can be
     * executed in the source region that contains the encrypted DB instance. The presigned URL request must contain the
     * following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the Read Replica is created in. This region is the same one
     * where the <code>CreateDBInstanceReadReplica</code> action is called that contains this presigned URL.
     * </p>
     * <p>
     * For example, if you create an encrypted Read Replica in the us-east-1 region, and the source DB instance is in
     * the west-2 region, then you call the <code>CreateDBInstanceReadReplica</code> action in the us-east-1 region and
     * provide a presigned URL that contains a call to the <code>CreateDBInstanceReadReplica</code> action in the
     * us-west-2 region. For this example, the <code>DestinationRegion</code> in the presigned URL must be set to the
     * us-east-1 region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the Read Replica in the destination
     * region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code> action that is called
     * in the destination region, and the action contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted Read Replica to be
     * created. This identifier must be in the Amazon Resource Name (ARN) format for the source region. For example, if
     * you create an encrypted Read Replica from a DB instance in the us-west-2 region, then your
     * <code>SourceDBInstanceIdentifier</code> would look like this example:
     * <code> arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-instance-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * 
     * @param preSignedUrl
     *        The URL that contains a Signature Version 4 signed request for the
     *        <code> CreateDBInstanceReadReplica</code> API action in the AWS region that contains the source DB
     *        instance. The <code>PreSignedUrl</code> parameter must be used when encrypting a Read Replica from another
     *        AWS region.</p>
     *        <p>
     *        The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API action that
     *        can be executed in the source region that contains the encrypted DB instance. The presigned URL request
     *        must contain the following parameter values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DestinationRegion</code> - The AWS Region that the Read Replica is created in. This region is the
     *        same one where the <code>CreateDBInstanceReadReplica</code> action is called that contains this presigned
     *        URL.
     *        </p>
     *        <p>
     *        For example, if you create an encrypted Read Replica in the us-east-1 region, and the source DB instance
     *        is in the west-2 region, then you call the <code>CreateDBInstanceReadReplica</code> action in the
     *        us-east-1 region and provide a presigned URL that contains a call to the
     *        <code>CreateDBInstanceReadReplica</code> action in the us-west-2 region. For this example, the
     *        <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the Read Replica in the
     *        destination region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code>
     *        action that is called in the destination region, and the action contained in the presigned URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted Read Replica to be
     *        created. This identifier must be in the Amazon Resource Name (ARN) format for the source region. For
     *        example, if you create an encrypted Read Replica from a DB instance in the us-west-2 region, then your
     *        <code>SourceDBInstanceIdentifier</code> would look like this example:
     *        <code> arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-instance-20161115</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn how to generate a Signature Version 4 signed request, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating
     *        Requests: Using Query Parameters (AWS Signature Version 4)</a> and <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     *        Process</a>.
     */

    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the <code> CreateDBInstanceReadReplica</code> API
     * action in the AWS region that contains the source DB instance. The <code>PreSignedUrl</code> parameter must be
     * used when encrypting a Read Replica from another AWS region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API action that can be
     * executed in the source region that contains the encrypted DB instance. The presigned URL request must contain the
     * following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the Read Replica is created in. This region is the same one
     * where the <code>CreateDBInstanceReadReplica</code> action is called that contains this presigned URL.
     * </p>
     * <p>
     * For example, if you create an encrypted Read Replica in the us-east-1 region, and the source DB instance is in
     * the west-2 region, then you call the <code>CreateDBInstanceReadReplica</code> action in the us-east-1 region and
     * provide a presigned URL that contains a call to the <code>CreateDBInstanceReadReplica</code> action in the
     * us-west-2 region. For this example, the <code>DestinationRegion</code> in the presigned URL must be set to the
     * us-east-1 region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the Read Replica in the destination
     * region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code> action that is called
     * in the destination region, and the action contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted Read Replica to be
     * created. This identifier must be in the Amazon Resource Name (ARN) format for the source region. For example, if
     * you create an encrypted Read Replica from a DB instance in the us-west-2 region, then your
     * <code>SourceDBInstanceIdentifier</code> would look like this example:
     * <code> arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-instance-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * 
     * @return The URL that contains a Signature Version 4 signed request for the
     *         <code> CreateDBInstanceReadReplica</code> API action in the AWS region that contains the source DB
     *         instance. The <code>PreSignedUrl</code> parameter must be used when encrypting a Read Replica from
     *         another AWS region.</p>
     *         <p>
     *         The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API action
     *         that can be executed in the source region that contains the encrypted DB instance. The presigned URL
     *         request must contain the following parameter values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DestinationRegion</code> - The AWS Region that the Read Replica is created in. This region is the
     *         same one where the <code>CreateDBInstanceReadReplica</code> action is called that contains this presigned
     *         URL.
     *         </p>
     *         <p>
     *         For example, if you create an encrypted Read Replica in the us-east-1 region, and the source DB instance
     *         is in the west-2 region, then you call the <code>CreateDBInstanceReadReplica</code> action in the
     *         us-east-1 region and provide a presigned URL that contains a call to the
     *         <code>CreateDBInstanceReadReplica</code> action in the us-west-2 region. For this example, the
     *         <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the Read Replica in the
     *         destination region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code>
     *         action that is called in the destination region, and the action contained in the presigned URL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted Read Replica to be
     *         created. This identifier must be in the Amazon Resource Name (ARN) format for the source region. For
     *         example, if you create an encrypted Read Replica from a DB instance in the us-west-2 region, then your
     *         <code>SourceDBInstanceIdentifier</code> would look like this example:
     *         <code> arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-instance-20161115</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To learn how to generate a Signature Version 4 signed request, see <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating
     *         Requests: Using Query Parameters (AWS Signature Version 4)</a> and <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     *         Process</a>.
     */

    public String getPreSignedUrl() {
        return this.preSignedUrl;
    }

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the <code> CreateDBInstanceReadReplica</code> API
     * action in the AWS region that contains the source DB instance. The <code>PreSignedUrl</code> parameter must be
     * used when encrypting a Read Replica from another AWS region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API action that can be
     * executed in the source region that contains the encrypted DB instance. The presigned URL request must contain the
     * following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the Read Replica is created in. This region is the same one
     * where the <code>CreateDBInstanceReadReplica</code> action is called that contains this presigned URL.
     * </p>
     * <p>
     * For example, if you create an encrypted Read Replica in the us-east-1 region, and the source DB instance is in
     * the west-2 region, then you call the <code>CreateDBInstanceReadReplica</code> action in the us-east-1 region and
     * provide a presigned URL that contains a call to the <code>CreateDBInstanceReadReplica</code> action in the
     * us-west-2 region. For this example, the <code>DestinationRegion</code> in the presigned URL must be set to the
     * us-east-1 region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the Read Replica in the destination
     * region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code> action that is called
     * in the destination region, and the action contained in the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted Read Replica to be
     * created. This identifier must be in the Amazon Resource Name (ARN) format for the source region. For example, if
     * you create an encrypted Read Replica from a DB instance in the us-west-2 region, then your
     * <code>SourceDBInstanceIdentifier</code> would look like this example:
     * <code> arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-instance-20161115</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating Requests:
     * Using Query Parameters (AWS Signature Version 4)</a> and <a
     * href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     * Process</a>.
     * </p>
     * 
     * @param preSignedUrl
     *        The URL that contains a Signature Version 4 signed request for the
     *        <code> CreateDBInstanceReadReplica</code> API action in the AWS region that contains the source DB
     *        instance. The <code>PreSignedUrl</code> parameter must be used when encrypting a Read Replica from another
     *        AWS region.</p>
     *        <p>
     *        The presigned URL must be a valid request for the <code>CreateDBInstanceReadReplica</code> API action that
     *        can be executed in the source region that contains the encrypted DB instance. The presigned URL request
     *        must contain the following parameter values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DestinationRegion</code> - The AWS Region that the Read Replica is created in. This region is the
     *        same one where the <code>CreateDBInstanceReadReplica</code> action is called that contains this presigned
     *        URL.
     *        </p>
     *        <p>
     *        For example, if you create an encrypted Read Replica in the us-east-1 region, and the source DB instance
     *        is in the west-2 region, then you call the <code>CreateDBInstanceReadReplica</code> action in the
     *        us-east-1 region and provide a presigned URL that contains a call to the
     *        <code>CreateDBInstanceReadReplica</code> action in the us-west-2 region. For this example, the
     *        <code>DestinationRegion</code> in the presigned URL must be set to the us-east-1 region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt the Read Replica in the
     *        destination region. This is the same identifier for both the <code>CreateDBInstanceReadReplica</code>
     *        action that is called in the destination region, and the action contained in the presigned URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SourceDBInstanceIdentifier</code> - The DB instance identifier for the encrypted Read Replica to be
     *        created. This identifier must be in the Amazon Resource Name (ARN) format for the source region. For
     *        example, if you create an encrypted Read Replica from a DB instance in the us-west-2 region, then your
     *        <code>SourceDBInstanceIdentifier</code> would look like this example:
     *        <code> arn:aws:rds:us-west-2:123456789012:instance:mysql-instance1-instance-20161115</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To learn how to generate a Signature Version 4 signed request, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"> Authenticating
     *        Requests: Using Query Parameters (AWS Signature Version 4)</a> and <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing
     *        Process</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceReadReplicaRequest withPreSignedUrl(String preSignedUrl) {
        setPreSignedUrl(preSignedUrl);
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

    public CreateDBInstanceReadReplicaRequest withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
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
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode());
        hashCode = prime * hashCode + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPreSignedUrl() == null) ? 0 : getPreSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBInstanceReadReplicaRequest clone() {
        return (CreateDBInstanceReadReplicaRequest) super.clone();
    }

}
