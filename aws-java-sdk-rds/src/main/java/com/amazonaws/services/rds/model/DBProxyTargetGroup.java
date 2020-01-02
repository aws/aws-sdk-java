/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <note>
 * <p>
 * This is prerelease documentation for the RDS Database Proxy feature in preview release. It is subject to change.
 * </p>
 * </note>
 * <p>
 * Represents a set of RDS DB instances, Aurora DB clusters, or both that a proxy can connect to. Currently, each target
 * group is associated with exactly one RDS DB instance or Aurora DB cluster.
 * </p>
 * <p>
 * This data type is used as a response element in the <code>DescribeDBProxyTargetGroups</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DBProxyTargetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBProxyTargetGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the RDS proxy associated with this target group.
     * </p>
     */
    private String dBProxyName;
    /**
     * <p>
     * The identifier for the target group. This name must be unique for all target groups owned by your AWS account in
     * the specified AWS Region.
     * </p>
     */
    private String targetGroupName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the target group.
     * </p>
     */
    private String targetGroupArn;
    /**
     * <p>
     * Whether this target group is the first one used for connection requests by the associated proxy. Because each
     * proxy is currently associated with a single target group, currently this setting is always <code>true</code>.
     * </p>
     */
    private Boolean isDefault;
    /**
     * <p>
     * The current status of this target group. A status of <code>available</code> means the target group is correctly
     * associated with a database. Other values indicate that you must wait for the target group to be ready, or take
     * some action to resolve an issue.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The settings that determine the size and behavior of the connection pool for the target group.
     * </p>
     */
    private ConnectionPoolConfigurationInfo connectionPoolConfig;
    /**
     * <p>
     * The date and time when the target group was first created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The date and time when the target group was last updated.
     * </p>
     */
    private java.util.Date updatedDate;

    /**
     * <p>
     * The identifier for the RDS proxy associated with this target group.
     * </p>
     * 
     * @param dBProxyName
     *        The identifier for the RDS proxy associated with this target group.
     */

    public void setDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    /**
     * <p>
     * The identifier for the RDS proxy associated with this target group.
     * </p>
     * 
     * @return The identifier for the RDS proxy associated with this target group.
     */

    public String getDBProxyName() {
        return this.dBProxyName;
    }

    /**
     * <p>
     * The identifier for the RDS proxy associated with this target group.
     * </p>
     * 
     * @param dBProxyName
     *        The identifier for the RDS proxy associated with this target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyTargetGroup withDBProxyName(String dBProxyName) {
        setDBProxyName(dBProxyName);
        return this;
    }

    /**
     * <p>
     * The identifier for the target group. This name must be unique for all target groups owned by your AWS account in
     * the specified AWS Region.
     * </p>
     * 
     * @param targetGroupName
     *        The identifier for the target group. This name must be unique for all target groups owned by your AWS
     *        account in the specified AWS Region.
     */

    public void setTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
    }

    /**
     * <p>
     * The identifier for the target group. This name must be unique for all target groups owned by your AWS account in
     * the specified AWS Region.
     * </p>
     * 
     * @return The identifier for the target group. This name must be unique for all target groups owned by your AWS
     *         account in the specified AWS Region.
     */

    public String getTargetGroupName() {
        return this.targetGroupName;
    }

    /**
     * <p>
     * The identifier for the target group. This name must be unique for all target groups owned by your AWS account in
     * the specified AWS Region.
     * </p>
     * 
     * @param targetGroupName
     *        The identifier for the target group. This name must be unique for all target groups owned by your AWS
     *        account in the specified AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyTargetGroup withTargetGroupName(String targetGroupName) {
        setTargetGroupName(targetGroupName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the target group.
     * </p>
     * 
     * @param targetGroupArn
     *        The Amazon Resource Name (ARN) representing the target group.
     */

    public void setTargetGroupArn(String targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the target group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) representing the target group.
     */

    public String getTargetGroupArn() {
        return this.targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the target group.
     * </p>
     * 
     * @param targetGroupArn
     *        The Amazon Resource Name (ARN) representing the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyTargetGroup withTargetGroupArn(String targetGroupArn) {
        setTargetGroupArn(targetGroupArn);
        return this;
    }

    /**
     * <p>
     * Whether this target group is the first one used for connection requests by the associated proxy. Because each
     * proxy is currently associated with a single target group, currently this setting is always <code>true</code>.
     * </p>
     * 
     * @param isDefault
     *        Whether this target group is the first one used for connection requests by the associated proxy. Because
     *        each proxy is currently associated with a single target group, currently this setting is always
     *        <code>true</code>.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Whether this target group is the first one used for connection requests by the associated proxy. Because each
     * proxy is currently associated with a single target group, currently this setting is always <code>true</code>.
     * </p>
     * 
     * @return Whether this target group is the first one used for connection requests by the associated proxy. Because
     *         each proxy is currently associated with a single target group, currently this setting is always
     *         <code>true</code>.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Whether this target group is the first one used for connection requests by the associated proxy. Because each
     * proxy is currently associated with a single target group, currently this setting is always <code>true</code>.
     * </p>
     * 
     * @param isDefault
     *        Whether this target group is the first one used for connection requests by the associated proxy. Because
     *        each proxy is currently associated with a single target group, currently this setting is always
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyTargetGroup withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * Whether this target group is the first one used for connection requests by the associated proxy. Because each
     * proxy is currently associated with a single target group, currently this setting is always <code>true</code>.
     * </p>
     * 
     * @return Whether this target group is the first one used for connection requests by the associated proxy. Because
     *         each proxy is currently associated with a single target group, currently this setting is always
     *         <code>true</code>.
     */

    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * The current status of this target group. A status of <code>available</code> means the target group is correctly
     * associated with a database. Other values indicate that you must wait for the target group to be ready, or take
     * some action to resolve an issue.
     * </p>
     * 
     * @param status
     *        The current status of this target group. A status of <code>available</code> means the target group is
     *        correctly associated with a database. Other values indicate that you must wait for the target group to be
     *        ready, or take some action to resolve an issue.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of this target group. A status of <code>available</code> means the target group is correctly
     * associated with a database. Other values indicate that you must wait for the target group to be ready, or take
     * some action to resolve an issue.
     * </p>
     * 
     * @return The current status of this target group. A status of <code>available</code> means the target group is
     *         correctly associated with a database. Other values indicate that you must wait for the target group to be
     *         ready, or take some action to resolve an issue.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of this target group. A status of <code>available</code> means the target group is correctly
     * associated with a database. Other values indicate that you must wait for the target group to be ready, or take
     * some action to resolve an issue.
     * </p>
     * 
     * @param status
     *        The current status of this target group. A status of <code>available</code> means the target group is
     *        correctly associated with a database. Other values indicate that you must wait for the target group to be
     *        ready, or take some action to resolve an issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyTargetGroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The settings that determine the size and behavior of the connection pool for the target group.
     * </p>
     * 
     * @param connectionPoolConfig
     *        The settings that determine the size and behavior of the connection pool for the target group.
     */

    public void setConnectionPoolConfig(ConnectionPoolConfigurationInfo connectionPoolConfig) {
        this.connectionPoolConfig = connectionPoolConfig;
    }

    /**
     * <p>
     * The settings that determine the size and behavior of the connection pool for the target group.
     * </p>
     * 
     * @return The settings that determine the size and behavior of the connection pool for the target group.
     */

    public ConnectionPoolConfigurationInfo getConnectionPoolConfig() {
        return this.connectionPoolConfig;
    }

    /**
     * <p>
     * The settings that determine the size and behavior of the connection pool for the target group.
     * </p>
     * 
     * @param connectionPoolConfig
     *        The settings that determine the size and behavior of the connection pool for the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyTargetGroup withConnectionPoolConfig(ConnectionPoolConfigurationInfo connectionPoolConfig) {
        setConnectionPoolConfig(connectionPoolConfig);
        return this;
    }

    /**
     * <p>
     * The date and time when the target group was first created.
     * </p>
     * 
     * @param createdDate
     *        The date and time when the target group was first created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time when the target group was first created.
     * </p>
     * 
     * @return The date and time when the target group was first created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date and time when the target group was first created.
     * </p>
     * 
     * @param createdDate
     *        The date and time when the target group was first created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyTargetGroup withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The date and time when the target group was last updated.
     * </p>
     * 
     * @param updatedDate
     *        The date and time when the target group was last updated.
     */

    public void setUpdatedDate(java.util.Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * <p>
     * The date and time when the target group was last updated.
     * </p>
     * 
     * @return The date and time when the target group was last updated.
     */

    public java.util.Date getUpdatedDate() {
        return this.updatedDate;
    }

    /**
     * <p>
     * The date and time when the target group was last updated.
     * </p>
     * 
     * @param updatedDate
     *        The date and time when the target group was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DBProxyTargetGroup withUpdatedDate(java.util.Date updatedDate) {
        setUpdatedDate(updatedDate);
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
        if (getDBProxyName() != null)
            sb.append("DBProxyName: ").append(getDBProxyName()).append(",");
        if (getTargetGroupName() != null)
            sb.append("TargetGroupName: ").append(getTargetGroupName()).append(",");
        if (getTargetGroupArn() != null)
            sb.append("TargetGroupArn: ").append(getTargetGroupArn()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getConnectionPoolConfig() != null)
            sb.append("ConnectionPoolConfig: ").append(getConnectionPoolConfig()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getUpdatedDate() != null)
            sb.append("UpdatedDate: ").append(getUpdatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBProxyTargetGroup == false)
            return false;
        DBProxyTargetGroup other = (DBProxyTargetGroup) obj;
        if (other.getDBProxyName() == null ^ this.getDBProxyName() == null)
            return false;
        if (other.getDBProxyName() != null && other.getDBProxyName().equals(this.getDBProxyName()) == false)
            return false;
        if (other.getTargetGroupName() == null ^ this.getTargetGroupName() == null)
            return false;
        if (other.getTargetGroupName() != null && other.getTargetGroupName().equals(this.getTargetGroupName()) == false)
            return false;
        if (other.getTargetGroupArn() == null ^ this.getTargetGroupArn() == null)
            return false;
        if (other.getTargetGroupArn() != null && other.getTargetGroupArn().equals(this.getTargetGroupArn()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getConnectionPoolConfig() == null ^ this.getConnectionPoolConfig() == null)
            return false;
        if (other.getConnectionPoolConfig() != null && other.getConnectionPoolConfig().equals(this.getConnectionPoolConfig()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getUpdatedDate() == null ^ this.getUpdatedDate() == null)
            return false;
        if (other.getUpdatedDate() != null && other.getUpdatedDate().equals(this.getUpdatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBProxyName() == null) ? 0 : getDBProxyName().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupName() == null) ? 0 : getTargetGroupName().hashCode());
        hashCode = prime * hashCode + ((getTargetGroupArn() == null) ? 0 : getTargetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getConnectionPoolConfig() == null) ? 0 : getConnectionPoolConfig().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getUpdatedDate() == null) ? 0 : getUpdatedDate().hashCode());
        return hashCode;
    }

    @Override
    public DBProxyTargetGroup clone() {
        try {
            return (DBProxyTargetGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
