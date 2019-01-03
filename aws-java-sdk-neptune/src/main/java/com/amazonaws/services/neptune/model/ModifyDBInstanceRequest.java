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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/ModifyDBInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
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
     * Must match the identifier of an existing DBInstance.
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The new amount of storage (in gibibytes) to allocate for the DB instance.
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB Cluster.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The new compute and memory capacity of the DB instance, for example, <code>db.m4.large</code>. Not all DB
     * instance classes are available in all AWS Regions.
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different
     * VPC.
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you specify <code>true</code> for the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetGroup</code>
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DBSecurityGroups.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> dBSecurityGroups;
    /**
     * <p>
     * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     * information, see <a>ModifyDBCluster</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing VpcSecurityGroupIds.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> vpcSecurityGroupIds;
    /**
     * <p>
     * Specifies whether the modifications in this request and any pending modifications are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB instance.
     * </p>
     * <p>
     * If this parameter is set to <code>false</code>, changes to the DB instance are applied during the next
     * maintenance window. Some parameter changes can cause an outage and are applied on the next call to
     * <a>RebootDBInstance</a>, or the next failure reboot.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean applyImmediately;
    /**
     * <p>
     * The new password for the master user. The password can include any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an
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
     * Not applicable. The retention period for automated backups is managed by the DB cluster. For more information,
     * see <a>ModifyDBCluster</a>.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled.
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more
     * information, see <a>ModifyDBCluster</a>.
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
     * Must be in Universal Time Coordinated (UTC)
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
     * Changing this parameter doesn't result in an outage, except in the following situation, and the change is
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
     * Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage and
     * the change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * set to <code>true</code> for this request.
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
     * For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this parameter doesn't result in an outage and the
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
     * Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window.
     * Changing this parameter doesn't result in an outage except in the following case and the change is asynchronously
     * applied as soon as possible. An outage will result if this parameter is set to <code>true</code> during the
     * maintenance window, and a newer minor version is available, and Neptune has enabled auto patching for that engine
     * version.
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
     * The new Provisioned IOPS (I/O operations per second) value for the instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * Indicates that the DB instance should be associated with the specified option group. Changing this parameter
     * doesn't result in an outage except in the following case and the change is applied during the next maintenance
     * window unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. If the
     * parameter change results in an option group that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance once it is associated with a DB instance
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
     * Cannot end with a hyphen or contain two consecutive hyphens.
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
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * If you specify Provisioned IOPS (<code>io1</code>), you must also include a value for the <code>Iops</code>
     * parameter.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon Neptune operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>standard</code>
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     */
    private String tdeCredentialArn;
    /**
     * <p>
     * The password for the given ARN from the key store in order to access the device.
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
     * Not supported.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * True to copy all tags from the DB instance to snapshots of the DB instance, and otherwise false. The default is
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
     * Default: <code>8182</code>
     * </p>
     */
    private Integer dBPortNumber;
    /**
     * <p>
     * This parameter is not supported.
     * </p>
     */
    @Deprecated
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The ARN for the IAM role that permits Neptune to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     */
    private String monitoringRoleArn;
    /**
     * <p>
     * Not supported
     * </p>
     */
    private String domainIAMRoleName;
    /**
     * <p>
     * A value that specifies the order in which a Read Replica is promoted to the primary instance after a failure of
     * the existing primary instance.
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
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise
     * false.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database engines
     * </p>
     * <p>
     * Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster. For more information,
     * see <a>ModifyDBCluster</a>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;
    /**
     * <p>
     * True to enable Performance Insights for the DB instance, and otherwise false.
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
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * instance or DB cluster.
     * </p>
     */
    private CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration;

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
     * Must match the identifier of an existing DBInstance.
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
     *        Must match the identifier of an existing DBInstance.
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
     * Must match the identifier of an existing DBInstance.
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
     *         Must match the identifier of an existing DBInstance.
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
     * Must match the identifier of an existing DBInstance.
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
     *        Must match the identifier of an existing DBInstance.
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
     * The new amount of storage (in gibibytes) to allocate for the DB instance.
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB Cluster.
     * </p>
     * 
     * @param allocatedStorage
     *        The new amount of storage (in gibibytes) to allocate for the DB instance. </p>
     *        <p>
     *        Not applicable. Storage is managed by the DB Cluster.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The new amount of storage (in gibibytes) to allocate for the DB instance.
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB Cluster.
     * </p>
     * 
     * @return The new amount of storage (in gibibytes) to allocate for the DB instance. </p>
     *         <p>
     *         Not applicable. Storage is managed by the DB Cluster.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The new amount of storage (in gibibytes) to allocate for the DB instance.
     * </p>
     * <p>
     * Not applicable. Storage is managed by the DB Cluster.
     * </p>
     * 
     * @param allocatedStorage
     *        The new amount of storage (in gibibytes) to allocate for the DB instance. </p>
     *        <p>
     *        Not applicable. Storage is managed by the DB Cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The new compute and memory capacity of the DB instance, for example, <code>db.m4.large</code>. Not all DB
     * instance classes are available in all AWS Regions.
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @param dBInstanceClass
     *        The new compute and memory capacity of the DB instance, for example, <code>db.m4.large</code>. Not all DB
     *        instance classes are available in all AWS Regions. </p>
     *        <p>
     *        If you modify the DB instance class, an outage occurs during the change. The change is applied during the
     *        next maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this
     *        request.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The new compute and memory capacity of the DB instance, for example, <code>db.m4.large</code>. Not all DB
     * instance classes are available in all AWS Regions.
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @return The new compute and memory capacity of the DB instance, for example, <code>db.m4.large</code>. Not all DB
     *         instance classes are available in all AWS Regions. </p>
     *         <p>
     *         If you modify the DB instance class, an outage occurs during the change. The change is applied during the
     *         next maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this
     *         request.
     *         </p>
     *         <p>
     *         Default: Uses existing setting
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The new compute and memory capacity of the DB instance, for example, <code>db.m4.large</code>. Not all DB
     * instance classes are available in all AWS Regions.
     * </p>
     * <p>
     * If you modify the DB instance class, an outage occurs during the change. The change is applied during the next
     * maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @param dBInstanceClass
     *        The new compute and memory capacity of the DB instance, for example, <code>db.m4.large</code>. Not all DB
     *        instance classes are available in all AWS Regions. </p>
     *        <p>
     *        If you modify the DB instance class, an outage occurs during the change. The change is applied during the
     *        next maintenance window, unless <code>ApplyImmediately</code> is specified as <code>true</code> for this
     *        request.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a different
     * VPC.
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you specify <code>true</code> for the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetGroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a
     *        different VPC. </p>
     *        <p>
     *        Changing the subnet group causes an outage during the change. The change is applied during the next
     *        maintenance window, unless you specify <code>true</code> for the <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        Constraints: If supplied, must match the name of an existing DBSubnetGroup.
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
     * VPC.
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you specify <code>true</code> for the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetGroup</code>
     * </p>
     * 
     * @return The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a
     *         different VPC. </p>
     *         <p>
     *         Changing the subnet group causes an outage during the change. The change is applied during the next
     *         maintenance window, unless you specify <code>true</code> for the <code>ApplyImmediately</code> parameter.
     *         </p>
     *         <p>
     *         Constraints: If supplied, must match the name of an existing DBSubnetGroup.
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
     * VPC.
     * </p>
     * <p>
     * Changing the subnet group causes an outage during the change. The change is applied during the next maintenance
     * window, unless you specify <code>true</code> for the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetGroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The new DB subnet group for the DB instance. You can use this parameter to move your DB instance to a
     *        different VPC. </p>
     *        <p>
     *        Changing the subnet group causes an outage during the change. The change is applied during the next
     *        maintenance window, unless you specify <code>true</code> for the <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        Constraints: If supplied, must match the name of an existing DBSubnetGroup.
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
     * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DBSecurityGroups.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an
     *         outage and the change is asynchronously applied as soon as possible.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match existing DBSecurityGroups.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getDBSecurityGroups() {
        return dBSecurityGroups;
    }

    /**
     * <p>
     * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DBSecurityGroups.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBSecurityGroups
     *        A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an
     *        outage and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing DBSecurityGroups.
     *        </p>
     *        </li>
     */

    public void setDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }

        this.dBSecurityGroups = new java.util.ArrayList<String>(dBSecurityGroups);
    }

    /**
     * <p>
     * A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an outage
     * and the change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DBSecurityGroups.
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
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing DBSecurityGroups.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBSecurityGroups(String... dBSecurityGroups) {
        if (this.dBSecurityGroups == null) {
            setDBSecurityGroups(new java.util.ArrayList<String>(dBSecurityGroups.length));
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
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing DBSecurityGroups.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBSecurityGroups
     *        A list of DB security groups to authorize on this DB instance. Changing this setting doesn't result in an
     *        outage and the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing DBSecurityGroups.
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
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     * information, see <a>ModifyDBCluster</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing VpcSecurityGroupIds.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied
     *         as soon as possible.</p>
     *         <p>
     *         Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     *         information, see <a>ModifyDBCluster</a>.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match existing VpcSecurityGroupIds.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     * information, see <a>ModifyDBCluster</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing VpcSecurityGroupIds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied
     *        as soon as possible.</p>
     *        <p>
     *        Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     *        information, see <a>ModifyDBCluster</a>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing VpcSecurityGroupIds.
     *        </p>
     *        </li>
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied as soon
     * as possible.
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     * information, see <a>ModifyDBCluster</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing VpcSecurityGroupIds.
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
     *        Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     *        information, see <a>ModifyDBCluster</a>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing VpcSecurityGroupIds.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
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
     * Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     * information, see <a>ModifyDBCluster</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match existing VpcSecurityGroupIds.
     * </p>
     * </li>
     * </ul>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to authorize on this DB instance. This change is asynchronously applied
     *        as soon as possible.</p>
     *        <p>
     *        Not applicable. The associated list of EC2 VPC security groups is managed by the DB cluster. For more
     *        information, see <a>ModifyDBCluster</a>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match existing VpcSecurityGroupIds.
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
     * maintenance window. Some parameter changes can cause an outage and are applied on the next call to
     * <a>RebootDBInstance</a>, or the next failure reboot.
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
     *        maintenance window. Some parameter changes can cause an outage and are applied on the next call to
     *        <a>RebootDBInstance</a>, or the next failure reboot.
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
     * maintenance window. Some parameter changes can cause an outage and are applied on the next call to
     * <a>RebootDBInstance</a>, or the next failure reboot.
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
     *         maintenance window. Some parameter changes can cause an outage and are applied on the next call to
     *         <a>RebootDBInstance</a>, or the next failure reboot.
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
     * maintenance window. Some parameter changes can cause an outage and are applied on the next call to
     * <a>RebootDBInstance</a>, or the next failure reboot.
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
     *        maintenance window. Some parameter changes can cause an outage and are applied on the next call to
     *        <a>RebootDBInstance</a>, or the next failure reboot.
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
     * maintenance window. Some parameter changes can cause an outage and are applied on the next call to
     * <a>RebootDBInstance</a>, or the next failure reboot.
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
     *         maintenance window. Some parameter changes can cause an outage and are applied on the next call to
     *         <a>RebootDBInstance</a>, or the next failure reboot.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * The new password for the master user. The password can include any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @param masterUserPassword
     *        The new password for the master user. The password can include any printable ASCII character except "/",
     *        """, or "@".</p>
     *        <p>
     *        Not applicable.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The new password for the master user. The password can include any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @return The new password for the master user. The password can include any printable ASCII character except "/",
     *         """, or "@".</p>
     *         <p>
     *         Not applicable.
     *         </p>
     *         <p>
     *         Default: Uses existing setting
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The new password for the master user. The password can include any printable ASCII character except "/",
     * """, or "@".
     * </p>
     * <p>
     * Not applicable.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @param masterUserPassword
     *        The new password for the master user. The password can include any printable ASCII character except "/",
     *        """, or "@".</p>
     *        <p>
     *        Not applicable.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an
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
     *        The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an
     *        outage. The parameter group name itself is changed immediately, but the actual parameter changes are not
     *        applied until you reboot the instance without failover. The db instance will NOT be rebooted automatically
     *        and the parameter changes will NOT be applied during the next maintenance window.</p>
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
     * The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an
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
     * @return The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in
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
     * The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an
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
     *        The name of the DB parameter group to apply to the DB instance. Changing this setting doesn't result in an
     *        outage. The parameter group name itself is changed immediately, but the actual parameter changes are not
     *        applied until you reboot the instance without failover. The db instance will NOT be rebooted automatically
     *        and the parameter changes will NOT be applied during the next maintenance window.</p>
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
     * Not applicable. The retention period for automated backups is managed by the DB cluster. For more information,
     * see <a>ModifyDBCluster</a>.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days to retain automated backups. Setting this parameter to a positive number enables
     *        backups. Setting this parameter to 0 disables automated backups.</p>
     *        <p>
     *        Not applicable. The retention period for automated backups is managed by the DB cluster. For more
     *        information, see <a>ModifyDBCluster</a>.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
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
     * Not applicable. The retention period for automated backups is managed by the DB cluster. For more information,
     * see <a>ModifyDBCluster</a>.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @return The number of days to retain automated backups. Setting this parameter to a positive number enables
     *         backups. Setting this parameter to 0 disables automated backups.</p>
     *         <p>
     *         Not applicable. The retention period for automated backups is managed by the DB cluster. For more
     *         information, see <a>ModifyDBCluster</a>.
     *         </p>
     *         <p>
     *         Default: Uses existing setting
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
     * Not applicable. The retention period for automated backups is managed by the DB cluster. For more information,
     * see <a>ModifyDBCluster</a>.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days to retain automated backups. Setting this parameter to a positive number enables
     *        backups. Setting this parameter to 0 disables automated backups.</p>
     *        <p>
     *        Not applicable. The retention period for automated backups is managed by the DB cluster. For more
     *        information, see <a>ModifyDBCluster</a>.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled.
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more
     * information, see <a>ModifyDBCluster</a>.
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
     * Must be in Universal Time Coordinated (UTC)
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
     *        The daily time range during which automated backups are created if automated backups are enabled. </p>
     *        <p>
     *        Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more
     *        information, see <a>ModifyDBCluster</a>.
     *        </p>
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
     *        Must be in Universal Time Coordinated (UTC)
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
     * The daily time range during which automated backups are created if automated backups are enabled.
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more
     * information, see <a>ModifyDBCluster</a>.
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
     * Must be in Universal Time Coordinated (UTC)
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
     * @return The daily time range during which automated backups are created if automated backups are enabled. </p>
     *         <p>
     *         Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For
     *         more information, see <a>ModifyDBCluster</a>.
     *         </p>
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
     *         Must be in Universal Time Coordinated (UTC)
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
     * The daily time range during which automated backups are created if automated backups are enabled.
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more
     * information, see <a>ModifyDBCluster</a>.
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
     * Must be in Universal Time Coordinated (UTC)
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
     *        The daily time range during which automated backups are created if automated backups are enabled. </p>
     *        <p>
     *        Not applicable. The daily time range for creating automated backups is managed by the DB cluster. For more
     *        information, see <a>ModifyDBCluster</a>.
     *        </p>
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
     *        Must be in Universal Time Coordinated (UTC)
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
     * Changing this parameter doesn't result in an outage, except in the following situation, and the change is
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
     *        Changing this parameter doesn't result in an outage, except in the following situation, and the change is
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
     * Changing this parameter doesn't result in an outage, except in the following situation, and the change is
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
     *         outage. Changing this parameter doesn't result in an outage, except in the following situation, and the
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
     * Changing this parameter doesn't result in an outage, except in the following situation, and the change is
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
     *        Changing this parameter doesn't result in an outage, except in the following situation, and the change is
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
     * Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage and
     * the change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * set to <code>true</code> for this request.
     * </p>
     * 
     * @param multiAZ
     *        Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage
     *        and the change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is set to <code>true</code> for this request.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage and
     * the change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * set to <code>true</code> for this request.
     * </p>
     * 
     * @return Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an
     *         outage and the change is applied during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage and
     * the change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * set to <code>true</code> for this request.
     * </p>
     * 
     * @param multiAZ
     *        Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage
     *        and the change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is set to <code>true</code> for this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an outage and
     * the change is applied during the next maintenance window unless the <code>ApplyImmediately</code> parameter is
     * set to <code>true</code> for this request.
     * </p>
     * 
     * @return Specifies if the DB instance is a Multi-AZ deployment. Changing this parameter doesn't result in an
     *         outage and the change is applied during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request.
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
     * For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to upgrade to. Changing this parameter results in an outage and
     *        the change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is set to <code>true</code> for this request. </p>
     *        <p>
     *        For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter
     *        group in the DB parameter group family for the new engine version must be specified. The new DB parameter
     *        group can be the default for that DB parameter group family.
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
     * For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     * 
     * @return The version number of the database engine to upgrade to. Changing this parameter results in an outage and
     *         the change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *         parameter is set to <code>true</code> for this request. </p>
     *         <p>
     *         For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter
     *         group in the DB parameter group family for the new engine version must be specified. The new DB parameter
     *         group can be the default for that DB parameter group family.
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
     * For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter group in
     * the DB parameter group family for the new engine version must be specified. The new DB parameter group can be the
     * default for that DB parameter group family.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to upgrade to. Changing this parameter results in an outage and
     *        the change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     *        parameter is set to <code>true</code> for this request. </p>
     *        <p>
     *        For major version upgrades, if a nondefault DB parameter group is currently in use, a new DB parameter
     *        group in the DB parameter group family for the new engine version must be specified. The new DB parameter
     *        group can be the default for that DB parameter group family.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter that is a
     * different major version than the DB instance's current version.
     * </p>
     * 
     * @param allowMajorVersionUpgrade
     *        Indicates that major version upgrades are allowed. Changing this parameter doesn't result in an outage and
     *        the change is asynchronously applied as soon as possible.</p>
     *        <p>
     *        Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter
     *        that is a different major version than the DB instance's current version.
     */

    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that major version upgrades are allowed. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter that is a
     * different major version than the DB instance's current version.
     * </p>
     * 
     * @return Indicates that major version upgrades are allowed. Changing this parameter doesn't result in an outage
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
     * Indicates that major version upgrades are allowed. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter that is a
     * different major version than the DB instance's current version.
     * </p>
     * 
     * @param allowMajorVersionUpgrade
     *        Indicates that major version upgrades are allowed. Changing this parameter doesn't result in an outage and
     *        the change is asynchronously applied as soon as possible.</p>
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
     * Indicates that major version upgrades are allowed. Changing this parameter doesn't result in an outage and the
     * change is asynchronously applied as soon as possible.
     * </p>
     * <p>
     * Constraints: This parameter must be set to true when specifying a value for the EngineVersion parameter that is a
     * different major version than the DB instance's current version.
     * </p>
     * 
     * @return Indicates that major version upgrades are allowed. Changing this parameter doesn't result in an outage
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
     * Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window.
     * Changing this parameter doesn't result in an outage except in the following case and the change is asynchronously
     * applied as soon as possible. An outage will result if this parameter is set to <code>true</code> during the
     * maintenance window, and a newer minor version is available, and Neptune has enabled auto patching for that engine
     * version.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance
     *        window. Changing this parameter doesn't result in an outage except in the following case and the change is
     *        asynchronously applied as soon as possible. An outage will result if this parameter is set to
     *        <code>true</code> during the maintenance window, and a newer minor version is available, and Neptune has
     *        enabled auto patching for that engine version.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window.
     * Changing this parameter doesn't result in an outage except in the following case and the change is asynchronously
     * applied as soon as possible. An outage will result if this parameter is set to <code>true</code> during the
     * maintenance window, and a newer minor version is available, and Neptune has enabled auto patching for that engine
     * version.
     * </p>
     * 
     * @return Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance
     *         window. Changing this parameter doesn't result in an outage except in the following case and the change
     *         is asynchronously applied as soon as possible. An outage will result if this parameter is set to
     *         <code>true</code> during the maintenance window, and a newer minor version is available, and Neptune has
     *         enabled auto patching for that engine version.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window.
     * Changing this parameter doesn't result in an outage except in the following case and the change is asynchronously
     * applied as soon as possible. An outage will result if this parameter is set to <code>true</code> during the
     * maintenance window, and a newer minor version is available, and Neptune has enabled auto patching for that engine
     * version.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance
     *        window. Changing this parameter doesn't result in an outage except in the following case and the change is
     *        asynchronously applied as soon as possible. An outage will result if this parameter is set to
     *        <code>true</code> during the maintenance window, and a newer minor version is available, and Neptune has
     *        enabled auto patching for that engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance window.
     * Changing this parameter doesn't result in an outage except in the following case and the change is asynchronously
     * applied as soon as possible. An outage will result if this parameter is set to <code>true</code> during the
     * maintenance window, and a newer minor version is available, and Neptune has enabled auto patching for that engine
     * version.
     * </p>
     * 
     * @return Indicates that minor version upgrades are applied automatically to the DB instance during the maintenance
     *         window. Changing this parameter doesn't result in an outage except in the following case and the change
     *         is asynchronously applied as soon as possible. An outage will result if this parameter is set to
     *         <code>true</code> during the maintenance window, and a newer minor version is available, and Neptune has
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
     * The new Provisioned IOPS (I/O operations per second) value for the instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @param iops
     *        The new Provisioned IOPS (I/O operations per second) value for the instance. </p>
     *        <p>
     *        Changing this setting doesn't result in an outage and the change is applied during the next maintenance
     *        window unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request.
     *        </p>
     *        <p>
     *        Default: Uses existing setting
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The new Provisioned IOPS (I/O operations per second) value for the instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @return The new Provisioned IOPS (I/O operations per second) value for the instance. </p>
     *         <p>
     *         Changing this setting doesn't result in an outage and the change is applied during the next maintenance
     *         window unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request.
     *         </p>
     *         <p>
     *         Default: Uses existing setting
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The new Provisioned IOPS (I/O operations per second) value for the instance.
     * </p>
     * <p>
     * Changing this setting doesn't result in an outage and the change is applied during the next maintenance window
     * unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request.
     * </p>
     * <p>
     * Default: Uses existing setting
     * </p>
     * 
     * @param iops
     *        The new Provisioned IOPS (I/O operations per second) value for the instance. </p>
     *        <p>
     *        Changing this setting doesn't result in an outage and the change is applied during the next maintenance
     *        window unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request.
     *        </p>
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
     * Indicates that the DB instance should be associated with the specified option group. Changing this parameter
     * doesn't result in an outage except in the following case and the change is applied during the next maintenance
     * window unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. If the
     * parameter change results in an option group that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @param optionGroupName
     *        Indicates that the DB instance should be associated with the specified option group. Changing this
     *        parameter doesn't result in an outage except in the following case and the change is applied during the
     *        next maintenance window unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for
     *        this request. If the parameter change results in an option group that enables OEM, this change can cause a
     *        brief (sub-second) period during which new connections are rejected but existing connections are not
     *        interrupted. </p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *        option group, and that option group can't be removed from a DB instance once it is associated with a DB
     *        instance
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * Indicates that the DB instance should be associated with the specified option group. Changing this parameter
     * doesn't result in an outage except in the following case and the change is applied during the next maintenance
     * window unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. If the
     * parameter change results in an option group that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @return Indicates that the DB instance should be associated with the specified option group. Changing this
     *         parameter doesn't result in an outage except in the following case and the change is applied during the
     *         next maintenance window unless the <code>ApplyImmediately</code> parameter is set to <code>true</code>
     *         for this request. If the parameter change results in an option group that enables OEM, this change can
     *         cause a brief (sub-second) period during which new connections are rejected but existing connections are
     *         not interrupted. </p>
     *         <p>
     *         Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *         option group, and that option group can't be removed from a DB instance once it is associated with a DB
     *         instance
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * Indicates that the DB instance should be associated with the specified option group. Changing this parameter
     * doesn't result in an outage except in the following case and the change is applied during the next maintenance
     * window unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for this request. If the
     * parameter change results in an option group that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an option
     * group, and that option group can't be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @param optionGroupName
     *        Indicates that the DB instance should be associated with the specified option group. Changing this
     *        parameter doesn't result in an outage except in the following case and the change is applied during the
     *        next maintenance window unless the <code>ApplyImmediately</code> parameter is set to <code>true</code> for
     *        this request. If the parameter change results in an option group that enables OEM, this change can cause a
     *        brief (sub-second) period during which new connections are rejected but existing connections are not
     *        interrupted. </p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, can't be removed from an
     *        option group, and that option group can't be removed from a DB instance once it is associated with a DB
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
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
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
     *        Cannot end with a hyphen or contain two consecutive hyphens.
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
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
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
     *         Cannot end with a hyphen or contain two consecutive hyphens.
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
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
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
     *        Cannot end with a hyphen or contain two consecutive hyphens.
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
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * If you specify Provisioned IOPS (<code>io1</code>), you must also include a value for the <code>Iops</code>
     * parameter.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon Neptune operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>standard</code>
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB instance. </p>
     *        <p>
     *        If you specify Provisioned IOPS (<code>io1</code>), you must also include a value for the
     *        <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *        using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration
     *        depends on several factors such as database load, storage size, storage type (standard or Provisioned
     *        IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical
     *        migration times are under 24 hours, but the process can take up to several days in some cases. During the
     *        migration, the DB instance is available for use, but might experience performance degradation. While the
     *        migration takes place, nightly backups for the instance are suspended. No other Amazon Neptune operations
     *        can take place for the instance, including modifying the instance, rebooting the instance, deleting the
     *        instance, creating a Read Replica for the instance, and creating a DB snapshot of the instance.
     *        </p>
     *        <p>
     *        Valid values: <code>standard | gp2 | io1</code>
     *        </p>
     *        <p>
     *        Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>standard</code>
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * If you specify Provisioned IOPS (<code>io1</code>), you must also include a value for the <code>Iops</code>
     * parameter.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon Neptune operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>standard</code>
     * </p>
     * 
     * @return Specifies the storage type to be associated with the DB instance. </p>
     *         <p>
     *         If you specify Provisioned IOPS (<code>io1</code>), you must also include a value for the
     *         <code>Iops</code> parameter.
     *         </p>
     *         <p>
     *         If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *         using Provisioned IOPS to using standard storage, the process can take time. The duration of the
     *         migration depends on several factors such as database load, storage size, storage type (standard or
     *         Provisioned IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations.
     *         Typical migration times are under 24 hours, but the process can take up to several days in some cases.
     *         During the migration, the DB instance is available for use, but might experience performance degradation.
     *         While the migration takes place, nightly backups for the instance are suspended. No other Amazon Neptune
     *         operations can take place for the instance, including modifying the instance, rebooting the instance,
     *         deleting the instance, creating a Read Replica for the instance, and creating a DB snapshot of the
     *         instance.
     *         </p>
     *         <p>
     *         Valid values: <code>standard | gp2 | io1</code>
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
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * If you specify Provisioned IOPS (<code>io1</code>), you must also include a value for the <code>Iops</code>
     * parameter.
     * </p>
     * <p>
     * If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from using
     * Provisioned IOPS to using standard storage, the process can take time. The duration of the migration depends on
     * several factors such as database load, storage size, storage type (standard or Provisioned IOPS), amount of IOPS
     * provisioned (if any), and the number of prior scale storage operations. Typical migration times are under 24
     * hours, but the process can take up to several days in some cases. During the migration, the DB instance is
     * available for use, but might experience performance degradation. While the migration takes place, nightly backups
     * for the instance are suspended. No other Amazon Neptune operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance, creating a Read Replica for the instance,
     * and creating a DB snapshot of the instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>standard</code>
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB instance. </p>
     *        <p>
     *        If you specify Provisioned IOPS (<code>io1</code>), you must also include a value for the
     *        <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        If you choose to migrate your DB instance from using standard storage to using Provisioned IOPS, or from
     *        using Provisioned IOPS to using standard storage, the process can take time. The duration of the migration
     *        depends on several factors such as database load, storage size, storage type (standard or Provisioned
     *        IOPS), amount of IOPS provisioned (if any), and the number of prior scale storage operations. Typical
     *        migration times are under 24 hours, but the process can take up to several days in some cases. During the
     *        migration, the DB instance is available for use, but might experience performance degradation. While the
     *        migration takes place, nightly backups for the instance are suspended. No other Amazon Neptune operations
     *        can take place for the instance, including modifying the instance, rebooting the instance, deleting the
     *        instance, creating a Read Replica for the instance, and creating a DB snapshot of the instance.
     *        </p>
     *        <p>
     *        Valid values: <code>standard | gp2 | io1</code>
     *        </p>
     *        <p>
     *        Default: <code>io1</code> if the <code>Iops</code> parameter is specified, otherwise <code>standard</code>
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
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which to associate the instance for TDE encryption.
     */

    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * 
     * @return The ARN from the key store with which to associate the instance for TDE encryption.
     */

    public String getTdeCredentialArn() {
        return this.tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which to associate the instance for TDE encryption.
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
     * 
     * @param tdeCredentialPassword
     *        The password for the given ARN from the key store in order to access the device.
     */

    public void setTdeCredentialPassword(String tdeCredentialPassword) {
        this.tdeCredentialPassword = tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the device.
     * </p>
     * 
     * @return The password for the given ARN from the key store in order to access the device.
     */

    public String getTdeCredentialPassword() {
        return this.tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the device.
     * </p>
     * 
     * @param tdeCredentialPassword
     *        The password for the given ARN from the key store in order to access the device.
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
     * Not supported.
     * </p>
     * 
     * @param domain
     *        Not supported.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Not supported.
     * </p>
     * 
     * @return Not supported.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Not supported.
     * </p>
     * 
     * @param domain
     *        Not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the DB instance to snapshots of the DB instance, and otherwise false. The default is
     * false.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        True to copy all tags from the DB instance to snapshots of the DB instance, and otherwise false. The
     *        default is false.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * True to copy all tags from the DB instance to snapshots of the DB instance, and otherwise false. The default is
     * false.
     * </p>
     * 
     * @return True to copy all tags from the DB instance to snapshots of the DB instance, and otherwise false. The
     *         default is false.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * True to copy all tags from the DB instance to snapshots of the DB instance, and otherwise false. The default is
     * false.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        True to copy all tags from the DB instance to snapshots of the DB instance, and otherwise false. The
     *        default is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the DB instance to snapshots of the DB instance, and otherwise false. The default is
     * false.
     * </p>
     * 
     * @return True to copy all tags from the DB instance to snapshots of the DB instance, and otherwise false. The
     *         default is false.
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
     * Default: <code>8182</code>
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
     *        Default: <code>8182</code>
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
     * Default: <code>8182</code>
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
     *         Default: <code>8182</code>
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
     * Default: <code>8182</code>
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
     *        Default: <code>8182</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDBPortNumber(Integer dBPortNumber) {
        setDBPortNumber(dBPortNumber);
        return this;
    }

    /**
     * <p>
     * This parameter is not supported.
     * </p>
     * 
     * @param publiclyAccessible
     *        This parameter is not supported.
     */
    @Deprecated
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * This parameter is not supported.
     * </p>
     * 
     * @return This parameter is not supported.
     */
    @Deprecated
    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * This parameter is not supported.
     * </p>
     * 
     * @param publiclyAccessible
     *        This parameter is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public ModifyDBInstanceRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * This parameter is not supported.
     * </p>
     * 
     * @return This parameter is not supported.
     */
    @Deprecated
    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits Neptune to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits Neptune to send enhanced monitoring metrics to Amazon CloudWatch
     *        Logs. For example, <code>arn:aws:iam:123456789012:role/emaccess</code>. </p>
     *        <p>
     *        If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     *        <code>MonitoringRoleArn</code> value.
     */

    public void setMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits Neptune to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * 
     * @return The ARN for the IAM role that permits Neptune to send enhanced monitoring metrics to Amazon CloudWatch
     *         Logs. For example, <code>arn:aws:iam:123456789012:role/emaccess</code>. </p>
     *         <p>
     *         If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     *         <code>MonitoringRoleArn</code> value.
     */

    public String getMonitoringRoleArn() {
        return this.monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits Neptune to send enhanced monitoring metrics to Amazon CloudWatch Logs. For
     * example, <code>arn:aws:iam:123456789012:role/emaccess</code>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits Neptune to send enhanced monitoring metrics to Amazon CloudWatch
     *        Logs. For example, <code>arn:aws:iam:123456789012:role/emaccess</code>. </p>
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
     * Not supported
     * </p>
     * 
     * @param domainIAMRoleName
     *        Not supported
     */

    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    /**
     * <p>
     * Not supported
     * </p>
     * 
     * @return Not supported
     */

    public String getDomainIAMRoleName() {
        return this.domainIAMRoleName;
    }

    /**
     * <p>
     * Not supported
     * </p>
     * 
     * @param domainIAMRoleName
     *        Not supported
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withDomainIAMRoleName(String domainIAMRoleName) {
        setDomainIAMRoleName(domainIAMRoleName);
        return this;
    }

    /**
     * <p>
     * A value that specifies the order in which a Read Replica is promoted to the primary instance after a failure of
     * the existing primary instance.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which a Read Replica is promoted to the primary instance after a
     *        failure of the existing primary instance. </p>
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
     * A value that specifies the order in which a Read Replica is promoted to the primary instance after a failure of
     * the existing primary instance.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     * 
     * @return A value that specifies the order in which a Read Replica is promoted to the primary instance after a
     *         failure of the existing primary instance. </p>
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
     * A value that specifies the order in which a Read Replica is promoted to the primary instance after a failure of
     * the existing primary instance.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which a Read Replica is promoted to the primary instance after a
     *        failure of the existing primary instance. </p>
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
     * <p>
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise
     * false.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database engines
     * </p>
     * <p>
     * Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster. For more information,
     * see <a>ModifyDBCluster</a>.
     * </p>
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
     *        <p>
     *        Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster. For more
     *        information, see <a>ModifyDBCluster</a>.
     *        </p>
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
     * <p>
     * Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster. For more information,
     * see <a>ModifyDBCluster</a>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and
     *         otherwise false.</p>
     *         <p>
     *         You can enable IAM database authentication for the following database engines
     *         </p>
     *         <p>
     *         Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster. For more
     *         information, see <a>ModifyDBCluster</a>.
     *         </p>
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
     * <p>
     * Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster. For more information,
     * see <a>ModifyDBCluster</a>.
     * </p>
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
     *        <p>
     *        Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster. For more
     *        information, see <a>ModifyDBCluster</a>.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
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
     * <p>
     * Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster. For more information,
     * see <a>ModifyDBCluster</a>.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and
     *         otherwise false.</p>
     *         <p>
     *         You can enable IAM database authentication for the following database engines
     *         </p>
     *         <p>
     *         Not applicable. Mapping AWS IAM accounts to database accounts is managed by the DB cluster. For more
     *         information, see <a>ModifyDBCluster</a>.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * True to enable Performance Insights for the DB instance, and otherwise false.
     * </p>
     * 
     * @param enablePerformanceInsights
     *        True to enable Performance Insights for the DB instance, and otherwise false.
     */

    public void setEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        this.enablePerformanceInsights = enablePerformanceInsights;
    }

    /**
     * <p>
     * True to enable Performance Insights for the DB instance, and otherwise false.
     * </p>
     * 
     * @return True to enable Performance Insights for the DB instance, and otherwise false.
     */

    public Boolean getEnablePerformanceInsights() {
        return this.enablePerformanceInsights;
    }

    /**
     * <p>
     * True to enable Performance Insights for the DB instance, and otherwise false.
     * </p>
     * 
     * @param enablePerformanceInsights
     *        True to enable Performance Insights for the DB instance, and otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        setEnablePerformanceInsights(enablePerformanceInsights);
        return this;
    }

    /**
     * <p>
     * True to enable Performance Insights for the DB instance, and otherwise false.
     * </p>
     * 
     * @return True to enable Performance Insights for the DB instance, and otherwise false.
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

    public ModifyDBInstanceRequest withPerformanceInsightsKMSKeyId(String performanceInsightsKMSKeyId) {
        setPerformanceInsightsKMSKeyId(performanceInsightsKMSKeyId);
        return this;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * instance or DB cluster.
     * </p>
     * 
     * @param cloudwatchLogsExportConfiguration
     *        The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     *        instance or DB cluster.
     */

    public void setCloudwatchLogsExportConfiguration(CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration) {
        this.cloudwatchLogsExportConfiguration = cloudwatchLogsExportConfiguration;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * instance or DB cluster.
     * </p>
     * 
     * @return The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     *         instance or DB cluster.
     */

    public CloudwatchLogsExportConfiguration getCloudwatchLogsExportConfiguration() {
        return this.cloudwatchLogsExportConfiguration;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * instance or DB cluster.
     * </p>
     * 
     * @param cloudwatchLogsExportConfiguration
     *        The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     *        instance or DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBInstanceRequest withCloudwatchLogsExportConfiguration(CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration) {
        setCloudwatchLogsExportConfiguration(cloudwatchLogsExportConfiguration);
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
        if (getPromotionTier() != null)
            sb.append("PromotionTier: ").append(getPromotionTier()).append(",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: ").append(getEnableIAMDatabaseAuthentication()).append(",");
        if (getEnablePerformanceInsights() != null)
            sb.append("EnablePerformanceInsights: ").append(getEnablePerformanceInsights()).append(",");
        if (getPerformanceInsightsKMSKeyId() != null)
            sb.append("PerformanceInsightsKMSKeyId: ").append(getPerformanceInsightsKMSKeyId()).append(",");
        if (getCloudwatchLogsExportConfiguration() != null)
            sb.append("CloudwatchLogsExportConfiguration: ").append(getCloudwatchLogsExportConfiguration());
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
        if (other.getCloudwatchLogsExportConfiguration() == null ^ this.getCloudwatchLogsExportConfiguration() == null)
            return false;
        if (other.getCloudwatchLogsExportConfiguration() != null
                && other.getCloudwatchLogsExportConfiguration().equals(this.getCloudwatchLogsExportConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getEnableIAMDatabaseAuthentication() == null) ? 0 : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode + ((getEnablePerformanceInsights() == null) ? 0 : getEnablePerformanceInsights().hashCode());
        hashCode = prime * hashCode + ((getPerformanceInsightsKMSKeyId() == null) ? 0 : getPerformanceInsightsKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getCloudwatchLogsExportConfiguration() == null) ? 0 : getCloudwatchLogsExportConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBInstanceRequest clone() {
        return (ModifyDBInstanceRequest) super.clone();
    }

}
