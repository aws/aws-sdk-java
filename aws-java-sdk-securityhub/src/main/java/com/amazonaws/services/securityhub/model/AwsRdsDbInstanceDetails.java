/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the details of an Amazon RDS DB instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbInstanceDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbInstanceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * </p>
     */
    private java.util.List<AwsRdsDbInstanceAssociatedRole> associatedRoles;
    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     */
    private String cACertificateIdentifier;
    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a
     * member of.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a
     * different port than the DB cluster port.
     * </p>
     */
    private Integer dbInstancePort;
    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS key for the DB instance is accessed.
     * </p>
     */
    private String dbiResourceId;
    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was provided at create time, if one was specified
     * when the DB instance was created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     * </p>
     */
    private String dBName;
    /**
     * <p>
     * Indicates whether the DB instance has deletion protection enabled.
     * </p>
     * <p>
     * When deletion protection is enabled, the database cannot be deleted.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     */
    private AwsRdsDbInstanceEndpoint endpoint;
    /**
     * <p>
     * Provides the name of the database engine to use for this DB instance.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database engines.
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
     * Aurora 5.6 or higher
     * </p>
     * </li>
     * </ul>
     */
    private Boolean iAMDatabaseAuthenticationEnabled;
    /**
     * <p>
     * Indicates when the DB instance was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String instanceCreateTime;
    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a
     * public IP address.
     * </p>
     * <p>
     * A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE encryption.
     * </p>
     */
    private String tdeCredentialArn;
    /**
     * <p>
     * A list of VPC security groups that the DB instance belongs to.
     * </p>
     */
    private java.util.List<AwsRdsDbInstanceVpcSecurityGroup> vpcSecurityGroups;
    /**
     * <p>
     * Whether the DB instance is a multiple Availability Zone deployment.
     * </p>
     */
    private Boolean multiAz;
    /**
     * <p>
     * The ARN of the CloudWatch Logs log stream that receives the enhanced monitoring metrics data for the DB instance.
     * </p>
     */
    private String enhancedMonitoringResourceArn;
    /**
     * <p>
     * The current status of the DB instance.
     * </p>
     */
    private String dbInstanceStatus;
    /**
     * <p>
     * The master user name of the DB instance.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * The amount of storage (in gigabytes) to initially allocate for the DB instance.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The range of time each day when automated backups are created, if automated backups are enabled.
     * </p>
     * <p>
     * Uses the format <code>HH:MM-HH:MM</code>. For example, <code>04:52-05:22</code>.
     * </p>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * The number of days for which to retain automated backups.
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * A list of the DB security groups to assign to the DB instance.
     * </p>
     */
    private java.util.List<String> dbSecurityGroups;
    /**
     * <p>
     * A list of the DB parameter groups to assign to the DB instance.
     * </p>
     */
    private java.util.List<AwsRdsDbParameterGroup> dbParameterGroups;
    /**
     * <p>
     * The Availability Zone where the DB instance will be created.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * Information about the subnet group that is associated with the DB instance.
     * </p>
     */
    private AwsRdsDbSubnetGroup dbSubnetGroup;
    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the format <code>&lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM</code>.
     * </p>
     * <p>
     * For the day values, use <code>mon</code>|<code>tue</code>|<code>wed</code>|<code>thu</code>|<code>fri</code>|
     * <code>sat</code>|<code>sun</code>.
     * </p>
     * <p>
     * For example, <code>sun:09:32-sun:10:02</code>.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Changes to the DB instance that are currently pending.
     * </p>
     */
    private AwsRdsDbPendingModifiedValues pendingModifiedValues;
    /**
     * <p>
     * Specifies the latest time to which a database can be restored with point-in-time restore.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String latestRestorableTime;
    /**
     * <p>
     * Indicates whether minor version patches are applied automatically.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * If this DB instance is a read replica, contains the identifier of the source DB instance.
     * </p>
     */
    private String readReplicaSourceDBInstanceIdentifier;
    /**
     * <p>
     * List of identifiers of the read replicas associated with this DB instance.
     * </p>
     */
    private java.util.List<String> readReplicaDBInstanceIdentifiers;
    /**
     * <p>
     * List of identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read replica.
     * </p>
     */
    private java.util.List<String> readReplicaDBClusterIdentifiers;
    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * Specifies the provisioned IOPS (I/O operations per second) for this DB instance.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The list of option group memberships for this DB instance.
     * </p>
     */
    private java.util.List<AwsRdsDbOptionGroupMembership> optionGroupMemberships;
    /**
     * <p>
     * The name of the character set that this DB instance is associated with.
     * </p>
     */
    private String characterSetName;
    /**
     * <p>
     * For a DB instance with multi-Availability Zone support, the name of the secondary Availability Zone.
     * </p>
     */
    private String secondaryAvailabilityZone;
    /**
     * <p>
     * The status of a read replica. If the instance isn't a read replica, this is empty.
     * </p>
     */
    private java.util.List<AwsRdsDbStatusInfo> statusInfos;
    /**
     * <p>
     * The storage type for the DB instance.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The Active Directory domain membership records associated with the DB instance.
     * </p>
     */
    private java.util.List<AwsRdsDbDomainMembership> domainMemberships;
    /**
     * <p>
     * Whether to copy resource tags to snapshots of the DB instance.
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * The interval, in seconds, between points when enhanced monitoring metrics are collected for the DB instance.
     * </p>
     */
    private Integer monitoringInterval;
    /**
     * <p>
     * The ARN for the IAM role that permits Amazon RDS to send enhanced monitoring metrics to CloudWatch Logs.
     * </p>
     */
    private String monitoringRoleArn;
    /**
     * <p>
     * The order in which to promote an Aurora replica to the primary instance after a failure of the existing primary
     * instance.
     * </p>
     */
    private Integer promotionTier;
    /**
     * <p>
     * The time zone of the DB instance.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * Indicates whether Performance Insights is enabled for the DB instance.
     * </p>
     */
    private Boolean performanceInsightsEnabled;
    /**
     * <p>
     * The identifier of the AWS KMS key used to encrypt the Performance Insights data.
     * </p>
     */
    private String performanceInsightsKmsKeyId;
    /**
     * <p>
     * The number of days to retain Performance Insights data.
     * </p>
     */
    private Integer performanceInsightsRetentionPeriod;
    /**
     * <p>
     * A list of log types that this DB instance is configured to export to CloudWatch Logs.
     * </p>
     */
    private java.util.List<String> enabledCloudWatchLogsExports;
    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     */
    private java.util.List<AwsRdsDbProcessorFeature> processorFeatures;

    private AwsRdsDbInstanceEndpoint listenerEndpoint;
    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     */
    private Integer maxAllocatedStorage;

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * </p>
     * 
     * @return The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     */

    public java.util.List<AwsRdsDbInstanceAssociatedRole> getAssociatedRoles() {
        return associatedRoles;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * </p>
     * 
     * @param associatedRoles
     *        The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     */

    public void setAssociatedRoles(java.util.Collection<AwsRdsDbInstanceAssociatedRole> associatedRoles) {
        if (associatedRoles == null) {
            this.associatedRoles = null;
            return;
        }

        this.associatedRoles = new java.util.ArrayList<AwsRdsDbInstanceAssociatedRole>(associatedRoles);
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedRoles(java.util.Collection)} or {@link #withAssociatedRoles(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param associatedRoles
     *        The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withAssociatedRoles(AwsRdsDbInstanceAssociatedRole... associatedRoles) {
        if (this.associatedRoles == null) {
            setAssociatedRoles(new java.util.ArrayList<AwsRdsDbInstanceAssociatedRole>(associatedRoles.length));
        }
        for (AwsRdsDbInstanceAssociatedRole ele : associatedRoles) {
            this.associatedRoles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * </p>
     * 
     * @param associatedRoles
     *        The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withAssociatedRoles(java.util.Collection<AwsRdsDbInstanceAssociatedRole> associatedRoles) {
        setAssociatedRoles(associatedRoles);
        return this;
    }

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        The identifier of the CA certificate for this DB instance.
     */

    public void setCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
    }

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     * 
     * @return The identifier of the CA certificate for this DB instance.
     */

    public String getCACertificateIdentifier() {
        return this.cACertificateIdentifier;
    }

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        The identifier of the CA certificate for this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withCACertificateIdentifier(String cACertificateIdentifier) {
        setCACertificateIdentifier(cACertificateIdentifier);
        return this;
    }

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a
     * member of.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance
     *        is a member of.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a
     * member of.
     * </p>
     * 
     * @return If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance
     *         is a member of.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a
     * member of.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance
     *        is a member of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB
     *        instance.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     * 
     * @return Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB
     *         instance.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        Contains the name of the compute and memory capacity class of the DB instance.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     * 
     * @return Contains the name of the compute and memory capacity class of the DB instance.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        Contains the name of the compute and memory capacity class of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a
     * different port than the DB cluster port.
     * </p>
     * 
     * @param dbInstancePort
     *        Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can
     *        be a different port than the DB cluster port.
     */

    public void setDbInstancePort(Integer dbInstancePort) {
        this.dbInstancePort = dbInstancePort;
    }

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a
     * different port than the DB cluster port.
     * </p>
     * 
     * @return Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can
     *         be a different port than the DB cluster port.
     */

    public Integer getDbInstancePort() {
        return this.dbInstancePort;
    }

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a
     * different port than the DB cluster port.
     * </p>
     * 
     * @param dbInstancePort
     *        Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can
     *        be a different port than the DB cluster port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDbInstancePort(Integer dbInstancePort) {
        setDbInstancePort(dbInstancePort);
        return this;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS key for the DB instance is accessed.
     * </p>
     * 
     * @param dbiResourceId
     *        The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS
     *        CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
     */

    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS key for the DB instance is accessed.
     * </p>
     * 
     * @return The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS
     *         CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
     */

    public String getDbiResourceId() {
        return this.dbiResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS key for the DB instance is accessed.
     * </p>
     * 
     * @param dbiResourceId
     *        The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS
     *        CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDbiResourceId(String dbiResourceId) {
        setDbiResourceId(dbiResourceId);
        return this;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was provided at create time, if one was specified
     * when the DB instance was created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     * </p>
     * 
     * @param dBName
     *        The meaning of this parameter differs according to the database engine you use.</p>
     *        <p>
     *        <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     *        </p>
     *        <p>
     *        Contains the name of the initial database of this instance that was provided at create time, if one was
     *        specified when the DB instance was created. This same name is returned for the life of the DB instance.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do
     *        not apply to an Oracle DB instance.
     */

    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was provided at create time, if one was specified
     * when the DB instance was created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     * </p>
     * 
     * @return The meaning of this parameter differs according to the database engine you use.</p>
     *         <p>
     *         <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     *         </p>
     *         <p>
     *         Contains the name of the initial database of this instance that was provided at create time, if one was
     *         specified when the DB instance was created. This same name is returned for the life of the DB instance.
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do
     *         not apply to an Oracle DB instance.
     */

    public String getDBName() {
        return this.dBName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was provided at create time, if one was specified
     * when the DB instance was created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     * </p>
     * 
     * @param dBName
     *        The meaning of this parameter differs according to the database engine you use.</p>
     *        <p>
     *        <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     *        </p>
     *        <p>
     *        Contains the name of the initial database of this instance that was provided at create time, if one was
     *        specified when the DB instance was created. This same name is returned for the life of the DB instance.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do
     *        not apply to an Oracle DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDBName(String dBName) {
        setDBName(dBName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the DB instance has deletion protection enabled.
     * </p>
     * <p>
     * When deletion protection is enabled, the database cannot be deleted.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates whether the DB instance has deletion protection enabled.</p>
     *        <p>
     *        When deletion protection is enabled, the database cannot be deleted.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Indicates whether the DB instance has deletion protection enabled.
     * </p>
     * <p>
     * When deletion protection is enabled, the database cannot be deleted.
     * </p>
     * 
     * @return Indicates whether the DB instance has deletion protection enabled.</p>
     *         <p>
     *         When deletion protection is enabled, the database cannot be deleted.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Indicates whether the DB instance has deletion protection enabled.
     * </p>
     * <p>
     * When deletion protection is enabled, the database cannot be deleted.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates whether the DB instance has deletion protection enabled.</p>
     *        <p>
     *        When deletion protection is enabled, the database cannot be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * Indicates whether the DB instance has deletion protection enabled.
     * </p>
     * <p>
     * When deletion protection is enabled, the database cannot be deleted.
     * </p>
     * 
     * @return Indicates whether the DB instance has deletion protection enabled.</p>
     *         <p>
     *         When deletion protection is enabled, the database cannot be deleted.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     * 
     * @param endpoint
     *        Specifies the connection endpoint.
     */

    public void setEndpoint(AwsRdsDbInstanceEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     * 
     * @return Specifies the connection endpoint.
     */

    public AwsRdsDbInstanceEndpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     * 
     * @param endpoint
     *        Specifies the connection endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withEndpoint(AwsRdsDbInstanceEndpoint endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * Provides the name of the database engine to use for this DB instance.
     * </p>
     * 
     * @param engine
     *        Provides the name of the database engine to use for this DB instance.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to use for this DB instance.
     * </p>
     * 
     * @return Provides the name of the database engine to use for this DB instance.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to use for this DB instance.
     * </p>
     * 
     * @param engine
     *        Provides the name of the database engine to use for this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @param engineVersion
     *        Indicates the database engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @return Indicates the database engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @param engineVersion
     *        Indicates the database engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database engines.
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
     * Aurora 5.6 or higher
     * </p>
     * </li>
     * </ul>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *        otherwise false.</p>
     *        <p>
     *        IAM database authentication can be enabled for the following database engines.
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
     *        Aurora 5.6 or higher
     *        </p>
     *        </li>
     */

    public void setIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database engines.
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
     * Aurora 5.6 or higher
     * </p>
     * </li>
     * </ul>
     * 
     * @return True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *         otherwise false.</p>
     *         <p>
     *         IAM database authentication can be enabled for the following database engines.
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
     *         Aurora 5.6 or higher
     *         </p>
     *         </li>
     */

    public Boolean getIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database engines.
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
     * Aurora 5.6 or higher
     * </p>
     * </li>
     * </ul>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *        otherwise false.</p>
     *        <p>
     *        IAM database authentication can be enabled for the following database engines.
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
     *        Aurora 5.6 or higher
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        setIAMDatabaseAuthenticationEnabled(iAMDatabaseAuthenticationEnabled);
        return this;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database engines.
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
     * Aurora 5.6 or higher
     * </p>
     * </li>
     * </ul>
     * 
     * @return True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *         otherwise false.</p>
     *         <p>
     *         IAM database authentication can be enabled for the following database engines.
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
     *         Aurora 5.6 or higher
     *         </p>
     *         </li>
     */

    public Boolean isIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * Indicates when the DB instance was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param instanceCreateTime
     *        Indicates when the DB instance was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setInstanceCreateTime(String instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }

    /**
     * <p>
     * Indicates when the DB instance was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the DB instance was created.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getInstanceCreateTime() {
        return this.instanceCreateTime;
    }

    /**
     * <p>
     * Indicates when the DB instance was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param instanceCreateTime
     *        Indicates when the DB instance was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withInstanceCreateTime(String instanceCreateTime) {
        setInstanceCreateTime(instanceCreateTime);
        return this;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     * 
     * @return If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a
     * public IP address.
     * </p>
     * <p>
     * A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the DB instance.</p>
     *        <p>
     *        A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves
     *        to a public IP address.
     *        </p>
     *        <p>
     *        A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a
     * public IP address.
     * </p>
     * <p>
     * A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * 
     * @return Specifies the accessibility options for the DB instance.</p>
     *         <p>
     *         A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves
     *         to a public IP address.
     *         </p>
     *         <p>
     *         A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a
     * public IP address.
     * </p>
     * <p>
     * A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the DB instance.</p>
     *        <p>
     *        A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves
     *        to a public IP address.
     *        </p>
     *        <p>
     *        A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a
     * public IP address.
     * </p>
     * <p>
     * A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * 
     * @return Specifies the accessibility options for the DB instance.</p>
     *         <p>
     *         A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves
     *         to a public IP address.
     *         </p>
     *         <p>
     *         A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB instance is encrypted.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB instance is encrypted.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB instance is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB instance is encrypted.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which the instance is associated for TDE encryption.
     */

    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE encryption.
     * </p>
     * 
     * @return The ARN from the key store with which the instance is associated for TDE encryption.
     */

    public String getTdeCredentialArn() {
        return this.tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which the instance is associated for TDE encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withTdeCredentialArn(String tdeCredentialArn) {
        setTdeCredentialArn(tdeCredentialArn);
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB instance belongs to.
     * </p>
     * 
     * @return A list of VPC security groups that the DB instance belongs to.
     */

    public java.util.List<AwsRdsDbInstanceVpcSecurityGroup> getVpcSecurityGroups() {
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB instance belongs to.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        A list of VPC security groups that the DB instance belongs to.
     */

    public void setVpcSecurityGroups(java.util.Collection<AwsRdsDbInstanceVpcSecurityGroup> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }

        this.vpcSecurityGroups = new java.util.ArrayList<AwsRdsDbInstanceVpcSecurityGroup>(vpcSecurityGroups);
    }

    /**
     * <p>
     * A list of VPC security groups that the DB instance belongs to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroups(java.util.Collection)} or {@link #withVpcSecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        A list of VPC security groups that the DB instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withVpcSecurityGroups(AwsRdsDbInstanceVpcSecurityGroup... vpcSecurityGroups) {
        if (this.vpcSecurityGroups == null) {
            setVpcSecurityGroups(new java.util.ArrayList<AwsRdsDbInstanceVpcSecurityGroup>(vpcSecurityGroups.length));
        }
        for (AwsRdsDbInstanceVpcSecurityGroup ele : vpcSecurityGroups) {
            this.vpcSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB instance belongs to.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        A list of VPC security groups that the DB instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withVpcSecurityGroups(java.util.Collection<AwsRdsDbInstanceVpcSecurityGroup> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
        return this;
    }

    /**
     * <p>
     * Whether the DB instance is a multiple Availability Zone deployment.
     * </p>
     * 
     * @param multiAz
     *        Whether the DB instance is a multiple Availability Zone deployment.
     */

    public void setMultiAz(Boolean multiAz) {
        this.multiAz = multiAz;
    }

    /**
     * <p>
     * Whether the DB instance is a multiple Availability Zone deployment.
     * </p>
     * 
     * @return Whether the DB instance is a multiple Availability Zone deployment.
     */

    public Boolean getMultiAz() {
        return this.multiAz;
    }

    /**
     * <p>
     * Whether the DB instance is a multiple Availability Zone deployment.
     * </p>
     * 
     * @param multiAz
     *        Whether the DB instance is a multiple Availability Zone deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withMultiAz(Boolean multiAz) {
        setMultiAz(multiAz);
        return this;
    }

    /**
     * <p>
     * Whether the DB instance is a multiple Availability Zone deployment.
     * </p>
     * 
     * @return Whether the DB instance is a multiple Availability Zone deployment.
     */

    public Boolean isMultiAz() {
        return this.multiAz;
    }

    /**
     * <p>
     * The ARN of the CloudWatch Logs log stream that receives the enhanced monitoring metrics data for the DB instance.
     * </p>
     * 
     * @param enhancedMonitoringResourceArn
     *        The ARN of the CloudWatch Logs log stream that receives the enhanced monitoring metrics data for the DB
     *        instance.
     */

    public void setEnhancedMonitoringResourceArn(String enhancedMonitoringResourceArn) {
        this.enhancedMonitoringResourceArn = enhancedMonitoringResourceArn;
    }

    /**
     * <p>
     * The ARN of the CloudWatch Logs log stream that receives the enhanced monitoring metrics data for the DB instance.
     * </p>
     * 
     * @return The ARN of the CloudWatch Logs log stream that receives the enhanced monitoring metrics data for the DB
     *         instance.
     */

    public String getEnhancedMonitoringResourceArn() {
        return this.enhancedMonitoringResourceArn;
    }

    /**
     * <p>
     * The ARN of the CloudWatch Logs log stream that receives the enhanced monitoring metrics data for the DB instance.
     * </p>
     * 
     * @param enhancedMonitoringResourceArn
     *        The ARN of the CloudWatch Logs log stream that receives the enhanced monitoring metrics data for the DB
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withEnhancedMonitoringResourceArn(String enhancedMonitoringResourceArn) {
        setEnhancedMonitoringResourceArn(enhancedMonitoringResourceArn);
        return this;
    }

    /**
     * <p>
     * The current status of the DB instance.
     * </p>
     * 
     * @param dbInstanceStatus
     *        The current status of the DB instance.
     */

    public void setDbInstanceStatus(String dbInstanceStatus) {
        this.dbInstanceStatus = dbInstanceStatus;
    }

    /**
     * <p>
     * The current status of the DB instance.
     * </p>
     * 
     * @return The current status of the DB instance.
     */

    public String getDbInstanceStatus() {
        return this.dbInstanceStatus;
    }

    /**
     * <p>
     * The current status of the DB instance.
     * </p>
     * 
     * @param dbInstanceStatus
     *        The current status of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDbInstanceStatus(String dbInstanceStatus) {
        setDbInstanceStatus(dbInstanceStatus);
        return this;
    }

    /**
     * <p>
     * The master user name of the DB instance.
     * </p>
     * 
     * @param masterUsername
     *        The master user name of the DB instance.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The master user name of the DB instance.
     * </p>
     * 
     * @return The master user name of the DB instance.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The master user name of the DB instance.
     * </p>
     * 
     * @param masterUsername
     *        The master user name of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to initially allocate for the DB instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) to initially allocate for the DB instance.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to initially allocate for the DB instance.
     * </p>
     * 
     * @return The amount of storage (in gigabytes) to initially allocate for the DB instance.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to initially allocate for the DB instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) to initially allocate for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The range of time each day when automated backups are created, if automated backups are enabled.
     * </p>
     * <p>
     * Uses the format <code>HH:MM-HH:MM</code>. For example, <code>04:52-05:22</code>.
     * </p>
     * 
     * @param preferredBackupWindow
     *        The range of time each day when automated backups are created, if automated backups are enabled.</p>
     *        <p>
     *        Uses the format <code>HH:MM-HH:MM</code>. For example, <code>04:52-05:22</code>.
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The range of time each day when automated backups are created, if automated backups are enabled.
     * </p>
     * <p>
     * Uses the format <code>HH:MM-HH:MM</code>. For example, <code>04:52-05:22</code>.
     * </p>
     * 
     * @return The range of time each day when automated backups are created, if automated backups are enabled.</p>
     *         <p>
     *         Uses the format <code>HH:MM-HH:MM</code>. For example, <code>04:52-05:22</code>.
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The range of time each day when automated backups are created, if automated backups are enabled.
     * </p>
     * <p>
     * Uses the format <code>HH:MM-HH:MM</code>. For example, <code>04:52-05:22</code>.
     * </p>
     * 
     * @param preferredBackupWindow
     *        The range of time each day when automated backups are created, if automated backups are enabled.</p>
     *        <p>
     *        Uses the format <code>HH:MM-HH:MM</code>. For example, <code>04:52-05:22</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The number of days for which to retain automated backups.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which to retain automated backups.
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which to retain automated backups.
     * </p>
     * 
     * @return The number of days for which to retain automated backups.
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which to retain automated backups.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which to retain automated backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * A list of the DB security groups to assign to the DB instance.
     * </p>
     * 
     * @return A list of the DB security groups to assign to the DB instance.
     */

    public java.util.List<String> getDbSecurityGroups() {
        return dbSecurityGroups;
    }

    /**
     * <p>
     * A list of the DB security groups to assign to the DB instance.
     * </p>
     * 
     * @param dbSecurityGroups
     *        A list of the DB security groups to assign to the DB instance.
     */

    public void setDbSecurityGroups(java.util.Collection<String> dbSecurityGroups) {
        if (dbSecurityGroups == null) {
            this.dbSecurityGroups = null;
            return;
        }

        this.dbSecurityGroups = new java.util.ArrayList<String>(dbSecurityGroups);
    }

    /**
     * <p>
     * A list of the DB security groups to assign to the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDbSecurityGroups(java.util.Collection)} or {@link #withDbSecurityGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dbSecurityGroups
     *        A list of the DB security groups to assign to the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDbSecurityGroups(String... dbSecurityGroups) {
        if (this.dbSecurityGroups == null) {
            setDbSecurityGroups(new java.util.ArrayList<String>(dbSecurityGroups.length));
        }
        for (String ele : dbSecurityGroups) {
            this.dbSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the DB security groups to assign to the DB instance.
     * </p>
     * 
     * @param dbSecurityGroups
     *        A list of the DB security groups to assign to the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDbSecurityGroups(java.util.Collection<String> dbSecurityGroups) {
        setDbSecurityGroups(dbSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of the DB parameter groups to assign to the DB instance.
     * </p>
     * 
     * @return A list of the DB parameter groups to assign to the DB instance.
     */

    public java.util.List<AwsRdsDbParameterGroup> getDbParameterGroups() {
        return dbParameterGroups;
    }

    /**
     * <p>
     * A list of the DB parameter groups to assign to the DB instance.
     * </p>
     * 
     * @param dbParameterGroups
     *        A list of the DB parameter groups to assign to the DB instance.
     */

    public void setDbParameterGroups(java.util.Collection<AwsRdsDbParameterGroup> dbParameterGroups) {
        if (dbParameterGroups == null) {
            this.dbParameterGroups = null;
            return;
        }

        this.dbParameterGroups = new java.util.ArrayList<AwsRdsDbParameterGroup>(dbParameterGroups);
    }

    /**
     * <p>
     * A list of the DB parameter groups to assign to the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDbParameterGroups(java.util.Collection)} or {@link #withDbParameterGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dbParameterGroups
     *        A list of the DB parameter groups to assign to the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDbParameterGroups(AwsRdsDbParameterGroup... dbParameterGroups) {
        if (this.dbParameterGroups == null) {
            setDbParameterGroups(new java.util.ArrayList<AwsRdsDbParameterGroup>(dbParameterGroups.length));
        }
        for (AwsRdsDbParameterGroup ele : dbParameterGroups) {
            this.dbParameterGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the DB parameter groups to assign to the DB instance.
     * </p>
     * 
     * @param dbParameterGroups
     *        A list of the DB parameter groups to assign to the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDbParameterGroups(java.util.Collection<AwsRdsDbParameterGroup> dbParameterGroups) {
        setDbParameterGroups(dbParameterGroups);
        return this;
    }

    /**
     * <p>
     * The Availability Zone where the DB instance will be created.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the DB instance will be created.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the DB instance will be created.
     * </p>
     * 
     * @return The Availability Zone where the DB instance will be created.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone where the DB instance will be created.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone where the DB instance will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * Information about the subnet group that is associated with the DB instance.
     * </p>
     * 
     * @param dbSubnetGroup
     *        Information about the subnet group that is associated with the DB instance.
     */

    public void setDbSubnetGroup(AwsRdsDbSubnetGroup dbSubnetGroup) {
        this.dbSubnetGroup = dbSubnetGroup;
    }

    /**
     * <p>
     * Information about the subnet group that is associated with the DB instance.
     * </p>
     * 
     * @return Information about the subnet group that is associated with the DB instance.
     */

    public AwsRdsDbSubnetGroup getDbSubnetGroup() {
        return this.dbSubnetGroup;
    }

    /**
     * <p>
     * Information about the subnet group that is associated with the DB instance.
     * </p>
     * 
     * @param dbSubnetGroup
     *        Information about the subnet group that is associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDbSubnetGroup(AwsRdsDbSubnetGroup dbSubnetGroup) {
        setDbSubnetGroup(dbSubnetGroup);
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the format <code>&lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM</code>.
     * </p>
     * <p>
     * For the day values, use <code>mon</code>|<code>tue</code>|<code>wed</code>|<code>thu</code>|<code>fri</code>|
     * <code>sat</code>|<code>sun</code>.
     * </p>
     * <p>
     * For example, <code>sun:09:32-sun:10:02</code>.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Uses the format <code>&lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM</code>.
     *        </p>
     *        <p>
     *        For the day values, use <code>mon</code>|<code>tue</code>|<code>wed</code>|<code>thu</code>|
     *        <code>fri</code>|<code>sat</code>|<code>sun</code>.
     *        </p>
     *        <p>
     *        For example, <code>sun:09:32-sun:10:02</code>.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the format <code>&lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM</code>.
     * </p>
     * <p>
     * For the day values, use <code>mon</code>|<code>tue</code>|<code>wed</code>|<code>thu</code>|<code>fri</code>|
     * <code>sat</code>|<code>sun</code>.
     * </p>
     * <p>
     * For example, <code>sun:09:32-sun:10:02</code>.
     * </p>
     * 
     * @return The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *         <p>
     *         Uses the format <code>&lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM</code>.
     *         </p>
     *         <p>
     *         For the day values, use <code>mon</code>|<code>tue</code>|<code>wed</code>|<code>thu</code>|
     *         <code>fri</code>|<code>sat</code>|<code>sun</code>.
     *         </p>
     *         <p>
     *         For example, <code>sun:09:32-sun:10:02</code>.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the format <code>&lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM</code>.
     * </p>
     * <p>
     * For the day values, use <code>mon</code>|<code>tue</code>|<code>wed</code>|<code>thu</code>|<code>fri</code>|
     * <code>sat</code>|<code>sun</code>.
     * </p>
     * <p>
     * For example, <code>sun:09:32-sun:10:02</code>.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Uses the format <code>&lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM</code>.
     *        </p>
     *        <p>
     *        For the day values, use <code>mon</code>|<code>tue</code>|<code>wed</code>|<code>thu</code>|
     *        <code>fri</code>|<code>sat</code>|<code>sun</code>.
     *        </p>
     *        <p>
     *        For example, <code>sun:09:32-sun:10:02</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Changes to the DB instance that are currently pending.
     * </p>
     * 
     * @param pendingModifiedValues
     *        Changes to the DB instance that are currently pending.
     */

    public void setPendingModifiedValues(AwsRdsDbPendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * Changes to the DB instance that are currently pending.
     * </p>
     * 
     * @return Changes to the DB instance that are currently pending.
     */

    public AwsRdsDbPendingModifiedValues getPendingModifiedValues() {
        return this.pendingModifiedValues;
    }

    /**
     * <p>
     * Changes to the DB instance that are currently pending.
     * </p>
     * 
     * @param pendingModifiedValues
     *        Changes to the DB instance that are currently pending.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withPendingModifiedValues(AwsRdsDbPendingModifiedValues pendingModifiedValues) {
        setPendingModifiedValues(pendingModifiedValues);
        return this;
    }

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with point-in-time restore.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param latestRestorableTime
     *        Specifies the latest time to which a database can be restored with point-in-time restore.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setLatestRestorableTime(String latestRestorableTime) {
        this.latestRestorableTime = latestRestorableTime;
    }

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with point-in-time restore.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Specifies the latest time to which a database can be restored with point-in-time restore.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getLatestRestorableTime() {
        return this.latestRestorableTime;
    }

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with point-in-time restore.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param latestRestorableTime
     *        Specifies the latest time to which a database can be restored with point-in-time restore.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withLatestRestorableTime(String latestRestorableTime) {
        setLatestRestorableTime(latestRestorableTime);
        return this;
    }

    /**
     * <p>
     * Indicates whether minor version patches are applied automatically.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates whether minor version patches are applied automatically.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates whether minor version patches are applied automatically.
     * </p>
     * 
     * @return Indicates whether minor version patches are applied automatically.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates whether minor version patches are applied automatically.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates whether minor version patches are applied automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Indicates whether minor version patches are applied automatically.
     * </p>
     * 
     * @return Indicates whether minor version patches are applied automatically.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * If this DB instance is a read replica, contains the identifier of the source DB instance.
     * </p>
     * 
     * @param readReplicaSourceDBInstanceIdentifier
     *        If this DB instance is a read replica, contains the identifier of the source DB instance.
     */

    public void setReadReplicaSourceDBInstanceIdentifier(String readReplicaSourceDBInstanceIdentifier) {
        this.readReplicaSourceDBInstanceIdentifier = readReplicaSourceDBInstanceIdentifier;
    }

    /**
     * <p>
     * If this DB instance is a read replica, contains the identifier of the source DB instance.
     * </p>
     * 
     * @return If this DB instance is a read replica, contains the identifier of the source DB instance.
     */

    public String getReadReplicaSourceDBInstanceIdentifier() {
        return this.readReplicaSourceDBInstanceIdentifier;
    }

    /**
     * <p>
     * If this DB instance is a read replica, contains the identifier of the source DB instance.
     * </p>
     * 
     * @param readReplicaSourceDBInstanceIdentifier
     *        If this DB instance is a read replica, contains the identifier of the source DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withReadReplicaSourceDBInstanceIdentifier(String readReplicaSourceDBInstanceIdentifier) {
        setReadReplicaSourceDBInstanceIdentifier(readReplicaSourceDBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * List of identifiers of the read replicas associated with this DB instance.
     * </p>
     * 
     * @return List of identifiers of the read replicas associated with this DB instance.
     */

    public java.util.List<String> getReadReplicaDBInstanceIdentifiers() {
        return readReplicaDBInstanceIdentifiers;
    }

    /**
     * <p>
     * List of identifiers of the read replicas associated with this DB instance.
     * </p>
     * 
     * @param readReplicaDBInstanceIdentifiers
     *        List of identifiers of the read replicas associated with this DB instance.
     */

    public void setReadReplicaDBInstanceIdentifiers(java.util.Collection<String> readReplicaDBInstanceIdentifiers) {
        if (readReplicaDBInstanceIdentifiers == null) {
            this.readReplicaDBInstanceIdentifiers = null;
            return;
        }

        this.readReplicaDBInstanceIdentifiers = new java.util.ArrayList<String>(readReplicaDBInstanceIdentifiers);
    }

    /**
     * <p>
     * List of identifiers of the read replicas associated with this DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadReplicaDBInstanceIdentifiers(java.util.Collection)} or
     * {@link #withReadReplicaDBInstanceIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param readReplicaDBInstanceIdentifiers
     *        List of identifiers of the read replicas associated with this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withReadReplicaDBInstanceIdentifiers(String... readReplicaDBInstanceIdentifiers) {
        if (this.readReplicaDBInstanceIdentifiers == null) {
            setReadReplicaDBInstanceIdentifiers(new java.util.ArrayList<String>(readReplicaDBInstanceIdentifiers.length));
        }
        for (String ele : readReplicaDBInstanceIdentifiers) {
            this.readReplicaDBInstanceIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of identifiers of the read replicas associated with this DB instance.
     * </p>
     * 
     * @param readReplicaDBInstanceIdentifiers
     *        List of identifiers of the read replicas associated with this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withReadReplicaDBInstanceIdentifiers(java.util.Collection<String> readReplicaDBInstanceIdentifiers) {
        setReadReplicaDBInstanceIdentifiers(readReplicaDBInstanceIdentifiers);
        return this;
    }

    /**
     * <p>
     * List of identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read replica.
     * </p>
     * 
     * @return List of identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read replica.
     */

    public java.util.List<String> getReadReplicaDBClusterIdentifiers() {
        return readReplicaDBClusterIdentifiers;
    }

    /**
     * <p>
     * List of identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read replica.
     * </p>
     * 
     * @param readReplicaDBClusterIdentifiers
     *        List of identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read replica.
     */

    public void setReadReplicaDBClusterIdentifiers(java.util.Collection<String> readReplicaDBClusterIdentifiers) {
        if (readReplicaDBClusterIdentifiers == null) {
            this.readReplicaDBClusterIdentifiers = null;
            return;
        }

        this.readReplicaDBClusterIdentifiers = new java.util.ArrayList<String>(readReplicaDBClusterIdentifiers);
    }

    /**
     * <p>
     * List of identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read replica.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadReplicaDBClusterIdentifiers(java.util.Collection)} or
     * {@link #withReadReplicaDBClusterIdentifiers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param readReplicaDBClusterIdentifiers
     *        List of identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withReadReplicaDBClusterIdentifiers(String... readReplicaDBClusterIdentifiers) {
        if (this.readReplicaDBClusterIdentifiers == null) {
            setReadReplicaDBClusterIdentifiers(new java.util.ArrayList<String>(readReplicaDBClusterIdentifiers.length));
        }
        for (String ele : readReplicaDBClusterIdentifiers) {
            this.readReplicaDBClusterIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read replica.
     * </p>
     * 
     * @param readReplicaDBClusterIdentifiers
     *        List of identifiers of Aurora DB clusters to which the RDS DB instance is replicated as a read replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withReadReplicaDBClusterIdentifiers(java.util.Collection<String> readReplicaDBClusterIdentifiers) {
        setReadReplicaDBClusterIdentifiers(readReplicaDBClusterIdentifiers);
        return this;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * 
     * @param licenseModel
     *        License model information for this DB instance.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * 
     * @return License model information for this DB instance.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * 
     * @param licenseModel
     *        License model information for this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * Specifies the provisioned IOPS (I/O operations per second) for this DB instance.
     * </p>
     * 
     * @param iops
     *        Specifies the provisioned IOPS (I/O operations per second) for this DB instance.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * Specifies the provisioned IOPS (I/O operations per second) for this DB instance.
     * </p>
     * 
     * @return Specifies the provisioned IOPS (I/O operations per second) for this DB instance.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * Specifies the provisioned IOPS (I/O operations per second) for this DB instance.
     * </p>
     * 
     * @param iops
     *        Specifies the provisioned IOPS (I/O operations per second) for this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The list of option group memberships for this DB instance.
     * </p>
     * 
     * @return The list of option group memberships for this DB instance.
     */

    public java.util.List<AwsRdsDbOptionGroupMembership> getOptionGroupMemberships() {
        return optionGroupMemberships;
    }

    /**
     * <p>
     * The list of option group memberships for this DB instance.
     * </p>
     * 
     * @param optionGroupMemberships
     *        The list of option group memberships for this DB instance.
     */

    public void setOptionGroupMemberships(java.util.Collection<AwsRdsDbOptionGroupMembership> optionGroupMemberships) {
        if (optionGroupMemberships == null) {
            this.optionGroupMemberships = null;
            return;
        }

        this.optionGroupMemberships = new java.util.ArrayList<AwsRdsDbOptionGroupMembership>(optionGroupMemberships);
    }

    /**
     * <p>
     * The list of option group memberships for this DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionGroupMemberships(java.util.Collection)} or
     * {@link #withOptionGroupMemberships(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param optionGroupMemberships
     *        The list of option group memberships for this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withOptionGroupMemberships(AwsRdsDbOptionGroupMembership... optionGroupMemberships) {
        if (this.optionGroupMemberships == null) {
            setOptionGroupMemberships(new java.util.ArrayList<AwsRdsDbOptionGroupMembership>(optionGroupMemberships.length));
        }
        for (AwsRdsDbOptionGroupMembership ele : optionGroupMemberships) {
            this.optionGroupMemberships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of option group memberships for this DB instance.
     * </p>
     * 
     * @param optionGroupMemberships
     *        The list of option group memberships for this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withOptionGroupMemberships(java.util.Collection<AwsRdsDbOptionGroupMembership> optionGroupMemberships) {
        setOptionGroupMemberships(optionGroupMemberships);
        return this;
    }

    /**
     * <p>
     * The name of the character set that this DB instance is associated with.
     * </p>
     * 
     * @param characterSetName
     *        The name of the character set that this DB instance is associated with.
     */

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * The name of the character set that this DB instance is associated with.
     * </p>
     * 
     * @return The name of the character set that this DB instance is associated with.
     */

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * <p>
     * The name of the character set that this DB instance is associated with.
     * </p>
     * 
     * @param characterSetName
     *        The name of the character set that this DB instance is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withCharacterSetName(String characterSetName) {
        setCharacterSetName(characterSetName);
        return this;
    }

    /**
     * <p>
     * For a DB instance with multi-Availability Zone support, the name of the secondary Availability Zone.
     * </p>
     * 
     * @param secondaryAvailabilityZone
     *        For a DB instance with multi-Availability Zone support, the name of the secondary Availability Zone.
     */

    public void setSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        this.secondaryAvailabilityZone = secondaryAvailabilityZone;
    }

    /**
     * <p>
     * For a DB instance with multi-Availability Zone support, the name of the secondary Availability Zone.
     * </p>
     * 
     * @return For a DB instance with multi-Availability Zone support, the name of the secondary Availability Zone.
     */

    public String getSecondaryAvailabilityZone() {
        return this.secondaryAvailabilityZone;
    }

    /**
     * <p>
     * For a DB instance with multi-Availability Zone support, the name of the secondary Availability Zone.
     * </p>
     * 
     * @param secondaryAvailabilityZone
     *        For a DB instance with multi-Availability Zone support, the name of the secondary Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withSecondaryAvailabilityZone(String secondaryAvailabilityZone) {
        setSecondaryAvailabilityZone(secondaryAvailabilityZone);
        return this;
    }

    /**
     * <p>
     * The status of a read replica. If the instance isn't a read replica, this is empty.
     * </p>
     * 
     * @return The status of a read replica. If the instance isn't a read replica, this is empty.
     */

    public java.util.List<AwsRdsDbStatusInfo> getStatusInfos() {
        return statusInfos;
    }

    /**
     * <p>
     * The status of a read replica. If the instance isn't a read replica, this is empty.
     * </p>
     * 
     * @param statusInfos
     *        The status of a read replica. If the instance isn't a read replica, this is empty.
     */

    public void setStatusInfos(java.util.Collection<AwsRdsDbStatusInfo> statusInfos) {
        if (statusInfos == null) {
            this.statusInfos = null;
            return;
        }

        this.statusInfos = new java.util.ArrayList<AwsRdsDbStatusInfo>(statusInfos);
    }

    /**
     * <p>
     * The status of a read replica. If the instance isn't a read replica, this is empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatusInfos(java.util.Collection)} or {@link #withStatusInfos(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statusInfos
     *        The status of a read replica. If the instance isn't a read replica, this is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withStatusInfos(AwsRdsDbStatusInfo... statusInfos) {
        if (this.statusInfos == null) {
            setStatusInfos(new java.util.ArrayList<AwsRdsDbStatusInfo>(statusInfos.length));
        }
        for (AwsRdsDbStatusInfo ele : statusInfos) {
            this.statusInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of a read replica. If the instance isn't a read replica, this is empty.
     * </p>
     * 
     * @param statusInfos
     *        The status of a read replica. If the instance isn't a read replica, this is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withStatusInfos(java.util.Collection<AwsRdsDbStatusInfo> statusInfos) {
        setStatusInfos(statusInfos);
        return this;
    }

    /**
     * <p>
     * The storage type for the DB instance.
     * </p>
     * 
     * @param storageType
     *        The storage type for the DB instance.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The storage type for the DB instance.
     * </p>
     * 
     * @return The storage type for the DB instance.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The storage type for the DB instance.
     * </p>
     * 
     * @param storageType
     *        The storage type for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The Active Directory domain membership records associated with the DB instance.
     * </p>
     * 
     * @return The Active Directory domain membership records associated with the DB instance.
     */

    public java.util.List<AwsRdsDbDomainMembership> getDomainMemberships() {
        return domainMemberships;
    }

    /**
     * <p>
     * The Active Directory domain membership records associated with the DB instance.
     * </p>
     * 
     * @param domainMemberships
     *        The Active Directory domain membership records associated with the DB instance.
     */

    public void setDomainMemberships(java.util.Collection<AwsRdsDbDomainMembership> domainMemberships) {
        if (domainMemberships == null) {
            this.domainMemberships = null;
            return;
        }

        this.domainMemberships = new java.util.ArrayList<AwsRdsDbDomainMembership>(domainMemberships);
    }

    /**
     * <p>
     * The Active Directory domain membership records associated with the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainMemberships(java.util.Collection)} or {@link #withDomainMemberships(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param domainMemberships
     *        The Active Directory domain membership records associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDomainMemberships(AwsRdsDbDomainMembership... domainMemberships) {
        if (this.domainMemberships == null) {
            setDomainMemberships(new java.util.ArrayList<AwsRdsDbDomainMembership>(domainMemberships.length));
        }
        for (AwsRdsDbDomainMembership ele : domainMemberships) {
            this.domainMemberships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Active Directory domain membership records associated with the DB instance.
     * </p>
     * 
     * @param domainMemberships
     *        The Active Directory domain membership records associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDomainMemberships(java.util.Collection<AwsRdsDbDomainMembership> domainMemberships) {
        setDomainMemberships(domainMemberships);
        return this;
    }

    /**
     * <p>
     * Whether to copy resource tags to snapshots of the DB instance.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        Whether to copy resource tags to snapshots of the DB instance.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * Whether to copy resource tags to snapshots of the DB instance.
     * </p>
     * 
     * @return Whether to copy resource tags to snapshots of the DB instance.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * Whether to copy resource tags to snapshots of the DB instance.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        Whether to copy resource tags to snapshots of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * Whether to copy resource tags to snapshots of the DB instance.
     * </p>
     * 
     * @return Whether to copy resource tags to snapshots of the DB instance.
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * The interval, in seconds, between points when enhanced monitoring metrics are collected for the DB instance.
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when enhanced monitoring metrics are collected for the DB
     *        instance.
     */

    public void setMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when enhanced monitoring metrics are collected for the DB instance.
     * </p>
     * 
     * @return The interval, in seconds, between points when enhanced monitoring metrics are collected for the DB
     *         instance.
     */

    public Integer getMonitoringInterval() {
        return this.monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when enhanced monitoring metrics are collected for the DB instance.
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when enhanced monitoring metrics are collected for the DB
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withMonitoringInterval(Integer monitoringInterval) {
        setMonitoringInterval(monitoringInterval);
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits Amazon RDS to send enhanced monitoring metrics to CloudWatch Logs.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits Amazon RDS to send enhanced monitoring metrics to CloudWatch Logs.
     */

    public void setMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits Amazon RDS to send enhanced monitoring metrics to CloudWatch Logs.
     * </p>
     * 
     * @return The ARN for the IAM role that permits Amazon RDS to send enhanced monitoring metrics to CloudWatch Logs.
     */

    public String getMonitoringRoleArn() {
        return this.monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits Amazon RDS to send enhanced monitoring metrics to CloudWatch Logs.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits Amazon RDS to send enhanced monitoring metrics to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withMonitoringRoleArn(String monitoringRoleArn) {
        setMonitoringRoleArn(monitoringRoleArn);
        return this;
    }

    /**
     * <p>
     * The order in which to promote an Aurora replica to the primary instance after a failure of the existing primary
     * instance.
     * </p>
     * 
     * @param promotionTier
     *        The order in which to promote an Aurora replica to the primary instance after a failure of the existing
     *        primary instance.
     */

    public void setPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
    }

    /**
     * <p>
     * The order in which to promote an Aurora replica to the primary instance after a failure of the existing primary
     * instance.
     * </p>
     * 
     * @return The order in which to promote an Aurora replica to the primary instance after a failure of the existing
     *         primary instance.
     */

    public Integer getPromotionTier() {
        return this.promotionTier;
    }

    /**
     * <p>
     * The order in which to promote an Aurora replica to the primary instance after a failure of the existing primary
     * instance.
     * </p>
     * 
     * @param promotionTier
     *        The order in which to promote an Aurora replica to the primary instance after a failure of the existing
     *        primary instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withPromotionTier(Integer promotionTier) {
        setPromotionTier(promotionTier);
        return this;
    }

    /**
     * <p>
     * The time zone of the DB instance.
     * </p>
     * 
     * @param timezone
     *        The time zone of the DB instance.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone of the DB instance.
     * </p>
     * 
     * @return The time zone of the DB instance.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The time zone of the DB instance.
     * </p>
     * 
     * @param timezone
     *        The time zone of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * Indicates whether Performance Insights is enabled for the DB instance.
     * </p>
     * 
     * @param performanceInsightsEnabled
     *        Indicates whether Performance Insights is enabled for the DB instance.
     */

    public void setPerformanceInsightsEnabled(Boolean performanceInsightsEnabled) {
        this.performanceInsightsEnabled = performanceInsightsEnabled;
    }

    /**
     * <p>
     * Indicates whether Performance Insights is enabled for the DB instance.
     * </p>
     * 
     * @return Indicates whether Performance Insights is enabled for the DB instance.
     */

    public Boolean getPerformanceInsightsEnabled() {
        return this.performanceInsightsEnabled;
    }

    /**
     * <p>
     * Indicates whether Performance Insights is enabled for the DB instance.
     * </p>
     * 
     * @param performanceInsightsEnabled
     *        Indicates whether Performance Insights is enabled for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withPerformanceInsightsEnabled(Boolean performanceInsightsEnabled) {
        setPerformanceInsightsEnabled(performanceInsightsEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether Performance Insights is enabled for the DB instance.
     * </p>
     * 
     * @return Indicates whether Performance Insights is enabled for the DB instance.
     */

    public Boolean isPerformanceInsightsEnabled() {
        return this.performanceInsightsEnabled;
    }

    /**
     * <p>
     * The identifier of the AWS KMS key used to encrypt the Performance Insights data.
     * </p>
     * 
     * @param performanceInsightsKmsKeyId
     *        The identifier of the AWS KMS key used to encrypt the Performance Insights data.
     */

    public void setPerformanceInsightsKmsKeyId(String performanceInsightsKmsKeyId) {
        this.performanceInsightsKmsKeyId = performanceInsightsKmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS KMS key used to encrypt the Performance Insights data.
     * </p>
     * 
     * @return The identifier of the AWS KMS key used to encrypt the Performance Insights data.
     */

    public String getPerformanceInsightsKmsKeyId() {
        return this.performanceInsightsKmsKeyId;
    }

    /**
     * <p>
     * The identifier of the AWS KMS key used to encrypt the Performance Insights data.
     * </p>
     * 
     * @param performanceInsightsKmsKeyId
     *        The identifier of the AWS KMS key used to encrypt the Performance Insights data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withPerformanceInsightsKmsKeyId(String performanceInsightsKmsKeyId) {
        setPerformanceInsightsKmsKeyId(performanceInsightsKmsKeyId);
        return this;
    }

    /**
     * <p>
     * The number of days to retain Performance Insights data.
     * </p>
     * 
     * @param performanceInsightsRetentionPeriod
     *        The number of days to retain Performance Insights data.
     */

    public void setPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
        this.performanceInsightsRetentionPeriod = performanceInsightsRetentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain Performance Insights data.
     * </p>
     * 
     * @return The number of days to retain Performance Insights data.
     */

    public Integer getPerformanceInsightsRetentionPeriod() {
        return this.performanceInsightsRetentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain Performance Insights data.
     * </p>
     * 
     * @param performanceInsightsRetentionPeriod
     *        The number of days to retain Performance Insights data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
        setPerformanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to CloudWatch Logs.
     * </p>
     * 
     * @return A list of log types that this DB instance is configured to export to CloudWatch Logs.
     */

    public java.util.List<String> getEnabledCloudWatchLogsExports() {
        return enabledCloudWatchLogsExports;
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to CloudWatch Logs.
     * </p>
     * 
     * @param enabledCloudWatchLogsExports
     *        A list of log types that this DB instance is configured to export to CloudWatch Logs.
     */

    public void setEnabledCloudWatchLogsExports(java.util.Collection<String> enabledCloudWatchLogsExports) {
        if (enabledCloudWatchLogsExports == null) {
            this.enabledCloudWatchLogsExports = null;
            return;
        }

        this.enabledCloudWatchLogsExports = new java.util.ArrayList<String>(enabledCloudWatchLogsExports);
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to CloudWatch Logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnabledCloudWatchLogsExports(java.util.Collection)} or
     * {@link #withEnabledCloudWatchLogsExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enabledCloudWatchLogsExports
     *        A list of log types that this DB instance is configured to export to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withEnabledCloudWatchLogsExports(String... enabledCloudWatchLogsExports) {
        if (this.enabledCloudWatchLogsExports == null) {
            setEnabledCloudWatchLogsExports(new java.util.ArrayList<String>(enabledCloudWatchLogsExports.length));
        }
        for (String ele : enabledCloudWatchLogsExports) {
            this.enabledCloudWatchLogsExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of log types that this DB instance is configured to export to CloudWatch Logs.
     * </p>
     * 
     * @param enabledCloudWatchLogsExports
     *        A list of log types that this DB instance is configured to export to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withEnabledCloudWatchLogsExports(java.util.Collection<String> enabledCloudWatchLogsExports) {
        setEnabledCloudWatchLogsExports(enabledCloudWatchLogsExports);
        return this;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * 
     * @return The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     */

    public java.util.List<AwsRdsDbProcessorFeature> getProcessorFeatures() {
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

    public void setProcessorFeatures(java.util.Collection<AwsRdsDbProcessorFeature> processorFeatures) {
        if (processorFeatures == null) {
            this.processorFeatures = null;
            return;
        }

        this.processorFeatures = new java.util.ArrayList<AwsRdsDbProcessorFeature>(processorFeatures);
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

    public AwsRdsDbInstanceDetails withProcessorFeatures(AwsRdsDbProcessorFeature... processorFeatures) {
        if (this.processorFeatures == null) {
            setProcessorFeatures(new java.util.ArrayList<AwsRdsDbProcessorFeature>(processorFeatures.length));
        }
        for (AwsRdsDbProcessorFeature ele : processorFeatures) {
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

    public AwsRdsDbInstanceDetails withProcessorFeatures(java.util.Collection<AwsRdsDbProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
        return this;
    }

    /**
     * @param listenerEndpoint
     */

    public void setListenerEndpoint(AwsRdsDbInstanceEndpoint listenerEndpoint) {
        this.listenerEndpoint = listenerEndpoint;
    }

    /**
     * @return
     */

    public AwsRdsDbInstanceEndpoint getListenerEndpoint() {
        return this.listenerEndpoint;
    }

    /**
     * @param listenerEndpoint
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withListenerEndpoint(AwsRdsDbInstanceEndpoint listenerEndpoint) {
        setListenerEndpoint(listenerEndpoint);
        return this;
    }

    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     * 
     * @param maxAllocatedStorage
     *        The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     */

    public void setMaxAllocatedStorage(Integer maxAllocatedStorage) {
        this.maxAllocatedStorage = maxAllocatedStorage;
    }

    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     * 
     * @return The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     */

    public Integer getMaxAllocatedStorage() {
        return this.maxAllocatedStorage;
    }

    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     * </p>
     * 
     * @param maxAllocatedStorage
     *        The upper limit to which Amazon RDS can automatically scale the storage of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withMaxAllocatedStorage(Integer maxAllocatedStorage) {
        setMaxAllocatedStorage(maxAllocatedStorage);
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
        if (getAssociatedRoles() != null)
            sb.append("AssociatedRoles: ").append(getAssociatedRoles()).append(",");
        if (getCACertificateIdentifier() != null)
            sb.append("CACertificateIdentifier: ").append(getCACertificateIdentifier()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getDbInstancePort() != null)
            sb.append("DbInstancePort: ").append(getDbInstancePort()).append(",");
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: ").append(getDbiResourceId()).append(",");
        if (getDBName() != null)
            sb.append("DBName: ").append(getDBName()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: ").append(getIAMDatabaseAuthenticationEnabled()).append(",");
        if (getInstanceCreateTime() != null)
            sb.append("InstanceCreateTime: ").append(getInstanceCreateTime()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted()).append(",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: ").append(getTdeCredentialArn()).append(",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: ").append(getVpcSecurityGroups()).append(",");
        if (getMultiAz() != null)
            sb.append("MultiAz: ").append(getMultiAz()).append(",");
        if (getEnhancedMonitoringResourceArn() != null)
            sb.append("EnhancedMonitoringResourceArn: ").append(getEnhancedMonitoringResourceArn()).append(",");
        if (getDbInstanceStatus() != null)
            sb.append("DbInstanceStatus: ").append(getDbInstanceStatus()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getDbSecurityGroups() != null)
            sb.append("DbSecurityGroups: ").append(getDbSecurityGroups()).append(",");
        if (getDbParameterGroups() != null)
            sb.append("DbParameterGroups: ").append(getDbParameterGroups()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getDbSubnetGroup() != null)
            sb.append("DbSubnetGroup: ").append(getDbSubnetGroup()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: ").append(getPendingModifiedValues()).append(",");
        if (getLatestRestorableTime() != null)
            sb.append("LatestRestorableTime: ").append(getLatestRestorableTime()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getReadReplicaSourceDBInstanceIdentifier() != null)
            sb.append("ReadReplicaSourceDBInstanceIdentifier: ").append(getReadReplicaSourceDBInstanceIdentifier()).append(",");
        if (getReadReplicaDBInstanceIdentifiers() != null)
            sb.append("ReadReplicaDBInstanceIdentifiers: ").append(getReadReplicaDBInstanceIdentifiers()).append(",");
        if (getReadReplicaDBClusterIdentifiers() != null)
            sb.append("ReadReplicaDBClusterIdentifiers: ").append(getReadReplicaDBClusterIdentifiers()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getOptionGroupMemberships() != null)
            sb.append("OptionGroupMemberships: ").append(getOptionGroupMemberships()).append(",");
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: ").append(getCharacterSetName()).append(",");
        if (getSecondaryAvailabilityZone() != null)
            sb.append("SecondaryAvailabilityZone: ").append(getSecondaryAvailabilityZone()).append(",");
        if (getStatusInfos() != null)
            sb.append("StatusInfos: ").append(getStatusInfos()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getDomainMemberships() != null)
            sb.append("DomainMemberships: ").append(getDomainMemberships()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot()).append(",");
        if (getMonitoringInterval() != null)
            sb.append("MonitoringInterval: ").append(getMonitoringInterval()).append(",");
        if (getMonitoringRoleArn() != null)
            sb.append("MonitoringRoleArn: ").append(getMonitoringRoleArn()).append(",");
        if (getPromotionTier() != null)
            sb.append("PromotionTier: ").append(getPromotionTier()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getPerformanceInsightsEnabled() != null)
            sb.append("PerformanceInsightsEnabled: ").append(getPerformanceInsightsEnabled()).append(",");
        if (getPerformanceInsightsKmsKeyId() != null)
            sb.append("PerformanceInsightsKmsKeyId: ").append(getPerformanceInsightsKmsKeyId()).append(",");
        if (getPerformanceInsightsRetentionPeriod() != null)
            sb.append("PerformanceInsightsRetentionPeriod: ").append(getPerformanceInsightsRetentionPeriod()).append(",");
        if (getEnabledCloudWatchLogsExports() != null)
            sb.append("EnabledCloudWatchLogsExports: ").append(getEnabledCloudWatchLogsExports()).append(",");
        if (getProcessorFeatures() != null)
            sb.append("ProcessorFeatures: ").append(getProcessorFeatures()).append(",");
        if (getListenerEndpoint() != null)
            sb.append("ListenerEndpoint: ").append(getListenerEndpoint()).append(",");
        if (getMaxAllocatedStorage() != null)
            sb.append("MaxAllocatedStorage: ").append(getMaxAllocatedStorage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbInstanceDetails == false)
            return false;
        AwsRdsDbInstanceDetails other = (AwsRdsDbInstanceDetails) obj;
        if (other.getAssociatedRoles() == null ^ this.getAssociatedRoles() == null)
            return false;
        if (other.getAssociatedRoles() != null && other.getAssociatedRoles().equals(this.getAssociatedRoles()) == false)
            return false;
        if (other.getCACertificateIdentifier() == null ^ this.getCACertificateIdentifier() == null)
            return false;
        if (other.getCACertificateIdentifier() != null && other.getCACertificateIdentifier().equals(this.getCACertificateIdentifier()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getDbInstancePort() == null ^ this.getDbInstancePort() == null)
            return false;
        if (other.getDbInstancePort() != null && other.getDbInstancePort().equals(this.getDbInstancePort()) == false)
            return false;
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() == null ^ this.getIAMDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() != null
                && other.getIAMDatabaseAuthenticationEnabled().equals(this.getIAMDatabaseAuthenticationEnabled()) == false)
            return false;
        if (other.getInstanceCreateTime() == null ^ this.getInstanceCreateTime() == null)
            return false;
        if (other.getInstanceCreateTime() != null && other.getInstanceCreateTime().equals(this.getInstanceCreateTime()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null)
            return false;
        if (other.getTdeCredentialArn() != null && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
            return false;
        if (other.getMultiAz() == null ^ this.getMultiAz() == null)
            return false;
        if (other.getMultiAz() != null && other.getMultiAz().equals(this.getMultiAz()) == false)
            return false;
        if (other.getEnhancedMonitoringResourceArn() == null ^ this.getEnhancedMonitoringResourceArn() == null)
            return false;
        if (other.getEnhancedMonitoringResourceArn() != null
                && other.getEnhancedMonitoringResourceArn().equals(this.getEnhancedMonitoringResourceArn()) == false)
            return false;
        if (other.getDbInstanceStatus() == null ^ this.getDbInstanceStatus() == null)
            return false;
        if (other.getDbInstanceStatus() != null && other.getDbInstanceStatus().equals(this.getDbInstanceStatus()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getDbSecurityGroups() == null ^ this.getDbSecurityGroups() == null)
            return false;
        if (other.getDbSecurityGroups() != null && other.getDbSecurityGroups().equals(this.getDbSecurityGroups()) == false)
            return false;
        if (other.getDbParameterGroups() == null ^ this.getDbParameterGroups() == null)
            return false;
        if (other.getDbParameterGroups() != null && other.getDbParameterGroups().equals(this.getDbParameterGroups()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDbSubnetGroup() == null ^ this.getDbSubnetGroup() == null)
            return false;
        if (other.getDbSubnetGroup() != null && other.getDbSubnetGroup().equals(this.getDbSubnetGroup()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPendingModifiedValues() == null ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null && other.getPendingModifiedValues().equals(this.getPendingModifiedValues()) == false)
            return false;
        if (other.getLatestRestorableTime() == null ^ this.getLatestRestorableTime() == null)
            return false;
        if (other.getLatestRestorableTime() != null && other.getLatestRestorableTime().equals(this.getLatestRestorableTime()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getReadReplicaSourceDBInstanceIdentifier() == null ^ this.getReadReplicaSourceDBInstanceIdentifier() == null)
            return false;
        if (other.getReadReplicaSourceDBInstanceIdentifier() != null
                && other.getReadReplicaSourceDBInstanceIdentifier().equals(this.getReadReplicaSourceDBInstanceIdentifier()) == false)
            return false;
        if (other.getReadReplicaDBInstanceIdentifiers() == null ^ this.getReadReplicaDBInstanceIdentifiers() == null)
            return false;
        if (other.getReadReplicaDBInstanceIdentifiers() != null
                && other.getReadReplicaDBInstanceIdentifiers().equals(this.getReadReplicaDBInstanceIdentifiers()) == false)
            return false;
        if (other.getReadReplicaDBClusterIdentifiers() == null ^ this.getReadReplicaDBClusterIdentifiers() == null)
            return false;
        if (other.getReadReplicaDBClusterIdentifiers() != null
                && other.getReadReplicaDBClusterIdentifiers().equals(this.getReadReplicaDBClusterIdentifiers()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getOptionGroupMemberships() == null ^ this.getOptionGroupMemberships() == null)
            return false;
        if (other.getOptionGroupMemberships() != null && other.getOptionGroupMemberships().equals(this.getOptionGroupMemberships()) == false)
            return false;
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false)
            return false;
        if (other.getSecondaryAvailabilityZone() == null ^ this.getSecondaryAvailabilityZone() == null)
            return false;
        if (other.getSecondaryAvailabilityZone() != null && other.getSecondaryAvailabilityZone().equals(this.getSecondaryAvailabilityZone()) == false)
            return false;
        if (other.getStatusInfos() == null ^ this.getStatusInfos() == null)
            return false;
        if (other.getStatusInfos() != null && other.getStatusInfos().equals(this.getStatusInfos()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getDomainMemberships() == null ^ this.getDomainMemberships() == null)
            return false;
        if (other.getDomainMemberships() != null && other.getDomainMemberships().equals(this.getDomainMemberships()) == false)
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
        if (other.getPromotionTier() == null ^ this.getPromotionTier() == null)
            return false;
        if (other.getPromotionTier() != null && other.getPromotionTier().equals(this.getPromotionTier()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getPerformanceInsightsEnabled() == null ^ this.getPerformanceInsightsEnabled() == null)
            return false;
        if (other.getPerformanceInsightsEnabled() != null && other.getPerformanceInsightsEnabled().equals(this.getPerformanceInsightsEnabled()) == false)
            return false;
        if (other.getPerformanceInsightsKmsKeyId() == null ^ this.getPerformanceInsightsKmsKeyId() == null)
            return false;
        if (other.getPerformanceInsightsKmsKeyId() != null && other.getPerformanceInsightsKmsKeyId().equals(this.getPerformanceInsightsKmsKeyId()) == false)
            return false;
        if (other.getPerformanceInsightsRetentionPeriod() == null ^ this.getPerformanceInsightsRetentionPeriod() == null)
            return false;
        if (other.getPerformanceInsightsRetentionPeriod() != null
                && other.getPerformanceInsightsRetentionPeriod().equals(this.getPerformanceInsightsRetentionPeriod()) == false)
            return false;
        if (other.getEnabledCloudWatchLogsExports() == null ^ this.getEnabledCloudWatchLogsExports() == null)
            return false;
        if (other.getEnabledCloudWatchLogsExports() != null && other.getEnabledCloudWatchLogsExports().equals(this.getEnabledCloudWatchLogsExports()) == false)
            return false;
        if (other.getProcessorFeatures() == null ^ this.getProcessorFeatures() == null)
            return false;
        if (other.getProcessorFeatures() != null && other.getProcessorFeatures().equals(this.getProcessorFeatures()) == false)
            return false;
        if (other.getListenerEndpoint() == null ^ this.getListenerEndpoint() == null)
            return false;
        if (other.getListenerEndpoint() != null && other.getListenerEndpoint().equals(this.getListenerEndpoint()) == false)
            return false;
        if (other.getMaxAllocatedStorage() == null ^ this.getMaxAllocatedStorage() == null)
            return false;
        if (other.getMaxAllocatedStorage() != null && other.getMaxAllocatedStorage().equals(this.getMaxAllocatedStorage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociatedRoles() == null) ? 0 : getAssociatedRoles().hashCode());
        hashCode = prime * hashCode + ((getCACertificateIdentifier() == null) ? 0 : getCACertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getDbInstancePort() == null) ? 0 : getDbInstancePort().hashCode());
        hashCode = prime * hashCode + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0 : getIAMDatabaseAuthenticationEnabled().hashCode());
        hashCode = prime * hashCode + ((getInstanceCreateTime() == null) ? 0 : getInstanceCreateTime().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getMultiAz() == null) ? 0 : getMultiAz().hashCode());
        hashCode = prime * hashCode + ((getEnhancedMonitoringResourceArn() == null) ? 0 : getEnhancedMonitoringResourceArn().hashCode());
        hashCode = prime * hashCode + ((getDbInstanceStatus() == null) ? 0 : getDbInstanceStatus().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getDbSecurityGroups() == null) ? 0 : getDbSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getDbParameterGroups() == null) ? 0 : getDbParameterGroups().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getDbSubnetGroup() == null) ? 0 : getDbSubnetGroup().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPendingModifiedValues() == null) ? 0 : getPendingModifiedValues().hashCode());
        hashCode = prime * hashCode + ((getLatestRestorableTime() == null) ? 0 : getLatestRestorableTime().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getReadReplicaSourceDBInstanceIdentifier() == null) ? 0 : getReadReplicaSourceDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getReadReplicaDBInstanceIdentifiers() == null) ? 0 : getReadReplicaDBInstanceIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getReadReplicaDBClusterIdentifiers() == null) ? 0 : getReadReplicaDBClusterIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupMemberships() == null) ? 0 : getOptionGroupMemberships().hashCode());
        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getSecondaryAvailabilityZone() == null) ? 0 : getSecondaryAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getStatusInfos() == null) ? 0 : getStatusInfos().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getDomainMemberships() == null) ? 0 : getDomainMemberships().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode());
        hashCode = prime * hashCode + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode());
        hashCode = prime * hashCode + ((getPromotionTier() == null) ? 0 : getPromotionTier().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsEnabled() == null) ? 0 : getPerformanceInsightsEnabled().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsKmsKeyId() == null) ? 0 : getPerformanceInsightsKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsRetentionPeriod() == null) ? 0 : getPerformanceInsightsRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getEnabledCloudWatchLogsExports() == null) ? 0 : getEnabledCloudWatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getListenerEndpoint() == null) ? 0 : getListenerEndpoint().hashCode());
        hashCode = prime * hashCode + ((getMaxAllocatedStorage() == null) ? 0 : getMaxAllocatedStorage().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbInstanceDetails clone() {
        try {
            return (AwsRdsDbInstanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbInstanceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
