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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApplicationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Amazon Q Business application.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Q Business application.
     * </p>
     */
    private String applicationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS IAM Identity Center instance attached to your Amazon Q Business
     * application.
     * </p>
     */
    private String identityCenterApplicationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM with permissions to access your CloudWatch logs and metrics.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The status of the Amazon Q Business application.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A description for the Amazon Q Business application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the Amazon Web Services KMS key that is used to encrypt your data. Amazon Q Business doesn't
     * support asymmetric keys.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;
    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * If the <code>Status</code> field is set to <code>ERROR</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the synchronization to fail.
     * </p>
     */
    private ErrorDetail error;
    /**
     * <p>
     * Settings for whether end users can upload files directly during chat.
     * </p>
     */
    private AppliedAttachmentsConfiguration attachmentsConfiguration;

    /**
     * <p>
     * The name of the Amazon Q Business application.
     * </p>
     * 
     * @param displayName
     *        The name of the Amazon Q Business application.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the Amazon Q Business application.
     * </p>
     * 
     * @return The name of the Amazon Q Business application.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the Amazon Q Business application.
     * </p>
     * 
     * @param displayName
     *        The name of the Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Q Business application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the Amazon Q Business application.
     */

    public void setApplicationArn(String applicationArn) {
        this.applicationArn = applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Q Business application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Q Business application.
     */

    public String getApplicationArn() {
        return this.applicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Q Business application.
     * </p>
     * 
     * @param applicationArn
     *        The Amazon Resource Name (ARN) of the Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withApplicationArn(String applicationArn) {
        setApplicationArn(applicationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS IAM Identity Center instance attached to your Amazon Q Business
     * application.
     * </p>
     * 
     * @param identityCenterApplicationArn
     *        The Amazon Resource Name (ARN) of the AWS IAM Identity Center instance attached to your Amazon Q Business
     *        application.
     */

    public void setIdentityCenterApplicationArn(String identityCenterApplicationArn) {
        this.identityCenterApplicationArn = identityCenterApplicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS IAM Identity Center instance attached to your Amazon Q Business
     * application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS IAM Identity Center instance attached to your Amazon Q Business
     *         application.
     */

    public String getIdentityCenterApplicationArn() {
        return this.identityCenterApplicationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS IAM Identity Center instance attached to your Amazon Q Business
     * application.
     * </p>
     * 
     * @param identityCenterApplicationArn
     *        The Amazon Resource Name (ARN) of the AWS IAM Identity Center instance attached to your Amazon Q Business
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withIdentityCenterApplicationArn(String identityCenterApplicationArn) {
        setIdentityCenterApplicationArn(identityCenterApplicationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM with permissions to access your CloudWatch logs and metrics.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM with permissions to access your CloudWatch logs and metrics.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM with permissions to access your CloudWatch logs and metrics.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM with permissions to access your CloudWatch logs and metrics.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM with permissions to access your CloudWatch logs and metrics.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM with permissions to access your CloudWatch logs and metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon Q Business application.
     * </p>
     * 
     * @param status
     *        The status of the Amazon Q Business application.
     * @see ApplicationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Amazon Q Business application.
     * </p>
     * 
     * @return The status of the Amazon Q Business application.
     * @see ApplicationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Amazon Q Business application.
     * </p>
     * 
     * @param status
     *        The status of the Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public GetApplicationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the Amazon Q Business application.
     * </p>
     * 
     * @param status
     *        The status of the Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public GetApplicationResult withStatus(ApplicationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A description for the Amazon Q Business application.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Q Business application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the Amazon Q Business application.
     * </p>
     * 
     * @return A description for the Amazon Q Business application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the Amazon Q Business application.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services KMS key that is used to encrypt your data. Amazon Q Business doesn't
     * support asymmetric keys.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The identifier of the Amazon Web Services KMS key that is used to encrypt your data. Amazon Q Business
     *        doesn't support asymmetric keys.
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services KMS key that is used to encrypt your data. Amazon Q Business doesn't
     * support asymmetric keys.
     * </p>
     * 
     * @return The identifier of the Amazon Web Services KMS key that is used to encrypt your data. Amazon Q Business
     *         doesn't support asymmetric keys.
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * The identifier of the Amazon Web Services KMS key that is used to encrypt your data. Amazon Q Business doesn't
     * support asymmetric keys.
     * </p>
     * 
     * @param encryptionConfiguration
     *        The identifier of the Amazon Web Services KMS key that is used to encrypt your data. Amazon Q Business
     *        doesn't support asymmetric keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the Amazon Q Business application was last updated.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @return The Unix timestamp when the Amazon Q Business application was last updated.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the Amazon Q Business application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the Amazon Q Business application was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @return The Unix timestamp when the Amazon Q Business application was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business application was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the Amazon Q Business application was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>ERROR</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the synchronization to fail.
     * </p>
     * 
     * @param error
     *        If the <code>Status</code> field is set to <code>ERROR</code>, the <code>ErrorMessage</code> field
     *        contains a description of the error that caused the synchronization to fail.
     */

    public void setError(ErrorDetail error) {
        this.error = error;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>ERROR</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the synchronization to fail.
     * </p>
     * 
     * @return If the <code>Status</code> field is set to <code>ERROR</code>, the <code>ErrorMessage</code> field
     *         contains a description of the error that caused the synchronization to fail.
     */

    public ErrorDetail getError() {
        return this.error;
    }

    /**
     * <p>
     * If the <code>Status</code> field is set to <code>ERROR</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the synchronization to fail.
     * </p>
     * 
     * @param error
     *        If the <code>Status</code> field is set to <code>ERROR</code>, the <code>ErrorMessage</code> field
     *        contains a description of the error that caused the synchronization to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withError(ErrorDetail error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * Settings for whether end users can upload files directly during chat.
     * </p>
     * 
     * @param attachmentsConfiguration
     *        Settings for whether end users can upload files directly during chat.
     */

    public void setAttachmentsConfiguration(AppliedAttachmentsConfiguration attachmentsConfiguration) {
        this.attachmentsConfiguration = attachmentsConfiguration;
    }

    /**
     * <p>
     * Settings for whether end users can upload files directly during chat.
     * </p>
     * 
     * @return Settings for whether end users can upload files directly during chat.
     */

    public AppliedAttachmentsConfiguration getAttachmentsConfiguration() {
        return this.attachmentsConfiguration;
    }

    /**
     * <p>
     * Settings for whether end users can upload files directly during chat.
     * </p>
     * 
     * @param attachmentsConfiguration
     *        Settings for whether end users can upload files directly during chat.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationResult withAttachmentsConfiguration(AppliedAttachmentsConfiguration attachmentsConfiguration) {
        setAttachmentsConfiguration(attachmentsConfiguration);
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getApplicationArn() != null)
            sb.append("ApplicationArn: ").append(getApplicationArn()).append(",");
        if (getIdentityCenterApplicationArn() != null)
            sb.append("IdentityCenterApplicationArn: ").append(getIdentityCenterApplicationArn()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getAttachmentsConfiguration() != null)
            sb.append("AttachmentsConfiguration: ").append(getAttachmentsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApplicationResult == false)
            return false;
        GetApplicationResult other = (GetApplicationResult) obj;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getApplicationArn() == null ^ this.getApplicationArn() == null)
            return false;
        if (other.getApplicationArn() != null && other.getApplicationArn().equals(this.getApplicationArn()) == false)
            return false;
        if (other.getIdentityCenterApplicationArn() == null ^ this.getIdentityCenterApplicationArn() == null)
            return false;
        if (other.getIdentityCenterApplicationArn() != null && other.getIdentityCenterApplicationArn().equals(this.getIdentityCenterApplicationArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getAttachmentsConfiguration() == null ^ this.getAttachmentsConfiguration() == null)
            return false;
        if (other.getAttachmentsConfiguration() != null && other.getAttachmentsConfiguration().equals(this.getAttachmentsConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getApplicationArn() == null) ? 0 : getApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getIdentityCenterApplicationArn() == null) ? 0 : getIdentityCenterApplicationArn().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getAttachmentsConfiguration() == null) ? 0 : getAttachmentsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetApplicationResult clone() {
        try {
            return (GetApplicationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
