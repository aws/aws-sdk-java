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

/**
 * Request parameters for GetDocumentStream operation.
 */
public class GetDocumentStreamRequest {
    private String documentId;
    private String versionId;
    private String authenticationToken;

    /**
     * Initializes {@link GetDocumentStreamRequest} object.
     */
    public GetDocumentStreamRequest() {
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
    public final GetDocumentStreamRequest withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
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
    public final void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Sets document version ID.
     * @param versionId Document version ID.
     * @return This object for method chaining.
     */
    public final GetDocumentStreamRequest withVersionId(String versionId) {
        this.versionId = versionId;
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
    public final GetDocumentStreamRequest withAuthenticationToken(String authenticationToken) {
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
        if (versionId != null) {
            sb.append("VersionId: ").append(versionId).append(",");
        }
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        int hashCode = 1;
        hashCode = 31 * hashCode + ((authenticationToken == null) ? 0 : authenticationToken.hashCode());
        hashCode = 31 * hashCode + ((documentId == null) ? 0 : documentId.hashCode());
        hashCode = 31 * hashCode + ((versionId == null) ? 0 : versionId.hashCode());
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
        if (!(obj instanceof GetDocumentStreamRequest)) {
            return false;
        }
        
        GetDocumentStreamRequest other = (GetDocumentStreamRequest) obj;
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
        if (other.versionId == null ^ this.versionId == null) {
            return false;
        }
        if (other.versionId != null && !other.versionId.equals(this.versionId)) {
            return false;
        }
        return true;
    }
}
