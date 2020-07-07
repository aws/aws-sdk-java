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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The backup policy for the file system, showing the curent status. If <code>ENABLED</code>, the file system is being
 * backed up.
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
     * <i> <code>ENABLED</code> - EFS is automatically backing up the file system.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>ENABLING</code> - EFS is turning on automatic backups for the file system.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>DISABLED</code> - automatic back ups are turned off for the file system.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>DISABLED</code> - EFS is turning off automatic backups for the file system.</i>
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
     * <i> <code>ENABLED</code> - EFS is automatically backing up the file system.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>ENABLING</code> - EFS is turning on automatic backups for the file system.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>DISABLED</code> - automatic back ups are turned off for the file system.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>DISABLED</code> - EFS is turning off automatic backups for the file system.</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the status of the file system's backup policy.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i> <code>ENABLED</code> - EFS is automatically backing up the file system.</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>ENABLING</code> - EFS is turning on automatic backups for the file system.</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>DISABLED</code> - automatic back ups are turned off for the file system.</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>DISABLED</code> - EFS is turning off automatic backups for the file system.</i>
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
     * <i> <code>ENABLED</code> - EFS is automatically backing up the file system.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>ENABLING</code> - EFS is turning on automatic backups for the file system.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>DISABLED</code> - automatic back ups are turned off for the file system.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>DISABLED</code> - EFS is turning off automatic backups for the file system.</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the status of the file system's backup policy.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i> <code>ENABLED</code> - EFS is automatically backing up the file system.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i> <code>ENABLING</code> - EFS is turning on automatic backups for the file system.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i> <code>DISABLED</code> - automatic back ups are turned off for the file system.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i> <code>DISABLED</code> - EFS is turning off automatic backups for the file system.</i>
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
     * <i> <code>ENABLED</code> - EFS is automatically backing up the file system.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>ENABLING</code> - EFS is turning on automatic backups for the file system.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>DISABLED</code> - automatic back ups are turned off for the file system.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>DISABLED</code> - EFS is turning off automatic backups for the file system.</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the status of the file system's backup policy.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i> <code>ENABLED</code> - EFS is automatically backing up the file system.</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>ENABLING</code> - EFS is turning on automatic backups for the file system.</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>DISABLED</code> - automatic back ups are turned off for the file system.</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>DISABLED</code> - EFS is turning off automatic backups for the file system.</i>
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
     * <i> <code>ENABLED</code> - EFS is automatically backing up the file system.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>ENABLING</code> - EFS is turning on automatic backups for the file system.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>DISABLED</code> - automatic back ups are turned off for the file system.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>DISABLED</code> - EFS is turning off automatic backups for the file system.</i>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Describes the status of the file system's backup policy.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i> <code>ENABLED</code> - EFS is automatically backing up the file system.</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>ENABLING</code> - EFS is turning on automatic backups for the file system.</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>DISABLED</code> - automatic back ups are turned off for the file system.</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i> <code>DISABLED</code> - EFS is turning off automatic backups for the file system.</i>
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
