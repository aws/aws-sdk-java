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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about the content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/ContentSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the content.
     * </p>
     */
    private String contentArn;
    /**
     * <p>
     * The identifier of the content.
     * </p>
     */
    private String contentId;
    /**
     * <p>
     * The media type of the content.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     */
    private String knowledgeBaseArn;
    /**
     * <p>
     * The identifier of the knowledge base.
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
     * The name of the content.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the revision of the content.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * The status of the content.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The title of the content.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the content.
     * </p>
     * 
     * @param contentArn
     *        The Amazon Resource Name (ARN) of the content.
     */

    public void setContentArn(String contentArn) {
        this.contentArn = contentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the content.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the content.
     */

    public String getContentArn() {
        return this.contentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the content.
     * </p>
     * 
     * @param contentArn
     *        The Amazon Resource Name (ARN) of the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentSummary withContentArn(String contentArn) {
        setContentArn(contentArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the content.
     * </p>
     * 
     * @param contentId
     *        The identifier of the content.
     */

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    /**
     * <p>
     * The identifier of the content.
     * </p>
     * 
     * @return The identifier of the content.
     */

    public String getContentId() {
        return this.contentId;
    }

    /**
     * <p>
     * The identifier of the content.
     * </p>
     * 
     * @param contentId
     *        The identifier of the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentSummary withContentId(String contentId) {
        setContentId(contentId);
        return this;
    }

    /**
     * <p>
     * The media type of the content.
     * </p>
     * 
     * @param contentType
     *        The media type of the content.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The media type of the content.
     * </p>
     * 
     * @return The media type of the content.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The media type of the content.
     * </p>
     * 
     * @param contentType
     *        The media type of the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentSummary withContentType(String contentType) {
        setContentType(contentType);
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

    public ContentSummary withKnowledgeBaseArn(String knowledgeBaseArn) {
        setKnowledgeBaseArn(knowledgeBaseArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base.
     * </p>
     * 
     * @return The identifier of the knowledge base.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentSummary withKnowledgeBaseId(String knowledgeBaseId) {
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

    public ContentSummary withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see ContentSummary#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ContentSummary addMetadataEntry(String key, String value) {
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

    public ContentSummary clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * The name of the content.
     * </p>
     * 
     * @param name
     *        The name of the content.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the content.
     * </p>
     * 
     * @return The name of the content.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the content.
     * </p>
     * 
     * @param name
     *        The name of the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the revision of the content.
     * </p>
     * 
     * @param revisionId
     *        The identifier of the revision of the content.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The identifier of the revision of the content.
     * </p>
     * 
     * @return The identifier of the revision of the content.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The identifier of the revision of the content.
     * </p>
     * 
     * @param revisionId
     *        The identifier of the revision of the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentSummary withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * The status of the content.
     * </p>
     * 
     * @param status
     *        The status of the content.
     * @see ContentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the content.
     * </p>
     * 
     * @return The status of the content.
     * @see ContentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the content.
     * </p>
     * 
     * @param status
     *        The status of the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentStatus
     */

    public ContentSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the content.
     * </p>
     * 
     * @param status
     *        The status of the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentStatus
     */

    public ContentSummary withStatus(ContentStatus status) {
        this.status = status.toString();
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

    public ContentSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ContentSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ContentSummary addTagsEntry(String key, String value) {
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

    public ContentSummary clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The title of the content.
     * </p>
     * 
     * @param title
     *        The title of the content.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the content.
     * </p>
     * 
     * @return The title of the content.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the content.
     * </p>
     * 
     * @param title
     *        The title of the content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContentSummary withTitle(String title) {
        setTitle(title);
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
        if (getContentArn() != null)
            sb.append("ContentArn: ").append(getContentArn()).append(",");
        if (getContentId() != null)
            sb.append("ContentId: ").append(getContentId()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getKnowledgeBaseArn() != null)
            sb.append("KnowledgeBaseArn: ").append(getKnowledgeBaseArn()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentSummary == false)
            return false;
        ContentSummary other = (ContentSummary) obj;
        if (other.getContentArn() == null ^ this.getContentArn() == null)
            return false;
        if (other.getContentArn() != null && other.getContentArn().equals(this.getContentArn()) == false)
            return false;
        if (other.getContentId() == null ^ this.getContentId() == null)
            return false;
        if (other.getContentId() != null && other.getContentId().equals(this.getContentId()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getKnowledgeBaseArn() == null ^ this.getKnowledgeBaseArn() == null)
            return false;
        if (other.getKnowledgeBaseArn() != null && other.getKnowledgeBaseArn().equals(this.getKnowledgeBaseArn()) == false)
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
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentArn() == null) ? 0 : getContentArn().hashCode());
        hashCode = prime * hashCode + ((getContentId() == null) ? 0 : getContentId().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseArn() == null) ? 0 : getKnowledgeBaseArn().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public ContentSummary clone() {
        try {
            return (ContentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.ContentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
