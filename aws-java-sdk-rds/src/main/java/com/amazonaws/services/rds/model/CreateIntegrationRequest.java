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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateIntegration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIntegrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database to use as the source for replication.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The ARN of the Redshift data warehouse to use as the target for replication.
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
     * The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier for the key to use to
     * encrypt the integration. If you don't specify an encryption key, RDS uses a default Amazon Web Services owned
     * key.
     * </p>
     */
    private String kMSKeyId;
    /**
     * <p>
     * An optional set of non-secret key–value pairs that contains additional contextual information about the data. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption context</a>
     * in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You can only include this parameter if you specify the <code>KMSKeyId</code> parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> additionalEncryptionContext;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Data filtering options for the integration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/zero-etl.filtering.html">Data filtering for
     * Aurora zero-ETL integrations with Amazon Redshift</a>.
     * </p>
     * <p>
     * Valid for: Integrations with Aurora MySQL source DB clusters only
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
     * The Amazon Resource Name (ARN) of the database to use as the source for replication.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the database to use as the source for replication.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database to use as the source for replication.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the database to use as the source for replication.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the database to use as the source for replication.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the database to use as the source for replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the Redshift data warehouse to use as the target for replication.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the Redshift data warehouse to use as the target for replication.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The ARN of the Redshift data warehouse to use as the target for replication.
     * </p>
     * 
     * @return The ARN of the Redshift data warehouse to use as the target for replication.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The ARN of the Redshift data warehouse to use as the target for replication.
     * </p>
     * 
     * @param targetArn
     *        The ARN of the Redshift data warehouse to use as the target for replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest withTargetArn(String targetArn) {
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

    public CreateIntegrationRequest withIntegrationName(String integrationName) {
        setIntegrationName(integrationName);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier for the key to use to
     * encrypt the integration. If you don't specify an encryption key, RDS uses a default Amazon Web Services owned
     * key.
     * </p>
     * 
     * @param kMSKeyId
     *        The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier for the key to use
     *        to encrypt the integration. If you don't specify an encryption key, RDS uses a default Amazon Web Services
     *        owned key.
     */

    public void setKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier for the key to use to
     * encrypt the integration. If you don't specify an encryption key, RDS uses a default Amazon Web Services owned
     * key.
     * </p>
     * 
     * @return The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier for the key to use
     *         to encrypt the integration. If you don't specify an encryption key, RDS uses a default Amazon Web
     *         Services owned key.
     */

    public String getKMSKeyId() {
        return this.kMSKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier for the key to use to
     * encrypt the integration. If you don't specify an encryption key, RDS uses a default Amazon Web Services owned
     * key.
     * </p>
     * 
     * @param kMSKeyId
     *        The Amazon Web Services Key Management System (Amazon Web Services KMS) key identifier for the key to use
     *        to encrypt the integration. If you don't specify an encryption key, RDS uses a default Amazon Web Services
     *        owned key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest withKMSKeyId(String kMSKeyId) {
        setKMSKeyId(kMSKeyId);
        return this;
    }

    /**
     * <p>
     * An optional set of non-secret key–value pairs that contains additional contextual information about the data. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption context</a>
     * in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You can only include this parameter if you specify the <code>KMSKeyId</code> parameter.
     * </p>
     * 
     * @return An optional set of non-secret key–value pairs that contains additional contextual information about the
     *         data. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption
     *         context</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.</p>
     *         <p>
     *         You can only include this parameter if you specify the <code>KMSKeyId</code> parameter.
     */

    public java.util.Map<String, String> getAdditionalEncryptionContext() {
        if (additionalEncryptionContext == null) {
            additionalEncryptionContext = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return additionalEncryptionContext;
    }

    /**
     * <p>
     * An optional set of non-secret key–value pairs that contains additional contextual information about the data. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption context</a>
     * in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You can only include this parameter if you specify the <code>KMSKeyId</code> parameter.
     * </p>
     * 
     * @param additionalEncryptionContext
     *        An optional set of non-secret key–value pairs that contains additional contextual information about the
     *        data. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption
     *        context</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.</p>
     *        <p>
     *        You can only include this parameter if you specify the <code>KMSKeyId</code> parameter.
     */

    public void setAdditionalEncryptionContext(java.util.Map<String, String> additionalEncryptionContext) {
        this.additionalEncryptionContext = additionalEncryptionContext == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(
                additionalEncryptionContext);
    }

    /**
     * <p>
     * An optional set of non-secret key–value pairs that contains additional contextual information about the data. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption context</a>
     * in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * <p>
     * You can only include this parameter if you specify the <code>KMSKeyId</code> parameter.
     * </p>
     * 
     * @param additionalEncryptionContext
     *        An optional set of non-secret key–value pairs that contains additional contextual information about the
     *        data. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#encrypt_context">Encryption
     *        context</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.</p>
     *        <p>
     *        You can only include this parameter if you specify the <code>KMSKeyId</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest withAdditionalEncryptionContext(java.util.Map<String, String> additionalEncryptionContext) {
        setAdditionalEncryptionContext(additionalEncryptionContext);
        return this;
    }

    /**
     * Add a single AdditionalEncryptionContext entry
     *
     * @see CreateIntegrationRequest#withAdditionalEncryptionContext
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest addAdditionalEncryptionContextEntry(String key, String value) {
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

    public CreateIntegrationRequest clearAdditionalEncryptionContextEntries() {
        this.additionalEncryptionContext = null;
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

    public CreateIntegrationRequest withTags(Tag... tags) {
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

    public CreateIntegrationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Data filtering options for the integration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/zero-etl.filtering.html">Data filtering for
     * Aurora zero-ETL integrations with Amazon Redshift</a>.
     * </p>
     * <p>
     * Valid for: Integrations with Aurora MySQL source DB clusters only
     * </p>
     * 
     * @param dataFilter
     *        Data filtering options for the integration. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/zero-etl.filtering.html">Data filtering
     *        for Aurora zero-ETL integrations with Amazon Redshift</a>. </p>
     *        <p>
     *        Valid for: Integrations with Aurora MySQL source DB clusters only
     */

    public void setDataFilter(String dataFilter) {
        this.dataFilter = dataFilter;
    }

    /**
     * <p>
     * Data filtering options for the integration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/zero-etl.filtering.html">Data filtering for
     * Aurora zero-ETL integrations with Amazon Redshift</a>.
     * </p>
     * <p>
     * Valid for: Integrations with Aurora MySQL source DB clusters only
     * </p>
     * 
     * @return Data filtering options for the integration. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/zero-etl.filtering.html">Data
     *         filtering for Aurora zero-ETL integrations with Amazon Redshift</a>. </p>
     *         <p>
     *         Valid for: Integrations with Aurora MySQL source DB clusters only
     */

    public String getDataFilter() {
        return this.dataFilter;
    }

    /**
     * <p>
     * Data filtering options for the integration. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/zero-etl.filtering.html">Data filtering for
     * Aurora zero-ETL integrations with Amazon Redshift</a>.
     * </p>
     * <p>
     * Valid for: Integrations with Aurora MySQL source DB clusters only
     * </p>
     * 
     * @param dataFilter
     *        Data filtering options for the integration. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/zero-etl.filtering.html">Data filtering
     *        for Aurora zero-ETL integrations with Amazon Redshift</a>. </p>
     *        <p>
     *        Valid for: Integrations with Aurora MySQL source DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIntegrationRequest withDataFilter(String dataFilter) {
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

    public CreateIntegrationRequest withDescription(String description) {
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
        if (getKMSKeyId() != null)
            sb.append("KMSKeyId: ").append(getKMSKeyId()).append(",");
        if (getAdditionalEncryptionContext() != null)
            sb.append("AdditionalEncryptionContext: ").append(getAdditionalEncryptionContext()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateIntegrationRequest == false)
            return false;
        CreateIntegrationRequest other = (CreateIntegrationRequest) obj;
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
        if (other.getKMSKeyId() == null ^ this.getKMSKeyId() == null)
            return false;
        if (other.getKMSKeyId() != null && other.getKMSKeyId().equals(this.getKMSKeyId()) == false)
            return false;
        if (other.getAdditionalEncryptionContext() == null ^ this.getAdditionalEncryptionContext() == null)
            return false;
        if (other.getAdditionalEncryptionContext() != null && other.getAdditionalEncryptionContext().equals(this.getAdditionalEncryptionContext()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getKMSKeyId() == null) ? 0 : getKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getAdditionalEncryptionContext() == null) ? 0 : getAdditionalEncryptionContext().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDataFilter() == null) ? 0 : getDataFilter().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateIntegrationRequest clone() {
        return (CreateIntegrationRequest) super.clone();
    }

}
