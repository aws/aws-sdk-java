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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartDBInstanceAutomatedBackupsReplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDBInstanceAutomatedBackupsReplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example,
     * <code>arn:aws:rds:us-west-2:123456789012:db:mydatabase</code>.
     * </p>
     */
    private String sourceDBInstanceArn;
    /**
     * <p>
     * The retention period for the replicated automated backups.
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of the replicated automated backups. The KMS key ID is
     * the Amazon Resource Name (ARN) for the KMS encryption key in the destination Amazon Web Services Region, for
     * example, <code>arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE</code>.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A URL that contains a Signature Version 4 signed request for the StartDBInstanceAutomatedBackupsReplication
     * action to be called in the Amazon Web Services Region of the source DB instance. The presigned URL must be a
     * valid request for the StartDBInstanceAutomatedBackupsReplication API action that can be executed in the Amazon
     * Web Services Region that contains the source DB instance.
     * </p>
     */
    private String preSignedUrl;
    /** The region where the source instance is located. */
    private String sourceRegion;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example,
     * <code>arn:aws:rds:us-west-2:123456789012:db:mydatabase</code>.
     * </p>
     * 
     * @param sourceDBInstanceArn
     *        The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for
     *        example, <code>arn:aws:rds:us-west-2:123456789012:db:mydatabase</code>.
     */

    public void setSourceDBInstanceArn(String sourceDBInstanceArn) {
        this.sourceDBInstanceArn = sourceDBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example,
     * <code>arn:aws:rds:us-west-2:123456789012:db:mydatabase</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for
     *         example, <code>arn:aws:rds:us-west-2:123456789012:db:mydatabase</code>.
     */

    public String getSourceDBInstanceArn() {
        return this.sourceDBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example,
     * <code>arn:aws:rds:us-west-2:123456789012:db:mydatabase</code>.
     * </p>
     * 
     * @param sourceDBInstanceArn
     *        The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for
     *        example, <code>arn:aws:rds:us-west-2:123456789012:db:mydatabase</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDBInstanceAutomatedBackupsReplicationRequest withSourceDBInstanceArn(String sourceDBInstanceArn) {
        setSourceDBInstanceArn(sourceDBInstanceArn);
        return this;
    }

    /**
     * <p>
     * The retention period for the replicated automated backups.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The retention period for the replicated automated backups.
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The retention period for the replicated automated backups.
     * </p>
     * 
     * @return The retention period for the replicated automated backups.
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The retention period for the replicated automated backups.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        The retention period for the replicated automated backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDBInstanceAutomatedBackupsReplicationRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of the replicated automated backups. The KMS key ID is
     * the Amazon Resource Name (ARN) for the KMS encryption key in the destination Amazon Web Services Region, for
     * example, <code>arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE</code>.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier for encryption of the replicated automated backups. The KMS key
     *        ID is the Amazon Resource Name (ARN) for the KMS encryption key in the destination Amazon Web Services
     *        Region, for example, <code>arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE</code>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of the replicated automated backups. The KMS key ID is
     * the Amazon Resource Name (ARN) for the KMS encryption key in the destination Amazon Web Services Region, for
     * example, <code>arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE</code>.
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier for encryption of the replicated automated backups. The KMS
     *         key ID is the Amazon Resource Name (ARN) for the KMS encryption key in the destination Amazon Web
     *         Services Region, for example, <code>arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE</code>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier for encryption of the replicated automated backups. The KMS key ID is
     * the Amazon Resource Name (ARN) for the KMS encryption key in the destination Amazon Web Services Region, for
     * example, <code>arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE</code>.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier for encryption of the replicated automated backups. The KMS key
     *        ID is the Amazon Resource Name (ARN) for the KMS encryption key in the destination Amazon Web Services
     *        Region, for example, <code>arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDBInstanceAutomatedBackupsReplicationRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A URL that contains a Signature Version 4 signed request for the StartDBInstanceAutomatedBackupsReplication
     * action to be called in the Amazon Web Services Region of the source DB instance. The presigned URL must be a
     * valid request for the StartDBInstanceAutomatedBackupsReplication API action that can be executed in the Amazon
     * Web Services Region that contains the source DB instance.
     * </p>
     * 
     * @param preSignedUrl
     *        A URL that contains a Signature Version 4 signed request for the
     *        StartDBInstanceAutomatedBackupsReplication action to be called in the Amazon Web Services Region of the
     *        source DB instance. The presigned URL must be a valid request for the
     *        StartDBInstanceAutomatedBackupsReplication API action that can be executed in the Amazon Web Services
     *        Region that contains the source DB instance.
     */

    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * <p>
     * A URL that contains a Signature Version 4 signed request for the StartDBInstanceAutomatedBackupsReplication
     * action to be called in the Amazon Web Services Region of the source DB instance. The presigned URL must be a
     * valid request for the StartDBInstanceAutomatedBackupsReplication API action that can be executed in the Amazon
     * Web Services Region that contains the source DB instance.
     * </p>
     * 
     * @return A URL that contains a Signature Version 4 signed request for the
     *         StartDBInstanceAutomatedBackupsReplication action to be called in the Amazon Web Services Region of the
     *         source DB instance. The presigned URL must be a valid request for the
     *         StartDBInstanceAutomatedBackupsReplication API action that can be executed in the Amazon Web Services
     *         Region that contains the source DB instance.
     */

    public String getPreSignedUrl() {
        return this.preSignedUrl;
    }

    /**
     * <p>
     * A URL that contains a Signature Version 4 signed request for the StartDBInstanceAutomatedBackupsReplication
     * action to be called in the Amazon Web Services Region of the source DB instance. The presigned URL must be a
     * valid request for the StartDBInstanceAutomatedBackupsReplication API action that can be executed in the Amazon
     * Web Services Region that contains the source DB instance.
     * </p>
     * 
     * @param preSignedUrl
     *        A URL that contains a Signature Version 4 signed request for the
     *        StartDBInstanceAutomatedBackupsReplication action to be called in the Amazon Web Services Region of the
     *        source DB instance. The presigned URL must be a valid request for the
     *        StartDBInstanceAutomatedBackupsReplication API action that can be executed in the Amazon Web Services
     *        Region that contains the source DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDBInstanceAutomatedBackupsReplicationRequest withPreSignedUrl(String preSignedUrl) {
        setPreSignedUrl(preSignedUrl);
        return this;
    }

    /**
     * The region where the source instance is located.
     * 
     * @param sourceRegion
     *        The region where the source instance is located.
     */

    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * The region where the source instance is located.
     * 
     * @return The region where the source instance is located.
     */

    public String getSourceRegion() {
        return this.sourceRegion;
    }

    /**
     * The region where the source instance is located.
     * 
     * @param sourceRegion
     *        The region where the source instance is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDBInstanceAutomatedBackupsReplicationRequest withSourceRegion(String sourceRegion) {
        setSourceRegion(sourceRegion);
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
        if (getSourceDBInstanceArn() != null)
            sb.append("SourceDBInstanceArn: ").append(getSourceDBInstanceArn()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getPreSignedUrl() != null)
            sb.append("PreSignedUrl: ").append(getPreSignedUrl()).append(",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: ").append(getSourceRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDBInstanceAutomatedBackupsReplicationRequest == false)
            return false;
        StartDBInstanceAutomatedBackupsReplicationRequest other = (StartDBInstanceAutomatedBackupsReplicationRequest) obj;
        if (other.getSourceDBInstanceArn() == null ^ this.getSourceDBInstanceArn() == null)
            return false;
        if (other.getSourceDBInstanceArn() != null && other.getSourceDBInstanceArn().equals(this.getSourceDBInstanceArn()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPreSignedUrl() == null ^ this.getPreSignedUrl() == null)
            return false;
        if (other.getPreSignedUrl() != null && other.getPreSignedUrl().equals(this.getPreSignedUrl()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceDBInstanceArn() == null) ? 0 : getSourceDBInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPreSignedUrl() == null) ? 0 : getPreSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        return hashCode;
    }

    @Override
    public StartDBInstanceAutomatedBackupsReplicationRequest clone() {
        return (StartDBInstanceAutomatedBackupsReplicationRequest) super.clone();
    }

}
