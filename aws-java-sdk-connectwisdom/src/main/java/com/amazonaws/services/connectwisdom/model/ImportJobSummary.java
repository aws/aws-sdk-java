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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about the import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ImportJobSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp when the import job was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The configuration information of the external source that the resource data are imported from.
     * </p>
     */
    private ExternalSourceConfiguration externalSourceConfiguration;
    /**
     * <p>
     * The identifier of the import job.
     * </p>
     */
    private String importJobId;
    /**
     * <p>
     * The type of import job.
     * </p>
     */
    private String importJobType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     */
    private String knowledgeBaseArn;
    /**
     * <p>
     * The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're storing
     * Wisdom Content resource to it.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The timestamp when the import job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The metadata fields of the imported Wisdom resources.
     * </p>
     */
    private java.util.Map<String, String> metadata;
    /**
     * <p>
     * The status of the import job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A pointer to the uploaded asset. This value is returned by <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_StartContentUpload.html">StartContentUpload</a>.
     * </p>
     */
    private String uploadId;

    /**
     * <p>
     * The timestamp when the import job was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the import job was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp when the import job was created.
     * </p>
     * 
     * @return The timestamp when the import job was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp when the import job was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp when the import job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobSummary withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The configuration information of the external source that the resource data are imported from.
     * </p>
     * 
     * @param externalSourceConfiguration
     *        The configuration information of the external source that the resource data are imported from.
     */

    public void setExternalSourceConfiguration(ExternalSourceConfiguration externalSourceConfiguration) {
        this.externalSourceConfiguration = externalSourceConfiguration;
    }

    /**
     * <p>
     * The configuration information of the external source that the resource data are imported from.
     * </p>
     * 
     * @return The configuration information of the external source that the resource data are imported from.
     */

    public ExternalSourceConfiguration getExternalSourceConfiguration() {
        return this.externalSourceConfiguration;
    }

    /**
     * <p>
     * The configuration information of the external source that the resource data are imported from.
     * </p>
     * 
     * @param externalSourceConfiguration
     *        The configuration information of the external source that the resource data are imported from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobSummary withExternalSourceConfiguration(ExternalSourceConfiguration externalSourceConfiguration) {
        setExternalSourceConfiguration(externalSourceConfiguration);
        return this;
    }

    /**
     * <p>
     * The identifier of the import job.
     * </p>
     * 
     * @param importJobId
     *        The identifier of the import job.
     */

    public void setImportJobId(String importJobId) {
        this.importJobId = importJobId;
    }

    /**
     * <p>
     * The identifier of the import job.
     * </p>
     * 
     * @return The identifier of the import job.
     */

    public String getImportJobId() {
        return this.importJobId;
    }

    /**
     * <p>
     * The identifier of the import job.
     * </p>
     * 
     * @param importJobId
     *        The identifier of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobSummary withImportJobId(String importJobId) {
        setImportJobId(importJobId);
        return this;
    }

    /**
     * <p>
     * The type of import job.
     * </p>
     * 
     * @param importJobType
     *        The type of import job.
     * @see ImportJobType
     */

    public void setImportJobType(String importJobType) {
        this.importJobType = importJobType;
    }

    /**
     * <p>
     * The type of import job.
     * </p>
     * 
     * @return The type of import job.
     * @see ImportJobType
     */

    public String getImportJobType() {
        return this.importJobType;
    }

    /**
     * <p>
     * The type of import job.
     * </p>
     * 
     * @param importJobType
     *        The type of import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportJobType
     */

    public ImportJobSummary withImportJobType(String importJobType) {
        setImportJobType(importJobType);
        return this;
    }

    /**
     * <p>
     * The type of import job.
     * </p>
     * 
     * @param importJobType
     *        The type of import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportJobType
     */

    public ImportJobSummary withImportJobType(ImportJobType importJobType) {
        this.importJobType = importJobType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseArn
     *        The Amazon Resource Name (ARN) of the knowledge base.
     */

    public void setKnowledgeBaseArn(String knowledgeBaseArn) {
        this.knowledgeBaseArn = knowledgeBaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the knowledge base.
     */

    public String getKnowledgeBaseArn() {
        return this.knowledgeBaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseArn
     *        The Amazon Resource Name (ARN) of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobSummary withKnowledgeBaseArn(String knowledgeBaseArn) {
        setKnowledgeBaseArn(knowledgeBaseArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're storing
     * Wisdom Content resource to it.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're
     *        storing Wisdom Content resource to it.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're storing
     * Wisdom Content resource to it.
     * </p>
     * 
     * @return The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're
     *         storing Wisdom Content resource to it.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're storing
     * Wisdom Content resource to it.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're
     *        storing Wisdom Content resource to it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobSummary withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * The timestamp when the import job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when the import job was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the import job was last modified.
     * </p>
     * 
     * @return The timestamp when the import job was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when the import job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when the import job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The metadata fields of the imported Wisdom resources.
     * </p>
     * 
     * @return The metadata fields of the imported Wisdom resources.
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The metadata fields of the imported Wisdom resources.
     * </p>
     * 
     * @param metadata
     *        The metadata fields of the imported Wisdom resources.
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata fields of the imported Wisdom resources.
     * </p>
     * 
     * @param metadata
     *        The metadata fields of the imported Wisdom resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobSummary withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see ImportJobSummary#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobSummary addMetadataEntry(String key, String value) {
        if (null == this.metadata) {
            this.metadata = new java.util.HashMap<String, String>();
        }
        if (this.metadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobSummary clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * The status of the import job.
     * </p>
     * 
     * @param status
     *        The status of the import job.
     * @see ImportJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the import job.
     * </p>
     * 
     * @return The status of the import job.
     * @see ImportJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the import job.
     * </p>
     * 
     * @param status
     *        The status of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportJobStatus
     */

    public ImportJobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the import job.
     * </p>
     * 
     * @param status
     *        The status of the import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportJobStatus
     */

    public ImportJobSummary withStatus(ImportJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A pointer to the uploaded asset. This value is returned by <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_StartContentUpload.html">StartContentUpload</a>.
     * </p>
     * 
     * @param uploadId
     *        A pointer to the uploaded asset. This value is returned by <a
     *        href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_StartContentUpload.html"
     *        >StartContentUpload</a>.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * A pointer to the uploaded asset. This value is returned by <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_StartContentUpload.html">StartContentUpload</a>.
     * </p>
     * 
     * @return A pointer to the uploaded asset. This value is returned by <a
     *         href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_StartContentUpload.html"
     *         >StartContentUpload</a>.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * <p>
     * A pointer to the uploaded asset. This value is returned by <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_StartContentUpload.html">StartContentUpload</a>.
     * </p>
     * 
     * @param uploadId
     *        A pointer to the uploaded asset. This value is returned by <a
     *        href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_StartContentUpload.html"
     *        >StartContentUpload</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportJobSummary withUploadId(String uploadId) {
        setUploadId(uploadId);
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
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getExternalSourceConfiguration() != null)
            sb.append("ExternalSourceConfiguration: ").append(getExternalSourceConfiguration()).append(",");
        if (getImportJobId() != null)
            sb.append("ImportJobId: ").append(getImportJobId()).append(",");
        if (getImportJobType() != null)
            sb.append("ImportJobType: ").append(getImportJobType()).append(",");
        if (getKnowledgeBaseArn() != null)
            sb.append("KnowledgeBaseArn: ").append(getKnowledgeBaseArn()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUploadId() != null)
            sb.append("UploadId: ").append(getUploadId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportJobSummary == false)
            return false;
        ImportJobSummary other = (ImportJobSummary) obj;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getExternalSourceConfiguration() == null ^ this.getExternalSourceConfiguration() == null)
            return false;
        if (other.getExternalSourceConfiguration() != null && other.getExternalSourceConfiguration().equals(this.getExternalSourceConfiguration()) == false)
            return false;
        if (other.getImportJobId() == null ^ this.getImportJobId() == null)
            return false;
        if (other.getImportJobId() != null && other.getImportJobId().equals(this.getImportJobId()) == false)
            return false;
        if (other.getImportJobType() == null ^ this.getImportJobType() == null)
            return false;
        if (other.getImportJobType() != null && other.getImportJobType().equals(this.getImportJobType()) == false)
            return false;
        if (other.getKnowledgeBaseArn() == null ^ this.getKnowledgeBaseArn() == null)
            return false;
        if (other.getKnowledgeBaseArn() != null && other.getKnowledgeBaseArn().equals(this.getKnowledgeBaseArn()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getExternalSourceConfiguration() == null) ? 0 : getExternalSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getImportJobId() == null) ? 0 : getImportJobId().hashCode());
        hashCode = prime * hashCode + ((getImportJobType() == null) ? 0 : getImportJobType().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseArn() == null) ? 0 : getKnowledgeBaseArn().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        return hashCode;
    }

    @Override
    public ImportJobSummary clone() {
        try {
            return (ImportJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.ImportJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
