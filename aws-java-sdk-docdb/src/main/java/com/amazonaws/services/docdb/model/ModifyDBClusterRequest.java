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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input to <a>ModifyDBCluster</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/ModifyDBCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB cluster identifier for the cluster that is being modified. This parameter is not case sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing <code>DBCluster</code>.
     * </p>
     * </li>
     * </ul>
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
     * Example: <code>my-cluster2</code>
     * </p>
     */
    private String newDBClusterIdentifier;
    /**
     * <p>
     * A value that specifies whether the changes in this request and any pending changes are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB cluster. If this
     * parameter is set to <code>false</code>, changes to the DB cluster are applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter affects only the <code>NewDBClusterIdentifier</code> and
     * <code>MasterUserPassword</code> values. If you set this parameter value to <code>false</code>, the changes to the
     * <code>NewDBClusterIdentifier</code> and <code>MasterUserPassword</code> values are applied during the next
     * maintenance window. All other changes are applied immediately, regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Default: <code>false</code>
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
     * Must be a value from 1 to 35.
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
     * A list of virtual private cloud (VPC) security groups that the DB cluster will belong to.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The port number on which the DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Must be a value from <code>1150</code> to <code>65535</code>.
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The new password for the master database user. This password can contain any printable ASCII character except "
     * <code>/</code>", "<code>"</code>", or "<code>@</code>".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region.
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
     * on a random day of the week.
     * </p>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to Amazon CloudWatch Logs for a specific DB
     * instance or DB cluster. The <code>EnableLogTypes</code> and <code>DisableLogTypes</code> arrays determine which
     * logs are exported (or not exported) to CloudWatch Logs.
     * </p>
     */
    private CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration;
    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     * parameter is set to <code>true</code>.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The DB cluster identifier for the cluster that is being modified. This parameter is not case sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing <code>DBCluster</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier for the cluster that is being modified. This parameter is not case
     *        sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing <code>DBCluster</code>.
     *        </p>
     *        </li>
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the cluster that is being modified. This parameter is not case sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing <code>DBCluster</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The DB cluster identifier for the cluster that is being modified. This parameter is not case
     *         sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing <code>DBCluster</code>.
     *         </p>
     *         </li>
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the cluster that is being modified. This parameter is not case sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing <code>DBCluster</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        The DB cluster identifier for the cluster that is being modified. This parameter is not case
     *        sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing <code>DBCluster</code>.
     *        </p>
     *        </li>
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
     *        Example: <code>my-cluster2</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withNewDBClusterIdentifier(String newDBClusterIdentifier) {
        setNewDBClusterIdentifier(newDBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether the changes in this request and any pending changes are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB cluster. If this
     * parameter is set to <code>false</code>, changes to the DB cluster are applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter affects only the <code>NewDBClusterIdentifier</code> and
     * <code>MasterUserPassword</code> values. If you set this parameter value to <code>false</code>, the changes to the
     * <code>NewDBClusterIdentifier</code> and <code>MasterUserPassword</code> values are applied during the next
     * maintenance window. All other changes are applied immediately, regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param applyImmediately
     *        A value that specifies whether the changes in this request and any pending changes are asynchronously
     *        applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *        cluster. If this parameter is set to <code>false</code>, changes to the DB cluster are applied during the
     *        next maintenance window.</p>
     *        <p>
     *        The <code>ApplyImmediately</code> parameter affects only the <code>NewDBClusterIdentifier</code> and
     *        <code>MasterUserPassword</code> values. If you set this parameter value to <code>false</code>, the changes
     *        to the <code>NewDBClusterIdentifier</code> and <code>MasterUserPassword</code> values are applied during
     *        the next maintenance window. All other changes are applied immediately, regardless of the value of the
     *        <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * A value that specifies whether the changes in this request and any pending changes are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB cluster. If this
     * parameter is set to <code>false</code>, changes to the DB cluster are applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter affects only the <code>NewDBClusterIdentifier</code> and
     * <code>MasterUserPassword</code> values. If you set this parameter value to <code>false</code>, the changes to the
     * <code>NewDBClusterIdentifier</code> and <code>MasterUserPassword</code> values are applied during the next
     * maintenance window. All other changes are applied immediately, regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A value that specifies whether the changes in this request and any pending changes are asynchronously
     *         applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *         cluster. If this parameter is set to <code>false</code>, changes to the DB cluster are applied during the
     *         next maintenance window.</p>
     *         <p>
     *         The <code>ApplyImmediately</code> parameter affects only the <code>NewDBClusterIdentifier</code> and
     *         <code>MasterUserPassword</code> values. If you set this parameter value to <code>false</code>, the
     *         changes to the <code>NewDBClusterIdentifier</code> and <code>MasterUserPassword</code> values are applied
     *         during the next maintenance window. All other changes are applied immediately, regardless of the value of
     *         the <code>ApplyImmediately</code> parameter.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getApplyImmediately() {
        return this.applyImmediately;
    }

    /**
     * <p>
     * A value that specifies whether the changes in this request and any pending changes are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB cluster. If this
     * parameter is set to <code>false</code>, changes to the DB cluster are applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter affects only the <code>NewDBClusterIdentifier</code> and
     * <code>MasterUserPassword</code> values. If you set this parameter value to <code>false</code>, the changes to the
     * <code>NewDBClusterIdentifier</code> and <code>MasterUserPassword</code> values are applied during the next
     * maintenance window. All other changes are applied immediately, regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param applyImmediately
     *        A value that specifies whether the changes in this request and any pending changes are asynchronously
     *        applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *        cluster. If this parameter is set to <code>false</code>, changes to the DB cluster are applied during the
     *        next maintenance window.</p>
     *        <p>
     *        The <code>ApplyImmediately</code> parameter affects only the <code>NewDBClusterIdentifier</code> and
     *        <code>MasterUserPassword</code> values. If you set this parameter value to <code>false</code>, the changes
     *        to the <code>NewDBClusterIdentifier</code> and <code>MasterUserPassword</code> values are applied during
     *        the next maintenance window. All other changes are applied immediately, regardless of the value of the
     *        <code>ApplyImmediately</code> parameter.
     *        </p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withApplyImmediately(Boolean applyImmediately) {
        setApplyImmediately(applyImmediately);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether the changes in this request and any pending changes are asynchronously applied as
     * soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB cluster. If this
     * parameter is set to <code>false</code>, changes to the DB cluster are applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter affects only the <code>NewDBClusterIdentifier</code> and
     * <code>MasterUserPassword</code> values. If you set this parameter value to <code>false</code>, the changes to the
     * <code>NewDBClusterIdentifier</code> and <code>MasterUserPassword</code> values are applied during the next
     * maintenance window. All other changes are applied immediately, regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return A value that specifies whether the changes in this request and any pending changes are asynchronously
     *         applied as soon as possible, regardless of the <code>PreferredMaintenanceWindow</code> setting for the DB
     *         cluster. If this parameter is set to <code>false</code>, changes to the DB cluster are applied during the
     *         next maintenance window.</p>
     *         <p>
     *         The <code>ApplyImmediately</code> parameter affects only the <code>NewDBClusterIdentifier</code> and
     *         <code>MasterUserPassword</code> values. If you set this parameter value to <code>false</code>, the
     *         changes to the <code>NewDBClusterIdentifier</code> and <code>MasterUserPassword</code> values are applied
     *         during the next maintenance window. All other changes are applied immediately, regardless of the value of
     *         the <code>ApplyImmediately</code> parameter.
     *         </p>
     *         <p>
     *         Default: <code>false</code>
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
     * Must be a value from 1 to 35.
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
     *        Must be a value from 1 to 35.
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
     * Must be a value from 1 to 35.
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
     *         Must be a value from 1 to 35.
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
     * Must be a value from 1 to 35.
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
     *        Must be a value from 1 to 35.
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
     * A list of virtual private cloud (VPC) security groups that the DB cluster will belong to.
     * </p>
     * 
     * @return A list of virtual private cloud (VPC) security groups that the DB cluster will belong to.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of virtual private cloud (VPC) security groups that the DB cluster will belong to.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of virtual private cloud (VPC) security groups that the DB cluster will belong to.
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
     * A list of virtual private cloud (VPC) security groups that the DB cluster will belong to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of virtual private cloud (VPC) security groups that the DB cluster will belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of virtual private cloud (VPC) security groups that the DB cluster will belong to.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of virtual private cloud (VPC) security groups that the DB cluster will belong to.
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
     * Constraints: Must be a value from <code>1150</code> to <code>65535</code>.
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * 
     * @param port
     *        The port number on which the DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: Must be a value from <code>1150</code> to <code>65535</code>.
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
     * Constraints: Must be a value from <code>1150</code> to <code>65535</code>.
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * 
     * @return The port number on which the DB cluster accepts connections.</p>
     *         <p>
     *         Constraints: Must be a value from <code>1150</code> to <code>65535</code>.
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
     * Constraints: Must be a value from <code>1150</code> to <code>65535</code>.
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * 
     * @param port
     *        The port number on which the DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: Must be a value from <code>1150</code> to <code>65535</code>.
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
     * The new password for the master database user. This password can contain any printable ASCII character except "
     * <code>/</code>", "<code>"</code>", or "<code>@</code>".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * 
     * @param masterUserPassword
     *        The new password for the master database user. This password can contain any printable ASCII character
     *        except "<code>/</code>", "<code>"</code>", or "<code>@</code>".</p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The new password for the master database user. This password can contain any printable ASCII character except "
     * <code>/</code>", "<code>"</code>", or "<code>@</code>".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * 
     * @return The new password for the master database user. This password can contain any printable ASCII character
     *         except "<code>/</code>", "<code>"</code>", or "<code>@</code>".</p>
     *         <p>
     *         Constraints: Must contain from 8 to 41 characters.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The new password for the master database user. This password can contain any printable ASCII character except "
     * <code>/</code>", "<code>"</code>", or "<code>@</code>".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * 
     * @param masterUserPassword
     *        The new password for the master database user. This password can contain any printable ASCII character
     *        except "<code>/</code>", "<code>"</code>", or "<code>@</code>".</p>
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
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region.
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
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region.
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
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region.
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
     *         The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region.
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
     * The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region.
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
     *        The default is a 30-minute window selected at random from an 8-hour block of time for each AWS Region.
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
     * on a random day of the week.
     * </p>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
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
     *        occurring on a random day of the week.
     *        </p>
     *        <p>
     *        Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
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
     * on a random day of the week.
     * </p>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
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
     *         occurring on a random day of the week.
     *         </p>
     *         <p>
     *         Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
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
     * on a random day of the week.
     * </p>
     * <p>
     * Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
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
     *        occurring on a random day of the week.
     *        </p>
     *        <p>
     *        Valid days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
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
     * The configuration setting for the log types to be enabled for export to Amazon CloudWatch Logs for a specific DB
     * instance or DB cluster. The <code>EnableLogTypes</code> and <code>DisableLogTypes</code> arrays determine which
     * logs are exported (or not exported) to CloudWatch Logs.
     * </p>
     * 
     * @param cloudwatchLogsExportConfiguration
     *        The configuration setting for the log types to be enabled for export to Amazon CloudWatch Logs for a
     *        specific DB instance or DB cluster. The <code>EnableLogTypes</code> and <code>DisableLogTypes</code>
     *        arrays determine which logs are exported (or not exported) to CloudWatch Logs.
     */

    public void setCloudwatchLogsExportConfiguration(CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration) {
        this.cloudwatchLogsExportConfiguration = cloudwatchLogsExportConfiguration;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to Amazon CloudWatch Logs for a specific DB
     * instance or DB cluster. The <code>EnableLogTypes</code> and <code>DisableLogTypes</code> arrays determine which
     * logs are exported (or not exported) to CloudWatch Logs.
     * </p>
     * 
     * @return The configuration setting for the log types to be enabled for export to Amazon CloudWatch Logs for a
     *         specific DB instance or DB cluster. The <code>EnableLogTypes</code> and <code>DisableLogTypes</code>
     *         arrays determine which logs are exported (or not exported) to CloudWatch Logs.
     */

    public CloudwatchLogsExportConfiguration getCloudwatchLogsExportConfiguration() {
        return this.cloudwatchLogsExportConfiguration;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to Amazon CloudWatch Logs for a specific DB
     * instance or DB cluster. The <code>EnableLogTypes</code> and <code>DisableLogTypes</code> arrays determine which
     * logs are exported (or not exported) to CloudWatch Logs.
     * </p>
     * 
     * @param cloudwatchLogsExportConfiguration
     *        The configuration setting for the log types to be enabled for export to Amazon CloudWatch Logs for a
     *        specific DB instance or DB cluster. The <code>EnableLogTypes</code> and <code>DisableLogTypes</code>
     *        arrays determine which logs are exported (or not exported) to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withCloudwatchLogsExportConfiguration(CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration) {
        setCloudwatchLogsExportConfiguration(cloudwatchLogsExportConfiguration);
        return this;
    }

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     * parameter is set to <code>true</code>.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to which you want to upgrade. Changing this parameter results in
     *        an outage. The change is applied during the next maintenance window unless the
     *        <code>ApplyImmediately</code> parameter is set to <code>true</code>.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     * parameter is set to <code>true</code>.
     * </p>
     * 
     * @return The version number of the database engine to which you want to upgrade. Changing this parameter results
     *         in an outage. The change is applied during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code>.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade. Changing this parameter results in an
     * outage. The change is applied during the next maintenance window unless the <code>ApplyImmediately</code>
     * parameter is set to <code>true</code>.
     * </p>
     * 
     * @param engineVersion
     *        The version number of the database engine to which you want to upgrade. Changing this parameter results in
     *        an outage. The change is applied during the next maintenance window unless the
     *        <code>ApplyImmediately</code> parameter is set to <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBClusterRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
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
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getCloudwatchLogsExportConfiguration() != null)
            sb.append("CloudwatchLogsExportConfiguration: ").append(getCloudwatchLogsExportConfiguration()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion());
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
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
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
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getCloudwatchLogsExportConfiguration() == null) ? 0 : getCloudwatchLogsExportConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBClusterRequest clone() {
        return (ModifyDBClusterRequest) super.clone();
    }

}
