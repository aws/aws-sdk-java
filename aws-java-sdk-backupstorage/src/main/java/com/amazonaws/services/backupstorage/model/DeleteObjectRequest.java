/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backupstorage.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/DeleteObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteObjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Backup job Id for the in-progress backup. */
    private String backupJobId;
    /** The name of the Object. */
    private String objectName;

    /**
     * Backup job Id for the in-progress backup.
     * 
     * @param backupJobId
     *        Backup job Id for the in-progress backup.
     */

    public void setBackupJobId(String backupJobId) {
        this.backupJobId = backupJobId;
    }

    /**
     * Backup job Id for the in-progress backup.
     * 
     * @return Backup job Id for the in-progress backup.
     */

    public String getBackupJobId() {
        return this.backupJobId;
    }

    /**
     * Backup job Id for the in-progress backup.
     * 
     * @param backupJobId
     *        Backup job Id for the in-progress backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteObjectRequest withBackupJobId(String backupJobId) {
        setBackupJobId(backupJobId);
        return this;
    }

    /**
     * The name of the Object.
     * 
     * @param objectName
     *        The name of the Object.
     */

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /**
     * The name of the Object.
     * 
     * @return The name of the Object.
     */

    public String getObjectName() {
        return this.objectName;
    }

    /**
     * The name of the Object.
     * 
     * @param objectName
     *        The name of the Object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteObjectRequest withObjectName(String objectName) {
        setObjectName(objectName);
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
        if (getBackupJobId() != null)
            sb.append("BackupJobId: ").append(getBackupJobId()).append(",");
        if (getObjectName() != null)
            sb.append("ObjectName: ").append(getObjectName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteObjectRequest == false)
            return false;
        DeleteObjectRequest other = (DeleteObjectRequest) obj;
        if (other.getBackupJobId() == null ^ this.getBackupJobId() == null)
            return false;
        if (other.getBackupJobId() != null && other.getBackupJobId().equals(this.getBackupJobId()) == false)
            return false;
        if (other.getObjectName() == null ^ this.getObjectName() == null)
            return false;
        if (other.getObjectName() != null && other.getObjectName().equals(this.getObjectName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupJobId() == null) ? 0 : getBackupJobId().hashCode());
        hashCode = prime * hashCode + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteObjectRequest clone() {
        return (DeleteObjectRequest) super.clone();
    }

}
