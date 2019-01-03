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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/UpdateDocument" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDocumentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The name of the document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the parent folder.
     * </p>
     */
    private String parentFolderId;
    /**
     * <p>
     * The resource state of the document. Only ACTIVE and RECYCLED are supported.
     * </p>
     */
    private String resourceState;

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

    public UpdateDocumentRequest withAuthenticationToken(String authenticationToken) {
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

    public UpdateDocumentRequest withDocumentId(String documentId) {
        setDocumentId(documentId);
        return this;
    }

    /**
     * <p>
     * The name of the document.
     * </p>
     * 
     * @param name
     *        The name of the document.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the document.
     * </p>
     * 
     * @return The name of the document.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the document.
     * </p>
     * 
     * @param name
     *        The name of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the parent folder.
     * </p>
     * 
     * @param parentFolderId
     *        The ID of the parent folder.
     */

    public void setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    /**
     * <p>
     * The ID of the parent folder.
     * </p>
     * 
     * @return The ID of the parent folder.
     */

    public String getParentFolderId() {
        return this.parentFolderId;
    }

    /**
     * <p>
     * The ID of the parent folder.
     * </p>
     * 
     * @param parentFolderId
     *        The ID of the parent folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDocumentRequest withParentFolderId(String parentFolderId) {
        setParentFolderId(parentFolderId);
        return this;
    }

    /**
     * <p>
     * The resource state of the document. Only ACTIVE and RECYCLED are supported.
     * </p>
     * 
     * @param resourceState
     *        The resource state of the document. Only ACTIVE and RECYCLED are supported.
     * @see ResourceStateType
     */

    public void setResourceState(String resourceState) {
        this.resourceState = resourceState;
    }

    /**
     * <p>
     * The resource state of the document. Only ACTIVE and RECYCLED are supported.
     * </p>
     * 
     * @return The resource state of the document. Only ACTIVE and RECYCLED are supported.
     * @see ResourceStateType
     */

    public String getResourceState() {
        return this.resourceState;
    }

    /**
     * <p>
     * The resource state of the document. Only ACTIVE and RECYCLED are supported.
     * </p>
     * 
     * @param resourceState
     *        The resource state of the document. Only ACTIVE and RECYCLED are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStateType
     */

    public UpdateDocumentRequest withResourceState(String resourceState) {
        setResourceState(resourceState);
        return this;
    }

    /**
     * <p>
     * The resource state of the document. Only ACTIVE and RECYCLED are supported.
     * </p>
     * 
     * @param resourceState
     *        The resource state of the document. Only ACTIVE and RECYCLED are supported.
     * @see ResourceStateType
     */

    public void setResourceState(ResourceStateType resourceState) {
        withResourceState(resourceState);
    }

    /**
     * <p>
     * The resource state of the document. Only ACTIVE and RECYCLED are supported.
     * </p>
     * 
     * @param resourceState
     *        The resource state of the document. Only ACTIVE and RECYCLED are supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStateType
     */

    public UpdateDocumentRequest withResourceState(ResourceStateType resourceState) {
        this.resourceState = resourceState.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getParentFolderId() != null)
            sb.append("ParentFolderId: ").append(getParentFolderId()).append(",");
        if (getResourceState() != null)
            sb.append("ResourceState: ").append(getResourceState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDocumentRequest == false)
            return false;
        UpdateDocumentRequest other = (UpdateDocumentRequest) obj;
        if (other.getAuthenticationToken() == null ^ this.getAuthenticationToken() == null)
            return false;
        if (other.getAuthenticationToken() != null && other.getAuthenticationToken().equals(this.getAuthenticationToken()) == false)
            return false;
        if (other.getDocumentId() == null ^ this.getDocumentId() == null)
            return false;
        if (other.getDocumentId() != null && other.getDocumentId().equals(this.getDocumentId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getParentFolderId() == null ^ this.getParentFolderId() == null)
            return false;
        if (other.getParentFolderId() != null && other.getParentFolderId().equals(this.getParentFolderId()) == false)
            return false;
        if (other.getResourceState() == null ^ this.getResourceState() == null)
            return false;
        if (other.getResourceState() != null && other.getResourceState().equals(this.getResourceState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationToken() == null) ? 0 : getAuthenticationToken().hashCode());
        hashCode = prime * hashCode + ((getDocumentId() == null) ? 0 : getDocumentId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getParentFolderId() == null) ? 0 : getParentFolderId().hashCode());
        hashCode = prime * hashCode + ((getResourceState() == null) ? 0 : getResourceState().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDocumentRequest clone() {
        return (UpdateDocumentRequest) super.clone();
    }

}
