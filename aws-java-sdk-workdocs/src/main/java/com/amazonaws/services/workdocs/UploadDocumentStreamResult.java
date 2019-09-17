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

import com.amazonaws.annotation.SdkInternalApi;

/**
 * Result properties for UploadDocumentStream operation.
 */
public class UploadDocumentStreamResult {
    private String parentFolderId;
    private String documentName;
    private String contentType;
    private String documentId;
    private String versionId;

    /**
     * Initializes {@link UploadDocumentStreamResult} object.
     * @param request {@link UploadDocumentStreamRequest} object.
     */
    public UploadDocumentStreamResult(UploadDocumentStreamRequest request) {
        this.parentFolderId = request.getParentFolderId();
        this.documentName = request.getDocumentName();
        this.contentType = request.getContentType();
    }

    /**
     * Gets destination folder ID.
     * @return Destination folder ID.
     */
    public final String getParentFolderId() {
        return parentFolderId;
    }

    /**
     * Gets document name.
     * @return Document name.
     */
    public final String getDocumentName() {
        return documentName;
    }

    /**
     * Gets content type.
     * @return Content type.
     */
    public final String getContentType() {
        return contentType;
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
    @SdkInternalApi
    final void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * Gets document version ID.
     * @return Document version ID.
     */
    public final String getVersionId() {
        return versionId;
    }

    /**
     * Sets document version ID.
     * @param versionId Document version ID.
     */
    @SdkInternalApi
    final void setVersionId(String versionId) {
        this.versionId = versionId;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (parentFolderId != null) {
            sb.append("ParentFolderId: ").append(parentFolderId).append(",");
        }
        if (documentId != null) {
            sb.append("DocumentId: ").append(documentId).append(",");
        }
        if (versionId != null) {
            sb.append("VersionId: ").append(versionId).append(",");
        }
        if (documentName != null) {
            sb.append("DocumentName: ").append(documentName).append(",");
        }
        if (contentType != null) {
            sb.append("ContentType: ").append(contentType).append(",");
        }
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = 31 * hashCode + ((parentFolderId == null) ? 0 : parentFolderId.hashCode());
        hashCode = 31 * hashCode + ((documentId == null) ? 0 : documentId.hashCode());
        hashCode = 31 * hashCode + ((versionId == null) ? 0 : versionId.hashCode());
        hashCode = 31 * hashCode + ((documentName == null) ? 0 : documentName.hashCode());
        hashCode = 31 * hashCode + ((contentType == null) ? 0 : contentType.hashCode());
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
        if (!(obj instanceof UploadDocumentStreamResult)) {
            return false;
        }
        
        UploadDocumentStreamResult other = (UploadDocumentStreamResult) obj;
        if (other.parentFolderId == null ^ this.parentFolderId == null) {
            return false;
        }
        if (other.parentFolderId != null && !other.parentFolderId.equals(this.parentFolderId)) {
            return false;
        }
        if (other.documentId == null ^ this.documentId == null) {
            return false;
        }
        if (other.documentId != null && !other.documentId.equals(this.documentId)) {
            return false;
        }
        if (other.versionId == null ^ this.versionId == null) {
            return false;
        }
        if (other.versionId != null && !other.versionId.equals(this.versionId)) {
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
        return true;
    }
}
