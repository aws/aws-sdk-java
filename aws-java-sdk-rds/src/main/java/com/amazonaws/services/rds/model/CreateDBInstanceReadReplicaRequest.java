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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBInstanceReadReplica(CreateDBInstanceReadReplicaRequest) CreateDBInstanceReadReplica operation}.
 * <p>
 * Creates a DB instance for a DB instance running MySQL, MariaDB, or
 * PostgreSQL that acts as a Read Replica of a source DB instance.
 * </p>
 * <p>
 * All Read Replica DB instances are created as Single-AZ deployments
 * with backups disabled. All other DB instance attributes (including DB
 * security groups and DB parameter groups) are inherited from the source
 * DB instance, except as specified below.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> The source DB instance must have backup retention
 * enabled.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBInstanceReadReplica(CreateDBInstanceReadReplicaRequest)
 */
public class CreateDBInstanceReadReplicaRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The DB instance identifier of the Read Replica. This identifier is the
     * unique key that identifies a DB instance. This parameter is stored as
     * a lowercase string.
     */
    private String dBInstanceIdentifier;

    /**
     * The identifier of the DB instance that will act as the source for the
     * Read Replica. Each DB instance can have up to five Read Replicas.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing MySQL,
     * MariaDB, or PostgreSQL DB instance.</li> <li>Can specify a DB instance
     * that is a MySQL Read Replica only if the source is running MySQL
     * 5.6.</li> <li>Can specify a DB instance that is a PostgreSQL Read
     * Replica only if the source is running PostgreSQL 9.3.5.</li> <li>The
     * specified DB instance must have automatic backups enabled, its backup
     * retention period must be greater than 0.</li> <li>If the source DB
     * instance is in the same region as the Read Replica, specify a valid DB
     * instance identifier.</li> <li>If the source DB instance is in a
     * different region than the Read Replica, specify a valid DB instance
     * ARN. For more information, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.</li> </ul>
     */
    private String sourceDBInstanceIdentifier;

    /**
     * The compute and memory capacity of the Read Replica. <p> Valid Values:
     * <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge |
     * db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium |
     * db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large |
     * db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge |
     * db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge |
     * db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium |
     * db.t2.large</code> <p>Default: Inherits from the source DB instance.
     */
    private String dBInstanceClass;

    /**
     * The Amazon EC2 Availability Zone that the Read Replica will be created
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code>
     */
    private String availabilityZone;

    /**
     * The port number that the DB instance uses for connections. <p>Default:
     * Inherits from the source DB instance <p>Valid Values:
     * <code>1150-65535</code>
     */
    private Integer port;

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Read Replica during the maintenance window. <p>Default: Inherits
     * from the source DB instance
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance.
     */
    private Integer iops;

    /**
     * The option group the DB instance will be associated with. If omitted,
     * the default option group for the engine specified will be used.
     */
    private String optionGroupName;

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
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Specifies a DB subnet group for the DB instance. The new DB instance
     * will be created in the VPC associated with the DB subnet group. If no
     * DB subnet group is specified, then the new DB instance is not created
     * in a VPC. <p>Constraints: <ul> <li>Can only be specified if the source
     * DB instance identifier specifies a DB instance in another region.</li>
     * <li>The specified DB subnet group must be in the same region in which
     * the operation is running.</li> <li> All Read Replicas in one region
     * that are created from the same source DB instance must either:
     * <ul><li>Specify DB subnet groups from the same VPC. All these Read
     * Replicas will be created in the same VPC.</li><li>Not specify a DB
     * subnet group. All these Read Replicas will be created outside of any
     * VPC.</li></ul></li> </ul> <p>Constraints: Must contain no more than
     * 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * Must not be default. <p>Example: <code>mySubnetgroup</code>
     */
    private String dBSubnetGroupName;

    /**
     * Specifies the storage type to be associated with the Read Replica. <p>
     * Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     * <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     * <code>Iops</code> parameter is specified; otherwise
     * <code>standard</code>
     */
    private String storageType;

    /**
     * True to copy all tags from the Read Replica to snapshots of the Read
     * Replica; otherwise false. The default is false.
     */
    private Boolean copyTagsToSnapshot;

    /**
     * The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the Read Replica. To disable collecting
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
     * Default constructor for a new CreateDBInstanceReadReplicaRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateDBInstanceReadReplicaRequest() {}
    
    /**
     * Constructs a new CreateDBInstanceReadReplicaRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBInstanceIdentifier The DB instance identifier of the Read
     * Replica. This identifier is the unique key that identifies a DB
     * instance. This parameter is stored as a lowercase string.
     * @param sourceDBInstanceIdentifier The identifier of the DB instance
     * that will act as the source for the Read Replica. Each DB instance can
     * have up to five Read Replicas. <p>Constraints: <ul> <li>Must be the
     * identifier of an existing MySQL, MariaDB, or PostgreSQL DB
     * instance.</li> <li>Can specify a DB instance that is a MySQL Read
     * Replica only if the source is running MySQL 5.6.</li> <li>Can specify
     * a DB instance that is a PostgreSQL Read Replica only if the source is
     * running PostgreSQL 9.3.5.</li> <li>The specified DB instance must have
     * automatic backups enabled, its backup retention period must be greater
     * than 0.</li> <li>If the source DB instance is in the same region as
     * the Read Replica, specify a valid DB instance identifier.</li> <li>If
     * the source DB instance is in a different region than the Read Replica,
     * specify a valid DB instance ARN. For more information, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.</li> </ul>
     */
    public CreateDBInstanceReadReplicaRequest(String dBInstanceIdentifier, String sourceDBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        setSourceDBInstanceIdentifier(sourceDBInstanceIdentifier);
    }

    /**
     * The DB instance identifier of the Read Replica. This identifier is the
     * unique key that identifies a DB instance. This parameter is stored as
     * a lowercase string.
     *
     * @return The DB instance identifier of the Read Replica. This identifier is the
     *         unique key that identifies a DB instance. This parameter is stored as
     *         a lowercase string.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier of the Read Replica. This identifier is the
     * unique key that identifies a DB instance. This parameter is stored as
     * a lowercase string.
     *
     * @param dBInstanceIdentifier The DB instance identifier of the Read Replica. This identifier is the
     *         unique key that identifies a DB instance. This parameter is stored as
     *         a lowercase string.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier of the Read Replica. This identifier is the
     * unique key that identifies a DB instance. This parameter is stored as
     * a lowercase string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB instance identifier of the Read Replica. This identifier is the
     *         unique key that identifies a DB instance. This parameter is stored as
     *         a lowercase string.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * The identifier of the DB instance that will act as the source for the
     * Read Replica. Each DB instance can have up to five Read Replicas.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing MySQL,
     * MariaDB, or PostgreSQL DB instance.</li> <li>Can specify a DB instance
     * that is a MySQL Read Replica only if the source is running MySQL
     * 5.6.</li> <li>Can specify a DB instance that is a PostgreSQL Read
     * Replica only if the source is running PostgreSQL 9.3.5.</li> <li>The
     * specified DB instance must have automatic backups enabled, its backup
     * retention period must be greater than 0.</li> <li>If the source DB
     * instance is in the same region as the Read Replica, specify a valid DB
     * instance identifier.</li> <li>If the source DB instance is in a
     * different region than the Read Replica, specify a valid DB instance
     * ARN. For more information, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.</li> </ul>
     *
     * @return The identifier of the DB instance that will act as the source for the
     *         Read Replica. Each DB instance can have up to five Read Replicas.
     *         <p>Constraints: <ul> <li>Must be the identifier of an existing MySQL,
     *         MariaDB, or PostgreSQL DB instance.</li> <li>Can specify a DB instance
     *         that is a MySQL Read Replica only if the source is running MySQL
     *         5.6.</li> <li>Can specify a DB instance that is a PostgreSQL Read
     *         Replica only if the source is running PostgreSQL 9.3.5.</li> <li>The
     *         specified DB instance must have automatic backups enabled, its backup
     *         retention period must be greater than 0.</li> <li>If the source DB
     *         instance is in the same region as the Read Replica, specify a valid DB
     *         instance identifier.</li> <li>If the source DB instance is in a
     *         different region than the Read Replica, specify a valid DB instance
     *         ARN. For more information, go to <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.</li> </ul>
     */
    public String getSourceDBInstanceIdentifier() {
        return sourceDBInstanceIdentifier;
    }
    
    /**
     * The identifier of the DB instance that will act as the source for the
     * Read Replica. Each DB instance can have up to five Read Replicas.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing MySQL,
     * MariaDB, or PostgreSQL DB instance.</li> <li>Can specify a DB instance
     * that is a MySQL Read Replica only if the source is running MySQL
     * 5.6.</li> <li>Can specify a DB instance that is a PostgreSQL Read
     * Replica only if the source is running PostgreSQL 9.3.5.</li> <li>The
     * specified DB instance must have automatic backups enabled, its backup
     * retention period must be greater than 0.</li> <li>If the source DB
     * instance is in the same region as the Read Replica, specify a valid DB
     * instance identifier.</li> <li>If the source DB instance is in a
     * different region than the Read Replica, specify a valid DB instance
     * ARN. For more information, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.</li> </ul>
     *
     * @param sourceDBInstanceIdentifier The identifier of the DB instance that will act as the source for the
     *         Read Replica. Each DB instance can have up to five Read Replicas.
     *         <p>Constraints: <ul> <li>Must be the identifier of an existing MySQL,
     *         MariaDB, or PostgreSQL DB instance.</li> <li>Can specify a DB instance
     *         that is a MySQL Read Replica only if the source is running MySQL
     *         5.6.</li> <li>Can specify a DB instance that is a PostgreSQL Read
     *         Replica only if the source is running PostgreSQL 9.3.5.</li> <li>The
     *         specified DB instance must have automatic backups enabled, its backup
     *         retention period must be greater than 0.</li> <li>If the source DB
     *         instance is in the same region as the Read Replica, specify a valid DB
     *         instance identifier.</li> <li>If the source DB instance is in a
     *         different region than the Read Replica, specify a valid DB instance
     *         ARN. For more information, go to <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.</li> </ul>
     */
    public void setSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
    }
    
    /**
     * The identifier of the DB instance that will act as the source for the
     * Read Replica. Each DB instance can have up to five Read Replicas.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing MySQL,
     * MariaDB, or PostgreSQL DB instance.</li> <li>Can specify a DB instance
     * that is a MySQL Read Replica only if the source is running MySQL
     * 5.6.</li> <li>Can specify a DB instance that is a PostgreSQL Read
     * Replica only if the source is running PostgreSQL 9.3.5.</li> <li>The
     * specified DB instance must have automatic backups enabled, its backup
     * retention period must be greater than 0.</li> <li>If the source DB
     * instance is in the same region as the Read Replica, specify a valid DB
     * instance identifier.</li> <li>If the source DB instance is in a
     * different region than the Read Replica, specify a valid DB instance
     * ARN. For more information, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDBInstanceIdentifier The identifier of the DB instance that will act as the source for the
     *         Read Replica. Each DB instance can have up to five Read Replicas.
     *         <p>Constraints: <ul> <li>Must be the identifier of an existing MySQL,
     *         MariaDB, or PostgreSQL DB instance.</li> <li>Can specify a DB instance
     *         that is a MySQL Read Replica only if the source is running MySQL
     *         5.6.</li> <li>Can specify a DB instance that is a PostgreSQL Read
     *         Replica only if the source is running PostgreSQL 9.3.5.</li> <li>The
     *         specified DB instance must have automatic backups enabled, its backup
     *         retention period must be greater than 0.</li> <li>If the source DB
     *         instance is in the same region as the Read Replica, specify a valid DB
     *         instance identifier.</li> <li>If the source DB instance is in a
     *         different region than the Read Replica, specify a valid DB instance
     *         ARN. For more information, go to <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing a Amazon RDS Amazon Resource Name (ARN)</a>.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
        return this;
    }

    /**
     * The compute and memory capacity of the Read Replica. <p> Valid Values:
     * <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge |
     * db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium |
     * db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large |
     * db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge |
     * db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge |
     * db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium |
     * db.t2.large</code> <p>Default: Inherits from the source DB instance.
     *
     * @return The compute and memory capacity of the Read Replica. <p> Valid Values:
     *         <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge |
     *         db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium |
     *         db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large |
     *         db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge |
     *         db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge |
     *         db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium |
     *         db.t2.large</code> <p>Default: Inherits from the source DB instance.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the Read Replica. <p> Valid Values:
     * <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge |
     * db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium |
     * db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large |
     * db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge |
     * db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge |
     * db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium |
     * db.t2.large</code> <p>Default: Inherits from the source DB instance.
     *
     * @param dBInstanceClass The compute and memory capacity of the Read Replica. <p> Valid Values:
     *         <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge |
     *         db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium |
     *         db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large |
     *         db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge |
     *         db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge |
     *         db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium |
     *         db.t2.large</code> <p>Default: Inherits from the source DB instance.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the Read Replica. <p> Valid Values:
     * <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge |
     * db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium |
     * db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large |
     * db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge |
     * db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge |
     * db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium |
     * db.t2.large</code> <p>Default: Inherits from the source DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The compute and memory capacity of the Read Replica. <p> Valid Values:
     *         <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge |
     *         db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium |
     *         db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large |
     *         db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge |
     *         db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge |
     *         db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium |
     *         db.t2.large</code> <p>Default: Inherits from the source DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * The Amazon EC2 Availability Zone that the Read Replica will be created
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code>
     *
     * @return The Amazon EC2 Availability Zone that the Read Replica will be created
     *         in. <p> Default: A random, system-chosen Availability Zone in the
     *         endpoint's region. <p> Example: <code>us-east-1d</code>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Amazon EC2 Availability Zone that the Read Replica will be created
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code>
     *
     * @param availabilityZone The Amazon EC2 Availability Zone that the Read Replica will be created
     *         in. <p> Default: A random, system-chosen Availability Zone in the
     *         endpoint's region. <p> Example: <code>us-east-1d</code>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Amazon EC2 Availability Zone that the Read Replica will be created
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Amazon EC2 Availability Zone that the Read Replica will be created
     *         in. <p> Default: A random, system-chosen Availability Zone in the
     *         endpoint's region. <p> Example: <code>us-east-1d</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The port number that the DB instance uses for connections. <p>Default:
     * Inherits from the source DB instance <p>Valid Values:
     * <code>1150-65535</code>
     *
     * @return The port number that the DB instance uses for connections. <p>Default:
     *         Inherits from the source DB instance <p>Valid Values:
     *         <code>1150-65535</code>
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number that the DB instance uses for connections. <p>Default:
     * Inherits from the source DB instance <p>Valid Values:
     * <code>1150-65535</code>
     *
     * @param port The port number that the DB instance uses for connections. <p>Default:
     *         Inherits from the source DB instance <p>Valid Values:
     *         <code>1150-65535</code>
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number that the DB instance uses for connections. <p>Default:
     * Inherits from the source DB instance <p>Valid Values:
     * <code>1150-65535</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number that the DB instance uses for connections. <p>Default:
     *         Inherits from the source DB instance <p>Valid Values:
     *         <code>1150-65535</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Read Replica during the maintenance window. <p>Default: Inherits
     * from the source DB instance
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
     *         the Read Replica during the maintenance window. <p>Default: Inherits
     *         from the source DB instance
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Read Replica during the maintenance window. <p>Default: Inherits
     * from the source DB instance
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the Read Replica during the maintenance window. <p>Default: Inherits
     *         from the source DB instance
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Read Replica during the maintenance window. <p>Default: Inherits
     * from the source DB instance
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the Read Replica during the maintenance window. <p>Default: Inherits
     *         from the source DB instance
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the Read Replica during the maintenance window. <p>Default: Inherits
     * from the source DB instance
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
     *         the Read Replica during the maintenance window. <p>Default: Inherits
     *         from the source DB instance
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance.
     *
     * @return The amount of Provisioned IOPS (input/output operations per second) to
     *         be initially allocated for the DB instance.
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance.
     *
     * @param iops The amount of Provisioned IOPS (input/output operations per second) to
     *         be initially allocated for the DB instance.
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iops The amount of Provisioned IOPS (input/output operations per second) to
     *         be initially allocated for the DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * The option group the DB instance will be associated with. If omitted,
     * the default option group for the engine specified will be used.
     *
     * @return The option group the DB instance will be associated with. If omitted,
     *         the default option group for the engine specified will be used.
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * The option group the DB instance will be associated with. If omitted,
     * the default option group for the engine specified will be used.
     *
     * @param optionGroupName The option group the DB instance will be associated with. If omitted,
     *         the default option group for the engine specified will be used.
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * The option group the DB instance will be associated with. If omitted,
     * the default option group for the engine specified will be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName The option group the DB instance will be associated with. If omitted,
     *         the default option group for the engine specified will be used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
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
    public CreateDBInstanceReadReplicaRequest withPubliclyAccessible(Boolean publiclyAccessible) {
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
    public CreateDBInstanceReadReplicaRequest withTags(Tag... tags) {
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
    public CreateDBInstanceReadReplicaRequest withTags(java.util.Collection<Tag> tags) {
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
     * Specifies a DB subnet group for the DB instance. The new DB instance
     * will be created in the VPC associated with the DB subnet group. If no
     * DB subnet group is specified, then the new DB instance is not created
     * in a VPC. <p>Constraints: <ul> <li>Can only be specified if the source
     * DB instance identifier specifies a DB instance in another region.</li>
     * <li>The specified DB subnet group must be in the same region in which
     * the operation is running.</li> <li> All Read Replicas in one region
     * that are created from the same source DB instance must either:
     * <ul><li>Specify DB subnet groups from the same VPC. All these Read
     * Replicas will be created in the same VPC.</li><li>Not specify a DB
     * subnet group. All these Read Replicas will be created outside of any
     * VPC.</li></ul></li> </ul> <p>Constraints: Must contain no more than
     * 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * Must not be default. <p>Example: <code>mySubnetgroup</code>
     *
     * @return Specifies a DB subnet group for the DB instance. The new DB instance
     *         will be created in the VPC associated with the DB subnet group. If no
     *         DB subnet group is specified, then the new DB instance is not created
     *         in a VPC. <p>Constraints: <ul> <li>Can only be specified if the source
     *         DB instance identifier specifies a DB instance in another region.</li>
     *         <li>The specified DB subnet group must be in the same region in which
     *         the operation is running.</li> <li> All Read Replicas in one region
     *         that are created from the same source DB instance must either:
     *         <ul><li>Specify DB subnet groups from the same VPC. All these Read
     *         Replicas will be created in the same VPC.</li><li>Not specify a DB
     *         subnet group. All these Read Replicas will be created outside of any
     *         VPC.</li></ul></li> </ul> <p>Constraints: Must contain no more than
     *         255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     *         Must not be default. <p>Example: <code>mySubnetgroup</code>
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }
    
    /**
     * Specifies a DB subnet group for the DB instance. The new DB instance
     * will be created in the VPC associated with the DB subnet group. If no
     * DB subnet group is specified, then the new DB instance is not created
     * in a VPC. <p>Constraints: <ul> <li>Can only be specified if the source
     * DB instance identifier specifies a DB instance in another region.</li>
     * <li>The specified DB subnet group must be in the same region in which
     * the operation is running.</li> <li> All Read Replicas in one region
     * that are created from the same source DB instance must either:
     * <ul><li>Specify DB subnet groups from the same VPC. All these Read
     * Replicas will be created in the same VPC.</li><li>Not specify a DB
     * subnet group. All these Read Replicas will be created outside of any
     * VPC.</li></ul></li> </ul> <p>Constraints: Must contain no more than
     * 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * Must not be default. <p>Example: <code>mySubnetgroup</code>
     *
     * @param dBSubnetGroupName Specifies a DB subnet group for the DB instance. The new DB instance
     *         will be created in the VPC associated with the DB subnet group. If no
     *         DB subnet group is specified, then the new DB instance is not created
     *         in a VPC. <p>Constraints: <ul> <li>Can only be specified if the source
     *         DB instance identifier specifies a DB instance in another region.</li>
     *         <li>The specified DB subnet group must be in the same region in which
     *         the operation is running.</li> <li> All Read Replicas in one region
     *         that are created from the same source DB instance must either:
     *         <ul><li>Specify DB subnet groups from the same VPC. All these Read
     *         Replicas will be created in the same VPC.</li><li>Not specify a DB
     *         subnet group. All these Read Replicas will be created outside of any
     *         VPC.</li></ul></li> </ul> <p>Constraints: Must contain no more than
     *         255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     *         Must not be default. <p>Example: <code>mySubnetgroup</code>
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }
    
    /**
     * Specifies a DB subnet group for the DB instance. The new DB instance
     * will be created in the VPC associated with the DB subnet group. If no
     * DB subnet group is specified, then the new DB instance is not created
     * in a VPC. <p>Constraints: <ul> <li>Can only be specified if the source
     * DB instance identifier specifies a DB instance in another region.</li>
     * <li>The specified DB subnet group must be in the same region in which
     * the operation is running.</li> <li> All Read Replicas in one region
     * that are created from the same source DB instance must either:
     * <ul><li>Specify DB subnet groups from the same VPC. All these Read
     * Replicas will be created in the same VPC.</li><li>Not specify a DB
     * subnet group. All these Read Replicas will be created outside of any
     * VPC.</li></ul></li> </ul> <p>Constraints: Must contain no more than
     * 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * Must not be default. <p>Example: <code>mySubnetgroup</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroupName Specifies a DB subnet group for the DB instance. The new DB instance
     *         will be created in the VPC associated with the DB subnet group. If no
     *         DB subnet group is specified, then the new DB instance is not created
     *         in a VPC. <p>Constraints: <ul> <li>Can only be specified if the source
     *         DB instance identifier specifies a DB instance in another region.</li>
     *         <li>The specified DB subnet group must be in the same region in which
     *         the operation is running.</li> <li> All Read Replicas in one region
     *         that are created from the same source DB instance must either:
     *         <ul><li>Specify DB subnet groups from the same VPC. All these Read
     *         Replicas will be created in the same VPC.</li><li>Not specify a DB
     *         subnet group. All these Read Replicas will be created outside of any
     *         VPC.</li></ul></li> </ul> <p>Constraints: Must contain no more than
     *         255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     *         Must not be default. <p>Example: <code>mySubnetgroup</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * Specifies the storage type to be associated with the Read Replica. <p>
     * Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     * <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     * <code>Iops</code> parameter is specified; otherwise
     * <code>standard</code>
     *
     * @return Specifies the storage type to be associated with the Read Replica. <p>
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
     * Specifies the storage type to be associated with the Read Replica. <p>
     * Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     * <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     * <code>Iops</code> parameter is specified; otherwise
     * <code>standard</code>
     *
     * @param storageType Specifies the storage type to be associated with the Read Replica. <p>
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
     * Specifies the storage type to be associated with the Read Replica. <p>
     * Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     * <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     * <code>Iops</code> parameter is specified; otherwise
     * <code>standard</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param storageType Specifies the storage type to be associated with the Read Replica. <p>
     *         Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     *         <code>io1</code>, you must also include a value for the
     *         <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     *         <code>Iops</code> parameter is specified; otherwise
     *         <code>standard</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * True to copy all tags from the Read Replica to snapshots of the Read
     * Replica; otherwise false. The default is false.
     *
     * @return True to copy all tags from the Read Replica to snapshots of the Read
     *         Replica; otherwise false. The default is false.
     */
    public Boolean isCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }
    
    /**
     * True to copy all tags from the Read Replica to snapshots of the Read
     * Replica; otherwise false. The default is false.
     *
     * @param copyTagsToSnapshot True to copy all tags from the Read Replica to snapshots of the Read
     *         Replica; otherwise false. The default is false.
     */
    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }
    
    /**
     * True to copy all tags from the Read Replica to snapshots of the Read
     * Replica; otherwise false. The default is false.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param copyTagsToSnapshot True to copy all tags from the Read Replica to snapshots of the Read
     *         Replica; otherwise false. The default is false.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        return this;
    }

    /**
     * True to copy all tags from the Read Replica to snapshots of the Read
     * Replica; otherwise false. The default is false.
     *
     * @return True to copy all tags from the Read Replica to snapshots of the Read
     *         Replica; otherwise false. The default is false.
     */
    public Boolean getCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the Read Replica. To disable collecting
     * Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     * <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     * Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *
     * @return The interval, in seconds, between points when Enhanced Monitoring
     *         metrics are collected for the Read Replica. To disable collecting
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
     * metrics are collected for the Read Replica. To disable collecting
     * Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     * <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     * Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *
     * @param monitoringInterval The interval, in seconds, between points when Enhanced Monitoring
     *         metrics are collected for the Read Replica. To disable collecting
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
     * metrics are collected for the Read Replica. To disable collecting
     * Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     * <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     * Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monitoringInterval The interval, in seconds, between points when Enhanced Monitoring
     *         metrics are collected for the Read Replica. To disable collecting
     *         Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     *         <code>MonitoringRoleArn</code> is specified, then you must also set
     *         <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     *         Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withMonitoringInterval(Integer monitoringInterval) {
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
    public CreateDBInstanceReadReplicaRequest withMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
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
        if (getSourceDBInstanceIdentifier() != null) sb.append("SourceDBInstanceIdentifier: " + getSourceDBInstanceIdentifier() + ",");
        if (getDBInstanceClass() != null) sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (isAutoMinorVersionUpgrade() != null) sb.append("AutoMinorVersionUpgrade: " + isAutoMinorVersionUpgrade() + ",");
        if (getIops() != null) sb.append("Iops: " + getIops() + ",");
        if (getOptionGroupName() != null) sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (isPubliclyAccessible() != null) sb.append("PubliclyAccessible: " + isPubliclyAccessible() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getDBSubnetGroupName() != null) sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getStorageType() != null) sb.append("StorageType: " + getStorageType() + ",");
        if (isCopyTagsToSnapshot() != null) sb.append("CopyTagsToSnapshot: " + isCopyTagsToSnapshot() + ",");
        if (getMonitoringInterval() != null) sb.append("MonitoringInterval: " + getMonitoringInterval() + ",");
        if (getMonitoringRoleArn() != null) sb.append("MonitoringRoleArn: " + getMonitoringRoleArn() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((isPubliclyAccessible() == null) ? 0 : isPubliclyAccessible().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode()); 
        hashCode = prime * hashCode + ((isCopyTagsToSnapshot() == null) ? 0 : isCopyTagsToSnapshot().hashCode()); 
        hashCode = prime * hashCode + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode()); 
        hashCode = prime * hashCode + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDBInstanceReadReplicaRequest == false) return false;
        CreateDBInstanceReadReplicaRequest other = (CreateDBInstanceReadReplicaRequest)obj;
        
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.getSourceDBInstanceIdentifier() == null ^ this.getSourceDBInstanceIdentifier() == null) return false;
        if (other.getSourceDBInstanceIdentifier() != null && other.getSourceDBInstanceIdentifier().equals(this.getSourceDBInstanceIdentifier()) == false) return false; 
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null) return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        if (other.isPubliclyAccessible() == null ^ this.isPubliclyAccessible() == null) return false;
        if (other.isPubliclyAccessible() != null && other.isPubliclyAccessible().equals(this.isPubliclyAccessible()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null) return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false) return false; 
        if (other.getStorageType() == null ^ this.getStorageType() == null) return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false) return false; 
        if (other.isCopyTagsToSnapshot() == null ^ this.isCopyTagsToSnapshot() == null) return false;
        if (other.isCopyTagsToSnapshot() != null && other.isCopyTagsToSnapshot().equals(this.isCopyTagsToSnapshot()) == false) return false; 
        if (other.getMonitoringInterval() == null ^ this.getMonitoringInterval() == null) return false;
        if (other.getMonitoringInterval() != null && other.getMonitoringInterval().equals(this.getMonitoringInterval()) == false) return false; 
        if (other.getMonitoringRoleArn() == null ^ this.getMonitoringRoleArn() == null) return false;
        if (other.getMonitoringRoleArn() != null && other.getMonitoringRoleArn().equals(this.getMonitoringRoleArn()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateDBInstanceReadReplicaRequest clone() {
        
            return (CreateDBInstanceReadReplicaRequest) super.clone();
    }

}
    