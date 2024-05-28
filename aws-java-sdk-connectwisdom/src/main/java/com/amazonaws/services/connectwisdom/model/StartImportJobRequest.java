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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/StartImportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartImportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The configuration information of the external source that the resource data are imported from.
     * </p>
     */
    private ExternalSourceConfiguration externalSourceConfiguration;
    /**
     * <p>
     * The type of the import job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For importing quick response resource, set the value to <code>QUICK_RESPONSES</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String importJobType;
    /**
     * <p>
     * The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're storing
     * Wisdom Content resource to it. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For importing Wisdom quick responses, this should be a <code>QUICK_RESPONSES</code> type knowledge base.
     * </p>
     * </li>
     * </ul>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The metadata fields of the imported Wisdom resources.
     * </p>
     */
    private java.util.Map<String, String> metadata;
    /**
     * <p>
     * A pointer to the uploaded asset. This value is returned by <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_StartContentUpload.html">StartContentUpload</a>.
     * </p>
     */
    private String uploadId;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param clientToken
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param clientToken
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportJobRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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

    public StartImportJobRequest withExternalSourceConfiguration(ExternalSourceConfiguration externalSourceConfiguration) {
        setExternalSourceConfiguration(externalSourceConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of the import job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For importing quick response resource, set the value to <code>QUICK_RESPONSES</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param importJobType
     *        The type of the import job.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For importing quick response resource, set the value to <code>QUICK_RESPONSES</code>.
     *        </p>
     *        </li>
     * @see ImportJobType
     */

    public void setImportJobType(String importJobType) {
        this.importJobType = importJobType;
    }

    /**
     * <p>
     * The type of the import job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For importing quick response resource, set the value to <code>QUICK_RESPONSES</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the import job.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For importing quick response resource, set the value to <code>QUICK_RESPONSES</code>.
     *         </p>
     *         </li>
     * @see ImportJobType
     */

    public String getImportJobType() {
        return this.importJobType;
    }

    /**
     * <p>
     * The type of the import job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For importing quick response resource, set the value to <code>QUICK_RESPONSES</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param importJobType
     *        The type of the import job.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For importing quick response resource, set the value to <code>QUICK_RESPONSES</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportJobType
     */

    public StartImportJobRequest withImportJobType(String importJobType) {
        setImportJobType(importJobType);
        return this;
    }

    /**
     * <p>
     * The type of the import job.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For importing quick response resource, set the value to <code>QUICK_RESPONSES</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param importJobType
     *        The type of the import job.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For importing quick response resource, set the value to <code>QUICK_RESPONSES</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportJobType
     */

    public StartImportJobRequest withImportJobType(ImportJobType importJobType) {
        this.importJobType = importJobType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're storing
     * Wisdom Content resource to it. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For importing Wisdom quick responses, this should be a <code>QUICK_RESPONSES</code> type knowledge base.
     * </p>
     * </li>
     * </ul>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're
     *        storing Wisdom Content resource to it. Can be either the ID or the ARN. URLs cannot contain the ARN.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For importing Wisdom quick responses, this should be a <code>QUICK_RESPONSES</code> type knowledge base.
     *        </p>
     *        </li>
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're storing
     * Wisdom Content resource to it. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For importing Wisdom quick responses, this should be a <code>QUICK_RESPONSES</code> type knowledge base.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're
     *         storing Wisdom Content resource to it. Can be either the ID or the ARN. URLs cannot contain the ARN.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For importing Wisdom quick responses, this should be a <code>QUICK_RESPONSES</code> type knowledge base.
     *         </p>
     *         </li>
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're storing
     * Wisdom Content resource to it. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For importing Wisdom quick responses, this should be a <code>QUICK_RESPONSES</code> type knowledge base.
     * </p>
     * </li>
     * </ul>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. This should not be a QUICK_RESPONSES type knowledge base if you're
     *        storing Wisdom Content resource to it. Can be either the ID or the ARN. URLs cannot contain the ARN.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For importing Wisdom quick responses, this should be a <code>QUICK_RESPONSES</code> type knowledge base.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartImportJobRequest withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
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

    public StartImportJobRequest withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see StartImportJobRequest#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartImportJobRequest addMetadataEntry(String key, String value) {
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

    public StartImportJobRequest clearMetadataEntries() {
        this.metadata = null;
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

    public StartImportJobRequest withUploadId(String uploadId) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getExternalSourceConfiguration() != null)
            sb.append("ExternalSourceConfiguration: ").append(getExternalSourceConfiguration()).append(",");
        if (getImportJobType() != null)
            sb.append("ImportJobType: ").append(getImportJobType()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
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

        if (obj instanceof StartImportJobRequest == false)
            return false;
        StartImportJobRequest other = (StartImportJobRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getExternalSourceConfiguration() == null ^ this.getExternalSourceConfiguration() == null)
            return false;
        if (other.getExternalSourceConfiguration() != null && other.getExternalSourceConfiguration().equals(this.getExternalSourceConfiguration()) == false)
            return false;
        if (other.getImportJobType() == null ^ this.getImportJobType() == null)
            return false;
        if (other.getImportJobType() != null && other.getImportJobType().equals(this.getImportJobType()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getExternalSourceConfiguration() == null) ? 0 : getExternalSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getImportJobType() == null) ? 0 : getImportJobType().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        return hashCode;
    }

    @Override
    public StartImportJobRequest clone() {
        return (StartImportJobRequest) super.clone();
    }

}
