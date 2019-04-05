/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.workdocs;

import java.io.InputStream;
import java.util.Date;

/**
 * Request parameters for UploadDocumentStream operation.
 */
public class UploadDocumentStreamRequest {
    private String parentFolderId;
    private String documentName;
    private String contentType;
    private Date contentCreatedTimestamp;
    private Date contentModifiedTimestamp;
    private Long documentSizeInBytes;
    private InputStream stream;
    private String documentId;
    private String authenticationToken;

    /**
     * Initializes {@link UploadDocumentStreamRequest} object.
     */
    public UploadDocumentStreamRequest() {
    }

    /**
     * Gets parent folder ID.
     * @return Parent folder ID.
     */
    public final String getParentFolderId() {
        return parentFolderId;
    }

    /**
     * Sets parent folder ID.
     * @param parentFolderId Parent folder ID.
     */
    public final void setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    /**
     * Sets parent folder ID.
     * @param parentFolderId Parent folder ID.
     * @return This object for method chaining.
     */
    public final UploadDocumentStreamRequest withParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }

    /**
     * Gets document name.
     * @return Document name.
     */
    public final String getDocumentName() {
        return documentName;
    }

    /**
     * Sets document name.
     * @param documentName Document name.
     */
    public final void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * Sets document name.
     * @param documentName Document name.
     * @return This object for method chaining.
     */
    public final UploadDocumentStreamRequest withDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    /**
     * Gets content type.
     * @return Content type.
     */
    public final String getContentType() {
        return contentType;
    }

    /**
     * Sets content type.
     * @param contentType Content type.
     */
    public final void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Sets content type.
     * @param contentType Content type.
     * @return This object for method chaining.
     */
    public final UploadDocumentStreamRequest withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Gets content created timestamp.
     * @return Content created timestamp.
     */
    public final Date getContentCreatedTimestamp() {
        return contentCreatedTimestamp;
    }

    /**
     * Sets content created timestamp.
     * @param contentCreatedTimestamp Content created timestamp.
     */
    public final void setContentCreatedTimestamp(Date contentCreatedTimestamp) {
        this.contentCreatedTimestamp = contentCreatedTimestamp;
    }

    /**
     * Sets content created timestamp.
     * @param contentCreatedTimestamp Content created timestamp.
     * @return This object for method chaining.
     */
    public final UploadDocumentStreamRequest withContentCreatedTimestamp(Date contentCreatedTimestamp) {
        this.contentCreatedTimestamp = contentCreatedTimestamp;
        return this;
    }

    /**
     * Gets content modified timestamp.
     * @return Content modified timestamp.
     */
    public final Date getContentModifiedTimestamp() {
        return contentModifiedTimestamp;
    }

    /**
     * Sets content modified timestamp.
     * @param contentModifiedTimestamp Content modified timestamp.
     */
    public final void setContentModifiedTimestamp(Date contentModifiedTimestamp) {
        this.contentModifiedTimestamp = contentModifiedTimestamp;
    }

    /**
     * Sets content modified timestamp.
     * @param contentModifiedTimestamp Content modified timestamp.
     * @return This object for method chaining.
     */
    public final UploadDocumentStreamRequest withContentModifiedTimestamp(Date contentModifiedTimestamp) {
        this.contentModifiedTimestamp = contentModifiedTimestamp;
        return this;
    }

    /**
     * Gets document size in bytes.
     * @return Document size in bytes.
     */
    public final Long getDocumentSizeInBytes() {
        return documentSizeInBytes;
    }

    /**
     * Sets document size in bytes.
     * @param documentSizeInBytes Document size in bytes.
     */
    public final void setDocumentSizeInBytes(Long documentSizeInBytes) {
        this.documentSizeInBytes = documentSizeInBytes;
    }

    /**
     * Sets document size in bytes.
     * @param documentSizeInBytes Document size in bytes.
     * @return This object for method chaining.
     */
    public final UploadDocumentStreamRequest withDocumentSizeInBytes(Long documentSizeInBytes) {
        this.documentSizeInBytes = documentSizeInBytes;
        return this;
    }

    /**
     * Gets document ID.
     * @return Document ID.
     */
    public final String getDocumentId() {
        return documentId;
    }

    /**
     * Sets document ID.
     * @param documentId Document ID.
     */
    public final void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * Sets document ID.
     * @param documentId Document ID.
     * @return This object for method chaining.
     */
    public final UploadDocumentStreamRequest withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * Gets input stream of document.
     * @return Input stream of document.
     */
    public final InputStream getStream() {
        return stream;
    }

    /**
     * Sets input stream of document.
     * @param stream Input stream of document.
     */
    public final void setStream(InputStream stream) {
        this.stream = stream;
    }

    /**
     * Sets input stream of document.
     * @param stream Input stream of document.
     * @return This object for method chaining.
     */
    public final UploadDocumentStreamRequest withStream(InputStream stream) {
        this.stream = stream;
        return this;
    }

    /**
     * Gets authentication token.
     * @return Authentication token.
     */
    public final String getAuthenticationToken() {
        return authenticationToken;
    }

    /**
     * Sets authentication token.
     * @param authenticationToken Authentication token.
     */
    public final void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    /**
     * Sets authentication token.
     * @param authenticationToken Authentication token.
     * @return This object for method chaining.
     */
    public final UploadDocumentStreamRequest withAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
        return this;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (authenticationToken != null) {
            sb.append("AuthenticationToken: ").append(authenticationToken).append(",");
        }
        if (documentId != null) {
            sb.append("DocumentId: ").append(documentId).append(",");
        }
        if (parentFolderId != null) {
            sb.append("ParentFolderId: ").append(parentFolderId).append(",");
        }
        if (documentName != null) {
            sb.append("DocumentName: ").append(documentName).append(",");
        }
        if (contentType != null) {
            sb.append("ContentType: ").append(contentType).append(",");
        }
        if (contentCreatedTimestamp != null) {
            sb.append("ContentCreatedTimestamp: ").append(contentCreatedTimestamp).append(",");
        }
        if (contentModifiedTimestamp != null) {
            sb.append("ContentModifiedTimestamp: ").append(contentModifiedTimestamp).append(",");
        }
        if (documentSizeInBytes != null) {
            sb.append("DocumentSizeInBytes: ").append(documentSizeInBytes).append(",");
        }
        if (stream != null) {
            sb.append("Stream: ").append(stream).append(",");
        }
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = 31 * hashCode + ((authenticationToken == null) ? 0 : authenticationToken.hashCode());
        hashCode = 31 * hashCode + ((documentId == null) ? 0 : documentId.hashCode());
        hashCode = 31 * hashCode + ((parentFolderId == null) ? 0 : parentFolderId.hashCode());
        hashCode = 31 * hashCode + ((documentName == null) ? 0 : documentName.hashCode());
        hashCode = 31 * hashCode + ((contentType == null) ? 0 : contentType.hashCode());
        hashCode = 31 * hashCode + ((contentCreatedTimestamp == null) ? 0 : contentCreatedTimestamp.hashCode());
        hashCode = 31 * hashCode + ((contentModifiedTimestamp == null) ? 0 : contentModifiedTimestamp.hashCode());
        hashCode = 31 * hashCode + ((documentSizeInBytes == null) ? 0 : documentSizeInBytes.hashCode());
        hashCode = 31 * hashCode + ((stream == null) ? 0 : stream.hashCode());
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof UploadDocumentStreamRequest)) {
            return false;
        }
        
        UploadDocumentStreamRequest other = (UploadDocumentStreamRequest) obj;
        if (other.authenticationToken == null ^ this.authenticationToken == null) {
            return false;
        }
        if (other.authenticationToken != null && !other.authenticationToken.equals(this.authenticationToken)) {
            return false;
        }
        if (other.documentId == null ^ this.documentId == null) {
            return false;
        }
        if (other.documentId != null && !other.documentId.equals(this.documentId)) {
            return false;
        }
        if (other.parentFolderId == null ^ this.parentFolderId == null) {
            return false;
        }
        if (other.parentFolderId != null && !other.parentFolderId.equals(this.parentFolderId)) {
            return false;
        }
        if (other.documentName == null ^ this.documentName == null) {
            return false;
        }
        if (other.documentName != null && !other.documentName.equals(this.documentName)) {
            return false;
        }
        if (other.contentType == null ^ this.contentType == null) {
            return false;
        }
        if (other.contentType != null && !other.contentType.equals(this.contentType)) {
            return false;
        }
        if (other.contentCreatedTimestamp == null ^ this.contentCreatedTimestamp == null) {
            return false;
        }
        if (other.contentCreatedTimestamp != null && !other.contentCreatedTimestamp.equals(this.contentCreatedTimestamp)) {
            return false;
        }
        if (other.contentModifiedTimestamp == null ^ this.contentModifiedTimestamp == null) {
            return false;
        }
        if (other.contentModifiedTimestamp != null && !other.contentModifiedTimestamp.equals(this.contentModifiedTimestamp)) {
            return false;
        }
        if (other.documentSizeInBytes == null ^ this.documentSizeInBytes == null) {
            return false;
        }
        if (other.documentSizeInBytes != null && !other.documentSizeInBytes.equals(this.documentSizeInBytes)) {
            return false;
        }
        if (other.stream == null ^ this.stream == null) {
            return false;
        }
        if (other.stream != null && !other.stream.equals(this.stream)) {
            return false;
        }
        return true;
    }
}
