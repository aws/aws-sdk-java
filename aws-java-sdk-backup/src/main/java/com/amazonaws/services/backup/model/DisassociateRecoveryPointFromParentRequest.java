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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DisassociateRecoveryPointFromParent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateRecoveryPointFromParentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is the name of a logical container where the child (nested) recovery point is stored. Backup vaults are
     * identified by names that are unique to the account used to create them and the Amazon Web Services Region where
     * they are created. They consist of lowercase letters, numbers, and hyphens.
     * </p>
     */
    private String backupVaultName;
    /**
     * <p>
     * This is the Amazon Resource Name (ARN) that uniquely identifies the child (nested) recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.</code>
     * </p>
     */
    private String recoveryPointArn;

    /**
     * <p>
     * This is the name of a logical container where the child (nested) recovery point is stored. Backup vaults are
     * identified by names that are unique to the account used to create them and the Amazon Web Services Region where
     * they are created. They consist of lowercase letters, numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        This is the name of a logical container where the child (nested) recovery point is stored. Backup vaults
     *        are identified by names that are unique to the account used to create them and the Amazon Web Services
     *        Region where they are created. They consist of lowercase letters, numbers, and hyphens.
     */

    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * This is the name of a logical container where the child (nested) recovery point is stored. Backup vaults are
     * identified by names that are unique to the account used to create them and the Amazon Web Services Region where
     * they are created. They consist of lowercase letters, numbers, and hyphens.
     * </p>
     * 
     * @return This is the name of a logical container where the child (nested) recovery point is stored. Backup vaults
     *         are identified by names that are unique to the account used to create them and the Amazon Web Services
     *         Region where they are created. They consist of lowercase letters, numbers, and hyphens.
     */

    public String getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * <p>
     * This is the name of a logical container where the child (nested) recovery point is stored. Backup vaults are
     * identified by names that are unique to the account used to create them and the Amazon Web Services Region where
     * they are created. They consist of lowercase letters, numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        This is the name of a logical container where the child (nested) recovery point is stored. Backup vaults
     *        are identified by names that are unique to the account used to create them and the Amazon Web Services
     *        Region where they are created. They consist of lowercase letters, numbers, and hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateRecoveryPointFromParentRequest withBackupVaultName(String backupVaultName) {
        setBackupVaultName(backupVaultName);
        return this;
    }

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) that uniquely identifies the child (nested) recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.</code>
     * </p>
     * 
     * @param recoveryPointArn
     *        This is the Amazon Resource Name (ARN) that uniquely identifies the child (nested) recovery point; for
     *        example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.</code>
     */

    public void setRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
    }

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) that uniquely identifies the child (nested) recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.</code>
     * </p>
     * 
     * @return This is the Amazon Resource Name (ARN) that uniquely identifies the child (nested) recovery point; for
     *         example,
     *         <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.</code>
     */

    public String getRecoveryPointArn() {
        return this.recoveryPointArn;
    }

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) that uniquely identifies the child (nested) recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.</code>
     * </p>
     * 
     * @param recoveryPointArn
     *        This is the Amazon Resource Name (ARN) that uniquely identifies the child (nested) recovery point; for
     *        example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateRecoveryPointFromParentRequest withRecoveryPointArn(String recoveryPointArn) {
        setRecoveryPointArn(recoveryPointArn);
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
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: ").append(getBackupVaultName()).append(",");
        if (getRecoveryPointArn() != null)
            sb.append("RecoveryPointArn: ").append(getRecoveryPointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateRecoveryPointFromParentRequest == false)
            return false;
        DisassociateRecoveryPointFromParentRequest other = (DisassociateRecoveryPointFromParentRequest) obj;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getRecoveryPointArn() == null ^ this.getRecoveryPointArn() == null)
            return false;
        if (other.getRecoveryPointArn() != null && other.getRecoveryPointArn().equals(this.getRecoveryPointArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateRecoveryPointFromParentRequest clone() {
        return (DisassociateRecoveryPointFromParentRequest) super.clone();
    }

}
