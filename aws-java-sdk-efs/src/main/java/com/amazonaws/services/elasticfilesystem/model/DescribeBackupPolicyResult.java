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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeBackupPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBackupPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the file system's backup policy, indicating whether automatic backups are turned on or off..
     * </p>
     */
    private BackupPolicy backupPolicy;

    /**
     * <p>
     * Describes the file system's backup policy, indicating whether automatic backups are turned on or off..
     * </p>
     * 
     * @param backupPolicy
     *        Describes the file system's backup policy, indicating whether automatic backups are turned on or off..
     */

    public void setBackupPolicy(BackupPolicy backupPolicy) {
        this.backupPolicy = backupPolicy;
    }

    /**
     * <p>
     * Describes the file system's backup policy, indicating whether automatic backups are turned on or off..
     * </p>
     * 
     * @return Describes the file system's backup policy, indicating whether automatic backups are turned on or off..
     */

    public BackupPolicy getBackupPolicy() {
        return this.backupPolicy;
    }

    /**
     * <p>
     * Describes the file system's backup policy, indicating whether automatic backups are turned on or off..
     * </p>
     * 
     * @param backupPolicy
     *        Describes the file system's backup policy, indicating whether automatic backups are turned on or off..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupPolicyResult withBackupPolicy(BackupPolicy backupPolicy) {
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

        if (obj instanceof DescribeBackupPolicyResult == false)
            return false;
        DescribeBackupPolicyResult other = (DescribeBackupPolicyResult) obj;
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

        hashCode = prime * hashCode + ((getBackupPolicy() == null) ? 0 : getBackupPolicy().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBackupPolicyResult clone() {
        try {
            return (DescribeBackupPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
