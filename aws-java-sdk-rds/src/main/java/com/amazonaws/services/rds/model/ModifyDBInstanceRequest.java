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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of DB instance to modify. This value is stored as a lowercase string.
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
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The new amount of storage in gibibytes (GiB) to allocate for the DB instance.
     * </p>
     * <p>
     * For RDS for Db2, MariaDB, RDS for MySQL, RDS for Oracle, and RDS for PostgreSQL, the value supplied must be at
     * least 10% greater than the current value. Values that are not at least 10% greater than the existing value are
     * rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * For the valid values for allocated storage for each engine, see <code>CreateDBInstance</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you increase the allocated storage for a DB instance that uses Provisioned IOPS (<code>gp3</code>,
     * <code>io1</code>, or <code>io2</code> storage type), you must also specify the <code>Iops</code> parameter. You
     * can use the current value for <code>Iops</code>.
     * </p>
     * </li>
     * </ul>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The new compute and memory capacity of the DB instance, for example <code>db.m4.large</code>. Not all DB instance
     * classes are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB
     * instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide</i> or <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html">Aurora DB
     * instance classes</a> in the <i>Amazon Aurora User Guide</i>. For RDS Custom, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits.html#custom-reqs-limits.instances">DB
     * instance class support for RDS Custom for Oracle</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits-MS.html#custom-reqs-limits.instancesMS"
     * > DB instance class support for RDS Custom for SQL Server</a>.
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless you specify <code>ApplyImmediately</code> in your request.
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
     * If you are modifying the DB instance class and upgrading the engine version at the same time, the currently
     * running engine version must be supported on the specified DB instance class. Otherwise, the operation returns an
     * error. In this case, first run the operation to upgrade the engine version, and then run it again to modify the
     * DB instance class.
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different
     * VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB instance into a VPC. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     * >Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you enable <code>ApplyImmediately</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DB subnet group.
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
     * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DB security groups.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> dBSecurityGroups;
    /**
     * <p>
     * A list of Amazon EC2 VPC security groups to associate with this DB instance. This change is asynchronously
     * applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to the following DB instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Aurora (The associated list of EC2 VPC security groups is managed by the DB cluster. For more information,
     * see <code>ModifyDBCluster</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS Custom
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing VPC security group IDs.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance. By
     * default, this parameter is disabled.
     * </p>
     * <p>
     * If this parameter is disabled, changes to the DB instance are applied during the next maintenance window. Some
     * parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>, or the next
     * failure reboot. Review the table of parameters in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying a DB
     * Instance</a> in the <i>Amazon RDS User Guide</i> to see the impact of enabling or disabling
     * <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are applied.
     * </p>
     */
    private Boolean applyImmediately;
    /**
     * <p>
     * The new password for the master user.
     * </p>
     * <p>
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible.
     * Between the time of the request and the completion of the request, the <code>MasterUserPassword</code> element
     * exists in the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <note>
     * <p>
     * Amazon RDS API operations never return the password, so this operation provides a way to regain access to a
     * primary instance user if the password is lost. This includes restoring privileges that might have been
     * accidentally revoked.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to the following DB instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Aurora (The password for the master user is managed by the DB cluster. For more information, see
     * <code>ModifyDBCluster</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS Custom
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can include any printable ASCII character except "/",
     * """, or "@". For RDS for Oracle, can't include the "&amp;" (ampersand) or the "'" (single quotes) character.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Length Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS for Db2 - Must contain from 8 to 255 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB - Must contain from 8 to 41 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Microsoft SQL Server - Must contain from 8 to 128 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL - Must contain from 8 to 41 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Oracle - Must contain from 8 to 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for PostgreSQL - Must contain from 8 to 128 characters.
     * </p>
     * </li>
     * </ul>
     */
    private String masterUserPassword;
    /**
     * <p>
     * The name of the DB parameter group to apply to the DB instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage. The parameter group name itself is changed immediately, but
     * the actual parameter changes are not applied until you reboot the instance without failover. In this case, the DB
     * instance isn't rebooted automatically, and the parameter changes aren't applied during the next maintenance
     * window. However, if you modify dynamic parameters in the newly associated DB parameter group, these changes are
     * applied immediately without a reboot.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
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
     * Must be in the same DB parameter group family as the DB instance.
     * </p>
     * </li>
     * </ul>
     */
    private String dBParameterGroupName;
    /**
     * <p>
     * The number of days to retain automated backups. Setting this parameter to a positive number enables backups.
     * Setting this parameter to 0 disables automated backups.
     * </p>
     * <note>
     * <p>
     * Enabling and disabling backups can result in a brief I/O suspension that lasts from a few seconds to a few
     * minutes, depending on the size and class of your DB instance.
     * </p>
     * </note>
     * <p>
     * These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter
     * is enabled for this request. If you change the parameter from one non-zero value to another non-zero value, the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. The retention period for automated backups is managed
     * by the DB cluster. For more information, see <code>ModifyDBCluster</code>.
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
     * Must be a value from 0 to 35.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 for an RDS Custom for Oracle DB instance.
     * </p>
     * </li>
     * </ul>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible. The default is a 30-minute window selected at random from
     * an 8-hour block of time for each Amazon Web Services Region. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Backup window</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. The daily time range for creating automated backups is
     * managed by the DB cluster. For more information, see <code>ModifyDBCluster</code>.
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
     * The weekly time range during which system maintenance can occur, which might result in an outage. Changing this
     * parameter doesn't result in an outage, except in the following situation, and the change is asynchronously
     * applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance window is
     * changed to include the current time, then changing this parameter causes a reboot of the DB instance. If you
     * change this window to the current time, there must be at least 30 minutes between the current time and end of the
     * window to ensure pending changes are applied.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
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
     * Must be in the format <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The day values must be <code>mon | tue | wed | thu | fri | sat | sun</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred backup window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Specifies whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage.
     * The change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * The version number of the database engine to upgrade to. Changing this parameter results in an outage and the
     * change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     * <p>
     * If you specify only a major version, Amazon RDS updates the DB instance to the default minor version if the
     * current minor version is lower. For information about valid engine versions, see <code>CreateDBInstance</code>,
     * or call <code>DescribeDBEngineVersions</code>.
     * </p>
     * <p>
     * If the instance that you're modifying is acting as a read replica, the engine version that you specify must be
     * the same or higher than the version that the source DB instance or cluster is running.
     * </p>
     * <p>
     * In RDS Custom for Oracle, this parameter is supported for read replicas only if they are in the
     * <code>PATCH_DB_FAILURE</code> lifecycle.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are upgrading the engine version and modifying the DB instance class at the same time, the currently
     * running engine version must be supported on the specified DB instance class. Otherwise, the operation returns an
     * error. In this case, first run the operation to upgrade the engine version, and then run it again to modify the
     * DB instance class.
     * </p>
     * </li>
     * </ul>
     */
    private String engineVersion;
    /**
     * <p>
     * Specifies whether major version upgrades are allowed. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Major version upgrades must be allowed when specifying a value for the <code>EngineVersion</code> parameter
     * that's a different major version than the DB instance's current version.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean allowMajorVersionUpgrade;
    /**
     * <p>
     * Specifies whether minor version upgrades are applied automatically to the DB instance during the maintenance
     * window. An outage occurs when all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The automatic upgrade is enabled for the maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * A newer minor version is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS has enabled automatic patching for the engine version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, Amazon RDS applies the change as soon as possible and doesn't cause
     * an outage.
     * </p>
     * <p>
     * For an RDS Custom DB instance, don't enable this setting. Otherwise, the operation returns an error.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS for Db2 - <code>bring-your-own-license</code>
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
     */
    private String licenseModel;
    /**
     * <p>
     * The new Provisioned IOPS (I/O operations per second) value for the RDS instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is enabled for this request. If you are migrating from
     * Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a reboot for the change
     * in storage type to take effect.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RDS for MariaDB, RDS for MySQL, RDS for Oracle, and RDS for PostgreSQL - The value supplied must be at least
     * 10% greater than the current value. Values that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you increase the Provisioned IOPS, you must also specify the <code>AllocatedStorage</code> parameter. You
     * can use the current value for <code>AllocatedStorage</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Uses existing setting
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * The option group to associate the DB instance with.
     * </p>
     * <p>
     * Changing this parameter doesn't result in an outage, with one exception. If the parameter change results in an
     * option group that enables OEM, it can cause a brief period, lasting less than a second, during which new
     * connections are rejected but existing connections aren't interrupted.
     * </p>
     * <p>
     * The change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance after it is associated with a DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * The new identifier for the DB instance when renaming a DB instance. When you change the DB instance identifier,
     * an instance reboot occurs immediately if you enable <code>ApplyImmediately</code>, or will occur during the next
     * maintenance window if you disable <code>ApplyImmediately</code>. This value is stored as a lowercase string.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
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
     * The first character must be a letter.
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
    private String newDBInstanceIdentifier;
    /**
     * <p>
     * The storage type to associate with the DB instance.
     * </p>
     * <p>
     * If you specify <code>io1</code>, <code>io2</code>, or <code>gp3</code> you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Valid Values: <code>gp2 | gp3 | io1 | io2 | standard</code>
     * </p>
     * <p>
     * Default: <code>io1</code>, if the <code>Iops</code> parameter is specified. Otherwise, <code>gp2</code>.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private String tdeCredentialArn;
    /**
     * <p>
     * The password for the given ARN from the key store in order to access the device.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private String tdeCredentialPassword;
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
     * The Active Directory directory ID to move the DB instance to. Specify <code>none</code> to remove the instance
     * from its current domain. You must create the domain before this operation. Currently, you can create only Db2,
     * MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances in an Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private String domain;
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
     * Specifies whether to copy all tags from the DB instance to snapshots of the DB instance. By default, tags aren't
     * copied.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. Copying tags to snapshots is managed by the DB cluster.
     * Setting this value for an Aurora DB instance has no effect on the DB cluster setting. For more information, see
     * <code>ModifyDBCluster</code>.
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collection of Enhanced Monitoring metrics, specify <code>0</code>.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, set <code>MonitoringInterval</code> to a value other than
     * <code>0</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values: <code>0 | 1 | 5 | 10 | 15 | 30 | 60</code>
     * </p>
     * <p>
     * Default: <code>0</code>
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
     * If you change the <code>DBPortNumber</code> value, your database restarts regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Default:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Aurora - <code>3306</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Db2 - <code>50000</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB - <code>3306</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Microsoft SQL Server - <code>1433</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL - <code>3306</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Oracle - <code>1521</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for PostgreSQL - <code>5432</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RDS for Microsoft SQL Server, the value can't be <code>1234</code>, <code>1434</code>, <code>3260</code>,
     * <code>3343</code>, <code>3389</code>, <code>47001</code>, or <code>49152-49156</code>.
     * </p>
     * </li>
     * </ul>
     */
    private Integer dBPortNumber;
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
     * <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a public
     * subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     * </p>
     * <p>
     * Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, see
     * <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">
     * To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than <code>0</code>, supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private String monitoringRoleArn;
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
     * Specifies whether to remove the DB instance from the Active Directory domain.
     * </p>
     */
    private Boolean disableDomain;
    /**
     * <p>
     * The order of priority in which an Aurora Replica is promoted to the primary instance after a failure of the
     * existing primary instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.AuroraHighAvailability.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * <p>
     * Valid Values: <code>0 - 15</code>
     * </p>
     */
    private Integer promotionTier;
    /**
     * <p>
     * Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts to
     * database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora. Mapping Amazon Web Services IAM accounts to database accounts is
     * managed by the DB cluster.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;
    /**
     * <p>
     * Specifies whether to enable Performance Insights for the DB instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
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
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private String performanceInsightsKMSKeyId;
    /**
     * <p>
     * The number of days to retain Performance Insights data.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>month</i> * 31, where <i>month</i> is a number of months from 1-23. Examples: <code>93</code> (3 months * 31),
     * <code>341</code> (11 months * 31), <code>589</code> (19 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>731</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>7</code> days
     * </p>
     * <p>
     * If you specify a retention period that isn't valid, such as <code>94</code>, Amazon RDS returns an error.
     * </p>
     */
    private Integer performanceInsightsRetentionPeriod;
    /**
     * <p>
     * The log types to be enabled for export to CloudWatch Logs for a specific DB instance.
     * </p>
     * <p>
     * A change to the <code>CloudwatchLogsExportConfiguration</code> parameter is always applied to the DB instance
     * immediately. Therefore, the <code>ApplyImmediately</code> parameter has no effect.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration;
    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProcessorFeature> processorFeatures;
    /**
     * <p>
     * Specifies whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private Boolean useDefaultProcessorFeatures;
    /**
     * <p>
     * Specifies whether the DB instance has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled. By default, deletion protection isn't enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. You can enable or disable deletion protection for the
     * DB cluster. For more information, see <code>ModifyDBCluster</code>. DB instances in a DB cluster can be deleted
     * even when deletion protection is enabled for the DB cluster.
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
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private Integer maxAllocatedStorage;
    /**
     * <p>
     * Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.
     * </p>
     * <p>
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not updated
     * until the DB instance is restarted.
     * </p>
     * <important>
     * <p>
     * Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     * </p>
     * </important>
     * <p>
     * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB engine to
     * rotate your SSL/TLS certificate:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private Boolean certificateRotationRestart;
    /**
     * <p>
     * A value that sets the open mode of a replica database to either mounted or read-only.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter is only supported for Oracle DB instances.
     * </p>
     * </note>
     * <p>
     * Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     * cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the
     * mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private String replicaMode;
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
     * The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     */
    private String awsBackupRecoveryPointArn;
    /**
     * <p>
     * The automation mode of the RDS Custom DB instance. If <code>full</code>, the DB instance automates monitoring and
     * instance recovery. If <code>all paused</code>, the instance pauses automation for the duration set by
     * <code>ResumeFullAutomationModeMinutes</code>.
     * </p>
     */
    private String automationMode;
    /**
     * <p>
     * The number of minutes to pause the automation. When the time period ends, RDS Custom resumes full automation.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be at least 60.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be no more than 1,440.
     * </p>
     * </li>
     * </ul>
     */
    private Integer resumeFullAutomationModeMinutes;
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
     * Valid Values: <code>IPV4 | DUAL</code>
     * </p>
     */
    private String networkType;
    /**
     * <p>
     * The storage throughput value for the DB instance.
     * </p>
     * <p>
     * This setting applies only to the <code>gp3</code> storage type.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     * </p>
     */
    private Integer storageThroughput;
    /**
     * <p>
     * Specifies whether to manage the master user password with Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * If the DB instance doesn't manage the master user password with Amazon Web Services Secrets Manager, you can turn
     * on this management. In this case, you can't specify <code>MasterUserPassword</code>.
     * </p>
     * <p>
     * If the DB instance already manages the master user password with Amazon Web Services Secrets Manager, and you
     * specify that the master user password is not managed with Amazon Web Services Secrets Manager, then you must
     * specify <code>MasterUserPassword</code>. In this case, Amazon RDS deletes the secret and uses the new password
     * for the master user specified by <code>MasterUserPassword</code>.
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
     * Specifies whether to rotate the secret managed by Amazon Web Services Secrets Manager for the master user
     * password.
     * </p>
     * <p>
     * This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets Manager
     * for the DB cluster. The secret value contains the updated password.
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
     * You must apply the change immediately when rotating the master user password.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean rotateMasterUserPassword;
    /**
     * <p>
     * The Amazon Web Services KMS key identifier to encrypt a secret that is automatically generated and managed in
     * Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * This setting is valid only if both of the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB instance doesn't manage the master user password in Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * If the DB instance already manages the master user password in Amazon Web Services Secrets Manager, you can't
     * change the KMS key used to encrypt the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * You are turning on <code>ManageMasterUserPassword</code> to manage the master user password in Amazon Web
     * Services Secrets Manager.
     * </p>
     * <p>
     * If you are turning on <code>ManageMasterUserPassword</code> and don't specify
     * <code>MasterUserSecretKmsKeyId</code>, then the <code>aws/secretsmanager</code> KMS key is used to encrypt the
     * secret. If the secret is in a different Amazon Web Services account, then you can't use the
     * <code>aws/secretsmanager</code> KMS key to encrypt the secret, and you must use a customer managed KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a different
     * default KMS key for each Amazon Web Services Region.
     * </p>
     */
    private String masterUserSecretKmsKeyId;
    /**
     * <p>
     * The target Oracle DB engine when you convert a non-CDB to a CDB. This intermediate step is necessary to upgrade
     * an Oracle Database 19c non-CDB to an Oracle Database 21c CDB.
     * </p>
     * <p>
     * Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Make sure that you specify <code>oracle-ee-cdb</code> or <code>oracle-se2-cdb</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Make sure that your DB engine runs Oracle Database 19c with an April 2021 or later RU.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following limitations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't convert a CDB to a non-CDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert a replica database.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert a non-CDB to a CDB and upgrade the engine version in the same command.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert the existing custom parameter or option group when it has options or parameters that are
     * permanent or persistent. In this situation, the DB instance reverts to the default option and parameter group. To
     * avoid reverting to the default, specify a new parameter group with <code>--db-parameter-group-name</code> and a
     * new option group with <code>--option-group-name</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String engine;
    /**
     * <p>
     * Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
     * </p>
     */
    private Boolean dedicatedLogVolume;
    /**
     * <p>
     * Specifies whether the to convert your DB instance from the single-tenant conﬁguration to the multi-tenant
     * conﬁguration. This parameter is supported only for RDS for Oracle CDB instances.
     * </p>
     * <p>
     * During the conversion, RDS creates an initial tenant database and associates the DB name, master user name,
     * character set, and national character set metadata with this database. The tags associated with the instance also
     * propagate to the initial tenant database. You can add more tenant databases to your DB instance by using the
     * <code>CreateTenantDatabase</code> operation.
     * </p>
     * <important>
     * <p>
     * The conversion to the multi-tenant configuration is permanent and irreversible, so you can't later convert back
     * to the single-tenant configuration. When you specify this parameter, you must also specify
     * <code>ApplyImmediately</code>.
     * </p>
     * </important>
     */
    private Boolean multiTenant;

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
     *        The identifier of DB instance to modify. This value is stored as a lowercase string.</p>
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
    public ModifyDBInstanceRequest(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
    }

    /**
     * <p>
     * The identifier of DB instance to modify. This value is stored as a lowercase string.
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
     * @param dBInstanceIdentifier
     *        The identifier of DB instance to modify. This value is stored as a lowercase string.</p>
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

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The identifier of DB instance to modify. This value is stored as a lowercase string.
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
     * @return The identifier of DB instance to modify. This value is stored as a lowercase string.</p>
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

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The identifier of DB instance to modify. This value is stored as a lowercase string.
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
     * @param dBInstanceIdentifier
     *        The identifier of DB instance to modify. This value is stored as a lowercase string.</p>
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

    public ModifyDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The new amount of storage in gibibytes (GiB) to allocate for the DB instance.
     * </p>
     * <p>
     * For RDS for Db2, MariaDB, RDS for MySQL, RDS for Oracle, and RDS for PostgreSQL, the value supplied must be at
     * least 10% greater than the current value. Values that are not at least 10% greater than the existing value are
     * rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * For the valid values for allocated storage for each engine, see <code>CreateDBInstance</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you increase the allocated storage for a DB instance that uses Provisioned IOPS (<code>gp3</code>,
     * <code>io1</code>, or <code>io2</code> storage type), you must also specify the <code>Iops</code> parameter. You
     * can use the current value for <code>Iops</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param allocatedStorage
     *        The new amount of storage in gibibytes (GiB) to allocate for the DB instance.</p>
     *        <p>
     *        For RDS for Db2, MariaDB, RDS for MySQL, RDS for Oracle, and RDS for PostgreSQL, the value supplied must
     *        be at least 10% greater than the current value. Values that are not at least 10% greater than the existing
     *        value are rounded up so that they are 10% greater than the current value.
     *        </p>
     *        <p>
     *        For the valid values for allocated storage for each engine, see <code>CreateDBInstance</code>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When you increase the allocated storage for a DB instance that uses Provisioned IOPS (<code>gp3</code>,
     *        <code>io1</code>, or <code>io2</code> storage type), you must also specify the <code>Iops</code>
     *        parameter. You can use the current value for <code>Iops</code>.
     *        </p>
     *        </li>
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The new amount of storage in gibibytes (GiB) to allocate for the DB instance.
     * </p>
     * <p>
     * For RDS for Db2, MariaDB, RDS for MySQL, RDS for Oracle, and RDS for PostgreSQL, the value supplied must be at
     * least 10% greater than the current value. Values that are not at least 10% greater than the existing value are
     * rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * For the valid values for allocated storage for each engine, see <code>CreateDBInstance</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you increase the allocated storage for a DB instance that uses Provisioned IOPS (<code>gp3</code>,
     * <code>io1</code>, or <code>io2</code> storage type), you must also specify the <code>Iops</code> parameter. You
     * can use the current value for <code>Iops</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The new amount of storage in gibibytes (GiB) to allocate for the DB instance.</p>
     *         <p>
     *         For RDS for Db2, MariaDB, RDS for MySQL, RDS for Oracle, and RDS for PostgreSQL, the value supplied must
     *         be at least 10% greater than the current value. Values that are not at least 10% greater than the
     *         existing value are rounded up so that they are 10% greater than the current value.
     *         </p>
     *         <p>
     *         For the valid values for allocated storage for each engine, see <code>CreateDBInstance</code>.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         When you increase the allocated storage for a DB instance that uses Provisioned IOPS (<code>gp3</code>,
     *         <code>io1</code>, or <code>io2</code> storage type), you must also specify the <code>Iops</code>
     *         parameter. You can use the current value for <code>Iops</code>.
     *         </p>
     *         </li>
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The new amount of storage in gibibytes (GiB) to allocate for the DB instance.
     * </p>
     * <p>
     * For RDS for Db2, MariaDB, RDS for MySQL, RDS for Oracle, and RDS for PostgreSQL, the value supplied must be at
     * least 10% greater than the current value. Values that are not at least 10% greater than the existing value are
     * rounded up so that they are 10% greater than the current value.
     * </p>
     * <p>
     * For the valid values for allocated storage for each engine, see <code>CreateDBInstance</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you increase the allocated storage for a DB instance that uses Provisioned IOPS (<code>gp3</code>,
     * <code>io1</code>, or <code>io2</code> storage type), you must also specify the <code>Iops</code> parameter. You
     * can use the current value for <code>Iops</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param allocatedStorage
     *        The new amount of storage in gibibytes (GiB) to allocate for the DB instance.</p>
     *        <p>
     *        For RDS for Db2, MariaDB, RDS for MySQL, RDS for Oracle, and RDS for PostgreSQL, the value supplied must
     *        be at least 10% greater than the current value. Values that are not at least 10% greater than the existing
     *        value are rounded up so that they are 10% greater than the current value.
     *        </p>
     *        <p>
     *        For the valid values for allocated storage for each engine, see <code>CreateDBInstance</code>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When you increase the allocated storage for a DB instance that uses Provisioned IOPS (<code>gp3</code>,
     *        <code>io1</code>, or <code>io2</code> storage type), you must also specify the <code>Iops</code>
     *        parameter. You can use the current value for <code>Iops</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The new compute and memory capacity of the DB instance, for example <code>db.m4.large</code>. Not all DB instance
     * classes are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB
     * instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide</i> or <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html">Aurora DB
     * instance classes</a> in the <i>Amazon Aurora User Guide</i>. For RDS Custom, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits.html#custom-reqs-limits.instances">DB
     * instance class support for RDS Custom for Oracle</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits-MS.html#custom-reqs-limits.instancesMS"
     * > DB instance class support for RDS Custom for SQL Server</a>.
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless you specify <code>ApplyImmediately</code> in your request.
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
     * If you are modifying the DB instance class and upgrading the engine version at the same time, the currently
     * running engine version must be supported on the specified DB instance class. Otherwise, the operation returns an
     * error. In this case, first run the operation to upgrade the engine version, and then run it again to modify the
     * DB instance class.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceClass
     *        The new compute and memory capacity of the DB instance, for example <code>db.m4.large</code>. Not all DB
     *        instance classes are available in all Amazon Web Services Regions, or for all database engines. For the
     *        full list of DB instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *        Class</a> in the <i>Amazon RDS User Guide</i> or <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html">Aurora
     *        DB instance classes</a> in the <i>Amazon Aurora User Guide</i>. For RDS Custom, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits.html#custom-reqs-limits.instances"
     *        >DB instance class support for RDS Custom for Oracle</a> and <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits-MS.html#custom-reqs-limits.instancesMS"
     *        > DB instance class support for RDS Custom for SQL Server</a>.</p>
     *        <p>
     *        If you modify the DB instance class, an outage occurs during the change. The change is applied during the
     *        next maintenance window, unless you specify <code>ApplyImmediately</code> in your request.
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
     *        If you are modifying the DB instance class and upgrading the engine version at the same time, the
     *        currently running engine version must be supported on the specified DB instance class. Otherwise, the
     *        operation returns an error. In this case, first run the operation to upgrade the engine version, and then
     *        run it again to modify the DB instance class.
     *        </p>
     *        </li>
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The new compute and memory capacity of the DB instance, for example <code>db.m4.large</code>. Not all DB instance
     * classes are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB
     * instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide</i> or <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html">Aurora DB
     * instance classes</a> in the <i>Amazon Aurora User Guide</i>. For RDS Custom, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits.html#custom-reqs-limits.instances">DB
     * instance class support for RDS Custom for Oracle</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits-MS.html#custom-reqs-limits.instancesMS"
     * > DB instance class support for RDS Custom for SQL Server</a>.
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless you specify <code>ApplyImmediately</code> in your request.
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
     * If you are modifying the DB instance class and upgrading the engine version at the same time, the currently
     * running engine version must be supported on the specified DB instance class. Otherwise, the operation returns an
     * error. In this case, first run the operation to upgrade the engine version, and then run it again to modify the
     * DB instance class.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The new compute and memory capacity of the DB instance, for example <code>db.m4.large</code>. Not all DB
     *         instance classes are available in all Amazon Web Services Regions, or for all database engines. For the
     *         full list of DB instance classes, and availability for your engine, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *         Class</a> in the <i>Amazon RDS User Guide</i> or <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html">Aurora
     *         DB instance classes</a> in the <i>Amazon Aurora User Guide</i>. For RDS Custom, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits.html#custom-reqs-limits.instances"
     *         >DB instance class support for RDS Custom for Oracle</a> and <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits-MS.html#custom-reqs-limits.instancesMS"
     *         > DB instance class support for RDS Custom for SQL Server</a>.</p>
     *         <p>
     *         If you modify the DB instance class, an outage occurs during the change. The change is applied during the
     *         next maintenance window, unless you specify <code>ApplyImmediately</code> in your request.
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
     *         If you are modifying the DB instance class and upgrading the engine version at the same time, the
     *         currently running engine version must be supported on the specified DB instance class. Otherwise, the
     *         operation returns an error. In this case, first run the operation to upgrade the engine version, and then
     *         run it again to modify the DB instance class.
     *         </p>
     *         </li>
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The new compute and memory capacity of the DB instance, for example <code>db.m4.large</code>. Not all DB instance
     * classes are available in all Amazon Web Services Regions, or for all database engines. For the full list of DB
     * instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance Class</a>
     * in the <i>Amazon RDS User Guide</i> or <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html">Aurora DB
     * instance classes</a> in the <i>Amazon Aurora User Guide</i>. For RDS Custom, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits.html#custom-reqs-limits.instances">DB
     * instance class support for RDS Custom for Oracle</a> and <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits-MS.html#custom-reqs-limits.instancesMS"
     * > DB instance class support for RDS Custom for SQL Server</a>.
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless you specify <code>ApplyImmediately</code> in your request.
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
     * If you are modifying the DB instance class and upgrading the engine version at the same time, the currently
     * running engine version must be supported on the specified DB instance class. Otherwise, the operation returns an
     * error. In this case, first run the operation to upgrade the engine version, and then run it again to modify the
     * DB instance class.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceClass
     *        The new compute and memory capacity of the DB instance, for example <code>db.m4.large</code>. Not all DB
     *        instance classes are available in all Amazon Web Services Regions, or for all database engines. For the
     *        full list of DB instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB Instance
     *        Class</a> in the <i>Amazon RDS User Guide</i> or <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.DBInstanceClass.html">Aurora
     *        DB instance classes</a> in the <i>Amazon Aurora User Guide</i>. For RDS Custom, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits.html#custom-reqs-limits.instances"
     *        >DB instance class support for RDS Custom for Oracle</a> and <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/custom-reqs-limits-MS.html#custom-reqs-limits.instancesMS"
     *        > DB instance class support for RDS Custom for SQL Server</a>.</p>
     *        <p>
     *        If you modify the DB instance class, an outage occurs during the change. The change is applied during the
     *        next maintenance window, unless you specify <code>ApplyImmediately</code> in your request.
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
     *        If you are modifying the DB instance class and upgrading the engine version at the same time, the
     *        currently running engine version must be supported on the specified DB instance class. Otherwise, the
     *        operation returns an error. In this case, first run the operation to upgrade the engine version, and then
     *        run it again to modify the DB instance class.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different
     * VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB instance into a VPC. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     * >Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you enable <code>ApplyImmediately</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DB subnet group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a
     *        different VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB
     *        instance into a VPC. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     *        >Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        Changing the subnet group causes an outage during the change. The change is applied during the next
     *        maintenance window, unless you enable <code>ApplyImmediately</code>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing DB subnet group.
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
     * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different
     * VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB instance into a VPC. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     * >Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you enable <code>ApplyImmediately</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DB subnet group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * 
     * @return The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a
     *         different VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB
     *         instance into a VPC. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     *         >Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide</i>.</p>
     *         <p>
     *         Changing the subnet group causes an outage during the change. The change is applied during the next
     *         maintenance window, unless you enable <code>ApplyImmediately</code>.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match existing DB subnet group.
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
     * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different
     * VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB instance into a VPC. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     * >Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you enable <code>ApplyImmediately</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DB subnet group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a
     *        different VPC. If your DB instance isn't in a VPC, you can also use this parameter to move your DB
     *        instance into a VPC. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html#USER_VPC.Non-VPC2VPC"
     *        >Working with a DB instance in a VPC</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        Changing the subnet group causes an outage during the change. The change is applied during the next
     *        maintenance window, unless you enable <code>ApplyImmediately</code>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing DB subnet group.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mydbsubnetgroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DB security groups.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an
     *         outage and the change is asynchronously applied as soon as possible.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match existing DB security groups.
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
     * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DB security groups.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBSecurityGroups
     *        A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an
     *        outage and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing DB security groups.
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
     * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DB security groups.
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
     *        A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an
     *        outage and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing DB security groups.
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
     * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DB security groups.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBSecurityGroups
     *        A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an
     *        outage and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing DB security groups.
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
     * A list of Amazon EC2 VPC security groups to associate with this DB instance. This change is asynchronously
     * applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to the following DB instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Aurora (The associated list of EC2 VPC security groups is managed by the DB cluster. For more information,
     * see <code>ModifyDBCluster</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS Custom
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing VPC security group IDs.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of Amazon EC2 VPC security groups to associate with this DB instance. This change is
     *         asynchronously applied as soon as possible.</p>
     *         <p>
     *         This setting doesn't apply to the following DB instances:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Amazon Aurora (The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     *         information, see <code>ModifyDBCluster</code>.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS Custom
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match existing VPC security group IDs.
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
     * A list of Amazon EC2 VPC security groups to associate with this DB instance. This change is asynchronously
     * applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to the following DB instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Aurora (The associated list of EC2 VPC security groups is managed by the DB cluster. For more information,
     * see <code>ModifyDBCluster</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS Custom
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing VPC security group IDs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param vpcSecurityGroupIds
     *        A list of Amazon EC2 VPC security groups to associate with this DB instance. This change is asynchronously
     *        applied as soon as possible.</p>
     *        <p>
     *        This setting doesn't apply to the following DB instances:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Aurora (The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     *        information, see <code>ModifyDBCluster</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS Custom
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing VPC security group IDs.
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
     * A list of Amazon EC2 VPC security groups to associate with this DB instance. This change is asynchronously
     * applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to the following DB instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Aurora (The associated list of EC2 VPC security groups is managed by the DB cluster. For more information,
     * see <code>ModifyDBCluster</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS Custom
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing VPC security group IDs.
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
     *        A list of Amazon EC2 VPC security groups to associate with this DB instance. This change is asynchronously
     *        applied as soon as possible.</p>
     *        <p>
     *        This setting doesn't apply to the following DB instances:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Aurora (The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     *        information, see <code>ModifyDBCluster</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS Custom
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing VPC security group IDs.
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
     * A list of Amazon EC2 VPC security groups to associate with this DB instance. This change is asynchronously
     * applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to the following DB instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Aurora (The associated list of EC2 VPC security groups is managed by the DB cluster. For more information,
     * see <code>ModifyDBCluster</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS Custom
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing VPC security group IDs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param vpcSecurityGroupIds
     *        A list of Amazon EC2 VPC security groups to associate with this DB instance. This change is asynchronously
     *        applied as soon as possible.</p>
     *        <p>
     *        This setting doesn't apply to the following DB instances:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Aurora (The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     *        information, see <code>ModifyDBCluster</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS Custom
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing VPC security group IDs.
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
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance. By
     * default, this parameter is disabled.
     * </p>
     * <p>
     * If this parameter is disabled, changes to the DB instance are applied during the next maintenance window. Some
     * parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>, or the next
     * failure reboot. Review the table of parameters in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying a DB
     * Instance</a> in the <i>Amazon RDS User Guide</i> to see the impact of enabling or disabling
     * <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are applied.
     * </p>
     * 
     * @param applyImmediately
     *        Specifies whether the modifications in this request and any pending modifications are asynchronously
     *        applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *        instance. By default, this parameter is disabled.</p>
     *        <p>
     *        If this parameter is disabled, changes to the DB instance are applied during the next maintenance window.
     *        Some parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>, or
     *        the next failure reboot. Review the table of parameters in <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     *        a DB Instance</a> in the <i>Amazon RDS User Guide</i> to see the impact of enabling or disabling
     *        <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are applied.
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance. By
     * default, this parameter is disabled.
     * </p>
     * <p>
     * If this parameter is disabled, changes to the DB instance are applied during the next maintenance window. Some
     * parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>, or the next
     * failure reboot. Review the table of parameters in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying a DB
     * Instance</a> in the <i>Amazon RDS User Guide</i> to see the impact of enabling or disabling
     * <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are applied.
     * </p>
     * 
     * @return Specifies whether the modifications in this request and any pending modifications are asynchronously
     *         applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *         instance. By default, this parameter is disabled.</p>
     *         <p>
     *         If this parameter is disabled, changes to the DB instance are applied during the next maintenance window.
     *         Some parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>,
     *         or the next failure reboot. Review the table of parameters in <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html"
     *         >Modifying a DB Instance</a> in the <i>Amazon RDS User Guide</i> to see the impact of enabling or
     *         disabling <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are
     *         applied.
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance. By
     * default, this parameter is disabled.
     * </p>
     * <p>
     * If this parameter is disabled, changes to the DB instance are applied during the next maintenance window. Some
     * parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>, or the next
     * failure reboot. Review the table of parameters in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying a DB
     * Instance</a> in the <i>Amazon RDS User Guide</i> to see the impact of enabling or disabling
     * <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are applied.
     * </p>
     * 
     * @param applyImmediately
     *        Specifies whether the modifications in this request and any pending modifications are asynchronously
     *        applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *        instance. By default, this parameter is disabled.</p>
     *        <p>
     *        If this parameter is disabled, changes to the DB instance are applied during the next maintenance window.
     *        Some parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>, or
     *        the next failure reboot. Review the table of parameters in <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     *        a DB Instance</a> in the <i>Amazon RDS User Guide</i> to see the impact of enabling or disabling
     *        <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance. By
     * default, this parameter is disabled.
     * </p>
     * <p>
     * If this parameter is disabled, changes to the DB instance are applied during the next maintenance window. Some
     * parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>, or the next
     * failure reboot. Review the table of parameters in <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying a DB
     * Instance</a> in the <i>Amazon RDS User Guide</i> to see the impact of enabling or disabling
     * <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are applied.
     * </p>
     * 
     * @return Specifies whether the modifications in this request and any pending modifications are asynchronously
     *         applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *         instance. By default, this parameter is disabled.</p>
     *         <p>
     *         If this parameter is disabled, changes to the DB instance are applied during the next maintenance window.
     *         Some parameter changes can cause an outage and are applied on the next call to <a>RebootDBInstance</a>,
     *         or the next failure reboot. Review the table of parameters in <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html"
     *         >Modifying a DB Instance</a> in the <i>Amazon RDS User Guide</i> to see the impact of enabling or
     *         disabling <code>ApplyImmediately</code> for each modified parameter and to determine when the changes are
     *         applied.
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * The new password for the master user.
     * </p>
     * <p>
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible.
     * Between the time of the request and the completion of the request, the <code>MasterUserPassword</code> element
     * exists in the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <note>
     * <p>
     * Amazon RDS API operations never return the password, so this operation provides a way to regain access to a
     * primary instance user if the password is lost. This includes restoring privileges that might have been
     * accidentally revoked.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to the following DB instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Aurora (The password for the master user is managed by the DB cluster. For more information, see
     * <code>ModifyDBCluster</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS Custom
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can include any printable ASCII character except "/",
     * """, or "@". For RDS for Oracle, can't include the "&amp;" (ampersand) or the "'" (single quotes) character.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Length Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS for Db2 - Must contain from 8 to 255 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB - Must contain from 8 to 41 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Microsoft SQL Server - Must contain from 8 to 128 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL - Must contain from 8 to 41 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Oracle - Must contain from 8 to 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for PostgreSQL - Must contain from 8 to 128 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUserPassword
     *        The new password for the master user.</p>
     *        <p>
     *        Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as
     *        possible. Between the time of the request and the completion of the request, the
     *        <code>MasterUserPassword</code> element exists in the <code>PendingModifiedValues</code> element of the
     *        operation response.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon RDS API operations never return the password, so this operation provides a way to regain access to
     *        a primary instance user if the password is lost. This includes restoring privileges that might have been
     *        accidentally revoked.
     *        </p>
     *        </note>
     *        <p>
     *        This setting doesn't apply to the following DB instances:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Aurora (The password for the master user is managed by the DB cluster. For more information, see
     *        <code>ModifyDBCluster</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS Custom
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can include any printable ASCII character except "/",
     *        """, or "@". For RDS for Oracle, can't include the "&amp;" (ampersand) or the "'" (single quotes)
     *        character.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Length Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        RDS for Db2 - Must contain from 8 to 255 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MariaDB - Must contain from 8 to 41 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Microsoft SQL Server - Must contain from 8 to 128 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MySQL - Must contain from 8 to 41 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Oracle - Must contain from 8 to 30 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for PostgreSQL - Must contain from 8 to 128 characters.
     *        </p>
     *        </li>
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The new password for the master user.
     * </p>
     * <p>
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible.
     * Between the time of the request and the completion of the request, the <code>MasterUserPassword</code> element
     * exists in the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <note>
     * <p>
     * Amazon RDS API operations never return the password, so this operation provides a way to regain access to a
     * primary instance user if the password is lost. This includes restoring privileges that might have been
     * accidentally revoked.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to the following DB instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Aurora (The password for the master user is managed by the DB cluster. For more information, see
     * <code>ModifyDBCluster</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS Custom
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can include any printable ASCII character except "/",
     * """, or "@". For RDS for Oracle, can't include the "&amp;" (ampersand) or the "'" (single quotes) character.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Length Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS for Db2 - Must contain from 8 to 255 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB - Must contain from 8 to 41 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Microsoft SQL Server - Must contain from 8 to 128 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL - Must contain from 8 to 41 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Oracle - Must contain from 8 to 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for PostgreSQL - Must contain from 8 to 128 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The new password for the master user.</p>
     *         <p>
     *         Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as
     *         possible. Between the time of the request and the completion of the request, the
     *         <code>MasterUserPassword</code> element exists in the <code>PendingModifiedValues</code> element of the
     *         operation response.
     *         </p>
     *         <note>
     *         <p>
     *         Amazon RDS API operations never return the password, so this operation provides a way to regain access to
     *         a primary instance user if the password is lost. This includes restoring privileges that might have been
     *         accidentally revoked.
     *         </p>
     *         </note>
     *         <p>
     *         This setting doesn't apply to the following DB instances:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Amazon Aurora (The password for the master user is managed by the DB cluster. For more information, see
     *         <code>ModifyDBCluster</code>.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS Custom
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: Uses existing setting
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can include any printable ASCII character except "/",
     *         """, or "@". For RDS for Oracle, can't include the "&amp;" (ampersand) or the "'" (single quotes)
     *         character.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Length Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         RDS for Db2 - Must contain from 8 to 255 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for MariaDB - Must contain from 8 to 41 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for Microsoft SQL Server - Must contain from 8 to 128 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for MySQL - Must contain from 8 to 41 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for Oracle - Must contain from 8 to 30 characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for PostgreSQL - Must contain from 8 to 128 characters.
     *         </p>
     *         </li>
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The new password for the master user.
     * </p>
     * <p>
     * Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as possible.
     * Between the time of the request and the completion of the request, the <code>MasterUserPassword</code> element
     * exists in the <code>PendingModifiedValues</code> element of the operation response.
     * </p>
     * <note>
     * <p>
     * Amazon RDS API operations never return the password, so this operation provides a way to regain access to a
     * primary instance user if the password is lost. This includes restoring privileges that might have been
     * accidentally revoked.
     * </p>
     * </note>
     * <p>
     * This setting doesn't apply to the following DB instances:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Aurora (The password for the master user is managed by the DB cluster. For more information, see
     * <code>ModifyDBCluster</code>.)
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS Custom
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Uses existing setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can include any printable ASCII character except "/",
     * """, or "@". For RDS for Oracle, can't include the "&amp;" (ampersand) or the "'" (single quotes) character.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Length Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS for Db2 - Must contain from 8 to 255 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB - Must contain from 8 to 41 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Microsoft SQL Server - Must contain from 8 to 128 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL - Must contain from 8 to 41 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Oracle - Must contain from 8 to 30 characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for PostgreSQL - Must contain from 8 to 128 characters.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUserPassword
     *        The new password for the master user.</p>
     *        <p>
     *        Changing this parameter doesn't result in an outage and the change is asynchronously applied as soon as
     *        possible. Between the time of the request and the completion of the request, the
     *        <code>MasterUserPassword</code> element exists in the <code>PendingModifiedValues</code> element of the
     *        operation response.
     *        </p>
     *        <note>
     *        <p>
     *        Amazon RDS API operations never return the password, so this operation provides a way to regain access to
     *        a primary instance user if the password is lost. This includes restoring privileges that might have been
     *        accidentally revoked.
     *        </p>
     *        </note>
     *        <p>
     *        This setting doesn't apply to the following DB instances:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Aurora (The password for the master user is managed by the DB cluster. For more information, see
     *        <code>ModifyDBCluster</code>.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS Custom
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Uses existing setting
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be specified if <code>ManageMasterUserPassword</code> is turned on.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can include any printable ASCII character except "/",
     *        """, or "@". For RDS for Oracle, can't include the "&amp;" (ampersand) or the "'" (single quotes)
     *        character.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Length Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        RDS for Db2 - Must contain from 8 to 255 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MariaDB - Must contain from 8 to 41 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Microsoft SQL Server - Must contain from 8 to 128 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MySQL - Must contain from 8 to 41 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Oracle - Must contain from 8 to 30 characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for PostgreSQL - Must contain from 8 to 128 characters.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to the DB instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage. The parameter group name itself is changed immediately, but
     * the actual parameter changes are not applied until you reboot the instance without failover. In this case, the DB
     * instance isn't rebooted automatically, and the parameter changes aren't applied during the next maintenance
     * window. However, if you modify dynamic parameters in the newly associated DB parameter group, these changes are
     * applied immediately without a reboot.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
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
     * Must be in the same DB parameter group family as the DB instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group to apply to the DB instance.</p>
     *        <p>
     *        Changing this setting doesn't result in an outage. The parameter group name itself is changed immediately,
     *        but the actual parameter changes are not applied until you reboot the instance without failover. In this
     *        case, the DB instance isn't rebooted automatically, and the parameter changes aren't applied during the
     *        next maintenance window. However, if you modify dynamic parameters in the newly associated DB parameter
     *        group, these changes are applied immediately without a reboot.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
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
     *        Must be in the same DB parameter group family as the DB instance.
     *        </p>
     *        </li>
     */

    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to the DB instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage. The parameter group name itself is changed immediately, but
     * the actual parameter changes are not applied until you reboot the instance without failover. In this case, the DB
     * instance isn't rebooted automatically, and the parameter changes aren't applied during the next maintenance
     * window. However, if you modify dynamic parameters in the newly associated DB parameter group, these changes are
     * applied immediately without a reboot.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
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
     * Must be in the same DB parameter group family as the DB instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the DB parameter group to apply to the DB instance.</p>
     *         <p>
     *         Changing this setting doesn't result in an outage. The parameter group name itself is changed
     *         immediately, but the actual parameter changes are not applied until you reboot the instance without
     *         failover. In this case, the DB instance isn't rebooted automatically, and the parameter changes aren't
     *         applied during the next maintenance window. However, if you modify dynamic parameters in the newly
     *         associated DB parameter group, these changes are applied immediately without a reboot.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
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
     *         Must be in the same DB parameter group family as the DB instance.
     *         </p>
     *         </li>
     */

    public String getDBParameterGroupName() {
        return this.dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to the DB instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage. The parameter group name itself is changed immediately, but
     * the actual parameter changes are not applied until you reboot the instance without failover. In this case, the DB
     * instance isn't rebooted automatically, and the parameter changes aren't applied during the next maintenance
     * window. However, if you modify dynamic parameters in the newly associated DB parameter group, these changes are
     * applied immediately without a reboot.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
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
     * Must be in the same DB parameter group family as the DB instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group to apply to the DB instance.</p>
     *        <p>
     *        Changing this setting doesn't result in an outage. The parameter group name itself is changed immediately,
     *        but the actual parameter changes are not applied until you reboot the instance without failover. In this
     *        case, the DB instance isn't rebooted automatically, and the parameter changes aren't applied during the
     *        next maintenance window. However, if you modify dynamic parameters in the newly associated DB parameter
     *        group, these changes are applied immediately without a reboot.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
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
     *        Must be in the same DB parameter group family as the DB instance.
     *        </p>
     *        </li>
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
     * <note>
     * <p>
     * Enabling and disabling backups can result in a brief I/O suspension that lasts from a few seconds to a few
     * minutes, depending on the size and class of your DB instance.
     * </p>
     * </note>
     * <p>
     * These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter
     * is enabled for this request. If you change the parameter from one non-zero value to another non-zero value, the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. The retention period for automated backups is managed
     * by the DB cluster. For more information, see <code>ModifyDBCluster</code>.
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
     * Must be a value from 0 to 35.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 for an RDS Custom for Oracle DB instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days to retain automated backups. Setting this parameter to a positive number enables
     *        backups. Setting this parameter to 0 disables automated backups.</p> <note>
     *        <p>
     *        Enabling and disabling backups can result in a brief I/O suspension that lasts from a few seconds to a few
     *        minutes, depending on the size and class of your DB instance.
     *        </p>
     *        </note>
     *        <p>
     *        These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is enabled for this request. If you change the parameter from one non-zero value to another
     *        non-zero value, the change is asynchronously applied as soon as possible.
     *        </p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora DB instances. The retention period for automated backups is
     *        managed by the DB cluster. For more information, see <code>ModifyDBCluster</code>.
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
     *        Must be a value from 0 to 35.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be set to 0 if the DB instance is a source to read replicas.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be set to 0 for an RDS Custom for Oracle DB instance.
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
     * <note>
     * <p>
     * Enabling and disabling backups can result in a brief I/O suspension that lasts from a few seconds to a few
     * minutes, depending on the size and class of your DB instance.
     * </p>
     * </note>
     * <p>
     * These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter
     * is enabled for this request. If you change the parameter from one non-zero value to another non-zero value, the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. The retention period for automated backups is managed
     * by the DB cluster. For more information, see <code>ModifyDBCluster</code>.
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
     * Must be a value from 0 to 35.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 for an RDS Custom for Oracle DB instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of days to retain automated backups. Setting this parameter to a positive number enables
     *         backups. Setting this parameter to 0 disables automated backups.</p> <note>
     *         <p>
     *         Enabling and disabling backups can result in a brief I/O suspension that lasts from a few seconds to a
     *         few minutes, depending on the size and class of your DB instance.
     *         </p>
     *         </note>
     *         <p>
     *         These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *         parameter is enabled for this request. If you change the parameter from one non-zero value to another
     *         non-zero value, the change is asynchronously applied as soon as possible.
     *         </p>
     *         <p>
     *         This setting doesn't apply to Amazon Aurora DB instances. The retention period for automated backups is
     *         managed by the DB cluster. For more information, see <code>ModifyDBCluster</code>.
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
     *         Must be a value from 0 to 35.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be set to 0 if the DB instance is a source to read replicas.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be set to 0 for an RDS Custom for Oracle DB instance.
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
     * <note>
     * <p>
     * Enabling and disabling backups can result in a brief I/O suspension that lasts from a few seconds to a few
     * minutes, depending on the size and class of your DB instance.
     * </p>
     * </note>
     * <p>
     * These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter
     * is enabled for this request. If you change the parameter from one non-zero value to another non-zero value, the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. The retention period for automated backups is managed
     * by the DB cluster. For more information, see <code>ModifyDBCluster</code>.
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
     * Must be a value from 0 to 35.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 for an RDS Custom for Oracle DB instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days to retain automated backups. Setting this parameter to a positive number enables
     *        backups. Setting this parameter to 0 disables automated backups.</p> <note>
     *        <p>
     *        Enabling and disabling backups can result in a brief I/O suspension that lasts from a few seconds to a few
     *        minutes, depending on the size and class of your DB instance.
     *        </p>
     *        </note>
     *        <p>
     *        These changes are applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is enabled for this request. If you change the parameter from one non-zero value to another
     *        non-zero value, the change is asynchronously applied as soon as possible.
     *        </p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora DB instances. The retention period for automated backups is
     *        managed by the DB cluster. For more information, see <code>ModifyDBCluster</code>.
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
     *        Must be a value from 0 to 35.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be set to 0 if the DB instance is a source to read replicas.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be set to 0 for an RDS Custom for Oracle DB instance.
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
     * by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible. The default is a 30-minute window selected at random from
     * an 8-hour block of time for each Amazon Web Services Region. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Backup window</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. The daily time range for creating automated backups is
     * managed by the DB cluster. For more information, see <code>ModifyDBCluster</code>.
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
     *        The daily time range during which automated backups are created if automated backups are enabled, as
     *        determined by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter doesn't result in
     *        an outage and the change is asynchronously applied as soon as possible. The default is a 30-minute window
     *        selected at random from an 8-hour block of time for each Amazon Web Services Region. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *        >Backup window</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora DB instances. The daily time range for creating automated
     *        backups is managed by the DB cluster. For more information, see <code>ModifyDBCluster</code>.
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
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible. The default is a 30-minute window selected at random from
     * an 8-hour block of time for each Amazon Web Services Region. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Backup window</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. The daily time range for creating automated backups is
     * managed by the DB cluster. For more information, see <code>ModifyDBCluster</code>.
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
     * @return The daily time range during which automated backups are created if automated backups are enabled, as
     *         determined by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter doesn't result in
     *         an outage and the change is asynchronously applied as soon as possible. The default is a 30-minute window
     *         selected at random from an 8-hour block of time for each Amazon Web Services Region. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *         >Backup window</a> in the <i>Amazon RDS User Guide</i>.</p>
     *         <p>
     *         This setting doesn't apply to Amazon Aurora DB instances. The daily time range for creating automated
     *         backups is managed by the DB cluster. For more information, see <code>ModifyDBCluster</code>.
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
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible. The default is a 30-minute window selected at random from
     * an 8-hour block of time for each Amazon Web Services Region. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >Backup window</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. The daily time range for creating automated backups is
     * managed by the DB cluster. For more information, see <code>ModifyDBCluster</code>.
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
     *        The daily time range during which automated backups are created if automated backups are enabled, as
     *        determined by the <code>BackupRetentionPeriod</code> parameter. Changing this parameter doesn't result in
     *        an outage and the change is asynchronously applied as soon as possible. The default is a 30-minute window
     *        selected at random from an 8-hour block of time for each Amazon Web Services Region. For more information,
     *        see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *        >Backup window</a> in the <i>Amazon RDS User Guide</i>.</p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora DB instances. The daily time range for creating automated
     *        backups is managed by the DB cluster. For more information, see <code>ModifyDBCluster</code>.
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

    public ModifyDBInstanceRequest withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, which might result in an outage. Changing this
     * parameter doesn't result in an outage, except in the following situation, and the change is asynchronously
     * applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance window is
     * changed to include the current time, then changing this parameter causes a reboot of the DB instance. If you
     * change this window to the current time, there must be at least 30 minutes between the current time and end of the
     * window to ensure pending changes are applied.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
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
     * Must be in the format <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The day values must be <code>mon | tue | wed | thu | fri | sat | sun</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred backup window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, which might result in an outage. Changing
     *        this parameter doesn't result in an outage, except in the following situation, and the change is
     *        asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the
     *        maintenance window is changed to include the current time, then changing this parameter causes a reboot of
     *        the DB instance. If you change this window to the current time, there must be at least 30 minutes between
     *        the current time and end of the window to ensure pending changes are applied.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     *        >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
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
     *        Must be in the format <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The day values must be <code>mon | tue | wed | thu | fri | sat | sun</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred backup window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, which might result in an outage. Changing this
     * parameter doesn't result in an outage, except in the following situation, and the change is asynchronously
     * applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance window is
     * changed to include the current time, then changing this parameter causes a reboot of the DB instance. If you
     * change this window to the current time, there must be at least 30 minutes between the current time and end of the
     * window to ensure pending changes are applied.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
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
     * Must be in the format <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The day values must be <code>mon | tue | wed | thu | fri | sat | sun</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred backup window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The weekly time range during which system maintenance can occur, which might result in an outage.
     *         Changing this parameter doesn't result in an outage, except in the following situation, and the change is
     *         asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the
     *         maintenance window is changed to include the current time, then changing this parameter causes a reboot
     *         of the DB instance. If you change this window to the current time, there must be at least 30 minutes
     *         between the current time and end of the window to ensure pending changes are applied.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     *         >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
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
     *         Must be in the format <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The day values must be <code>mon | tue | wed | thu | fri | sat | sun</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be in Universal Coordinated Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not conflict with the preferred backup window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 30 minutes.
     *         </p>
     *         </li>
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, which might result in an outage. Changing this
     * parameter doesn't result in an outage, except in the following situation, and the change is asynchronously
     * applied as soon as possible. If there are pending actions that cause a reboot, and the maintenance window is
     * changed to include the current time, then changing this parameter causes a reboot of the DB instance. If you
     * change this window to the current time, there must be at least 30 minutes between the current time and end of the
     * window to ensure pending changes are applied.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
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
     * Must be in the format <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The day values must be <code>mon | tue | wed | thu | fri | sat | sun</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred backup window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, which might result in an outage. Changing
     *        this parameter doesn't result in an outage, except in the following situation, and the change is
     *        asynchronously applied as soon as possible. If there are pending actions that cause a reboot, and the
     *        maintenance window is changed to include the current time, then changing this parameter causes a reboot of
     *        the DB instance. If you change this window to the current time, there must be at least 30 minutes between
     *        the current time and end of the window to ensure pending changes are applied.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     *        >Amazon RDS Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
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
     *        Must be in the format <code>ddd:hh24:mi-ddd:hh24:mi</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The day values must be <code>mon | tue | wed | thu | fri | sat | sun</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred backup window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage.
     * The change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param multiAZ
     *        Specifies whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an
     *        outage. The change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is enabled for this request.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage.
     * The change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return Specifies whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an
     *         outage. The change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *         parameter is enabled for this request.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Specifies whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage.
     * The change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param multiAZ
     *        Specifies whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an
     *        outage. The change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is enabled for this request.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage.
     * The change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return Specifies whether the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an
     *         outage. The change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *         parameter is enabled for this request.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * The version number of the database engine to upgrade to. Changing this parameter results in an outage and the
     * change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     * <p>
     * If you specify only a major version, Amazon RDS updates the DB instance to the default minor version if the
     * current minor version is lower. For information about valid engine versions, see <code>CreateDBInstance</code>,
     * or call <code>DescribeDBEngineVersions</code>.
     * </p>
     * <p>
     * If the instance that you're modifying is acting as a read replica, the engine version that you specify must be
     * the same or higher than the version that the source DB instance or cluster is running.
     * </p>
     * <p>
     * In RDS Custom for Oracle, this parameter is supported for read replicas only if they are in the
     * <code>PATCH_DB_FAILURE</code> lifecycle.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are upgrading the engine version and modifying the DB instance class at the same time, the currently
     * running engine version must be supported on the specified DB instance class. Otherwise, the operation returns an
     * error. In this case, first run the operation to upgrade the engine version, and then run it again to modify the
     * DB instance class.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineVersion
     *        The version number of the database engine to upgrade to. Changing this parameter results in an outage and
     *        the change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is enabled for this request.</p>
     *        <p>
     *        For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter
     *        group in the DB parameter group family for the new engine version must be specified. The new DB parameter
     *        group can be the default for that DB parameter group family.
     *        </p>
     *        <p>
     *        If you specify only a major version, Amazon RDS updates the DB instance to the default minor version if
     *        the current minor version is lower. For information about valid engine versions, see
     *        <code>CreateDBInstance</code>, or call <code>DescribeDBEngineVersions</code>.
     *        </p>
     *        <p>
     *        If the instance that you're modifying is acting as a read replica, the engine version that you specify
     *        must be the same or higher than the version that the source DB instance or cluster is running.
     *        </p>
     *        <p>
     *        In RDS Custom for Oracle, this parameter is supported for read replicas only if they are in the
     *        <code>PATCH_DB_FAILURE</code> lifecycle.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are upgrading the engine version and modifying the DB instance class at the same time, the
     *        currently running engine version must be supported on the specified DB instance class. Otherwise, the
     *        operation returns an error. In this case, first run the operation to upgrade the engine version, and then
     *        run it again to modify the DB instance class.
     *        </p>
     *        </li>
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to upgrade to. Changing this parameter results in an outage and the
     * change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     * <p>
     * If you specify only a major version, Amazon RDS updates the DB instance to the default minor version if the
     * current minor version is lower. For information about valid engine versions, see <code>CreateDBInstance</code>,
     * or call <code>DescribeDBEngineVersions</code>.
     * </p>
     * <p>
     * If the instance that you're modifying is acting as a read replica, the engine version that you specify must be
     * the same or higher than the version that the source DB instance or cluster is running.
     * </p>
     * <p>
     * In RDS Custom for Oracle, this parameter is supported for read replicas only if they are in the
     * <code>PATCH_DB_FAILURE</code> lifecycle.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are upgrading the engine version and modifying the DB instance class at the same time, the currently
     * running engine version must be supported on the specified DB instance class. Otherwise, the operation returns an
     * error. In this case, first run the operation to upgrade the engine version, and then run it again to modify the
     * DB instance class.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The version number of the database engine to upgrade to. Changing this parameter results in an outage and
     *         the change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *         parameter is enabled for this request.</p>
     *         <p>
     *         For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter
     *         group in the DB parameter group family for the new engine version must be specified. The new DB parameter
     *         group can be the default for that DB parameter group family.
     *         </p>
     *         <p>
     *         If you specify only a major version, Amazon RDS updates the DB instance to the default minor version if
     *         the current minor version is lower. For information about valid engine versions, see
     *         <code>CreateDBInstance</code>, or call <code>DescribeDBEngineVersions</code>.
     *         </p>
     *         <p>
     *         If the instance that you're modifying is acting as a read replica, the engine version that you specify
     *         must be the same or higher than the version that the source DB instance or cluster is running.
     *         </p>
     *         <p>
     *         In RDS Custom for Oracle, this parameter is supported for read replicas only if they are in the
     *         <code>PATCH_DB_FAILURE</code> lifecycle.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you are upgrading the engine version and modifying the DB instance class at the same time, the
     *         currently running engine version must be supported on the specified DB instance class. Otherwise, the
     *         operation returns an error. In this case, first run the operation to upgrade the engine version, and then
     *         run it again to modify the DB instance class.
     *         </p>
     *         </li>
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to upgrade to. Changing this parameter results in an outage and the
     * change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     * <p>
     * If you specify only a major version, Amazon RDS updates the DB instance to the default minor version if the
     * current minor version is lower. For information about valid engine versions, see <code>CreateDBInstance</code>,
     * or call <code>DescribeDBEngineVersions</code>.
     * </p>
     * <p>
     * If the instance that you're modifying is acting as a read replica, the engine version that you specify must be
     * the same or higher than the version that the source DB instance or cluster is running.
     * </p>
     * <p>
     * In RDS Custom for Oracle, this parameter is supported for read replicas only if they are in the
     * <code>PATCH_DB_FAILURE</code> lifecycle.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you are upgrading the engine version and modifying the DB instance class at the same time, the currently
     * running engine version must be supported on the specified DB instance class. Otherwise, the operation returns an
     * error. In this case, first run the operation to upgrade the engine version, and then run it again to modify the
     * DB instance class.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineVersion
     *        The version number of the database engine to upgrade to. Changing this parameter results in an outage and
     *        the change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is enabled for this request.</p>
     *        <p>
     *        For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter
     *        group in the DB parameter group family for the new engine version must be specified. The new DB parameter
     *        group can be the default for that DB parameter group family.
     *        </p>
     *        <p>
     *        If you specify only a major version, Amazon RDS updates the DB instance to the default minor version if
     *        the current minor version is lower. For information about valid engine versions, see
     *        <code>CreateDBInstance</code>, or call <code>DescribeDBEngineVersions</code>.
     *        </p>
     *        <p>
     *        If the instance that you're modifying is acting as a read replica, the engine version that you specify
     *        must be the same or higher than the version that the source DB instance or cluster is running.
     *        </p>
     *        <p>
     *        In RDS Custom for Oracle, this parameter is supported for read replicas only if they are in the
     *        <code>PATCH_DB_FAILURE</code> lifecycle.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you are upgrading the engine version and modifying the DB instance class at the same time, the
     *        currently running engine version must be supported on the specified DB instance class. Otherwise, the
     *        operation returns an error. In this case, first run the operation to upgrade the engine version, and then
     *        run it again to modify the DB instance class.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Specifies whether major version upgrades are allowed. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Major version upgrades must be allowed when specifying a value for the <code>EngineVersion</code> parameter
     * that's a different major version than the DB instance's current version.
     * </p>
     * </li>
     * </ul>
     * 
     * @param allowMajorVersionUpgrade
     *        Specifies whether major version upgrades are allowed. Changing this parameter doesn't result in an outage
     *        and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Major version upgrades must be allowed when specifying a value for the <code>EngineVersion</code>
     *        parameter that's a different major version than the DB instance's current version.
     *        </p>
     *        </li>
     */

    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * Specifies whether major version upgrades are allowed. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Major version upgrades must be allowed when specifying a value for the <code>EngineVersion</code> parameter
     * that's a different major version than the DB instance's current version.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether major version upgrades are allowed. Changing this parameter doesn't result in an outage
     *         and the change is asynchronously applied as soon as possible.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Major version upgrades must be allowed when specifying a value for the <code>EngineVersion</code>
     *         parameter that's a different major version than the DB instance's current version.
     *         </p>
     *         </li>
     */

    public Boolean getAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * Specifies whether major version upgrades are allowed. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Major version upgrades must be allowed when specifying a value for the <code>EngineVersion</code> parameter
     * that's a different major version than the DB instance's current version.
     * </p>
     * </li>
     * </ul>
     * 
     * @param allowMajorVersionUpgrade
     *        Specifies whether major version upgrades are allowed. Changing this parameter doesn't result in an outage
     *        and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Major version upgrades must be allowed when specifying a value for the <code>EngineVersion</code>
     *        parameter that's a different major version than the DB instance's current version.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        setAllowMajorVersionUpgrade(allowMajorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Specifies whether major version upgrades are allowed. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Major version upgrades must be allowed when specifying a value for the <code>EngineVersion</code> parameter
     * that's a different major version than the DB instance's current version.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether major version upgrades are allowed. Changing this parameter doesn't result in an outage
     *         and the change is asynchronously applied as soon as possible.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Major version upgrades must be allowed when specifying a value for the <code>EngineVersion</code>
     *         parameter that's a different major version than the DB instance's current version.
     *         </p>
     *         </li>
     */

    public Boolean isAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * Specifies whether minor version upgrades are applied automatically to the DB instance during the maintenance
     * window. An outage occurs when all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The automatic upgrade is enabled for the maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * A newer minor version is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS has enabled automatic patching for the engine version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, Amazon RDS applies the change as soon as possible and doesn't cause
     * an outage.
     * </p>
     * <p>
     * For an RDS Custom DB instance, don't enable this setting. Otherwise, the operation returns an error.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Specifies whether minor version upgrades are applied automatically to the DB instance during the
     *        maintenance window. An outage occurs when all the following conditions are met:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The automatic upgrade is enabled for the maintenance window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A newer minor version is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS has enabled automatic patching for the engine version.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If any of the preceding conditions isn't met, Amazon RDS applies the change as soon as possible and
     *        doesn't cause an outage.
     *        </p>
     *        <p>
     *        For an RDS Custom DB instance, don't enable this setting. Otherwise, the operation returns an error.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Specifies whether minor version upgrades are applied automatically to the DB instance during the maintenance
     * window. An outage occurs when all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The automatic upgrade is enabled for the maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * A newer minor version is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS has enabled automatic patching for the engine version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, Amazon RDS applies the change as soon as possible and doesn't cause
     * an outage.
     * </p>
     * <p>
     * For an RDS Custom DB instance, don't enable this setting. Otherwise, the operation returns an error.
     * </p>
     * 
     * @return Specifies whether minor version upgrades are applied automatically to the DB instance during the
     *         maintenance window. An outage occurs when all the following conditions are met:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The automatic upgrade is enabled for the maintenance window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A newer minor version is available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS has enabled automatic patching for the engine version.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If any of the preceding conditions isn't met, Amazon RDS applies the change as soon as possible and
     *         doesn't cause an outage.
     *         </p>
     *         <p>
     *         For an RDS Custom DB instance, don't enable this setting. Otherwise, the operation returns an error.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Specifies whether minor version upgrades are applied automatically to the DB instance during the maintenance
     * window. An outage occurs when all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The automatic upgrade is enabled for the maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * A newer minor version is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS has enabled automatic patching for the engine version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, Amazon RDS applies the change as soon as possible and doesn't cause
     * an outage.
     * </p>
     * <p>
     * For an RDS Custom DB instance, don't enable this setting. Otherwise, the operation returns an error.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Specifies whether minor version upgrades are applied automatically to the DB instance during the
     *        maintenance window. An outage occurs when all the following conditions are met:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The automatic upgrade is enabled for the maintenance window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A newer minor version is available.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS has enabled automatic patching for the engine version.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If any of the preceding conditions isn't met, Amazon RDS applies the change as soon as possible and
     *        doesn't cause an outage.
     *        </p>
     *        <p>
     *        For an RDS Custom DB instance, don't enable this setting. Otherwise, the operation returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Specifies whether minor version upgrades are applied automatically to the DB instance during the maintenance
     * window. An outage occurs when all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The automatic upgrade is enabled for the maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * A newer minor version is available.
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS has enabled automatic patching for the engine version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, Amazon RDS applies the change as soon as possible and doesn't cause
     * an outage.
     * </p>
     * <p>
     * For an RDS Custom DB instance, don't enable this setting. Otherwise, the operation returns an error.
     * </p>
     * 
     * @return Specifies whether minor version upgrades are applied automatically to the DB instance during the
     *         maintenance window. An outage occurs when all the following conditions are met:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The automatic upgrade is enabled for the maintenance window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A newer minor version is available.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS has enabled automatic patching for the engine version.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If any of the preceding conditions isn't met, Amazon RDS applies the change as soon as possible and
     *         doesn't cause an outage.
     *         </p>
     *         <p>
     *         For an RDS Custom DB instance, don't enable this setting. Otherwise, the operation returns an error.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS for Db2 - <code>bring-your-own-license</code>
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
     * 
     * @param licenseModel
     *        The license model for the DB instance.</p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        RDS for Db2 - <code>bring-your-own-license</code>
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
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS for Db2 - <code>bring-your-own-license</code>
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
     * 
     * @return The license model for the DB instance.</p>
     *         <p>
     *         This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     *         </p>
     *         <p>
     *         Valid Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         RDS for Db2 - <code>bring-your-own-license</code>
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
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * RDS for Db2 - <code>bring-your-own-license</code>
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
     * 
     * @param licenseModel
     *        The license model for the DB instance.</p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        RDS for Db2 - <code>bring-your-own-license</code>
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * The new Provisioned IOPS (I/O operations per second) value for the RDS instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is enabled for this request. If you are migrating from
     * Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a reboot for the change
     * in storage type to take effect.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RDS for MariaDB, RDS for MySQL, RDS for Oracle, and RDS for PostgreSQL - The value supplied must be at least
     * 10% greater than the current value. Values that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you increase the Provisioned IOPS, you must also specify the <code>AllocatedStorage</code> parameter. You
     * can use the current value for <code>AllocatedStorage</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @param iops
     *        The new Provisioned IOPS (I/O operations per second) value for the RDS instance.</p>
     *        <p>
     *        Changing this setting doesn't result in an outage and the change is applied during the next maintenance
     *        window unless the <code>ApplyImmediately</code> parameter is enabled for this request. If you are
     *        migrating from Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a
     *        reboot for the change in storage type to take effect.
     *        </p>
     *        <p>
     *        If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *        using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration
     *        depends on several factors such as database load, storage size, storage type (standard or Provisioned
     *        IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical
     *        migration times are under 24 hours, but the process can take up to several days in some cases. During the
     *        migration, the DB instance is available for use, but might experience performance degradation. While the
     *        migration takes place, nightly backups for the instance are suspended. No other Amazon RDS operations can
     *        take place for the instance, including modifying the instance, rebooting the instance, deleting the
     *        instance, creating a read replica for the instance, and creating a DB snapshot of the instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For RDS for MariaDB, RDS for MySQL, RDS for Oracle, and RDS for PostgreSQL - The value supplied must be at
     *        least 10% greater than the current value. Values that are not at least 10% greater than the existing value
     *        are rounded up so that they are 10% greater than the current value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When you increase the Provisioned IOPS, you must also specify the <code>AllocatedStorage</code> parameter.
     *        You can use the current value for <code>AllocatedStorage</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Uses existing setting
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The new Provisioned IOPS (I/O operations per second) value for the RDS instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is enabled for this request. If you are migrating from
     * Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a reboot for the change
     * in storage type to take effect.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RDS for MariaDB, RDS for MySQL, RDS for Oracle, and RDS for PostgreSQL - The value supplied must be at least
     * 10% greater than the current value. Values that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you increase the Provisioned IOPS, you must also specify the <code>AllocatedStorage</code> parameter. You
     * can use the current value for <code>AllocatedStorage</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @return The new Provisioned IOPS (I/O operations per second) value for the RDS instance.</p>
     *         <p>
     *         Changing this setting doesn't result in an outage and the change is applied during the next maintenance
     *         window unless the <code>ApplyImmediately</code> parameter is enabled for this request. If you are
     *         migrating from Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a
     *         reboot for the change in storage type to take effect.
     *         </p>
     *         <p>
     *         If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *         using Provisioned IOPS to using standard storage, the process can take time. The duration of the
     *         migration depends on several factors such as database load, storage size, storage type (standard or
     *         Provisioned IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations.
     *         Typical migration times are under 24 hours, but the process can take up to several days in some cases.
     *         During the migration, the DB instance is available for use, but might experience performance degradation.
     *         While the migration takes place, nightly backups for the instance are suspended. No other Amazon RDS
     *         operations can take place for the instance, including modifying the instance, rebooting the instance,
     *         deleting the instance, creating a read replica for the instance, and creating a DB snapshot of the
     *         instance.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For RDS for MariaDB, RDS for MySQL, RDS for Oracle, and RDS for PostgreSQL - The value supplied must be
     *         at least 10% greater than the current value. Values that are not at least 10% greater than the existing
     *         value are rounded up so that they are 10% greater than the current value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When you increase the Provisioned IOPS, you must also specify the <code>AllocatedStorage</code>
     *         parameter. You can use the current value for <code>AllocatedStorage</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: Uses existing setting
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The new Provisioned IOPS (I/O operations per second) value for the RDS instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is enabled for this request. If you are migrating from
     * Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a reboot for the change
     * in storage type to take effect.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RDS for MariaDB, RDS for MySQL, RDS for Oracle, and RDS for PostgreSQL - The value supplied must be at least
     * 10% greater than the current value. Values that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you increase the Provisioned IOPS, you must also specify the <code>AllocatedStorage</code> parameter. You
     * can use the current value for <code>AllocatedStorage</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @param iops
     *        The new Provisioned IOPS (I/O operations per second) value for the RDS instance.</p>
     *        <p>
     *        Changing this setting doesn't result in an outage and the change is applied during the next maintenance
     *        window unless the <code>ApplyImmediately</code> parameter is enabled for this request. If you are
     *        migrating from Provisioned IOPS to standard storage, set this value to 0. The DB instance will require a
     *        reboot for the change in storage type to take effect.
     *        </p>
     *        <p>
     *        If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *        using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration
     *        depends on several factors such as database load, storage size, storage type (standard or Provisioned
     *        IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical
     *        migration times are under 24 hours, but the process can take up to several days in some cases. During the
     *        migration, the DB instance is available for use, but might experience performance degradation. While the
     *        migration takes place, nightly backups for the instance are suspended. No other Amazon RDS operations can
     *        take place for the instance, including modifying the instance, rebooting the instance, deleting the
     *        instance, creating a read replica for the instance, and creating a DB snapshot of the instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For RDS for MariaDB, RDS for MySQL, RDS for Oracle, and RDS for PostgreSQL - The value supplied must be at
     *        least 10% greater than the current value. Values that are not at least 10% greater than the existing value
     *        are rounded up so that they are 10% greater than the current value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When you increase the Provisioned IOPS, you must also specify the <code>AllocatedStorage</code> parameter.
     *        You can use the current value for <code>AllocatedStorage</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Uses existing setting
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * The option group to associate the DB instance with.
     * </p>
     * <p>
     * Changing this parameter doesn't result in an outage, with one exception. If the parameter change results in an
     * option group that enables OEM, it can cause a brief period, lasting less than a second, during which new
     * connections are rejected but existing connections aren't interrupted.
     * </p>
     * <p>
     * The change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance after it is associated with a DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param optionGroupName
     *        The option group to associate the DB instance with.</p>
     *        <p>
     *        Changing this parameter doesn't result in an outage, with one exception. If the parameter change results
     *        in an option group that enables OEM, it can cause a brief period, lasting less than a second, during which
     *        new connections are rejected but existing connections aren't interrupted.
     *        </p>
     *        <p>
     *        The change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is enabled for this request.
     *        </p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *        option group, and that option group can't be removed from a DB instance after it is associated with a DB
     *        instance.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The option group to associate the DB instance with.
     * </p>
     * <p>
     * Changing this parameter doesn't result in an outage, with one exception. If the parameter change results in an
     * option group that enables OEM, it can cause a brief period, lasting less than a second, during which new
     * connections are rejected but existing connections aren't interrupted.
     * </p>
     * <p>
     * The change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance after it is associated with a DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return The option group to associate the DB instance with.</p>
     *         <p>
     *         Changing this parameter doesn't result in an outage, with one exception. If the parameter change results
     *         in an option group that enables OEM, it can cause a brief period, lasting less than a second, during
     *         which new connections are rejected but existing connections aren't interrupted.
     *         </p>
     *         <p>
     *         The change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *         parameter is enabled for this request.
     *         </p>
     *         <p>
     *         Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *         option group, and that option group can't be removed from a DB instance after it is associated with a DB
     *         instance.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The option group to associate the DB instance with.
     * </p>
     * <p>
     * Changing this parameter doesn't result in an outage, with one exception. If the parameter change results in an
     * option group that enables OEM, it can cause a brief period, lasting less than a second, during which new
     * connections are rejected but existing connections aren't interrupted.
     * </p>
     * <p>
     * The change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * enabled for this request.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance after it is associated with a DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param optionGroupName
     *        The option group to associate the DB instance with.</p>
     *        <p>
     *        Changing this parameter doesn't result in an outage, with one exception. If the parameter change results
     *        in an option group that enables OEM, it can cause a brief period, lasting less than a second, during which
     *        new connections are rejected but existing connections aren't interrupted.
     *        </p>
     *        <p>
     *        The change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is enabled for this request.
     *        </p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *        option group, and that option group can't be removed from a DB instance after it is associated with a DB
     *        instance.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * The new identifier for the DB instance when renaming a DB instance. When you change the DB instance identifier,
     * an instance reboot occurs immediately if you enable <code>ApplyImmediately</code>, or will occur during the next
     * maintenance window if you disable <code>ApplyImmediately</code>. This value is stored as a lowercase string.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
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
     * The first character must be a letter.
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
     * @param newDBInstanceIdentifier
     *        The new identifier for the DB instance when renaming a DB instance. When you change the DB instance
     *        identifier, an instance reboot occurs immediately if you enable <code>ApplyImmediately</code>, or will
     *        occur during the next maintenance window if you disable <code>ApplyImmediately</code>. This value is
     *        stored as a lowercase string.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
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
     *        The first character must be a letter.
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

    public void setNewDBInstanceIdentifier(String newDBInstanceIdentifier) {
        this.newDBInstanceIdentifier = newDBInstanceIdentifier;
    }

    /**
     * <p>
     * The new identifier for the DB instance when renaming a DB instance. When you change the DB instance identifier,
     * an instance reboot occurs immediately if you enable <code>ApplyImmediately</code>, or will occur during the next
     * maintenance window if you disable <code>ApplyImmediately</code>. This value is stored as a lowercase string.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
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
     * The first character must be a letter.
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
     * @return The new identifier for the DB instance when renaming a DB instance. When you change the DB instance
     *         identifier, an instance reboot occurs immediately if you enable <code>ApplyImmediately</code>, or will
     *         occur during the next maintenance window if you disable <code>ApplyImmediately</code>. This value is
     *         stored as a lowercase string.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     *         </p>
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
     *         The first character must be a letter.
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

    public String getNewDBInstanceIdentifier() {
        return this.newDBInstanceIdentifier;
    }

    /**
     * <p>
     * The new identifier for the DB instance when renaming a DB instance. When you change the DB instance identifier,
     * an instance reboot occurs immediately if you enable <code>ApplyImmediately</code>, or will occur during the next
     * maintenance window if you disable <code>ApplyImmediately</code>. This value is stored as a lowercase string.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
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
     * The first character must be a letter.
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
     * @param newDBInstanceIdentifier
     *        The new identifier for the DB instance when renaming a DB instance. When you change the DB instance
     *        identifier, an instance reboot occurs immediately if you enable <code>ApplyImmediately</code>, or will
     *        occur during the next maintenance window if you disable <code>ApplyImmediately</code>. This value is
     *        stored as a lowercase string.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
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
     *        The first character must be a letter.
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

    public ModifyDBInstanceRequest withNewDBInstanceIdentifier(String newDBInstanceIdentifier) {
        setNewDBInstanceIdentifier(newDBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The storage type to associate with the DB instance.
     * </p>
     * <p>
     * If you specify <code>io1</code>, <code>io2</code>, or <code>gp3</code> you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Valid Values: <code>gp2 | gp3 | io1 | io2 | standard</code>
     * </p>
     * <p>
     * Default: <code>io1</code>, if the <code>Iops</code> parameter is specified. Otherwise, <code>gp2</code>.
     * </p>
     * 
     * @param storageType
     *        The storage type to associate with the DB instance.</p>
     *        <p>
     *        If you specify <code>io1</code>, <code>io2</code>, or <code>gp3</code> you must also include a value for
     *        the <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *        using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration
     *        depends on several factors such as database load, storage size, storage type (standard or Provisioned
     *        IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical
     *        migration times are under 24 hours, but the process can take up to several days in some cases. During the
     *        migration, the DB instance is available for use, but might experience performance degradation. While the
     *        migration takes place, nightly backups for the instance are suspended. No other Amazon RDS operations can
     *        take place for the instance, including modifying the instance, rebooting the instance, deleting the
     *        instance, creating a read replica for the instance, and creating a DB snapshot of the instance.
     *        </p>
     *        <p>
     *        Valid Values: <code>gp2 | gp3 | io1 | io2 | standard</code>
     *        </p>
     *        <p>
     *        Default: <code>io1</code>, if the <code>Iops</code> parameter is specified. Otherwise, <code>gp2</code>.
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The storage type to associate with the DB instance.
     * </p>
     * <p>
     * If you specify <code>io1</code>, <code>io2</code>, or <code>gp3</code> you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Valid Values: <code>gp2 | gp3 | io1 | io2 | standard</code>
     * </p>
     * <p>
     * Default: <code>io1</code>, if the <code>Iops</code> parameter is specified. Otherwise, <code>gp2</code>.
     * </p>
     * 
     * @return The storage type to associate with the DB instance.</p>
     *         <p>
     *         If you specify <code>io1</code>, <code>io2</code>, or <code>gp3</code> you must also include a value for
     *         the <code>Iops</code> parameter.
     *         </p>
     *         <p>
     *         If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *         using Provisioned IOPS to using standard storage, the process can take time. The duration of the
     *         migration depends on several factors such as database load, storage size, storage type (standard or
     *         Provisioned IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations.
     *         Typical migration times are under 24 hours, but the process can take up to several days in some cases.
     *         During the migration, the DB instance is available for use, but might experience performance degradation.
     *         While the migration takes place, nightly backups for the instance are suspended. No other Amazon RDS
     *         operations can take place for the instance, including modifying the instance, rebooting the instance,
     *         deleting the instance, creating a read replica for the instance, and creating a DB snapshot of the
     *         instance.
     *         </p>
     *         <p>
     *         Valid Values: <code>gp2 | gp3 | io1 | io2 | standard</code>
     *         </p>
     *         <p>
     *         Default: <code>io1</code>, if the <code>Iops</code> parameter is specified. Otherwise, <code>gp2</code>.
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The storage type to associate with the DB instance.
     * </p>
     * <p>
     * If you specify <code>io1</code>, <code>io2</code>, or <code>gp3</code> you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a read replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Valid Values: <code>gp2 | gp3 | io1 | io2 | standard</code>
     * </p>
     * <p>
     * Default: <code>io1</code>, if the <code>Iops</code> parameter is specified. Otherwise, <code>gp2</code>.
     * </p>
     * 
     * @param storageType
     *        The storage type to associate with the DB instance.</p>
     *        <p>
     *        If you specify <code>io1</code>, <code>io2</code>, or <code>gp3</code> you must also include a value for
     *        the <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *        using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration
     *        depends on several factors such as database load, storage size, storage type (standard or Provisioned
     *        IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical
     *        migration times are under 24 hours, but the process can take up to several days in some cases. During the
     *        migration, the DB instance is available for use, but might experience performance degradation. While the
     *        migration takes place, nightly backups for the instance are suspended. No other Amazon RDS operations can
     *        take place for the instance, including modifying the instance, rebooting the instance, deleting the
     *        instance, creating a read replica for the instance, and creating a DB snapshot of the instance.
     *        </p>
     *        <p>
     *        Valid Values: <code>gp2 | gp3 | io1 | io2 | standard</code>
     *        </p>
     *        <p>
     *        Default: <code>io1</code>, if the <code>Iops</code> parameter is specified. Otherwise, <code>gp2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which to associate the instance for TDE encryption.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     */

    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return The ARN from the key store with which to associate the instance for TDE encryption.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public String getTdeCredentialArn() {
        return this.tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which to associate the instance for TDE encryption.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withTdeCredentialArn(String tdeCredentialArn) {
        setTdeCredentialArn(tdeCredentialArn);
        return this;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the device.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param tdeCredentialPassword
     *        The password for the given ARN from the key store in order to access the device.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     */

    public void setTdeCredentialPassword(String tdeCredentialPassword) {
        this.tdeCredentialPassword = tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the device.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return The password for the given ARN from the key store in order to access the device.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public String getTdeCredentialPassword() {
        return this.tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the device.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param tdeCredentialPassword
     *        The password for the given ARN from the key store in order to access the device.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withTdeCredentialPassword(String tdeCredentialPassword) {
        setTdeCredentialPassword(tdeCredentialPassword);
        return this;
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

    public ModifyDBInstanceRequest withCACertificateIdentifier(String cACertificateIdentifier) {
        setCACertificateIdentifier(cACertificateIdentifier);
        return this;
    }

    /**
     * <p>
     * The Active Directory directory ID to move the DB instance to. Specify <code>none</code> to remove the instance
     * from its current domain. You must create the domain before this operation. Currently, you can create only Db2,
     * MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances in an Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param domain
     *        The Active Directory directory ID to move the DB instance to. Specify <code>none</code> to remove the
     *        instance from its current domain. You must create the domain before this operation. Currently, you can
     *        create only Db2, MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances in an Active Directory
     *        Domain.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     *        Authentication</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to move the DB instance to. Specify <code>none</code> to remove the instance
     * from its current domain. You must create the domain before this operation. Currently, you can create only Db2,
     * MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances in an Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return The Active Directory directory ID to move the DB instance to. Specify <code>none</code> to remove the
     *         instance from its current domain. You must create the domain before this operation. Currently, you can
     *         create only Db2, MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances in an Active Directory
     *         Domain.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     *         Authentication</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to move the DB instance to. Specify <code>none</code> to remove the instance
     * from its current domain. You must create the domain before this operation. Currently, you can create only Db2,
     * MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances in an Active Directory Domain.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     * Authentication</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param domain
     *        The Active Directory directory ID to move the DB instance to. Specify <code>none</code> to remove the
     *        instance from its current domain. You must create the domain before this operation. Currently, you can
     *        create only Db2, MySQL, Microsoft SQL Server, Oracle, and PostgreSQL DB instances in an Active Directory
     *        Domain.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/kerberos-authentication.html"> Kerberos
     *        Authentication</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDomain(String domain) {
        setDomain(domain);
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

    public ModifyDBInstanceRequest withDomainFqdn(String domainFqdn) {
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

    public ModifyDBInstanceRequest withDomainOu(String domainOu) {
        setDomainOu(domainOu);
        return this;
    }

    /**
     * <p>
     * The ARN for the Secrets Manager secret with the credentials for the user joining the domain.
     * </p>
     * <p>
     * Example: <code>arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456</code>
     * </p>
     * 
     * @param domainAuthSecretArn
     *        The ARN for the Secrets Manager secret with the credentials for the user joining the domain.</p>
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
     * Example: <code>arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456</code>
     * </p>
     * 
     * @return The ARN for the Secrets Manager secret with the credentials for the user joining the domain.</p>
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
     * Example: <code>arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456</code>
     * </p>
     * 
     * @param domainAuthSecretArn
     *        The ARN for the Secrets Manager secret with the credentials for the user joining the domain.</p>
     *        <p>
     *        Example: <code>arn:aws:secretsmanager:region:account-number:secret:myselfmanagedADtestsecret-123456</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDomainAuthSecretArn(String domainAuthSecretArn) {
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

    public ModifyDBInstanceRequest withDomainDnsIps(String... domainDnsIps) {
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

    public ModifyDBInstanceRequest withDomainDnsIps(java.util.Collection<String> domainDnsIps) {
        setDomainDnsIps(domainDnsIps);
        return this;
    }

    /**
     * <p>
     * Specifies whether to copy all tags from the DB instance to snapshots of the DB instance. By default, tags aren't
     * copied.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. Copying tags to snapshots is managed by the DB cluster.
     * Setting this value for an Aurora DB instance has no effect on the DB cluster setting. For more information, see
     * <code>ModifyDBCluster</code>.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        Specifies whether to copy all tags from the DB instance to snapshots of the DB instance. By default, tags
     *        aren't copied.</p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora DB instances. Copying tags to snapshots is managed by the DB
     *        cluster. Setting this value for an Aurora DB instance has no effect on the DB cluster setting. For more
     *        information, see <code>ModifyDBCluster</code>.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specifies whether to copy all tags from the DB instance to snapshots of the DB instance. By default, tags aren't
     * copied.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. Copying tags to snapshots is managed by the DB cluster.
     * Setting this value for an Aurora DB instance has no effect on the DB cluster setting. For more information, see
     * <code>ModifyDBCluster</code>.
     * </p>
     * 
     * @return Specifies whether to copy all tags from the DB instance to snapshots of the DB instance. By default, tags
     *         aren't copied.</p>
     *         <p>
     *         This setting doesn't apply to Amazon Aurora DB instances. Copying tags to snapshots is managed by the DB
     *         cluster. Setting this value for an Aurora DB instance has no effect on the DB cluster setting. For more
     *         information, see <code>ModifyDBCluster</code>.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specifies whether to copy all tags from the DB instance to snapshots of the DB instance. By default, tags aren't
     * copied.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. Copying tags to snapshots is managed by the DB cluster.
     * Setting this value for an Aurora DB instance has no effect on the DB cluster setting. For more information, see
     * <code>ModifyDBCluster</code>.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        Specifies whether to copy all tags from the DB instance to snapshots of the DB instance. By default, tags
     *        aren't copied.</p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora DB instances. Copying tags to snapshots is managed by the DB
     *        cluster. Setting this value for an Aurora DB instance has no effect on the DB cluster setting. For more
     *        information, see <code>ModifyDBCluster</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * Specifies whether to copy all tags from the DB instance to snapshots of the DB instance. By default, tags aren't
     * copied.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. Copying tags to snapshots is managed by the DB cluster.
     * Setting this value for an Aurora DB instance has no effect on the DB cluster setting. For more information, see
     * <code>ModifyDBCluster</code>.
     * </p>
     * 
     * @return Specifies whether to copy all tags from the DB instance to snapshots of the DB instance. By default, tags
     *         aren't copied.</p>
     *         <p>
     *         This setting doesn't apply to Amazon Aurora DB instances. Copying tags to snapshots is managed by the DB
     *         cluster. Setting this value for an Aurora DB instance has no effect on the DB cluster setting. For more
     *         information, see <code>ModifyDBCluster</code>.
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collection of Enhanced Monitoring metrics, specify <code>0</code>.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, set <code>MonitoringInterval</code> to a value other than
     * <code>0</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values: <code>0 | 1 | 5 | 10 | 15 | 30 | 60</code>
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        instance. To disable collection of Enhanced Monitoring metrics, specify <code>0</code>.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, set <code>MonitoringInterval</code> to a value other than
     *        <code>0</code>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Valid Values: <code>0 | 1 | 5 | 10 | 15 | 30 | 60</code>
     *        </p>
     *        <p>
     *        Default: <code>0</code>
     */

    public void setMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collection of Enhanced Monitoring metrics, specify <code>0</code>.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, set <code>MonitoringInterval</code> to a value other than
     * <code>0</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values: <code>0 | 1 | 5 | 10 | 15 | 30 | 60</code>
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * 
     * @return The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *         instance. To disable collection of Enhanced Monitoring metrics, specify <code>0</code>.</p>
     *         <p>
     *         If <code>MonitoringRoleArn</code> is specified, set <code>MonitoringInterval</code> to a value other than
     *         <code>0</code>.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     *         </p>
     *         <p>
     *         Valid Values: <code>0 | 1 | 5 | 10 | 15 | 30 | 60</code>
     *         </p>
     *         <p>
     *         Default: <code>0</code>
     */

    public Integer getMonitoringInterval() {
        return this.monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collection of Enhanced Monitoring metrics, specify <code>0</code>.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, set <code>MonitoringInterval</code> to a value other than
     * <code>0</code>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values: <code>0 | 1 | 5 | 10 | 15 | 30 | 60</code>
     * </p>
     * <p>
     * Default: <code>0</code>
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        instance. To disable collection of Enhanced Monitoring metrics, specify <code>0</code>.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, set <code>MonitoringInterval</code> to a value other than
     *        <code>0</code>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Valid Values: <code>0 | 1 | 5 | 10 | 15 | 30 | 60</code>
     *        </p>
     *        <p>
     *        Default: <code>0</code>
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
     * If you change the <code>DBPortNumber</code> value, your database restarts regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Default:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Aurora - <code>3306</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Db2 - <code>50000</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB - <code>3306</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Microsoft SQL Server - <code>1433</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL - <code>3306</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Oracle - <code>1521</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for PostgreSQL - <code>5432</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RDS for Microsoft SQL Server, the value can't be <code>1234</code>, <code>1434</code>, <code>3260</code>,
     * <code>3343</code>, <code>3389</code>, <code>47001</code>, or <code>49152-49156</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBPortNumber
     *        The port number on which the database accepts connections.</p>
     *        <p>
     *        The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for
     *        options in the option group for the DB instance.
     *        </p>
     *        <p>
     *        If you change the <code>DBPortNumber</code> value, your database restarts regardless of the value of the
     *        <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Default:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Aurora - <code>3306</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Db2 - <code>50000</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MariaDB - <code>3306</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Microsoft SQL Server - <code>1433</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MySQL - <code>3306</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Oracle - <code>1521</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for PostgreSQL - <code>5432</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For RDS for Microsoft SQL Server, the value can't be <code>1234</code>, <code>1434</code>,
     *        <code>3260</code>, <code>3343</code>, <code>3389</code>, <code>47001</code>, or <code>49152-49156</code>.
     *        </p>
     *        </li>
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
     * If you change the <code>DBPortNumber</code> value, your database restarts regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Default:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Aurora - <code>3306</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Db2 - <code>50000</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB - <code>3306</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Microsoft SQL Server - <code>1433</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL - <code>3306</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Oracle - <code>1521</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for PostgreSQL - <code>5432</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RDS for Microsoft SQL Server, the value can't be <code>1234</code>, <code>1434</code>, <code>3260</code>,
     * <code>3343</code>, <code>3389</code>, <code>47001</code>, or <code>49152-49156</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The port number on which the database accepts connections.</p>
     *         <p>
     *         The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for
     *         options in the option group for the DB instance.
     *         </p>
     *         <p>
     *         If you change the <code>DBPortNumber</code> value, your database restarts regardless of the value of the
     *         <code>ApplyImmediately</code> parameter.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Default:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Amazon Aurora - <code>3306</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for Db2 - <code>50000</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for MariaDB - <code>3306</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for Microsoft SQL Server - <code>1433</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for MySQL - <code>3306</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for Oracle - <code>1521</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RDS for PostgreSQL - <code>5432</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For RDS for Microsoft SQL Server, the value can't be <code>1234</code>, <code>1434</code>,
     *         <code>3260</code>, <code>3343</code>, <code>3389</code>, <code>47001</code>, or <code>49152-49156</code>.
     *         </p>
     *         </li>
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
     * If you change the <code>DBPortNumber</code> value, your database restarts regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Default:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Aurora - <code>3306</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Db2 - <code>50000</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MariaDB - <code>3306</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Microsoft SQL Server - <code>1433</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for MySQL - <code>3306</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for Oracle - <code>1521</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * RDS for PostgreSQL - <code>5432</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RDS for Microsoft SQL Server, the value can't be <code>1234</code>, <code>1434</code>, <code>3260</code>,
     * <code>3343</code>, <code>3389</code>, <code>47001</code>, or <code>49152-49156</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBPortNumber
     *        The port number on which the database accepts connections.</p>
     *        <p>
     *        The value of the <code>DBPortNumber</code> parameter must not match any of the port values specified for
     *        options in the option group for the DB instance.
     *        </p>
     *        <p>
     *        If you change the <code>DBPortNumber</code> value, your database restarts regardless of the value of the
     *        <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Default:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Aurora - <code>3306</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Db2 - <code>50000</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MariaDB - <code>3306</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Microsoft SQL Server - <code>1433</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for MySQL - <code>3306</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for Oracle - <code>1521</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RDS for PostgreSQL - <code>5432</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For RDS for Microsoft SQL Server, the value can't be <code>1234</code>, <code>1434</code>,
     *        <code>3260</code>, <code>3343</code>, <code>3389</code>, <code>47001</code>, or <code>49152-49156</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBPortNumber(Integer dBPortNumber) {
        setDBPortNumber(dBPortNumber);
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
     * <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a public
     * subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     * </p>
     * <p>
     * Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
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
     *        <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a
     *        public subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     *        </p>
     *        <p>
     *        Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value
     *        of the <code>ApplyImmediately</code> parameter.
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
     * <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a public
     * subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     * </p>
     * <p>
     * Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
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
     *         <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a
     *         public subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     *         </p>
     *         <p>
     *         Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value
     *         of the <code>ApplyImmediately</code> parameter.
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
     * <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a public
     * subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     * </p>
     * <p>
     * Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
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
     *        <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a
     *        public subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     *        </p>
     *        <p>
     *        Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value
     *        of the <code>ApplyImmediately</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPubliclyAccessible(Boolean publiclyAccessible) {
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
     * <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a public
     * subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     * </p>
     * <p>
     * Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
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
     *         <code>PubliclyAccessible</code> only applies to DB instances in a VPC. The DB instance must be part of a
     *         public subnet and <code>PubliclyAccessible</code> must be enabled for it to be publicly accessible.
     *         </p>
     *         <p>
     *         Changes to the <code>PubliclyAccessible</code> parameter are applied immediately regardless of the value
     *         of the <code>ApplyImmediately</code> parameter.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, see
     * <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">
     * To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than <code>0</code>, supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs.
     *        For example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring
     *        role, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole"
     *        >To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i> </p>
     *        <p>
     *        If <code>MonitoringInterval</code> is set to a value other than <code>0</code>, supply a
     *        <code>MonitoringRoleArn</code> value.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     */

    public void setMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, see
     * <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">
     * To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than <code>0</code>, supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs.
     *         For example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a
     *         monitoring role, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole"
     *         >To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i> </p>
     *         <p>
     *         If <code>MonitoringInterval</code> is set to a value other than <code>0</code>, supply a
     *         <code>MonitoringRoleArn</code> value.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public String getMonitoringRoleArn() {
        return this.monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, see
     * <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole">
     * To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than <code>0</code>, supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to Amazon CloudWatch Logs.
     *        For example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring
     *        role, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html#USER_Monitoring.OS.IAMRole"
     *        >To create an IAM role for Amazon RDS Enhanced Monitoring</a> in the <i>Amazon RDS User Guide.</i> </p>
     *        <p>
     *        If <code>MonitoringInterval</code> is set to a value other than <code>0</code>, supply a
     *        <code>MonitoringRoleArn</code> value.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
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

    public ModifyDBInstanceRequest withDomainIAMRoleName(String domainIAMRoleName) {
        setDomainIAMRoleName(domainIAMRoleName);
        return this;
    }

    /**
     * <p>
     * Specifies whether to remove the DB instance from the Active Directory domain.
     * </p>
     * 
     * @param disableDomain
     *        Specifies whether to remove the DB instance from the Active Directory domain.
     */

    public void setDisableDomain(Boolean disableDomain) {
        this.disableDomain = disableDomain;
    }

    /**
     * <p>
     * Specifies whether to remove the DB instance from the Active Directory domain.
     * </p>
     * 
     * @return Specifies whether to remove the DB instance from the Active Directory domain.
     */

    public Boolean getDisableDomain() {
        return this.disableDomain;
    }

    /**
     * <p>
     * Specifies whether to remove the DB instance from the Active Directory domain.
     * </p>
     * 
     * @param disableDomain
     *        Specifies whether to remove the DB instance from the Active Directory domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDisableDomain(Boolean disableDomain) {
        setDisableDomain(disableDomain);
        return this;
    }

    /**
     * <p>
     * Specifies whether to remove the DB instance from the Active Directory domain.
     * </p>
     * 
     * @return Specifies whether to remove the DB instance from the Active Directory domain.
     */

    public Boolean isDisableDomain() {
        return this.disableDomain;
    }

    /**
     * <p>
     * The order of priority in which an Aurora Replica is promoted to the primary instance after a failure of the
     * existing primary instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.AuroraHighAvailability.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * <p>
     * Valid Values: <code>0 - 15</code>
     * </p>
     * 
     * @param promotionTier
     *        The order of priority in which an Aurora Replica is promoted to the primary instance after a failure of
     *        the existing primary instance. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.AuroraHighAvailability.html#Aurora.Managing.FaultTolerance"
     *        > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Default: <code>1</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>0 - 15</code>
     */

    public void setPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
    }

    /**
     * <p>
     * The order of priority in which an Aurora Replica is promoted to the primary instance after a failure of the
     * existing primary instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.AuroraHighAvailability.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * <p>
     * Valid Values: <code>0 - 15</code>
     * </p>
     * 
     * @return The order of priority in which an Aurora Replica is promoted to the primary instance after a failure of
     *         the existing primary instance. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.AuroraHighAvailability.html#Aurora.Managing.FaultTolerance"
     *         > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     *         </p>
     *         <p>
     *         Default: <code>1</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>0 - 15</code>
     */

    public Integer getPromotionTier() {
        return this.promotionTier;
    }

    /**
     * <p>
     * The order of priority in which an Aurora Replica is promoted to the primary instance after a failure of the
     * existing primary instance. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.AuroraHighAvailability.html#Aurora.Managing.FaultTolerance"
     * > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * <p>
     * Valid Values: <code>0 - 15</code>
     * </p>
     * 
     * @param promotionTier
     *        The order of priority in which an Aurora Replica is promoted to the primary instance after a failure of
     *        the existing primary instance. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Concepts.AuroraHighAvailability.html#Aurora.Managing.FaultTolerance"
     *        > Fault Tolerance for an Aurora DB Cluster</a> in the <i>Amazon Aurora User Guide</i>.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Default: <code>1</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>0 - 15</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPromotionTier(Integer promotionTier) {
        setPromotionTier(promotionTier);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts to
     * database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora. Mapping Amazon Web Services IAM accounts to database accounts is
     * managed by the DB cluster.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts
     *        to database accounts. By default, mapping isn't enabled.</p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora. Mapping Amazon Web Services IAM accounts to database accounts
     *        is managed by the DB cluster.
     *        </p>
     *        <p>
     *        For more information about IAM database authentication, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *        Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
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
     * This setting doesn't apply to Amazon Aurora. Mapping Amazon Web Services IAM accounts to database accounts is
     * managed by the DB cluster.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts
     *         to database accounts. By default, mapping isn't enabled.</p>
     *         <p>
     *         This setting doesn't apply to Amazon Aurora. Mapping Amazon Web Services IAM accounts to database
     *         accounts is managed by the DB cluster.
     *         </p>
     *         <p>
     *         For more information about IAM database authentication, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *         Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
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
     * This setting doesn't apply to Amazon Aurora. Mapping Amazon Web Services IAM accounts to database accounts is
     * managed by the DB cluster.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts
     *        to database accounts. By default, mapping isn't enabled.</p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora. Mapping Amazon Web Services IAM accounts to database accounts
     *        is managed by the DB cluster.
     *        </p>
     *        <p>
     *        For more information about IAM database authentication, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *        Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        setEnableIAMDatabaseAuthentication(enableIAMDatabaseAuthentication);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts to
     * database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora. Mapping Amazon Web Services IAM accounts to database accounts is
     * managed by the DB cluster.
     * </p>
     * <p>
     * For more information about IAM database authentication, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return Specifies whether to enable mapping of Amazon Web Services Identity and Access Management (IAM) accounts
     *         to database accounts. By default, mapping isn't enabled.</p>
     *         <p>
     *         This setting doesn't apply to Amazon Aurora. Mapping Amazon Web Services IAM accounts to database
     *         accounts is managed by the DB cluster.
     *         </p>
     *         <p>
     *         For more information about IAM database authentication, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     *         Authentication for MySQL and PostgreSQL</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public Boolean isEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * Specifies whether to enable Performance Insights for the DB instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param enablePerformanceInsights
     *        Specifies whether to enable Performance Insights for the DB instance.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *        Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     */

    public void setEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        this.enablePerformanceInsights = enablePerformanceInsights;
    }

    /**
     * <p>
     * Specifies whether to enable Performance Insights for the DB instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return Specifies whether to enable Performance Insights for the DB instance.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *         Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public Boolean getEnablePerformanceInsights() {
        return this.enablePerformanceInsights;
    }

    /**
     * <p>
     * Specifies whether to enable Performance Insights for the DB instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param enablePerformanceInsights
     *        Specifies whether to enable Performance Insights for the DB instance.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *        Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        setEnablePerformanceInsights(enablePerformanceInsights);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable Performance Insights for the DB instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon Performance
     * Insights</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return Specifies whether to enable Performance Insights for the DB instance.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_PerfInsights.html">Using Amazon
     *         Performance Insights</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
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
     * This setting doesn't apply to RDS Custom DB instances.
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
     *        This setting doesn't apply to RDS Custom DB instances.
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
     * This setting doesn't apply to RDS Custom DB instances.
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
     *         This setting doesn't apply to RDS Custom DB instances.
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
     * This setting doesn't apply to RDS Custom DB instances.
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
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
        setPerformanceInsightsKMSKeyId(performanceInsightsKMSKeyId);
        return this;
    }

    /**
     * <p>
     * The number of days to retain Performance Insights data.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>month</i> * 31, where <i>month</i> is a number of months from 1-23. Examples: <code>93</code> (3 months * 31),
     * <code>341</code> (11 months * 31), <code>589</code> (19 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>731</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>7</code> days
     * </p>
     * <p>
     * If you specify a retention period that isn't valid, such as <code>94</code>, Amazon RDS returns an error.
     * </p>
     * 
     * @param performanceInsightsRetentionPeriod
     *        The number of days to retain Performance Insights data.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>month</i> * 31, where <i>month</i> is a number of months from 1-23. Examples: <code>93</code> (3 months
     *        * 31), <code>341</code> (11 months * 31), <code>589</code> (19 months * 31)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>731</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>7</code> days
     *        </p>
     *        <p>
     *        If you specify a retention period that isn't valid, such as <code>94</code>, Amazon RDS returns an error.
     */

    public void setPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
        this.performanceInsightsRetentionPeriod = performanceInsightsRetentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain Performance Insights data.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>month</i> * 31, where <i>month</i> is a number of months from 1-23. Examples: <code>93</code> (3 months * 31),
     * <code>341</code> (11 months * 31), <code>589</code> (19 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>731</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>7</code> days
     * </p>
     * <p>
     * If you specify a retention period that isn't valid, such as <code>94</code>, Amazon RDS returns an error.
     * </p>
     * 
     * @return The number of days to retain Performance Insights data.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     *         </p>
     *         <p>
     *         Valid Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>7</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>month</i> * 31, where <i>month</i> is a number of months from 1-23. Examples: <code>93</code> (3
     *         months * 31), <code>341</code> (11 months * 31), <code>589</code> (19 months * 31)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>731</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>7</code> days
     *         </p>
     *         <p>
     *         If you specify a retention period that isn't valid, such as <code>94</code>, Amazon RDS returns an error.
     */

    public Integer getPerformanceInsightsRetentionPeriod() {
        return this.performanceInsightsRetentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain Performance Insights data.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>month</i> * 31, where <i>month</i> is a number of months from 1-23. Examples: <code>93</code> (3 months * 31),
     * <code>341</code> (11 months * 31), <code>589</code> (19 months * 31)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>731</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>7</code> days
     * </p>
     * <p>
     * If you specify a retention period that isn't valid, such as <code>94</code>, Amazon RDS returns an error.
     * </p>
     * 
     * @param performanceInsightsRetentionPeriod
     *        The number of days to retain Performance Insights data.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>month</i> * 31, where <i>month</i> is a number of months from 1-23. Examples: <code>93</code> (3 months
     *        * 31), <code>341</code> (11 months * 31), <code>589</code> (19 months * 31)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>731</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>7</code> days
     *        </p>
     *        <p>
     *        If you specify a retention period that isn't valid, such as <code>94</code>, Amazon RDS returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withPerformanceInsightsRetentionPeriod(Integer performanceInsightsRetentionPeriod) {
        setPerformanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The log types to be enabled for export to CloudWatch Logs for a specific DB instance.
     * </p>
     * <p>
     * A change to the <code>CloudwatchLogsExportConfiguration</code> parameter is always applied to the DB instance
     * immediately. Therefore, the <code>ApplyImmediately</code> parameter has no effect.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param cloudwatchLogsExportConfiguration
     *        The log types to be enabled for export to CloudWatch Logs for a specific DB instance.</p>
     *        <p>
     *        A change to the <code>CloudwatchLogsExportConfiguration</code> parameter is always applied to the DB
     *        instance immediately. Therefore, the <code>ApplyImmediately</code> parameter has no effect.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     */

    public void setCloudwatchLogsExportConfiguration(CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration) {
        this.cloudwatchLogsExportConfiguration = cloudwatchLogsExportConfiguration;
    }

    /**
     * <p>
     * The log types to be enabled for export to CloudWatch Logs for a specific DB instance.
     * </p>
     * <p>
     * A change to the <code>CloudwatchLogsExportConfiguration</code> parameter is always applied to the DB instance
     * immediately. Therefore, the <code>ApplyImmediately</code> parameter has no effect.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return The log types to be enabled for export to CloudWatch Logs for a specific DB instance.</p>
     *         <p>
     *         A change to the <code>CloudwatchLogsExportConfiguration</code> parameter is always applied to the DB
     *         instance immediately. Therefore, the <code>ApplyImmediately</code> parameter has no effect.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public CloudwatchLogsExportConfiguration getCloudwatchLogsExportConfiguration() {
        return this.cloudwatchLogsExportConfiguration;
    }

    /**
     * <p>
     * The log types to be enabled for export to CloudWatch Logs for a specific DB instance.
     * </p>
     * <p>
     * A change to the <code>CloudwatchLogsExportConfiguration</code> parameter is always applied to the DB instance
     * immediately. Therefore, the <code>ApplyImmediately</code> parameter has no effect.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param cloudwatchLogsExportConfiguration
     *        The log types to be enabled for export to CloudWatch Logs for a specific DB instance.</p>
     *        <p>
     *        A change to the <code>CloudwatchLogsExportConfiguration</code> parameter is always applied to the DB
     *        instance immediately. Therefore, the <code>ApplyImmediately</code> parameter has no effect.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withCloudwatchLogsExportConfiguration(CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration) {
        setCloudwatchLogsExportConfiguration(cloudwatchLogsExportConfiguration);
        return this;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return The number of CPU cores and the number of threads per core for the DB instance class of the DB
     *         instance.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
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
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB
     *        instance.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
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
     * This setting doesn't apply to RDS Custom DB instances.
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
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withProcessorFeatures(ProcessorFeature... processorFeatures) {
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
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param processorFeatures
     *        The number of CPU cores and the number of threads per core for the DB instance class of the DB
     *        instance.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param useDefaultProcessorFeatures
     *        Specifies whether the DB instance class of the DB instance uses its default processor features.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     */

    public void setUseDefaultProcessorFeatures(Boolean useDefaultProcessorFeatures) {
        this.useDefaultProcessorFeatures = useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * Specifies whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return Specifies whether the DB instance class of the DB instance uses its default processor features.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public Boolean getUseDefaultProcessorFeatures() {
        return this.useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * Specifies whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param useDefaultProcessorFeatures
     *        Specifies whether the DB instance class of the DB instance uses its default processor features.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withUseDefaultProcessorFeatures(Boolean useDefaultProcessorFeatures) {
        setUseDefaultProcessorFeatures(useDefaultProcessorFeatures);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance class of the DB instance uses its default processor features.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return Specifies whether the DB instance class of the DB instance uses its default processor features.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public Boolean isUseDefaultProcessorFeatures() {
        return this.useDefaultProcessorFeatures;
    }

    /**
     * <p>
     * Specifies whether the DB instance has deletion protection enabled. The database can't be deleted when deletion
     * protection is enabled. By default, deletion protection isn't enabled. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     * Instance</a>.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. You can enable or disable deletion protection for the
     * DB cluster. For more information, see <code>ModifyDBCluster</code>. DB instances in a DB cluster can be deleted
     * even when deletion protection is enabled for the DB cluster.
     * </p>
     * 
     * @param deletionProtection
     *        Specifies whether the DB instance has deletion protection enabled. The database can't be deleted when
     *        deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see
     *        <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *        Instance</a>.</p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora DB instances. You can enable or disable deletion protection
     *        for the DB cluster. For more information, see <code>ModifyDBCluster</code>. DB instances in a DB cluster
     *        can be deleted even when deletion protection is enabled for the DB cluster.
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
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. You can enable or disable deletion protection for the
     * DB cluster. For more information, see <code>ModifyDBCluster</code>. DB instances in a DB cluster can be deleted
     * even when deletion protection is enabled for the DB cluster.
     * </p>
     * 
     * @return Specifies whether the DB instance has deletion protection enabled. The database can't be deleted when
     *         deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see
     *         <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *         Instance</a>.</p>
     *         <p>
     *         This setting doesn't apply to Amazon Aurora DB instances. You can enable or disable deletion protection
     *         for the DB cluster. For more information, see <code>ModifyDBCluster</code>. DB instances in a DB cluster
     *         can be deleted even when deletion protection is enabled for the DB cluster.
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
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. You can enable or disable deletion protection for the
     * DB cluster. For more information, see <code>ModifyDBCluster</code>. DB instances in a DB cluster can be deleted
     * even when deletion protection is enabled for the DB cluster.
     * </p>
     * 
     * @param deletionProtection
     *        Specifies whether the DB instance has deletion protection enabled. The database can't be deleted when
     *        deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see
     *        <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *        Instance</a>.</p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora DB instances. You can enable or disable deletion protection
     *        for the DB cluster. For more information, see <code>ModifyDBCluster</code>. DB instances in a DB cluster
     *        can be deleted even when deletion protection is enabled for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDeletionProtection(Boolean deletionProtection) {
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
     * <p>
     * This setting doesn't apply to Amazon Aurora DB instances. You can enable or disable deletion protection for the
     * DB cluster. For more information, see <code>ModifyDBCluster</code>. DB instances in a DB cluster can be deleted
     * even when deletion protection is enabled for the DB cluster.
     * </p>
     * 
     * @return Specifies whether the DB instance has deletion protection enabled. The database can't be deleted when
     *         deletion protection is enabled. By default, deletion protection isn't enabled. For more information, see
     *         <a href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"> Deleting a DB
     *         Instance</a>.</p>
     *         <p>
     *         This setting doesn't apply to Amazon Aurora DB instances. You can enable or disable deletion protection
     *         for the DB cluster. For more information, see <code>ModifyDBCluster</code>. DB instances in a DB cluster
     *         can be deleted even when deletion protection is enabled for the DB cluster.
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
     * This setting doesn't apply to RDS Custom DB instances.
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
     *        This setting doesn't apply to RDS Custom DB instances.
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
     * This setting doesn't apply to RDS Custom DB instances.
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
     *         This setting doesn't apply to RDS Custom DB instances.
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
     * This setting doesn't apply to RDS Custom DB instances.
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
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withMaxAllocatedStorage(Integer maxAllocatedStorage) {
        setMaxAllocatedStorage(maxAllocatedStorage);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.
     * </p>
     * <p>
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not updated
     * until the DB instance is restarted.
     * </p>
     * <important>
     * <p>
     * Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     * </p>
     * </important>
     * <p>
     * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB engine to
     * rotate your SSL/TLS certificate:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param certificateRotationRestart
     *        Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.</p>
     *        <p>
     *        By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not
     *        updated until the DB instance is restarted.
     *        </p>
     *        <important>
     *        <p>
     *        Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     *        </p>
     *        </important>
     *        <p>
     *        If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB
     *        engine to rotate your SSL/TLS certificate:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     *        Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     *        Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     */

    public void setCertificateRotationRestart(Boolean certificateRotationRestart) {
        this.certificateRotationRestart = certificateRotationRestart;
    }

    /**
     * <p>
     * Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.
     * </p>
     * <p>
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not updated
     * until the DB instance is restarted.
     * </p>
     * <important>
     * <p>
     * Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     * </p>
     * </important>
     * <p>
     * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB engine to
     * rotate your SSL/TLS certificate:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.</p>
     *         <p>
     *         By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not
     *         updated until the DB instance is restarted.
     *         </p>
     *         <important>
     *         <p>
     *         Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     *         </p>
     *         </important>
     *         <p>
     *         If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB
     *         engine to rotate your SSL/TLS certificate:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     *         Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html"
     *         > Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public Boolean getCertificateRotationRestart() {
        return this.certificateRotationRestart;
    }

    /**
     * <p>
     * Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.
     * </p>
     * <p>
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not updated
     * until the DB instance is restarted.
     * </p>
     * <important>
     * <p>
     * Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     * </p>
     * </important>
     * <p>
     * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB engine to
     * rotate your SSL/TLS certificate:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param certificateRotationRestart
     *        Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.</p>
     *        <p>
     *        By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not
     *        updated until the DB instance is restarted.
     *        </p>
     *        <important>
     *        <p>
     *        Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     *        </p>
     *        </important>
     *        <p>
     *        If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB
     *        engine to rotate your SSL/TLS certificate:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     *        Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     *        Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withCertificateRotationRestart(Boolean certificateRotationRestart) {
        setCertificateRotationRestart(certificateRotationRestart);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.
     * </p>
     * <p>
     * By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not updated
     * until the DB instance is restarted.
     * </p>
     * <important>
     * <p>
     * Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     * </p>
     * </important>
     * <p>
     * If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB engine to
     * rotate your SSL/TLS certificate:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     * Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return Specifies whether the DB instance is restarted when you rotate your SSL/TLS certificate.</p>
     *         <p>
     *         By default, the DB instance is restarted when you rotate your SSL/TLS certificate. The certificate is not
     *         updated until the DB instance is restarted.
     *         </p>
     *         <important>
     *         <p>
     *         Set this parameter only if you are <i>not</i> using SSL/TLS to connect to the DB instance.
     *         </p>
     *         </important>
     *         <p>
     *         If you are using SSL/TLS to connect to the DB instance, follow the appropriate instructions for your DB
     *         engine to rotate your SSL/TLS certificate:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For more information about rotating your SSL/TLS certificate for RDS DB engines, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL-certificate-rotation.html">
     *         Rotating Your SSL/TLS Certificate.</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For more information about rotating your SSL/TLS certificate for Aurora DB engines, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.SSL-certificate-rotation.html"
     *         > Rotating Your SSL/TLS Certificate</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public Boolean isCertificateRotationRestart() {
        return this.certificateRotationRestart;
    }

    /**
     * <p>
     * A value that sets the open mode of a replica database to either mounted or read-only.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter is only supported for Oracle DB instances.
     * </p>
     * </note>
     * <p>
     * Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     * cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the
     * mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param replicaMode
     *        A value that sets the open mode of a replica database to either mounted or read-only.</p> <note>
     *        <p>
     *        Currently, this parameter is only supported for Oracle DB instances.
     *        </p>
     *        </note>
     *        <p>
     *        Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     *        cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information
     *        to the mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a
     *        read-only workload. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with
     *        Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @see ReplicaMode
     */

    public void setReplicaMode(String replicaMode) {
        this.replicaMode = replicaMode;
    }

    /**
     * <p>
     * A value that sets the open mode of a replica database to either mounted or read-only.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter is only supported for Oracle DB instances.
     * </p>
     * </note>
     * <p>
     * Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     * cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the
     * mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return A value that sets the open mode of a replica database to either mounted or read-only.</p> <note>
     *         <p>
     *         Currently, this parameter is only supported for Oracle DB instances.
     *         </p>
     *         </note>
     *         <p>
     *         Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     *         cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit
     *         information to the mounted replica. Because it doesn't accept user connections, a mounted replica can't
     *         serve a read-only workload. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with
     *         Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     * @see ReplicaMode
     */

    public String getReplicaMode() {
        return this.replicaMode;
    }

    /**
     * <p>
     * A value that sets the open mode of a replica database to either mounted or read-only.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter is only supported for Oracle DB instances.
     * </p>
     * </note>
     * <p>
     * Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     * cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the
     * mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param replicaMode
     *        A value that sets the open mode of a replica database to either mounted or read-only.</p> <note>
     *        <p>
     *        Currently, this parameter is only supported for Oracle DB instances.
     *        </p>
     *        </note>
     *        <p>
     *        Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     *        cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information
     *        to the mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a
     *        read-only workload. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with
     *        Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaMode
     */

    public ModifyDBInstanceRequest withReplicaMode(String replicaMode) {
        setReplicaMode(replicaMode);
        return this;
    }

    /**
     * <p>
     * A value that sets the open mode of a replica database to either mounted or read-only.
     * </p>
     * <note>
     * <p>
     * Currently, this parameter is only supported for Oracle DB instances.
     * </p>
     * </note>
     * <p>
     * Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     * cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information to the
     * mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a read-only workload.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with Oracle Read
     * Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param replicaMode
     *        A value that sets the open mode of a replica database to either mounted or read-only.</p> <note>
     *        <p>
     *        Currently, this parameter is only supported for Oracle DB instances.
     *        </p>
     *        </note>
     *        <p>
     *        Mounted DB replicas are included in Oracle Enterprise Edition. The main use case for mounted replicas is
     *        cross-Region disaster recovery. The primary database doesn't use Active Data Guard to transmit information
     *        to the mounted replica. Because it doesn't accept user connections, a mounted replica can't serve a
     *        read-only workload. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-read-replicas.html">Working with
     *        Oracle Read Replicas for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicaMode
     */

    public ModifyDBInstanceRequest withReplicaMode(ReplicaMode replicaMode) {
        this.replicaMode = replicaMode.toString();
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

    public ModifyDBInstanceRequest withEnableCustomerOwnedIp(Boolean enableCustomerOwnedIp) {
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
     * The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param awsBackupRecoveryPointArn
     *        The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     */

    public void setAwsBackupRecoveryPointArn(String awsBackupRecoveryPointArn) {
        this.awsBackupRecoveryPointArn = awsBackupRecoveryPointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup.</p>
     *         <p>
     *         This setting doesn't apply to RDS Custom DB instances.
     */

    public String getAwsBackupRecoveryPointArn() {
        return this.awsBackupRecoveryPointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup.
     * </p>
     * <p>
     * This setting doesn't apply to RDS Custom DB instances.
     * </p>
     * 
     * @param awsBackupRecoveryPointArn
     *        The Amazon Resource Name (ARN) of the recovery point in Amazon Web Services Backup.</p>
     *        <p>
     *        This setting doesn't apply to RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withAwsBackupRecoveryPointArn(String awsBackupRecoveryPointArn) {
        setAwsBackupRecoveryPointArn(awsBackupRecoveryPointArn);
        return this;
    }

    /**
     * <p>
     * The automation mode of the RDS Custom DB instance. If <code>full</code>, the DB instance automates monitoring and
     * instance recovery. If <code>all paused</code>, the instance pauses automation for the duration set by
     * <code>ResumeFullAutomationModeMinutes</code>.
     * </p>
     * 
     * @param automationMode
     *        The automation mode of the RDS Custom DB instance. If <code>full</code>, the DB instance automates
     *        monitoring and instance recovery. If <code>all paused</code>, the instance pauses automation for the
     *        duration set by <code>ResumeFullAutomationModeMinutes</code>.
     * @see AutomationMode
     */

    public void setAutomationMode(String automationMode) {
        this.automationMode = automationMode;
    }

    /**
     * <p>
     * The automation mode of the RDS Custom DB instance. If <code>full</code>, the DB instance automates monitoring and
     * instance recovery. If <code>all paused</code>, the instance pauses automation for the duration set by
     * <code>ResumeFullAutomationModeMinutes</code>.
     * </p>
     * 
     * @return The automation mode of the RDS Custom DB instance. If <code>full</code>, the DB instance automates
     *         monitoring and instance recovery. If <code>all paused</code>, the instance pauses automation for the
     *         duration set by <code>ResumeFullAutomationModeMinutes</code>.
     * @see AutomationMode
     */

    public String getAutomationMode() {
        return this.automationMode;
    }

    /**
     * <p>
     * The automation mode of the RDS Custom DB instance. If <code>full</code>, the DB instance automates monitoring and
     * instance recovery. If <code>all paused</code>, the instance pauses automation for the duration set by
     * <code>ResumeFullAutomationModeMinutes</code>.
     * </p>
     * 
     * @param automationMode
     *        The automation mode of the RDS Custom DB instance. If <code>full</code>, the DB instance automates
     *        monitoring and instance recovery. If <code>all paused</code>, the instance pauses automation for the
     *        duration set by <code>ResumeFullAutomationModeMinutes</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationMode
     */

    public ModifyDBInstanceRequest withAutomationMode(String automationMode) {
        setAutomationMode(automationMode);
        return this;
    }

    /**
     * <p>
     * The automation mode of the RDS Custom DB instance. If <code>full</code>, the DB instance automates monitoring and
     * instance recovery. If <code>all paused</code>, the instance pauses automation for the duration set by
     * <code>ResumeFullAutomationModeMinutes</code>.
     * </p>
     * 
     * @param automationMode
     *        The automation mode of the RDS Custom DB instance. If <code>full</code>, the DB instance automates
     *        monitoring and instance recovery. If <code>all paused</code>, the instance pauses automation for the
     *        duration set by <code>ResumeFullAutomationModeMinutes</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutomationMode
     */

    public ModifyDBInstanceRequest withAutomationMode(AutomationMode automationMode) {
        this.automationMode = automationMode.toString();
        return this;
    }

    /**
     * <p>
     * The number of minutes to pause the automation. When the time period ends, RDS Custom resumes full automation.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be at least 60.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be no more than 1,440.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resumeFullAutomationModeMinutes
     *        The number of minutes to pause the automation. When the time period ends, RDS Custom resumes full
     *        automation.</p>
     *        <p>
     *        Default: <code>60</code>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be at least 60.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be no more than 1,440.
     *        </p>
     *        </li>
     */

    public void setResumeFullAutomationModeMinutes(Integer resumeFullAutomationModeMinutes) {
        this.resumeFullAutomationModeMinutes = resumeFullAutomationModeMinutes;
    }

    /**
     * <p>
     * The number of minutes to pause the automation. When the time period ends, RDS Custom resumes full automation.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be at least 60.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be no more than 1,440.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of minutes to pause the automation. When the time period ends, RDS Custom resumes full
     *         automation.</p>
     *         <p>
     *         Default: <code>60</code>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be at least 60.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be no more than 1,440.
     *         </p>
     *         </li>
     */

    public Integer getResumeFullAutomationModeMinutes() {
        return this.resumeFullAutomationModeMinutes;
    }

    /**
     * <p>
     * The number of minutes to pause the automation. When the time period ends, RDS Custom resumes full automation.
     * </p>
     * <p>
     * Default: <code>60</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be at least 60.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be no more than 1,440.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resumeFullAutomationModeMinutes
     *        The number of minutes to pause the automation. When the time period ends, RDS Custom resumes full
     *        automation.</p>
     *        <p>
     *        Default: <code>60</code>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be at least 60.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be no more than 1,440.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withResumeFullAutomationModeMinutes(Integer resumeFullAutomationModeMinutes) {
        setResumeFullAutomationModeMinutes(resumeFullAutomationModeMinutes);
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
     * Valid Values: <code>IPV4 | DUAL</code>
     * </p>
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
     *        Valid Values: <code>IPV4 | DUAL</code>
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
     * Valid Values: <code>IPV4 | DUAL</code>
     * </p>
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
     *         Valid Values: <code>IPV4 | DUAL</code>
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
     * Valid Values: <code>IPV4 | DUAL</code>
     * </p>
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
     *        Valid Values: <code>IPV4 | DUAL</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withNetworkType(String networkType) {
        setNetworkType(networkType);
        return this;
    }

    /**
     * <p>
     * The storage throughput value for the DB instance.
     * </p>
     * <p>
     * This setting applies only to the <code>gp3</code> storage type.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     * </p>
     * 
     * @param storageThroughput
     *        The storage throughput value for the DB instance.</p>
     *        <p>
     *        This setting applies only to the <code>gp3</code> storage type.
     *        </p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     */

    public void setStorageThroughput(Integer storageThroughput) {
        this.storageThroughput = storageThroughput;
    }

    /**
     * <p>
     * The storage throughput value for the DB instance.
     * </p>
     * <p>
     * This setting applies only to the <code>gp3</code> storage type.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     * </p>
     * 
     * @return The storage throughput value for the DB instance.</p>
     *         <p>
     *         This setting applies only to the <code>gp3</code> storage type.
     *         </p>
     *         <p>
     *         This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     */

    public Integer getStorageThroughput() {
        return this.storageThroughput;
    }

    /**
     * <p>
     * The storage throughput value for the DB instance.
     * </p>
     * <p>
     * This setting applies only to the <code>gp3</code> storage type.
     * </p>
     * <p>
     * This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     * </p>
     * 
     * @param storageThroughput
     *        The storage throughput value for the DB instance.</p>
     *        <p>
     *        This setting applies only to the <code>gp3</code> storage type.
     *        </p>
     *        <p>
     *        This setting doesn't apply to Amazon Aurora or RDS Custom DB instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withStorageThroughput(Integer storageThroughput) {
        setStorageThroughput(storageThroughput);
        return this;
    }

    /**
     * <p>
     * Specifies whether to manage the master user password with Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * If the DB instance doesn't manage the master user password with Amazon Web Services Secrets Manager, you can turn
     * on this management. In this case, you can't specify <code>MasterUserPassword</code>.
     * </p>
     * <p>
     * If the DB instance already manages the master user password with Amazon Web Services Secrets Manager, and you
     * specify that the master user password is not managed with Amazon Web Services Secrets Manager, then you must
     * specify <code>MasterUserPassword</code>. In this case, Amazon RDS deletes the secret and uses the new password
     * for the master user specified by <code>MasterUserPassword</code>.
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
     *        Specifies whether to manage the master user password with Amazon Web Services Secrets Manager.</p>
     *        <p>
     *        If the DB instance doesn't manage the master user password with Amazon Web Services Secrets Manager, you
     *        can turn on this management. In this case, you can't specify <code>MasterUserPassword</code>.
     *        </p>
     *        <p>
     *        If the DB instance already manages the master user password with Amazon Web Services Secrets Manager, and
     *        you specify that the master user password is not managed with Amazon Web Services Secrets Manager, then
     *        you must specify <code>MasterUserPassword</code>. In this case, Amazon RDS deletes the secret and uses the
     *        new password for the master user specified by <code>MasterUserPassword</code>.
     *        </p>
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
     * Specifies whether to manage the master user password with Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * If the DB instance doesn't manage the master user password with Amazon Web Services Secrets Manager, you can turn
     * on this management. In this case, you can't specify <code>MasterUserPassword</code>.
     * </p>
     * <p>
     * If the DB instance already manages the master user password with Amazon Web Services Secrets Manager, and you
     * specify that the master user password is not managed with Amazon Web Services Secrets Manager, then you must
     * specify <code>MasterUserPassword</code>. In this case, Amazon RDS deletes the secret and uses the new password
     * for the master user specified by <code>MasterUserPassword</code>.
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
     * @return Specifies whether to manage the master user password with Amazon Web Services Secrets Manager.</p>
     *         <p>
     *         If the DB instance doesn't manage the master user password with Amazon Web Services Secrets Manager, you
     *         can turn on this management. In this case, you can't specify <code>MasterUserPassword</code>.
     *         </p>
     *         <p>
     *         If the DB instance already manages the master user password with Amazon Web Services Secrets Manager, and
     *         you specify that the master user password is not managed with Amazon Web Services Secrets Manager, then
     *         you must specify <code>MasterUserPassword</code>. In this case, Amazon RDS deletes the secret and uses
     *         the new password for the master user specified by <code>MasterUserPassword</code>.
     *         </p>
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
     * Specifies whether to manage the master user password with Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * If the DB instance doesn't manage the master user password with Amazon Web Services Secrets Manager, you can turn
     * on this management. In this case, you can't specify <code>MasterUserPassword</code>.
     * </p>
     * <p>
     * If the DB instance already manages the master user password with Amazon Web Services Secrets Manager, and you
     * specify that the master user password is not managed with Amazon Web Services Secrets Manager, then you must
     * specify <code>MasterUserPassword</code>. In this case, Amazon RDS deletes the secret and uses the new password
     * for the master user specified by <code>MasterUserPassword</code>.
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
     *        Specifies whether to manage the master user password with Amazon Web Services Secrets Manager.</p>
     *        <p>
     *        If the DB instance doesn't manage the master user password with Amazon Web Services Secrets Manager, you
     *        can turn on this management. In this case, you can't specify <code>MasterUserPassword</code>.
     *        </p>
     *        <p>
     *        If the DB instance already manages the master user password with Amazon Web Services Secrets Manager, and
     *        you specify that the master user password is not managed with Amazon Web Services Secrets Manager, then
     *        you must specify <code>MasterUserPassword</code>. In this case, Amazon RDS deletes the secret and uses the
     *        new password for the master user specified by <code>MasterUserPassword</code>.
     *        </p>
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

    public ModifyDBInstanceRequest withManageMasterUserPassword(Boolean manageMasterUserPassword) {
        setManageMasterUserPassword(manageMasterUserPassword);
        return this;
    }

    /**
     * <p>
     * Specifies whether to manage the master user password with Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * If the DB instance doesn't manage the master user password with Amazon Web Services Secrets Manager, you can turn
     * on this management. In this case, you can't specify <code>MasterUserPassword</code>.
     * </p>
     * <p>
     * If the DB instance already manages the master user password with Amazon Web Services Secrets Manager, and you
     * specify that the master user password is not managed with Amazon Web Services Secrets Manager, then you must
     * specify <code>MasterUserPassword</code>. In this case, Amazon RDS deletes the secret and uses the new password
     * for the master user specified by <code>MasterUserPassword</code>.
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
     * @return Specifies whether to manage the master user password with Amazon Web Services Secrets Manager.</p>
     *         <p>
     *         If the DB instance doesn't manage the master user password with Amazon Web Services Secrets Manager, you
     *         can turn on this management. In this case, you can't specify <code>MasterUserPassword</code>.
     *         </p>
     *         <p>
     *         If the DB instance already manages the master user password with Amazon Web Services Secrets Manager, and
     *         you specify that the master user password is not managed with Amazon Web Services Secrets Manager, then
     *         you must specify <code>MasterUserPassword</code>. In this case, Amazon RDS deletes the secret and uses
     *         the new password for the master user specified by <code>MasterUserPassword</code>.
     *         </p>
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
     * Specifies whether to rotate the secret managed by Amazon Web Services Secrets Manager for the master user
     * password.
     * </p>
     * <p>
     * This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets Manager
     * for the DB cluster. The secret value contains the updated password.
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
     * You must apply the change immediately when rotating the master user password.
     * </p>
     * </li>
     * </ul>
     * 
     * @param rotateMasterUserPassword
     *        Specifies whether to rotate the secret managed by Amazon Web Services Secrets Manager for the master user
     *        password.</p>
     *        <p>
     *        This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets
     *        Manager for the DB cluster. The secret value contains the updated password.
     *        </p>
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
     *        You must apply the change immediately when rotating the master user password.
     *        </p>
     *        </li>
     */

    public void setRotateMasterUserPassword(Boolean rotateMasterUserPassword) {
        this.rotateMasterUserPassword = rotateMasterUserPassword;
    }

    /**
     * <p>
     * Specifies whether to rotate the secret managed by Amazon Web Services Secrets Manager for the master user
     * password.
     * </p>
     * <p>
     * This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets Manager
     * for the DB cluster. The secret value contains the updated password.
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
     * You must apply the change immediately when rotating the master user password.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether to rotate the secret managed by Amazon Web Services Secrets Manager for the master user
     *         password.</p>
     *         <p>
     *         This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets
     *         Manager for the DB cluster. The secret value contains the updated password.
     *         </p>
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
     *         You must apply the change immediately when rotating the master user password.
     *         </p>
     *         </li>
     */

    public Boolean getRotateMasterUserPassword() {
        return this.rotateMasterUserPassword;
    }

    /**
     * <p>
     * Specifies whether to rotate the secret managed by Amazon Web Services Secrets Manager for the master user
     * password.
     * </p>
     * <p>
     * This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets Manager
     * for the DB cluster. The secret value contains the updated password.
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
     * You must apply the change immediately when rotating the master user password.
     * </p>
     * </li>
     * </ul>
     * 
     * @param rotateMasterUserPassword
     *        Specifies whether to rotate the secret managed by Amazon Web Services Secrets Manager for the master user
     *        password.</p>
     *        <p>
     *        This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets
     *        Manager for the DB cluster. The secret value contains the updated password.
     *        </p>
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
     *        You must apply the change immediately when rotating the master user password.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withRotateMasterUserPassword(Boolean rotateMasterUserPassword) {
        setRotateMasterUserPassword(rotateMasterUserPassword);
        return this;
    }

    /**
     * <p>
     * Specifies whether to rotate the secret managed by Amazon Web Services Secrets Manager for the master user
     * password.
     * </p>
     * <p>
     * This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets Manager
     * for the DB cluster. The secret value contains the updated password.
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
     * You must apply the change immediately when rotating the master user password.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether to rotate the secret managed by Amazon Web Services Secrets Manager for the master user
     *         password.</p>
     *         <p>
     *         This setting is valid only if the master user password is managed by RDS in Amazon Web Services Secrets
     *         Manager for the DB cluster. The secret value contains the updated password.
     *         </p>
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
     *         You must apply the change immediately when rotating the master user password.
     *         </p>
     *         </li>
     */

    public Boolean isRotateMasterUserPassword() {
        return this.rotateMasterUserPassword;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier to encrypt a secret that is automatically generated and managed in
     * Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * This setting is valid only if both of the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB instance doesn't manage the master user password in Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * If the DB instance already manages the master user password in Amazon Web Services Secrets Manager, you can't
     * change the KMS key used to encrypt the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * You are turning on <code>ManageMasterUserPassword</code> to manage the master user password in Amazon Web
     * Services Secrets Manager.
     * </p>
     * <p>
     * If you are turning on <code>ManageMasterUserPassword</code> and don't specify
     * <code>MasterUserSecretKmsKeyId</code>, then the <code>aws/secretsmanager</code> KMS key is used to encrypt the
     * secret. If the secret is in a different Amazon Web Services account, then you can't use the
     * <code>aws/secretsmanager</code> KMS key to encrypt the secret, and you must use a customer managed KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
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
     *        This setting is valid only if both of the following conditions are met:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The DB instance doesn't manage the master user password in Amazon Web Services Secrets Manager.
     *        </p>
     *        <p>
     *        If the DB instance already manages the master user password in Amazon Web Services Secrets Manager, you
     *        can't change the KMS key used to encrypt the secret.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You are turning on <code>ManageMasterUserPassword</code> to manage the master user password in Amazon Web
     *        Services Secrets Manager.
     *        </p>
     *        <p>
     *        If you are turning on <code>ManageMasterUserPassword</code> and don't specify
     *        <code>MasterUserSecretKmsKeyId</code>, then the <code>aws/secretsmanager</code> KMS key is used to encrypt
     *        the secret. If the secret is in a different Amazon Web Services account, then you can't use the
     *        <code>aws/secretsmanager</code> KMS key to encrypt the secret, and you must use a customer managed KMS
     *        key.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
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
     * This setting is valid only if both of the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB instance doesn't manage the master user password in Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * If the DB instance already manages the master user password in Amazon Web Services Secrets Manager, you can't
     * change the KMS key used to encrypt the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * You are turning on <code>ManageMasterUserPassword</code> to manage the master user password in Amazon Web
     * Services Secrets Manager.
     * </p>
     * <p>
     * If you are turning on <code>ManageMasterUserPassword</code> and don't specify
     * <code>MasterUserSecretKmsKeyId</code>, then the <code>aws/secretsmanager</code> KMS key is used to encrypt the
     * secret. If the secret is in a different Amazon Web Services account, then you can't use the
     * <code>aws/secretsmanager</code> KMS key to encrypt the secret, and you must use a customer managed KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a different
     * default KMS key for each Amazon Web Services Region.
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier to encrypt a secret that is automatically generated and
     *         managed in Amazon Web Services Secrets Manager.</p>
     *         <p>
     *         This setting is valid only if both of the following conditions are met:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The DB instance doesn't manage the master user password in Amazon Web Services Secrets Manager.
     *         </p>
     *         <p>
     *         If the DB instance already manages the master user password in Amazon Web Services Secrets Manager, you
     *         can't change the KMS key used to encrypt the secret.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You are turning on <code>ManageMasterUserPassword</code> to manage the master user password in Amazon Web
     *         Services Secrets Manager.
     *         </p>
     *         <p>
     *         If you are turning on <code>ManageMasterUserPassword</code> and don't specify
     *         <code>MasterUserSecretKmsKeyId</code>, then the <code>aws/secretsmanager</code> KMS key is used to
     *         encrypt the secret. If the secret is in a different Amazon Web Services account, then you can't use the
     *         <code>aws/secretsmanager</code> KMS key to encrypt the secret, and you must use a customer managed KMS
     *         key.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *         key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
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
     * This setting is valid only if both of the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB instance doesn't manage the master user password in Amazon Web Services Secrets Manager.
     * </p>
     * <p>
     * If the DB instance already manages the master user password in Amazon Web Services Secrets Manager, you can't
     * change the KMS key used to encrypt the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * You are turning on <code>ManageMasterUserPassword</code> to manage the master user password in Amazon Web
     * Services Secrets Manager.
     * </p>
     * <p>
     * If you are turning on <code>ManageMasterUserPassword</code> and don't specify
     * <code>MasterUserSecretKmsKeyId</code>, then the <code>aws/secretsmanager</code> KMS key is used to encrypt the
     * secret. If the secret is in a different Amazon Web Services account, then you can't use the
     * <code>aws/secretsmanager</code> KMS key to encrypt the secret, and you must use a customer managed KMS key.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
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
     *        This setting is valid only if both of the following conditions are met:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The DB instance doesn't manage the master user password in Amazon Web Services Secrets Manager.
     *        </p>
     *        <p>
     *        If the DB instance already manages the master user password in Amazon Web Services Secrets Manager, you
     *        can't change the KMS key used to encrypt the secret.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You are turning on <code>ManageMasterUserPassword</code> to manage the master user password in Amazon Web
     *        Services Secrets Manager.
     *        </p>
     *        <p>
     *        If you are turning on <code>ManageMasterUserPassword</code> and don't specify
     *        <code>MasterUserSecretKmsKeyId</code>, then the <code>aws/secretsmanager</code> KMS key is used to encrypt
     *        the secret. If the secret is in a different Amazon Web Services account, then you can't use the
     *        <code>aws/secretsmanager</code> KMS key to encrypt the secret, and you must use a customer managed KMS
     *        key.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        There is a default KMS key for your Amazon Web Services account. Your Amazon Web Services account has a
     *        different default KMS key for each Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withMasterUserSecretKmsKeyId(String masterUserSecretKmsKeyId) {
        setMasterUserSecretKmsKeyId(masterUserSecretKmsKeyId);
        return this;
    }

    /**
     * <p>
     * The target Oracle DB engine when you convert a non-CDB to a CDB. This intermediate step is necessary to upgrade
     * an Oracle Database 19c non-CDB to an Oracle Database 21c CDB.
     * </p>
     * <p>
     * Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Make sure that you specify <code>oracle-ee-cdb</code> or <code>oracle-se2-cdb</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Make sure that your DB engine runs Oracle Database 19c with an April 2021 or later RU.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following limitations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't convert a CDB to a non-CDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert a replica database.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert a non-CDB to a CDB and upgrade the engine version in the same command.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert the existing custom parameter or option group when it has options or parameters that are
     * permanent or persistent. In this situation, the DB instance reverts to the default option and parameter group. To
     * avoid reverting to the default, specify a new parameter group with <code>--db-parameter-group-name</code> and a
     * new option group with <code>--option-group-name</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The target Oracle DB engine when you convert a non-CDB to a CDB. This intermediate step is necessary to
     *        upgrade an Oracle Database 19c non-CDB to an Oracle Database 21c CDB.</p>
     *        <p>
     *        Note the following requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Make sure that you specify <code>oracle-ee-cdb</code> or <code>oracle-se2-cdb</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Make sure that your DB engine runs Oracle Database 19c with an April 2021 or later RU.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note the following limitations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can't convert a CDB to a non-CDB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't convert a replica database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't convert a non-CDB to a CDB and upgrade the engine version in the same command.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't convert the existing custom parameter or option group when it has options or parameters that are
     *        permanent or persistent. In this situation, the DB instance reverts to the default option and parameter
     *        group. To avoid reverting to the default, specify a new parameter group with
     *        <code>--db-parameter-group-name</code> and a new option group with <code>--option-group-name</code>.
     *        </p>
     *        </li>
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The target Oracle DB engine when you convert a non-CDB to a CDB. This intermediate step is necessary to upgrade
     * an Oracle Database 19c non-CDB to an Oracle Database 21c CDB.
     * </p>
     * <p>
     * Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Make sure that you specify <code>oracle-ee-cdb</code> or <code>oracle-se2-cdb</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Make sure that your DB engine runs Oracle Database 19c with an April 2021 or later RU.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following limitations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't convert a CDB to a non-CDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert a replica database.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert a non-CDB to a CDB and upgrade the engine version in the same command.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert the existing custom parameter or option group when it has options or parameters that are
     * permanent or persistent. In this situation, the DB instance reverts to the default option and parameter group. To
     * avoid reverting to the default, specify a new parameter group with <code>--db-parameter-group-name</code> and a
     * new option group with <code>--option-group-name</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The target Oracle DB engine when you convert a non-CDB to a CDB. This intermediate step is necessary to
     *         upgrade an Oracle Database 19c non-CDB to an Oracle Database 21c CDB.</p>
     *         <p>
     *         Note the following requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Make sure that you specify <code>oracle-ee-cdb</code> or <code>oracle-se2-cdb</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Make sure that your DB engine runs Oracle Database 19c with an April 2021 or later RU.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Note the following limitations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can't convert a CDB to a non-CDB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't convert a replica database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't convert a non-CDB to a CDB and upgrade the engine version in the same command.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't convert the existing custom parameter or option group when it has options or parameters that
     *         are permanent or persistent. In this situation, the DB instance reverts to the default option and
     *         parameter group. To avoid reverting to the default, specify a new parameter group with
     *         <code>--db-parameter-group-name</code> and a new option group with <code>--option-group-name</code>.
     *         </p>
     *         </li>
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The target Oracle DB engine when you convert a non-CDB to a CDB. This intermediate step is necessary to upgrade
     * an Oracle Database 19c non-CDB to an Oracle Database 21c CDB.
     * </p>
     * <p>
     * Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Make sure that you specify <code>oracle-ee-cdb</code> or <code>oracle-se2-cdb</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Make sure that your DB engine runs Oracle Database 19c with an April 2021 or later RU.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following limitations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't convert a CDB to a non-CDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert a replica database.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert a non-CDB to a CDB and upgrade the engine version in the same command.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert the existing custom parameter or option group when it has options or parameters that are
     * permanent or persistent. In this situation, the DB instance reverts to the default option and parameter group. To
     * avoid reverting to the default, specify a new parameter group with <code>--db-parameter-group-name</code> and a
     * new option group with <code>--option-group-name</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The target Oracle DB engine when you convert a non-CDB to a CDB. This intermediate step is necessary to
     *        upgrade an Oracle Database 19c non-CDB to an Oracle Database 21c CDB.</p>
     *        <p>
     *        Note the following requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Make sure that you specify <code>oracle-ee-cdb</code> or <code>oracle-se2-cdb</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Make sure that your DB engine runs Oracle Database 19c with an April 2021 or later RU.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note the following limitations:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can't convert a CDB to a non-CDB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't convert a replica database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't convert a non-CDB to a CDB and upgrade the engine version in the same command.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't convert the existing custom parameter or option group when it has options or parameters that are
     *        permanent or persistent. In this situation, the DB instance reverts to the default option and parameter
     *        group. To avoid reverting to the default, specify a new parameter group with
     *        <code>--db-parameter-group-name</code> and a new option group with <code>--option-group-name</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
     * </p>
     * 
     * @param dedicatedLogVolume
     *        Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
     */

    public void setDedicatedLogVolume(Boolean dedicatedLogVolume) {
        this.dedicatedLogVolume = dedicatedLogVolume;
    }

    /**
     * <p>
     * Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
     * </p>
     * 
     * @return Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
     */

    public Boolean getDedicatedLogVolume() {
        return this.dedicatedLogVolume;
    }

    /**
     * <p>
     * Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
     * </p>
     * 
     * @param dedicatedLogVolume
     *        Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDedicatedLogVolume(Boolean dedicatedLogVolume) {
        setDedicatedLogVolume(dedicatedLogVolume);
        return this;
    }

    /**
     * <p>
     * Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
     * </p>
     * 
     * @return Indicates whether the DB instance has a dedicated log volume (DLV) enabled.
     */

    public Boolean isDedicatedLogVolume() {
        return this.dedicatedLogVolume;
    }

    /**
     * <p>
     * Specifies whether the to convert your DB instance from the single-tenant conﬁguration to the multi-tenant
     * conﬁguration. This parameter is supported only for RDS for Oracle CDB instances.
     * </p>
     * <p>
     * During the conversion, RDS creates an initial tenant database and associates the DB name, master user name,
     * character set, and national character set metadata with this database. The tags associated with the instance also
     * propagate to the initial tenant database. You can add more tenant databases to your DB instance by using the
     * <code>CreateTenantDatabase</code> operation.
     * </p>
     * <important>
     * <p>
     * The conversion to the multi-tenant configuration is permanent and irreversible, so you can't later convert back
     * to the single-tenant configuration. When you specify this parameter, you must also specify
     * <code>ApplyImmediately</code>.
     * </p>
     * </important>
     * 
     * @param multiTenant
     *        Specifies whether the to convert your DB instance from the single-tenant conﬁguration to the multi-tenant
     *        conﬁguration. This parameter is supported only for RDS for Oracle CDB instances.</p>
     *        <p>
     *        During the conversion, RDS creates an initial tenant database and associates the DB name, master user
     *        name, character set, and national character set metadata with this database. The tags associated with the
     *        instance also propagate to the initial tenant database. You can add more tenant databases to your DB
     *        instance by using the <code>CreateTenantDatabase</code> operation.
     *        </p>
     *        <important>
     *        <p>
     *        The conversion to the multi-tenant configuration is permanent and irreversible, so you can't later convert
     *        back to the single-tenant configuration. When you specify this parameter, you must also specify
     *        <code>ApplyImmediately</code>.
     *        </p>
     */

    public void setMultiTenant(Boolean multiTenant) {
        this.multiTenant = multiTenant;
    }

    /**
     * <p>
     * Specifies whether the to convert your DB instance from the single-tenant conﬁguration to the multi-tenant
     * conﬁguration. This parameter is supported only for RDS for Oracle CDB instances.
     * </p>
     * <p>
     * During the conversion, RDS creates an initial tenant database and associates the DB name, master user name,
     * character set, and national character set metadata with this database. The tags associated with the instance also
     * propagate to the initial tenant database. You can add more tenant databases to your DB instance by using the
     * <code>CreateTenantDatabase</code> operation.
     * </p>
     * <important>
     * <p>
     * The conversion to the multi-tenant configuration is permanent and irreversible, so you can't later convert back
     * to the single-tenant configuration. When you specify this parameter, you must also specify
     * <code>ApplyImmediately</code>.
     * </p>
     * </important>
     * 
     * @return Specifies whether the to convert your DB instance from the single-tenant conﬁguration to the multi-tenant
     *         conﬁguration. This parameter is supported only for RDS for Oracle CDB instances.</p>
     *         <p>
     *         During the conversion, RDS creates an initial tenant database and associates the DB name, master user
     *         name, character set, and national character set metadata with this database. The tags associated with the
     *         instance also propagate to the initial tenant database. You can add more tenant databases to your DB
     *         instance by using the <code>CreateTenantDatabase</code> operation.
     *         </p>
     *         <important>
     *         <p>
     *         The conversion to the multi-tenant configuration is permanent and irreversible, so you can't later
     *         convert back to the single-tenant configuration. When you specify this parameter, you must also specify
     *         <code>ApplyImmediately</code>.
     *         </p>
     */

    public Boolean getMultiTenant() {
        return this.multiTenant;
    }

    /**
     * <p>
     * Specifies whether the to convert your DB instance from the single-tenant conﬁguration to the multi-tenant
     * conﬁguration. This parameter is supported only for RDS for Oracle CDB instances.
     * </p>
     * <p>
     * During the conversion, RDS creates an initial tenant database and associates the DB name, master user name,
     * character set, and national character set metadata with this database. The tags associated with the instance also
     * propagate to the initial tenant database. You can add more tenant databases to your DB instance by using the
     * <code>CreateTenantDatabase</code> operation.
     * </p>
     * <important>
     * <p>
     * The conversion to the multi-tenant configuration is permanent and irreversible, so you can't later convert back
     * to the single-tenant configuration. When you specify this parameter, you must also specify
     * <code>ApplyImmediately</code>.
     * </p>
     * </important>
     * 
     * @param multiTenant
     *        Specifies whether the to convert your DB instance from the single-tenant conﬁguration to the multi-tenant
     *        conﬁguration. This parameter is supported only for RDS for Oracle CDB instances.</p>
     *        <p>
     *        During the conversion, RDS creates an initial tenant database and associates the DB name, master user
     *        name, character set, and national character set metadata with this database. The tags associated with the
     *        instance also propagate to the initial tenant database. You can add more tenant databases to your DB
     *        instance by using the <code>CreateTenantDatabase</code> operation.
     *        </p>
     *        <important>
     *        <p>
     *        The conversion to the multi-tenant configuration is permanent and irreversible, so you can't later convert
     *        back to the single-tenant configuration. When you specify this parameter, you must also specify
     *        <code>ApplyImmediately</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withMultiTenant(Boolean multiTenant) {
        setMultiTenant(multiTenant);
        return this;
    }

    /**
     * <p>
     * Specifies whether the to convert your DB instance from the single-tenant conﬁguration to the multi-tenant
     * conﬁguration. This parameter is supported only for RDS for Oracle CDB instances.
     * </p>
     * <p>
     * During the conversion, RDS creates an initial tenant database and associates the DB name, master user name,
     * character set, and national character set metadata with this database. The tags associated with the instance also
     * propagate to the initial tenant database. You can add more tenant databases to your DB instance by using the
     * <code>CreateTenantDatabase</code> operation.
     * </p>
     * <important>
     * <p>
     * The conversion to the multi-tenant configuration is permanent and irreversible, so you can't later convert back
     * to the single-tenant configuration. When you specify this parameter, you must also specify
     * <code>ApplyImmediately</code>.
     * </p>
     * </important>
     * 
     * @return Specifies whether the to convert your DB instance from the single-tenant conﬁguration to the multi-tenant
     *         conﬁguration. This parameter is supported only for RDS for Oracle CDB instances.</p>
     *         <p>
     *         During the conversion, RDS creates an initial tenant database and associates the DB name, master user
     *         name, character set, and national character set metadata with this database. The tags associated with the
     *         instance also propagate to the initial tenant database. You can add more tenant databases to your DB
     *         instance by using the <code>CreateTenantDatabase</code> operation.
     *         </p>
     *         <important>
     *         <p>
     *         The conversion to the multi-tenant configuration is permanent and irreversible, so you can't later
     *         convert back to the single-tenant configuration. When you specify this parameter, you must also specify
     *         <code>ApplyImmediately</code>.
     *         </p>
     */

    public Boolean isMultiTenant() {
        return this.multiTenant;
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
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: ").append(getDBSubnetGroupName()).append(",");
        if (getDBSecurityGroups() != null)
            sb.append("DBSecurityGroups: ").append(getDBSecurityGroups()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: ").append(getApplyImmediately()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append(getMasterUserPassword()).append(",");
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: ").append(getDBParameterGroupName()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getAllowMajorVersionUpgrade() != null)
            sb.append("AllowMajorVersionUpgrade: ").append(getAllowMajorVersionUpgrade()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getNewDBInstanceIdentifier() != null)
            sb.append("NewDBInstanceIdentifier: ").append(getNewDBInstanceIdentifier()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: ").append(getTdeCredentialArn()).append(",");
        if (getTdeCredentialPassword() != null)
            sb.append("TdeCredentialPassword: ").append(getTdeCredentialPassword()).append(",");
        if (getCACertificateIdentifier() != null)
            sb.append("CACertificateIdentifier: ").append(getCACertificateIdentifier()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getDomainFqdn() != null)
            sb.append("DomainFqdn: ").append(getDomainFqdn()).append(",");
        if (getDomainOu() != null)
            sb.append("DomainOu: ").append(getDomainOu()).append(",");
        if (getDomainAuthSecretArn() != null)
            sb.append("DomainAuthSecretArn: ").append(getDomainAuthSecretArn()).append(",");
        if (getDomainDnsIps() != null)
            sb.append("DomainDnsIps: ").append(getDomainDnsIps()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot()).append(",");
        if (getMonitoringInterval() != null)
            sb.append("MonitoringInterval: ").append(getMonitoringInterval()).append(",");
        if (getDBPortNumber() != null)
            sb.append("DBPortNumber: ").append(getDBPortNumber()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getMonitoringRoleArn() != null)
            sb.append("MonitoringRoleArn: ").append(getMonitoringRoleArn()).append(",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: ").append(getDomainIAMRoleName()).append(",");
        if (getDisableDomain() != null)
            sb.append("DisableDomain: ").append(getDisableDomain()).append(",");
        if (getPromotionTier() != null)
            sb.append("PromotionTier: ").append(getPromotionTier()).append(",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: ").append(getEnableIAMDatabaseAuthentication()).append(",");
        if (getEnablePerformanceInsights() != null)
            sb.append("EnablePerformanceInsights: ").append(getEnablePerformanceInsights()).append(",");
        if (getPerformanceInsightsKMSKeyId() != null)
            sb.append("PerformanceInsightsKMSKeyId: ").append(getPerformanceInsightsKMSKeyId()).append(",");
        if (getPerformanceInsightsRetentionPeriod() != null)
            sb.append("PerformanceInsightsRetentionPeriod: ").append(getPerformanceInsightsRetentionPeriod()).append(",");
        if (getCloudwatchLogsExportConfiguration() != null)
            sb.append("CloudwatchLogsExportConfiguration: ").append(getCloudwatchLogsExportConfiguration()).append(",");
        if (getProcessorFeatures() != null)
            sb.append("ProcessorFeatures: ").append(getProcessorFeatures()).append(",");
        if (getUseDefaultProcessorFeatures() != null)
            sb.append("UseDefaultProcessorFeatures: ").append(getUseDefaultProcessorFeatures()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getMaxAllocatedStorage() != null)
            sb.append("MaxAllocatedStorage: ").append(getMaxAllocatedStorage()).append(",");
        if (getCertificateRotationRestart() != null)
            sb.append("CertificateRotationRestart: ").append(getCertificateRotationRestart()).append(",");
        if (getReplicaMode() != null)
            sb.append("ReplicaMode: ").append(getReplicaMode()).append(",");
        if (getEnableCustomerOwnedIp() != null)
            sb.append("EnableCustomerOwnedIp: ").append(getEnableCustomerOwnedIp()).append(",");
        if (getAwsBackupRecoveryPointArn() != null)
            sb.append("AwsBackupRecoveryPointArn: ").append(getAwsBackupRecoveryPointArn()).append(",");
        if (getAutomationMode() != null)
            sb.append("AutomationMode: ").append(getAutomationMode()).append(",");
        if (getResumeFullAutomationModeMinutes() != null)
            sb.append("ResumeFullAutomationModeMinutes: ").append(getResumeFullAutomationModeMinutes()).append(",");
        if (getNetworkType() != null)
            sb.append("NetworkType: ").append(getNetworkType()).append(",");
        if (getStorageThroughput() != null)
            sb.append("StorageThroughput: ").append(getStorageThroughput()).append(",");
        if (getManageMasterUserPassword() != null)
            sb.append("ManageMasterUserPassword: ").append(getManageMasterUserPassword()).append(",");
        if (getRotateMasterUserPassword() != null)
            sb.append("RotateMasterUserPassword: ").append(getRotateMasterUserPassword()).append(",");
        if (getMasterUserSecretKmsKeyId() != null)
            sb.append("MasterUserSecretKmsKeyId: ").append(getMasterUserSecretKmsKeyId()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getDedicatedLogVolume() != null)
            sb.append("DedicatedLogVolume: ").append(getDedicatedLogVolume()).append(",");
        if (getMultiTenant() != null)
            sb.append("MultiTenant: ").append(getMultiTenant());
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
        if (other.getDisableDomain() == null ^ this.getDisableDomain() == null)
            return false;
        if (other.getDisableDomain() != null && other.getDisableDomain().equals(this.getDisableDomain()) == false)
            return false;
        if (other.getPromotionTier() == null ^ this.getPromotionTier() == null)
            return false;
        if (other.getPromotionTier() != null && other.getPromotionTier().equals(this.getPromotionTier()) == false)
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
        if (other.getCloudwatchLogsExportConfiguration() == null ^ this.getCloudwatchLogsExportConfiguration() == null)
            return false;
        if (other.getCloudwatchLogsExportConfiguration() != null
                && other.getCloudwatchLogsExportConfiguration().equals(this.getCloudwatchLogsExportConfiguration()) == false)
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
        if (other.getMaxAllocatedStorage() == null ^ this.getMaxAllocatedStorage() == null)
            return false;
        if (other.getMaxAllocatedStorage() != null && other.getMaxAllocatedStorage().equals(this.getMaxAllocatedStorage()) == false)
            return false;
        if (other.getCertificateRotationRestart() == null ^ this.getCertificateRotationRestart() == null)
            return false;
        if (other.getCertificateRotationRestart() != null && other.getCertificateRotationRestart().equals(this.getCertificateRotationRestart()) == false)
            return false;
        if (other.getReplicaMode() == null ^ this.getReplicaMode() == null)
            return false;
        if (other.getReplicaMode() != null && other.getReplicaMode().equals(this.getReplicaMode()) == false)
            return false;
        if (other.getEnableCustomerOwnedIp() == null ^ this.getEnableCustomerOwnedIp() == null)
            return false;
        if (other.getEnableCustomerOwnedIp() != null && other.getEnableCustomerOwnedIp().equals(this.getEnableCustomerOwnedIp()) == false)
            return false;
        if (other.getAwsBackupRecoveryPointArn() == null ^ this.getAwsBackupRecoveryPointArn() == null)
            return false;
        if (other.getAwsBackupRecoveryPointArn() != null && other.getAwsBackupRecoveryPointArn().equals(this.getAwsBackupRecoveryPointArn()) == false)
            return false;
        if (other.getAutomationMode() == null ^ this.getAutomationMode() == null)
            return false;
        if (other.getAutomationMode() != null && other.getAutomationMode().equals(this.getAutomationMode()) == false)
            return false;
        if (other.getResumeFullAutomationModeMinutes() == null ^ this.getResumeFullAutomationModeMinutes() == null)
            return false;
        if (other.getResumeFullAutomationModeMinutes() != null
                && other.getResumeFullAutomationModeMinutes().equals(this.getResumeFullAutomationModeMinutes()) == false)
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
        if (other.getRotateMasterUserPassword() == null ^ this.getRotateMasterUserPassword() == null)
            return false;
        if (other.getRotateMasterUserPassword() != null && other.getRotateMasterUserPassword().equals(this.getRotateMasterUserPassword()) == false)
            return false;
        if (other.getMasterUserSecretKmsKeyId() == null ^ this.getMasterUserSecretKmsKeyId() == null)
            return false;
        if (other.getMasterUserSecretKmsKeyId() != null && other.getMasterUserSecretKmsKeyId().equals(this.getMasterUserSecretKmsKeyId()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getDedicatedLogVolume() == null ^ this.getDedicatedLogVolume() == null)
            return false;
        if (other.getDedicatedLogVolume() != null && other.getDedicatedLogVolume().equals(this.getDedicatedLogVolume()) == false)
            return false;
        if (other.getMultiTenant() == null ^ this.getMultiTenant() == null)
            return false;
        if (other.getMultiTenant() != null && other.getMultiTenant().equals(this.getMultiTenant()) == false)
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
        hashCode = prime * hashCode + ((getDomainFqdn() == null) ? 0 : getDomainFqdn().hashCode());
        hashCode = prime * hashCode + ((getDomainOu() == null) ? 0 : getDomainOu().hashCode());
        hashCode = prime * hashCode + ((getDomainAuthSecretArn() == null) ? 0 : getDomainAuthSecretArn().hashCode());
        hashCode = prime * hashCode + ((getDomainDnsIps() == null) ? 0 : getDomainDnsIps().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode());
        hashCode = prime * hashCode + ((getDBPortNumber() == null) ? 0 : getDBPortNumber().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        hashCode = prime * hashCode + ((getDisableDomain() == null) ? 0 : getDisableDomain().hashCode());
        hashCode = prime * hashCode + ((getPromotionTier() == null) ? 0 : getPromotionTier().hashCode());
        hashCode = prime * hashCode + ((getEnableIAMDatabaseAuthentication() == null) ? 0 : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode + ((getEnablePerformanceInsights() == null) ? 0 : getEnablePerformanceInsights().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsKMSKeyId() == null) ? 0 : getPerformanceInsightsKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsRetentionPeriod() == null) ? 0 : getPerformanceInsightsRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getCloudwatchLogsExportConfiguration() == null) ? 0 : getCloudwatchLogsExportConfiguration().hashCode());
        hashCode = prime * hashCode + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getUseDefaultProcessorFeatures() == null) ? 0 : getUseDefaultProcessorFeatures().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getMaxAllocatedStorage() == null) ? 0 : getMaxAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getCertificateRotationRestart() == null) ? 0 : getCertificateRotationRestart().hashCode());
        hashCode = prime * hashCode + ((getReplicaMode() == null) ? 0 : getReplicaMode().hashCode());
        hashCode = prime * hashCode + ((getEnableCustomerOwnedIp() == null) ? 0 : getEnableCustomerOwnedIp().hashCode());
        hashCode = prime * hashCode + ((getAwsBackupRecoveryPointArn() == null) ? 0 : getAwsBackupRecoveryPointArn().hashCode());
        hashCode = prime * hashCode + ((getAutomationMode() == null) ? 0 : getAutomationMode().hashCode());
        hashCode = prime * hashCode + ((getResumeFullAutomationModeMinutes() == null) ? 0 : getResumeFullAutomationModeMinutes().hashCode());
        hashCode = prime * hashCode + ((getNetworkType() == null) ? 0 : getNetworkType().hashCode());
        hashCode = prime * hashCode + ((getStorageThroughput() == null) ? 0 : getStorageThroughput().hashCode());
        hashCode = prime * hashCode + ((getManageMasterUserPassword() == null) ? 0 : getManageMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getRotateMasterUserPassword() == null) ? 0 : getRotateMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getMasterUserSecretKmsKeyId() == null) ? 0 : getMasterUserSecretKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getDedicatedLogVolume() == null) ? 0 : getDedicatedLogVolume().hashCode());
        hashCode = prime * hashCode + ((getMultiTenant() == null) ? 0 : getMultiTenant().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBInstanceRequest clone() {
        return (ModifyDBInstanceRequest) super.clone();
    }

}
