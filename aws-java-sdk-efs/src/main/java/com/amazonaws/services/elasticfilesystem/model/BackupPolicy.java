/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The backup policy for the file system used to create automatic daily backups. If status has a value of
 * <code>ENABLED</code>, the file system is being automatically backed up. For more information, see <a
 * href="https://docs.aws.amazon.com/efs/latest/ug/awsbackup.html#automatic-backups">Automatic backups</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/BackupPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the status of the file system's backup policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>ENABLED</code> </b> - EFS is automatically backing up the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ENABLING</code> </b> - EFS is turning on automatic backups for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DISABLED</code> </b> - automatic back ups are turned off for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DISABLING</code> </b> - EFS is turning off automatic backups for the file system.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * Describes the status of the file system's backup policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>ENABLED</code> </b> - EFS is automatically backing up the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ENABLING</code> </b> - EFS is turning on automatic backups for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DISABLED</code> </b> - automatic back ups are turned off for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DISABLING</code> </b> - EFS is turning off automatic backups for the file system.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the status of the file system's backup policy.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>ENABLED</code> </b> - EFS is automatically backing up the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ENABLING</code> </b> - EFS is turning on automatic backups for the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DISABLED</code> </b> - automatic back ups are turned off for the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DISABLING</code> </b> - EFS is turning off automatic backups for the file system.
     *        </p>
     *        </li>
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Describes the status of the file system's backup policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>ENABLED</code> </b> - EFS is automatically backing up the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ENABLING</code> </b> - EFS is turning on automatic backups for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DISABLED</code> </b> - automatic back ups are turned off for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DISABLING</code> </b> - EFS is turning off automatic backups for the file system.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the status of the file system's backup policy.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>ENABLED</code> </b> - EFS is automatically backing up the file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>ENABLING</code> </b> - EFS is turning on automatic backups for the file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>DISABLED</code> </b> - automatic back ups are turned off for the file system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>DISABLING</code> </b> - EFS is turning off automatic backups for the file system.
     *         </p>
     *         </li>
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Describes the status of the file system's backup policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>ENABLED</code> </b> - EFS is automatically backing up the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ENABLING</code> </b> - EFS is turning on automatic backups for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DISABLED</code> </b> - automatic back ups are turned off for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DISABLING</code> </b> - EFS is turning off automatic backups for the file system.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the status of the file system's backup policy.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>ENABLED</code> </b> - EFS is automatically backing up the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ENABLING</code> </b> - EFS is turning on automatic backups for the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DISABLED</code> </b> - automatic back ups are turned off for the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DISABLING</code> </b> - EFS is turning off automatic backups for the file system.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public BackupPolicy withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Describes the status of the file system's backup policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>ENABLED</code> </b> - EFS is automatically backing up the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ENABLING</code> </b> - EFS is turning on automatic backups for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DISABLED</code> </b> - automatic back ups are turned off for the file system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DISABLING</code> </b> - EFS is turning off automatic backups for the file system.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the status of the file system's backup policy.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>ENABLED</code> </b> - EFS is automatically backing up the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ENABLING</code> </b> - EFS is turning on automatic backups for the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DISABLED</code> </b> - automatic back ups are turned off for the file system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DISABLING</code> </b> - EFS is turning off automatic backups for the file system.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public BackupPolicy withStatus(Status status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupPolicy == false)
            return false;
        BackupPolicy other = (BackupPolicy) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public BackupPolicy clone() {
        try {
            return (BackupPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticfilesystem.model.transform.BackupPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
