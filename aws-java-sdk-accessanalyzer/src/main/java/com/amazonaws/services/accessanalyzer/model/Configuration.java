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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Access control configuration structures for your resource. You specify the configuration as a type-value pair. You
 * can specify only one type of access control configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/Configuration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Configuration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The access control configuration is for an Amazon EBS volume snapshot.
     * </p>
     */
    private EbsSnapshotConfiguration ebsSnapshot;
    /**
     * <p>
     * The access control configuration is for an Amazon ECR repository.
     * </p>
     */
    private EcrRepositoryConfiguration ecrRepository;
    /**
     * <p>
     * The access control configuration is for an IAM role.
     * </p>
     */
    private IamRoleConfiguration iamRole;
    /**
     * <p>
     * The access control configuration is for an Amazon EFS file system.
     * </p>
     */
    private EfsFileSystemConfiguration efsFileSystem;
    /**
     * <p>
     * The access control configuration is for a KMS key.
     * </p>
     */
    private KmsKeyConfiguration kmsKey;
    /**
     * <p>
     * The access control configuration is for an Amazon RDS DB cluster snapshot.
     * </p>
     */
    private RdsDbClusterSnapshotConfiguration rdsDbClusterSnapshot;
    /**
     * <p>
     * The access control configuration is for an Amazon RDS DB snapshot.
     * </p>
     */
    private RdsDbSnapshotConfiguration rdsDbSnapshot;
    /**
     * <p>
     * The access control configuration is for a Secrets Manager secret.
     * </p>
     */
    private SecretsManagerSecretConfiguration secretsManagerSecret;
    /**
     * <p>
     * The access control configuration is for an Amazon S3 Bucket.
     * </p>
     */
    private S3BucketConfiguration s3Bucket;
    /**
     * <p>
     * The access control configuration is for an Amazon SNS topic
     * </p>
     */
    private SnsTopicConfiguration snsTopic;
    /**
     * <p>
     * The access control configuration is for an Amazon SQS queue.
     * </p>
     */
    private SqsQueueConfiguration sqsQueue;

    /**
     * <p>
     * The access control configuration is for an Amazon EBS volume snapshot.
     * </p>
     * 
     * @param ebsSnapshot
     *        The access control configuration is for an Amazon EBS volume snapshot.
     */

    public void setEbsSnapshot(EbsSnapshotConfiguration ebsSnapshot) {
        this.ebsSnapshot = ebsSnapshot;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon EBS volume snapshot.
     * </p>
     * 
     * @return The access control configuration is for an Amazon EBS volume snapshot.
     */

    public EbsSnapshotConfiguration getEbsSnapshot() {
        return this.ebsSnapshot;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon EBS volume snapshot.
     * </p>
     * 
     * @param ebsSnapshot
     *        The access control configuration is for an Amazon EBS volume snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withEbsSnapshot(EbsSnapshotConfiguration ebsSnapshot) {
        setEbsSnapshot(ebsSnapshot);
        return this;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon ECR repository.
     * </p>
     * 
     * @param ecrRepository
     *        The access control configuration is for an Amazon ECR repository.
     */

    public void setEcrRepository(EcrRepositoryConfiguration ecrRepository) {
        this.ecrRepository = ecrRepository;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon ECR repository.
     * </p>
     * 
     * @return The access control configuration is for an Amazon ECR repository.
     */

    public EcrRepositoryConfiguration getEcrRepository() {
        return this.ecrRepository;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon ECR repository.
     * </p>
     * 
     * @param ecrRepository
     *        The access control configuration is for an Amazon ECR repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withEcrRepository(EcrRepositoryConfiguration ecrRepository) {
        setEcrRepository(ecrRepository);
        return this;
    }

    /**
     * <p>
     * The access control configuration is for an IAM role.
     * </p>
     * 
     * @param iamRole
     *        The access control configuration is for an IAM role.
     */

    public void setIamRole(IamRoleConfiguration iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * The access control configuration is for an IAM role.
     * </p>
     * 
     * @return The access control configuration is for an IAM role.
     */

    public IamRoleConfiguration getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * The access control configuration is for an IAM role.
     * </p>
     * 
     * @param iamRole
     *        The access control configuration is for an IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withIamRole(IamRoleConfiguration iamRole) {
        setIamRole(iamRole);
        return this;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon EFS file system.
     * </p>
     * 
     * @param efsFileSystem
     *        The access control configuration is for an Amazon EFS file system.
     */

    public void setEfsFileSystem(EfsFileSystemConfiguration efsFileSystem) {
        this.efsFileSystem = efsFileSystem;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon EFS file system.
     * </p>
     * 
     * @return The access control configuration is for an Amazon EFS file system.
     */

    public EfsFileSystemConfiguration getEfsFileSystem() {
        return this.efsFileSystem;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon EFS file system.
     * </p>
     * 
     * @param efsFileSystem
     *        The access control configuration is for an Amazon EFS file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withEfsFileSystem(EfsFileSystemConfiguration efsFileSystem) {
        setEfsFileSystem(efsFileSystem);
        return this;
    }

    /**
     * <p>
     * The access control configuration is for a KMS key.
     * </p>
     * 
     * @param kmsKey
     *        The access control configuration is for a KMS key.
     */

    public void setKmsKey(KmsKeyConfiguration kmsKey) {
        this.kmsKey = kmsKey;
    }

    /**
     * <p>
     * The access control configuration is for a KMS key.
     * </p>
     * 
     * @return The access control configuration is for a KMS key.
     */

    public KmsKeyConfiguration getKmsKey() {
        return this.kmsKey;
    }

    /**
     * <p>
     * The access control configuration is for a KMS key.
     * </p>
     * 
     * @param kmsKey
     *        The access control configuration is for a KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withKmsKey(KmsKeyConfiguration kmsKey) {
        setKmsKey(kmsKey);
        return this;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon RDS DB cluster snapshot.
     * </p>
     * 
     * @param rdsDbClusterSnapshot
     *        The access control configuration is for an Amazon RDS DB cluster snapshot.
     */

    public void setRdsDbClusterSnapshot(RdsDbClusterSnapshotConfiguration rdsDbClusterSnapshot) {
        this.rdsDbClusterSnapshot = rdsDbClusterSnapshot;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon RDS DB cluster snapshot.
     * </p>
     * 
     * @return The access control configuration is for an Amazon RDS DB cluster snapshot.
     */

    public RdsDbClusterSnapshotConfiguration getRdsDbClusterSnapshot() {
        return this.rdsDbClusterSnapshot;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon RDS DB cluster snapshot.
     * </p>
     * 
     * @param rdsDbClusterSnapshot
     *        The access control configuration is for an Amazon RDS DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withRdsDbClusterSnapshot(RdsDbClusterSnapshotConfiguration rdsDbClusterSnapshot) {
        setRdsDbClusterSnapshot(rdsDbClusterSnapshot);
        return this;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon RDS DB snapshot.
     * </p>
     * 
     * @param rdsDbSnapshot
     *        The access control configuration is for an Amazon RDS DB snapshot.
     */

    public void setRdsDbSnapshot(RdsDbSnapshotConfiguration rdsDbSnapshot) {
        this.rdsDbSnapshot = rdsDbSnapshot;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon RDS DB snapshot.
     * </p>
     * 
     * @return The access control configuration is for an Amazon RDS DB snapshot.
     */

    public RdsDbSnapshotConfiguration getRdsDbSnapshot() {
        return this.rdsDbSnapshot;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon RDS DB snapshot.
     * </p>
     * 
     * @param rdsDbSnapshot
     *        The access control configuration is for an Amazon RDS DB snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withRdsDbSnapshot(RdsDbSnapshotConfiguration rdsDbSnapshot) {
        setRdsDbSnapshot(rdsDbSnapshot);
        return this;
    }

    /**
     * <p>
     * The access control configuration is for a Secrets Manager secret.
     * </p>
     * 
     * @param secretsManagerSecret
     *        The access control configuration is for a Secrets Manager secret.
     */

    public void setSecretsManagerSecret(SecretsManagerSecretConfiguration secretsManagerSecret) {
        this.secretsManagerSecret = secretsManagerSecret;
    }

    /**
     * <p>
     * The access control configuration is for a Secrets Manager secret.
     * </p>
     * 
     * @return The access control configuration is for a Secrets Manager secret.
     */

    public SecretsManagerSecretConfiguration getSecretsManagerSecret() {
        return this.secretsManagerSecret;
    }

    /**
     * <p>
     * The access control configuration is for a Secrets Manager secret.
     * </p>
     * 
     * @param secretsManagerSecret
     *        The access control configuration is for a Secrets Manager secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withSecretsManagerSecret(SecretsManagerSecretConfiguration secretsManagerSecret) {
        setSecretsManagerSecret(secretsManagerSecret);
        return this;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon S3 Bucket.
     * </p>
     * 
     * @param s3Bucket
     *        The access control configuration is for an Amazon S3 Bucket.
     */

    public void setS3Bucket(S3BucketConfiguration s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon S3 Bucket.
     * </p>
     * 
     * @return The access control configuration is for an Amazon S3 Bucket.
     */

    public S3BucketConfiguration getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon S3 Bucket.
     * </p>
     * 
     * @param s3Bucket
     *        The access control configuration is for an Amazon S3 Bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withS3Bucket(S3BucketConfiguration s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon SNS topic
     * </p>
     * 
     * @param snsTopic
     *        The access control configuration is for an Amazon SNS topic
     */

    public void setSnsTopic(SnsTopicConfiguration snsTopic) {
        this.snsTopic = snsTopic;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon SNS topic
     * </p>
     * 
     * @return The access control configuration is for an Amazon SNS topic
     */

    public SnsTopicConfiguration getSnsTopic() {
        return this.snsTopic;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon SNS topic
     * </p>
     * 
     * @param snsTopic
     *        The access control configuration is for an Amazon SNS topic
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withSnsTopic(SnsTopicConfiguration snsTopic) {
        setSnsTopic(snsTopic);
        return this;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon SQS queue.
     * </p>
     * 
     * @param sqsQueue
     *        The access control configuration is for an Amazon SQS queue.
     */

    public void setSqsQueue(SqsQueueConfiguration sqsQueue) {
        this.sqsQueue = sqsQueue;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon SQS queue.
     * </p>
     * 
     * @return The access control configuration is for an Amazon SQS queue.
     */

    public SqsQueueConfiguration getSqsQueue() {
        return this.sqsQueue;
    }

    /**
     * <p>
     * The access control configuration is for an Amazon SQS queue.
     * </p>
     * 
     * @param sqsQueue
     *        The access control configuration is for an Amazon SQS queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Configuration withSqsQueue(SqsQueueConfiguration sqsQueue) {
        setSqsQueue(sqsQueue);
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
        if (getEbsSnapshot() != null)
            sb.append("EbsSnapshot: ").append(getEbsSnapshot()).append(",");
        if (getEcrRepository() != null)
            sb.append("EcrRepository: ").append(getEcrRepository()).append(",");
        if (getIamRole() != null)
            sb.append("IamRole: ").append(getIamRole()).append(",");
        if (getEfsFileSystem() != null)
            sb.append("EfsFileSystem: ").append(getEfsFileSystem()).append(",");
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey()).append(",");
        if (getRdsDbClusterSnapshot() != null)
            sb.append("RdsDbClusterSnapshot: ").append(getRdsDbClusterSnapshot()).append(",");
        if (getRdsDbSnapshot() != null)
            sb.append("RdsDbSnapshot: ").append(getRdsDbSnapshot()).append(",");
        if (getSecretsManagerSecret() != null)
            sb.append("SecretsManagerSecret: ").append(getSecretsManagerSecret()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getSnsTopic() != null)
            sb.append("SnsTopic: ").append(getSnsTopic()).append(",");
        if (getSqsQueue() != null)
            sb.append("SqsQueue: ").append(getSqsQueue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Configuration == false)
            return false;
        Configuration other = (Configuration) obj;
        if (other.getEbsSnapshot() == null ^ this.getEbsSnapshot() == null)
            return false;
        if (other.getEbsSnapshot() != null && other.getEbsSnapshot().equals(this.getEbsSnapshot()) == false)
            return false;
        if (other.getEcrRepository() == null ^ this.getEcrRepository() == null)
            return false;
        if (other.getEcrRepository() != null && other.getEcrRepository().equals(this.getEcrRepository()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        if (other.getEfsFileSystem() == null ^ this.getEfsFileSystem() == null)
            return false;
        if (other.getEfsFileSystem() != null && other.getEfsFileSystem().equals(this.getEfsFileSystem()) == false)
            return false;
        if (other.getKmsKey() == null ^ this.getKmsKey() == null)
            return false;
        if (other.getKmsKey() != null && other.getKmsKey().equals(this.getKmsKey()) == false)
            return false;
        if (other.getRdsDbClusterSnapshot() == null ^ this.getRdsDbClusterSnapshot() == null)
            return false;
        if (other.getRdsDbClusterSnapshot() != null && other.getRdsDbClusterSnapshot().equals(this.getRdsDbClusterSnapshot()) == false)
            return false;
        if (other.getRdsDbSnapshot() == null ^ this.getRdsDbSnapshot() == null)
            return false;
        if (other.getRdsDbSnapshot() != null && other.getRdsDbSnapshot().equals(this.getRdsDbSnapshot()) == false)
            return false;
        if (other.getSecretsManagerSecret() == null ^ this.getSecretsManagerSecret() == null)
            return false;
        if (other.getSecretsManagerSecret() != null && other.getSecretsManagerSecret().equals(this.getSecretsManagerSecret()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getSnsTopic() == null ^ this.getSnsTopic() == null)
            return false;
        if (other.getSnsTopic() != null && other.getSnsTopic().equals(this.getSnsTopic()) == false)
            return false;
        if (other.getSqsQueue() == null ^ this.getSqsQueue() == null)
            return false;
        if (other.getSqsQueue() != null && other.getSqsQueue().equals(this.getSqsQueue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEbsSnapshot() == null) ? 0 : getEbsSnapshot().hashCode());
        hashCode = prime * hashCode + ((getEcrRepository() == null) ? 0 : getEcrRepository().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getEfsFileSystem() == null) ? 0 : getEfsFileSystem().hashCode());
        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        hashCode = prime * hashCode + ((getRdsDbClusterSnapshot() == null) ? 0 : getRdsDbClusterSnapshot().hashCode());
        hashCode = prime * hashCode + ((getRdsDbSnapshot() == null) ? 0 : getRdsDbSnapshot().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerSecret() == null) ? 0 : getSecretsManagerSecret().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getSnsTopic() == null) ? 0 : getSnsTopic().hashCode());
        hashCode = prime * hashCode + ((getSqsQueue() == null) ? 0 : getSqsQueue().hashCode());
        return hashCode;
    }

    @Override
    public Configuration clone() {
        try {
            return (Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.ConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
