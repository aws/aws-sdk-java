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
package com.amazonaws.services.docdbelastic.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/UpdateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The password associated with the elastic cluster administrator. This password can contain any printable ASCII
     * character except forward slash (/), double quote ("), or the "at" symbol (@).
     * </p>
     * <p>
     * <i>Constraints</i>: Must contain from 8 to 100 characters.
     * </p>
     */
    private String adminUserPassword;
    /**
     * <p>
     * The authentication type used to determine where to fetch the password used for accessing the elastic cluster.
     * Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * The number of days for which automatic snapshots are retained.
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * The client token for the elastic cluster.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ARN identifier of the elastic cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>backupRetentionPeriod</code>.
     * </p>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * <i>Default</i>: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week.
     * </p>
     * <p>
     * <i>Valid days</i>: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * <i>Constraints</i>: Minimum 30-minute window.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The number of vCPUs assigned to each elastic cluster shard. Maximum is 64. Allowed values are 2, 4, 8, 16, 32,
     * 64.
     * </p>
     */
    private Integer shardCapacity;
    /**
     * <p>
     * The number of shards assigned to the elastic cluster. Maximum is 32.
     * </p>
     */
    private Integer shardCount;
    /**
     * <p>
     * The number of replica instances applying to all shards in the elastic cluster. A <code>shardInstanceCount</code>
     * value of 1 means there is one writer instance, and any additional instances are replicas that can be used for
     * reads and to improve availability.
     * </p>
     */
    private Integer shardInstanceCount;
    /**
     * <p>
     * The Amazon EC2 subnet IDs for the elastic cluster.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the elastic cluster.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * The password associated with the elastic cluster administrator. This password can contain any printable ASCII
     * character except forward slash (/), double quote ("), or the "at" symbol (@).
     * </p>
     * <p>
     * <i>Constraints</i>: Must contain from 8 to 100 characters.
     * </p>
     * 
     * @param adminUserPassword
     *        The password associated with the elastic cluster administrator. This password can contain any printable
     *        ASCII character except forward slash (/), double quote ("), or the "at" symbol (@).</p>
     *        <p>
     *        <i>Constraints</i>: Must contain from 8 to 100 characters.
     */

    public void setAdminUserPassword(String adminUserPassword) {
        this.adminUserPassword = adminUserPassword;
    }

    /**
     * <p>
     * The password associated with the elastic cluster administrator. This password can contain any printable ASCII
     * character except forward slash (/), double quote ("), or the "at" symbol (@).
     * </p>
     * <p>
     * <i>Constraints</i>: Must contain from 8 to 100 characters.
     * </p>
     * 
     * @return The password associated with the elastic cluster administrator. This password can contain any printable
     *         ASCII character except forward slash (/), double quote ("), or the "at" symbol (@).</p>
     *         <p>
     *         <i>Constraints</i>: Must contain from 8 to 100 characters.
     */

    public String getAdminUserPassword() {
        return this.adminUserPassword;
    }

    /**
     * <p>
     * The password associated with the elastic cluster administrator. This password can contain any printable ASCII
     * character except forward slash (/), double quote ("), or the "at" symbol (@).
     * </p>
     * <p>
     * <i>Constraints</i>: Must contain from 8 to 100 characters.
     * </p>
     * 
     * @param adminUserPassword
     *        The password associated with the elastic cluster administrator. This password can contain any printable
     *        ASCII character except forward slash (/), double quote ("), or the "at" symbol (@).</p>
     *        <p>
     *        <i>Constraints</i>: Must contain from 8 to 100 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withAdminUserPassword(String adminUserPassword) {
        setAdminUserPassword(adminUserPassword);
        return this;
    }

    /**
     * <p>
     * The authentication type used to determine where to fetch the password used for accessing the elastic cluster.
     * Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * </p>
     * 
     * @param authType
     *        The authentication type used to determine where to fetch the password used for accessing the elastic
     *        cluster. Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * @see Auth
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The authentication type used to determine where to fetch the password used for accessing the elastic cluster.
     * Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * </p>
     * 
     * @return The authentication type used to determine where to fetch the password used for accessing the elastic
     *         cluster. Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * @see Auth
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The authentication type used to determine where to fetch the password used for accessing the elastic cluster.
     * Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * </p>
     * 
     * @param authType
     *        The authentication type used to determine where to fetch the password used for accessing the elastic
     *        cluster. Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Auth
     */

    public UpdateClusterRequest withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The authentication type used to determine where to fetch the password used for accessing the elastic cluster.
     * Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * </p>
     * 
     * @param authType
     *        The authentication type used to determine where to fetch the password used for accessing the elastic
     *        cluster. Valid types are <code>PLAIN_TEXT</code> or <code>SECRET_ARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Auth
     */

    public UpdateClusterRequest withAuthType(Auth authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The number of days for which automatic snapshots are retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automatic snapshots are retained.
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automatic snapshots are retained.
     * </p>
     * 
     * @return The number of days for which automatic snapshots are retained.
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automatic snapshots are retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automatic snapshots are retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The client token for the elastic cluster.
     * </p>
     * 
     * @param clientToken
     *        The client token for the elastic cluster.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token for the elastic cluster.
     * </p>
     * 
     * @return The client token for the elastic cluster.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token for the elastic cluster.
     * </p>
     * 
     * @param clientToken
     *        The client token for the elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ARN identifier of the elastic cluster.
     * </p>
     * 
     * @param clusterArn
     *        The ARN identifier of the elastic cluster.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The ARN identifier of the elastic cluster.
     * </p>
     * 
     * @return The ARN identifier of the elastic cluster.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The ARN identifier of the elastic cluster.
     * </p>
     * 
     * @param clusterArn
     *        The ARN identifier of the elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>backupRetentionPeriod</code>.
     * </p>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled, as
     *        determined by the <code>backupRetentionPeriod</code>.
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>backupRetentionPeriod</code>.
     * </p>
     * 
     * @return The daily time range during which automated backups are created if automated backups are enabled, as
     *         determined by the <code>backupRetentionPeriod</code>.
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, as determined
     * by the <code>backupRetentionPeriod</code>.
     * </p>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled, as
     *        determined by the <code>backupRetentionPeriod</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * <i>Default</i>: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week.
     * </p>
     * <p>
     * <i>Valid days</i>: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * <i>Constraints</i>: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        <i>Default</i>: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *        Services Region, occurring on a random day of the week.
     *        </p>
     *        <p>
     *        <i>Valid days</i>: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *        </p>
     *        <p>
     *        <i>Constraints</i>: Minimum 30-minute window.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * <i>Default</i>: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week.
     * </p>
     * <p>
     * <i>Valid days</i>: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * <i>Constraints</i>: Minimum 30-minute window.
     * </p>
     * 
     * @return The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *         <p>
     *         <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         <i>Default</i>: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *         Services Region, occurring on a random day of the week.
     *         </p>
     *         <p>
     *         <i>Valid days</i>: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         </p>
     *         <p>
     *         <i>Constraints</i>: Minimum 30-minute window.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * <i>Default</i>: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web Services
     * Region, occurring on a random day of the week.
     * </p>
     * <p>
     * <i>Valid days</i>: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * <i>Constraints</i>: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        <i>Format</i>: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        <i>Default</i>: a 30-minute window selected at random from an 8-hour block of time for each Amazon Web
     *        Services Region, occurring on a random day of the week.
     *        </p>
     *        <p>
     *        <i>Valid days</i>: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *        </p>
     *        <p>
     *        <i>Constraints</i>: Minimum 30-minute window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The number of vCPUs assigned to each elastic cluster shard. Maximum is 64. Allowed values are 2, 4, 8, 16, 32,
     * 64.
     * </p>
     * 
     * @param shardCapacity
     *        The number of vCPUs assigned to each elastic cluster shard. Maximum is 64. Allowed values are 2, 4, 8, 16,
     *        32, 64.
     */

    public void setShardCapacity(Integer shardCapacity) {
        this.shardCapacity = shardCapacity;
    }

    /**
     * <p>
     * The number of vCPUs assigned to each elastic cluster shard. Maximum is 64. Allowed values are 2, 4, 8, 16, 32,
     * 64.
     * </p>
     * 
     * @return The number of vCPUs assigned to each elastic cluster shard. Maximum is 64. Allowed values are 2, 4, 8,
     *         16, 32, 64.
     */

    public Integer getShardCapacity() {
        return this.shardCapacity;
    }

    /**
     * <p>
     * The number of vCPUs assigned to each elastic cluster shard. Maximum is 64. Allowed values are 2, 4, 8, 16, 32,
     * 64.
     * </p>
     * 
     * @param shardCapacity
     *        The number of vCPUs assigned to each elastic cluster shard. Maximum is 64. Allowed values are 2, 4, 8, 16,
     *        32, 64.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withShardCapacity(Integer shardCapacity) {
        setShardCapacity(shardCapacity);
        return this;
    }

    /**
     * <p>
     * The number of shards assigned to the elastic cluster. Maximum is 32.
     * </p>
     * 
     * @param shardCount
     *        The number of shards assigned to the elastic cluster. Maximum is 32.
     */

    public void setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
    }

    /**
     * <p>
     * The number of shards assigned to the elastic cluster. Maximum is 32.
     * </p>
     * 
     * @return The number of shards assigned to the elastic cluster. Maximum is 32.
     */

    public Integer getShardCount() {
        return this.shardCount;
    }

    /**
     * <p>
     * The number of shards assigned to the elastic cluster. Maximum is 32.
     * </p>
     * 
     * @param shardCount
     *        The number of shards assigned to the elastic cluster. Maximum is 32.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withShardCount(Integer shardCount) {
        setShardCount(shardCount);
        return this;
    }

    /**
     * <p>
     * The number of replica instances applying to all shards in the elastic cluster. A <code>shardInstanceCount</code>
     * value of 1 means there is one writer instance, and any additional instances are replicas that can be used for
     * reads and to improve availability.
     * </p>
     * 
     * @param shardInstanceCount
     *        The number of replica instances applying to all shards in the elastic cluster. A
     *        <code>shardInstanceCount</code> value of 1 means there is one writer instance, and any additional
     *        instances are replicas that can be used for reads and to improve availability.
     */

    public void setShardInstanceCount(Integer shardInstanceCount) {
        this.shardInstanceCount = shardInstanceCount;
    }

    /**
     * <p>
     * The number of replica instances applying to all shards in the elastic cluster. A <code>shardInstanceCount</code>
     * value of 1 means there is one writer instance, and any additional instances are replicas that can be used for
     * reads and to improve availability.
     * </p>
     * 
     * @return The number of replica instances applying to all shards in the elastic cluster. A
     *         <code>shardInstanceCount</code> value of 1 means there is one writer instance, and any additional
     *         instances are replicas that can be used for reads and to improve availability.
     */

    public Integer getShardInstanceCount() {
        return this.shardInstanceCount;
    }

    /**
     * <p>
     * The number of replica instances applying to all shards in the elastic cluster. A <code>shardInstanceCount</code>
     * value of 1 means there is one writer instance, and any additional instances are replicas that can be used for
     * reads and to improve availability.
     * </p>
     * 
     * @param shardInstanceCount
     *        The number of replica instances applying to all shards in the elastic cluster. A
     *        <code>shardInstanceCount</code> value of 1 means there is one writer instance, and any additional
     *        instances are replicas that can be used for reads and to improve availability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withShardInstanceCount(Integer shardInstanceCount) {
        setShardInstanceCount(shardInstanceCount);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 subnet IDs for the elastic cluster.
     * </p>
     * 
     * @return The Amazon EC2 subnet IDs for the elastic cluster.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The Amazon EC2 subnet IDs for the elastic cluster.
     * </p>
     * 
     * @param subnetIds
     *        The Amazon EC2 subnet IDs for the elastic cluster.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The Amazon EC2 subnet IDs for the elastic cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The Amazon EC2 subnet IDs for the elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 subnet IDs for the elastic cluster.
     * </p>
     * 
     * @param subnetIds
     *        The Amazon EC2 subnet IDs for the elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the elastic cluster.
     * </p>
     * 
     * @return A list of EC2 VPC security groups to associate with the elastic cluster.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with the elastic cluster.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with the elastic cluster.
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
     * A list of EC2 VPC security groups to associate with the elastic cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with the elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of EC2 VPC security groups to associate with the elastic cluster.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with the elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateClusterRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
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
        if (getAdminUserPassword() != null)
            sb.append("AdminUserPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getShardCapacity() != null)
            sb.append("ShardCapacity: ").append(getShardCapacity()).append(",");
        if (getShardCount() != null)
            sb.append("ShardCount: ").append(getShardCount()).append(",");
        if (getShardInstanceCount() != null)
            sb.append("ShardInstanceCount: ").append(getShardInstanceCount()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateClusterRequest == false)
            return false;
        UpdateClusterRequest other = (UpdateClusterRequest) obj;
        if (other.getAdminUserPassword() == null ^ this.getAdminUserPassword() == null)
            return false;
        if (other.getAdminUserPassword() != null && other.getAdminUserPassword().equals(this.getAdminUserPassword()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getShardCapacity() == null ^ this.getShardCapacity() == null)
            return false;
        if (other.getShardCapacity() != null && other.getShardCapacity().equals(this.getShardCapacity()) == false)
            return false;
        if (other.getShardCount() == null ^ this.getShardCount() == null)
            return false;
        if (other.getShardCount() != null && other.getShardCount().equals(this.getShardCount()) == false)
            return false;
        if (other.getShardInstanceCount() == null ^ this.getShardInstanceCount() == null)
            return false;
        if (other.getShardInstanceCount() != null && other.getShardInstanceCount().equals(this.getShardInstanceCount()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdminUserPassword() == null) ? 0 : getAdminUserPassword().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getShardCapacity() == null) ? 0 : getShardCapacity().hashCode());
        hashCode = prime * hashCode + ((getShardCount() == null) ? 0 : getShardCount().hashCode());
        hashCode = prime * hashCode + ((getShardInstanceCount() == null) ? 0 : getShardInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        return hashCode;
    }

    @Override
    public UpdateClusterRequest clone() {
        return (UpdateClusterRequest) super.clone();
    }

}
