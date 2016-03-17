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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#modifyDBCluster(ModifyDBClusterRequest) ModifyDBCluster operation}.
 * <p>
 * Modify a setting for an Amazon Aurora DB cluster. You can change one
 * or more database configuration parameters by specifying these
 * parameters and the new values in the request. For more information on
 * Amazon Aurora, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
 * in the <i>Amazon RDS User Guide.</i>
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#modifyDBCluster(ModifyDBClusterRequest)
 */
public class ModifyDBClusterRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The DB cluster identifier for the cluster being modified. This
     * parameter is not case-sensitive. <p>Constraints: <ul> <li>Must be the
     * identifier for an existing DB cluster.</li> <li>Must contain from 1 to
     * 63 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     */
    private String dBClusterIdentifier;

    /**
     * The new DB cluster identifier for the DB cluster when renaming a DB
     * cluster. This value is stored as a lowercase string. <p>Constraints:
     * <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul>
     * <p>Example: <code>my-cluster2</code>
     */
    private String newDBClusterIdentifier;

    /**
     * A value that specifies whether the modifications in this request and
     * any pending modifications are asynchronously applied as soon as
     * possible, regardless of the <code>PreferredMaintenanceWindow</code>
     * setting for the DB cluster. If this parameter is set to
     * <code>false</code>, changes to the DB cluster are applied during the
     * next maintenance window. <p>The <code>ApplyImmediately</code>
     * parameter only affects the <code>NewDBClusterIdentifier</code> and
     * <code>MasterUserPassword</code> values. If you set the
     * <code>ApplyImmediately</code> parameter value to false, then changes
     * to the <code>NewDBClusterIdentifier</code> and
     * <code>MasterUserPassword</code> values are applied during the next
     * maintenance window. All other changes are applied immediately,
     * regardless of the value of the <code>ApplyImmediately</code>
     * parameter. <p>Default: <code>false</code>
     */
    private Boolean applyImmediately;

    /**
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1. <p>Default: 1 <p>Constraints: <ul>
     * <li>Must be a value from 1 to 35</li> </ul>
     */
    private Integer backupRetentionPeriod;

    /**
     * The name of the DB cluster parameter group to use for the DB cluster.
     */
    private String dBClusterParameterGroupName;

    /**
     * A lst of VPC security groups that the DB cluster will belong to.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIds;

    /**
     * The port number on which the DB cluster accepts connections.
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB cluster.
     */
    private Integer port;

    /**
     * The new password for the master database user. This password can
     * contain any printable ASCII character except "/", """, or "@".
     * <p>Constraints: Must contain from 8 to 41 characters.
     */
    private String masterUserPassword;

    /**
     * A value that indicates that the DB cluster should be associated with
     * the specified option group. Changing this parameter does not result in
     * an outage except in the following case, and the change is applied
     * during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code>
     * for this request. If the parameter change results in an option group
     * that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are
     * not interrupted. <p>Permanent options cannot be removed from an option
     * group. The option group cannot be removed from a DB cluster once it is
     * associated with a DB cluster.
     */
    private String optionGroupName;

    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. <p>Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. To
     * see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     * <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     * Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     * maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     */
    private String preferredBackupWindow;

    /**
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p>Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     */
    private String preferredMaintenanceWindow;

    /**
     * The DB cluster identifier for the cluster being modified. This
     * parameter is not case-sensitive. <p>Constraints: <ul> <li>Must be the
     * identifier for an existing DB cluster.</li> <li>Must contain from 1 to
     * 63 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     *
     * @return The DB cluster identifier for the cluster being modified. This
     *         parameter is not case-sensitive. <p>Constraints: <ul> <li>Must be the
     *         identifier for an existing DB cluster.</li> <li>Must contain from 1 to
     *         63 alphanumeric characters or hyphens.</li> <li>First character must
     *         be a letter.</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens.</li> </ul>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }
    
    /**
     * The DB cluster identifier for the cluster being modified. This
     * parameter is not case-sensitive. <p>Constraints: <ul> <li>Must be the
     * identifier for an existing DB cluster.</li> <li>Must contain from 1 to
     * 63 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     *
     * @param dBClusterIdentifier The DB cluster identifier for the cluster being modified. This
     *         parameter is not case-sensitive. <p>Constraints: <ul> <li>Must be the
     *         identifier for an existing DB cluster.</li> <li>Must contain from 1 to
     *         63 alphanumeric characters or hyphens.</li> <li>First character must
     *         be a letter.</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens.</li> </ul>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }
    
    /**
     * The DB cluster identifier for the cluster being modified. This
     * parameter is not case-sensitive. <p>Constraints: <ul> <li>Must be the
     * identifier for an existing DB cluster.</li> <li>Must contain from 1 to
     * 63 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterIdentifier The DB cluster identifier for the cluster being modified. This
     *         parameter is not case-sensitive. <p>Constraints: <ul> <li>Must be the
     *         identifier for an existing DB cluster.</li> <li>Must contain from 1 to
     *         63 alphanumeric characters or hyphens.</li> <li>First character must
     *         be a letter.</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * The new DB cluster identifier for the DB cluster when renaming a DB
     * cluster. This value is stored as a lowercase string. <p>Constraints:
     * <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul>
     * <p>Example: <code>my-cluster2</code>
     *
     * @return The new DB cluster identifier for the DB cluster when renaming a DB
     *         cluster. This value is stored as a lowercase string. <p>Constraints:
     *         <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     *         hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     *         with a hyphen or contain two consecutive hyphens</li> </ul>
     *         <p>Example: <code>my-cluster2</code>
     */
    public String getNewDBClusterIdentifier() {
        return newDBClusterIdentifier;
    }
    
    /**
     * The new DB cluster identifier for the DB cluster when renaming a DB
     * cluster. This value is stored as a lowercase string. <p>Constraints:
     * <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul>
     * <p>Example: <code>my-cluster2</code>
     *
     * @param newDBClusterIdentifier The new DB cluster identifier for the DB cluster when renaming a DB
     *         cluster. This value is stored as a lowercase string. <p>Constraints:
     *         <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     *         hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     *         with a hyphen or contain two consecutive hyphens</li> </ul>
     *         <p>Example: <code>my-cluster2</code>
     */
    public void setNewDBClusterIdentifier(String newDBClusterIdentifier) {
        this.newDBClusterIdentifier = newDBClusterIdentifier;
    }
    
    /**
     * The new DB cluster identifier for the DB cluster when renaming a DB
     * cluster. This value is stored as a lowercase string. <p>Constraints:
     * <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     * hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     * with a hyphen or contain two consecutive hyphens</li> </ul>
     * <p>Example: <code>my-cluster2</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param newDBClusterIdentifier The new DB cluster identifier for the DB cluster when renaming a DB
     *         cluster. This value is stored as a lowercase string. <p>Constraints:
     *         <ul> <li>Must contain from 1 to 63 alphanumeric characters or
     *         hyphens</li> <li>First character must be a letter</li> <li>Cannot end
     *         with a hyphen or contain two consecutive hyphens</li> </ul>
     *         <p>Example: <code>my-cluster2</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBClusterRequest withNewDBClusterIdentifier(String newDBClusterIdentifier) {
        this.newDBClusterIdentifier = newDBClusterIdentifier;
        return this;
    }

    /**
     * A value that specifies whether the modifications in this request and
     * any pending modifications are asynchronously applied as soon as
     * possible, regardless of the <code>PreferredMaintenanceWindow</code>
     * setting for the DB cluster. If this parameter is set to
     * <code>false</code>, changes to the DB cluster are applied during the
     * next maintenance window. <p>The <code>ApplyImmediately</code>
     * parameter only affects the <code>NewDBClusterIdentifier</code> and
     * <code>MasterUserPassword</code> values. If you set the
     * <code>ApplyImmediately</code> parameter value to false, then changes
     * to the <code>NewDBClusterIdentifier</code> and
     * <code>MasterUserPassword</code> values are applied during the next
     * maintenance window. All other changes are applied immediately,
     * regardless of the value of the <code>ApplyImmediately</code>
     * parameter. <p>Default: <code>false</code>
     *
     * @return A value that specifies whether the modifications in this request and
     *         any pending modifications are asynchronously applied as soon as
     *         possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *         setting for the DB cluster. If this parameter is set to
     *         <code>false</code>, changes to the DB cluster are applied during the
     *         next maintenance window. <p>The <code>ApplyImmediately</code>
     *         parameter only affects the <code>NewDBClusterIdentifier</code> and
     *         <code>MasterUserPassword</code> values. If you set the
     *         <code>ApplyImmediately</code> parameter value to false, then changes
     *         to the <code>NewDBClusterIdentifier</code> and
     *         <code>MasterUserPassword</code> values are applied during the next
     *         maintenance window. All other changes are applied immediately,
     *         regardless of the value of the <code>ApplyImmediately</code>
     *         parameter. <p>Default: <code>false</code>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }
    
    /**
     * A value that specifies whether the modifications in this request and
     * any pending modifications are asynchronously applied as soon as
     * possible, regardless of the <code>PreferredMaintenanceWindow</code>
     * setting for the DB cluster. If this parameter is set to
     * <code>false</code>, changes to the DB cluster are applied during the
     * next maintenance window. <p>The <code>ApplyImmediately</code>
     * parameter only affects the <code>NewDBClusterIdentifier</code> and
     * <code>MasterUserPassword</code> values. If you set the
     * <code>ApplyImmediately</code> parameter value to false, then changes
     * to the <code>NewDBClusterIdentifier</code> and
     * <code>MasterUserPassword</code> values are applied during the next
     * maintenance window. All other changes are applied immediately,
     * regardless of the value of the <code>ApplyImmediately</code>
     * parameter. <p>Default: <code>false</code>
     *
     * @param applyImmediately A value that specifies whether the modifications in this request and
     *         any pending modifications are asynchronously applied as soon as
     *         possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *         setting for the DB cluster. If this parameter is set to
     *         <code>false</code>, changes to the DB cluster are applied during the
     *         next maintenance window. <p>The <code>ApplyImmediately</code>
     *         parameter only affects the <code>NewDBClusterIdentifier</code> and
     *         <code>MasterUserPassword</code> values. If you set the
     *         <code>ApplyImmediately</code> parameter value to false, then changes
     *         to the <code>NewDBClusterIdentifier</code> and
     *         <code>MasterUserPassword</code> values are applied during the next
     *         maintenance window. All other changes are applied immediately,
     *         regardless of the value of the <code>ApplyImmediately</code>
     *         parameter. <p>Default: <code>false</code>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }
    
    /**
     * A value that specifies whether the modifications in this request and
     * any pending modifications are asynchronously applied as soon as
     * possible, regardless of the <code>PreferredMaintenanceWindow</code>
     * setting for the DB cluster. If this parameter is set to
     * <code>false</code>, changes to the DB cluster are applied during the
     * next maintenance window. <p>The <code>ApplyImmediately</code>
     * parameter only affects the <code>NewDBClusterIdentifier</code> and
     * <code>MasterUserPassword</code> values. If you set the
     * <code>ApplyImmediately</code> parameter value to false, then changes
     * to the <code>NewDBClusterIdentifier</code> and
     * <code>MasterUserPassword</code> values are applied during the next
     * maintenance window. All other changes are applied immediately,
     * regardless of the value of the <code>ApplyImmediately</code>
     * parameter. <p>Default: <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param applyImmediately A value that specifies whether the modifications in this request and
     *         any pending modifications are asynchronously applied as soon as
     *         possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *         setting for the DB cluster. If this parameter is set to
     *         <code>false</code>, changes to the DB cluster are applied during the
     *         next maintenance window. <p>The <code>ApplyImmediately</code>
     *         parameter only affects the <code>NewDBClusterIdentifier</code> and
     *         <code>MasterUserPassword</code> values. If you set the
     *         <code>ApplyImmediately</code> parameter value to false, then changes
     *         to the <code>NewDBClusterIdentifier</code> and
     *         <code>MasterUserPassword</code> values are applied during the next
     *         maintenance window. All other changes are applied immediately,
     *         regardless of the value of the <code>ApplyImmediately</code>
     *         parameter. <p>Default: <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBClusterRequest withApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
        return this;
    }

    /**
     * A value that specifies whether the modifications in this request and
     * any pending modifications are asynchronously applied as soon as
     * possible, regardless of the <code>PreferredMaintenanceWindow</code>
     * setting for the DB cluster. If this parameter is set to
     * <code>false</code>, changes to the DB cluster are applied during the
     * next maintenance window. <p>The <code>ApplyImmediately</code>
     * parameter only affects the <code>NewDBClusterIdentifier</code> and
     * <code>MasterUserPassword</code> values. If you set the
     * <code>ApplyImmediately</code> parameter value to false, then changes
     * to the <code>NewDBClusterIdentifier</code> and
     * <code>MasterUserPassword</code> values are applied during the next
     * maintenance window. All other changes are applied immediately,
     * regardless of the value of the <code>ApplyImmediately</code>
     * parameter. <p>Default: <code>false</code>
     *
     * @return A value that specifies whether the modifications in this request and
     *         any pending modifications are asynchronously applied as soon as
     *         possible, regardless of the <code>PreferredMaintenanceWindow</code>
     *         setting for the DB cluster. If this parameter is set to
     *         <code>false</code>, changes to the DB cluster are applied during the
     *         next maintenance window. <p>The <code>ApplyImmediately</code>
     *         parameter only affects the <code>NewDBClusterIdentifier</code> and
     *         <code>MasterUserPassword</code> values. If you set the
     *         <code>ApplyImmediately</code> parameter value to false, then changes
     *         to the <code>NewDBClusterIdentifier</code> and
     *         <code>MasterUserPassword</code> values are applied during the next
     *         maintenance window. All other changes are applied immediately,
     *         regardless of the value of the <code>ApplyImmediately</code>
     *         parameter. <p>Default: <code>false</code>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1. <p>Default: 1 <p>Constraints: <ul>
     * <li>Must be a value from 1 to 35</li> </ul>
     *
     * @return The number of days for which automated backups are retained. You must
     *         specify a minimum value of 1. <p>Default: 1 <p>Constraints: <ul>
     *         <li>Must be a value from 1 to 35</li> </ul>
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }
    
    /**
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1. <p>Default: 1 <p>Constraints: <ul>
     * <li>Must be a value from 1 to 35</li> </ul>
     *
     * @param backupRetentionPeriod The number of days for which automated backups are retained. You must
     *         specify a minimum value of 1. <p>Default: 1 <p>Constraints: <ul>
     *         <li>Must be a value from 1 to 35</li> </ul>
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }
    
    /**
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1. <p>Default: 1 <p>Constraints: <ul>
     * <li>Must be a value from 1 to 35</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backupRetentionPeriod The number of days for which automated backups are retained. You must
     *         specify a minimum value of 1. <p>Default: 1 <p>Constraints: <ul>
     *         <li>Must be a value from 1 to 35</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBClusterRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * The name of the DB cluster parameter group to use for the DB cluster.
     *
     * @return The name of the DB cluster parameter group to use for the DB cluster.
     */
    public String getDBClusterParameterGroupName() {
        return dBClusterParameterGroupName;
    }
    
    /**
     * The name of the DB cluster parameter group to use for the DB cluster.
     *
     * @param dBClusterParameterGroupName The name of the DB cluster parameter group to use for the DB cluster.
     */
    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }
    
    /**
     * The name of the DB cluster parameter group to use for the DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterParameterGroupName The name of the DB cluster parameter group to use for the DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBClusterRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
        return this;
    }

    /**
     * A lst of VPC security groups that the DB cluster will belong to.
     *
     * @return A lst of VPC security groups that the DB cluster will belong to.
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
              vpcSecurityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcSecurityGroupIds.setAutoConstruct(true);
        }
        return vpcSecurityGroupIds;
    }
    
    /**
     * A lst of VPC security groups that the DB cluster will belong to.
     *
     * @param vpcSecurityGroupIds A lst of VPC security groups that the DB cluster will belong to.
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
     * A lst of VPC security groups that the DB cluster will belong to.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVpcSecurityGroupIds(java.util.Collection)} or
     * {@link #withVpcSecurityGroupIds(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A lst of VPC security groups that the DB cluster will belong to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (getVpcSecurityGroupIds() == null) setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        for (String value : vpcSecurityGroupIds) {
            getVpcSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * A lst of VPC security groups that the DB cluster will belong to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A lst of VPC security groups that the DB cluster will belong to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBClusterRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
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
     * The port number on which the DB cluster accepts connections.
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB cluster.
     *
     * @return The port number on which the DB cluster accepts connections.
     *         <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     *         same port as the original DB cluster.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which the DB cluster accepts connections.
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB cluster.
     *
     * @param port The port number on which the DB cluster accepts connections.
     *         <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     *         same port as the original DB cluster.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which the DB cluster accepts connections.
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which the DB cluster accepts connections.
     *         <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     *         same port as the original DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBClusterRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * The new password for the master database user. This password can
     * contain any printable ASCII character except "/", """, or "@".
     * <p>Constraints: Must contain from 8 to 41 characters.
     *
     * @return The new password for the master database user. This password can
     *         contain any printable ASCII character except "/", """, or "@".
     *         <p>Constraints: Must contain from 8 to 41 characters.
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }
    
    /**
     * The new password for the master database user. This password can
     * contain any printable ASCII character except "/", """, or "@".
     * <p>Constraints: Must contain from 8 to 41 characters.
     *
     * @param masterUserPassword The new password for the master database user. This password can
     *         contain any printable ASCII character except "/", """, or "@".
     *         <p>Constraints: Must contain from 8 to 41 characters.
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }
    
    /**
     * The new password for the master database user. This password can
     * contain any printable ASCII character except "/", """, or "@".
     * <p>Constraints: Must contain from 8 to 41 characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUserPassword The new password for the master database user. This password can
     *         contain any printable ASCII character except "/", """, or "@".
     *         <p>Constraints: Must contain from 8 to 41 characters.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBClusterRequest withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * A value that indicates that the DB cluster should be associated with
     * the specified option group. Changing this parameter does not result in
     * an outage except in the following case, and the change is applied
     * during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code>
     * for this request. If the parameter change results in an option group
     * that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are
     * not interrupted. <p>Permanent options cannot be removed from an option
     * group. The option group cannot be removed from a DB cluster once it is
     * associated with a DB cluster.
     *
     * @return A value that indicates that the DB cluster should be associated with
     *         the specified option group. Changing this parameter does not result in
     *         an outage except in the following case, and the change is applied
     *         during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code>
     *         for this request. If the parameter change results in an option group
     *         that enables OEM, this change can cause a brief (sub-second) period
     *         during which new connections are rejected but existing connections are
     *         not interrupted. <p>Permanent options cannot be removed from an option
     *         group. The option group cannot be removed from a DB cluster once it is
     *         associated with a DB cluster.
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * A value that indicates that the DB cluster should be associated with
     * the specified option group. Changing this parameter does not result in
     * an outage except in the following case, and the change is applied
     * during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code>
     * for this request. If the parameter change results in an option group
     * that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are
     * not interrupted. <p>Permanent options cannot be removed from an option
     * group. The option group cannot be removed from a DB cluster once it is
     * associated with a DB cluster.
     *
     * @param optionGroupName A value that indicates that the DB cluster should be associated with
     *         the specified option group. Changing this parameter does not result in
     *         an outage except in the following case, and the change is applied
     *         during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code>
     *         for this request. If the parameter change results in an option group
     *         that enables OEM, this change can cause a brief (sub-second) period
     *         during which new connections are rejected but existing connections are
     *         not interrupted. <p>Permanent options cannot be removed from an option
     *         group. The option group cannot be removed from a DB cluster once it is
     *         associated with a DB cluster.
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * A value that indicates that the DB cluster should be associated with
     * the specified option group. Changing this parameter does not result in
     * an outage except in the following case, and the change is applied
     * during the next maintenance window unless the
     * <code>ApplyImmediately</code> parameter is set to <code>true</code>
     * for this request. If the parameter change results in an option group
     * that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are
     * not interrupted. <p>Permanent options cannot be removed from an option
     * group. The option group cannot be removed from a DB cluster once it is
     * associated with a DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName A value that indicates that the DB cluster should be associated with
     *         the specified option group. Changing this parameter does not result in
     *         an outage except in the following case, and the change is applied
     *         during the next maintenance window unless the
     *         <code>ApplyImmediately</code> parameter is set to <code>true</code>
     *         for this request. If the parameter change results in an option group
     *         that enables OEM, this change can cause a brief (sub-second) period
     *         during which new connections are rejected but existing connections are
     *         not interrupted. <p>Permanent options cannot be removed from an option
     *         group. The option group cannot be removed from a DB cluster once it is
     *         associated with a DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBClusterRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. <p>Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. To
     * see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     * <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     * Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     * maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     *
     * @return The daily time range during which automated backups are created if
     *         automated backups are enabled, using the
     *         <code>BackupRetentionPeriod</code> parameter. <p>Default: A 30-minute
     *         window selected at random from an 8-hour block of time per region. To
     *         see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     *         <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     *         Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     *         maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. <p>Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. To
     * see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     * <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     * Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     * maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled, using the
     *         <code>BackupRetentionPeriod</code> parameter. <p>Default: A 30-minute
     *         window selected at random from an 8-hour block of time per region. To
     *         see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     *         <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     *         Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     *         maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. <p>Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. To
     * see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     * <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     * Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     * maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled, using the
     *         <code>BackupRetentionPeriod</code> parameter. <p>Default: A 30-minute
     *         window selected at random from an 8-hour block of time per region. To
     *         see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     *         <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     *         Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     *         maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBClusterRequest withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p>Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     *
     * @return The weekly time range during which system maintenance can occur, in
     *         Universal Coordinated Time (UTC). <p> Format:
     *         <code>ddd:hh24:mi-ddd:hh24:mi</code> <p>Default: A 30-minute window
     *         selected at random from an 8-hour block of time per region, occurring
     *         on a random day of the week. To see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         <p>Constraints: Minimum 30-minute window.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p>Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     *
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can occur, in
     *         Universal Coordinated Time (UTC). <p> Format:
     *         <code>ddd:hh24:mi-ddd:hh24:mi</code> <p>Default: A 30-minute window
     *         selected at random from an 8-hour block of time per region, occurring
     *         on a random day of the week. To see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         <p>Constraints: Minimum 30-minute window.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p>Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can occur, in
     *         Universal Coordinated Time (UTC). <p> Format:
     *         <code>ddd:hh24:mi-ddd:hh24:mi</code> <p>Default: A 30-minute window
     *         selected at random from an 8-hour block of time per region, occurring
     *         on a random day of the week. To see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         <p>Constraints: Minimum 30-minute window.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyDBClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
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
        if (getDBClusterIdentifier() != null) sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getNewDBClusterIdentifier() != null) sb.append("NewDBClusterIdentifier: " + getNewDBClusterIdentifier() + ",");
        if (isApplyImmediately() != null) sb.append("ApplyImmediately: " + isApplyImmediately() + ",");
        if (getBackupRetentionPeriod() != null) sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getDBClusterParameterGroupName() != null) sb.append("DBClusterParameterGroupName: " + getDBClusterParameterGroupName() + ",");
        if (getVpcSecurityGroupIds() != null) sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getMasterUserPassword() != null) sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getOptionGroupName() != null) sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getPreferredBackupWindow() != null) sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getNewDBClusterIdentifier() == null) ? 0 : getNewDBClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((isApplyImmediately() == null) ? 0 : isApplyImmediately().hashCode()); 
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode()); 
        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode()); 
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyDBClusterRequest == false) return false;
        ModifyDBClusterRequest other = (ModifyDBClusterRequest)obj;
        
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null) return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false) return false; 
        if (other.getNewDBClusterIdentifier() == null ^ this.getNewDBClusterIdentifier() == null) return false;
        if (other.getNewDBClusterIdentifier() != null && other.getNewDBClusterIdentifier().equals(this.getNewDBClusterIdentifier()) == false) return false; 
        if (other.isApplyImmediately() == null ^ this.isApplyImmediately() == null) return false;
        if (other.isApplyImmediately() != null && other.isApplyImmediately().equals(this.isApplyImmediately()) == false) return false; 
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null) return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false) return false; 
        if (other.getDBClusterParameterGroupName() == null ^ this.getDBClusterParameterGroupName() == null) return false;
        if (other.getDBClusterParameterGroupName() != null && other.getDBClusterParameterGroupName().equals(this.getDBClusterParameterGroupName()) == false) return false; 
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null) return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null) return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false) return false; 
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null) return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        return true;
    }
    
    @Override
    public ModifyDBClusterRequest clone() {
        
            return (ModifyDBClusterRequest) super.clone();
    }

}
    