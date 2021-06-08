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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/PutBackupPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutBackupPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies which EFS file system to update the backup policy for.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * The backup policy included in the <code>PutBackupPolicy</code> request.
     * </p>
     */
    private BackupPolicy backupPolicy;

    /**
     * <p>
     * Specifies which EFS file system to update the backup policy for.
     * </p>
     * 
     * @param fileSystemId
     *        Specifies which EFS file system to update the backup policy for.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * Specifies which EFS file system to update the backup policy for.
     * </p>
     * 
     * @return Specifies which EFS file system to update the backup policy for.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * Specifies which EFS file system to update the backup policy for.
     * </p>
     * 
     * @param fileSystemId
     *        Specifies which EFS file system to update the backup policy for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBackupPolicyRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The backup policy included in the <code>PutBackupPolicy</code> request.
     * </p>
     * 
     * @param backupPolicy
     *        The backup policy included in the <code>PutBackupPolicy</code> request.
     */

    public void setBackupPolicy(BackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
    }

    /**
     * <p>
     * The backup policy included in the <code>PutBackupPolicy</code> request.
     * </p>
     * 
     * @return The backup policy included in the <code>PutBackupPolicy</code> request.
     */

    public BackupPolicy getBackupPolicy() {
        return this.backupPolicy;
    }

    /**
     * <p>
     * The backup policy included in the <code>PutBackupPolicy</code> request.
     * </p>
     * 
     * @param backupPolicy
     *        The backup policy included in the <code>PutBackupPolicy</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutBackupPolicyRequest withBackupPolicy(BackupPolicy backupPolicy) {
        setBackupPolicy(backupPolicy);
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getBackupPolicy() != null)
            sb.append("BackupPolicy: ").append(getBackupPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutBackupPolicyRequest == false)
            return false;
        PutBackupPolicyRequest other = (PutBackupPolicyRequest) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getBackupPolicy() == null ^ this.getBackupPolicy() == null)
            return false;
        if (other.getBackupPolicy() != null && other.getBackupPolicy().equals(this.getBackupPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getBackupPolicy() == null) ? 0 : getBackupPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutBackupPolicyRequest clone() {
        return (PutBackupPolicyRequest) super.clone();
    }

}
