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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Writes the MIME content of the email to an S3 bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/S3Action" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the specified the bucket has been deleted.
     * </p>
     */
    private String actionFailurePolicy;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Role to use while writing to S3. This role must have access to the
     * s3:PutObject, kms:Encrypt, and kms:GenerateDataKey APIs for the given bucket.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The bucket name of the S3 bucket to write to.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The S3 prefix to use for the write to the s3 bucket.
     * </p>
     */
    private String s3Prefix;
    /**
     * <p>
     * The KMS Key ID to use to encrypt the message in S3.
     * </p>
     */
    private String s3SseKmsKeyId;

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the specified the bucket has been deleted.
     * </p>
     * 
     * @param actionFailurePolicy
     *        A policy that states what to do in the case of failure. The action will fail if there are configuration
     *        errors. For example, the specified the bucket has been deleted.
     * @see ActionFailurePolicy
     */

    public void setActionFailurePolicy(String actionFailurePolicy) {
        this.actionFailurePolicy = actionFailurePolicy;
    }

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the specified the bucket has been deleted.
     * </p>
     * 
     * @return A policy that states what to do in the case of failure. The action will fail if there are configuration
     *         errors. For example, the specified the bucket has been deleted.
     * @see ActionFailurePolicy
     */

    public String getActionFailurePolicy() {
        return this.actionFailurePolicy;
    }

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the specified the bucket has been deleted.
     * </p>
     * 
     * @param actionFailurePolicy
     *        A policy that states what to do in the case of failure. The action will fail if there are configuration
     *        errors. For example, the specified the bucket has been deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionFailurePolicy
     */

    public S3Action withActionFailurePolicy(String actionFailurePolicy) {
        setActionFailurePolicy(actionFailurePolicy);
        return this;
    }

    /**
     * <p>
     * A policy that states what to do in the case of failure. The action will fail if there are configuration errors.
     * For example, the specified the bucket has been deleted.
     * </p>
     * 
     * @param actionFailurePolicy
     *        A policy that states what to do in the case of failure. The action will fail if there are configuration
     *        errors. For example, the specified the bucket has been deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionFailurePolicy
     */

    public S3Action withActionFailurePolicy(ActionFailurePolicy actionFailurePolicy) {
        this.actionFailurePolicy = actionFailurePolicy.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Role to use while writing to S3. This role must have access to the
     * s3:PutObject, kms:Encrypt, and kms:GenerateDataKey APIs for the given bucket.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM Role to use while writing to S3. This role must have access to
     *        the s3:PutObject, kms:Encrypt, and kms:GenerateDataKey APIs for the given bucket.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Role to use while writing to S3. This role must have access to the
     * s3:PutObject, kms:Encrypt, and kms:GenerateDataKey APIs for the given bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM Role to use while writing to S3. This role must have access to
     *         the s3:PutObject, kms:Encrypt, and kms:GenerateDataKey APIs for the given bucket.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM Role to use while writing to S3. This role must have access to the
     * s3:PutObject, kms:Encrypt, and kms:GenerateDataKey APIs for the given bucket.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM Role to use while writing to S3. This role must have access to
     *        the s3:PutObject, kms:Encrypt, and kms:GenerateDataKey APIs for the given bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Action withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The bucket name of the S3 bucket to write to.
     * </p>
     * 
     * @param s3Bucket
     *        The bucket name of the S3 bucket to write to.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The bucket name of the S3 bucket to write to.
     * </p>
     * 
     * @return The bucket name of the S3 bucket to write to.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The bucket name of the S3 bucket to write to.
     * </p>
     * 
     * @param s3Bucket
     *        The bucket name of the S3 bucket to write to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Action withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The S3 prefix to use for the write to the s3 bucket.
     * </p>
     * 
     * @param s3Prefix
     *        The S3 prefix to use for the write to the s3 bucket.
     */

    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The S3 prefix to use for the write to the s3 bucket.
     * </p>
     * 
     * @return The S3 prefix to use for the write to the s3 bucket.
     */

    public String getS3Prefix() {
        return this.s3Prefix;
    }

    /**
     * <p>
     * The S3 prefix to use for the write to the s3 bucket.
     * </p>
     * 
     * @param s3Prefix
     *        The S3 prefix to use for the write to the s3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Action withS3Prefix(String s3Prefix) {
        setS3Prefix(s3Prefix);
        return this;
    }

    /**
     * <p>
     * The KMS Key ID to use to encrypt the message in S3.
     * </p>
     * 
     * @param s3SseKmsKeyId
     *        The KMS Key ID to use to encrypt the message in S3.
     */

    public void setS3SseKmsKeyId(String s3SseKmsKeyId) {
        this.s3SseKmsKeyId = s3SseKmsKeyId;
    }

    /**
     * <p>
     * The KMS Key ID to use to encrypt the message in S3.
     * </p>
     * 
     * @return The KMS Key ID to use to encrypt the message in S3.
     */

    public String getS3SseKmsKeyId() {
        return this.s3SseKmsKeyId;
    }

    /**
     * <p>
     * The KMS Key ID to use to encrypt the message in S3.
     * </p>
     * 
     * @param s3SseKmsKeyId
     *        The KMS Key ID to use to encrypt the message in S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Action withS3SseKmsKeyId(String s3SseKmsKeyId) {
        setS3SseKmsKeyId(s3SseKmsKeyId);
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
        if (getActionFailurePolicy() != null)
            sb.append("ActionFailurePolicy: ").append(getActionFailurePolicy()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3Prefix() != null)
            sb.append("S3Prefix: ").append(getS3Prefix()).append(",");
        if (getS3SseKmsKeyId() != null)
            sb.append("S3SseKmsKeyId: ").append(getS3SseKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Action == false)
            return false;
        S3Action other = (S3Action) obj;
        if (other.getActionFailurePolicy() == null ^ this.getActionFailurePolicy() == null)
            return false;
        if (other.getActionFailurePolicy() != null && other.getActionFailurePolicy().equals(this.getActionFailurePolicy()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        if (other.getS3SseKmsKeyId() == null ^ this.getS3SseKmsKeyId() == null)
            return false;
        if (other.getS3SseKmsKeyId() != null && other.getS3SseKmsKeyId().equals(this.getS3SseKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionFailurePolicy() == null) ? 0 : getActionFailurePolicy().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        hashCode = prime * hashCode + ((getS3SseKmsKeyId() == null) ? 0 : getS3SseKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public S3Action clone() {
        try {
            return (S3Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.S3ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
