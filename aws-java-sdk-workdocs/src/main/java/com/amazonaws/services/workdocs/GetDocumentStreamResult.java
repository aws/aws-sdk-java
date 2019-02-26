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

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.annotation.SdkInternalApi;

/**
 * Result properties for GetDocumentStream operation.
 * Once stream content is retrieved, result object must be closed.
 */
public class GetDocumentStreamResult implements Closeable {
    private String documentId;
    private String versionId;
    private InputStream stream;
    
    /**
     * Initializes {@link GetDocumentStreamResult} object.
     * @param request {@link GetDocumentStreamRequest} object.
     */
    public GetDocumentStreamResult(GetDocumentStreamRequest request) {
        this.documentId = request.getDocumentId();
    }
    
    /**
     * Gets document ID.
     * @return Document ID.
     */
    public final String getDocumentId() {
        return documentId;
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
    @SdkInternalApi
    final void setStream(InputStream stream) {
        this.stream = stream;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (documentId != null) {
            sb.append("DocumentId: ").append(documentId).append(",");
        }
        if (versionId != null) {
            sb.append("VersionId: ").append(versionId).append(",");
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
        hashCode = 31 * hashCode + ((documentId == null) ? 0 : documentId.hashCode());
        hashCode = 31 * hashCode + ((versionId == null) ? 0 : versionId.hashCode());
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
        if (!(obj instanceof GetDocumentStreamResult)) {
            return false;
        }
        
        GetDocumentStreamResult other = (GetDocumentStreamResult) obj;
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
        if (other.stream == null ^ this.stream == null) {
            return false;
        }
        if (other.stream != null && !other.stream.equals(this.stream)) {
            return false;
        }
        return true;
    }

    /**
     * Closes underlying stream if specified.
     * 
     * @throws IOException IO Exception.
     */
    public void close() throws IOException {
        if (this.stream != null) {
            this.stream.close();
        }
    }
}
