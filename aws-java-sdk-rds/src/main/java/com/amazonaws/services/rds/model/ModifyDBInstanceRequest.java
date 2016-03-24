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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#modifyDBInstance(ModifyDBInstanceRequest) ModifyDBInstance operation}.
 * <p>
 * Modify settings for a DB instance. You can change one or more
 * database configuration parameters by specifying these parameters and
 * the new values in the request.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#modifyDBInstance(ModifyDBInstanceRequest)
 */
public class ModifyDBInstanceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The DB instance identifier. This value is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must be the identifier for an
     * existing DB instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     */
    private String dBInstanceIdentifier;

    /**
     * The new storage capacity of the RDS instance. Changing this setting
     * does not result in an outage and the change is applied during the next
     * maintenance window unless <code>ApplyImmediately</code> is set to
     * <code>true</code> for this request. <p> <b>MySQL</b> <p>Default: Uses
     * existing setting <p>Valid Values: 5-6144 <p>Constraints: Value
     * supplied must be at least 10% greater than the current value. Values
     * that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value. <p>Type:
     * Integer <p> <b>MariaDB</b> <p>Default: Uses existing setting <p>Valid
     * Values: 5-6144 <p>Constraints: Value supplied must be at least 10%
     * greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10%
     * greater than the current value. <p>Type: Integer <p> <b>PostgreSQL</b>
     * <p>Default: Uses existing setting <p>Valid Values: 5-6144
     * <p>Constraints: Value supplied must be at least 10% greater than the
     * current value. Values that are not at least 10% greater than the
     * existing value are rounded up so that they are 10% greater than the
     * current value. <p>Type: Integer <p> <b>Oracle</b> <p>Default: Uses
     * existing setting <p>Valid Values: 10-6144 <p>Constraints: Value
     * supplied must be at least 10% greater than the current value. Values
     * that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value. <p> <b>SQL
     * Server</b> <p>Cannot be modified. <p> If you choose to migrate your DB
     * instance from using standard storage to using Provisioned IOPS, or
     * from using Provisioned IOPS to using standard storage, the process can
     * take time. The duration of the migration depends on several factors
     * such as database load, storage size, storage type (standard or
     * Provisioned IOPS), amount of IOPS provisioned (if any), and the number
     * of prior scale storage operations. Typical migration times are under
     * 24 hours, but the process can take up to several days in some cases.
     * During the migration, the DB instance will be available for use, but
     * might experience performance degradation. While the migration takes
     * place, nightly backups for the instance will be suspended. No other
     * Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance,
     * creating a Read Replica for the instance, and creating a DB snapshot
     * of the instance.
     */
    private Integer allocatedStorage;

    /**
     * The new compute and memory capacity of the DB instance. To determine
     * the instance classes that are available for a particular DB engine,
     * use the <a>DescribeOrderableDBInstanceOptions</a> action. <p> Passing
     * a value for this setting causes an outage during the change and is
     * applied during the next maintenance window, unless
     * <code>ApplyImmediately</code> is specified as <code>true</code> for
     * this request. <p>Default: Uses existing setting <p>Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     * db.m1.xlarge | db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     * db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     * db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     * db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     * db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     * db.t2.medium | db.t2.large</code>
     */
    private String dBInstanceClass;

    /**
     * A list of DB security groups to authorize on this DB instance.
     * Changing this setting does not result in an outage and the change is
     * asynchronously applied as soon as possible. <p>Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> dBSecurityGroups;

    /**
     * A list of EC2 VPC security groups to authorize on this DB instance.
     * This change is asynchronously applied as soon as possible.
     * <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIds;

    /**
     * Specifies whether the modifications in this request and any pending
     * modifications are asynchronously applied as soon as possible,
     * regardless of the <code>PreferredMaintenanceWindow</code> setting for
     * the DB instance. <p> If this parameter is set to <code>false</code>,
     * changes to the DB instance are applied during the next maintenance
     * window. Some parameter changes can cause an outage and will be applied
     * on the next call to <a>RebootDBInstance</a>, or the next failure
     * reboot. Review the table of parameters in <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     * a DB Instance and Using the Apply Immediately Parameter</a> to see the
     * impact that setting <code>ApplyImmediately</code> to <code>true</code>
     * or <code>false</code> has for each modified parameter and to determine
     * when the changes will be applied. <p>Default: <code>false</code>
     */
    private Boolean applyImmediately;

    /**
     * The new password for the DB instance master user. Can be any printable
     * ASCII character except "/", """, or "@". <p> Changing this parameter
     * does not result in an outage and the change is asynchronously applied
     * as soon as possible. Between the time of the request and the
     * completion of the request, the <code>MasterUserPassword</code> element
     * exists in the <code>PendingModifiedValues</code> element of the
     * operation response. <p>Default: Uses existing setting <p>Constraints:
     * Must be 8 to 41 alphanumeric characters (MySQL, MariaDB, and Amazon
     * Aurora), 8 to 30 alphanumeric characters (Oracle), or 8 to 128
     * alphanumeric characters (SQL Server). <note> Amazon RDS API actions
     * never return the password, so this action provides a way to regain
     * access to a primary instance user if the password is lost. This
     * includes restoring privileges that might have been accidentally
     * revoked. </note>
     */
    private String masterUserPassword;

    /**
     * The name of the DB parameter group to apply to the DB instance.
     * Changing this setting does not result in an outage. The parameter
     * group name itself is changed immediately, but the actual parameter
     * changes are not applied until you reboot the instance without
     * failover. The db instance will NOT be rebooted automatically and the
     * parameter changes will NOT be applied during the next maintenance
     * window. <p>Default: Uses existing setting <p>Constraints: The DB
     * parameter group must be in the same DB parameter group family as this
     * DB instance.
     */
    private String dBParameterGroupName;

    /**
     * The number of days to retain automated backups. Setting this parameter
     * to a positive number enables backups. Setting this parameter to 0
     * disables automated backups. <p>Changing this parameter can result in
     * an outage if you change from 0 to a non-zero value or from a non-zero
     * value to 0. These changes are applied during the next maintenance
     * window unless the <code>ApplyImmediately</code> parameter is set to
     * <code>true</code> for this request. If you change the parameter from
     * one non-zero value to another non-zero value, the change is
     * asynchronously applied as soon as possible. <p>Default: Uses existing
     * setting <p>Constraints: <ul> <li>Must be a value from 0 to 35</li>
     * <li>Can be specified for a MySQL Read Replica only if the source is
     * running MySQL 5.6</li> <li>Can be specified for a PostgreSQL Read
     * Replica only if the source is running PostgreSQL 9.3.5</li> <li>Cannot
     * be set to 0 if the DB instance is a source to Read Replicas</li> </ul>
     */
    private Integer backupRetentionPeriod;

    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code> parameter. Changing this parameter
     * does not result in an outage and the change is asynchronously applied
     * as soon as possible. <p>Constraints: <ul> <li>Must be in the format
     * hh24:mi-hh24:mi</li> <li>Times should be in Universal Time Coordinated
     * (UTC)</li> <li>Must not conflict with the preferred maintenance
     * window</li> <li>Must be at least 30 minutes</li> </ul>
     */
    private String preferredBackupWindow;

    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur, which might result in an outage. Changing this parameter does
     * not result in an outage, except in the following situation, and the
     * change is asynchronously applied as soon as possible. If there are
     * pending actions that cause a reboot, and the maintenance window is
     * changed to include the current time, then changing this parameter will
     * cause a reboot of the DB instance. If moving this window to the
     * current time, there must be at least 30 minutes between the current
     * time and end of the window to ensure pending changes are applied.
     * <p>Default: Uses existing setting <p>Format: ddd:hh24:mi-ddd:hh24:mi
     * <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints:
     * Must be at least 30 minutes
     */
    private String preferredMaintenanceWindow;

    /**
     * Specifies if the DB instance is a Multi-AZ deployment. Changing this
     * parameter does not result in an outage and the change is applied
     * during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code>
     * for this request. <p>Constraints: Cannot be specified if the DB
     * instance is a Read Replica. This parameter cannot be used with SQL
     * Server DB instances. Multi-AZ for SQL Server DB instances is set using
     * the Mirroring option in an option group associated with the DB
     * instance.
     */
    private Boolean multiAZ;

    /**
     * The version number of the database engine to upgrade to. Changing this
     * parameter results in an outage and the change is applied during the
     * next maintenance window unless the <code>ApplyImmediately</code>
     * parameter is set to <code>true</code> for this request. <p> For major
     * version upgrades, if a non-default DB parameter group is currently in
     * use, a new DB parameter group in the DB parameter group family for the
     * new engine version must be specified. The new DB parameter group can
     * be the default for that DB parameter group family. <p>For a list of
     * valid engine versions, see <a>CreateDBInstance</a>.
     */
    private String engineVersion;

    /**
     * Indicates that major version upgrades are allowed. Changing this
     * parameter does not result in an outage and the change is
     * asynchronously applied as soon as possible. <p>Constraints: This
     * parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB
     * instance's current version.
     */
    private Boolean allowMajorVersionUpgrade;

    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB instance during the maintenance window. Changing this parameter
     * does not result in an outage except in the following case and the
     * change is asynchronously applied as soon as possible. An outage will
     * result if this parameter is set to <code>true</code> during the
     * maintenance window, and a newer minor version is available, and RDS
     * has enabled auto patching for that engine version.
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * The new Provisioned IOPS (I/O operations per second) value for the RDS
     * instance. Changing this setting does not result in an outage and the
     * change is applied during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code>
     * for this request. <p>Default: Uses existing setting <p>Constraints:
     * Value supplied must be at least 10% greater than the current value.
     * Values that are not at least 10% greater than the existing value are
     * rounded up so that they are 10% greater than the current value. If you
     * are migrating from Provisioned IOPS to standard storage, set this
     * value to 0. The DB instance will require a reboot for the change in
     * storage type to take effect. <p> <b>SQL Server</b> <p>Setting the IOPS
     * value for the SQL Server database engine is not supported. <p>Type:
     * Integer <p> If you choose to migrate your DB instance from using
     * standard storage to using Provisioned IOPS, or from using Provisioned
     * IOPS to using standard storage, the process can take time. The
     * duration of the migration depends on several factors such as database
     * load, storage size, storage type (standard or Provisioned IOPS),
     * amount of IOPS provisioned (if any), and the number of prior scale
     * storage operations. Typical migration times are under 24 hours, but
     * the process can take up to several days in some cases. During the
     * migration, the DB instance will be available for use, but might
     * experience performance degradation. While the migration takes place,
     * nightly backups for the instance will be suspended. No other Amazon
     * RDS operations can take place for the instance, including modifying
     * the instance, rebooting the instance, deleting the instance, creating
     * a Read Replica for the instance, and creating a DB snapshot of the
     * instance.
     */
    private Integer iops;

    /**
     * Indicates that the DB instance should be associated with the specified
     * option group. Changing this parameter does not result in an outage
     * except in the following case and the change is applied during the next
     * maintenance window unless the <code>ApplyImmediately</code> parameter
     * is set to <code>true</code> for this request. If the parameter change
     * results in an option group that enables OEM, this change can cause a
     * brief (sub-second) period during which new connections are rejected
     * but existing connections are not interrupted. <p> Permanent options,
     * such as the TDE option for Oracle Advanced Security TDE, cannot be
     * removed from an option group, and that option group cannot be removed
     * from a DB instance once it is associated with a DB instance
     */
    private String optionGroupName;

    /**
     * The new DB instance identifier for the DB instance when renaming a DB
     * instance. When you change the DB instance identifier, an instance
     * reboot will occur immediately if you set <code>Apply
     * Immediately</code> to true, or will occur during the next maintenance
     * window if <code>Apply Immediately</code> to false. This value is
     * stored as a lowercase string. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     */
    private String newDBInstanceIdentifier;

    /**
     * Specifies the storage type to be associated with the DB instance. <p>
     * Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     * <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     * <code>Iops</code> parameter is specified; otherwise
     * <code>standard</code>
     */
    private String storageType;

    /**
     * The ARN from the Key Store with which to associate the instance for
     * TDE encryption.
     */
    private String tdeCredentialArn;

    /**
     * The password for the given ARN from the Key Store in order to access
     * the device.
     */
    private String tdeCredentialPassword;

    /**
     * Indicates the certificate that needs to be associated with the
     * instance.
     */
    private String cACertificateIdentifier;

    /**
     * Specify the Active Directory Domain to move the instance to. <p>The
     * specified Active Directory Domain must be created prior to this
     * operation. Currently only a SQL Server instance can be created in a
     * Active Directory Domain.
     */
    private String domain;

    /**
     * True to copy all tags from the DB instance to snapshots of the DB
     * instance; otherwise false. The default is false.
     */
    private Boolean copyTagsToSnapshot;

    /**
     * The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the DB instance. To disable collecting
     * Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     * <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     * Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     */
    private Integer monitoringInterval;

    /**
     * The port number on which the database accepts connections. <p>The
     * value of the <code>DBPortNumber</code> parameter must not match any of
     * the port values specified for options in the option group for the DB
     * instance. <p>Your database will restart when you change the
     * <code>DBPortNumber</code> value regardless of the value of the
     * <code>ApplyImmediately</code> parameter. <p> <b>MySQL</b> <p> Default:
     * <code>3306</code> <p> Valid Values: <code>1150-65535</code> <p>
     * <b>MariaDB</b> <p> Default: <code>3306</code> <p> Valid Values:
     * <code>1150-65535</code> <p> <b>PostgreSQL</b> <p> Default:
     * <code>5432</code> <p> Valid Values: <code>1150-65535</code> <p>Type:
     * Integer <p> <b>Oracle</b> <p> Default: <code>1521</code> <p> Valid
     * Values: <code>1150-65535</code> <p> <b>SQL Server</b> <p> Default:
     * <code>1433</code> <p> Valid Values: <code>1150-65535</code> except for
     * <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * <p> <b>Amazon Aurora</b> <p> Default: <code>3306</code> <p> Valid
     * Values: <code>1150-65535</code>
     */
    private Integer dBPortNumber;

    /**
     * Boolean value that indicates if the DB instance has a publicly
     * resolvable DNS name. Set to <code>True</code> to make the DB instance
     * Internet-facing with a publicly resolvable DNS name, which resolves to
     * a public IP address. Set to <code>False</code> to make the DB instance
     * internal with a DNS name that resolves to a private IP address.
     * <p><code>PubliclyAccessible</code> only applies to DB instances in a
     * VPC. The DB instance must be part of a public subnet and
     * <code>PubliclyAccessible</code> must be true in order for it to be
     * publicly accessible. <p>Changes to the <code>PubliclyAccessible</code>
     * parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter. <p> Default: false
     */
    private Boolean publiclyAccessible;

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
     * Specify the name of the IAM role to be used when making API calls to
     * the Directory Service.
     */
    private String domainIAMRoleName;

    /**
     * A value that specifies the order in which an Aurora Replica is
     * promoted to the primary instance after a failure of the existing
     * primary instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>. <p>Default: 1 <p>Valid
     * Values: 0 - 15
     */
    private Integer promotionTier;

    /**
     * Default constructor for a new ModifyDBInstanceRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ModifyDBInstanceRequest() {}
    
    /**
     * Constructs a new ModifyDBInstanceRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBInstanceIdentifier The DB instance identifier. This value is
     * stored as a lowercase string. <p>Constraints: <ul> <li>Must be the
     * identifier for an existing DB instance</li> <li>Must contain from 1 to
     * 63 alphanumeric characters or hyphens</li> <li>First character must be
     * a letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     */
    public ModifyDBInstanceRequest(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
    }

    /**
     * The DB instance identifier. This value is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must be the identifier for an
     * existing DB instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     *
     * @return The DB instance identifier. This value is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must be the identifier for an
     *         existing DB instance</li> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier. This value is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must be the identifier for an
     * existing DB instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     *
     * @param dBInstanceIdentifier The DB instance identifier. This value is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must be the identifier for an
     *         existing DB instance</li> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier. This value is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must be the identifier for an
     * existing DB instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB instance identifier. This value is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must be the identifier for an
     *         existing DB instance</li> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * The new storage capacity of the RDS instance. Changing this setting
     * does not result in an outage and the change is applied during the next
     * maintenance window unless <code>ApplyImmediately</code> is set to
     * <code>true</code> for this request. <p> <b>MySQL</b> <p>Default: Uses
     * existing setting <p>Valid Values: 5-6144 <p>Constraints: Value
     * supplied must be at least 10% greater than the current value. Values
     * that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value. <p>Type:
     * Integer <p> <b>MariaDB</b> <p>Default: Uses existing setting <p>Valid
     * Values: 5-6144 <p>Constraints: Value supplied must be at least 10%
     * greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10%
     * greater than the current value. <p>Type: Integer <p> <b>PostgreSQL</b>
     * <p>Default: Uses existing setting <p>Valid Values: 5-6144
     * <p>Constraints: Value supplied must be at least 10% greater than the
     * current value. Values that are not at least 10% greater than the
     * existing value are rounded up so that they are 10% greater than the
     * current value. <p>Type: Integer <p> <b>Oracle</b> <p>Default: Uses
     * existing setting <p>Valid Values: 10-6144 <p>Constraints: Value
     * supplied must be at least 10% greater than the current value. Values
     * that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value. <p> <b>SQL
     * Server</b> <p>Cannot be modified. <p> If you choose to migrate your DB
     * instance from using standard storage to using Provisioned IOPS, or
     * from using Provisioned IOPS to using standard storage, the process can
     * take time. The duration of the migration depends on several factors
     * such as database load, storage size, storage type (standard or
     * Provisioned IOPS), amount of IOPS provisioned (if any), and the number
     * of prior scale storage operations. Typical migration times are under
     * 24 hours, but the process can take up to several days in some cases.
     * During the migration, the DB instance will be available for use, but
     * might experience performance degradation. While the migration takes
     * place, nightly backups for the instance will be suspended. No other
     * Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance,
     * creating a Read Replica for the instance, and creating a DB snapshot
     * of the instance.
     *
     * @return The new storage capacity of the RDS instance. Changing this setting
     *         does not result in an outage and the change is applied during the next
     *         maintenance window unless <code>ApplyImmediately</code> is set to
     *         <code>true</code> for this request. <p> <b>MySQL</b> <p>Default: Uses
     *         existing setting <p>Valid Values: 5-6144 <p>Constraints: Value
     *         supplied must be at least 10% greater than the current value. Values
     *         that are not at least 10% greater than the existing value are rounded
     *         up so that they are 10% greater than the current value. <p>Type:
     *         Integer <p> <b>MariaDB</b> <p>Default: Uses existing setting <p>Valid
     *         Values: 5-6144 <p>Constraints: Value supplied must be at least 10%
     *         greater than the current value. Values that are not at least 10%
     *         greater than the existing value are rounded up so that they are 10%
     *         greater than the current value. <p>Type: Integer <p> <b>PostgreSQL</b>
     *         <p>Default: Uses existing setting <p>Valid Values: 5-6144
     *         <p>Constraints: Value supplied must be at least 10% greater than the
     *         current value. Values that are not at least 10% greater than the
     *         existing value are rounded up so that they are 10% greater than the
     *         current value. <p>Type: Integer <p> <b>Oracle</b> <p>Default: Uses
     *         existing setting <p>Valid Values: 10-6144 <p>Constraints: Value
     *         supplied must be at least 10% greater than the current value. Values
     *         that are not at least 10% greater than the existing value are rounded
     *         up so that they are 10% greater than the current value. <p> <b>SQL
     *         Server</b> <p>Cannot be modified. <p> If you choose to migrate your DB
     *         instance from using standard storage to using Provisioned IOPS, or
     *         from using Provisioned IOPS to using standard storage, the process can
     *         take time. The duration of the migration depends on several factors
     *         such as database load, storage size, storage type (standard or
     *         Provisioned IOPS), amount of IOPS provisioned (if any), and the number
     *         of prior scale storage operations. Typical migration times are under
     *         24 hours, but the process can take up to several days in some cases.
     *         During the migration, the DB instance will be available for use, but
     *         might experience performance degradation. While the migration takes
     *         place, nightly backups for the instance will be suspended. No other
     *         Amazon RDS operations can take place for the instance, including
     *         modifying the instance, rebooting the instance, deleting the instance,
     *         creating a Read Replica for the instance, and creating a DB snapshot
     *         of the instance.
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }
    
    /**
     * The new storage capacity of the RDS instance. Changing this setting
     * does not result in an outage and the change is applied during the next
     * maintenance window unless <code>ApplyImmediately</code> is set to
     * <code>true</code> for this request. <p> <b>MySQL</b> <p>Default: Uses
     * existing setting <p>Valid Values: 5-6144 <p>Constraints: Value
     * supplied must be at least 10% greater than the current value. Values
     * that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value. <p>Type:
     * Integer <p> <b>MariaDB</b> <p>Default: Uses existing setting <p>Valid
     * Values: 5-6144 <p>Constraints: Value supplied must be at least 10%
     * greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10%
     * greater than the current value. <p>Type: Integer <p> <b>PostgreSQL</b>
     * <p>Default: Uses existing setting <p>Valid Values: 5-6144
     * <p>Constraints: Value supplied must be at least 10% greater than the
     * current value. Values that are not at least 10% greater than the
     * existing value are rounded up so that they are 10% greater than the
     * current value. <p>Type: Integer <p> <b>Oracle</b> <p>Default: Uses
     * existing setting <p>Valid Values: 10-6144 <p>Constraints: Value
     * supplied must be at least 10% greater than the current value. Values
     * that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value. <p> <b>SQL
     * Server</b> <p>Cannot be modified. <p> If you choose to migrate your DB
     * instance from using standard storage to using Provisioned IOPS, or
     * from using Provisioned IOPS to using standard storage, the process can
     * take time. The duration of the migration depends on several factors
     * such as database load, storage size, storage type (standard or
     * Provisioned IOPS), amount of IOPS provisioned (if any), and the number
     * of prior scale storage operations. Typical migration times are under
     * 24 hours, but the process can take up to several days in some cases.
     * During the migration, the DB instance will be available for use, but
     * might experience performance degradation. While the migration takes
     * place, nightly backups for the instance will be suspended. No other
     * Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance,
     * creating a Read Replica for the instance, and creating a DB snapshot
     * of the instance.
     *
     * @param allocatedStorage The new storage capacity of the RDS instance. Changing this setting
     *         does not result in an outage and the change is applied during the next
     *         maintenance window unless <code>ApplyImmediately</code> is set to
     *         <code>true</code> for this request. <p> <b>MySQL</b> <p>Default: Uses
     *         existing setting <p>Valid Values: 5-6144 <p>Constraints: Value
     *         supplied must be at least 10% greater than the current value. Values
     *         that are not at least 10% greater than the existing value are rounded
     *         up so that they are 10% greater than the current value. <p>Type:
     *         Integer <p> <b>MariaDB</b> <p>Default: Uses existing setting <p>Valid
     *         Values: 5-6144 <p>Constraints: Value supplied must be at least 10%
     *         greater than the current value. Values that are not at least 10%
     *         greater than the existing value are rounded up so that they are 10%
     *         greater than the current value. <p>Type: Integer <p> <b>PostgreSQL</b>
     *         <p>Default: Uses existing setting <p>Valid Values: 5-6144
     *         <p>Constraints: Value supplied must be at least 10% greater than the
     *         current value. Values that are not at least 10% greater than the
     *         existing value are rounded up so that they are 10% greater than the
     *         current value. <p>Type: Integer <p> <b>Oracle</b> <p>Default: Uses
     *         existing setting <p>Valid Values: 10-6144 <p>Constraints: Value
     *         supplied must be at least 10% greater than the current value. Values
     *         that are not at least 10% greater than the existing value are rounded
     *         up so that they are 10% greater than the current value. <p> <b>SQL
     *         Server</b> <p>Cannot be modified. <p> If you choose to migrate your DB
     *         instance from using standard storage to using Provisioned IOPS, or
     *         from using Provisioned IOPS to using standard storage, the process can
     *         take time. The duration of the migration depends on several factors
     *         such as database load, storage size, storage type (standard or
     *         Provisioned IOPS), amount of IOPS provisioned (if any), and the number
     *         of prior scale storage operations. Typical migration times are under
     *         24 hours, but the process can take up to several days in some cases.
     *         During the migration, the DB instance will be available for use, but
     *         might experience performance degradation. While the migration takes
     *         place, nightly backups for the instance will be suspended. No other
     *         Amazon RDS operations can take place for the instance, including
     *         modifying the instance, rebooting the instance, deleting the instance,
     *         creating a Read Replica for the instance, and creating a DB snapshot
     *         of the instance.
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }
    
    /**
     * The new storage capacity of the RDS instance. Changing this setting
     * does not result in an outage and the change is applied during the next
     * maintenance window unless <code>ApplyImmediately</code> is set to
     * <code>true</code> for this request. <p> <b>MySQL</b> <p>Default: Uses
     * existing setting <p>Valid Values: 5-6144 <p>Constraints: Value
     * supplied must be at least 10% greater than the current value. Values
     * that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value. <p>Type:
     * Integer <p> <b>MariaDB</b> <p>Default: Uses existing setting <p>Valid
     * Values: 5-6144 <p>Constraints: Value supplied must be at least 10%
     * greater than the current value. Values that are not at least 10%
     * greater than the existing value are rounded up so that they are 10%
     * greater than the current value. <p>Type: Integer <p> <b>PostgreSQL</b>
     * <p>Default: Uses existing setting <p>Valid Values: 5-6144
     * <p>Constraints: Value supplied must be at least 10% greater than the
     * current value. Values that are not at least 10% greater than the
     * existing value are rounded up so that they are 10% greater than the
     * current value. <p>Type: Integer <p> <b>Oracle</b> <p>Default: Uses
     * existing setting <p>Valid Values: 10-6144 <p>Constraints: Value
     * supplied must be at least 10% greater than the current value. Values
     * that are not at least 10% greater than the existing value are rounded
     * up so that they are 10% greater than the current value. <p> <b>SQL
     * Server</b> <p>Cannot be modified. <p> If you choose to migrate your DB
     * instance from using standard storage to using Provisioned IOPS, or
     * from using Provisioned IOPS to using standard storage, the process can
     * take time. The duration of the migration depends on several factors
     * such as database load, storage size, storage type (standard or
     * Provisioned IOPS), amount of IOPS provisioned (if any), and the number
     * of prior scale storage operations. Typical migration times are under
     * 24 hours, but the process can take up to several days in some cases.
     * During the migration, the DB instance will be available for use, but
     * might experience performance degradation. While the migration takes
     * place, nightly backups for the instance will be suspended. No other
     * Amazon RDS operations can take place for the instance, including
     * modifying the instance, rebooting the instance, deleting the instance,
     * creating a Read Replica for the instance, and creating a DB snapshot
     * of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocatedStorage The new storage capacity of the RDS instance. Changing this setting
     *         does not result in an outage and the change is applied during the next
     *         maintenance window unless <code>ApplyImmediately</code> is set to
     *         <code>true</code> for this request. <p> <b>MySQL</b> <p>Default: Uses
     *         existing setting <p>Valid Values: 5-6144 <p>Constraints: Value
     *         supplied must be at least 10% greater than the current value. Values
     *         that are not at least 10% greater than the existing value are rounded
     *         up so that they are 10% greater than the current value. <p>Type:
     *         Integer <p> <b>MariaDB</b> <p>Default: Uses existing setting <p>Valid
     *         Values: 5-6144 <p>Constraints: Value supplied must be at least 10%
     *         greater than the current value. Values that are not at least 10%
     *         greater than the existing value are rounded up so that they are 10%
     *         greater than the current value. <p>Type: Integer <p> <b>PostgreSQL</b>
     *         <p>Default: Uses existing setting <p>Valid Values: 5-6144
     *         <p>Constraints: Value supplied must be at least 10% greater than the
     *         current value. Values that are not at least 10% greater than the
     *         existing value are rounded up so that they are 10% greater than the
     *         current value. <p>Type: Integer <p> <b>Oracle</b> <p>Default: Uses
     *         existing setting <p>Valid Values: 10-6144 <p>Constraints: Value
     *         supplied must be at least 10% greater than the current value. Values
     *         that are not at least 10% greater than the existing value are rounded
     *         up so that they are 10% greater than the current value. <p> <b>SQL
     *         Server</b> <p>Cannot be modified. <p> If you choose to migrate your DB
     *         instance from using standard storage to using Provisioned IOPS, or
     *         from using Provisioned IOPS to using standard storage, the process can
     *         take time. The duration of the migration depends on several factors
     *         such as database load, storage size, storage type (standard or
     *         Provisioned IOPS), amount of IOPS provisioned (if any), and the number
     *         of prior scale storage operations. Typical migration times are under
     *         24 hours, but the process can take up to several days in some cases.
     *         During the migration, the DB instance will be available for use, but
     *         might experience performance degradation. While the migration takes
     *         place, nightly backups for the instance will be suspended. No other
     *         Amazon RDS operations can take place for the instance, including
     *         modifying the instance, rebooting the instance, deleting the instance,
     *         creating a Read Replica for the instance, and creating a DB snapshot
     *         of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * The new compute and memory capacity of the DB instance. To determine
     * the instance classes that are available for a particular DB engine,
     * use the <a>DescribeOrderableDBInstanceOptions</a> action. <p> Passing
     * a value for this setting causes an outage during the change and is
     * applied during the next maintenance window, unless
     * <code>ApplyImmediately</code> is specified as <code>true</code> for
     * this request. <p>Default: Uses existing setting <p>Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     * db.m1.xlarge | db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     * db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     * db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     * db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     * db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     * db.t2.medium | db.t2.large</code>
     *
     * @return The new compute and memory capacity of the DB instance. To determine
     *         the instance classes that are available for a particular DB engine,
     *         use the <a>DescribeOrderableDBInstanceOptions</a> action. <p> Passing
     *         a value for this setting causes an outage during the change and is
     *         applied during the next maintenance window, unless
     *         <code>ApplyImmediately</code> is specified as <code>true</code> for
     *         this request. <p>Default: Uses existing setting <p>Valid Values:
     *         <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     *         db.m1.xlarge | db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     *         db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     *         db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     *         db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     *         db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     *         db.t2.medium | db.t2.large</code>
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The new compute and memory capacity of the DB instance. To determine
     * the instance classes that are available for a particular DB engine,
     * use the <a>DescribeOrderableDBInstanceOptions</a> action. <p> Passing
     * a value for this setting causes an outage during the change and is
     * applied during the next maintenance window, unless
     * <code>ApplyImmediately</code> is specified as <code>true</code> for
     * this request. <p>Default: Uses existing setting <p>Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     * db.m1.xlarge | db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     * db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     * db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     * db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     * db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     * db.t2.medium | db.t2.large</code>
     *
     * @param dBInstanceClass The new compute and memory capacity of the DB instance. To determine
     *         the instance classes that are available for a particular DB engine,
     *         use the <a>DescribeOrderableDBInstanceOptions</a> action. <p> Passing
     *         a value for this setting causes an outage during the change and is
     *         applied during the next maintenance window, unless
     *         <code>ApplyImmediately</code> is specified as <code>true</code> for
     *         this request. <p>Default: Uses existing setting <p>Valid Values:
     *         <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     *         db.m1.xlarge | db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     *         db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     *         db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     *         db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     *         db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     *         db.t2.medium | db.t2.large</code>
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The new compute and memory capacity of the DB instance. To determine
     * the instance classes that are available for a particular DB engine,
     * use the <a>DescribeOrderableDBInstanceOptions</a> action. <p> Passing
     * a value for this setting causes an outage during the change and is
     * applied during the next maintenance window, unless
     * <code>ApplyImmediately</code> is specified as <code>true</code> for
     * this request. <p>Default: Uses existing setting <p>Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     * db.m1.xlarge | db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     * db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     * db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     * db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     * db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     * db.t2.medium | db.t2.large</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The new compute and memory capacity of the DB instance. To determine
     *         the instance classes that are available for a particular DB engine,
     *         use the <a>DescribeOrderableDBInstanceOptions</a> action. <p> Passing
     *         a value for this setting causes an outage during the change and is
     *         applied during the next maintenance window, unless
     *         <code>ApplyImmediately</code> is specified as <code>true</code> for
     *         this request. <p>Default: Uses existing setting <p>Valid Values:
     *         <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     *         db.m1.xlarge | db.m2.xlarge | db.m2.2xlarge | db.m2.4xlarge |
     *         db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge |
     *         db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge |
     *         db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge |
     *         db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small |
     *         db.t2.medium | db.t2.large</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * A list of DB security groups to authorize on this DB instance.
     * Changing this setting does not result in an outage and the change is
     * asynchronously applied as soon as possible. <p>Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     *
     * @return A list of DB security groups to authorize on this DB instance.
     *         Changing this setting does not result in an outage and the change is
     *         asynchronously applied as soon as possible. <p>Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     *         must be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul>
     */
    public java.util.List<String> getDBSecurityGroups() {
        if (dBSecurityGroups == null) {
              dBSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              dBSecurityGroups.setAutoConstruct(true);
        }
        return dBSecurityGroups;
    }
    
    /**
     * A list of DB security groups to authorize on this DB instance.
     * Changing this setting does not result in an outage and the change is
     * asynchronously applied as soon as possible. <p>Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     *
     * @param dBSecurityGroups A list of DB security groups to authorize on this DB instance.
     *         Changing this setting does not result in an outage and the change is
     *         asynchronously applied as soon as possible. <p>Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     *         must be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul>
     */
    public void setDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> dBSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dBSecurityGroups.size());
        dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        this.dBSecurityGroups = dBSecurityGroupsCopy;
    }
    
    /**
     * A list of DB security groups to authorize on this DB instance.
     * Changing this setting does not result in an outage and the change is
     * asynchronously applied as soon as possible. <p>Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDBSecurityGroups(java.util.Collection)} or {@link
     * #withDBSecurityGroups(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of DB security groups to authorize on this DB instance.
     *         Changing this setting does not result in an outage and the change is
     *         asynchronously applied as soon as possible. <p>Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     *         must be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withDBSecurityGroups(String... dBSecurityGroups) {
        if (getDBSecurityGroups() == null) setDBSecurityGroups(new java.util.ArrayList<String>(dBSecurityGroups.length));
        for (String value : dBSecurityGroups) {
            getDBSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of DB security groups to authorize on this DB instance.
     * Changing this setting does not result in an outage and the change is
     * asynchronously applied as soon as possible. <p>Constraints: <ul>
     * <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     * must be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of DB security groups to authorize on this DB instance.
     *         Changing this setting does not result in an outage and the change is
     *         asynchronously applied as soon as possible. <p>Constraints: <ul>
     *         <li>Must be 1 to 255 alphanumeric characters</li> <li>First character
     *         must be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> dBSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dBSecurityGroups.size());
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
            this.dBSecurityGroups = dBSecurityGroupsCopy;
        }

        return this;
    }

    /**
     * A list of EC2 VPC security groups to authorize on this DB instance.
     * This change is asynchronously applied as soon as possible.
     * <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     *
     * @return A list of EC2 VPC security groups to authorize on this DB instance.
     *         This change is asynchronously applied as soon as possible.
     *         <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric characters</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
              vpcSecurityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcSecurityGroupIds.setAutoConstruct(true);
        }
        return vpcSecurityGroupIds;
    }
    
    /**
     * A list of EC2 VPC security groups to authorize on this DB instance.
     * This change is asynchronously applied as soon as possible.
     * <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     *
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to authorize on this DB instance.
     *         This change is asynchronously applied as soon as possible.
     *         <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric characters</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
     */
    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcSecurityGroupIds.size());
        vpcSecurityGroupIdsCopy.addAll(vpcSecurityGroupIds);
        this.vpcSecurityGroupIds = vpcSecurityGroupIdsCopy;
    }
    
    /**
     * A list of EC2 VPC security groups to authorize on this DB instance.
     * This change is asynchronously applied as soon as possible.
     * <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVpcSecurityGroupIds(java.util.Collection)} or
     * {@link #withVpcSecurityGroupIds(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to authorize on this DB instance.
     *         This change is asynchronously applied as soon as possible.
     *         <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric characters</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (getVpcSecurityGroupIds() == null) setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        for (String value : vpcSecurityGroupIds) {
            getVpcSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of EC2 VPC security groups to authorize on this DB instance.
     * This change is asynchronously applied as soon as possible.
     * <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to authorize on this DB instance.
     *         This change is asynchronously applied as soon as possible.
     *         <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric characters</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcSecurityGroupIds.size());
            vpcSecurityGroupIdsCopy.addAll(vpcSecurityGroupIds);
            this.vpcSecurityGroupIds = vpcSecurityGroupIdsCopy;
        }

        return this;
    }

    /**
     * Specifies whether the modifications in this request and any pending
     * modifications are asynchronously applied as soon as possible,
     * regardless of the <code>PreferredMaintenanceWindow</code> setting for
     * the DB instance. <p> If this parameter is set to <code>false</code>,
     * changes to the DB instance are applied during the next maintenance
     * window. Some parameter changes can cause an outage and will be applied
     * on the next call to <a>RebootDBInstance</a>, or the next failure
     * reboot. Review the table of parameters in <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     * a DB Instance and Using the Apply Immediately Parameter</a> to see the
     * impact that setting <code>ApplyImmediately</code> to <code>true</code>
     * or <code>false</code> has for each modified parameter and to determine
     * when the changes will be applied. <p>Default: <code>false</code>
     *
     * @return Specifies whether the modifications in this request and any pending
     *         modifications are asynchronously applied as soon as possible,
     *         regardless of the <code>PreferredMaintenanceWindow</code> setting for
     *         the DB instance. <p> If this parameter is set to <code>false</code>,
     *         changes to the DB instance are applied during the next maintenance
     *         window. Some parameter changes can cause an outage and will be applied
     *         on the next call to <a>RebootDBInstance</a>, or the next failure
     *         reboot. Review the table of parameters in <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     *         a DB Instance and Using the Apply Immediately Parameter</a> to see the
     *         impact that setting <code>ApplyImmediately</code> to <code>true</code>
     *         or <code>false</code> has for each modified parameter and to determine
     *         when the changes will be applied. <p>Default: <code>false</code>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }
    
    /**
     * Specifies whether the modifications in this request and any pending
     * modifications are asynchronously applied as soon as possible,
     * regardless of the <code>PreferredMaintenanceWindow</code> setting for
     * the DB instance. <p> If this parameter is set to <code>false</code>,
     * changes to the DB instance are applied during the next maintenance
     * window. Some parameter changes can cause an outage and will be applied
     * on the next call to <a>RebootDBInstance</a>, or the next failure
     * reboot. Review the table of parameters in <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     * a DB Instance and Using the Apply Immediately Parameter</a> to see the
     * impact that setting <code>ApplyImmediately</code> to <code>true</code>
     * or <code>false</code> has for each modified parameter and to determine
     * when the changes will be applied. <p>Default: <code>false</code>
     *
     * @param applyImmediately Specifies whether the modifications in this request and any pending
     *         modifications are asynchronously applied as soon as possible,
     *         regardless of the <code>PreferredMaintenanceWindow</code> setting for
     *         the DB instance. <p> If this parameter is set to <code>false</code>,
     *         changes to the DB instance are applied during the next maintenance
     *         window. Some parameter changes can cause an outage and will be applied
     *         on the next call to <a>RebootDBInstance</a>, or the next failure
     *         reboot. Review the table of parameters in <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     *         a DB Instance and Using the Apply Immediately Parameter</a> to see the
     *         impact that setting <code>ApplyImmediately</code> to <code>true</code>
     *         or <code>false</code> has for each modified parameter and to determine
     *         when the changes will be applied. <p>Default: <code>false</code>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }
    
    /**
     * Specifies whether the modifications in this request and any pending
     * modifications are asynchronously applied as soon as possible,
     * regardless of the <code>PreferredMaintenanceWindow</code> setting for
     * the DB instance. <p> If this parameter is set to <code>false</code>,
     * changes to the DB instance are applied during the next maintenance
     * window. Some parameter changes can cause an outage and will be applied
     * on the next call to <a>RebootDBInstance</a>, or the next failure
     * reboot. Review the table of parameters in <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     * a DB Instance and Using the Apply Immediately Parameter</a> to see the
     * impact that setting <code>ApplyImmediately</code> to <code>true</code>
     * or <code>false</code> has for each modified parameter and to determine
     * when the changes will be applied. <p>Default: <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applyImmediately Specifies whether the modifications in this request and any pending
     *         modifications are asynchronously applied as soon as possible,
     *         regardless of the <code>PreferredMaintenanceWindow</code> setting for
     *         the DB instance. <p> If this parameter is set to <code>false</code>,
     *         changes to the DB instance are applied during the next maintenance
     *         window. Some parameter changes can cause an outage and will be applied
     *         on the next call to <a>RebootDBInstance</a>, or the next failure
     *         reboot. Review the table of parameters in <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     *         a DB Instance and Using the Apply Immediately Parameter</a> to see the
     *         impact that setting <code>ApplyImmediately</code> to <code>true</code>
     *         or <code>false</code> has for each modified parameter and to determine
     *         when the changes will be applied. <p>Default: <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
        return this;
    }

    /**
     * Specifies whether the modifications in this request and any pending
     * modifications are asynchronously applied as soon as possible,
     * regardless of the <code>PreferredMaintenanceWindow</code> setting for
     * the DB instance. <p> If this parameter is set to <code>false</code>,
     * changes to the DB instance are applied during the next maintenance
     * window. Some parameter changes can cause an outage and will be applied
     * on the next call to <a>RebootDBInstance</a>, or the next failure
     * reboot. Review the table of parameters in <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     * a DB Instance and Using the Apply Immediately Parameter</a> to see the
     * impact that setting <code>ApplyImmediately</code> to <code>true</code>
     * or <code>false</code> has for each modified parameter and to determine
     * when the changes will be applied. <p>Default: <code>false</code>
     *
     * @return Specifies whether the modifications in this request and any pending
     *         modifications are asynchronously applied as soon as possible,
     *         regardless of the <code>PreferredMaintenanceWindow</code> setting for
     *         the DB instance. <p> If this parameter is set to <code>false</code>,
     *         changes to the DB instance are applied during the next maintenance
     *         window. Some parameter changes can cause an outage and will be applied
     *         on the next call to <a>RebootDBInstance</a>, or the next failure
     *         reboot. Review the table of parameters in <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.DBInstance.Modifying.html">Modifying
     *         a DB Instance and Using the Apply Immediately Parameter</a> to see the
     *         impact that setting <code>ApplyImmediately</code> to <code>true</code>
     *         or <code>false</code> has for each modified parameter and to determine
     *         when the changes will be applied. <p>Default: <code>false</code>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * The new password for the DB instance master user. Can be any printable
     * ASCII character except "/", """, or "@". <p> Changing this parameter
     * does not result in an outage and the change is asynchronously applied
     * as soon as possible. Between the time of the request and the
     * completion of the request, the <code>MasterUserPassword</code> element
     * exists in the <code>PendingModifiedValues</code> element of the
     * operation response. <p>Default: Uses existing setting <p>Constraints:
     * Must be 8 to 41 alphanumeric characters (MySQL, MariaDB, and Amazon
     * Aurora), 8 to 30 alphanumeric characters (Oracle), or 8 to 128
     * alphanumeric characters (SQL Server). <note> Amazon RDS API actions
     * never return the password, so this action provides a way to regain
     * access to a primary instance user if the password is lost. This
     * includes restoring privileges that might have been accidentally
     * revoked. </note>
     *
     * @return The new password for the DB instance master user. Can be any printable
     *         ASCII character except "/", """, or "@". <p> Changing this parameter
     *         does not result in an outage and the change is asynchronously applied
     *         as soon as possible. Between the time of the request and the
     *         completion of the request, the <code>MasterUserPassword</code> element
     *         exists in the <code>PendingModifiedValues</code> element of the
     *         operation response. <p>Default: Uses existing setting <p>Constraints:
     *         Must be 8 to 41 alphanumeric characters (MySQL, MariaDB, and Amazon
     *         Aurora), 8 to 30 alphanumeric characters (Oracle), or 8 to 128
     *         alphanumeric characters (SQL Server). <note> Amazon RDS API actions
     *         never return the password, so this action provides a way to regain
     *         access to a primary instance user if the password is lost. This
     *         includes restoring privileges that might have been accidentally
     *         revoked. </note>
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }
    
    /**
     * The new password for the DB instance master user. Can be any printable
     * ASCII character except "/", """, or "@". <p> Changing this parameter
     * does not result in an outage and the change is asynchronously applied
     * as soon as possible. Between the time of the request and the
     * completion of the request, the <code>MasterUserPassword</code> element
     * exists in the <code>PendingModifiedValues</code> element of the
     * operation response. <p>Default: Uses existing setting <p>Constraints:
     * Must be 8 to 41 alphanumeric characters (MySQL, MariaDB, and Amazon
     * Aurora), 8 to 30 alphanumeric characters (Oracle), or 8 to 128
     * alphanumeric characters (SQL Server). <note> Amazon RDS API actions
     * never return the password, so this action provides a way to regain
     * access to a primary instance user if the password is lost. This
     * includes restoring privileges that might have been accidentally
     * revoked. </note>
     *
     * @param masterUserPassword The new password for the DB instance master user. Can be any printable
     *         ASCII character except "/", """, or "@". <p> Changing this parameter
     *         does not result in an outage and the change is asynchronously applied
     *         as soon as possible. Between the time of the request and the
     *         completion of the request, the <code>MasterUserPassword</code> element
     *         exists in the <code>PendingModifiedValues</code> element of the
     *         operation response. <p>Default: Uses existing setting <p>Constraints:
     *         Must be 8 to 41 alphanumeric characters (MySQL, MariaDB, and Amazon
     *         Aurora), 8 to 30 alphanumeric characters (Oracle), or 8 to 128
     *         alphanumeric characters (SQL Server). <note> Amazon RDS API actions
     *         never return the password, so this action provides a way to regain
     *         access to a primary instance user if the password is lost. This
     *         includes restoring privileges that might have been accidentally
     *         revoked. </note>
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }
    
    /**
     * The new password for the DB instance master user. Can be any printable
     * ASCII character except "/", """, or "@". <p> Changing this parameter
     * does not result in an outage and the change is asynchronously applied
     * as soon as possible. Between the time of the request and the
     * completion of the request, the <code>MasterUserPassword</code> element
     * exists in the <code>PendingModifiedValues</code> element of the
     * operation response. <p>Default: Uses existing setting <p>Constraints:
     * Must be 8 to 41 alphanumeric characters (MySQL, MariaDB, and Amazon
     * Aurora), 8 to 30 alphanumeric characters (Oracle), or 8 to 128
     * alphanumeric characters (SQL Server). <note> Amazon RDS API actions
     * never return the password, so this action provides a way to regain
     * access to a primary instance user if the password is lost. This
     * includes restoring privileges that might have been accidentally
     * revoked. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUserPassword The new password for the DB instance master user. Can be any printable
     *         ASCII character except "/", """, or "@". <p> Changing this parameter
     *         does not result in an outage and the change is asynchronously applied
     *         as soon as possible. Between the time of the request and the
     *         completion of the request, the <code>MasterUserPassword</code> element
     *         exists in the <code>PendingModifiedValues</code> element of the
     *         operation response. <p>Default: Uses existing setting <p>Constraints:
     *         Must be 8 to 41 alphanumeric characters (MySQL, MariaDB, and Amazon
     *         Aurora), 8 to 30 alphanumeric characters (Oracle), or 8 to 128
     *         alphanumeric characters (SQL Server). <note> Amazon RDS API actions
     *         never return the password, so this action provides a way to regain
     *         access to a primary instance user if the password is lost. This
     *         includes restoring privileges that might have been accidentally
     *         revoked. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * The name of the DB parameter group to apply to the DB instance.
     * Changing this setting does not result in an outage. The parameter
     * group name itself is changed immediately, but the actual parameter
     * changes are not applied until you reboot the instance without
     * failover. The db instance will NOT be rebooted automatically and the
     * parameter changes will NOT be applied during the next maintenance
     * window. <p>Default: Uses existing setting <p>Constraints: The DB
     * parameter group must be in the same DB parameter group family as this
     * DB instance.
     *
     * @return The name of the DB parameter group to apply to the DB instance.
     *         Changing this setting does not result in an outage. The parameter
     *         group name itself is changed immediately, but the actual parameter
     *         changes are not applied until you reboot the instance without
     *         failover. The db instance will NOT be rebooted automatically and the
     *         parameter changes will NOT be applied during the next maintenance
     *         window. <p>Default: Uses existing setting <p>Constraints: The DB
     *         parameter group must be in the same DB parameter group family as this
     *         DB instance.
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * The name of the DB parameter group to apply to the DB instance.
     * Changing this setting does not result in an outage. The parameter
     * group name itself is changed immediately, but the actual parameter
     * changes are not applied until you reboot the instance without
     * failover. The db instance will NOT be rebooted automatically and the
     * parameter changes will NOT be applied during the next maintenance
     * window. <p>Default: Uses existing setting <p>Constraints: The DB
     * parameter group must be in the same DB parameter group family as this
     * DB instance.
     *
     * @param dBParameterGroupName The name of the DB parameter group to apply to the DB instance.
     *         Changing this setting does not result in an outage. The parameter
     *         group name itself is changed immediately, but the actual parameter
     *         changes are not applied until you reboot the instance without
     *         failover. The db instance will NOT be rebooted automatically and the
     *         parameter changes will NOT be applied during the next maintenance
     *         window. <p>Default: Uses existing setting <p>Constraints: The DB
     *         parameter group must be in the same DB parameter group family as this
     *         DB instance.
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * The name of the DB parameter group to apply to the DB instance.
     * Changing this setting does not result in an outage. The parameter
     * group name itself is changed immediately, but the actual parameter
     * changes are not applied until you reboot the instance without
     * failover. The db instance will NOT be rebooted automatically and the
     * parameter changes will NOT be applied during the next maintenance
     * window. <p>Default: Uses existing setting <p>Constraints: The DB
     * parameter group must be in the same DB parameter group family as this
     * DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName The name of the DB parameter group to apply to the DB instance.
     *         Changing this setting does not result in an outage. The parameter
     *         group name itself is changed immediately, but the actual parameter
     *         changes are not applied until you reboot the instance without
     *         failover. The db instance will NOT be rebooted automatically and the
     *         parameter changes will NOT be applied during the next maintenance
     *         window. <p>Default: Uses existing setting <p>Constraints: The DB
     *         parameter group must be in the same DB parameter group family as this
     *         DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }

    /**
     * The number of days to retain automated backups. Setting this parameter
     * to a positive number enables backups. Setting this parameter to 0
     * disables automated backups. <p>Changing this parameter can result in
     * an outage if you change from 0 to a non-zero value or from a non-zero
     * value to 0. These changes are applied during the next maintenance
     * window unless the <code>ApplyImmediately</code> parameter is set to
     * <code>true</code> for this request. If you change the parameter from
     * one non-zero value to another non-zero value, the change is
     * asynchronously applied as soon as possible. <p>Default: Uses existing
     * setting <p>Constraints: <ul> <li>Must be a value from 0 to 35</li>
     * <li>Can be specified for a MySQL Read Replica only if the source is
     * running MySQL 5.6</li> <li>Can be specified for a PostgreSQL Read
     * Replica only if the source is running PostgreSQL 9.3.5</li> <li>Cannot
     * be set to 0 if the DB instance is a source to Read Replicas</li> </ul>
     *
     * @return The number of days to retain automated backups. Setting this parameter
     *         to a positive number enables backups. Setting this parameter to 0
     *         disables automated backups. <p>Changing this parameter can result in
     *         an outage if you change from 0 to a non-zero value or from a non-zero
     *         value to 0. These changes are applied during the next maintenance
     *         window unless the <code>ApplyImmediately</code> parameter is set to
     *         <code>true</code> for this request. If you change the parameter from
     *         one non-zero value to another non-zero value, the change is
     *         asynchronously applied as soon as possible. <p>Default: Uses existing
     *         setting <p>Constraints: <ul> <li>Must be a value from 0 to 35</li>
     *         <li>Can be specified for a MySQL Read Replica only if the source is
     *         running MySQL 5.6</li> <li>Can be specified for a PostgreSQL Read
     *         Replica only if the source is running PostgreSQL 9.3.5</li> <li>Cannot
     *         be set to 0 if the DB instance is a source to Read Replicas</li> </ul>
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }
    
    /**
     * The number of days to retain automated backups. Setting this parameter
     * to a positive number enables backups. Setting this parameter to 0
     * disables automated backups. <p>Changing this parameter can result in
     * an outage if you change from 0 to a non-zero value or from a non-zero
     * value to 0. These changes are applied during the next maintenance
     * window unless the <code>ApplyImmediately</code> parameter is set to
     * <code>true</code> for this request. If you change the parameter from
     * one non-zero value to another non-zero value, the change is
     * asynchronously applied as soon as possible. <p>Default: Uses existing
     * setting <p>Constraints: <ul> <li>Must be a value from 0 to 35</li>
     * <li>Can be specified for a MySQL Read Replica only if the source is
     * running MySQL 5.6</li> <li>Can be specified for a PostgreSQL Read
     * Replica only if the source is running PostgreSQL 9.3.5</li> <li>Cannot
     * be set to 0 if the DB instance is a source to Read Replicas</li> </ul>
     *
     * @param backupRetentionPeriod The number of days to retain automated backups. Setting this parameter
     *         to a positive number enables backups. Setting this parameter to 0
     *         disables automated backups. <p>Changing this parameter can result in
     *         an outage if you change from 0 to a non-zero value or from a non-zero
     *         value to 0. These changes are applied during the next maintenance
     *         window unless the <code>ApplyImmediately</code> parameter is set to
     *         <code>true</code> for this request. If you change the parameter from
     *         one non-zero value to another non-zero value, the change is
     *         asynchronously applied as soon as possible. <p>Default: Uses existing
     *         setting <p>Constraints: <ul> <li>Must be a value from 0 to 35</li>
     *         <li>Can be specified for a MySQL Read Replica only if the source is
     *         running MySQL 5.6</li> <li>Can be specified for a PostgreSQL Read
     *         Replica only if the source is running PostgreSQL 9.3.5</li> <li>Cannot
     *         be set to 0 if the DB instance is a source to Read Replicas</li> </ul>
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }
    
    /**
     * The number of days to retain automated backups. Setting this parameter
     * to a positive number enables backups. Setting this parameter to 0
     * disables automated backups. <p>Changing this parameter can result in
     * an outage if you change from 0 to a non-zero value or from a non-zero
     * value to 0. These changes are applied during the next maintenance
     * window unless the <code>ApplyImmediately</code> parameter is set to
     * <code>true</code> for this request. If you change the parameter from
     * one non-zero value to another non-zero value, the change is
     * asynchronously applied as soon as possible. <p>Default: Uses existing
     * setting <p>Constraints: <ul> <li>Must be a value from 0 to 35</li>
     * <li>Can be specified for a MySQL Read Replica only if the source is
     * running MySQL 5.6</li> <li>Can be specified for a PostgreSQL Read
     * Replica only if the source is running PostgreSQL 9.3.5</li> <li>Cannot
     * be set to 0 if the DB instance is a source to Read Replicas</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backupRetentionPeriod The number of days to retain automated backups. Setting this parameter
     *         to a positive number enables backups. Setting this parameter to 0
     *         disables automated backups. <p>Changing this parameter can result in
     *         an outage if you change from 0 to a non-zero value or from a non-zero
     *         value to 0. These changes are applied during the next maintenance
     *         window unless the <code>ApplyImmediately</code> parameter is set to
     *         <code>true</code> for this request. If you change the parameter from
     *         one non-zero value to another non-zero value, the change is
     *         asynchronously applied as soon as possible. <p>Default: Uses existing
     *         setting <p>Constraints: <ul> <li>Must be a value from 0 to 35</li>
     *         <li>Can be specified for a MySQL Read Replica only if the source is
     *         running MySQL 5.6</li> <li>Can be specified for a PostgreSQL Read
     *         Replica only if the source is running PostgreSQL 9.3.5</li> <li>Cannot
     *         be set to 0 if the DB instance is a source to Read Replicas</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code> parameter. Changing this parameter
     * does not result in an outage and the change is asynchronously applied
     * as soon as possible. <p>Constraints: <ul> <li>Must be in the format
     * hh24:mi-hh24:mi</li> <li>Times should be in Universal Time Coordinated
     * (UTC)</li> <li>Must not conflict with the preferred maintenance
     * window</li> <li>Must be at least 30 minutes</li> </ul>
     *
     * @return The daily time range during which automated backups are created if
     *         automated backups are enabled, as determined by the
     *         <code>BackupRetentionPeriod</code> parameter. Changing this parameter
     *         does not result in an outage and the change is asynchronously applied
     *         as soon as possible. <p>Constraints: <ul> <li>Must be in the format
     *         hh24:mi-hh24:mi</li> <li>Times should be in Universal Time Coordinated
     *         (UTC)</li> <li>Must not conflict with the preferred maintenance
     *         window</li> <li>Must be at least 30 minutes</li> </ul>
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code> parameter. Changing this parameter
     * does not result in an outage and the change is asynchronously applied
     * as soon as possible. <p>Constraints: <ul> <li>Must be in the format
     * hh24:mi-hh24:mi</li> <li>Times should be in Universal Time Coordinated
     * (UTC)</li> <li>Must not conflict with the preferred maintenance
     * window</li> <li>Must be at least 30 minutes</li> </ul>
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled, as determined by the
     *         <code>BackupRetentionPeriod</code> parameter. Changing this parameter
     *         does not result in an outage and the change is asynchronously applied
     *         as soon as possible. <p>Constraints: <ul> <li>Must be in the format
     *         hh24:mi-hh24:mi</li> <li>Times should be in Universal Time Coordinated
     *         (UTC)</li> <li>Must not conflict with the preferred maintenance
     *         window</li> <li>Must be at least 30 minutes</li> </ul>
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code> parameter. Changing this parameter
     * does not result in an outage and the change is asynchronously applied
     * as soon as possible. <p>Constraints: <ul> <li>Must be in the format
     * hh24:mi-hh24:mi</li> <li>Times should be in Universal Time Coordinated
     * (UTC)</li> <li>Must not conflict with the preferred maintenance
     * window</li> <li>Must be at least 30 minutes</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled, as determined by the
     *         <code>BackupRetentionPeriod</code> parameter. Changing this parameter
     *         does not result in an outage and the change is asynchronously applied
     *         as soon as possible. <p>Constraints: <ul> <li>Must be in the format
     *         hh24:mi-hh24:mi</li> <li>Times should be in Universal Time Coordinated
     *         (UTC)</li> <li>Must not conflict with the preferred maintenance
     *         window</li> <li>Must be at least 30 minutes</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur, which might result in an outage. Changing this parameter does
     * not result in an outage, except in the following situation, and the
     * change is asynchronously applied as soon as possible. If there are
     * pending actions that cause a reboot, and the maintenance window is
     * changed to include the current time, then changing this parameter will
     * cause a reboot of the DB instance. If moving this window to the
     * current time, there must be at least 30 minutes between the current
     * time and end of the window to ensure pending changes are applied.
     * <p>Default: Uses existing setting <p>Format: ddd:hh24:mi-ddd:hh24:mi
     * <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints:
     * Must be at least 30 minutes
     *
     * @return The weekly time range (in UTC) during which system maintenance can
     *         occur, which might result in an outage. Changing this parameter does
     *         not result in an outage, except in the following situation, and the
     *         change is asynchronously applied as soon as possible. If there are
     *         pending actions that cause a reboot, and the maintenance window is
     *         changed to include the current time, then changing this parameter will
     *         cause a reboot of the DB instance. If moving this window to the
     *         current time, there must be at least 30 minutes between the current
     *         time and end of the window to ensure pending changes are applied.
     *         <p>Default: Uses existing setting <p>Format: ddd:hh24:mi-ddd:hh24:mi
     *         <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints:
     *         Must be at least 30 minutes
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur, which might result in an outage. Changing this parameter does
     * not result in an outage, except in the following situation, and the
     * change is asynchronously applied as soon as possible. If there are
     * pending actions that cause a reboot, and the maintenance window is
     * changed to include the current time, then changing this parameter will
     * cause a reboot of the DB instance. If moving this window to the
     * current time, there must be at least 30 minutes between the current
     * time and end of the window to ensure pending changes are applied.
     * <p>Default: Uses existing setting <p>Format: ddd:hh24:mi-ddd:hh24:mi
     * <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints:
     * Must be at least 30 minutes
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur, which might result in an outage. Changing this parameter does
     *         not result in an outage, except in the following situation, and the
     *         change is asynchronously applied as soon as possible. If there are
     *         pending actions that cause a reboot, and the maintenance window is
     *         changed to include the current time, then changing this parameter will
     *         cause a reboot of the DB instance. If moving this window to the
     *         current time, there must be at least 30 minutes between the current
     *         time and end of the window to ensure pending changes are applied.
     *         <p>Default: Uses existing setting <p>Format: ddd:hh24:mi-ddd:hh24:mi
     *         <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints:
     *         Must be at least 30 minutes
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur, which might result in an outage. Changing this parameter does
     * not result in an outage, except in the following situation, and the
     * change is asynchronously applied as soon as possible. If there are
     * pending actions that cause a reboot, and the maintenance window is
     * changed to include the current time, then changing this parameter will
     * cause a reboot of the DB instance. If moving this window to the
     * current time, there must be at least 30 minutes between the current
     * time and end of the window to ensure pending changes are applied.
     * <p>Default: Uses existing setting <p>Format: ddd:hh24:mi-ddd:hh24:mi
     * <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints:
     * Must be at least 30 minutes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur, which might result in an outage. Changing this parameter does
     *         not result in an outage, except in the following situation, and the
     *         change is asynchronously applied as soon as possible. If there are
     *         pending actions that cause a reboot, and the maintenance window is
     *         changed to include the current time, then changing this parameter will
     *         cause a reboot of the DB instance. If moving this window to the
     *         current time, there must be at least 30 minutes between the current
     *         time and end of the window to ensure pending changes are applied.
     *         <p>Default: Uses existing setting <p>Format: ddd:hh24:mi-ddd:hh24:mi
     *         <p>Valid Days: Mon | Tue | Wed | Thu | Fri | Sat | Sun <p>Constraints:
     *         Must be at least 30 minutes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * Specifies if the DB instance is a Multi-AZ deployment. Changing this
     * parameter does not result in an outage and the change is applied
     * during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code>
     * for this request. <p>Constraints: Cannot be specified if the DB
     * instance is a Read Replica. This parameter cannot be used with SQL
     * Server DB instances. Multi-AZ for SQL Server DB instances is set using
     * the Mirroring option in an option group associated with the DB
     * instance.
     *
     * @return Specifies if the DB instance is a Multi-AZ deployment. Changing this
     *         parameter does not result in an outage and the change is applied
     *         during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code>
     *         for this request. <p>Constraints: Cannot be specified if the DB
     *         instance is a Read Replica. This parameter cannot be used with SQL
     *         Server DB instances. Multi-AZ for SQL Server DB instances is set using
     *         the Mirroring option in an option group associated with the DB
     *         instance.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Specifies if the DB instance is a Multi-AZ deployment. Changing this
     * parameter does not result in an outage and the change is applied
     * during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code>
     * for this request. <p>Constraints: Cannot be specified if the DB
     * instance is a Read Replica. This parameter cannot be used with SQL
     * Server DB instances. Multi-AZ for SQL Server DB instances is set using
     * the Mirroring option in an option group associated with the DB
     * instance.
     *
     * @param multiAZ Specifies if the DB instance is a Multi-AZ deployment. Changing this
     *         parameter does not result in an outage and the change is applied
     *         during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code>
     *         for this request. <p>Constraints: Cannot be specified if the DB
     *         instance is a Read Replica. This parameter cannot be used with SQL
     *         Server DB instances. Multi-AZ for SQL Server DB instances is set using
     *         the Mirroring option in an option group associated with the DB
     *         instance.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Specifies if the DB instance is a Multi-AZ deployment. Changing this
     * parameter does not result in an outage and the change is applied
     * during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code>
     * for this request. <p>Constraints: Cannot be specified if the DB
     * instance is a Read Replica. This parameter cannot be used with SQL
     * Server DB instances. Multi-AZ for SQL Server DB instances is set using
     * the Mirroring option in an option group associated with the DB
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ Specifies if the DB instance is a Multi-AZ deployment. Changing this
     *         parameter does not result in an outage and the change is applied
     *         during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code>
     *         for this request. <p>Constraints: Cannot be specified if the DB
     *         instance is a Read Replica. This parameter cannot be used with SQL
     *         Server DB instances. Multi-AZ for SQL Server DB instances is set using
     *         the Mirroring option in an option group associated with the DB
     *         instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * Specifies if the DB instance is a Multi-AZ deployment. Changing this
     * parameter does not result in an outage and the change is applied
     * during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code>
     * for this request. <p>Constraints: Cannot be specified if the DB
     * instance is a Read Replica. This parameter cannot be used with SQL
     * Server DB instances. Multi-AZ for SQL Server DB instances is set using
     * the Mirroring option in an option group associated with the DB
     * instance.
     *
     * @return Specifies if the DB instance is a Multi-AZ deployment. Changing this
     *         parameter does not result in an outage and the change is applied
     *         during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code>
     *         for this request. <p>Constraints: Cannot be specified if the DB
     *         instance is a Read Replica. This parameter cannot be used with SQL
     *         Server DB instances. Multi-AZ for SQL Server DB instances is set using
     *         the Mirroring option in an option group associated with the DB
     *         instance.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * The version number of the database engine to upgrade to. Changing this
     * parameter results in an outage and the change is applied during the
     * next maintenance window unless the <code>ApplyImmediately</code>
     * parameter is set to <code>true</code> for this request. <p> For major
     * version upgrades, if a non-default DB parameter group is currently in
     * use, a new DB parameter group in the DB parameter group family for the
     * new engine version must be specified. The new DB parameter group can
     * be the default for that DB parameter group family. <p>For a list of
     * valid engine versions, see <a>CreateDBInstance</a>.
     *
     * @return The version number of the database engine to upgrade to. Changing this
     *         parameter results in an outage and the change is applied during the
     *         next maintenance window unless the <code>ApplyImmediately</code>
     *         parameter is set to <code>true</code> for this request. <p> For major
     *         version upgrades, if a non-default DB parameter group is currently in
     *         use, a new DB parameter group in the DB parameter group family for the
     *         new engine version must be specified. The new DB parameter group can
     *         be the default for that DB parameter group family. <p>For a list of
     *         valid engine versions, see <a>CreateDBInstance</a>.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The version number of the database engine to upgrade to. Changing this
     * parameter results in an outage and the change is applied during the
     * next maintenance window unless the <code>ApplyImmediately</code>
     * parameter is set to <code>true</code> for this request. <p> For major
     * version upgrades, if a non-default DB parameter group is currently in
     * use, a new DB parameter group in the DB parameter group family for the
     * new engine version must be specified. The new DB parameter group can
     * be the default for that DB parameter group family. <p>For a list of
     * valid engine versions, see <a>CreateDBInstance</a>.
     *
     * @param engineVersion The version number of the database engine to upgrade to. Changing this
     *         parameter results in an outage and the change is applied during the
     *         next maintenance window unless the <code>ApplyImmediately</code>
     *         parameter is set to <code>true</code> for this request. <p> For major
     *         version upgrades, if a non-default DB parameter group is currently in
     *         use, a new DB parameter group in the DB parameter group family for the
     *         new engine version must be specified. The new DB parameter group can
     *         be the default for that DB parameter group family. <p>For a list of
     *         valid engine versions, see <a>CreateDBInstance</a>.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The version number of the database engine to upgrade to. Changing this
     * parameter results in an outage and the change is applied during the
     * next maintenance window unless the <code>ApplyImmediately</code>
     * parameter is set to <code>true</code> for this request. <p> For major
     * version upgrades, if a non-default DB parameter group is currently in
     * use, a new DB parameter group in the DB parameter group family for the
     * new engine version must be specified. The new DB parameter group can
     * be the default for that DB parameter group family. <p>For a list of
     * valid engine versions, see <a>CreateDBInstance</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version number of the database engine to upgrade to. Changing this
     *         parameter results in an outage and the change is applied during the
     *         next maintenance window unless the <code>ApplyImmediately</code>
     *         parameter is set to <code>true</code> for this request. <p> For major
     *         version upgrades, if a non-default DB parameter group is currently in
     *         use, a new DB parameter group in the DB parameter group family for the
     *         new engine version must be specified. The new DB parameter group can
     *         be the default for that DB parameter group family. <p>For a list of
     *         valid engine versions, see <a>CreateDBInstance</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * Indicates that major version upgrades are allowed. Changing this
     * parameter does not result in an outage and the change is
     * asynchronously applied as soon as possible. <p>Constraints: This
     * parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB
     * instance's current version.
     *
     * @return Indicates that major version upgrades are allowed. Changing this
     *         parameter does not result in an outage and the change is
     *         asynchronously applied as soon as possible. <p>Constraints: This
     *         parameter must be set to true when specifying a value for the
     *         EngineVersion parameter that is a different major version than the DB
     *         instance's current version.
     */
    public Boolean isAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }
    
    /**
     * Indicates that major version upgrades are allowed. Changing this
     * parameter does not result in an outage and the change is
     * asynchronously applied as soon as possible. <p>Constraints: This
     * parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB
     * instance's current version.
     *
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed. Changing this
     *         parameter does not result in an outage and the change is
     *         asynchronously applied as soon as possible. <p>Constraints: This
     *         parameter must be set to true when specifying a value for the
     *         EngineVersion parameter that is a different major version than the DB
     *         instance's current version.
     */
    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }
    
    /**
     * Indicates that major version upgrades are allowed. Changing this
     * parameter does not result in an outage and the change is
     * asynchronously applied as soon as possible. <p>Constraints: This
     * parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB
     * instance's current version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowMajorVersionUpgrade Indicates that major version upgrades are allowed. Changing this
     *         parameter does not result in an outage and the change is
     *         asynchronously applied as soon as possible. <p>Constraints: This
     *         parameter must be set to true when specifying a value for the
     *         EngineVersion parameter that is a different major version than the DB
     *         instance's current version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
        return this;
    }

    /**
     * Indicates that major version upgrades are allowed. Changing this
     * parameter does not result in an outage and the change is
     * asynchronously applied as soon as possible. <p>Constraints: This
     * parameter must be set to true when specifying a value for the
     * EngineVersion parameter that is a different major version than the DB
     * instance's current version.
     *
     * @return Indicates that major version upgrades are allowed. Changing this
     *         parameter does not result in an outage and the change is
     *         asynchronously applied as soon as possible. <p>Constraints: This
     *         parameter must be set to true when specifying a value for the
     *         EngineVersion parameter that is a different major version than the DB
     *         instance's current version.
     */
    public Boolean getAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }

    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB instance during the maintenance window. Changing this parameter
     * does not result in an outage except in the following case and the
     * change is asynchronously applied as soon as possible. An outage will
     * result if this parameter is set to <code>true</code> during the
     * maintenance window, and a newer minor version is available, and RDS
     * has enabled auto patching for that engine version.
     *
     * @return Indicates that minor version upgrades will be applied automatically to
     *         the DB instance during the maintenance window. Changing this parameter
     *         does not result in an outage except in the following case and the
     *         change is asynchronously applied as soon as possible. An outage will
     *         result if this parameter is set to <code>true</code> during the
     *         maintenance window, and a newer minor version is available, and RDS
     *         has enabled auto patching for that engine version.
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB instance during the maintenance window. Changing this parameter
     * does not result in an outage except in the following case and the
     * change is asynchronously applied as soon as possible. An outage will
     * result if this parameter is set to <code>true</code> during the
     * maintenance window, and a newer minor version is available, and RDS
     * has enabled auto patching for that engine version.
     *
     * @param autoMinorVersionUpgrade Indicates that minor version upgrades will be applied automatically to
     *         the DB instance during the maintenance window. Changing this parameter
     *         does not result in an outage except in the following case and the
     *         change is asynchronously applied as soon as possible. An outage will
     *         result if this parameter is set to <code>true</code> during the
     *         maintenance window, and a newer minor version is available, and RDS
     *         has enabled auto patching for that engine version.
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB instance during the maintenance window. Changing this parameter
     * does not result in an outage except in the following case and the
     * change is asynchronously applied as soon as possible. An outage will
     * result if this parameter is set to <code>true</code> during the
     * maintenance window, and a newer minor version is available, and RDS
     * has enabled auto patching for that engine version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Indicates that minor version upgrades will be applied automatically to
     *         the DB instance during the maintenance window. Changing this parameter
     *         does not result in an outage except in the following case and the
     *         change is asynchronously applied as soon as possible. An outage will
     *         result if this parameter is set to <code>true</code> during the
     *         maintenance window, and a newer minor version is available, and RDS
     *         has enabled auto patching for that engine version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * Indicates that minor version upgrades will be applied automatically to
     * the DB instance during the maintenance window. Changing this parameter
     * does not result in an outage except in the following case and the
     * change is asynchronously applied as soon as possible. An outage will
     * result if this parameter is set to <code>true</code> during the
     * maintenance window, and a newer minor version is available, and RDS
     * has enabled auto patching for that engine version.
     *
     * @return Indicates that minor version upgrades will be applied automatically to
     *         the DB instance during the maintenance window. Changing this parameter
     *         does not result in an outage except in the following case and the
     *         change is asynchronously applied as soon as possible. An outage will
     *         result if this parameter is set to <code>true</code> during the
     *         maintenance window, and a newer minor version is available, and RDS
     *         has enabled auto patching for that engine version.
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * The new Provisioned IOPS (I/O operations per second) value for the RDS
     * instance. Changing this setting does not result in an outage and the
     * change is applied during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code>
     * for this request. <p>Default: Uses existing setting <p>Constraints:
     * Value supplied must be at least 10% greater than the current value.
     * Values that are not at least 10% greater than the existing value are
     * rounded up so that they are 10% greater than the current value. If you
     * are migrating from Provisioned IOPS to standard storage, set this
     * value to 0. The DB instance will require a reboot for the change in
     * storage type to take effect. <p> <b>SQL Server</b> <p>Setting the IOPS
     * value for the SQL Server database engine is not supported. <p>Type:
     * Integer <p> If you choose to migrate your DB instance from using
     * standard storage to using Provisioned IOPS, or from using Provisioned
     * IOPS to using standard storage, the process can take time. The
     * duration of the migration depends on several factors such as database
     * load, storage size, storage type (standard or Provisioned IOPS),
     * amount of IOPS provisioned (if any), and the number of prior scale
     * storage operations. Typical migration times are under 24 hours, but
     * the process can take up to several days in some cases. During the
     * migration, the DB instance will be available for use, but might
     * experience performance degradation. While the migration takes place,
     * nightly backups for the instance will be suspended. No other Amazon
     * RDS operations can take place for the instance, including modifying
     * the instance, rebooting the instance, deleting the instance, creating
     * a Read Replica for the instance, and creating a DB snapshot of the
     * instance.
     *
     * @return The new Provisioned IOPS (I/O operations per second) value for the RDS
     *         instance. Changing this setting does not result in an outage and the
     *         change is applied during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code>
     *         for this request. <p>Default: Uses existing setting <p>Constraints:
     *         Value supplied must be at least 10% greater than the current value.
     *         Values that are not at least 10% greater than the existing value are
     *         rounded up so that they are 10% greater than the current value. If you
     *         are migrating from Provisioned IOPS to standard storage, set this
     *         value to 0. The DB instance will require a reboot for the change in
     *         storage type to take effect. <p> <b>SQL Server</b> <p>Setting the IOPS
     *         value for the SQL Server database engine is not supported. <p>Type:
     *         Integer <p> If you choose to migrate your DB instance from using
     *         standard storage to using Provisioned IOPS, or from using Provisioned
     *         IOPS to using standard storage, the process can take time. The
     *         duration of the migration depends on several factors such as database
     *         load, storage size, storage type (standard or Provisioned IOPS),
     *         amount of IOPS provisioned (if any), and the number of prior scale
     *         storage operations. Typical migration times are under 24 hours, but
     *         the process can take up to several days in some cases. During the
     *         migration, the DB instance will be available for use, but might
     *         experience performance degradation. While the migration takes place,
     *         nightly backups for the instance will be suspended. No other Amazon
     *         RDS operations can take place for the instance, including modifying
     *         the instance, rebooting the instance, deleting the instance, creating
     *         a Read Replica for the instance, and creating a DB snapshot of the
     *         instance.
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * The new Provisioned IOPS (I/O operations per second) value for the RDS
     * instance. Changing this setting does not result in an outage and the
     * change is applied during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code>
     * for this request. <p>Default: Uses existing setting <p>Constraints:
     * Value supplied must be at least 10% greater than the current value.
     * Values that are not at least 10% greater than the existing value are
     * rounded up so that they are 10% greater than the current value. If you
     * are migrating from Provisioned IOPS to standard storage, set this
     * value to 0. The DB instance will require a reboot for the change in
     * storage type to take effect. <p> <b>SQL Server</b> <p>Setting the IOPS
     * value for the SQL Server database engine is not supported. <p>Type:
     * Integer <p> If you choose to migrate your DB instance from using
     * standard storage to using Provisioned IOPS, or from using Provisioned
     * IOPS to using standard storage, the process can take time. The
     * duration of the migration depends on several factors such as database
     * load, storage size, storage type (standard or Provisioned IOPS),
     * amount of IOPS provisioned (if any), and the number of prior scale
     * storage operations. Typical migration times are under 24 hours, but
     * the process can take up to several days in some cases. During the
     * migration, the DB instance will be available for use, but might
     * experience performance degradation. While the migration takes place,
     * nightly backups for the instance will be suspended. No other Amazon
     * RDS operations can take place for the instance, including modifying
     * the instance, rebooting the instance, deleting the instance, creating
     * a Read Replica for the instance, and creating a DB snapshot of the
     * instance.
     *
     * @param iops The new Provisioned IOPS (I/O operations per second) value for the RDS
     *         instance. Changing this setting does not result in an outage and the
     *         change is applied during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code>
     *         for this request. <p>Default: Uses existing setting <p>Constraints:
     *         Value supplied must be at least 10% greater than the current value.
     *         Values that are not at least 10% greater than the existing value are
     *         rounded up so that they are 10% greater than the current value. If you
     *         are migrating from Provisioned IOPS to standard storage, set this
     *         value to 0. The DB instance will require a reboot for the change in
     *         storage type to take effect. <p> <b>SQL Server</b> <p>Setting the IOPS
     *         value for the SQL Server database engine is not supported. <p>Type:
     *         Integer <p> If you choose to migrate your DB instance from using
     *         standard storage to using Provisioned IOPS, or from using Provisioned
     *         IOPS to using standard storage, the process can take time. The
     *         duration of the migration depends on several factors such as database
     *         load, storage size, storage type (standard or Provisioned IOPS),
     *         amount of IOPS provisioned (if any), and the number of prior scale
     *         storage operations. Typical migration times are under 24 hours, but
     *         the process can take up to several days in some cases. During the
     *         migration, the DB instance will be available for use, but might
     *         experience performance degradation. While the migration takes place,
     *         nightly backups for the instance will be suspended. No other Amazon
     *         RDS operations can take place for the instance, including modifying
     *         the instance, rebooting the instance, deleting the instance, creating
     *         a Read Replica for the instance, and creating a DB snapshot of the
     *         instance.
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * The new Provisioned IOPS (I/O operations per second) value for the RDS
     * instance. Changing this setting does not result in an outage and the
     * change is applied during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code>
     * for this request. <p>Default: Uses existing setting <p>Constraints:
     * Value supplied must be at least 10% greater than the current value.
     * Values that are not at least 10% greater than the existing value are
     * rounded up so that they are 10% greater than the current value. If you
     * are migrating from Provisioned IOPS to standard storage, set this
     * value to 0. The DB instance will require a reboot for the change in
     * storage type to take effect. <p> <b>SQL Server</b> <p>Setting the IOPS
     * value for the SQL Server database engine is not supported. <p>Type:
     * Integer <p> If you choose to migrate your DB instance from using
     * standard storage to using Provisioned IOPS, or from using Provisioned
     * IOPS to using standard storage, the process can take time. The
     * duration of the migration depends on several factors such as database
     * load, storage size, storage type (standard or Provisioned IOPS),
     * amount of IOPS provisioned (if any), and the number of prior scale
     * storage operations. Typical migration times are under 24 hours, but
     * the process can take up to several days in some cases. During the
     * migration, the DB instance will be available for use, but might
     * experience performance degradation. While the migration takes place,
     * nightly backups for the instance will be suspended. No other Amazon
     * RDS operations can take place for the instance, including modifying
     * the instance, rebooting the instance, deleting the instance, creating
     * a Read Replica for the instance, and creating a DB snapshot of the
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iops The new Provisioned IOPS (I/O operations per second) value for the RDS
     *         instance. Changing this setting does not result in an outage and the
     *         change is applied during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code>
     *         for this request. <p>Default: Uses existing setting <p>Constraints:
     *         Value supplied must be at least 10% greater than the current value.
     *         Values that are not at least 10% greater than the existing value are
     *         rounded up so that they are 10% greater than the current value. If you
     *         are migrating from Provisioned IOPS to standard storage, set this
     *         value to 0. The DB instance will require a reboot for the change in
     *         storage type to take effect. <p> <b>SQL Server</b> <p>Setting the IOPS
     *         value for the SQL Server database engine is not supported. <p>Type:
     *         Integer <p> If you choose to migrate your DB instance from using
     *         standard storage to using Provisioned IOPS, or from using Provisioned
     *         IOPS to using standard storage, the process can take time. The
     *         duration of the migration depends on several factors such as database
     *         load, storage size, storage type (standard or Provisioned IOPS),
     *         amount of IOPS provisioned (if any), and the number of prior scale
     *         storage operations. Typical migration times are under 24 hours, but
     *         the process can take up to several days in some cases. During the
     *         migration, the DB instance will be available for use, but might
     *         experience performance degradation. While the migration takes place,
     *         nightly backups for the instance will be suspended. No other Amazon
     *         RDS operations can take place for the instance, including modifying
     *         the instance, rebooting the instance, deleting the instance, creating
     *         a Read Replica for the instance, and creating a DB snapshot of the
     *         instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * Indicates that the DB instance should be associated with the specified
     * option group. Changing this parameter does not result in an outage
     * except in the following case and the change is applied during the next
     * maintenance window unless the <code>ApplyImmediately</code> parameter
     * is set to <code>true</code> for this request. If the parameter change
     * results in an option group that enables OEM, this change can cause a
     * brief (sub-second) period during which new connections are rejected
     * but existing connections are not interrupted. <p> Permanent options,
     * such as the TDE option for Oracle Advanced Security TDE, cannot be
     * removed from an option group, and that option group cannot be removed
     * from a DB instance once it is associated with a DB instance
     *
     * @return Indicates that the DB instance should be associated with the specified
     *         option group. Changing this parameter does not result in an outage
     *         except in the following case and the change is applied during the next
     *         maintenance window unless the <code>ApplyImmediately</code> parameter
     *         is set to <code>true</code> for this request. If the parameter change
     *         results in an option group that enables OEM, this change can cause a
     *         brief (sub-second) period during which new connections are rejected
     *         but existing connections are not interrupted. <p> Permanent options,
     *         such as the TDE option for Oracle Advanced Security TDE, cannot be
     *         removed from an option group, and that option group cannot be removed
     *         from a DB instance once it is associated with a DB instance
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * Indicates that the DB instance should be associated with the specified
     * option group. Changing this parameter does not result in an outage
     * except in the following case and the change is applied during the next
     * maintenance window unless the <code>ApplyImmediately</code> parameter
     * is set to <code>true</code> for this request. If the parameter change
     * results in an option group that enables OEM, this change can cause a
     * brief (sub-second) period during which new connections are rejected
     * but existing connections are not interrupted. <p> Permanent options,
     * such as the TDE option for Oracle Advanced Security TDE, cannot be
     * removed from an option group, and that option group cannot be removed
     * from a DB instance once it is associated with a DB instance
     *
     * @param optionGroupName Indicates that the DB instance should be associated with the specified
     *         option group. Changing this parameter does not result in an outage
     *         except in the following case and the change is applied during the next
     *         maintenance window unless the <code>ApplyImmediately</code> parameter
     *         is set to <code>true</code> for this request. If the parameter change
     *         results in an option group that enables OEM, this change can cause a
     *         brief (sub-second) period during which new connections are rejected
     *         but existing connections are not interrupted. <p> Permanent options,
     *         such as the TDE option for Oracle Advanced Security TDE, cannot be
     *         removed from an option group, and that option group cannot be removed
     *         from a DB instance once it is associated with a DB instance
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * Indicates that the DB instance should be associated with the specified
     * option group. Changing this parameter does not result in an outage
     * except in the following case and the change is applied during the next
     * maintenance window unless the <code>ApplyImmediately</code> parameter
     * is set to <code>true</code> for this request. If the parameter change
     * results in an option group that enables OEM, this change can cause a
     * brief (sub-second) period during which new connections are rejected
     * but existing connections are not interrupted. <p> Permanent options,
     * such as the TDE option for Oracle Advanced Security TDE, cannot be
     * removed from an option group, and that option group cannot be removed
     * from a DB instance once it is associated with a DB instance
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName Indicates that the DB instance should be associated with the specified
     *         option group. Changing this parameter does not result in an outage
     *         except in the following case and the change is applied during the next
     *         maintenance window unless the <code>ApplyImmediately</code> parameter
     *         is set to <code>true</code> for this request. If the parameter change
     *         results in an option group that enables OEM, this change can cause a
     *         brief (sub-second) period during which new connections are rejected
     *         but existing connections are not interrupted. <p> Permanent options,
     *         such as the TDE option for Oracle Advanced Security TDE, cannot be
     *         removed from an option group, and that option group cannot be removed
     *         from a DB instance once it is associated with a DB instance
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * The new DB instance identifier for the DB instance when renaming a DB
     * instance. When you change the DB instance identifier, an instance
     * reboot will occur immediately if you set <code>Apply
     * Immediately</code> to true, or will occur during the next maintenance
     * window if <code>Apply Immediately</code> to false. This value is
     * stored as a lowercase string. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     *
     * @return The new DB instance identifier for the DB instance when renaming a DB
     *         instance. When you change the DB instance identifier, an instance
     *         reboot will occur immediately if you set <code>Apply
     *         Immediately</code> to true, or will occur during the next maintenance
     *         window if <code>Apply Immediately</code> to false. This value is
     *         stored as a lowercase string. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     */
    public String getNewDBInstanceIdentifier() {
        return newDBInstanceIdentifier;
    }
    
    /**
     * The new DB instance identifier for the DB instance when renaming a DB
     * instance. When you change the DB instance identifier, an instance
     * reboot will occur immediately if you set <code>Apply
     * Immediately</code> to true, or will occur during the next maintenance
     * window if <code>Apply Immediately</code> to false. This value is
     * stored as a lowercase string. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     *
     * @param newDBInstanceIdentifier The new DB instance identifier for the DB instance when renaming a DB
     *         instance. When you change the DB instance identifier, an instance
     *         reboot will occur immediately if you set <code>Apply
     *         Immediately</code> to true, or will occur during the next maintenance
     *         window if <code>Apply Immediately</code> to false. This value is
     *         stored as a lowercase string. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     */
    public void setNewDBInstanceIdentifier(String newDBInstanceIdentifier) {
        this.newDBInstanceIdentifier = newDBInstanceIdentifier;
    }
    
    /**
     * The new DB instance identifier for the DB instance when renaming a DB
     * instance. When you change the DB instance identifier, an instance
     * reboot will occur immediately if you set <code>Apply
     * Immediately</code> to true, or will occur during the next maintenance
     * window if <code>Apply Immediately</code> to false. This value is
     * stored as a lowercase string. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newDBInstanceIdentifier The new DB instance identifier for the DB instance when renaming a DB
     *         instance. When you change the DB instance identifier, an instance
     *         reboot will occur immediately if you set <code>Apply
     *         Immediately</code> to true, or will occur during the next maintenance
     *         window if <code>Apply Immediately</code> to false. This value is
     *         stored as a lowercase string. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withNewDBInstanceIdentifier(String newDBInstanceIdentifier) {
        this.newDBInstanceIdentifier = newDBInstanceIdentifier;
        return this;
    }

    /**
     * Specifies the storage type to be associated with the DB instance. <p>
     * Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     * <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     * <code>Iops</code> parameter is specified; otherwise
     * <code>standard</code>
     *
     * @return Specifies the storage type to be associated with the DB instance. <p>
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
     * Specifies the storage type to be associated with the DB instance. <p>
     * Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     * <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     * <code>Iops</code> parameter is specified; otherwise
     * <code>standard</code>
     *
     * @param storageType Specifies the storage type to be associated with the DB instance. <p>
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
     * Specifies the storage type to be associated with the DB instance. <p>
     * Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     * <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     * <code>Iops</code> parameter is specified; otherwise
     * <code>standard</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param storageType Specifies the storage type to be associated with the DB instance. <p>
     *         Valid values: <code>standard | gp2 | io1</code> <p> If you specify
     *         <code>io1</code>, you must also include a value for the
     *         <code>Iops</code> parameter. <p> Default: <code>io1</code> if the
     *         <code>Iops</code> parameter is specified; otherwise
     *         <code>standard</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * The ARN from the Key Store with which to associate the instance for
     * TDE encryption.
     *
     * @return The ARN from the Key Store with which to associate the instance for
     *         TDE encryption.
     */
    public String getTdeCredentialArn() {
        return tdeCredentialArn;
    }
    
    /**
     * The ARN from the Key Store with which to associate the instance for
     * TDE encryption.
     *
     * @param tdeCredentialArn The ARN from the Key Store with which to associate the instance for
     *         TDE encryption.
     */
    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }
    
    /**
     * The ARN from the Key Store with which to associate the instance for
     * TDE encryption.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tdeCredentialArn The ARN from the Key Store with which to associate the instance for
     *         TDE encryption.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
        return this;
    }

    /**
     * The password for the given ARN from the Key Store in order to access
     * the device.
     *
     * @return The password for the given ARN from the Key Store in order to access
     *         the device.
     */
    public String getTdeCredentialPassword() {
        return tdeCredentialPassword;
    }
    
    /**
     * The password for the given ARN from the Key Store in order to access
     * the device.
     *
     * @param tdeCredentialPassword The password for the given ARN from the Key Store in order to access
     *         the device.
     */
    public void setTdeCredentialPassword(String tdeCredentialPassword) {
        this.tdeCredentialPassword = tdeCredentialPassword;
    }
    
    /**
     * The password for the given ARN from the Key Store in order to access
     * the device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tdeCredentialPassword The password for the given ARN from the Key Store in order to access
     *         the device.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withTdeCredentialPassword(String tdeCredentialPassword) {
        this.tdeCredentialPassword = tdeCredentialPassword;
        return this;
    }

    /**
     * Indicates the certificate that needs to be associated with the
     * instance.
     *
     * @return Indicates the certificate that needs to be associated with the
     *         instance.
     */
    public String getCACertificateIdentifier() {
        return cACertificateIdentifier;
    }
    
    /**
     * Indicates the certificate that needs to be associated with the
     * instance.
     *
     * @param cACertificateIdentifier Indicates the certificate that needs to be associated with the
     *         instance.
     */
    public void setCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
    }
    
    /**
     * Indicates the certificate that needs to be associated with the
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cACertificateIdentifier Indicates the certificate that needs to be associated with the
     *         instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
        return this;
    }

    /**
     * Specify the Active Directory Domain to move the instance to. <p>The
     * specified Active Directory Domain must be created prior to this
     * operation. Currently only a SQL Server instance can be created in a
     * Active Directory Domain.
     *
     * @return Specify the Active Directory Domain to move the instance to. <p>The
     *         specified Active Directory Domain must be created prior to this
     *         operation. Currently only a SQL Server instance can be created in a
     *         Active Directory Domain.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * Specify the Active Directory Domain to move the instance to. <p>The
     * specified Active Directory Domain must be created prior to this
     * operation. Currently only a SQL Server instance can be created in a
     * Active Directory Domain.
     *
     * @param domain Specify the Active Directory Domain to move the instance to. <p>The
     *         specified Active Directory Domain must be created prior to this
     *         operation. Currently only a SQL Server instance can be created in a
     *         Active Directory Domain.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * Specify the Active Directory Domain to move the instance to. <p>The
     * specified Active Directory Domain must be created prior to this
     * operation. Currently only a SQL Server instance can be created in a
     * Active Directory Domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domain Specify the Active Directory Domain to move the instance to. <p>The
     *         specified Active Directory Domain must be created prior to this
     *         operation. Currently only a SQL Server instance can be created in a
     *         Active Directory Domain.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * True to copy all tags from the DB instance to snapshots of the DB
     * instance; otherwise false. The default is false.
     *
     * @return True to copy all tags from the DB instance to snapshots of the DB
     *         instance; otherwise false. The default is false.
     */
    public Boolean isCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }
    
    /**
     * True to copy all tags from the DB instance to snapshots of the DB
     * instance; otherwise false. The default is false.
     *
     * @param copyTagsToSnapshot True to copy all tags from the DB instance to snapshots of the DB
     *         instance; otherwise false. The default is false.
     */
    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }
    
    /**
     * True to copy all tags from the DB instance to snapshots of the DB
     * instance; otherwise false. The default is false.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param copyTagsToSnapshot True to copy all tags from the DB instance to snapshots of the DB
     *         instance; otherwise false. The default is false.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        return this;
    }

    /**
     * True to copy all tags from the DB instance to snapshots of the DB
     * instance; otherwise false. The default is false.
     *
     * @return True to copy all tags from the DB instance to snapshots of the DB
     *         instance; otherwise false. The default is false.
     */
    public Boolean getCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * The interval, in seconds, between points when Enhanced Monitoring
     * metrics are collected for the DB instance. To disable collecting
     * Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     * <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     * Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *
     * @return The interval, in seconds, between points when Enhanced Monitoring
     *         metrics are collected for the DB instance. To disable collecting
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
     * metrics are collected for the DB instance. To disable collecting
     * Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     * <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     * Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *
     * @param monitoringInterval The interval, in seconds, between points when Enhanced Monitoring
     *         metrics are collected for the DB instance. To disable collecting
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
     * metrics are collected for the DB instance. To disable collecting
     * Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     * <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     * Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param monitoringInterval The interval, in seconds, between points when Enhanced Monitoring
     *         metrics are collected for the DB instance. To disable collecting
     *         Enhanced Monitoring metrics, specify 0. The default is 60. <p>If
     *         <code>MonitoringRoleArn</code> is specified, then you must also set
     *         <code>MonitoringInterval</code> to a value other than 0. <p>Valid
     *         Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
        return this;
    }

    /**
     * The port number on which the database accepts connections. <p>The
     * value of the <code>DBPortNumber</code> parameter must not match any of
     * the port values specified for options in the option group for the DB
     * instance. <p>Your database will restart when you change the
     * <code>DBPortNumber</code> value regardless of the value of the
     * <code>ApplyImmediately</code> parameter. <p> <b>MySQL</b> <p> Default:
     * <code>3306</code> <p> Valid Values: <code>1150-65535</code> <p>
     * <b>MariaDB</b> <p> Default: <code>3306</code> <p> Valid Values:
     * <code>1150-65535</code> <p> <b>PostgreSQL</b> <p> Default:
     * <code>5432</code> <p> Valid Values: <code>1150-65535</code> <p>Type:
     * Integer <p> <b>Oracle</b> <p> Default: <code>1521</code> <p> Valid
     * Values: <code>1150-65535</code> <p> <b>SQL Server</b> <p> Default:
     * <code>1433</code> <p> Valid Values: <code>1150-65535</code> except for
     * <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * <p> <b>Amazon Aurora</b> <p> Default: <code>3306</code> <p> Valid
     * Values: <code>1150-65535</code>
     *
     * @return The port number on which the database accepts connections. <p>The
     *         value of the <code>DBPortNumber</code> parameter must not match any of
     *         the port values specified for options in the option group for the DB
     *         instance. <p>Your database will restart when you change the
     *         <code>DBPortNumber</code> value regardless of the value of the
     *         <code>ApplyImmediately</code> parameter. <p> <b>MySQL</b> <p> Default:
     *         <code>3306</code> <p> Valid Values: <code>1150-65535</code> <p>
     *         <b>MariaDB</b> <p> Default: <code>3306</code> <p> Valid Values:
     *         <code>1150-65535</code> <p> <b>PostgreSQL</b> <p> Default:
     *         <code>5432</code> <p> Valid Values: <code>1150-65535</code> <p>Type:
     *         Integer <p> <b>Oracle</b> <p> Default: <code>1521</code> <p> Valid
     *         Values: <code>1150-65535</code> <p> <b>SQL Server</b> <p> Default:
     *         <code>1433</code> <p> Valid Values: <code>1150-65535</code> except for
     *         <code>1434</code>, <code>3389</code>, <code>47001</code>,
     *         <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     *         <p> <b>Amazon Aurora</b> <p> Default: <code>3306</code> <p> Valid
     *         Values: <code>1150-65535</code>
     */
    public Integer getDBPortNumber() {
        return dBPortNumber;
    }
    
    /**
     * The port number on which the database accepts connections. <p>The
     * value of the <code>DBPortNumber</code> parameter must not match any of
     * the port values specified for options in the option group for the DB
     * instance. <p>Your database will restart when you change the
     * <code>DBPortNumber</code> value regardless of the value of the
     * <code>ApplyImmediately</code> parameter. <p> <b>MySQL</b> <p> Default:
     * <code>3306</code> <p> Valid Values: <code>1150-65535</code> <p>
     * <b>MariaDB</b> <p> Default: <code>3306</code> <p> Valid Values:
     * <code>1150-65535</code> <p> <b>PostgreSQL</b> <p> Default:
     * <code>5432</code> <p> Valid Values: <code>1150-65535</code> <p>Type:
     * Integer <p> <b>Oracle</b> <p> Default: <code>1521</code> <p> Valid
     * Values: <code>1150-65535</code> <p> <b>SQL Server</b> <p> Default:
     * <code>1433</code> <p> Valid Values: <code>1150-65535</code> except for
     * <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * <p> <b>Amazon Aurora</b> <p> Default: <code>3306</code> <p> Valid
     * Values: <code>1150-65535</code>
     *
     * @param dBPortNumber The port number on which the database accepts connections. <p>The
     *         value of the <code>DBPortNumber</code> parameter must not match any of
     *         the port values specified for options in the option group for the DB
     *         instance. <p>Your database will restart when you change the
     *         <code>DBPortNumber</code> value regardless of the value of the
     *         <code>ApplyImmediately</code> parameter. <p> <b>MySQL</b> <p> Default:
     *         <code>3306</code> <p> Valid Values: <code>1150-65535</code> <p>
     *         <b>MariaDB</b> <p> Default: <code>3306</code> <p> Valid Values:
     *         <code>1150-65535</code> <p> <b>PostgreSQL</b> <p> Default:
     *         <code>5432</code> <p> Valid Values: <code>1150-65535</code> <p>Type:
     *         Integer <p> <b>Oracle</b> <p> Default: <code>1521</code> <p> Valid
     *         Values: <code>1150-65535</code> <p> <b>SQL Server</b> <p> Default:
     *         <code>1433</code> <p> Valid Values: <code>1150-65535</code> except for
     *         <code>1434</code>, <code>3389</code>, <code>47001</code>,
     *         <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     *         <p> <b>Amazon Aurora</b> <p> Default: <code>3306</code> <p> Valid
     *         Values: <code>1150-65535</code>
     */
    public void setDBPortNumber(Integer dBPortNumber) {
        this.dBPortNumber = dBPortNumber;
    }
    
    /**
     * The port number on which the database accepts connections. <p>The
     * value of the <code>DBPortNumber</code> parameter must not match any of
     * the port values specified for options in the option group for the DB
     * instance. <p>Your database will restart when you change the
     * <code>DBPortNumber</code> value regardless of the value of the
     * <code>ApplyImmediately</code> parameter. <p> <b>MySQL</b> <p> Default:
     * <code>3306</code> <p> Valid Values: <code>1150-65535</code> <p>
     * <b>MariaDB</b> <p> Default: <code>3306</code> <p> Valid Values:
     * <code>1150-65535</code> <p> <b>PostgreSQL</b> <p> Default:
     * <code>5432</code> <p> Valid Values: <code>1150-65535</code> <p>Type:
     * Integer <p> <b>Oracle</b> <p> Default: <code>1521</code> <p> Valid
     * Values: <code>1150-65535</code> <p> <b>SQL Server</b> <p> Default:
     * <code>1433</code> <p> Valid Values: <code>1150-65535</code> except for
     * <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * <p> <b>Amazon Aurora</b> <p> Default: <code>3306</code> <p> Valid
     * Values: <code>1150-65535</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBPortNumber The port number on which the database accepts connections. <p>The
     *         value of the <code>DBPortNumber</code> parameter must not match any of
     *         the port values specified for options in the option group for the DB
     *         instance. <p>Your database will restart when you change the
     *         <code>DBPortNumber</code> value regardless of the value of the
     *         <code>ApplyImmediately</code> parameter. <p> <b>MySQL</b> <p> Default:
     *         <code>3306</code> <p> Valid Values: <code>1150-65535</code> <p>
     *         <b>MariaDB</b> <p> Default: <code>3306</code> <p> Valid Values:
     *         <code>1150-65535</code> <p> <b>PostgreSQL</b> <p> Default:
     *         <code>5432</code> <p> Valid Values: <code>1150-65535</code> <p>Type:
     *         Integer <p> <b>Oracle</b> <p> Default: <code>1521</code> <p> Valid
     *         Values: <code>1150-65535</code> <p> <b>SQL Server</b> <p> Default:
     *         <code>1433</code> <p> Valid Values: <code>1150-65535</code> except for
     *         <code>1434</code>, <code>3389</code>, <code>47001</code>,
     *         <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     *         <p> <b>Amazon Aurora</b> <p> Default: <code>3306</code> <p> Valid
     *         Values: <code>1150-65535</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withDBPortNumber(Integer dBPortNumber) {
        this.dBPortNumber = dBPortNumber;
        return this;
    }

    /**
     * Boolean value that indicates if the DB instance has a publicly
     * resolvable DNS name. Set to <code>True</code> to make the DB instance
     * Internet-facing with a publicly resolvable DNS name, which resolves to
     * a public IP address. Set to <code>False</code> to make the DB instance
     * internal with a DNS name that resolves to a private IP address.
     * <p><code>PubliclyAccessible</code> only applies to DB instances in a
     * VPC. The DB instance must be part of a public subnet and
     * <code>PubliclyAccessible</code> must be true in order for it to be
     * publicly accessible. <p>Changes to the <code>PubliclyAccessible</code>
     * parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter. <p> Default: false
     *
     * @return Boolean value that indicates if the DB instance has a publicly
     *         resolvable DNS name. Set to <code>True</code> to make the DB instance
     *         Internet-facing with a publicly resolvable DNS name, which resolves to
     *         a public IP address. Set to <code>False</code> to make the DB instance
     *         internal with a DNS name that resolves to a private IP address.
     *         <p><code>PubliclyAccessible</code> only applies to DB instances in a
     *         VPC. The DB instance must be part of a public subnet and
     *         <code>PubliclyAccessible</code> must be true in order for it to be
     *         publicly accessible. <p>Changes to the <code>PubliclyAccessible</code>
     *         parameter are applied immediately regardless of the value of the
     *         <code>ApplyImmediately</code> parameter. <p> Default: false
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }
    
    /**
     * Boolean value that indicates if the DB instance has a publicly
     * resolvable DNS name. Set to <code>True</code> to make the DB instance
     * Internet-facing with a publicly resolvable DNS name, which resolves to
     * a public IP address. Set to <code>False</code> to make the DB instance
     * internal with a DNS name that resolves to a private IP address.
     * <p><code>PubliclyAccessible</code> only applies to DB instances in a
     * VPC. The DB instance must be part of a public subnet and
     * <code>PubliclyAccessible</code> must be true in order for it to be
     * publicly accessible. <p>Changes to the <code>PubliclyAccessible</code>
     * parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter. <p> Default: false
     *
     * @param publiclyAccessible Boolean value that indicates if the DB instance has a publicly
     *         resolvable DNS name. Set to <code>True</code> to make the DB instance
     *         Internet-facing with a publicly resolvable DNS name, which resolves to
     *         a public IP address. Set to <code>False</code> to make the DB instance
     *         internal with a DNS name that resolves to a private IP address.
     *         <p><code>PubliclyAccessible</code> only applies to DB instances in a
     *         VPC. The DB instance must be part of a public subnet and
     *         <code>PubliclyAccessible</code> must be true in order for it to be
     *         publicly accessible. <p>Changes to the <code>PubliclyAccessible</code>
     *         parameter are applied immediately regardless of the value of the
     *         <code>ApplyImmediately</code> parameter. <p> Default: false
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }
    
    /**
     * Boolean value that indicates if the DB instance has a publicly
     * resolvable DNS name. Set to <code>True</code> to make the DB instance
     * Internet-facing with a publicly resolvable DNS name, which resolves to
     * a public IP address. Set to <code>False</code> to make the DB instance
     * internal with a DNS name that resolves to a private IP address.
     * <p><code>PubliclyAccessible</code> only applies to DB instances in a
     * VPC. The DB instance must be part of a public subnet and
     * <code>PubliclyAccessible</code> must be true in order for it to be
     * publicly accessible. <p>Changes to the <code>PubliclyAccessible</code>
     * parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter. <p> Default: false
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publiclyAccessible Boolean value that indicates if the DB instance has a publicly
     *         resolvable DNS name. Set to <code>True</code> to make the DB instance
     *         Internet-facing with a publicly resolvable DNS name, which resolves to
     *         a public IP address. Set to <code>False</code> to make the DB instance
     *         internal with a DNS name that resolves to a private IP address.
     *         <p><code>PubliclyAccessible</code> only applies to DB instances in a
     *         VPC. The DB instance must be part of a public subnet and
     *         <code>PubliclyAccessible</code> must be true in order for it to be
     *         publicly accessible. <p>Changes to the <code>PubliclyAccessible</code>
     *         parameter are applied immediately regardless of the value of the
     *         <code>ApplyImmediately</code> parameter. <p> Default: false
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * Boolean value that indicates if the DB instance has a publicly
     * resolvable DNS name. Set to <code>True</code> to make the DB instance
     * Internet-facing with a publicly resolvable DNS name, which resolves to
     * a public IP address. Set to <code>False</code> to make the DB instance
     * internal with a DNS name that resolves to a private IP address.
     * <p><code>PubliclyAccessible</code> only applies to DB instances in a
     * VPC. The DB instance must be part of a public subnet and
     * <code>PubliclyAccessible</code> must be true in order for it to be
     * publicly accessible. <p>Changes to the <code>PubliclyAccessible</code>
     * parameter are applied immediately regardless of the value of the
     * <code>ApplyImmediately</code> parameter. <p> Default: false
     *
     * @return Boolean value that indicates if the DB instance has a publicly
     *         resolvable DNS name. Set to <code>True</code> to make the DB instance
     *         Internet-facing with a publicly resolvable DNS name, which resolves to
     *         a public IP address. Set to <code>False</code> to make the DB instance
     *         internal with a DNS name that resolves to a private IP address.
     *         <p><code>PubliclyAccessible</code> only applies to DB instances in a
     *         VPC. The DB instance must be part of a public subnet and
     *         <code>PubliclyAccessible</code> must be true in order for it to be
     *         publicly accessible. <p>Changes to the <code>PubliclyAccessible</code>
     *         parameter are applied immediately regardless of the value of the
     *         <code>ApplyImmediately</code> parameter. <p> Default: false
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
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
    public ModifyDBInstanceRequest withMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
        return this;
    }

    /**
     * Specify the name of the IAM role to be used when making API calls to
     * the Directory Service.
     *
     * @return Specify the name of the IAM role to be used when making API calls to
     *         the Directory Service.
     */
    public String getDomainIAMRoleName() {
        return domainIAMRoleName;
    }
    
    /**
     * Specify the name of the IAM role to be used when making API calls to
     * the Directory Service.
     *
     * @param domainIAMRoleName Specify the name of the IAM role to be used when making API calls to
     *         the Directory Service.
     */
    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }
    
    /**
     * Specify the name of the IAM role to be used when making API calls to
     * the Directory Service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainIAMRoleName Specify the name of the IAM role to be used when making API calls to
     *         the Directory Service.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
        return this;
    }

    /**
     * A value that specifies the order in which an Aurora Replica is
     * promoted to the primary instance after a failure of the existing
     * primary instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>. <p>Default: 1 <p>Valid
     * Values: 0 - 15
     *
     * @return A value that specifies the order in which an Aurora Replica is
     *         promoted to the primary instance after a failure of the existing
     *         primary instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     *         Fault Tolerance for an Aurora DB Cluster</a>. <p>Default: 1 <p>Valid
     *         Values: 0 - 15
     */
    public Integer getPromotionTier() {
        return promotionTier;
    }
    
    /**
     * A value that specifies the order in which an Aurora Replica is
     * promoted to the primary instance after a failure of the existing
     * primary instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>. <p>Default: 1 <p>Valid
     * Values: 0 - 15
     *
     * @param promotionTier A value that specifies the order in which an Aurora Replica is
     *         promoted to the primary instance after a failure of the existing
     *         primary instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     *         Fault Tolerance for an Aurora DB Cluster</a>. <p>Default: 1 <p>Valid
     *         Values: 0 - 15
     */
    public void setPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
    }
    
    /**
     * A value that specifies the order in which an Aurora Replica is
     * promoted to the primary instance after a failure of the existing
     * primary instance. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>. <p>Default: 1 <p>Valid
     * Values: 0 - 15
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param promotionTier A value that specifies the order in which an Aurora Replica is
     *         promoted to the primary instance after a failure of the existing
     *         primary instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     *         Fault Tolerance for an Aurora DB Cluster</a>. <p>Default: 1 <p>Valid
     *         Values: 0 - 15
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBInstanceRequest withPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
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
        if (getAllocatedStorage() != null) sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getDBInstanceClass() != null) sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getDBSecurityGroups() != null) sb.append("DBSecurityGroups: " + getDBSecurityGroups() + ",");
        if (getVpcSecurityGroupIds() != null) sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (isApplyImmediately() != null) sb.append("ApplyImmediately: " + isApplyImmediately() + ",");
        if (getMasterUserPassword() != null) sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getDBParameterGroupName() != null) sb.append("DBParameterGroupName: " + getDBParameterGroupName() + ",");
        if (getBackupRetentionPeriod() != null) sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getPreferredBackupWindow() != null) sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (isMultiAZ() != null) sb.append("MultiAZ: " + isMultiAZ() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (isAllowMajorVersionUpgrade() != null) sb.append("AllowMajorVersionUpgrade: " + isAllowMajorVersionUpgrade() + ",");
        if (isAutoMinorVersionUpgrade() != null) sb.append("AutoMinorVersionUpgrade: " + isAutoMinorVersionUpgrade() + ",");
        if (getIops() != null) sb.append("Iops: " + getIops() + ",");
        if (getOptionGroupName() != null) sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getNewDBInstanceIdentifier() != null) sb.append("NewDBInstanceIdentifier: " + getNewDBInstanceIdentifier() + ",");
        if (getStorageType() != null) sb.append("StorageType: " + getStorageType() + ",");
        if (getTdeCredentialArn() != null) sb.append("TdeCredentialArn: " + getTdeCredentialArn() + ",");
        if (getTdeCredentialPassword() != null) sb.append("TdeCredentialPassword: " + getTdeCredentialPassword() + ",");
        if (getCACertificateIdentifier() != null) sb.append("CACertificateIdentifier: " + getCACertificateIdentifier() + ",");
        if (getDomain() != null) sb.append("Domain: " + getDomain() + ",");
        if (isCopyTagsToSnapshot() != null) sb.append("CopyTagsToSnapshot: " + isCopyTagsToSnapshot() + ",");
        if (getMonitoringInterval() != null) sb.append("MonitoringInterval: " + getMonitoringInterval() + ",");
        if (getDBPortNumber() != null) sb.append("DBPortNumber: " + getDBPortNumber() + ",");
        if (isPubliclyAccessible() != null) sb.append("PubliclyAccessible: " + isPubliclyAccessible() + ",");
        if (getMonitoringRoleArn() != null) sb.append("MonitoringRoleArn: " + getMonitoringRoleArn() + ",");
        if (getDomainIAMRoleName() != null) sb.append("DomainIAMRoleName: " + getDomainIAMRoleName() + ",");
        if (getPromotionTier() != null) sb.append("PromotionTier: " + getPromotionTier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroups() == null) ? 0 : getDBSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((isApplyImmediately() == null) ? 0 : isApplyImmediately().hashCode()); 
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode()); 
        hashCode = prime * hashCode + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        hashCode = prime * hashCode + ((isMultiAZ() == null) ? 0 : isMultiAZ().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((isAllowMajorVersionUpgrade() == null) ? 0 : isAllowMajorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getNewDBInstanceIdentifier() == null) ? 0 : getNewDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode()); 
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode()); 
        hashCode = prime * hashCode + ((getTdeCredentialPassword() == null) ? 0 : getTdeCredentialPassword().hashCode()); 
        hashCode = prime * hashCode + ((getCACertificateIdentifier() == null) ? 0 : getCACertificateIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        hashCode = prime * hashCode + ((isCopyTagsToSnapshot() == null) ? 0 : isCopyTagsToSnapshot().hashCode()); 
        hashCode = prime * hashCode + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode()); 
        hashCode = prime * hashCode + ((getDBPortNumber() == null) ? 0 : getDBPortNumber().hashCode()); 
        hashCode = prime * hashCode + ((isPubliclyAccessible() == null) ? 0 : isPubliclyAccessible().hashCode()); 
        hashCode = prime * hashCode + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode()); 
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode()); 
        hashCode = prime * hashCode + ((getPromotionTier() == null) ? 0 : getPromotionTier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyDBInstanceRequest == false) return false;
        ModifyDBInstanceRequest other = (ModifyDBInstanceRequest)obj;
        
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null) return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false) return false; 
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null) return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false) return false; 
        if (other.getDBSecurityGroups() == null ^ this.getDBSecurityGroups() == null) return false;
        if (other.getDBSecurityGroups() != null && other.getDBSecurityGroups().equals(this.getDBSecurityGroups()) == false) return false; 
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null) return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false) return false; 
        if (other.isApplyImmediately() == null ^ this.isApplyImmediately() == null) return false;
        if (other.isApplyImmediately() != null && other.isApplyImmediately().equals(this.isApplyImmediately()) == false) return false; 
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null) return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false) return false; 
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null) return false;
        if (other.getDBParameterGroupName() != null && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false) return false; 
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null) return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false) return false; 
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null) return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.isMultiAZ() == null ^ this.isMultiAZ() == null) return false;
        if (other.isMultiAZ() != null && other.isMultiAZ().equals(this.isMultiAZ()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.isAllowMajorVersionUpgrade() == null ^ this.isAllowMajorVersionUpgrade() == null) return false;
        if (other.isAllowMajorVersionUpgrade() != null && other.isAllowMajorVersionUpgrade().equals(this.isAllowMajorVersionUpgrade()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        if (other.getNewDBInstanceIdentifier() == null ^ this.getNewDBInstanceIdentifier() == null) return false;
        if (other.getNewDBInstanceIdentifier() != null && other.getNewDBInstanceIdentifier().equals(this.getNewDBInstanceIdentifier()) == false) return false; 
        if (other.getStorageType() == null ^ this.getStorageType() == null) return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false) return false; 
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null) return false;
        if (other.getTdeCredentialArn() != null && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false) return false; 
        if (other.getTdeCredentialPassword() == null ^ this.getTdeCredentialPassword() == null) return false;
        if (other.getTdeCredentialPassword() != null && other.getTdeCredentialPassword().equals(this.getTdeCredentialPassword()) == false) return false; 
        if (other.getCACertificateIdentifier() == null ^ this.getCACertificateIdentifier() == null) return false;
        if (other.getCACertificateIdentifier() != null && other.getCACertificateIdentifier().equals(this.getCACertificateIdentifier()) == false) return false; 
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.isCopyTagsToSnapshot() == null ^ this.isCopyTagsToSnapshot() == null) return false;
        if (other.isCopyTagsToSnapshot() != null && other.isCopyTagsToSnapshot().equals(this.isCopyTagsToSnapshot()) == false) return false; 
        if (other.getMonitoringInterval() == null ^ this.getMonitoringInterval() == null) return false;
        if (other.getMonitoringInterval() != null && other.getMonitoringInterval().equals(this.getMonitoringInterval()) == false) return false; 
        if (other.getDBPortNumber() == null ^ this.getDBPortNumber() == null) return false;
        if (other.getDBPortNumber() != null && other.getDBPortNumber().equals(this.getDBPortNumber()) == false) return false; 
        if (other.isPubliclyAccessible() == null ^ this.isPubliclyAccessible() == null) return false;
        if (other.isPubliclyAccessible() != null && other.isPubliclyAccessible().equals(this.isPubliclyAccessible()) == false) return false; 
        if (other.getMonitoringRoleArn() == null ^ this.getMonitoringRoleArn() == null) return false;
        if (other.getMonitoringRoleArn() != null && other.getMonitoringRoleArn().equals(this.getMonitoringRoleArn()) == false) return false; 
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null) return false;
        if (other.getDomainIAMRoleName() != null && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false) return false; 
        if (other.getPromotionTier() == null ^ this.getPromotionTier() == null) return false;
        if (other.getPromotionTier() != null && other.getPromotionTier().equals(this.getPromotionTier()) == false) return false; 
        return true;
    }
    
    @Override
    public ModifyDBInstanceRequest clone() {
        
            return (ModifyDBInstanceRequest) super.clone();
    }

}
    