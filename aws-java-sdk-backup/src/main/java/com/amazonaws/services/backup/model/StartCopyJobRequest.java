/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StartCopyJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCopyJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point to use for the copy job; for example,
     * arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
     * </p>
     */
    private String recoveryPointArn;
    /**
     * <p>
     * The name of a logical source container where backups are stored. Backup vaults are identified by names that are
     * unique to the account used to create them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens. &gt;
     * </p>
     */
    private String sourceBackupVaultName;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination backup vault to copy to; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String destinationBackupVaultArn;
    /**
     * <p>
     * Specifies the IAM role ARN used to copy the target recovery point; for example,
     * arn:aws:iam::123456789012:role/S3Access.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to <code>StartCopyJob</code>.
     * </p>
     */
    private String idempotencyToken;

    private Lifecycle lifecycle;

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point to use for the copy job; for example,
     * arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
     * </p>
     * 
     * @param recoveryPointArn
     *        An ARN that uniquely identifies a recovery point to use for the copy job; for example,
     *        arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
     */

    public void setRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point to use for the copy job; for example,
     * arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
     * </p>
     * 
     * @return An ARN that uniquely identifies a recovery point to use for the copy job; for example,
     *         arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
     */

    public String getRecoveryPointArn() {
        return this.recoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point to use for the copy job; for example,
     * arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
     * </p>
     * 
     * @param recoveryPointArn
     *        An ARN that uniquely identifies a recovery point to use for the copy job; for example,
     *        arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCopyJobRequest withRecoveryPointArn(String recoveryPointArn) {
        setRecoveryPointArn(recoveryPointArn);
        return this;
    }

    /**
     * <p>
     * The name of a logical source container where backups are stored. Backup vaults are identified by names that are
     * unique to the account used to create them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens. &gt;
     * </p>
     * 
     * @param sourceBackupVaultName
     *        The name of a logical source container where backups are stored. Backup vaults are identified by names
     *        that are unique to the account used to create them and the AWS Region where they are created. They consist
     *        of lowercase letters, numbers, and hyphens. &gt;
     */

    public void setSourceBackupVaultName(String sourceBackupVaultName) {
        this.sourceBackupVaultName = sourceBackupVaultName;
    }

    /**
     * <p>
     * The name of a logical source container where backups are stored. Backup vaults are identified by names that are
     * unique to the account used to create them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens. &gt;
     * </p>
     * 
     * @return The name of a logical source container where backups are stored. Backup vaults are identified by names
     *         that are unique to the account used to create them and the AWS Region where they are created. They
     *         consist of lowercase letters, numbers, and hyphens. &gt;
     */

    public String getSourceBackupVaultName() {
        return this.sourceBackupVaultName;
    }

    /**
     * <p>
     * The name of a logical source container where backups are stored. Backup vaults are identified by names that are
     * unique to the account used to create them and the AWS Region where they are created. They consist of lowercase
     * letters, numbers, and hyphens. &gt;
     * </p>
     * 
     * @param sourceBackupVaultName
     *        The name of a logical source container where backups are stored. Backup vaults are identified by names
     *        that are unique to the account used to create them and the AWS Region where they are created. They consist
     *        of lowercase letters, numbers, and hyphens. &gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCopyJobRequest withSourceBackupVaultName(String sourceBackupVaultName) {
        setSourceBackupVaultName(sourceBackupVaultName);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination backup vault to copy to; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @param destinationBackupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a destination backup vault to copy to; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     */

    public void setDestinationBackupVaultArn(String destinationBackupVaultArn) {
        this.destinationBackupVaultArn = destinationBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination backup vault to copy to; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a destination backup vault to copy to; for
     *         example, <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     */

    public String getDestinationBackupVaultArn() {
        return this.destinationBackupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a destination backup vault to copy to; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @param destinationBackupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a destination backup vault to copy to; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCopyJobRequest withDestinationBackupVaultArn(String destinationBackupVaultArn) {
        setDestinationBackupVaultArn(destinationBackupVaultArn);
        return this;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to copy the target recovery point; for example,
     * arn:aws:iam::123456789012:role/S3Access.
     * </p>
     * 
     * @param iamRoleArn
     *        Specifies the IAM role ARN used to copy the target recovery point; for example,
     *        arn:aws:iam::123456789012:role/S3Access.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to copy the target recovery point; for example,
     * arn:aws:iam::123456789012:role/S3Access.
     * </p>
     * 
     * @return Specifies the IAM role ARN used to copy the target recovery point; for example,
     *         arn:aws:iam::123456789012:role/S3Access.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to copy the target recovery point; for example,
     * arn:aws:iam::123456789012:role/S3Access.
     * </p>
     * 
     * @param iamRoleArn
     *        Specifies the IAM role ARN used to copy the target recovery point; for example,
     *        arn:aws:iam::123456789012:role/S3Access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCopyJobRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to <code>StartCopyJob</code>.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer chosen string that can be used to distinguish between calls to <code>StartCopyJob</code>.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to <code>StartCopyJob</code>.
     * </p>
     * 
     * @return A customer chosen string that can be used to distinguish between calls to <code>StartCopyJob</code>.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to <code>StartCopyJob</code>.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer chosen string that can be used to distinguish between calls to <code>StartCopyJob</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCopyJobRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
        return this;
    }

    /**
     * @param lifecycle
     */

    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * @return
     */

    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    /**
     * @param lifecycle
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCopyJobRequest withLifecycle(Lifecycle lifecycle) {
        setLifecycle(lifecycle);
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
        if (getSourceBackupVaultName() != null)
            sb.append("SourceBackupVaultName: ").append(getSourceBackupVaultName()).append(",");
        if (getDestinationBackupVaultArn() != null)
            sb.append("DestinationBackupVaultArn: ").append(getDestinationBackupVaultArn()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken()).append(",");
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

        if (obj instanceof StartCopyJobRequest == false)
            return false;
        StartCopyJobRequest other = (StartCopyJobRequest) obj;
        if (other.getRecoveryPointArn() == null ^ this.getRecoveryPointArn() == null)
            return false;
        if (other.getRecoveryPointArn() != null && other.getRecoveryPointArn().equals(this.getRecoveryPointArn()) == false)
            return false;
        if (other.getSourceBackupVaultName() == null ^ this.getSourceBackupVaultName() == null)
            return false;
        if (other.getSourceBackupVaultName() != null && other.getSourceBackupVaultName().equals(this.getSourceBackupVaultName()) == false)
            return false;
        if (other.getDestinationBackupVaultArn() == null ^ this.getDestinationBackupVaultArn() == null)
            return false;
        if (other.getDestinationBackupVaultArn() != null && other.getDestinationBackupVaultArn().equals(this.getDestinationBackupVaultArn()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
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

        hashCode = prime * hashCode + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        hashCode = prime * hashCode + ((getSourceBackupVaultName() == null) ? 0 : getSourceBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getDestinationBackupVaultArn() == null) ? 0 : getDestinationBackupVaultArn().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        return hashCode;
    }

    @Override
    public StartCopyJobRequest clone() {
        return (StartCopyJobRequest) super.clone();
    }

}
