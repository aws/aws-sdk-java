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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/StartMailboxExportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMailboxExportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The idempotency token for the client request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The identifier associated with the organization.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The identifier of the user or resource associated with the mailbox.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The mailbox export job description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the S3 bucket.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the
     * exported mailbox content.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The S3 bucket prefix.
     * </p>
     */
    private String s3Prefix;

    /**
     * <p>
     * The idempotency token for the client request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the client request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token for the client request.
     * </p>
     * 
     * @return The idempotency token for the client request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token for the client request.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token for the client request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMailboxExportJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The identifier associated with the organization.
     * </p>
     * 
     * @param organizationId
     *        The identifier associated with the organization.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier associated with the organization.
     * </p>
     * 
     * @return The identifier associated with the organization.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier associated with the organization.
     * </p>
     * 
     * @param organizationId
     *        The identifier associated with the organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMailboxExportJobRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the user or resource associated with the mailbox.
     * </p>
     * 
     * @param entityId
     *        The identifier of the user or resource associated with the mailbox.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier of the user or resource associated with the mailbox.
     * </p>
     * 
     * @return The identifier of the user or resource associated with the mailbox.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The identifier of the user or resource associated with the mailbox.
     * </p>
     * 
     * @param entityId
     *        The identifier of the user or resource associated with the mailbox.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMailboxExportJobRequest withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The mailbox export job description.
     * </p>
     * 
     * @param description
     *        The mailbox export job description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The mailbox export job description.
     * </p>
     * 
     * @return The mailbox export job description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The mailbox export job description.
     * </p>
     * 
     * @param description
     *        The mailbox export job description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMailboxExportJobRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the S3 bucket.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the S3
     *        bucket.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the S3 bucket.
     * </p>
     * 
     * @return The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the S3
     *         bucket.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the S3 bucket.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the S3
     *        bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMailboxExportJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the
     * exported mailbox content.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the
     *        exported mailbox content.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the
     * exported mailbox content.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts
     *         the exported mailbox content.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the
     * exported mailbox content.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the
     *        exported mailbox content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMailboxExportJobRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @return The name of the S3 bucket.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMailboxExportJobRequest withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The S3 bucket prefix.
     * </p>
     * 
     * @param s3Prefix
     *        The S3 bucket prefix.
     */

    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The S3 bucket prefix.
     * </p>
     * 
     * @return The S3 bucket prefix.
     */

    public String getS3Prefix() {
        return this.s3Prefix;
    }

    /**
     * <p>
     * The S3 bucket prefix.
     * </p>
     * 
     * @param s3Prefix
     *        The S3 bucket prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMailboxExportJobRequest withS3Prefix(String s3Prefix) {
        setS3Prefix(s3Prefix);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getS3Prefix() != null)
            sb.append("S3Prefix: ").append(getS3Prefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMailboxExportJobRequest == false)
            return false;
        StartMailboxExportJobRequest other = (StartMailboxExportJobRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        return hashCode;
    }

    @Override
    public StartMailboxExportJobRequest clone() {
        return (StartMailboxExportJobRequest) super.clone();
    }

}
