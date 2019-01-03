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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteBackup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBackupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the backup to be deleted. To find the ID of a backup, use the <a>DescribeBackups</a> operation.
     * </p>
     */
    private String backupId;

    /**
     * <p>
     * The ID of the backup to be deleted. To find the ID of a backup, use the <a>DescribeBackups</a> operation.
     * </p>
     * 
     * @param backupId
     *        The ID of the backup to be deleted. To find the ID of a backup, use the <a>DescribeBackups</a> operation.
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * The ID of the backup to be deleted. To find the ID of a backup, use the <a>DescribeBackups</a> operation.
     * </p>
     * 
     * @return The ID of the backup to be deleted. To find the ID of a backup, use the <a>DescribeBackups</a> operation.
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * <p>
     * The ID of the backup to be deleted. To find the ID of a backup, use the <a>DescribeBackups</a> operation.
     * </p>
     * 
     * @param backupId
     *        The ID of the backup to be deleted. To find the ID of a backup, use the <a>DescribeBackups</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBackupRequest withBackupId(String backupId) {
        setBackupId(backupId);
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
            sb.append("BackupId: ").append(getBackupId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBackupRequest == false)
            return false;
        DeleteBackupRequest other = (DeleteBackupRequest) obj;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBackupRequest clone() {
        return (DeleteBackupRequest) super.clone();
    }

}
