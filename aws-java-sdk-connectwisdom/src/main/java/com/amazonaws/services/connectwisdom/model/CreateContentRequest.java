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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/CreateContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * A key/value map to store attributes without affecting tagging or recommendations. For example, when synchronizing
     * data between an external system and Wisdom, you can store an external version identifier as metadata to utilize
     * for determining drift.
     * </p>
     */
    private java.util.Map<String, String> metadata;
    /**
     * <p>
     * The name of the content. Each piece of content in a knowledge base must have a unique name. You can retrieve a
     * piece of content using only its knowledge base and its name with the <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_SearchContent.html">SearchContent</a> API.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The URI you want to use for the article. If the knowledge base has a templateUri, setting this argument overrides
     * it for this piece of content.
     * </p>
     */
    private String overrideLinkOutUri;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The title of the content. If not set, the title is equal to the name.
     * </p>
     */
    private String title;
    /**
     * <p>
     * A pointer to the uploaded asset. This value is returned by <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_StartContentUpload.html">StartContentUpload</a>.
     * </p>
     */
    private String uploadId;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContentRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @return The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContentRequest withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * A key/value map to store attributes without affecting tagging or recommendations. For example, when synchronizing
     * data between an external system and Wisdom, you can store an external version identifier as metadata to utilize
     * for determining drift.
     * </p>
     * 
     * @return A key/value map to store attributes without affecting tagging or recommendations. For example, when
     *         synchronizing data between an external system and Wisdom, you can store an external version identifier as
     *         metadata to utilize for determining drift.
     */

    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * A key/value map to store attributes without affecting tagging or recommendations. For example, when synchronizing
     * data between an external system and Wisdom, you can store an external version identifier as metadata to utilize
     * for determining drift.
     * </p>
     * 
     * @param metadata
     *        A key/value map to store attributes without affecting tagging or recommendations. For example, when
     *        synchronizing data between an external system and Wisdom, you can store an external version identifier as
     *        metadata to utilize for determining drift.
     */

    public void setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * A key/value map to store attributes without affecting tagging or recommendations. For example, when synchronizing
     * data between an external system and Wisdom, you can store an external version identifier as metadata to utilize
     * for determining drift.
     * </p>
     * 
     * @param metadata
     *        A key/value map to store attributes without affecting tagging or recommendations. For example, when
     *        synchronizing data between an external system and Wisdom, you can store an external version identifier as
     *        metadata to utilize for determining drift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContentRequest withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see CreateContentRequest#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateContentRequest addMetadataEntry(String key, String value) {
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

    public CreateContentRequest clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * The name of the content. Each piece of content in a knowledge base must have a unique name. You can retrieve a
     * piece of content using only its knowledge base and its name with the <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_SearchContent.html">SearchContent</a> API.
     * </p>
     * 
     * @param name
     *        The name of the content. Each piece of content in a knowledge base must have a unique name. You can
     *        retrieve a piece of content using only its knowledge base and its name with the <a
     *        href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_SearchContent.html">SearchContent</a>
     *        API.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the content. Each piece of content in a knowledge base must have a unique name. You can retrieve a
     * piece of content using only its knowledge base and its name with the <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_SearchContent.html">SearchContent</a> API.
     * </p>
     * 
     * @return The name of the content. Each piece of content in a knowledge base must have a unique name. You can
     *         retrieve a piece of content using only its knowledge base and its name with the <a
     *         href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_SearchContent.html">SearchContent</a>
     *         API.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the content. Each piece of content in a knowledge base must have a unique name. You can retrieve a
     * piece of content using only its knowledge base and its name with the <a
     * href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_SearchContent.html">SearchContent</a> API.
     * </p>
     * 
     * @param name
     *        The name of the content. Each piece of content in a knowledge base must have a unique name. You can
     *        retrieve a piece of content using only its knowledge base and its name with the <a
     *        href="https://docs.aws.amazon.com/wisdom/latest/APIReference/API_SearchContent.html">SearchContent</a>
     *        API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The URI you want to use for the article. If the knowledge base has a templateUri, setting this argument overrides
     * it for this piece of content.
     * </p>
     * 
     * @param overrideLinkOutUri
     *        The URI you want to use for the article. If the knowledge base has a templateUri, setting this argument
     *        overrides it for this piece of content.
     */

    public void setOverrideLinkOutUri(String overrideLinkOutUri) {
        this.overrideLinkOutUri = overrideLinkOutUri;
    }

    /**
     * <p>
     * The URI you want to use for the article. If the knowledge base has a templateUri, setting this argument overrides
     * it for this piece of content.
     * </p>
     * 
     * @return The URI you want to use for the article. If the knowledge base has a templateUri, setting this argument
     *         overrides it for this piece of content.
     */

    public String getOverrideLinkOutUri() {
        return this.overrideLinkOutUri;
    }

    /**
     * <p>
     * The URI you want to use for the article. If the knowledge base has a templateUri, setting this argument overrides
     * it for this piece of content.
     * </p>
     * 
     * @param overrideLinkOutUri
     *        The URI you want to use for the article. If the knowledge base has a templateUri, setting this argument
     *        overrides it for this piece of content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContentRequest withOverrideLinkOutUri(String overrideLinkOutUri) {
        setOverrideLinkOutUri(overrideLinkOutUri);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateContentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateContentRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContentRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The title of the content. If not set, the title is equal to the name.
     * </p>
     * 
     * @param title
     *        The title of the content. If not set, the title is equal to the name.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the content. If not set, the title is equal to the name.
     * </p>
     * 
     * @return The title of the content. If not set, the title is equal to the name.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the content. If not set, the title is equal to the name.
     * </p>
     * 
     * @param title
     *        The title of the content. If not set, the title is equal to the name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContentRequest withTitle(String title) {
        setTitle(title);
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

    public CreateContentRequest withUploadId(String uploadId) {
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
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOverrideLinkOutUri() != null)
            sb.append("OverrideLinkOutUri: ").append(getOverrideLinkOutUri()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
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

        if (obj instanceof CreateContentRequest == false)
            return false;
        CreateContentRequest other = (CreateContentRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOverrideLinkOutUri() == null ^ this.getOverrideLinkOutUri() == null)
            return false;
        if (other.getOverrideLinkOutUri() != null && other.getOverrideLinkOutUri().equals(this.getOverrideLinkOutUri()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
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
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOverrideLinkOutUri() == null) ? 0 : getOverrideLinkOutUri().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        return hashCode;
    }

    @Override
    public CreateContentRequest clone() {
        return (CreateContentRequest) super.clone();
    }

}
