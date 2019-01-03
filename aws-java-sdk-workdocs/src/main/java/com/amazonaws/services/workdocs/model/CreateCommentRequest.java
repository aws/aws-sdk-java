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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/CreateComment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCommentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The ID of the document version.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * The ID of the parent comment.
     * </p>
     */
    private String parentId;
    /**
     * <p>
     * The ID of the root comment in the thread.
     * </p>
     */
    private String threadId;
    /**
     * <p>
     * The text of the comment.
     * </p>
     */
    private String text;
    /**
     * <p>
     * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment
     * author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners,
     * and contributors.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * Set this parameter to TRUE to send an email out to the document collaborators after the comment is created.
     * </p>
     */
    private Boolean notifyCollaborators;

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

    public CreateCommentRequest withAuthenticationToken(String authenticationToken) {
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

    public CreateCommentRequest withDocumentId(String documentId) {
        setDocumentId(documentId);
        return this;
    }

    /**
     * <p>
     * The ID of the document version.
     * </p>
     * 
     * @param versionId
     *        The ID of the document version.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The ID of the document version.
     * </p>
     * 
     * @return The ID of the document version.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The ID of the document version.
     * </p>
     * 
     * @param versionId
     *        The ID of the document version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommentRequest withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * The ID of the parent comment.
     * </p>
     * 
     * @param parentId
     *        The ID of the parent comment.
     */

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * <p>
     * The ID of the parent comment.
     * </p>
     * 
     * @return The ID of the parent comment.
     */

    public String getParentId() {
        return this.parentId;
    }

    /**
     * <p>
     * The ID of the parent comment.
     * </p>
     * 
     * @param parentId
     *        The ID of the parent comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommentRequest withParentId(String parentId) {
        setParentId(parentId);
        return this;
    }

    /**
     * <p>
     * The ID of the root comment in the thread.
     * </p>
     * 
     * @param threadId
     *        The ID of the root comment in the thread.
     */

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    /**
     * <p>
     * The ID of the root comment in the thread.
     * </p>
     * 
     * @return The ID of the root comment in the thread.
     */

    public String getThreadId() {
        return this.threadId;
    }

    /**
     * <p>
     * The ID of the root comment in the thread.
     * </p>
     * 
     * @param threadId
     *        The ID of the root comment in the thread.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommentRequest withThreadId(String threadId) {
        setThreadId(threadId);
        return this;
    }

    /**
     * <p>
     * The text of the comment.
     * </p>
     * 
     * @param text
     *        The text of the comment.
     */

    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * The text of the comment.
     * </p>
     * 
     * @return The text of the comment.
     */

    public String getText() {
        return this.text;
    }

    /**
     * <p>
     * The text of the comment.
     * </p>
     * 
     * @param text
     *        The text of the comment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommentRequest withText(String text) {
        setText(text);
        return this;
    }

    /**
     * <p>
     * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment
     * author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners,
     * and contributors.
     * </p>
     * 
     * @param visibility
     *        The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the
     *        comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document
     *        owners, co-owners, and contributors.
     * @see CommentVisibilityType
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment
     * author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners,
     * and contributors.
     * </p>
     * 
     * @return The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the
     *         comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document
     *         owners, co-owners, and contributors.
     * @see CommentVisibilityType
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment
     * author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners,
     * and contributors.
     * </p>
     * 
     * @param visibility
     *        The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the
     *        comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document
     *        owners, co-owners, and contributors.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommentVisibilityType
     */

    public CreateCommentRequest withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment
     * author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners,
     * and contributors.
     * </p>
     * 
     * @param visibility
     *        The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the
     *        comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document
     *        owners, co-owners, and contributors.
     * @see CommentVisibilityType
     */

    public void setVisibility(CommentVisibilityType visibility) {
        withVisibility(visibility);
    }

    /**
     * <p>
     * The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the comment
     * author and document owner and co-owners, or PUBLIC, where the comment is visible to document owners, co-owners,
     * and contributors.
     * </p>
     * 
     * @param visibility
     *        The visibility of the comment. Options are either PRIVATE, where the comment is visible only to the
     *        comment author and document owner and co-owners, or PUBLIC, where the comment is visible to document
     *        owners, co-owners, and contributors.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CommentVisibilityType
     */

    public CreateCommentRequest withVisibility(CommentVisibilityType visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * Set this parameter to TRUE to send an email out to the document collaborators after the comment is created.
     * </p>
     * 
     * @param notifyCollaborators
     *        Set this parameter to TRUE to send an email out to the document collaborators after the comment is
     *        created.
     */

    public void setNotifyCollaborators(Boolean notifyCollaborators) {
        this.notifyCollaborators = notifyCollaborators;
    }

    /**
     * <p>
     * Set this parameter to TRUE to send an email out to the document collaborators after the comment is created.
     * </p>
     * 
     * @return Set this parameter to TRUE to send an email out to the document collaborators after the comment is
     *         created.
     */

    public Boolean getNotifyCollaborators() {
        return this.notifyCollaborators;
    }

    /**
     * <p>
     * Set this parameter to TRUE to send an email out to the document collaborators after the comment is created.
     * </p>
     * 
     * @param notifyCollaborators
     *        Set this parameter to TRUE to send an email out to the document collaborators after the comment is
     *        created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCommentRequest withNotifyCollaborators(Boolean notifyCollaborators) {
        setNotifyCollaborators(notifyCollaborators);
        return this;
    }

    /**
     * <p>
     * Set this parameter to TRUE to send an email out to the document collaborators after the comment is created.
     * </p>
     * 
     * @return Set this parameter to TRUE to send an email out to the document collaborators after the comment is
     *         created.
     */

    public Boolean isNotifyCollaborators() {
        return this.notifyCollaborators;
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
        if (getParentId() != null)
            sb.append("ParentId: ").append(getParentId()).append(",");
        if (getThreadId() != null)
            sb.append("ThreadId: ").append(getThreadId()).append(",");
        if (getText() != null)
            sb.append("Text: ").append("***Sensitive Data Redacted***").append(",");
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
        if (getNotifyCollaborators() != null)
            sb.append("NotifyCollaborators: ").append(getNotifyCollaborators());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCommentRequest == false)
            return false;
        CreateCommentRequest other = (CreateCommentRequest) obj;
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
        if (other.getParentId() == null ^ this.getParentId() == null)
            return false;
        if (other.getParentId() != null && other.getParentId().equals(this.getParentId()) == false)
            return false;
        if (other.getThreadId() == null ^ this.getThreadId() == null)
            return false;
        if (other.getThreadId() != null && other.getThreadId().equals(this.getThreadId()) == false)
            return false;
        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getNotifyCollaborators() == null ^ this.getNotifyCollaborators() == null)
            return false;
        if (other.getNotifyCollaborators() != null && other.getNotifyCollaborators().equals(this.getNotifyCollaborators()) == false)
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
        hashCode = prime * hashCode + ((getParentId() == null) ? 0 : getParentId().hashCode());
        hashCode = prime * hashCode + ((getThreadId() == null) ? 0 : getThreadId().hashCode());
        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getNotifyCollaborators() == null) ? 0 : getNotifyCollaborators().hashCode());
        return hashCode;
    }

    @Override
    public CreateCommentRequest clone() {
        return (CreateCommentRequest) super.clone();
    }

}
