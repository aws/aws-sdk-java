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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/RestoreServer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreServerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the backup that you want to use to restore a server.
     * </p>
     */
    private String backupId;
    /**
     * <p>
     * The name of the server that you want to restore.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The type of the instance to create. Valid values must be specified in the following format:
     * <code>^([cm][34]|t2).*</code> For example, <code>m4.large</code>. Valid values are <code>t2.medium</code>,
     * <code>m4.large</code>, and <code>m4.2xlarge</code>. If you do not specify this parameter, RestoreServer uses the
     * instance type from the specified backup.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has
     * the SSH key.
     * </p>
     */
    private String keyPair;

    /**
     * <p>
     * The ID of the backup that you want to use to restore a server.
     * </p>
     * 
     * @param backupId
     *        The ID of the backup that you want to use to restore a server.
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * The ID of the backup that you want to use to restore a server.
     * </p>
     * 
     * @return The ID of the backup that you want to use to restore a server.
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * <p>
     * The ID of the backup that you want to use to restore a server.
     * </p>
     * 
     * @param backupId
     *        The ID of the backup that you want to use to restore a server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreServerRequest withBackupId(String backupId) {
        setBackupId(backupId);
        return this;
    }

    /**
     * <p>
     * The name of the server that you want to restore.
     * </p>
     * 
     * @param serverName
     *        The name of the server that you want to restore.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server that you want to restore.
     * </p>
     * 
     * @return The name of the server that you want to restore.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server that you want to restore.
     * </p>
     * 
     * @param serverName
     *        The name of the server that you want to restore.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreServerRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The type of the instance to create. Valid values must be specified in the following format:
     * <code>^([cm][34]|t2).*</code> For example, <code>m4.large</code>. Valid values are <code>t2.medium</code>,
     * <code>m4.large</code>, and <code>m4.2xlarge</code>. If you do not specify this parameter, RestoreServer uses the
     * instance type from the specified backup.
     * </p>
     * 
     * @param instanceType
     *        The type of the instance to create. Valid values must be specified in the following format:
     *        <code>^([cm][34]|t2).*</code> For example, <code>m4.large</code>. Valid values are <code>t2.medium</code>,
     *        <code>m4.large</code>, and <code>m4.2xlarge</code>. If you do not specify this parameter, RestoreServer
     *        uses the instance type from the specified backup.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of the instance to create. Valid values must be specified in the following format:
     * <code>^([cm][34]|t2).*</code> For example, <code>m4.large</code>. Valid values are <code>t2.medium</code>,
     * <code>m4.large</code>, and <code>m4.2xlarge</code>. If you do not specify this parameter, RestoreServer uses the
     * instance type from the specified backup.
     * </p>
     * 
     * @return The type of the instance to create. Valid values must be specified in the following format:
     *         <code>^([cm][34]|t2).*</code> For example, <code>m4.large</code>. Valid values are <code>t2.medium</code>
     *         , <code>m4.large</code>, and <code>m4.2xlarge</code>. If you do not specify this parameter, RestoreServer
     *         uses the instance type from the specified backup.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of the instance to create. Valid values must be specified in the following format:
     * <code>^([cm][34]|t2).*</code> For example, <code>m4.large</code>. Valid values are <code>t2.medium</code>,
     * <code>m4.large</code>, and <code>m4.2xlarge</code>. If you do not specify this parameter, RestoreServer uses the
     * instance type from the specified backup.
     * </p>
     * 
     * @param instanceType
     *        The type of the instance to create. Valid values must be specified in the following format:
     *        <code>^([cm][34]|t2).*</code> For example, <code>m4.large</code>. Valid values are <code>t2.medium</code>,
     *        <code>m4.large</code>, and <code>m4.2xlarge</code>. If you do not specify this parameter, RestoreServer
     *        uses the instance type from the specified backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreServerRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has
     * the SSH key.
     * </p>
     * 
     * @param keyPair
     *        The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no
     *        longer has the SSH key.
     */

    public void setKeyPair(String keyPair) {
        this.keyPair = keyPair;
    }

    /**
     * <p>
     * The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has
     * the SSH key.
     * </p>
     * 
     * @return The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no
     *         longer has the SSH key.
     */

    public String getKeyPair() {
        return this.keyPair;
    }

    /**
     * <p>
     * The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has
     * the SSH key.
     * </p>
     * 
     * @param keyPair
     *        The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no
     *        longer has the SSH key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreServerRequest withKeyPair(String keyPair) {
        setKeyPair(keyPair);
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
        if (getBackupId() != null)
            sb.append("BackupId: ").append(getBackupId()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getKeyPair() != null)
            sb.append("KeyPair: ").append(getKeyPair());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreServerRequest == false)
            return false;
        RestoreServerRequest other = (RestoreServerRequest) obj;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getKeyPair() == null ^ this.getKeyPair() == null)
            return false;
        if (other.getKeyPair() != null && other.getKeyPair().equals(this.getKeyPair()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getKeyPair() == null) ? 0 : getKeyPair().hashCode());
        return hashCode;
    }

    @Override
    public RestoreServerRequest clone() {
        return (RestoreServerRequest) super.clone();
    }

}
