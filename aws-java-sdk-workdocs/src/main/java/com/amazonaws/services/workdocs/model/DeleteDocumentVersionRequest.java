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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DeleteDocumentVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDocumentVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator credentials to
     * access the API.
     * </p>
     */
    private String authenticationToken;
    /**
     * <p>
     * The ID of the document associated with the version being deleted.
     * </p>
     */
    private String documentId;
    /**
     * <p>
     * The ID of the version being deleted.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * Deletes all versions of a document prior to the current version.
     * </p>
     */
    private Boolean deletePriorVersions;

    /**
     * <p>
     * Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator credentials to
     * access the API.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator
     *        credentials to access the API.
     */

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator credentials to
     * access the API.
     * </p>
     * 
     * @return Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator
     *         credentials to access the API.
     */

    public String getAuthenticationToken() {
        return this.authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator credentials to
     * access the API.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Not required when using Amazon Web Services administrator
     *        credentials to access the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDocumentVersionRequest withAuthenticationToken(String authenticationToken) {
        setAuthenticationToken(authenticationToken);
        return this;
    }

    /**
     * <p>
     * The ID of the document associated with the version being deleted.
     * </p>
     * 
     * @param documentId
     *        The ID of the document associated with the version being deleted.
     */

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    /**
     * <p>
     * The ID of the document associated with the version being deleted.
     * </p>
     * 
     * @return The ID of the document associated with the version being deleted.
     */

    public String getDocumentId() {
        return this.documentId;
    }

    /**
     * <p>
     * The ID of the document associated with the version being deleted.
     * </p>
     * 
     * @param documentId
     *        The ID of the document associated with the version being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDocumentVersionRequest withDocumentId(String documentId) {
        setDocumentId(documentId);
        return this;
    }

    /**
     * <p>
     * The ID of the version being deleted.
     * </p>
     * 
     * @param versionId
     *        The ID of the version being deleted.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The ID of the version being deleted.
     * </p>
     * 
     * @return The ID of the version being deleted.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The ID of the version being deleted.
     * </p>
     * 
     * @param versionId
     *        The ID of the version being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDocumentVersionRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * Deletes all versions of a document prior to the current version.
     * </p>
     * 
     * @param deletePriorVersions
     *        Deletes all versions of a document prior to the current version.
     */

    public void setDeletePriorVersions(Boolean deletePriorVersions) {
        this.deletePriorVersions = deletePriorVersions;
    }

    /**
     * <p>
     * Deletes all versions of a document prior to the current version.
     * </p>
     * 
     * @return Deletes all versions of a document prior to the current version.
     */

    public Boolean getDeletePriorVersions() {
        return this.deletePriorVersions;
    }

    /**
     * <p>
     * Deletes all versions of a document prior to the current version.
     * </p>
     * 
     * @param deletePriorVersions
     *        Deletes all versions of a document prior to the current version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDocumentVersionRequest withDeletePriorVersions(Boolean deletePriorVersions) {
        setDeletePriorVersions(deletePriorVersions);
        return this;
    }

    /**
     * <p>
     * Deletes all versions of a document prior to the current version.
     * </p>
     * 
     * @return Deletes all versions of a document prior to the current version.
     */

    public Boolean isDeletePriorVersions() {
        return this.deletePriorVersions;
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
        if (getAuthenticationToken() != null)
            sb.append("AuthenticationToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getDocumentId() != null)
            sb.append("DocumentId: ").append(getDocumentId()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getDeletePriorVersions() != null)
            sb.append("DeletePriorVersions: ").append(getDeletePriorVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDocumentVersionRequest == false)
            return false;
        DeleteDocumentVersionRequest other = (DeleteDocumentVersionRequest) obj;
        if (other.getAuthenticationToken() == null ^ this.getAuthenticationToken() == null)
            return false;
        if (other.getAuthenticationToken() != null && other.getAuthenticationToken().equals(this.getAuthenticationToken()) == false)
            return false;
        if (other.getDocumentId() == null ^ this.getDocumentId() == null)
            return false;
        if (other.getDocumentId() != null && other.getDocumentId().equals(this.getDocumentId()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getDeletePriorVersions() == null ^ this.getDeletePriorVersions() == null)
            return false;
        if (other.getDeletePriorVersions() != null && other.getDeletePriorVersions().equals(this.getDeletePriorVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationToken() == null) ? 0 : getAuthenticationToken().hashCode());
        hashCode = prime * hashCode + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getDeletePriorVersions() == null) ? 0 : getDeletePriorVersions().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDocumentVersionRequest clone() {
        return (DeleteDocumentVersionRequest) super.clone();
    }

}
