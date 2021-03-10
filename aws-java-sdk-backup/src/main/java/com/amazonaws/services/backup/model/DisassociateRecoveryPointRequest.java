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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DisassociateRecoveryPoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateRecoveryPointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of an AWS Backup vault. Required.
     * </p>
     */
    private String backupVaultName;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies an AWS Backup recovery point. Required.
     * </p>
     */
    private String recoveryPointArn;

    /**
     * <p>
     * The unique name of an AWS Backup vault. Required.
     * </p>
     * 
     * @param backupVaultName
     *        The unique name of an AWS Backup vault. Required.
     */

    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * The unique name of an AWS Backup vault. Required.
     * </p>
     * 
     * @return The unique name of an AWS Backup vault. Required.
     */

    public String getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * <p>
     * The unique name of an AWS Backup vault. Required.
     * </p>
     * 
     * @param backupVaultName
     *        The unique name of an AWS Backup vault. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateRecoveryPointRequest withBackupVaultName(String backupVaultName) {
        setBackupVaultName(backupVaultName);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies an AWS Backup recovery point. Required.
     * </p>
     * 
     * @param recoveryPointArn
     *        An Amazon Resource Name (ARN) that uniquely identifies an AWS Backup recovery point. Required.
     */

    public void setRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies an AWS Backup recovery point. Required.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies an AWS Backup recovery point. Required.
     */

    public String getRecoveryPointArn() {
        return this.recoveryPointArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies an AWS Backup recovery point. Required.
     * </p>
     * 
     * @param recoveryPointArn
     *        An Amazon Resource Name (ARN) that uniquely identifies an AWS Backup recovery point. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateRecoveryPointRequest withRecoveryPointArn(String recoveryPointArn) {
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

        if (obj instanceof DisassociateRecoveryPointRequest == false)
            return false;
        DisassociateRecoveryPointRequest other = (DisassociateRecoveryPointRequest) obj;
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
    public DisassociateRecoveryPointRequest clone() {
        return (DisassociateRecoveryPointRequest) super.clone();
    }

}
