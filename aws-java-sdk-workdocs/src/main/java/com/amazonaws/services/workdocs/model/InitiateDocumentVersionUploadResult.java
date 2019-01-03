/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/InitiateDocumentVersionUpload"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InitiateDocumentVersionUploadResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The document metadata.
     * </p>
     */
    private DocumentMetadata metadata;
    /**
     * <p>
     * The upload metadata.
     * </p>
     */
    private UploadMetadata uploadMetadata;

    /**
     * <p>
     * The document metadata.
     * </p>
     * 
     * @param metadata
     *        The document metadata.
     */

    public void setMetadata(DocumentMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The document metadata.
     * </p>
     * 
     * @return The document metadata.
     */

    public DocumentMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The document metadata.
     * </p>
     * 
     * @param metadata
     *        The document metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateDocumentVersionUploadResult withMetadata(DocumentMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The upload metadata.
     * </p>
     * 
     * @param uploadMetadata
     *        The upload metadata.
     */

    public void setUploadMetadata(UploadMetadata uploadMetadata) {
        this.uploadMetadata = uploadMetadata;
    }

    /**
     * <p>
     * The upload metadata.
     * </p>
     * 
     * @return The upload metadata.
     */

    public UploadMetadata getUploadMetadata() {
        return this.uploadMetadata;
    }

    /**
     * <p>
     * The upload metadata.
     * </p>
     * 
     * @param uploadMetadata
     *        The upload metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateDocumentVersionUploadResult withUploadMetadata(UploadMetadata uploadMetadata) {
        setUploadMetadata(uploadMetadata);
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
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getUploadMetadata() != null)
            sb.append("UploadMetadata: ").append(getUploadMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InitiateDocumentVersionUploadResult == false)
            return false;
        InitiateDocumentVersionUploadResult other = (InitiateDocumentVersionUploadResult) obj;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getUploadMetadata() == null ^ this.getUploadMetadata() == null)
            return false;
        if (other.getUploadMetadata() != null && other.getUploadMetadata().equals(this.getUploadMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getUploadMetadata() == null) ? 0 : getUploadMetadata().hashCode());
        return hashCode;
    }

    @Override
    public InitiateDocumentVersionUploadResult clone() {
        try {
            return (InitiateDocumentVersionUploadResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
