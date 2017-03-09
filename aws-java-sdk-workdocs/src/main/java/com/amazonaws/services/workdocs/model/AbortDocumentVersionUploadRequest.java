/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/AbortDocumentVersionUpload"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbortDocumentVersionUploadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the document.
     * </p>
     */
    private String documentId;
    /**
     * <p>
     * The ID of the version.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * The ID of the document.
     * </p>
     * 
     * @param documentId
     *        The ID of the document.
     */

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * <p>
     * The ID of the document.
     * </p>
     * 
     * @return The ID of the document.
     */

    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * <p>
     * The ID of the document.
     * </p>
     * 
     * @param documentId
     *        The ID of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbortDocumentVersionUploadRequest withDocumentId(String documentId) {
        setDocumentId(documentId);
        return this;
    }

    /**
     * <p>
     * The ID of the version.
     * </p>
     * 
     * @param versionId
     *        The ID of the version.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The ID of the version.
     * </p>
     * 
     * @return The ID of the version.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The ID of the version.
     * </p>
     * 
     * @param versionId
     *        The ID of the version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbortDocumentVersionUploadRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDocumentId() != null)
            sb.append("DocumentId: ").append(getDocumentId()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AbortDocumentVersionUploadRequest == false)
            return false;
        AbortDocumentVersionUploadRequest other = (AbortDocumentVersionUploadRequest) obj;
        if (other.getDocumentId() == null ^ this.getDocumentId() == null)
            return false;
        if (other.getDocumentId() != null && other.getDocumentId().equals(this.getDocumentId()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public AbortDocumentVersionUploadRequest clone() {
        return (AbortDocumentVersionUploadRequest) super.clone();
    }

}
