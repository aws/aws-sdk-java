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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetDocumentVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDocumentVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     */
    private String authenticationToken;
    /**
     * <p>
     * The ID of the document.
     * </p>
     */
    private String documentId;
    /**
     * <p>
     * The version ID of the document.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * A comma-separated list of values. Specify "SOURCE" to include a URL for the source document.
     * </p>
     */
    private String fields;
    /**
     * <p>
     * Set this to TRUE to include custom metadata in the response.
     * </p>
     */
    private Boolean includeCustomMetadata;

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *        accessing the API using AWS credentials.
     */

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @return Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *         accessing the API using AWS credentials.
     */

    public String getAuthenticationToken() {
        return this.authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *        accessing the API using AWS credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentVersionRequest withAuthenticationToken(String authenticationToken) {
        setAuthenticationToken(authenticationToken);
        return this;
    }

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

    public GetDocumentVersionRequest withDocumentId(String documentId) {
        setDocumentId(documentId);
        return this;
    }

    /**
     * <p>
     * The version ID of the document.
     * </p>
     * 
     * @param versionId
     *        The version ID of the document.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The version ID of the document.
     * </p>
     * 
     * @return The version ID of the document.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The version ID of the document.
     * </p>
     * 
     * @param versionId
     *        The version ID of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentVersionRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * A comma-separated list of values. Specify "SOURCE" to include a URL for the source document.
     * </p>
     * 
     * @param fields
     *        A comma-separated list of values. Specify "SOURCE" to include a URL for the source document.
     */

    public void setFields(String fields) {
        this.fields = fields;
    }

    /**
     * <p>
     * A comma-separated list of values. Specify "SOURCE" to include a URL for the source document.
     * </p>
     * 
     * @return A comma-separated list of values. Specify "SOURCE" to include a URL for the source document.
     */

    public String getFields() {
        return this.fields;
    }

    /**
     * <p>
     * A comma-separated list of values. Specify "SOURCE" to include a URL for the source document.
     * </p>
     * 
     * @param fields
     *        A comma-separated list of values. Specify "SOURCE" to include a URL for the source document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentVersionRequest withFields(String fields) {
        setFields(fields);
        return this;
    }

    /**
     * <p>
     * Set this to TRUE to include custom metadata in the response.
     * </p>
     * 
     * @param includeCustomMetadata
     *        Set this to TRUE to include custom metadata in the response.
     */

    public void setIncludeCustomMetadata(Boolean includeCustomMetadata) {
        this.includeCustomMetadata = includeCustomMetadata;
    }

    /**
     * <p>
     * Set this to TRUE to include custom metadata in the response.
     * </p>
     * 
     * @return Set this to TRUE to include custom metadata in the response.
     */

    public Boolean getIncludeCustomMetadata() {
        return this.includeCustomMetadata;
    }

    /**
     * <p>
     * Set this to TRUE to include custom metadata in the response.
     * </p>
     * 
     * @param includeCustomMetadata
     *        Set this to TRUE to include custom metadata in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentVersionRequest withIncludeCustomMetadata(Boolean includeCustomMetadata) {
        setIncludeCustomMetadata(includeCustomMetadata);
        return this;
    }

    /**
     * <p>
     * Set this to TRUE to include custom metadata in the response.
     * </p>
     * 
     * @return Set this to TRUE to include custom metadata in the response.
     */

    public Boolean isIncludeCustomMetadata() {
        return this.includeCustomMetadata;
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
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getIncludeCustomMetadata() != null)
            sb.append("IncludeCustomMetadata: ").append(getIncludeCustomMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDocumentVersionRequest == false)
            return false;
        GetDocumentVersionRequest other = (GetDocumentVersionRequest) obj;
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
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getIncludeCustomMetadata() == null ^ this.getIncludeCustomMetadata() == null)
            return false;
        if (other.getIncludeCustomMetadata() != null && other.getIncludeCustomMetadata().equals(this.getIncludeCustomMetadata()) == false)
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
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getIncludeCustomMetadata() == null) ? 0 : getIncludeCustomMetadata().hashCode());
        return hashCode;
    }

    @Override
    public GetDocumentVersionRequest clone() {
        return (GetDocumentVersionRequest) super.clone();
    }

}
