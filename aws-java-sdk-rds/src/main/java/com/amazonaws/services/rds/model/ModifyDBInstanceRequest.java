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
public class ModifyDBInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier for an existing DB instance
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
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The new storage capacity of the RDS instance. Changing this setting does not result in an outage and the change
     * is applied during the next maintenance window unless <code>ApplyImmediately</code> is set to <code>true</code>
     * for this request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 5-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 5-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 5-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 10-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Cannot be modified.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance will be
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance will be suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The new compute and memory capacity of the DB instance. To determine the instance classes that are available for
     * a particular DB engine, use the <a>DescribeOrderableDBInstanceOptions</a> action.
     * </p>
     * <p>
     * Passing a value for this setting causes an outage during the change and is applied during the next maintenance
     * window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different
     * VPC. If your DB instance is not in a VPC, you can also use this parameter to move your DB instance into a VPC.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     * >Updating the VPC for a DB Instance</a>.
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you specify <code>true</code> for the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * </p>
     * <p>
     * Example: <code>mySubnetGroup</code>
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * A list of DB security groups to authorize on this DB instance. Changing this setting does not result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
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
    private com.amazonaws.internal.SdkInternalList<String> dBSecurityGroups;
    /**
     * <p>
     * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
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
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance.
     * </p>
     * <p>
     * If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     * maintenance window. Some parameter changes can cause an outage and will be applied on the next call to
     * <a>RebootDBInstance</a>, or the next failure reboot. Review the table of parameters in <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying a DB
     * Instance and Using the Apply Immediately Parameter</a> to see the impact that setting
     * <code>ApplyImmediately</code> to <code>true</code> or <code>false</code> has for each modified parameter and to
     * determine when the changes will be applied.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean applyImmediately;
    /**
     * <p>
     * The new password for the DB instance master user. Can be any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Changing this parameter does not result in an outage and the change is asynchronously applied as soon as
     * possible. Between the time of the request and the completion of the request, the <code>MasterUserPassword</code>
     * element exists in the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: Must be 8 to 41 alphanumeric characters (MySQL, MariaDB, and Amazon Aurora), 8 to 30 alphanumeric
     * characters (Oracle), or 8 to 128 alphanumeric characters (SQL Server).
     * </p>
     * <note>
     * <p>
     * Amazon RDS API actions never return the password, so this action provides a way to regain access to a primary
     * instance user if the password is lost. This includes restoring privileges that might have been accidentally
     * revoked.
     * </p>
     * </note>
     */
    private String masterUserPassword;
    /**
     * <p>
     * The name of the DB parameter group to apply to the DB instance. Changing this setting does not result in an
     * outage. The parameter group name itself is changed immediately, but the actual parameter changes are not applied
     * until you reboot the instance without failover. The db instance will NOT be rebooted automatically and the
     * parameter changes will NOT be applied during the next maintenance window.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
     * </p>
     */
    private String dBParameterGroupName;
    /**
     * <p>
     * The number of days to retain automated backups. Setting this parameter to a positive number enables backups.
     * Setting this parameter to 0 disables automated backups.
     * </p>
     * <p>
     * Changing this parameter can result in an outage if you change from 0 to a non-zero value or from a non-zero value
     * to 0. These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code>
     * parameter is set to <code>true</code> for this request. If you change the parameter from one non-zero value to
     * another non-zero value, the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Default: Uses existing setting
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
     * Can be specified for a MySQL Read Replica only if the source is running MySQL 5.6
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be specified for a PostgreSQL Read Replica only if the source is running PostgreSQL 9.3.5
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be set to 0 if the DB instance is a source to Read Replicas
     * </p>
     * </li>
     * </ul>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter does not result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format hh24:mi-hh24:mi
     * </p>
     * </li>
     * <li>
     * <p>
     * Times should be in Universal Time Coordinated (UTC)
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes
     * </p>
     * </li>
     * </ul>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter does not result in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance
     * window is changed to include the current time, then changing this parameter will cause a reboot of the DB
     * instance. If moving this window to the current time, there must be at least 30 minutes between the current time
     * and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter does not result in an outage and
     * the change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * set to <code>true</code> for this request.
     * </p>
     * <p>
     * Constraints: Cannot be specified if the DB instance is a Read Replica.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * The version number of the database engine to upgrade to. Changing this parameter results in an outage and the
     * change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is set to
     * <code>true</code> for this request.
     * </p>
     * <p>
     * For major version upgrades, if a non-default DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     * <p>
     * For a list of valid engine versions, see <a>CreateDBInstance</a>.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter that is a
     * different major version than the DB instance's current version.
     * </p>
     */
    private Boolean allowMajorVersionUpgrade;
    /**
     * <p>
     * Indicates that minor version upgrades will be applied automatically to the DB instance during the maintenance
     * window. Changing this parameter does not result in an outage except in the following case and the change is
     * asynchronously applied as soon as possible. An outage will result if this parameter is set to <code>true</code>
     * during the maintenance window, and a newer minor version is available, and RDS has enabled auto patching for that
     * engine version.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * The new Provisioned IOPS (I/O operations per second) value for the RDS instance. Changing this setting does not
     * result in an outage and the change is applied during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value. If you are
     * migrating from Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a reboot
     * for the change in storage type to take effect.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Setting the IOPS value for the SQL Server database engine is not supported.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance will be
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance will be suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * Indicates that the DB instance should be associated with the specified option group. Changing this parameter does
     * not result in an outage except in the following case and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. If the parameter
     * change results in an option group that enables OEM, this change can cause a brief (sub-second) period during
     * which new connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an option
     * group, and that option group cannot be removed from a DB instance once it is associated with a DB instance
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance
     * identifier, an instance reboot will occur immediately if you set <code>Apply Immediately</code> to true, or will
     * occur during the next maintenance window if <code>Apply Immediately</code> to false. This value is stored as a
     * lowercase string.
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
    private String newDBInstanceIdentifier;
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
     * Indicates the certificate that needs to be associated with the instance.
     * </p>
     */
    private String cACertificateIdentifier;
    /**
     * <p>
     * The Active Directory Domain to move the instance to. Specify <code>none</code> to remove the instance from its
     * current domain. The domain must be created prior to this operation. Currently only a Microsoft SQL Server
     * instance can be created in a Active Directory Domain.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default is
     * false.
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
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
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for options
     * in the option group for the DB instance.
     * </p>
     * <p>
     * Your database will restart when you change the <code>DBPortNumber</code> value regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
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
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code> except for <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     */
    private Integer dBPortNumber;
    /**
     * <p>
     * Boolean value that indicates if the DB instance has a publicly resolvable DNS name. Set to <code>True</code> to
     * make the DB instance Internet-facing with a publicly resolvable DNS name, which resolves to a public IP address.
     * Set to <code>False</code> to make the DB instance internal with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a public
     * subnet and <code>PubliclyAccessible</code> must be true in order for it to be publicly accessible.
     * </p>
     * <p>
     * Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Default: false
     * </p>
     */
    private Boolean publiclyAccessible;
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
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     */
    private String domainIAMRoleName;
    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>.
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
     * Default constructor for ModifyDBInstanceRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public ModifyDBInstanceRequest() {
    }

    /**
     * Constructs a new ModifyDBInstanceRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier for an existing DB instance
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
    public ModifyDBInstanceRequest(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
    }

    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier for an existing DB instance
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
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier for an existing DB instance
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

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier for an existing DB instance
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
     * @return The DB instance identifier. This value is stored as a lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be the identifier for an existing DB instance
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

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the identifier for an existing DB instance
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
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier for an existing DB instance
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

    public ModifyDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The new storage capacity of the RDS instance. Changing this setting does not result in an outage and the change
     * is applied during the next maintenance window unless <code>ApplyImmediately</code> is set to <code>true</code>
     * for this request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 5-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 5-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 5-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 10-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Cannot be modified.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance will be
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance will be suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The new storage capacity of the RDS instance. Changing this setting does not result in an outage and the
     *        change is applied during the next maintenance window unless <code>ApplyImmediately</code> is set to
     *        <code>true</code> for this request. </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Valid Values: 5-6144
     *        </p>
     *        <p>
     *        Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at
     *        least 10% greater than the existing value are rounded up so that they are 10% greater than the current
     *        value.
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Valid Values: 5-6144
     *        </p>
     *        <p>
     *        Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at
     *        least 10% greater than the existing value are rounded up so that they are 10% greater than the current
     *        value.
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Valid Values: 5-6144
     *        </p>
     *        <p>
     *        Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at
     *        least 10% greater than the existing value are rounded up so that they are 10% greater than the current
     *        value.
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Valid Values: 10-6144
     *        </p>
     *        <p>
     *        Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at
     *        least 10% greater than the existing value are rounded up so that they are 10% greater than the current
     *        value.
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Cannot be modified.
     *        </p>
     *        <p>
     *        If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *        using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration
     *        depends on several factors such as database load, storage size, storage type (standard or Provisioned
     *        IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical
     *        migration times are under 24 hours, but the process can take up to several days in some cases. During the
     *        migration, the DB instance will be available for use, but might experience performance degradation. While
     *        the migration takes place, nightly backups for the instance will be suspended. No other Amazon RDS
     *        operations can take place for the instance, including modifying the instance, rebooting the instance,
     *        deleting the instance, creating a Read Replica for the instance, and creating a DB snapshot of the
     *        instance.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The new storage capacity of the RDS instance. Changing this setting does not result in an outage and the change
     * is applied during the next maintenance window unless <code>ApplyImmediately</code> is set to <code>true</code>
     * for this request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 5-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 5-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 5-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 10-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Cannot be modified.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance will be
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance will be suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * 
     * @return The new storage capacity of the RDS instance. Changing this setting does not result in an outage and the
     *         change is applied during the next maintenance window unless <code>ApplyImmediately</code> is set to
     *         <code>true</code> for this request. </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         Valid Values: 5-6144
     *         </p>
     *         <p>
     *         Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at
     *         least 10% greater than the existing value are rounded up so that they are 10% greater than the current
     *         value.
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         Valid Values: 5-6144
     *         </p>
     *         <p>
     *         Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at
     *         least 10% greater than the existing value are rounded up so that they are 10% greater than the current
     *         value.
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         Valid Values: 5-6144
     *         </p>
     *         <p>
     *         Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at
     *         least 10% greater than the existing value are rounded up so that they are 10% greater than the current
     *         value.
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         Valid Values: 10-6144
     *         </p>
     *         <p>
     *         Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at
     *         least 10% greater than the existing value are rounded up so that they are 10% greater than the current
     *         value.
     *         </p>
     *         <p>
     *         <b>SQL Server</b>
     *         </p>
     *         <p>
     *         Cannot be modified.
     *         </p>
     *         <p>
     *         If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *         using Provisioned IOPS to using standard storage, the process can take time. The duration of the
     *         migration depends on several factors such as database load, storage size, storage type (standard or
     *         Provisioned IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations.
     *         Typical migration times are under 24 hours, but the process can take up to several days in some cases.
     *         During the migration, the DB instance will be available for use, but might experience performance
     *         degradation. While the migration takes place, nightly backups for the instance will be suspended. No
     *         other Amazon RDS operations can take place for the instance, including modifying the instance, rebooting
     *         the instance, deleting the instance, creating a Read Replica for the instance, and creating a DB snapshot
     *         of the instance.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The new storage capacity of the RDS instance. Changing this setting does not result in an outage and the change
     * is applied during the next maintenance window unless <code>ApplyImmediately</code> is set to <code>true</code>
     * for this request.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 5-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 5-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 5-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values: 10-6144
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Cannot be modified.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance will be
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance will be suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The new storage capacity of the RDS instance. Changing this setting does not result in an outage and the
     *        change is applied during the next maintenance window unless <code>ApplyImmediately</code> is set to
     *        <code>true</code> for this request. </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Valid Values: 5-6144
     *        </p>
     *        <p>
     *        Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at
     *        least 10% greater than the existing value are rounded up so that they are 10% greater than the current
     *        value.
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Valid Values: 5-6144
     *        </p>
     *        <p>
     *        Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at
     *        least 10% greater than the existing value are rounded up so that they are 10% greater than the current
     *        value.
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Valid Values: 5-6144
     *        </p>
     *        <p>
     *        Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at
     *        least 10% greater than the existing value are rounded up so that they are 10% greater than the current
     *        value.
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Valid Values: 10-6144
     *        </p>
     *        <p>
     *        Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at
     *        least 10% greater than the existing value are rounded up so that they are 10% greater than the current
     *        value.
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Cannot be modified.
     *        </p>
     *        <p>
     *        If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *        using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration
     *        depends on several factors such as database load, storage size, storage type (standard or Provisioned
     *        IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical
     *        migration times are under 24 hours, but the process can take up to several days in some cases. During the
     *        migration, the DB instance will be available for use, but might experience performance degradation. While
     *        the migration takes place, nightly backups for the instance will be suspended. No other Amazon RDS
     *        operations can take place for the instance, including modifying the instance, rebooting the instance,
     *        deleting the instance, creating a Read Replica for the instance, and creating a DB snapshot of the
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The new compute and memory capacity of the DB instance. To determine the instance classes that are available for
     * a particular DB engine, use the <a>DescribeOrderableDBInstanceOptions</a> action.
     * </p>
     * <p>
     * Passing a value for this setting causes an outage during the change and is applied during the next maintenance
     * window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     * 
     * @param dBInstanceClass
     *        The new compute and memory capacity of the DB instance. To determine the instance classes that are
     *        available for a particular DB engine, use the <a>DescribeOrderableDBInstanceOptions</a> action. </p>
     *        <p>
     *        Passing a value for this setting causes an outage during the change and is applied during the next
     *        maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this
     *        request.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Valid Values:
     *        <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The new compute and memory capacity of the DB instance. To determine the instance classes that are available for
     * a particular DB engine, use the <a>DescribeOrderableDBInstanceOptions</a> action.
     * </p>
     * <p>
     * Passing a value for this setting causes an outage during the change and is applied during the next maintenance
     * window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     * 
     * @return The new compute and memory capacity of the DB instance. To determine the instance classes that are
     *         available for a particular DB engine, use the <a>DescribeOrderableDBInstanceOptions</a> action. </p>
     *         <p>
     *         Passing a value for this setting causes an outage during the change and is applied during the next
     *         maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this
     *         request.
     *         </p>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         Valid Values:
     *         <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The new compute and memory capacity of the DB instance. To determine the instance classes that are available for
     * a particular DB engine, use the <a>DescribeOrderableDBInstanceOptions</a> action.
     * </p>
     * <p>
     * Passing a value for this setting causes an outage during the change and is applied during the next maintenance
     * window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     * 
     * @param dBInstanceClass
     *        The new compute and memory capacity of the DB instance. To determine the instance classes that are
     *        available for a particular DB engine, use the <a>DescribeOrderableDBInstanceOptions</a> action. </p>
     *        <p>
     *        Passing a value for this setting causes an outage during the change and is applied during the next
     *        maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this
     *        request.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Valid Values:
     *        <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different
     * VPC. If your DB instance is not in a VPC, you can also use this parameter to move your DB instance into a VPC.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     * >Updating the VPC for a DB Instance</a>.
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you specify <code>true</code> for the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * </p>
     * <p>
     * Example: <code>mySubnetGroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a
     *        different VPC. If your DB instance is not in a VPC, you can also use this parameter to move your DB
     *        instance into a VPC. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     *        >Updating the VPC for a DB Instance</a>. </p>
     *        <p>
     *        Changing the subnet group causes an outage during the change. The change is applied during the next
     *        maintenance window, unless you specify <code>true</code> for the <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or
     *        hyphens.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetGroup</code>
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different
     * VPC. If your DB instance is not in a VPC, you can also use this parameter to move your DB instance into a VPC.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     * >Updating the VPC for a DB Instance</a>.
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you specify <code>true</code> for the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * </p>
     * <p>
     * Example: <code>mySubnetGroup</code>
     * </p>
     * 
     * @return The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a
     *         different VPC. If your DB instance is not in a VPC, you can also use this parameter to move your DB
     *         instance into a VPC. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     *         >Updating the VPC for a DB Instance</a>. </p>
     *         <p>
     *         Changing the subnet group causes an outage during the change. The change is applied during the next
     *         maintenance window, unless you specify <code>true</code> for the <code>ApplyImmediately</code> parameter.
     *         </p>
     *         <p>
     *         Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or
     *         hyphens.
     *         </p>
     *         <p>
     *         Example: <code>mySubnetGroup</code>
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different
     * VPC. If your DB instance is not in a VPC, you can also use this parameter to move your DB instance into a VPC.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     * >Updating the VPC for a DB Instance</a>.
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you specify <code>true</code> for the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * </p>
     * <p>
     * Example: <code>mySubnetGroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a
     *        different VPC. If your DB instance is not in a VPC, you can also use this parameter to move your DB
     *        instance into a VPC. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     *        >Updating the VPC for a DB Instance</a>. </p>
     *        <p>
     *        Changing the subnet group causes an outage during the change. The change is applied during the next
     *        maintenance window, unless you specify <code>true</code> for the <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or
     *        hyphens.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetGroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * A list of DB security groups to authorize on this DB instance. Changing this setting does not result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
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
     * @return A list of DB security groups to authorize on this DB instance. Changing this setting does not result in
     *         an outage and the change is asynchronously applied as soon as possible.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 alphanumeric characters
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

    public java.util.List<String> getDBSecurityGroups() {
        if (dBSecurityGroups == null) {
            dBSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dBSecurityGroups;
    }

    /**
     * <p>
     * A list of DB security groups to authorize on this DB instance. Changing this setting does not result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
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
     * @param dBSecurityGroups
     *        A list of DB security groups to authorize on this DB instance. Changing this setting does not result in an
     *        outage and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters
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

    public void setDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }

        this.dBSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>(dBSecurityGroups);
    }

    /**
     * <p>
     * A list of DB security groups to authorize on this DB instance. Changing this setting does not result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
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
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBSecurityGroups(java.util.Collection)} or {@link #withDBSecurityGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dBSecurityGroups
     *        A list of DB security groups to authorize on this DB instance. Changing this setting does not result in an
     *        outage and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters
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

    public ModifyDBInstanceRequest withDBSecurityGroups(String... dBSecurityGroups) {
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
     * A list of DB security groups to authorize on this DB instance. Changing this setting does not result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
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
     * @param dBSecurityGroups
     *        A list of DB security groups to authorize on this DB instance. Changing this setting does not result in an
     *        outage and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters
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

    public ModifyDBInstanceRequest withDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        setDBSecurityGroups(dBSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
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
     * @return A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied
     *         as soon as possible.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 alphanumeric characters
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

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
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
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied
     *        as soon as possible.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters
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

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
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
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied
     *        as soon as possible.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters
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

    public ModifyDBInstanceRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
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
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied
     *        as soon as possible.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters
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

    public ModifyDBInstanceRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance.
     * </p>
     * <p>
     * If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     * maintenance window. Some parameter changes can cause an outage and will be applied on the next call to
     * <a>RebootDBInstance</a>, or the next failure reboot. Review the table of parameters in <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying a DB
     * Instance and Using the Apply Immediately Parameter</a> to see the impact that setting
     * <code>ApplyImmediately</code> to <code>true</code> or <code>false</code> has for each modified parameter and to
     * determine when the changes will be applied.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param applyImmediately
     *        Specifies whether the modifications in this request and any pending modifications are asynchronously
     *        applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *        instance. </p>
     *        <p>
     *        If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     *        maintenance window. Some parameter changes can cause an outage and will be applied on the next call to
     *        <a>RebootDBInstance</a>, or the next failure reboot. Review the table of parameters in <a
     *        href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     *        a DB Instance and Using the Apply Immediately Parameter</a> to see the impact that setting
     *        <code>ApplyImmediately</code> to <code>true</code> or <code>false</code> has for each modified parameter
     *        and to determine when the changes will be applied.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance.
     * </p>
     * <p>
     * If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     * maintenance window. Some parameter changes can cause an outage and will be applied on the next call to
     * <a>RebootDBInstance</a>, or the next failure reboot. Review the table of parameters in <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying a DB
     * Instance and Using the Apply Immediately Parameter</a> to see the impact that setting
     * <code>ApplyImmediately</code> to <code>true</code> or <code>false</code> has for each modified parameter and to
     * determine when the changes will be applied.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Specifies whether the modifications in this request and any pending modifications are asynchronously
     *         applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *         instance. </p>
     *         <p>
     *         If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     *         maintenance window. Some parameter changes can cause an outage and will be applied on the next call to
     *         <a>RebootDBInstance</a>, or the next failure reboot. Review the table of parameters in <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     *         a DB Instance and Using the Apply Immediately Parameter</a> to see the impact that setting
     *         <code>ApplyImmediately</code> to <code>true</code> or <code>false</code> has for each modified parameter
     *         and to determine when the changes will be applied.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance.
     * </p>
     * <p>
     * If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     * maintenance window. Some parameter changes can cause an outage and will be applied on the next call to
     * <a>RebootDBInstance</a>, or the next failure reboot. Review the table of parameters in <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying a DB
     * Instance and Using the Apply Immediately Parameter</a> to see the impact that setting
     * <code>ApplyImmediately</code> to <code>true</code> or <code>false</code> has for each modified parameter and to
     * determine when the changes will be applied.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param applyImmediately
     *        Specifies whether the modifications in this request and any pending modifications are asynchronously
     *        applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *        instance. </p>
     *        <p>
     *        If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     *        maintenance window. Some parameter changes can cause an outage and will be applied on the next call to
     *        <a>RebootDBInstance</a>, or the next failure reboot. Review the table of parameters in <a
     *        href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     *        a DB Instance and Using the Apply Immediately Parameter</a> to see the impact that setting
     *        <code>ApplyImmediately</code> to <code>true</code> or <code>false</code> has for each modified parameter
     *        and to determine when the changes will be applied.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance.
     * </p>
     * <p>
     * If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     * maintenance window. Some parameter changes can cause an outage and will be applied on the next call to
     * <a>RebootDBInstance</a>, or the next failure reboot. Review the table of parameters in <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying a DB
     * Instance and Using the Apply Immediately Parameter</a> to see the impact that setting
     * <code>ApplyImmediately</code> to <code>true</code> or <code>false</code> has for each modified parameter and to
     * determine when the changes will be applied.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Specifies whether the modifications in this request and any pending modifications are asynchronously
     *         applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *         instance. </p>
     *         <p>
     *         If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     *         maintenance window. Some parameter changes can cause an outage and will be applied on the next call to
     *         <a>RebootDBInstance</a>, or the next failure reboot. Review the table of parameters in <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     *         a DB Instance and Using the Apply Immediately Parameter</a> to see the impact that setting
     *         <code>ApplyImmediately</code> to <code>true</code> or <code>false</code> has for each modified parameter
     *         and to determine when the changes will be applied.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * The new password for the DB instance master user. Can be any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Changing this parameter does not result in an outage and the change is asynchronously applied as soon as
     * possible. Between the time of the request and the completion of the request, the <code>MasterUserPassword</code>
     * element exists in the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: Must be 8 to 41 alphanumeric characters (MySQL, MariaDB, and Amazon Aurora), 8 to 30 alphanumeric
     * characters (Oracle), or 8 to 128 alphanumeric characters (SQL Server).
     * </p>
     * <note>
     * <p>
     * Amazon RDS API actions never return the password, so this action provides a way to regain access to a primary
     * instance user if the password is lost. This includes restoring privileges that might have been accidentally
     * revoked.
     * </p>
     * </note>
     * 
     * @param masterUserPassword
     *        The new password for the DB instance master user. Can be any printable ASCII character except "/",
     *        """, or "@".</p>
     *        <p>
     *        Changing this parameter does not result in an outage and the change is asynchronously applied as soon as
     *        possible. Between the time of the request and the completion of the request, the
     *        <code>MasterUserPassword</code> element exists in the <code>PendingModifiedValues</code> element of the
     *        operation response.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Constraints: Must be 8 to 41 alphanumeric characters (MySQL, MariaDB, and Amazon Aurora), 8 to 30
     *        alphanumeric characters (Oracle), or 8 to 128 alphanumeric characters (SQL Server).
     *        </p>
     *        <note>
     *        <p>
     *        Amazon RDS API actions never return the password, so this action provides a way to regain access to a
     *        primary instance user if the password is lost. This includes restoring privileges that might have been
     *        accidentally revoked.
     *        </p>
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The new password for the DB instance master user. Can be any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Changing this parameter does not result in an outage and the change is asynchronously applied as soon as
     * possible. Between the time of the request and the completion of the request, the <code>MasterUserPassword</code>
     * element exists in the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: Must be 8 to 41 alphanumeric characters (MySQL, MariaDB, and Amazon Aurora), 8 to 30 alphanumeric
     * characters (Oracle), or 8 to 128 alphanumeric characters (SQL Server).
     * </p>
     * <note>
     * <p>
     * Amazon RDS API actions never return the password, so this action provides a way to regain access to a primary
     * instance user if the password is lost. This includes restoring privileges that might have been accidentally
     * revoked.
     * </p>
     * </note>
     * 
     * @return The new password for the DB instance master user. Can be any printable ASCII character except "/",
     *         """, or "@".</p>
     *         <p>
     *         Changing this parameter does not result in an outage and the change is asynchronously applied as soon as
     *         possible. Between the time of the request and the completion of the request, the
     *         <code>MasterUserPassword</code> element exists in the <code>PendingModifiedValues</code> element of the
     *         operation response.
     *         </p>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         Constraints: Must be 8 to 41 alphanumeric characters (MySQL, MariaDB, and Amazon Aurora), 8 to 30
     *         alphanumeric characters (Oracle), or 8 to 128 alphanumeric characters (SQL Server).
     *         </p>
     *         <note>
     *         <p>
     *         Amazon RDS API actions never return the password, so this action provides a way to regain access to a
     *         primary instance user if the password is lost. This includes restoring privileges that might have been
     *         accidentally revoked.
     *         </p>
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The new password for the DB instance master user. Can be any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Changing this parameter does not result in an outage and the change is asynchronously applied as soon as
     * possible. Between the time of the request and the completion of the request, the <code>MasterUserPassword</code>
     * element exists in the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: Must be 8 to 41 alphanumeric characters (MySQL, MariaDB, and Amazon Aurora), 8 to 30 alphanumeric
     * characters (Oracle), or 8 to 128 alphanumeric characters (SQL Server).
     * </p>
     * <note>
     * <p>
     * Amazon RDS API actions never return the password, so this action provides a way to regain access to a primary
     * instance user if the password is lost. This includes restoring privileges that might have been accidentally
     * revoked.
     * </p>
     * </note>
     * 
     * @param masterUserPassword
     *        The new password for the DB instance master user. Can be any printable ASCII character except "/",
     *        """, or "@".</p>
     *        <p>
     *        Changing this parameter does not result in an outage and the change is asynchronously applied as soon as
     *        possible. Between the time of the request and the completion of the request, the
     *        <code>MasterUserPassword</code> element exists in the <code>PendingModifiedValues</code> element of the
     *        operation response.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Constraints: Must be 8 to 41 alphanumeric characters (MySQL, MariaDB, and Amazon Aurora), 8 to 30
     *        alphanumeric characters (Oracle), or 8 to 128 alphanumeric characters (SQL Server).
     *        </p>
     *        <note>
     *        <p>
     *        Amazon RDS API actions never return the password, so this action provides a way to regain access to a
     *        primary instance user if the password is lost. This includes restoring privileges that might have been
     *        accidentally revoked.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to the DB instance. Changing this setting does not result in an
     * outage. The parameter group name itself is changed immediately, but the actual parameter changes are not applied
     * until you reboot the instance without failover. The db instance will NOT be rebooted automatically and the
     * parameter changes will NOT be applied during the next maintenance window.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
     * </p>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group to apply to the DB instance. Changing this setting does not result in
     *        an outage. The parameter group name itself is changed immediately, but the actual parameter changes are
     *        not applied until you reboot the instance without failover. The db instance will NOT be rebooted
     *        automatically and the parameter changes will NOT be applied during the next maintenance window.</p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
     */

    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to the DB instance. Changing this setting does not result in an
     * outage. The parameter group name itself is changed immediately, but the actual parameter changes are not applied
     * until you reboot the instance without failover. The db instance will NOT be rebooted automatically and the
     * parameter changes will NOT be applied during the next maintenance window.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
     * </p>
     * 
     * @return The name of the DB parameter group to apply to the DB instance. Changing this setting does not result in
     *         an outage. The parameter group name itself is changed immediately, but the actual parameter changes are
     *         not applied until you reboot the instance without failover. The db instance will NOT be rebooted
     *         automatically and the parameter changes will NOT be applied during the next maintenance window.</p>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
     */

    public String getDBParameterGroupName() {
        return this.dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to the DB instance. Changing this setting does not result in an
     * outage. The parameter group name itself is changed immediately, but the actual parameter changes are not applied
     * until you reboot the instance without failover. The db instance will NOT be rebooted automatically and the
     * parameter changes will NOT be applied during the next maintenance window.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
     * </p>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group to apply to the DB instance. Changing this setting does not result in
     *        an outage. The parameter group name itself is changed immediately, but the actual parameter changes are
     *        not applied until you reboot the instance without failover. The db instance will NOT be rebooted
     *        automatically and the parameter changes will NOT be applied during the next maintenance window.</p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Constraints: The DB parameter group must be in the same DB parameter group family as this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBParameterGroupName(String dBParameterGroupName) {
        setDBParameterGroupName(dBParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The number of days to retain automated backups. Setting this parameter to a positive number enables backups.
     * Setting this parameter to 0 disables automated backups.
     * </p>
     * <p>
     * Changing this parameter can result in an outage if you change from 0 to a non-zero value or from a non-zero value
     * to 0. These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code>
     * parameter is set to <code>true</code> for this request. If you change the parameter from one non-zero value to
     * another non-zero value, the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Default: Uses existing setting
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
     * Can be specified for a MySQL Read Replica only if the source is running MySQL 5.6
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be specified for a PostgreSQL Read Replica only if the source is running PostgreSQL 9.3.5
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be set to 0 if the DB instance is a source to Read Replicas
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days to retain automated backups. Setting this parameter to a positive number enables
     *        backups. Setting this parameter to 0 disables automated backups.</p>
     *        <p>
     *        Changing this parameter can result in an outage if you change from 0 to a non-zero value or from a
     *        non-zero value to 0. These changes are applied during the next maintenance window unless the
     *        <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. If you change the
     *        parameter from one non-zero value to another non-zero value, the change is asynchronously applied as soon
     *        as possible.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
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
     *        Can be specified for a MySQL Read Replica only if the source is running MySQL 5.6
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can be specified for a PostgreSQL Read Replica only if the source is running PostgreSQL 9.3.5
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be set to 0 if the DB instance is a source to Read Replicas
     *        </p>
     *        </li>
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain automated backups. Setting this parameter to a positive number enables backups.
     * Setting this parameter to 0 disables automated backups.
     * </p>
     * <p>
     * Changing this parameter can result in an outage if you change from 0 to a non-zero value or from a non-zero value
     * to 0. These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code>
     * parameter is set to <code>true</code> for this request. If you change the parameter from one non-zero value to
     * another non-zero value, the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Default: Uses existing setting
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
     * Can be specified for a MySQL Read Replica only if the source is running MySQL 5.6
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be specified for a PostgreSQL Read Replica only if the source is running PostgreSQL 9.3.5
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be set to 0 if the DB instance is a source to Read Replicas
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of days to retain automated backups. Setting this parameter to a positive number enables
     *         backups. Setting this parameter to 0 disables automated backups.</p>
     *         <p>
     *         Changing this parameter can result in an outage if you change from 0 to a non-zero value or from a
     *         non-zero value to 0. These changes are applied during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. If you change the
     *         parameter from one non-zero value to another non-zero value, the change is asynchronously applied as soon
     *         as possible.
     *         </p>
     *         <p>
     *         Default: Uses existing setting
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
     *         Can be specified for a MySQL Read Replica only if the source is running MySQL 5.6
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can be specified for a PostgreSQL Read Replica only if the source is running PostgreSQL 9.3.5
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be set to 0 if the DB instance is a source to Read Replicas
     *         </p>
     *         </li>
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain automated backups. Setting this parameter to a positive number enables backups.
     * Setting this parameter to 0 disables automated backups.
     * </p>
     * <p>
     * Changing this parameter can result in an outage if you change from 0 to a non-zero value or from a non-zero value
     * to 0. These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code>
     * parameter is set to <code>true</code> for this request. If you change the parameter from one non-zero value to
     * another non-zero value, the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Default: Uses existing setting
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
     * Can be specified for a MySQL Read Replica only if the source is running MySQL 5.6
     * </p>
     * </li>
     * <li>
     * <p>
     * Can be specified for a PostgreSQL Read Replica only if the source is running PostgreSQL 9.3.5
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be set to 0 if the DB instance is a source to Read Replicas
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days to retain automated backups. Setting this parameter to a positive number enables
     *        backups. Setting this parameter to 0 disables automated backups.</p>
     *        <p>
     *        Changing this parameter can result in an outage if you change from 0 to a non-zero value or from a
     *        non-zero value to 0. These changes are applied during the next maintenance window unless the
     *        <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. If you change the
     *        parameter from one non-zero value to another non-zero value, the change is asynchronously applied as soon
     *        as possible.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
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
     *        Can be specified for a MySQL Read Replica only if the source is running MySQL 5.6
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can be specified for a PostgreSQL Read Replica only if the source is running PostgreSQL 9.3.5
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be set to 0 if the DB instance is a source to Read Replicas
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter does not result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format hh24:mi-hh24:mi
     * </p>
     * </li>
     * <li>
     * <p>
     * Times should be in Universal Time Coordinated (UTC)
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled, as
     *        determined by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter does not result in
     *        an outage and the change is asynchronously applied as soon as possible. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the format hh24:mi-hh24:mi
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Times should be in Universal Time Coordinated (UTC)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes
     *        </p>
     *        </li>
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter does not result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format hh24:mi-hh24:mi
     * </p>
     * </li>
     * <li>
     * <p>
     * Times should be in Universal Time Coordinated (UTC)
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes
     * </p>
     * </li>
     * </ul>
     * 
     * @return The daily time range during which automated backups are created if automated backups are enabled, as
     *         determined by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter does not result
     *         in an outage and the change is asynchronously applied as soon as possible. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the format hh24:mi-hh24:mi
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Times should be in Universal Time Coordinated (UTC)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not conflict with the preferred maintenance window
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 30 minutes
     *         </p>
     *         </li>
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter does not result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format hh24:mi-hh24:mi
     * </p>
     * </li>
     * <li>
     * <p>
     * Times should be in Universal Time Coordinated (UTC)
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled, as
     *        determined by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter does not result in
     *        an outage and the change is asynchronously applied as soon as possible. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the format hh24:mi-hh24:mi
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Times should be in Universal Time Coordinated (UTC)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter does not result in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance
     * window is changed to include the current time, then changing this parameter will cause a reboot of the DB
     * instance. If moving this window to the current time, there must be at least 30 minutes between the current time
     * and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     *        Changing this parameter does not result in an outage, except in the following situation, and the change is
     *        asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the
     *        maintenance window is changed to include the current time, then changing this parameter will cause a
     *        reboot of the DB instance. If moving this window to the current time, there must be at least 30 minutes
     *        between the current time and end of the window to ensure pending changes are applied.</p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Format: ddd:hh24:mi-ddd:hh24:mi
     *        </p>
     *        <p>
     *        Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *        </p>
     *        <p>
     *        Constraints: Must be at least 30 minutes
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter does not result in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance
     * window is changed to include the current time, then changing this parameter will cause a reboot of the DB
     * instance. If moving this window to the current time, there must be at least 30 minutes between the current time
     * and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     * 
     * @return The weekly time range (in UTC) during which system maintenance can occur, which might result in an
     *         outage. Changing this parameter does not result in an outage, except in the following situation, and the
     *         change is asynchronously applied as soon as possible. If there are pending actions that cause a reboot,
     *         and the maintenance window is changed to include the current time, then changing this parameter will
     *         cause a reboot of the DB instance. If moving this window to the current time, there must be at least 30
     *         minutes between the current time and end of the window to ensure pending changes are applied.</p>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         Format: ddd:hh24:mi-ddd:hh24:mi
     *         </p>
     *         <p>
     *         Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *         </p>
     *         <p>
     *         Constraints: Must be at least 30 minutes
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     * Changing this parameter does not result in an outage, except in the following situation, and the change is
     * asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance
     * window is changed to include the current time, then changing this parameter will cause a reboot of the DB
     * instance. If moving this window to the current time, there must be at least 30 minutes between the current time
     * and end of the window to ensure pending changes are applied.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Format: ddd:hh24:mi-ddd:hh24:mi
     * </p>
     * <p>
     * Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     * </p>
     * <p>
     * Constraints: Must be at least 30 minutes
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range (in UTC) during which system maintenance can occur, which might result in an outage.
     *        Changing this parameter does not result in an outage, except in the following situation, and the change is
     *        asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the
     *        maintenance window is changed to include the current time, then changing this parameter will cause a
     *        reboot of the DB instance. If moving this window to the current time, there must be at least 30 minutes
     *        between the current time and end of the window to ensure pending changes are applied.</p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Format: ddd:hh24:mi-ddd:hh24:mi
     *        </p>
     *        <p>
     *        Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun
     *        </p>
     *        <p>
     *        Constraints: Must be at least 30 minutes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter does not result in an outage and
     * the change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * set to <code>true</code> for this request.
     * </p>
     * <p>
     * Constraints: Cannot be specified if the DB instance is a Read Replica.
     * </p>
     * 
     * @param multiAZ
     *        Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter does not result in an
     *        outage and the change is applied during the next maintenance window unless the
     *        <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. </p>
     *        <p>
     *        Constraints: Cannot be specified if the DB instance is a Read Replica.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter does not result in an outage and
     * the change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * set to <code>true</code> for this request.
     * </p>
     * <p>
     * Constraints: Cannot be specified if the DB instance is a Read Replica.
     * </p>
     * 
     * @return Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter does not result in an
     *         outage and the change is applied during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. </p>
     *         <p>
     *         Constraints: Cannot be specified if the DB instance is a Read Replica.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter does not result in an outage and
     * the change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * set to <code>true</code> for this request.
     * </p>
     * <p>
     * Constraints: Cannot be specified if the DB instance is a Read Replica.
     * </p>
     * 
     * @param multiAZ
     *        Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter does not result in an
     *        outage and the change is applied during the next maintenance window unless the
     *        <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. </p>
     *        <p>
     *        Constraints: Cannot be specified if the DB instance is a Read Replica.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter does not result in an outage and
     * the change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * set to <code>true</code> for this request.
     * </p>
     * <p>
     * Constraints: Cannot be specified if the DB instance is a Read Replica.
     * </p>
     * 
     * @return Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter does not result in an
     *         outage and the change is applied during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. </p>
     *         <p>
     *         Constraints: Cannot be specified if the DB instance is a Read Replica.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * The version number of the database engine to upgrade to. Changing this parameter results in an outage and the
     * change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is set to
     * <code>true</code> for this request.
     * </p>
     * <p>
     * For major version upgrades, if a non-default DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     * <p>
     * For a list of valid engine versions, see <a>CreateDBInstance</a>.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to upgrade to. Changing this parameter results in an outage and
     *        the change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is set to <code>true</code> for this request. </p>
     *        <p>
     *        For major version upgrades, if a non-default DB parameter group is currently in use, a new DB parameter
     *        group in the DB parameter group family for the new engine version must be specified. The new DB parameter
     *        group can be the default for that DB parameter group family.
     *        </p>
     *        <p>
     *        For a list of valid engine versions, see <a>CreateDBInstance</a>.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to upgrade to. Changing this parameter results in an outage and the
     * change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is set to
     * <code>true</code> for this request.
     * </p>
     * <p>
     * For major version upgrades, if a non-default DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     * <p>
     * For a list of valid engine versions, see <a>CreateDBInstance</a>.
     * </p>
     * 
     * @return The version number of the database engine to upgrade to. Changing this parameter results in an outage and
     *         the change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *         parameter is set to <code>true</code> for this request. </p>
     *         <p>
     *         For major version upgrades, if a non-default DB parameter group is currently in use, a new DB parameter
     *         group in the DB parameter group family for the new engine version must be specified. The new DB parameter
     *         group can be the default for that DB parameter group family.
     *         </p>
     *         <p>
     *         For a list of valid engine versions, see <a>CreateDBInstance</a>.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to upgrade to. Changing this parameter results in an outage and the
     * change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is set to
     * <code>true</code> for this request.
     * </p>
     * <p>
     * For major version upgrades, if a non-default DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     * <p>
     * For a list of valid engine versions, see <a>CreateDBInstance</a>.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to upgrade to. Changing this parameter results in an outage and
     *        the change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is set to <code>true</code> for this request. </p>
     *        <p>
     *        For major version upgrades, if a non-default DB parameter group is currently in use, a new DB parameter
     *        group in the DB parameter group family for the new engine version must be specified. The new DB parameter
     *        group can be the default for that DB parameter group family.
     *        </p>
     *        <p>
     *        For a list of valid engine versions, see <a>CreateDBInstance</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter that is a
     * different major version than the DB instance's current version.
     * </p>
     * 
     * @param allowMajorVersionUpgrade
     *        Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage
     *        and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter
     *        that is a different major version than the DB instance's current version.
     */

    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter that is a
     * different major version than the DB instance's current version.
     * </p>
     * 
     * @return Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage
     *         and the change is asynchronously applied as soon as possible.</p>
     *         <p>
     *         Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter
     *         that is a different major version than the DB instance's current version.
     */

    public Boolean getAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter that is a
     * different major version than the DB instance's current version.
     * </p>
     * 
     * @param allowMajorVersionUpgrade
     *        Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage
     *        and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter
     *        that is a different major version than the DB instance's current version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        setAllowMajorVersionUpgrade(allowMajorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter that is a
     * different major version than the DB instance's current version.
     * </p>
     * 
     * @return Indicates that major version upgrades are allowed. Changing this parameter does not result in an outage
     *         and the change is asynchronously applied as soon as possible.</p>
     *         <p>
     *         Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter
     *         that is a different major version than the DB instance's current version.
     */

    public Boolean isAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version upgrades will be applied automatically to the DB instance during the maintenance
     * window. Changing this parameter does not result in an outage except in the following case and the change is
     * asynchronously applied as soon as possible. An outage will result if this parameter is set to <code>true</code>
     * during the maintenance window, and a newer minor version is available, and RDS has enabled auto patching for that
     * engine version.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor version upgrades will be applied automatically to the DB instance during the
     *        maintenance window. Changing this parameter does not result in an outage except in the following case and
     *        the change is asynchronously applied as soon as possible. An outage will result if this parameter is set
     *        to <code>true</code> during the maintenance window, and a newer minor version is available, and RDS has
     *        enabled auto patching for that engine version.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version upgrades will be applied automatically to the DB instance during the maintenance
     * window. Changing this parameter does not result in an outage except in the following case and the change is
     * asynchronously applied as soon as possible. An outage will result if this parameter is set to <code>true</code>
     * during the maintenance window, and a newer minor version is available, and RDS has enabled auto patching for that
     * engine version.
     * </p>
     * 
     * @return Indicates that minor version upgrades will be applied automatically to the DB instance during the
     *         maintenance window. Changing this parameter does not result in an outage except in the following case and
     *         the change is asynchronously applied as soon as possible. An outage will result if this parameter is set
     *         to <code>true</code> during the maintenance window, and a newer minor version is available, and RDS has
     *         enabled auto patching for that engine version.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version upgrades will be applied automatically to the DB instance during the maintenance
     * window. Changing this parameter does not result in an outage except in the following case and the change is
     * asynchronously applied as soon as possible. An outage will result if this parameter is set to <code>true</code>
     * during the maintenance window, and a newer minor version is available, and RDS has enabled auto patching for that
     * engine version.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor version upgrades will be applied automatically to the DB instance during the
     *        maintenance window. Changing this parameter does not result in an outage except in the following case and
     *        the change is asynchronously applied as soon as possible. An outage will result if this parameter is set
     *        to <code>true</code> during the maintenance window, and a newer minor version is available, and RDS has
     *        enabled auto patching for that engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Indicates that minor version upgrades will be applied automatically to the DB instance during the maintenance
     * window. Changing this parameter does not result in an outage except in the following case and the change is
     * asynchronously applied as soon as possible. An outage will result if this parameter is set to <code>true</code>
     * during the maintenance window, and a newer minor version is available, and RDS has enabled auto patching for that
     * engine version.
     * </p>
     * 
     * @return Indicates that minor version upgrades will be applied automatically to the DB instance during the
     *         maintenance window. Changing this parameter does not result in an outage except in the following case and
     *         the change is asynchronously applied as soon as possible. An outage will result if this parameter is set
     *         to <code>true</code> during the maintenance window, and a newer minor version is available, and RDS has
     *         enabled auto patching for that engine version.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * 
     * @param licenseModel
     *        The license model for the DB instance.</p>
     *        <p>
     *        Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *        <code>general-public-license</code>
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * 
     * @return The license model for the DB instance.</p>
     *         <p>
     *         Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * 
     * @param licenseModel
     *        The license model for the DB instance.</p>
     *        <p>
     *        Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *        <code>general-public-license</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * The new Provisioned IOPS (I/O operations per second) value for the RDS instance. Changing this setting does not
     * result in an outage and the change is applied during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value. If you are
     * migrating from Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a reboot
     * for the change in storage type to take effect.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Setting the IOPS value for the SQL Server database engine is not supported.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance will be
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance will be suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * 
     * @param iops
     *        The new Provisioned IOPS (I/O operations per second) value for the RDS instance. Changing this setting
     *        does not result in an outage and the change is applied during the next maintenance window unless the
     *        <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at
     *        least 10% greater than the existing value are rounded up so that they are 10% greater than the current
     *        value. If you are migrating from Provisioned IOPS to standard storage, set this value to 0. The DB
     *        instance will require a reboot for the change in storage type to take effect.
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Setting the IOPS value for the SQL Server database engine is not supported.
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *        using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration
     *        depends on several factors such as database load, storage size, storage type (standard or Provisioned
     *        IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical
     *        migration times are under 24 hours, but the process can take up to several days in some cases. During the
     *        migration, the DB instance will be available for use, but might experience performance degradation. While
     *        the migration takes place, nightly backups for the instance will be suspended. No other Amazon RDS
     *        operations can take place for the instance, including modifying the instance, rebooting the instance,
     *        deleting the instance, creating a Read Replica for the instance, and creating a DB snapshot of the
     *        instance.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The new Provisioned IOPS (I/O operations per second) value for the RDS instance. Changing this setting does not
     * result in an outage and the change is applied during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value. If you are
     * migrating from Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a reboot
     * for the change in storage type to take effect.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Setting the IOPS value for the SQL Server database engine is not supported.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance will be
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance will be suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * 
     * @return The new Provisioned IOPS (I/O operations per second) value for the RDS instance. Changing this setting
     *         does not result in an outage and the change is applied during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. </p>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at
     *         least 10% greater than the existing value are rounded up so that they are 10% greater than the current
     *         value. If you are migrating from Provisioned IOPS to standard storage, set this value to 0. The DB
     *         instance will require a reboot for the change in storage type to take effect.
     *         </p>
     *         <p>
     *         <b>SQL Server</b>
     *         </p>
     *         <p>
     *         Setting the IOPS value for the SQL Server database engine is not supported.
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *         using Provisioned IOPS to using standard storage, the process can take time. The duration of the
     *         migration depends on several factors such as database load, storage size, storage type (standard or
     *         Provisioned IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations.
     *         Typical migration times are under 24 hours, but the process can take up to several days in some cases.
     *         During the migration, the DB instance will be available for use, but might experience performance
     *         degradation. While the migration takes place, nightly backups for the instance will be suspended. No
     *         other Amazon RDS operations can take place for the instance, including modifying the instance, rebooting
     *         the instance, deleting the instance, creating a Read Replica for the instance, and creating a DB snapshot
     *         of the instance.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The new Provisioned IOPS (I/O operations per second) value for the RDS instance. Changing this setting does not
     * result in an outage and the change is applied during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10% greater than the current value. If you are
     * migrating from Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a reboot
     * for the change in storage type to take effect.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Setting the IOPS value for the SQL Server database engine is not supported.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance will be
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance will be suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * 
     * @param iops
     *        The new Provisioned IOPS (I/O operations per second) value for the RDS instance. Changing this setting
     *        does not result in an outage and the change is applied during the next maintenance window unless the
     *        <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. </p>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Constraints: Value supplied must be at least 10% greater than the current value. Values that are not at
     *        least 10% greater than the existing value are rounded up so that they are 10% greater than the current
     *        value. If you are migrating from Provisioned IOPS to standard storage, set this value to 0. The DB
     *        instance will require a reboot for the change in storage type to take effect.
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Setting the IOPS value for the SQL Server database engine is not supported.
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *        using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration
     *        depends on several factors such as database load, storage size, storage type (standard or Provisioned
     *        IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical
     *        migration times are under 24 hours, but the process can take up to several days in some cases. During the
     *        migration, the DB instance will be available for use, but might experience performance degradation. While
     *        the migration takes place, nightly backups for the instance will be suspended. No other Amazon RDS
     *        operations can take place for the instance, including modifying the instance, rebooting the instance,
     *        deleting the instance, creating a Read Replica for the instance, and creating a DB snapshot of the
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Indicates that the DB instance should be associated with the specified option group. Changing this parameter does
     * not result in an outage except in the following case and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. If the parameter
     * change results in an option group that enables OEM, this change can cause a brief (sub-second) period during
     * which new connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an option
     * group, and that option group cannot be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @param optionGroupName
     *        Indicates that the DB instance should be associated with the specified option group. Changing this
     *        parameter does not result in an outage except in the following case and the change is applied during the
     *        next maintenance window unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for
     *        this request. If the parameter change results in an option group that enables OEM, this change can cause a
     *        brief (sub-second) period during which new connections are rejected but existing connections are not
     *        interrupted. </p>
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
     * Indicates that the DB instance should be associated with the specified option group. Changing this parameter does
     * not result in an outage except in the following case and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. If the parameter
     * change results in an option group that enables OEM, this change can cause a brief (sub-second) period during
     * which new connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an option
     * group, and that option group cannot be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @return Indicates that the DB instance should be associated with the specified option group. Changing this
     *         parameter does not result in an outage except in the following case and the change is applied during the
     *         next maintenance window unless the <code>ApplyImmediately</code> parameter is set to <code>true</code>
     *         for this request. If the parameter change results in an option group that enables OEM, this change can
     *         cause a brief (sub-second) period during which new connections are rejected but existing connections are
     *         not interrupted. </p>
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
     * Indicates that the DB instance should be associated with the specified option group. Changing this parameter does
     * not result in an outage except in the following case and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. If the parameter
     * change results in an option group that enables OEM, this change can cause a brief (sub-second) period during
     * which new connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an option
     * group, and that option group cannot be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @param optionGroupName
     *        Indicates that the DB instance should be associated with the specified option group. Changing this
     *        parameter does not result in an outage except in the following case and the change is applied during the
     *        next maintenance window unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for
     *        this request. If the parameter change results in an option group that enables OEM, this change can cause a
     *        brief (sub-second) period during which new connections are rejected but existing connections are not
     *        interrupted. </p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an
     *        option group, and that option group cannot be removed from a DB instance once it is associated with a DB
     *        instance
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance
     * identifier, an instance reboot will occur immediately if you set <code>Apply Immediately</code> to true, or will
     * occur during the next maintenance window if <code>Apply Immediately</code> to false. This value is stored as a
     * lowercase string.
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
     * @param newDBInstanceIdentifier
     *        The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB
     *        instance identifier, an instance reboot will occur immediately if you set <code>Apply Immediately</code>
     *        to true, or will occur during the next maintenance window if <code>Apply Immediately</code> to false. This
     *        value is stored as a lowercase string. </p>
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

    public void setNewDBInstanceIdentifier(String newDBInstanceIdentifier) {
        this.newDBInstanceIdentifier = newDBInstanceIdentifier;
    }

    /**
     * <p>
     * The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance
     * identifier, an instance reboot will occur immediately if you set <code>Apply Immediately</code> to true, or will
     * occur during the next maintenance window if <code>Apply Immediately</code> to false. This value is stored as a
     * lowercase string.
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
     * @return The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB
     *         instance identifier, an instance reboot will occur immediately if you set <code>Apply Immediately</code>
     *         to true, or will occur during the next maintenance window if <code>Apply Immediately</code> to false.
     *         This value is stored as a lowercase string. </p>
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

    public String getNewDBInstanceIdentifier() {
        return this.newDBInstanceIdentifier;
    }

    /**
     * <p>
     * The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB instance
     * identifier, an instance reboot will occur immediately if you set <code>Apply Immediately</code> to true, or will
     * occur during the next maintenance window if <code>Apply Immediately</code> to false. This value is stored as a
     * lowercase string.
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
     * @param newDBInstanceIdentifier
     *        The new DB instance identifier for the DB instance when renaming a DB instance. When you change the DB
     *        instance identifier, an instance reboot will occur immediately if you set <code>Apply Immediately</code>
     *        to true, or will occur during the next maintenance window if <code>Apply Immediately</code> to false. This
     *        value is stored as a lowercase string. </p>
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

    public ModifyDBInstanceRequest withNewDBInstanceIdentifier(String newDBInstanceIdentifier) {
        setNewDBInstanceIdentifier(newDBInstanceIdentifier);
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

    public ModifyDBInstanceRequest withStorageType(String storageType) {
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

    public ModifyDBInstanceRequest withTdeCredentialArn(String tdeCredentialArn) {
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

    public ModifyDBInstanceRequest withTdeCredentialPassword(String tdeCredentialPassword) {
        setTdeCredentialPassword(tdeCredentialPassword);
        return this;
    }

    /**
     * <p>
     * Indicates the certificate that needs to be associated with the instance.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        Indicates the certificate that needs to be associated with the instance.
     */

    public void setCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
    }

    /**
     * <p>
     * Indicates the certificate that needs to be associated with the instance.
     * </p>
     * 
     * @return Indicates the certificate that needs to be associated with the instance.
     */

    public String getCACertificateIdentifier() {
        return this.cACertificateIdentifier;
    }

    /**
     * <p>
     * Indicates the certificate that needs to be associated with the instance.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        Indicates the certificate that needs to be associated with the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withCACertificateIdentifier(String cACertificateIdentifier) {
        setCACertificateIdentifier(cACertificateIdentifier);
        return this;
    }

    /**
     * <p>
     * The Active Directory Domain to move the instance to. Specify <code>none</code> to remove the instance from its
     * current domain. The domain must be created prior to this operation. Currently only a Microsoft SQL Server
     * instance can be created in a Active Directory Domain.
     * </p>
     * 
     * @param domain
     *        The Active Directory Domain to move the instance to. Specify <code>none</code> to remove the instance from
     *        its current domain. The domain must be created prior to this operation. Currently only a Microsoft SQL
     *        Server instance can be created in a Active Directory Domain.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The Active Directory Domain to move the instance to. Specify <code>none</code> to remove the instance from its
     * current domain. The domain must be created prior to this operation. Currently only a Microsoft SQL Server
     * instance can be created in a Active Directory Domain.
     * </p>
     * 
     * @return The Active Directory Domain to move the instance to. Specify <code>none</code> to remove the instance
     *         from its current domain. The domain must be created prior to this operation. Currently only a Microsoft
     *         SQL Server instance can be created in a Active Directory Domain.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The Active Directory Domain to move the instance to. Specify <code>none</code> to remove the instance from its
     * current domain. The domain must be created prior to this operation. Currently only a Microsoft SQL Server
     * instance can be created in a Active Directory Domain.
     * </p>
     * 
     * @param domain
     *        The Active Directory Domain to move the instance to. Specify <code>none</code> to remove the instance from
     *        its current domain. The domain must be created prior to this operation. Currently only a Microsoft SQL
     *        Server instance can be created in a Active Directory Domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default is
     * false.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default
     *        is false.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default is
     * false.
     * </p>
     * 
     * @return True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default
     *         is false.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default is
     * false.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default
     *        is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default is
     * false.
     * </p>
     * 
     * @return True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default
     *         is false.
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
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
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
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
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
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
     * @return The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *         instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
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
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
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
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to
     *        a value other than 0.
     *        </p>
     *        <p>
     *        Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withMonitoringInterval(Integer monitoringInterval) {
        setMonitoringInterval(monitoringInterval);
        return this;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for options
     * in the option group for the DB instance.
     * </p>
     * <p>
     * Your database will restart when you change the <code>DBPortNumber</code> value regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
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
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code> except for <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * 
     * @param dBPortNumber
     *        The port number on which the database accepts connections.</p>
     *        <p>
     *        The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for
     *        options in the option group for the DB instance.
     *        </p>
     *        <p>
     *        Your database will restart when you change the <code>DBPortNumber</code> value regardless of the value of
     *        the <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Default: <code>5432</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
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
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Default: <code>1433</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code> except for <code>1434</code>, <code>3389</code>, <code>47001</code>,
     *        <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     */

    public void setDBPortNumber(Integer dBPortNumber) {
        this.dBPortNumber = dBPortNumber;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for options
     * in the option group for the DB instance.
     * </p>
     * <p>
     * Your database will restart when you change the <code>DBPortNumber</code> value regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
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
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code> except for <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * 
     * @return The port number on which the database accepts connections.</p>
     *         <p>
     *         The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for
     *         options in the option group for the DB instance.
     *         </p>
     *         <p>
     *         Your database will restart when you change the <code>DBPortNumber</code> value regardless of the value of
     *         the <code>ApplyImmediately</code> parameter.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Default: <code>5432</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code>
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
     *         Valid Values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         <b>SQL Server</b>
     *         </p>
     *         <p>
     *         Default: <code>1433</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code> except for <code>1434</code>, <code>3389</code>, <code>47001</code>, <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code>
     */

    public Integer getDBPortNumber() {
        return this.dBPortNumber;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for options
     * in the option group for the DB instance.
     * </p>
     * <p>
     * Your database will restart when you change the <code>DBPortNumber</code> value regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
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
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code> except for <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * 
     * @param dBPortNumber
     *        The port number on which the database accepts connections.</p>
     *        <p>
     *        The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for
     *        options in the option group for the DB instance.
     *        </p>
     *        <p>
     *        Your database will restart when you change the <code>DBPortNumber</code> value regardless of the value of
     *        the <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Default: <code>5432</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
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
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Default: <code>1433</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code> except for <code>1434</code>, <code>3389</code>, <code>47001</code>,
     *        <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBPortNumber(Integer dBPortNumber) {
        setDBPortNumber(dBPortNumber);
        return this;
    }

    /**
     * <p>
     * Boolean value that indicates if the DB instance has a publicly resolvable DNS name. Set to <code>True</code> to
     * make the DB instance Internet-facing with a publicly resolvable DNS name, which resolves to a public IP address.
     * Set to <code>False</code> to make the DB instance internal with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a public
     * subnet and <code>PubliclyAccessible</code> must be true in order for it to be publicly accessible.
     * </p>
     * <p>
     * Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param publiclyAccessible
     *        Boolean value that indicates if the DB instance has a publicly resolvable DNS name. Set to
     *        <code>True</code> to make the DB instance Internet-facing with a publicly resolvable DNS name, which
     *        resolves to a public IP address. Set to <code>False</code> to make the DB instance internal with a DNS
     *        name that resolves to a private IP address. </p>
     *        <p>
     *        <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a
     *        public subnet and <code>PubliclyAccessible</code> must be true in order for it to be publicly accessible.
     *        </p>
     *        <p>
     *        Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value
     *        of the <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        Default: false
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Boolean value that indicates if the DB instance has a publicly resolvable DNS name. Set to <code>True</code> to
     * make the DB instance Internet-facing with a publicly resolvable DNS name, which resolves to a public IP address.
     * Set to <code>False</code> to make the DB instance internal with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a public
     * subnet and <code>PubliclyAccessible</code> must be true in order for it to be publicly accessible.
     * </p>
     * <p>
     * Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return Boolean value that indicates if the DB instance has a publicly resolvable DNS name. Set to
     *         <code>True</code> to make the DB instance Internet-facing with a publicly resolvable DNS name, which
     *         resolves to a public IP address. Set to <code>False</code> to make the DB instance internal with a DNS
     *         name that resolves to a private IP address. </p>
     *         <p>
     *         <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a
     *         public subnet and <code>PubliclyAccessible</code> must be true in order for it to be publicly accessible.
     *         </p>
     *         <p>
     *         Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value
     *         of the <code>ApplyImmediately</code> parameter.
     *         </p>
     *         <p>
     *         Default: false
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Boolean value that indicates if the DB instance has a publicly resolvable DNS name. Set to <code>True</code> to
     * make the DB instance Internet-facing with a publicly resolvable DNS name, which resolves to a public IP address.
     * Set to <code>False</code> to make the DB instance internal with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a public
     * subnet and <code>PubliclyAccessible</code> must be true in order for it to be publicly accessible.
     * </p>
     * <p>
     * Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param publiclyAccessible
     *        Boolean value that indicates if the DB instance has a publicly resolvable DNS name. Set to
     *        <code>True</code> to make the DB instance Internet-facing with a publicly resolvable DNS name, which
     *        resolves to a public IP address. Set to <code>False</code> to make the DB instance internal with a DNS
     *        name that resolves to a private IP address. </p>
     *        <p>
     *        <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a
     *        public subnet and <code>PubliclyAccessible</code> must be true in order for it to be publicly accessible.
     *        </p>
     *        <p>
     *        Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value
     *        of the <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        Default: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Boolean value that indicates if the DB instance has a publicly resolvable DNS name. Set to <code>True</code> to
     * make the DB instance Internet-facing with a publicly resolvable DNS name, which resolves to a public IP address.
     * Set to <code>False</code> to make the DB instance internal with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a public
     * subnet and <code>PubliclyAccessible</code> must be true in order for it to be publicly accessible.
     * </p>
     * <p>
     * Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return Boolean value that indicates if the DB instance has a publicly resolvable DNS name. Set to
     *         <code>True</code> to make the DB instance Internet-facing with a publicly resolvable DNS name, which
     *         resolves to a public IP address. Set to <code>False</code> to make the DB instance internal with a DNS
     *         name that resolves to a private IP address. </p>
     *         <p>
     *         <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a
     *         public subnet and <code>PubliclyAccessible</code> must be true in order for it to be publicly accessible.
     *         </p>
     *         <p>
     *         Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value
     *         of the <code>ApplyImmediately</code> parameter.
     *         </p>
     *         <p>
     *         Default: false
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
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

    public ModifyDBInstanceRequest withMonitoringRoleArn(String monitoringRoleArn) {
        setMonitoringRoleArn(monitoringRoleArn);
        return this;
    }

    /**
     * <p>
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     * 
     * @param domainIAMRoleName
     *        The name of the IAM role to use when making API calls to the Directory Service.
     */

    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    /**
     * <p>
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     * 
     * @return The name of the IAM role to use when making API calls to the Directory Service.
     */

    public String getDomainIAMRoleName() {
        return this.domainIAMRoleName;
    }

    /**
     * <p>
     * The name of the IAM role to use when making API calls to the Directory Service.
     * </p>
     * 
     * @param domainIAMRoleName
     *        The name of the IAM role to use when making API calls to the Directory Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDomainIAMRoleName(String domainIAMRoleName) {
        setDomainIAMRoleName(domainIAMRoleName);
        return this;
    }

    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>.
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
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance"
     *        > Fault Tolerance for an Aurora DB Cluster</a>. </p>
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
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>.
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
     *         "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance"
     *         > Fault Tolerance for an Aurora DB Cluster</a>. </p>
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
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>.
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
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance"
     *        > Fault Tolerance for an Aurora DB Cluster</a>. </p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Valid Values: 0 - 15
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPromotionTier(Integer promotionTier) {
        setPromotionTier(promotionTier);
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
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getDBSecurityGroups() != null)
            sb.append("DBSecurityGroups: " + getDBSecurityGroups() + ",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: " + getApplyImmediately() + ",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: " + getDBParameterGroupName() + ",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: " + getMultiAZ() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getAllowMajorVersionUpgrade() != null)
            sb.append("AllowMajorVersionUpgrade: " + getAllowMajorVersionUpgrade() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: " + getAutoMinorVersionUpgrade() + ",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getNewDBInstanceIdentifier() != null)
            sb.append("NewDBInstanceIdentifier: " + getNewDBInstanceIdentifier() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: " + getTdeCredentialArn() + ",");
        if (getTdeCredentialPassword() != null)
            sb.append("TdeCredentialPassword: " + getTdeCredentialPassword() + ",");
        if (getCACertificateIdentifier() != null)
            sb.append("CACertificateIdentifier: " + getCACertificateIdentifier() + ",");
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: " + getCopyTagsToSnapshot() + ",");
        if (getMonitoringInterval() != null)
            sb.append("MonitoringInterval: " + getMonitoringInterval() + ",");
        if (getDBPortNumber() != null)
            sb.append("DBPortNumber: " + getDBPortNumber() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible() + ",");
        if (getMonitoringRoleArn() != null)
            sb.append("MonitoringRoleArn: " + getMonitoringRoleArn() + ",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: " + getDomainIAMRoleName() + ",");
        if (getPromotionTier() != null)
            sb.append("PromotionTier: " + getPromotionTier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBInstanceRequest == false)
            return false;
        ModifyDBInstanceRequest other = (ModifyDBInstanceRequest) obj;
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
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getDBSecurityGroups() == null ^ this.getDBSecurityGroups() == null)
            return false;
        if (other.getDBSecurityGroups() != null && other.getDBSecurityGroups().equals(this.getDBSecurityGroups()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
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
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAllowMajorVersionUpgrade() == null ^ this.getAllowMajorVersionUpgrade() == null)
            return false;
        if (other.getAllowMajorVersionUpgrade() != null && other.getAllowMajorVersionUpgrade().equals(this.getAllowMajorVersionUpgrade()) == false)
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
        if (other.getNewDBInstanceIdentifier() == null ^ this.getNewDBInstanceIdentifier() == null)
            return false;
        if (other.getNewDBInstanceIdentifier() != null && other.getNewDBInstanceIdentifier().equals(this.getNewDBInstanceIdentifier()) == false)
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
        if (other.getCACertificateIdentifier() == null ^ this.getCACertificateIdentifier() == null)
            return false;
        if (other.getCACertificateIdentifier() != null && other.getCACertificateIdentifier().equals(this.getCACertificateIdentifier()) == false)
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
        if (other.getDBPortNumber() == null ^ this.getDBPortNumber() == null)
            return false;
        if (other.getDBPortNumber() != null && other.getDBPortNumber().equals(this.getDBPortNumber()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getDBSecurityGroups() == null) ? 0 : getDBSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getAllowMajorVersionUpgrade() == null) ? 0 : getAllowMajorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getNewDBInstanceIdentifier() == null) ? 0 : getNewDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialPassword() == null) ? 0 : getTdeCredentialPassword().hashCode());
        hashCode = prime * hashCode + ((getCACertificateIdentifier() == null) ? 0 : getCACertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode());
        hashCode = prime * hashCode + ((getDBPortNumber() == null) ? 0 : getDBPortNumber().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        hashCode = prime * hashCode + ((getPromotionTier() == null) ? 0 : getPromotionTier().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBInstanceRequest clone() {
        return (ModifyDBInstanceRequest) super.clone();
    }
}
