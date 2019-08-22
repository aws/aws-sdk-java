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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints: This identifier must match the identifier of an existing DB cluster.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     */
    private String newDBClusterIdentifier;
    /**
     * <p>
     * A value that indicates whether the modifications in this request and any pending modifications are asynchronously
     * applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     * cluster. If this parameter is disabled, changes to the DB cluster are applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     * <code>ApplyImmediately</code> parameter is disabled, then changes to the
     * <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     * <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other changes are
     * applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * By default, this parameter is disabled.
     * </p>
     */
    private Boolean applyImmediately;
    /**
     * <p>
     * The number of days for which automated backups are retained. You must specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * The name of the DB cluster parameter group to use for the DB cluster.
     * </p>
     */
    private String dBClusterParameterGroupName;
    /**
     * <p>
     * A list of VPC security groups that the DB cluster will belong to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The port number on which the DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The new password for the master database user. This password can contain any printable ASCII character except
     * "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified option group. Changing this
     * parameter doesn't result in an outage except in the following case, and the change is applied during the next
     * maintenance window unless the <code>ApplyImmediately</code> is enabled for this request. If the parameter change
     * results in an option group that enables OEM, this change can cause a brief (sub-second) period during which new
     * connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options can't be removed from an option group. The option group can't be removed from a DB cluster once
     * it is associated with a DB cluster.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the
     * time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
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
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring
     * on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts. By default, mapping is disabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;
    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     */
    private Long backtrackWindow;
    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * cluster.
     * </p>
     */
    private CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration;
    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code> is enabled.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use
     * the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the DB cluster's current version.
     * </p>
     */
    private Boolean allowMajorVersionUpgrade;
    /**
     * <p>
     * The name of the DB parameter group to apply to all instances of the DB cluster.
     * </p>
     * <note>
     * <p>
     * When you apply a parameter group using the <code>DBInstanceParameterGroupName</code> parameter, the DB cluster
     * isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance window but
     * instead are applied immediately.
     * </p>
     * </note>
     * <p>
     * Default: The existing name setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB parameter group must be in the same DB parameter group family as this DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>DBInstanceParameterGroupName</code> parameter is only valid in combination with the
     * <code>AllowMajorVersionUpgrade</code> parameter.
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceParameterGroupName;
    /**
     * <p>
     * The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in
     * <code>serverless</code> DB engine mode.
     * </p>
     */
    private ScalingConfiguration scalingConfiguration;
    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection is disabled.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the
     * HTTP endpoint is disabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     */
    private Boolean enableHttpEndpoint;
    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     */
    private Boolean copyTagsToSnapshot;

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints: This identifier must match the identifier of an existing DB cluster.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive.</p>
     *        <p>
     *        Constraints: This identifier must match the identifier of an existing DB cluster.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints: This identifier must match the identifier of an existing DB cluster.
     * </p>
     * 
     * @return The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive.</p>
     *         <p>
     *         Constraints: This identifier must match the identifier of an existing DB cluster.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive.
     * </p>
     * <p>
     * Constraints: This identifier must match the identifier of an existing DB cluster.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier for the cluster being modified. This parameter is not case-sensitive.</p>
     *        <p>
     *        Constraints: This identifier must match the identifier of an existing DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     * 
     * @param newDBClusterIdentifier
     *        The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a
     *        lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster2</code>
     */

    public void setNewDBClusterIdentifier(String newDBClusterIdentifier) {
        this.newDBClusterIdentifier = newDBClusterIdentifier;
    }

    /**
     * <p>
     * The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     * 
     * @return The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a
     *         lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster2</code>
     */

    public String getNewDBClusterIdentifier() {
        return this.newDBClusterIdentifier;
    }

    /**
     * <p>
     * The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a lowercase
     * string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     * 
     * @param newDBClusterIdentifier
     *        The new DB cluster identifier for the DB cluster when renaming a DB cluster. This value is stored as a
     *        lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-cluster2</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withNewDBClusterIdentifier(String newDBClusterIdentifier) {
        setNewDBClusterIdentifier(newDBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any pending modifications are asynchronously
     * applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     * cluster. If this parameter is disabled, changes to the DB cluster are applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     * <code>ApplyImmediately</code> parameter is disabled, then changes to the
     * <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     * <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other changes are
     * applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * By default, this parameter is disabled.
     * </p>
     * 
     * @param applyImmediately
     *        A value that indicates whether the modifications in this request and any pending modifications are
     *        asynchronously applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *        setting for the DB cluster. If this parameter is disabled, changes to the DB cluster are applied during
     *        the next maintenance window.</p>
     *        <p>
     *        The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>,
     *        <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     *        <code>ApplyImmediately</code> parameter is disabled, then changes to the
     *        <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     *        <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other
     *        changes are applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        By default, this parameter is disabled.
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any pending modifications are asynchronously
     * applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     * cluster. If this parameter is disabled, changes to the DB cluster are applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     * <code>ApplyImmediately</code> parameter is disabled, then changes to the
     * <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     * <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other changes are
     * applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * By default, this parameter is disabled.
     * </p>
     * 
     * @return A value that indicates whether the modifications in this request and any pending modifications are
     *         asynchronously applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *         setting for the DB cluster. If this parameter is disabled, changes to the DB cluster are applied during
     *         the next maintenance window.</p>
     *         <p>
     *         The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     *         <code>ApplyImmediately</code> parameter is disabled, then changes to the
     *         <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     *         <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other
     *         changes are applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     *         </p>
     *         <p>
     *         By default, this parameter is disabled.
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any pending modifications are asynchronously
     * applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     * cluster. If this parameter is disabled, changes to the DB cluster are applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     * <code>ApplyImmediately</code> parameter is disabled, then changes to the
     * <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     * <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other changes are
     * applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * By default, this parameter is disabled.
     * </p>
     * 
     * @param applyImmediately
     *        A value that indicates whether the modifications in this request and any pending modifications are
     *        asynchronously applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *        setting for the DB cluster. If this parameter is disabled, changes to the DB cluster are applied during
     *        the next maintenance window.</p>
     *        <p>
     *        The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>,
     *        <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     *        <code>ApplyImmediately</code> parameter is disabled, then changes to the
     *        <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     *        <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other
     *        changes are applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        By default, this parameter is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any pending modifications are asynchronously
     * applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     * cluster. If this parameter is disabled, changes to the DB cluster are applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     * <code>ApplyImmediately</code> parameter is disabled, then changes to the
     * <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     * <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other changes are
     * applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * By default, this parameter is disabled.
     * </p>
     * 
     * @return A value that indicates whether the modifications in this request and any pending modifications are
     *         asynchronously applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *         setting for the DB cluster. If this parameter is disabled, changes to the DB cluster are applied during
     *         the next maintenance window.</p>
     *         <p>
     *         The <code>ApplyImmediately</code> parameter only affects the <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code> values. If the
     *         <code>ApplyImmediately</code> parameter is disabled, then changes to the
     *         <code>EnableIAMDatabaseAuthentication</code>, <code>MasterUserPassword</code>, and
     *         <code>NewDBClusterIdentifier</code> values are applied during the next maintenance window. All other
     *         changes are applied immediately, regardless of the value of the <code>ApplyImmediately</code> parameter.
     *         </p>
     *         <p>
     *         By default, this parameter is disabled.
     */

    public Boolean isApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. You must specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained. You must specify a minimum value of 1.</p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 1 to 35
     *        </p>
     *        </li>
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. You must specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of days for which automated backups are retained. You must specify a minimum value of 1.</p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be a value from 1 to 35
     *         </p>
     *         </li>
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. You must specify a minimum value of 1.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 1 to 35
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained. You must specify a minimum value of 1.</p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 1 to 35
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to use for the DB cluster.
     * </p>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to use for the DB cluster.
     */

    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to use for the DB cluster.
     * </p>
     * 
     * @return The name of the DB cluster parameter group to use for the DB cluster.
     */

    public String getDBClusterParameterGroupName() {
        return this.dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to use for the DB cluster.
     * </p>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to use for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        setDBClusterParameterGroupName(dBClusterParameterGroupName);
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB cluster will belong to.
     * </p>
     * 
     * @return A list of VPC security groups that the DB cluster will belong to.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB cluster will belong to.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security groups that the DB cluster will belong to.
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
     * A list of VPC security groups that the DB cluster will belong to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security groups that the DB cluster will belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of VPC security groups that the DB cluster will belong to.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security groups that the DB cluster will belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The port number on which the DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * 
     * @param port
     *        The port number on which the DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: Value must be <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Default: The same port as the original DB cluster.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * 
     * @return The port number on which the DB cluster accepts connections.</p>
     *         <p>
     *         Constraints: Value must be <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Default: The same port as the original DB cluster.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * 
     * @param port
     *        The port number on which the DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: Value must be <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Default: The same port as the original DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The new password for the master database user. This password can contain any printable ASCII character except
     * "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * 
     * @param masterUserPassword
     *        The new password for the master database user. This password can contain any printable ASCII character
     *        except "/", """, or "@".</p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The new password for the master database user. This password can contain any printable ASCII character except
     * "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * 
     * @return The new password for the master database user. This password can contain any printable ASCII character
     *         except "/", """, or "@".</p>
     *         <p>
     *         Constraints: Must contain from 8 to 41 characters.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The new password for the master database user. This password can contain any printable ASCII character except
     * "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * 
     * @param masterUserPassword
     *        The new password for the master database user. This password can contain any printable ASCII character
     *        except "/", """, or "@".</p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified option group. Changing this
     * parameter doesn't result in an outage except in the following case, and the change is applied during the next
     * maintenance window unless the <code>ApplyImmediately</code> is enabled for this request. If the parameter change
     * results in an option group that enables OEM, this change can cause a brief (sub-second) period during which new
     * connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options can't be removed from an option group. The option group can't be removed from a DB cluster once
     * it is associated with a DB cluster.
     * </p>
     * 
     * @param optionGroupName
     *        A value that indicates that the DB cluster should be associated with the specified option group. Changing
     *        this parameter doesn't result in an outage except in the following case, and the change is applied during
     *        the next maintenance window unless the <code>ApplyImmediately</code> is enabled for this request. If the
     *        parameter change results in an option group that enables OEM, this change can cause a brief (sub-second)
     *        period during which new connections are rejected but existing connections are not interrupted. </p>
     *        <p>
     *        Permanent options can't be removed from an option group. The option group can't be removed from a DB
     *        cluster once it is associated with a DB cluster.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified option group. Changing this
     * parameter doesn't result in an outage except in the following case, and the change is applied during the next
     * maintenance window unless the <code>ApplyImmediately</code> is enabled for this request. If the parameter change
     * results in an option group that enables OEM, this change can cause a brief (sub-second) period during which new
     * connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options can't be removed from an option group. The option group can't be removed from a DB cluster once
     * it is associated with a DB cluster.
     * </p>
     * 
     * @return A value that indicates that the DB cluster should be associated with the specified option group. Changing
     *         this parameter doesn't result in an outage except in the following case, and the change is applied during
     *         the next maintenance window unless the <code>ApplyImmediately</code> is enabled for this request. If the
     *         parameter change results in an option group that enables OEM, this change can cause a brief (sub-second)
     *         period during which new connections are rejected but existing connections are not interrupted. </p>
     *         <p>
     *         Permanent options can't be removed from an option group. The option group can't be removed from a DB
     *         cluster once it is associated with a DB cluster.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the specified option group. Changing this
     * parameter doesn't result in an outage except in the following case, and the change is applied during the next
     * maintenance window unless the <code>ApplyImmediately</code> is enabled for this request. If the parameter change
     * results in an option group that enables OEM, this change can cause a brief (sub-second) period during which new
     * connections are rejected but existing connections are not interrupted.
     * </p>
     * <p>
     * Permanent options can't be removed from an option group. The option group can't be removed from a DB cluster once
     * it is associated with a DB cluster.
     * </p>
     * 
     * @param optionGroupName
     *        A value that indicates that the DB cluster should be associated with the specified option group. Changing
     *        this parameter doesn't result in an outage except in the following case, and the change is applied during
     *        the next maintenance window unless the <code>ApplyImmediately</code> is enabled for this request. If the
     *        parameter change results in an option group that enables OEM, this change can cause a brief (sub-second)
     *        period during which new connections are rejected but existing connections are not interrupted. </p>
     *        <p>
     *        Permanent options can't be removed from an option group. The option group can't be removed from a DB
     *        cluster once it is associated with a DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the
     * time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
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
     *        The daily time range during which automated backups are created if automated backups are enabled, using
     *        the <code>BackupRetentionPeriod</code> parameter. </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To
     *        see the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *        > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
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
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the
     * time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
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
     * @return The daily time range during which automated backups are created if automated backups are enabled, using
     *         the <code>BackupRetentionPeriod</code> parameter. </p>
     *         <p>
     *         The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To
     *         see the time blocks available, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *         > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
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
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To see the
     * time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
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
     *        The daily time range during which automated backups are created if automated backups are enabled, using
     *        the <code>BackupRetentionPeriod</code> parameter. </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region. To
     *        see the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *        > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
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

    public ModifyDBClusterRequest withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring
     * on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region,
     *        occurring on a random day of the week. To see the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *        > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring
     * on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @return The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *         <p>
     *         Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region,
     *         occurring on a random day of the week. To see the time blocks available, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *         > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
     *         </p>
     *         <p>
     *         Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *         </p>
     *         <p>
     *         Constraints: Minimum 30-minute window.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region, occurring
     * on a random day of the week. To see the time blocks available, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     * > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region,
     *        occurring on a random day of the week. To see the time blocks available, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow.Aurora"
     *        > Adjusting the Preferred DB Cluster Maintenance Window</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts. By default, mapping is disabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to
     *        database accounts. By default, mapping is disabled.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *        Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     */

    public void setEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts. By default, mapping is disabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to
     *         database accounts. By default, mapping is disabled.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *         Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     */

    public Boolean getEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts. By default, mapping is disabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to
     *        database accounts. By default, mapping is disabled.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *        Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        setEnableIAMDatabaseAuthentication(enableIAMDatabaseAuthentication);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to database
     * accounts. By default, mapping is disabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of AWS Identity and Access Management (IAM) accounts to
     *         database accounts. By default, mapping is disabled.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *         Database Authentication</a> in the <i>Amazon Aurora User Guide.</i>
     */

    public Boolean isEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * 
     * @param backtrackWindow
     *        The target backtrack window, in seconds. To disable backtracking, set this value to 0.</p>
     *        <p>
     *        Default: 0
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *        </p>
     *        </li>
     */

    public void setBacktrackWindow(Long backtrackWindow) {
        this.backtrackWindow = backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The target backtrack window, in seconds. To disable backtracking, set this value to 0.</p>
     *         <p>
     *         Default: 0
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *         </p>
     *         </li>
     */

    public Long getBacktrackWindow() {
        return this.backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * 
     * @param backtrackWindow
     *        The target backtrack window, in seconds. To disable backtracking, set this value to 0.</p>
     *        <p>
     *        Default: 0
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withBacktrackWindow(Long backtrackWindow) {
        setBacktrackWindow(backtrackWindow);
        return this;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * cluster.
     * </p>
     * 
     * @param cloudwatchLogsExportConfiguration
     *        The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     *        cluster.
     */

    public void setCloudwatchLogsExportConfiguration(CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration) {
        this.cloudwatchLogsExportConfiguration = cloudwatchLogsExportConfiguration;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * cluster.
     * </p>
     * 
     * @return The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     *         cluster.
     */

    public CloudwatchLogsExportConfiguration getCloudwatchLogsExportConfiguration() {
        return this.cloudwatchLogsExportConfiguration;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     * cluster.
     * </p>
     * 
     * @param cloudwatchLogsExportConfiguration
     *        The configuration setting for the log types to be enabled for export to CloudWatch Logs for a specific DB
     *        cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withCloudwatchLogsExportConfiguration(CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration) {
        setCloudwatchLogsExportConfiguration(cloudwatchLogsExportConfiguration);
        return this;
    }

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code> is enabled.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use
     * the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to which you want to upgrade. Changing this parameter results in
     *        an outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code>
     *        is enabled.</p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora),
     *        use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible
     *        Aurora), use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora-postgresql</code>, use the following
     *        command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code> is enabled.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use
     * the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * 
     * @return The version number of the database engine to which you want to upgrade. Changing this parameter results
     *         in an outage. The change is applied during the next maintenance window unless
     *         <code>ApplyImmediately</code> is enabled.</p>
     *         <p>
     *         To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora),
     *         use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible
     *         Aurora), use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     *         </p>
     *         <p>
     *         To list all of the available engine versions for <code>aurora-postgresql</code>, use the following
     *         command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code> is enabled.
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora), use the
     * following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora), use
     * the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * <p>
     * To list all of the available engine versions for <code>aurora-postgresql</code>, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to which you want to upgrade. Changing this parameter results in
     *        an outage. The change is applied during the next maintenance window unless <code>ApplyImmediately</code>
     *        is enabled.</p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora</code> (for MySQL 5.6-compatible Aurora),
     *        use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora-mysql</code> (for MySQL 5.7-compatible
     *        Aurora), use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-mysql --query "DBEngineVersions[].EngineVersion"</code>
     *        </p>
     *        <p>
     *        To list all of the available engine versions for <code>aurora-postgresql</code>, use the following
     *        command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --engine aurora-postgresql --query "DBEngineVersions[].EngineVersion"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the DB cluster's current version.
     * </p>
     * 
     * @param allowMajorVersionUpgrade
     *        A value that indicates whether major version upgrades are allowed.</p>
     *        <p>
     *        Constraints: You must allow major version upgrades when specifying a value for the
     *        <code>EngineVersion</code> parameter that is a different major version than the DB cluster's current
     *        version.
     */

    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the DB cluster's current version.
     * </p>
     * 
     * @return A value that indicates whether major version upgrades are allowed.</p>
     *         <p>
     *         Constraints: You must allow major version upgrades when specifying a value for the
     *         <code>EngineVersion</code> parameter that is a different major version than the DB cluster's current
     *         version.
     */

    public Boolean getAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the DB cluster's current version.
     * </p>
     * 
     * @param allowMajorVersionUpgrade
     *        A value that indicates whether major version upgrades are allowed.</p>
     *        <p>
     *        Constraints: You must allow major version upgrades when specifying a value for the
     *        <code>EngineVersion</code> parameter that is a different major version than the DB cluster's current
     *        version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        setAllowMajorVersionUpgrade(allowMajorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a value for the <code>EngineVersion</code>
     * parameter that is a different major version than the DB cluster's current version.
     * </p>
     * 
     * @return A value that indicates whether major version upgrades are allowed.</p>
     *         <p>
     *         Constraints: You must allow major version upgrades when specifying a value for the
     *         <code>EngineVersion</code> parameter that is a different major version than the DB cluster's current
     *         version.
     */

    public Boolean isAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to all instances of the DB cluster.
     * </p>
     * <note>
     * <p>
     * When you apply a parameter group using the <code>DBInstanceParameterGroupName</code> parameter, the DB cluster
     * isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance window but
     * instead are applied immediately.
     * </p>
     * </note>
     * <p>
     * Default: The existing name setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB parameter group must be in the same DB parameter group family as this DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>DBInstanceParameterGroupName</code> parameter is only valid in combination with the
     * <code>AllowMajorVersionUpgrade</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceParameterGroupName
     *        The name of the DB parameter group to apply to all instances of the DB cluster. </p> <note>
     *        <p>
     *        When you apply a parameter group using the <code>DBInstanceParameterGroupName</code> parameter, the DB
     *        cluster isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance
     *        window but instead are applied immediately.
     *        </p>
     *        </note>
     *        <p>
     *        Default: The existing name setting
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The DB parameter group must be in the same DB parameter group family as this DB cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>DBInstanceParameterGroupName</code> parameter is only valid in combination with the
     *        <code>AllowMajorVersionUpgrade</code> parameter.
     *        </p>
     *        </li>
     */

    public void setDBInstanceParameterGroupName(String dBInstanceParameterGroupName) {
        this.dBInstanceParameterGroupName = dBInstanceParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to all instances of the DB cluster.
     * </p>
     * <note>
     * <p>
     * When you apply a parameter group using the <code>DBInstanceParameterGroupName</code> parameter, the DB cluster
     * isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance window but
     * instead are applied immediately.
     * </p>
     * </note>
     * <p>
     * Default: The existing name setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB parameter group must be in the same DB parameter group family as this DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>DBInstanceParameterGroupName</code> parameter is only valid in combination with the
     * <code>AllowMajorVersionUpgrade</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the DB parameter group to apply to all instances of the DB cluster. </p> <note>
     *         <p>
     *         When you apply a parameter group using the <code>DBInstanceParameterGroupName</code> parameter, the DB
     *         cluster isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance
     *         window but instead are applied immediately.
     *         </p>
     *         </note>
     *         <p>
     *         Default: The existing name setting
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The DB parameter group must be in the same DB parameter group family as this DB cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DBInstanceParameterGroupName</code> parameter is only valid in combination with the
     *         <code>AllowMajorVersionUpgrade</code> parameter.
     *         </p>
     *         </li>
     */

    public String getDBInstanceParameterGroupName() {
        return this.dBInstanceParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to all instances of the DB cluster.
     * </p>
     * <note>
     * <p>
     * When you apply a parameter group using the <code>DBInstanceParameterGroupName</code> parameter, the DB cluster
     * isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance window but
     * instead are applied immediately.
     * </p>
     * </note>
     * <p>
     * Default: The existing name setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB parameter group must be in the same DB parameter group family as this DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>DBInstanceParameterGroupName</code> parameter is only valid in combination with the
     * <code>AllowMajorVersionUpgrade</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBInstanceParameterGroupName
     *        The name of the DB parameter group to apply to all instances of the DB cluster. </p> <note>
     *        <p>
     *        When you apply a parameter group using the <code>DBInstanceParameterGroupName</code> parameter, the DB
     *        cluster isn't rebooted automatically. Also, parameter changes aren't applied during the next maintenance
     *        window but instead are applied immediately.
     *        </p>
     *        </note>
     *        <p>
     *        Default: The existing name setting
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The DB parameter group must be in the same DB parameter group family as this DB cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>DBInstanceParameterGroupName</code> parameter is only valid in combination with the
     *        <code>AllowMajorVersionUpgrade</code> parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withDBInstanceParameterGroupName(String dBInstanceParameterGroupName) {
        setDBInstanceParameterGroupName(dBInstanceParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in
     * <code>serverless</code> DB engine mode.
     * </p>
     * 
     * @param scalingConfiguration
     *        The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in
     *        <code>serverless</code> DB engine mode.
     */

    public void setScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
    }

    /**
     * <p>
     * The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in
     * <code>serverless</code> DB engine mode.
     * </p>
     * 
     * @return The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in
     *         <code>serverless</code> DB engine mode.
     */

    public ScalingConfiguration getScalingConfiguration() {
        return this.scalingConfiguration;
    }

    /**
     * <p>
     * The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in
     * <code>serverless</code> DB engine mode.
     * </p>
     * 
     * @param scalingConfiguration
     *        The scaling properties of the DB cluster. You can only modify scaling properties for DB clusters in
     *        <code>serverless</code> DB engine mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        setScalingConfiguration(scalingConfiguration);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection is disabled.
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection is disabled.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection is disabled.
     * </p>
     * 
     * @return A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection is disabled.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection is disabled.
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection is disabled.
     * </p>
     * 
     * @return A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection is disabled.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the
     * HTTP endpoint is disabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param enableHttpEndpoint
     *        A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By
     *        default, the HTTP endpoint is disabled.</p>
     *        <p>
     *        When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *        Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query
     *        editor.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *        Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public void setEnableHttpEndpoint(Boolean enableHttpEndpoint) {
        this.enableHttpEndpoint = enableHttpEndpoint;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the
     * HTTP endpoint is disabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @return A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By
     *         default, the HTTP endpoint is disabled.</p>
     *         <p>
     *         When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *         Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query
     *         editor.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *         Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public Boolean getEnableHttpEndpoint() {
        return this.enableHttpEndpoint;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the
     * HTTP endpoint is disabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param enableHttpEndpoint
     *        A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By
     *        default, the HTTP endpoint is disabled.</p>
     *        <p>
     *        When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *        Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query
     *        editor.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *        Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withEnableHttpEndpoint(Boolean enableHttpEndpoint) {
        setEnableHttpEndpoint(enableHttpEndpoint);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By default, the
     * HTTP endpoint is disabled.
     * </p>
     * <p>
     * When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the Aurora
     * Serverless DB cluster. You can also query your database from inside the RDS console with the query editor.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for Aurora
     * Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @return A value that indicates whether to enable the HTTP endpoint for an Aurora Serverless DB cluster. By
     *         default, the HTTP endpoint is disabled.</p>
     *         <p>
     *         When enabled, the HTTP endpoint provides a connectionless web service API for running SQL queries on the
     *         Aurora Serverless DB cluster. You can also query your database from inside the RDS console with the query
     *         editor.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/data-api.html">Using the Data API for
     *         Aurora Serverless</a> in the <i>Amazon Aurora User Guide</i>.
     */

    public Boolean isEnableHttpEndpoint() {
        return this.enableHttpEndpoint;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *        default is not to copy them.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *         default is not to copy them.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *        default is not to copy them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The default
     * is not to copy them.
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the DB cluster to snapshots of the DB cluster. The
     *         default is not to copy them.
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getNewDBClusterIdentifier() != null)
            sb.append("NewDBClusterIdentifier: ").append(getNewDBClusterIdentifier()).append(",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: ").append(getApplyImmediately()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: ").append(getDBClusterParameterGroupName()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append(getMasterUserPassword()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: ").append(getEnableIAMDatabaseAuthentication()).append(",");
        if (getBacktrackWindow() != null)
            sb.append("BacktrackWindow: ").append(getBacktrackWindow()).append(",");
        if (getCloudwatchLogsExportConfiguration() != null)
            sb.append("CloudwatchLogsExportConfiguration: ").append(getCloudwatchLogsExportConfiguration()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getAllowMajorVersionUpgrade() != null)
            sb.append("AllowMajorVersionUpgrade: ").append(getAllowMajorVersionUpgrade()).append(",");
        if (getDBInstanceParameterGroupName() != null)
            sb.append("DBInstanceParameterGroupName: ").append(getDBInstanceParameterGroupName()).append(",");
        if (getScalingConfiguration() != null)
            sb.append("ScalingConfiguration: ").append(getScalingConfiguration()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getEnableHttpEndpoint() != null)
            sb.append("EnableHttpEndpoint: ").append(getEnableHttpEndpoint()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBClusterRequest == false)
            return false;
        ModifyDBClusterRequest other = (ModifyDBClusterRequest) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getNewDBClusterIdentifier() == null ^ this.getNewDBClusterIdentifier() == null)
            return false;
        if (other.getNewDBClusterIdentifier() != null && other.getNewDBClusterIdentifier().equals(this.getNewDBClusterIdentifier()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getDBClusterParameterGroupName() == null ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null && other.getDBClusterParameterGroupName().equals(this.getDBClusterParameterGroupName()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() == null ^ this.getEnableIAMDatabaseAuthentication() == null)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() != null
                && other.getEnableIAMDatabaseAuthentication().equals(this.getEnableIAMDatabaseAuthentication()) == false)
            return false;
        if (other.getBacktrackWindow() == null ^ this.getBacktrackWindow() == null)
            return false;
        if (other.getBacktrackWindow() != null && other.getBacktrackWindow().equals(this.getBacktrackWindow()) == false)
            return false;
        if (other.getCloudwatchLogsExportConfiguration() == null ^ this.getCloudwatchLogsExportConfiguration() == null)
            return false;
        if (other.getCloudwatchLogsExportConfiguration() != null
                && other.getCloudwatchLogsExportConfiguration().equals(this.getCloudwatchLogsExportConfiguration()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAllowMajorVersionUpgrade() == null ^ this.getAllowMajorVersionUpgrade() == null)
            return false;
        if (other.getAllowMajorVersionUpgrade() != null && other.getAllowMajorVersionUpgrade().equals(this.getAllowMajorVersionUpgrade()) == false)
            return false;
        if (other.getDBInstanceParameterGroupName() == null ^ this.getDBInstanceParameterGroupName() == null)
            return false;
        if (other.getDBInstanceParameterGroupName() != null && other.getDBInstanceParameterGroupName().equals(this.getDBInstanceParameterGroupName()) == false)
            return false;
        if (other.getScalingConfiguration() == null ^ this.getScalingConfiguration() == null)
            return false;
        if (other.getScalingConfiguration() != null && other.getScalingConfiguration().equals(this.getScalingConfiguration()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getEnableHttpEndpoint() == null ^ this.getEnableHttpEndpoint() == null)
            return false;
        if (other.getEnableHttpEndpoint() != null && other.getEnableHttpEndpoint().equals(this.getEnableHttpEndpoint()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getNewDBClusterIdentifier() == null) ? 0 : getNewDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getEnableIAMDatabaseAuthentication() == null) ? 0 : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode + ((getBacktrackWindow() == null) ? 0 : getBacktrackWindow().hashCode());
        hashCode = prime * hashCode + ((getCloudwatchLogsExportConfiguration() == null) ? 0 : getCloudwatchLogsExportConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getAllowMajorVersionUpgrade() == null) ? 0 : getAllowMajorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceParameterGroupName() == null) ? 0 : getDBInstanceParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getScalingConfiguration() == null) ? 0 : getScalingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getEnableHttpEndpoint() == null) ? 0 : getEnableHttpEndpoint().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBClusterRequest clone() {
        return (ModifyDBClusterRequest) super.clone();
    }

}
