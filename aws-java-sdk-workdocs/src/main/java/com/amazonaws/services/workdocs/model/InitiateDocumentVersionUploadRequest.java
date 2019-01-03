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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/InitiateDocumentVersionUpload"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InitiateDocumentVersionUploadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
    private String id;
    /**
     * <p>
     * The name of the document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The timestamp when the content of the document was originally created.
     * </p>
     */
    private java.util.Date contentCreatedTimestamp;
    /**
     * <p>
     * The timestamp when the content of the document was modified.
     * </p>
     */
    private java.util.Date contentModifiedTimestamp;
    /**
     * <p>
     * The content type of the document.
     * </p>
     */
    private String contentType;
    /**
     * <p>
     * The size of the document, in bytes.
     * </p>
     */
    private Long documentSizeInBytes;
    /**
     * <p>
     * The ID of the parent folder.
     * </p>
     */
    private String parentFolderId;

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

    public InitiateDocumentVersionUploadRequest withAuthenticationToken(String authenticationToken) {
        setAuthenticationToken(authenticationToken);
        return this;
    }

    /**
     * <p>
     * The ID of the document.
     * </p>
     * 
     * @param id
     *        The ID of the document.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the document.
     * </p>
     * 
     * @return The ID of the document.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the document.
     * </p>
     * 
     * @param id
     *        The ID of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateDocumentVersionUploadRequest withId(String id) {
        setId(id);
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

    public InitiateDocumentVersionUploadRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The timestamp when the content of the document was originally created.
     * </p>
     * 
     * @param contentCreatedTimestamp
     *        The timestamp when the content of the document was originally created.
     */

    public void setContentCreatedTimestamp(java.util.Date contentCreatedTimestamp) {
        this.contentCreatedTimestamp = contentCreatedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the content of the document was originally created.
     * </p>
     * 
     * @return The timestamp when the content of the document was originally created.
     */

    public java.util.Date getContentCreatedTimestamp() {
        return this.contentCreatedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the content of the document was originally created.
     * </p>
     * 
     * @param contentCreatedTimestamp
     *        The timestamp when the content of the document was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateDocumentVersionUploadRequest withContentCreatedTimestamp(java.util.Date contentCreatedTimestamp) {
        setContentCreatedTimestamp(contentCreatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp when the content of the document was modified.
     * </p>
     * 
     * @param contentModifiedTimestamp
     *        The timestamp when the content of the document was modified.
     */

    public void setContentModifiedTimestamp(java.util.Date contentModifiedTimestamp) {
        this.contentModifiedTimestamp = contentModifiedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the content of the document was modified.
     * </p>
     * 
     * @return The timestamp when the content of the document was modified.
     */

    public java.util.Date getContentModifiedTimestamp() {
        return this.contentModifiedTimestamp;
    }

    /**
     * <p>
     * The timestamp when the content of the document was modified.
     * </p>
     * 
     * @param contentModifiedTimestamp
     *        The timestamp when the content of the document was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateDocumentVersionUploadRequest withContentModifiedTimestamp(java.util.Date contentModifiedTimestamp) {
        setContentModifiedTimestamp(contentModifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * The content type of the document.
     * </p>
     * 
     * @param contentType
     *        The content type of the document.
     */

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * <p>
     * The content type of the document.
     * </p>
     * 
     * @return The content type of the document.
     */

    public String getContentType() {
        return this.contentType;
    }

    /**
     * <p>
     * The content type of the document.
     * </p>
     * 
     * @param contentType
     *        The content type of the document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateDocumentVersionUploadRequest withContentType(String contentType) {
        setContentType(contentType);
        return this;
    }

    /**
     * <p>
     * The size of the document, in bytes.
     * </p>
     * 
     * @param documentSizeInBytes
     *        The size of the document, in bytes.
     */

    public void setDocumentSizeInBytes(Long documentSizeInBytes) {
        this.documentSizeInBytes = documentSizeInBytes;
    }

    /**
     * <p>
     * The size of the document, in bytes.
     * </p>
     * 
     * @return The size of the document, in bytes.
     */

    public Long getDocumentSizeInBytes() {
        return this.documentSizeInBytes;
    }

    /**
     * <p>
     * The size of the document, in bytes.
     * </p>
     * 
     * @param documentSizeInBytes
     *        The size of the document, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateDocumentVersionUploadRequest withDocumentSizeInBytes(Long documentSizeInBytes) {
        setDocumentSizeInBytes(documentSizeInBytes);
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

    public InitiateDocumentVersionUploadRequest withParentFolderId(String parentFolderId) {
        setParentFolderId(parentFolderId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getContentCreatedTimestamp() != null)
            sb.append("ContentCreatedTimestamp: ").append(getContentCreatedTimestamp()).append(",");
        if (getContentModifiedTimestamp() != null)
            sb.append("ContentModifiedTimestamp: ").append(getContentModifiedTimestamp()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType()).append(",");
        if (getDocumentSizeInBytes() != null)
            sb.append("DocumentSizeInBytes: ").append(getDocumentSizeInBytes()).append(",");
        if (getParentFolderId() != null)
            sb.append("ParentFolderId: ").append(getParentFolderId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InitiateDocumentVersionUploadRequest == false)
            return false;
        InitiateDocumentVersionUploadRequest other = (InitiateDocumentVersionUploadRequest) obj;
        if (other.getAuthenticationToken() == null ^ this.getAuthenticationToken() == null)
            return false;
        if (other.getAuthenticationToken() != null && other.getAuthenticationToken().equals(this.getAuthenticationToken()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getContentCreatedTimestamp() == null ^ this.getContentCreatedTimestamp() == null)
            return false;
        if (other.getContentCreatedTimestamp() != null && other.getContentCreatedTimestamp().equals(this.getContentCreatedTimestamp()) == false)
            return false;
        if (other.getContentModifiedTimestamp() == null ^ this.getContentModifiedTimestamp() == null)
            return false;
        if (other.getContentModifiedTimestamp() != null && other.getContentModifiedTimestamp().equals(this.getContentModifiedTimestamp()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        if (other.getDocumentSizeInBytes() == null ^ this.getDocumentSizeInBytes() == null)
            return false;
        if (other.getDocumentSizeInBytes() != null && other.getDocumentSizeInBytes().equals(this.getDocumentSizeInBytes()) == false)
            return false;
        if (other.getParentFolderId() == null ^ this.getParentFolderId() == null)
            return false;
        if (other.getParentFolderId() != null && other.getParentFolderId().equals(this.getParentFolderId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationToken() == null) ? 0 : getAuthenticationToken().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getContentCreatedTimestamp() == null) ? 0 : getContentCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getContentModifiedTimestamp() == null) ? 0 : getContentModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        hashCode = prime * hashCode + ((getDocumentSizeInBytes() == null) ? 0 : getDocumentSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getParentFolderId() == null) ? 0 : getParentFolderId().hashCode());
        return hashCode;
    }

    @Override
    public InitiateDocumentVersionUploadRequest clone() {
        return (InitiateDocumentVersionUploadRequest) super.clone();
    }

}
