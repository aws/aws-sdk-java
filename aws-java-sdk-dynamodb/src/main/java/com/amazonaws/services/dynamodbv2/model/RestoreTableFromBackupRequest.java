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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/RestoreTableFromBackup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreTableFromBackupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     */
    private String targetTableName;
    /**
     * <p>
     * The ARN associated with the backup.
     * </p>
     */
    private String backupArn;

    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     * 
     * @param targetTableName
     *        The name of the new table to which the backup must be restored.
     */

    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     * 
     * @return The name of the new table to which the backup must be restored.
     */

    public String getTargetTableName() {
        return this.targetTableName;
    }

    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     * 
     * @param targetTableName
     *        The name of the new table to which the backup must be restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromBackupRequest withTargetTableName(String targetTableName) {
        setTargetTableName(targetTableName);
        return this;
    }

    /**
     * <p>
     * The ARN associated with the backup.
     * </p>
     * 
     * @param backupArn
     *        The ARN associated with the backup.
     */

    public void setBackupArn(String backupArn) {
        this.backupArn = backupArn;
    }

    /**
     * <p>
     * The ARN associated with the backup.
     * </p>
     * 
     * @return The ARN associated with the backup.
     */

    public String getBackupArn() {
        return this.backupArn;
    }

    /**
     * <p>
     * The ARN associated with the backup.
     * </p>
     * 
     * @param backupArn
     *        The ARN associated with the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreTableFromBackupRequest withBackupArn(String backupArn) {
        setBackupArn(backupArn);
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
        if (getTargetTableName() != null)
            sb.append("TargetTableName: ").append(getTargetTableName()).append(",");
        if (getBackupArn() != null)
            sb.append("BackupArn: ").append(getBackupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTableFromBackupRequest == false)
            return false;
        RestoreTableFromBackupRequest other = (RestoreTableFromBackupRequest) obj;
        if (other.getTargetTableName() == null ^ this.getTargetTableName() == null)
            return false;
        if (other.getTargetTableName() != null && other.getTargetTableName().equals(this.getTargetTableName()) == false)
            return false;
        if (other.getBackupArn() == null ^ this.getBackupArn() == null)
            return false;
        if (other.getBackupArn() != null && other.getBackupArn().equals(this.getBackupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetTableName() == null) ? 0 : getTargetTableName().hashCode());
        hashCode = prime * hashCode + ((getBackupArn() == null) ? 0 : getBackupArn().hashCode());
        return hashCode;
    }

    @Override
    public RestoreTableFromBackupRequest clone() {
        return (RestoreTableFromBackupRequest) super.clone();
    }

}
