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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A zero-ETL integration with Amazon Redshift.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateIntegration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIntegrationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database used as the source for replication.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The ARN of the Redshift data warehouse used as the target for replication.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The name of the integration.
     * </p>
     */
    private String integrationName;
    /**
     * <p>
     * The ARN of the integration.
     * </p>
     */
    private String integrationArn;
    /**
     * <p>
     * The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier for the key used to to
     * encrypt the integration.
     * </p>
     */
    private String kMSKeyId;
    /**
     * <p>
     * The encryption context for the integration. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption context</a>
     * in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> additionalEncryptionContext;
    /**
     * <p>
     * The current status of the integration.
     * </p>
     */
    private String status;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The time when the integration was created, in Universal Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * Any errors associated with the integration.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<IntegrationError> errors;
    /**
     * <p>
     * Data filters for the integration. These filters determine which tables from the source database are sent to the
     * target Amazon Redshift data warehouse.
     * </p>
     */
    private String dataFilter;
    /**
     * <p>
     * A description of the integration.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database used as the source for replication.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the database used as the source for replication.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database used as the source for replication.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the database used as the source for replication.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database used as the source for replication.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the database used as the source for replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResult withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the Redshift data warehouse used as the target for replication.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the Redshift data warehouse used as the target for replication.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The ARN of the Redshift data warehouse used as the target for replication.
     * </p>
     * 
     * @return The ARN of the Redshift data warehouse used as the target for replication.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The ARN of the Redshift data warehouse used as the target for replication.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the Redshift data warehouse used as the target for replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResult withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The name of the integration.
     * </p>
     * 
     * @param integrationName
     *        The name of the integration.
     */

    public void setIntegrationName(String integrationName) {
        this.integrationName = integrationName;
    }

    /**
     * <p>
     * The name of the integration.
     * </p>
     * 
     * @return The name of the integration.
     */

    public String getIntegrationName() {
        return this.integrationName;
    }

    /**
     * <p>
     * The name of the integration.
     * </p>
     * 
     * @param integrationName
     *        The name of the integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResult withIntegrationName(String integrationName) {
        setIntegrationName(integrationName);
        return this;
    }

    /**
     * <p>
     * The ARN of the integration.
     * </p>
     * 
     * @param integrationArn
     *        The ARN of the integration.
     */

    public void setIntegrationArn(String integrationArn) {
        this.integrationArn = integrationArn;
    }

    /**
     * <p>
     * The ARN of the integration.
     * </p>
     * 
     * @return The ARN of the integration.
     */

    public String getIntegrationArn() {
        return this.integrationArn;
    }

    /**
     * <p>
     * The ARN of the integration.
     * </p>
     * 
     * @param integrationArn
     *        The ARN of the integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResult withIntegrationArn(String integrationArn) {
        setIntegrationArn(integrationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier for the key used to to
     * encrypt the integration.
     * </p>
     * 
     * @param kMSKeyId
     *        The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier for the key used to
     *        to encrypt the integration.
     */

    public void setKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier for the key used to to
     * encrypt the integration.
     * </p>
     * 
     * @return The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier for the key used
     *         to to encrypt the integration.
     */

    public String getKMSKeyId() {
        return this.kMSKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier for the key used to to
     * encrypt the integration.
     * </p>
     * 
     * @param kMSKeyId
     *        The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier for the key used to
     *        to encrypt the integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResult withKMSKeyId(String kMSKeyId) {
        setKMSKeyId(kMSKeyId);
        return this;
    }

    /**
     * <p>
     * The encryption context for the integration. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption context</a>
     * in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return The encryption context for the integration. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption
     *         context</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     */

    public java.util.Map<String, String> getAdditionalEncryptionContext() {
        if (additionalEncryptionContext == null) {
            additionalEncryptionContext = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return additionalEncryptionContext;
    }

    /**
     * <p>
     * The encryption context for the integration. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption context</a>
     * in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param additionalEncryptionContext
     *        The encryption context for the integration. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption
     *        context</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     */

    public void setAdditionalEncryptionContext(java.util.Map<String, String> additionalEncryptionContext) {
        this.additionalEncryptionContext = additionalEncryptionContext == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(
                additionalEncryptionContext);
    }

    /**
     * <p>
     * The encryption context for the integration. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption context</a>
     * in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param additionalEncryptionContext
     *        The encryption context for the integration. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption
     *        context</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResult withAdditionalEncryptionContext(java.util.Map<String, String> additionalEncryptionContext) {
        setAdditionalEncryptionContext(additionalEncryptionContext);
        return this;
    }

    /**
     * Add a single AdditionalEncryptionContext entry
     *
     * @see CreateIntegrationResult#withAdditionalEncryptionContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResult addAdditionalEncryptionContextEntry(String key, String value) {
        if (null == this.additionalEncryptionContext) {
            this.additionalEncryptionContext = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.additionalEncryptionContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalEncryptionContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalEncryptionContext.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResult clearAdditionalEncryptionContextEntries() {
        this.additionalEncryptionContext = null;
        return this;
    }

    /**
     * <p>
     * The current status of the integration.
     * </p>
     * 
     * @param status
     *        The current status of the integration.
     * @see IntegrationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the integration.
     * </p>
     * 
     * @return The current status of the integration.
     * @see IntegrationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the integration.
     * </p>
     * 
     * @param status
     *        The current status of the integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationStatus
     */

    public CreateIntegrationResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the integration.
     * </p>
     * 
     * @param status
     *        The current status of the integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntegrationStatus
     */

    public CreateIntegrationResult withStatus(IntegrationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The time when the integration was created, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param createTime
     *        The time when the integration was created, in Universal Coordinated Time (UTC).
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time when the integration was created, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return The time when the integration was created, in Universal Coordinated Time (UTC).
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time when the integration was created, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param createTime
     *        The time when the integration was created, in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * Any errors associated with the integration.
     * </p>
     * 
     * @return Any errors associated with the integration.
     */

    public java.util.List<IntegrationError> getErrors() {
        if (errors == null) {
            errors = new com.amazonaws.internal.SdkInternalList<IntegrationError>();
        }
        return errors;
    }

    /**
     * <p>
     * Any errors associated with the integration.
     * </p>
     * 
     * @param errors
     *        Any errors associated with the integration.
     */

    public void setErrors(java.util.Collection<IntegrationError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new com.amazonaws.internal.SdkInternalList<IntegrationError>(errors);
    }

    /**
     * <p>
     * Any errors associated with the integration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Any errors associated with the integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResult withErrors(IntegrationError... errors) {
        if (this.errors == null) {
            setErrors(new com.amazonaws.internal.SdkInternalList<IntegrationError>(errors.length));
        }
        for (IntegrationError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any errors associated with the integration.
     * </p>
     * 
     * @param errors
     *        Any errors associated with the integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResult withErrors(java.util.Collection<IntegrationError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * Data filters for the integration. These filters determine which tables from the source database are sent to the
     * target Amazon Redshift data warehouse.
     * </p>
     * 
     * @param dataFilter
     *        Data filters for the integration. These filters determine which tables from the source database are sent
     *        to the target Amazon Redshift data warehouse.
     */

    public void setDataFilter(String dataFilter) {
        this.dataFilter = dataFilter;
    }

    /**
     * <p>
     * Data filters for the integration. These filters determine which tables from the source database are sent to the
     * target Amazon Redshift data warehouse.
     * </p>
     * 
     * @return Data filters for the integration. These filters determine which tables from the source database are sent
     *         to the target Amazon Redshift data warehouse.
     */

    public String getDataFilter() {
        return this.dataFilter;
    }

    /**
     * <p>
     * Data filters for the integration. These filters determine which tables from the source database are sent to the
     * target Amazon Redshift data warehouse.
     * </p>
     * 
     * @param dataFilter
     *        Data filters for the integration. These filters determine which tables from the source database are sent
     *        to the target Amazon Redshift data warehouse.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResult withDataFilter(String dataFilter) {
        setDataFilter(dataFilter);
        return this;
    }

    /**
     * <p>
     * A description of the integration.
     * </p>
     * 
     * @param description
     *        A description of the integration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the integration.
     * </p>
     * 
     * @return A description of the integration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the integration.
     * </p>
     * 
     * @param description
     *        A description of the integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationResult withDescription(String description) {
        setDescription(description);
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
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn()).append(",");
        if (getIntegrationName() != null)
            sb.append("IntegrationName: ").append(getIntegrationName()).append(",");
        if (getIntegrationArn() != null)
            sb.append("IntegrationArn: ").append(getIntegrationArn()).append(",");
        if (getKMSKeyId() != null)
            sb.append("KMSKeyId: ").append(getKMSKeyId()).append(",");
        if (getAdditionalEncryptionContext() != null)
            sb.append("AdditionalEncryptionContext: ").append(getAdditionalEncryptionContext()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getDataFilter() != null)
            sb.append("DataFilter: ").append(getDataFilter()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIntegrationResult == false)
            return false;
        CreateIntegrationResult other = (CreateIntegrationResult) obj;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getIntegrationName() == null ^ this.getIntegrationName() == null)
            return false;
        if (other.getIntegrationName() != null && other.getIntegrationName().equals(this.getIntegrationName()) == false)
            return false;
        if (other.getIntegrationArn() == null ^ this.getIntegrationArn() == null)
            return false;
        if (other.getIntegrationArn() != null && other.getIntegrationArn().equals(this.getIntegrationArn()) == false)
            return false;
        if (other.getKMSKeyId() == null ^ this.getKMSKeyId() == null)
            return false;
        if (other.getKMSKeyId() != null && other.getKMSKeyId().equals(this.getKMSKeyId()) == false)
            return false;
        if (other.getAdditionalEncryptionContext() == null ^ this.getAdditionalEncryptionContext() == null)
            return false;
        if (other.getAdditionalEncryptionContext() != null && other.getAdditionalEncryptionContext().equals(this.getAdditionalEncryptionContext()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getDataFilter() == null ^ this.getDataFilter() == null)
            return false;
        if (other.getDataFilter() != null && other.getDataFilter().equals(this.getDataFilter()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode + ((getIntegrationName() == null) ? 0 : getIntegrationName().hashCode());
        hashCode = prime * hashCode + ((getIntegrationArn() == null) ? 0 : getIntegrationArn().hashCode());
        hashCode = prime * hashCode + ((getKMSKeyId() == null) ? 0 : getKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getAdditionalEncryptionContext() == null) ? 0 : getAdditionalEncryptionContext().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getDataFilter() == null) ? 0 : getDataFilter().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateIntegrationResult clone() {
        try {
            return (CreateIntegrationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
