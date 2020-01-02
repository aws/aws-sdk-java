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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBProxyTargetGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBProxyTargetGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new target group to assign to the proxy.
     * </p>
     */
    private String targetGroupName;
    /**
     * <p>
     * The name of the new proxy to which to assign the target group.
     * </p>
     */
    private String dBProxyName;
    /**
     * <p>
     * The settings that determine the size and behavior of the connection pool for the target group.
     * </p>
     */
    private ConnectionPoolConfiguration connectionPoolConfig;
    /**
     * <p>
     * The new name for the modified <code>DBProxyTarget</code>. An identifier must begin with a letter and must contain
     * only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String newName;

    /**
     * <p>
     * The name of the new target group to assign to the proxy.
     * </p>
     * 
     * @param targetGroupName
     *        The name of the new target group to assign to the proxy.
     */

    public void setTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
    }

    /**
     * <p>
     * The name of the new target group to assign to the proxy.
     * </p>
     * 
     * @return The name of the new target group to assign to the proxy.
     */

    public String getTargetGroupName() {
        return this.targetGroupName;
    }

    /**
     * <p>
     * The name of the new target group to assign to the proxy.
     * </p>
     * 
     * @param targetGroupName
     *        The name of the new target group to assign to the proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyTargetGroupRequest withTargetGroupName(String targetGroupName) {
        setTargetGroupName(targetGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the new proxy to which to assign the target group.
     * </p>
     * 
     * @param dBProxyName
     *        The name of the new proxy to which to assign the target group.
     */

    public void setDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    /**
     * <p>
     * The name of the new proxy to which to assign the target group.
     * </p>
     * 
     * @return The name of the new proxy to which to assign the target group.
     */

    public String getDBProxyName() {
        return this.dBProxyName;
    }

    /**
     * <p>
     * The name of the new proxy to which to assign the target group.
     * </p>
     * 
     * @param dBProxyName
     *        The name of the new proxy to which to assign the target group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyTargetGroupRequest withDBProxyName(String dBProxyName) {
        setDBProxyName(dBProxyName);
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

    public void setConnectionPoolConfig(ConnectionPoolConfiguration connectionPoolConfig) {
        this.connectionPoolConfig = connectionPoolConfig;
    }

    /**
     * <p>
     * The settings that determine the size and behavior of the connection pool for the target group.
     * </p>
     * 
     * @return The settings that determine the size and behavior of the connection pool for the target group.
     */

    public ConnectionPoolConfiguration getConnectionPoolConfig() {
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

    public ModifyDBProxyTargetGroupRequest withConnectionPoolConfig(ConnectionPoolConfiguration connectionPoolConfig) {
        setConnectionPoolConfig(connectionPoolConfig);
        return this;
    }

    /**
     * <p>
     * The new name for the modified <code>DBProxyTarget</code>. An identifier must begin with a letter and must contain
     * only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param newName
     *        The new name for the modified <code>DBProxyTarget</code>. An identifier must begin with a letter and must
     *        contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive
     *        hyphens.
     */

    public void setNewName(String newName) {
        this.newName = newName;
    }

    /**
     * <p>
     * The new name for the modified <code>DBProxyTarget</code>. An identifier must begin with a letter and must contain
     * only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @return The new name for the modified <code>DBProxyTarget</code>. An identifier must begin with a letter and must
     *         contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive
     *         hyphens.
     */

    public String getNewName() {
        return this.newName;
    }

    /**
     * <p>
     * The new name for the modified <code>DBProxyTarget</code>. An identifier must begin with a letter and must contain
     * only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param newName
     *        The new name for the modified <code>DBProxyTarget</code>. An identifier must begin with a letter and must
     *        contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive
     *        hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBProxyTargetGroupRequest withNewName(String newName) {
        setNewName(newName);
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
        if (getTargetGroupName() != null)
            sb.append("TargetGroupName: ").append(getTargetGroupName()).append(",");
        if (getDBProxyName() != null)
            sb.append("DBProxyName: ").append(getDBProxyName()).append(",");
        if (getConnectionPoolConfig() != null)
            sb.append("ConnectionPoolConfig: ").append(getConnectionPoolConfig()).append(",");
        if (getNewName() != null)
            sb.append("NewName: ").append(getNewName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBProxyTargetGroupRequest == false)
            return false;
        ModifyDBProxyTargetGroupRequest other = (ModifyDBProxyTargetGroupRequest) obj;
        if (other.getTargetGroupName() == null ^ this.getTargetGroupName() == null)
            return false;
        if (other.getTargetGroupName() != null && other.getTargetGroupName().equals(this.getTargetGroupName()) == false)
            return false;
        if (other.getDBProxyName() == null ^ this.getDBProxyName() == null)
            return false;
        if (other.getDBProxyName() != null && other.getDBProxyName().equals(this.getDBProxyName()) == false)
            return false;
        if (other.getConnectionPoolConfig() == null ^ this.getConnectionPoolConfig() == null)
            return false;
        if (other.getConnectionPoolConfig() != null && other.getConnectionPoolConfig().equals(this.getConnectionPoolConfig()) == false)
            return false;
        if (other.getNewName() == null ^ this.getNewName() == null)
            return false;
        if (other.getNewName() != null && other.getNewName().equals(this.getNewName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetGroupName() == null) ? 0 : getTargetGroupName().hashCode());
        hashCode = prime * hashCode + ((getDBProxyName() == null) ? 0 : getDBProxyName().hashCode());
        hashCode = prime * hashCode + ((getConnectionPoolConfig() == null) ? 0 : getConnectionPoolConfig().hashCode());
        hashCode = prime * hashCode + ((getNewName() == null) ? 0 : getNewName().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBProxyTargetGroupRequest clone() {
        return (ModifyDBProxyTargetGroupRequest) super.clone();
    }

}
