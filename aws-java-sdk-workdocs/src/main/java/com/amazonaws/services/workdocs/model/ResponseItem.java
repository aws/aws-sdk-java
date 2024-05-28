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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * List of Documents, Folders, Comments, and Document Versions matching the query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/ResponseItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of item being returned.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The webUrl of the item being returned.
     * </p>
     */
    private String webUrl;
    /**
     * <p>
     * The document that matches the query.
     * </p>
     */
    private DocumentMetadata documentMetadata;
    /**
     * <p>
     * The folder that matches the query.
     * </p>
     */
    private FolderMetadata folderMetadata;
    /**
     * <p>
     * The comment that matches the query.
     * </p>
     */
    private CommentMetadata commentMetadata;
    /**
     * <p>
     * The document version that matches the metadata.
     * </p>
     */
    private DocumentVersionMetadata documentVersionMetadata;

    /**
     * <p>
     * The type of item being returned.
     * </p>
     * 
     * @param resourceType
     *        The type of item being returned.
     * @see ResponseItemType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of item being returned.
     * </p>
     * 
     * @return The type of item being returned.
     * @see ResponseItemType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of item being returned.
     * </p>
     * 
     * @param resourceType
     *        The type of item being returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResponseItemType
     */

    public ResponseItem withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of item being returned.
     * </p>
     * 
     * @param resourceType
     *        The type of item being returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResponseItemType
     */

    public ResponseItem withResourceType(ResponseItemType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The webUrl of the item being returned.
     * </p>
     * 
     * @param webUrl
     *        The webUrl of the item being returned.
     */

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    /**
     * <p>
     * The webUrl of the item being returned.
     * </p>
     * 
     * @return The webUrl of the item being returned.
     */

    public String getWebUrl() {
        return this.webUrl;
    }

    /**
     * <p>
     * The webUrl of the item being returned.
     * </p>
     * 
     * @param webUrl
     *        The webUrl of the item being returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseItem withWebUrl(String webUrl) {
        setWebUrl(webUrl);
        return this;
    }

    /**
     * <p>
     * The document that matches the query.
     * </p>
     * 
     * @param documentMetadata
     *        The document that matches the query.
     */

    public void setDocumentMetadata(DocumentMetadata documentMetadata) {
        this.documentMetadata = documentMetadata;
    }

    /**
     * <p>
     * The document that matches the query.
     * </p>
     * 
     * @return The document that matches the query.
     */

    public DocumentMetadata getDocumentMetadata() {
        return this.documentMetadata;
    }

    /**
     * <p>
     * The document that matches the query.
     * </p>
     * 
     * @param documentMetadata
     *        The document that matches the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseItem withDocumentMetadata(DocumentMetadata documentMetadata) {
        setDocumentMetadata(documentMetadata);
        return this;
    }

    /**
     * <p>
     * The folder that matches the query.
     * </p>
     * 
     * @param folderMetadata
     *        The folder that matches the query.
     */

    public void setFolderMetadata(FolderMetadata folderMetadata) {
        this.folderMetadata = folderMetadata;
    }

    /**
     * <p>
     * The folder that matches the query.
     * </p>
     * 
     * @return The folder that matches the query.
     */

    public FolderMetadata getFolderMetadata() {
        return this.folderMetadata;
    }

    /**
     * <p>
     * The folder that matches the query.
     * </p>
     * 
     * @param folderMetadata
     *        The folder that matches the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseItem withFolderMetadata(FolderMetadata folderMetadata) {
        setFolderMetadata(folderMetadata);
        return this;
    }

    /**
     * <p>
     * The comment that matches the query.
     * </p>
     * 
     * @param commentMetadata
     *        The comment that matches the query.
     */

    public void setCommentMetadata(CommentMetadata commentMetadata) {
        this.commentMetadata = commentMetadata;
    }

    /**
     * <p>
     * The comment that matches the query.
     * </p>
     * 
     * @return The comment that matches the query.
     */

    public CommentMetadata getCommentMetadata() {
        return this.commentMetadata;
    }

    /**
     * <p>
     * The comment that matches the query.
     * </p>
     * 
     * @param commentMetadata
     *        The comment that matches the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseItem withCommentMetadata(CommentMetadata commentMetadata) {
        setCommentMetadata(commentMetadata);
        return this;
    }

    /**
     * <p>
     * The document version that matches the metadata.
     * </p>
     * 
     * @param documentVersionMetadata
     *        The document version that matches the metadata.
     */

    public void setDocumentVersionMetadata(DocumentVersionMetadata documentVersionMetadata) {
        this.documentVersionMetadata = documentVersionMetadata;
    }

    /**
     * <p>
     * The document version that matches the metadata.
     * </p>
     * 
     * @return The document version that matches the metadata.
     */

    public DocumentVersionMetadata getDocumentVersionMetadata() {
        return this.documentVersionMetadata;
    }

    /**
     * <p>
     * The document version that matches the metadata.
     * </p>
     * 
     * @param documentVersionMetadata
     *        The document version that matches the metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseItem withDocumentVersionMetadata(DocumentVersionMetadata documentVersionMetadata) {
        setDocumentVersionMetadata(documentVersionMetadata);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getWebUrl() != null)
            sb.append("WebUrl: ").append("***Sensitive Data Redacted***").append(",");
        if (getDocumentMetadata() != null)
            sb.append("DocumentMetadata: ").append(getDocumentMetadata()).append(",");
        if (getFolderMetadata() != null)
            sb.append("FolderMetadata: ").append(getFolderMetadata()).append(",");
        if (getCommentMetadata() != null)
            sb.append("CommentMetadata: ").append(getCommentMetadata()).append(",");
        if (getDocumentVersionMetadata() != null)
            sb.append("DocumentVersionMetadata: ").append(getDocumentVersionMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseItem == false)
            return false;
        ResponseItem other = (ResponseItem) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getWebUrl() == null ^ this.getWebUrl() == null)
            return false;
        if (other.getWebUrl() != null && other.getWebUrl().equals(this.getWebUrl()) == false)
            return false;
        if (other.getDocumentMetadata() == null ^ this.getDocumentMetadata() == null)
            return false;
        if (other.getDocumentMetadata() != null && other.getDocumentMetadata().equals(this.getDocumentMetadata()) == false)
            return false;
        if (other.getFolderMetadata() == null ^ this.getFolderMetadata() == null)
            return false;
        if (other.getFolderMetadata() != null && other.getFolderMetadata().equals(this.getFolderMetadata()) == false)
            return false;
        if (other.getCommentMetadata() == null ^ this.getCommentMetadata() == null)
            return false;
        if (other.getCommentMetadata() != null && other.getCommentMetadata().equals(this.getCommentMetadata()) == false)
            return false;
        if (other.getDocumentVersionMetadata() == null ^ this.getDocumentVersionMetadata() == null)
            return false;
        if (other.getDocumentVersionMetadata() != null && other.getDocumentVersionMetadata().equals(this.getDocumentVersionMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getWebUrl() == null) ? 0 : getWebUrl().hashCode());
        hashCode = prime * hashCode + ((getDocumentMetadata() == null) ? 0 : getDocumentMetadata().hashCode());
        hashCode = prime * hashCode + ((getFolderMetadata() == null) ? 0 : getFolderMetadata().hashCode());
        hashCode = prime * hashCode + ((getCommentMetadata() == null) ? 0 : getCommentMetadata().hashCode());
        hashCode = prime * hashCode + ((getDocumentVersionMetadata() == null) ? 0 : getDocumentVersionMetadata().hashCode());
        return hashCode;
    }

    @Override
    public ResponseItem clone() {
        try {
            return (ResponseItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.ResponseItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
