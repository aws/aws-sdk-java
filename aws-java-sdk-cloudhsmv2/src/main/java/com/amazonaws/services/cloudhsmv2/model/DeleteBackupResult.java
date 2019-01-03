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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DeleteBackup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteBackupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information on the <code>Backup</code> object deleted.
     * </p>
     */
    private Backup backup;

    /**
     * <p>
     * Information on the <code>Backup</code> object deleted.
     * </p>
     * 
     * @param backup
     *        Information on the <code>Backup</code> object deleted.
     */

    public void setBackup(Backup backup) {
        this.backup = backup;
    }

    /**
     * <p>
     * Information on the <code>Backup</code> object deleted.
     * </p>
     * 
     * @return Information on the <code>Backup</code> object deleted.
     */

    public Backup getBackup() {
        return this.backup;
    }

    /**
     * <p>
     * Information on the <code>Backup</code> object deleted.
     * </p>
     * 
     * @param backup
     *        Information on the <code>Backup</code> object deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteBackupResult withBackup(Backup backup) {
        setBackup(backup);
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
        if (getBackup() != null)
            sb.append("Backup: ").append(getBackup());
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
        if (other.getBackup() == null ^ this.getBackup() == null)
            return false;
        if (other.getBackup() != null && other.getBackup().equals(this.getBackup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackup() == null) ? 0 : getBackup().hashCode());
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
