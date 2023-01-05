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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/StartObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartObjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Backup job Id for the in-progress backup */
    private String backupJobId;
    /** Name for the object. */
    private String objectName;
    /** Throw an exception if Object name is already exist. */
    private Boolean throwOnDuplicate;

    /**
     * Backup job Id for the in-progress backup
     * 
     * @param backupJobId
     *        Backup job Id for the in-progress backup
     */

    public void setBackupJobId(String backupJobId) {
        this.backupJobId = backupJobId;
    }

    /**
     * Backup job Id for the in-progress backup
     * 
     * @return Backup job Id for the in-progress backup
     */

    public String getBackupJobId() {
        return this.backupJobId;
    }

    /**
     * Backup job Id for the in-progress backup
     * 
     * @param backupJobId
     *        Backup job Id for the in-progress backup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartObjectRequest withBackupJobId(String backupJobId) {
        setBackupJobId(backupJobId);
        return this;
    }

    /**
     * Name for the object.
     * 
     * @param objectName
     *        Name for the object.
     */

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /**
     * Name for the object.
     * 
     * @return Name for the object.
     */

    public String getObjectName() {
        return this.objectName;
    }

    /**
     * Name for the object.
     * 
     * @param objectName
     *        Name for the object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartObjectRequest withObjectName(String objectName) {
        setObjectName(objectName);
        return this;
    }

    /**
     * Throw an exception if Object name is already exist.
     * 
     * @param throwOnDuplicate
     *        Throw an exception if Object name is already exist.
     */

    public void setThrowOnDuplicate(Boolean throwOnDuplicate) {
        this.throwOnDuplicate = throwOnDuplicate;
    }

    /**
     * Throw an exception if Object name is already exist.
     * 
     * @return Throw an exception if Object name is already exist.
     */

    public Boolean getThrowOnDuplicate() {
        return this.throwOnDuplicate;
    }

    /**
     * Throw an exception if Object name is already exist.
     * 
     * @param throwOnDuplicate
     *        Throw an exception if Object name is already exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartObjectRequest withThrowOnDuplicate(Boolean throwOnDuplicate) {
        setThrowOnDuplicate(throwOnDuplicate);
        return this;
    }

    /**
     * Throw an exception if Object name is already exist.
     * 
     * @return Throw an exception if Object name is already exist.
     */

    public Boolean isThrowOnDuplicate() {
        return this.throwOnDuplicate;
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
            sb.append("ObjectName: ").append(getObjectName()).append(",");
        if (getThrowOnDuplicate() != null)
            sb.append("ThrowOnDuplicate: ").append(getThrowOnDuplicate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartObjectRequest == false)
            return false;
        StartObjectRequest other = (StartObjectRequest) obj;
        if (other.getBackupJobId() == null ^ this.getBackupJobId() == null)
            return false;
        if (other.getBackupJobId() != null && other.getBackupJobId().equals(this.getBackupJobId()) == false)
            return false;
        if (other.getObjectName() == null ^ this.getObjectName() == null)
            return false;
        if (other.getObjectName() != null && other.getObjectName().equals(this.getObjectName()) == false)
            return false;
        if (other.getThrowOnDuplicate() == null ^ this.getThrowOnDuplicate() == null)
            return false;
        if (other.getThrowOnDuplicate() != null && other.getThrowOnDuplicate().equals(this.getThrowOnDuplicate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupJobId() == null) ? 0 : getBackupJobId().hashCode());
        hashCode = prime * hashCode + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        hashCode = prime * hashCode + ((getThrowOnDuplicate() == null) ? 0 : getThrowOnDuplicate().hashCode());
        return hashCode;
    }

    @Override
    public StartObjectRequest clone() {
        return (StartObjectRequest) super.clone();
    }

}
