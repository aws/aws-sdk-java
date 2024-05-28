/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBInstanceToPointInTime" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * Must match the identifier of an existing DB instance.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceDBInstanceIdentifier;
    /**
     * <p>
     * The name of the new DB instance to create.
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
     */
    private String targetDBInstanceIdentifier;
    /**
     * <p>
     * The date and time to restore from.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a time in Universal Coordinated Time (UTC) format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter is enabled.
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
     * Specifies whether the DB instance is restored from the latest backup time. By default, the DB instance isn't
     * restored from the latest backup time.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if the <code>RestoreTime</code> parameter is provided.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean useLatestRestorableTime;
    /**
     * <p>
     * The compute and memory capacity of the Amazon RDS DB instance, for example db.m4.large. Not all DB instance
     * classes are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB
     * instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Default: The same DB instance class as the original DB instance.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * Default: The same port as the original DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value must be <code>1150-65535</code>.
     * </p>
     * </li>
     * </ul>
     */
    private Integer port;
    /**
     * <p>
     * The Availability Zone (AZ) where the DB instance will be created.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     * </p>
     * </li>
     * </ul>
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
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB subnet group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * Secifies whether the DB instance is a Multi-AZ deployment.
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
     * You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * Specifies whether the DB instance is publicly accessible.
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
    /**
     * <p>
     * Specifies whether minor version upgrades are applied automatically to the DB instance during the maintenance
     * window.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The license model information for the restored DB instance.
     * </p>
     * <note>
     * <p>
     * License models for RDS for Db2 require additional configuration. The Bring Your Own License (BYOL) model requires
     * a custom parameter group. The Db2 license through Amazon Web Services Marketplace model requires an Amazon Web
     * Services Marketplace subscription. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/db2-licensing.html">RDS for Db2 licensing
     * options</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS for Db2 - <code>bring-your-own-license | marketplace-license</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB - <code>general-public-license</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Microsoft SQL Server - <code>license-included</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL - <code>general-public-license</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Oracle - <code>bring-your-own-license | license-included</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for PostgreSQL - <code>postgresql-license</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Same as the source.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * The database name for the restored DB instance.
     * </p>
     * <p>
     * This parameter doesn't apply to the following DB instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS Custom
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Db2
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL
     * </p>
     * </li>
     * </ul>
     */
    private String dBName;
    /**
     * <p>
     * The database engine to use for the new instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db2-ae</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db2-se</code>
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
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be compatible with the engine of the source.
     * </p>
     * </li>
     * </ul>
     */
    private String engine;
    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to initially allocate for the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to SQL Server.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be an integer greater than 1000.
     * </p>
     * </li>
     * </ul>
     */
    private Integer iops;
    /**
     * <p>
     * The name of the option group to use for the restored DB instance.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance after it is associated with a DB instance
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * Specifies whether to copy all tags from the restored DB instance to snapshots of the DB instance. By default,
     * tags are not copied.
     * </p>
     */
    private Boolean copyTagsToSnapshot;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The storage type to associate with the DB instance.
     * </p>
     * <p>
     * Valid Values: <code>gp2 | gp3 | io1 | io2 | standard</code>
     * </p>
     * <p>
     * Default: <code>io1</code>, if the <code>Iops</code> parameter is specified. Otherwise, <code>gp2</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>io1</code>, <code>io2</code>, or <code>gp3</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * </li>
     * </ul>
     */
    private String storageType;
    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
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
     * A list of EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The Active Directory directory ID to restore the DB instance in. Create the domain before running this command.
     * Currently, you can create only the MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances in an Active
     * Directory Domain.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private String domainIAMRoleName;
    /**
     * <p>
     * The fully qualified domain name (FQDN) of an Active Directory domain.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 64 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mymanagedADtest.mymanagedAD.mydomain</code>
     * </p>
     */
    private String domainFqdn;
    /**
     * <p>
     * The Active Directory organizational unit for your DB instance to join.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the distinguished name format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be longer than 64 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>OU=mymanagedADtestOU,DC=mymanagedADtest,DC=mymanagedAD,DC=mydomain</code>
     * </p>
     */
    private String domainOu;
    /**
     * <p>
     * The ARN for the Secrets Manager secret with the credentials for the user joining the domain.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 64 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456</code>
     * </p>
     */
    private String domainAuthSecretArn;
    /**
     * <p>
     * The IPv4 DNS IP addresses of your primary and secondary Active Directory domain controllers.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Two IP addresses must be provided. If there isn't a secondary domain controller, use the IP address of the
     * primary domain controller for both entries in the list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>123.124.125.126,234.235.236.237</code>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> domainDnsIps;
    /**
     * <p>
     * Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts to
     * database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;
    /**
     * <p>
     * The list of logs that the restored DB instance is to export to CloudWatch Logs. The values in the list depend on
     * the DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
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
     * Specifies whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private Boolean useDefaultProcessorFeatures;
    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then the default
     * <code>DBParameterGroup</code> for the specified DB engine is used.
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
     * If supplied, must match the name of an existing DB parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
     */
    private String dBParameterGroupName;
    /**
     * <p>
     * Specifies whether the DB instance has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled. By default, deletion protection isn't enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * The resource ID of the source DB instance from which to restore.
     * </p>
     */
    private String sourceDbiResourceId;
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
     */
    private Integer maxAllocatedStorage;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated automated backups from which to restore, for example,
     * <code>arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     */
    private String sourceDBInstanceAutomatedBackupsArn;
    /**
     * <p>
     * Specifies whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from
     * outside of its virtual private cloud (VPC) on your local network.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
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
     * The location for storing automated backups and manual snapshots for the restored DB instance.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>outposts</code> (Amazon Web Services Outposts)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region</code> (Amazon Web Services Region)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>region</code>
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
     * The network type is determined by the <code>DBSubnetGroup</code> specified for the DB instance. A
     * <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     * <code>DUAL</code>).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html"> Working
     * with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid Values:
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
     */
    private String networkType;
    /**
     * <p>
     * The storage throughput value for the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     * </p>
     */
    private Integer storageThroughput;
    /**
     * <p>
     * The amount of storage (in gibibytes) to allocate initially for the DB instance. Follow the allocation rules
     * specified in <code>CreateDBInstance</code>.
     * </p>
     * <note>
     * <p>
     * Be sure to allocate enough storage for your new DB instance so that the restore operation can succeed. You can
     * also allocate additional storage for future growth.
     * </p>
     * </note>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * Specifies whether to enable a dedicated log volume (DLV) for the DB instance.
     * </p>
     */
    private Boolean dedicatedLogVolume;
    /**
     * <p>
     * The CA certificate identifier to use for the DB instance's server certificate.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html">Using SSL/TLS to encrypt a
     * connection to a DB instance</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html"> Using SSL/TLS to
     * encrypt a connection to a DB cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     */
    private String cACertificateIdentifier;
    /**
     * <p>
     * The life cycle type for this DB instance.
     * </p>
     * <note>
     * <p>
     * By default, this value is set to <code>open-source-rds-extended-support</code>, which enrolls your DB instance
     * into Amazon RDS Extended Support. At the end of standard support, you can avoid charges for Extended Support by
     * setting the value to <code>open-source-rds-extended-support-disabled</code>. In this case, RDS automatically
     * upgrades your restored DB instance to a higher engine version, if the major engine version is past its end of
     * standard support date.
     * </p>
     * </note>
     * <p>
     * You can use this setting to enroll your DB instance into Amazon RDS Extended Support. With RDS Extended Support,
     * you can run the selected major engine version on your DB instance past the end of standard support for that
     * engine version. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/extended-support.html">Using Amazon RDS Extended
     * Support</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting applies only to RDS for MySQL and RDS for PostgreSQL. For Amazon Aurora DB instances, the life cycle
     * type is managed by the DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>open-source-rds-extended-support | open-source-rds-extended-support-disabled</code>
     * </p>
     * <p>
     * Default: <code>open-source-rds-extended-support</code>
     * </p>
     */
    private String engineLifecycleSupport;

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
     *        Must match the identifier of an existing DB instance.
     *        </p>
     *        </li>
     * @param targetDBInstanceIdentifier
     *        The name of the new DB instance to create.</p>
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
     * Must match the identifier of an existing DB instance.
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
     *        Must match the identifier of an existing DB instance.
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
     * Must match the identifier of an existing DB instance.
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
     *         Must match the identifier of an existing DB instance.
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
     * Must match the identifier of an existing DB instance.
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
     *        Must match the identifier of an existing DB instance.
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
     * The name of the new DB instance to create.
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
     * 
     * @param targetDBInstanceIdentifier
     *        The name of the new DB instance to create.</p>
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
     */

    public void setTargetDBInstanceIdentifier(String targetDBInstanceIdentifier) {
        this.targetDBInstanceIdentifier = targetDBInstanceIdentifier;
    }

    /**
     * <p>
     * The name of the new DB instance to create.
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
     * 
     * @return The name of the new DB instance to create.</p>
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
     */

    public String getTargetDBInstanceIdentifier() {
        return this.targetDBInstanceIdentifier;
    }

    /**
     * <p>
     * The name of the new DB instance to create.
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
     * 
     * @param targetDBInstanceIdentifier
     *        The name of the new DB instance to create.</p>
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
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a time in Universal Coordinated Time (UTC) format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter is enabled.
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
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a time in Universal Coordinated Time (UTC) format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be before the latest restorable time for the DB instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be specified if the <code>UseLatestRestorableTime</code> parameter is enabled.
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
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a time in Universal Coordinated Time (UTC) format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter is enabled.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2009-09-07T23:45:00Z</code>
     * </p>
     * 
     * @return The date and time to restore from.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be a time in Universal Coordinated Time (UTC) format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be before the latest restorable time for the DB instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be specified if the <code>UseLatestRestorableTime</code> parameter is enabled.
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
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a time in Universal Coordinated Time (UTC) format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter is enabled.
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
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a time in Universal Coordinated Time (UTC) format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be before the latest restorable time for the DB instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be specified if the <code>UseLatestRestorableTime</code> parameter is enabled.
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
     * Specifies whether the DB instance is restored from the latest backup time. By default, the DB instance isn't
     * restored from the latest backup time.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if the <code>RestoreTime</code> parameter is provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @param useLatestRestorableTime
     *        Specifies whether the DB instance is restored from the latest backup time. By default, the DB instance
     *        isn't restored from the latest backup time.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified if the <code>RestoreTime</code> parameter is provided.
     *        </p>
     *        </li>
     */

    public void setUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
    }

    /**
     * <p>
     * Specifies whether the DB instance is restored from the latest backup time. By default, the DB instance isn't
     * restored from the latest backup time.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if the <code>RestoreTime</code> parameter is provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether the DB instance is restored from the latest backup time. By default, the DB instance
     *         isn't restored from the latest backup time.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be specified if the <code>RestoreTime</code> parameter is provided.
     *         </p>
     *         </li>
     */

    public Boolean getUseLatestRestorableTime() {
        return this.useLatestRestorableTime;
    }

    /**
     * <p>
     * Specifies whether the DB instance is restored from the latest backup time. By default, the DB instance isn't
     * restored from the latest backup time.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if the <code>RestoreTime</code> parameter is provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @param useLatestRestorableTime
     *        Specifies whether the DB instance is restored from the latest backup time. By default, the DB instance
     *        isn't restored from the latest backup time.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified if the <code>RestoreTime</code> parameter is provided.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        setUseLatestRestorableTime(useLatestRestorableTime);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is restored from the latest backup time. By default, the DB instance isn't
     * restored from the latest backup time.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if the <code>RestoreTime</code> parameter is provided.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether the DB instance is restored from the latest backup time. By default, the DB instance
     *         isn't restored from the latest backup time.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be specified if the <code>RestoreTime</code> parameter is provided.
     *         </p>
     *         </li>
     */

    public Boolean isUseLatestRestorableTime() {
        return this.useLatestRestorableTime;
    }

    /**
     * <p>
     * The compute and memory capacity of the Amazon RDS DB instance, for example db.m4.large. Not all DB instance
     * classes are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB
     * instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Default: The same DB instance class as the original DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The compute and memory capacity of the Amazon RDS DB instance, for example db.m4.large. Not all DB
     *        instance classes are available in all Amazon Web Services Regions, or for all database engines. For the
     *        full list of DB instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *        Class</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        Default: The same DB instance class as the original DB instance.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the Amazon RDS DB instance, for example db.m4.large. Not all DB instance
     * classes are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB
     * instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Default: The same DB instance class as the original DB instance.
     * </p>
     * 
     * @return The compute and memory capacity of the Amazon RDS DB instance, for example db.m4.large. Not all DB
     *         instance classes are available in all Amazon Web Services Regions, or for all database engines. For the
     *         full list of DB instance classes, and availability for your engine, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *         Class</a> in the <i>Amazon RDS User Guide</i>.</p>
     *         <p>
     *         Default: The same DB instance class as the original DB instance.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the Amazon RDS DB instance, for example db.m4.large. Not all DB instance
     * classes are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB
     * instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Default: The same DB instance class as the original DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        The compute and memory capacity of the Amazon RDS DB instance, for example db.m4.large. Not all DB
     *        instance classes are available in all Amazon Web Services Regions, or for all database engines. For the
     *        full list of DB instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *        Class</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        Default: The same DB instance class as the original DB instance.
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
     * Default: The same port as the original DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value must be <code>1150-65535</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param port
     *        The port number on which the database accepts connections.</p>
     *        <p>
     *        Default: The same port as the original DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value must be <code>1150-65535</code>.
     *        </p>
     *        </li>
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * Default: The same port as the original DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value must be <code>1150-65535</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The port number on which the database accepts connections.</p>
     *         <p>
     *         Default: The same port as the original DB instance.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The value must be <code>1150-65535</code>.
     *         </p>
     *         </li>
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * Default: The same port as the original DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value must be <code>1150-65535</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param port
     *        The port number on which the database accepts connections.</p>
     *        <p>
     *        Default: The same port as the original DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value must be <code>1150-65535</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The Availability Zone (AZ) where the DB instance will be created.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>us-east-1a</code>
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone (AZ) where the DB instance will be created.</p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>us-east-1a</code>
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone (AZ) where the DB instance will be created.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>us-east-1a</code>
     * </p>
     * 
     * @return The Availability Zone (AZ) where the DB instance will be created.</p>
     *         <p>
     *         Default: A random, system-chosen Availability Zone.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ
     *         deployment.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>us-east-1a</code>
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone (AZ) where the DB instance will be created.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>us-east-1a</code>
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone (AZ) where the DB instance will be created.</p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     *        </p>
     *        </li>
     *        </ul>
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
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB subnet group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The DB subnet group name to use for the new instance.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing DB subnet group.
     *        </p>
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
     * The DB subnet group name to use for the new instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB subnet group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * 
     * @return The DB subnet group name to use for the new instance.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the name of an existing DB subnet group.
     *         </p>
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
     * The DB subnet group name to use for the new instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing DB subnet group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The DB subnet group name to use for the new instance.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing DB subnet group.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mydbsubnetgroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * Secifies whether the DB instance is a Multi-AZ deployment.
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
     * You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param multiAZ
     *        Secifies whether the DB instance is a Multi-AZ deployment.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     *        </p>
     *        </li>
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Secifies whether the DB instance is a Multi-AZ deployment.
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
     * You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Secifies whether the DB instance is a Multi-AZ deployment.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ
     *         deployment.
     *         </p>
     *         </li>
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Secifies whether the DB instance is a Multi-AZ deployment.
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
     * You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param multiAZ
     *        Secifies whether the DB instance is a Multi-AZ deployment.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Secifies whether the DB instance is a Multi-AZ deployment.
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
     * You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ deployment.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Secifies whether the DB instance is a Multi-AZ deployment.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can't specify the <code>AvailabilityZone</code> parameter if the DB instance is a Multi-AZ
     *         deployment.
     *         </p>
     *         </li>
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Specifies whether the DB instance is publicly accessible.
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
     *        Specifies whether the DB instance is publicly accessible.</p>
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
     * Specifies whether the DB instance is publicly accessible.
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
     * @return Specifies whether the DB instance is publicly accessible.</p>
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
     * Specifies whether the DB instance is publicly accessible.
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
     *        Specifies whether the DB instance is publicly accessible.</p>
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

    public RestoreDBInstanceToPointInTimeRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is publicly accessible.
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
     * @return Specifies whether the DB instance is publicly accessible.</p>
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
     * <p>
     * Specifies whether minor version upgrades are applied automatically to the DB instance during the maintenance
     * window.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Specifies whether minor version upgrades are applied automatically to the DB instance during the
     *        maintenance window.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Specifies whether minor version upgrades are applied automatically to the DB instance during the maintenance
     * window.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return Specifies whether minor version upgrades are applied automatically to the DB instance during the
     *         maintenance window.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Specifies whether minor version upgrades are applied automatically to the DB instance during the maintenance
     * window.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Specifies whether minor version upgrades are applied automatically to the DB instance during the
     *        maintenance window.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Specifies whether minor version upgrades are applied automatically to the DB instance during the maintenance
     * window.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return Specifies whether minor version upgrades are applied automatically to the DB instance during the
     *         maintenance window.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The license model information for the restored DB instance.
     * </p>
     * <note>
     * <p>
     * License models for RDS for Db2 require additional configuration. The Bring Your Own License (BYOL) model requires
     * a custom parameter group. The Db2 license through Amazon Web Services Marketplace model requires an Amazon Web
     * Services Marketplace subscription. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/db2-licensing.html">RDS for Db2 licensing
     * options</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS for Db2 - <code>bring-your-own-license | marketplace-license</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB - <code>general-public-license</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Microsoft SQL Server - <code>license-included</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL - <code>general-public-license</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Oracle - <code>bring-your-own-license | license-included</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for PostgreSQL - <code>postgresql-license</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Same as the source.
     * </p>
     * 
     * @param licenseModel
     *        The license model information for the restored DB instance.</p> <note>
     *        <p>
     *        License models for RDS for Db2 require additional configuration. The Bring Your Own License (BYOL) model
     *        requires a custom parameter group. The Db2 license through Amazon Web Services Marketplace model requires
     *        an Amazon Web Services Marketplace subscription. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/db2-licensing.html">RDS for Db2 licensing
     *        options</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        </note>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        RDS for Db2 - <code>bring-your-own-license | marketplace-license</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MariaDB - <code>general-public-license</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Microsoft SQL Server - <code>license-included</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MySQL - <code>general-public-license</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Oracle - <code>bring-your-own-license | license-included</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for PostgreSQL - <code>postgresql-license</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Same as the source.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model information for the restored DB instance.
     * </p>
     * <note>
     * <p>
     * License models for RDS for Db2 require additional configuration. The Bring Your Own License (BYOL) model requires
     * a custom parameter group. The Db2 license through Amazon Web Services Marketplace model requires an Amazon Web
     * Services Marketplace subscription. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/db2-licensing.html">RDS for Db2 licensing
     * options</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS for Db2 - <code>bring-your-own-license | marketplace-license</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB - <code>general-public-license</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Microsoft SQL Server - <code>license-included</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL - <code>general-public-license</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Oracle - <code>bring-your-own-license | license-included</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for PostgreSQL - <code>postgresql-license</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Same as the source.
     * </p>
     * 
     * @return The license model information for the restored DB instance.</p> <note>
     *         <p>
     *         License models for RDS for Db2 require additional configuration. The Bring Your Own License (BYOL) model
     *         requires a custom parameter group. The Db2 license through Amazon Web Services Marketplace model requires
     *         an Amazon Web Services Marketplace subscription. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/db2-licensing.html">RDS for Db2 licensing
     *         options</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         </note>
     *         <p>
     *         This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     *         </p>
     *         <p>
     *         Valid Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         RDS for Db2 - <code>bring-your-own-license | marketplace-license</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for MariaDB - <code>general-public-license</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for Microsoft SQL Server - <code>license-included</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for MySQL - <code>general-public-license</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for Oracle - <code>bring-your-own-license | license-included</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for PostgreSQL - <code>postgresql-license</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: Same as the source.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The license model information for the restored DB instance.
     * </p>
     * <note>
     * <p>
     * License models for RDS for Db2 require additional configuration. The Bring Your Own License (BYOL) model requires
     * a custom parameter group. The Db2 license through Amazon Web Services Marketplace model requires an Amazon Web
     * Services Marketplace subscription. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/db2-licensing.html">RDS for Db2 licensing
     * options</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS for Db2 - <code>bring-your-own-license | marketplace-license</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB - <code>general-public-license</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Microsoft SQL Server - <code>license-included</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL - <code>general-public-license</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Oracle - <code>bring-your-own-license | license-included</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for PostgreSQL - <code>postgresql-license</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Same as the source.
     * </p>
     * 
     * @param licenseModel
     *        The license model information for the restored DB instance.</p> <note>
     *        <p>
     *        License models for RDS for Db2 require additional configuration. The Bring Your Own License (BYOL) model
     *        requires a custom parameter group. The Db2 license through Amazon Web Services Marketplace model requires
     *        an Amazon Web Services Marketplace subscription. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/db2-licensing.html">RDS for Db2 licensing
     *        options</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        </note>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        RDS for Db2 - <code>bring-your-own-license | marketplace-license</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MariaDB - <code>general-public-license</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Microsoft SQL Server - <code>license-included</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MySQL - <code>general-public-license</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Oracle - <code>bring-your-own-license | license-included</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for PostgreSQL - <code>postgresql-license</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Same as the source.
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
     * <p>
     * This parameter doesn't apply to the following DB instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS Custom
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Db2
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBName
     *        The database name for the restored DB instance.</p>
     *        <p>
     *        This parameter doesn't apply to the following DB instances:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        RDS Custom
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Db2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MariaDB
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MySQL
     *        </p>
     *        </li>
     */

    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The database name for the restored DB instance.
     * </p>
     * <p>
     * This parameter doesn't apply to the following DB instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS Custom
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Db2
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL
     * </p>
     * </li>
     * </ul>
     * 
     * @return The database name for the restored DB instance.</p>
     *         <p>
     *         This parameter doesn't apply to the following DB instances:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         RDS Custom
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for Db2
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for MariaDB
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for MySQL
     *         </p>
     *         </li>
     */

    public String getDBName() {
        return this.dBName;
    }

    /**
     * <p>
     * The database name for the restored DB instance.
     * </p>
     * <p>
     * This parameter doesn't apply to the following DB instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS Custom
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Db2
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBName
     *        The database name for the restored DB instance.</p>
     *        <p>
     *        This parameter doesn't apply to the following DB instances:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        RDS Custom
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Db2
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MariaDB
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MySQL
     *        </p>
     *        </li>
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
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db2-ae</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db2-se</code>
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
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be compatible with the engine of the source.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The database engine to use for the new instance.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db2-ae</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db2-se</code>
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
     *        </ul>
     *        <p>
     *        Default: The same as source
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be compatible with the engine of the source.
     *        </p>
     *        </li>
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database engine to use for the new instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db2-ae</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db2-se</code>
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
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be compatible with the engine of the source.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The database engine to use for the new instance.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         Valid Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>db2-ae</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db2-se</code>
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
     *         </ul>
     *         <p>
     *         Default: The same as source
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be compatible with the engine of the source.
     *         </p>
     *         </li>
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The database engine to use for the new instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db2-ae</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db2-se</code>
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
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be compatible with the engine of the source.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The database engine to use for the new instance.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db2-ae</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db2-se</code>
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
     *        </ul>
     *        <p>
     *        Default: The same as source
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be compatible with the engine of the source.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to initially allocate for the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to SQL Server.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be an integer greater than 1000.
     * </p>
     * </li>
     * </ul>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to initially allocate for the DB
     *        instance.</p>
     *        <p>
     *        This setting doesn't apply to SQL Server.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be an integer greater than 1000.
     *        </p>
     *        </li>
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to initially allocate for the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to SQL Server.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be an integer greater than 1000.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The amount of Provisioned IOPS (input/output operations per second) to initially allocate for the DB
     *         instance.</p>
     *         <p>
     *         This setting doesn't apply to SQL Server.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be an integer greater than 1000.
     *         </p>
     *         </li>
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to initially allocate for the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to SQL Server.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be an integer greater than 1000.
     * </p>
     * </li>
     * </ul>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to initially allocate for the DB
     *        instance.</p>
     *        <p>
     *        This setting doesn't apply to SQL Server.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be an integer greater than 1000.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The name of the option group to use for the restored DB instance.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance after it is associated with a DB instance
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param optionGroupName
     *        The name of the option group to use for the restored DB instance.</p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *        option group, and that option group can't be removed from a DB instance after it is associated with a DB
     *        instance
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to use for the restored DB instance.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance after it is associated with a DB instance
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return The name of the option group to use for the restored DB instance.</p>
     *         <p>
     *         Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *         option group, and that option group can't be removed from a DB instance after it is associated with a DB
     *         instance
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to use for the restored DB instance.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance after it is associated with a DB instance
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param optionGroupName
     *        The name of the option group to use for the restored DB instance.</p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *        option group, and that option group can't be removed from a DB instance after it is associated with a DB
     *        instance
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * Specifies whether to copy all tags from the restored DB instance to snapshots of the DB instance. By default,
     * tags are not copied.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        Specifies whether to copy all tags from the restored DB instance to snapshots of the DB instance. By
     *        default, tags are not copied.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specifies whether to copy all tags from the restored DB instance to snapshots of the DB instance. By default,
     * tags are not copied.
     * </p>
     * 
     * @return Specifies whether to copy all tags from the restored DB instance to snapshots of the DB instance. By
     *         default, tags are not copied.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specifies whether to copy all tags from the restored DB instance to snapshots of the DB instance. By default,
     * tags are not copied.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        Specifies whether to copy all tags from the restored DB instance to snapshots of the DB instance. By
     *        default, tags are not copied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * Specifies whether to copy all tags from the restored DB instance to snapshots of the DB instance. By default,
     * tags are not copied.
     * </p>
     * 
     * @return Specifies whether to copy all tags from the restored DB instance to snapshots of the DB instance. By
     *         default, tags are not copied.
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
     * The storage type to associate with the DB instance.
     * </p>
     * <p>
     * Valid Values: <code>gp2 | gp3 | io1 | io2 | standard</code>
     * </p>
     * <p>
     * Default: <code>io1</code>, if the <code>Iops</code> parameter is specified. Otherwise, <code>gp2</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>io1</code>, <code>io2</code>, or <code>gp3</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageType
     *        The storage type to associate with the DB instance.</p>
     *        <p>
     *        Valid Values: <code>gp2 | gp3 | io1 | io2 | standard</code>
     *        </p>
     *        <p>
     *        Default: <code>io1</code>, if the <code>Iops</code> parameter is specified. Otherwise, <code>gp2</code>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify <code>io1</code>, <code>io2</code>, or <code>gp3</code>, you must also include a value for
     *        the <code>Iops</code> parameter.
     *        </p>
     *        </li>
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The storage type to associate with the DB instance.
     * </p>
     * <p>
     * Valid Values: <code>gp2 | gp3 | io1 | io2 | standard</code>
     * </p>
     * <p>
     * Default: <code>io1</code>, if the <code>Iops</code> parameter is specified. Otherwise, <code>gp2</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>io1</code>, <code>io2</code>, or <code>gp3</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The storage type to associate with the DB instance.</p>
     *         <p>
     *         Valid Values: <code>gp2 | gp3 | io1 | io2 | standard</code>
     *         </p>
     *         <p>
     *         Default: <code>io1</code>, if the <code>Iops</code> parameter is specified. Otherwise, <code>gp2</code>.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify <code>io1</code>, <code>io2</code>, or <code>gp3</code>, you must also include a value for
     *         the <code>Iops</code> parameter.
     *         </p>
     *         </li>
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The storage type to associate with the DB instance.
     * </p>
     * <p>
     * Valid Values: <code>gp2 | gp3 | io1 | io2 | standard</code>
     * </p>
     * <p>
     * Default: <code>io1</code>, if the <code>Iops</code> parameter is specified. Otherwise, <code>gp2</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify <code>io1</code>, <code>io2</code>, or <code>gp3</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageType
     *        The storage type to associate with the DB instance.</p>
     *        <p>
     *        Valid Values: <code>gp2 | gp3 | io1 | io2 | standard</code>
     *        </p>
     *        <p>
     *        Default: <code>io1</code>, if the <code>Iops</code> parameter is specified. Otherwise, <code>gp2</code>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify <code>io1</code>, <code>io2</code>, or <code>gp3</code>, you must also include a value for
     *        the <code>Iops</code> parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withStorageType(String storageType) {
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
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which to associate the instance for TDE encryption.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
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
     * 
     * @return The ARN from the key store with which to associate the instance for TDE encryption.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
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
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which to associate the instance for TDE encryption.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withTdeCredentialArn(String tdeCredentialArn) {
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

    public RestoreDBInstanceToPointInTimeRequest withTdeCredentialPassword(String tdeCredentialPassword) {
        setTdeCredentialPassword(tdeCredentialPassword);
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * 
     * @return A list of EC2 VPC security groups to associate with this DB instance.</p>
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
     * A list of EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with this DB instance.</p>
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
     * A list of EC2 VPC security groups to associate with this DB instance.
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
     *        A list of EC2 VPC security groups to associate with this DB instance.</p>
     *        <p>
     *        Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with this DB instance.</p>
     *        <p>
     *        Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The Active Directory directory ID to restore the DB instance in. Create the domain before running this command.
     * Currently, you can create only the MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances in an Active
     * Directory Domain.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param domain
     *        The Active Directory directory ID to restore the DB instance in. Create the domain before running this
     *        command. Currently, you can create only the MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB
     *        instances in an Active Directory Domain.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     *        Authentication</a> in the <i>Amazon RDS User Guide</i>.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to restore the DB instance in. Create the domain before running this command.
     * Currently, you can create only the MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances in an Active
     * Directory Domain.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @return The Active Directory directory ID to restore the DB instance in. Create the domain before running this
     *         command. Currently, you can create only the MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB
     *         instances in an Active Directory Domain.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     *         Authentication</a> in the <i>Amazon RDS User Guide</i>.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to restore the DB instance in. Create the domain before running this command.
     * Currently, you can create only the MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances in an Active
     * Directory Domain.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param domain
     *        The Active Directory directory ID to restore the DB instance in. Create the domain before running this
     *        command. Currently, you can create only the MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB
     *        instances in an Active Directory Domain.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     *        Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param domainIAMRoleName
     *        The name of the IAM role to use when making API calls to the Directory Service.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     */

    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    /**
     * <p>
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return The name of the IAM role to use when making API calls to the Directory Service.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public String getDomainIAMRoleName() {
        return this.domainIAMRoleName;
    }

    /**
     * <p>
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param domainIAMRoleName
     *        The name of the IAM role to use when making API calls to the Directory Service.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDomainIAMRoleName(String domainIAMRoleName) {
        setDomainIAMRoleName(domainIAMRoleName);
        return this;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of an Active Directory domain.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 64 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mymanagedADtest.mymanagedAD.mydomain</code>
     * </p>
     * 
     * @param domainFqdn
     *        The fully qualified domain name (FQDN) of an Active Directory domain.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be longer than 64 characters.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mymanagedADtest.mymanagedAD.mydomain</code>
     */

    public void setDomainFqdn(String domainFqdn) {
        this.domainFqdn = domainFqdn;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of an Active Directory domain.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 64 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mymanagedADtest.mymanagedAD.mydomain</code>
     * </p>
     * 
     * @return The fully qualified domain name (FQDN) of an Active Directory domain.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be longer than 64 characters.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>mymanagedADtest.mymanagedAD.mydomain</code>
     */

    public String getDomainFqdn() {
        return this.domainFqdn;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of an Active Directory domain.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 64 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mymanagedADtest.mymanagedAD.mydomain</code>
     * </p>
     * 
     * @param domainFqdn
     *        The fully qualified domain name (FQDN) of an Active Directory domain.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be longer than 64 characters.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mymanagedADtest.mymanagedAD.mydomain</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDomainFqdn(String domainFqdn) {
        setDomainFqdn(domainFqdn);
        return this;
    }

    /**
     * <p>
     * The Active Directory organizational unit for your DB instance to join.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the distinguished name format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be longer than 64 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>OU=mymanagedADtestOU,DC=mymanagedADtest,DC=mymanagedAD,DC=mydomain</code>
     * </p>
     * 
     * @param domainOu
     *        The Active Directory organizational unit for your DB instance to join.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the distinguished name format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be longer than 64 characters.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>OU=mymanagedADtestOU,DC=mymanagedADtest,DC=mymanagedAD,DC=mydomain</code>
     */

    public void setDomainOu(String domainOu) {
        this.domainOu = domainOu;
    }

    /**
     * <p>
     * The Active Directory organizational unit for your DB instance to join.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the distinguished name format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be longer than 64 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>OU=mymanagedADtestOU,DC=mymanagedADtest,DC=mymanagedAD,DC=mydomain</code>
     * </p>
     * 
     * @return The Active Directory organizational unit for your DB instance to join.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the distinguished name format.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be longer than 64 characters.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>OU=mymanagedADtestOU,DC=mymanagedADtest,DC=mymanagedAD,DC=mydomain</code>
     */

    public String getDomainOu() {
        return this.domainOu;
    }

    /**
     * <p>
     * The Active Directory organizational unit for your DB instance to join.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the distinguished name format.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be longer than 64 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>OU=mymanagedADtestOU,DC=mymanagedADtest,DC=mymanagedAD,DC=mydomain</code>
     * </p>
     * 
     * @param domainOu
     *        The Active Directory organizational unit for your DB instance to join.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the distinguished name format.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be longer than 64 characters.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>OU=mymanagedADtestOU,DC=mymanagedADtest,DC=mymanagedAD,DC=mydomain</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDomainOu(String domainOu) {
        setDomainOu(domainOu);
        return this;
    }

    /**
     * <p>
     * The ARN for the Secrets Manager secret with the credentials for the user joining the domain.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 64 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456</code>
     * </p>
     * 
     * @param domainAuthSecretArn
     *        The ARN for the Secrets Manager secret with the credentials for the user joining the domain.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be longer than 64 characters.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456</code>
     */

    public void setDomainAuthSecretArn(String domainAuthSecretArn) {
        this.domainAuthSecretArn = domainAuthSecretArn;
    }

    /**
     * <p>
     * The ARN for the Secrets Manager secret with the credentials for the user joining the domain.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 64 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456</code>
     * </p>
     * 
     * @return The ARN for the Secrets Manager secret with the credentials for the user joining the domain.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be longer than 64 characters.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example:
     *         <code>arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456</code>
     */

    public String getDomainAuthSecretArn() {
        return this.domainAuthSecretArn;
    }

    /**
     * <p>
     * The ARN for the Secrets Manager secret with the credentials for the user joining the domain.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 64 characters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456</code>
     * </p>
     * 
     * @param domainAuthSecretArn
     *        The ARN for the Secrets Manager secret with the credentials for the user joining the domain.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be longer than 64 characters.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDomainAuthSecretArn(String domainAuthSecretArn) {
        setDomainAuthSecretArn(domainAuthSecretArn);
        return this;
    }

    /**
     * <p>
     * The IPv4 DNS IP addresses of your primary and secondary Active Directory domain controllers.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Two IP addresses must be provided. If there isn't a secondary domain controller, use the IP address of the
     * primary domain controller for both entries in the list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>123.124.125.126,234.235.236.237</code>
     * </p>
     * 
     * @return The IPv4 DNS IP addresses of your primary and secondary Active Directory domain controllers.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Two IP addresses must be provided. If there isn't a secondary domain controller, use the IP address of
     *         the primary domain controller for both entries in the list.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>123.124.125.126,234.235.236.237</code>
     */

    public java.util.List<String> getDomainDnsIps() {
        if (domainDnsIps == null) {
            domainDnsIps = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return domainDnsIps;
    }

    /**
     * <p>
     * The IPv4 DNS IP addresses of your primary and secondary Active Directory domain controllers.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Two IP addresses must be provided. If there isn't a secondary domain controller, use the IP address of the
     * primary domain controller for both entries in the list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>123.124.125.126,234.235.236.237</code>
     * </p>
     * 
     * @param domainDnsIps
     *        The IPv4 DNS IP addresses of your primary and secondary Active Directory domain controllers.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Two IP addresses must be provided. If there isn't a secondary domain controller, use the IP address of the
     *        primary domain controller for both entries in the list.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>123.124.125.126,234.235.236.237</code>
     */

    public void setDomainDnsIps(java.util.Collection<String> domainDnsIps) {
        if (domainDnsIps == null) {
            this.domainDnsIps = null;
            return;
        }

        this.domainDnsIps = new com.amazonaws.internal.SdkInternalList<String>(domainDnsIps);
    }

    /**
     * <p>
     * The IPv4 DNS IP addresses of your primary and secondary Active Directory domain controllers.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Two IP addresses must be provided. If there isn't a secondary domain controller, use the IP address of the
     * primary domain controller for both entries in the list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>123.124.125.126,234.235.236.237</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainDnsIps(java.util.Collection)} or {@link #withDomainDnsIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param domainDnsIps
     *        The IPv4 DNS IP addresses of your primary and secondary Active Directory domain controllers.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Two IP addresses must be provided. If there isn't a secondary domain controller, use the IP address of the
     *        primary domain controller for both entries in the list.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>123.124.125.126,234.235.236.237</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDomainDnsIps(String... domainDnsIps) {
        if (this.domainDnsIps == null) {
            setDomainDnsIps(new com.amazonaws.internal.SdkInternalList<String>(domainDnsIps.length));
        }
        for (String ele : domainDnsIps) {
            this.domainDnsIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv4 DNS IP addresses of your primary and secondary Active Directory domain controllers.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Two IP addresses must be provided. If there isn't a secondary domain controller, use the IP address of the
     * primary domain controller for both entries in the list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>123.124.125.126,234.235.236.237</code>
     * </p>
     * 
     * @param domainDnsIps
     *        The IPv4 DNS IP addresses of your primary and secondary Active Directory domain controllers.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Two IP addresses must be provided. If there isn't a secondary domain controller, use the IP address of the
     *        primary domain controller for both entries in the list.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>123.124.125.126,234.235.236.237</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDomainDnsIps(java.util.Collection<String> domainDnsIps) {
        setDomainDnsIps(domainDnsIps);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts to
     * database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts
     *        to database accounts. By default, mapping isn't enabled.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        For more information about IAM database authentication, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *        Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     */

    public void setEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts to
     * database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts
     *         to database accounts. By default, mapping isn't enabled.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         For more information about IAM database authentication, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *         Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     */

    public Boolean getEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts to
     * database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts
     *        to database accounts. By default, mapping isn't enabled.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        For more information about IAM database authentication, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *        Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        setEnableIAMDatabaseAuthentication(enableIAMDatabaseAuthentication);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts to
     * database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * 
     * @return Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts
     *         to database accounts. By default, mapping isn't enabled.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         For more information about IAM database authentication, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *         Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     */

    public Boolean isEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * The list of logs that the restored DB instance is to export to CloudWatch Logs. The values in the list depend on
     * the DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return The list of logs that the restored DB instance is to export to CloudWatch Logs. The values in the list
     *         depend on the DB engine being used. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.</p>
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
     * The list of logs that the restored DB instance is to export to CloudWatch Logs. The values in the list depend on
     * the DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the restored DB instance is to export to CloudWatch Logs. The values in the list
     *        depend on the DB engine being used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.</p>
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
     * The list of logs that the restored DB instance is to export to CloudWatch Logs. The values in the list depend on
     * the DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
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
     *        The list of logs that the restored DB instance is to export to CloudWatch Logs. The values in the list
     *        depend on the DB engine being used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withEnableCloudwatchLogsExports(String... enableCloudwatchLogsExports) {
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
     * The list of logs that the restored DB instance is to export to CloudWatch Logs. The values in the list depend on
     * the DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the restored DB instance is to export to CloudWatch Logs. The values in the list
     *        depend on the DB engine being used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
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

    public RestoreDBInstanceToPointInTimeRequest withProcessorFeatures(ProcessorFeature... processorFeatures) {
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

    public RestoreDBInstanceToPointInTimeRequest withProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param useDefaultProcessorFeatures
     *        Specifies whether the DB instance class of the DB instance uses its default processor features.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     */

    public void setUseDefaultProcessorFeatures(Boolean useDefaultProcessorFeatures) {
        this.useDefaultProcessorFeatures = useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * Specifies whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return Specifies whether the DB instance class of the DB instance uses its default processor features.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public Boolean getUseDefaultProcessorFeatures() {
        return this.useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * Specifies whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param useDefaultProcessorFeatures
     *        Specifies whether the DB instance class of the DB instance uses its default processor features.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withUseDefaultProcessorFeatures(Boolean useDefaultProcessorFeatures) {
        setUseDefaultProcessorFeatures(useDefaultProcessorFeatures);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return Specifies whether the DB instance class of the DB instance uses its default processor features.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public Boolean isUseDefaultProcessorFeatures() {
        return this.useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then the default
     * <code>DBParameterGroup</code> for the specified DB engine is used.
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
     * If supplied, must match the name of an existing DB parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group to associate with this DB instance.</p>
     *        <p>
     *        If you do not specify a value for <code>DBParameterGroupName</code>, then the default
     *        <code>DBParameterGroup</code> for the specified DB engine is used.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing DB parameter group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
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
     */

    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then the default
     * <code>DBParameterGroup</code> for the specified DB engine is used.
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
     * If supplied, must match the name of an existing DB parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
     * 
     * @return The name of the DB parameter group to associate with this DB instance.</p>
     *         <p>
     *         If you do not specify a value for <code>DBParameterGroupName</code>, then the default
     *         <code>DBParameterGroup</code> for the specified DB engine is used.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the name of an existing DB parameter group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters, numbers, or hyphens.
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
     */

    public String getDBParameterGroupName() {
        return this.dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance.
     * </p>
     * <p>
     * If you do not specify a value for <code>DBParameterGroupName</code>, then the default
     * <code>DBParameterGroup</code> for the specified DB engine is used.
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
     * If supplied, must match the name of an existing DB parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group to associate with this DB instance.</p>
     *        <p>
     *        If you do not specify a value for <code>DBParameterGroupName</code>, then the default
     *        <code>DBParameterGroup</code> for the specified DB engine is used.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing DB parameter group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDBParameterGroupName(String dBParameterGroupName) {
        setDBParameterGroupName(dBParameterGroupName);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled. By default, deletion protection isn't enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @param deletionProtection
     *        Specifies whether the DB instance has deletion protection enabled. The database can't be deleted when
     *        deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see
     *        <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *        Instance</a>.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Specifies whether the DB instance has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled. By default, deletion protection isn't enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @return Specifies whether the DB instance has deletion protection enabled. The database can't be deleted when
     *         deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see
     *         <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *         Instance</a>.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Specifies whether the DB instance has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled. By default, deletion protection isn't enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @param deletionProtection
     *        Specifies whether the DB instance has deletion protection enabled. The database can't be deleted when
     *        deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see
     *        <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *        Instance</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled. By default, deletion protection isn't enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * 
     * @return Specifies whether the DB instance has deletion protection enabled. The database can't be deleted when
     *         deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see
     *         <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *         Instance</a>.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * The resource ID of the source DB instance from which to restore.
     * </p>
     * 
     * @param sourceDbiResourceId
     *        The resource ID of the source DB instance from which to restore.
     */

    public void setSourceDbiResourceId(String sourceDbiResourceId) {
        this.sourceDbiResourceId = sourceDbiResourceId;
    }

    /**
     * <p>
     * The resource ID of the source DB instance from which to restore.
     * </p>
     * 
     * @return The resource ID of the source DB instance from which to restore.
     */

    public String getSourceDbiResourceId() {
        return this.sourceDbiResourceId;
    }

    /**
     * <p>
     * The resource ID of the source DB instance from which to restore.
     * </p>
     * 
     * @param sourceDbiResourceId
     *        The resource ID of the source DB instance from which to restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withSourceDbiResourceId(String sourceDbiResourceId) {
        setSourceDbiResourceId(sourceDbiResourceId);
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
     * <p>
     * This setting doesn't apply to RDS Custom.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withMaxAllocatedStorage(Integer maxAllocatedStorage) {
        setMaxAllocatedStorage(maxAllocatedStorage);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated automated backups from which to restore, for example,
     * <code>arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param sourceDBInstanceAutomatedBackupsArn
     *        The Amazon Resource Name (ARN) of the replicated automated backups from which to restore, for example,
     *        <code>arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE</code>.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     */

    public void setSourceDBInstanceAutomatedBackupsArn(String sourceDBInstanceAutomatedBackupsArn) {
        this.sourceDBInstanceAutomatedBackupsArn = sourceDBInstanceAutomatedBackupsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated automated backups from which to restore, for example,
     * <code>arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replicated automated backups from which to restore, for example,
     *         <code>arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE</code>.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
     */

    public String getSourceDBInstanceAutomatedBackupsArn() {
        return this.sourceDBInstanceAutomatedBackupsArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replicated automated backups from which to restore, for example,
     * <code>arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
     * </p>
     * 
     * @param sourceDBInstanceAutomatedBackupsArn
     *        The Amazon Resource Name (ARN) of the replicated automated backups from which to restore, for example,
     *        <code>arn:aws:rds:us-east-1:123456789012:auto-backup:ab-L2IJCEXJP7XQ7HOJ4SIEXAMPLE</code>.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withSourceDBInstanceAutomatedBackupsArn(String sourceDBInstanceAutomatedBackupsArn) {
        setSourceDBInstanceAutomatedBackupsArn(sourceDBInstanceAutomatedBackupsArn);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from
     * outside of its virtual private cloud (VPC) on your local network.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
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
     *        Specifies whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.</p>
     *        <p>
     *        A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     *        on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB
     *        instance from outside of its virtual private cloud (VPC) on your local network.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
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
     * Specifies whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from
     * outside of its virtual private cloud (VPC) on your local network.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
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
     * @return Specifies whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.</p>
     *         <p>
     *         A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     *         on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB
     *         instance from outside of its virtual private cloud (VPC) on your local network.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
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
     * Specifies whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from
     * outside of its virtual private cloud (VPC) on your local network.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
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
     *        Specifies whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.</p>
     *        <p>
     *        A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     *        on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB
     *        instance from outside of its virtual private cloud (VPC) on your local network.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom.
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

    public RestoreDBInstanceToPointInTimeRequest withEnableCustomerOwnedIp(Boolean enableCustomerOwnedIp) {
        setEnableCustomerOwnedIp(enableCustomerOwnedIp);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.
     * </p>
     * <p>
     * A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     * on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB instance from
     * outside of its virtual private cloud (VPC) on your local network.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom.
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
     * @return Specifies whether to enable a customer-owned IP address (CoIP) for an RDS on Outposts DB instance.</p>
     *         <p>
     *         A <i>CoIP</i> provides local or external connectivity to resources in your Outpost subnets through your
     *         on-premises network. For some use cases, a CoIP can provide lower latency for connections to the DB
     *         instance from outside of its virtual private cloud (VPC) on your local network.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom.
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

    public RestoreDBInstanceToPointInTimeRequest withCustomIamInstanceProfile(String customIamInstanceProfile) {
        setCustomIamInstanceProfile(customIamInstanceProfile);
        return this;
    }

    /**
     * <p>
     * The location for storing automated backups and manual snapshots for the restored DB instance.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>outposts</code> (Amazon Web Services Outposts)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region</code> (Amazon Web Services Region)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>region</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on
     * Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param backupTarget
     *        The location for storing automated backups and manual snapshots for the restored DB instance.</p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>outposts</code> (Amazon Web Services Outposts)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>region</code> (Amazon Web Services Region)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>region</code>
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
     * The location for storing automated backups and manual snapshots for the restored DB instance.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>outposts</code> (Amazon Web Services Outposts)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region</code> (Amazon Web Services Region)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>region</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on
     * Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @return The location for storing automated backups and manual snapshots for the restored DB instance.</p>
     *         <p>
     *         Valid Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>outposts</code> (Amazon Web Services Outposts)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>region</code> (Amazon Web Services Region)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>region</code>
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
     * The location for storing automated backups and manual snapshots for the restored DB instance.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>outposts</code> (Amazon Web Services Outposts)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>region</code> (Amazon Web Services Region)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>region</code>
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS on
     * Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * 
     * @param backupTarget
     *        The location for storing automated backups and manual snapshots for the restored DB instance.</p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>outposts</code> (Amazon Web Services Outposts)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>region</code> (Amazon Web Services Region)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>region</code>
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-on-outposts.html">Working with Amazon RDS
     *        on Amazon Web Services Outposts</a> in the <i>Amazon RDS User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withBackupTarget(String backupTarget) {
        setBackupTarget(backupTarget);
        return this;
    }

    /**
     * <p>
     * The network type of the DB instance.
     * </p>
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
     * <p>
     * Valid Values:
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
     * 
     * @param networkType
     *        The network type of the DB instance.</p>
     *        <p>
     *        The network type is determined by the <code>DBSubnetGroup</code> specified for the DB instance. A
     *        <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     *        <code>DUAL</code>).
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     *        Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Valid Values:
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
     */

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    /**
     * <p>
     * The network type of the DB instance.
     * </p>
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
     * <p>
     * Valid Values:
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
     * 
     * @return The network type of the DB instance.</p>
     *         <p>
     *         The network type is determined by the <code>DBSubnetGroup</code> specified for the DB instance. A
     *         <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     *         <code>DUAL</code>).
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     *         Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         <p>
     *         Valid Values:
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
     */

    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * <p>
     * The network type of the DB instance.
     * </p>
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
     * <p>
     * Valid Values:
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
     * 
     * @param networkType
     *        The network type of the DB instance.</p>
     *        <p>
     *        The network type is determined by the <code>DBSubnetGroup</code> specified for the DB instance. A
     *        <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     *        <code>DUAL</code>).
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     *        Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Valid Values:
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withNetworkType(String networkType) {
        setNetworkType(networkType);
        return this;
    }

    /**
     * <p>
     * The storage throughput value for the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     * </p>
     * 
     * @param storageThroughput
     *        The storage throughput value for the DB instance.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom or Amazon Aurora.
     */

    public void setStorageThroughput(Integer storageThroughput) {
        this.storageThroughput = storageThroughput;
    }

    /**
     * <p>
     * The storage throughput value for the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     * </p>
     * 
     * @return The storage throughput value for the DB instance.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom or Amazon Aurora.
     */

    public Integer getStorageThroughput() {
        return this.storageThroughput;
    }

    /**
     * <p>
     * The storage throughput value for the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom or Amazon Aurora.
     * </p>
     * 
     * @param storageThroughput
     *        The storage throughput value for the DB instance.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom or Amazon Aurora.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withStorageThroughput(Integer storageThroughput) {
        setStorageThroughput(storageThroughput);
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gibibytes) to allocate initially for the DB instance. Follow the allocation rules
     * specified in <code>CreateDBInstance</code>.
     * </p>
     * <note>
     * <p>
     * Be sure to allocate enough storage for your new DB instance so that the restore operation can succeed. You can
     * also allocate additional storage for future growth.
     * </p>
     * </note>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gibibytes) to allocate initially for the DB instance. Follow the allocation
     *        rules specified in <code>CreateDBInstance</code>.</p> <note>
     *        <p>
     *        Be sure to allocate enough storage for your new DB instance so that the restore operation can succeed. You
     *        can also allocate additional storage for future growth.
     *        </p>
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gibibytes) to allocate initially for the DB instance. Follow the allocation rules
     * specified in <code>CreateDBInstance</code>.
     * </p>
     * <note>
     * <p>
     * Be sure to allocate enough storage for your new DB instance so that the restore operation can succeed. You can
     * also allocate additional storage for future growth.
     * </p>
     * </note>
     * 
     * @return The amount of storage (in gibibytes) to allocate initially for the DB instance. Follow the allocation
     *         rules specified in <code>CreateDBInstance</code>.</p> <note>
     *         <p>
     *         Be sure to allocate enough storage for your new DB instance so that the restore operation can succeed.
     *         You can also allocate additional storage for future growth.
     *         </p>
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gibibytes) to allocate initially for the DB instance. Follow the allocation rules
     * specified in <code>CreateDBInstance</code>.
     * </p>
     * <note>
     * <p>
     * Be sure to allocate enough storage for your new DB instance so that the restore operation can succeed. You can
     * also allocate additional storage for future growth.
     * </p>
     * </note>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gibibytes) to allocate initially for the DB instance. Follow the allocation
     *        rules specified in <code>CreateDBInstance</code>.</p> <note>
     *        <p>
     *        Be sure to allocate enough storage for your new DB instance so that the restore operation can succeed. You
     *        can also allocate additional storage for future growth.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable a dedicated log volume (DLV) for the DB instance.
     * </p>
     * 
     * @param dedicatedLogVolume
     *        Specifies whether to enable a dedicated log volume (DLV) for the DB instance.
     */

    public void setDedicatedLogVolume(Boolean dedicatedLogVolume) {
        this.dedicatedLogVolume = dedicatedLogVolume;
    }

    /**
     * <p>
     * Specifies whether to enable a dedicated log volume (DLV) for the DB instance.
     * </p>
     * 
     * @return Specifies whether to enable a dedicated log volume (DLV) for the DB instance.
     */

    public Boolean getDedicatedLogVolume() {
        return this.dedicatedLogVolume;
    }

    /**
     * <p>
     * Specifies whether to enable a dedicated log volume (DLV) for the DB instance.
     * </p>
     * 
     * @param dedicatedLogVolume
     *        Specifies whether to enable a dedicated log volume (DLV) for the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withDedicatedLogVolume(Boolean dedicatedLogVolume) {
        setDedicatedLogVolume(dedicatedLogVolume);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable a dedicated log volume (DLV) for the DB instance.
     * </p>
     * 
     * @return Specifies whether to enable a dedicated log volume (DLV) for the DB instance.
     */

    public Boolean isDedicatedLogVolume() {
        return this.dedicatedLogVolume;
    }

    /**
     * <p>
     * The CA certificate identifier to use for the DB instance's server certificate.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html">Using SSL/TLS to encrypt a
     * connection to a DB instance</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html"> Using SSL/TLS to
     * encrypt a connection to a DB cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        The CA certificate identifier to use for the DB instance's server certificate.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html">Using SSL/TLS to
     *        encrypt a connection to a DB instance</a> in the <i>Amazon RDS User Guide</i> and <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html"> Using SSL/TLS
     *        to encrypt a connection to a DB cluster</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public void setCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
    }

    /**
     * <p>
     * The CA certificate identifier to use for the DB instance's server certificate.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html">Using SSL/TLS to encrypt a
     * connection to a DB instance</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html"> Using SSL/TLS to
     * encrypt a connection to a DB cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @return The CA certificate identifier to use for the DB instance's server certificate.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html">Using SSL/TLS to
     *         encrypt a connection to a DB instance</a> in the <i>Amazon RDS User Guide</i> and <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html"> Using SSL/TLS
     *         to encrypt a connection to a DB cluster</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public String getCACertificateIdentifier() {
        return this.cACertificateIdentifier;
    }

    /**
     * <p>
     * The CA certificate identifier to use for the DB instance's server certificate.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html">Using SSL/TLS to encrypt a
     * connection to a DB instance</a> in the <i>Amazon RDS User Guide</i> and <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html"> Using SSL/TLS to
     * encrypt a connection to a DB cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        The CA certificate identifier to use for the DB instance's server certificate.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html">Using SSL/TLS to
     *        encrypt a connection to a DB instance</a> in the <i>Amazon RDS User Guide</i> and <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL.html"> Using SSL/TLS
     *        to encrypt a connection to a DB cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withCACertificateIdentifier(String cACertificateIdentifier) {
        setCACertificateIdentifier(cACertificateIdentifier);
        return this;
    }

    /**
     * <p>
     * The life cycle type for this DB instance.
     * </p>
     * <note>
     * <p>
     * By default, this value is set to <code>open-source-rds-extended-support</code>, which enrolls your DB instance
     * into Amazon RDS Extended Support. At the end of standard support, you can avoid charges for Extended Support by
     * setting the value to <code>open-source-rds-extended-support-disabled</code>. In this case, RDS automatically
     * upgrades your restored DB instance to a higher engine version, if the major engine version is past its end of
     * standard support date.
     * </p>
     * </note>
     * <p>
     * You can use this setting to enroll your DB instance into Amazon RDS Extended Support. With RDS Extended Support,
     * you can run the selected major engine version on your DB instance past the end of standard support for that
     * engine version. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/extended-support.html">Using Amazon RDS Extended
     * Support</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting applies only to RDS for MySQL and RDS for PostgreSQL. For Amazon Aurora DB instances, the life cycle
     * type is managed by the DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>open-source-rds-extended-support | open-source-rds-extended-support-disabled</code>
     * </p>
     * <p>
     * Default: <code>open-source-rds-extended-support</code>
     * </p>
     * 
     * @param engineLifecycleSupport
     *        The life cycle type for this DB instance.</p> <note>
     *        <p>
     *        By default, this value is set to <code>open-source-rds-extended-support</code>, which enrolls your DB
     *        instance into Amazon RDS Extended Support. At the end of standard support, you can avoid charges for
     *        Extended Support by setting the value to <code>open-source-rds-extended-support-disabled</code>. In this
     *        case, RDS automatically upgrades your restored DB instance to a higher engine version, if the major engine
     *        version is past its end of standard support date.
     *        </p>
     *        </note>
     *        <p>
     *        You can use this setting to enroll your DB instance into Amazon RDS Extended Support. With RDS Extended
     *        Support, you can run the selected major engine version on your DB instance past the end of standard
     *        support for that engine version. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/extended-support.html">Using Amazon RDS
     *        Extended Support</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting applies only to RDS for MySQL and RDS for PostgreSQL. For Amazon Aurora DB instances, the
     *        life cycle type is managed by the DB cluster.
     *        </p>
     *        <p>
     *        Valid Values: <code>open-source-rds-extended-support | open-source-rds-extended-support-disabled</code>
     *        </p>
     *        <p>
     *        Default: <code>open-source-rds-extended-support</code>
     */

    public void setEngineLifecycleSupport(String engineLifecycleSupport) {
        this.engineLifecycleSupport = engineLifecycleSupport;
    }

    /**
     * <p>
     * The life cycle type for this DB instance.
     * </p>
     * <note>
     * <p>
     * By default, this value is set to <code>open-source-rds-extended-support</code>, which enrolls your DB instance
     * into Amazon RDS Extended Support. At the end of standard support, you can avoid charges for Extended Support by
     * setting the value to <code>open-source-rds-extended-support-disabled</code>. In this case, RDS automatically
     * upgrades your restored DB instance to a higher engine version, if the major engine version is past its end of
     * standard support date.
     * </p>
     * </note>
     * <p>
     * You can use this setting to enroll your DB instance into Amazon RDS Extended Support. With RDS Extended Support,
     * you can run the selected major engine version on your DB instance past the end of standard support for that
     * engine version. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/extended-support.html">Using Amazon RDS Extended
     * Support</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting applies only to RDS for MySQL and RDS for PostgreSQL. For Amazon Aurora DB instances, the life cycle
     * type is managed by the DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>open-source-rds-extended-support | open-source-rds-extended-support-disabled</code>
     * </p>
     * <p>
     * Default: <code>open-source-rds-extended-support</code>
     * </p>
     * 
     * @return The life cycle type for this DB instance.</p> <note>
     *         <p>
     *         By default, this value is set to <code>open-source-rds-extended-support</code>, which enrolls your DB
     *         instance into Amazon RDS Extended Support. At the end of standard support, you can avoid charges for
     *         Extended Support by setting the value to <code>open-source-rds-extended-support-disabled</code>. In this
     *         case, RDS automatically upgrades your restored DB instance to a higher engine version, if the major
     *         engine version is past its end of standard support date.
     *         </p>
     *         </note>
     *         <p>
     *         You can use this setting to enroll your DB instance into Amazon RDS Extended Support. With RDS Extended
     *         Support, you can run the selected major engine version on your DB instance past the end of standard
     *         support for that engine version. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/extended-support.html">Using Amazon RDS
     *         Extended Support</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         This setting applies only to RDS for MySQL and RDS for PostgreSQL. For Amazon Aurora DB instances, the
     *         life cycle type is managed by the DB cluster.
     *         </p>
     *         <p>
     *         Valid Values: <code>open-source-rds-extended-support | open-source-rds-extended-support-disabled</code>
     *         </p>
     *         <p>
     *         Default: <code>open-source-rds-extended-support</code>
     */

    public String getEngineLifecycleSupport() {
        return this.engineLifecycleSupport;
    }

    /**
     * <p>
     * The life cycle type for this DB instance.
     * </p>
     * <note>
     * <p>
     * By default, this value is set to <code>open-source-rds-extended-support</code>, which enrolls your DB instance
     * into Amazon RDS Extended Support. At the end of standard support, you can avoid charges for Extended Support by
     * setting the value to <code>open-source-rds-extended-support-disabled</code>. In this case, RDS automatically
     * upgrades your restored DB instance to a higher engine version, if the major engine version is past its end of
     * standard support date.
     * </p>
     * </note>
     * <p>
     * You can use this setting to enroll your DB instance into Amazon RDS Extended Support. With RDS Extended Support,
     * you can run the selected major engine version on your DB instance past the end of standard support for that
     * engine version. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/extended-support.html">Using Amazon RDS Extended
     * Support</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting applies only to RDS for MySQL and RDS for PostgreSQL. For Amazon Aurora DB instances, the life cycle
     * type is managed by the DB cluster.
     * </p>
     * <p>
     * Valid Values: <code>open-source-rds-extended-support | open-source-rds-extended-support-disabled</code>
     * </p>
     * <p>
     * Default: <code>open-source-rds-extended-support</code>
     * </p>
     * 
     * @param engineLifecycleSupport
     *        The life cycle type for this DB instance.</p> <note>
     *        <p>
     *        By default, this value is set to <code>open-source-rds-extended-support</code>, which enrolls your DB
     *        instance into Amazon RDS Extended Support. At the end of standard support, you can avoid charges for
     *        Extended Support by setting the value to <code>open-source-rds-extended-support-disabled</code>. In this
     *        case, RDS automatically upgrades your restored DB instance to a higher engine version, if the major engine
     *        version is past its end of standard support date.
     *        </p>
     *        </note>
     *        <p>
     *        You can use this setting to enroll your DB instance into Amazon RDS Extended Support. With RDS Extended
     *        Support, you can run the selected major engine version on your DB instance past the end of standard
     *        support for that engine version. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/extended-support.html">Using Amazon RDS
     *        Extended Support</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting applies only to RDS for MySQL and RDS for PostgreSQL. For Amazon Aurora DB instances, the
     *        life cycle type is managed by the DB cluster.
     *        </p>
     *        <p>
     *        Valid Values: <code>open-source-rds-extended-support | open-source-rds-extended-support-disabled</code>
     *        </p>
     *        <p>
     *        Default: <code>open-source-rds-extended-support</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBInstanceToPointInTimeRequest withEngineLifecycleSupport(String engineLifecycleSupport) {
        setEngineLifecycleSupport(engineLifecycleSupport);
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
        if (getSourceDBInstanceIdentifier() != null)
            sb.append("SourceDBInstanceIdentifier: ").append(getSourceDBInstanceIdentifier()).append(",");
        if (getTargetDBInstanceIdentifier() != null)
            sb.append("TargetDBInstanceIdentifier: ").append(getTargetDBInstanceIdentifier()).append(",");
        if (getRestoreTime() != null)
            sb.append("RestoreTime: ").append(getRestoreTime()).append(",");
        if (getUseLatestRestorableTime() != null)
            sb.append("UseLatestRestorableTime: ").append(getUseLatestRestorableTime()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: ").append(getDBSubnetGroupName()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getDBName() != null)
            sb.append("DBName: ").append(getDBName()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: ").append(getTdeCredentialArn()).append(",");
        if (getTdeCredentialPassword() != null)
            sb.append("TdeCredentialPassword: ").append(getTdeCredentialPassword()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: ").append(getDomainIAMRoleName()).append(",");
        if (getDomainFqdn() != null)
            sb.append("DomainFqdn: ").append(getDomainFqdn()).append(",");
        if (getDomainOu() != null)
            sb.append("DomainOu: ").append(getDomainOu()).append(",");
        if (getDomainAuthSecretArn() != null)
            sb.append("DomainAuthSecretArn: ").append(getDomainAuthSecretArn()).append(",");
        if (getDomainDnsIps() != null)
            sb.append("DomainDnsIps: ").append(getDomainDnsIps()).append(",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: ").append(getEnableIAMDatabaseAuthentication()).append(",");
        if (getEnableCloudwatchLogsExports() != null)
            sb.append("EnableCloudwatchLogsExports: ").append(getEnableCloudwatchLogsExports()).append(",");
        if (getProcessorFeatures() != null)
            sb.append("ProcessorFeatures: ").append(getProcessorFeatures()).append(",");
        if (getUseDefaultProcessorFeatures() != null)
            sb.append("UseDefaultProcessorFeatures: ").append(getUseDefaultProcessorFeatures()).append(",");
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: ").append(getDBParameterGroupName()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getSourceDbiResourceId() != null)
            sb.append("SourceDbiResourceId: ").append(getSourceDbiResourceId()).append(",");
        if (getMaxAllocatedStorage() != null)
            sb.append("MaxAllocatedStorage: ").append(getMaxAllocatedStorage()).append(",");
        if (getSourceDBInstanceAutomatedBackupsArn() != null)
            sb.append("SourceDBInstanceAutomatedBackupsArn: ").append(getSourceDBInstanceAutomatedBackupsArn()).append(",");
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
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getDedicatedLogVolume() != null)
            sb.append("DedicatedLogVolume: ").append(getDedicatedLogVolume()).append(",");
        if (getCACertificateIdentifier() != null)
            sb.append("CACertificateIdentifier: ").append(getCACertificateIdentifier()).append(",");
        if (getEngineLifecycleSupport() != null)
            sb.append("EngineLifecycleSupport: ").append(getEngineLifecycleSupport());
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
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null)
            return false;
        if (other.getDomainIAMRoleName() != null && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false)
            return false;
        if (other.getDomainFqdn() == null ^ this.getDomainFqdn() == null)
            return false;
        if (other.getDomainFqdn() != null && other.getDomainFqdn().equals(this.getDomainFqdn()) == false)
            return false;
        if (other.getDomainOu() == null ^ this.getDomainOu() == null)
            return false;
        if (other.getDomainOu() != null && other.getDomainOu().equals(this.getDomainOu()) == false)
            return false;
        if (other.getDomainAuthSecretArn() == null ^ this.getDomainAuthSecretArn() == null)
            return false;
        if (other.getDomainAuthSecretArn() != null && other.getDomainAuthSecretArn().equals(this.getDomainAuthSecretArn()) == false)
            return false;
        if (other.getDomainDnsIps() == null ^ this.getDomainDnsIps() == null)
            return false;
        if (other.getDomainDnsIps() != null && other.getDomainDnsIps().equals(this.getDomainDnsIps()) == false)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() == null ^ this.getEnableIAMDatabaseAuthentication() == null)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() != null
                && other.getEnableIAMDatabaseAuthentication().equals(this.getEnableIAMDatabaseAuthentication()) == false)
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
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getSourceDbiResourceId() == null ^ this.getSourceDbiResourceId() == null)
            return false;
        if (other.getSourceDbiResourceId() != null && other.getSourceDbiResourceId().equals(this.getSourceDbiResourceId()) == false)
            return false;
        if (other.getMaxAllocatedStorage() == null ^ this.getMaxAllocatedStorage() == null)
            return false;
        if (other.getMaxAllocatedStorage() != null && other.getMaxAllocatedStorage().equals(this.getMaxAllocatedStorage()) == false)
            return false;
        if (other.getSourceDBInstanceAutomatedBackupsArn() == null ^ this.getSourceDBInstanceAutomatedBackupsArn() == null)
            return false;
        if (other.getSourceDBInstanceAutomatedBackupsArn() != null
                && other.getSourceDBInstanceAutomatedBackupsArn().equals(this.getSourceDBInstanceAutomatedBackupsArn()) == false)
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
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getDedicatedLogVolume() == null ^ this.getDedicatedLogVolume() == null)
            return false;
        if (other.getDedicatedLogVolume() != null && other.getDedicatedLogVolume().equals(this.getDedicatedLogVolume()) == false)
            return false;
        if (other.getCACertificateIdentifier() == null ^ this.getCACertificateIdentifier() == null)
            return false;
        if (other.getCACertificateIdentifier() != null && other.getCACertificateIdentifier().equals(this.getCACertificateIdentifier()) == false)
            return false;
        if (other.getEngineLifecycleSupport() == null ^ this.getEngineLifecycleSupport() == null)
            return false;
        if (other.getEngineLifecycleSupport() != null && other.getEngineLifecycleSupport().equals(this.getEngineLifecycleSupport()) == false)
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
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        hashCode = prime * hashCode + ((getDomainFqdn() == null) ? 0 : getDomainFqdn().hashCode());
        hashCode = prime * hashCode + ((getDomainOu() == null) ? 0 : getDomainOu().hashCode());
        hashCode = prime * hashCode + ((getDomainAuthSecretArn() == null) ? 0 : getDomainAuthSecretArn().hashCode());
        hashCode = prime * hashCode + ((getDomainDnsIps() == null) ? 0 : getDomainDnsIps().hashCode());
        hashCode = prime * hashCode + ((getEnableIAMDatabaseAuthentication() == null) ? 0 : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode + ((getEnableCloudwatchLogsExports() == null) ? 0 : getEnableCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getUseDefaultProcessorFeatures() == null) ? 0 : getUseDefaultProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getSourceDbiResourceId() == null) ? 0 : getSourceDbiResourceId().hashCode());
        hashCode = prime * hashCode + ((getMaxAllocatedStorage() == null) ? 0 : getMaxAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getSourceDBInstanceAutomatedBackupsArn() == null) ? 0 : getSourceDBInstanceAutomatedBackupsArn().hashCode());
        hashCode = prime * hashCode + ((getEnableCustomerOwnedIp() == null) ? 0 : getEnableCustomerOwnedIp().hashCode());
        hashCode = prime * hashCode + ((getCustomIamInstanceProfile() == null) ? 0 : getCustomIamInstanceProfile().hashCode());
        hashCode = prime * hashCode + ((getBackupTarget() == null) ? 0 : getBackupTarget().hashCode());
        hashCode = prime * hashCode + ((getNetworkType() == null) ? 0 : getNetworkType().hashCode());
        hashCode = prime * hashCode + ((getStorageThroughput() == null) ? 0 : getStorageThroughput().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getDedicatedLogVolume() == null) ? 0 : getDedicatedLogVolume().hashCode());
        hashCode = prime * hashCode + ((getCACertificateIdentifier() == null) ? 0 : getCACertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEngineLifecycleSupport() == null) ? 0 : getEngineLifecycleSupport().hashCode());
        return hashCode;
    }

    @Override
    public RestoreDBInstanceToPointInTimeRequest clone() {
        return (RestoreDBInstanceToPointInTimeRequest) super.clone();
    }

}
