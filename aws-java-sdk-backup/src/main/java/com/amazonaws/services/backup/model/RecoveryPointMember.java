/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This is a recovery point which is a child (nested) recovery point of a parent (composite) recovery point. These
 * recovery points can be disassociated from their parent (composite) recovery point, in which case they will no longer
 * be a member.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/RecoveryPointMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryPointMember implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     * </p>
     */
    private String recoveryPointArn;
    /**
     * <p>
     * This is the Amazon Resource Name (ARN) that uniquely identifies a saved resource.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * This is the Amazon Web Services resource type that is saved as a recovery point.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * This is the name of the backup vault (the logical container in which backups are stored).
     * </p>
     */
    private String backupVaultName;

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     * </p>
     * 
     * @param recoveryPointArn
     *        This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     */

    public void setRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
    }

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     * </p>
     * 
     * @return This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     */

    public String getRecoveryPointArn() {
        return this.recoveryPointArn;
    }

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     * </p>
     * 
     * @param recoveryPointArn
     *        This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointMember withRecoveryPointArn(String recoveryPointArn) {
        setRecoveryPointArn(recoveryPointArn);
        return this;
    }

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) that uniquely identifies a saved resource.
     * </p>
     * 
     * @param resourceArn
     *        This is the Amazon Resource Name (ARN) that uniquely identifies a saved resource.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) that uniquely identifies a saved resource.
     * </p>
     * 
     * @return This is the Amazon Resource Name (ARN) that uniquely identifies a saved resource.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) that uniquely identifies a saved resource.
     * </p>
     * 
     * @param resourceArn
     *        This is the Amazon Resource Name (ARN) that uniquely identifies a saved resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointMember withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * This is the Amazon Web Services resource type that is saved as a recovery point.
     * </p>
     * 
     * @param resourceType
     *        This is the Amazon Web Services resource type that is saved as a recovery point.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * This is the Amazon Web Services resource type that is saved as a recovery point.
     * </p>
     * 
     * @return This is the Amazon Web Services resource type that is saved as a recovery point.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * This is the Amazon Web Services resource type that is saved as a recovery point.
     * </p>
     * 
     * @param resourceType
     *        This is the Amazon Web Services resource type that is saved as a recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointMember withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * This is the name of the backup vault (the logical container in which backups are stored).
     * </p>
     * 
     * @param backupVaultName
     *        This is the name of the backup vault (the logical container in which backups are stored).
     */

    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * This is the name of the backup vault (the logical container in which backups are stored).
     * </p>
     * 
     * @return This is the name of the backup vault (the logical container in which backups are stored).
     */

    public String getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * <p>
     * This is the name of the backup vault (the logical container in which backups are stored).
     * </p>
     * 
     * @param backupVaultName
     *        This is the name of the backup vault (the logical container in which backups are stored).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointMember withBackupVaultName(String backupVaultName) {
        setBackupVaultName(backupVaultName);
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
        if (getRecoveryPointArn() != null)
            sb.append("RecoveryPointArn: ").append(getRecoveryPointArn()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: ").append(getBackupVaultName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryPointMember == false)
            return false;
        RecoveryPointMember other = (RecoveryPointMember) obj;
        if (other.getRecoveryPointArn() == null ^ this.getRecoveryPointArn() == null)
            return false;
        if (other.getRecoveryPointArn() != null && other.getRecoveryPointArn().equals(this.getRecoveryPointArn()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        return hashCode;
    }

    @Override
    public RecoveryPointMember clone() {
        try {
            return (RecoveryPointMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.RecoveryPointMemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
