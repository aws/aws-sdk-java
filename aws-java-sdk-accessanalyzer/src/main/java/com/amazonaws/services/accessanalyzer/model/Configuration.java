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
     * The access control configuration is for an IAM role.
     * </p>
     */
    private IamRoleConfiguration iamRole;
    /**
     * <p>
     * The access control configuration is for a KMS key.
     * </p>
     */
    private KmsKeyConfiguration kmsKey;
    /**
     * <p>
     * The access control configuration is for an Amazon S3 Bucket.
     * </p>
     */
    private S3BucketConfiguration s3Bucket;
    /**
     * <p>
     * The access control configuration is for a Secrets Manager secret.
     * </p>
     */
    private SecretsManagerSecretConfiguration secretsManagerSecret;
    /**
     * <p>
     * The access control configuration is for an SQS queue.
     * </p>
     */
    private SqsQueueConfiguration sqsQueue;

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
     * The access control configuration is for an SQS queue.
     * </p>
     * 
     * @param sqsQueue
     *        The access control configuration is for an SQS queue.
     */

    public void setSqsQueue(SqsQueueConfiguration sqsQueue) {
        this.sqsQueue = sqsQueue;
    }

    /**
     * <p>
     * The access control configuration is for an SQS queue.
     * </p>
     * 
     * @return The access control configuration is for an SQS queue.
     */

    public SqsQueueConfiguration getSqsQueue() {
        return this.sqsQueue;
    }

    /**
     * <p>
     * The access control configuration is for an SQS queue.
     * </p>
     * 
     * @param sqsQueue
     *        The access control configuration is for an SQS queue.
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
        if (getIamRole() != null)
            sb.append("IamRole: ").append(getIamRole()).append(",");
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getSecretsManagerSecret() != null)
            sb.append("SecretsManagerSecret: ").append(getSecretsManagerSecret()).append(",");
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
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        if (other.getKmsKey() == null ^ this.getKmsKey() == null)
            return false;
        if (other.getKmsKey() != null && other.getKmsKey().equals(this.getKmsKey()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getSecretsManagerSecret() == null ^ this.getSecretsManagerSecret() == null)
            return false;
        if (other.getSecretsManagerSecret() != null && other.getSecretsManagerSecret().equals(this.getSecretsManagerSecret()) == false)
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

        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerSecret() == null) ? 0 : getSecretsManagerSecret().hashCode());
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
