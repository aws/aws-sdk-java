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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ModifyBackupAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyBackupAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier (ID) of the backup to modify. To find the ID of a backup, use the <a>DescribeBackups</a>
     * operation.
     * </p>
     */
    private String backupId;
    /**
     * <p>
     * Specifies whether the service should exempt a backup from the retention policy for the cluster. <code>True</code>
     * exempts a backup from the retention policy. <code>False</code> means the service applies the backup retention
     * policy defined at the cluster.
     * </p>
     */
    private Boolean neverExpires;

    /**
     * <p>
     * The identifier (ID) of the backup to modify. To find the ID of a backup, use the <a>DescribeBackups</a>
     * operation.
     * </p>
     * 
     * @param backupId
     *        The identifier (ID) of the backup to modify. To find the ID of a backup, use the <a>DescribeBackups</a>
     *        operation.
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * The identifier (ID) of the backup to modify. To find the ID of a backup, use the <a>DescribeBackups</a>
     * operation.
     * </p>
     * 
     * @return The identifier (ID) of the backup to modify. To find the ID of a backup, use the <a>DescribeBackups</a>
     *         operation.
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * <p>
     * The identifier (ID) of the backup to modify. To find the ID of a backup, use the <a>DescribeBackups</a>
     * operation.
     * </p>
     * 
     * @param backupId
     *        The identifier (ID) of the backup to modify. To find the ID of a backup, use the <a>DescribeBackups</a>
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyBackupAttributesRequest withBackupId(String backupId) {
        setBackupId(backupId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the service should exempt a backup from the retention policy for the cluster. <code>True</code>
     * exempts a backup from the retention policy. <code>False</code> means the service applies the backup retention
     * policy defined at the cluster.
     * </p>
     * 
     * @param neverExpires
     *        Specifies whether the service should exempt a backup from the retention policy for the cluster.
     *        <code>True</code> exempts a backup from the retention policy. <code>False</code> means the service applies
     *        the backup retention policy defined at the cluster.
     */

    public void setNeverExpires(Boolean neverExpires) {
        this.neverExpires = neverExpires;
    }

    /**
     * <p>
     * Specifies whether the service should exempt a backup from the retention policy for the cluster. <code>True</code>
     * exempts a backup from the retention policy. <code>False</code> means the service applies the backup retention
     * policy defined at the cluster.
     * </p>
     * 
     * @return Specifies whether the service should exempt a backup from the retention policy for the cluster.
     *         <code>True</code> exempts a backup from the retention policy. <code>False</code> means the service
     *         applies the backup retention policy defined at the cluster.
     */

    public Boolean getNeverExpires() {
        return this.neverExpires;
    }

    /**
     * <p>
     * Specifies whether the service should exempt a backup from the retention policy for the cluster. <code>True</code>
     * exempts a backup from the retention policy. <code>False</code> means the service applies the backup retention
     * policy defined at the cluster.
     * </p>
     * 
     * @param neverExpires
     *        Specifies whether the service should exempt a backup from the retention policy for the cluster.
     *        <code>True</code> exempts a backup from the retention policy. <code>False</code> means the service applies
     *        the backup retention policy defined at the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyBackupAttributesRequest withNeverExpires(Boolean neverExpires) {
        setNeverExpires(neverExpires);
        return this;
    }

    /**
     * <p>
     * Specifies whether the service should exempt a backup from the retention policy for the cluster. <code>True</code>
     * exempts a backup from the retention policy. <code>False</code> means the service applies the backup retention
     * policy defined at the cluster.
     * </p>
     * 
     * @return Specifies whether the service should exempt a backup from the retention policy for the cluster.
     *         <code>True</code> exempts a backup from the retention policy. <code>False</code> means the service
     *         applies the backup retention policy defined at the cluster.
     */

    public Boolean isNeverExpires() {
        return this.neverExpires;
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
        if (getNeverExpires() != null)
            sb.append("NeverExpires: ").append(getNeverExpires());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyBackupAttributesRequest == false)
            return false;
        ModifyBackupAttributesRequest other = (ModifyBackupAttributesRequest) obj;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getNeverExpires() == null ^ this.getNeverExpires() == null)
            return false;
        if (other.getNeverExpires() != null && other.getNeverExpires().equals(this.getNeverExpires()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getNeverExpires() == null) ? 0 : getNeverExpires().hashCode());
        return hashCode;
    }

    @Override
    public ModifyBackupAttributesRequest clone() {
        return (ModifyBackupAttributesRequest) super.clone();
    }

}
