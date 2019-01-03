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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetDocumentPath" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDocumentPathRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The maximum number of levels in the hierarchy to return.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * A comma-separated list of values. Specify <code>NAME</code> to include the names of the parent folders.
     * </p>
     */
    private String fields;
    /**
     * <p>
     * This value is not supported.
     * </p>
     */
    private String marker;

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

    public GetDocumentPathRequest withAuthenticationToken(String authenticationToken) {
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

    public GetDocumentPathRequest withDocumentId(String documentId) {
        setDocumentId(documentId);
        return this;
    }

    /**
     * <p>
     * The maximum number of levels in the hierarchy to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of levels in the hierarchy to return.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of levels in the hierarchy to return.
     * </p>
     * 
     * @return The maximum number of levels in the hierarchy to return.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of levels in the hierarchy to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of levels in the hierarchy to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentPathRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * A comma-separated list of values. Specify <code>NAME</code> to include the names of the parent folders.
     * </p>
     * 
     * @param fields
     *        A comma-separated list of values. Specify <code>NAME</code> to include the names of the parent folders.
     */

    public void setFields(String fields) {
        this.fields = fields;
    }

    /**
     * <p>
     * A comma-separated list of values. Specify <code>NAME</code> to include the names of the parent folders.
     * </p>
     * 
     * @return A comma-separated list of values. Specify <code>NAME</code> to include the names of the parent folders.
     */

    public String getFields() {
        return this.fields;
    }

    /**
     * <p>
     * A comma-separated list of values. Specify <code>NAME</code> to include the names of the parent folders.
     * </p>
     * 
     * @param fields
     *        A comma-separated list of values. Specify <code>NAME</code> to include the names of the parent folders.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentPathRequest withFields(String fields) {
        setFields(fields);
        return this;
    }

    /**
     * <p>
     * This value is not supported.
     * </p>
     * 
     * @param marker
     *        This value is not supported.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * This value is not supported.
     * </p>
     * 
     * @return This value is not supported.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * This value is not supported.
     * </p>
     * 
     * @param marker
     *        This value is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentPathRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getAuthenticationToken() != null)
            sb.append("AuthenticationToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getDocumentId() != null)
            sb.append("DocumentId: ").append(getDocumentId()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDocumentPathRequest == false)
            return false;
        GetDocumentPathRequest other = (GetDocumentPathRequest) obj;
        if (other.getAuthenticationToken() == null ^ this.getAuthenticationToken() == null)
            return false;
        if (other.getAuthenticationToken() != null && other.getAuthenticationToken().equals(this.getAuthenticationToken()) == false)
            return false;
        if (other.getDocumentId() == null ^ this.getDocumentId() == null)
            return false;
        if (other.getDocumentId() != null && other.getDocumentId().equals(this.getDocumentId()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationToken() == null) ? 0 : getAuthenticationToken().hashCode());
        hashCode = prime * hashCode + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public GetDocumentPathRequest clone() {
        return (GetDocumentPathRequest) super.clone();
    }

}
