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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/UpdateContent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateContentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the content. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     */
    private String contentId;
    /**
     * <p>
     * The identifier of the knowledge base. Can be either the ID or the ARN
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
     * The URI for the article. If the knowledge base has a templateUri, setting this argument overrides it for this
     * piece of content. To remove an existing <code>overrideLinkOurUri</code>, exclude this argument and set
     * <code>removeOverrideLinkOutUri</code> to true.
     * </p>
     */
    private String overrideLinkOutUri;
    /**
     * <p>
     * Unset the existing <code>overrideLinkOutUri</code> if it exists.
     * </p>
     */
    private Boolean removeOverrideLinkOutUri;
    /**
     * <p>
     * The <code>revisionId</code> of the content resource to update, taken from an earlier call to
     * <code>GetContent</code>, <code>GetContentSummary</code>, <code>SearchContent</code>, or <code>ListContents</code>
     * . If included, this argument acts as an optimistic lock to ensure content was not modified since it was last
     * read. If it has been modified, this API throws a <code>PreconditionFailedException</code>.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * The title of the content.
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
     * The identifier of the content. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param contentId
     *        The identifier of the content. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    /**
     * <p>
     * The identifier of the content. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @return The identifier of the content. Can be either the ID or the ARN. URLs cannot contain the ARN.
     */

    public String getContentId() {
        return this.contentId;
    }

    /**
     * <p>
     * The identifier of the content. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * </p>
     * 
     * @param contentId
     *        The identifier of the content. Can be either the ID or the ARN. URLs cannot contain the ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContentRequest withContentId(String contentId) {
        setContentId(contentId);
        return this;
    }

    /**
     * <p>
     * The identifier of the knowledge base. Can be either the ID or the ARN
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. Can be either the ID or the ARN
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. Can be either the ID or the ARN
     * </p>
     * 
     * @return The identifier of the knowledge base. Can be either the ID or the ARN
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The identifier of the knowledge base. Can be either the ID or the ARN
     * </p>
     * 
     * @param knowledgeBaseId
     *        The identifier of the knowledge base. Can be either the ID or the ARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContentRequest withKnowledgeBaseId(String knowledgeBaseId) {
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

    public UpdateContentRequest withMetadata(java.util.Map<String, String> metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * Add a single Metadata entry
     *
     * @see UpdateContentRequest#withMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContentRequest addMetadataEntry(String key, String value) {
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

    public UpdateContentRequest clearMetadataEntries() {
        this.metadata = null;
        return this;
    }

    /**
     * <p>
     * The URI for the article. If the knowledge base has a templateUri, setting this argument overrides it for this
     * piece of content. To remove an existing <code>overrideLinkOurUri</code>, exclude this argument and set
     * <code>removeOverrideLinkOutUri</code> to true.
     * </p>
     * 
     * @param overrideLinkOutUri
     *        The URI for the article. If the knowledge base has a templateUri, setting this argument overrides it for
     *        this piece of content. To remove an existing <code>overrideLinkOurUri</code>, exclude this argument and
     *        set <code>removeOverrideLinkOutUri</code> to true.
     */

    public void setOverrideLinkOutUri(String overrideLinkOutUri) {
        this.overrideLinkOutUri = overrideLinkOutUri;
    }

    /**
     * <p>
     * The URI for the article. If the knowledge base has a templateUri, setting this argument overrides it for this
     * piece of content. To remove an existing <code>overrideLinkOurUri</code>, exclude this argument and set
     * <code>removeOverrideLinkOutUri</code> to true.
     * </p>
     * 
     * @return The URI for the article. If the knowledge base has a templateUri, setting this argument overrides it for
     *         this piece of content. To remove an existing <code>overrideLinkOurUri</code>, exclude this argument and
     *         set <code>removeOverrideLinkOutUri</code> to true.
     */

    public String getOverrideLinkOutUri() {
        return this.overrideLinkOutUri;
    }

    /**
     * <p>
     * The URI for the article. If the knowledge base has a templateUri, setting this argument overrides it for this
     * piece of content. To remove an existing <code>overrideLinkOurUri</code>, exclude this argument and set
     * <code>removeOverrideLinkOutUri</code> to true.
     * </p>
     * 
     * @param overrideLinkOutUri
     *        The URI for the article. If the knowledge base has a templateUri, setting this argument overrides it for
     *        this piece of content. To remove an existing <code>overrideLinkOurUri</code>, exclude this argument and
     *        set <code>removeOverrideLinkOutUri</code> to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContentRequest withOverrideLinkOutUri(String overrideLinkOutUri) {
        setOverrideLinkOutUri(overrideLinkOutUri);
        return this;
    }

    /**
     * <p>
     * Unset the existing <code>overrideLinkOutUri</code> if it exists.
     * </p>
     * 
     * @param removeOverrideLinkOutUri
     *        Unset the existing <code>overrideLinkOutUri</code> if it exists.
     */

    public void setRemoveOverrideLinkOutUri(Boolean removeOverrideLinkOutUri) {
        this.removeOverrideLinkOutUri = removeOverrideLinkOutUri;
    }

    /**
     * <p>
     * Unset the existing <code>overrideLinkOutUri</code> if it exists.
     * </p>
     * 
     * @return Unset the existing <code>overrideLinkOutUri</code> if it exists.
     */

    public Boolean getRemoveOverrideLinkOutUri() {
        return this.removeOverrideLinkOutUri;
    }

    /**
     * <p>
     * Unset the existing <code>overrideLinkOutUri</code> if it exists.
     * </p>
     * 
     * @param removeOverrideLinkOutUri
     *        Unset the existing <code>overrideLinkOutUri</code> if it exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContentRequest withRemoveOverrideLinkOutUri(Boolean removeOverrideLinkOutUri) {
        setRemoveOverrideLinkOutUri(removeOverrideLinkOutUri);
        return this;
    }

    /**
     * <p>
     * Unset the existing <code>overrideLinkOutUri</code> if it exists.
     * </p>
     * 
     * @return Unset the existing <code>overrideLinkOutUri</code> if it exists.
     */

    public Boolean isRemoveOverrideLinkOutUri() {
        return this.removeOverrideLinkOutUri;
    }

    /**
     * <p>
     * The <code>revisionId</code> of the content resource to update, taken from an earlier call to
     * <code>GetContent</code>, <code>GetContentSummary</code>, <code>SearchContent</code>, or <code>ListContents</code>
     * . If included, this argument acts as an optimistic lock to ensure content was not modified since it was last
     * read. If it has been modified, this API throws a <code>PreconditionFailedException</code>.
     * </p>
     * 
     * @param revisionId
     *        The <code>revisionId</code> of the content resource to update, taken from an earlier call to
     *        <code>GetContent</code>, <code>GetContentSummary</code>, <code>SearchContent</code>, or
     *        <code>ListContents</code>. If included, this argument acts as an optimistic lock to ensure content was not
     *        modified since it was last read. If it has been modified, this API throws a
     *        <code>PreconditionFailedException</code>.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The <code>revisionId</code> of the content resource to update, taken from an earlier call to
     * <code>GetContent</code>, <code>GetContentSummary</code>, <code>SearchContent</code>, or <code>ListContents</code>
     * . If included, this argument acts as an optimistic lock to ensure content was not modified since it was last
     * read. If it has been modified, this API throws a <code>PreconditionFailedException</code>.
     * </p>
     * 
     * @return The <code>revisionId</code> of the content resource to update, taken from an earlier call to
     *         <code>GetContent</code>, <code>GetContentSummary</code>, <code>SearchContent</code>, or
     *         <code>ListContents</code>. If included, this argument acts as an optimistic lock to ensure content was
     *         not modified since it was last read. If it has been modified, this API throws a
     *         <code>PreconditionFailedException</code>.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The <code>revisionId</code> of the content resource to update, taken from an earlier call to
     * <code>GetContent</code>, <code>GetContentSummary</code>, <code>SearchContent</code>, or <code>ListContents</code>
     * . If included, this argument acts as an optimistic lock to ensure content was not modified since it was last
     * read. If it has been modified, this API throws a <code>PreconditionFailedException</code>.
     * </p>
     * 
     * @param revisionId
     *        The <code>revisionId</code> of the content resource to update, taken from an earlier call to
     *        <code>GetContent</code>, <code>GetContentSummary</code>, <code>SearchContent</code>, or
     *        <code>ListContents</code>. If included, this argument acts as an optimistic lock to ensure content was not
     *        modified since it was last read. If it has been modified, this API throws a
     *        <code>PreconditionFailedException</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateContentRequest withRevisionId(String revisionId) {
        setRevisionId(revisionId);
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

    public UpdateContentRequest withTitle(String title) {
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

    public UpdateContentRequest withUploadId(String uploadId) {
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
        if (getContentId() != null)
            sb.append("ContentId: ").append(getContentId()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getOverrideLinkOutUri() != null)
            sb.append("OverrideLinkOutUri: ").append(getOverrideLinkOutUri()).append(",");
        if (getRemoveOverrideLinkOutUri() != null)
            sb.append("RemoveOverrideLinkOutUri: ").append(getRemoveOverrideLinkOutUri()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
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

        if (obj instanceof UpdateContentRequest == false)
            return false;
        UpdateContentRequest other = (UpdateContentRequest) obj;
        if (other.getContentId() == null ^ this.getContentId() == null)
            return false;
        if (other.getContentId() != null && other.getContentId().equals(this.getContentId()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getOverrideLinkOutUri() == null ^ this.getOverrideLinkOutUri() == null)
            return false;
        if (other.getOverrideLinkOutUri() != null && other.getOverrideLinkOutUri().equals(this.getOverrideLinkOutUri()) == false)
            return false;
        if (other.getRemoveOverrideLinkOutUri() == null ^ this.getRemoveOverrideLinkOutUri() == null)
            return false;
        if (other.getRemoveOverrideLinkOutUri() != null && other.getRemoveOverrideLinkOutUri().equals(this.getRemoveOverrideLinkOutUri()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
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

        hashCode = prime * hashCode + ((getContentId() == null) ? 0 : getContentId().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getOverrideLinkOutUri() == null) ? 0 : getOverrideLinkOutUri().hashCode());
        hashCode = prime * hashCode + ((getRemoveOverrideLinkOutUri() == null) ? 0 : getRemoveOverrideLinkOutUri().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateContentRequest clone() {
        return (UpdateContentRequest) super.clone();
    }

}
