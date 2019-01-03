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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response object for <code>DeleteBackup</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteBackup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBackupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the backup deleted.
     * </p>
     */
    private String backupId;
    /**
     * <p>
     * The lifecycle of the backup. Should be <code>DELETED</code>.
     * </p>
     */
    private String lifecycle;

    /**
     * <p>
     * The ID of the backup deleted.
     * </p>
     * 
     * @param backupId
     *        The ID of the backup deleted.
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * The ID of the backup deleted.
     * </p>
     * 
     * @return The ID of the backup deleted.
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * <p>
     * The ID of the backup deleted.
     * </p>
     * 
     * @param backupId
     *        The ID of the backup deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBackupResult withBackupId(String backupId) {
        setBackupId(backupId);
        return this;
    }

    /**
     * <p>
     * The lifecycle of the backup. Should be <code>DELETED</code>.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle of the backup. Should be <code>DELETED</code>.
     * @see BackupLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle of the backup. Should be <code>DELETED</code>.
     * </p>
     * 
     * @return The lifecycle of the backup. Should be <code>DELETED</code>.
     * @see BackupLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The lifecycle of the backup. Should be <code>DELETED</code>.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle of the backup. Should be <code>DELETED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupLifecycle
     */

    public DeleteBackupResult withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * The lifecycle of the backup. Should be <code>DELETED</code>.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle of the backup. Should be <code>DELETED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupLifecycle
     */

    public DeleteBackupResult withLifecycle(BackupLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
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
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteBackupResult == false)
            return false;
        DeleteBackupResult other = (DeleteBackupResult) obj;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        return hashCode;
    }

    @Override
    public DeleteBackupResult clone() {
        try {
            return (DeleteBackupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
